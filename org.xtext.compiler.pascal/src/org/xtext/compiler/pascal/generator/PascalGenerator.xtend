/*
 * generated by Xtext 2.15.0
 */
package org.xtext.compiler.pascal.generator

import java.util.HashMap
import java.util.Iterator
import java.util.Map
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.compiler.pascal.pascal.assignment_statement
import org.xtext.compiler.pascal.pascal.block
import org.xtext.compiler.pascal.pascal.case_list_element
import org.xtext.compiler.pascal.pascal.case_statement
import org.xtext.compiler.pascal.pascal.conditional_statement
import org.xtext.compiler.pascal.pascal.constant
import org.xtext.compiler.pascal.pascal.factor
import org.xtext.compiler.pascal.pascal.formal_parameter_section
import org.xtext.compiler.pascal.pascal.function_declaration
import org.xtext.compiler.pascal.pascal.identifier
import org.xtext.compiler.pascal.pascal.parameter_group
import org.xtext.compiler.pascal.pascal.procedure_and_function_declaration_part
import org.xtext.compiler.pascal.pascal.procedure_declaration
import org.xtext.compiler.pascal.pascal.program
import org.xtext.compiler.pascal.pascal.signed_factor
import org.xtext.compiler.pascal.pascal.simple_expression
import org.xtext.compiler.pascal.pascal.simple_statement
import org.xtext.compiler.pascal.pascal.statement
import org.xtext.compiler.pascal.pascal.structured_statement
import org.xtext.compiler.pascal.pascal.term
import org.xtext.compiler.pascal.pascal.unlabelled_statement
import org.xtext.compiler.pascal.pascal.unsigned_number
import org.xtext.compiler.pascal.pascal.variable
import org.xtext.compiler.pascal.pascal.variable_declaration
import org.xtext.compiler.pascal.pascal.variable_declaration_part
import java.util.Map.Entry

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PascalGenerator extends AbstractGenerator {

	long currentRegister;
	long currentLine;
	String temporary;
	Map<AddressVariable, String> registerBank;
	Map<String, Long> subroutineLocation;
	public static final int LINE_LENGTH = 8;

	def getCurrentRegister() {
		return String.format("R%s", currentRegister);
	}

	def getNextRegister() {
		currentRegister++;
		return String.format("R%s", currentRegister);
	}

	def updateRegisterBank(String variable, String newRegister) {
		var addrVar = new AddressVariable(variable, AddressVariable.NO_SUBROUTINE);
		registerBank.put(addrVar, newRegister);
		return addrVar;
	}

	def boolean variableExists(String variable) {
		var Iterator<AddressVariable> itr = registerBank.keySet().iterator();
		var exists = false;
		while(itr.hasNext()){
			var AddressVariable key = itr.next();
			if(key.name.equals(variable)){
				exists = true;
			}
		}
		
		return exists;
	}
	
	def boolean variableExists(String variable, String subRoutine) {
		var wanted = new AddressVariable(variable, subRoutine);
		return registerBank.containsKey(wanted);
	}
	

	def String getVariableRegister(String variable) {
		var Iterator<Entry<AddressVariable, String>> itr = registerBank.entrySet().iterator();
		var String register = null;
		while(itr.hasNext()){
	        var Entry<AddressVariable, String> pair =  itr.next();
	        var name = pair.getKey().name;
	        if(name.equals(variable)){
	        	register = pair.getValue();
	        }
		}
		
		return register;
	}
	
	def String getVariableRegister(String variable, String subRoutine) {
		var wanted = new AddressVariable(variable, subRoutine);
		return registerBank.get(wanted);
	}	
	

	def getNextLine() {
		currentLine += LINE_LENGTH;
		return String.format("%s: ", currentLine);
	}

	def long peekNextLine() {
		currentLine += LINE_LENGTH;
		return currentLine + LINE_LENGTH;
	}

	def getValueOfNextLine() {
		var newLine = currentLine;
		newLine += LINE_LENGTH;
		return String.format("%s", newLine)
	}

	def compile(block block) '''
		«getNextLine() + "LD SP, #stackStart"»
		«String.format("BR %s\n"+block.compileSubRoutinesDeclaration, valueOfNextLine)»
		«block.compileVarDeclaration»
		«block.compileAttribution»
		«getNextLine() + "BR *0(SP)"»
	'''

	def compileInnerBlock(block block) '''
		«block.compileSubRoutinesDeclaration»
		«block.compileVarDeclaration»
		«block.compileAttribution»
	'''

	def compileVarDeclaration(block block) '''
		«var var_declarations = block.variablepart»
		«FOR variable_declaration_part declaration : var_declarations»
			«FOR variable_declaration variable : declaration.variable»
				«FOR name : variable.list_names.names»
					«IF !variableExists(name.id)»
					«var addrVar = new AddressVariable(name.id, AddressVariable.NO_SUBROUTINE)»
						«var bufferInhibitor = registerBank.put(addrVar, getCurrentRegister())»
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
			«ENDFOR»
	'''

	def String compileSubRoutinesDeclaration(block block) '''
		«var subroutines = block.procedure_function_part»
		«FOR procedure_and_function_declaration_part declaration : subroutines»
			«var subroutine = declaration.subroutine»
			«IF subroutine !== null»
			«IF subroutine.func !== null»
				«subroutine.func.compileFuncDeclaration»
				«getNextLine() + "BR *0(SP)"»
			«ENDIF»				
			«IF subroutine.proc !== null»
				«subroutine.proc.compileProcDeclaration»
				«getNextLine() + "BR *0(SP)"»
			«ENDIF»				
			«ENDIF»
		«ENDFOR»
	'''

	def String compileFuncDeclaration(function_declaration declaration) '''
		«subroutineLocation.put(declaration.names,peekNextLine)»
		«««	«registerBank.put(declaration.names,getNextRegister())»
	«FOR formal_parameter_section section : declaration.parameters.parameters»
			«FOR  parameter_group group  : section.parameters»
				«FOR  identifier id  : group.names.names»
					«var addrVar = new AddressVariable(id.id,declaration.names)»
					«registerBank.put(addrVar,nextRegister)»
				«ENDFOR»
			«ENDFOR»
		«ENDFOR»
		«declaration.block.compileInnerBlock»
	'''

	def String compileProcDeclaration(procedure_declaration declaration) '''
		«subroutineLocation.put(declaration.names,peekNextLine)»
		«««	«registerBank.put(declaration.names,getNextRegister())»
	«FOR formal_parameter_section section : declaration.parameters.parameters»
			«FOR  parameter_group group  : section.parameters»
				«FOR  identifier id  : group.names.names»
					«var addrVar = new AddressVariable(id.id,declaration.names)»
					«registerBank.put(addrVar,nextRegister)»
				«ENDFOR»
			«ENDFOR»
		«ENDFOR»
		«declaration.block.compileInnerBlock»
	'''

	def compileAttribution(block block) '''
		«var comp_statement = block.statement.sequence.statements»
		«FOR statement statements : comp_statement»
			«FOR unlabelled_statement single_statement : statements.statement»
				«IF single_statement.simple !== null»
					«compileSimpleStatement(single_statement.simple)»
				«ENDIF»
				«IF single_statement.structured !== null»
					«compileStructuredStatement(single_statement.structured)»
				«ENDIF»
			«ENDFOR»			
		«ENDFOR»
	'''

	def compileStructuredStatement(structured_statement statement) '''
		«IF statement.conditional_stat !== null»
			«compileCase(statement.conditional_stat)»
		«ENDIF»
	'''

	def compileSimpleStatement(simple_statement statement) '''
		«IF statement !== null»
			«IF statement.assignment !== null»
				«compileAssignment(statement.assignment)»
			«ENDIF»					
		«ENDIF»			
	'''
	
	def setTemporary(String content) {
		this.temporary = content;
	}

	def compileAssignment(assignment_statement variable) '''
		«var declared = variable.declared_variable»
		«setTemporary('')»
		«var resultReg = compileRecExpression(variable.expression.simple)»
		«temporary»
		«getNextLine() + "ST " + updateRegisterBank(declared.variableName,resultReg).getName + ", " + resultReg»
	'''
	
	def compileFactorAsConstant(factor factor)'''
		«var constant = factor.constant»
		«IF constant.number !== null»
			«nextLine + "LD " + nextRegister + ", " + constant.number.numbers.toString»
		«ENDIF»
		«IF constant.string !== null»
			«nextLine + "LD " + nextRegister + ", " + "#'"+ constant.string + "'"»
		«ENDIF»		
	'''
	
	def compileFactorAsBool(factor factor)'''
		«nextLine + "LD " + nextRegister + ", " + factor.bool_factor.toString»
	'''
	
	def compileFactorAsVariable(factor factor)'''
		«nextLine + "LD " + nextRegister + ", " + getVariableRegister(factor.variable.variableName)»
	'''
	
	def compileFactorNotOp(String register)'''
		«nextLine + "NOT " + nextRegister + ", " + register»
	''' 
		
	def compileFactorWithSignal(signed_factor factor)'''
		«nextLine + "LD " + nextRegister + ", " + factor.signal.toString + factor.factor.constant.number.numbers.toString»
	'''
	
	def String compileFactor(factor factorInst) {		
		if (factorInst.constant !== null) {			
			temporary+=compileFactorAsConstant(factorInst);
			return getCurrentRegister();
		} else if (factorInst.bool_factor !== null){
			temporary+=compileFactorAsBool(factorInst);
			return getCurrentRegister();
		} else if (factorInst.variable !== null){
			return getVariableRegister(factorInst.variable.variableName);
		} else if (factorInst.not_factor !== null) {			
			var register = compileFactor(factorInst.not_factor);
			temporary+=compileFactorNotOp(register);
			return getCurrentRegister();			
		} else if (factorInst.expression !== null){
			var register = compileRecExpression(factorInst.expression.simple);
			return register;
		}
	}
			
	def String compileSignedFactor(signed_factor factor) {		
		if (factor.signal !== null) {
			temporary+=compileFactorWithSignal(factor);
			return getCurrentRegister();
		} else {
			return compileFactor(factor.factor);
		}
	}
	
	def String compileRecTerm(term term) {
		if(term.operator.nullOrEmpty || term.term2 === null) {
			var register1 = compileSignedFactor(term.factor);			
			return register1;			
		} else {
			var register2 = compileRecTerm(term.term2);			
			var register1 = compileSignedFactor(term.factor);
			var mul_op = term.operator.toString;
			temporary += compileOperation(register1, register2, mul_op)
			return getCurrentRegister();
		}
	}

	def String compileRecExpression(simple_expression expression) {
		if (expression.operator.nullOrEmpty || expression.expression === null) {
			return compileRecTerm(expression.term_exp);			
		} else {
			var register2 = compileRecExpression(expression.expression);			
			var register1 = compileRecTerm(expression.term_exp);
			var addtv_op = expression.operator.toString;
			temporary += compileOperation(register1, register2, addtv_op);
			return getCurrentRegister();
		}

	}
	
	def String compileCaseStatements(statement statement) '''
		«FOR unlabelled_statement u_statement : statement.statement»
			«IF u_statement.simple !== null»
				«compileSimpleStatement(u_statement.simple)»
			«ENDIF»
		«ENDFOR»
	'''
	
	def String compileCaseForTypes(EList<constant> constants, String expRegister) '''
		«FOR constant const_: constants»
			«var hasMoreConsts = constants.indexOf(const_) < constants.size - 1»
			«IF const_.uns_number !== null»
				«nextLine + "SUB " + nextRegister + ", " + expRegister + ", " + const_.uns_number.numberContent»
				«IF hasMoreConsts»
					«nextLine + "BEZ " + getCurrentRegister() + ", " + "B_EQUALS"»
				«ELSE»
					«nextLine + "BNEZ " + getCurrentRegister() + ", " + "%s"»
				«ENDIF»
			«ELSEIF const_.sig_number !== null»
				«nextLine + "SUB " + nextRegister + ", " + expRegister + ", " + const_.sig_number.numberContent»
				«IF hasMoreConsts»
					«nextLine + "BEZ " + getCurrentRegister() + ", " + "B_EQUALS"»
				«ELSE»
					«nextLine + "BNEZ " + getCurrentRegister() + ", " + "%s"»
				«ENDIF»
			«ELSEIF !const_.string.isNullOrEmpty»
				«nextLine + "LD " + nextRegister + ", " + "#'" + const_.string + "'"»
				«IF hasMoreConsts»
					«nextLine + "BEQ " + expRegister + ", " + getCurrentRegister() + ", " + "B_EQUALS"»
				«ELSE»
					«nextLine + "BNE " + expRegister + ", " + getCurrentRegister() + ", " + "%s"»
				«ENDIF»
			«ELSEIF !const_.booltype.isNullOrEmpty»
				«nextLine + "LD " + nextRegister + ", " + const_.booltype»
				«IF hasMoreConsts»
					«nextLine + "BEQ " + expRegister + ", " + getCurrentRegister() + ", " + "B_EQUALS"»
				«ELSE»
					«nextLine + "BNE " + expRegister + ", " + getCurrentRegister() + ", " + "%s"»
				«ENDIF»
			«ENDIF»
		«ENDFOR»
	'''
	
	
	def String compileCaseForBranch(case_list_element element, String expRegister) '''
		«var constants = element.consts.constants»
		«compileCaseForTypes(constants, expRegister).replace("B_EQUALS", valueOfNextLine)»
		«compileCaseStatements(element.case_statement)»
		«nextLine + "BR END_CASE"»
	'''
	
	def String compileAllCases(case_statement case_statement, String expRegister) '''
		«FOR case_list_element element : case_statement.case_list»
			«String.format(compileCaseForBranch(element, expRegister), valueOfNextLine)»
		«ENDFOR»
		
		«IF case_statement.case_statements !== null»
			«FOR statement statement: case_statement.case_statements.statements»
				«compileCaseStatements(statement)»
			«ENDFOR»
		«ENDIF»
	'''
	
	def String compileCase(conditional_statement conditional_statement) '''
		«var case_statement = conditional_statement.cond_statements»
		«var expression = case_statement.exp»
		«setTemporary('')»
		«var resultingReg = compileRecExpression(expression.simple)»
		«var expRegister = nextRegister»
		«temporary»
		«nextLine+ "LD " + expRegister + ", " + resultingReg»
		«compileAllCases(case_statement, expRegister).replace("END_CASE", valueOfNextLine)»
	'''
	
	def String compileOperation(String reg1, String reg2, String operator)'''
		«IF operator == "+"»
		«nextLine+ "ADD " + nextRegister + ", " + reg1 + ", " + reg2»
		«ENDIF»
		«IF operator == "-"»
		«nextLine+ "MINUS " + nextRegister + ", " + reg1 + ", " + reg2»
		«ENDIF»
		«IF operator.equalsIgnoreCase("OR")»
		«nextLine+ "OR " + nextRegister + ", " + reg1 + ", " + reg2»
		«ENDIF»
		«IF operator.equalsIgnoreCase("AND")»
		«nextLine+ "AND " + nextRegister + ", " + reg1 + ", " + reg2»
		«ENDIF»
		«IF operator == "*"»
		«nextLine+ "MUL " + nextRegister + ", " + reg1 + ", " + reg2»
		«ENDIF»
		«IF operator == "/"»
		«nextLine+ "DIV " + nextRegister + ", " + reg1 + ", " + reg2»
		«ENDIF»
	'''

	def getVariableName(variable varbl) {
		if (varbl.expression.empty && varbl.names_exp.empty) {
			return varbl.variable_id;
		} else {
			// TODO
			// this is where I think the whole calculate array  indexing 
			// would happen a[i] for instance (will probably demand another method)
		}
	}

	def getNumberContent(unsigned_number number) {
		var output = "";
		if (number.numbers !== null) {
			output += number.numbers;
		}
		return output;
	}

//	
//	def compileFuncDesignator(function_designator designator)'''
			// TODO
//	'''
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (p : resource.allContents.toIterable.filter(program)) {
			currentRegister = 0;
			currentLine = 0;
			temporary = '';
			registerBank = new HashMap<AddressVariable, String>();
			subroutineLocation = new HashMap<String, Long>();
			fsa.deleteFile("output.asm");
			fsa.generateFile("output.asm", p.block.compile);
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
		}
	}
}
