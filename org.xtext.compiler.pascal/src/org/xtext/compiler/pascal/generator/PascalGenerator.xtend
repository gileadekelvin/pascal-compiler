/*
 * generated by Xtext 2.15.0
 */
package org.xtext.compiler.pascal.generator

import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.compiler.pascal.pascal.assignment_statement
import org.xtext.compiler.pascal.pascal.block
import org.xtext.compiler.pascal.pascal.expression
import org.xtext.compiler.pascal.pascal.program
import org.xtext.compiler.pascal.pascal.simple_expression
import org.xtext.compiler.pascal.pascal.signed_factor
import org.xtext.compiler.pascal.pascal.simple_statement
import org.xtext.compiler.pascal.pascal.statement
import org.xtext.compiler.pascal.pascal.structured_statement
import org.xtext.compiler.pascal.pascal.term
import org.xtext.compiler.pascal.pascal.unlabelled_statement
import org.xtext.compiler.pascal.pascal.unsigned_number
import org.xtext.compiler.pascal.pascal.variable
import org.xtext.compiler.pascal.pascal.variable_declaration
import org.xtext.compiler.pascal.pascal.variable_declaration_part

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PascalGenerator extends AbstractGenerator {

	long currentRegister;
	long currentLine;
	String temporary;
	Map<String, String> registerBank;
	public static final int LINE_LENGTH = 8;

	def getCurrentRegister() {
		return String.format("R%s", currentRegister);
	}

	def getNextRegister() {
		currentRegister++;
		return String.format("R%s", currentRegister);
	}

	def updateRegisterBank(String variable, String newRegister) {
		registerBank.put(variable, newRegister);
		return variable;
	}

	def getNextLine() {
		currentLine += LINE_LENGTH;
		return String.format("%s: ", currentLine);
	}

	def compile(block block) '''
		«getNextLine() + "LD SP #stackStart"»
		«block.compileVarDeclaration»
		«block.compileAttribution»
		«getNextLine() + "BR *0(SP)"»
	'''

	def compileVarDeclaration(block block) '''
		«var var_declarations = block.variablepart»
		«FOR variable_declaration_part declaration : var_declarations»
			«FOR variable_declaration variable : declaration.variable»
				«FOR name : variable.list_names.names»
					«««					«getNextLine() + "LD " + getNextRegister() + ", " + name.id »
					«registerBank.put(name.id, getCurrentRegister())»
					«ENDFOR»
				«ENDFOR»
			«ENDFOR»
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

	def compileStructuredStatement(structured_statement statement) {
		// TODO
	}

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
		«var resultingReg = compileRecExpression(variable.expression.simple)»
		«temporary»
		«getNextLine() + "ST " + updateRegisterBank(declared.variableName,getCurrentRegister) + ", " + getCurrentRegister»
	'''

// works only for constants, booleans right now
	def compileFactor(signed_factor factor) '''
		«IF factor.factor.constant !== null»		
			«IF factor.signal !== null»
				«nextLine + "LD " + nextRegister + ", " + factor.signal.toString + factor.factor.constant.number.numbers.toString»
			«ELSE»
				«nextLine + "LD " + nextRegister + ", " + factor.factor.constant.number.numbers.toString»
			«ENDIF»
		«ENDIF»
		«IF factor.factor.bool_factor !== null»		
			«nextLine + "LD " + nextRegister + ", " + factor.factor.bool_factor.toString»
		«ENDIF»
	'''

	
	def String compileRecTerm(term term) {
		if(term.operator.nullOrEmpty || term.term2 === null) {
			temporary += compileFactor(term.factor)
			return getCurrentRegister();
		} else {
			var register2 = compileRecTerm(term.term2);
			temporary+=compileFactor(term.factor);
			var register1 = getCurrentRegister();
			var mul_op = term.operator.toString;
			temporary += compileOperation(register1, register2, mul_op)
			return getCurrentRegister();
		}
	}

	def String compileRecExpression(simple_expression expression) {
		if (expression.operator.nullOrEmpty || expression.expression === null) {
			compileRecTerm(expression.term_exp);
			return getCurrentRegister();
		} else {
			var register2 = compileRecExpression(expression.expression);
			compileRecTerm(expression.term_exp);
			var register1 = getCurrentRegister();
			var addtv_op = expression.operator.toString;
			temporary += compileOperation(register1, register2, addtv_op);
			return getCurrentRegister();
		}

	}
	
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

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (p : resource.allContents.toIterable.filter(program)) {
			currentRegister = 0;
			currentLine = 0;
			temporary = '';
			registerBank = new HashMap<String, String>();
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
