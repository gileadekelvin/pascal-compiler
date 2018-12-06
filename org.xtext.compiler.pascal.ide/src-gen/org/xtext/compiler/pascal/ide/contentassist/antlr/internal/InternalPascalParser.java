package org.xtext.compiler.pascal.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.compiler.pascal.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Procedure", "Function", "Boolean", "Integer", "Program", "String", "Array", "Begin", "Const", "False", "Case", "Else", "True", "Type", "End", "Var", "LeftParenthesisFullStop", "FullStopRightParenthesis", "Of", "LeftParenthesis", "RightParenthesis", "Comma", "FullStop", "Colon", "Semicolon", "CommercialAt", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "RULE_NIL", "RULE_DOTDOT", "RULE_NOT", "RULE_STAR", "RULE_SLASH", "RULE_DIV", "RULE_MOD", "RULE_PLUS", "RULE_MINUS", "RULE_AND", "RULE_OR", "RULE_ASSIGN", "RULE_NUM_INT", "RULE_EQUAL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Var=19;
    public static final int True=16;
    public static final int String=9;
    public static final int False=13;
    public static final int LeftParenthesis=23;
    public static final int RULE_DIV=38;
    public static final int RULE_NIL=33;
    public static final int Procedure=4;
    public static final int Boolean=6;
    public static final int RULE_DOTDOT=34;
    public static final int RULE_STAR=36;
    public static final int RULE_OR=43;
    public static final int RightSquareBracket=31;
    public static final int Program=8;
    public static final int RULE_MOD=39;
    public static final int RULE_EQUAL=46;
    public static final int RULE_ID=47;
    public static final int Const=12;
    public static final int RightParenthesis=24;
    public static final int RULE_ASSIGN=44;
    public static final int RULE_SLASH=37;
    public static final int RULE_ML_COMMENT=49;
    public static final int End=18;
    public static final int LeftSquareBracket=30;
    public static final int RULE_STRING=48;
    public static final int RULE_NOT=35;
    public static final int RULE_AND=42;
    public static final int Case=14;
    public static final int RULE_SL_COMMENT=50;
    public static final int FullStopRightParenthesis=21;
    public static final int Function=5;
    public static final int Comma=25;
    public static final int Begin=11;
    public static final int RULE_PLUS=40;
    public static final int LeftParenthesisFullStop=20;
    public static final int Colon=27;
    public static final int EOF=-1;
    public static final int FullStop=26;
    public static final int RULE_WS=51;
    public static final int RULE_ANY_OTHER=52;
    public static final int CircumflexAccent=32;
    public static final int CommercialAt=29;
    public static final int RULE_MINUS=41;
    public static final int Integer=7;
    public static final int Array=10;
    public static final int Semicolon=28;
    public static final int Type=17;
    public static final int RULE_NUM_INT=45;
    public static final int Of=22;
    public static final int Else=15;

    // delegates
    // delegators


        public InternalPascalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPascalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPascalParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPascalParser.g"; }


    	private PascalGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("Semicolon", "';'");
    		tokenNameToValue.put("CommercialAt", "'@'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("CircumflexAccent", "'^'");
    		tokenNameToValue.put("LeftParenthesisFullStop", "'(.'");
    		tokenNameToValue.put("FullStopRightParenthesis", "'.)'");
    		tokenNameToValue.put("Of", "'of'");
    		tokenNameToValue.put("End", "'end'");
    		tokenNameToValue.put("Var", "'var'");
    		tokenNameToValue.put("Case", "'case'");
    		tokenNameToValue.put("Else", "'else'");
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("Type", "'type'");
    		tokenNameToValue.put("Array", "'array'");
    		tokenNameToValue.put("Begin", "'begin'");
    		tokenNameToValue.put("Const", "'const'");
    		tokenNameToValue.put("False", "'false'");
    		tokenNameToValue.put("String", "'string'");
    		tokenNameToValue.put("Boolean", "'boolean'");
    		tokenNameToValue.put("Integer", "'integer'");
    		tokenNameToValue.put("Program", "'program'");
    		tokenNameToValue.put("Function", "'function'");
    		tokenNameToValue.put("Procedure", "'procedure'");
    	}

    	public void setGrammarAccess(PascalGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRulepascal"
    // InternalPascalParser.g:84:1: entryRulepascal : rulepascal EOF ;
    public final void entryRulepascal() throws RecognitionException {
        try {
            // InternalPascalParser.g:85:1: ( rulepascal EOF )
            // InternalPascalParser.g:86:1: rulepascal EOF
            {
             before(grammarAccess.getPascalRule()); 
            pushFollow(FOLLOW_1);
            rulepascal();

            state._fsp--;

             after(grammarAccess.getPascalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepascal"


    // $ANTLR start "rulepascal"
    // InternalPascalParser.g:93:1: rulepascal : ( ( rule__Pascal__ProgramAssignment ) ) ;
    public final void rulepascal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:97:2: ( ( ( rule__Pascal__ProgramAssignment ) ) )
            // InternalPascalParser.g:98:2: ( ( rule__Pascal__ProgramAssignment ) )
            {
            // InternalPascalParser.g:98:2: ( ( rule__Pascal__ProgramAssignment ) )
            // InternalPascalParser.g:99:3: ( rule__Pascal__ProgramAssignment )
            {
             before(grammarAccess.getPascalAccess().getProgramAssignment()); 
            // InternalPascalParser.g:100:3: ( rule__Pascal__ProgramAssignment )
            // InternalPascalParser.g:100:4: rule__Pascal__ProgramAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Pascal__ProgramAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPascalAccess().getProgramAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepascal"


    // $ANTLR start "entryRuleprogram"
    // InternalPascalParser.g:109:1: entryRuleprogram : ruleprogram EOF ;
    public final void entryRuleprogram() throws RecognitionException {
        try {
            // InternalPascalParser.g:110:1: ( ruleprogram EOF )
            // InternalPascalParser.g:111:1: ruleprogram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleprogram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // InternalPascalParser.g:118:1: ruleprogram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleprogram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:122:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalPascalParser.g:123:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalPascalParser.g:123:2: ( ( rule__Program__Group__0 ) )
            // InternalPascalParser.g:124:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalPascalParser.g:125:3: ( rule__Program__Group__0 )
            // InternalPascalParser.g:125:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRuleprogram_heading_block"
    // InternalPascalParser.g:134:1: entryRuleprogram_heading_block : ruleprogram_heading_block EOF ;
    public final void entryRuleprogram_heading_block() throws RecognitionException {
        try {
            // InternalPascalParser.g:135:1: ( ruleprogram_heading_block EOF )
            // InternalPascalParser.g:136:1: ruleprogram_heading_block EOF
            {
             before(grammarAccess.getProgram_heading_blockRule()); 
            pushFollow(FOLLOW_1);
            ruleprogram_heading_block();

            state._fsp--;

             after(grammarAccess.getProgram_heading_blockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprogram_heading_block"


    // $ANTLR start "ruleprogram_heading_block"
    // InternalPascalParser.g:143:1: ruleprogram_heading_block : ( ( rule__Program_heading_block__Group__0 ) ) ;
    public final void ruleprogram_heading_block() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:147:2: ( ( ( rule__Program_heading_block__Group__0 ) ) )
            // InternalPascalParser.g:148:2: ( ( rule__Program_heading_block__Group__0 ) )
            {
            // InternalPascalParser.g:148:2: ( ( rule__Program_heading_block__Group__0 ) )
            // InternalPascalParser.g:149:3: ( rule__Program_heading_block__Group__0 )
            {
             before(grammarAccess.getProgram_heading_blockAccess().getGroup()); 
            // InternalPascalParser.g:150:3: ( rule__Program_heading_block__Group__0 )
            // InternalPascalParser.g:150:4: rule__Program_heading_block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgram_heading_blockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprogram_heading_block"


    // $ANTLR start "entryRuleidentifier_list"
    // InternalPascalParser.g:159:1: entryRuleidentifier_list : ruleidentifier_list EOF ;
    public final void entryRuleidentifier_list() throws RecognitionException {
        try {
            // InternalPascalParser.g:160:1: ( ruleidentifier_list EOF )
            // InternalPascalParser.g:161:1: ruleidentifier_list EOF
            {
             before(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_1);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getIdentifier_listRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleidentifier_list"


    // $ANTLR start "ruleidentifier_list"
    // InternalPascalParser.g:168:1: ruleidentifier_list : ( ( rule__Identifier_list__Group__0 ) ) ;
    public final void ruleidentifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:172:2: ( ( ( rule__Identifier_list__Group__0 ) ) )
            // InternalPascalParser.g:173:2: ( ( rule__Identifier_list__Group__0 ) )
            {
            // InternalPascalParser.g:173:2: ( ( rule__Identifier_list__Group__0 ) )
            // InternalPascalParser.g:174:3: ( rule__Identifier_list__Group__0 )
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup()); 
            // InternalPascalParser.g:175:3: ( rule__Identifier_list__Group__0 )
            // InternalPascalParser.g:175:4: rule__Identifier_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdentifier_listAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleidentifier_list"


    // $ANTLR start "entryRuleidentifier"
    // InternalPascalParser.g:184:1: entryRuleidentifier : ruleidentifier EOF ;
    public final void entryRuleidentifier() throws RecognitionException {
        try {
            // InternalPascalParser.g:185:1: ( ruleidentifier EOF )
            // InternalPascalParser.g:186:1: ruleidentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            ruleidentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleidentifier"


    // $ANTLR start "ruleidentifier"
    // InternalPascalParser.g:193:1: ruleidentifier : ( ( rule__Identifier__IdAssignment ) ) ;
    public final void ruleidentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:197:2: ( ( ( rule__Identifier__IdAssignment ) ) )
            // InternalPascalParser.g:198:2: ( ( rule__Identifier__IdAssignment ) )
            {
            // InternalPascalParser.g:198:2: ( ( rule__Identifier__IdAssignment ) )
            // InternalPascalParser.g:199:3: ( rule__Identifier__IdAssignment )
            {
             before(grammarAccess.getIdentifierAccess().getIdAssignment()); 
            // InternalPascalParser.g:200:3: ( rule__Identifier__IdAssignment )
            // InternalPascalParser.g:200:4: rule__Identifier__IdAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleidentifier"


    // $ANTLR start "entryRuleblock"
    // InternalPascalParser.g:209:1: entryRuleblock : ruleblock EOF ;
    public final void entryRuleblock() throws RecognitionException {
        try {
            // InternalPascalParser.g:210:1: ( ruleblock EOF )
            // InternalPascalParser.g:211:1: ruleblock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleblock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // InternalPascalParser.g:218:1: ruleblock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleblock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:222:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalPascalParser.g:223:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalPascalParser.g:223:2: ( ( rule__Block__Group__0 ) )
            // InternalPascalParser.g:224:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalPascalParser.g:225:3: ( rule__Block__Group__0 )
            // InternalPascalParser.g:225:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRuleconstant_definition_part"
    // InternalPascalParser.g:234:1: entryRuleconstant_definition_part : ruleconstant_definition_part EOF ;
    public final void entryRuleconstant_definition_part() throws RecognitionException {
        try {
            // InternalPascalParser.g:235:1: ( ruleconstant_definition_part EOF )
            // InternalPascalParser.g:236:1: ruleconstant_definition_part EOF
            {
             before(grammarAccess.getConstant_definition_partRule()); 
            pushFollow(FOLLOW_1);
            ruleconstant_definition_part();

            state._fsp--;

             after(grammarAccess.getConstant_definition_partRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconstant_definition_part"


    // $ANTLR start "ruleconstant_definition_part"
    // InternalPascalParser.g:243:1: ruleconstant_definition_part : ( ( rule__Constant_definition_part__Group__0 ) ) ;
    public final void ruleconstant_definition_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:247:2: ( ( ( rule__Constant_definition_part__Group__0 ) ) )
            // InternalPascalParser.g:248:2: ( ( rule__Constant_definition_part__Group__0 ) )
            {
            // InternalPascalParser.g:248:2: ( ( rule__Constant_definition_part__Group__0 ) )
            // InternalPascalParser.g:249:3: ( rule__Constant_definition_part__Group__0 )
            {
             before(grammarAccess.getConstant_definition_partAccess().getGroup()); 
            // InternalPascalParser.g:250:3: ( rule__Constant_definition_part__Group__0 )
            // InternalPascalParser.g:250:4: rule__Constant_definition_part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definition_partAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconstant_definition_part"


    // $ANTLR start "entryRuleconstant_definition"
    // InternalPascalParser.g:259:1: entryRuleconstant_definition : ruleconstant_definition EOF ;
    public final void entryRuleconstant_definition() throws RecognitionException {
        try {
            // InternalPascalParser.g:260:1: ( ruleconstant_definition EOF )
            // InternalPascalParser.g:261:1: ruleconstant_definition EOF
            {
             before(grammarAccess.getConstant_definitionRule()); 
            pushFollow(FOLLOW_1);
            ruleconstant_definition();

            state._fsp--;

             after(grammarAccess.getConstant_definitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconstant_definition"


    // $ANTLR start "ruleconstant_definition"
    // InternalPascalParser.g:268:1: ruleconstant_definition : ( ( rule__Constant_definition__Group__0 ) ) ;
    public final void ruleconstant_definition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:272:2: ( ( ( rule__Constant_definition__Group__0 ) ) )
            // InternalPascalParser.g:273:2: ( ( rule__Constant_definition__Group__0 ) )
            {
            // InternalPascalParser.g:273:2: ( ( rule__Constant_definition__Group__0 ) )
            // InternalPascalParser.g:274:3: ( rule__Constant_definition__Group__0 )
            {
             before(grammarAccess.getConstant_definitionAccess().getGroup()); 
            // InternalPascalParser.g:275:3: ( rule__Constant_definition__Group__0 )
            // InternalPascalParser.g:275:4: rule__Constant_definition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconstant_definition"


    // $ANTLR start "entryRuleconstant"
    // InternalPascalParser.g:284:1: entryRuleconstant : ruleconstant EOF ;
    public final void entryRuleconstant() throws RecognitionException {
        try {
            // InternalPascalParser.g:285:1: ( ruleconstant EOF )
            // InternalPascalParser.g:286:1: ruleconstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconstant"


    // $ANTLR start "ruleconstant"
    // InternalPascalParser.g:293:1: ruleconstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleconstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:297:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalPascalParser.g:298:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalPascalParser.g:298:2: ( ( rule__Constant__Alternatives ) )
            // InternalPascalParser.g:299:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalPascalParser.g:300:3: ( rule__Constant__Alternatives )
            // InternalPascalParser.g:300:4: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconstant"


    // $ANTLR start "entryRuletype_definition_part"
    // InternalPascalParser.g:309:1: entryRuletype_definition_part : ruletype_definition_part EOF ;
    public final void entryRuletype_definition_part() throws RecognitionException {
        try {
            // InternalPascalParser.g:310:1: ( ruletype_definition_part EOF )
            // InternalPascalParser.g:311:1: ruletype_definition_part EOF
            {
             before(grammarAccess.getType_definition_partRule()); 
            pushFollow(FOLLOW_1);
            ruletype_definition_part();

            state._fsp--;

             after(grammarAccess.getType_definition_partRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletype_definition_part"


    // $ANTLR start "ruletype_definition_part"
    // InternalPascalParser.g:318:1: ruletype_definition_part : ( ( rule__Type_definition_part__Group__0 ) ) ;
    public final void ruletype_definition_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:322:2: ( ( ( rule__Type_definition_part__Group__0 ) ) )
            // InternalPascalParser.g:323:2: ( ( rule__Type_definition_part__Group__0 ) )
            {
            // InternalPascalParser.g:323:2: ( ( rule__Type_definition_part__Group__0 ) )
            // InternalPascalParser.g:324:3: ( rule__Type_definition_part__Group__0 )
            {
             before(grammarAccess.getType_definition_partAccess().getGroup()); 
            // InternalPascalParser.g:325:3: ( rule__Type_definition_part__Group__0 )
            // InternalPascalParser.g:325:4: rule__Type_definition_part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_definition_partAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletype_definition_part"


    // $ANTLR start "entryRuletype_definition"
    // InternalPascalParser.g:334:1: entryRuletype_definition : ruletype_definition EOF ;
    public final void entryRuletype_definition() throws RecognitionException {
        try {
            // InternalPascalParser.g:335:1: ( ruletype_definition EOF )
            // InternalPascalParser.g:336:1: ruletype_definition EOF
            {
             before(grammarAccess.getType_definitionRule()); 
            pushFollow(FOLLOW_1);
            ruletype_definition();

            state._fsp--;

             after(grammarAccess.getType_definitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletype_definition"


    // $ANTLR start "ruletype_definition"
    // InternalPascalParser.g:343:1: ruletype_definition : ( ( rule__Type_definition__Group__0 ) ) ;
    public final void ruletype_definition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:347:2: ( ( ( rule__Type_definition__Group__0 ) ) )
            // InternalPascalParser.g:348:2: ( ( rule__Type_definition__Group__0 ) )
            {
            // InternalPascalParser.g:348:2: ( ( rule__Type_definition__Group__0 ) )
            // InternalPascalParser.g:349:3: ( rule__Type_definition__Group__0 )
            {
             before(grammarAccess.getType_definitionAccess().getGroup()); 
            // InternalPascalParser.g:350:3: ( rule__Type_definition__Group__0 )
            // InternalPascalParser.g:350:4: rule__Type_definition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_definitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletype_definition"


    // $ANTLR start "entryRulevariable_declaration_part"
    // InternalPascalParser.g:359:1: entryRulevariable_declaration_part : rulevariable_declaration_part EOF ;
    public final void entryRulevariable_declaration_part() throws RecognitionException {
        try {
            // InternalPascalParser.g:360:1: ( rulevariable_declaration_part EOF )
            // InternalPascalParser.g:361:1: rulevariable_declaration_part EOF
            {
             before(grammarAccess.getVariable_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            rulevariable_declaration_part();

            state._fsp--;

             after(grammarAccess.getVariable_declaration_partRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevariable_declaration_part"


    // $ANTLR start "rulevariable_declaration_part"
    // InternalPascalParser.g:368:1: rulevariable_declaration_part : ( ( rule__Variable_declaration_part__Group__0 ) ) ;
    public final void rulevariable_declaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:372:2: ( ( ( rule__Variable_declaration_part__Group__0 ) ) )
            // InternalPascalParser.g:373:2: ( ( rule__Variable_declaration_part__Group__0 ) )
            {
            // InternalPascalParser.g:373:2: ( ( rule__Variable_declaration_part__Group__0 ) )
            // InternalPascalParser.g:374:3: ( rule__Variable_declaration_part__Group__0 )
            {
             before(grammarAccess.getVariable_declaration_partAccess().getGroup()); 
            // InternalPascalParser.g:375:3: ( rule__Variable_declaration_part__Group__0 )
            // InternalPascalParser.g:375:4: rule__Variable_declaration_part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declaration_partAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariable_declaration_part"


    // $ANTLR start "entryRulevariable_declaration"
    // InternalPascalParser.g:384:1: entryRulevariable_declaration : rulevariable_declaration EOF ;
    public final void entryRulevariable_declaration() throws RecognitionException {
        try {
            // InternalPascalParser.g:385:1: ( rulevariable_declaration EOF )
            // InternalPascalParser.g:386:1: rulevariable_declaration EOF
            {
             before(grammarAccess.getVariable_declarationRule()); 
            pushFollow(FOLLOW_1);
            rulevariable_declaration();

            state._fsp--;

             after(grammarAccess.getVariable_declarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevariable_declaration"


    // $ANTLR start "rulevariable_declaration"
    // InternalPascalParser.g:393:1: rulevariable_declaration : ( ( rule__Variable_declaration__Group__0 ) ) ;
    public final void rulevariable_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:397:2: ( ( ( rule__Variable_declaration__Group__0 ) ) )
            // InternalPascalParser.g:398:2: ( ( rule__Variable_declaration__Group__0 ) )
            {
            // InternalPascalParser.g:398:2: ( ( rule__Variable_declaration__Group__0 ) )
            // InternalPascalParser.g:399:3: ( rule__Variable_declaration__Group__0 )
            {
             before(grammarAccess.getVariable_declarationAccess().getGroup()); 
            // InternalPascalParser.g:400:3: ( rule__Variable_declaration__Group__0 )
            // InternalPascalParser.g:400:4: rule__Variable_declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariable_declaration"


    // $ANTLR start "entryRulecompound_statement"
    // InternalPascalParser.g:409:1: entryRulecompound_statement : rulecompound_statement EOF ;
    public final void entryRulecompound_statement() throws RecognitionException {
        try {
            // InternalPascalParser.g:410:1: ( rulecompound_statement EOF )
            // InternalPascalParser.g:411:1: rulecompound_statement EOF
            {
             before(grammarAccess.getCompound_statementRule()); 
            pushFollow(FOLLOW_1);
            rulecompound_statement();

            state._fsp--;

             after(grammarAccess.getCompound_statementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecompound_statement"


    // $ANTLR start "rulecompound_statement"
    // InternalPascalParser.g:418:1: rulecompound_statement : ( ( rule__Compound_statement__Group__0 ) ) ;
    public final void rulecompound_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:422:2: ( ( ( rule__Compound_statement__Group__0 ) ) )
            // InternalPascalParser.g:423:2: ( ( rule__Compound_statement__Group__0 ) )
            {
            // InternalPascalParser.g:423:2: ( ( rule__Compound_statement__Group__0 ) )
            // InternalPascalParser.g:424:3: ( rule__Compound_statement__Group__0 )
            {
             before(grammarAccess.getCompound_statementAccess().getGroup()); 
            // InternalPascalParser.g:425:3: ( rule__Compound_statement__Group__0 )
            // InternalPascalParser.g:425:4: rule__Compound_statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Compound_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompound_statementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecompound_statement"


    // $ANTLR start "entryRulestatements"
    // InternalPascalParser.g:434:1: entryRulestatements : rulestatements EOF ;
    public final void entryRulestatements() throws RecognitionException {
        try {
            // InternalPascalParser.g:435:1: ( rulestatements EOF )
            // InternalPascalParser.g:436:1: rulestatements EOF
            {
             before(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            rulestatements();

            state._fsp--;

             after(grammarAccess.getStatementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestatements"


    // $ANTLR start "rulestatements"
    // InternalPascalParser.g:443:1: rulestatements : ( ( rule__Statements__Group__0 ) ) ;
    public final void rulestatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:447:2: ( ( ( rule__Statements__Group__0 ) ) )
            // InternalPascalParser.g:448:2: ( ( rule__Statements__Group__0 ) )
            {
            // InternalPascalParser.g:448:2: ( ( rule__Statements__Group__0 ) )
            // InternalPascalParser.g:449:3: ( rule__Statements__Group__0 )
            {
             before(grammarAccess.getStatementsAccess().getGroup()); 
            // InternalPascalParser.g:450:3: ( rule__Statements__Group__0 )
            // InternalPascalParser.g:450:4: rule__Statements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestatements"


    // $ANTLR start "entryRulestatement"
    // InternalPascalParser.g:459:1: entryRulestatement : rulestatement EOF ;
    public final void entryRulestatement() throws RecognitionException {
        try {
            // InternalPascalParser.g:460:1: ( rulestatement EOF )
            // InternalPascalParser.g:461:1: rulestatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalPascalParser.g:468:1: rulestatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void rulestatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:472:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalPascalParser.g:473:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalPascalParser.g:473:2: ( ( rule__Statement__Group__0 ) )
            // InternalPascalParser.g:474:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalPascalParser.g:475:3: ( rule__Statement__Group__0 )
            // InternalPascalParser.g:475:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRuleunlabelled_statement"
    // InternalPascalParser.g:484:1: entryRuleunlabelled_statement : ruleunlabelled_statement EOF ;
    public final void entryRuleunlabelled_statement() throws RecognitionException {
        try {
            // InternalPascalParser.g:485:1: ( ruleunlabelled_statement EOF )
            // InternalPascalParser.g:486:1: ruleunlabelled_statement EOF
            {
             before(grammarAccess.getUnlabelled_statementRule()); 
            pushFollow(FOLLOW_1);
            ruleunlabelled_statement();

            state._fsp--;

             after(grammarAccess.getUnlabelled_statementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleunlabelled_statement"


    // $ANTLR start "ruleunlabelled_statement"
    // InternalPascalParser.g:493:1: ruleunlabelled_statement : ( ( rule__Unlabelled_statement__Alternatives ) ) ;
    public final void ruleunlabelled_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:497:2: ( ( ( rule__Unlabelled_statement__Alternatives ) ) )
            // InternalPascalParser.g:498:2: ( ( rule__Unlabelled_statement__Alternatives ) )
            {
            // InternalPascalParser.g:498:2: ( ( rule__Unlabelled_statement__Alternatives ) )
            // InternalPascalParser.g:499:3: ( rule__Unlabelled_statement__Alternatives )
            {
             before(grammarAccess.getUnlabelled_statementAccess().getAlternatives()); 
            // InternalPascalParser.g:500:3: ( rule__Unlabelled_statement__Alternatives )
            // InternalPascalParser.g:500:4: rule__Unlabelled_statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Unlabelled_statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnlabelled_statementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleunlabelled_statement"


    // $ANTLR start "entryRulesimple_statement"
    // InternalPascalParser.g:509:1: entryRulesimple_statement : rulesimple_statement EOF ;
    public final void entryRulesimple_statement() throws RecognitionException {
        try {
            // InternalPascalParser.g:510:1: ( rulesimple_statement EOF )
            // InternalPascalParser.g:511:1: rulesimple_statement EOF
            {
             before(grammarAccess.getSimple_statementRule()); 
            pushFollow(FOLLOW_1);
            rulesimple_statement();

            state._fsp--;

             after(grammarAccess.getSimple_statementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesimple_statement"


    // $ANTLR start "rulesimple_statement"
    // InternalPascalParser.g:518:1: rulesimple_statement : ( ( rule__Simple_statement__Alternatives ) ) ;
    public final void rulesimple_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:522:2: ( ( ( rule__Simple_statement__Alternatives ) ) )
            // InternalPascalParser.g:523:2: ( ( rule__Simple_statement__Alternatives ) )
            {
            // InternalPascalParser.g:523:2: ( ( rule__Simple_statement__Alternatives ) )
            // InternalPascalParser.g:524:3: ( rule__Simple_statement__Alternatives )
            {
             before(grammarAccess.getSimple_statementAccess().getAlternatives()); 
            // InternalPascalParser.g:525:3: ( rule__Simple_statement__Alternatives )
            // InternalPascalParser.g:525:4: rule__Simple_statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Simple_statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimple_statementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRuleassignment_statement"
    // InternalPascalParser.g:534:1: entryRuleassignment_statement : ruleassignment_statement EOF ;
    public final void entryRuleassignment_statement() throws RecognitionException {
        try {
            // InternalPascalParser.g:535:1: ( ruleassignment_statement EOF )
            // InternalPascalParser.g:536:1: ruleassignment_statement EOF
            {
             before(grammarAccess.getAssignment_statementRule()); 
            pushFollow(FOLLOW_1);
            ruleassignment_statement();

            state._fsp--;

             after(grammarAccess.getAssignment_statementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleassignment_statement"


    // $ANTLR start "ruleassignment_statement"
    // InternalPascalParser.g:543:1: ruleassignment_statement : ( ( rule__Assignment_statement__Group__0 ) ) ;
    public final void ruleassignment_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:547:2: ( ( ( rule__Assignment_statement__Group__0 ) ) )
            // InternalPascalParser.g:548:2: ( ( rule__Assignment_statement__Group__0 ) )
            {
            // InternalPascalParser.g:548:2: ( ( rule__Assignment_statement__Group__0 ) )
            // InternalPascalParser.g:549:3: ( rule__Assignment_statement__Group__0 )
            {
             before(grammarAccess.getAssignment_statementAccess().getGroup()); 
            // InternalPascalParser.g:550:3: ( rule__Assignment_statement__Group__0 )
            // InternalPascalParser.g:550:4: rule__Assignment_statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignment_statementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleassignment_statement"


    // $ANTLR start "entryRulevariable"
    // InternalPascalParser.g:559:1: entryRulevariable : rulevariable EOF ;
    public final void entryRulevariable() throws RecognitionException {
        try {
            // InternalPascalParser.g:560:1: ( rulevariable EOF )
            // InternalPascalParser.g:561:1: rulevariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            rulevariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevariable"


    // $ANTLR start "rulevariable"
    // InternalPascalParser.g:568:1: rulevariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void rulevariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:572:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalPascalParser.g:573:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalPascalParser.g:573:2: ( ( rule__Variable__Group__0 ) )
            // InternalPascalParser.g:574:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalPascalParser.g:575:3: ( rule__Variable__Group__0 )
            // InternalPascalParser.g:575:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRuleexpression"
    // InternalPascalParser.g:584:1: entryRuleexpression : ruleexpression EOF ;
    public final void entryRuleexpression() throws RecognitionException {
        try {
            // InternalPascalParser.g:585:1: ( ruleexpression EOF )
            // InternalPascalParser.g:586:1: ruleexpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalPascalParser.g:593:1: ruleexpression : ( ( rule__Expression__SimpleAssignment ) ) ;
    public final void ruleexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:597:2: ( ( ( rule__Expression__SimpleAssignment ) ) )
            // InternalPascalParser.g:598:2: ( ( rule__Expression__SimpleAssignment ) )
            {
            // InternalPascalParser.g:598:2: ( ( rule__Expression__SimpleAssignment ) )
            // InternalPascalParser.g:599:3: ( rule__Expression__SimpleAssignment )
            {
             before(grammarAccess.getExpressionAccess().getSimpleAssignment()); 
            // InternalPascalParser.g:600:3: ( rule__Expression__SimpleAssignment )
            // InternalPascalParser.g:600:4: rule__Expression__SimpleAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Expression__SimpleAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getSimpleAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesimple_expression"
    // InternalPascalParser.g:609:1: entryRulesimple_expression : rulesimple_expression EOF ;
    public final void entryRulesimple_expression() throws RecognitionException {
        try {
            // InternalPascalParser.g:610:1: ( rulesimple_expression EOF )
            // InternalPascalParser.g:611:1: rulesimple_expression EOF
            {
             before(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_1);
            rulesimple_expression();

            state._fsp--;

             after(grammarAccess.getSimple_expressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesimple_expression"


    // $ANTLR start "rulesimple_expression"
    // InternalPascalParser.g:618:1: rulesimple_expression : ( ( rule__Simple_expression__Group__0 ) ) ;
    public final void rulesimple_expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:622:2: ( ( ( rule__Simple_expression__Group__0 ) ) )
            // InternalPascalParser.g:623:2: ( ( rule__Simple_expression__Group__0 ) )
            {
            // InternalPascalParser.g:623:2: ( ( rule__Simple_expression__Group__0 ) )
            // InternalPascalParser.g:624:3: ( rule__Simple_expression__Group__0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getGroup()); 
            // InternalPascalParser.g:625:3: ( rule__Simple_expression__Group__0 )
            // InternalPascalParser.g:625:4: rule__Simple_expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimple_expressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesimple_expression"


    // $ANTLR start "entryRuleterm"
    // InternalPascalParser.g:634:1: entryRuleterm : ruleterm EOF ;
    public final void entryRuleterm() throws RecognitionException {
        try {
            // InternalPascalParser.g:635:1: ( ruleterm EOF )
            // InternalPascalParser.g:636:1: ruleterm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // InternalPascalParser.g:643:1: ruleterm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleterm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:647:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalPascalParser.g:648:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalPascalParser.g:648:2: ( ( rule__Term__Group__0 ) )
            // InternalPascalParser.g:649:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalPascalParser.g:650:3: ( rule__Term__Group__0 )
            // InternalPascalParser.g:650:4: rule__Term__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulesigned_factor"
    // InternalPascalParser.g:659:1: entryRulesigned_factor : rulesigned_factor EOF ;
    public final void entryRulesigned_factor() throws RecognitionException {
        try {
            // InternalPascalParser.g:660:1: ( rulesigned_factor EOF )
            // InternalPascalParser.g:661:1: rulesigned_factor EOF
            {
             before(grammarAccess.getSigned_factorRule()); 
            pushFollow(FOLLOW_1);
            rulesigned_factor();

            state._fsp--;

             after(grammarAccess.getSigned_factorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesigned_factor"


    // $ANTLR start "rulesigned_factor"
    // InternalPascalParser.g:668:1: rulesigned_factor : ( ( rule__Signed_factor__Group__0 ) ) ;
    public final void rulesigned_factor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:672:2: ( ( ( rule__Signed_factor__Group__0 ) ) )
            // InternalPascalParser.g:673:2: ( ( rule__Signed_factor__Group__0 ) )
            {
            // InternalPascalParser.g:673:2: ( ( rule__Signed_factor__Group__0 ) )
            // InternalPascalParser.g:674:3: ( rule__Signed_factor__Group__0 )
            {
             before(grammarAccess.getSigned_factorAccess().getGroup()); 
            // InternalPascalParser.g:675:3: ( rule__Signed_factor__Group__0 )
            // InternalPascalParser.g:675:4: rule__Signed_factor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signed_factor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSigned_factorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesigned_factor"


    // $ANTLR start "entryRulefactor"
    // InternalPascalParser.g:684:1: entryRulefactor : rulefactor EOF ;
    public final void entryRulefactor() throws RecognitionException {
        try {
            // InternalPascalParser.g:685:1: ( rulefactor EOF )
            // InternalPascalParser.g:686:1: rulefactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefactor"


    // $ANTLR start "rulefactor"
    // InternalPascalParser.g:693:1: rulefactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void rulefactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:697:2: ( ( ( rule__Factor__Alternatives ) ) )
            // InternalPascalParser.g:698:2: ( ( rule__Factor__Alternatives ) )
            {
            // InternalPascalParser.g:698:2: ( ( rule__Factor__Alternatives ) )
            // InternalPascalParser.g:699:3: ( rule__Factor__Alternatives )
            {
             before(grammarAccess.getFactorAccess().getAlternatives()); 
            // InternalPascalParser.g:700:3: ( rule__Factor__Alternatives )
            // InternalPascalParser.g:700:4: rule__Factor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRuletype"
    // InternalPascalParser.g:709:1: entryRuletype : ruletype EOF ;
    public final void entryRuletype() throws RecognitionException {
        try {
            // InternalPascalParser.g:710:1: ( ruletype EOF )
            // InternalPascalParser.g:711:1: ruletype EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruletype();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // InternalPascalParser.g:718:1: ruletype : ( ( rule__Type__Alternatives ) ) ;
    public final void ruletype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:722:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalPascalParser.g:723:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalPascalParser.g:723:2: ( ( rule__Type__Alternatives ) )
            // InternalPascalParser.g:724:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalPascalParser.g:725:3: ( rule__Type__Alternatives )
            // InternalPascalParser.g:725:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulesimple_type"
    // InternalPascalParser.g:734:1: entryRulesimple_type : rulesimple_type EOF ;
    public final void entryRulesimple_type() throws RecognitionException {
        try {
            // InternalPascalParser.g:735:1: ( rulesimple_type EOF )
            // InternalPascalParser.g:736:1: rulesimple_type EOF
            {
             before(grammarAccess.getSimple_typeRule()); 
            pushFollow(FOLLOW_1);
            rulesimple_type();

            state._fsp--;

             after(grammarAccess.getSimple_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesimple_type"


    // $ANTLR start "rulesimple_type"
    // InternalPascalParser.g:743:1: rulesimple_type : ( ( rule__Simple_type__Alternatives ) ) ;
    public final void rulesimple_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:747:2: ( ( ( rule__Simple_type__Alternatives ) ) )
            // InternalPascalParser.g:748:2: ( ( rule__Simple_type__Alternatives ) )
            {
            // InternalPascalParser.g:748:2: ( ( rule__Simple_type__Alternatives ) )
            // InternalPascalParser.g:749:3: ( rule__Simple_type__Alternatives )
            {
             before(grammarAccess.getSimple_typeAccess().getAlternatives()); 
            // InternalPascalParser.g:750:3: ( rule__Simple_type__Alternatives )
            // InternalPascalParser.g:750:4: rule__Simple_type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Simple_type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimple_typeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesimple_type"


    // $ANTLR start "entryRulesubrange_type"
    // InternalPascalParser.g:759:1: entryRulesubrange_type : rulesubrange_type EOF ;
    public final void entryRulesubrange_type() throws RecognitionException {
        try {
            // InternalPascalParser.g:760:1: ( rulesubrange_type EOF )
            // InternalPascalParser.g:761:1: rulesubrange_type EOF
            {
             before(grammarAccess.getSubrange_typeRule()); 
            pushFollow(FOLLOW_1);
            rulesubrange_type();

            state._fsp--;

             after(grammarAccess.getSubrange_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesubrange_type"


    // $ANTLR start "rulesubrange_type"
    // InternalPascalParser.g:768:1: rulesubrange_type : ( ( rule__Subrange_type__Group__0 ) ) ;
    public final void rulesubrange_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:772:2: ( ( ( rule__Subrange_type__Group__0 ) ) )
            // InternalPascalParser.g:773:2: ( ( rule__Subrange_type__Group__0 ) )
            {
            // InternalPascalParser.g:773:2: ( ( rule__Subrange_type__Group__0 ) )
            // InternalPascalParser.g:774:3: ( rule__Subrange_type__Group__0 )
            {
             before(grammarAccess.getSubrange_typeAccess().getGroup()); 
            // InternalPascalParser.g:775:3: ( rule__Subrange_type__Group__0 )
            // InternalPascalParser.g:775:4: rule__Subrange_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubrange_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesubrange_type"


    // $ANTLR start "entryRulestructured_type"
    // InternalPascalParser.g:784:1: entryRulestructured_type : rulestructured_type EOF ;
    public final void entryRulestructured_type() throws RecognitionException {
        try {
            // InternalPascalParser.g:785:1: ( rulestructured_type EOF )
            // InternalPascalParser.g:786:1: rulestructured_type EOF
            {
             before(grammarAccess.getStructured_typeRule()); 
            pushFollow(FOLLOW_1);
            rulestructured_type();

            state._fsp--;

             after(grammarAccess.getStructured_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestructured_type"


    // $ANTLR start "rulestructured_type"
    // InternalPascalParser.g:793:1: rulestructured_type : ( ( rule__Structured_type__UnpackedAssignment ) ) ;
    public final void rulestructured_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:797:2: ( ( ( rule__Structured_type__UnpackedAssignment ) ) )
            // InternalPascalParser.g:798:2: ( ( rule__Structured_type__UnpackedAssignment ) )
            {
            // InternalPascalParser.g:798:2: ( ( rule__Structured_type__UnpackedAssignment ) )
            // InternalPascalParser.g:799:3: ( rule__Structured_type__UnpackedAssignment )
            {
             before(grammarAccess.getStructured_typeAccess().getUnpackedAssignment()); 
            // InternalPascalParser.g:800:3: ( rule__Structured_type__UnpackedAssignment )
            // InternalPascalParser.g:800:4: rule__Structured_type__UnpackedAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Structured_type__UnpackedAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStructured_typeAccess().getUnpackedAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestructured_type"


    // $ANTLR start "entryRuleunpacked_structured_type"
    // InternalPascalParser.g:809:1: entryRuleunpacked_structured_type : ruleunpacked_structured_type EOF ;
    public final void entryRuleunpacked_structured_type() throws RecognitionException {
        try {
            // InternalPascalParser.g:810:1: ( ruleunpacked_structured_type EOF )
            // InternalPascalParser.g:811:1: ruleunpacked_structured_type EOF
            {
             before(grammarAccess.getUnpacked_structured_typeRule()); 
            pushFollow(FOLLOW_1);
            ruleunpacked_structured_type();

            state._fsp--;

             after(grammarAccess.getUnpacked_structured_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleunpacked_structured_type"


    // $ANTLR start "ruleunpacked_structured_type"
    // InternalPascalParser.g:818:1: ruleunpacked_structured_type : ( ( rule__Unpacked_structured_type__Alternatives ) ) ;
    public final void ruleunpacked_structured_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:822:2: ( ( ( rule__Unpacked_structured_type__Alternatives ) ) )
            // InternalPascalParser.g:823:2: ( ( rule__Unpacked_structured_type__Alternatives ) )
            {
            // InternalPascalParser.g:823:2: ( ( rule__Unpacked_structured_type__Alternatives ) )
            // InternalPascalParser.g:824:3: ( rule__Unpacked_structured_type__Alternatives )
            {
             before(grammarAccess.getUnpacked_structured_typeAccess().getAlternatives()); 
            // InternalPascalParser.g:825:3: ( rule__Unpacked_structured_type__Alternatives )
            // InternalPascalParser.g:825:4: rule__Unpacked_structured_type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Unpacked_structured_type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnpacked_structured_typeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleunpacked_structured_type"


    // $ANTLR start "entryRuledynamic_array_type"
    // InternalPascalParser.g:834:1: entryRuledynamic_array_type : ruledynamic_array_type EOF ;
    public final void entryRuledynamic_array_type() throws RecognitionException {
        try {
            // InternalPascalParser.g:835:1: ( ruledynamic_array_type EOF )
            // InternalPascalParser.g:836:1: ruledynamic_array_type EOF
            {
             before(grammarAccess.getDynamic_array_typeRule()); 
            pushFollow(FOLLOW_1);
            ruledynamic_array_type();

            state._fsp--;

             after(grammarAccess.getDynamic_array_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuledynamic_array_type"


    // $ANTLR start "ruledynamic_array_type"
    // InternalPascalParser.g:843:1: ruledynamic_array_type : ( ( rule__Dynamic_array_type__Group__0 ) ) ;
    public final void ruledynamic_array_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:847:2: ( ( ( rule__Dynamic_array_type__Group__0 ) ) )
            // InternalPascalParser.g:848:2: ( ( rule__Dynamic_array_type__Group__0 ) )
            {
            // InternalPascalParser.g:848:2: ( ( rule__Dynamic_array_type__Group__0 ) )
            // InternalPascalParser.g:849:3: ( rule__Dynamic_array_type__Group__0 )
            {
             before(grammarAccess.getDynamic_array_typeAccess().getGroup()); 
            // InternalPascalParser.g:850:3: ( rule__Dynamic_array_type__Group__0 )
            // InternalPascalParser.g:850:4: rule__Dynamic_array_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dynamic_array_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDynamic_array_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledynamic_array_type"


    // $ANTLR start "entryRulearray_type"
    // InternalPascalParser.g:859:1: entryRulearray_type : rulearray_type EOF ;
    public final void entryRulearray_type() throws RecognitionException {
        try {
            // InternalPascalParser.g:860:1: ( rulearray_type EOF )
            // InternalPascalParser.g:861:1: rulearray_type EOF
            {
             before(grammarAccess.getArray_typeRule()); 
            pushFollow(FOLLOW_1);
            rulearray_type();

            state._fsp--;

             after(grammarAccess.getArray_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulearray_type"


    // $ANTLR start "rulearray_type"
    // InternalPascalParser.g:868:1: rulearray_type : ( ( rule__Array_type__Group__0 ) ) ;
    public final void rulearray_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:872:2: ( ( ( rule__Array_type__Group__0 ) ) )
            // InternalPascalParser.g:873:2: ( ( rule__Array_type__Group__0 ) )
            {
            // InternalPascalParser.g:873:2: ( ( rule__Array_type__Group__0 ) )
            // InternalPascalParser.g:874:3: ( rule__Array_type__Group__0 )
            {
             before(grammarAccess.getArray_typeAccess().getGroup()); 
            // InternalPascalParser.g:875:3: ( rule__Array_type__Group__0 )
            // InternalPascalParser.g:875:4: rule__Array_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Array_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArray_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulearray_type"


    // $ANTLR start "entryRuletype_list"
    // InternalPascalParser.g:884:1: entryRuletype_list : ruletype_list EOF ;
    public final void entryRuletype_list() throws RecognitionException {
        try {
            // InternalPascalParser.g:885:1: ( ruletype_list EOF )
            // InternalPascalParser.g:886:1: ruletype_list EOF
            {
             before(grammarAccess.getType_listRule()); 
            pushFollow(FOLLOW_1);
            ruletype_list();

            state._fsp--;

             after(grammarAccess.getType_listRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletype_list"


    // $ANTLR start "ruletype_list"
    // InternalPascalParser.g:893:1: ruletype_list : ( ( rule__Type_list__Group__0 ) ) ;
    public final void ruletype_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:897:2: ( ( ( rule__Type_list__Group__0 ) ) )
            // InternalPascalParser.g:898:2: ( ( rule__Type_list__Group__0 ) )
            {
            // InternalPascalParser.g:898:2: ( ( rule__Type_list__Group__0 ) )
            // InternalPascalParser.g:899:3: ( rule__Type_list__Group__0 )
            {
             before(grammarAccess.getType_listAccess().getGroup()); 
            // InternalPascalParser.g:900:3: ( rule__Type_list__Group__0 )
            // InternalPascalParser.g:900:4: rule__Type_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_listAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletype_list"


    // $ANTLR start "entryRuleindex_type"
    // InternalPascalParser.g:909:1: entryRuleindex_type : ruleindex_type EOF ;
    public final void entryRuleindex_type() throws RecognitionException {
        try {
            // InternalPascalParser.g:910:1: ( ruleindex_type EOF )
            // InternalPascalParser.g:911:1: ruleindex_type EOF
            {
             before(grammarAccess.getIndex_typeRule()); 
            pushFollow(FOLLOW_1);
            ruleindex_type();

            state._fsp--;

             after(grammarAccess.getIndex_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleindex_type"


    // $ANTLR start "ruleindex_type"
    // InternalPascalParser.g:918:1: ruleindex_type : ( ( rule__Index_type__ContentAssignment ) ) ;
    public final void ruleindex_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:922:2: ( ( ( rule__Index_type__ContentAssignment ) ) )
            // InternalPascalParser.g:923:2: ( ( rule__Index_type__ContentAssignment ) )
            {
            // InternalPascalParser.g:923:2: ( ( rule__Index_type__ContentAssignment ) )
            // InternalPascalParser.g:924:3: ( rule__Index_type__ContentAssignment )
            {
             before(grammarAccess.getIndex_typeAccess().getContentAssignment()); 
            // InternalPascalParser.g:925:3: ( rule__Index_type__ContentAssignment )
            // InternalPascalParser.g:925:4: rule__Index_type__ContentAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Index_type__ContentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIndex_typeAccess().getContentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleindex_type"


    // $ANTLR start "entryRuletype_identifier"
    // InternalPascalParser.g:934:1: entryRuletype_identifier : ruletype_identifier EOF ;
    public final void entryRuletype_identifier() throws RecognitionException {
        try {
            // InternalPascalParser.g:935:1: ( ruletype_identifier EOF )
            // InternalPascalParser.g:936:1: ruletype_identifier EOF
            {
             before(grammarAccess.getType_identifierRule()); 
            pushFollow(FOLLOW_1);
            ruletype_identifier();

            state._fsp--;

             after(grammarAccess.getType_identifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletype_identifier"


    // $ANTLR start "ruletype_identifier"
    // InternalPascalParser.g:943:1: ruletype_identifier : ( ( rule__Type_identifier__Alternatives ) ) ;
    public final void ruletype_identifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:947:2: ( ( ( rule__Type_identifier__Alternatives ) ) )
            // InternalPascalParser.g:948:2: ( ( rule__Type_identifier__Alternatives ) )
            {
            // InternalPascalParser.g:948:2: ( ( rule__Type_identifier__Alternatives ) )
            // InternalPascalParser.g:949:3: ( rule__Type_identifier__Alternatives )
            {
             before(grammarAccess.getType_identifierAccess().getAlternatives()); 
            // InternalPascalParser.g:950:3: ( rule__Type_identifier__Alternatives )
            // InternalPascalParser.g:950:4: rule__Type_identifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type_identifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getType_identifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletype_identifier"


    // $ANTLR start "entryRuleunsigned_constant"
    // InternalPascalParser.g:959:1: entryRuleunsigned_constant : ruleunsigned_constant EOF ;
    public final void entryRuleunsigned_constant() throws RecognitionException {
        try {
            // InternalPascalParser.g:960:1: ( ruleunsigned_constant EOF )
            // InternalPascalParser.g:961:1: ruleunsigned_constant EOF
            {
             before(grammarAccess.getUnsigned_constantRule()); 
            pushFollow(FOLLOW_1);
            ruleunsigned_constant();

            state._fsp--;

             after(grammarAccess.getUnsigned_constantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleunsigned_constant"


    // $ANTLR start "ruleunsigned_constant"
    // InternalPascalParser.g:968:1: ruleunsigned_constant : ( ( rule__Unsigned_constant__Alternatives ) ) ;
    public final void ruleunsigned_constant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:972:2: ( ( ( rule__Unsigned_constant__Alternatives ) ) )
            // InternalPascalParser.g:973:2: ( ( rule__Unsigned_constant__Alternatives ) )
            {
            // InternalPascalParser.g:973:2: ( ( rule__Unsigned_constant__Alternatives ) )
            // InternalPascalParser.g:974:3: ( rule__Unsigned_constant__Alternatives )
            {
             before(grammarAccess.getUnsigned_constantAccess().getAlternatives()); 
            // InternalPascalParser.g:975:3: ( rule__Unsigned_constant__Alternatives )
            // InternalPascalParser.g:975:4: rule__Unsigned_constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Unsigned_constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnsigned_constantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleunsigned_constant"


    // $ANTLR start "entryRuleunsigned_number"
    // InternalPascalParser.g:984:1: entryRuleunsigned_number : ruleunsigned_number EOF ;
    public final void entryRuleunsigned_number() throws RecognitionException {
        try {
            // InternalPascalParser.g:985:1: ( ruleunsigned_number EOF )
            // InternalPascalParser.g:986:1: ruleunsigned_number EOF
            {
             before(grammarAccess.getUnsigned_numberRule()); 
            pushFollow(FOLLOW_1);
            ruleunsigned_number();

            state._fsp--;

             after(grammarAccess.getUnsigned_numberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleunsigned_number"


    // $ANTLR start "ruleunsigned_number"
    // InternalPascalParser.g:993:1: ruleunsigned_number : ( ( rule__Unsigned_number__NumbersAssignment ) ) ;
    public final void ruleunsigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:997:2: ( ( ( rule__Unsigned_number__NumbersAssignment ) ) )
            // InternalPascalParser.g:998:2: ( ( rule__Unsigned_number__NumbersAssignment ) )
            {
            // InternalPascalParser.g:998:2: ( ( rule__Unsigned_number__NumbersAssignment ) )
            // InternalPascalParser.g:999:3: ( rule__Unsigned_number__NumbersAssignment )
            {
             before(grammarAccess.getUnsigned_numberAccess().getNumbersAssignment()); 
            // InternalPascalParser.g:1000:3: ( rule__Unsigned_number__NumbersAssignment )
            // InternalPascalParser.g:1000:4: rule__Unsigned_number__NumbersAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Unsigned_number__NumbersAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUnsigned_numberAccess().getNumbersAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleunsigned_number"


    // $ANTLR start "entryRuleprocedure_statement"
    // InternalPascalParser.g:1009:1: entryRuleprocedure_statement : ruleprocedure_statement EOF ;
    public final void entryRuleprocedure_statement() throws RecognitionException {
        try {
            // InternalPascalParser.g:1010:1: ( ruleprocedure_statement EOF )
            // InternalPascalParser.g:1011:1: ruleprocedure_statement EOF
            {
             before(grammarAccess.getProcedure_statementRule()); 
            pushFollow(FOLLOW_1);
            ruleprocedure_statement();

            state._fsp--;

             after(grammarAccess.getProcedure_statementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprocedure_statement"


    // $ANTLR start "ruleprocedure_statement"
    // InternalPascalParser.g:1018:1: ruleprocedure_statement : ( ( rule__Procedure_statement__Group__0 ) ) ;
    public final void ruleprocedure_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1022:2: ( ( ( rule__Procedure_statement__Group__0 ) ) )
            // InternalPascalParser.g:1023:2: ( ( rule__Procedure_statement__Group__0 ) )
            {
            // InternalPascalParser.g:1023:2: ( ( rule__Procedure_statement__Group__0 ) )
            // InternalPascalParser.g:1024:3: ( rule__Procedure_statement__Group__0 )
            {
             before(grammarAccess.getProcedure_statementAccess().getGroup()); 
            // InternalPascalParser.g:1025:3: ( rule__Procedure_statement__Group__0 )
            // InternalPascalParser.g:1025:4: rule__Procedure_statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_statementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprocedure_statement"


    // $ANTLR start "entryRuleparameter_list"
    // InternalPascalParser.g:1034:1: entryRuleparameter_list : ruleparameter_list EOF ;
    public final void entryRuleparameter_list() throws RecognitionException {
        try {
            // InternalPascalParser.g:1035:1: ( ruleparameter_list EOF )
            // InternalPascalParser.g:1036:1: ruleparameter_list EOF
            {
             before(grammarAccess.getParameter_listRule()); 
            pushFollow(FOLLOW_1);
            ruleparameter_list();

            state._fsp--;

             after(grammarAccess.getParameter_listRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleparameter_list"


    // $ANTLR start "ruleparameter_list"
    // InternalPascalParser.g:1043:1: ruleparameter_list : ( ( rule__Parameter_list__Group__0 ) ) ;
    public final void ruleparameter_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1047:2: ( ( ( rule__Parameter_list__Group__0 ) ) )
            // InternalPascalParser.g:1048:2: ( ( rule__Parameter_list__Group__0 ) )
            {
            // InternalPascalParser.g:1048:2: ( ( rule__Parameter_list__Group__0 ) )
            // InternalPascalParser.g:1049:3: ( rule__Parameter_list__Group__0 )
            {
             before(grammarAccess.getParameter_listAccess().getGroup()); 
            // InternalPascalParser.g:1050:3: ( rule__Parameter_list__Group__0 )
            // InternalPascalParser.g:1050:4: rule__Parameter_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameter_listAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleparameter_list"


    // $ANTLR start "entryRuleactual_parameter"
    // InternalPascalParser.g:1059:1: entryRuleactual_parameter : ruleactual_parameter EOF ;
    public final void entryRuleactual_parameter() throws RecognitionException {
        try {
            // InternalPascalParser.g:1060:1: ( ruleactual_parameter EOF )
            // InternalPascalParser.g:1061:1: ruleactual_parameter EOF
            {
             before(grammarAccess.getActual_parameterRule()); 
            pushFollow(FOLLOW_1);
            ruleactual_parameter();

            state._fsp--;

             after(grammarAccess.getActual_parameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleactual_parameter"


    // $ANTLR start "ruleactual_parameter"
    // InternalPascalParser.g:1068:1: ruleactual_parameter : ( ( rule__Actual_parameter__ContentAssignment ) ) ;
    public final void ruleactual_parameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1072:2: ( ( ( rule__Actual_parameter__ContentAssignment ) ) )
            // InternalPascalParser.g:1073:2: ( ( rule__Actual_parameter__ContentAssignment ) )
            {
            // InternalPascalParser.g:1073:2: ( ( rule__Actual_parameter__ContentAssignment ) )
            // InternalPascalParser.g:1074:3: ( rule__Actual_parameter__ContentAssignment )
            {
             before(grammarAccess.getActual_parameterAccess().getContentAssignment()); 
            // InternalPascalParser.g:1075:3: ( rule__Actual_parameter__ContentAssignment )
            // InternalPascalParser.g:1075:4: rule__Actual_parameter__ContentAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Actual_parameter__ContentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getActual_parameterAccess().getContentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleactual_parameter"


    // $ANTLR start "entryRulestructured_statement"
    // InternalPascalParser.g:1084:1: entryRulestructured_statement : rulestructured_statement EOF ;
    public final void entryRulestructured_statement() throws RecognitionException {
        try {
            // InternalPascalParser.g:1085:1: ( rulestructured_statement EOF )
            // InternalPascalParser.g:1086:1: rulestructured_statement EOF
            {
             before(grammarAccess.getStructured_statementRule()); 
            pushFollow(FOLLOW_1);
            rulestructured_statement();

            state._fsp--;

             after(grammarAccess.getStructured_statementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestructured_statement"


    // $ANTLR start "rulestructured_statement"
    // InternalPascalParser.g:1093:1: rulestructured_statement : ( ( rule__Structured_statement__Alternatives ) ) ;
    public final void rulestructured_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1097:2: ( ( ( rule__Structured_statement__Alternatives ) ) )
            // InternalPascalParser.g:1098:2: ( ( rule__Structured_statement__Alternatives ) )
            {
            // InternalPascalParser.g:1098:2: ( ( rule__Structured_statement__Alternatives ) )
            // InternalPascalParser.g:1099:3: ( rule__Structured_statement__Alternatives )
            {
             before(grammarAccess.getStructured_statementAccess().getAlternatives()); 
            // InternalPascalParser.g:1100:3: ( rule__Structured_statement__Alternatives )
            // InternalPascalParser.g:1100:4: rule__Structured_statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Structured_statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStructured_statementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestructured_statement"


    // $ANTLR start "entryRuleconditional_statement"
    // InternalPascalParser.g:1109:1: entryRuleconditional_statement : ruleconditional_statement EOF ;
    public final void entryRuleconditional_statement() throws RecognitionException {
        try {
            // InternalPascalParser.g:1110:1: ( ruleconditional_statement EOF )
            // InternalPascalParser.g:1111:1: ruleconditional_statement EOF
            {
             before(grammarAccess.getConditional_statementRule()); 
            pushFollow(FOLLOW_1);
            ruleconditional_statement();

            state._fsp--;

             after(grammarAccess.getConditional_statementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconditional_statement"


    // $ANTLR start "ruleconditional_statement"
    // InternalPascalParser.g:1118:1: ruleconditional_statement : ( ( rule__Conditional_statement__Cond_statementsAssignment ) ) ;
    public final void ruleconditional_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1122:2: ( ( ( rule__Conditional_statement__Cond_statementsAssignment ) ) )
            // InternalPascalParser.g:1123:2: ( ( rule__Conditional_statement__Cond_statementsAssignment ) )
            {
            // InternalPascalParser.g:1123:2: ( ( rule__Conditional_statement__Cond_statementsAssignment ) )
            // InternalPascalParser.g:1124:3: ( rule__Conditional_statement__Cond_statementsAssignment )
            {
             before(grammarAccess.getConditional_statementAccess().getCond_statementsAssignment()); 
            // InternalPascalParser.g:1125:3: ( rule__Conditional_statement__Cond_statementsAssignment )
            // InternalPascalParser.g:1125:4: rule__Conditional_statement__Cond_statementsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Conditional_statement__Cond_statementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConditional_statementAccess().getCond_statementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconditional_statement"


    // $ANTLR start "entryRulecase_statement"
    // InternalPascalParser.g:1134:1: entryRulecase_statement : rulecase_statement EOF ;
    public final void entryRulecase_statement() throws RecognitionException {
        try {
            // InternalPascalParser.g:1135:1: ( rulecase_statement EOF )
            // InternalPascalParser.g:1136:1: rulecase_statement EOF
            {
             before(grammarAccess.getCase_statementRule()); 
            pushFollow(FOLLOW_1);
            rulecase_statement();

            state._fsp--;

             after(grammarAccess.getCase_statementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecase_statement"


    // $ANTLR start "rulecase_statement"
    // InternalPascalParser.g:1143:1: rulecase_statement : ( ( rule__Case_statement__Group__0 ) ) ;
    public final void rulecase_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1147:2: ( ( ( rule__Case_statement__Group__0 ) ) )
            // InternalPascalParser.g:1148:2: ( ( rule__Case_statement__Group__0 ) )
            {
            // InternalPascalParser.g:1148:2: ( ( rule__Case_statement__Group__0 ) )
            // InternalPascalParser.g:1149:3: ( rule__Case_statement__Group__0 )
            {
             before(grammarAccess.getCase_statementAccess().getGroup()); 
            // InternalPascalParser.g:1150:3: ( rule__Case_statement__Group__0 )
            // InternalPascalParser.g:1150:4: rule__Case_statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Case_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCase_statementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecase_statement"


    // $ANTLR start "entryRulecase_list_element"
    // InternalPascalParser.g:1159:1: entryRulecase_list_element : rulecase_list_element EOF ;
    public final void entryRulecase_list_element() throws RecognitionException {
        try {
            // InternalPascalParser.g:1160:1: ( rulecase_list_element EOF )
            // InternalPascalParser.g:1161:1: rulecase_list_element EOF
            {
             before(grammarAccess.getCase_list_elementRule()); 
            pushFollow(FOLLOW_1);
            rulecase_list_element();

            state._fsp--;

             after(grammarAccess.getCase_list_elementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecase_list_element"


    // $ANTLR start "rulecase_list_element"
    // InternalPascalParser.g:1168:1: rulecase_list_element : ( ( rule__Case_list_element__Group__0 ) ) ;
    public final void rulecase_list_element() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1172:2: ( ( ( rule__Case_list_element__Group__0 ) ) )
            // InternalPascalParser.g:1173:2: ( ( rule__Case_list_element__Group__0 ) )
            {
            // InternalPascalParser.g:1173:2: ( ( rule__Case_list_element__Group__0 ) )
            // InternalPascalParser.g:1174:3: ( rule__Case_list_element__Group__0 )
            {
             before(grammarAccess.getCase_list_elementAccess().getGroup()); 
            // InternalPascalParser.g:1175:3: ( rule__Case_list_element__Group__0 )
            // InternalPascalParser.g:1175:4: rule__Case_list_element__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Case_list_element__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCase_list_elementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecase_list_element"


    // $ANTLR start "entryRuleconst_list"
    // InternalPascalParser.g:1184:1: entryRuleconst_list : ruleconst_list EOF ;
    public final void entryRuleconst_list() throws RecognitionException {
        try {
            // InternalPascalParser.g:1185:1: ( ruleconst_list EOF )
            // InternalPascalParser.g:1186:1: ruleconst_list EOF
            {
             before(grammarAccess.getConst_listRule()); 
            pushFollow(FOLLOW_1);
            ruleconst_list();

            state._fsp--;

             after(grammarAccess.getConst_listRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconst_list"


    // $ANTLR start "ruleconst_list"
    // InternalPascalParser.g:1193:1: ruleconst_list : ( ( rule__Const_list__Group__0 ) ) ;
    public final void ruleconst_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1197:2: ( ( ( rule__Const_list__Group__0 ) ) )
            // InternalPascalParser.g:1198:2: ( ( rule__Const_list__Group__0 ) )
            {
            // InternalPascalParser.g:1198:2: ( ( rule__Const_list__Group__0 ) )
            // InternalPascalParser.g:1199:3: ( rule__Const_list__Group__0 )
            {
             before(grammarAccess.getConst_listAccess().getGroup()); 
            // InternalPascalParser.g:1200:3: ( rule__Const_list__Group__0 )
            // InternalPascalParser.g:1200:4: rule__Const_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Const_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConst_listAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconst_list"


    // $ANTLR start "entryRuleunsigned_integer"
    // InternalPascalParser.g:1209:1: entryRuleunsigned_integer : ruleunsigned_integer EOF ;
    public final void entryRuleunsigned_integer() throws RecognitionException {
        try {
            // InternalPascalParser.g:1210:1: ( ruleunsigned_integer EOF )
            // InternalPascalParser.g:1211:1: ruleunsigned_integer EOF
            {
             before(grammarAccess.getUnsigned_integerRule()); 
            pushFollow(FOLLOW_1);
            ruleunsigned_integer();

            state._fsp--;

             after(grammarAccess.getUnsigned_integerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleunsigned_integer"


    // $ANTLR start "ruleunsigned_integer"
    // InternalPascalParser.g:1218:1: ruleunsigned_integer : ( RULE_NUM_INT ) ;
    public final void ruleunsigned_integer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1222:2: ( ( RULE_NUM_INT ) )
            // InternalPascalParser.g:1223:2: ( RULE_NUM_INT )
            {
            // InternalPascalParser.g:1223:2: ( RULE_NUM_INT )
            // InternalPascalParser.g:1224:3: RULE_NUM_INT
            {
             before(grammarAccess.getUnsigned_integerAccess().getNUM_INTTerminalRuleCall()); 
            match(input,RULE_NUM_INT,FOLLOW_2); 
             after(grammarAccess.getUnsigned_integerAccess().getNUM_INTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleunsigned_integer"


    // $ANTLR start "entryRuleadditive_operator"
    // InternalPascalParser.g:1234:1: entryRuleadditive_operator : ruleadditive_operator EOF ;
    public final void entryRuleadditive_operator() throws RecognitionException {
        try {
            // InternalPascalParser.g:1235:1: ( ruleadditive_operator EOF )
            // InternalPascalParser.g:1236:1: ruleadditive_operator EOF
            {
             before(grammarAccess.getAdditive_operatorRule()); 
            pushFollow(FOLLOW_1);
            ruleadditive_operator();

            state._fsp--;

             after(grammarAccess.getAdditive_operatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleadditive_operator"


    // $ANTLR start "ruleadditive_operator"
    // InternalPascalParser.g:1243:1: ruleadditive_operator : ( ( rule__Additive_operator__Alternatives ) ) ;
    public final void ruleadditive_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1247:2: ( ( ( rule__Additive_operator__Alternatives ) ) )
            // InternalPascalParser.g:1248:2: ( ( rule__Additive_operator__Alternatives ) )
            {
            // InternalPascalParser.g:1248:2: ( ( rule__Additive_operator__Alternatives ) )
            // InternalPascalParser.g:1249:3: ( rule__Additive_operator__Alternatives )
            {
             before(grammarAccess.getAdditive_operatorAccess().getAlternatives()); 
            // InternalPascalParser.g:1250:3: ( rule__Additive_operator__Alternatives )
            // InternalPascalParser.g:1250:4: rule__Additive_operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Additive_operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdditive_operatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleadditive_operator"


    // $ANTLR start "entryRulemultiplicative_operator"
    // InternalPascalParser.g:1259:1: entryRulemultiplicative_operator : rulemultiplicative_operator EOF ;
    public final void entryRulemultiplicative_operator() throws RecognitionException {
        try {
            // InternalPascalParser.g:1260:1: ( rulemultiplicative_operator EOF )
            // InternalPascalParser.g:1261:1: rulemultiplicative_operator EOF
            {
             before(grammarAccess.getMultiplicative_operatorRule()); 
            pushFollow(FOLLOW_1);
            rulemultiplicative_operator();

            state._fsp--;

             after(grammarAccess.getMultiplicative_operatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemultiplicative_operator"


    // $ANTLR start "rulemultiplicative_operator"
    // InternalPascalParser.g:1268:1: rulemultiplicative_operator : ( ( rule__Multiplicative_operator__Alternatives ) ) ;
    public final void rulemultiplicative_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1272:2: ( ( ( rule__Multiplicative_operator__Alternatives ) ) )
            // InternalPascalParser.g:1273:2: ( ( rule__Multiplicative_operator__Alternatives ) )
            {
            // InternalPascalParser.g:1273:2: ( ( rule__Multiplicative_operator__Alternatives ) )
            // InternalPascalParser.g:1274:3: ( rule__Multiplicative_operator__Alternatives )
            {
             before(grammarAccess.getMultiplicative_operatorAccess().getAlternatives()); 
            // InternalPascalParser.g:1275:3: ( rule__Multiplicative_operator__Alternatives )
            // InternalPascalParser.g:1275:4: rule__Multiplicative_operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicative_operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicative_operatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemultiplicative_operator"


    // $ANTLR start "entryRuleprocedure_and_function_declaration_part"
    // InternalPascalParser.g:1284:1: entryRuleprocedure_and_function_declaration_part : ruleprocedure_and_function_declaration_part EOF ;
    public final void entryRuleprocedure_and_function_declaration_part() throws RecognitionException {
        try {
            // InternalPascalParser.g:1285:1: ( ruleprocedure_and_function_declaration_part EOF )
            // InternalPascalParser.g:1286:1: ruleprocedure_and_function_declaration_part EOF
            {
             before(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            ruleprocedure_and_function_declaration_part();

            state._fsp--;

             after(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprocedure_and_function_declaration_part"


    // $ANTLR start "ruleprocedure_and_function_declaration_part"
    // InternalPascalParser.g:1293:1: ruleprocedure_and_function_declaration_part : ( ( rule__Procedure_and_function_declaration_part__Group__0 ) ) ;
    public final void ruleprocedure_and_function_declaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1297:2: ( ( ( rule__Procedure_and_function_declaration_part__Group__0 ) ) )
            // InternalPascalParser.g:1298:2: ( ( rule__Procedure_and_function_declaration_part__Group__0 ) )
            {
            // InternalPascalParser.g:1298:2: ( ( rule__Procedure_and_function_declaration_part__Group__0 ) )
            // InternalPascalParser.g:1299:3: ( rule__Procedure_and_function_declaration_part__Group__0 )
            {
             before(grammarAccess.getProcedure_and_function_declaration_partAccess().getGroup()); 
            // InternalPascalParser.g:1300:3: ( rule__Procedure_and_function_declaration_part__Group__0 )
            // InternalPascalParser.g:1300:4: rule__Procedure_and_function_declaration_part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_and_function_declaration_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_and_function_declaration_partAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprocedure_and_function_declaration_part"


    // $ANTLR start "entryRuleprocedure_or_function_declaration"
    // InternalPascalParser.g:1309:1: entryRuleprocedure_or_function_declaration : ruleprocedure_or_function_declaration EOF ;
    public final void entryRuleprocedure_or_function_declaration() throws RecognitionException {
        try {
            // InternalPascalParser.g:1310:1: ( ruleprocedure_or_function_declaration EOF )
            // InternalPascalParser.g:1311:1: ruleprocedure_or_function_declaration EOF
            {
             before(grammarAccess.getProcedure_or_function_declarationRule()); 
            pushFollow(FOLLOW_1);
            ruleprocedure_or_function_declaration();

            state._fsp--;

             after(grammarAccess.getProcedure_or_function_declarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprocedure_or_function_declaration"


    // $ANTLR start "ruleprocedure_or_function_declaration"
    // InternalPascalParser.g:1318:1: ruleprocedure_or_function_declaration : ( ( rule__Procedure_or_function_declaration__Alternatives ) ) ;
    public final void ruleprocedure_or_function_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1322:2: ( ( ( rule__Procedure_or_function_declaration__Alternatives ) ) )
            // InternalPascalParser.g:1323:2: ( ( rule__Procedure_or_function_declaration__Alternatives ) )
            {
            // InternalPascalParser.g:1323:2: ( ( rule__Procedure_or_function_declaration__Alternatives ) )
            // InternalPascalParser.g:1324:3: ( rule__Procedure_or_function_declaration__Alternatives )
            {
             before(grammarAccess.getProcedure_or_function_declarationAccess().getAlternatives()); 
            // InternalPascalParser.g:1325:3: ( rule__Procedure_or_function_declaration__Alternatives )
            // InternalPascalParser.g:1325:4: rule__Procedure_or_function_declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_or_function_declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_or_function_declarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprocedure_or_function_declaration"


    // $ANTLR start "entryRuleprocedure_declaration"
    // InternalPascalParser.g:1334:1: entryRuleprocedure_declaration : ruleprocedure_declaration EOF ;
    public final void entryRuleprocedure_declaration() throws RecognitionException {
        try {
            // InternalPascalParser.g:1335:1: ( ruleprocedure_declaration EOF )
            // InternalPascalParser.g:1336:1: ruleprocedure_declaration EOF
            {
             before(grammarAccess.getProcedure_declarationRule()); 
            pushFollow(FOLLOW_1);
            ruleprocedure_declaration();

            state._fsp--;

             after(grammarAccess.getProcedure_declarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprocedure_declaration"


    // $ANTLR start "ruleprocedure_declaration"
    // InternalPascalParser.g:1343:1: ruleprocedure_declaration : ( ( rule__Procedure_declaration__Group__0 ) ) ;
    public final void ruleprocedure_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1347:2: ( ( ( rule__Procedure_declaration__Group__0 ) ) )
            // InternalPascalParser.g:1348:2: ( ( rule__Procedure_declaration__Group__0 ) )
            {
            // InternalPascalParser.g:1348:2: ( ( rule__Procedure_declaration__Group__0 ) )
            // InternalPascalParser.g:1349:3: ( rule__Procedure_declaration__Group__0 )
            {
             before(grammarAccess.getProcedure_declarationAccess().getGroup()); 
            // InternalPascalParser.g:1350:3: ( rule__Procedure_declaration__Group__0 )
            // InternalPascalParser.g:1350:4: rule__Procedure_declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_declarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprocedure_declaration"


    // $ANTLR start "entryRulefunction_declaration"
    // InternalPascalParser.g:1359:1: entryRulefunction_declaration : rulefunction_declaration EOF ;
    public final void entryRulefunction_declaration() throws RecognitionException {
        try {
            // InternalPascalParser.g:1360:1: ( rulefunction_declaration EOF )
            // InternalPascalParser.g:1361:1: rulefunction_declaration EOF
            {
             before(grammarAccess.getFunction_declarationRule()); 
            pushFollow(FOLLOW_1);
            rulefunction_declaration();

            state._fsp--;

             after(grammarAccess.getFunction_declarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefunction_declaration"


    // $ANTLR start "rulefunction_declaration"
    // InternalPascalParser.g:1368:1: rulefunction_declaration : ( ( rule__Function_declaration__Group__0 ) ) ;
    public final void rulefunction_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1372:2: ( ( ( rule__Function_declaration__Group__0 ) ) )
            // InternalPascalParser.g:1373:2: ( ( rule__Function_declaration__Group__0 ) )
            {
            // InternalPascalParser.g:1373:2: ( ( rule__Function_declaration__Group__0 ) )
            // InternalPascalParser.g:1374:3: ( rule__Function_declaration__Group__0 )
            {
             before(grammarAccess.getFunction_declarationAccess().getGroup()); 
            // InternalPascalParser.g:1375:3: ( rule__Function_declaration__Group__0 )
            // InternalPascalParser.g:1375:4: rule__Function_declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunction_declarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefunction_declaration"


    // $ANTLR start "entryRulefunction_designator"
    // InternalPascalParser.g:1384:1: entryRulefunction_designator : rulefunction_designator EOF ;
    public final void entryRulefunction_designator() throws RecognitionException {
        try {
            // InternalPascalParser.g:1385:1: ( rulefunction_designator EOF )
            // InternalPascalParser.g:1386:1: rulefunction_designator EOF
            {
             before(grammarAccess.getFunction_designatorRule()); 
            pushFollow(FOLLOW_1);
            rulefunction_designator();

            state._fsp--;

             after(grammarAccess.getFunction_designatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefunction_designator"


    // $ANTLR start "rulefunction_designator"
    // InternalPascalParser.g:1393:1: rulefunction_designator : ( ( rule__Function_designator__Group__0 ) ) ;
    public final void rulefunction_designator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1397:2: ( ( ( rule__Function_designator__Group__0 ) ) )
            // InternalPascalParser.g:1398:2: ( ( rule__Function_designator__Group__0 ) )
            {
            // InternalPascalParser.g:1398:2: ( ( rule__Function_designator__Group__0 ) )
            // InternalPascalParser.g:1399:3: ( rule__Function_designator__Group__0 )
            {
             before(grammarAccess.getFunction_designatorAccess().getGroup()); 
            // InternalPascalParser.g:1400:3: ( rule__Function_designator__Group__0 )
            // InternalPascalParser.g:1400:4: rule__Function_designator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunction_designatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefunction_designator"


    // $ANTLR start "entryRuleformal_parameter_list"
    // InternalPascalParser.g:1409:1: entryRuleformal_parameter_list : ruleformal_parameter_list EOF ;
    public final void entryRuleformal_parameter_list() throws RecognitionException {
        try {
            // InternalPascalParser.g:1410:1: ( ruleformal_parameter_list EOF )
            // InternalPascalParser.g:1411:1: ruleformal_parameter_list EOF
            {
             before(grammarAccess.getFormal_parameter_listRule()); 
            pushFollow(FOLLOW_1);
            ruleformal_parameter_list();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_listRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleformal_parameter_list"


    // $ANTLR start "ruleformal_parameter_list"
    // InternalPascalParser.g:1418:1: ruleformal_parameter_list : ( ( rule__Formal_parameter_list__Group__0 ) ) ;
    public final void ruleformal_parameter_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1422:2: ( ( ( rule__Formal_parameter_list__Group__0 ) ) )
            // InternalPascalParser.g:1423:2: ( ( rule__Formal_parameter_list__Group__0 ) )
            {
            // InternalPascalParser.g:1423:2: ( ( rule__Formal_parameter_list__Group__0 ) )
            // InternalPascalParser.g:1424:3: ( rule__Formal_parameter_list__Group__0 )
            {
             before(grammarAccess.getFormal_parameter_listAccess().getGroup()); 
            // InternalPascalParser.g:1425:3: ( rule__Formal_parameter_list__Group__0 )
            // InternalPascalParser.g:1425:4: rule__Formal_parameter_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormal_parameter_listAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleformal_parameter_list"


    // $ANTLR start "entryRuleformal_parameter_section"
    // InternalPascalParser.g:1434:1: entryRuleformal_parameter_section : ruleformal_parameter_section EOF ;
    public final void entryRuleformal_parameter_section() throws RecognitionException {
        try {
            // InternalPascalParser.g:1435:1: ( ruleformal_parameter_section EOF )
            // InternalPascalParser.g:1436:1: ruleformal_parameter_section EOF
            {
             before(grammarAccess.getFormal_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            ruleformal_parameter_section();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleformal_parameter_section"


    // $ANTLR start "ruleformal_parameter_section"
    // InternalPascalParser.g:1443:1: ruleformal_parameter_section : ( ( rule__Formal_parameter_section__Alternatives ) ) ;
    public final void ruleformal_parameter_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1447:2: ( ( ( rule__Formal_parameter_section__Alternatives ) ) )
            // InternalPascalParser.g:1448:2: ( ( rule__Formal_parameter_section__Alternatives ) )
            {
            // InternalPascalParser.g:1448:2: ( ( rule__Formal_parameter_section__Alternatives ) )
            // InternalPascalParser.g:1449:3: ( rule__Formal_parameter_section__Alternatives )
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getAlternatives()); 
            // InternalPascalParser.g:1450:3: ( rule__Formal_parameter_section__Alternatives )
            // InternalPascalParser.g:1450:4: rule__Formal_parameter_section__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_section__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormal_parameter_sectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleformal_parameter_section"


    // $ANTLR start "entryRuleparameter_group"
    // InternalPascalParser.g:1459:1: entryRuleparameter_group : ruleparameter_group EOF ;
    public final void entryRuleparameter_group() throws RecognitionException {
        try {
            // InternalPascalParser.g:1460:1: ( ruleparameter_group EOF )
            // InternalPascalParser.g:1461:1: ruleparameter_group EOF
            {
             before(grammarAccess.getParameter_groupRule()); 
            pushFollow(FOLLOW_1);
            ruleparameter_group();

            state._fsp--;

             after(grammarAccess.getParameter_groupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleparameter_group"


    // $ANTLR start "ruleparameter_group"
    // InternalPascalParser.g:1468:1: ruleparameter_group : ( ( rule__Parameter_group__Group__0 ) ) ;
    public final void ruleparameter_group() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1472:2: ( ( ( rule__Parameter_group__Group__0 ) ) )
            // InternalPascalParser.g:1473:2: ( ( rule__Parameter_group__Group__0 ) )
            {
            // InternalPascalParser.g:1473:2: ( ( rule__Parameter_group__Group__0 ) )
            // InternalPascalParser.g:1474:3: ( rule__Parameter_group__Group__0 )
            {
             before(grammarAccess.getParameter_groupAccess().getGroup()); 
            // InternalPascalParser.g:1475:3: ( rule__Parameter_group__Group__0 )
            // InternalPascalParser.g:1475:4: rule__Parameter_group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameter_groupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleparameter_group"


    // $ANTLR start "entryRuleresult_type"
    // InternalPascalParser.g:1484:1: entryRuleresult_type : ruleresult_type EOF ;
    public final void entryRuleresult_type() throws RecognitionException {
        try {
            // InternalPascalParser.g:1485:1: ( ruleresult_type EOF )
            // InternalPascalParser.g:1486:1: ruleresult_type EOF
            {
             before(grammarAccess.getResult_typeRule()); 
            pushFollow(FOLLOW_1);
            ruleresult_type();

            state._fsp--;

             after(grammarAccess.getResult_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleresult_type"


    // $ANTLR start "ruleresult_type"
    // InternalPascalParser.g:1493:1: ruleresult_type : ( ruletype_identifier ) ;
    public final void ruleresult_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1497:2: ( ( ruletype_identifier ) )
            // InternalPascalParser.g:1498:2: ( ruletype_identifier )
            {
            // InternalPascalParser.g:1498:2: ( ruletype_identifier )
            // InternalPascalParser.g:1499:3: ruletype_identifier
            {
             before(grammarAccess.getResult_typeAccess().getType_identifierParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruletype_identifier();

            state._fsp--;

             after(grammarAccess.getResult_typeAccess().getType_identifierParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleresult_type"


    // $ANTLR start "entryRulebool"
    // InternalPascalParser.g:1509:1: entryRulebool : rulebool EOF ;
    public final void entryRulebool() throws RecognitionException {
        try {
            // InternalPascalParser.g:1510:1: ( rulebool EOF )
            // InternalPascalParser.g:1511:1: rulebool EOF
            {
             before(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            rulebool();

            state._fsp--;

             after(grammarAccess.getBoolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebool"


    // $ANTLR start "rulebool"
    // InternalPascalParser.g:1518:1: rulebool : ( ( rule__Bool__Alternatives ) ) ;
    public final void rulebool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1522:2: ( ( ( rule__Bool__Alternatives ) ) )
            // InternalPascalParser.g:1523:2: ( ( rule__Bool__Alternatives ) )
            {
            // InternalPascalParser.g:1523:2: ( ( rule__Bool__Alternatives ) )
            // InternalPascalParser.g:1524:3: ( rule__Bool__Alternatives )
            {
             before(grammarAccess.getBoolAccess().getAlternatives()); 
            // InternalPascalParser.g:1525:3: ( rule__Bool__Alternatives )
            // InternalPascalParser.g:1525:4: rule__Bool__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Bool__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebool"


    // $ANTLR start "entryRuleprocedure"
    // InternalPascalParser.g:1534:1: entryRuleprocedure : ruleprocedure EOF ;
    public final void entryRuleprocedure() throws RecognitionException {
        try {
            // InternalPascalParser.g:1535:1: ( ruleprocedure EOF )
            // InternalPascalParser.g:1536:1: ruleprocedure EOF
            {
             before(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_1);
            ruleprocedure();

            state._fsp--;

             after(grammarAccess.getProcedureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprocedure"


    // $ANTLR start "ruleprocedure"
    // InternalPascalParser.g:1543:1: ruleprocedure : ( Procedure ) ;
    public final void ruleprocedure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1547:2: ( ( Procedure ) )
            // InternalPascalParser.g:1548:2: ( Procedure )
            {
            // InternalPascalParser.g:1548:2: ( Procedure )
            // InternalPascalParser.g:1549:3: Procedure
            {
             before(grammarAccess.getProcedureAccess().getProcedureKeyword()); 
            match(input,Procedure,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getProcedureKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprocedure"


    // $ANTLR start "entryRulefunction"
    // InternalPascalParser.g:1559:1: entryRulefunction : rulefunction EOF ;
    public final void entryRulefunction() throws RecognitionException {
        try {
            // InternalPascalParser.g:1560:1: ( rulefunction EOF )
            // InternalPascalParser.g:1561:1: rulefunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            rulefunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefunction"


    // $ANTLR start "rulefunction"
    // InternalPascalParser.g:1568:1: rulefunction : ( Function ) ;
    public final void rulefunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1572:2: ( ( Function ) )
            // InternalPascalParser.g:1573:2: ( Function )
            {
            // InternalPascalParser.g:1573:2: ( Function )
            // InternalPascalParser.g:1574:3: Function
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword()); 
            match(input,Function,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefunction"


    // $ANTLR start "entryRulesign"
    // InternalPascalParser.g:1584:1: entryRulesign : rulesign EOF ;
    public final void entryRulesign() throws RecognitionException {
        try {
            // InternalPascalParser.g:1585:1: ( rulesign EOF )
            // InternalPascalParser.g:1586:1: rulesign EOF
            {
             before(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_1);
            rulesign();

            state._fsp--;

             after(grammarAccess.getSignRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesign"


    // $ANTLR start "rulesign"
    // InternalPascalParser.g:1593:1: rulesign : ( ( rule__Sign__Alternatives ) ) ;
    public final void rulesign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1597:2: ( ( ( rule__Sign__Alternatives ) ) )
            // InternalPascalParser.g:1598:2: ( ( rule__Sign__Alternatives ) )
            {
            // InternalPascalParser.g:1598:2: ( ( rule__Sign__Alternatives ) )
            // InternalPascalParser.g:1599:3: ( rule__Sign__Alternatives )
            {
             before(grammarAccess.getSignAccess().getAlternatives()); 
            // InternalPascalParser.g:1600:3: ( rule__Sign__Alternatives )
            // InternalPascalParser.g:1600:4: rule__Sign__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sign__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSignAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesign"


    // $ANTLR start "rule__Block__Alternatives_0"
    // InternalPascalParser.g:1608:1: rule__Block__Alternatives_0 : ( ( ( rule__Block__ConstantpartAssignment_0_0 ) ) | ( ( rule__Block__Type_partAssignment_0_1 ) ) | ( ( rule__Block__VariablepartAssignment_0_2 ) ) | ( ( rule__Block__Procedure_function_partAssignment_0_3 ) ) );
    public final void rule__Block__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1612:1: ( ( ( rule__Block__ConstantpartAssignment_0_0 ) ) | ( ( rule__Block__Type_partAssignment_0_1 ) ) | ( ( rule__Block__VariablepartAssignment_0_2 ) ) | ( ( rule__Block__Procedure_function_partAssignment_0_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case Const:
                {
                alt1=1;
                }
                break;
            case Type:
                {
                alt1=2;
                }
                break;
            case Var:
                {
                alt1=3;
                }
                break;
            case Procedure:
            case Function:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPascalParser.g:1613:2: ( ( rule__Block__ConstantpartAssignment_0_0 ) )
                    {
                    // InternalPascalParser.g:1613:2: ( ( rule__Block__ConstantpartAssignment_0_0 ) )
                    // InternalPascalParser.g:1614:3: ( rule__Block__ConstantpartAssignment_0_0 )
                    {
                     before(grammarAccess.getBlockAccess().getConstantpartAssignment_0_0()); 
                    // InternalPascalParser.g:1615:3: ( rule__Block__ConstantpartAssignment_0_0 )
                    // InternalPascalParser.g:1615:4: rule__Block__ConstantpartAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__ConstantpartAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBlockAccess().getConstantpartAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1619:2: ( ( rule__Block__Type_partAssignment_0_1 ) )
                    {
                    // InternalPascalParser.g:1619:2: ( ( rule__Block__Type_partAssignment_0_1 ) )
                    // InternalPascalParser.g:1620:3: ( rule__Block__Type_partAssignment_0_1 )
                    {
                     before(grammarAccess.getBlockAccess().getType_partAssignment_0_1()); 
                    // InternalPascalParser.g:1621:3: ( rule__Block__Type_partAssignment_0_1 )
                    // InternalPascalParser.g:1621:4: rule__Block__Type_partAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__Type_partAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBlockAccess().getType_partAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascalParser.g:1625:2: ( ( rule__Block__VariablepartAssignment_0_2 ) )
                    {
                    // InternalPascalParser.g:1625:2: ( ( rule__Block__VariablepartAssignment_0_2 ) )
                    // InternalPascalParser.g:1626:3: ( rule__Block__VariablepartAssignment_0_2 )
                    {
                     before(grammarAccess.getBlockAccess().getVariablepartAssignment_0_2()); 
                    // InternalPascalParser.g:1627:3: ( rule__Block__VariablepartAssignment_0_2 )
                    // InternalPascalParser.g:1627:4: rule__Block__VariablepartAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__VariablepartAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getBlockAccess().getVariablepartAssignment_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascalParser.g:1631:2: ( ( rule__Block__Procedure_function_partAssignment_0_3 ) )
                    {
                    // InternalPascalParser.g:1631:2: ( ( rule__Block__Procedure_function_partAssignment_0_3 ) )
                    // InternalPascalParser.g:1632:3: ( rule__Block__Procedure_function_partAssignment_0_3 )
                    {
                     before(grammarAccess.getBlockAccess().getProcedure_function_partAssignment_0_3()); 
                    // InternalPascalParser.g:1633:3: ( rule__Block__Procedure_function_partAssignment_0_3 )
                    // InternalPascalParser.g:1633:4: rule__Block__Procedure_function_partAssignment_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__Procedure_function_partAssignment_0_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getBlockAccess().getProcedure_function_partAssignment_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Alternatives_0"


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalPascalParser.g:1641:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Uns_numberAssignment_0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__Name_idAssignment_2 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__StringAssignment_4 ) ) | ( ( rule__Constant__BooltypeAssignment_5 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1645:1: ( ( ( rule__Constant__Uns_numberAssignment_0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__Name_idAssignment_2 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__StringAssignment_4 ) ) | ( ( rule__Constant__BooltypeAssignment_5 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case RULE_NUM_INT:
                {
                alt2=1;
                }
                break;
            case RULE_PLUS:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_NUM_INT) ) {
                    alt2=2;
                }
                else if ( (LA2_2==RULE_ID) ) {
                    alt2=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MINUS:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==RULE_NUM_INT) ) {
                    alt2=2;
                }
                else if ( (LA2_3==RULE_ID) ) {
                    alt2=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            case RULE_STRING:
                {
                alt2=5;
                }
                break;
            case False:
            case True:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPascalParser.g:1646:2: ( ( rule__Constant__Uns_numberAssignment_0 ) )
                    {
                    // InternalPascalParser.g:1646:2: ( ( rule__Constant__Uns_numberAssignment_0 ) )
                    // InternalPascalParser.g:1647:3: ( rule__Constant__Uns_numberAssignment_0 )
                    {
                     before(grammarAccess.getConstantAccess().getUns_numberAssignment_0()); 
                    // InternalPascalParser.g:1648:3: ( rule__Constant__Uns_numberAssignment_0 )
                    // InternalPascalParser.g:1648:4: rule__Constant__Uns_numberAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Uns_numberAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getUns_numberAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1652:2: ( ( rule__Constant__Group_1__0 ) )
                    {
                    // InternalPascalParser.g:1652:2: ( ( rule__Constant__Group_1__0 ) )
                    // InternalPascalParser.g:1653:3: ( rule__Constant__Group_1__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_1()); 
                    // InternalPascalParser.g:1654:3: ( rule__Constant__Group_1__0 )
                    // InternalPascalParser.g:1654:4: rule__Constant__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascalParser.g:1658:2: ( ( rule__Constant__Name_idAssignment_2 ) )
                    {
                    // InternalPascalParser.g:1658:2: ( ( rule__Constant__Name_idAssignment_2 ) )
                    // InternalPascalParser.g:1659:3: ( rule__Constant__Name_idAssignment_2 )
                    {
                     before(grammarAccess.getConstantAccess().getName_idAssignment_2()); 
                    // InternalPascalParser.g:1660:3: ( rule__Constant__Name_idAssignment_2 )
                    // InternalPascalParser.g:1660:4: rule__Constant__Name_idAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Name_idAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getName_idAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascalParser.g:1664:2: ( ( rule__Constant__Group_3__0 ) )
                    {
                    // InternalPascalParser.g:1664:2: ( ( rule__Constant__Group_3__0 ) )
                    // InternalPascalParser.g:1665:3: ( rule__Constant__Group_3__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_3()); 
                    // InternalPascalParser.g:1666:3: ( rule__Constant__Group_3__0 )
                    // InternalPascalParser.g:1666:4: rule__Constant__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPascalParser.g:1670:2: ( ( rule__Constant__StringAssignment_4 ) )
                    {
                    // InternalPascalParser.g:1670:2: ( ( rule__Constant__StringAssignment_4 ) )
                    // InternalPascalParser.g:1671:3: ( rule__Constant__StringAssignment_4 )
                    {
                     before(grammarAccess.getConstantAccess().getStringAssignment_4()); 
                    // InternalPascalParser.g:1672:3: ( rule__Constant__StringAssignment_4 )
                    // InternalPascalParser.g:1672:4: rule__Constant__StringAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__StringAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getStringAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPascalParser.g:1676:2: ( ( rule__Constant__BooltypeAssignment_5 ) )
                    {
                    // InternalPascalParser.g:1676:2: ( ( rule__Constant__BooltypeAssignment_5 ) )
                    // InternalPascalParser.g:1677:3: ( rule__Constant__BooltypeAssignment_5 )
                    {
                     before(grammarAccess.getConstantAccess().getBooltypeAssignment_5()); 
                    // InternalPascalParser.g:1678:3: ( rule__Constant__BooltypeAssignment_5 )
                    // InternalPascalParser.g:1678:4: rule__Constant__BooltypeAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__BooltypeAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getBooltypeAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__Unlabelled_statement__Alternatives"
    // InternalPascalParser.g:1686:1: rule__Unlabelled_statement__Alternatives : ( ( ( rule__Unlabelled_statement__SimpleAssignment_0 ) ) | ( ( rule__Unlabelled_statement__StructuredAssignment_1 ) ) );
    public final void rule__Unlabelled_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1690:1: ( ( ( rule__Unlabelled_statement__SimpleAssignment_0 ) ) | ( ( rule__Unlabelled_statement__StructuredAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CommercialAt||LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==Begin||LA3_0==Case) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascalParser.g:1691:2: ( ( rule__Unlabelled_statement__SimpleAssignment_0 ) )
                    {
                    // InternalPascalParser.g:1691:2: ( ( rule__Unlabelled_statement__SimpleAssignment_0 ) )
                    // InternalPascalParser.g:1692:3: ( rule__Unlabelled_statement__SimpleAssignment_0 )
                    {
                     before(grammarAccess.getUnlabelled_statementAccess().getSimpleAssignment_0()); 
                    // InternalPascalParser.g:1693:3: ( rule__Unlabelled_statement__SimpleAssignment_0 )
                    // InternalPascalParser.g:1693:4: rule__Unlabelled_statement__SimpleAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unlabelled_statement__SimpleAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnlabelled_statementAccess().getSimpleAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1697:2: ( ( rule__Unlabelled_statement__StructuredAssignment_1 ) )
                    {
                    // InternalPascalParser.g:1697:2: ( ( rule__Unlabelled_statement__StructuredAssignment_1 ) )
                    // InternalPascalParser.g:1698:3: ( rule__Unlabelled_statement__StructuredAssignment_1 )
                    {
                     before(grammarAccess.getUnlabelled_statementAccess().getStructuredAssignment_1()); 
                    // InternalPascalParser.g:1699:3: ( rule__Unlabelled_statement__StructuredAssignment_1 )
                    // InternalPascalParser.g:1699:4: rule__Unlabelled_statement__StructuredAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unlabelled_statement__StructuredAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnlabelled_statementAccess().getStructuredAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unlabelled_statement__Alternatives"


    // $ANTLR start "rule__Simple_statement__Alternatives"
    // InternalPascalParser.g:1707:1: rule__Simple_statement__Alternatives : ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__ProcedureAssignment_1 ) ) );
    public final void rule__Simple_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1711:1: ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__ProcedureAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==CommercialAt) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==LeftParenthesisFullStop||LA4_2==FullStop||LA4_2==LeftSquareBracket||LA4_2==CircumflexAccent||LA4_2==RULE_ASSIGN) ) {
                    alt4=1;
                }
                else if ( (LA4_2==EOF||LA4_2==Else||LA4_2==End||LA4_2==LeftParenthesis||LA4_2==Semicolon) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascalParser.g:1712:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    {
                    // InternalPascalParser.g:1712:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    // InternalPascalParser.g:1713:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_0()); 
                    // InternalPascalParser.g:1714:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    // InternalPascalParser.g:1714:4: rule__Simple_statement__AssignmentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_statement__AssignmentAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1718:2: ( ( rule__Simple_statement__ProcedureAssignment_1 ) )
                    {
                    // InternalPascalParser.g:1718:2: ( ( rule__Simple_statement__ProcedureAssignment_1 ) )
                    // InternalPascalParser.g:1719:3: ( rule__Simple_statement__ProcedureAssignment_1 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getProcedureAssignment_1()); 
                    // InternalPascalParser.g:1720:3: ( rule__Simple_statement__ProcedureAssignment_1 )
                    // InternalPascalParser.g:1720:4: rule__Simple_statement__ProcedureAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_statement__ProcedureAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_statementAccess().getProcedureAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_statement__Alternatives"


    // $ANTLR start "rule__Variable__Alternatives_0"
    // InternalPascalParser.g:1728:1: rule__Variable__Alternatives_0 : ( ( ( rule__Variable__Group_0_0__0 ) ) | ( ( rule__Variable__Variable_idAssignment_0_1 ) ) );
    public final void rule__Variable__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1732:1: ( ( ( rule__Variable__Group_0_0__0 ) ) | ( ( rule__Variable__Variable_idAssignment_0_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CommercialAt) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascalParser.g:1733:2: ( ( rule__Variable__Group_0_0__0 ) )
                    {
                    // InternalPascalParser.g:1733:2: ( ( rule__Variable__Group_0_0__0 ) )
                    // InternalPascalParser.g:1734:3: ( rule__Variable__Group_0_0__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_0_0()); 
                    // InternalPascalParser.g:1735:3: ( rule__Variable__Group_0_0__0 )
                    // InternalPascalParser.g:1735:4: rule__Variable__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1739:2: ( ( rule__Variable__Variable_idAssignment_0_1 ) )
                    {
                    // InternalPascalParser.g:1739:2: ( ( rule__Variable__Variable_idAssignment_0_1 ) )
                    // InternalPascalParser.g:1740:3: ( rule__Variable__Variable_idAssignment_0_1 )
                    {
                     before(grammarAccess.getVariableAccess().getVariable_idAssignment_0_1()); 
                    // InternalPascalParser.g:1741:3: ( rule__Variable__Variable_idAssignment_0_1 )
                    // InternalPascalParser.g:1741:4: rule__Variable__Variable_idAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Variable_idAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getVariable_idAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Alternatives_0"


    // $ANTLR start "rule__Variable__Alternatives_1"
    // InternalPascalParser.g:1749:1: rule__Variable__Alternatives_1 : ( ( ( rule__Variable__Group_1_0__0 ) ) | ( ( rule__Variable__Group_1_1__0 ) ) | ( ( rule__Variable__Group_1_2__0 ) ) | ( CircumflexAccent ) );
    public final void rule__Variable__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1753:1: ( ( ( rule__Variable__Group_1_0__0 ) ) | ( ( rule__Variable__Group_1_1__0 ) ) | ( ( rule__Variable__Group_1_2__0 ) ) | ( CircumflexAccent ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case LeftSquareBracket:
                {
                alt6=1;
                }
                break;
            case LeftParenthesisFullStop:
                {
                alt6=2;
                }
                break;
            case FullStop:
                {
                alt6=3;
                }
                break;
            case CircumflexAccent:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPascalParser.g:1754:2: ( ( rule__Variable__Group_1_0__0 ) )
                    {
                    // InternalPascalParser.g:1754:2: ( ( rule__Variable__Group_1_0__0 ) )
                    // InternalPascalParser.g:1755:3: ( rule__Variable__Group_1_0__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_1_0()); 
                    // InternalPascalParser.g:1756:3: ( rule__Variable__Group_1_0__0 )
                    // InternalPascalParser.g:1756:4: rule__Variable__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1760:2: ( ( rule__Variable__Group_1_1__0 ) )
                    {
                    // InternalPascalParser.g:1760:2: ( ( rule__Variable__Group_1_1__0 ) )
                    // InternalPascalParser.g:1761:3: ( rule__Variable__Group_1_1__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_1_1()); 
                    // InternalPascalParser.g:1762:3: ( rule__Variable__Group_1_1__0 )
                    // InternalPascalParser.g:1762:4: rule__Variable__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascalParser.g:1766:2: ( ( rule__Variable__Group_1_2__0 ) )
                    {
                    // InternalPascalParser.g:1766:2: ( ( rule__Variable__Group_1_2__0 ) )
                    // InternalPascalParser.g:1767:3: ( rule__Variable__Group_1_2__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_1_2()); 
                    // InternalPascalParser.g:1768:3: ( rule__Variable__Group_1_2__0 )
                    // InternalPascalParser.g:1768:4: rule__Variable__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascalParser.g:1772:2: ( CircumflexAccent )
                    {
                    // InternalPascalParser.g:1772:2: ( CircumflexAccent )
                    // InternalPascalParser.g:1773:3: CircumflexAccent
                    {
                     before(grammarAccess.getVariableAccess().getCircumflexAccentKeyword_1_3()); 
                    match(input,CircumflexAccent,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getCircumflexAccentKeyword_1_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Alternatives_1"


    // $ANTLR start "rule__Signed_factor__Alternatives_0"
    // InternalPascalParser.g:1782:1: rule__Signed_factor__Alternatives_0 : ( ( ( rule__Signed_factor__SignalAssignment_0_0 ) ) | ( ( rule__Signed_factor__SignalAssignment_0_1 ) ) );
    public final void rule__Signed_factor__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1786:1: ( ( ( rule__Signed_factor__SignalAssignment_0_0 ) ) | ( ( rule__Signed_factor__SignalAssignment_0_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_PLUS) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_MINUS) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPascalParser.g:1787:2: ( ( rule__Signed_factor__SignalAssignment_0_0 ) )
                    {
                    // InternalPascalParser.g:1787:2: ( ( rule__Signed_factor__SignalAssignment_0_0 ) )
                    // InternalPascalParser.g:1788:3: ( rule__Signed_factor__SignalAssignment_0_0 )
                    {
                     before(grammarAccess.getSigned_factorAccess().getSignalAssignment_0_0()); 
                    // InternalPascalParser.g:1789:3: ( rule__Signed_factor__SignalAssignment_0_0 )
                    // InternalPascalParser.g:1789:4: rule__Signed_factor__SignalAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signed_factor__SignalAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigned_factorAccess().getSignalAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1793:2: ( ( rule__Signed_factor__SignalAssignment_0_1 ) )
                    {
                    // InternalPascalParser.g:1793:2: ( ( rule__Signed_factor__SignalAssignment_0_1 ) )
                    // InternalPascalParser.g:1794:3: ( rule__Signed_factor__SignalAssignment_0_1 )
                    {
                     before(grammarAccess.getSigned_factorAccess().getSignalAssignment_0_1()); 
                    // InternalPascalParser.g:1795:3: ( rule__Signed_factor__SignalAssignment_0_1 )
                    // InternalPascalParser.g:1795:4: rule__Signed_factor__SignalAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signed_factor__SignalAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigned_factorAccess().getSignalAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_factor__Alternatives_0"


    // $ANTLR start "rule__Factor__Alternatives"
    // InternalPascalParser.g:1803:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__Group_1__0 ) ) | ( ( rule__Factor__FunctionAssignment_2 ) ) | ( ( rule__Factor__ConstantAssignment_3 ) ) | ( ( rule__Factor__Group_4__0 ) ) | ( ( rule__Factor__Bool_factorAssignment_5 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1807:1: ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__Group_1__0 ) ) | ( ( rule__Factor__FunctionAssignment_2 ) ) | ( ( rule__Factor__ConstantAssignment_3 ) ) | ( ( rule__Factor__Group_4__0 ) ) | ( ( rule__Factor__Bool_factorAssignment_5 ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case CommercialAt:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==EOF||LA8_2==Else||LA8_2==End||(LA8_2>=LeftParenthesisFullStop && LA8_2<=Of)||(LA8_2>=RightParenthesis && LA8_2<=FullStop)||LA8_2==Semicolon||(LA8_2>=LeftSquareBracket && LA8_2<=CircumflexAccent)||(LA8_2>=RULE_STAR && LA8_2<=RULE_OR)) ) {
                    alt8=1;
                }
                else if ( (LA8_2==LeftParenthesis) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case LeftParenthesis:
                {
                alt8=2;
                }
                break;
            case RULE_NIL:
            case RULE_NUM_INT:
            case RULE_STRING:
                {
                alt8=4;
                }
                break;
            case RULE_NOT:
                {
                alt8=5;
                }
                break;
            case False:
            case True:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPascalParser.g:1808:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    {
                    // InternalPascalParser.g:1808:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    // InternalPascalParser.g:1809:3: ( rule__Factor__VariableAssignment_0 )
                    {
                     before(grammarAccess.getFactorAccess().getVariableAssignment_0()); 
                    // InternalPascalParser.g:1810:3: ( rule__Factor__VariableAssignment_0 )
                    // InternalPascalParser.g:1810:4: rule__Factor__VariableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__VariableAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getVariableAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1814:2: ( ( rule__Factor__Group_1__0 ) )
                    {
                    // InternalPascalParser.g:1814:2: ( ( rule__Factor__Group_1__0 ) )
                    // InternalPascalParser.g:1815:3: ( rule__Factor__Group_1__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1()); 
                    // InternalPascalParser.g:1816:3: ( rule__Factor__Group_1__0 )
                    // InternalPascalParser.g:1816:4: rule__Factor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascalParser.g:1820:2: ( ( rule__Factor__FunctionAssignment_2 ) )
                    {
                    // InternalPascalParser.g:1820:2: ( ( rule__Factor__FunctionAssignment_2 ) )
                    // InternalPascalParser.g:1821:3: ( rule__Factor__FunctionAssignment_2 )
                    {
                     before(grammarAccess.getFactorAccess().getFunctionAssignment_2()); 
                    // InternalPascalParser.g:1822:3: ( rule__Factor__FunctionAssignment_2 )
                    // InternalPascalParser.g:1822:4: rule__Factor__FunctionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__FunctionAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getFunctionAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascalParser.g:1826:2: ( ( rule__Factor__ConstantAssignment_3 ) )
                    {
                    // InternalPascalParser.g:1826:2: ( ( rule__Factor__ConstantAssignment_3 ) )
                    // InternalPascalParser.g:1827:3: ( rule__Factor__ConstantAssignment_3 )
                    {
                     before(grammarAccess.getFactorAccess().getConstantAssignment_3()); 
                    // InternalPascalParser.g:1828:3: ( rule__Factor__ConstantAssignment_3 )
                    // InternalPascalParser.g:1828:4: rule__Factor__ConstantAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__ConstantAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getConstantAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPascalParser.g:1832:2: ( ( rule__Factor__Group_4__0 ) )
                    {
                    // InternalPascalParser.g:1832:2: ( ( rule__Factor__Group_4__0 ) )
                    // InternalPascalParser.g:1833:3: ( rule__Factor__Group_4__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_4()); 
                    // InternalPascalParser.g:1834:3: ( rule__Factor__Group_4__0 )
                    // InternalPascalParser.g:1834:4: rule__Factor__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPascalParser.g:1838:2: ( ( rule__Factor__Bool_factorAssignment_5 ) )
                    {
                    // InternalPascalParser.g:1838:2: ( ( rule__Factor__Bool_factorAssignment_5 ) )
                    // InternalPascalParser.g:1839:3: ( rule__Factor__Bool_factorAssignment_5 )
                    {
                     before(grammarAccess.getFactorAccess().getBool_factorAssignment_5()); 
                    // InternalPascalParser.g:1840:3: ( rule__Factor__Bool_factorAssignment_5 )
                    // InternalPascalParser.g:1840:4: rule__Factor__Bool_factorAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Bool_factorAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getBool_factorAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalPascalParser.g:1848:1: rule__Type__Alternatives : ( ( ( rule__Type__SimpleAssignment_0 ) ) | ( ( rule__Type__StructuredAssignment_1 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1852:1: ( ( ( rule__Type__SimpleAssignment_0 ) ) | ( ( rule__Type__StructuredAssignment_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=Boolean && LA9_0<=Integer)||LA9_0==String||LA9_0==False||LA9_0==True||(LA9_0>=RULE_PLUS && LA9_0<=RULE_MINUS)||LA9_0==RULE_NUM_INT||(LA9_0>=RULE_ID && LA9_0<=RULE_STRING)) ) {
                alt9=1;
            }
            else if ( (LA9_0==Array) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascalParser.g:1853:2: ( ( rule__Type__SimpleAssignment_0 ) )
                    {
                    // InternalPascalParser.g:1853:2: ( ( rule__Type__SimpleAssignment_0 ) )
                    // InternalPascalParser.g:1854:3: ( rule__Type__SimpleAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getSimpleAssignment_0()); 
                    // InternalPascalParser.g:1855:3: ( rule__Type__SimpleAssignment_0 )
                    // InternalPascalParser.g:1855:4: rule__Type__SimpleAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__SimpleAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getSimpleAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1859:2: ( ( rule__Type__StructuredAssignment_1 ) )
                    {
                    // InternalPascalParser.g:1859:2: ( ( rule__Type__StructuredAssignment_1 ) )
                    // InternalPascalParser.g:1860:3: ( rule__Type__StructuredAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getStructuredAssignment_1()); 
                    // InternalPascalParser.g:1861:3: ( rule__Type__StructuredAssignment_1 )
                    // InternalPascalParser.g:1861:4: rule__Type__StructuredAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__StructuredAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getStructuredAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Simple_type__Alternatives"
    // InternalPascalParser.g:1869:1: rule__Simple_type__Alternatives : ( ( ( rule__Simple_type__TypeAssignment_0 ) ) | ( ( rule__Simple_type__Subrange_typeAssignment_1 ) ) );
    public final void rule__Simple_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1873:1: ( ( ( rule__Simple_type__TypeAssignment_0 ) ) | ( ( rule__Simple_type__Subrange_typeAssignment_1 ) ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||LA10_1==Comma||LA10_1==Semicolon||LA10_1==RightSquareBracket) ) {
                    alt10=1;
                }
                else if ( (LA10_1==RULE_DOTDOT) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case Boolean:
            case Integer:
            case String:
                {
                alt10=1;
                }
                break;
            case False:
            case True:
            case RULE_PLUS:
            case RULE_MINUS:
            case RULE_NUM_INT:
            case RULE_STRING:
                {
                alt10=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalPascalParser.g:1874:2: ( ( rule__Simple_type__TypeAssignment_0 ) )
                    {
                    // InternalPascalParser.g:1874:2: ( ( rule__Simple_type__TypeAssignment_0 ) )
                    // InternalPascalParser.g:1875:3: ( rule__Simple_type__TypeAssignment_0 )
                    {
                     before(grammarAccess.getSimple_typeAccess().getTypeAssignment_0()); 
                    // InternalPascalParser.g:1876:3: ( rule__Simple_type__TypeAssignment_0 )
                    // InternalPascalParser.g:1876:4: rule__Simple_type__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_type__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_typeAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1880:2: ( ( rule__Simple_type__Subrange_typeAssignment_1 ) )
                    {
                    // InternalPascalParser.g:1880:2: ( ( rule__Simple_type__Subrange_typeAssignment_1 ) )
                    // InternalPascalParser.g:1881:3: ( rule__Simple_type__Subrange_typeAssignment_1 )
                    {
                     before(grammarAccess.getSimple_typeAccess().getSubrange_typeAssignment_1()); 
                    // InternalPascalParser.g:1882:3: ( rule__Simple_type__Subrange_typeAssignment_1 )
                    // InternalPascalParser.g:1882:4: rule__Simple_type__Subrange_typeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_type__Subrange_typeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_typeAccess().getSubrange_typeAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_type__Alternatives"


    // $ANTLR start "rule__Unpacked_structured_type__Alternatives"
    // InternalPascalParser.g:1890:1: rule__Unpacked_structured_type__Alternatives : ( ( ( rule__Unpacked_structured_type__Static_arrayAssignment_0 ) ) | ( ( rule__Unpacked_structured_type__DynamicAssignment_1 ) ) );
    public final void rule__Unpacked_structured_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1894:1: ( ( ( rule__Unpacked_structured_type__Static_arrayAssignment_0 ) ) | ( ( rule__Unpacked_structured_type__DynamicAssignment_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Array) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==LeftSquareBracket) ) {
                    alt11=1;
                }
                else if ( (LA11_1==Of) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPascalParser.g:1895:2: ( ( rule__Unpacked_structured_type__Static_arrayAssignment_0 ) )
                    {
                    // InternalPascalParser.g:1895:2: ( ( rule__Unpacked_structured_type__Static_arrayAssignment_0 ) )
                    // InternalPascalParser.g:1896:3: ( rule__Unpacked_structured_type__Static_arrayAssignment_0 )
                    {
                     before(grammarAccess.getUnpacked_structured_typeAccess().getStatic_arrayAssignment_0()); 
                    // InternalPascalParser.g:1897:3: ( rule__Unpacked_structured_type__Static_arrayAssignment_0 )
                    // InternalPascalParser.g:1897:4: rule__Unpacked_structured_type__Static_arrayAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unpacked_structured_type__Static_arrayAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnpacked_structured_typeAccess().getStatic_arrayAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1901:2: ( ( rule__Unpacked_structured_type__DynamicAssignment_1 ) )
                    {
                    // InternalPascalParser.g:1901:2: ( ( rule__Unpacked_structured_type__DynamicAssignment_1 ) )
                    // InternalPascalParser.g:1902:3: ( rule__Unpacked_structured_type__DynamicAssignment_1 )
                    {
                     before(grammarAccess.getUnpacked_structured_typeAccess().getDynamicAssignment_1()); 
                    // InternalPascalParser.g:1903:3: ( rule__Unpacked_structured_type__DynamicAssignment_1 )
                    // InternalPascalParser.g:1903:4: rule__Unpacked_structured_type__DynamicAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unpacked_structured_type__DynamicAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnpacked_structured_typeAccess().getDynamicAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_structured_type__Alternatives"


    // $ANTLR start "rule__Type_identifier__Alternatives"
    // InternalPascalParser.g:1911:1: rule__Type_identifier__Alternatives : ( ( ( rule__Type_identifier__IdAssignment_0 ) ) | ( ( rule__Type_identifier__Alternatives_1 ) ) );
    public final void rule__Type_identifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1915:1: ( ( ( rule__Type_identifier__IdAssignment_0 ) ) | ( ( rule__Type_identifier__Alternatives_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=Boolean && LA12_0<=Integer)||LA12_0==String) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPascalParser.g:1916:2: ( ( rule__Type_identifier__IdAssignment_0 ) )
                    {
                    // InternalPascalParser.g:1916:2: ( ( rule__Type_identifier__IdAssignment_0 ) )
                    // InternalPascalParser.g:1917:3: ( rule__Type_identifier__IdAssignment_0 )
                    {
                     before(grammarAccess.getType_identifierAccess().getIdAssignment_0()); 
                    // InternalPascalParser.g:1918:3: ( rule__Type_identifier__IdAssignment_0 )
                    // InternalPascalParser.g:1918:4: rule__Type_identifier__IdAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type_identifier__IdAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getType_identifierAccess().getIdAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1922:2: ( ( rule__Type_identifier__Alternatives_1 ) )
                    {
                    // InternalPascalParser.g:1922:2: ( ( rule__Type_identifier__Alternatives_1 ) )
                    // InternalPascalParser.g:1923:3: ( rule__Type_identifier__Alternatives_1 )
                    {
                     before(grammarAccess.getType_identifierAccess().getAlternatives_1()); 
                    // InternalPascalParser.g:1924:3: ( rule__Type_identifier__Alternatives_1 )
                    // InternalPascalParser.g:1924:4: rule__Type_identifier__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type_identifier__Alternatives_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getType_identifierAccess().getAlternatives_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_identifier__Alternatives"


    // $ANTLR start "rule__Type_identifier__Alternatives_1"
    // InternalPascalParser.g:1932:1: rule__Type_identifier__Alternatives_1 : ( ( ( rule__Type_identifier__BooleanAssignment_1_0 ) ) | ( ( rule__Type_identifier__IntegerAssignment_1_1 ) ) | ( ( rule__Type_identifier__StringAssignment_1_2 ) ) );
    public final void rule__Type_identifier__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1936:1: ( ( ( rule__Type_identifier__BooleanAssignment_1_0 ) ) | ( ( rule__Type_identifier__IntegerAssignment_1_1 ) ) | ( ( rule__Type_identifier__StringAssignment_1_2 ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case Boolean:
                {
                alt13=1;
                }
                break;
            case Integer:
                {
                alt13=2;
                }
                break;
            case String:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalPascalParser.g:1937:2: ( ( rule__Type_identifier__BooleanAssignment_1_0 ) )
                    {
                    // InternalPascalParser.g:1937:2: ( ( rule__Type_identifier__BooleanAssignment_1_0 ) )
                    // InternalPascalParser.g:1938:3: ( rule__Type_identifier__BooleanAssignment_1_0 )
                    {
                     before(grammarAccess.getType_identifierAccess().getBooleanAssignment_1_0()); 
                    // InternalPascalParser.g:1939:3: ( rule__Type_identifier__BooleanAssignment_1_0 )
                    // InternalPascalParser.g:1939:4: rule__Type_identifier__BooleanAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type_identifier__BooleanAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getType_identifierAccess().getBooleanAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1943:2: ( ( rule__Type_identifier__IntegerAssignment_1_1 ) )
                    {
                    // InternalPascalParser.g:1943:2: ( ( rule__Type_identifier__IntegerAssignment_1_1 ) )
                    // InternalPascalParser.g:1944:3: ( rule__Type_identifier__IntegerAssignment_1_1 )
                    {
                     before(grammarAccess.getType_identifierAccess().getIntegerAssignment_1_1()); 
                    // InternalPascalParser.g:1945:3: ( rule__Type_identifier__IntegerAssignment_1_1 )
                    // InternalPascalParser.g:1945:4: rule__Type_identifier__IntegerAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type_identifier__IntegerAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getType_identifierAccess().getIntegerAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascalParser.g:1949:2: ( ( rule__Type_identifier__StringAssignment_1_2 ) )
                    {
                    // InternalPascalParser.g:1949:2: ( ( rule__Type_identifier__StringAssignment_1_2 ) )
                    // InternalPascalParser.g:1950:3: ( rule__Type_identifier__StringAssignment_1_2 )
                    {
                     before(grammarAccess.getType_identifierAccess().getStringAssignment_1_2()); 
                    // InternalPascalParser.g:1951:3: ( rule__Type_identifier__StringAssignment_1_2 )
                    // InternalPascalParser.g:1951:4: rule__Type_identifier__StringAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type_identifier__StringAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getType_identifierAccess().getStringAssignment_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_identifier__Alternatives_1"


    // $ANTLR start "rule__Unsigned_constant__Alternatives"
    // InternalPascalParser.g:1959:1: rule__Unsigned_constant__Alternatives : ( ( ( rule__Unsigned_constant__NumberAssignment_0 ) ) | ( ( rule__Unsigned_constant__StringAssignment_1 ) ) | ( ( rule__Unsigned_constant__NilAssignment_2 ) ) );
    public final void rule__Unsigned_constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1963:1: ( ( ( rule__Unsigned_constant__NumberAssignment_0 ) ) | ( ( rule__Unsigned_constant__StringAssignment_1 ) ) | ( ( rule__Unsigned_constant__NilAssignment_2 ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_NUM_INT:
                {
                alt14=1;
                }
                break;
            case RULE_STRING:
                {
                alt14=2;
                }
                break;
            case RULE_NIL:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalPascalParser.g:1964:2: ( ( rule__Unsigned_constant__NumberAssignment_0 ) )
                    {
                    // InternalPascalParser.g:1964:2: ( ( rule__Unsigned_constant__NumberAssignment_0 ) )
                    // InternalPascalParser.g:1965:3: ( rule__Unsigned_constant__NumberAssignment_0 )
                    {
                     before(grammarAccess.getUnsigned_constantAccess().getNumberAssignment_0()); 
                    // InternalPascalParser.g:1966:3: ( rule__Unsigned_constant__NumberAssignment_0 )
                    // InternalPascalParser.g:1966:4: rule__Unsigned_constant__NumberAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unsigned_constant__NumberAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnsigned_constantAccess().getNumberAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1970:2: ( ( rule__Unsigned_constant__StringAssignment_1 ) )
                    {
                    // InternalPascalParser.g:1970:2: ( ( rule__Unsigned_constant__StringAssignment_1 ) )
                    // InternalPascalParser.g:1971:3: ( rule__Unsigned_constant__StringAssignment_1 )
                    {
                     before(grammarAccess.getUnsigned_constantAccess().getStringAssignment_1()); 
                    // InternalPascalParser.g:1972:3: ( rule__Unsigned_constant__StringAssignment_1 )
                    // InternalPascalParser.g:1972:4: rule__Unsigned_constant__StringAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unsigned_constant__StringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnsigned_constantAccess().getStringAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascalParser.g:1976:2: ( ( rule__Unsigned_constant__NilAssignment_2 ) )
                    {
                    // InternalPascalParser.g:1976:2: ( ( rule__Unsigned_constant__NilAssignment_2 ) )
                    // InternalPascalParser.g:1977:3: ( rule__Unsigned_constant__NilAssignment_2 )
                    {
                     before(grammarAccess.getUnsigned_constantAccess().getNilAssignment_2()); 
                    // InternalPascalParser.g:1978:3: ( rule__Unsigned_constant__NilAssignment_2 )
                    // InternalPascalParser.g:1978:4: rule__Unsigned_constant__NilAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unsigned_constant__NilAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnsigned_constantAccess().getNilAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unsigned_constant__Alternatives"


    // $ANTLR start "rule__Structured_statement__Alternatives"
    // InternalPascalParser.g:1986:1: rule__Structured_statement__Alternatives : ( ( ( rule__Structured_statement__Compound_statAssignment_0 ) ) | ( ( rule__Structured_statement__Conditional_statAssignment_1 ) ) );
    public final void rule__Structured_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:1990:1: ( ( ( rule__Structured_statement__Compound_statAssignment_0 ) ) | ( ( rule__Structured_statement__Conditional_statAssignment_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Begin) ) {
                alt15=1;
            }
            else if ( (LA15_0==Case) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalPascalParser.g:1991:2: ( ( rule__Structured_statement__Compound_statAssignment_0 ) )
                    {
                    // InternalPascalParser.g:1991:2: ( ( rule__Structured_statement__Compound_statAssignment_0 ) )
                    // InternalPascalParser.g:1992:3: ( rule__Structured_statement__Compound_statAssignment_0 )
                    {
                     before(grammarAccess.getStructured_statementAccess().getCompound_statAssignment_0()); 
                    // InternalPascalParser.g:1993:3: ( rule__Structured_statement__Compound_statAssignment_0 )
                    // InternalPascalParser.g:1993:4: rule__Structured_statement__Compound_statAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Structured_statement__Compound_statAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStructured_statementAccess().getCompound_statAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1997:2: ( ( rule__Structured_statement__Conditional_statAssignment_1 ) )
                    {
                    // InternalPascalParser.g:1997:2: ( ( rule__Structured_statement__Conditional_statAssignment_1 ) )
                    // InternalPascalParser.g:1998:3: ( rule__Structured_statement__Conditional_statAssignment_1 )
                    {
                     before(grammarAccess.getStructured_statementAccess().getConditional_statAssignment_1()); 
                    // InternalPascalParser.g:1999:3: ( rule__Structured_statement__Conditional_statAssignment_1 )
                    // InternalPascalParser.g:1999:4: rule__Structured_statement__Conditional_statAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Structured_statement__Conditional_statAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStructured_statementAccess().getConditional_statAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_statement__Alternatives"


    // $ANTLR start "rule__Additive_operator__Alternatives"
    // InternalPascalParser.g:2007:1: rule__Additive_operator__Alternatives : ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_OR ) );
    public final void rule__Additive_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2011:1: ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_OR ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt16=1;
                }
                break;
            case RULE_MINUS:
                {
                alt16=2;
                }
                break;
            case RULE_OR:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalPascalParser.g:2012:2: ( RULE_PLUS )
                    {
                    // InternalPascalParser.g:2012:2: ( RULE_PLUS )
                    // InternalPascalParser.g:2013:3: RULE_PLUS
                    {
                     before(grammarAccess.getAdditive_operatorAccess().getPLUSTerminalRuleCall_0()); 
                    match(input,RULE_PLUS,FOLLOW_2); 
                     after(grammarAccess.getAdditive_operatorAccess().getPLUSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:2018:2: ( RULE_MINUS )
                    {
                    // InternalPascalParser.g:2018:2: ( RULE_MINUS )
                    // InternalPascalParser.g:2019:3: RULE_MINUS
                    {
                     before(grammarAccess.getAdditive_operatorAccess().getMINUSTerminalRuleCall_1()); 
                    match(input,RULE_MINUS,FOLLOW_2); 
                     after(grammarAccess.getAdditive_operatorAccess().getMINUSTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascalParser.g:2024:2: ( RULE_OR )
                    {
                    // InternalPascalParser.g:2024:2: ( RULE_OR )
                    // InternalPascalParser.g:2025:3: RULE_OR
                    {
                     before(grammarAccess.getAdditive_operatorAccess().getORTerminalRuleCall_2()); 
                    match(input,RULE_OR,FOLLOW_2); 
                     after(grammarAccess.getAdditive_operatorAccess().getORTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Additive_operator__Alternatives"


    // $ANTLR start "rule__Multiplicative_operator__Alternatives"
    // InternalPascalParser.g:2034:1: rule__Multiplicative_operator__Alternatives : ( ( RULE_STAR ) | ( RULE_SLASH ) | ( RULE_DIV ) | ( RULE_MOD ) | ( RULE_AND ) );
    public final void rule__Multiplicative_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2038:1: ( ( RULE_STAR ) | ( RULE_SLASH ) | ( RULE_DIV ) | ( RULE_MOD ) | ( RULE_AND ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case RULE_STAR:
                {
                alt17=1;
                }
                break;
            case RULE_SLASH:
                {
                alt17=2;
                }
                break;
            case RULE_DIV:
                {
                alt17=3;
                }
                break;
            case RULE_MOD:
                {
                alt17=4;
                }
                break;
            case RULE_AND:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalPascalParser.g:2039:2: ( RULE_STAR )
                    {
                    // InternalPascalParser.g:2039:2: ( RULE_STAR )
                    // InternalPascalParser.g:2040:3: RULE_STAR
                    {
                     before(grammarAccess.getMultiplicative_operatorAccess().getSTARTerminalRuleCall_0()); 
                    match(input,RULE_STAR,FOLLOW_2); 
                     after(grammarAccess.getMultiplicative_operatorAccess().getSTARTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:2045:2: ( RULE_SLASH )
                    {
                    // InternalPascalParser.g:2045:2: ( RULE_SLASH )
                    // InternalPascalParser.g:2046:3: RULE_SLASH
                    {
                     before(grammarAccess.getMultiplicative_operatorAccess().getSLASHTerminalRuleCall_1()); 
                    match(input,RULE_SLASH,FOLLOW_2); 
                     after(grammarAccess.getMultiplicative_operatorAccess().getSLASHTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascalParser.g:2051:2: ( RULE_DIV )
                    {
                    // InternalPascalParser.g:2051:2: ( RULE_DIV )
                    // InternalPascalParser.g:2052:3: RULE_DIV
                    {
                     before(grammarAccess.getMultiplicative_operatorAccess().getDIVTerminalRuleCall_2()); 
                    match(input,RULE_DIV,FOLLOW_2); 
                     after(grammarAccess.getMultiplicative_operatorAccess().getDIVTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascalParser.g:2057:2: ( RULE_MOD )
                    {
                    // InternalPascalParser.g:2057:2: ( RULE_MOD )
                    // InternalPascalParser.g:2058:3: RULE_MOD
                    {
                     before(grammarAccess.getMultiplicative_operatorAccess().getMODTerminalRuleCall_3()); 
                    match(input,RULE_MOD,FOLLOW_2); 
                     after(grammarAccess.getMultiplicative_operatorAccess().getMODTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPascalParser.g:2063:2: ( RULE_AND )
                    {
                    // InternalPascalParser.g:2063:2: ( RULE_AND )
                    // InternalPascalParser.g:2064:3: RULE_AND
                    {
                     before(grammarAccess.getMultiplicative_operatorAccess().getANDTerminalRuleCall_4()); 
                    match(input,RULE_AND,FOLLOW_2); 
                     after(grammarAccess.getMultiplicative_operatorAccess().getANDTerminalRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicative_operator__Alternatives"


    // $ANTLR start "rule__Procedure_or_function_declaration__Alternatives"
    // InternalPascalParser.g:2073:1: rule__Procedure_or_function_declaration__Alternatives : ( ( ( rule__Procedure_or_function_declaration__ProcAssignment_0 ) ) | ( ( rule__Procedure_or_function_declaration__FuncAssignment_1 ) ) );
    public final void rule__Procedure_or_function_declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2077:1: ( ( ( rule__Procedure_or_function_declaration__ProcAssignment_0 ) ) | ( ( rule__Procedure_or_function_declaration__FuncAssignment_1 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Procedure) ) {
                alt18=1;
            }
            else if ( (LA18_0==Function) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalPascalParser.g:2078:2: ( ( rule__Procedure_or_function_declaration__ProcAssignment_0 ) )
                    {
                    // InternalPascalParser.g:2078:2: ( ( rule__Procedure_or_function_declaration__ProcAssignment_0 ) )
                    // InternalPascalParser.g:2079:3: ( rule__Procedure_or_function_declaration__ProcAssignment_0 )
                    {
                     before(grammarAccess.getProcedure_or_function_declarationAccess().getProcAssignment_0()); 
                    // InternalPascalParser.g:2080:3: ( rule__Procedure_or_function_declaration__ProcAssignment_0 )
                    // InternalPascalParser.g:2080:4: rule__Procedure_or_function_declaration__ProcAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Procedure_or_function_declaration__ProcAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProcedure_or_function_declarationAccess().getProcAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:2084:2: ( ( rule__Procedure_or_function_declaration__FuncAssignment_1 ) )
                    {
                    // InternalPascalParser.g:2084:2: ( ( rule__Procedure_or_function_declaration__FuncAssignment_1 ) )
                    // InternalPascalParser.g:2085:3: ( rule__Procedure_or_function_declaration__FuncAssignment_1 )
                    {
                     before(grammarAccess.getProcedure_or_function_declarationAccess().getFuncAssignment_1()); 
                    // InternalPascalParser.g:2086:3: ( rule__Procedure_or_function_declaration__FuncAssignment_1 )
                    // InternalPascalParser.g:2086:4: rule__Procedure_or_function_declaration__FuncAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Procedure_or_function_declaration__FuncAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProcedure_or_function_declarationAccess().getFuncAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_or_function_declaration__Alternatives"


    // $ANTLR start "rule__Formal_parameter_section__Alternatives"
    // InternalPascalParser.g:2094:1: rule__Formal_parameter_section__Alternatives : ( ( ( rule__Formal_parameter_section__ParametersAssignment_0 ) ) | ( ( rule__Formal_parameter_section__Group_1__0 ) ) | ( ( rule__Formal_parameter_section__Group_2__0 ) ) | ( ( rule__Formal_parameter_section__Group_3__0 ) ) );
    public final void rule__Formal_parameter_section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2098:1: ( ( ( rule__Formal_parameter_section__ParametersAssignment_0 ) ) | ( ( rule__Formal_parameter_section__Group_1__0 ) ) | ( ( rule__Formal_parameter_section__Group_2__0 ) ) | ( ( rule__Formal_parameter_section__Group_3__0 ) ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt19=1;
                }
                break;
            case Var:
                {
                alt19=2;
                }
                break;
            case Function:
                {
                alt19=3;
                }
                break;
            case Procedure:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalPascalParser.g:2099:2: ( ( rule__Formal_parameter_section__ParametersAssignment_0 ) )
                    {
                    // InternalPascalParser.g:2099:2: ( ( rule__Formal_parameter_section__ParametersAssignment_0 ) )
                    // InternalPascalParser.g:2100:3: ( rule__Formal_parameter_section__ParametersAssignment_0 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getParametersAssignment_0()); 
                    // InternalPascalParser.g:2101:3: ( rule__Formal_parameter_section__ParametersAssignment_0 )
                    // InternalPascalParser.g:2101:4: rule__Formal_parameter_section__ParametersAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formal_parameter_section__ParametersAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormal_parameter_sectionAccess().getParametersAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:2105:2: ( ( rule__Formal_parameter_section__Group_1__0 ) )
                    {
                    // InternalPascalParser.g:2105:2: ( ( rule__Formal_parameter_section__Group_1__0 ) )
                    // InternalPascalParser.g:2106:3: ( rule__Formal_parameter_section__Group_1__0 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getGroup_1()); 
                    // InternalPascalParser.g:2107:3: ( rule__Formal_parameter_section__Group_1__0 )
                    // InternalPascalParser.g:2107:4: rule__Formal_parameter_section__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formal_parameter_section__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormal_parameter_sectionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascalParser.g:2111:2: ( ( rule__Formal_parameter_section__Group_2__0 ) )
                    {
                    // InternalPascalParser.g:2111:2: ( ( rule__Formal_parameter_section__Group_2__0 ) )
                    // InternalPascalParser.g:2112:3: ( rule__Formal_parameter_section__Group_2__0 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getGroup_2()); 
                    // InternalPascalParser.g:2113:3: ( rule__Formal_parameter_section__Group_2__0 )
                    // InternalPascalParser.g:2113:4: rule__Formal_parameter_section__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formal_parameter_section__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormal_parameter_sectionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascalParser.g:2117:2: ( ( rule__Formal_parameter_section__Group_3__0 ) )
                    {
                    // InternalPascalParser.g:2117:2: ( ( rule__Formal_parameter_section__Group_3__0 ) )
                    // InternalPascalParser.g:2118:3: ( rule__Formal_parameter_section__Group_3__0 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getGroup_3()); 
                    // InternalPascalParser.g:2119:3: ( rule__Formal_parameter_section__Group_3__0 )
                    // InternalPascalParser.g:2119:4: rule__Formal_parameter_section__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formal_parameter_section__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormal_parameter_sectionAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__Alternatives"


    // $ANTLR start "rule__Bool__Alternatives"
    // InternalPascalParser.g:2127:1: rule__Bool__Alternatives : ( ( True ) | ( False ) );
    public final void rule__Bool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2131:1: ( ( True ) | ( False ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==True) ) {
                alt20=1;
            }
            else if ( (LA20_0==False) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalPascalParser.g:2132:2: ( True )
                    {
                    // InternalPascalParser.g:2132:2: ( True )
                    // InternalPascalParser.g:2133:3: True
                    {
                     before(grammarAccess.getBoolAccess().getTrueKeyword_0()); 
                    match(input,True,FOLLOW_2); 
                     after(grammarAccess.getBoolAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:2138:2: ( False )
                    {
                    // InternalPascalParser.g:2138:2: ( False )
                    // InternalPascalParser.g:2139:3: False
                    {
                     before(grammarAccess.getBoolAccess().getFalseKeyword_1()); 
                    match(input,False,FOLLOW_2); 
                     after(grammarAccess.getBoolAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Alternatives"


    // $ANTLR start "rule__Sign__Alternatives"
    // InternalPascalParser.g:2148:1: rule__Sign__Alternatives : ( ( RULE_PLUS ) | ( RULE_MINUS ) );
    public final void rule__Sign__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2152:1: ( ( RULE_PLUS ) | ( RULE_MINUS ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_PLUS) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_MINUS) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPascalParser.g:2153:2: ( RULE_PLUS )
                    {
                    // InternalPascalParser.g:2153:2: ( RULE_PLUS )
                    // InternalPascalParser.g:2154:3: RULE_PLUS
                    {
                     before(grammarAccess.getSignAccess().getPLUSTerminalRuleCall_0()); 
                    match(input,RULE_PLUS,FOLLOW_2); 
                     after(grammarAccess.getSignAccess().getPLUSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:2159:2: ( RULE_MINUS )
                    {
                    // InternalPascalParser.g:2159:2: ( RULE_MINUS )
                    // InternalPascalParser.g:2160:3: RULE_MINUS
                    {
                     before(grammarAccess.getSignAccess().getMINUSTerminalRuleCall_1()); 
                    match(input,RULE_MINUS,FOLLOW_2); 
                     after(grammarAccess.getSignAccess().getMINUSTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sign__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalPascalParser.g:2169:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2173:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPascalParser.g:2174:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalPascalParser.g:2181:1: rule__Program__Group__0__Impl : ( ( rule__Program__HeadingAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2185:1: ( ( ( rule__Program__HeadingAssignment_0 ) ) )
            // InternalPascalParser.g:2186:1: ( ( rule__Program__HeadingAssignment_0 ) )
            {
            // InternalPascalParser.g:2186:1: ( ( rule__Program__HeadingAssignment_0 ) )
            // InternalPascalParser.g:2187:2: ( rule__Program__HeadingAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getHeadingAssignment_0()); 
            // InternalPascalParser.g:2188:2: ( rule__Program__HeadingAssignment_0 )
            // InternalPascalParser.g:2188:3: rule__Program__HeadingAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__HeadingAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getHeadingAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalPascalParser.g:2196:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2200:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPascalParser.g:2201:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalPascalParser.g:2208:1: rule__Program__Group__1__Impl : ( ( rule__Program__BlockAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2212:1: ( ( ( rule__Program__BlockAssignment_1 ) ) )
            // InternalPascalParser.g:2213:1: ( ( rule__Program__BlockAssignment_1 ) )
            {
            // InternalPascalParser.g:2213:1: ( ( rule__Program__BlockAssignment_1 ) )
            // InternalPascalParser.g:2214:2: ( rule__Program__BlockAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getBlockAssignment_1()); 
            // InternalPascalParser.g:2215:2: ( rule__Program__BlockAssignment_1 )
            // InternalPascalParser.g:2215:3: rule__Program__BlockAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__BlockAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getBlockAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalPascalParser.g:2223:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2227:1: ( rule__Program__Group__2__Impl )
            // InternalPascalParser.g:2228:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalPascalParser.g:2234:1: rule__Program__Group__2__Impl : ( FullStop ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2238:1: ( ( FullStop ) )
            // InternalPascalParser.g:2239:1: ( FullStop )
            {
            // InternalPascalParser.g:2239:1: ( FullStop )
            // InternalPascalParser.g:2240:2: FullStop
            {
             before(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program_heading_block__Group__0"
    // InternalPascalParser.g:2250:1: rule__Program_heading_block__Group__0 : rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 ;
    public final void rule__Program_heading_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2254:1: ( rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 )
            // InternalPascalParser.g:2255:2: rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Program_heading_block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group__0"


    // $ANTLR start "rule__Program_heading_block__Group__0__Impl"
    // InternalPascalParser.g:2262:1: rule__Program_heading_block__Group__0__Impl : ( Program ) ;
    public final void rule__Program_heading_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2266:1: ( ( Program ) )
            // InternalPascalParser.g:2267:1: ( Program )
            {
            // InternalPascalParser.g:2267:1: ( Program )
            // InternalPascalParser.g:2268:2: Program
            {
             before(grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 
            match(input,Program,FOLLOW_2); 
             after(grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group__0__Impl"


    // $ANTLR start "rule__Program_heading_block__Group__1"
    // InternalPascalParser.g:2277:1: rule__Program_heading_block__Group__1 : rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 ;
    public final void rule__Program_heading_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2281:1: ( rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 )
            // InternalPascalParser.g:2282:2: rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Program_heading_block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group__1"


    // $ANTLR start "rule__Program_heading_block__Group__1__Impl"
    // InternalPascalParser.g:2289:1: rule__Program_heading_block__Group__1__Impl : ( ( rule__Program_heading_block__NameAssignment_1 ) ) ;
    public final void rule__Program_heading_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2293:1: ( ( ( rule__Program_heading_block__NameAssignment_1 ) ) )
            // InternalPascalParser.g:2294:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            {
            // InternalPascalParser.g:2294:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            // InternalPascalParser.g:2295:2: ( rule__Program_heading_block__NameAssignment_1 )
            {
             before(grammarAccess.getProgram_heading_blockAccess().getNameAssignment_1()); 
            // InternalPascalParser.g:2296:2: ( rule__Program_heading_block__NameAssignment_1 )
            // InternalPascalParser.g:2296:3: rule__Program_heading_block__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgram_heading_blockAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group__1__Impl"


    // $ANTLR start "rule__Program_heading_block__Group__2"
    // InternalPascalParser.g:2304:1: rule__Program_heading_block__Group__2 : rule__Program_heading_block__Group__2__Impl ;
    public final void rule__Program_heading_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2308:1: ( rule__Program_heading_block__Group__2__Impl )
            // InternalPascalParser.g:2309:2: rule__Program_heading_block__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group__2"


    // $ANTLR start "rule__Program_heading_block__Group__2__Impl"
    // InternalPascalParser.g:2315:1: rule__Program_heading_block__Group__2__Impl : ( Semicolon ) ;
    public final void rule__Program_heading_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2319:1: ( ( Semicolon ) )
            // InternalPascalParser.g:2320:1: ( Semicolon )
            {
            // InternalPascalParser.g:2320:1: ( Semicolon )
            // InternalPascalParser.g:2321:2: Semicolon
            {
             before(grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_2()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group__2__Impl"


    // $ANTLR start "rule__Identifier_list__Group__0"
    // InternalPascalParser.g:2331:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2335:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // InternalPascalParser.g:2336:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Identifier_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group__0"


    // $ANTLR start "rule__Identifier_list__Group__0__Impl"
    // InternalPascalParser.g:2343:1: rule__Identifier_list__Group__0__Impl : ( ( rule__Identifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2347:1: ( ( ( rule__Identifier_list__NamesAssignment_0 ) ) )
            // InternalPascalParser.g:2348:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            {
            // InternalPascalParser.g:2348:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            // InternalPascalParser.g:2349:2: ( rule__Identifier_list__NamesAssignment_0 )
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_0()); 
            // InternalPascalParser.g:2350:2: ( rule__Identifier_list__NamesAssignment_0 )
            // InternalPascalParser.g:2350:3: rule__Identifier_list__NamesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__NamesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIdentifier_listAccess().getNamesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group__0__Impl"


    // $ANTLR start "rule__Identifier_list__Group__1"
    // InternalPascalParser.g:2358:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2362:1: ( rule__Identifier_list__Group__1__Impl )
            // InternalPascalParser.g:2363:2: rule__Identifier_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group__1"


    // $ANTLR start "rule__Identifier_list__Group__1__Impl"
    // InternalPascalParser.g:2369:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2373:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // InternalPascalParser.g:2374:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // InternalPascalParser.g:2374:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // InternalPascalParser.g:2375:2: ( rule__Identifier_list__Group_1__0 )*
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            // InternalPascalParser.g:2376:2: ( rule__Identifier_list__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Comma) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPascalParser.g:2376:3: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getIdentifier_listAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group__1__Impl"


    // $ANTLR start "rule__Identifier_list__Group_1__0"
    // InternalPascalParser.g:2385:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2389:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // InternalPascalParser.g:2390:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Identifier_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group_1__0"


    // $ANTLR start "rule__Identifier_list__Group_1__0__Impl"
    // InternalPascalParser.g:2397:1: rule__Identifier_list__Group_1__0__Impl : ( Comma ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2401:1: ( ( Comma ) )
            // InternalPascalParser.g:2402:1: ( Comma )
            {
            // InternalPascalParser.g:2402:1: ( Comma )
            // InternalPascalParser.g:2403:2: Comma
            {
             before(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group_1__0__Impl"


    // $ANTLR start "rule__Identifier_list__Group_1__1"
    // InternalPascalParser.g:2412:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2416:1: ( rule__Identifier_list__Group_1__1__Impl )
            // InternalPascalParser.g:2417:2: rule__Identifier_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group_1__1"


    // $ANTLR start "rule__Identifier_list__Group_1__1__Impl"
    // InternalPascalParser.g:2423:1: rule__Identifier_list__Group_1__1__Impl : ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2427:1: ( ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascalParser.g:2428:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascalParser.g:2428:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            // InternalPascalParser.g:2429:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_1_1()); 
            // InternalPascalParser.g:2430:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            // InternalPascalParser.g:2430:3: rule__Identifier_list__NamesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__NamesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIdentifier_listAccess().getNamesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group_1__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalPascalParser.g:2439:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2443:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalPascalParser.g:2444:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalPascalParser.g:2451:1: rule__Block__Group__0__Impl : ( ( rule__Block__Alternatives_0 )* ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2455:1: ( ( ( rule__Block__Alternatives_0 )* ) )
            // InternalPascalParser.g:2456:1: ( ( rule__Block__Alternatives_0 )* )
            {
            // InternalPascalParser.g:2456:1: ( ( rule__Block__Alternatives_0 )* )
            // InternalPascalParser.g:2457:2: ( rule__Block__Alternatives_0 )*
            {
             before(grammarAccess.getBlockAccess().getAlternatives_0()); 
            // InternalPascalParser.g:2458:2: ( rule__Block__Alternatives_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=Procedure && LA23_0<=Function)||LA23_0==Const||LA23_0==Type||LA23_0==Var) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPascalParser.g:2458:3: rule__Block__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Block__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalPascalParser.g:2466:1: rule__Block__Group__1 : rule__Block__Group__1__Impl ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2470:1: ( rule__Block__Group__1__Impl )
            // InternalPascalParser.g:2471:2: rule__Block__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalPascalParser.g:2477:1: rule__Block__Group__1__Impl : ( ( rule__Block__StatementAssignment_1 ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2481:1: ( ( ( rule__Block__StatementAssignment_1 ) ) )
            // InternalPascalParser.g:2482:1: ( ( rule__Block__StatementAssignment_1 ) )
            {
            // InternalPascalParser.g:2482:1: ( ( rule__Block__StatementAssignment_1 ) )
            // InternalPascalParser.g:2483:2: ( rule__Block__StatementAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getStatementAssignment_1()); 
            // InternalPascalParser.g:2484:2: ( rule__Block__StatementAssignment_1 )
            // InternalPascalParser.g:2484:3: rule__Block__StatementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Block__StatementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getStatementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group__0"
    // InternalPascalParser.g:2493:1: rule__Constant_definition_part__Group__0 : rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 ;
    public final void rule__Constant_definition_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2497:1: ( rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 )
            // InternalPascalParser.g:2498:2: rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Constant_definition_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group__0"


    // $ANTLR start "rule__Constant_definition_part__Group__0__Impl"
    // InternalPascalParser.g:2505:1: rule__Constant_definition_part__Group__0__Impl : ( Const ) ;
    public final void rule__Constant_definition_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2509:1: ( ( Const ) )
            // InternalPascalParser.g:2510:1: ( Const )
            {
            // InternalPascalParser.g:2510:1: ( Const )
            // InternalPascalParser.g:2511:2: Const
            {
             before(grammarAccess.getConstant_definition_partAccess().getConstKeyword_0()); 
            match(input,Const,FOLLOW_2); 
             after(grammarAccess.getConstant_definition_partAccess().getConstKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group__0__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group__1"
    // InternalPascalParser.g:2520:1: rule__Constant_definition_part__Group__1 : rule__Constant_definition_part__Group__1__Impl ;
    public final void rule__Constant_definition_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2524:1: ( rule__Constant_definition_part__Group__1__Impl )
            // InternalPascalParser.g:2525:2: rule__Constant_definition_part__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group__1"


    // $ANTLR start "rule__Constant_definition_part__Group__1__Impl"
    // InternalPascalParser.g:2531:1: rule__Constant_definition_part__Group__1__Impl : ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) ) ;
    public final void rule__Constant_definition_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2535:1: ( ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) ) )
            // InternalPascalParser.g:2536:1: ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) )
            {
            // InternalPascalParser.g:2536:1: ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) )
            // InternalPascalParser.g:2537:2: ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* )
            {
            // InternalPascalParser.g:2537:2: ( ( rule__Constant_definition_part__Group_1__0 ) )
            // InternalPascalParser.g:2538:3: ( rule__Constant_definition_part__Group_1__0 )
            {
             before(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            // InternalPascalParser.g:2539:3: ( rule__Constant_definition_part__Group_1__0 )
            // InternalPascalParser.g:2539:4: rule__Constant_definition_part__Group_1__0
            {
            pushFollow(FOLLOW_10);
            rule__Constant_definition_part__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 

            }

            // InternalPascalParser.g:2542:2: ( ( rule__Constant_definition_part__Group_1__0 )* )
            // InternalPascalParser.g:2543:3: ( rule__Constant_definition_part__Group_1__0 )*
            {
             before(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            // InternalPascalParser.g:2544:3: ( rule__Constant_definition_part__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPascalParser.g:2544:4: rule__Constant_definition_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Constant_definition_part__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group__1__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group_1__0"
    // InternalPascalParser.g:2554:1: rule__Constant_definition_part__Group_1__0 : rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1 ;
    public final void rule__Constant_definition_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2558:1: ( rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1 )
            // InternalPascalParser.g:2559:2: rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Constant_definition_part__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group_1__0"


    // $ANTLR start "rule__Constant_definition_part__Group_1__0__Impl"
    // InternalPascalParser.g:2566:1: rule__Constant_definition_part__Group_1__0__Impl : ( ( rule__Constant_definition_part__ConstantsAssignment_1_0 ) ) ;
    public final void rule__Constant_definition_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2570:1: ( ( ( rule__Constant_definition_part__ConstantsAssignment_1_0 ) ) )
            // InternalPascalParser.g:2571:1: ( ( rule__Constant_definition_part__ConstantsAssignment_1_0 ) )
            {
            // InternalPascalParser.g:2571:1: ( ( rule__Constant_definition_part__ConstantsAssignment_1_0 ) )
            // InternalPascalParser.g:2572:2: ( rule__Constant_definition_part__ConstantsAssignment_1_0 )
            {
             before(grammarAccess.getConstant_definition_partAccess().getConstantsAssignment_1_0()); 
            // InternalPascalParser.g:2573:2: ( rule__Constant_definition_part__ConstantsAssignment_1_0 )
            // InternalPascalParser.g:2573:3: rule__Constant_definition_part__ConstantsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__ConstantsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definition_partAccess().getConstantsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group_1__0__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group_1__1"
    // InternalPascalParser.g:2581:1: rule__Constant_definition_part__Group_1__1 : rule__Constant_definition_part__Group_1__1__Impl ;
    public final void rule__Constant_definition_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2585:1: ( rule__Constant_definition_part__Group_1__1__Impl )
            // InternalPascalParser.g:2586:2: rule__Constant_definition_part__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group_1__1"


    // $ANTLR start "rule__Constant_definition_part__Group_1__1__Impl"
    // InternalPascalParser.g:2592:1: rule__Constant_definition_part__Group_1__1__Impl : ( Semicolon ) ;
    public final void rule__Constant_definition_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2596:1: ( ( Semicolon ) )
            // InternalPascalParser.g:2597:1: ( Semicolon )
            {
            // InternalPascalParser.g:2597:1: ( Semicolon )
            // InternalPascalParser.g:2598:2: Semicolon
            {
             before(grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group_1__1__Impl"


    // $ANTLR start "rule__Constant_definition__Group__0"
    // InternalPascalParser.g:2608:1: rule__Constant_definition__Group__0 : rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 ;
    public final void rule__Constant_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2612:1: ( rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 )
            // InternalPascalParser.g:2613:2: rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Constant_definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant_definition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__Group__0"


    // $ANTLR start "rule__Constant_definition__Group__0__Impl"
    // InternalPascalParser.g:2620:1: rule__Constant_definition__Group__0__Impl : ( ( rule__Constant_definition__NameAssignment_0 ) ) ;
    public final void rule__Constant_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2624:1: ( ( ( rule__Constant_definition__NameAssignment_0 ) ) )
            // InternalPascalParser.g:2625:1: ( ( rule__Constant_definition__NameAssignment_0 ) )
            {
            // InternalPascalParser.g:2625:1: ( ( rule__Constant_definition__NameAssignment_0 ) )
            // InternalPascalParser.g:2626:2: ( rule__Constant_definition__NameAssignment_0 )
            {
             before(grammarAccess.getConstant_definitionAccess().getNameAssignment_0()); 
            // InternalPascalParser.g:2627:2: ( rule__Constant_definition__NameAssignment_0 )
            // InternalPascalParser.g:2627:3: rule__Constant_definition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__Group__0__Impl"


    // $ANTLR start "rule__Constant_definition__Group__1"
    // InternalPascalParser.g:2635:1: rule__Constant_definition__Group__1 : rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 ;
    public final void rule__Constant_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2639:1: ( rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 )
            // InternalPascalParser.g:2640:2: rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Constant_definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant_definition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__Group__1"


    // $ANTLR start "rule__Constant_definition__Group__1__Impl"
    // InternalPascalParser.g:2647:1: rule__Constant_definition__Group__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__Constant_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2651:1: ( ( RULE_EQUAL ) )
            // InternalPascalParser.g:2652:1: ( RULE_EQUAL )
            {
            // InternalPascalParser.g:2652:1: ( RULE_EQUAL )
            // InternalPascalParser.g:2653:2: RULE_EQUAL
            {
             before(grammarAccess.getConstant_definitionAccess().getEQUALTerminalRuleCall_1()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getConstant_definitionAccess().getEQUALTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__Group__1__Impl"


    // $ANTLR start "rule__Constant_definition__Group__2"
    // InternalPascalParser.g:2662:1: rule__Constant_definition__Group__2 : rule__Constant_definition__Group__2__Impl ;
    public final void rule__Constant_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2666:1: ( rule__Constant_definition__Group__2__Impl )
            // InternalPascalParser.g:2667:2: rule__Constant_definition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__Group__2"


    // $ANTLR start "rule__Constant_definition__Group__2__Impl"
    // InternalPascalParser.g:2673:1: rule__Constant_definition__Group__2__Impl : ( ruleconstant ) ;
    public final void rule__Constant_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2677:1: ( ( ruleconstant ) )
            // InternalPascalParser.g:2678:1: ( ruleconstant )
            {
            // InternalPascalParser.g:2678:1: ( ruleconstant )
            // InternalPascalParser.g:2679:2: ruleconstant
            {
             before(grammarAccess.getConstant_definitionAccess().getConstantParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getConstant_definitionAccess().getConstantParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__Group__2__Impl"


    // $ANTLR start "rule__Constant__Group_1__0"
    // InternalPascalParser.g:2689:1: rule__Constant__Group_1__0 : rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 ;
    public final void rule__Constant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2693:1: ( rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 )
            // InternalPascalParser.g:2694:2: rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Constant__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_1__0"


    // $ANTLR start "rule__Constant__Group_1__0__Impl"
    // InternalPascalParser.g:2701:1: rule__Constant__Group_1__0__Impl : ( rulesign ) ;
    public final void rule__Constant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2705:1: ( ( rulesign ) )
            // InternalPascalParser.g:2706:1: ( rulesign )
            {
            // InternalPascalParser.g:2706:1: ( rulesign )
            // InternalPascalParser.g:2707:2: rulesign
            {
             before(grammarAccess.getConstantAccess().getSignParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulesign();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getSignParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_1__0__Impl"


    // $ANTLR start "rule__Constant__Group_1__1"
    // InternalPascalParser.g:2716:1: rule__Constant__Group_1__1 : rule__Constant__Group_1__1__Impl ;
    public final void rule__Constant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2720:1: ( rule__Constant__Group_1__1__Impl )
            // InternalPascalParser.g:2721:2: rule__Constant__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_1__1"


    // $ANTLR start "rule__Constant__Group_1__1__Impl"
    // InternalPascalParser.g:2727:1: rule__Constant__Group_1__1__Impl : ( ( rule__Constant__Sig_numberAssignment_1_1 ) ) ;
    public final void rule__Constant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2731:1: ( ( ( rule__Constant__Sig_numberAssignment_1_1 ) ) )
            // InternalPascalParser.g:2732:1: ( ( rule__Constant__Sig_numberAssignment_1_1 ) )
            {
            // InternalPascalParser.g:2732:1: ( ( rule__Constant__Sig_numberAssignment_1_1 ) )
            // InternalPascalParser.g:2733:2: ( rule__Constant__Sig_numberAssignment_1_1 )
            {
             before(grammarAccess.getConstantAccess().getSig_numberAssignment_1_1()); 
            // InternalPascalParser.g:2734:2: ( rule__Constant__Sig_numberAssignment_1_1 )
            // InternalPascalParser.g:2734:3: rule__Constant__Sig_numberAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Sig_numberAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getSig_numberAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_1__1__Impl"


    // $ANTLR start "rule__Constant__Group_3__0"
    // InternalPascalParser.g:2743:1: rule__Constant__Group_3__0 : rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 ;
    public final void rule__Constant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2747:1: ( rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 )
            // InternalPascalParser.g:2748:2: rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Constant__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_3__0"


    // $ANTLR start "rule__Constant__Group_3__0__Impl"
    // InternalPascalParser.g:2755:1: rule__Constant__Group_3__0__Impl : ( rulesign ) ;
    public final void rule__Constant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2759:1: ( ( rulesign ) )
            // InternalPascalParser.g:2760:1: ( rulesign )
            {
            // InternalPascalParser.g:2760:1: ( rulesign )
            // InternalPascalParser.g:2761:2: rulesign
            {
             before(grammarAccess.getConstantAccess().getSignParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulesign();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getSignParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_3__0__Impl"


    // $ANTLR start "rule__Constant__Group_3__1"
    // InternalPascalParser.g:2770:1: rule__Constant__Group_3__1 : rule__Constant__Group_3__1__Impl ;
    public final void rule__Constant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2774:1: ( rule__Constant__Group_3__1__Impl )
            // InternalPascalParser.g:2775:2: rule__Constant__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_3__1"


    // $ANTLR start "rule__Constant__Group_3__1__Impl"
    // InternalPascalParser.g:2781:1: rule__Constant__Group_3__1__Impl : ( ( rule__Constant__Sig_name_idAssignment_3_1 ) ) ;
    public final void rule__Constant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2785:1: ( ( ( rule__Constant__Sig_name_idAssignment_3_1 ) ) )
            // InternalPascalParser.g:2786:1: ( ( rule__Constant__Sig_name_idAssignment_3_1 ) )
            {
            // InternalPascalParser.g:2786:1: ( ( rule__Constant__Sig_name_idAssignment_3_1 ) )
            // InternalPascalParser.g:2787:2: ( rule__Constant__Sig_name_idAssignment_3_1 )
            {
             before(grammarAccess.getConstantAccess().getSig_name_idAssignment_3_1()); 
            // InternalPascalParser.g:2788:2: ( rule__Constant__Sig_name_idAssignment_3_1 )
            // InternalPascalParser.g:2788:3: rule__Constant__Sig_name_idAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Sig_name_idAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getSig_name_idAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_3__1__Impl"


    // $ANTLR start "rule__Type_definition_part__Group__0"
    // InternalPascalParser.g:2797:1: rule__Type_definition_part__Group__0 : rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1 ;
    public final void rule__Type_definition_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2801:1: ( rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1 )
            // InternalPascalParser.g:2802:2: rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Type_definition_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group__0"


    // $ANTLR start "rule__Type_definition_part__Group__0__Impl"
    // InternalPascalParser.g:2809:1: rule__Type_definition_part__Group__0__Impl : ( Type ) ;
    public final void rule__Type_definition_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2813:1: ( ( Type ) )
            // InternalPascalParser.g:2814:1: ( Type )
            {
            // InternalPascalParser.g:2814:1: ( Type )
            // InternalPascalParser.g:2815:2: Type
            {
             before(grammarAccess.getType_definition_partAccess().getTypeKeyword_0()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getType_definition_partAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group__0__Impl"


    // $ANTLR start "rule__Type_definition_part__Group__1"
    // InternalPascalParser.g:2824:1: rule__Type_definition_part__Group__1 : rule__Type_definition_part__Group__1__Impl ;
    public final void rule__Type_definition_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2828:1: ( rule__Type_definition_part__Group__1__Impl )
            // InternalPascalParser.g:2829:2: rule__Type_definition_part__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group__1"


    // $ANTLR start "rule__Type_definition_part__Group__1__Impl"
    // InternalPascalParser.g:2835:1: rule__Type_definition_part__Group__1__Impl : ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) ) ;
    public final void rule__Type_definition_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2839:1: ( ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) ) )
            // InternalPascalParser.g:2840:1: ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) )
            {
            // InternalPascalParser.g:2840:1: ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) )
            // InternalPascalParser.g:2841:2: ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* )
            {
            // InternalPascalParser.g:2841:2: ( ( rule__Type_definition_part__Group_1__0 ) )
            // InternalPascalParser.g:2842:3: ( rule__Type_definition_part__Group_1__0 )
            {
             before(grammarAccess.getType_definition_partAccess().getGroup_1()); 
            // InternalPascalParser.g:2843:3: ( rule__Type_definition_part__Group_1__0 )
            // InternalPascalParser.g:2843:4: rule__Type_definition_part__Group_1__0
            {
            pushFollow(FOLLOW_10);
            rule__Type_definition_part__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getType_definition_partAccess().getGroup_1()); 

            }

            // InternalPascalParser.g:2846:2: ( ( rule__Type_definition_part__Group_1__0 )* )
            // InternalPascalParser.g:2847:3: ( rule__Type_definition_part__Group_1__0 )*
            {
             before(grammarAccess.getType_definition_partAccess().getGroup_1()); 
            // InternalPascalParser.g:2848:3: ( rule__Type_definition_part__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPascalParser.g:2848:4: rule__Type_definition_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Type_definition_part__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getType_definition_partAccess().getGroup_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group__1__Impl"


    // $ANTLR start "rule__Type_definition_part__Group_1__0"
    // InternalPascalParser.g:2858:1: rule__Type_definition_part__Group_1__0 : rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1 ;
    public final void rule__Type_definition_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2862:1: ( rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1 )
            // InternalPascalParser.g:2863:2: rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Type_definition_part__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group_1__0"


    // $ANTLR start "rule__Type_definition_part__Group_1__0__Impl"
    // InternalPascalParser.g:2870:1: rule__Type_definition_part__Group_1__0__Impl : ( ( rule__Type_definition_part__TypesAssignment_1_0 ) ) ;
    public final void rule__Type_definition_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2874:1: ( ( ( rule__Type_definition_part__TypesAssignment_1_0 ) ) )
            // InternalPascalParser.g:2875:1: ( ( rule__Type_definition_part__TypesAssignment_1_0 ) )
            {
            // InternalPascalParser.g:2875:1: ( ( rule__Type_definition_part__TypesAssignment_1_0 ) )
            // InternalPascalParser.g:2876:2: ( rule__Type_definition_part__TypesAssignment_1_0 )
            {
             before(grammarAccess.getType_definition_partAccess().getTypesAssignment_1_0()); 
            // InternalPascalParser.g:2877:2: ( rule__Type_definition_part__TypesAssignment_1_0 )
            // InternalPascalParser.g:2877:3: rule__Type_definition_part__TypesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition_part__TypesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getType_definition_partAccess().getTypesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group_1__0__Impl"


    // $ANTLR start "rule__Type_definition_part__Group_1__1"
    // InternalPascalParser.g:2885:1: rule__Type_definition_part__Group_1__1 : rule__Type_definition_part__Group_1__1__Impl ;
    public final void rule__Type_definition_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2889:1: ( rule__Type_definition_part__Group_1__1__Impl )
            // InternalPascalParser.g:2890:2: rule__Type_definition_part__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group_1__1"


    // $ANTLR start "rule__Type_definition_part__Group_1__1__Impl"
    // InternalPascalParser.g:2896:1: rule__Type_definition_part__Group_1__1__Impl : ( Semicolon ) ;
    public final void rule__Type_definition_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2900:1: ( ( Semicolon ) )
            // InternalPascalParser.g:2901:1: ( Semicolon )
            {
            // InternalPascalParser.g:2901:1: ( Semicolon )
            // InternalPascalParser.g:2902:2: Semicolon
            {
             before(grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group_1__1__Impl"


    // $ANTLR start "rule__Type_definition__Group__0"
    // InternalPascalParser.g:2912:1: rule__Type_definition__Group__0 : rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1 ;
    public final void rule__Type_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2916:1: ( rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1 )
            // InternalPascalParser.g:2917:2: rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Type_definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_definition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__Group__0"


    // $ANTLR start "rule__Type_definition__Group__0__Impl"
    // InternalPascalParser.g:2924:1: rule__Type_definition__Group__0__Impl : ( ( rule__Type_definition__NameAssignment_0 ) ) ;
    public final void rule__Type_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2928:1: ( ( ( rule__Type_definition__NameAssignment_0 ) ) )
            // InternalPascalParser.g:2929:1: ( ( rule__Type_definition__NameAssignment_0 ) )
            {
            // InternalPascalParser.g:2929:1: ( ( rule__Type_definition__NameAssignment_0 ) )
            // InternalPascalParser.g:2930:2: ( rule__Type_definition__NameAssignment_0 )
            {
             before(grammarAccess.getType_definitionAccess().getNameAssignment_0()); 
            // InternalPascalParser.g:2931:2: ( rule__Type_definition__NameAssignment_0 )
            // InternalPascalParser.g:2931:3: rule__Type_definition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getType_definitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__Group__0__Impl"


    // $ANTLR start "rule__Type_definition__Group__1"
    // InternalPascalParser.g:2939:1: rule__Type_definition__Group__1 : rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2 ;
    public final void rule__Type_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2943:1: ( rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2 )
            // InternalPascalParser.g:2944:2: rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Type_definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_definition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__Group__1"


    // $ANTLR start "rule__Type_definition__Group__1__Impl"
    // InternalPascalParser.g:2951:1: rule__Type_definition__Group__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__Type_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2955:1: ( ( RULE_EQUAL ) )
            // InternalPascalParser.g:2956:1: ( RULE_EQUAL )
            {
            // InternalPascalParser.g:2956:1: ( RULE_EQUAL )
            // InternalPascalParser.g:2957:2: RULE_EQUAL
            {
             before(grammarAccess.getType_definitionAccess().getEQUALTerminalRuleCall_1()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getType_definitionAccess().getEQUALTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__Group__1__Impl"


    // $ANTLR start "rule__Type_definition__Group__2"
    // InternalPascalParser.g:2966:1: rule__Type_definition__Group__2 : rule__Type_definition__Group__2__Impl ;
    public final void rule__Type_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2970:1: ( rule__Type_definition__Group__2__Impl )
            // InternalPascalParser.g:2971:2: rule__Type_definition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__Group__2"


    // $ANTLR start "rule__Type_definition__Group__2__Impl"
    // InternalPascalParser.g:2977:1: rule__Type_definition__Group__2__Impl : ( ( rule__Type_definition__TypeAssignment_2 ) ) ;
    public final void rule__Type_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2981:1: ( ( ( rule__Type_definition__TypeAssignment_2 ) ) )
            // InternalPascalParser.g:2982:1: ( ( rule__Type_definition__TypeAssignment_2 ) )
            {
            // InternalPascalParser.g:2982:1: ( ( rule__Type_definition__TypeAssignment_2 ) )
            // InternalPascalParser.g:2983:2: ( rule__Type_definition__TypeAssignment_2 )
            {
             before(grammarAccess.getType_definitionAccess().getTypeAssignment_2()); 
            // InternalPascalParser.g:2984:2: ( rule__Type_definition__TypeAssignment_2 )
            // InternalPascalParser.g:2984:3: rule__Type_definition__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getType_definitionAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__Group__2__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__0"
    // InternalPascalParser.g:2993:1: rule__Variable_declaration_part__Group__0 : rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 ;
    public final void rule__Variable_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:2997:1: ( rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 )
            // InternalPascalParser.g:2998:2: rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Variable_declaration_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__0"


    // $ANTLR start "rule__Variable_declaration_part__Group__0__Impl"
    // InternalPascalParser.g:3005:1: rule__Variable_declaration_part__Group__0__Impl : ( Var ) ;
    public final void rule__Variable_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3009:1: ( ( Var ) )
            // InternalPascalParser.g:3010:1: ( Var )
            {
            // InternalPascalParser.g:3010:1: ( Var )
            // InternalPascalParser.g:3011:2: Var
            {
             before(grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0()); 
            match(input,Var,FOLLOW_2); 
             after(grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__0__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__1"
    // InternalPascalParser.g:3020:1: rule__Variable_declaration_part__Group__1 : rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 ;
    public final void rule__Variable_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3024:1: ( rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 )
            // InternalPascalParser.g:3025:2: rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Variable_declaration_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__1"


    // $ANTLR start "rule__Variable_declaration_part__Group__1__Impl"
    // InternalPascalParser.g:3032:1: rule__Variable_declaration_part__Group__1__Impl : ( ( rule__Variable_declaration_part__VariableAssignment_1 ) ) ;
    public final void rule__Variable_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3036:1: ( ( ( rule__Variable_declaration_part__VariableAssignment_1 ) ) )
            // InternalPascalParser.g:3037:1: ( ( rule__Variable_declaration_part__VariableAssignment_1 ) )
            {
            // InternalPascalParser.g:3037:1: ( ( rule__Variable_declaration_part__VariableAssignment_1 ) )
            // InternalPascalParser.g:3038:2: ( rule__Variable_declaration_part__VariableAssignment_1 )
            {
             before(grammarAccess.getVariable_declaration_partAccess().getVariableAssignment_1()); 
            // InternalPascalParser.g:3039:2: ( rule__Variable_declaration_part__VariableAssignment_1 )
            // InternalPascalParser.g:3039:3: rule__Variable_declaration_part__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declaration_partAccess().getVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__1__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__2"
    // InternalPascalParser.g:3047:1: rule__Variable_declaration_part__Group__2 : rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 ;
    public final void rule__Variable_declaration_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3051:1: ( rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 )
            // InternalPascalParser.g:3052:2: rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Variable_declaration_part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__2"


    // $ANTLR start "rule__Variable_declaration_part__Group__2__Impl"
    // InternalPascalParser.g:3059:1: rule__Variable_declaration_part__Group__2__Impl : ( ( rule__Variable_declaration_part__Group_2__0 )* ) ;
    public final void rule__Variable_declaration_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3063:1: ( ( ( rule__Variable_declaration_part__Group_2__0 )* ) )
            // InternalPascalParser.g:3064:1: ( ( rule__Variable_declaration_part__Group_2__0 )* )
            {
            // InternalPascalParser.g:3064:1: ( ( rule__Variable_declaration_part__Group_2__0 )* )
            // InternalPascalParser.g:3065:2: ( rule__Variable_declaration_part__Group_2__0 )*
            {
             before(grammarAccess.getVariable_declaration_partAccess().getGroup_2()); 
            // InternalPascalParser.g:3066:2: ( rule__Variable_declaration_part__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Semicolon) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==RULE_ID) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalPascalParser.g:3066:3: rule__Variable_declaration_part__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Variable_declaration_part__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getVariable_declaration_partAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__2__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__3"
    // InternalPascalParser.g:3074:1: rule__Variable_declaration_part__Group__3 : rule__Variable_declaration_part__Group__3__Impl ;
    public final void rule__Variable_declaration_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3078:1: ( rule__Variable_declaration_part__Group__3__Impl )
            // InternalPascalParser.g:3079:2: rule__Variable_declaration_part__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__3"


    // $ANTLR start "rule__Variable_declaration_part__Group__3__Impl"
    // InternalPascalParser.g:3085:1: rule__Variable_declaration_part__Group__3__Impl : ( Semicolon ) ;
    public final void rule__Variable_declaration_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3089:1: ( ( Semicolon ) )
            // InternalPascalParser.g:3090:1: ( Semicolon )
            {
            // InternalPascalParser.g:3090:1: ( Semicolon )
            // InternalPascalParser.g:3091:2: Semicolon
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__3__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group_2__0"
    // InternalPascalParser.g:3101:1: rule__Variable_declaration_part__Group_2__0 : rule__Variable_declaration_part__Group_2__0__Impl rule__Variable_declaration_part__Group_2__1 ;
    public final void rule__Variable_declaration_part__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3105:1: ( rule__Variable_declaration_part__Group_2__0__Impl rule__Variable_declaration_part__Group_2__1 )
            // InternalPascalParser.g:3106:2: rule__Variable_declaration_part__Group_2__0__Impl rule__Variable_declaration_part__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Variable_declaration_part__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group_2__0"


    // $ANTLR start "rule__Variable_declaration_part__Group_2__0__Impl"
    // InternalPascalParser.g:3113:1: rule__Variable_declaration_part__Group_2__0__Impl : ( Semicolon ) ;
    public final void rule__Variable_declaration_part__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3117:1: ( ( Semicolon ) )
            // InternalPascalParser.g:3118:1: ( Semicolon )
            {
            // InternalPascalParser.g:3118:1: ( Semicolon )
            // InternalPascalParser.g:3119:2: Semicolon
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2_0()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group_2__0__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group_2__1"
    // InternalPascalParser.g:3128:1: rule__Variable_declaration_part__Group_2__1 : rule__Variable_declaration_part__Group_2__1__Impl ;
    public final void rule__Variable_declaration_part__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3132:1: ( rule__Variable_declaration_part__Group_2__1__Impl )
            // InternalPascalParser.g:3133:2: rule__Variable_declaration_part__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group_2__1"


    // $ANTLR start "rule__Variable_declaration_part__Group_2__1__Impl"
    // InternalPascalParser.g:3139:1: rule__Variable_declaration_part__Group_2__1__Impl : ( ( rule__Variable_declaration_part__VariableAssignment_2_1 ) ) ;
    public final void rule__Variable_declaration_part__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3143:1: ( ( ( rule__Variable_declaration_part__VariableAssignment_2_1 ) ) )
            // InternalPascalParser.g:3144:1: ( ( rule__Variable_declaration_part__VariableAssignment_2_1 ) )
            {
            // InternalPascalParser.g:3144:1: ( ( rule__Variable_declaration_part__VariableAssignment_2_1 ) )
            // InternalPascalParser.g:3145:2: ( rule__Variable_declaration_part__VariableAssignment_2_1 )
            {
             before(grammarAccess.getVariable_declaration_partAccess().getVariableAssignment_2_1()); 
            // InternalPascalParser.g:3146:2: ( rule__Variable_declaration_part__VariableAssignment_2_1 )
            // InternalPascalParser.g:3146:3: rule__Variable_declaration_part__VariableAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__VariableAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declaration_partAccess().getVariableAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group_2__1__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__0"
    // InternalPascalParser.g:3155:1: rule__Variable_declaration__Group__0 : rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 ;
    public final void rule__Variable_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3159:1: ( rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 )
            // InternalPascalParser.g:3160:2: rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Variable_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__0"


    // $ANTLR start "rule__Variable_declaration__Group__0__Impl"
    // InternalPascalParser.g:3167:1: rule__Variable_declaration__Group__0__Impl : ( ( rule__Variable_declaration__List_namesAssignment_0 ) ) ;
    public final void rule__Variable_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3171:1: ( ( ( rule__Variable_declaration__List_namesAssignment_0 ) ) )
            // InternalPascalParser.g:3172:1: ( ( rule__Variable_declaration__List_namesAssignment_0 ) )
            {
            // InternalPascalParser.g:3172:1: ( ( rule__Variable_declaration__List_namesAssignment_0 ) )
            // InternalPascalParser.g:3173:2: ( rule__Variable_declaration__List_namesAssignment_0 )
            {
             before(grammarAccess.getVariable_declarationAccess().getList_namesAssignment_0()); 
            // InternalPascalParser.g:3174:2: ( rule__Variable_declaration__List_namesAssignment_0 )
            // InternalPascalParser.g:3174:3: rule__Variable_declaration__List_namesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration__List_namesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declarationAccess().getList_namesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__0__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__1"
    // InternalPascalParser.g:3182:1: rule__Variable_declaration__Group__1 : rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 ;
    public final void rule__Variable_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3186:1: ( rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 )
            // InternalPascalParser.g:3187:2: rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Variable_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__1"


    // $ANTLR start "rule__Variable_declaration__Group__1__Impl"
    // InternalPascalParser.g:3194:1: rule__Variable_declaration__Group__1__Impl : ( Colon ) ;
    public final void rule__Variable_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3198:1: ( ( Colon ) )
            // InternalPascalParser.g:3199:1: ( Colon )
            {
            // InternalPascalParser.g:3199:1: ( Colon )
            // InternalPascalParser.g:3200:2: Colon
            {
             before(grammarAccess.getVariable_declarationAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getVariable_declarationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__1__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__2"
    // InternalPascalParser.g:3209:1: rule__Variable_declaration__Group__2 : rule__Variable_declaration__Group__2__Impl ;
    public final void rule__Variable_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3213:1: ( rule__Variable_declaration__Group__2__Impl )
            // InternalPascalParser.g:3214:2: rule__Variable_declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__2"


    // $ANTLR start "rule__Variable_declaration__Group__2__Impl"
    // InternalPascalParser.g:3220:1: rule__Variable_declaration__Group__2__Impl : ( ( rule__Variable_declaration__Type_variableAssignment_2 ) ) ;
    public final void rule__Variable_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3224:1: ( ( ( rule__Variable_declaration__Type_variableAssignment_2 ) ) )
            // InternalPascalParser.g:3225:1: ( ( rule__Variable_declaration__Type_variableAssignment_2 ) )
            {
            // InternalPascalParser.g:3225:1: ( ( rule__Variable_declaration__Type_variableAssignment_2 ) )
            // InternalPascalParser.g:3226:2: ( rule__Variable_declaration__Type_variableAssignment_2 )
            {
             before(grammarAccess.getVariable_declarationAccess().getType_variableAssignment_2()); 
            // InternalPascalParser.g:3227:2: ( rule__Variable_declaration__Type_variableAssignment_2 )
            // InternalPascalParser.g:3227:3: rule__Variable_declaration__Type_variableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration__Type_variableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declarationAccess().getType_variableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__2__Impl"


    // $ANTLR start "rule__Compound_statement__Group__0"
    // InternalPascalParser.g:3236:1: rule__Compound_statement__Group__0 : rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1 ;
    public final void rule__Compound_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3240:1: ( rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1 )
            // InternalPascalParser.g:3241:2: rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Compound_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compound_statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compound_statement__Group__0"


    // $ANTLR start "rule__Compound_statement__Group__0__Impl"
    // InternalPascalParser.g:3248:1: rule__Compound_statement__Group__0__Impl : ( Begin ) ;
    public final void rule__Compound_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3252:1: ( ( Begin ) )
            // InternalPascalParser.g:3253:1: ( Begin )
            {
            // InternalPascalParser.g:3253:1: ( Begin )
            // InternalPascalParser.g:3254:2: Begin
            {
             before(grammarAccess.getCompound_statementAccess().getBeginKeyword_0()); 
            match(input,Begin,FOLLOW_2); 
             after(grammarAccess.getCompound_statementAccess().getBeginKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compound_statement__Group__0__Impl"


    // $ANTLR start "rule__Compound_statement__Group__1"
    // InternalPascalParser.g:3263:1: rule__Compound_statement__Group__1 : rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2 ;
    public final void rule__Compound_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3267:1: ( rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2 )
            // InternalPascalParser.g:3268:2: rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Compound_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compound_statement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compound_statement__Group__1"


    // $ANTLR start "rule__Compound_statement__Group__1__Impl"
    // InternalPascalParser.g:3275:1: rule__Compound_statement__Group__1__Impl : ( ( rule__Compound_statement__SequenceAssignment_1 ) ) ;
    public final void rule__Compound_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3279:1: ( ( ( rule__Compound_statement__SequenceAssignment_1 ) ) )
            // InternalPascalParser.g:3280:1: ( ( rule__Compound_statement__SequenceAssignment_1 ) )
            {
            // InternalPascalParser.g:3280:1: ( ( rule__Compound_statement__SequenceAssignment_1 ) )
            // InternalPascalParser.g:3281:2: ( rule__Compound_statement__SequenceAssignment_1 )
            {
             before(grammarAccess.getCompound_statementAccess().getSequenceAssignment_1()); 
            // InternalPascalParser.g:3282:2: ( rule__Compound_statement__SequenceAssignment_1 )
            // InternalPascalParser.g:3282:3: rule__Compound_statement__SequenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Compound_statement__SequenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompound_statementAccess().getSequenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compound_statement__Group__1__Impl"


    // $ANTLR start "rule__Compound_statement__Group__2"
    // InternalPascalParser.g:3290:1: rule__Compound_statement__Group__2 : rule__Compound_statement__Group__2__Impl ;
    public final void rule__Compound_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3294:1: ( rule__Compound_statement__Group__2__Impl )
            // InternalPascalParser.g:3295:2: rule__Compound_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compound_statement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compound_statement__Group__2"


    // $ANTLR start "rule__Compound_statement__Group__2__Impl"
    // InternalPascalParser.g:3301:1: rule__Compound_statement__Group__2__Impl : ( End ) ;
    public final void rule__Compound_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3305:1: ( ( End ) )
            // InternalPascalParser.g:3306:1: ( End )
            {
            // InternalPascalParser.g:3306:1: ( End )
            // InternalPascalParser.g:3307:2: End
            {
             before(grammarAccess.getCompound_statementAccess().getEndKeyword_2()); 
            match(input,End,FOLLOW_2); 
             after(grammarAccess.getCompound_statementAccess().getEndKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compound_statement__Group__2__Impl"


    // $ANTLR start "rule__Statements__Group__0"
    // InternalPascalParser.g:3317:1: rule__Statements__Group__0 : rule__Statements__Group__0__Impl rule__Statements__Group__1 ;
    public final void rule__Statements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3321:1: ( rule__Statements__Group__0__Impl rule__Statements__Group__1 )
            // InternalPascalParser.g:3322:2: rule__Statements__Group__0__Impl rule__Statements__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Statements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statements__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group__0"


    // $ANTLR start "rule__Statements__Group__0__Impl"
    // InternalPascalParser.g:3329:1: rule__Statements__Group__0__Impl : ( ( rule__Statements__StatementsAssignment_0 ) ) ;
    public final void rule__Statements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3333:1: ( ( ( rule__Statements__StatementsAssignment_0 ) ) )
            // InternalPascalParser.g:3334:1: ( ( rule__Statements__StatementsAssignment_0 ) )
            {
            // InternalPascalParser.g:3334:1: ( ( rule__Statements__StatementsAssignment_0 ) )
            // InternalPascalParser.g:3335:2: ( rule__Statements__StatementsAssignment_0 )
            {
             before(grammarAccess.getStatementsAccess().getStatementsAssignment_0()); 
            // InternalPascalParser.g:3336:2: ( rule__Statements__StatementsAssignment_0 )
            // InternalPascalParser.g:3336:3: rule__Statements__StatementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Statements__StatementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getStatementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group__0__Impl"


    // $ANTLR start "rule__Statements__Group__1"
    // InternalPascalParser.g:3344:1: rule__Statements__Group__1 : rule__Statements__Group__1__Impl ;
    public final void rule__Statements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3348:1: ( rule__Statements__Group__1__Impl )
            // InternalPascalParser.g:3349:2: rule__Statements__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group__1"


    // $ANTLR start "rule__Statements__Group__1__Impl"
    // InternalPascalParser.g:3355:1: rule__Statements__Group__1__Impl : ( ( rule__Statements__Group_1__0 )* ) ;
    public final void rule__Statements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3359:1: ( ( ( rule__Statements__Group_1__0 )* ) )
            // InternalPascalParser.g:3360:1: ( ( rule__Statements__Group_1__0 )* )
            {
            // InternalPascalParser.g:3360:1: ( ( rule__Statements__Group_1__0 )* )
            // InternalPascalParser.g:3361:2: ( rule__Statements__Group_1__0 )*
            {
             before(grammarAccess.getStatementsAccess().getGroup_1()); 
            // InternalPascalParser.g:3362:2: ( rule__Statements__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Semicolon) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPascalParser.g:3362:3: rule__Statements__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Statements__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getStatementsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group__1__Impl"


    // $ANTLR start "rule__Statements__Group_1__0"
    // InternalPascalParser.g:3371:1: rule__Statements__Group_1__0 : rule__Statements__Group_1__0__Impl rule__Statements__Group_1__1 ;
    public final void rule__Statements__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3375:1: ( rule__Statements__Group_1__0__Impl rule__Statements__Group_1__1 )
            // InternalPascalParser.g:3376:2: rule__Statements__Group_1__0__Impl rule__Statements__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Statements__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statements__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group_1__0"


    // $ANTLR start "rule__Statements__Group_1__0__Impl"
    // InternalPascalParser.g:3383:1: rule__Statements__Group_1__0__Impl : ( Semicolon ) ;
    public final void rule__Statements__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3387:1: ( ( Semicolon ) )
            // InternalPascalParser.g:3388:1: ( Semicolon )
            {
            // InternalPascalParser.g:3388:1: ( Semicolon )
            // InternalPascalParser.g:3389:2: Semicolon
            {
             before(grammarAccess.getStatementsAccess().getSemicolonKeyword_1_0()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getStatementsAccess().getSemicolonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group_1__0__Impl"


    // $ANTLR start "rule__Statements__Group_1__1"
    // InternalPascalParser.g:3398:1: rule__Statements__Group_1__1 : rule__Statements__Group_1__1__Impl ;
    public final void rule__Statements__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3402:1: ( rule__Statements__Group_1__1__Impl )
            // InternalPascalParser.g:3403:2: rule__Statements__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group_1__1"


    // $ANTLR start "rule__Statements__Group_1__1__Impl"
    // InternalPascalParser.g:3409:1: rule__Statements__Group_1__1__Impl : ( ( rule__Statements__StatementsAssignment_1_1 ) ) ;
    public final void rule__Statements__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3413:1: ( ( ( rule__Statements__StatementsAssignment_1_1 ) ) )
            // InternalPascalParser.g:3414:1: ( ( rule__Statements__StatementsAssignment_1_1 ) )
            {
            // InternalPascalParser.g:3414:1: ( ( rule__Statements__StatementsAssignment_1_1 ) )
            // InternalPascalParser.g:3415:2: ( rule__Statements__StatementsAssignment_1_1 )
            {
             before(grammarAccess.getStatementsAccess().getStatementsAssignment_1_1()); 
            // InternalPascalParser.g:3416:2: ( rule__Statements__StatementsAssignment_1_1 )
            // InternalPascalParser.g:3416:3: rule__Statements__StatementsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Statements__StatementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getStatementsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalPascalParser.g:3425:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3429:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalPascalParser.g:3430:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalPascalParser.g:3437:1: rule__Statement__Group__0__Impl : ( () ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3441:1: ( ( () ) )
            // InternalPascalParser.g:3442:1: ( () )
            {
            // InternalPascalParser.g:3442:1: ( () )
            // InternalPascalParser.g:3443:2: ()
            {
             before(grammarAccess.getStatementAccess().getStatementAction_0()); 
            // InternalPascalParser.g:3444:2: ()
            // InternalPascalParser.g:3444:3: 
            {
            }

             after(grammarAccess.getStatementAccess().getStatementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalPascalParser.g:3452:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3456:1: ( rule__Statement__Group__1__Impl )
            // InternalPascalParser.g:3457:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalPascalParser.g:3463:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__StatementAssignment_1 )? ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3467:1: ( ( ( rule__Statement__StatementAssignment_1 )? ) )
            // InternalPascalParser.g:3468:1: ( ( rule__Statement__StatementAssignment_1 )? )
            {
            // InternalPascalParser.g:3468:1: ( ( rule__Statement__StatementAssignment_1 )? )
            // InternalPascalParser.g:3469:2: ( rule__Statement__StatementAssignment_1 )?
            {
             before(grammarAccess.getStatementAccess().getStatementAssignment_1()); 
            // InternalPascalParser.g:3470:2: ( rule__Statement__StatementAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Begin||LA28_0==Case||LA28_0==CommercialAt||LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPascalParser.g:3470:3: rule__Statement__StatementAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__StatementAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getStatementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Assignment_statement__Group__0"
    // InternalPascalParser.g:3479:1: rule__Assignment_statement__Group__0 : rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 ;
    public final void rule__Assignment_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3483:1: ( rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 )
            // InternalPascalParser.g:3484:2: rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Assignment_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment_statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment_statement__Group__0"


    // $ANTLR start "rule__Assignment_statement__Group__0__Impl"
    // InternalPascalParser.g:3491:1: rule__Assignment_statement__Group__0__Impl : ( ( rule__Assignment_statement__Declared_variableAssignment_0 ) ) ;
    public final void rule__Assignment_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3495:1: ( ( ( rule__Assignment_statement__Declared_variableAssignment_0 ) ) )
            // InternalPascalParser.g:3496:1: ( ( rule__Assignment_statement__Declared_variableAssignment_0 ) )
            {
            // InternalPascalParser.g:3496:1: ( ( rule__Assignment_statement__Declared_variableAssignment_0 ) )
            // InternalPascalParser.g:3497:2: ( rule__Assignment_statement__Declared_variableAssignment_0 )
            {
             before(grammarAccess.getAssignment_statementAccess().getDeclared_variableAssignment_0()); 
            // InternalPascalParser.g:3498:2: ( rule__Assignment_statement__Declared_variableAssignment_0 )
            // InternalPascalParser.g:3498:3: rule__Assignment_statement__Declared_variableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__Declared_variableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignment_statementAccess().getDeclared_variableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment_statement__Group__0__Impl"


    // $ANTLR start "rule__Assignment_statement__Group__1"
    // InternalPascalParser.g:3506:1: rule__Assignment_statement__Group__1 : rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 ;
    public final void rule__Assignment_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3510:1: ( rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 )
            // InternalPascalParser.g:3511:2: rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Assignment_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment_statement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment_statement__Group__1"


    // $ANTLR start "rule__Assignment_statement__Group__1__Impl"
    // InternalPascalParser.g:3518:1: rule__Assignment_statement__Group__1__Impl : ( RULE_ASSIGN ) ;
    public final void rule__Assignment_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3522:1: ( ( RULE_ASSIGN ) )
            // InternalPascalParser.g:3523:1: ( RULE_ASSIGN )
            {
            // InternalPascalParser.g:3523:1: ( RULE_ASSIGN )
            // InternalPascalParser.g:3524:2: RULE_ASSIGN
            {
             before(grammarAccess.getAssignment_statementAccess().getASSIGNTerminalRuleCall_1()); 
            match(input,RULE_ASSIGN,FOLLOW_2); 
             after(grammarAccess.getAssignment_statementAccess().getASSIGNTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment_statement__Group__1__Impl"


    // $ANTLR start "rule__Assignment_statement__Group__2"
    // InternalPascalParser.g:3533:1: rule__Assignment_statement__Group__2 : rule__Assignment_statement__Group__2__Impl ;
    public final void rule__Assignment_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3537:1: ( rule__Assignment_statement__Group__2__Impl )
            // InternalPascalParser.g:3538:2: rule__Assignment_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment_statement__Group__2"


    // $ANTLR start "rule__Assignment_statement__Group__2__Impl"
    // InternalPascalParser.g:3544:1: rule__Assignment_statement__Group__2__Impl : ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3548:1: ( ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) )
            // InternalPascalParser.g:3549:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            {
            // InternalPascalParser.g:3549:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            // InternalPascalParser.g:3550:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            {
             before(grammarAccess.getAssignment_statementAccess().getExpressionAssignment_2()); 
            // InternalPascalParser.g:3551:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            // InternalPascalParser.g:3551:3: rule__Assignment_statement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignment_statementAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment_statement__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalPascalParser.g:3560:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3564:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPascalParser.g:3565:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalPascalParser.g:3572:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__Alternatives_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3576:1: ( ( ( rule__Variable__Alternatives_0 ) ) )
            // InternalPascalParser.g:3577:1: ( ( rule__Variable__Alternatives_0 ) )
            {
            // InternalPascalParser.g:3577:1: ( ( rule__Variable__Alternatives_0 ) )
            // InternalPascalParser.g:3578:2: ( rule__Variable__Alternatives_0 )
            {
             before(grammarAccess.getVariableAccess().getAlternatives_0()); 
            // InternalPascalParser.g:3579:2: ( rule__Variable__Alternatives_0 )
            // InternalPascalParser.g:3579:3: rule__Variable__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalPascalParser.g:3587:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3591:1: ( rule__Variable__Group__1__Impl )
            // InternalPascalParser.g:3592:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalPascalParser.g:3598:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__Alternatives_1 )* ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3602:1: ( ( ( rule__Variable__Alternatives_1 )* ) )
            // InternalPascalParser.g:3603:1: ( ( rule__Variable__Alternatives_1 )* )
            {
            // InternalPascalParser.g:3603:1: ( ( rule__Variable__Alternatives_1 )* )
            // InternalPascalParser.g:3604:2: ( rule__Variable__Alternatives_1 )*
            {
             before(grammarAccess.getVariableAccess().getAlternatives_1()); 
            // InternalPascalParser.g:3605:2: ( rule__Variable__Alternatives_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==LeftParenthesisFullStop||LA29_0==FullStop||LA29_0==LeftSquareBracket||LA29_0==CircumflexAccent) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPascalParser.g:3605:3: rule__Variable__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Variable__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group_0_0__0"
    // InternalPascalParser.g:3614:1: rule__Variable__Group_0_0__0 : rule__Variable__Group_0_0__0__Impl rule__Variable__Group_0_0__1 ;
    public final void rule__Variable__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3618:1: ( rule__Variable__Group_0_0__0__Impl rule__Variable__Group_0_0__1 )
            // InternalPascalParser.g:3619:2: rule__Variable__Group_0_0__0__Impl rule__Variable__Group_0_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Variable__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_0_0__0"


    // $ANTLR start "rule__Variable__Group_0_0__0__Impl"
    // InternalPascalParser.g:3626:1: rule__Variable__Group_0_0__0__Impl : ( CommercialAt ) ;
    public final void rule__Variable__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3630:1: ( ( CommercialAt ) )
            // InternalPascalParser.g:3631:1: ( CommercialAt )
            {
            // InternalPascalParser.g:3631:1: ( CommercialAt )
            // InternalPascalParser.g:3632:2: CommercialAt
            {
             before(grammarAccess.getVariableAccess().getCommercialAtKeyword_0_0_0()); 
            match(input,CommercialAt,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getCommercialAtKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_0_0__0__Impl"


    // $ANTLR start "rule__Variable__Group_0_0__1"
    // InternalPascalParser.g:3641:1: rule__Variable__Group_0_0__1 : rule__Variable__Group_0_0__1__Impl ;
    public final void rule__Variable__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3645:1: ( rule__Variable__Group_0_0__1__Impl )
            // InternalPascalParser.g:3646:2: rule__Variable__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_0_0__1"


    // $ANTLR start "rule__Variable__Group_0_0__1__Impl"
    // InternalPascalParser.g:3652:1: rule__Variable__Group_0_0__1__Impl : ( ( rule__Variable__Variable_idAssignment_0_0_1 ) ) ;
    public final void rule__Variable__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3656:1: ( ( ( rule__Variable__Variable_idAssignment_0_0_1 ) ) )
            // InternalPascalParser.g:3657:1: ( ( rule__Variable__Variable_idAssignment_0_0_1 ) )
            {
            // InternalPascalParser.g:3657:1: ( ( rule__Variable__Variable_idAssignment_0_0_1 ) )
            // InternalPascalParser.g:3658:2: ( rule__Variable__Variable_idAssignment_0_0_1 )
            {
             before(grammarAccess.getVariableAccess().getVariable_idAssignment_0_0_1()); 
            // InternalPascalParser.g:3659:2: ( rule__Variable__Variable_idAssignment_0_0_1 )
            // InternalPascalParser.g:3659:3: rule__Variable__Variable_idAssignment_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Variable_idAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getVariable_idAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_0_0__1__Impl"


    // $ANTLR start "rule__Variable__Group_1_0__0"
    // InternalPascalParser.g:3668:1: rule__Variable__Group_1_0__0 : rule__Variable__Group_1_0__0__Impl rule__Variable__Group_1_0__1 ;
    public final void rule__Variable__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3672:1: ( rule__Variable__Group_1_0__0__Impl rule__Variable__Group_1_0__1 )
            // InternalPascalParser.g:3673:2: rule__Variable__Group_1_0__0__Impl rule__Variable__Group_1_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Variable__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_0__0"


    // $ANTLR start "rule__Variable__Group_1_0__0__Impl"
    // InternalPascalParser.g:3680:1: rule__Variable__Group_1_0__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Variable__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3684:1: ( ( LeftSquareBracket ) )
            // InternalPascalParser.g:3685:1: ( LeftSquareBracket )
            {
            // InternalPascalParser.g:3685:1: ( LeftSquareBracket )
            // InternalPascalParser.g:3686:2: LeftSquareBracket
            {
             before(grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_1_0_0()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_0__0__Impl"


    // $ANTLR start "rule__Variable__Group_1_0__1"
    // InternalPascalParser.g:3695:1: rule__Variable__Group_1_0__1 : rule__Variable__Group_1_0__1__Impl rule__Variable__Group_1_0__2 ;
    public final void rule__Variable__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3699:1: ( rule__Variable__Group_1_0__1__Impl rule__Variable__Group_1_0__2 )
            // InternalPascalParser.g:3700:2: rule__Variable__Group_1_0__1__Impl rule__Variable__Group_1_0__2
            {
            pushFollow(FOLLOW_23);
            rule__Variable__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_0__1"


    // $ANTLR start "rule__Variable__Group_1_0__1__Impl"
    // InternalPascalParser.g:3707:1: rule__Variable__Group_1_0__1__Impl : ( ( rule__Variable__IndiceAssignment_1_0_1 ) ) ;
    public final void rule__Variable__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3711:1: ( ( ( rule__Variable__IndiceAssignment_1_0_1 ) ) )
            // InternalPascalParser.g:3712:1: ( ( rule__Variable__IndiceAssignment_1_0_1 ) )
            {
            // InternalPascalParser.g:3712:1: ( ( rule__Variable__IndiceAssignment_1_0_1 ) )
            // InternalPascalParser.g:3713:2: ( rule__Variable__IndiceAssignment_1_0_1 )
            {
             before(grammarAccess.getVariableAccess().getIndiceAssignment_1_0_1()); 
            // InternalPascalParser.g:3714:2: ( rule__Variable__IndiceAssignment_1_0_1 )
            // InternalPascalParser.g:3714:3: rule__Variable__IndiceAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__IndiceAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getIndiceAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_0__1__Impl"


    // $ANTLR start "rule__Variable__Group_1_0__2"
    // InternalPascalParser.g:3722:1: rule__Variable__Group_1_0__2 : rule__Variable__Group_1_0__2__Impl rule__Variable__Group_1_0__3 ;
    public final void rule__Variable__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3726:1: ( rule__Variable__Group_1_0__2__Impl rule__Variable__Group_1_0__3 )
            // InternalPascalParser.g:3727:2: rule__Variable__Group_1_0__2__Impl rule__Variable__Group_1_0__3
            {
            pushFollow(FOLLOW_23);
            rule__Variable__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_0__2"


    // $ANTLR start "rule__Variable__Group_1_0__2__Impl"
    // InternalPascalParser.g:3734:1: rule__Variable__Group_1_0__2__Impl : ( ( rule__Variable__Group_1_0_2__0 )* ) ;
    public final void rule__Variable__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3738:1: ( ( ( rule__Variable__Group_1_0_2__0 )* ) )
            // InternalPascalParser.g:3739:1: ( ( rule__Variable__Group_1_0_2__0 )* )
            {
            // InternalPascalParser.g:3739:1: ( ( rule__Variable__Group_1_0_2__0 )* )
            // InternalPascalParser.g:3740:2: ( rule__Variable__Group_1_0_2__0 )*
            {
             before(grammarAccess.getVariableAccess().getGroup_1_0_2()); 
            // InternalPascalParser.g:3741:2: ( rule__Variable__Group_1_0_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Comma) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPascalParser.g:3741:3: rule__Variable__Group_1_0_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Variable__Group_1_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getGroup_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_0__2__Impl"


    // $ANTLR start "rule__Variable__Group_1_0__3"
    // InternalPascalParser.g:3749:1: rule__Variable__Group_1_0__3 : rule__Variable__Group_1_0__3__Impl ;
    public final void rule__Variable__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3753:1: ( rule__Variable__Group_1_0__3__Impl )
            // InternalPascalParser.g:3754:2: rule__Variable__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_0__3"


    // $ANTLR start "rule__Variable__Group_1_0__3__Impl"
    // InternalPascalParser.g:3760:1: rule__Variable__Group_1_0__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Variable__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3764:1: ( ( RightSquareBracket ) )
            // InternalPascalParser.g:3765:1: ( RightSquareBracket )
            {
            // InternalPascalParser.g:3765:1: ( RightSquareBracket )
            // InternalPascalParser.g:3766:2: RightSquareBracket
            {
             before(grammarAccess.getVariableAccess().getRightSquareBracketKeyword_1_0_3()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getRightSquareBracketKeyword_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_0__3__Impl"


    // $ANTLR start "rule__Variable__Group_1_0_2__0"
    // InternalPascalParser.g:3776:1: rule__Variable__Group_1_0_2__0 : rule__Variable__Group_1_0_2__0__Impl rule__Variable__Group_1_0_2__1 ;
    public final void rule__Variable__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3780:1: ( rule__Variable__Group_1_0_2__0__Impl rule__Variable__Group_1_0_2__1 )
            // InternalPascalParser.g:3781:2: rule__Variable__Group_1_0_2__0__Impl rule__Variable__Group_1_0_2__1
            {
            pushFollow(FOLLOW_20);
            rule__Variable__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_0_2__0"


    // $ANTLR start "rule__Variable__Group_1_0_2__0__Impl"
    // InternalPascalParser.g:3788:1: rule__Variable__Group_1_0_2__0__Impl : ( Comma ) ;
    public final void rule__Variable__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3792:1: ( ( Comma ) )
            // InternalPascalParser.g:3793:1: ( Comma )
            {
            // InternalPascalParser.g:3793:1: ( Comma )
            // InternalPascalParser.g:3794:2: Comma
            {
             before(grammarAccess.getVariableAccess().getCommaKeyword_1_0_2_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getCommaKeyword_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__Variable__Group_1_0_2__1"
    // InternalPascalParser.g:3803:1: rule__Variable__Group_1_0_2__1 : rule__Variable__Group_1_0_2__1__Impl ;
    public final void rule__Variable__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3807:1: ( rule__Variable__Group_1_0_2__1__Impl )
            // InternalPascalParser.g:3808:2: rule__Variable__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_0_2__1"


    // $ANTLR start "rule__Variable__Group_1_0_2__1__Impl"
    // InternalPascalParser.g:3814:1: rule__Variable__Group_1_0_2__1__Impl : ( ( rule__Variable__IndiceAssignment_1_0_2_1 ) ) ;
    public final void rule__Variable__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3818:1: ( ( ( rule__Variable__IndiceAssignment_1_0_2_1 ) ) )
            // InternalPascalParser.g:3819:1: ( ( rule__Variable__IndiceAssignment_1_0_2_1 ) )
            {
            // InternalPascalParser.g:3819:1: ( ( rule__Variable__IndiceAssignment_1_0_2_1 ) )
            // InternalPascalParser.g:3820:2: ( rule__Variable__IndiceAssignment_1_0_2_1 )
            {
             before(grammarAccess.getVariableAccess().getIndiceAssignment_1_0_2_1()); 
            // InternalPascalParser.g:3821:2: ( rule__Variable__IndiceAssignment_1_0_2_1 )
            // InternalPascalParser.g:3821:3: rule__Variable__IndiceAssignment_1_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__IndiceAssignment_1_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getIndiceAssignment_1_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__Variable__Group_1_1__0"
    // InternalPascalParser.g:3830:1: rule__Variable__Group_1_1__0 : rule__Variable__Group_1_1__0__Impl rule__Variable__Group_1_1__1 ;
    public final void rule__Variable__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3834:1: ( rule__Variable__Group_1_1__0__Impl rule__Variable__Group_1_1__1 )
            // InternalPascalParser.g:3835:2: rule__Variable__Group_1_1__0__Impl rule__Variable__Group_1_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Variable__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_1__0"


    // $ANTLR start "rule__Variable__Group_1_1__0__Impl"
    // InternalPascalParser.g:3842:1: rule__Variable__Group_1_1__0__Impl : ( LeftParenthesisFullStop ) ;
    public final void rule__Variable__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3846:1: ( ( LeftParenthesisFullStop ) )
            // InternalPascalParser.g:3847:1: ( LeftParenthesisFullStop )
            {
            // InternalPascalParser.g:3847:1: ( LeftParenthesisFullStop )
            // InternalPascalParser.g:3848:2: LeftParenthesisFullStop
            {
             before(grammarAccess.getVariableAccess().getLeftParenthesisFullStopKeyword_1_1_0()); 
            match(input,LeftParenthesisFullStop,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getLeftParenthesisFullStopKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_1__0__Impl"


    // $ANTLR start "rule__Variable__Group_1_1__1"
    // InternalPascalParser.g:3857:1: rule__Variable__Group_1_1__1 : rule__Variable__Group_1_1__1__Impl rule__Variable__Group_1_1__2 ;
    public final void rule__Variable__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3861:1: ( rule__Variable__Group_1_1__1__Impl rule__Variable__Group_1_1__2 )
            // InternalPascalParser.g:3862:2: rule__Variable__Group_1_1__1__Impl rule__Variable__Group_1_1__2
            {
            pushFollow(FOLLOW_24);
            rule__Variable__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_1__1"


    // $ANTLR start "rule__Variable__Group_1_1__1__Impl"
    // InternalPascalParser.g:3869:1: rule__Variable__Group_1_1__1__Impl : ( ( rule__Variable__ExpressionAssignment_1_1_1 ) ) ;
    public final void rule__Variable__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3873:1: ( ( ( rule__Variable__ExpressionAssignment_1_1_1 ) ) )
            // InternalPascalParser.g:3874:1: ( ( rule__Variable__ExpressionAssignment_1_1_1 ) )
            {
            // InternalPascalParser.g:3874:1: ( ( rule__Variable__ExpressionAssignment_1_1_1 ) )
            // InternalPascalParser.g:3875:2: ( rule__Variable__ExpressionAssignment_1_1_1 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_1_1_1()); 
            // InternalPascalParser.g:3876:2: ( rule__Variable__ExpressionAssignment_1_1_1 )
            // InternalPascalParser.g:3876:3: rule__Variable__ExpressionAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ExpressionAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getExpressionAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_1__1__Impl"


    // $ANTLR start "rule__Variable__Group_1_1__2"
    // InternalPascalParser.g:3884:1: rule__Variable__Group_1_1__2 : rule__Variable__Group_1_1__2__Impl rule__Variable__Group_1_1__3 ;
    public final void rule__Variable__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3888:1: ( rule__Variable__Group_1_1__2__Impl rule__Variable__Group_1_1__3 )
            // InternalPascalParser.g:3889:2: rule__Variable__Group_1_1__2__Impl rule__Variable__Group_1_1__3
            {
            pushFollow(FOLLOW_24);
            rule__Variable__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_1__2"


    // $ANTLR start "rule__Variable__Group_1_1__2__Impl"
    // InternalPascalParser.g:3896:1: rule__Variable__Group_1_1__2__Impl : ( ( rule__Variable__Group_1_1_2__0 )* ) ;
    public final void rule__Variable__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3900:1: ( ( ( rule__Variable__Group_1_1_2__0 )* ) )
            // InternalPascalParser.g:3901:1: ( ( rule__Variable__Group_1_1_2__0 )* )
            {
            // InternalPascalParser.g:3901:1: ( ( rule__Variable__Group_1_1_2__0 )* )
            // InternalPascalParser.g:3902:2: ( rule__Variable__Group_1_1_2__0 )*
            {
             before(grammarAccess.getVariableAccess().getGroup_1_1_2()); 
            // InternalPascalParser.g:3903:2: ( rule__Variable__Group_1_1_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Comma) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPascalParser.g:3903:3: rule__Variable__Group_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Variable__Group_1_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getGroup_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_1__2__Impl"


    // $ANTLR start "rule__Variable__Group_1_1__3"
    // InternalPascalParser.g:3911:1: rule__Variable__Group_1_1__3 : rule__Variable__Group_1_1__3__Impl ;
    public final void rule__Variable__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3915:1: ( rule__Variable__Group_1_1__3__Impl )
            // InternalPascalParser.g:3916:2: rule__Variable__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_1__3"


    // $ANTLR start "rule__Variable__Group_1_1__3__Impl"
    // InternalPascalParser.g:3922:1: rule__Variable__Group_1_1__3__Impl : ( FullStopRightParenthesis ) ;
    public final void rule__Variable__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3926:1: ( ( FullStopRightParenthesis ) )
            // InternalPascalParser.g:3927:1: ( FullStopRightParenthesis )
            {
            // InternalPascalParser.g:3927:1: ( FullStopRightParenthesis )
            // InternalPascalParser.g:3928:2: FullStopRightParenthesis
            {
             before(grammarAccess.getVariableAccess().getFullStopRightParenthesisKeyword_1_1_3()); 
            match(input,FullStopRightParenthesis,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getFullStopRightParenthesisKeyword_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_1__3__Impl"


    // $ANTLR start "rule__Variable__Group_1_1_2__0"
    // InternalPascalParser.g:3938:1: rule__Variable__Group_1_1_2__0 : rule__Variable__Group_1_1_2__0__Impl rule__Variable__Group_1_1_2__1 ;
    public final void rule__Variable__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3942:1: ( rule__Variable__Group_1_1_2__0__Impl rule__Variable__Group_1_1_2__1 )
            // InternalPascalParser.g:3943:2: rule__Variable__Group_1_1_2__0__Impl rule__Variable__Group_1_1_2__1
            {
            pushFollow(FOLLOW_20);
            rule__Variable__Group_1_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_1_2__0"


    // $ANTLR start "rule__Variable__Group_1_1_2__0__Impl"
    // InternalPascalParser.g:3950:1: rule__Variable__Group_1_1_2__0__Impl : ( Comma ) ;
    public final void rule__Variable__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3954:1: ( ( Comma ) )
            // InternalPascalParser.g:3955:1: ( Comma )
            {
            // InternalPascalParser.g:3955:1: ( Comma )
            // InternalPascalParser.g:3956:2: Comma
            {
             before(grammarAccess.getVariableAccess().getCommaKeyword_1_1_2_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getCommaKeyword_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__Variable__Group_1_1_2__1"
    // InternalPascalParser.g:3965:1: rule__Variable__Group_1_1_2__1 : rule__Variable__Group_1_1_2__1__Impl ;
    public final void rule__Variable__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3969:1: ( rule__Variable__Group_1_1_2__1__Impl )
            // InternalPascalParser.g:3970:2: rule__Variable__Group_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_1_2__1"


    // $ANTLR start "rule__Variable__Group_1_1_2__1__Impl"
    // InternalPascalParser.g:3976:1: rule__Variable__Group_1_1_2__1__Impl : ( ( rule__Variable__ExpressionAssignment_1_1_2_1 ) ) ;
    public final void rule__Variable__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3980:1: ( ( ( rule__Variable__ExpressionAssignment_1_1_2_1 ) ) )
            // InternalPascalParser.g:3981:1: ( ( rule__Variable__ExpressionAssignment_1_1_2_1 ) )
            {
            // InternalPascalParser.g:3981:1: ( ( rule__Variable__ExpressionAssignment_1_1_2_1 ) )
            // InternalPascalParser.g:3982:2: ( rule__Variable__ExpressionAssignment_1_1_2_1 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_1_1_2_1()); 
            // InternalPascalParser.g:3983:2: ( rule__Variable__ExpressionAssignment_1_1_2_1 )
            // InternalPascalParser.g:3983:3: rule__Variable__ExpressionAssignment_1_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ExpressionAssignment_1_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getExpressionAssignment_1_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__Variable__Group_1_2__0"
    // InternalPascalParser.g:3992:1: rule__Variable__Group_1_2__0 : rule__Variable__Group_1_2__0__Impl rule__Variable__Group_1_2__1 ;
    public final void rule__Variable__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:3996:1: ( rule__Variable__Group_1_2__0__Impl rule__Variable__Group_1_2__1 )
            // InternalPascalParser.g:3997:2: rule__Variable__Group_1_2__0__Impl rule__Variable__Group_1_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Variable__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_2__0"


    // $ANTLR start "rule__Variable__Group_1_2__0__Impl"
    // InternalPascalParser.g:4004:1: rule__Variable__Group_1_2__0__Impl : ( FullStop ) ;
    public final void rule__Variable__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4008:1: ( ( FullStop ) )
            // InternalPascalParser.g:4009:1: ( FullStop )
            {
            // InternalPascalParser.g:4009:1: ( FullStop )
            // InternalPascalParser.g:4010:2: FullStop
            {
             before(grammarAccess.getVariableAccess().getFullStopKeyword_1_2_0()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getFullStopKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_2__0__Impl"


    // $ANTLR start "rule__Variable__Group_1_2__1"
    // InternalPascalParser.g:4019:1: rule__Variable__Group_1_2__1 : rule__Variable__Group_1_2__1__Impl ;
    public final void rule__Variable__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4023:1: ( rule__Variable__Group_1_2__1__Impl )
            // InternalPascalParser.g:4024:2: rule__Variable__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_2__1"


    // $ANTLR start "rule__Variable__Group_1_2__1__Impl"
    // InternalPascalParser.g:4030:1: rule__Variable__Group_1_2__1__Impl : ( ( rule__Variable__Names_expAssignment_1_2_1 ) ) ;
    public final void rule__Variable__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4034:1: ( ( ( rule__Variable__Names_expAssignment_1_2_1 ) ) )
            // InternalPascalParser.g:4035:1: ( ( rule__Variable__Names_expAssignment_1_2_1 ) )
            {
            // InternalPascalParser.g:4035:1: ( ( rule__Variable__Names_expAssignment_1_2_1 ) )
            // InternalPascalParser.g:4036:2: ( rule__Variable__Names_expAssignment_1_2_1 )
            {
             before(grammarAccess.getVariableAccess().getNames_expAssignment_1_2_1()); 
            // InternalPascalParser.g:4037:2: ( rule__Variable__Names_expAssignment_1_2_1 )
            // InternalPascalParser.g:4037:3: rule__Variable__Names_expAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Names_expAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNames_expAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1_2__1__Impl"


    // $ANTLR start "rule__Simple_expression__Group__0"
    // InternalPascalParser.g:4046:1: rule__Simple_expression__Group__0 : rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 ;
    public final void rule__Simple_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4050:1: ( rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 )
            // InternalPascalParser.g:4051:2: rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Simple_expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group__0"


    // $ANTLR start "rule__Simple_expression__Group__0__Impl"
    // InternalPascalParser.g:4058:1: rule__Simple_expression__Group__0__Impl : ( ( rule__Simple_expression__Term_expAssignment_0 ) ) ;
    public final void rule__Simple_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4062:1: ( ( ( rule__Simple_expression__Term_expAssignment_0 ) ) )
            // InternalPascalParser.g:4063:1: ( ( rule__Simple_expression__Term_expAssignment_0 ) )
            {
            // InternalPascalParser.g:4063:1: ( ( rule__Simple_expression__Term_expAssignment_0 ) )
            // InternalPascalParser.g:4064:2: ( rule__Simple_expression__Term_expAssignment_0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getTerm_expAssignment_0()); 
            // InternalPascalParser.g:4065:2: ( rule__Simple_expression__Term_expAssignment_0 )
            // InternalPascalParser.g:4065:3: rule__Simple_expression__Term_expAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Term_expAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimple_expressionAccess().getTerm_expAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group__0__Impl"


    // $ANTLR start "rule__Simple_expression__Group__1"
    // InternalPascalParser.g:4073:1: rule__Simple_expression__Group__1 : rule__Simple_expression__Group__1__Impl ;
    public final void rule__Simple_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4077:1: ( rule__Simple_expression__Group__1__Impl )
            // InternalPascalParser.g:4078:2: rule__Simple_expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group__1"


    // $ANTLR start "rule__Simple_expression__Group__1__Impl"
    // InternalPascalParser.g:4084:1: rule__Simple_expression__Group__1__Impl : ( ( rule__Simple_expression__Group_1__0 )? ) ;
    public final void rule__Simple_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4088:1: ( ( ( rule__Simple_expression__Group_1__0 )? ) )
            // InternalPascalParser.g:4089:1: ( ( rule__Simple_expression__Group_1__0 )? )
            {
            // InternalPascalParser.g:4089:1: ( ( rule__Simple_expression__Group_1__0 )? )
            // InternalPascalParser.g:4090:2: ( rule__Simple_expression__Group_1__0 )?
            {
             before(grammarAccess.getSimple_expressionAccess().getGroup_1()); 
            // InternalPascalParser.g:4091:2: ( rule__Simple_expression__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_PLUS && LA32_0<=RULE_MINUS)||LA32_0==RULE_OR) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPascalParser.g:4091:3: rule__Simple_expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_expression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimple_expressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group__1__Impl"


    // $ANTLR start "rule__Simple_expression__Group_1__0"
    // InternalPascalParser.g:4100:1: rule__Simple_expression__Group_1__0 : rule__Simple_expression__Group_1__0__Impl rule__Simple_expression__Group_1__1 ;
    public final void rule__Simple_expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4104:1: ( rule__Simple_expression__Group_1__0__Impl rule__Simple_expression__Group_1__1 )
            // InternalPascalParser.g:4105:2: rule__Simple_expression__Group_1__0__Impl rule__Simple_expression__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Simple_expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_1__0"


    // $ANTLR start "rule__Simple_expression__Group_1__0__Impl"
    // InternalPascalParser.g:4112:1: rule__Simple_expression__Group_1__0__Impl : ( ( rule__Simple_expression__OperatorAssignment_1_0 ) ) ;
    public final void rule__Simple_expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4116:1: ( ( ( rule__Simple_expression__OperatorAssignment_1_0 ) ) )
            // InternalPascalParser.g:4117:1: ( ( rule__Simple_expression__OperatorAssignment_1_0 ) )
            {
            // InternalPascalParser.g:4117:1: ( ( rule__Simple_expression__OperatorAssignment_1_0 ) )
            // InternalPascalParser.g:4118:2: ( rule__Simple_expression__OperatorAssignment_1_0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getOperatorAssignment_1_0()); 
            // InternalPascalParser.g:4119:2: ( rule__Simple_expression__OperatorAssignment_1_0 )
            // InternalPascalParser.g:4119:3: rule__Simple_expression__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__OperatorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSimple_expressionAccess().getOperatorAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_1__0__Impl"


    // $ANTLR start "rule__Simple_expression__Group_1__1"
    // InternalPascalParser.g:4127:1: rule__Simple_expression__Group_1__1 : rule__Simple_expression__Group_1__1__Impl ;
    public final void rule__Simple_expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4131:1: ( rule__Simple_expression__Group_1__1__Impl )
            // InternalPascalParser.g:4132:2: rule__Simple_expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_1__1"


    // $ANTLR start "rule__Simple_expression__Group_1__1__Impl"
    // InternalPascalParser.g:4138:1: rule__Simple_expression__Group_1__1__Impl : ( ( rule__Simple_expression__ExpressionAssignment_1_1 ) ) ;
    public final void rule__Simple_expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4142:1: ( ( ( rule__Simple_expression__ExpressionAssignment_1_1 ) ) )
            // InternalPascalParser.g:4143:1: ( ( rule__Simple_expression__ExpressionAssignment_1_1 ) )
            {
            // InternalPascalParser.g:4143:1: ( ( rule__Simple_expression__ExpressionAssignment_1_1 ) )
            // InternalPascalParser.g:4144:2: ( rule__Simple_expression__ExpressionAssignment_1_1 )
            {
             before(grammarAccess.getSimple_expressionAccess().getExpressionAssignment_1_1()); 
            // InternalPascalParser.g:4145:2: ( rule__Simple_expression__ExpressionAssignment_1_1 )
            // InternalPascalParser.g:4145:3: rule__Simple_expression__ExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__ExpressionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSimple_expressionAccess().getExpressionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_1__1__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // InternalPascalParser.g:4154:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4158:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalPascalParser.g:4159:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // InternalPascalParser.g:4166:1: rule__Term__Group__0__Impl : ( ( rule__Term__FactorAssignment_0 ) ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4170:1: ( ( ( rule__Term__FactorAssignment_0 ) ) )
            // InternalPascalParser.g:4171:1: ( ( rule__Term__FactorAssignment_0 ) )
            {
            // InternalPascalParser.g:4171:1: ( ( rule__Term__FactorAssignment_0 ) )
            // InternalPascalParser.g:4172:2: ( rule__Term__FactorAssignment_0 )
            {
             before(grammarAccess.getTermAccess().getFactorAssignment_0()); 
            // InternalPascalParser.g:4173:2: ( rule__Term__FactorAssignment_0 )
            // InternalPascalParser.g:4173:3: rule__Term__FactorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__FactorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getFactorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // InternalPascalParser.g:4181:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4185:1: ( rule__Term__Group__1__Impl )
            // InternalPascalParser.g:4186:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // InternalPascalParser.g:4192:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )? ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4196:1: ( ( ( rule__Term__Group_1__0 )? ) )
            // InternalPascalParser.g:4197:1: ( ( rule__Term__Group_1__0 )? )
            {
            // InternalPascalParser.g:4197:1: ( ( rule__Term__Group_1__0 )? )
            // InternalPascalParser.g:4198:2: ( rule__Term__Group_1__0 )?
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // InternalPascalParser.g:4199:2: ( rule__Term__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_STAR && LA33_0<=RULE_MOD)||LA33_0==RULE_AND) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPascalParser.g:4199:3: rule__Term__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTermAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1__0"
    // InternalPascalParser.g:4208:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4212:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalPascalParser.g:4213:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0"


    // $ANTLR start "rule__Term__Group_1__0__Impl"
    // InternalPascalParser.g:4220:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__OperatorAssignment_1_0 ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4224:1: ( ( ( rule__Term__OperatorAssignment_1_0 ) ) )
            // InternalPascalParser.g:4225:1: ( ( rule__Term__OperatorAssignment_1_0 ) )
            {
            // InternalPascalParser.g:4225:1: ( ( rule__Term__OperatorAssignment_1_0 ) )
            // InternalPascalParser.g:4226:2: ( rule__Term__OperatorAssignment_1_0 )
            {
             before(grammarAccess.getTermAccess().getOperatorAssignment_1_0()); 
            // InternalPascalParser.g:4227:2: ( rule__Term__OperatorAssignment_1_0 )
            // InternalPascalParser.g:4227:3: rule__Term__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__OperatorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getOperatorAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // InternalPascalParser.g:4235:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4239:1: ( rule__Term__Group_1__1__Impl )
            // InternalPascalParser.g:4240:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1"


    // $ANTLR start "rule__Term__Group_1__1__Impl"
    // InternalPascalParser.g:4246:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__Term2Assignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4250:1: ( ( ( rule__Term__Term2Assignment_1_1 ) ) )
            // InternalPascalParser.g:4251:1: ( ( rule__Term__Term2Assignment_1_1 ) )
            {
            // InternalPascalParser.g:4251:1: ( ( rule__Term__Term2Assignment_1_1 ) )
            // InternalPascalParser.g:4252:2: ( rule__Term__Term2Assignment_1_1 )
            {
             before(grammarAccess.getTermAccess().getTerm2Assignment_1_1()); 
            // InternalPascalParser.g:4253:2: ( rule__Term__Term2Assignment_1_1 )
            // InternalPascalParser.g:4253:3: rule__Term__Term2Assignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Term__Term2Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getTerm2Assignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Signed_factor__Group__0"
    // InternalPascalParser.g:4262:1: rule__Signed_factor__Group__0 : rule__Signed_factor__Group__0__Impl rule__Signed_factor__Group__1 ;
    public final void rule__Signed_factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4266:1: ( rule__Signed_factor__Group__0__Impl rule__Signed_factor__Group__1 )
            // InternalPascalParser.g:4267:2: rule__Signed_factor__Group__0__Impl rule__Signed_factor__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Signed_factor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signed_factor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_factor__Group__0"


    // $ANTLR start "rule__Signed_factor__Group__0__Impl"
    // InternalPascalParser.g:4274:1: rule__Signed_factor__Group__0__Impl : ( ( rule__Signed_factor__Alternatives_0 )? ) ;
    public final void rule__Signed_factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4278:1: ( ( ( rule__Signed_factor__Alternatives_0 )? ) )
            // InternalPascalParser.g:4279:1: ( ( rule__Signed_factor__Alternatives_0 )? )
            {
            // InternalPascalParser.g:4279:1: ( ( rule__Signed_factor__Alternatives_0 )? )
            // InternalPascalParser.g:4280:2: ( rule__Signed_factor__Alternatives_0 )?
            {
             before(grammarAccess.getSigned_factorAccess().getAlternatives_0()); 
            // InternalPascalParser.g:4281:2: ( rule__Signed_factor__Alternatives_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_PLUS && LA34_0<=RULE_MINUS)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPascalParser.g:4281:3: rule__Signed_factor__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signed_factor__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSigned_factorAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_factor__Group__0__Impl"


    // $ANTLR start "rule__Signed_factor__Group__1"
    // InternalPascalParser.g:4289:1: rule__Signed_factor__Group__1 : rule__Signed_factor__Group__1__Impl ;
    public final void rule__Signed_factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4293:1: ( rule__Signed_factor__Group__1__Impl )
            // InternalPascalParser.g:4294:2: rule__Signed_factor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signed_factor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_factor__Group__1"


    // $ANTLR start "rule__Signed_factor__Group__1__Impl"
    // InternalPascalParser.g:4300:1: rule__Signed_factor__Group__1__Impl : ( ( rule__Signed_factor__FactorAssignment_1 ) ) ;
    public final void rule__Signed_factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4304:1: ( ( ( rule__Signed_factor__FactorAssignment_1 ) ) )
            // InternalPascalParser.g:4305:1: ( ( rule__Signed_factor__FactorAssignment_1 ) )
            {
            // InternalPascalParser.g:4305:1: ( ( rule__Signed_factor__FactorAssignment_1 ) )
            // InternalPascalParser.g:4306:2: ( rule__Signed_factor__FactorAssignment_1 )
            {
             before(grammarAccess.getSigned_factorAccess().getFactorAssignment_1()); 
            // InternalPascalParser.g:4307:2: ( rule__Signed_factor__FactorAssignment_1 )
            // InternalPascalParser.g:4307:3: rule__Signed_factor__FactorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Signed_factor__FactorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSigned_factorAccess().getFactorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_factor__Group__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__0"
    // InternalPascalParser.g:4316:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4320:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalPascalParser.g:4321:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0"


    // $ANTLR start "rule__Factor__Group_1__0__Impl"
    // InternalPascalParser.g:4328:1: rule__Factor__Group_1__0__Impl : ( LeftParenthesis ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4332:1: ( ( LeftParenthesis ) )
            // InternalPascalParser.g:4333:1: ( LeftParenthesis )
            {
            // InternalPascalParser.g:4333:1: ( LeftParenthesis )
            // InternalPascalParser.g:4334:2: LeftParenthesis
            {
             before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1__1"
    // InternalPascalParser.g:4343:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4347:1: ( rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 )
            // InternalPascalParser.g:4348:2: rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__Factor__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1"


    // $ANTLR start "rule__Factor__Group_1__1__Impl"
    // InternalPascalParser.g:4355:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__ExpressionAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4359:1: ( ( ( rule__Factor__ExpressionAssignment_1_1 ) ) )
            // InternalPascalParser.g:4360:1: ( ( rule__Factor__ExpressionAssignment_1_1 ) )
            {
            // InternalPascalParser.g:4360:1: ( ( rule__Factor__ExpressionAssignment_1_1 ) )
            // InternalPascalParser.g:4361:2: ( rule__Factor__ExpressionAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getExpressionAssignment_1_1()); 
            // InternalPascalParser.g:4362:2: ( rule__Factor__ExpressionAssignment_1_1 )
            // InternalPascalParser.g:4362:3: rule__Factor__ExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__ExpressionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getExpressionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__2"
    // InternalPascalParser.g:4370:1: rule__Factor__Group_1__2 : rule__Factor__Group_1__2__Impl ;
    public final void rule__Factor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4374:1: ( rule__Factor__Group_1__2__Impl )
            // InternalPascalParser.g:4375:2: rule__Factor__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__2"


    // $ANTLR start "rule__Factor__Group_1__2__Impl"
    // InternalPascalParser.g:4381:1: rule__Factor__Group_1__2__Impl : ( RightParenthesis ) ;
    public final void rule__Factor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4385:1: ( ( RightParenthesis ) )
            // InternalPascalParser.g:4386:1: ( RightParenthesis )
            {
            // InternalPascalParser.g:4386:1: ( RightParenthesis )
            // InternalPascalParser.g:4387:2: RightParenthesis
            {
             before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_1_2()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__2__Impl"


    // $ANTLR start "rule__Factor__Group_4__0"
    // InternalPascalParser.g:4397:1: rule__Factor__Group_4__0 : rule__Factor__Group_4__0__Impl rule__Factor__Group_4__1 ;
    public final void rule__Factor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4401:1: ( rule__Factor__Group_4__0__Impl rule__Factor__Group_4__1 )
            // InternalPascalParser.g:4402:2: rule__Factor__Group_4__0__Impl rule__Factor__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__Factor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_4__0"


    // $ANTLR start "rule__Factor__Group_4__0__Impl"
    // InternalPascalParser.g:4409:1: rule__Factor__Group_4__0__Impl : ( RULE_NOT ) ;
    public final void rule__Factor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4413:1: ( ( RULE_NOT ) )
            // InternalPascalParser.g:4414:1: ( RULE_NOT )
            {
            // InternalPascalParser.g:4414:1: ( RULE_NOT )
            // InternalPascalParser.g:4415:2: RULE_NOT
            {
             before(grammarAccess.getFactorAccess().getNOTTerminalRuleCall_4_0()); 
            match(input,RULE_NOT,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getNOTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_4__0__Impl"


    // $ANTLR start "rule__Factor__Group_4__1"
    // InternalPascalParser.g:4424:1: rule__Factor__Group_4__1 : rule__Factor__Group_4__1__Impl ;
    public final void rule__Factor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4428:1: ( rule__Factor__Group_4__1__Impl )
            // InternalPascalParser.g:4429:2: rule__Factor__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_4__1"


    // $ANTLR start "rule__Factor__Group_4__1__Impl"
    // InternalPascalParser.g:4435:1: rule__Factor__Group_4__1__Impl : ( ( rule__Factor__Not_factorAssignment_4_1 ) ) ;
    public final void rule__Factor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4439:1: ( ( ( rule__Factor__Not_factorAssignment_4_1 ) ) )
            // InternalPascalParser.g:4440:1: ( ( rule__Factor__Not_factorAssignment_4_1 ) )
            {
            // InternalPascalParser.g:4440:1: ( ( rule__Factor__Not_factorAssignment_4_1 ) )
            // InternalPascalParser.g:4441:2: ( rule__Factor__Not_factorAssignment_4_1 )
            {
             before(grammarAccess.getFactorAccess().getNot_factorAssignment_4_1()); 
            // InternalPascalParser.g:4442:2: ( rule__Factor__Not_factorAssignment_4_1 )
            // InternalPascalParser.g:4442:3: rule__Factor__Not_factorAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Not_factorAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getNot_factorAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_4__1__Impl"


    // $ANTLR start "rule__Subrange_type__Group__0"
    // InternalPascalParser.g:4451:1: rule__Subrange_type__Group__0 : rule__Subrange_type__Group__0__Impl rule__Subrange_type__Group__1 ;
    public final void rule__Subrange_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4455:1: ( rule__Subrange_type__Group__0__Impl rule__Subrange_type__Group__1 )
            // InternalPascalParser.g:4456:2: rule__Subrange_type__Group__0__Impl rule__Subrange_type__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Subrange_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group__0"


    // $ANTLR start "rule__Subrange_type__Group__0__Impl"
    // InternalPascalParser.g:4463:1: rule__Subrange_type__Group__0__Impl : ( ( rule__Subrange_type__ConstantInitAssignment_0 ) ) ;
    public final void rule__Subrange_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4467:1: ( ( ( rule__Subrange_type__ConstantInitAssignment_0 ) ) )
            // InternalPascalParser.g:4468:1: ( ( rule__Subrange_type__ConstantInitAssignment_0 ) )
            {
            // InternalPascalParser.g:4468:1: ( ( rule__Subrange_type__ConstantInitAssignment_0 ) )
            // InternalPascalParser.g:4469:2: ( rule__Subrange_type__ConstantInitAssignment_0 )
            {
             before(grammarAccess.getSubrange_typeAccess().getConstantInitAssignment_0()); 
            // InternalPascalParser.g:4470:2: ( rule__Subrange_type__ConstantInitAssignment_0 )
            // InternalPascalParser.g:4470:3: rule__Subrange_type__ConstantInitAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__ConstantInitAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSubrange_typeAccess().getConstantInitAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group__0__Impl"


    // $ANTLR start "rule__Subrange_type__Group__1"
    // InternalPascalParser.g:4478:1: rule__Subrange_type__Group__1 : rule__Subrange_type__Group__1__Impl rule__Subrange_type__Group__2 ;
    public final void rule__Subrange_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4482:1: ( rule__Subrange_type__Group__1__Impl rule__Subrange_type__Group__2 )
            // InternalPascalParser.g:4483:2: rule__Subrange_type__Group__1__Impl rule__Subrange_type__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Subrange_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group__1"


    // $ANTLR start "rule__Subrange_type__Group__1__Impl"
    // InternalPascalParser.g:4490:1: rule__Subrange_type__Group__1__Impl : ( RULE_DOTDOT ) ;
    public final void rule__Subrange_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4494:1: ( ( RULE_DOTDOT ) )
            // InternalPascalParser.g:4495:1: ( RULE_DOTDOT )
            {
            // InternalPascalParser.g:4495:1: ( RULE_DOTDOT )
            // InternalPascalParser.g:4496:2: RULE_DOTDOT
            {
             before(grammarAccess.getSubrange_typeAccess().getDOTDOTTerminalRuleCall_1()); 
            match(input,RULE_DOTDOT,FOLLOW_2); 
             after(grammarAccess.getSubrange_typeAccess().getDOTDOTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group__1__Impl"


    // $ANTLR start "rule__Subrange_type__Group__2"
    // InternalPascalParser.g:4505:1: rule__Subrange_type__Group__2 : rule__Subrange_type__Group__2__Impl ;
    public final void rule__Subrange_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4509:1: ( rule__Subrange_type__Group__2__Impl )
            // InternalPascalParser.g:4510:2: rule__Subrange_type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group__2"


    // $ANTLR start "rule__Subrange_type__Group__2__Impl"
    // InternalPascalParser.g:4516:1: rule__Subrange_type__Group__2__Impl : ( ( rule__Subrange_type__ConstantFinalAssignment_2 ) ) ;
    public final void rule__Subrange_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4520:1: ( ( ( rule__Subrange_type__ConstantFinalAssignment_2 ) ) )
            // InternalPascalParser.g:4521:1: ( ( rule__Subrange_type__ConstantFinalAssignment_2 ) )
            {
            // InternalPascalParser.g:4521:1: ( ( rule__Subrange_type__ConstantFinalAssignment_2 ) )
            // InternalPascalParser.g:4522:2: ( rule__Subrange_type__ConstantFinalAssignment_2 )
            {
             before(grammarAccess.getSubrange_typeAccess().getConstantFinalAssignment_2()); 
            // InternalPascalParser.g:4523:2: ( rule__Subrange_type__ConstantFinalAssignment_2 )
            // InternalPascalParser.g:4523:3: rule__Subrange_type__ConstantFinalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__ConstantFinalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubrange_typeAccess().getConstantFinalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group__2__Impl"


    // $ANTLR start "rule__Dynamic_array_type__Group__0"
    // InternalPascalParser.g:4532:1: rule__Dynamic_array_type__Group__0 : rule__Dynamic_array_type__Group__0__Impl rule__Dynamic_array_type__Group__1 ;
    public final void rule__Dynamic_array_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4536:1: ( rule__Dynamic_array_type__Group__0__Impl rule__Dynamic_array_type__Group__1 )
            // InternalPascalParser.g:4537:2: rule__Dynamic_array_type__Group__0__Impl rule__Dynamic_array_type__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Dynamic_array_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamic_array_type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamic_array_type__Group__0"


    // $ANTLR start "rule__Dynamic_array_type__Group__0__Impl"
    // InternalPascalParser.g:4544:1: rule__Dynamic_array_type__Group__0__Impl : ( Array ) ;
    public final void rule__Dynamic_array_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4548:1: ( ( Array ) )
            // InternalPascalParser.g:4549:1: ( Array )
            {
            // InternalPascalParser.g:4549:1: ( Array )
            // InternalPascalParser.g:4550:2: Array
            {
             before(grammarAccess.getDynamic_array_typeAccess().getArrayKeyword_0()); 
            match(input,Array,FOLLOW_2); 
             after(grammarAccess.getDynamic_array_typeAccess().getArrayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamic_array_type__Group__0__Impl"


    // $ANTLR start "rule__Dynamic_array_type__Group__1"
    // InternalPascalParser.g:4559:1: rule__Dynamic_array_type__Group__1 : rule__Dynamic_array_type__Group__1__Impl rule__Dynamic_array_type__Group__2 ;
    public final void rule__Dynamic_array_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4563:1: ( rule__Dynamic_array_type__Group__1__Impl rule__Dynamic_array_type__Group__2 )
            // InternalPascalParser.g:4564:2: rule__Dynamic_array_type__Group__1__Impl rule__Dynamic_array_type__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Dynamic_array_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamic_array_type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamic_array_type__Group__1"


    // $ANTLR start "rule__Dynamic_array_type__Group__1__Impl"
    // InternalPascalParser.g:4571:1: rule__Dynamic_array_type__Group__1__Impl : ( Of ) ;
    public final void rule__Dynamic_array_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4575:1: ( ( Of ) )
            // InternalPascalParser.g:4576:1: ( Of )
            {
            // InternalPascalParser.g:4576:1: ( Of )
            // InternalPascalParser.g:4577:2: Of
            {
             before(grammarAccess.getDynamic_array_typeAccess().getOfKeyword_1()); 
            match(input,Of,FOLLOW_2); 
             after(grammarAccess.getDynamic_array_typeAccess().getOfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamic_array_type__Group__1__Impl"


    // $ANTLR start "rule__Dynamic_array_type__Group__2"
    // InternalPascalParser.g:4586:1: rule__Dynamic_array_type__Group__2 : rule__Dynamic_array_type__Group__2__Impl ;
    public final void rule__Dynamic_array_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4590:1: ( rule__Dynamic_array_type__Group__2__Impl )
            // InternalPascalParser.g:4591:2: rule__Dynamic_array_type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamic_array_type__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamic_array_type__Group__2"


    // $ANTLR start "rule__Dynamic_array_type__Group__2__Impl"
    // InternalPascalParser.g:4597:1: rule__Dynamic_array_type__Group__2__Impl : ( ( rule__Dynamic_array_type__TypeAssignment_2 ) ) ;
    public final void rule__Dynamic_array_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4601:1: ( ( ( rule__Dynamic_array_type__TypeAssignment_2 ) ) )
            // InternalPascalParser.g:4602:1: ( ( rule__Dynamic_array_type__TypeAssignment_2 ) )
            {
            // InternalPascalParser.g:4602:1: ( ( rule__Dynamic_array_type__TypeAssignment_2 ) )
            // InternalPascalParser.g:4603:2: ( rule__Dynamic_array_type__TypeAssignment_2 )
            {
             before(grammarAccess.getDynamic_array_typeAccess().getTypeAssignment_2()); 
            // InternalPascalParser.g:4604:2: ( rule__Dynamic_array_type__TypeAssignment_2 )
            // InternalPascalParser.g:4604:3: rule__Dynamic_array_type__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Dynamic_array_type__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDynamic_array_typeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamic_array_type__Group__2__Impl"


    // $ANTLR start "rule__Array_type__Group__0"
    // InternalPascalParser.g:4613:1: rule__Array_type__Group__0 : rule__Array_type__Group__0__Impl rule__Array_type__Group__1 ;
    public final void rule__Array_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4617:1: ( rule__Array_type__Group__0__Impl rule__Array_type__Group__1 )
            // InternalPascalParser.g:4618:2: rule__Array_type__Group__0__Impl rule__Array_type__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Array_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array_type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__0"


    // $ANTLR start "rule__Array_type__Group__0__Impl"
    // InternalPascalParser.g:4625:1: rule__Array_type__Group__0__Impl : ( Array ) ;
    public final void rule__Array_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4629:1: ( ( Array ) )
            // InternalPascalParser.g:4630:1: ( Array )
            {
            // InternalPascalParser.g:4630:1: ( Array )
            // InternalPascalParser.g:4631:2: Array
            {
             before(grammarAccess.getArray_typeAccess().getArrayKeyword_0()); 
            match(input,Array,FOLLOW_2); 
             after(grammarAccess.getArray_typeAccess().getArrayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__0__Impl"


    // $ANTLR start "rule__Array_type__Group__1"
    // InternalPascalParser.g:4640:1: rule__Array_type__Group__1 : rule__Array_type__Group__1__Impl rule__Array_type__Group__2 ;
    public final void rule__Array_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4644:1: ( rule__Array_type__Group__1__Impl rule__Array_type__Group__2 )
            // InternalPascalParser.g:4645:2: rule__Array_type__Group__1__Impl rule__Array_type__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Array_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array_type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__1"


    // $ANTLR start "rule__Array_type__Group__1__Impl"
    // InternalPascalParser.g:4652:1: rule__Array_type__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__Array_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4656:1: ( ( LeftSquareBracket ) )
            // InternalPascalParser.g:4657:1: ( LeftSquareBracket )
            {
            // InternalPascalParser.g:4657:1: ( LeftSquareBracket )
            // InternalPascalParser.g:4658:2: LeftSquareBracket
            {
             before(grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__1__Impl"


    // $ANTLR start "rule__Array_type__Group__2"
    // InternalPascalParser.g:4667:1: rule__Array_type__Group__2 : rule__Array_type__Group__2__Impl rule__Array_type__Group__3 ;
    public final void rule__Array_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4671:1: ( rule__Array_type__Group__2__Impl rule__Array_type__Group__3 )
            // InternalPascalParser.g:4672:2: rule__Array_type__Group__2__Impl rule__Array_type__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Array_type__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array_type__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__2"


    // $ANTLR start "rule__Array_type__Group__2__Impl"
    // InternalPascalParser.g:4679:1: rule__Array_type__Group__2__Impl : ( ( rule__Array_type__Type_lAssignment_2 ) ) ;
    public final void rule__Array_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4683:1: ( ( ( rule__Array_type__Type_lAssignment_2 ) ) )
            // InternalPascalParser.g:4684:1: ( ( rule__Array_type__Type_lAssignment_2 ) )
            {
            // InternalPascalParser.g:4684:1: ( ( rule__Array_type__Type_lAssignment_2 ) )
            // InternalPascalParser.g:4685:2: ( rule__Array_type__Type_lAssignment_2 )
            {
             before(grammarAccess.getArray_typeAccess().getType_lAssignment_2()); 
            // InternalPascalParser.g:4686:2: ( rule__Array_type__Type_lAssignment_2 )
            // InternalPascalParser.g:4686:3: rule__Array_type__Type_lAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Array_type__Type_lAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArray_typeAccess().getType_lAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__2__Impl"


    // $ANTLR start "rule__Array_type__Group__3"
    // InternalPascalParser.g:4694:1: rule__Array_type__Group__3 : rule__Array_type__Group__3__Impl rule__Array_type__Group__4 ;
    public final void rule__Array_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4698:1: ( rule__Array_type__Group__3__Impl rule__Array_type__Group__4 )
            // InternalPascalParser.g:4699:2: rule__Array_type__Group__3__Impl rule__Array_type__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Array_type__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array_type__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__3"


    // $ANTLR start "rule__Array_type__Group__3__Impl"
    // InternalPascalParser.g:4706:1: rule__Array_type__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Array_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4710:1: ( ( RightSquareBracket ) )
            // InternalPascalParser.g:4711:1: ( RightSquareBracket )
            {
            // InternalPascalParser.g:4711:1: ( RightSquareBracket )
            // InternalPascalParser.g:4712:2: RightSquareBracket
            {
             before(grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_3()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__3__Impl"


    // $ANTLR start "rule__Array_type__Group__4"
    // InternalPascalParser.g:4721:1: rule__Array_type__Group__4 : rule__Array_type__Group__4__Impl rule__Array_type__Group__5 ;
    public final void rule__Array_type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4725:1: ( rule__Array_type__Group__4__Impl rule__Array_type__Group__5 )
            // InternalPascalParser.g:4726:2: rule__Array_type__Group__4__Impl rule__Array_type__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Array_type__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array_type__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__4"


    // $ANTLR start "rule__Array_type__Group__4__Impl"
    // InternalPascalParser.g:4733:1: rule__Array_type__Group__4__Impl : ( Of ) ;
    public final void rule__Array_type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4737:1: ( ( Of ) )
            // InternalPascalParser.g:4738:1: ( Of )
            {
            // InternalPascalParser.g:4738:1: ( Of )
            // InternalPascalParser.g:4739:2: Of
            {
             before(grammarAccess.getArray_typeAccess().getOfKeyword_4()); 
            match(input,Of,FOLLOW_2); 
             after(grammarAccess.getArray_typeAccess().getOfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__4__Impl"


    // $ANTLR start "rule__Array_type__Group__5"
    // InternalPascalParser.g:4748:1: rule__Array_type__Group__5 : rule__Array_type__Group__5__Impl ;
    public final void rule__Array_type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4752:1: ( rule__Array_type__Group__5__Impl )
            // InternalPascalParser.g:4753:2: rule__Array_type__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array_type__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__5"


    // $ANTLR start "rule__Array_type__Group__5__Impl"
    // InternalPascalParser.g:4759:1: rule__Array_type__Group__5__Impl : ( ( rule__Array_type__TypeAssignment_5 ) ) ;
    public final void rule__Array_type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4763:1: ( ( ( rule__Array_type__TypeAssignment_5 ) ) )
            // InternalPascalParser.g:4764:1: ( ( rule__Array_type__TypeAssignment_5 ) )
            {
            // InternalPascalParser.g:4764:1: ( ( rule__Array_type__TypeAssignment_5 ) )
            // InternalPascalParser.g:4765:2: ( rule__Array_type__TypeAssignment_5 )
            {
             before(grammarAccess.getArray_typeAccess().getTypeAssignment_5()); 
            // InternalPascalParser.g:4766:2: ( rule__Array_type__TypeAssignment_5 )
            // InternalPascalParser.g:4766:3: rule__Array_type__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Array_type__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getArray_typeAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__5__Impl"


    // $ANTLR start "rule__Type_list__Group__0"
    // InternalPascalParser.g:4775:1: rule__Type_list__Group__0 : rule__Type_list__Group__0__Impl rule__Type_list__Group__1 ;
    public final void rule__Type_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4779:1: ( rule__Type_list__Group__0__Impl rule__Type_list__Group__1 )
            // InternalPascalParser.g:4780:2: rule__Type_list__Group__0__Impl rule__Type_list__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Type_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_list__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_list__Group__0"


    // $ANTLR start "rule__Type_list__Group__0__Impl"
    // InternalPascalParser.g:4787:1: rule__Type_list__Group__0__Impl : ( ( rule__Type_list__IndexesAssignment_0 ) ) ;
    public final void rule__Type_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4791:1: ( ( ( rule__Type_list__IndexesAssignment_0 ) ) )
            // InternalPascalParser.g:4792:1: ( ( rule__Type_list__IndexesAssignment_0 ) )
            {
            // InternalPascalParser.g:4792:1: ( ( rule__Type_list__IndexesAssignment_0 ) )
            // InternalPascalParser.g:4793:2: ( rule__Type_list__IndexesAssignment_0 )
            {
             before(grammarAccess.getType_listAccess().getIndexesAssignment_0()); 
            // InternalPascalParser.g:4794:2: ( rule__Type_list__IndexesAssignment_0 )
            // InternalPascalParser.g:4794:3: rule__Type_list__IndexesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Type_list__IndexesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getType_listAccess().getIndexesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_list__Group__0__Impl"


    // $ANTLR start "rule__Type_list__Group__1"
    // InternalPascalParser.g:4802:1: rule__Type_list__Group__1 : rule__Type_list__Group__1__Impl ;
    public final void rule__Type_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4806:1: ( rule__Type_list__Group__1__Impl )
            // InternalPascalParser.g:4807:2: rule__Type_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_list__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_list__Group__1"


    // $ANTLR start "rule__Type_list__Group__1__Impl"
    // InternalPascalParser.g:4813:1: rule__Type_list__Group__1__Impl : ( ( rule__Type_list__Group_1__0 )* ) ;
    public final void rule__Type_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4817:1: ( ( ( rule__Type_list__Group_1__0 )* ) )
            // InternalPascalParser.g:4818:1: ( ( rule__Type_list__Group_1__0 )* )
            {
            // InternalPascalParser.g:4818:1: ( ( rule__Type_list__Group_1__0 )* )
            // InternalPascalParser.g:4819:2: ( rule__Type_list__Group_1__0 )*
            {
             before(grammarAccess.getType_listAccess().getGroup_1()); 
            // InternalPascalParser.g:4820:2: ( rule__Type_list__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==Comma) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPascalParser.g:4820:3: rule__Type_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Type_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getType_listAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_list__Group__1__Impl"


    // $ANTLR start "rule__Type_list__Group_1__0"
    // InternalPascalParser.g:4829:1: rule__Type_list__Group_1__0 : rule__Type_list__Group_1__0__Impl rule__Type_list__Group_1__1 ;
    public final void rule__Type_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4833:1: ( rule__Type_list__Group_1__0__Impl rule__Type_list__Group_1__1 )
            // InternalPascalParser.g:4834:2: rule__Type_list__Group_1__0__Impl rule__Type_list__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__Type_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_list__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_list__Group_1__0"


    // $ANTLR start "rule__Type_list__Group_1__0__Impl"
    // InternalPascalParser.g:4841:1: rule__Type_list__Group_1__0__Impl : ( Comma ) ;
    public final void rule__Type_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4845:1: ( ( Comma ) )
            // InternalPascalParser.g:4846:1: ( Comma )
            {
            // InternalPascalParser.g:4846:1: ( Comma )
            // InternalPascalParser.g:4847:2: Comma
            {
             before(grammarAccess.getType_listAccess().getCommaKeyword_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getType_listAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_list__Group_1__0__Impl"


    // $ANTLR start "rule__Type_list__Group_1__1"
    // InternalPascalParser.g:4856:1: rule__Type_list__Group_1__1 : rule__Type_list__Group_1__1__Impl ;
    public final void rule__Type_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4860:1: ( rule__Type_list__Group_1__1__Impl )
            // InternalPascalParser.g:4861:2: rule__Type_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_list__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_list__Group_1__1"


    // $ANTLR start "rule__Type_list__Group_1__1__Impl"
    // InternalPascalParser.g:4867:1: rule__Type_list__Group_1__1__Impl : ( ( rule__Type_list__IndexesAssignment_1_1 ) ) ;
    public final void rule__Type_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4871:1: ( ( ( rule__Type_list__IndexesAssignment_1_1 ) ) )
            // InternalPascalParser.g:4872:1: ( ( rule__Type_list__IndexesAssignment_1_1 ) )
            {
            // InternalPascalParser.g:4872:1: ( ( rule__Type_list__IndexesAssignment_1_1 ) )
            // InternalPascalParser.g:4873:2: ( rule__Type_list__IndexesAssignment_1_1 )
            {
             before(grammarAccess.getType_listAccess().getIndexesAssignment_1_1()); 
            // InternalPascalParser.g:4874:2: ( rule__Type_list__IndexesAssignment_1_1 )
            // InternalPascalParser.g:4874:3: rule__Type_list__IndexesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Type_list__IndexesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getType_listAccess().getIndexesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_list__Group_1__1__Impl"


    // $ANTLR start "rule__Procedure_statement__Group__0"
    // InternalPascalParser.g:4883:1: rule__Procedure_statement__Group__0 : rule__Procedure_statement__Group__0__Impl rule__Procedure_statement__Group__1 ;
    public final void rule__Procedure_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4887:1: ( rule__Procedure_statement__Group__0__Impl rule__Procedure_statement__Group__1 )
            // InternalPascalParser.g:4888:2: rule__Procedure_statement__Group__0__Impl rule__Procedure_statement__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Procedure_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_statement__Group__0"


    // $ANTLR start "rule__Procedure_statement__Group__0__Impl"
    // InternalPascalParser.g:4895:1: rule__Procedure_statement__Group__0__Impl : ( ( rule__Procedure_statement__Name_idAssignment_0 ) ) ;
    public final void rule__Procedure_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4899:1: ( ( ( rule__Procedure_statement__Name_idAssignment_0 ) ) )
            // InternalPascalParser.g:4900:1: ( ( rule__Procedure_statement__Name_idAssignment_0 ) )
            {
            // InternalPascalParser.g:4900:1: ( ( rule__Procedure_statement__Name_idAssignment_0 ) )
            // InternalPascalParser.g:4901:2: ( rule__Procedure_statement__Name_idAssignment_0 )
            {
             before(grammarAccess.getProcedure_statementAccess().getName_idAssignment_0()); 
            // InternalPascalParser.g:4902:2: ( rule__Procedure_statement__Name_idAssignment_0 )
            // InternalPascalParser.g:4902:3: rule__Procedure_statement__Name_idAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_statement__Name_idAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_statementAccess().getName_idAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_statement__Group__0__Impl"


    // $ANTLR start "rule__Procedure_statement__Group__1"
    // InternalPascalParser.g:4910:1: rule__Procedure_statement__Group__1 : rule__Procedure_statement__Group__1__Impl ;
    public final void rule__Procedure_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4914:1: ( rule__Procedure_statement__Group__1__Impl )
            // InternalPascalParser.g:4915:2: rule__Procedure_statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_statement__Group__1"


    // $ANTLR start "rule__Procedure_statement__Group__1__Impl"
    // InternalPascalParser.g:4921:1: rule__Procedure_statement__Group__1__Impl : ( ( rule__Procedure_statement__Group_1__0 )? ) ;
    public final void rule__Procedure_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4925:1: ( ( ( rule__Procedure_statement__Group_1__0 )? ) )
            // InternalPascalParser.g:4926:1: ( ( rule__Procedure_statement__Group_1__0 )? )
            {
            // InternalPascalParser.g:4926:1: ( ( rule__Procedure_statement__Group_1__0 )? )
            // InternalPascalParser.g:4927:2: ( rule__Procedure_statement__Group_1__0 )?
            {
             before(grammarAccess.getProcedure_statementAccess().getGroup_1()); 
            // InternalPascalParser.g:4928:2: ( rule__Procedure_statement__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LeftParenthesis) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPascalParser.g:4928:3: rule__Procedure_statement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Procedure_statement__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcedure_statementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_statement__Group__1__Impl"


    // $ANTLR start "rule__Procedure_statement__Group_1__0"
    // InternalPascalParser.g:4937:1: rule__Procedure_statement__Group_1__0 : rule__Procedure_statement__Group_1__0__Impl rule__Procedure_statement__Group_1__1 ;
    public final void rule__Procedure_statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4941:1: ( rule__Procedure_statement__Group_1__0__Impl rule__Procedure_statement__Group_1__1 )
            // InternalPascalParser.g:4942:2: rule__Procedure_statement__Group_1__0__Impl rule__Procedure_statement__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Procedure_statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_statement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_statement__Group_1__0"


    // $ANTLR start "rule__Procedure_statement__Group_1__0__Impl"
    // InternalPascalParser.g:4949:1: rule__Procedure_statement__Group_1__0__Impl : ( LeftParenthesis ) ;
    public final void rule__Procedure_statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4953:1: ( ( LeftParenthesis ) )
            // InternalPascalParser.g:4954:1: ( LeftParenthesis )
            {
            // InternalPascalParser.g:4954:1: ( LeftParenthesis )
            // InternalPascalParser.g:4955:2: LeftParenthesis
            {
             before(grammarAccess.getProcedure_statementAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getProcedure_statementAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_statement__Group_1__0__Impl"


    // $ANTLR start "rule__Procedure_statement__Group_1__1"
    // InternalPascalParser.g:4964:1: rule__Procedure_statement__Group_1__1 : rule__Procedure_statement__Group_1__1__Impl rule__Procedure_statement__Group_1__2 ;
    public final void rule__Procedure_statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4968:1: ( rule__Procedure_statement__Group_1__1__Impl rule__Procedure_statement__Group_1__2 )
            // InternalPascalParser.g:4969:2: rule__Procedure_statement__Group_1__1__Impl rule__Procedure_statement__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__Procedure_statement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_statement__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_statement__Group_1__1"


    // $ANTLR start "rule__Procedure_statement__Group_1__1__Impl"
    // InternalPascalParser.g:4976:1: rule__Procedure_statement__Group_1__1__Impl : ( ( rule__Procedure_statement__ParametersAssignment_1_1 ) ) ;
    public final void rule__Procedure_statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4980:1: ( ( ( rule__Procedure_statement__ParametersAssignment_1_1 ) ) )
            // InternalPascalParser.g:4981:1: ( ( rule__Procedure_statement__ParametersAssignment_1_1 ) )
            {
            // InternalPascalParser.g:4981:1: ( ( rule__Procedure_statement__ParametersAssignment_1_1 ) )
            // InternalPascalParser.g:4982:2: ( rule__Procedure_statement__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getProcedure_statementAccess().getParametersAssignment_1_1()); 
            // InternalPascalParser.g:4983:2: ( rule__Procedure_statement__ParametersAssignment_1_1 )
            // InternalPascalParser.g:4983:3: rule__Procedure_statement__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_statement__ParametersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_statementAccess().getParametersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_statement__Group_1__1__Impl"


    // $ANTLR start "rule__Procedure_statement__Group_1__2"
    // InternalPascalParser.g:4991:1: rule__Procedure_statement__Group_1__2 : rule__Procedure_statement__Group_1__2__Impl ;
    public final void rule__Procedure_statement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:4995:1: ( rule__Procedure_statement__Group_1__2__Impl )
            // InternalPascalParser.g:4996:2: rule__Procedure_statement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_statement__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_statement__Group_1__2"


    // $ANTLR start "rule__Procedure_statement__Group_1__2__Impl"
    // InternalPascalParser.g:5002:1: rule__Procedure_statement__Group_1__2__Impl : ( RightParenthesis ) ;
    public final void rule__Procedure_statement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5006:1: ( ( RightParenthesis ) )
            // InternalPascalParser.g:5007:1: ( RightParenthesis )
            {
            // InternalPascalParser.g:5007:1: ( RightParenthesis )
            // InternalPascalParser.g:5008:2: RightParenthesis
            {
             before(grammarAccess.getProcedure_statementAccess().getRightParenthesisKeyword_1_2()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getProcedure_statementAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_statement__Group_1__2__Impl"


    // $ANTLR start "rule__Parameter_list__Group__0"
    // InternalPascalParser.g:5018:1: rule__Parameter_list__Group__0 : rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 ;
    public final void rule__Parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5022:1: ( rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 )
            // InternalPascalParser.g:5023:2: rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Parameter_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group__0"


    // $ANTLR start "rule__Parameter_list__Group__0__Impl"
    // InternalPascalParser.g:5030:1: rule__Parameter_list__Group__0__Impl : ( ( rule__Parameter_list__ParametersAssignment_0 ) ) ;
    public final void rule__Parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5034:1: ( ( ( rule__Parameter_list__ParametersAssignment_0 ) ) )
            // InternalPascalParser.g:5035:1: ( ( rule__Parameter_list__ParametersAssignment_0 ) )
            {
            // InternalPascalParser.g:5035:1: ( ( rule__Parameter_list__ParametersAssignment_0 ) )
            // InternalPascalParser.g:5036:2: ( rule__Parameter_list__ParametersAssignment_0 )
            {
             before(grammarAccess.getParameter_listAccess().getParametersAssignment_0()); 
            // InternalPascalParser.g:5037:2: ( rule__Parameter_list__ParametersAssignment_0 )
            // InternalPascalParser.g:5037:3: rule__Parameter_list__ParametersAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_list__ParametersAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameter_listAccess().getParametersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group__0__Impl"


    // $ANTLR start "rule__Parameter_list__Group__1"
    // InternalPascalParser.g:5045:1: rule__Parameter_list__Group__1 : rule__Parameter_list__Group__1__Impl ;
    public final void rule__Parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5049:1: ( rule__Parameter_list__Group__1__Impl )
            // InternalPascalParser.g:5050:2: rule__Parameter_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group__1"


    // $ANTLR start "rule__Parameter_list__Group__1__Impl"
    // InternalPascalParser.g:5056:1: rule__Parameter_list__Group__1__Impl : ( ( rule__Parameter_list__Group_1__0 )* ) ;
    public final void rule__Parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5060:1: ( ( ( rule__Parameter_list__Group_1__0 )* ) )
            // InternalPascalParser.g:5061:1: ( ( rule__Parameter_list__Group_1__0 )* )
            {
            // InternalPascalParser.g:5061:1: ( ( rule__Parameter_list__Group_1__0 )* )
            // InternalPascalParser.g:5062:2: ( rule__Parameter_list__Group_1__0 )*
            {
             before(grammarAccess.getParameter_listAccess().getGroup_1()); 
            // InternalPascalParser.g:5063:2: ( rule__Parameter_list__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==Comma) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPascalParser.g:5063:3: rule__Parameter_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Parameter_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getParameter_listAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group__1__Impl"


    // $ANTLR start "rule__Parameter_list__Group_1__0"
    // InternalPascalParser.g:5072:1: rule__Parameter_list__Group_1__0 : rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 ;
    public final void rule__Parameter_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5076:1: ( rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 )
            // InternalPascalParser.g:5077:2: rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Parameter_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group_1__0"


    // $ANTLR start "rule__Parameter_list__Group_1__0__Impl"
    // InternalPascalParser.g:5084:1: rule__Parameter_list__Group_1__0__Impl : ( Comma ) ;
    public final void rule__Parameter_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5088:1: ( ( Comma ) )
            // InternalPascalParser.g:5089:1: ( Comma )
            {
            // InternalPascalParser.g:5089:1: ( Comma )
            // InternalPascalParser.g:5090:2: Comma
            {
             before(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group_1__0__Impl"


    // $ANTLR start "rule__Parameter_list__Group_1__1"
    // InternalPascalParser.g:5099:1: rule__Parameter_list__Group_1__1 : rule__Parameter_list__Group_1__1__Impl ;
    public final void rule__Parameter_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5103:1: ( rule__Parameter_list__Group_1__1__Impl )
            // InternalPascalParser.g:5104:2: rule__Parameter_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_list__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group_1__1"


    // $ANTLR start "rule__Parameter_list__Group_1__1__Impl"
    // InternalPascalParser.g:5110:1: rule__Parameter_list__Group_1__1__Impl : ( ( rule__Parameter_list__ParametersAssignment_1_1 ) ) ;
    public final void rule__Parameter_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5114:1: ( ( ( rule__Parameter_list__ParametersAssignment_1_1 ) ) )
            // InternalPascalParser.g:5115:1: ( ( rule__Parameter_list__ParametersAssignment_1_1 ) )
            {
            // InternalPascalParser.g:5115:1: ( ( rule__Parameter_list__ParametersAssignment_1_1 ) )
            // InternalPascalParser.g:5116:2: ( rule__Parameter_list__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getParameter_listAccess().getParametersAssignment_1_1()); 
            // InternalPascalParser.g:5117:2: ( rule__Parameter_list__ParametersAssignment_1_1 )
            // InternalPascalParser.g:5117:3: rule__Parameter_list__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_list__ParametersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParameter_listAccess().getParametersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group_1__1__Impl"


    // $ANTLR start "rule__Case_statement__Group__0"
    // InternalPascalParser.g:5126:1: rule__Case_statement__Group__0 : rule__Case_statement__Group__0__Impl rule__Case_statement__Group__1 ;
    public final void rule__Case_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5130:1: ( rule__Case_statement__Group__0__Impl rule__Case_statement__Group__1 )
            // InternalPascalParser.g:5131:2: rule__Case_statement__Group__0__Impl rule__Case_statement__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Case_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case_statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group__0"


    // $ANTLR start "rule__Case_statement__Group__0__Impl"
    // InternalPascalParser.g:5138:1: rule__Case_statement__Group__0__Impl : ( Case ) ;
    public final void rule__Case_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5142:1: ( ( Case ) )
            // InternalPascalParser.g:5143:1: ( Case )
            {
            // InternalPascalParser.g:5143:1: ( Case )
            // InternalPascalParser.g:5144:2: Case
            {
             before(grammarAccess.getCase_statementAccess().getCaseKeyword_0()); 
            match(input,Case,FOLLOW_2); 
             after(grammarAccess.getCase_statementAccess().getCaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group__0__Impl"


    // $ANTLR start "rule__Case_statement__Group__1"
    // InternalPascalParser.g:5153:1: rule__Case_statement__Group__1 : rule__Case_statement__Group__1__Impl rule__Case_statement__Group__2 ;
    public final void rule__Case_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5157:1: ( rule__Case_statement__Group__1__Impl rule__Case_statement__Group__2 )
            // InternalPascalParser.g:5158:2: rule__Case_statement__Group__1__Impl rule__Case_statement__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Case_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case_statement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group__1"


    // $ANTLR start "rule__Case_statement__Group__1__Impl"
    // InternalPascalParser.g:5165:1: rule__Case_statement__Group__1__Impl : ( ( rule__Case_statement__ExpAssignment_1 ) ) ;
    public final void rule__Case_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5169:1: ( ( ( rule__Case_statement__ExpAssignment_1 ) ) )
            // InternalPascalParser.g:5170:1: ( ( rule__Case_statement__ExpAssignment_1 ) )
            {
            // InternalPascalParser.g:5170:1: ( ( rule__Case_statement__ExpAssignment_1 ) )
            // InternalPascalParser.g:5171:2: ( rule__Case_statement__ExpAssignment_1 )
            {
             before(grammarAccess.getCase_statementAccess().getExpAssignment_1()); 
            // InternalPascalParser.g:5172:2: ( rule__Case_statement__ExpAssignment_1 )
            // InternalPascalParser.g:5172:3: rule__Case_statement__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Case_statement__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCase_statementAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group__1__Impl"


    // $ANTLR start "rule__Case_statement__Group__2"
    // InternalPascalParser.g:5180:1: rule__Case_statement__Group__2 : rule__Case_statement__Group__2__Impl rule__Case_statement__Group__3 ;
    public final void rule__Case_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5184:1: ( rule__Case_statement__Group__2__Impl rule__Case_statement__Group__3 )
            // InternalPascalParser.g:5185:2: rule__Case_statement__Group__2__Impl rule__Case_statement__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Case_statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case_statement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group__2"


    // $ANTLR start "rule__Case_statement__Group__2__Impl"
    // InternalPascalParser.g:5192:1: rule__Case_statement__Group__2__Impl : ( Of ) ;
    public final void rule__Case_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5196:1: ( ( Of ) )
            // InternalPascalParser.g:5197:1: ( Of )
            {
            // InternalPascalParser.g:5197:1: ( Of )
            // InternalPascalParser.g:5198:2: Of
            {
             before(grammarAccess.getCase_statementAccess().getOfKeyword_2()); 
            match(input,Of,FOLLOW_2); 
             after(grammarAccess.getCase_statementAccess().getOfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group__2__Impl"


    // $ANTLR start "rule__Case_statement__Group__3"
    // InternalPascalParser.g:5207:1: rule__Case_statement__Group__3 : rule__Case_statement__Group__3__Impl rule__Case_statement__Group__4 ;
    public final void rule__Case_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5211:1: ( rule__Case_statement__Group__3__Impl rule__Case_statement__Group__4 )
            // InternalPascalParser.g:5212:2: rule__Case_statement__Group__3__Impl rule__Case_statement__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Case_statement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case_statement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group__3"


    // $ANTLR start "rule__Case_statement__Group__3__Impl"
    // InternalPascalParser.g:5219:1: rule__Case_statement__Group__3__Impl : ( ( rule__Case_statement__Case_listAssignment_3 ) ) ;
    public final void rule__Case_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5223:1: ( ( ( rule__Case_statement__Case_listAssignment_3 ) ) )
            // InternalPascalParser.g:5224:1: ( ( rule__Case_statement__Case_listAssignment_3 ) )
            {
            // InternalPascalParser.g:5224:1: ( ( rule__Case_statement__Case_listAssignment_3 ) )
            // InternalPascalParser.g:5225:2: ( rule__Case_statement__Case_listAssignment_3 )
            {
             before(grammarAccess.getCase_statementAccess().getCase_listAssignment_3()); 
            // InternalPascalParser.g:5226:2: ( rule__Case_statement__Case_listAssignment_3 )
            // InternalPascalParser.g:5226:3: rule__Case_statement__Case_listAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Case_statement__Case_listAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCase_statementAccess().getCase_listAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group__3__Impl"


    // $ANTLR start "rule__Case_statement__Group__4"
    // InternalPascalParser.g:5234:1: rule__Case_statement__Group__4 : rule__Case_statement__Group__4__Impl rule__Case_statement__Group__5 ;
    public final void rule__Case_statement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5238:1: ( rule__Case_statement__Group__4__Impl rule__Case_statement__Group__5 )
            // InternalPascalParser.g:5239:2: rule__Case_statement__Group__4__Impl rule__Case_statement__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__Case_statement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case_statement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group__4"


    // $ANTLR start "rule__Case_statement__Group__4__Impl"
    // InternalPascalParser.g:5246:1: rule__Case_statement__Group__4__Impl : ( ( rule__Case_statement__Group_4__0 )* ) ;
    public final void rule__Case_statement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5250:1: ( ( ( rule__Case_statement__Group_4__0 )* ) )
            // InternalPascalParser.g:5251:1: ( ( rule__Case_statement__Group_4__0 )* )
            {
            // InternalPascalParser.g:5251:1: ( ( rule__Case_statement__Group_4__0 )* )
            // InternalPascalParser.g:5252:2: ( rule__Case_statement__Group_4__0 )*
            {
             before(grammarAccess.getCase_statementAccess().getGroup_4()); 
            // InternalPascalParser.g:5253:2: ( rule__Case_statement__Group_4__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==Semicolon) ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==False||LA38_1==True||(LA38_1>=RULE_PLUS && LA38_1<=RULE_MINUS)||LA38_1==RULE_NUM_INT||(LA38_1>=RULE_ID && LA38_1<=RULE_STRING)) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // InternalPascalParser.g:5253:3: rule__Case_statement__Group_4__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Case_statement__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getCase_statementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group__4__Impl"


    // $ANTLR start "rule__Case_statement__Group__5"
    // InternalPascalParser.g:5261:1: rule__Case_statement__Group__5 : rule__Case_statement__Group__5__Impl rule__Case_statement__Group__6 ;
    public final void rule__Case_statement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5265:1: ( rule__Case_statement__Group__5__Impl rule__Case_statement__Group__6 )
            // InternalPascalParser.g:5266:2: rule__Case_statement__Group__5__Impl rule__Case_statement__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__Case_statement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case_statement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group__5"


    // $ANTLR start "rule__Case_statement__Group__5__Impl"
    // InternalPascalParser.g:5273:1: rule__Case_statement__Group__5__Impl : ( ( Semicolon )? ) ;
    public final void rule__Case_statement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5277:1: ( ( ( Semicolon )? ) )
            // InternalPascalParser.g:5278:1: ( ( Semicolon )? )
            {
            // InternalPascalParser.g:5278:1: ( ( Semicolon )? )
            // InternalPascalParser.g:5279:2: ( Semicolon )?
            {
             before(grammarAccess.getCase_statementAccess().getSemicolonKeyword_5()); 
            // InternalPascalParser.g:5280:2: ( Semicolon )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Semicolon) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPascalParser.g:5280:3: Semicolon
                    {
                    match(input,Semicolon,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCase_statementAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group__5__Impl"


    // $ANTLR start "rule__Case_statement__Group__6"
    // InternalPascalParser.g:5288:1: rule__Case_statement__Group__6 : rule__Case_statement__Group__6__Impl rule__Case_statement__Group__7 ;
    public final void rule__Case_statement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5292:1: ( rule__Case_statement__Group__6__Impl rule__Case_statement__Group__7 )
            // InternalPascalParser.g:5293:2: rule__Case_statement__Group__6__Impl rule__Case_statement__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__Case_statement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case_statement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group__6"


    // $ANTLR start "rule__Case_statement__Group__6__Impl"
    // InternalPascalParser.g:5300:1: rule__Case_statement__Group__6__Impl : ( ( rule__Case_statement__Group_6__0 )? ) ;
    public final void rule__Case_statement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5304:1: ( ( ( rule__Case_statement__Group_6__0 )? ) )
            // InternalPascalParser.g:5305:1: ( ( rule__Case_statement__Group_6__0 )? )
            {
            // InternalPascalParser.g:5305:1: ( ( rule__Case_statement__Group_6__0 )? )
            // InternalPascalParser.g:5306:2: ( rule__Case_statement__Group_6__0 )?
            {
             before(grammarAccess.getCase_statementAccess().getGroup_6()); 
            // InternalPascalParser.g:5307:2: ( rule__Case_statement__Group_6__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Else) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPascalParser.g:5307:3: rule__Case_statement__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Case_statement__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCase_statementAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group__6__Impl"


    // $ANTLR start "rule__Case_statement__Group__7"
    // InternalPascalParser.g:5315:1: rule__Case_statement__Group__7 : rule__Case_statement__Group__7__Impl ;
    public final void rule__Case_statement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5319:1: ( rule__Case_statement__Group__7__Impl )
            // InternalPascalParser.g:5320:2: rule__Case_statement__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case_statement__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group__7"


    // $ANTLR start "rule__Case_statement__Group__7__Impl"
    // InternalPascalParser.g:5326:1: rule__Case_statement__Group__7__Impl : ( End ) ;
    public final void rule__Case_statement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5330:1: ( ( End ) )
            // InternalPascalParser.g:5331:1: ( End )
            {
            // InternalPascalParser.g:5331:1: ( End )
            // InternalPascalParser.g:5332:2: End
            {
             before(grammarAccess.getCase_statementAccess().getEndKeyword_7()); 
            match(input,End,FOLLOW_2); 
             after(grammarAccess.getCase_statementAccess().getEndKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group__7__Impl"


    // $ANTLR start "rule__Case_statement__Group_4__0"
    // InternalPascalParser.g:5342:1: rule__Case_statement__Group_4__0 : rule__Case_statement__Group_4__0__Impl rule__Case_statement__Group_4__1 ;
    public final void rule__Case_statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5346:1: ( rule__Case_statement__Group_4__0__Impl rule__Case_statement__Group_4__1 )
            // InternalPascalParser.g:5347:2: rule__Case_statement__Group_4__0__Impl rule__Case_statement__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Case_statement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case_statement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group_4__0"


    // $ANTLR start "rule__Case_statement__Group_4__0__Impl"
    // InternalPascalParser.g:5354:1: rule__Case_statement__Group_4__0__Impl : ( Semicolon ) ;
    public final void rule__Case_statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5358:1: ( ( Semicolon ) )
            // InternalPascalParser.g:5359:1: ( Semicolon )
            {
            // InternalPascalParser.g:5359:1: ( Semicolon )
            // InternalPascalParser.g:5360:2: Semicolon
            {
             before(grammarAccess.getCase_statementAccess().getSemicolonKeyword_4_0()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getCase_statementAccess().getSemicolonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group_4__0__Impl"


    // $ANTLR start "rule__Case_statement__Group_4__1"
    // InternalPascalParser.g:5369:1: rule__Case_statement__Group_4__1 : rule__Case_statement__Group_4__1__Impl ;
    public final void rule__Case_statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5373:1: ( rule__Case_statement__Group_4__1__Impl )
            // InternalPascalParser.g:5374:2: rule__Case_statement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case_statement__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group_4__1"


    // $ANTLR start "rule__Case_statement__Group_4__1__Impl"
    // InternalPascalParser.g:5380:1: rule__Case_statement__Group_4__1__Impl : ( ( rule__Case_statement__Case_listAssignment_4_1 ) ) ;
    public final void rule__Case_statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5384:1: ( ( ( rule__Case_statement__Case_listAssignment_4_1 ) ) )
            // InternalPascalParser.g:5385:1: ( ( rule__Case_statement__Case_listAssignment_4_1 ) )
            {
            // InternalPascalParser.g:5385:1: ( ( rule__Case_statement__Case_listAssignment_4_1 ) )
            // InternalPascalParser.g:5386:2: ( rule__Case_statement__Case_listAssignment_4_1 )
            {
             before(grammarAccess.getCase_statementAccess().getCase_listAssignment_4_1()); 
            // InternalPascalParser.g:5387:2: ( rule__Case_statement__Case_listAssignment_4_1 )
            // InternalPascalParser.g:5387:3: rule__Case_statement__Case_listAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Case_statement__Case_listAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCase_statementAccess().getCase_listAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group_4__1__Impl"


    // $ANTLR start "rule__Case_statement__Group_6__0"
    // InternalPascalParser.g:5396:1: rule__Case_statement__Group_6__0 : rule__Case_statement__Group_6__0__Impl rule__Case_statement__Group_6__1 ;
    public final void rule__Case_statement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5400:1: ( rule__Case_statement__Group_6__0__Impl rule__Case_statement__Group_6__1 )
            // InternalPascalParser.g:5401:2: rule__Case_statement__Group_6__0__Impl rule__Case_statement__Group_6__1
            {
            pushFollow(FOLLOW_17);
            rule__Case_statement__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case_statement__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group_6__0"


    // $ANTLR start "rule__Case_statement__Group_6__0__Impl"
    // InternalPascalParser.g:5408:1: rule__Case_statement__Group_6__0__Impl : ( Else ) ;
    public final void rule__Case_statement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5412:1: ( ( Else ) )
            // InternalPascalParser.g:5413:1: ( Else )
            {
            // InternalPascalParser.g:5413:1: ( Else )
            // InternalPascalParser.g:5414:2: Else
            {
             before(grammarAccess.getCase_statementAccess().getElseKeyword_6_0()); 
            match(input,Else,FOLLOW_2); 
             after(grammarAccess.getCase_statementAccess().getElseKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group_6__0__Impl"


    // $ANTLR start "rule__Case_statement__Group_6__1"
    // InternalPascalParser.g:5423:1: rule__Case_statement__Group_6__1 : rule__Case_statement__Group_6__1__Impl ;
    public final void rule__Case_statement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5427:1: ( rule__Case_statement__Group_6__1__Impl )
            // InternalPascalParser.g:5428:2: rule__Case_statement__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case_statement__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group_6__1"


    // $ANTLR start "rule__Case_statement__Group_6__1__Impl"
    // InternalPascalParser.g:5434:1: rule__Case_statement__Group_6__1__Impl : ( ( rule__Case_statement__Case_statementsAssignment_6_1 ) ) ;
    public final void rule__Case_statement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5438:1: ( ( ( rule__Case_statement__Case_statementsAssignment_6_1 ) ) )
            // InternalPascalParser.g:5439:1: ( ( rule__Case_statement__Case_statementsAssignment_6_1 ) )
            {
            // InternalPascalParser.g:5439:1: ( ( rule__Case_statement__Case_statementsAssignment_6_1 ) )
            // InternalPascalParser.g:5440:2: ( rule__Case_statement__Case_statementsAssignment_6_1 )
            {
             before(grammarAccess.getCase_statementAccess().getCase_statementsAssignment_6_1()); 
            // InternalPascalParser.g:5441:2: ( rule__Case_statement__Case_statementsAssignment_6_1 )
            // InternalPascalParser.g:5441:3: rule__Case_statement__Case_statementsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Case_statement__Case_statementsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCase_statementAccess().getCase_statementsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Group_6__1__Impl"


    // $ANTLR start "rule__Case_list_element__Group__0"
    // InternalPascalParser.g:5450:1: rule__Case_list_element__Group__0 : rule__Case_list_element__Group__0__Impl rule__Case_list_element__Group__1 ;
    public final void rule__Case_list_element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5454:1: ( rule__Case_list_element__Group__0__Impl rule__Case_list_element__Group__1 )
            // InternalPascalParser.g:5455:2: rule__Case_list_element__Group__0__Impl rule__Case_list_element__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Case_list_element__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case_list_element__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_list_element__Group__0"


    // $ANTLR start "rule__Case_list_element__Group__0__Impl"
    // InternalPascalParser.g:5462:1: rule__Case_list_element__Group__0__Impl : ( ( rule__Case_list_element__ConstsAssignment_0 ) ) ;
    public final void rule__Case_list_element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5466:1: ( ( ( rule__Case_list_element__ConstsAssignment_0 ) ) )
            // InternalPascalParser.g:5467:1: ( ( rule__Case_list_element__ConstsAssignment_0 ) )
            {
            // InternalPascalParser.g:5467:1: ( ( rule__Case_list_element__ConstsAssignment_0 ) )
            // InternalPascalParser.g:5468:2: ( rule__Case_list_element__ConstsAssignment_0 )
            {
             before(grammarAccess.getCase_list_elementAccess().getConstsAssignment_0()); 
            // InternalPascalParser.g:5469:2: ( rule__Case_list_element__ConstsAssignment_0 )
            // InternalPascalParser.g:5469:3: rule__Case_list_element__ConstsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Case_list_element__ConstsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCase_list_elementAccess().getConstsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_list_element__Group__0__Impl"


    // $ANTLR start "rule__Case_list_element__Group__1"
    // InternalPascalParser.g:5477:1: rule__Case_list_element__Group__1 : rule__Case_list_element__Group__1__Impl rule__Case_list_element__Group__2 ;
    public final void rule__Case_list_element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5481:1: ( rule__Case_list_element__Group__1__Impl rule__Case_list_element__Group__2 )
            // InternalPascalParser.g:5482:2: rule__Case_list_element__Group__1__Impl rule__Case_list_element__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Case_list_element__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case_list_element__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_list_element__Group__1"


    // $ANTLR start "rule__Case_list_element__Group__1__Impl"
    // InternalPascalParser.g:5489:1: rule__Case_list_element__Group__1__Impl : ( Colon ) ;
    public final void rule__Case_list_element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5493:1: ( ( Colon ) )
            // InternalPascalParser.g:5494:1: ( Colon )
            {
            // InternalPascalParser.g:5494:1: ( Colon )
            // InternalPascalParser.g:5495:2: Colon
            {
             before(grammarAccess.getCase_list_elementAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCase_list_elementAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_list_element__Group__1__Impl"


    // $ANTLR start "rule__Case_list_element__Group__2"
    // InternalPascalParser.g:5504:1: rule__Case_list_element__Group__2 : rule__Case_list_element__Group__2__Impl ;
    public final void rule__Case_list_element__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5508:1: ( rule__Case_list_element__Group__2__Impl )
            // InternalPascalParser.g:5509:2: rule__Case_list_element__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case_list_element__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_list_element__Group__2"


    // $ANTLR start "rule__Case_list_element__Group__2__Impl"
    // InternalPascalParser.g:5515:1: rule__Case_list_element__Group__2__Impl : ( ( rule__Case_list_element__Case_statementAssignment_2 ) ) ;
    public final void rule__Case_list_element__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5519:1: ( ( ( rule__Case_list_element__Case_statementAssignment_2 ) ) )
            // InternalPascalParser.g:5520:1: ( ( rule__Case_list_element__Case_statementAssignment_2 ) )
            {
            // InternalPascalParser.g:5520:1: ( ( rule__Case_list_element__Case_statementAssignment_2 ) )
            // InternalPascalParser.g:5521:2: ( rule__Case_list_element__Case_statementAssignment_2 )
            {
             before(grammarAccess.getCase_list_elementAccess().getCase_statementAssignment_2()); 
            // InternalPascalParser.g:5522:2: ( rule__Case_list_element__Case_statementAssignment_2 )
            // InternalPascalParser.g:5522:3: rule__Case_list_element__Case_statementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Case_list_element__Case_statementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCase_list_elementAccess().getCase_statementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_list_element__Group__2__Impl"


    // $ANTLR start "rule__Const_list__Group__0"
    // InternalPascalParser.g:5531:1: rule__Const_list__Group__0 : rule__Const_list__Group__0__Impl rule__Const_list__Group__1 ;
    public final void rule__Const_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5535:1: ( rule__Const_list__Group__0__Impl rule__Const_list__Group__1 )
            // InternalPascalParser.g:5536:2: rule__Const_list__Group__0__Impl rule__Const_list__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Const_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Const_list__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const_list__Group__0"


    // $ANTLR start "rule__Const_list__Group__0__Impl"
    // InternalPascalParser.g:5543:1: rule__Const_list__Group__0__Impl : ( ( rule__Const_list__ConstantsAssignment_0 ) ) ;
    public final void rule__Const_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5547:1: ( ( ( rule__Const_list__ConstantsAssignment_0 ) ) )
            // InternalPascalParser.g:5548:1: ( ( rule__Const_list__ConstantsAssignment_0 ) )
            {
            // InternalPascalParser.g:5548:1: ( ( rule__Const_list__ConstantsAssignment_0 ) )
            // InternalPascalParser.g:5549:2: ( rule__Const_list__ConstantsAssignment_0 )
            {
             before(grammarAccess.getConst_listAccess().getConstantsAssignment_0()); 
            // InternalPascalParser.g:5550:2: ( rule__Const_list__ConstantsAssignment_0 )
            // InternalPascalParser.g:5550:3: rule__Const_list__ConstantsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Const_list__ConstantsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConst_listAccess().getConstantsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const_list__Group__0__Impl"


    // $ANTLR start "rule__Const_list__Group__1"
    // InternalPascalParser.g:5558:1: rule__Const_list__Group__1 : rule__Const_list__Group__1__Impl ;
    public final void rule__Const_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5562:1: ( rule__Const_list__Group__1__Impl )
            // InternalPascalParser.g:5563:2: rule__Const_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Const_list__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const_list__Group__1"


    // $ANTLR start "rule__Const_list__Group__1__Impl"
    // InternalPascalParser.g:5569:1: rule__Const_list__Group__1__Impl : ( ( rule__Const_list__Group_1__0 )* ) ;
    public final void rule__Const_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5573:1: ( ( ( rule__Const_list__Group_1__0 )* ) )
            // InternalPascalParser.g:5574:1: ( ( rule__Const_list__Group_1__0 )* )
            {
            // InternalPascalParser.g:5574:1: ( ( rule__Const_list__Group_1__0 )* )
            // InternalPascalParser.g:5575:2: ( rule__Const_list__Group_1__0 )*
            {
             before(grammarAccess.getConst_listAccess().getGroup_1()); 
            // InternalPascalParser.g:5576:2: ( rule__Const_list__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==Comma) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPascalParser.g:5576:3: rule__Const_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Const_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getConst_listAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const_list__Group__1__Impl"


    // $ANTLR start "rule__Const_list__Group_1__0"
    // InternalPascalParser.g:5585:1: rule__Const_list__Group_1__0 : rule__Const_list__Group_1__0__Impl rule__Const_list__Group_1__1 ;
    public final void rule__Const_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5589:1: ( rule__Const_list__Group_1__0__Impl rule__Const_list__Group_1__1 )
            // InternalPascalParser.g:5590:2: rule__Const_list__Group_1__0__Impl rule__Const_list__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Const_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Const_list__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const_list__Group_1__0"


    // $ANTLR start "rule__Const_list__Group_1__0__Impl"
    // InternalPascalParser.g:5597:1: rule__Const_list__Group_1__0__Impl : ( Comma ) ;
    public final void rule__Const_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5601:1: ( ( Comma ) )
            // InternalPascalParser.g:5602:1: ( Comma )
            {
            // InternalPascalParser.g:5602:1: ( Comma )
            // InternalPascalParser.g:5603:2: Comma
            {
             before(grammarAccess.getConst_listAccess().getCommaKeyword_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getConst_listAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const_list__Group_1__0__Impl"


    // $ANTLR start "rule__Const_list__Group_1__1"
    // InternalPascalParser.g:5612:1: rule__Const_list__Group_1__1 : rule__Const_list__Group_1__1__Impl ;
    public final void rule__Const_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5616:1: ( rule__Const_list__Group_1__1__Impl )
            // InternalPascalParser.g:5617:2: rule__Const_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Const_list__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const_list__Group_1__1"


    // $ANTLR start "rule__Const_list__Group_1__1__Impl"
    // InternalPascalParser.g:5623:1: rule__Const_list__Group_1__1__Impl : ( ( rule__Const_list__ConstantsAssignment_1_1 ) ) ;
    public final void rule__Const_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5627:1: ( ( ( rule__Const_list__ConstantsAssignment_1_1 ) ) )
            // InternalPascalParser.g:5628:1: ( ( rule__Const_list__ConstantsAssignment_1_1 ) )
            {
            // InternalPascalParser.g:5628:1: ( ( rule__Const_list__ConstantsAssignment_1_1 ) )
            // InternalPascalParser.g:5629:2: ( rule__Const_list__ConstantsAssignment_1_1 )
            {
             before(grammarAccess.getConst_listAccess().getConstantsAssignment_1_1()); 
            // InternalPascalParser.g:5630:2: ( rule__Const_list__ConstantsAssignment_1_1 )
            // InternalPascalParser.g:5630:3: rule__Const_list__ConstantsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Const_list__ConstantsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConst_listAccess().getConstantsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const_list__Group_1__1__Impl"


    // $ANTLR start "rule__Procedure_and_function_declaration_part__Group__0"
    // InternalPascalParser.g:5639:1: rule__Procedure_and_function_declaration_part__Group__0 : rule__Procedure_and_function_declaration_part__Group__0__Impl rule__Procedure_and_function_declaration_part__Group__1 ;
    public final void rule__Procedure_and_function_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5643:1: ( rule__Procedure_and_function_declaration_part__Group__0__Impl rule__Procedure_and_function_declaration_part__Group__1 )
            // InternalPascalParser.g:5644:2: rule__Procedure_and_function_declaration_part__Group__0__Impl rule__Procedure_and_function_declaration_part__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Procedure_and_function_declaration_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_and_function_declaration_part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_and_function_declaration_part__Group__0"


    // $ANTLR start "rule__Procedure_and_function_declaration_part__Group__0__Impl"
    // InternalPascalParser.g:5651:1: rule__Procedure_and_function_declaration_part__Group__0__Impl : ( ( rule__Procedure_and_function_declaration_part__SubroutineAssignment_0 ) ) ;
    public final void rule__Procedure_and_function_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5655:1: ( ( ( rule__Procedure_and_function_declaration_part__SubroutineAssignment_0 ) ) )
            // InternalPascalParser.g:5656:1: ( ( rule__Procedure_and_function_declaration_part__SubroutineAssignment_0 ) )
            {
            // InternalPascalParser.g:5656:1: ( ( rule__Procedure_and_function_declaration_part__SubroutineAssignment_0 ) )
            // InternalPascalParser.g:5657:2: ( rule__Procedure_and_function_declaration_part__SubroutineAssignment_0 )
            {
             before(grammarAccess.getProcedure_and_function_declaration_partAccess().getSubroutineAssignment_0()); 
            // InternalPascalParser.g:5658:2: ( rule__Procedure_and_function_declaration_part__SubroutineAssignment_0 )
            // InternalPascalParser.g:5658:3: rule__Procedure_and_function_declaration_part__SubroutineAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_and_function_declaration_part__SubroutineAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_and_function_declaration_partAccess().getSubroutineAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_and_function_declaration_part__Group__0__Impl"


    // $ANTLR start "rule__Procedure_and_function_declaration_part__Group__1"
    // InternalPascalParser.g:5666:1: rule__Procedure_and_function_declaration_part__Group__1 : rule__Procedure_and_function_declaration_part__Group__1__Impl ;
    public final void rule__Procedure_and_function_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5670:1: ( rule__Procedure_and_function_declaration_part__Group__1__Impl )
            // InternalPascalParser.g:5671:2: rule__Procedure_and_function_declaration_part__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_and_function_declaration_part__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_and_function_declaration_part__Group__1"


    // $ANTLR start "rule__Procedure_and_function_declaration_part__Group__1__Impl"
    // InternalPascalParser.g:5677:1: rule__Procedure_and_function_declaration_part__Group__1__Impl : ( Semicolon ) ;
    public final void rule__Procedure_and_function_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5681:1: ( ( Semicolon ) )
            // InternalPascalParser.g:5682:1: ( Semicolon )
            {
            // InternalPascalParser.g:5682:1: ( Semicolon )
            // InternalPascalParser.g:5683:2: Semicolon
            {
             before(grammarAccess.getProcedure_and_function_declaration_partAccess().getSemicolonKeyword_1()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getProcedure_and_function_declaration_partAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_and_function_declaration_part__Group__1__Impl"


    // $ANTLR start "rule__Procedure_declaration__Group__0"
    // InternalPascalParser.g:5693:1: rule__Procedure_declaration__Group__0 : rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1 ;
    public final void rule__Procedure_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5697:1: ( rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1 )
            // InternalPascalParser.g:5698:2: rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Procedure_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__Group__0"


    // $ANTLR start "rule__Procedure_declaration__Group__0__Impl"
    // InternalPascalParser.g:5705:1: rule__Procedure_declaration__Group__0__Impl : ( ruleprocedure ) ;
    public final void rule__Procedure_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5709:1: ( ( ruleprocedure ) )
            // InternalPascalParser.g:5710:1: ( ruleprocedure )
            {
            // InternalPascalParser.g:5710:1: ( ruleprocedure )
            // InternalPascalParser.g:5711:2: ruleprocedure
            {
             before(grammarAccess.getProcedure_declarationAccess().getProcedureParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleprocedure();

            state._fsp--;

             after(grammarAccess.getProcedure_declarationAccess().getProcedureParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__Group__0__Impl"


    // $ANTLR start "rule__Procedure_declaration__Group__1"
    // InternalPascalParser.g:5720:1: rule__Procedure_declaration__Group__1 : rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2 ;
    public final void rule__Procedure_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5724:1: ( rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2 )
            // InternalPascalParser.g:5725:2: rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Procedure_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__Group__1"


    // $ANTLR start "rule__Procedure_declaration__Group__1__Impl"
    // InternalPascalParser.g:5732:1: rule__Procedure_declaration__Group__1__Impl : ( ( rule__Procedure_declaration__NamesAssignment_1 ) ) ;
    public final void rule__Procedure_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5736:1: ( ( ( rule__Procedure_declaration__NamesAssignment_1 ) ) )
            // InternalPascalParser.g:5737:1: ( ( rule__Procedure_declaration__NamesAssignment_1 ) )
            {
            // InternalPascalParser.g:5737:1: ( ( rule__Procedure_declaration__NamesAssignment_1 ) )
            // InternalPascalParser.g:5738:2: ( rule__Procedure_declaration__NamesAssignment_1 )
            {
             before(grammarAccess.getProcedure_declarationAccess().getNamesAssignment_1()); 
            // InternalPascalParser.g:5739:2: ( rule__Procedure_declaration__NamesAssignment_1 )
            // InternalPascalParser.g:5739:3: rule__Procedure_declaration__NamesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__NamesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_declarationAccess().getNamesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__Group__1__Impl"


    // $ANTLR start "rule__Procedure_declaration__Group__2"
    // InternalPascalParser.g:5747:1: rule__Procedure_declaration__Group__2 : rule__Procedure_declaration__Group__2__Impl rule__Procedure_declaration__Group__3 ;
    public final void rule__Procedure_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5751:1: ( rule__Procedure_declaration__Group__2__Impl rule__Procedure_declaration__Group__3 )
            // InternalPascalParser.g:5752:2: rule__Procedure_declaration__Group__2__Impl rule__Procedure_declaration__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Procedure_declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__Group__2"


    // $ANTLR start "rule__Procedure_declaration__Group__2__Impl"
    // InternalPascalParser.g:5759:1: rule__Procedure_declaration__Group__2__Impl : ( ( rule__Procedure_declaration__ParametersAssignment_2 )? ) ;
    public final void rule__Procedure_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5763:1: ( ( ( rule__Procedure_declaration__ParametersAssignment_2 )? ) )
            // InternalPascalParser.g:5764:1: ( ( rule__Procedure_declaration__ParametersAssignment_2 )? )
            {
            // InternalPascalParser.g:5764:1: ( ( rule__Procedure_declaration__ParametersAssignment_2 )? )
            // InternalPascalParser.g:5765:2: ( rule__Procedure_declaration__ParametersAssignment_2 )?
            {
             before(grammarAccess.getProcedure_declarationAccess().getParametersAssignment_2()); 
            // InternalPascalParser.g:5766:2: ( rule__Procedure_declaration__ParametersAssignment_2 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==LeftParenthesis) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPascalParser.g:5766:3: rule__Procedure_declaration__ParametersAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Procedure_declaration__ParametersAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcedure_declarationAccess().getParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__Group__2__Impl"


    // $ANTLR start "rule__Procedure_declaration__Group__3"
    // InternalPascalParser.g:5774:1: rule__Procedure_declaration__Group__3 : rule__Procedure_declaration__Group__3__Impl rule__Procedure_declaration__Group__4 ;
    public final void rule__Procedure_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5778:1: ( rule__Procedure_declaration__Group__3__Impl rule__Procedure_declaration__Group__4 )
            // InternalPascalParser.g:5779:2: rule__Procedure_declaration__Group__3__Impl rule__Procedure_declaration__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Procedure_declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__Group__3"


    // $ANTLR start "rule__Procedure_declaration__Group__3__Impl"
    // InternalPascalParser.g:5786:1: rule__Procedure_declaration__Group__3__Impl : ( Semicolon ) ;
    public final void rule__Procedure_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5790:1: ( ( Semicolon ) )
            // InternalPascalParser.g:5791:1: ( Semicolon )
            {
            // InternalPascalParser.g:5791:1: ( Semicolon )
            // InternalPascalParser.g:5792:2: Semicolon
            {
             before(grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_3()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__Group__3__Impl"


    // $ANTLR start "rule__Procedure_declaration__Group__4"
    // InternalPascalParser.g:5801:1: rule__Procedure_declaration__Group__4 : rule__Procedure_declaration__Group__4__Impl ;
    public final void rule__Procedure_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5805:1: ( rule__Procedure_declaration__Group__4__Impl )
            // InternalPascalParser.g:5806:2: rule__Procedure_declaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__Group__4"


    // $ANTLR start "rule__Procedure_declaration__Group__4__Impl"
    // InternalPascalParser.g:5812:1: rule__Procedure_declaration__Group__4__Impl : ( ( rule__Procedure_declaration__BlockAssignment_4 ) ) ;
    public final void rule__Procedure_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5816:1: ( ( ( rule__Procedure_declaration__BlockAssignment_4 ) ) )
            // InternalPascalParser.g:5817:1: ( ( rule__Procedure_declaration__BlockAssignment_4 ) )
            {
            // InternalPascalParser.g:5817:1: ( ( rule__Procedure_declaration__BlockAssignment_4 ) )
            // InternalPascalParser.g:5818:2: ( rule__Procedure_declaration__BlockAssignment_4 )
            {
             before(grammarAccess.getProcedure_declarationAccess().getBlockAssignment_4()); 
            // InternalPascalParser.g:5819:2: ( rule__Procedure_declaration__BlockAssignment_4 )
            // InternalPascalParser.g:5819:3: rule__Procedure_declaration__BlockAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__BlockAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_declarationAccess().getBlockAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__Group__4__Impl"


    // $ANTLR start "rule__Function_declaration__Group__0"
    // InternalPascalParser.g:5828:1: rule__Function_declaration__Group__0 : rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1 ;
    public final void rule__Function_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5832:1: ( rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1 )
            // InternalPascalParser.g:5833:2: rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Function_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__0"


    // $ANTLR start "rule__Function_declaration__Group__0__Impl"
    // InternalPascalParser.g:5840:1: rule__Function_declaration__Group__0__Impl : ( rulefunction ) ;
    public final void rule__Function_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5844:1: ( ( rulefunction ) )
            // InternalPascalParser.g:5845:1: ( rulefunction )
            {
            // InternalPascalParser.g:5845:1: ( rulefunction )
            // InternalPascalParser.g:5846:2: rulefunction
            {
             before(grammarAccess.getFunction_declarationAccess().getFunctionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulefunction();

            state._fsp--;

             after(grammarAccess.getFunction_declarationAccess().getFunctionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__0__Impl"


    // $ANTLR start "rule__Function_declaration__Group__1"
    // InternalPascalParser.g:5855:1: rule__Function_declaration__Group__1 : rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2 ;
    public final void rule__Function_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5859:1: ( rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2 )
            // InternalPascalParser.g:5860:2: rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Function_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__1"


    // $ANTLR start "rule__Function_declaration__Group__1__Impl"
    // InternalPascalParser.g:5867:1: rule__Function_declaration__Group__1__Impl : ( ( rule__Function_declaration__NamesAssignment_1 ) ) ;
    public final void rule__Function_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5871:1: ( ( ( rule__Function_declaration__NamesAssignment_1 ) ) )
            // InternalPascalParser.g:5872:1: ( ( rule__Function_declaration__NamesAssignment_1 ) )
            {
            // InternalPascalParser.g:5872:1: ( ( rule__Function_declaration__NamesAssignment_1 ) )
            // InternalPascalParser.g:5873:2: ( rule__Function_declaration__NamesAssignment_1 )
            {
             before(grammarAccess.getFunction_declarationAccess().getNamesAssignment_1()); 
            // InternalPascalParser.g:5874:2: ( rule__Function_declaration__NamesAssignment_1 )
            // InternalPascalParser.g:5874:3: rule__Function_declaration__NamesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function_declaration__NamesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunction_declarationAccess().getNamesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__1__Impl"


    // $ANTLR start "rule__Function_declaration__Group__2"
    // InternalPascalParser.g:5882:1: rule__Function_declaration__Group__2 : rule__Function_declaration__Group__2__Impl rule__Function_declaration__Group__3 ;
    public final void rule__Function_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5886:1: ( rule__Function_declaration__Group__2__Impl rule__Function_declaration__Group__3 )
            // InternalPascalParser.g:5887:2: rule__Function_declaration__Group__2__Impl rule__Function_declaration__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Function_declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__2"


    // $ANTLR start "rule__Function_declaration__Group__2__Impl"
    // InternalPascalParser.g:5894:1: rule__Function_declaration__Group__2__Impl : ( ( rule__Function_declaration__ParametersAssignment_2 )? ) ;
    public final void rule__Function_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5898:1: ( ( ( rule__Function_declaration__ParametersAssignment_2 )? ) )
            // InternalPascalParser.g:5899:1: ( ( rule__Function_declaration__ParametersAssignment_2 )? )
            {
            // InternalPascalParser.g:5899:1: ( ( rule__Function_declaration__ParametersAssignment_2 )? )
            // InternalPascalParser.g:5900:2: ( rule__Function_declaration__ParametersAssignment_2 )?
            {
             before(grammarAccess.getFunction_declarationAccess().getParametersAssignment_2()); 
            // InternalPascalParser.g:5901:2: ( rule__Function_declaration__ParametersAssignment_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==LeftParenthesis) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPascalParser.g:5901:3: rule__Function_declaration__ParametersAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function_declaration__ParametersAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunction_declarationAccess().getParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__2__Impl"


    // $ANTLR start "rule__Function_declaration__Group__3"
    // InternalPascalParser.g:5909:1: rule__Function_declaration__Group__3 : rule__Function_declaration__Group__3__Impl rule__Function_declaration__Group__4 ;
    public final void rule__Function_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5913:1: ( rule__Function_declaration__Group__3__Impl rule__Function_declaration__Group__4 )
            // InternalPascalParser.g:5914:2: rule__Function_declaration__Group__3__Impl rule__Function_declaration__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Function_declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__3"


    // $ANTLR start "rule__Function_declaration__Group__3__Impl"
    // InternalPascalParser.g:5921:1: rule__Function_declaration__Group__3__Impl : ( Colon ) ;
    public final void rule__Function_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5925:1: ( ( Colon ) )
            // InternalPascalParser.g:5926:1: ( Colon )
            {
            // InternalPascalParser.g:5926:1: ( Colon )
            // InternalPascalParser.g:5927:2: Colon
            {
             before(grammarAccess.getFunction_declarationAccess().getColonKeyword_3()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getFunction_declarationAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__3__Impl"


    // $ANTLR start "rule__Function_declaration__Group__4"
    // InternalPascalParser.g:5936:1: rule__Function_declaration__Group__4 : rule__Function_declaration__Group__4__Impl rule__Function_declaration__Group__5 ;
    public final void rule__Function_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5940:1: ( rule__Function_declaration__Group__4__Impl rule__Function_declaration__Group__5 )
            // InternalPascalParser.g:5941:2: rule__Function_declaration__Group__4__Impl rule__Function_declaration__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Function_declaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__4"


    // $ANTLR start "rule__Function_declaration__Group__4__Impl"
    // InternalPascalParser.g:5948:1: rule__Function_declaration__Group__4__Impl : ( ( rule__Function_declaration__TypesAssignment_4 ) ) ;
    public final void rule__Function_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5952:1: ( ( ( rule__Function_declaration__TypesAssignment_4 ) ) )
            // InternalPascalParser.g:5953:1: ( ( rule__Function_declaration__TypesAssignment_4 ) )
            {
            // InternalPascalParser.g:5953:1: ( ( rule__Function_declaration__TypesAssignment_4 ) )
            // InternalPascalParser.g:5954:2: ( rule__Function_declaration__TypesAssignment_4 )
            {
             before(grammarAccess.getFunction_declarationAccess().getTypesAssignment_4()); 
            // InternalPascalParser.g:5955:2: ( rule__Function_declaration__TypesAssignment_4 )
            // InternalPascalParser.g:5955:3: rule__Function_declaration__TypesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Function_declaration__TypesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFunction_declarationAccess().getTypesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__4__Impl"


    // $ANTLR start "rule__Function_declaration__Group__5"
    // InternalPascalParser.g:5963:1: rule__Function_declaration__Group__5 : rule__Function_declaration__Group__5__Impl rule__Function_declaration__Group__6 ;
    public final void rule__Function_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5967:1: ( rule__Function_declaration__Group__5__Impl rule__Function_declaration__Group__6 )
            // InternalPascalParser.g:5968:2: rule__Function_declaration__Group__5__Impl rule__Function_declaration__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Function_declaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__5"


    // $ANTLR start "rule__Function_declaration__Group__5__Impl"
    // InternalPascalParser.g:5975:1: rule__Function_declaration__Group__5__Impl : ( Semicolon ) ;
    public final void rule__Function_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5979:1: ( ( Semicolon ) )
            // InternalPascalParser.g:5980:1: ( Semicolon )
            {
            // InternalPascalParser.g:5980:1: ( Semicolon )
            // InternalPascalParser.g:5981:2: Semicolon
            {
             before(grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_5()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__5__Impl"


    // $ANTLR start "rule__Function_declaration__Group__6"
    // InternalPascalParser.g:5990:1: rule__Function_declaration__Group__6 : rule__Function_declaration__Group__6__Impl ;
    public final void rule__Function_declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:5994:1: ( rule__Function_declaration__Group__6__Impl )
            // InternalPascalParser.g:5995:2: rule__Function_declaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__6"


    // $ANTLR start "rule__Function_declaration__Group__6__Impl"
    // InternalPascalParser.g:6001:1: rule__Function_declaration__Group__6__Impl : ( ( rule__Function_declaration__BlockAssignment_6 ) ) ;
    public final void rule__Function_declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6005:1: ( ( ( rule__Function_declaration__BlockAssignment_6 ) ) )
            // InternalPascalParser.g:6006:1: ( ( rule__Function_declaration__BlockAssignment_6 ) )
            {
            // InternalPascalParser.g:6006:1: ( ( rule__Function_declaration__BlockAssignment_6 ) )
            // InternalPascalParser.g:6007:2: ( rule__Function_declaration__BlockAssignment_6 )
            {
             before(grammarAccess.getFunction_declarationAccess().getBlockAssignment_6()); 
            // InternalPascalParser.g:6008:2: ( rule__Function_declaration__BlockAssignment_6 )
            // InternalPascalParser.g:6008:3: rule__Function_declaration__BlockAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Function_declaration__BlockAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFunction_declarationAccess().getBlockAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__6__Impl"


    // $ANTLR start "rule__Function_designator__Group__0"
    // InternalPascalParser.g:6017:1: rule__Function_designator__Group__0 : rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 ;
    public final void rule__Function_designator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6021:1: ( rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 )
            // InternalPascalParser.g:6022:2: rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Function_designator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group__0"


    // $ANTLR start "rule__Function_designator__Group__0__Impl"
    // InternalPascalParser.g:6029:1: rule__Function_designator__Group__0__Impl : ( ( rule__Function_designator__Name_functionAssignment_0 ) ) ;
    public final void rule__Function_designator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6033:1: ( ( ( rule__Function_designator__Name_functionAssignment_0 ) ) )
            // InternalPascalParser.g:6034:1: ( ( rule__Function_designator__Name_functionAssignment_0 ) )
            {
            // InternalPascalParser.g:6034:1: ( ( rule__Function_designator__Name_functionAssignment_0 ) )
            // InternalPascalParser.g:6035:2: ( rule__Function_designator__Name_functionAssignment_0 )
            {
             before(grammarAccess.getFunction_designatorAccess().getName_functionAssignment_0()); 
            // InternalPascalParser.g:6036:2: ( rule__Function_designator__Name_functionAssignment_0 )
            // InternalPascalParser.g:6036:3: rule__Function_designator__Name_functionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Function_designator__Name_functionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunction_designatorAccess().getName_functionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group__0__Impl"


    // $ANTLR start "rule__Function_designator__Group__1"
    // InternalPascalParser.g:6044:1: rule__Function_designator__Group__1 : rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 ;
    public final void rule__Function_designator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6048:1: ( rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 )
            // InternalPascalParser.g:6049:2: rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Function_designator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group__1"


    // $ANTLR start "rule__Function_designator__Group__1__Impl"
    // InternalPascalParser.g:6056:1: rule__Function_designator__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__Function_designator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6060:1: ( ( LeftParenthesis ) )
            // InternalPascalParser.g:6061:1: ( LeftParenthesis )
            {
            // InternalPascalParser.g:6061:1: ( LeftParenthesis )
            // InternalPascalParser.g:6062:2: LeftParenthesis
            {
             before(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group__1__Impl"


    // $ANTLR start "rule__Function_designator__Group__2"
    // InternalPascalParser.g:6071:1: rule__Function_designator__Group__2 : rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 ;
    public final void rule__Function_designator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6075:1: ( rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 )
            // InternalPascalParser.g:6076:2: rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Function_designator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group__2"


    // $ANTLR start "rule__Function_designator__Group__2__Impl"
    // InternalPascalParser.g:6083:1: rule__Function_designator__Group__2__Impl : ( ( rule__Function_designator__ParametersAssignment_2 ) ) ;
    public final void rule__Function_designator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6087:1: ( ( ( rule__Function_designator__ParametersAssignment_2 ) ) )
            // InternalPascalParser.g:6088:1: ( ( rule__Function_designator__ParametersAssignment_2 ) )
            {
            // InternalPascalParser.g:6088:1: ( ( rule__Function_designator__ParametersAssignment_2 ) )
            // InternalPascalParser.g:6089:2: ( rule__Function_designator__ParametersAssignment_2 )
            {
             before(grammarAccess.getFunction_designatorAccess().getParametersAssignment_2()); 
            // InternalPascalParser.g:6090:2: ( rule__Function_designator__ParametersAssignment_2 )
            // InternalPascalParser.g:6090:3: rule__Function_designator__ParametersAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Function_designator__ParametersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunction_designatorAccess().getParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group__2__Impl"


    // $ANTLR start "rule__Function_designator__Group__3"
    // InternalPascalParser.g:6098:1: rule__Function_designator__Group__3 : rule__Function_designator__Group__3__Impl ;
    public final void rule__Function_designator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6102:1: ( rule__Function_designator__Group__3__Impl )
            // InternalPascalParser.g:6103:2: rule__Function_designator__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group__3"


    // $ANTLR start "rule__Function_designator__Group__3__Impl"
    // InternalPascalParser.g:6109:1: rule__Function_designator__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__Function_designator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6113:1: ( ( RightParenthesis ) )
            // InternalPascalParser.g:6114:1: ( RightParenthesis )
            {
            // InternalPascalParser.g:6114:1: ( RightParenthesis )
            // InternalPascalParser.g:6115:2: RightParenthesis
            {
             before(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group__3__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group__0"
    // InternalPascalParser.g:6125:1: rule__Formal_parameter_list__Group__0 : rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1 ;
    public final void rule__Formal_parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6129:1: ( rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1 )
            // InternalPascalParser.g:6130:2: rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Formal_parameter_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group__0"


    // $ANTLR start "rule__Formal_parameter_list__Group__0__Impl"
    // InternalPascalParser.g:6137:1: rule__Formal_parameter_list__Group__0__Impl : ( LeftParenthesis ) ;
    public final void rule__Formal_parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6141:1: ( ( LeftParenthesis ) )
            // InternalPascalParser.g:6142:1: ( LeftParenthesis )
            {
            // InternalPascalParser.g:6142:1: ( LeftParenthesis )
            // InternalPascalParser.g:6143:2: LeftParenthesis
            {
             before(grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group__0__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group__1"
    // InternalPascalParser.g:6152:1: rule__Formal_parameter_list__Group__1 : rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2 ;
    public final void rule__Formal_parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6156:1: ( rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2 )
            // InternalPascalParser.g:6157:2: rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Formal_parameter_list__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group__1"


    // $ANTLR start "rule__Formal_parameter_list__Group__1__Impl"
    // InternalPascalParser.g:6164:1: rule__Formal_parameter_list__Group__1__Impl : ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) ) ;
    public final void rule__Formal_parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6168:1: ( ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) ) )
            // InternalPascalParser.g:6169:1: ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) )
            {
            // InternalPascalParser.g:6169:1: ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) )
            // InternalPascalParser.g:6170:2: ( rule__Formal_parameter_list__ParametersAssignment_1 )
            {
             before(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_1()); 
            // InternalPascalParser.g:6171:2: ( rule__Formal_parameter_list__ParametersAssignment_1 )
            // InternalPascalParser.g:6171:3: rule__Formal_parameter_list__ParametersAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__ParametersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group__1__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group__2"
    // InternalPascalParser.g:6179:1: rule__Formal_parameter_list__Group__2 : rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3 ;
    public final void rule__Formal_parameter_list__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6183:1: ( rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3 )
            // InternalPascalParser.g:6184:2: rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__Formal_parameter_list__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group__2"


    // $ANTLR start "rule__Formal_parameter_list__Group__2__Impl"
    // InternalPascalParser.g:6191:1: rule__Formal_parameter_list__Group__2__Impl : ( ( rule__Formal_parameter_list__Group_2__0 )* ) ;
    public final void rule__Formal_parameter_list__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6195:1: ( ( ( rule__Formal_parameter_list__Group_2__0 )* ) )
            // InternalPascalParser.g:6196:1: ( ( rule__Formal_parameter_list__Group_2__0 )* )
            {
            // InternalPascalParser.g:6196:1: ( ( rule__Formal_parameter_list__Group_2__0 )* )
            // InternalPascalParser.g:6197:2: ( rule__Formal_parameter_list__Group_2__0 )*
            {
             before(grammarAccess.getFormal_parameter_listAccess().getGroup_2()); 
            // InternalPascalParser.g:6198:2: ( rule__Formal_parameter_list__Group_2__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==Semicolon) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPascalParser.g:6198:3: rule__Formal_parameter_list__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Formal_parameter_list__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getFormal_parameter_listAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group__2__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group__3"
    // InternalPascalParser.g:6206:1: rule__Formal_parameter_list__Group__3 : rule__Formal_parameter_list__Group__3__Impl ;
    public final void rule__Formal_parameter_list__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6210:1: ( rule__Formal_parameter_list__Group__3__Impl )
            // InternalPascalParser.g:6211:2: rule__Formal_parameter_list__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group__3"


    // $ANTLR start "rule__Formal_parameter_list__Group__3__Impl"
    // InternalPascalParser.g:6217:1: rule__Formal_parameter_list__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__Formal_parameter_list__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6221:1: ( ( RightParenthesis ) )
            // InternalPascalParser.g:6222:1: ( RightParenthesis )
            {
            // InternalPascalParser.g:6222:1: ( RightParenthesis )
            // InternalPascalParser.g:6223:2: RightParenthesis
            {
             before(grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group__3__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group_2__0"
    // InternalPascalParser.g:6233:1: rule__Formal_parameter_list__Group_2__0 : rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1 ;
    public final void rule__Formal_parameter_list__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6237:1: ( rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1 )
            // InternalPascalParser.g:6238:2: rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1
            {
            pushFollow(FOLLOW_38);
            rule__Formal_parameter_list__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group_2__0"


    // $ANTLR start "rule__Formal_parameter_list__Group_2__0__Impl"
    // InternalPascalParser.g:6245:1: rule__Formal_parameter_list__Group_2__0__Impl : ( Semicolon ) ;
    public final void rule__Formal_parameter_list__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6249:1: ( ( Semicolon ) )
            // InternalPascalParser.g:6250:1: ( Semicolon )
            {
            // InternalPascalParser.g:6250:1: ( Semicolon )
            // InternalPascalParser.g:6251:2: Semicolon
            {
             before(grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group_2__0__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group_2__1"
    // InternalPascalParser.g:6260:1: rule__Formal_parameter_list__Group_2__1 : rule__Formal_parameter_list__Group_2__1__Impl ;
    public final void rule__Formal_parameter_list__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6264:1: ( rule__Formal_parameter_list__Group_2__1__Impl )
            // InternalPascalParser.g:6265:2: rule__Formal_parameter_list__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group_2__1"


    // $ANTLR start "rule__Formal_parameter_list__Group_2__1__Impl"
    // InternalPascalParser.g:6271:1: rule__Formal_parameter_list__Group_2__1__Impl : ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) ) ;
    public final void rule__Formal_parameter_list__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6275:1: ( ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) ) )
            // InternalPascalParser.g:6276:1: ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) )
            {
            // InternalPascalParser.g:6276:1: ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) )
            // InternalPascalParser.g:6277:2: ( rule__Formal_parameter_list__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_2_1()); 
            // InternalPascalParser.g:6278:2: ( rule__Formal_parameter_list__ParametersAssignment_2_1 )
            // InternalPascalParser.g:6278:3: rule__Formal_parameter_list__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group_2__1__Impl"


    // $ANTLR start "rule__Formal_parameter_section__Group_1__0"
    // InternalPascalParser.g:6287:1: rule__Formal_parameter_section__Group_1__0 : rule__Formal_parameter_section__Group_1__0__Impl rule__Formal_parameter_section__Group_1__1 ;
    public final void rule__Formal_parameter_section__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6291:1: ( rule__Formal_parameter_section__Group_1__0__Impl rule__Formal_parameter_section__Group_1__1 )
            // InternalPascalParser.g:6292:2: rule__Formal_parameter_section__Group_1__0__Impl rule__Formal_parameter_section__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Formal_parameter_section__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formal_parameter_section__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__Group_1__0"


    // $ANTLR start "rule__Formal_parameter_section__Group_1__0__Impl"
    // InternalPascalParser.g:6299:1: rule__Formal_parameter_section__Group_1__0__Impl : ( Var ) ;
    public final void rule__Formal_parameter_section__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6303:1: ( ( Var ) )
            // InternalPascalParser.g:6304:1: ( Var )
            {
            // InternalPascalParser.g:6304:1: ( Var )
            // InternalPascalParser.g:6305:2: Var
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getVarKeyword_1_0()); 
            match(input,Var,FOLLOW_2); 
             after(grammarAccess.getFormal_parameter_sectionAccess().getVarKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__Group_1__0__Impl"


    // $ANTLR start "rule__Formal_parameter_section__Group_1__1"
    // InternalPascalParser.g:6314:1: rule__Formal_parameter_section__Group_1__1 : rule__Formal_parameter_section__Group_1__1__Impl ;
    public final void rule__Formal_parameter_section__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6318:1: ( rule__Formal_parameter_section__Group_1__1__Impl )
            // InternalPascalParser.g:6319:2: rule__Formal_parameter_section__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_section__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__Group_1__1"


    // $ANTLR start "rule__Formal_parameter_section__Group_1__1__Impl"
    // InternalPascalParser.g:6325:1: rule__Formal_parameter_section__Group_1__1__Impl : ( ( rule__Formal_parameter_section__ParametersAssignment_1_1 ) ) ;
    public final void rule__Formal_parameter_section__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6329:1: ( ( ( rule__Formal_parameter_section__ParametersAssignment_1_1 ) ) )
            // InternalPascalParser.g:6330:1: ( ( rule__Formal_parameter_section__ParametersAssignment_1_1 ) )
            {
            // InternalPascalParser.g:6330:1: ( ( rule__Formal_parameter_section__ParametersAssignment_1_1 ) )
            // InternalPascalParser.g:6331:2: ( rule__Formal_parameter_section__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getParametersAssignment_1_1()); 
            // InternalPascalParser.g:6332:2: ( rule__Formal_parameter_section__ParametersAssignment_1_1 )
            // InternalPascalParser.g:6332:3: rule__Formal_parameter_section__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_section__ParametersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFormal_parameter_sectionAccess().getParametersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__Group_1__1__Impl"


    // $ANTLR start "rule__Formal_parameter_section__Group_2__0"
    // InternalPascalParser.g:6341:1: rule__Formal_parameter_section__Group_2__0 : rule__Formal_parameter_section__Group_2__0__Impl rule__Formal_parameter_section__Group_2__1 ;
    public final void rule__Formal_parameter_section__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6345:1: ( rule__Formal_parameter_section__Group_2__0__Impl rule__Formal_parameter_section__Group_2__1 )
            // InternalPascalParser.g:6346:2: rule__Formal_parameter_section__Group_2__0__Impl rule__Formal_parameter_section__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Formal_parameter_section__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formal_parameter_section__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__Group_2__0"


    // $ANTLR start "rule__Formal_parameter_section__Group_2__0__Impl"
    // InternalPascalParser.g:6353:1: rule__Formal_parameter_section__Group_2__0__Impl : ( rulefunction ) ;
    public final void rule__Formal_parameter_section__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6357:1: ( ( rulefunction ) )
            // InternalPascalParser.g:6358:1: ( rulefunction )
            {
            // InternalPascalParser.g:6358:1: ( rulefunction )
            // InternalPascalParser.g:6359:2: rulefunction
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getFunctionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulefunction();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionAccess().getFunctionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__Group_2__0__Impl"


    // $ANTLR start "rule__Formal_parameter_section__Group_2__1"
    // InternalPascalParser.g:6368:1: rule__Formal_parameter_section__Group_2__1 : rule__Formal_parameter_section__Group_2__1__Impl ;
    public final void rule__Formal_parameter_section__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6372:1: ( rule__Formal_parameter_section__Group_2__1__Impl )
            // InternalPascalParser.g:6373:2: rule__Formal_parameter_section__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_section__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__Group_2__1"


    // $ANTLR start "rule__Formal_parameter_section__Group_2__1__Impl"
    // InternalPascalParser.g:6379:1: rule__Formal_parameter_section__Group_2__1__Impl : ( ( rule__Formal_parameter_section__ParametersAssignment_2_1 ) ) ;
    public final void rule__Formal_parameter_section__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6383:1: ( ( ( rule__Formal_parameter_section__ParametersAssignment_2_1 ) ) )
            // InternalPascalParser.g:6384:1: ( ( rule__Formal_parameter_section__ParametersAssignment_2_1 ) )
            {
            // InternalPascalParser.g:6384:1: ( ( rule__Formal_parameter_section__ParametersAssignment_2_1 ) )
            // InternalPascalParser.g:6385:2: ( rule__Formal_parameter_section__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getParametersAssignment_2_1()); 
            // InternalPascalParser.g:6386:2: ( rule__Formal_parameter_section__ParametersAssignment_2_1 )
            // InternalPascalParser.g:6386:3: rule__Formal_parameter_section__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_section__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFormal_parameter_sectionAccess().getParametersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__Group_2__1__Impl"


    // $ANTLR start "rule__Formal_parameter_section__Group_3__0"
    // InternalPascalParser.g:6395:1: rule__Formal_parameter_section__Group_3__0 : rule__Formal_parameter_section__Group_3__0__Impl rule__Formal_parameter_section__Group_3__1 ;
    public final void rule__Formal_parameter_section__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6399:1: ( rule__Formal_parameter_section__Group_3__0__Impl rule__Formal_parameter_section__Group_3__1 )
            // InternalPascalParser.g:6400:2: rule__Formal_parameter_section__Group_3__0__Impl rule__Formal_parameter_section__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Formal_parameter_section__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formal_parameter_section__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__Group_3__0"


    // $ANTLR start "rule__Formal_parameter_section__Group_3__0__Impl"
    // InternalPascalParser.g:6407:1: rule__Formal_parameter_section__Group_3__0__Impl : ( ruleprocedure ) ;
    public final void rule__Formal_parameter_section__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6411:1: ( ( ruleprocedure ) )
            // InternalPascalParser.g:6412:1: ( ruleprocedure )
            {
            // InternalPascalParser.g:6412:1: ( ruleprocedure )
            // InternalPascalParser.g:6413:2: ruleprocedure
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getProcedureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleprocedure();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionAccess().getProcedureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__Group_3__0__Impl"


    // $ANTLR start "rule__Formal_parameter_section__Group_3__1"
    // InternalPascalParser.g:6422:1: rule__Formal_parameter_section__Group_3__1 : rule__Formal_parameter_section__Group_3__1__Impl ;
    public final void rule__Formal_parameter_section__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6426:1: ( rule__Formal_parameter_section__Group_3__1__Impl )
            // InternalPascalParser.g:6427:2: rule__Formal_parameter_section__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_section__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__Group_3__1"


    // $ANTLR start "rule__Formal_parameter_section__Group_3__1__Impl"
    // InternalPascalParser.g:6433:1: rule__Formal_parameter_section__Group_3__1__Impl : ( ( rule__Formal_parameter_section__ParametersAssignment_3_1 ) ) ;
    public final void rule__Formal_parameter_section__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6437:1: ( ( ( rule__Formal_parameter_section__ParametersAssignment_3_1 ) ) )
            // InternalPascalParser.g:6438:1: ( ( rule__Formal_parameter_section__ParametersAssignment_3_1 ) )
            {
            // InternalPascalParser.g:6438:1: ( ( rule__Formal_parameter_section__ParametersAssignment_3_1 ) )
            // InternalPascalParser.g:6439:2: ( rule__Formal_parameter_section__ParametersAssignment_3_1 )
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getParametersAssignment_3_1()); 
            // InternalPascalParser.g:6440:2: ( rule__Formal_parameter_section__ParametersAssignment_3_1 )
            // InternalPascalParser.g:6440:3: rule__Formal_parameter_section__ParametersAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_section__ParametersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFormal_parameter_sectionAccess().getParametersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__Group_3__1__Impl"


    // $ANTLR start "rule__Parameter_group__Group__0"
    // InternalPascalParser.g:6449:1: rule__Parameter_group__Group__0 : rule__Parameter_group__Group__0__Impl rule__Parameter_group__Group__1 ;
    public final void rule__Parameter_group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6453:1: ( rule__Parameter_group__Group__0__Impl rule__Parameter_group__Group__1 )
            // InternalPascalParser.g:6454:2: rule__Parameter_group__Group__0__Impl rule__Parameter_group__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Parameter_group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter_group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_group__Group__0"


    // $ANTLR start "rule__Parameter_group__Group__0__Impl"
    // InternalPascalParser.g:6461:1: rule__Parameter_group__Group__0__Impl : ( ( rule__Parameter_group__NamesAssignment_0 ) ) ;
    public final void rule__Parameter_group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6465:1: ( ( ( rule__Parameter_group__NamesAssignment_0 ) ) )
            // InternalPascalParser.g:6466:1: ( ( rule__Parameter_group__NamesAssignment_0 ) )
            {
            // InternalPascalParser.g:6466:1: ( ( rule__Parameter_group__NamesAssignment_0 ) )
            // InternalPascalParser.g:6467:2: ( rule__Parameter_group__NamesAssignment_0 )
            {
             before(grammarAccess.getParameter_groupAccess().getNamesAssignment_0()); 
            // InternalPascalParser.g:6468:2: ( rule__Parameter_group__NamesAssignment_0 )
            // InternalPascalParser.g:6468:3: rule__Parameter_group__NamesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_group__NamesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameter_groupAccess().getNamesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_group__Group__0__Impl"


    // $ANTLR start "rule__Parameter_group__Group__1"
    // InternalPascalParser.g:6476:1: rule__Parameter_group__Group__1 : rule__Parameter_group__Group__1__Impl rule__Parameter_group__Group__2 ;
    public final void rule__Parameter_group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6480:1: ( rule__Parameter_group__Group__1__Impl rule__Parameter_group__Group__2 )
            // InternalPascalParser.g:6481:2: rule__Parameter_group__Group__1__Impl rule__Parameter_group__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Parameter_group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter_group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_group__Group__1"


    // $ANTLR start "rule__Parameter_group__Group__1__Impl"
    // InternalPascalParser.g:6488:1: rule__Parameter_group__Group__1__Impl : ( Colon ) ;
    public final void rule__Parameter_group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6492:1: ( ( Colon ) )
            // InternalPascalParser.g:6493:1: ( Colon )
            {
            // InternalPascalParser.g:6493:1: ( Colon )
            // InternalPascalParser.g:6494:2: Colon
            {
             before(grammarAccess.getParameter_groupAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getParameter_groupAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_group__Group__1__Impl"


    // $ANTLR start "rule__Parameter_group__Group__2"
    // InternalPascalParser.g:6503:1: rule__Parameter_group__Group__2 : rule__Parameter_group__Group__2__Impl ;
    public final void rule__Parameter_group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6507:1: ( rule__Parameter_group__Group__2__Impl )
            // InternalPascalParser.g:6508:2: rule__Parameter_group__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_group__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_group__Group__2"


    // $ANTLR start "rule__Parameter_group__Group__2__Impl"
    // InternalPascalParser.g:6514:1: rule__Parameter_group__Group__2__Impl : ( ( rule__Parameter_group__TypesAssignment_2 ) ) ;
    public final void rule__Parameter_group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6518:1: ( ( ( rule__Parameter_group__TypesAssignment_2 ) ) )
            // InternalPascalParser.g:6519:1: ( ( rule__Parameter_group__TypesAssignment_2 ) )
            {
            // InternalPascalParser.g:6519:1: ( ( rule__Parameter_group__TypesAssignment_2 ) )
            // InternalPascalParser.g:6520:2: ( rule__Parameter_group__TypesAssignment_2 )
            {
             before(grammarAccess.getParameter_groupAccess().getTypesAssignment_2()); 
            // InternalPascalParser.g:6521:2: ( rule__Parameter_group__TypesAssignment_2 )
            // InternalPascalParser.g:6521:3: rule__Parameter_group__TypesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_group__TypesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameter_groupAccess().getTypesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_group__Group__2__Impl"


    // $ANTLR start "rule__Pascal__ProgramAssignment"
    // InternalPascalParser.g:6530:1: rule__Pascal__ProgramAssignment : ( ruleprogram ) ;
    public final void rule__Pascal__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6534:1: ( ( ruleprogram ) )
            // InternalPascalParser.g:6535:2: ( ruleprogram )
            {
            // InternalPascalParser.g:6535:2: ( ruleprogram )
            // InternalPascalParser.g:6536:3: ruleprogram
            {
             before(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleprogram();

            state._fsp--;

             after(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pascal__ProgramAssignment"


    // $ANTLR start "rule__Program__HeadingAssignment_0"
    // InternalPascalParser.g:6545:1: rule__Program__HeadingAssignment_0 : ( ruleprogram_heading_block ) ;
    public final void rule__Program__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6549:1: ( ( ruleprogram_heading_block ) )
            // InternalPascalParser.g:6550:2: ( ruleprogram_heading_block )
            {
            // InternalPascalParser.g:6550:2: ( ruleprogram_heading_block )
            // InternalPascalParser.g:6551:3: ruleprogram_heading_block
            {
             before(grammarAccess.getProgramAccess().getHeadingProgram_heading_blockParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleprogram_heading_block();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getHeadingProgram_heading_blockParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__HeadingAssignment_0"


    // $ANTLR start "rule__Program__BlockAssignment_1"
    // InternalPascalParser.g:6560:1: rule__Program__BlockAssignment_1 : ( ruleblock ) ;
    public final void rule__Program__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6564:1: ( ( ruleblock ) )
            // InternalPascalParser.g:6565:2: ( ruleblock )
            {
            // InternalPascalParser.g:6565:2: ( ruleblock )
            // InternalPascalParser.g:6566:3: ruleblock
            {
             before(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleblock();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__BlockAssignment_1"


    // $ANTLR start "rule__Program_heading_block__NameAssignment_1"
    // InternalPascalParser.g:6575:1: rule__Program_heading_block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program_heading_block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6579:1: ( ( RULE_ID ) )
            // InternalPascalParser.g:6580:2: ( RULE_ID )
            {
            // InternalPascalParser.g:6580:2: ( RULE_ID )
            // InternalPascalParser.g:6581:3: RULE_ID
            {
             before(grammarAccess.getProgram_heading_blockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProgram_heading_blockAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__NameAssignment_1"


    // $ANTLR start "rule__Identifier_list__NamesAssignment_0"
    // InternalPascalParser.g:6590:1: rule__Identifier_list__NamesAssignment_0 : ( ruleidentifier ) ;
    public final void rule__Identifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6594:1: ( ( ruleidentifier ) )
            // InternalPascalParser.g:6595:2: ( ruleidentifier )
            {
            // InternalPascalParser.g:6595:2: ( ruleidentifier )
            // InternalPascalParser.g:6596:3: ruleidentifier
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesIdentifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleidentifier();

            state._fsp--;

             after(grammarAccess.getIdentifier_listAccess().getNamesIdentifierParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__NamesAssignment_0"


    // $ANTLR start "rule__Identifier_list__NamesAssignment_1_1"
    // InternalPascalParser.g:6605:1: rule__Identifier_list__NamesAssignment_1_1 : ( ruleidentifier ) ;
    public final void rule__Identifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6609:1: ( ( ruleidentifier ) )
            // InternalPascalParser.g:6610:2: ( ruleidentifier )
            {
            // InternalPascalParser.g:6610:2: ( ruleidentifier )
            // InternalPascalParser.g:6611:3: ruleidentifier
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesIdentifierParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleidentifier();

            state._fsp--;

             after(grammarAccess.getIdentifier_listAccess().getNamesIdentifierParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__NamesAssignment_1_1"


    // $ANTLR start "rule__Identifier__IdAssignment"
    // InternalPascalParser.g:6620:1: rule__Identifier__IdAssignment : ( RULE_ID ) ;
    public final void rule__Identifier__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6624:1: ( ( RULE_ID ) )
            // InternalPascalParser.g:6625:2: ( RULE_ID )
            {
            // InternalPascalParser.g:6625:2: ( RULE_ID )
            // InternalPascalParser.g:6626:3: RULE_ID
            {
             before(grammarAccess.getIdentifierAccess().getIdIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdentifierAccess().getIdIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__IdAssignment"


    // $ANTLR start "rule__Block__ConstantpartAssignment_0_0"
    // InternalPascalParser.g:6635:1: rule__Block__ConstantpartAssignment_0_0 : ( ruleconstant_definition_part ) ;
    public final void rule__Block__ConstantpartAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6639:1: ( ( ruleconstant_definition_part ) )
            // InternalPascalParser.g:6640:2: ( ruleconstant_definition_part )
            {
            // InternalPascalParser.g:6640:2: ( ruleconstant_definition_part )
            // InternalPascalParser.g:6641:3: ruleconstant_definition_part
            {
             before(grammarAccess.getBlockAccess().getConstantpartConstant_definition_partParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant_definition_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getConstantpartConstant_definition_partParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__ConstantpartAssignment_0_0"


    // $ANTLR start "rule__Block__Type_partAssignment_0_1"
    // InternalPascalParser.g:6650:1: rule__Block__Type_partAssignment_0_1 : ( ruletype_definition_part ) ;
    public final void rule__Block__Type_partAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6654:1: ( ( ruletype_definition_part ) )
            // InternalPascalParser.g:6655:2: ( ruletype_definition_part )
            {
            // InternalPascalParser.g:6655:2: ( ruletype_definition_part )
            // InternalPascalParser.g:6656:3: ruletype_definition_part
            {
             before(grammarAccess.getBlockAccess().getType_partType_definition_partParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruletype_definition_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getType_partType_definition_partParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Type_partAssignment_0_1"


    // $ANTLR start "rule__Block__VariablepartAssignment_0_2"
    // InternalPascalParser.g:6665:1: rule__Block__VariablepartAssignment_0_2 : ( rulevariable_declaration_part ) ;
    public final void rule__Block__VariablepartAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6669:1: ( ( rulevariable_declaration_part ) )
            // InternalPascalParser.g:6670:2: ( rulevariable_declaration_part )
            {
            // InternalPascalParser.g:6670:2: ( rulevariable_declaration_part )
            // InternalPascalParser.g:6671:3: rulevariable_declaration_part
            {
             before(grammarAccess.getBlockAccess().getVariablepartVariable_declaration_partParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulevariable_declaration_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getVariablepartVariable_declaration_partParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__VariablepartAssignment_0_2"


    // $ANTLR start "rule__Block__Procedure_function_partAssignment_0_3"
    // InternalPascalParser.g:6680:1: rule__Block__Procedure_function_partAssignment_0_3 : ( ruleprocedure_and_function_declaration_part ) ;
    public final void rule__Block__Procedure_function_partAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6684:1: ( ( ruleprocedure_and_function_declaration_part ) )
            // InternalPascalParser.g:6685:2: ( ruleprocedure_and_function_declaration_part )
            {
            // InternalPascalParser.g:6685:2: ( ruleprocedure_and_function_declaration_part )
            // InternalPascalParser.g:6686:3: ruleprocedure_and_function_declaration_part
            {
             before(grammarAccess.getBlockAccess().getProcedure_function_partProcedure_and_function_declaration_partParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleprocedure_and_function_declaration_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getProcedure_function_partProcedure_and_function_declaration_partParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Procedure_function_partAssignment_0_3"


    // $ANTLR start "rule__Block__StatementAssignment_1"
    // InternalPascalParser.g:6695:1: rule__Block__StatementAssignment_1 : ( rulecompound_statement ) ;
    public final void rule__Block__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6699:1: ( ( rulecompound_statement ) )
            // InternalPascalParser.g:6700:2: ( rulecompound_statement )
            {
            // InternalPascalParser.g:6700:2: ( rulecompound_statement )
            // InternalPascalParser.g:6701:3: rulecompound_statement
            {
             before(grammarAccess.getBlockAccess().getStatementCompound_statementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulecompound_statement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementCompound_statementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StatementAssignment_1"


    // $ANTLR start "rule__Constant_definition_part__ConstantsAssignment_1_0"
    // InternalPascalParser.g:6710:1: rule__Constant_definition_part__ConstantsAssignment_1_0 : ( ruleconstant_definition ) ;
    public final void rule__Constant_definition_part__ConstantsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6714:1: ( ( ruleconstant_definition ) )
            // InternalPascalParser.g:6715:2: ( ruleconstant_definition )
            {
            // InternalPascalParser.g:6715:2: ( ruleconstant_definition )
            // InternalPascalParser.g:6716:3: ruleconstant_definition
            {
             before(grammarAccess.getConstant_definition_partAccess().getConstantsConstant_definitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant_definition();

            state._fsp--;

             after(grammarAccess.getConstant_definition_partAccess().getConstantsConstant_definitionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__ConstantsAssignment_1_0"


    // $ANTLR start "rule__Constant_definition__NameAssignment_0"
    // InternalPascalParser.g:6725:1: rule__Constant_definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constant_definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6729:1: ( ( RULE_ID ) )
            // InternalPascalParser.g:6730:2: ( RULE_ID )
            {
            // InternalPascalParser.g:6730:2: ( RULE_ID )
            // InternalPascalParser.g:6731:3: RULE_ID
            {
             before(grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__NameAssignment_0"


    // $ANTLR start "rule__Constant__Uns_numberAssignment_0"
    // InternalPascalParser.g:6740:1: rule__Constant__Uns_numberAssignment_0 : ( ruleunsigned_number ) ;
    public final void rule__Constant__Uns_numberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6744:1: ( ( ruleunsigned_number ) )
            // InternalPascalParser.g:6745:2: ( ruleunsigned_number )
            {
            // InternalPascalParser.g:6745:2: ( ruleunsigned_number )
            // InternalPascalParser.g:6746:3: ruleunsigned_number
            {
             before(grammarAccess.getConstantAccess().getUns_numberUnsigned_numberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleunsigned_number();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getUns_numberUnsigned_numberParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Uns_numberAssignment_0"


    // $ANTLR start "rule__Constant__Sig_numberAssignment_1_1"
    // InternalPascalParser.g:6755:1: rule__Constant__Sig_numberAssignment_1_1 : ( ruleunsigned_number ) ;
    public final void rule__Constant__Sig_numberAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6759:1: ( ( ruleunsigned_number ) )
            // InternalPascalParser.g:6760:2: ( ruleunsigned_number )
            {
            // InternalPascalParser.g:6760:2: ( ruleunsigned_number )
            // InternalPascalParser.g:6761:3: ruleunsigned_number
            {
             before(grammarAccess.getConstantAccess().getSig_numberUnsigned_numberParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleunsigned_number();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getSig_numberUnsigned_numberParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Sig_numberAssignment_1_1"


    // $ANTLR start "rule__Constant__Name_idAssignment_2"
    // InternalPascalParser.g:6770:1: rule__Constant__Name_idAssignment_2 : ( RULE_ID ) ;
    public final void rule__Constant__Name_idAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6774:1: ( ( RULE_ID ) )
            // InternalPascalParser.g:6775:2: ( RULE_ID )
            {
            // InternalPascalParser.g:6775:2: ( RULE_ID )
            // InternalPascalParser.g:6776:3: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getName_idIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getName_idIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Name_idAssignment_2"


    // $ANTLR start "rule__Constant__Sig_name_idAssignment_3_1"
    // InternalPascalParser.g:6785:1: rule__Constant__Sig_name_idAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Constant__Sig_name_idAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6789:1: ( ( RULE_ID ) )
            // InternalPascalParser.g:6790:2: ( RULE_ID )
            {
            // InternalPascalParser.g:6790:2: ( RULE_ID )
            // InternalPascalParser.g:6791:3: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getSig_name_idIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getSig_name_idIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Sig_name_idAssignment_3_1"


    // $ANTLR start "rule__Constant__StringAssignment_4"
    // InternalPascalParser.g:6800:1: rule__Constant__StringAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Constant__StringAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6804:1: ( ( RULE_STRING ) )
            // InternalPascalParser.g:6805:2: ( RULE_STRING )
            {
            // InternalPascalParser.g:6805:2: ( RULE_STRING )
            // InternalPascalParser.g:6806:3: RULE_STRING
            {
             before(grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__StringAssignment_4"


    // $ANTLR start "rule__Constant__BooltypeAssignment_5"
    // InternalPascalParser.g:6815:1: rule__Constant__BooltypeAssignment_5 : ( rulebool ) ;
    public final void rule__Constant__BooltypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6819:1: ( ( rulebool ) )
            // InternalPascalParser.g:6820:2: ( rulebool )
            {
            // InternalPascalParser.g:6820:2: ( rulebool )
            // InternalPascalParser.g:6821:3: rulebool
            {
             before(grammarAccess.getConstantAccess().getBooltypeBoolParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulebool();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getBooltypeBoolParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__BooltypeAssignment_5"


    // $ANTLR start "rule__Type_definition_part__TypesAssignment_1_0"
    // InternalPascalParser.g:6830:1: rule__Type_definition_part__TypesAssignment_1_0 : ( ruletype_definition ) ;
    public final void rule__Type_definition_part__TypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6834:1: ( ( ruletype_definition ) )
            // InternalPascalParser.g:6835:2: ( ruletype_definition )
            {
            // InternalPascalParser.g:6835:2: ( ruletype_definition )
            // InternalPascalParser.g:6836:3: ruletype_definition
            {
             before(grammarAccess.getType_definition_partAccess().getTypesType_definitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruletype_definition();

            state._fsp--;

             after(grammarAccess.getType_definition_partAccess().getTypesType_definitionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__TypesAssignment_1_0"


    // $ANTLR start "rule__Type_definition__NameAssignment_0"
    // InternalPascalParser.g:6845:1: rule__Type_definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Type_definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6849:1: ( ( RULE_ID ) )
            // InternalPascalParser.g:6850:2: ( RULE_ID )
            {
            // InternalPascalParser.g:6850:2: ( RULE_ID )
            // InternalPascalParser.g:6851:3: RULE_ID
            {
             before(grammarAccess.getType_definitionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getType_definitionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__NameAssignment_0"


    // $ANTLR start "rule__Type_definition__TypeAssignment_2"
    // InternalPascalParser.g:6860:1: rule__Type_definition__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Type_definition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6864:1: ( ( ruletype ) )
            // InternalPascalParser.g:6865:2: ( ruletype )
            {
            // InternalPascalParser.g:6865:2: ( ruletype )
            // InternalPascalParser.g:6866:3: ruletype
            {
             before(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__TypeAssignment_2"


    // $ANTLR start "rule__Variable_declaration_part__VariableAssignment_1"
    // InternalPascalParser.g:6875:1: rule__Variable_declaration_part__VariableAssignment_1 : ( rulevariable_declaration ) ;
    public final void rule__Variable_declaration_part__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6879:1: ( ( rulevariable_declaration ) )
            // InternalPascalParser.g:6880:2: ( rulevariable_declaration )
            {
            // InternalPascalParser.g:6880:2: ( rulevariable_declaration )
            // InternalPascalParser.g:6881:3: rulevariable_declaration
            {
             before(grammarAccess.getVariable_declaration_partAccess().getVariableVariable_declarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulevariable_declaration();

            state._fsp--;

             after(grammarAccess.getVariable_declaration_partAccess().getVariableVariable_declarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__VariableAssignment_1"


    // $ANTLR start "rule__Variable_declaration_part__VariableAssignment_2_1"
    // InternalPascalParser.g:6890:1: rule__Variable_declaration_part__VariableAssignment_2_1 : ( rulevariable_declaration ) ;
    public final void rule__Variable_declaration_part__VariableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6894:1: ( ( rulevariable_declaration ) )
            // InternalPascalParser.g:6895:2: ( rulevariable_declaration )
            {
            // InternalPascalParser.g:6895:2: ( rulevariable_declaration )
            // InternalPascalParser.g:6896:3: rulevariable_declaration
            {
             before(grammarAccess.getVariable_declaration_partAccess().getVariableVariable_declarationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulevariable_declaration();

            state._fsp--;

             after(grammarAccess.getVariable_declaration_partAccess().getVariableVariable_declarationParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__VariableAssignment_2_1"


    // $ANTLR start "rule__Variable_declaration__List_namesAssignment_0"
    // InternalPascalParser.g:6905:1: rule__Variable_declaration__List_namesAssignment_0 : ( ruleidentifier_list ) ;
    public final void rule__Variable_declaration__List_namesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6909:1: ( ( ruleidentifier_list ) )
            // InternalPascalParser.g:6910:2: ( ruleidentifier_list )
            {
            // InternalPascalParser.g:6910:2: ( ruleidentifier_list )
            // InternalPascalParser.g:6911:3: ruleidentifier_list
            {
             before(grammarAccess.getVariable_declarationAccess().getList_namesIdentifier_listParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getVariable_declarationAccess().getList_namesIdentifier_listParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__List_namesAssignment_0"


    // $ANTLR start "rule__Variable_declaration__Type_variableAssignment_2"
    // InternalPascalParser.g:6920:1: rule__Variable_declaration__Type_variableAssignment_2 : ( ruletype ) ;
    public final void rule__Variable_declaration__Type_variableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6924:1: ( ( ruletype ) )
            // InternalPascalParser.g:6925:2: ( ruletype )
            {
            // InternalPascalParser.g:6925:2: ( ruletype )
            // InternalPascalParser.g:6926:3: ruletype
            {
             before(grammarAccess.getVariable_declarationAccess().getType_variableTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getVariable_declarationAccess().getType_variableTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Type_variableAssignment_2"


    // $ANTLR start "rule__Compound_statement__SequenceAssignment_1"
    // InternalPascalParser.g:6935:1: rule__Compound_statement__SequenceAssignment_1 : ( rulestatements ) ;
    public final void rule__Compound_statement__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6939:1: ( ( rulestatements ) )
            // InternalPascalParser.g:6940:2: ( rulestatements )
            {
            // InternalPascalParser.g:6940:2: ( rulestatements )
            // InternalPascalParser.g:6941:3: rulestatements
            {
             before(grammarAccess.getCompound_statementAccess().getSequenceStatementsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulestatements();

            state._fsp--;

             after(grammarAccess.getCompound_statementAccess().getSequenceStatementsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compound_statement__SequenceAssignment_1"


    // $ANTLR start "rule__Statements__StatementsAssignment_0"
    // InternalPascalParser.g:6950:1: rule__Statements__StatementsAssignment_0 : ( rulestatement ) ;
    public final void rule__Statements__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6954:1: ( ( rulestatement ) )
            // InternalPascalParser.g:6955:2: ( rulestatement )
            {
            // InternalPascalParser.g:6955:2: ( rulestatement )
            // InternalPascalParser.g:6956:3: rulestatement
            {
             before(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__StatementsAssignment_0"


    // $ANTLR start "rule__Statements__StatementsAssignment_1_1"
    // InternalPascalParser.g:6965:1: rule__Statements__StatementsAssignment_1_1 : ( rulestatement ) ;
    public final void rule__Statements__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6969:1: ( ( rulestatement ) )
            // InternalPascalParser.g:6970:2: ( rulestatement )
            {
            // InternalPascalParser.g:6970:2: ( rulestatement )
            // InternalPascalParser.g:6971:3: rulestatement
            {
             before(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__StatementsAssignment_1_1"


    // $ANTLR start "rule__Statement__StatementAssignment_1"
    // InternalPascalParser.g:6980:1: rule__Statement__StatementAssignment_1 : ( ruleunlabelled_statement ) ;
    public final void rule__Statement__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6984:1: ( ( ruleunlabelled_statement ) )
            // InternalPascalParser.g:6985:2: ( ruleunlabelled_statement )
            {
            // InternalPascalParser.g:6985:2: ( ruleunlabelled_statement )
            // InternalPascalParser.g:6986:3: ruleunlabelled_statement
            {
             before(grammarAccess.getStatementAccess().getStatementUnlabelled_statementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleunlabelled_statement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStatementUnlabelled_statementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementAssignment_1"


    // $ANTLR start "rule__Unlabelled_statement__SimpleAssignment_0"
    // InternalPascalParser.g:6995:1: rule__Unlabelled_statement__SimpleAssignment_0 : ( rulesimple_statement ) ;
    public final void rule__Unlabelled_statement__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:6999:1: ( ( rulesimple_statement ) )
            // InternalPascalParser.g:7000:2: ( rulesimple_statement )
            {
            // InternalPascalParser.g:7000:2: ( rulesimple_statement )
            // InternalPascalParser.g:7001:3: rulesimple_statement
            {
             before(grammarAccess.getUnlabelled_statementAccess().getSimpleSimple_statementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulesimple_statement();

            state._fsp--;

             after(grammarAccess.getUnlabelled_statementAccess().getSimpleSimple_statementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unlabelled_statement__SimpleAssignment_0"


    // $ANTLR start "rule__Unlabelled_statement__StructuredAssignment_1"
    // InternalPascalParser.g:7010:1: rule__Unlabelled_statement__StructuredAssignment_1 : ( rulestructured_statement ) ;
    public final void rule__Unlabelled_statement__StructuredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7014:1: ( ( rulestructured_statement ) )
            // InternalPascalParser.g:7015:2: ( rulestructured_statement )
            {
            // InternalPascalParser.g:7015:2: ( rulestructured_statement )
            // InternalPascalParser.g:7016:3: rulestructured_statement
            {
             before(grammarAccess.getUnlabelled_statementAccess().getStructuredStructured_statementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulestructured_statement();

            state._fsp--;

             after(grammarAccess.getUnlabelled_statementAccess().getStructuredStructured_statementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unlabelled_statement__StructuredAssignment_1"


    // $ANTLR start "rule__Simple_statement__AssignmentAssignment_0"
    // InternalPascalParser.g:7025:1: rule__Simple_statement__AssignmentAssignment_0 : ( ruleassignment_statement ) ;
    public final void rule__Simple_statement__AssignmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7029:1: ( ( ruleassignment_statement ) )
            // InternalPascalParser.g:7030:2: ( ruleassignment_statement )
            {
            // InternalPascalParser.g:7030:2: ( ruleassignment_statement )
            // InternalPascalParser.g:7031:3: ruleassignment_statement
            {
             before(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_statementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleassignment_statement();

            state._fsp--;

             after(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_statementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_statement__AssignmentAssignment_0"


    // $ANTLR start "rule__Simple_statement__ProcedureAssignment_1"
    // InternalPascalParser.g:7040:1: rule__Simple_statement__ProcedureAssignment_1 : ( ruleprocedure_statement ) ;
    public final void rule__Simple_statement__ProcedureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7044:1: ( ( ruleprocedure_statement ) )
            // InternalPascalParser.g:7045:2: ( ruleprocedure_statement )
            {
            // InternalPascalParser.g:7045:2: ( ruleprocedure_statement )
            // InternalPascalParser.g:7046:3: ruleprocedure_statement
            {
             before(grammarAccess.getSimple_statementAccess().getProcedureProcedure_statementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleprocedure_statement();

            state._fsp--;

             after(grammarAccess.getSimple_statementAccess().getProcedureProcedure_statementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_statement__ProcedureAssignment_1"


    // $ANTLR start "rule__Assignment_statement__Declared_variableAssignment_0"
    // InternalPascalParser.g:7055:1: rule__Assignment_statement__Declared_variableAssignment_0 : ( rulevariable ) ;
    public final void rule__Assignment_statement__Declared_variableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7059:1: ( ( rulevariable ) )
            // InternalPascalParser.g:7060:2: ( rulevariable )
            {
            // InternalPascalParser.g:7060:2: ( rulevariable )
            // InternalPascalParser.g:7061:3: rulevariable
            {
             before(grammarAccess.getAssignment_statementAccess().getDeclared_variableVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulevariable();

            state._fsp--;

             after(grammarAccess.getAssignment_statementAccess().getDeclared_variableVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment_statement__Declared_variableAssignment_0"


    // $ANTLR start "rule__Assignment_statement__ExpressionAssignment_2"
    // InternalPascalParser.g:7070:1: rule__Assignment_statement__ExpressionAssignment_2 : ( ruleexpression ) ;
    public final void rule__Assignment_statement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7074:1: ( ( ruleexpression ) )
            // InternalPascalParser.g:7075:2: ( ruleexpression )
            {
            // InternalPascalParser.g:7075:2: ( ruleexpression )
            // InternalPascalParser.g:7076:3: ruleexpression
            {
             before(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment_statement__ExpressionAssignment_2"


    // $ANTLR start "rule__Variable__Variable_idAssignment_0_0_1"
    // InternalPascalParser.g:7085:1: rule__Variable__Variable_idAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__Variable__Variable_idAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7089:1: ( ( RULE_ID ) )
            // InternalPascalParser.g:7090:2: ( RULE_ID )
            {
            // InternalPascalParser.g:7090:2: ( RULE_ID )
            // InternalPascalParser.g:7091:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getVariable_idIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVariable_idIDTerminalRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Variable_idAssignment_0_0_1"


    // $ANTLR start "rule__Variable__Variable_idAssignment_0_1"
    // InternalPascalParser.g:7100:1: rule__Variable__Variable_idAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Variable__Variable_idAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7104:1: ( ( RULE_ID ) )
            // InternalPascalParser.g:7105:2: ( RULE_ID )
            {
            // InternalPascalParser.g:7105:2: ( RULE_ID )
            // InternalPascalParser.g:7106:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getVariable_idIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVariable_idIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Variable_idAssignment_0_1"


    // $ANTLR start "rule__Variable__IndiceAssignment_1_0_1"
    // InternalPascalParser.g:7115:1: rule__Variable__IndiceAssignment_1_0_1 : ( ruleexpression ) ;
    public final void rule__Variable__IndiceAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7119:1: ( ( ruleexpression ) )
            // InternalPascalParser.g:7120:2: ( ruleexpression )
            {
            // InternalPascalParser.g:7120:2: ( ruleexpression )
            // InternalPascalParser.g:7121:3: ruleexpression
            {
             before(grammarAccess.getVariableAccess().getIndiceExpressionParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getIndiceExpressionParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__IndiceAssignment_1_0_1"


    // $ANTLR start "rule__Variable__IndiceAssignment_1_0_2_1"
    // InternalPascalParser.g:7130:1: rule__Variable__IndiceAssignment_1_0_2_1 : ( ruleexpression ) ;
    public final void rule__Variable__IndiceAssignment_1_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7134:1: ( ( ruleexpression ) )
            // InternalPascalParser.g:7135:2: ( ruleexpression )
            {
            // InternalPascalParser.g:7135:2: ( ruleexpression )
            // InternalPascalParser.g:7136:3: ruleexpression
            {
             before(grammarAccess.getVariableAccess().getIndiceExpressionParserRuleCall_1_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getIndiceExpressionParserRuleCall_1_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__IndiceAssignment_1_0_2_1"


    // $ANTLR start "rule__Variable__ExpressionAssignment_1_1_1"
    // InternalPascalParser.g:7145:1: rule__Variable__ExpressionAssignment_1_1_1 : ( ruleexpression ) ;
    public final void rule__Variable__ExpressionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7149:1: ( ( ruleexpression ) )
            // InternalPascalParser.g:7150:2: ( ruleexpression )
            {
            // InternalPascalParser.g:7150:2: ( ruleexpression )
            // InternalPascalParser.g:7151:3: ruleexpression
            {
             before(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ExpressionAssignment_1_1_1"


    // $ANTLR start "rule__Variable__ExpressionAssignment_1_1_2_1"
    // InternalPascalParser.g:7160:1: rule__Variable__ExpressionAssignment_1_1_2_1 : ( ruleexpression ) ;
    public final void rule__Variable__ExpressionAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7164:1: ( ( ruleexpression ) )
            // InternalPascalParser.g:7165:2: ( ruleexpression )
            {
            // InternalPascalParser.g:7165:2: ( ruleexpression )
            // InternalPascalParser.g:7166:3: ruleexpression
            {
             before(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ExpressionAssignment_1_1_2_1"


    // $ANTLR start "rule__Variable__Names_expAssignment_1_2_1"
    // InternalPascalParser.g:7175:1: rule__Variable__Names_expAssignment_1_2_1 : ( RULE_ID ) ;
    public final void rule__Variable__Names_expAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7179:1: ( ( RULE_ID ) )
            // InternalPascalParser.g:7180:2: ( RULE_ID )
            {
            // InternalPascalParser.g:7180:2: ( RULE_ID )
            // InternalPascalParser.g:7181:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNames_expIDTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNames_expIDTerminalRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Names_expAssignment_1_2_1"


    // $ANTLR start "rule__Expression__SimpleAssignment"
    // InternalPascalParser.g:7190:1: rule__Expression__SimpleAssignment : ( rulesimple_expression ) ;
    public final void rule__Expression__SimpleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7194:1: ( ( rulesimple_expression ) )
            // InternalPascalParser.g:7195:2: ( rulesimple_expression )
            {
            // InternalPascalParser.g:7195:2: ( rulesimple_expression )
            // InternalPascalParser.g:7196:3: rulesimple_expression
            {
             before(grammarAccess.getExpressionAccess().getSimpleSimple_expressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulesimple_expression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getSimpleSimple_expressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__SimpleAssignment"


    // $ANTLR start "rule__Simple_expression__Term_expAssignment_0"
    // InternalPascalParser.g:7205:1: rule__Simple_expression__Term_expAssignment_0 : ( ruleterm ) ;
    public final void rule__Simple_expression__Term_expAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7209:1: ( ( ruleterm ) )
            // InternalPascalParser.g:7210:2: ( ruleterm )
            {
            // InternalPascalParser.g:7210:2: ( ruleterm )
            // InternalPascalParser.g:7211:3: ruleterm
            {
             before(grammarAccess.getSimple_expressionAccess().getTerm_expTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getSimple_expressionAccess().getTerm_expTermParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Term_expAssignment_0"


    // $ANTLR start "rule__Simple_expression__OperatorAssignment_1_0"
    // InternalPascalParser.g:7220:1: rule__Simple_expression__OperatorAssignment_1_0 : ( ruleadditive_operator ) ;
    public final void rule__Simple_expression__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7224:1: ( ( ruleadditive_operator ) )
            // InternalPascalParser.g:7225:2: ( ruleadditive_operator )
            {
            // InternalPascalParser.g:7225:2: ( ruleadditive_operator )
            // InternalPascalParser.g:7226:3: ruleadditive_operator
            {
             before(grammarAccess.getSimple_expressionAccess().getOperatorAdditive_operatorParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleadditive_operator();

            state._fsp--;

             after(grammarAccess.getSimple_expressionAccess().getOperatorAdditive_operatorParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__OperatorAssignment_1_0"


    // $ANTLR start "rule__Simple_expression__ExpressionAssignment_1_1"
    // InternalPascalParser.g:7235:1: rule__Simple_expression__ExpressionAssignment_1_1 : ( rulesimple_expression ) ;
    public final void rule__Simple_expression__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7239:1: ( ( rulesimple_expression ) )
            // InternalPascalParser.g:7240:2: ( rulesimple_expression )
            {
            // InternalPascalParser.g:7240:2: ( rulesimple_expression )
            // InternalPascalParser.g:7241:3: rulesimple_expression
            {
             before(grammarAccess.getSimple_expressionAccess().getExpressionSimple_expressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulesimple_expression();

            state._fsp--;

             after(grammarAccess.getSimple_expressionAccess().getExpressionSimple_expressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__ExpressionAssignment_1_1"


    // $ANTLR start "rule__Term__FactorAssignment_0"
    // InternalPascalParser.g:7250:1: rule__Term__FactorAssignment_0 : ( rulesigned_factor ) ;
    public final void rule__Term__FactorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7254:1: ( ( rulesigned_factor ) )
            // InternalPascalParser.g:7255:2: ( rulesigned_factor )
            {
            // InternalPascalParser.g:7255:2: ( rulesigned_factor )
            // InternalPascalParser.g:7256:3: rulesigned_factor
            {
             before(grammarAccess.getTermAccess().getFactorSigned_factorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulesigned_factor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getFactorSigned_factorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__FactorAssignment_0"


    // $ANTLR start "rule__Term__OperatorAssignment_1_0"
    // InternalPascalParser.g:7265:1: rule__Term__OperatorAssignment_1_0 : ( rulemultiplicative_operator ) ;
    public final void rule__Term__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7269:1: ( ( rulemultiplicative_operator ) )
            // InternalPascalParser.g:7270:2: ( rulemultiplicative_operator )
            {
            // InternalPascalParser.g:7270:2: ( rulemultiplicative_operator )
            // InternalPascalParser.g:7271:3: rulemultiplicative_operator
            {
             before(grammarAccess.getTermAccess().getOperatorMultiplicative_operatorParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulemultiplicative_operator();

            state._fsp--;

             after(grammarAccess.getTermAccess().getOperatorMultiplicative_operatorParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__OperatorAssignment_1_0"


    // $ANTLR start "rule__Term__Term2Assignment_1_1"
    // InternalPascalParser.g:7280:1: rule__Term__Term2Assignment_1_1 : ( ruleterm ) ;
    public final void rule__Term__Term2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7284:1: ( ( ruleterm ) )
            // InternalPascalParser.g:7285:2: ( ruleterm )
            {
            // InternalPascalParser.g:7285:2: ( ruleterm )
            // InternalPascalParser.g:7286:3: ruleterm
            {
             before(grammarAccess.getTermAccess().getTerm2TermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getTermAccess().getTerm2TermParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Term2Assignment_1_1"


    // $ANTLR start "rule__Signed_factor__SignalAssignment_0_0"
    // InternalPascalParser.g:7295:1: rule__Signed_factor__SignalAssignment_0_0 : ( RULE_PLUS ) ;
    public final void rule__Signed_factor__SignalAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7299:1: ( ( RULE_PLUS ) )
            // InternalPascalParser.g:7300:2: ( RULE_PLUS )
            {
            // InternalPascalParser.g:7300:2: ( RULE_PLUS )
            // InternalPascalParser.g:7301:3: RULE_PLUS
            {
             before(grammarAccess.getSigned_factorAccess().getSignalPLUSTerminalRuleCall_0_0_0()); 
            match(input,RULE_PLUS,FOLLOW_2); 
             after(grammarAccess.getSigned_factorAccess().getSignalPLUSTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_factor__SignalAssignment_0_0"


    // $ANTLR start "rule__Signed_factor__SignalAssignment_0_1"
    // InternalPascalParser.g:7310:1: rule__Signed_factor__SignalAssignment_0_1 : ( RULE_MINUS ) ;
    public final void rule__Signed_factor__SignalAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7314:1: ( ( RULE_MINUS ) )
            // InternalPascalParser.g:7315:2: ( RULE_MINUS )
            {
            // InternalPascalParser.g:7315:2: ( RULE_MINUS )
            // InternalPascalParser.g:7316:3: RULE_MINUS
            {
             before(grammarAccess.getSigned_factorAccess().getSignalMINUSTerminalRuleCall_0_1_0()); 
            match(input,RULE_MINUS,FOLLOW_2); 
             after(grammarAccess.getSigned_factorAccess().getSignalMINUSTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_factor__SignalAssignment_0_1"


    // $ANTLR start "rule__Signed_factor__FactorAssignment_1"
    // InternalPascalParser.g:7325:1: rule__Signed_factor__FactorAssignment_1 : ( rulefactor ) ;
    public final void rule__Signed_factor__FactorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7329:1: ( ( rulefactor ) )
            // InternalPascalParser.g:7330:2: ( rulefactor )
            {
            // InternalPascalParser.g:7330:2: ( rulefactor )
            // InternalPascalParser.g:7331:3: rulefactor
            {
             before(grammarAccess.getSigned_factorAccess().getFactorFactorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getSigned_factorAccess().getFactorFactorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_factor__FactorAssignment_1"


    // $ANTLR start "rule__Factor__VariableAssignment_0"
    // InternalPascalParser.g:7340:1: rule__Factor__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Factor__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7344:1: ( ( rulevariable ) )
            // InternalPascalParser.g:7345:2: ( rulevariable )
            {
            // InternalPascalParser.g:7345:2: ( rulevariable )
            // InternalPascalParser.g:7346:3: rulevariable
            {
             before(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulevariable();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__VariableAssignment_0"


    // $ANTLR start "rule__Factor__ExpressionAssignment_1_1"
    // InternalPascalParser.g:7355:1: rule__Factor__ExpressionAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__Factor__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7359:1: ( ( ruleexpression ) )
            // InternalPascalParser.g:7360:2: ( ruleexpression )
            {
            // InternalPascalParser.g:7360:2: ( ruleexpression )
            // InternalPascalParser.g:7361:3: ruleexpression
            {
             before(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__ExpressionAssignment_1_1"


    // $ANTLR start "rule__Factor__FunctionAssignment_2"
    // InternalPascalParser.g:7370:1: rule__Factor__FunctionAssignment_2 : ( rulefunction_designator ) ;
    public final void rule__Factor__FunctionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7374:1: ( ( rulefunction_designator ) )
            // InternalPascalParser.g:7375:2: ( rulefunction_designator )
            {
            // InternalPascalParser.g:7375:2: ( rulefunction_designator )
            // InternalPascalParser.g:7376:3: rulefunction_designator
            {
             before(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulefunction_designator();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__FunctionAssignment_2"


    // $ANTLR start "rule__Factor__ConstantAssignment_3"
    // InternalPascalParser.g:7385:1: rule__Factor__ConstantAssignment_3 : ( ruleunsigned_constant ) ;
    public final void rule__Factor__ConstantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7389:1: ( ( ruleunsigned_constant ) )
            // InternalPascalParser.g:7390:2: ( ruleunsigned_constant )
            {
            // InternalPascalParser.g:7390:2: ( ruleunsigned_constant )
            // InternalPascalParser.g:7391:3: ruleunsigned_constant
            {
             before(grammarAccess.getFactorAccess().getConstantUnsigned_constantParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleunsigned_constant();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getConstantUnsigned_constantParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__ConstantAssignment_3"


    // $ANTLR start "rule__Factor__Not_factorAssignment_4_1"
    // InternalPascalParser.g:7400:1: rule__Factor__Not_factorAssignment_4_1 : ( rulefactor ) ;
    public final void rule__Factor__Not_factorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7404:1: ( ( rulefactor ) )
            // InternalPascalParser.g:7405:2: ( rulefactor )
            {
            // InternalPascalParser.g:7405:2: ( rulefactor )
            // InternalPascalParser.g:7406:3: rulefactor
            {
             before(grammarAccess.getFactorAccess().getNot_factorFactorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getNot_factorFactorParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Not_factorAssignment_4_1"


    // $ANTLR start "rule__Factor__Bool_factorAssignment_5"
    // InternalPascalParser.g:7415:1: rule__Factor__Bool_factorAssignment_5 : ( rulebool ) ;
    public final void rule__Factor__Bool_factorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7419:1: ( ( rulebool ) )
            // InternalPascalParser.g:7420:2: ( rulebool )
            {
            // InternalPascalParser.g:7420:2: ( rulebool )
            // InternalPascalParser.g:7421:3: rulebool
            {
             before(grammarAccess.getFactorAccess().getBool_factorBoolParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulebool();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getBool_factorBoolParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Bool_factorAssignment_5"


    // $ANTLR start "rule__Type__SimpleAssignment_0"
    // InternalPascalParser.g:7430:1: rule__Type__SimpleAssignment_0 : ( rulesimple_type ) ;
    public final void rule__Type__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7434:1: ( ( rulesimple_type ) )
            // InternalPascalParser.g:7435:2: ( rulesimple_type )
            {
            // InternalPascalParser.g:7435:2: ( rulesimple_type )
            // InternalPascalParser.g:7436:3: rulesimple_type
            {
             before(grammarAccess.getTypeAccess().getSimpleSimple_typeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulesimple_type();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getSimpleSimple_typeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__SimpleAssignment_0"


    // $ANTLR start "rule__Type__StructuredAssignment_1"
    // InternalPascalParser.g:7445:1: rule__Type__StructuredAssignment_1 : ( rulestructured_type ) ;
    public final void rule__Type__StructuredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7449:1: ( ( rulestructured_type ) )
            // InternalPascalParser.g:7450:2: ( rulestructured_type )
            {
            // InternalPascalParser.g:7450:2: ( rulestructured_type )
            // InternalPascalParser.g:7451:3: rulestructured_type
            {
             before(grammarAccess.getTypeAccess().getStructuredStructured_typeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulestructured_type();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getStructuredStructured_typeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__StructuredAssignment_1"


    // $ANTLR start "rule__Simple_type__TypeAssignment_0"
    // InternalPascalParser.g:7460:1: rule__Simple_type__TypeAssignment_0 : ( ruletype_identifier ) ;
    public final void rule__Simple_type__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7464:1: ( ( ruletype_identifier ) )
            // InternalPascalParser.g:7465:2: ( ruletype_identifier )
            {
            // InternalPascalParser.g:7465:2: ( ruletype_identifier )
            // InternalPascalParser.g:7466:3: ruletype_identifier
            {
             before(grammarAccess.getSimple_typeAccess().getTypeType_identifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruletype_identifier();

            state._fsp--;

             after(grammarAccess.getSimple_typeAccess().getTypeType_identifierParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_type__TypeAssignment_0"


    // $ANTLR start "rule__Simple_type__Subrange_typeAssignment_1"
    // InternalPascalParser.g:7475:1: rule__Simple_type__Subrange_typeAssignment_1 : ( rulesubrange_type ) ;
    public final void rule__Simple_type__Subrange_typeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7479:1: ( ( rulesubrange_type ) )
            // InternalPascalParser.g:7480:2: ( rulesubrange_type )
            {
            // InternalPascalParser.g:7480:2: ( rulesubrange_type )
            // InternalPascalParser.g:7481:3: rulesubrange_type
            {
             before(grammarAccess.getSimple_typeAccess().getSubrange_typeSubrange_typeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulesubrange_type();

            state._fsp--;

             after(grammarAccess.getSimple_typeAccess().getSubrange_typeSubrange_typeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_type__Subrange_typeAssignment_1"


    // $ANTLR start "rule__Subrange_type__ConstantInitAssignment_0"
    // InternalPascalParser.g:7490:1: rule__Subrange_type__ConstantInitAssignment_0 : ( ruleconstant ) ;
    public final void rule__Subrange_type__ConstantInitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7494:1: ( ( ruleconstant ) )
            // InternalPascalParser.g:7495:2: ( ruleconstant )
            {
            // InternalPascalParser.g:7495:2: ( ruleconstant )
            // InternalPascalParser.g:7496:3: ruleconstant
            {
             before(grammarAccess.getSubrange_typeAccess().getConstantInitConstantParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getSubrange_typeAccess().getConstantInitConstantParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__ConstantInitAssignment_0"


    // $ANTLR start "rule__Subrange_type__ConstantFinalAssignment_2"
    // InternalPascalParser.g:7505:1: rule__Subrange_type__ConstantFinalAssignment_2 : ( ruleconstant ) ;
    public final void rule__Subrange_type__ConstantFinalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7509:1: ( ( ruleconstant ) )
            // InternalPascalParser.g:7510:2: ( ruleconstant )
            {
            // InternalPascalParser.g:7510:2: ( ruleconstant )
            // InternalPascalParser.g:7511:3: ruleconstant
            {
             before(grammarAccess.getSubrange_typeAccess().getConstantFinalConstantParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getSubrange_typeAccess().getConstantFinalConstantParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__ConstantFinalAssignment_2"


    // $ANTLR start "rule__Structured_type__UnpackedAssignment"
    // InternalPascalParser.g:7520:1: rule__Structured_type__UnpackedAssignment : ( ruleunpacked_structured_type ) ;
    public final void rule__Structured_type__UnpackedAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7524:1: ( ( ruleunpacked_structured_type ) )
            // InternalPascalParser.g:7525:2: ( ruleunpacked_structured_type )
            {
            // InternalPascalParser.g:7525:2: ( ruleunpacked_structured_type )
            // InternalPascalParser.g:7526:3: ruleunpacked_structured_type
            {
             before(grammarAccess.getStructured_typeAccess().getUnpackedUnpacked_structured_typeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleunpacked_structured_type();

            state._fsp--;

             after(grammarAccess.getStructured_typeAccess().getUnpackedUnpacked_structured_typeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_type__UnpackedAssignment"


    // $ANTLR start "rule__Unpacked_structured_type__Static_arrayAssignment_0"
    // InternalPascalParser.g:7535:1: rule__Unpacked_structured_type__Static_arrayAssignment_0 : ( rulearray_type ) ;
    public final void rule__Unpacked_structured_type__Static_arrayAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7539:1: ( ( rulearray_type ) )
            // InternalPascalParser.g:7540:2: ( rulearray_type )
            {
            // InternalPascalParser.g:7540:2: ( rulearray_type )
            // InternalPascalParser.g:7541:3: rulearray_type
            {
             before(grammarAccess.getUnpacked_structured_typeAccess().getStatic_arrayArray_typeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulearray_type();

            state._fsp--;

             after(grammarAccess.getUnpacked_structured_typeAccess().getStatic_arrayArray_typeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_structured_type__Static_arrayAssignment_0"


    // $ANTLR start "rule__Unpacked_structured_type__DynamicAssignment_1"
    // InternalPascalParser.g:7550:1: rule__Unpacked_structured_type__DynamicAssignment_1 : ( ruledynamic_array_type ) ;
    public final void rule__Unpacked_structured_type__DynamicAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7554:1: ( ( ruledynamic_array_type ) )
            // InternalPascalParser.g:7555:2: ( ruledynamic_array_type )
            {
            // InternalPascalParser.g:7555:2: ( ruledynamic_array_type )
            // InternalPascalParser.g:7556:3: ruledynamic_array_type
            {
             before(grammarAccess.getUnpacked_structured_typeAccess().getDynamicDynamic_array_typeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruledynamic_array_type();

            state._fsp--;

             after(grammarAccess.getUnpacked_structured_typeAccess().getDynamicDynamic_array_typeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_structured_type__DynamicAssignment_1"


    // $ANTLR start "rule__Dynamic_array_type__TypeAssignment_2"
    // InternalPascalParser.g:7565:1: rule__Dynamic_array_type__TypeAssignment_2 : ( ruletype_identifier ) ;
    public final void rule__Dynamic_array_type__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7569:1: ( ( ruletype_identifier ) )
            // InternalPascalParser.g:7570:2: ( ruletype_identifier )
            {
            // InternalPascalParser.g:7570:2: ( ruletype_identifier )
            // InternalPascalParser.g:7571:3: ruletype_identifier
            {
             before(grammarAccess.getDynamic_array_typeAccess().getTypeType_identifierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruletype_identifier();

            state._fsp--;

             after(grammarAccess.getDynamic_array_typeAccess().getTypeType_identifierParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamic_array_type__TypeAssignment_2"


    // $ANTLR start "rule__Array_type__Type_lAssignment_2"
    // InternalPascalParser.g:7580:1: rule__Array_type__Type_lAssignment_2 : ( ruletype_list ) ;
    public final void rule__Array_type__Type_lAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7584:1: ( ( ruletype_list ) )
            // InternalPascalParser.g:7585:2: ( ruletype_list )
            {
            // InternalPascalParser.g:7585:2: ( ruletype_list )
            // InternalPascalParser.g:7586:3: ruletype_list
            {
             before(grammarAccess.getArray_typeAccess().getType_lType_listParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruletype_list();

            state._fsp--;

             after(grammarAccess.getArray_typeAccess().getType_lType_listParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Type_lAssignment_2"


    // $ANTLR start "rule__Array_type__TypeAssignment_5"
    // InternalPascalParser.g:7595:1: rule__Array_type__TypeAssignment_5 : ( ruletype_identifier ) ;
    public final void rule__Array_type__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7599:1: ( ( ruletype_identifier ) )
            // InternalPascalParser.g:7600:2: ( ruletype_identifier )
            {
            // InternalPascalParser.g:7600:2: ( ruletype_identifier )
            // InternalPascalParser.g:7601:3: ruletype_identifier
            {
             before(grammarAccess.getArray_typeAccess().getTypeType_identifierParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruletype_identifier();

            state._fsp--;

             after(grammarAccess.getArray_typeAccess().getTypeType_identifierParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__TypeAssignment_5"


    // $ANTLR start "rule__Type_list__IndexesAssignment_0"
    // InternalPascalParser.g:7610:1: rule__Type_list__IndexesAssignment_0 : ( ruleindex_type ) ;
    public final void rule__Type_list__IndexesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7614:1: ( ( ruleindex_type ) )
            // InternalPascalParser.g:7615:2: ( ruleindex_type )
            {
            // InternalPascalParser.g:7615:2: ( ruleindex_type )
            // InternalPascalParser.g:7616:3: ruleindex_type
            {
             before(grammarAccess.getType_listAccess().getIndexesIndex_typeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleindex_type();

            state._fsp--;

             after(grammarAccess.getType_listAccess().getIndexesIndex_typeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_list__IndexesAssignment_0"


    // $ANTLR start "rule__Type_list__IndexesAssignment_1_1"
    // InternalPascalParser.g:7625:1: rule__Type_list__IndexesAssignment_1_1 : ( ruleindex_type ) ;
    public final void rule__Type_list__IndexesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7629:1: ( ( ruleindex_type ) )
            // InternalPascalParser.g:7630:2: ( ruleindex_type )
            {
            // InternalPascalParser.g:7630:2: ( ruleindex_type )
            // InternalPascalParser.g:7631:3: ruleindex_type
            {
             before(grammarAccess.getType_listAccess().getIndexesIndex_typeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleindex_type();

            state._fsp--;

             after(grammarAccess.getType_listAccess().getIndexesIndex_typeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_list__IndexesAssignment_1_1"


    // $ANTLR start "rule__Index_type__ContentAssignment"
    // InternalPascalParser.g:7640:1: rule__Index_type__ContentAssignment : ( rulesimple_type ) ;
    public final void rule__Index_type__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7644:1: ( ( rulesimple_type ) )
            // InternalPascalParser.g:7645:2: ( rulesimple_type )
            {
            // InternalPascalParser.g:7645:2: ( rulesimple_type )
            // InternalPascalParser.g:7646:3: rulesimple_type
            {
             before(grammarAccess.getIndex_typeAccess().getContentSimple_typeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulesimple_type();

            state._fsp--;

             after(grammarAccess.getIndex_typeAccess().getContentSimple_typeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index_type__ContentAssignment"


    // $ANTLR start "rule__Type_identifier__IdAssignment_0"
    // InternalPascalParser.g:7655:1: rule__Type_identifier__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__Type_identifier__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7659:1: ( ( RULE_ID ) )
            // InternalPascalParser.g:7660:2: ( RULE_ID )
            {
            // InternalPascalParser.g:7660:2: ( RULE_ID )
            // InternalPascalParser.g:7661:3: RULE_ID
            {
             before(grammarAccess.getType_identifierAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getType_identifierAccess().getIdIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_identifier__IdAssignment_0"


    // $ANTLR start "rule__Type_identifier__BooleanAssignment_1_0"
    // InternalPascalParser.g:7670:1: rule__Type_identifier__BooleanAssignment_1_0 : ( ( Boolean ) ) ;
    public final void rule__Type_identifier__BooleanAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7674:1: ( ( ( Boolean ) ) )
            // InternalPascalParser.g:7675:2: ( ( Boolean ) )
            {
            // InternalPascalParser.g:7675:2: ( ( Boolean ) )
            // InternalPascalParser.g:7676:3: ( Boolean )
            {
             before(grammarAccess.getType_identifierAccess().getBooleanBooleanKeyword_1_0_0()); 
            // InternalPascalParser.g:7677:3: ( Boolean )
            // InternalPascalParser.g:7678:4: Boolean
            {
             before(grammarAccess.getType_identifierAccess().getBooleanBooleanKeyword_1_0_0()); 
            match(input,Boolean,FOLLOW_2); 
             after(grammarAccess.getType_identifierAccess().getBooleanBooleanKeyword_1_0_0()); 

            }

             after(grammarAccess.getType_identifierAccess().getBooleanBooleanKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_identifier__BooleanAssignment_1_0"


    // $ANTLR start "rule__Type_identifier__IntegerAssignment_1_1"
    // InternalPascalParser.g:7689:1: rule__Type_identifier__IntegerAssignment_1_1 : ( ( Integer ) ) ;
    public final void rule__Type_identifier__IntegerAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7693:1: ( ( ( Integer ) ) )
            // InternalPascalParser.g:7694:2: ( ( Integer ) )
            {
            // InternalPascalParser.g:7694:2: ( ( Integer ) )
            // InternalPascalParser.g:7695:3: ( Integer )
            {
             before(grammarAccess.getType_identifierAccess().getIntegerIntegerKeyword_1_1_0()); 
            // InternalPascalParser.g:7696:3: ( Integer )
            // InternalPascalParser.g:7697:4: Integer
            {
             before(grammarAccess.getType_identifierAccess().getIntegerIntegerKeyword_1_1_0()); 
            match(input,Integer,FOLLOW_2); 
             after(grammarAccess.getType_identifierAccess().getIntegerIntegerKeyword_1_1_0()); 

            }

             after(grammarAccess.getType_identifierAccess().getIntegerIntegerKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_identifier__IntegerAssignment_1_1"


    // $ANTLR start "rule__Type_identifier__StringAssignment_1_2"
    // InternalPascalParser.g:7708:1: rule__Type_identifier__StringAssignment_1_2 : ( ( String ) ) ;
    public final void rule__Type_identifier__StringAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7712:1: ( ( ( String ) ) )
            // InternalPascalParser.g:7713:2: ( ( String ) )
            {
            // InternalPascalParser.g:7713:2: ( ( String ) )
            // InternalPascalParser.g:7714:3: ( String )
            {
             before(grammarAccess.getType_identifierAccess().getStringStringKeyword_1_2_0()); 
            // InternalPascalParser.g:7715:3: ( String )
            // InternalPascalParser.g:7716:4: String
            {
             before(grammarAccess.getType_identifierAccess().getStringStringKeyword_1_2_0()); 
            match(input,String,FOLLOW_2); 
             after(grammarAccess.getType_identifierAccess().getStringStringKeyword_1_2_0()); 

            }

             after(grammarAccess.getType_identifierAccess().getStringStringKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_identifier__StringAssignment_1_2"


    // $ANTLR start "rule__Unsigned_constant__NumberAssignment_0"
    // InternalPascalParser.g:7727:1: rule__Unsigned_constant__NumberAssignment_0 : ( ruleunsigned_number ) ;
    public final void rule__Unsigned_constant__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7731:1: ( ( ruleunsigned_number ) )
            // InternalPascalParser.g:7732:2: ( ruleunsigned_number )
            {
            // InternalPascalParser.g:7732:2: ( ruleunsigned_number )
            // InternalPascalParser.g:7733:3: ruleunsigned_number
            {
             before(grammarAccess.getUnsigned_constantAccess().getNumberUnsigned_numberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleunsigned_number();

            state._fsp--;

             after(grammarAccess.getUnsigned_constantAccess().getNumberUnsigned_numberParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unsigned_constant__NumberAssignment_0"


    // $ANTLR start "rule__Unsigned_constant__StringAssignment_1"
    // InternalPascalParser.g:7742:1: rule__Unsigned_constant__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Unsigned_constant__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7746:1: ( ( RULE_STRING ) )
            // InternalPascalParser.g:7747:2: ( RULE_STRING )
            {
            // InternalPascalParser.g:7747:2: ( RULE_STRING )
            // InternalPascalParser.g:7748:3: RULE_STRING
            {
             before(grammarAccess.getUnsigned_constantAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUnsigned_constantAccess().getStringSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unsigned_constant__StringAssignment_1"


    // $ANTLR start "rule__Unsigned_constant__NilAssignment_2"
    // InternalPascalParser.g:7757:1: rule__Unsigned_constant__NilAssignment_2 : ( RULE_NIL ) ;
    public final void rule__Unsigned_constant__NilAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7761:1: ( ( RULE_NIL ) )
            // InternalPascalParser.g:7762:2: ( RULE_NIL )
            {
            // InternalPascalParser.g:7762:2: ( RULE_NIL )
            // InternalPascalParser.g:7763:3: RULE_NIL
            {
             before(grammarAccess.getUnsigned_constantAccess().getNilNILTerminalRuleCall_2_0()); 
            match(input,RULE_NIL,FOLLOW_2); 
             after(grammarAccess.getUnsigned_constantAccess().getNilNILTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unsigned_constant__NilAssignment_2"


    // $ANTLR start "rule__Unsigned_number__NumbersAssignment"
    // InternalPascalParser.g:7772:1: rule__Unsigned_number__NumbersAssignment : ( ruleunsigned_integer ) ;
    public final void rule__Unsigned_number__NumbersAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7776:1: ( ( ruleunsigned_integer ) )
            // InternalPascalParser.g:7777:2: ( ruleunsigned_integer )
            {
            // InternalPascalParser.g:7777:2: ( ruleunsigned_integer )
            // InternalPascalParser.g:7778:3: ruleunsigned_integer
            {
             before(grammarAccess.getUnsigned_numberAccess().getNumbersUnsigned_integerParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleunsigned_integer();

            state._fsp--;

             after(grammarAccess.getUnsigned_numberAccess().getNumbersUnsigned_integerParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unsigned_number__NumbersAssignment"


    // $ANTLR start "rule__Procedure_statement__Name_idAssignment_0"
    // InternalPascalParser.g:7787:1: rule__Procedure_statement__Name_idAssignment_0 : ( RULE_ID ) ;
    public final void rule__Procedure_statement__Name_idAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7791:1: ( ( RULE_ID ) )
            // InternalPascalParser.g:7792:2: ( RULE_ID )
            {
            // InternalPascalParser.g:7792:2: ( RULE_ID )
            // InternalPascalParser.g:7793:3: RULE_ID
            {
             before(grammarAccess.getProcedure_statementAccess().getName_idIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcedure_statementAccess().getName_idIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_statement__Name_idAssignment_0"


    // $ANTLR start "rule__Procedure_statement__ParametersAssignment_1_1"
    // InternalPascalParser.g:7802:1: rule__Procedure_statement__ParametersAssignment_1_1 : ( ruleparameter_list ) ;
    public final void rule__Procedure_statement__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7806:1: ( ( ruleparameter_list ) )
            // InternalPascalParser.g:7807:2: ( ruleparameter_list )
            {
            // InternalPascalParser.g:7807:2: ( ruleparameter_list )
            // InternalPascalParser.g:7808:3: ruleparameter_list
            {
             before(grammarAccess.getProcedure_statementAccess().getParametersParameter_listParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleparameter_list();

            state._fsp--;

             after(grammarAccess.getProcedure_statementAccess().getParametersParameter_listParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_statement__ParametersAssignment_1_1"


    // $ANTLR start "rule__Parameter_list__ParametersAssignment_0"
    // InternalPascalParser.g:7817:1: rule__Parameter_list__ParametersAssignment_0 : ( ruleactual_parameter ) ;
    public final void rule__Parameter_list__ParametersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7821:1: ( ( ruleactual_parameter ) )
            // InternalPascalParser.g:7822:2: ( ruleactual_parameter )
            {
            // InternalPascalParser.g:7822:2: ( ruleactual_parameter )
            // InternalPascalParser.g:7823:3: ruleactual_parameter
            {
             before(grammarAccess.getParameter_listAccess().getParametersActual_parameterParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleactual_parameter();

            state._fsp--;

             after(grammarAccess.getParameter_listAccess().getParametersActual_parameterParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__ParametersAssignment_0"


    // $ANTLR start "rule__Parameter_list__ParametersAssignment_1_1"
    // InternalPascalParser.g:7832:1: rule__Parameter_list__ParametersAssignment_1_1 : ( ruleactual_parameter ) ;
    public final void rule__Parameter_list__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7836:1: ( ( ruleactual_parameter ) )
            // InternalPascalParser.g:7837:2: ( ruleactual_parameter )
            {
            // InternalPascalParser.g:7837:2: ( ruleactual_parameter )
            // InternalPascalParser.g:7838:3: ruleactual_parameter
            {
             before(grammarAccess.getParameter_listAccess().getParametersActual_parameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleactual_parameter();

            state._fsp--;

             after(grammarAccess.getParameter_listAccess().getParametersActual_parameterParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__ParametersAssignment_1_1"


    // $ANTLR start "rule__Actual_parameter__ContentAssignment"
    // InternalPascalParser.g:7847:1: rule__Actual_parameter__ContentAssignment : ( ruleexpression ) ;
    public final void rule__Actual_parameter__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7851:1: ( ( ruleexpression ) )
            // InternalPascalParser.g:7852:2: ( ruleexpression )
            {
            // InternalPascalParser.g:7852:2: ( ruleexpression )
            // InternalPascalParser.g:7853:3: ruleexpression
            {
             before(grammarAccess.getActual_parameterAccess().getContentExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getActual_parameterAccess().getContentExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actual_parameter__ContentAssignment"


    // $ANTLR start "rule__Structured_statement__Compound_statAssignment_0"
    // InternalPascalParser.g:7862:1: rule__Structured_statement__Compound_statAssignment_0 : ( rulecompound_statement ) ;
    public final void rule__Structured_statement__Compound_statAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7866:1: ( ( rulecompound_statement ) )
            // InternalPascalParser.g:7867:2: ( rulecompound_statement )
            {
            // InternalPascalParser.g:7867:2: ( rulecompound_statement )
            // InternalPascalParser.g:7868:3: rulecompound_statement
            {
             before(grammarAccess.getStructured_statementAccess().getCompound_statCompound_statementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulecompound_statement();

            state._fsp--;

             after(grammarAccess.getStructured_statementAccess().getCompound_statCompound_statementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_statement__Compound_statAssignment_0"


    // $ANTLR start "rule__Structured_statement__Conditional_statAssignment_1"
    // InternalPascalParser.g:7877:1: rule__Structured_statement__Conditional_statAssignment_1 : ( ruleconditional_statement ) ;
    public final void rule__Structured_statement__Conditional_statAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7881:1: ( ( ruleconditional_statement ) )
            // InternalPascalParser.g:7882:2: ( ruleconditional_statement )
            {
            // InternalPascalParser.g:7882:2: ( ruleconditional_statement )
            // InternalPascalParser.g:7883:3: ruleconditional_statement
            {
             before(grammarAccess.getStructured_statementAccess().getConditional_statConditional_statementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleconditional_statement();

            state._fsp--;

             after(grammarAccess.getStructured_statementAccess().getConditional_statConditional_statementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_statement__Conditional_statAssignment_1"


    // $ANTLR start "rule__Conditional_statement__Cond_statementsAssignment"
    // InternalPascalParser.g:7892:1: rule__Conditional_statement__Cond_statementsAssignment : ( rulecase_statement ) ;
    public final void rule__Conditional_statement__Cond_statementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7896:1: ( ( rulecase_statement ) )
            // InternalPascalParser.g:7897:2: ( rulecase_statement )
            {
            // InternalPascalParser.g:7897:2: ( rulecase_statement )
            // InternalPascalParser.g:7898:3: rulecase_statement
            {
             before(grammarAccess.getConditional_statementAccess().getCond_statementsCase_statementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulecase_statement();

            state._fsp--;

             after(grammarAccess.getConditional_statementAccess().getCond_statementsCase_statementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_statement__Cond_statementsAssignment"


    // $ANTLR start "rule__Case_statement__ExpAssignment_1"
    // InternalPascalParser.g:7907:1: rule__Case_statement__ExpAssignment_1 : ( ruleexpression ) ;
    public final void rule__Case_statement__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7911:1: ( ( ruleexpression ) )
            // InternalPascalParser.g:7912:2: ( ruleexpression )
            {
            // InternalPascalParser.g:7912:2: ( ruleexpression )
            // InternalPascalParser.g:7913:3: ruleexpression
            {
             before(grammarAccess.getCase_statementAccess().getExpExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getCase_statementAccess().getExpExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__ExpAssignment_1"


    // $ANTLR start "rule__Case_statement__Case_listAssignment_3"
    // InternalPascalParser.g:7922:1: rule__Case_statement__Case_listAssignment_3 : ( rulecase_list_element ) ;
    public final void rule__Case_statement__Case_listAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7926:1: ( ( rulecase_list_element ) )
            // InternalPascalParser.g:7927:2: ( rulecase_list_element )
            {
            // InternalPascalParser.g:7927:2: ( rulecase_list_element )
            // InternalPascalParser.g:7928:3: rulecase_list_element
            {
             before(grammarAccess.getCase_statementAccess().getCase_listCase_list_elementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulecase_list_element();

            state._fsp--;

             after(grammarAccess.getCase_statementAccess().getCase_listCase_list_elementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Case_listAssignment_3"


    // $ANTLR start "rule__Case_statement__Case_listAssignment_4_1"
    // InternalPascalParser.g:7937:1: rule__Case_statement__Case_listAssignment_4_1 : ( rulecase_list_element ) ;
    public final void rule__Case_statement__Case_listAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7941:1: ( ( rulecase_list_element ) )
            // InternalPascalParser.g:7942:2: ( rulecase_list_element )
            {
            // InternalPascalParser.g:7942:2: ( rulecase_list_element )
            // InternalPascalParser.g:7943:3: rulecase_list_element
            {
             before(grammarAccess.getCase_statementAccess().getCase_listCase_list_elementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulecase_list_element();

            state._fsp--;

             after(grammarAccess.getCase_statementAccess().getCase_listCase_list_elementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Case_listAssignment_4_1"


    // $ANTLR start "rule__Case_statement__Case_statementsAssignment_6_1"
    // InternalPascalParser.g:7952:1: rule__Case_statement__Case_statementsAssignment_6_1 : ( rulestatements ) ;
    public final void rule__Case_statement__Case_statementsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7956:1: ( ( rulestatements ) )
            // InternalPascalParser.g:7957:2: ( rulestatements )
            {
            // InternalPascalParser.g:7957:2: ( rulestatements )
            // InternalPascalParser.g:7958:3: rulestatements
            {
             before(grammarAccess.getCase_statementAccess().getCase_statementsStatementsParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            rulestatements();

            state._fsp--;

             after(grammarAccess.getCase_statementAccess().getCase_statementsStatementsParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_statement__Case_statementsAssignment_6_1"


    // $ANTLR start "rule__Case_list_element__ConstsAssignment_0"
    // InternalPascalParser.g:7967:1: rule__Case_list_element__ConstsAssignment_0 : ( ruleconst_list ) ;
    public final void rule__Case_list_element__ConstsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7971:1: ( ( ruleconst_list ) )
            // InternalPascalParser.g:7972:2: ( ruleconst_list )
            {
            // InternalPascalParser.g:7972:2: ( ruleconst_list )
            // InternalPascalParser.g:7973:3: ruleconst_list
            {
             before(grammarAccess.getCase_list_elementAccess().getConstsConst_listParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleconst_list();

            state._fsp--;

             after(grammarAccess.getCase_list_elementAccess().getConstsConst_listParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_list_element__ConstsAssignment_0"


    // $ANTLR start "rule__Case_list_element__Case_statementAssignment_2"
    // InternalPascalParser.g:7982:1: rule__Case_list_element__Case_statementAssignment_2 : ( rulestatement ) ;
    public final void rule__Case_list_element__Case_statementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:7986:1: ( ( rulestatement ) )
            // InternalPascalParser.g:7987:2: ( rulestatement )
            {
            // InternalPascalParser.g:7987:2: ( rulestatement )
            // InternalPascalParser.g:7988:3: rulestatement
            {
             before(grammarAccess.getCase_list_elementAccess().getCase_statementStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getCase_list_elementAccess().getCase_statementStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_list_element__Case_statementAssignment_2"


    // $ANTLR start "rule__Const_list__ConstantsAssignment_0"
    // InternalPascalParser.g:7997:1: rule__Const_list__ConstantsAssignment_0 : ( ruleconstant ) ;
    public final void rule__Const_list__ConstantsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8001:1: ( ( ruleconstant ) )
            // InternalPascalParser.g:8002:2: ( ruleconstant )
            {
            // InternalPascalParser.g:8002:2: ( ruleconstant )
            // InternalPascalParser.g:8003:3: ruleconstant
            {
             before(grammarAccess.getConst_listAccess().getConstantsConstantParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getConst_listAccess().getConstantsConstantParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const_list__ConstantsAssignment_0"


    // $ANTLR start "rule__Const_list__ConstantsAssignment_1_1"
    // InternalPascalParser.g:8012:1: rule__Const_list__ConstantsAssignment_1_1 : ( ruleconstant ) ;
    public final void rule__Const_list__ConstantsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8016:1: ( ( ruleconstant ) )
            // InternalPascalParser.g:8017:2: ( ruleconstant )
            {
            // InternalPascalParser.g:8017:2: ( ruleconstant )
            // InternalPascalParser.g:8018:3: ruleconstant
            {
             before(grammarAccess.getConst_listAccess().getConstantsConstantParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getConst_listAccess().getConstantsConstantParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const_list__ConstantsAssignment_1_1"


    // $ANTLR start "rule__Procedure_and_function_declaration_part__SubroutineAssignment_0"
    // InternalPascalParser.g:8027:1: rule__Procedure_and_function_declaration_part__SubroutineAssignment_0 : ( ruleprocedure_or_function_declaration ) ;
    public final void rule__Procedure_and_function_declaration_part__SubroutineAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8031:1: ( ( ruleprocedure_or_function_declaration ) )
            // InternalPascalParser.g:8032:2: ( ruleprocedure_or_function_declaration )
            {
            // InternalPascalParser.g:8032:2: ( ruleprocedure_or_function_declaration )
            // InternalPascalParser.g:8033:3: ruleprocedure_or_function_declaration
            {
             before(grammarAccess.getProcedure_and_function_declaration_partAccess().getSubroutineProcedure_or_function_declarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleprocedure_or_function_declaration();

            state._fsp--;

             after(grammarAccess.getProcedure_and_function_declaration_partAccess().getSubroutineProcedure_or_function_declarationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_and_function_declaration_part__SubroutineAssignment_0"


    // $ANTLR start "rule__Procedure_or_function_declaration__ProcAssignment_0"
    // InternalPascalParser.g:8042:1: rule__Procedure_or_function_declaration__ProcAssignment_0 : ( ruleprocedure_declaration ) ;
    public final void rule__Procedure_or_function_declaration__ProcAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8046:1: ( ( ruleprocedure_declaration ) )
            // InternalPascalParser.g:8047:2: ( ruleprocedure_declaration )
            {
            // InternalPascalParser.g:8047:2: ( ruleprocedure_declaration )
            // InternalPascalParser.g:8048:3: ruleprocedure_declaration
            {
             before(grammarAccess.getProcedure_or_function_declarationAccess().getProcProcedure_declarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleprocedure_declaration();

            state._fsp--;

             after(grammarAccess.getProcedure_or_function_declarationAccess().getProcProcedure_declarationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_or_function_declaration__ProcAssignment_0"


    // $ANTLR start "rule__Procedure_or_function_declaration__FuncAssignment_1"
    // InternalPascalParser.g:8057:1: rule__Procedure_or_function_declaration__FuncAssignment_1 : ( rulefunction_declaration ) ;
    public final void rule__Procedure_or_function_declaration__FuncAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8061:1: ( ( rulefunction_declaration ) )
            // InternalPascalParser.g:8062:2: ( rulefunction_declaration )
            {
            // InternalPascalParser.g:8062:2: ( rulefunction_declaration )
            // InternalPascalParser.g:8063:3: rulefunction_declaration
            {
             before(grammarAccess.getProcedure_or_function_declarationAccess().getFuncFunction_declarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulefunction_declaration();

            state._fsp--;

             after(grammarAccess.getProcedure_or_function_declarationAccess().getFuncFunction_declarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_or_function_declaration__FuncAssignment_1"


    // $ANTLR start "rule__Procedure_declaration__NamesAssignment_1"
    // InternalPascalParser.g:8072:1: rule__Procedure_declaration__NamesAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure_declaration__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8076:1: ( ( RULE_ID ) )
            // InternalPascalParser.g:8077:2: ( RULE_ID )
            {
            // InternalPascalParser.g:8077:2: ( RULE_ID )
            // InternalPascalParser.g:8078:3: RULE_ID
            {
             before(grammarAccess.getProcedure_declarationAccess().getNamesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcedure_declarationAccess().getNamesIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__NamesAssignment_1"


    // $ANTLR start "rule__Procedure_declaration__ParametersAssignment_2"
    // InternalPascalParser.g:8087:1: rule__Procedure_declaration__ParametersAssignment_2 : ( ruleformal_parameter_list ) ;
    public final void rule__Procedure_declaration__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8091:1: ( ( ruleformal_parameter_list ) )
            // InternalPascalParser.g:8092:2: ( ruleformal_parameter_list )
            {
            // InternalPascalParser.g:8092:2: ( ruleformal_parameter_list )
            // InternalPascalParser.g:8093:3: ruleformal_parameter_list
            {
             before(grammarAccess.getProcedure_declarationAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleformal_parameter_list();

            state._fsp--;

             after(grammarAccess.getProcedure_declarationAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__ParametersAssignment_2"


    // $ANTLR start "rule__Procedure_declaration__BlockAssignment_4"
    // InternalPascalParser.g:8102:1: rule__Procedure_declaration__BlockAssignment_4 : ( ruleblock ) ;
    public final void rule__Procedure_declaration__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8106:1: ( ( ruleblock ) )
            // InternalPascalParser.g:8107:2: ( ruleblock )
            {
            // InternalPascalParser.g:8107:2: ( ruleblock )
            // InternalPascalParser.g:8108:3: ruleblock
            {
             before(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleblock();

            state._fsp--;

             after(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__BlockAssignment_4"


    // $ANTLR start "rule__Function_declaration__NamesAssignment_1"
    // InternalPascalParser.g:8117:1: rule__Function_declaration__NamesAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function_declaration__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8121:1: ( ( RULE_ID ) )
            // InternalPascalParser.g:8122:2: ( RULE_ID )
            {
            // InternalPascalParser.g:8122:2: ( RULE_ID )
            // InternalPascalParser.g:8123:3: RULE_ID
            {
             before(grammarAccess.getFunction_declarationAccess().getNamesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunction_declarationAccess().getNamesIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__NamesAssignment_1"


    // $ANTLR start "rule__Function_declaration__ParametersAssignment_2"
    // InternalPascalParser.g:8132:1: rule__Function_declaration__ParametersAssignment_2 : ( ruleformal_parameter_list ) ;
    public final void rule__Function_declaration__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8136:1: ( ( ruleformal_parameter_list ) )
            // InternalPascalParser.g:8137:2: ( ruleformal_parameter_list )
            {
            // InternalPascalParser.g:8137:2: ( ruleformal_parameter_list )
            // InternalPascalParser.g:8138:3: ruleformal_parameter_list
            {
             before(grammarAccess.getFunction_declarationAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleformal_parameter_list();

            state._fsp--;

             after(grammarAccess.getFunction_declarationAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__ParametersAssignment_2"


    // $ANTLR start "rule__Function_declaration__TypesAssignment_4"
    // InternalPascalParser.g:8147:1: rule__Function_declaration__TypesAssignment_4 : ( ruleresult_type ) ;
    public final void rule__Function_declaration__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8151:1: ( ( ruleresult_type ) )
            // InternalPascalParser.g:8152:2: ( ruleresult_type )
            {
            // InternalPascalParser.g:8152:2: ( ruleresult_type )
            // InternalPascalParser.g:8153:3: ruleresult_type
            {
             before(grammarAccess.getFunction_declarationAccess().getTypesResult_typeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleresult_type();

            state._fsp--;

             after(grammarAccess.getFunction_declarationAccess().getTypesResult_typeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__TypesAssignment_4"


    // $ANTLR start "rule__Function_declaration__BlockAssignment_6"
    // InternalPascalParser.g:8162:1: rule__Function_declaration__BlockAssignment_6 : ( ruleblock ) ;
    public final void rule__Function_declaration__BlockAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8166:1: ( ( ruleblock ) )
            // InternalPascalParser.g:8167:2: ( ruleblock )
            {
            // InternalPascalParser.g:8167:2: ( ruleblock )
            // InternalPascalParser.g:8168:3: ruleblock
            {
             before(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleblock();

            state._fsp--;

             after(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__BlockAssignment_6"


    // $ANTLR start "rule__Function_designator__Name_functionAssignment_0"
    // InternalPascalParser.g:8177:1: rule__Function_designator__Name_functionAssignment_0 : ( RULE_ID ) ;
    public final void rule__Function_designator__Name_functionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8181:1: ( ( RULE_ID ) )
            // InternalPascalParser.g:8182:2: ( RULE_ID )
            {
            // InternalPascalParser.g:8182:2: ( RULE_ID )
            // InternalPascalParser.g:8183:3: RULE_ID
            {
             before(grammarAccess.getFunction_designatorAccess().getName_functionIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunction_designatorAccess().getName_functionIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Name_functionAssignment_0"


    // $ANTLR start "rule__Function_designator__ParametersAssignment_2"
    // InternalPascalParser.g:8192:1: rule__Function_designator__ParametersAssignment_2 : ( ruleparameter_list ) ;
    public final void rule__Function_designator__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8196:1: ( ( ruleparameter_list ) )
            // InternalPascalParser.g:8197:2: ( ruleparameter_list )
            {
            // InternalPascalParser.g:8197:2: ( ruleparameter_list )
            // InternalPascalParser.g:8198:3: ruleparameter_list
            {
             before(grammarAccess.getFunction_designatorAccess().getParametersParameter_listParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleparameter_list();

            state._fsp--;

             after(grammarAccess.getFunction_designatorAccess().getParametersParameter_listParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__ParametersAssignment_2"


    // $ANTLR start "rule__Formal_parameter_list__ParametersAssignment_1"
    // InternalPascalParser.g:8207:1: rule__Formal_parameter_list__ParametersAssignment_1 : ( ruleformal_parameter_section ) ;
    public final void rule__Formal_parameter_list__ParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8211:1: ( ( ruleformal_parameter_section ) )
            // InternalPascalParser.g:8212:2: ( ruleformal_parameter_section )
            {
            // InternalPascalParser.g:8212:2: ( ruleformal_parameter_section )
            // InternalPascalParser.g:8213:3: ruleformal_parameter_section
            {
             before(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleformal_parameter_section();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__ParametersAssignment_1"


    // $ANTLR start "rule__Formal_parameter_list__ParametersAssignment_2_1"
    // InternalPascalParser.g:8222:1: rule__Formal_parameter_list__ParametersAssignment_2_1 : ( ruleformal_parameter_section ) ;
    public final void rule__Formal_parameter_list__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8226:1: ( ( ruleformal_parameter_section ) )
            // InternalPascalParser.g:8227:2: ( ruleformal_parameter_section )
            {
            // InternalPascalParser.g:8227:2: ( ruleformal_parameter_section )
            // InternalPascalParser.g:8228:3: ruleformal_parameter_section
            {
             before(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleformal_parameter_section();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__ParametersAssignment_2_1"


    // $ANTLR start "rule__Formal_parameter_section__ParametersAssignment_0"
    // InternalPascalParser.g:8237:1: rule__Formal_parameter_section__ParametersAssignment_0 : ( ruleparameter_group ) ;
    public final void rule__Formal_parameter_section__ParametersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8241:1: ( ( ruleparameter_group ) )
            // InternalPascalParser.g:8242:2: ( ruleparameter_group )
            {
            // InternalPascalParser.g:8242:2: ( ruleparameter_group )
            // InternalPascalParser.g:8243:3: ruleparameter_group
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getParametersParameter_groupParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleparameter_group();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionAccess().getParametersParameter_groupParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__ParametersAssignment_0"


    // $ANTLR start "rule__Formal_parameter_section__ParametersAssignment_1_1"
    // InternalPascalParser.g:8252:1: rule__Formal_parameter_section__ParametersAssignment_1_1 : ( ruleparameter_group ) ;
    public final void rule__Formal_parameter_section__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8256:1: ( ( ruleparameter_group ) )
            // InternalPascalParser.g:8257:2: ( ruleparameter_group )
            {
            // InternalPascalParser.g:8257:2: ( ruleparameter_group )
            // InternalPascalParser.g:8258:3: ruleparameter_group
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getParametersParameter_groupParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleparameter_group();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionAccess().getParametersParameter_groupParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__ParametersAssignment_1_1"


    // $ANTLR start "rule__Formal_parameter_section__ParametersAssignment_2_1"
    // InternalPascalParser.g:8267:1: rule__Formal_parameter_section__ParametersAssignment_2_1 : ( ruleparameter_group ) ;
    public final void rule__Formal_parameter_section__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8271:1: ( ( ruleparameter_group ) )
            // InternalPascalParser.g:8272:2: ( ruleparameter_group )
            {
            // InternalPascalParser.g:8272:2: ( ruleparameter_group )
            // InternalPascalParser.g:8273:3: ruleparameter_group
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getParametersParameter_groupParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleparameter_group();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionAccess().getParametersParameter_groupParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__ParametersAssignment_2_1"


    // $ANTLR start "rule__Formal_parameter_section__ParametersAssignment_3_1"
    // InternalPascalParser.g:8282:1: rule__Formal_parameter_section__ParametersAssignment_3_1 : ( ruleparameter_group ) ;
    public final void rule__Formal_parameter_section__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8286:1: ( ( ruleparameter_group ) )
            // InternalPascalParser.g:8287:2: ( ruleparameter_group )
            {
            // InternalPascalParser.g:8287:2: ( ruleparameter_group )
            // InternalPascalParser.g:8288:3: ruleparameter_group
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getParametersParameter_groupParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleparameter_group();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionAccess().getParametersParameter_groupParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__ParametersAssignment_3_1"


    // $ANTLR start "rule__Parameter_group__NamesAssignment_0"
    // InternalPascalParser.g:8297:1: rule__Parameter_group__NamesAssignment_0 : ( ruleidentifier_list ) ;
    public final void rule__Parameter_group__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8301:1: ( ( ruleidentifier_list ) )
            // InternalPascalParser.g:8302:2: ( ruleidentifier_list )
            {
            // InternalPascalParser.g:8302:2: ( ruleidentifier_list )
            // InternalPascalParser.g:8303:3: ruleidentifier_list
            {
             before(grammarAccess.getParameter_groupAccess().getNamesIdentifier_listParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getParameter_groupAccess().getNamesIdentifier_listParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_group__NamesAssignment_0"


    // $ANTLR start "rule__Parameter_group__TypesAssignment_2"
    // InternalPascalParser.g:8312:1: rule__Parameter_group__TypesAssignment_2 : ( ruletype_identifier ) ;
    public final void rule__Parameter_group__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascalParser.g:8316:1: ( ( ruletype_identifier ) )
            // InternalPascalParser.g:8317:2: ( ruletype_identifier )
            {
            // InternalPascalParser.g:8317:2: ( ruletype_identifier )
            // InternalPascalParser.g:8318:3: ruletype_identifier
            {
             before(grammarAccess.getParameter_groupAccess().getTypesType_identifierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruletype_identifier();

            state._fsp--;

             after(grammarAccess.getParameter_groupAccess().getTypesType_identifierParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_group__TypesAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000A1830L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000A1032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001A30000012000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001A300000126C0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00008000200A5830L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001A30A20812000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000144100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000144100002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000B0000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000004F000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00008000000002C0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001A300000122C0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000010048000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00008000000A1030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000011000000L});

}