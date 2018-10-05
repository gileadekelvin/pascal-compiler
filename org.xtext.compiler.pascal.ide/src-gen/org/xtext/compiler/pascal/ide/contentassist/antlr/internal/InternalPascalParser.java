package org.xtext.compiler.pascal.ide.contentassist.antlr.internal;

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NUM_INT", "RULE_NUM_REAL", "RULE_PLUS", "RULE_MINUS", "RULE_OR", "RULE_STAR", "RULE_SLASH", "RULE_DIV", "RULE_MOD", "RULE_AND", "RULE_EQUAL", "RULE_NOT_EQUAL", "RULE_LT", "RULE_LE", "RULE_GE", "RULE_GT", "RULE_IN", "RULE_TRUE", "RULE_FALSE", "RULE_VAR", "RULE_ASSIGN", "RULE_NOT", "RULE_DOTDOT", "RULE_PROCEDURE", "RULE_FUNCTION", "RULE_ID", "RULE_STRING", "RULE_NIL", "RULE_EXPONENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'goto'", "'structured'", "'^'", "'.'", "'program'", "';'", "'('", "')'", "','", "'const'", "':'", "'begin'", "'end'", "'@'", "'['", "']'", "'(.'", "'.)'", "'string'", "'chr'", "'CHAR'", "'boolean'", "'integer'", "'real'"
    };
    public static final int T__50=50;
    public static final int RULE_LE=17;
    public static final int RULE_GT=19;
    public static final int T__59=59;
    public static final int RULE_DIV=11;
    public static final int RULE_NIL=31;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_NOT_EQUAL=15;
    public static final int RULE_GE=18;
    public static final int T__51=51;
    public static final int RULE_OR=8;
    public static final int RULE_STAR=9;
    public static final int RULE_DOTDOT=26;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_MOD=12;
    public static final int RULE_EQUAL=14;
    public static final int RULE_ID=29;
    public static final int RULE_ASSIGN=24;
    public static final int RULE_SLASH=10;
    public static final int RULE_LT=16;
    public static final int RULE_INT=33;
    public static final int RULE_ML_COMMENT=34;
    public static final int RULE_FALSE=22;
    public static final int RULE_FUNCTION=28;
    public static final int RULE_STRING=30;
    public static final int RULE_NOT=25;
    public static final int RULE_AND=13;
    public static final int RULE_PROCEDURE=27;
    public static final int RULE_SL_COMMENT=35;
    public static final int RULE_IN=20;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_TRUE=21;
    public static final int RULE_PLUS=6;
    public static final int EOF=-1;
    public static final int RULE_WS=36;
    public static final int RULE_NUM_REAL=5;
    public static final int RULE_ANY_OTHER=37;
    public static final int RULE_MINUS=7;
    public static final int RULE_EXPONENT=32;
    public static final int RULE_NUM_INT=4;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_VAR=23;

    // delegates
    // delegators


        public InternalPascalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPascalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPascalParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPascal.g"; }


    	private PascalGrammarAccess grammarAccess;

    	public void setGrammarAccess(PascalGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulepascal"
    // InternalPascal.g:53:1: entryRulepascal : rulepascal EOF ;
    public final void entryRulepascal() throws RecognitionException {
        try {
            // InternalPascal.g:54:1: ( rulepascal EOF )
            // InternalPascal.g:55:1: rulepascal EOF
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
    // InternalPascal.g:62:1: rulepascal : ( ( rule__Pascal__ProgramAssignment ) ) ;
    public final void rulepascal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:66:2: ( ( ( rule__Pascal__ProgramAssignment ) ) )
            // InternalPascal.g:67:2: ( ( rule__Pascal__ProgramAssignment ) )
            {
            // InternalPascal.g:67:2: ( ( rule__Pascal__ProgramAssignment ) )
            // InternalPascal.g:68:3: ( rule__Pascal__ProgramAssignment )
            {
             before(grammarAccess.getPascalAccess().getProgramAssignment()); 
            // InternalPascal.g:69:3: ( rule__Pascal__ProgramAssignment )
            // InternalPascal.g:69:4: rule__Pascal__ProgramAssignment
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
    // InternalPascal.g:78:1: entryRuleprogram : ruleprogram EOF ;
    public final void entryRuleprogram() throws RecognitionException {
        try {
            // InternalPascal.g:79:1: ( ruleprogram EOF )
            // InternalPascal.g:80:1: ruleprogram EOF
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
    // InternalPascal.g:87:1: ruleprogram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleprogram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:91:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalPascal.g:92:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalPascal.g:92:2: ( ( rule__Program__Group__0 ) )
            // InternalPascal.g:93:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalPascal.g:94:3: ( rule__Program__Group__0 )
            // InternalPascal.g:94:4: rule__Program__Group__0
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
    // InternalPascal.g:103:1: entryRuleprogram_heading_block : ruleprogram_heading_block EOF ;
    public final void entryRuleprogram_heading_block() throws RecognitionException {
        try {
            // InternalPascal.g:104:1: ( ruleprogram_heading_block EOF )
            // InternalPascal.g:105:1: ruleprogram_heading_block EOF
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
    // InternalPascal.g:112:1: ruleprogram_heading_block : ( ( rule__Program_heading_block__Group__0 ) ) ;
    public final void ruleprogram_heading_block() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:116:2: ( ( ( rule__Program_heading_block__Group__0 ) ) )
            // InternalPascal.g:117:2: ( ( rule__Program_heading_block__Group__0 ) )
            {
            // InternalPascal.g:117:2: ( ( rule__Program_heading_block__Group__0 ) )
            // InternalPascal.g:118:3: ( rule__Program_heading_block__Group__0 )
            {
             before(grammarAccess.getProgram_heading_blockAccess().getGroup()); 
            // InternalPascal.g:119:3: ( rule__Program_heading_block__Group__0 )
            // InternalPascal.g:119:4: rule__Program_heading_block__Group__0
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
    // InternalPascal.g:128:1: entryRuleidentifier_list : ruleidentifier_list EOF ;
    public final void entryRuleidentifier_list() throws RecognitionException {
        try {
            // InternalPascal.g:129:1: ( ruleidentifier_list EOF )
            // InternalPascal.g:130:1: ruleidentifier_list EOF
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
    // InternalPascal.g:137:1: ruleidentifier_list : ( ( rule__Identifier_list__Group__0 ) ) ;
    public final void ruleidentifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:141:2: ( ( ( rule__Identifier_list__Group__0 ) ) )
            // InternalPascal.g:142:2: ( ( rule__Identifier_list__Group__0 ) )
            {
            // InternalPascal.g:142:2: ( ( rule__Identifier_list__Group__0 ) )
            // InternalPascal.g:143:3: ( rule__Identifier_list__Group__0 )
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup()); 
            // InternalPascal.g:144:3: ( rule__Identifier_list__Group__0 )
            // InternalPascal.g:144:4: rule__Identifier_list__Group__0
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


    // $ANTLR start "entryRuleblock"
    // InternalPascal.g:153:1: entryRuleblock : ruleblock EOF ;
    public final void entryRuleblock() throws RecognitionException {
        try {
            // InternalPascal.g:154:1: ( ruleblock EOF )
            // InternalPascal.g:155:1: ruleblock EOF
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
    // InternalPascal.g:162:1: ruleblock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleblock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:166:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalPascal.g:167:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalPascal.g:167:2: ( ( rule__Block__Group__0 ) )
            // InternalPascal.g:168:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalPascal.g:169:3: ( rule__Block__Group__0 )
            // InternalPascal.g:169:4: rule__Block__Group__0
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
    // InternalPascal.g:178:1: entryRuleconstant_definition_part : ruleconstant_definition_part EOF ;
    public final void entryRuleconstant_definition_part() throws RecognitionException {
        try {
            // InternalPascal.g:179:1: ( ruleconstant_definition_part EOF )
            // InternalPascal.g:180:1: ruleconstant_definition_part EOF
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
    // InternalPascal.g:187:1: ruleconstant_definition_part : ( ( rule__Constant_definition_part__Group__0 ) ) ;
    public final void ruleconstant_definition_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:191:2: ( ( ( rule__Constant_definition_part__Group__0 ) ) )
            // InternalPascal.g:192:2: ( ( rule__Constant_definition_part__Group__0 ) )
            {
            // InternalPascal.g:192:2: ( ( rule__Constant_definition_part__Group__0 ) )
            // InternalPascal.g:193:3: ( rule__Constant_definition_part__Group__0 )
            {
             before(grammarAccess.getConstant_definition_partAccess().getGroup()); 
            // InternalPascal.g:194:3: ( rule__Constant_definition_part__Group__0 )
            // InternalPascal.g:194:4: rule__Constant_definition_part__Group__0
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
    // InternalPascal.g:203:1: entryRuleconstant_definition : ruleconstant_definition EOF ;
    public final void entryRuleconstant_definition() throws RecognitionException {
        try {
            // InternalPascal.g:204:1: ( ruleconstant_definition EOF )
            // InternalPascal.g:205:1: ruleconstant_definition EOF
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
    // InternalPascal.g:212:1: ruleconstant_definition : ( ( rule__Constant_definition__Group__0 ) ) ;
    public final void ruleconstant_definition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:216:2: ( ( ( rule__Constant_definition__Group__0 ) ) )
            // InternalPascal.g:217:2: ( ( rule__Constant_definition__Group__0 ) )
            {
            // InternalPascal.g:217:2: ( ( rule__Constant_definition__Group__0 ) )
            // InternalPascal.g:218:3: ( rule__Constant_definition__Group__0 )
            {
             before(grammarAccess.getConstant_definitionAccess().getGroup()); 
            // InternalPascal.g:219:3: ( rule__Constant_definition__Group__0 )
            // InternalPascal.g:219:4: rule__Constant_definition__Group__0
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
    // InternalPascal.g:228:1: entryRuleconstant : ruleconstant EOF ;
    public final void entryRuleconstant() throws RecognitionException {
        try {
            // InternalPascal.g:229:1: ( ruleconstant EOF )
            // InternalPascal.g:230:1: ruleconstant EOF
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
    // InternalPascal.g:237:1: ruleconstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleconstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:241:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalPascal.g:242:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalPascal.g:242:2: ( ( rule__Constant__Alternatives ) )
            // InternalPascal.g:243:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalPascal.g:244:3: ( rule__Constant__Alternatives )
            // InternalPascal.g:244:4: rule__Constant__Alternatives
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


    // $ANTLR start "entryRulevariable_declaration_part"
    // InternalPascal.g:253:1: entryRulevariable_declaration_part : rulevariable_declaration_part EOF ;
    public final void entryRulevariable_declaration_part() throws RecognitionException {
        try {
            // InternalPascal.g:254:1: ( rulevariable_declaration_part EOF )
            // InternalPascal.g:255:1: rulevariable_declaration_part EOF
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
    // InternalPascal.g:262:1: rulevariable_declaration_part : ( ( rule__Variable_declaration_part__Group__0 ) ) ;
    public final void rulevariable_declaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:266:2: ( ( ( rule__Variable_declaration_part__Group__0 ) ) )
            // InternalPascal.g:267:2: ( ( rule__Variable_declaration_part__Group__0 ) )
            {
            // InternalPascal.g:267:2: ( ( rule__Variable_declaration_part__Group__0 ) )
            // InternalPascal.g:268:3: ( rule__Variable_declaration_part__Group__0 )
            {
             before(grammarAccess.getVariable_declaration_partAccess().getGroup()); 
            // InternalPascal.g:269:3: ( rule__Variable_declaration_part__Group__0 )
            // InternalPascal.g:269:4: rule__Variable_declaration_part__Group__0
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
    // InternalPascal.g:278:1: entryRulevariable_declaration : rulevariable_declaration EOF ;
    public final void entryRulevariable_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:279:1: ( rulevariable_declaration EOF )
            // InternalPascal.g:280:1: rulevariable_declaration EOF
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
    // InternalPascal.g:287:1: rulevariable_declaration : ( ( rule__Variable_declaration__Group__0 ) ) ;
    public final void rulevariable_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:291:2: ( ( ( rule__Variable_declaration__Group__0 ) ) )
            // InternalPascal.g:292:2: ( ( rule__Variable_declaration__Group__0 ) )
            {
            // InternalPascal.g:292:2: ( ( rule__Variable_declaration__Group__0 ) )
            // InternalPascal.g:293:3: ( rule__Variable_declaration__Group__0 )
            {
             before(grammarAccess.getVariable_declarationAccess().getGroup()); 
            // InternalPascal.g:294:3: ( rule__Variable_declaration__Group__0 )
            // InternalPascal.g:294:4: rule__Variable_declaration__Group__0
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
    // InternalPascal.g:303:1: entryRulecompound_statement : rulecompound_statement EOF ;
    public final void entryRulecompound_statement() throws RecognitionException {
        try {
            // InternalPascal.g:304:1: ( rulecompound_statement EOF )
            // InternalPascal.g:305:1: rulecompound_statement EOF
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
    // InternalPascal.g:312:1: rulecompound_statement : ( ( rule__Compound_statement__Group__0 ) ) ;
    public final void rulecompound_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:316:2: ( ( ( rule__Compound_statement__Group__0 ) ) )
            // InternalPascal.g:317:2: ( ( rule__Compound_statement__Group__0 ) )
            {
            // InternalPascal.g:317:2: ( ( rule__Compound_statement__Group__0 ) )
            // InternalPascal.g:318:3: ( rule__Compound_statement__Group__0 )
            {
             before(grammarAccess.getCompound_statementAccess().getGroup()); 
            // InternalPascal.g:319:3: ( rule__Compound_statement__Group__0 )
            // InternalPascal.g:319:4: rule__Compound_statement__Group__0
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
    // InternalPascal.g:328:1: entryRulestatements : rulestatements EOF ;
    public final void entryRulestatements() throws RecognitionException {
        try {
            // InternalPascal.g:329:1: ( rulestatements EOF )
            // InternalPascal.g:330:1: rulestatements EOF
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
    // InternalPascal.g:337:1: rulestatements : ( ( rule__Statements__Group__0 ) ) ;
    public final void rulestatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:341:2: ( ( ( rule__Statements__Group__0 ) ) )
            // InternalPascal.g:342:2: ( ( rule__Statements__Group__0 ) )
            {
            // InternalPascal.g:342:2: ( ( rule__Statements__Group__0 ) )
            // InternalPascal.g:343:3: ( rule__Statements__Group__0 )
            {
             before(grammarAccess.getStatementsAccess().getGroup()); 
            // InternalPascal.g:344:3: ( rule__Statements__Group__0 )
            // InternalPascal.g:344:4: rule__Statements__Group__0
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
    // InternalPascal.g:353:1: entryRulestatement : rulestatement EOF ;
    public final void entryRulestatement() throws RecognitionException {
        try {
            // InternalPascal.g:354:1: ( rulestatement EOF )
            // InternalPascal.g:355:1: rulestatement EOF
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
    // InternalPascal.g:362:1: rulestatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void rulestatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:366:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalPascal.g:367:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalPascal.g:367:2: ( ( rule__Statement__Alternatives ) )
            // InternalPascal.g:368:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalPascal.g:369:3: ( rule__Statement__Alternatives )
            // InternalPascal.g:369:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalPascal.g:378:1: entryRuleunlabelled_statement : ruleunlabelled_statement EOF ;
    public final void entryRuleunlabelled_statement() throws RecognitionException {
        try {
            // InternalPascal.g:379:1: ( ruleunlabelled_statement EOF )
            // InternalPascal.g:380:1: ruleunlabelled_statement EOF
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
    // InternalPascal.g:387:1: ruleunlabelled_statement : ( ( rule__Unlabelled_statement__Alternatives ) ) ;
    public final void ruleunlabelled_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:391:2: ( ( ( rule__Unlabelled_statement__Alternatives ) ) )
            // InternalPascal.g:392:2: ( ( rule__Unlabelled_statement__Alternatives ) )
            {
            // InternalPascal.g:392:2: ( ( rule__Unlabelled_statement__Alternatives ) )
            // InternalPascal.g:393:3: ( rule__Unlabelled_statement__Alternatives )
            {
             before(grammarAccess.getUnlabelled_statementAccess().getAlternatives()); 
            // InternalPascal.g:394:3: ( rule__Unlabelled_statement__Alternatives )
            // InternalPascal.g:394:4: rule__Unlabelled_statement__Alternatives
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


    // $ANTLR start "entryRulelabel"
    // InternalPascal.g:403:1: entryRulelabel : rulelabel EOF ;
    public final void entryRulelabel() throws RecognitionException {
        try {
            // InternalPascal.g:404:1: ( rulelabel EOF )
            // InternalPascal.g:405:1: rulelabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            rulelabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
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
    // $ANTLR end "entryRulelabel"


    // $ANTLR start "rulelabel"
    // InternalPascal.g:412:1: rulelabel : ( ( rule__Label__NumberAssignment ) ) ;
    public final void rulelabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:416:2: ( ( ( rule__Label__NumberAssignment ) ) )
            // InternalPascal.g:417:2: ( ( rule__Label__NumberAssignment ) )
            {
            // InternalPascal.g:417:2: ( ( rule__Label__NumberAssignment ) )
            // InternalPascal.g:418:3: ( rule__Label__NumberAssignment )
            {
             before(grammarAccess.getLabelAccess().getNumberAssignment()); 
            // InternalPascal.g:419:3: ( rule__Label__NumberAssignment )
            // InternalPascal.g:419:4: rule__Label__NumberAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Label__NumberAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getNumberAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulelabel"


    // $ANTLR start "entryRulesimple_statement"
    // InternalPascal.g:428:1: entryRulesimple_statement : rulesimple_statement EOF ;
    public final void entryRulesimple_statement() throws RecognitionException {
        try {
            // InternalPascal.g:429:1: ( rulesimple_statement EOF )
            // InternalPascal.g:430:1: rulesimple_statement EOF
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
    // InternalPascal.g:437:1: rulesimple_statement : ( ( rule__Simple_statement__Alternatives ) ) ;
    public final void rulesimple_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:441:2: ( ( ( rule__Simple_statement__Alternatives ) ) )
            // InternalPascal.g:442:2: ( ( rule__Simple_statement__Alternatives ) )
            {
            // InternalPascal.g:442:2: ( ( rule__Simple_statement__Alternatives ) )
            // InternalPascal.g:443:3: ( rule__Simple_statement__Alternatives )
            {
             before(grammarAccess.getSimple_statementAccess().getAlternatives()); 
            // InternalPascal.g:444:3: ( rule__Simple_statement__Alternatives )
            // InternalPascal.g:444:4: rule__Simple_statement__Alternatives
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
    // InternalPascal.g:453:1: entryRuleassignment_statement : ruleassignment_statement EOF ;
    public final void entryRuleassignment_statement() throws RecognitionException {
        try {
            // InternalPascal.g:454:1: ( ruleassignment_statement EOF )
            // InternalPascal.g:455:1: ruleassignment_statement EOF
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
    // InternalPascal.g:462:1: ruleassignment_statement : ( ( rule__Assignment_statement__Group__0 ) ) ;
    public final void ruleassignment_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:466:2: ( ( ( rule__Assignment_statement__Group__0 ) ) )
            // InternalPascal.g:467:2: ( ( rule__Assignment_statement__Group__0 ) )
            {
            // InternalPascal.g:467:2: ( ( rule__Assignment_statement__Group__0 ) )
            // InternalPascal.g:468:3: ( rule__Assignment_statement__Group__0 )
            {
             before(grammarAccess.getAssignment_statementAccess().getGroup()); 
            // InternalPascal.g:469:3: ( rule__Assignment_statement__Group__0 )
            // InternalPascal.g:469:4: rule__Assignment_statement__Group__0
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
    // InternalPascal.g:478:1: entryRulevariable : rulevariable EOF ;
    public final void entryRulevariable() throws RecognitionException {
        try {
            // InternalPascal.g:479:1: ( rulevariable EOF )
            // InternalPascal.g:480:1: rulevariable EOF
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
    // InternalPascal.g:487:1: rulevariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void rulevariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:491:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalPascal.g:492:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalPascal.g:492:2: ( ( rule__Variable__Group__0 ) )
            // InternalPascal.g:493:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalPascal.g:494:3: ( rule__Variable__Group__0 )
            // InternalPascal.g:494:4: rule__Variable__Group__0
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
    // InternalPascal.g:503:1: entryRuleexpression : ruleexpression EOF ;
    public final void entryRuleexpression() throws RecognitionException {
        try {
            // InternalPascal.g:504:1: ( ruleexpression EOF )
            // InternalPascal.g:505:1: ruleexpression EOF
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
    // InternalPascal.g:512:1: ruleexpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:516:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalPascal.g:517:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalPascal.g:517:2: ( ( rule__Expression__Group__0 ) )
            // InternalPascal.g:518:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalPascal.g:519:3: ( rule__Expression__Group__0 )
            // InternalPascal.g:519:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
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
    // InternalPascal.g:528:1: entryRulesimple_expression : rulesimple_expression EOF ;
    public final void entryRulesimple_expression() throws RecognitionException {
        try {
            // InternalPascal.g:529:1: ( rulesimple_expression EOF )
            // InternalPascal.g:530:1: rulesimple_expression EOF
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
    // InternalPascal.g:537:1: rulesimple_expression : ( ( rule__Simple_expression__Group__0 ) ) ;
    public final void rulesimple_expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:541:2: ( ( ( rule__Simple_expression__Group__0 ) ) )
            // InternalPascal.g:542:2: ( ( rule__Simple_expression__Group__0 ) )
            {
            // InternalPascal.g:542:2: ( ( rule__Simple_expression__Group__0 ) )
            // InternalPascal.g:543:3: ( rule__Simple_expression__Group__0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getGroup()); 
            // InternalPascal.g:544:3: ( rule__Simple_expression__Group__0 )
            // InternalPascal.g:544:4: rule__Simple_expression__Group__0
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
    // InternalPascal.g:553:1: entryRuleterm : ruleterm EOF ;
    public final void entryRuleterm() throws RecognitionException {
        try {
            // InternalPascal.g:554:1: ( ruleterm EOF )
            // InternalPascal.g:555:1: ruleterm EOF
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
    // InternalPascal.g:562:1: ruleterm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleterm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:566:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalPascal.g:567:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalPascal.g:567:2: ( ( rule__Term__Group__0 ) )
            // InternalPascal.g:568:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalPascal.g:569:3: ( rule__Term__Group__0 )
            // InternalPascal.g:569:4: rule__Term__Group__0
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
    // InternalPascal.g:578:1: entryRulesigned_factor : rulesigned_factor EOF ;
    public final void entryRulesigned_factor() throws RecognitionException {
        try {
            // InternalPascal.g:579:1: ( rulesigned_factor EOF )
            // InternalPascal.g:580:1: rulesigned_factor EOF
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
    // InternalPascal.g:587:1: rulesigned_factor : ( ( rule__Signed_factor__Group__0 ) ) ;
    public final void rulesigned_factor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:591:2: ( ( ( rule__Signed_factor__Group__0 ) ) )
            // InternalPascal.g:592:2: ( ( rule__Signed_factor__Group__0 ) )
            {
            // InternalPascal.g:592:2: ( ( rule__Signed_factor__Group__0 ) )
            // InternalPascal.g:593:3: ( rule__Signed_factor__Group__0 )
            {
             before(grammarAccess.getSigned_factorAccess().getGroup()); 
            // InternalPascal.g:594:3: ( rule__Signed_factor__Group__0 )
            // InternalPascal.g:594:4: rule__Signed_factor__Group__0
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
    // InternalPascal.g:603:1: entryRulefactor : rulefactor EOF ;
    public final void entryRulefactor() throws RecognitionException {
        try {
            // InternalPascal.g:604:1: ( rulefactor EOF )
            // InternalPascal.g:605:1: rulefactor EOF
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
    // InternalPascal.g:612:1: rulefactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void rulefactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:616:2: ( ( ( rule__Factor__Alternatives ) ) )
            // InternalPascal.g:617:2: ( ( rule__Factor__Alternatives ) )
            {
            // InternalPascal.g:617:2: ( ( rule__Factor__Alternatives ) )
            // InternalPascal.g:618:3: ( rule__Factor__Alternatives )
            {
             before(grammarAccess.getFactorAccess().getAlternatives()); 
            // InternalPascal.g:619:3: ( rule__Factor__Alternatives )
            // InternalPascal.g:619:4: rule__Factor__Alternatives
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


    // $ANTLR start "entryRuleset"
    // InternalPascal.g:628:1: entryRuleset : ruleset EOF ;
    public final void entryRuleset() throws RecognitionException {
        try {
            // InternalPascal.g:629:1: ( ruleset EOF )
            // InternalPascal.g:630:1: ruleset EOF
            {
             before(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            ruleset();

            state._fsp--;

             after(grammarAccess.getSetRule()); 
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
    // $ANTLR end "entryRuleset"


    // $ANTLR start "ruleset"
    // InternalPascal.g:637:1: ruleset : ( ( rule__Set__Alternatives ) ) ;
    public final void ruleset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:641:2: ( ( ( rule__Set__Alternatives ) ) )
            // InternalPascal.g:642:2: ( ( rule__Set__Alternatives ) )
            {
            // InternalPascal.g:642:2: ( ( rule__Set__Alternatives ) )
            // InternalPascal.g:643:3: ( rule__Set__Alternatives )
            {
             before(grammarAccess.getSetAccess().getAlternatives()); 
            // InternalPascal.g:644:3: ( rule__Set__Alternatives )
            // InternalPascal.g:644:4: rule__Set__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Set__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleset"


    // $ANTLR start "entryRuleelementList"
    // InternalPascal.g:653:1: entryRuleelementList : ruleelementList EOF ;
    public final void entryRuleelementList() throws RecognitionException {
        try {
            // InternalPascal.g:654:1: ( ruleelementList EOF )
            // InternalPascal.g:655:1: ruleelementList EOF
            {
             before(grammarAccess.getElementListRule()); 
            pushFollow(FOLLOW_1);
            ruleelementList();

            state._fsp--;

             after(grammarAccess.getElementListRule()); 
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
    // $ANTLR end "entryRuleelementList"


    // $ANTLR start "ruleelementList"
    // InternalPascal.g:662:1: ruleelementList : ( ( rule__ElementList__Group__0 ) ) ;
    public final void ruleelementList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:666:2: ( ( ( rule__ElementList__Group__0 ) ) )
            // InternalPascal.g:667:2: ( ( rule__ElementList__Group__0 ) )
            {
            // InternalPascal.g:667:2: ( ( rule__ElementList__Group__0 ) )
            // InternalPascal.g:668:3: ( rule__ElementList__Group__0 )
            {
             before(grammarAccess.getElementListAccess().getGroup()); 
            // InternalPascal.g:669:3: ( rule__ElementList__Group__0 )
            // InternalPascal.g:669:4: rule__ElementList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElementList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleelementList"


    // $ANTLR start "entryRuleelement"
    // InternalPascal.g:678:1: entryRuleelement : ruleelement EOF ;
    public final void entryRuleelement() throws RecognitionException {
        try {
            // InternalPascal.g:679:1: ( ruleelement EOF )
            // InternalPascal.g:680:1: ruleelement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleelement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleelement"


    // $ANTLR start "ruleelement"
    // InternalPascal.g:687:1: ruleelement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleelement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:691:2: ( ( ( rule__Element__Group__0 ) ) )
            // InternalPascal.g:692:2: ( ( rule__Element__Group__0 ) )
            {
            // InternalPascal.g:692:2: ( ( rule__Element__Group__0 ) )
            // InternalPascal.g:693:3: ( rule__Element__Group__0 )
            {
             before(grammarAccess.getElementAccess().getGroup()); 
            // InternalPascal.g:694:3: ( rule__Element__Group__0 )
            // InternalPascal.g:694:4: rule__Element__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleelement"


    // $ANTLR start "entryRuletype"
    // InternalPascal.g:703:1: entryRuletype : ruletype EOF ;
    public final void entryRuletype() throws RecognitionException {
        try {
            // InternalPascal.g:704:1: ( ruletype EOF )
            // InternalPascal.g:705:1: ruletype EOF
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
    // InternalPascal.g:712:1: ruletype : ( ( rule__Type__TypeAssignment ) ) ;
    public final void ruletype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:716:2: ( ( ( rule__Type__TypeAssignment ) ) )
            // InternalPascal.g:717:2: ( ( rule__Type__TypeAssignment ) )
            {
            // InternalPascal.g:717:2: ( ( rule__Type__TypeAssignment ) )
            // InternalPascal.g:718:3: ( rule__Type__TypeAssignment )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment()); 
            // InternalPascal.g:719:3: ( rule__Type__TypeAssignment )
            // InternalPascal.g:719:4: rule__Type__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypeAssignment()); 

            }


            }

        }
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
    // InternalPascal.g:728:1: entryRulesimple_type : rulesimple_type EOF ;
    public final void entryRulesimple_type() throws RecognitionException {
        try {
            // InternalPascal.g:729:1: ( rulesimple_type EOF )
            // InternalPascal.g:730:1: rulesimple_type EOF
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
    // InternalPascal.g:737:1: rulesimple_type : ( ( rule__Simple_type__Alternatives ) ) ;
    public final void rulesimple_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:741:2: ( ( ( rule__Simple_type__Alternatives ) ) )
            // InternalPascal.g:742:2: ( ( rule__Simple_type__Alternatives ) )
            {
            // InternalPascal.g:742:2: ( ( rule__Simple_type__Alternatives ) )
            // InternalPascal.g:743:3: ( rule__Simple_type__Alternatives )
            {
             before(grammarAccess.getSimple_typeAccess().getAlternatives()); 
            // InternalPascal.g:744:3: ( rule__Simple_type__Alternatives )
            // InternalPascal.g:744:4: rule__Simple_type__Alternatives
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


    // $ANTLR start "entryRulescalar_type"
    // InternalPascal.g:753:1: entryRulescalar_type : rulescalar_type EOF ;
    public final void entryRulescalar_type() throws RecognitionException {
        try {
            // InternalPascal.g:754:1: ( rulescalar_type EOF )
            // InternalPascal.g:755:1: rulescalar_type EOF
            {
             before(grammarAccess.getScalar_typeRule()); 
            pushFollow(FOLLOW_1);
            rulescalar_type();

            state._fsp--;

             after(grammarAccess.getScalar_typeRule()); 
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
    // $ANTLR end "entryRulescalar_type"


    // $ANTLR start "rulescalar_type"
    // InternalPascal.g:762:1: rulescalar_type : ( ( rule__Scalar_type__Group__0 ) ) ;
    public final void rulescalar_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:766:2: ( ( ( rule__Scalar_type__Group__0 ) ) )
            // InternalPascal.g:767:2: ( ( rule__Scalar_type__Group__0 ) )
            {
            // InternalPascal.g:767:2: ( ( rule__Scalar_type__Group__0 ) )
            // InternalPascal.g:768:3: ( rule__Scalar_type__Group__0 )
            {
             before(grammarAccess.getScalar_typeAccess().getGroup()); 
            // InternalPascal.g:769:3: ( rule__Scalar_type__Group__0 )
            // InternalPascal.g:769:4: rule__Scalar_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scalar_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScalar_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulescalar_type"


    // $ANTLR start "entryRulesubrange_type"
    // InternalPascal.g:778:1: entryRulesubrange_type : rulesubrange_type EOF ;
    public final void entryRulesubrange_type() throws RecognitionException {
        try {
            // InternalPascal.g:779:1: ( rulesubrange_type EOF )
            // InternalPascal.g:780:1: rulesubrange_type EOF
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
    // InternalPascal.g:787:1: rulesubrange_type : ( ( rule__Subrange_type__Group__0 ) ) ;
    public final void rulesubrange_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:791:2: ( ( ( rule__Subrange_type__Group__0 ) ) )
            // InternalPascal.g:792:2: ( ( rule__Subrange_type__Group__0 ) )
            {
            // InternalPascal.g:792:2: ( ( rule__Subrange_type__Group__0 ) )
            // InternalPascal.g:793:3: ( rule__Subrange_type__Group__0 )
            {
             before(grammarAccess.getSubrange_typeAccess().getGroup()); 
            // InternalPascal.g:794:3: ( rule__Subrange_type__Group__0 )
            // InternalPascal.g:794:4: rule__Subrange_type__Group__0
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


    // $ANTLR start "entryRuletype_identifier"
    // InternalPascal.g:803:1: entryRuletype_identifier : ruletype_identifier EOF ;
    public final void entryRuletype_identifier() throws RecognitionException {
        try {
            // InternalPascal.g:804:1: ( ruletype_identifier EOF )
            // InternalPascal.g:805:1: ruletype_identifier EOF
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
    // InternalPascal.g:812:1: ruletype_identifier : ( ( rule__Type_identifier__Alternatives ) ) ;
    public final void ruletype_identifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:816:2: ( ( ( rule__Type_identifier__Alternatives ) ) )
            // InternalPascal.g:817:2: ( ( rule__Type_identifier__Alternatives ) )
            {
            // InternalPascal.g:817:2: ( ( rule__Type_identifier__Alternatives ) )
            // InternalPascal.g:818:3: ( rule__Type_identifier__Alternatives )
            {
             before(grammarAccess.getType_identifierAccess().getAlternatives()); 
            // InternalPascal.g:819:3: ( rule__Type_identifier__Alternatives )
            // InternalPascal.g:819:4: rule__Type_identifier__Alternatives
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


    // $ANTLR start "entryRulestring_type"
    // InternalPascal.g:828:1: entryRulestring_type : rulestring_type EOF ;
    public final void entryRulestring_type() throws RecognitionException {
        try {
            // InternalPascal.g:829:1: ( rulestring_type EOF )
            // InternalPascal.g:830:1: rulestring_type EOF
            {
             before(grammarAccess.getString_typeRule()); 
            pushFollow(FOLLOW_1);
            rulestring_type();

            state._fsp--;

             after(grammarAccess.getString_typeRule()); 
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
    // $ANTLR end "entryRulestring_type"


    // $ANTLR start "rulestring_type"
    // InternalPascal.g:837:1: rulestring_type : ( ( rule__String_type__Group__0 ) ) ;
    public final void rulestring_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:841:2: ( ( ( rule__String_type__Group__0 ) ) )
            // InternalPascal.g:842:2: ( ( rule__String_type__Group__0 ) )
            {
            // InternalPascal.g:842:2: ( ( rule__String_type__Group__0 ) )
            // InternalPascal.g:843:3: ( rule__String_type__Group__0 )
            {
             before(grammarAccess.getString_typeAccess().getGroup()); 
            // InternalPascal.g:844:3: ( rule__String_type__Group__0 )
            // InternalPascal.g:844:4: rule__String_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__String_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getString_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestring_type"


    // $ANTLR start "entryRuleunsigned_constant"
    // InternalPascal.g:853:1: entryRuleunsigned_constant : ruleunsigned_constant EOF ;
    public final void entryRuleunsigned_constant() throws RecognitionException {
        try {
            // InternalPascal.g:854:1: ( ruleunsigned_constant EOF )
            // InternalPascal.g:855:1: ruleunsigned_constant EOF
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
    // InternalPascal.g:862:1: ruleunsigned_constant : ( ( rule__Unsigned_constant__Alternatives ) ) ;
    public final void ruleunsigned_constant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:866:2: ( ( ( rule__Unsigned_constant__Alternatives ) ) )
            // InternalPascal.g:867:2: ( ( rule__Unsigned_constant__Alternatives ) )
            {
            // InternalPascal.g:867:2: ( ( rule__Unsigned_constant__Alternatives ) )
            // InternalPascal.g:868:3: ( rule__Unsigned_constant__Alternatives )
            {
             before(grammarAccess.getUnsigned_constantAccess().getAlternatives()); 
            // InternalPascal.g:869:3: ( rule__Unsigned_constant__Alternatives )
            // InternalPascal.g:869:4: rule__Unsigned_constant__Alternatives
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
    // InternalPascal.g:878:1: entryRuleunsigned_number : ruleunsigned_number EOF ;
    public final void entryRuleunsigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:879:1: ( ruleunsigned_number EOF )
            // InternalPascal.g:880:1: ruleunsigned_number EOF
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
    // InternalPascal.g:887:1: ruleunsigned_number : ( ( rule__Unsigned_number__Alternatives ) ) ;
    public final void ruleunsigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:891:2: ( ( ( rule__Unsigned_number__Alternatives ) ) )
            // InternalPascal.g:892:2: ( ( rule__Unsigned_number__Alternatives ) )
            {
            // InternalPascal.g:892:2: ( ( rule__Unsigned_number__Alternatives ) )
            // InternalPascal.g:893:3: ( rule__Unsigned_number__Alternatives )
            {
             before(grammarAccess.getUnsigned_numberAccess().getAlternatives()); 
            // InternalPascal.g:894:3: ( rule__Unsigned_number__Alternatives )
            // InternalPascal.g:894:4: rule__Unsigned_number__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Unsigned_number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnsigned_numberAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleconstant_chr"
    // InternalPascal.g:903:1: entryRuleconstant_chr : ruleconstant_chr EOF ;
    public final void entryRuleconstant_chr() throws RecognitionException {
        try {
            // InternalPascal.g:904:1: ( ruleconstant_chr EOF )
            // InternalPascal.g:905:1: ruleconstant_chr EOF
            {
             before(grammarAccess.getConstant_chrRule()); 
            pushFollow(FOLLOW_1);
            ruleconstant_chr();

            state._fsp--;

             after(grammarAccess.getConstant_chrRule()); 
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
    // $ANTLR end "entryRuleconstant_chr"


    // $ANTLR start "ruleconstant_chr"
    // InternalPascal.g:912:1: ruleconstant_chr : ( ( rule__Constant_chr__Group__0 ) ) ;
    public final void ruleconstant_chr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:916:2: ( ( ( rule__Constant_chr__Group__0 ) ) )
            // InternalPascal.g:917:2: ( ( rule__Constant_chr__Group__0 ) )
            {
            // InternalPascal.g:917:2: ( ( rule__Constant_chr__Group__0 ) )
            // InternalPascal.g:918:3: ( rule__Constant_chr__Group__0 )
            {
             before(grammarAccess.getConstant_chrAccess().getGroup()); 
            // InternalPascal.g:919:3: ( rule__Constant_chr__Group__0 )
            // InternalPascal.g:919:4: rule__Constant_chr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant_chr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_chrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconstant_chr"


    // $ANTLR start "entryRuleprocedure_statement"
    // InternalPascal.g:928:1: entryRuleprocedure_statement : ruleprocedure_statement EOF ;
    public final void entryRuleprocedure_statement() throws RecognitionException {
        try {
            // InternalPascal.g:929:1: ( ruleprocedure_statement EOF )
            // InternalPascal.g:930:1: ruleprocedure_statement EOF
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
    // InternalPascal.g:937:1: ruleprocedure_statement : ( ( rule__Procedure_statement__Group__0 ) ) ;
    public final void ruleprocedure_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:941:2: ( ( ( rule__Procedure_statement__Group__0 ) ) )
            // InternalPascal.g:942:2: ( ( rule__Procedure_statement__Group__0 ) )
            {
            // InternalPascal.g:942:2: ( ( rule__Procedure_statement__Group__0 ) )
            // InternalPascal.g:943:3: ( rule__Procedure_statement__Group__0 )
            {
             before(grammarAccess.getProcedure_statementAccess().getGroup()); 
            // InternalPascal.g:944:3: ( rule__Procedure_statement__Group__0 )
            // InternalPascal.g:944:4: rule__Procedure_statement__Group__0
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
    // InternalPascal.g:953:1: entryRuleparameter_list : ruleparameter_list EOF ;
    public final void entryRuleparameter_list() throws RecognitionException {
        try {
            // InternalPascal.g:954:1: ( ruleparameter_list EOF )
            // InternalPascal.g:955:1: ruleparameter_list EOF
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
    // InternalPascal.g:962:1: ruleparameter_list : ( ( rule__Parameter_list__Group__0 ) ) ;
    public final void ruleparameter_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:966:2: ( ( ( rule__Parameter_list__Group__0 ) ) )
            // InternalPascal.g:967:2: ( ( rule__Parameter_list__Group__0 ) )
            {
            // InternalPascal.g:967:2: ( ( rule__Parameter_list__Group__0 ) )
            // InternalPascal.g:968:3: ( rule__Parameter_list__Group__0 )
            {
             before(grammarAccess.getParameter_listAccess().getGroup()); 
            // InternalPascal.g:969:3: ( rule__Parameter_list__Group__0 )
            // InternalPascal.g:969:4: rule__Parameter_list__Group__0
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
    // InternalPascal.g:978:1: entryRuleactual_parameter : ruleactual_parameter EOF ;
    public final void entryRuleactual_parameter() throws RecognitionException {
        try {
            // InternalPascal.g:979:1: ( ruleactual_parameter EOF )
            // InternalPascal.g:980:1: ruleactual_parameter EOF
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
    // InternalPascal.g:987:1: ruleactual_parameter : ( ruleexpression ) ;
    public final void ruleactual_parameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:991:2: ( ( ruleexpression ) )
            // InternalPascal.g:992:2: ( ruleexpression )
            {
            // InternalPascal.g:992:2: ( ruleexpression )
            // InternalPascal.g:993:3: ruleexpression
            {
             before(grammarAccess.getActual_parameterAccess().getExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getActual_parameterAccess().getExpressionParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRulegoto_statement"
    // InternalPascal.g:1003:1: entryRulegoto_statement : rulegoto_statement EOF ;
    public final void entryRulegoto_statement() throws RecognitionException {
        try {
            // InternalPascal.g:1004:1: ( rulegoto_statement EOF )
            // InternalPascal.g:1005:1: rulegoto_statement EOF
            {
             before(grammarAccess.getGoto_statementRule()); 
            pushFollow(FOLLOW_1);
            rulegoto_statement();

            state._fsp--;

             after(grammarAccess.getGoto_statementRule()); 
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
    // $ANTLR end "entryRulegoto_statement"


    // $ANTLR start "rulegoto_statement"
    // InternalPascal.g:1012:1: rulegoto_statement : ( 'goto' ) ;
    public final void rulegoto_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1016:2: ( ( 'goto' ) )
            // InternalPascal.g:1017:2: ( 'goto' )
            {
            // InternalPascal.g:1017:2: ( 'goto' )
            // InternalPascal.g:1018:3: 'goto'
            {
             before(grammarAccess.getGoto_statementAccess().getGotoKeyword()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGoto_statementAccess().getGotoKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulegoto_statement"


    // $ANTLR start "entryRulestructured_statement"
    // InternalPascal.g:1028:1: entryRulestructured_statement : rulestructured_statement EOF ;
    public final void entryRulestructured_statement() throws RecognitionException {
        try {
            // InternalPascal.g:1029:1: ( rulestructured_statement EOF )
            // InternalPascal.g:1030:1: rulestructured_statement EOF
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
    // InternalPascal.g:1037:1: rulestructured_statement : ( 'structured' ) ;
    public final void rulestructured_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1041:2: ( ( 'structured' ) )
            // InternalPascal.g:1042:2: ( 'structured' )
            {
            // InternalPascal.g:1042:2: ( 'structured' )
            // InternalPascal.g:1043:3: 'structured'
            {
             before(grammarAccess.getStructured_statementAccess().getStructuredKeyword()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStructured_statementAccess().getStructuredKeyword()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleunsigned_integer"
    // InternalPascal.g:1053:1: entryRuleunsigned_integer : ruleunsigned_integer EOF ;
    public final void entryRuleunsigned_integer() throws RecognitionException {
        try {
            // InternalPascal.g:1054:1: ( ruleunsigned_integer EOF )
            // InternalPascal.g:1055:1: ruleunsigned_integer EOF
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
    // InternalPascal.g:1062:1: ruleunsigned_integer : ( RULE_NUM_INT ) ;
    public final void ruleunsigned_integer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1066:2: ( ( RULE_NUM_INT ) )
            // InternalPascal.g:1067:2: ( RULE_NUM_INT )
            {
            // InternalPascal.g:1067:2: ( RULE_NUM_INT )
            // InternalPascal.g:1068:3: RULE_NUM_INT
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


    // $ANTLR start "entryRuleunsigned_real"
    // InternalPascal.g:1078:1: entryRuleunsigned_real : ruleunsigned_real EOF ;
    public final void entryRuleunsigned_real() throws RecognitionException {
        try {
            // InternalPascal.g:1079:1: ( ruleunsigned_real EOF )
            // InternalPascal.g:1080:1: ruleunsigned_real EOF
            {
             before(grammarAccess.getUnsigned_realRule()); 
            pushFollow(FOLLOW_1);
            ruleunsigned_real();

            state._fsp--;

             after(grammarAccess.getUnsigned_realRule()); 
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
    // $ANTLR end "entryRuleunsigned_real"


    // $ANTLR start "ruleunsigned_real"
    // InternalPascal.g:1087:1: ruleunsigned_real : ( RULE_NUM_REAL ) ;
    public final void ruleunsigned_real() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1091:2: ( ( RULE_NUM_REAL ) )
            // InternalPascal.g:1092:2: ( RULE_NUM_REAL )
            {
            // InternalPascal.g:1092:2: ( RULE_NUM_REAL )
            // InternalPascal.g:1093:3: RULE_NUM_REAL
            {
             before(grammarAccess.getUnsigned_realAccess().getNUM_REALTerminalRuleCall()); 
            match(input,RULE_NUM_REAL,FOLLOW_2); 
             after(grammarAccess.getUnsigned_realAccess().getNUM_REALTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleunsigned_real"


    // $ANTLR start "entryRuleadditive_operator"
    // InternalPascal.g:1103:1: entryRuleadditive_operator : ruleadditive_operator EOF ;
    public final void entryRuleadditive_operator() throws RecognitionException {
        try {
            // InternalPascal.g:1104:1: ( ruleadditive_operator EOF )
            // InternalPascal.g:1105:1: ruleadditive_operator EOF
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
    // InternalPascal.g:1112:1: ruleadditive_operator : ( ( rule__Additive_operator__Alternatives ) ) ;
    public final void ruleadditive_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1116:2: ( ( ( rule__Additive_operator__Alternatives ) ) )
            // InternalPascal.g:1117:2: ( ( rule__Additive_operator__Alternatives ) )
            {
            // InternalPascal.g:1117:2: ( ( rule__Additive_operator__Alternatives ) )
            // InternalPascal.g:1118:3: ( rule__Additive_operator__Alternatives )
            {
             before(grammarAccess.getAdditive_operatorAccess().getAlternatives()); 
            // InternalPascal.g:1119:3: ( rule__Additive_operator__Alternatives )
            // InternalPascal.g:1119:4: rule__Additive_operator__Alternatives
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
    // InternalPascal.g:1128:1: entryRulemultiplicative_operator : rulemultiplicative_operator EOF ;
    public final void entryRulemultiplicative_operator() throws RecognitionException {
        try {
            // InternalPascal.g:1129:1: ( rulemultiplicative_operator EOF )
            // InternalPascal.g:1130:1: rulemultiplicative_operator EOF
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
    // InternalPascal.g:1137:1: rulemultiplicative_operator : ( ( rule__Multiplicative_operator__Alternatives ) ) ;
    public final void rulemultiplicative_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1141:2: ( ( ( rule__Multiplicative_operator__Alternatives ) ) )
            // InternalPascal.g:1142:2: ( ( rule__Multiplicative_operator__Alternatives ) )
            {
            // InternalPascal.g:1142:2: ( ( rule__Multiplicative_operator__Alternatives ) )
            // InternalPascal.g:1143:3: ( rule__Multiplicative_operator__Alternatives )
            {
             before(grammarAccess.getMultiplicative_operatorAccess().getAlternatives()); 
            // InternalPascal.g:1144:3: ( rule__Multiplicative_operator__Alternatives )
            // InternalPascal.g:1144:4: rule__Multiplicative_operator__Alternatives
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


    // $ANTLR start "entryRulerelational_operator"
    // InternalPascal.g:1153:1: entryRulerelational_operator : rulerelational_operator EOF ;
    public final void entryRulerelational_operator() throws RecognitionException {
        try {
            // InternalPascal.g:1154:1: ( rulerelational_operator EOF )
            // InternalPascal.g:1155:1: rulerelational_operator EOF
            {
             before(grammarAccess.getRelational_operatorRule()); 
            pushFollow(FOLLOW_1);
            rulerelational_operator();

            state._fsp--;

             after(grammarAccess.getRelational_operatorRule()); 
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
    // $ANTLR end "entryRulerelational_operator"


    // $ANTLR start "rulerelational_operator"
    // InternalPascal.g:1162:1: rulerelational_operator : ( ( rule__Relational_operator__Alternatives ) ) ;
    public final void rulerelational_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1166:2: ( ( ( rule__Relational_operator__Alternatives ) ) )
            // InternalPascal.g:1167:2: ( ( rule__Relational_operator__Alternatives ) )
            {
            // InternalPascal.g:1167:2: ( ( rule__Relational_operator__Alternatives ) )
            // InternalPascal.g:1168:3: ( rule__Relational_operator__Alternatives )
            {
             before(grammarAccess.getRelational_operatorAccess().getAlternatives()); 
            // InternalPascal.g:1169:3: ( rule__Relational_operator__Alternatives )
            // InternalPascal.g:1169:4: rule__Relational_operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Relational_operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelational_operatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerelational_operator"


    // $ANTLR start "entryRuleprocedure_and_function_declaration_part"
    // InternalPascal.g:1178:1: entryRuleprocedure_and_function_declaration_part : ruleprocedure_and_function_declaration_part EOF ;
    public final void entryRuleprocedure_and_function_declaration_part() throws RecognitionException {
        try {
            // InternalPascal.g:1179:1: ( ruleprocedure_and_function_declaration_part EOF )
            // InternalPascal.g:1180:1: ruleprocedure_and_function_declaration_part EOF
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
    // InternalPascal.g:1187:1: ruleprocedure_and_function_declaration_part : ( ( rule__Procedure_and_function_declaration_part__Group__0 ) ) ;
    public final void ruleprocedure_and_function_declaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1191:2: ( ( ( rule__Procedure_and_function_declaration_part__Group__0 ) ) )
            // InternalPascal.g:1192:2: ( ( rule__Procedure_and_function_declaration_part__Group__0 ) )
            {
            // InternalPascal.g:1192:2: ( ( rule__Procedure_and_function_declaration_part__Group__0 ) )
            // InternalPascal.g:1193:3: ( rule__Procedure_and_function_declaration_part__Group__0 )
            {
             before(grammarAccess.getProcedure_and_function_declaration_partAccess().getGroup()); 
            // InternalPascal.g:1194:3: ( rule__Procedure_and_function_declaration_part__Group__0 )
            // InternalPascal.g:1194:4: rule__Procedure_and_function_declaration_part__Group__0
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
    // InternalPascal.g:1203:1: entryRuleprocedure_or_function_declaration : ruleprocedure_or_function_declaration EOF ;
    public final void entryRuleprocedure_or_function_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:1204:1: ( ruleprocedure_or_function_declaration EOF )
            // InternalPascal.g:1205:1: ruleprocedure_or_function_declaration EOF
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
    // InternalPascal.g:1212:1: ruleprocedure_or_function_declaration : ( ( rule__Procedure_or_function_declaration__Alternatives ) ) ;
    public final void ruleprocedure_or_function_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1216:2: ( ( ( rule__Procedure_or_function_declaration__Alternatives ) ) )
            // InternalPascal.g:1217:2: ( ( rule__Procedure_or_function_declaration__Alternatives ) )
            {
            // InternalPascal.g:1217:2: ( ( rule__Procedure_or_function_declaration__Alternatives ) )
            // InternalPascal.g:1218:3: ( rule__Procedure_or_function_declaration__Alternatives )
            {
             before(grammarAccess.getProcedure_or_function_declarationAccess().getAlternatives()); 
            // InternalPascal.g:1219:3: ( rule__Procedure_or_function_declaration__Alternatives )
            // InternalPascal.g:1219:4: rule__Procedure_or_function_declaration__Alternatives
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
    // InternalPascal.g:1228:1: entryRuleprocedure_declaration : ruleprocedure_declaration EOF ;
    public final void entryRuleprocedure_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:1229:1: ( ruleprocedure_declaration EOF )
            // InternalPascal.g:1230:1: ruleprocedure_declaration EOF
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
    // InternalPascal.g:1237:1: ruleprocedure_declaration : ( ( rule__Procedure_declaration__Group__0 ) ) ;
    public final void ruleprocedure_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1241:2: ( ( ( rule__Procedure_declaration__Group__0 ) ) )
            // InternalPascal.g:1242:2: ( ( rule__Procedure_declaration__Group__0 ) )
            {
            // InternalPascal.g:1242:2: ( ( rule__Procedure_declaration__Group__0 ) )
            // InternalPascal.g:1243:3: ( rule__Procedure_declaration__Group__0 )
            {
             before(grammarAccess.getProcedure_declarationAccess().getGroup()); 
            // InternalPascal.g:1244:3: ( rule__Procedure_declaration__Group__0 )
            // InternalPascal.g:1244:4: rule__Procedure_declaration__Group__0
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


    // $ANTLR start "entryRuleprocedure_type"
    // InternalPascal.g:1253:1: entryRuleprocedure_type : ruleprocedure_type EOF ;
    public final void entryRuleprocedure_type() throws RecognitionException {
        try {
            // InternalPascal.g:1254:1: ( ruleprocedure_type EOF )
            // InternalPascal.g:1255:1: ruleprocedure_type EOF
            {
             before(grammarAccess.getProcedure_typeRule()); 
            pushFollow(FOLLOW_1);
            ruleprocedure_type();

            state._fsp--;

             after(grammarAccess.getProcedure_typeRule()); 
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
    // $ANTLR end "entryRuleprocedure_type"


    // $ANTLR start "ruleprocedure_type"
    // InternalPascal.g:1262:1: ruleprocedure_type : ( ( rule__Procedure_type__Group__0 ) ) ;
    public final void ruleprocedure_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1266:2: ( ( ( rule__Procedure_type__Group__0 ) ) )
            // InternalPascal.g:1267:2: ( ( rule__Procedure_type__Group__0 ) )
            {
            // InternalPascal.g:1267:2: ( ( rule__Procedure_type__Group__0 ) )
            // InternalPascal.g:1268:3: ( rule__Procedure_type__Group__0 )
            {
             before(grammarAccess.getProcedure_typeAccess().getGroup()); 
            // InternalPascal.g:1269:3: ( rule__Procedure_type__Group__0 )
            // InternalPascal.g:1269:4: rule__Procedure_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprocedure_type"


    // $ANTLR start "entryRulefunction_declaration"
    // InternalPascal.g:1278:1: entryRulefunction_declaration : rulefunction_declaration EOF ;
    public final void entryRulefunction_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:1279:1: ( rulefunction_declaration EOF )
            // InternalPascal.g:1280:1: rulefunction_declaration EOF
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
    // InternalPascal.g:1287:1: rulefunction_declaration : ( ( rule__Function_declaration__Group__0 ) ) ;
    public final void rulefunction_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1291:2: ( ( ( rule__Function_declaration__Group__0 ) ) )
            // InternalPascal.g:1292:2: ( ( rule__Function_declaration__Group__0 ) )
            {
            // InternalPascal.g:1292:2: ( ( rule__Function_declaration__Group__0 ) )
            // InternalPascal.g:1293:3: ( rule__Function_declaration__Group__0 )
            {
             before(grammarAccess.getFunction_declarationAccess().getGroup()); 
            // InternalPascal.g:1294:3: ( rule__Function_declaration__Group__0 )
            // InternalPascal.g:1294:4: rule__Function_declaration__Group__0
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


    // $ANTLR start "entryRulefunction_type"
    // InternalPascal.g:1303:1: entryRulefunction_type : rulefunction_type EOF ;
    public final void entryRulefunction_type() throws RecognitionException {
        try {
            // InternalPascal.g:1304:1: ( rulefunction_type EOF )
            // InternalPascal.g:1305:1: rulefunction_type EOF
            {
             before(grammarAccess.getFunction_typeRule()); 
            pushFollow(FOLLOW_1);
            rulefunction_type();

            state._fsp--;

             after(grammarAccess.getFunction_typeRule()); 
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
    // $ANTLR end "entryRulefunction_type"


    // $ANTLR start "rulefunction_type"
    // InternalPascal.g:1312:1: rulefunction_type : ( ( rule__Function_type__Group__0 ) ) ;
    public final void rulefunction_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1316:2: ( ( ( rule__Function_type__Group__0 ) ) )
            // InternalPascal.g:1317:2: ( ( rule__Function_type__Group__0 ) )
            {
            // InternalPascal.g:1317:2: ( ( rule__Function_type__Group__0 ) )
            // InternalPascal.g:1318:3: ( rule__Function_type__Group__0 )
            {
             before(grammarAccess.getFunction_typeAccess().getGroup()); 
            // InternalPascal.g:1319:3: ( rule__Function_type__Group__0 )
            // InternalPascal.g:1319:4: rule__Function_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunction_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefunction_type"


    // $ANTLR start "entryRulefunction_designator"
    // InternalPascal.g:1328:1: entryRulefunction_designator : rulefunction_designator EOF ;
    public final void entryRulefunction_designator() throws RecognitionException {
        try {
            // InternalPascal.g:1329:1: ( rulefunction_designator EOF )
            // InternalPascal.g:1330:1: rulefunction_designator EOF
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
    // InternalPascal.g:1337:1: rulefunction_designator : ( ( rule__Function_designator__Group__0 ) ) ;
    public final void rulefunction_designator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1341:2: ( ( ( rule__Function_designator__Group__0 ) ) )
            // InternalPascal.g:1342:2: ( ( rule__Function_designator__Group__0 ) )
            {
            // InternalPascal.g:1342:2: ( ( rule__Function_designator__Group__0 ) )
            // InternalPascal.g:1343:3: ( rule__Function_designator__Group__0 )
            {
             before(grammarAccess.getFunction_designatorAccess().getGroup()); 
            // InternalPascal.g:1344:3: ( rule__Function_designator__Group__0 )
            // InternalPascal.g:1344:4: rule__Function_designator__Group__0
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
    // InternalPascal.g:1353:1: entryRuleformal_parameter_list : ruleformal_parameter_list EOF ;
    public final void entryRuleformal_parameter_list() throws RecognitionException {
        try {
            // InternalPascal.g:1354:1: ( ruleformal_parameter_list EOF )
            // InternalPascal.g:1355:1: ruleformal_parameter_list EOF
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
    // InternalPascal.g:1362:1: ruleformal_parameter_list : ( ( rule__Formal_parameter_list__Group__0 ) ) ;
    public final void ruleformal_parameter_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1366:2: ( ( ( rule__Formal_parameter_list__Group__0 ) ) )
            // InternalPascal.g:1367:2: ( ( rule__Formal_parameter_list__Group__0 ) )
            {
            // InternalPascal.g:1367:2: ( ( rule__Formal_parameter_list__Group__0 ) )
            // InternalPascal.g:1368:3: ( rule__Formal_parameter_list__Group__0 )
            {
             before(grammarAccess.getFormal_parameter_listAccess().getGroup()); 
            // InternalPascal.g:1369:3: ( rule__Formal_parameter_list__Group__0 )
            // InternalPascal.g:1369:4: rule__Formal_parameter_list__Group__0
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
    // InternalPascal.g:1378:1: entryRuleformal_parameter_section : ruleformal_parameter_section EOF ;
    public final void entryRuleformal_parameter_section() throws RecognitionException {
        try {
            // InternalPascal.g:1379:1: ( ruleformal_parameter_section EOF )
            // InternalPascal.g:1380:1: ruleformal_parameter_section EOF
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
    // InternalPascal.g:1387:1: ruleformal_parameter_section : ( ( rule__Formal_parameter_section__Alternatives ) ) ;
    public final void ruleformal_parameter_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1391:2: ( ( ( rule__Formal_parameter_section__Alternatives ) ) )
            // InternalPascal.g:1392:2: ( ( rule__Formal_parameter_section__Alternatives ) )
            {
            // InternalPascal.g:1392:2: ( ( rule__Formal_parameter_section__Alternatives ) )
            // InternalPascal.g:1393:3: ( rule__Formal_parameter_section__Alternatives )
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getAlternatives()); 
            // InternalPascal.g:1394:3: ( rule__Formal_parameter_section__Alternatives )
            // InternalPascal.g:1394:4: rule__Formal_parameter_section__Alternatives
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
    // InternalPascal.g:1403:1: entryRuleparameter_group : ruleparameter_group EOF ;
    public final void entryRuleparameter_group() throws RecognitionException {
        try {
            // InternalPascal.g:1404:1: ( ruleparameter_group EOF )
            // InternalPascal.g:1405:1: ruleparameter_group EOF
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
    // InternalPascal.g:1412:1: ruleparameter_group : ( ( rule__Parameter_group__Group__0 ) ) ;
    public final void ruleparameter_group() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1416:2: ( ( ( rule__Parameter_group__Group__0 ) ) )
            // InternalPascal.g:1417:2: ( ( rule__Parameter_group__Group__0 ) )
            {
            // InternalPascal.g:1417:2: ( ( rule__Parameter_group__Group__0 ) )
            // InternalPascal.g:1418:3: ( rule__Parameter_group__Group__0 )
            {
             before(grammarAccess.getParameter_groupAccess().getGroup()); 
            // InternalPascal.g:1419:3: ( rule__Parameter_group__Group__0 )
            // InternalPascal.g:1419:4: rule__Parameter_group__Group__0
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
    // InternalPascal.g:1428:1: entryRuleresult_type : ruleresult_type EOF ;
    public final void entryRuleresult_type() throws RecognitionException {
        try {
            // InternalPascal.g:1429:1: ( ruleresult_type EOF )
            // InternalPascal.g:1430:1: ruleresult_type EOF
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
    // InternalPascal.g:1437:1: ruleresult_type : ( ruletype_identifier ) ;
    public final void ruleresult_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1441:2: ( ( ruletype_identifier ) )
            // InternalPascal.g:1442:2: ( ruletype_identifier )
            {
            // InternalPascal.g:1442:2: ( ruletype_identifier )
            // InternalPascal.g:1443:3: ruletype_identifier
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
    // InternalPascal.g:1453:1: entryRulebool : rulebool EOF ;
    public final void entryRulebool() throws RecognitionException {
        try {
            // InternalPascal.g:1454:1: ( rulebool EOF )
            // InternalPascal.g:1455:1: rulebool EOF
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
    // InternalPascal.g:1462:1: rulebool : ( ( rule__Bool__Alternatives ) ) ;
    public final void rulebool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1466:2: ( ( ( rule__Bool__Alternatives ) ) )
            // InternalPascal.g:1467:2: ( ( rule__Bool__Alternatives ) )
            {
            // InternalPascal.g:1467:2: ( ( rule__Bool__Alternatives ) )
            // InternalPascal.g:1468:3: ( rule__Bool__Alternatives )
            {
             before(grammarAccess.getBoolAccess().getAlternatives()); 
            // InternalPascal.g:1469:3: ( rule__Bool__Alternatives )
            // InternalPascal.g:1469:4: rule__Bool__Alternatives
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


    // $ANTLR start "entryRulesign"
    // InternalPascal.g:1478:1: entryRulesign : rulesign EOF ;
    public final void entryRulesign() throws RecognitionException {
        try {
            // InternalPascal.g:1479:1: ( rulesign EOF )
            // InternalPascal.g:1480:1: rulesign EOF
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
    // InternalPascal.g:1487:1: rulesign : ( ( rule__Sign__Alternatives ) ) ;
    public final void rulesign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1491:2: ( ( ( rule__Sign__Alternatives ) ) )
            // InternalPascal.g:1492:2: ( ( rule__Sign__Alternatives ) )
            {
            // InternalPascal.g:1492:2: ( ( rule__Sign__Alternatives ) )
            // InternalPascal.g:1493:3: ( rule__Sign__Alternatives )
            {
             before(grammarAccess.getSignAccess().getAlternatives()); 
            // InternalPascal.g:1494:3: ( rule__Sign__Alternatives )
            // InternalPascal.g:1494:4: rule__Sign__Alternatives
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
    // InternalPascal.g:1502:1: rule__Block__Alternatives_0 : ( ( ( rule__Block__ConstantpartAssignment_0_0 ) ) | ( ( rule__Block__VariablepartAssignment_0_1 ) ) | ( ( rule__Block__Procedure_function_partAssignment_0_2 ) ) );
    public final void rule__Block__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1506:1: ( ( ( rule__Block__ConstantpartAssignment_0_0 ) ) | ( ( rule__Block__VariablepartAssignment_0_1 ) ) | ( ( rule__Block__Procedure_function_partAssignment_0_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt1=1;
                }
                break;
            case RULE_VAR:
                {
                alt1=2;
                }
                break;
            case RULE_PROCEDURE:
            case RULE_FUNCTION:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPascal.g:1507:2: ( ( rule__Block__ConstantpartAssignment_0_0 ) )
                    {
                    // InternalPascal.g:1507:2: ( ( rule__Block__ConstantpartAssignment_0_0 ) )
                    // InternalPascal.g:1508:3: ( rule__Block__ConstantpartAssignment_0_0 )
                    {
                     before(grammarAccess.getBlockAccess().getConstantpartAssignment_0_0()); 
                    // InternalPascal.g:1509:3: ( rule__Block__ConstantpartAssignment_0_0 )
                    // InternalPascal.g:1509:4: rule__Block__ConstantpartAssignment_0_0
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
                    // InternalPascal.g:1513:2: ( ( rule__Block__VariablepartAssignment_0_1 ) )
                    {
                    // InternalPascal.g:1513:2: ( ( rule__Block__VariablepartAssignment_0_1 ) )
                    // InternalPascal.g:1514:3: ( rule__Block__VariablepartAssignment_0_1 )
                    {
                     before(grammarAccess.getBlockAccess().getVariablepartAssignment_0_1()); 
                    // InternalPascal.g:1515:3: ( rule__Block__VariablepartAssignment_0_1 )
                    // InternalPascal.g:1515:4: rule__Block__VariablepartAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__VariablepartAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBlockAccess().getVariablepartAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1519:2: ( ( rule__Block__Procedure_function_partAssignment_0_2 ) )
                    {
                    // InternalPascal.g:1519:2: ( ( rule__Block__Procedure_function_partAssignment_0_2 ) )
                    // InternalPascal.g:1520:3: ( rule__Block__Procedure_function_partAssignment_0_2 )
                    {
                     before(grammarAccess.getBlockAccess().getProcedure_function_partAssignment_0_2()); 
                    // InternalPascal.g:1521:3: ( rule__Block__Procedure_function_partAssignment_0_2 )
                    // InternalPascal.g:1521:4: rule__Block__Procedure_function_partAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__Procedure_function_partAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getBlockAccess().getProcedure_function_partAssignment_0_2()); 

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
    // InternalPascal.g:1529:1: rule__Constant__Alternatives : ( ( ruleunsigned_number ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__NamesAssignment_2 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__StringAssignment_4 ) ) | ( ruleconstant_chr ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1533:1: ( ( ruleunsigned_number ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__NamesAssignment_2 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__StringAssignment_4 ) ) | ( ruleconstant_chr ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
                {
                alt2=1;
                }
                break;
            case RULE_PLUS:
                {
                int LA2_2 = input.LA(2);

                if ( ((LA2_2>=RULE_NUM_INT && LA2_2<=RULE_NUM_REAL)) ) {
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

                if ( ((LA2_3>=RULE_NUM_INT && LA2_3<=RULE_NUM_REAL)) ) {
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
            case 57:
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
                    // InternalPascal.g:1534:2: ( ruleunsigned_number )
                    {
                    // InternalPascal.g:1534:2: ( ruleunsigned_number )
                    // InternalPascal.g:1535:3: ruleunsigned_number
                    {
                     before(grammarAccess.getConstantAccess().getUnsigned_numberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleunsigned_number();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getUnsigned_numberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1540:2: ( ( rule__Constant__Group_1__0 ) )
                    {
                    // InternalPascal.g:1540:2: ( ( rule__Constant__Group_1__0 ) )
                    // InternalPascal.g:1541:3: ( rule__Constant__Group_1__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_1()); 
                    // InternalPascal.g:1542:3: ( rule__Constant__Group_1__0 )
                    // InternalPascal.g:1542:4: rule__Constant__Group_1__0
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
                    // InternalPascal.g:1546:2: ( ( rule__Constant__NamesAssignment_2 ) )
                    {
                    // InternalPascal.g:1546:2: ( ( rule__Constant__NamesAssignment_2 ) )
                    // InternalPascal.g:1547:3: ( rule__Constant__NamesAssignment_2 )
                    {
                     before(grammarAccess.getConstantAccess().getNamesAssignment_2()); 
                    // InternalPascal.g:1548:3: ( rule__Constant__NamesAssignment_2 )
                    // InternalPascal.g:1548:4: rule__Constant__NamesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__NamesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getNamesAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1552:2: ( ( rule__Constant__Group_3__0 ) )
                    {
                    // InternalPascal.g:1552:2: ( ( rule__Constant__Group_3__0 ) )
                    // InternalPascal.g:1553:3: ( rule__Constant__Group_3__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_3()); 
                    // InternalPascal.g:1554:3: ( rule__Constant__Group_3__0 )
                    // InternalPascal.g:1554:4: rule__Constant__Group_3__0
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
                    // InternalPascal.g:1558:2: ( ( rule__Constant__StringAssignment_4 ) )
                    {
                    // InternalPascal.g:1558:2: ( ( rule__Constant__StringAssignment_4 ) )
                    // InternalPascal.g:1559:3: ( rule__Constant__StringAssignment_4 )
                    {
                     before(grammarAccess.getConstantAccess().getStringAssignment_4()); 
                    // InternalPascal.g:1560:3: ( rule__Constant__StringAssignment_4 )
                    // InternalPascal.g:1560:4: rule__Constant__StringAssignment_4
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
                    // InternalPascal.g:1564:2: ( ruleconstant_chr )
                    {
                    // InternalPascal.g:1564:2: ( ruleconstant_chr )
                    // InternalPascal.g:1565:3: ruleconstant_chr
                    {
                     before(grammarAccess.getConstantAccess().getConstant_chrParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleconstant_chr();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getConstant_chrParserRuleCall_5()); 

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


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalPascal.g:1574:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1578:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_NUM_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==EOF||LA3_0==RULE_ID||(LA3_0>=38 && LA3_0<=39)||LA3_0==43||(LA3_0>=50 && LA3_0<=51)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascal.g:1579:2: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // InternalPascal.g:1579:2: ( ( rule__Statement__Group_0__0 ) )
                    // InternalPascal.g:1580:3: ( rule__Statement__Group_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_0()); 
                    // InternalPascal.g:1581:3: ( rule__Statement__Group_0__0 )
                    // InternalPascal.g:1581:4: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1585:2: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalPascal.g:1585:2: ( ( rule__Statement__Group_1__0 ) )
                    // InternalPascal.g:1586:3: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // InternalPascal.g:1587:3: ( rule__Statement__Group_1__0 )
                    // InternalPascal.g:1587:4: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Unlabelled_statement__Alternatives"
    // InternalPascal.g:1595:1: rule__Unlabelled_statement__Alternatives : ( ( ( rule__Unlabelled_statement__SimpleAssignment_0 ) ) | ( ( rule__Unlabelled_statement__StructuredAssignment_1 ) ) );
    public final void rule__Unlabelled_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1599:1: ( ( ( rule__Unlabelled_statement__SimpleAssignment_0 ) ) | ( ( rule__Unlabelled_statement__StructuredAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||LA4_0==38||LA4_0==51) ) {
                alt4=1;
            }
            else if ( (LA4_0==39) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:1600:2: ( ( rule__Unlabelled_statement__SimpleAssignment_0 ) )
                    {
                    // InternalPascal.g:1600:2: ( ( rule__Unlabelled_statement__SimpleAssignment_0 ) )
                    // InternalPascal.g:1601:3: ( rule__Unlabelled_statement__SimpleAssignment_0 )
                    {
                     before(grammarAccess.getUnlabelled_statementAccess().getSimpleAssignment_0()); 
                    // InternalPascal.g:1602:3: ( rule__Unlabelled_statement__SimpleAssignment_0 )
                    // InternalPascal.g:1602:4: rule__Unlabelled_statement__SimpleAssignment_0
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
                    // InternalPascal.g:1606:2: ( ( rule__Unlabelled_statement__StructuredAssignment_1 ) )
                    {
                    // InternalPascal.g:1606:2: ( ( rule__Unlabelled_statement__StructuredAssignment_1 ) )
                    // InternalPascal.g:1607:3: ( rule__Unlabelled_statement__StructuredAssignment_1 )
                    {
                     before(grammarAccess.getUnlabelled_statementAccess().getStructuredAssignment_1()); 
                    // InternalPascal.g:1608:3: ( rule__Unlabelled_statement__StructuredAssignment_1 )
                    // InternalPascal.g:1608:4: rule__Unlabelled_statement__StructuredAssignment_1
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
    // InternalPascal.g:1616:1: rule__Simple_statement__Alternatives : ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__ProcedureAssignment_1 ) ) | ( ( rule__Simple_statement__GotoAssignment_2 ) ) );
    public final void rule__Simple_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1620:1: ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__ProcedureAssignment_1 ) ) | ( ( rule__Simple_statement__GotoAssignment_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_ASSIGN||(LA5_2>=40 && LA5_2<=41)||LA5_2==52||LA5_2==54) ) {
                    alt5=1;
                }
                else if ( (LA5_2==EOF||(LA5_2>=43 && LA5_2<=44)||LA5_2==50) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPascal.g:1621:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    {
                    // InternalPascal.g:1621:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    // InternalPascal.g:1622:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_0()); 
                    // InternalPascal.g:1623:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    // InternalPascal.g:1623:4: rule__Simple_statement__AssignmentAssignment_0
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
                    // InternalPascal.g:1627:2: ( ( rule__Simple_statement__ProcedureAssignment_1 ) )
                    {
                    // InternalPascal.g:1627:2: ( ( rule__Simple_statement__ProcedureAssignment_1 ) )
                    // InternalPascal.g:1628:3: ( rule__Simple_statement__ProcedureAssignment_1 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getProcedureAssignment_1()); 
                    // InternalPascal.g:1629:3: ( rule__Simple_statement__ProcedureAssignment_1 )
                    // InternalPascal.g:1629:4: rule__Simple_statement__ProcedureAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_statement__ProcedureAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_statementAccess().getProcedureAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1633:2: ( ( rule__Simple_statement__GotoAssignment_2 ) )
                    {
                    // InternalPascal.g:1633:2: ( ( rule__Simple_statement__GotoAssignment_2 ) )
                    // InternalPascal.g:1634:3: ( rule__Simple_statement__GotoAssignment_2 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getGotoAssignment_2()); 
                    // InternalPascal.g:1635:3: ( rule__Simple_statement__GotoAssignment_2 )
                    // InternalPascal.g:1635:4: rule__Simple_statement__GotoAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_statement__GotoAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_statementAccess().getGotoAssignment_2()); 

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
    // InternalPascal.g:1643:1: rule__Variable__Alternatives_0 : ( ( ( rule__Variable__Group_0_0__0 ) ) | ( ( rule__Variable__NamesAssignment_0_1 ) ) );
    public final void rule__Variable__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1647:1: ( ( ( rule__Variable__Group_0_0__0 ) ) | ( ( rule__Variable__NamesAssignment_0_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==51) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPascal.g:1648:2: ( ( rule__Variable__Group_0_0__0 ) )
                    {
                    // InternalPascal.g:1648:2: ( ( rule__Variable__Group_0_0__0 ) )
                    // InternalPascal.g:1649:3: ( rule__Variable__Group_0_0__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_0_0()); 
                    // InternalPascal.g:1650:3: ( rule__Variable__Group_0_0__0 )
                    // InternalPascal.g:1650:4: rule__Variable__Group_0_0__0
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
                    // InternalPascal.g:1654:2: ( ( rule__Variable__NamesAssignment_0_1 ) )
                    {
                    // InternalPascal.g:1654:2: ( ( rule__Variable__NamesAssignment_0_1 ) )
                    // InternalPascal.g:1655:3: ( rule__Variable__NamesAssignment_0_1 )
                    {
                     before(grammarAccess.getVariableAccess().getNamesAssignment_0_1()); 
                    // InternalPascal.g:1656:3: ( rule__Variable__NamesAssignment_0_1 )
                    // InternalPascal.g:1656:4: rule__Variable__NamesAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__NamesAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getNamesAssignment_0_1()); 

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
    // InternalPascal.g:1664:1: rule__Variable__Alternatives_1 : ( ( ( rule__Variable__Group_1_0__0 ) ) | ( ( rule__Variable__Group_1_1__0 ) ) | ( ( rule__Variable__Group_1_2__0 ) ) | ( '^' ) );
    public final void rule__Variable__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1668:1: ( ( ( rule__Variable__Group_1_0__0 ) ) | ( ( rule__Variable__Group_1_1__0 ) ) | ( ( rule__Variable__Group_1_2__0 ) ) | ( '^' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt7=1;
                }
                break;
            case 54:
                {
                alt7=2;
                }
                break;
            case 41:
                {
                alt7=3;
                }
                break;
            case 40:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPascal.g:1669:2: ( ( rule__Variable__Group_1_0__0 ) )
                    {
                    // InternalPascal.g:1669:2: ( ( rule__Variable__Group_1_0__0 ) )
                    // InternalPascal.g:1670:3: ( rule__Variable__Group_1_0__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_1_0()); 
                    // InternalPascal.g:1671:3: ( rule__Variable__Group_1_0__0 )
                    // InternalPascal.g:1671:4: rule__Variable__Group_1_0__0
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
                    // InternalPascal.g:1675:2: ( ( rule__Variable__Group_1_1__0 ) )
                    {
                    // InternalPascal.g:1675:2: ( ( rule__Variable__Group_1_1__0 ) )
                    // InternalPascal.g:1676:3: ( rule__Variable__Group_1_1__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_1_1()); 
                    // InternalPascal.g:1677:3: ( rule__Variable__Group_1_1__0 )
                    // InternalPascal.g:1677:4: rule__Variable__Group_1_1__0
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
                    // InternalPascal.g:1681:2: ( ( rule__Variable__Group_1_2__0 ) )
                    {
                    // InternalPascal.g:1681:2: ( ( rule__Variable__Group_1_2__0 ) )
                    // InternalPascal.g:1682:3: ( rule__Variable__Group_1_2__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_1_2()); 
                    // InternalPascal.g:1683:3: ( rule__Variable__Group_1_2__0 )
                    // InternalPascal.g:1683:4: rule__Variable__Group_1_2__0
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
                    // InternalPascal.g:1687:2: ( '^' )
                    {
                    // InternalPascal.g:1687:2: ( '^' )
                    // InternalPascal.g:1688:3: '^'
                    {
                     before(grammarAccess.getVariableAccess().getCircumflexAccentKeyword_1_3()); 
                    match(input,40,FOLLOW_2); 
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
    // InternalPascal.g:1697:1: rule__Signed_factor__Alternatives_0 : ( ( ( rule__Signed_factor__OperatorsAssignment_0_0 ) ) | ( ( rule__Signed_factor__OperatorsAssignment_0_1 ) ) );
    public final void rule__Signed_factor__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1701:1: ( ( ( rule__Signed_factor__OperatorsAssignment_0_0 ) ) | ( ( rule__Signed_factor__OperatorsAssignment_0_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_PLUS) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_MINUS) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPascal.g:1702:2: ( ( rule__Signed_factor__OperatorsAssignment_0_0 ) )
                    {
                    // InternalPascal.g:1702:2: ( ( rule__Signed_factor__OperatorsAssignment_0_0 ) )
                    // InternalPascal.g:1703:3: ( rule__Signed_factor__OperatorsAssignment_0_0 )
                    {
                     before(grammarAccess.getSigned_factorAccess().getOperatorsAssignment_0_0()); 
                    // InternalPascal.g:1704:3: ( rule__Signed_factor__OperatorsAssignment_0_0 )
                    // InternalPascal.g:1704:4: rule__Signed_factor__OperatorsAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signed_factor__OperatorsAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigned_factorAccess().getOperatorsAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1708:2: ( ( rule__Signed_factor__OperatorsAssignment_0_1 ) )
                    {
                    // InternalPascal.g:1708:2: ( ( rule__Signed_factor__OperatorsAssignment_0_1 ) )
                    // InternalPascal.g:1709:3: ( rule__Signed_factor__OperatorsAssignment_0_1 )
                    {
                     before(grammarAccess.getSigned_factorAccess().getOperatorsAssignment_0_1()); 
                    // InternalPascal.g:1710:3: ( rule__Signed_factor__OperatorsAssignment_0_1 )
                    // InternalPascal.g:1710:4: rule__Signed_factor__OperatorsAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signed_factor__OperatorsAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigned_factorAccess().getOperatorsAssignment_0_1()); 

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
    // InternalPascal.g:1718:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__Group_1__0 ) ) | ( rulefunction_designator ) | ( ( rule__Factor__ConstantAssignment_3 ) ) | ( ( rule__Factor__SetAssignment_4 ) ) | ( ( rule__Factor__Group_5__0 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1722:1: ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__Group_1__0 ) ) | ( rulefunction_designator ) | ( ( rule__Factor__ConstantAssignment_3 ) ) | ( ( rule__Factor__SetAssignment_4 ) ) | ( ( rule__Factor__Group_5__0 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==EOF||(LA9_2>=RULE_PLUS && LA9_2<=RULE_IN)||LA9_2==RULE_DOTDOT||(LA9_2>=40 && LA9_2<=41)||LA9_2==43||(LA9_2>=45 && LA9_2<=46)||LA9_2==50||(LA9_2>=52 && LA9_2<=55)) ) {
                    alt9=1;
                }
                else if ( (LA9_2==44) ) {
                    alt9=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                alt9=2;
                }
                break;
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
            case RULE_STRING:
            case RULE_NIL:
            case 57:
                {
                alt9=4;
                }
                break;
            case 52:
            case 54:
                {
                alt9=5;
                }
                break;
            case RULE_NOT:
                {
                alt9=6;
                }
                break;
            case RULE_TRUE:
            case RULE_FALSE:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalPascal.g:1723:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    {
                    // InternalPascal.g:1723:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    // InternalPascal.g:1724:3: ( rule__Factor__VariableAssignment_0 )
                    {
                     before(grammarAccess.getFactorAccess().getVariableAssignment_0()); 
                    // InternalPascal.g:1725:3: ( rule__Factor__VariableAssignment_0 )
                    // InternalPascal.g:1725:4: rule__Factor__VariableAssignment_0
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
                    // InternalPascal.g:1729:2: ( ( rule__Factor__Group_1__0 ) )
                    {
                    // InternalPascal.g:1729:2: ( ( rule__Factor__Group_1__0 ) )
                    // InternalPascal.g:1730:3: ( rule__Factor__Group_1__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1()); 
                    // InternalPascal.g:1731:3: ( rule__Factor__Group_1__0 )
                    // InternalPascal.g:1731:4: rule__Factor__Group_1__0
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
                    // InternalPascal.g:1735:2: ( rulefunction_designator )
                    {
                    // InternalPascal.g:1735:2: ( rulefunction_designator )
                    // InternalPascal.g:1736:3: rulefunction_designator
                    {
                     before(grammarAccess.getFactorAccess().getFunction_designatorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulefunction_designator();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getFunction_designatorParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1741:2: ( ( rule__Factor__ConstantAssignment_3 ) )
                    {
                    // InternalPascal.g:1741:2: ( ( rule__Factor__ConstantAssignment_3 ) )
                    // InternalPascal.g:1742:3: ( rule__Factor__ConstantAssignment_3 )
                    {
                     before(grammarAccess.getFactorAccess().getConstantAssignment_3()); 
                    // InternalPascal.g:1743:3: ( rule__Factor__ConstantAssignment_3 )
                    // InternalPascal.g:1743:4: rule__Factor__ConstantAssignment_3
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
                    // InternalPascal.g:1747:2: ( ( rule__Factor__SetAssignment_4 ) )
                    {
                    // InternalPascal.g:1747:2: ( ( rule__Factor__SetAssignment_4 ) )
                    // InternalPascal.g:1748:3: ( rule__Factor__SetAssignment_4 )
                    {
                     before(grammarAccess.getFactorAccess().getSetAssignment_4()); 
                    // InternalPascal.g:1749:3: ( rule__Factor__SetAssignment_4 )
                    // InternalPascal.g:1749:4: rule__Factor__SetAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__SetAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getSetAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:1753:2: ( ( rule__Factor__Group_5__0 ) )
                    {
                    // InternalPascal.g:1753:2: ( ( rule__Factor__Group_5__0 ) )
                    // InternalPascal.g:1754:3: ( rule__Factor__Group_5__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_5()); 
                    // InternalPascal.g:1755:3: ( rule__Factor__Group_5__0 )
                    // InternalPascal.g:1755:4: rule__Factor__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPascal.g:1759:2: ( ( rule__Factor__BooleanAssignment_6 ) )
                    {
                    // InternalPascal.g:1759:2: ( ( rule__Factor__BooleanAssignment_6 ) )
                    // InternalPascal.g:1760:3: ( rule__Factor__BooleanAssignment_6 )
                    {
                     before(grammarAccess.getFactorAccess().getBooleanAssignment_6()); 
                    // InternalPascal.g:1761:3: ( rule__Factor__BooleanAssignment_6 )
                    // InternalPascal.g:1761:4: rule__Factor__BooleanAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__BooleanAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getBooleanAssignment_6()); 

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


    // $ANTLR start "rule__Set__Alternatives"
    // InternalPascal.g:1769:1: rule__Set__Alternatives : ( ( ( rule__Set__Group_0__0 ) ) | ( ( rule__Set__Group_1__0 ) ) );
    public final void rule__Set__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1773:1: ( ( ( rule__Set__Group_0__0 ) ) | ( ( rule__Set__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==52) ) {
                alt10=1;
            }
            else if ( (LA10_0==54) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPascal.g:1774:2: ( ( rule__Set__Group_0__0 ) )
                    {
                    // InternalPascal.g:1774:2: ( ( rule__Set__Group_0__0 ) )
                    // InternalPascal.g:1775:3: ( rule__Set__Group_0__0 )
                    {
                     before(grammarAccess.getSetAccess().getGroup_0()); 
                    // InternalPascal.g:1776:3: ( rule__Set__Group_0__0 )
                    // InternalPascal.g:1776:4: rule__Set__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Set__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1780:2: ( ( rule__Set__Group_1__0 ) )
                    {
                    // InternalPascal.g:1780:2: ( ( rule__Set__Group_1__0 ) )
                    // InternalPascal.g:1781:3: ( rule__Set__Group_1__0 )
                    {
                     before(grammarAccess.getSetAccess().getGroup_1()); 
                    // InternalPascal.g:1782:3: ( rule__Set__Group_1__0 )
                    // InternalPascal.g:1782:4: rule__Set__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Set__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Set__Alternatives"


    // $ANTLR start "rule__Simple_type__Alternatives"
    // InternalPascal.g:1790:1: rule__Simple_type__Alternatives : ( ( ( rule__Simple_type__TypesAssignment_0 ) ) | ( ( rule__Simple_type__TypesAssignment_1 ) ) | ( ( rule__Simple_type__TypesAssignment_2 ) ) | ( ( rule__Simple_type__TypesAssignment_3 ) ) );
    public final void rule__Simple_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1794:1: ( ( ( rule__Simple_type__TypesAssignment_0 ) ) | ( ( rule__Simple_type__TypesAssignment_1 ) ) | ( ( rule__Simple_type__TypesAssignment_2 ) ) | ( ( rule__Simple_type__TypesAssignment_3 ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt11=1;
                }
                break;
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
            case RULE_PLUS:
            case RULE_MINUS:
            case RULE_STRING:
            case 57:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==RULE_DOTDOT) ) {
                    alt11=2;
                }
                else if ( (LA11_3==EOF||LA11_3==43) ) {
                    alt11=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt11=3;
                }
                break;
            case 56:
                {
                int LA11_5 = input.LA(2);

                if ( (LA11_5==EOF||LA11_5==43) ) {
                    alt11=3;
                }
                else if ( (LA11_5==52) ) {
                    alt11=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPascal.g:1795:2: ( ( rule__Simple_type__TypesAssignment_0 ) )
                    {
                    // InternalPascal.g:1795:2: ( ( rule__Simple_type__TypesAssignment_0 ) )
                    // InternalPascal.g:1796:3: ( rule__Simple_type__TypesAssignment_0 )
                    {
                     before(grammarAccess.getSimple_typeAccess().getTypesAssignment_0()); 
                    // InternalPascal.g:1797:3: ( rule__Simple_type__TypesAssignment_0 )
                    // InternalPascal.g:1797:4: rule__Simple_type__TypesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_type__TypesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_typeAccess().getTypesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1801:2: ( ( rule__Simple_type__TypesAssignment_1 ) )
                    {
                    // InternalPascal.g:1801:2: ( ( rule__Simple_type__TypesAssignment_1 ) )
                    // InternalPascal.g:1802:3: ( rule__Simple_type__TypesAssignment_1 )
                    {
                     before(grammarAccess.getSimple_typeAccess().getTypesAssignment_1()); 
                    // InternalPascal.g:1803:3: ( rule__Simple_type__TypesAssignment_1 )
                    // InternalPascal.g:1803:4: rule__Simple_type__TypesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_type__TypesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_typeAccess().getTypesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1807:2: ( ( rule__Simple_type__TypesAssignment_2 ) )
                    {
                    // InternalPascal.g:1807:2: ( ( rule__Simple_type__TypesAssignment_2 ) )
                    // InternalPascal.g:1808:3: ( rule__Simple_type__TypesAssignment_2 )
                    {
                     before(grammarAccess.getSimple_typeAccess().getTypesAssignment_2()); 
                    // InternalPascal.g:1809:3: ( rule__Simple_type__TypesAssignment_2 )
                    // InternalPascal.g:1809:4: rule__Simple_type__TypesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_type__TypesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_typeAccess().getTypesAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1813:2: ( ( rule__Simple_type__TypesAssignment_3 ) )
                    {
                    // InternalPascal.g:1813:2: ( ( rule__Simple_type__TypesAssignment_3 ) )
                    // InternalPascal.g:1814:3: ( rule__Simple_type__TypesAssignment_3 )
                    {
                     before(grammarAccess.getSimple_typeAccess().getTypesAssignment_3()); 
                    // InternalPascal.g:1815:3: ( rule__Simple_type__TypesAssignment_3 )
                    // InternalPascal.g:1815:4: rule__Simple_type__TypesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_type__TypesAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_typeAccess().getTypesAssignment_3()); 

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


    // $ANTLR start "rule__Type_identifier__Alternatives"
    // InternalPascal.g:1823:1: rule__Type_identifier__Alternatives : ( ( ( rule__Type_identifier__NamesAssignment_0 ) ) | ( ( rule__Type_identifier__Alternatives_1 ) ) );
    public final void rule__Type_identifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1827:1: ( ( ( rule__Type_identifier__NamesAssignment_0 ) ) | ( ( rule__Type_identifier__Alternatives_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==56||(LA12_0>=58 && LA12_0<=61)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPascal.g:1828:2: ( ( rule__Type_identifier__NamesAssignment_0 ) )
                    {
                    // InternalPascal.g:1828:2: ( ( rule__Type_identifier__NamesAssignment_0 ) )
                    // InternalPascal.g:1829:3: ( rule__Type_identifier__NamesAssignment_0 )
                    {
                     before(grammarAccess.getType_identifierAccess().getNamesAssignment_0()); 
                    // InternalPascal.g:1830:3: ( rule__Type_identifier__NamesAssignment_0 )
                    // InternalPascal.g:1830:4: rule__Type_identifier__NamesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type_identifier__NamesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getType_identifierAccess().getNamesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1834:2: ( ( rule__Type_identifier__Alternatives_1 ) )
                    {
                    // InternalPascal.g:1834:2: ( ( rule__Type_identifier__Alternatives_1 ) )
                    // InternalPascal.g:1835:3: ( rule__Type_identifier__Alternatives_1 )
                    {
                     before(grammarAccess.getType_identifierAccess().getAlternatives_1()); 
                    // InternalPascal.g:1836:3: ( rule__Type_identifier__Alternatives_1 )
                    // InternalPascal.g:1836:4: rule__Type_identifier__Alternatives_1
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
    // InternalPascal.g:1844:1: rule__Type_identifier__Alternatives_1 : ( ( ( rule__Type_identifier__TypeAssignment_1_0 ) ) | ( ( rule__Type_identifier__TypeAssignment_1_1 ) ) | ( ( rule__Type_identifier__TypeAssignment_1_2 ) ) | ( ( rule__Type_identifier__TypeAssignment_1_3 ) ) | ( ( rule__Type_identifier__TypeAssignment_1_4 ) ) );
    public final void rule__Type_identifier__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1848:1: ( ( ( rule__Type_identifier__TypeAssignment_1_0 ) ) | ( ( rule__Type_identifier__TypeAssignment_1_1 ) ) | ( ( rule__Type_identifier__TypeAssignment_1_2 ) ) | ( ( rule__Type_identifier__TypeAssignment_1_3 ) ) | ( ( rule__Type_identifier__TypeAssignment_1_4 ) ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt13=1;
                }
                break;
            case 59:
                {
                alt13=2;
                }
                break;
            case 60:
                {
                alt13=3;
                }
                break;
            case 61:
                {
                alt13=4;
                }
                break;
            case 56:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalPascal.g:1849:2: ( ( rule__Type_identifier__TypeAssignment_1_0 ) )
                    {
                    // InternalPascal.g:1849:2: ( ( rule__Type_identifier__TypeAssignment_1_0 ) )
                    // InternalPascal.g:1850:3: ( rule__Type_identifier__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getType_identifierAccess().getTypeAssignment_1_0()); 
                    // InternalPascal.g:1851:3: ( rule__Type_identifier__TypeAssignment_1_0 )
                    // InternalPascal.g:1851:4: rule__Type_identifier__TypeAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type_identifier__TypeAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getType_identifierAccess().getTypeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1855:2: ( ( rule__Type_identifier__TypeAssignment_1_1 ) )
                    {
                    // InternalPascal.g:1855:2: ( ( rule__Type_identifier__TypeAssignment_1_1 ) )
                    // InternalPascal.g:1856:3: ( rule__Type_identifier__TypeAssignment_1_1 )
                    {
                     before(grammarAccess.getType_identifierAccess().getTypeAssignment_1_1()); 
                    // InternalPascal.g:1857:3: ( rule__Type_identifier__TypeAssignment_1_1 )
                    // InternalPascal.g:1857:4: rule__Type_identifier__TypeAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type_identifier__TypeAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getType_identifierAccess().getTypeAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1861:2: ( ( rule__Type_identifier__TypeAssignment_1_2 ) )
                    {
                    // InternalPascal.g:1861:2: ( ( rule__Type_identifier__TypeAssignment_1_2 ) )
                    // InternalPascal.g:1862:3: ( rule__Type_identifier__TypeAssignment_1_2 )
                    {
                     before(grammarAccess.getType_identifierAccess().getTypeAssignment_1_2()); 
                    // InternalPascal.g:1863:3: ( rule__Type_identifier__TypeAssignment_1_2 )
                    // InternalPascal.g:1863:4: rule__Type_identifier__TypeAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type_identifier__TypeAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getType_identifierAccess().getTypeAssignment_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1867:2: ( ( rule__Type_identifier__TypeAssignment_1_3 ) )
                    {
                    // InternalPascal.g:1867:2: ( ( rule__Type_identifier__TypeAssignment_1_3 ) )
                    // InternalPascal.g:1868:3: ( rule__Type_identifier__TypeAssignment_1_3 )
                    {
                     before(grammarAccess.getType_identifierAccess().getTypeAssignment_1_3()); 
                    // InternalPascal.g:1869:3: ( rule__Type_identifier__TypeAssignment_1_3 )
                    // InternalPascal.g:1869:4: rule__Type_identifier__TypeAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type_identifier__TypeAssignment_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getType_identifierAccess().getTypeAssignment_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:1873:2: ( ( rule__Type_identifier__TypeAssignment_1_4 ) )
                    {
                    // InternalPascal.g:1873:2: ( ( rule__Type_identifier__TypeAssignment_1_4 ) )
                    // InternalPascal.g:1874:3: ( rule__Type_identifier__TypeAssignment_1_4 )
                    {
                     before(grammarAccess.getType_identifierAccess().getTypeAssignment_1_4()); 
                    // InternalPascal.g:1875:3: ( rule__Type_identifier__TypeAssignment_1_4 )
                    // InternalPascal.g:1875:4: rule__Type_identifier__TypeAssignment_1_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type_identifier__TypeAssignment_1_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getType_identifierAccess().getTypeAssignment_1_4()); 

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


    // $ANTLR start "rule__String_type__Alternatives_2"
    // InternalPascal.g:1883:1: rule__String_type__Alternatives_2 : ( ( ( rule__String_type__NamesAssignment_2_0 ) ) | ( ( rule__String_type__NumberAssignment_2_1 ) ) );
    public final void rule__String_type__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1887:1: ( ( ( rule__String_type__NamesAssignment_2_0 ) ) | ( ( rule__String_type__NumberAssignment_2_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_NUM_INT && LA14_0<=RULE_NUM_REAL)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascal.g:1888:2: ( ( rule__String_type__NamesAssignment_2_0 ) )
                    {
                    // InternalPascal.g:1888:2: ( ( rule__String_type__NamesAssignment_2_0 ) )
                    // InternalPascal.g:1889:3: ( rule__String_type__NamesAssignment_2_0 )
                    {
                     before(grammarAccess.getString_typeAccess().getNamesAssignment_2_0()); 
                    // InternalPascal.g:1890:3: ( rule__String_type__NamesAssignment_2_0 )
                    // InternalPascal.g:1890:4: rule__String_type__NamesAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__String_type__NamesAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getString_typeAccess().getNamesAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1894:2: ( ( rule__String_type__NumberAssignment_2_1 ) )
                    {
                    // InternalPascal.g:1894:2: ( ( rule__String_type__NumberAssignment_2_1 ) )
                    // InternalPascal.g:1895:3: ( rule__String_type__NumberAssignment_2_1 )
                    {
                     before(grammarAccess.getString_typeAccess().getNumberAssignment_2_1()); 
                    // InternalPascal.g:1896:3: ( rule__String_type__NumberAssignment_2_1 )
                    // InternalPascal.g:1896:4: rule__String_type__NumberAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__String_type__NumberAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getString_typeAccess().getNumberAssignment_2_1()); 

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
    // $ANTLR end "rule__String_type__Alternatives_2"


    // $ANTLR start "rule__Unsigned_constant__Alternatives"
    // InternalPascal.g:1904:1: rule__Unsigned_constant__Alternatives : ( ( ( rule__Unsigned_constant__NumberAssignment_0 ) ) | ( ( rule__Unsigned_constant__CharAssignment_1 ) ) | ( ( rule__Unsigned_constant__StringAssignment_2 ) ) | ( ( rule__Unsigned_constant__NilAssignment_3 ) ) );
    public final void rule__Unsigned_constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1908:1: ( ( ( rule__Unsigned_constant__NumberAssignment_0 ) ) | ( ( rule__Unsigned_constant__CharAssignment_1 ) ) | ( ( rule__Unsigned_constant__StringAssignment_2 ) ) | ( ( rule__Unsigned_constant__NilAssignment_3 ) ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
                {
                alt15=1;
                }
                break;
            case 57:
                {
                alt15=2;
                }
                break;
            case RULE_STRING:
                {
                alt15=3;
                }
                break;
            case RULE_NIL:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1909:2: ( ( rule__Unsigned_constant__NumberAssignment_0 ) )
                    {
                    // InternalPascal.g:1909:2: ( ( rule__Unsigned_constant__NumberAssignment_0 ) )
                    // InternalPascal.g:1910:3: ( rule__Unsigned_constant__NumberAssignment_0 )
                    {
                     before(grammarAccess.getUnsigned_constantAccess().getNumberAssignment_0()); 
                    // InternalPascal.g:1911:3: ( rule__Unsigned_constant__NumberAssignment_0 )
                    // InternalPascal.g:1911:4: rule__Unsigned_constant__NumberAssignment_0
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
                    // InternalPascal.g:1915:2: ( ( rule__Unsigned_constant__CharAssignment_1 ) )
                    {
                    // InternalPascal.g:1915:2: ( ( rule__Unsigned_constant__CharAssignment_1 ) )
                    // InternalPascal.g:1916:3: ( rule__Unsigned_constant__CharAssignment_1 )
                    {
                     before(grammarAccess.getUnsigned_constantAccess().getCharAssignment_1()); 
                    // InternalPascal.g:1917:3: ( rule__Unsigned_constant__CharAssignment_1 )
                    // InternalPascal.g:1917:4: rule__Unsigned_constant__CharAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unsigned_constant__CharAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnsigned_constantAccess().getCharAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1921:2: ( ( rule__Unsigned_constant__StringAssignment_2 ) )
                    {
                    // InternalPascal.g:1921:2: ( ( rule__Unsigned_constant__StringAssignment_2 ) )
                    // InternalPascal.g:1922:3: ( rule__Unsigned_constant__StringAssignment_2 )
                    {
                     before(grammarAccess.getUnsigned_constantAccess().getStringAssignment_2()); 
                    // InternalPascal.g:1923:3: ( rule__Unsigned_constant__StringAssignment_2 )
                    // InternalPascal.g:1923:4: rule__Unsigned_constant__StringAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unsigned_constant__StringAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnsigned_constantAccess().getStringAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1927:2: ( ( rule__Unsigned_constant__NilAssignment_3 ) )
                    {
                    // InternalPascal.g:1927:2: ( ( rule__Unsigned_constant__NilAssignment_3 ) )
                    // InternalPascal.g:1928:3: ( rule__Unsigned_constant__NilAssignment_3 )
                    {
                     before(grammarAccess.getUnsigned_constantAccess().getNilAssignment_3()); 
                    // InternalPascal.g:1929:3: ( rule__Unsigned_constant__NilAssignment_3 )
                    // InternalPascal.g:1929:4: rule__Unsigned_constant__NilAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unsigned_constant__NilAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnsigned_constantAccess().getNilAssignment_3()); 

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


    // $ANTLR start "rule__Unsigned_number__Alternatives"
    // InternalPascal.g:1937:1: rule__Unsigned_number__Alternatives : ( ( ( rule__Unsigned_number__NumbersAssignment_0 ) ) | ( ( rule__Unsigned_number__NumbersAssignment_1 ) ) );
    public final void rule__Unsigned_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1941:1: ( ( ( rule__Unsigned_number__NumbersAssignment_0 ) ) | ( ( rule__Unsigned_number__NumbersAssignment_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_NUM_INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_NUM_REAL) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1942:2: ( ( rule__Unsigned_number__NumbersAssignment_0 ) )
                    {
                    // InternalPascal.g:1942:2: ( ( rule__Unsigned_number__NumbersAssignment_0 ) )
                    // InternalPascal.g:1943:3: ( rule__Unsigned_number__NumbersAssignment_0 )
                    {
                     before(grammarAccess.getUnsigned_numberAccess().getNumbersAssignment_0()); 
                    // InternalPascal.g:1944:3: ( rule__Unsigned_number__NumbersAssignment_0 )
                    // InternalPascal.g:1944:4: rule__Unsigned_number__NumbersAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unsigned_number__NumbersAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnsigned_numberAccess().getNumbersAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1948:2: ( ( rule__Unsigned_number__NumbersAssignment_1 ) )
                    {
                    // InternalPascal.g:1948:2: ( ( rule__Unsigned_number__NumbersAssignment_1 ) )
                    // InternalPascal.g:1949:3: ( rule__Unsigned_number__NumbersAssignment_1 )
                    {
                     before(grammarAccess.getUnsigned_numberAccess().getNumbersAssignment_1()); 
                    // InternalPascal.g:1950:3: ( rule__Unsigned_number__NumbersAssignment_1 )
                    // InternalPascal.g:1950:4: rule__Unsigned_number__NumbersAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unsigned_number__NumbersAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnsigned_numberAccess().getNumbersAssignment_1()); 

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
    // $ANTLR end "rule__Unsigned_number__Alternatives"


    // $ANTLR start "rule__Additive_operator__Alternatives"
    // InternalPascal.g:1958:1: rule__Additive_operator__Alternatives : ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_OR ) );
    public final void rule__Additive_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1962:1: ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_OR ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt17=1;
                }
                break;
            case RULE_MINUS:
                {
                alt17=2;
                }
                break;
            case RULE_OR:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalPascal.g:1963:2: ( RULE_PLUS )
                    {
                    // InternalPascal.g:1963:2: ( RULE_PLUS )
                    // InternalPascal.g:1964:3: RULE_PLUS
                    {
                     before(grammarAccess.getAdditive_operatorAccess().getPLUSTerminalRuleCall_0()); 
                    match(input,RULE_PLUS,FOLLOW_2); 
                     after(grammarAccess.getAdditive_operatorAccess().getPLUSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1969:2: ( RULE_MINUS )
                    {
                    // InternalPascal.g:1969:2: ( RULE_MINUS )
                    // InternalPascal.g:1970:3: RULE_MINUS
                    {
                     before(grammarAccess.getAdditive_operatorAccess().getMINUSTerminalRuleCall_1()); 
                    match(input,RULE_MINUS,FOLLOW_2); 
                     after(grammarAccess.getAdditive_operatorAccess().getMINUSTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1975:2: ( RULE_OR )
                    {
                    // InternalPascal.g:1975:2: ( RULE_OR )
                    // InternalPascal.g:1976:3: RULE_OR
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
    // InternalPascal.g:1985:1: rule__Multiplicative_operator__Alternatives : ( ( RULE_STAR ) | ( RULE_SLASH ) | ( RULE_DIV ) | ( RULE_MOD ) | ( RULE_AND ) );
    public final void rule__Multiplicative_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1989:1: ( ( RULE_STAR ) | ( RULE_SLASH ) | ( RULE_DIV ) | ( RULE_MOD ) | ( RULE_AND ) )
            int alt18=5;
            switch ( input.LA(1) ) {
            case RULE_STAR:
                {
                alt18=1;
                }
                break;
            case RULE_SLASH:
                {
                alt18=2;
                }
                break;
            case RULE_DIV:
                {
                alt18=3;
                }
                break;
            case RULE_MOD:
                {
                alt18=4;
                }
                break;
            case RULE_AND:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalPascal.g:1990:2: ( RULE_STAR )
                    {
                    // InternalPascal.g:1990:2: ( RULE_STAR )
                    // InternalPascal.g:1991:3: RULE_STAR
                    {
                     before(grammarAccess.getMultiplicative_operatorAccess().getSTARTerminalRuleCall_0()); 
                    match(input,RULE_STAR,FOLLOW_2); 
                     after(grammarAccess.getMultiplicative_operatorAccess().getSTARTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1996:2: ( RULE_SLASH )
                    {
                    // InternalPascal.g:1996:2: ( RULE_SLASH )
                    // InternalPascal.g:1997:3: RULE_SLASH
                    {
                     before(grammarAccess.getMultiplicative_operatorAccess().getSLASHTerminalRuleCall_1()); 
                    match(input,RULE_SLASH,FOLLOW_2); 
                     after(grammarAccess.getMultiplicative_operatorAccess().getSLASHTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2002:2: ( RULE_DIV )
                    {
                    // InternalPascal.g:2002:2: ( RULE_DIV )
                    // InternalPascal.g:2003:3: RULE_DIV
                    {
                     before(grammarAccess.getMultiplicative_operatorAccess().getDIVTerminalRuleCall_2()); 
                    match(input,RULE_DIV,FOLLOW_2); 
                     after(grammarAccess.getMultiplicative_operatorAccess().getDIVTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:2008:2: ( RULE_MOD )
                    {
                    // InternalPascal.g:2008:2: ( RULE_MOD )
                    // InternalPascal.g:2009:3: RULE_MOD
                    {
                     before(grammarAccess.getMultiplicative_operatorAccess().getMODTerminalRuleCall_3()); 
                    match(input,RULE_MOD,FOLLOW_2); 
                     after(grammarAccess.getMultiplicative_operatorAccess().getMODTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:2014:2: ( RULE_AND )
                    {
                    // InternalPascal.g:2014:2: ( RULE_AND )
                    // InternalPascal.g:2015:3: RULE_AND
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


    // $ANTLR start "rule__Relational_operator__Alternatives"
    // InternalPascal.g:2024:1: rule__Relational_operator__Alternatives : ( ( RULE_EQUAL ) | ( RULE_NOT_EQUAL ) | ( RULE_LT ) | ( RULE_LE ) | ( RULE_GE ) | ( RULE_GT ) | ( RULE_IN ) );
    public final void rule__Relational_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2028:1: ( ( RULE_EQUAL ) | ( RULE_NOT_EQUAL ) | ( RULE_LT ) | ( RULE_LE ) | ( RULE_GE ) | ( RULE_GT ) | ( RULE_IN ) )
            int alt19=7;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                alt19=1;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt19=2;
                }
                break;
            case RULE_LT:
                {
                alt19=3;
                }
                break;
            case RULE_LE:
                {
                alt19=4;
                }
                break;
            case RULE_GE:
                {
                alt19=5;
                }
                break;
            case RULE_GT:
                {
                alt19=6;
                }
                break;
            case RULE_IN:
                {
                alt19=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalPascal.g:2029:2: ( RULE_EQUAL )
                    {
                    // InternalPascal.g:2029:2: ( RULE_EQUAL )
                    // InternalPascal.g:2030:3: RULE_EQUAL
                    {
                     before(grammarAccess.getRelational_operatorAccess().getEQUALTerminalRuleCall_0()); 
                    match(input,RULE_EQUAL,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getEQUALTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2035:2: ( RULE_NOT_EQUAL )
                    {
                    // InternalPascal.g:2035:2: ( RULE_NOT_EQUAL )
                    // InternalPascal.g:2036:3: RULE_NOT_EQUAL
                    {
                     before(grammarAccess.getRelational_operatorAccess().getNOT_EQUALTerminalRuleCall_1()); 
                    match(input,RULE_NOT_EQUAL,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getNOT_EQUALTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2041:2: ( RULE_LT )
                    {
                    // InternalPascal.g:2041:2: ( RULE_LT )
                    // InternalPascal.g:2042:3: RULE_LT
                    {
                     before(grammarAccess.getRelational_operatorAccess().getLTTerminalRuleCall_2()); 
                    match(input,RULE_LT,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getLTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:2047:2: ( RULE_LE )
                    {
                    // InternalPascal.g:2047:2: ( RULE_LE )
                    // InternalPascal.g:2048:3: RULE_LE
                    {
                     before(grammarAccess.getRelational_operatorAccess().getLETerminalRuleCall_3()); 
                    match(input,RULE_LE,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getLETerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:2053:2: ( RULE_GE )
                    {
                    // InternalPascal.g:2053:2: ( RULE_GE )
                    // InternalPascal.g:2054:3: RULE_GE
                    {
                     before(grammarAccess.getRelational_operatorAccess().getGETerminalRuleCall_4()); 
                    match(input,RULE_GE,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getGETerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:2059:2: ( RULE_GT )
                    {
                    // InternalPascal.g:2059:2: ( RULE_GT )
                    // InternalPascal.g:2060:3: RULE_GT
                    {
                     before(grammarAccess.getRelational_operatorAccess().getGTTerminalRuleCall_5()); 
                    match(input,RULE_GT,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getGTTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPascal.g:2065:2: ( RULE_IN )
                    {
                    // InternalPascal.g:2065:2: ( RULE_IN )
                    // InternalPascal.g:2066:3: RULE_IN
                    {
                     before(grammarAccess.getRelational_operatorAccess().getINTerminalRuleCall_6()); 
                    match(input,RULE_IN,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getINTerminalRuleCall_6()); 

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
    // $ANTLR end "rule__Relational_operator__Alternatives"


    // $ANTLR start "rule__Procedure_or_function_declaration__Alternatives"
    // InternalPascal.g:2075:1: rule__Procedure_or_function_declaration__Alternatives : ( ( ruleprocedure_declaration ) | ( rulefunction_declaration ) );
    public final void rule__Procedure_or_function_declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2079:1: ( ( ruleprocedure_declaration ) | ( rulefunction_declaration ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_PROCEDURE) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_FUNCTION) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalPascal.g:2080:2: ( ruleprocedure_declaration )
                    {
                    // InternalPascal.g:2080:2: ( ruleprocedure_declaration )
                    // InternalPascal.g:2081:3: ruleprocedure_declaration
                    {
                     before(grammarAccess.getProcedure_or_function_declarationAccess().getProcedure_declarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleprocedure_declaration();

                    state._fsp--;

                     after(grammarAccess.getProcedure_or_function_declarationAccess().getProcedure_declarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2086:2: ( rulefunction_declaration )
                    {
                    // InternalPascal.g:2086:2: ( rulefunction_declaration )
                    // InternalPascal.g:2087:3: rulefunction_declaration
                    {
                     before(grammarAccess.getProcedure_or_function_declarationAccess().getFunction_declarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulefunction_declaration();

                    state._fsp--;

                     after(grammarAccess.getProcedure_or_function_declarationAccess().getFunction_declarationParserRuleCall_1()); 

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
    // InternalPascal.g:2096:1: rule__Formal_parameter_section__Alternatives : ( ( ruleparameter_group ) | ( ( rule__Formal_parameter_section__Group_1__0 ) ) | ( ( rule__Formal_parameter_section__Group_2__0 ) ) | ( ( rule__Formal_parameter_section__Group_3__0 ) ) );
    public final void rule__Formal_parameter_section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2100:1: ( ( ruleparameter_group ) | ( ( rule__Formal_parameter_section__Group_1__0 ) ) | ( ( rule__Formal_parameter_section__Group_2__0 ) ) | ( ( rule__Formal_parameter_section__Group_3__0 ) ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt21=1;
                }
                break;
            case RULE_VAR:
                {
                alt21=2;
                }
                break;
            case RULE_FUNCTION:
                {
                alt21=3;
                }
                break;
            case RULE_PROCEDURE:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalPascal.g:2101:2: ( ruleparameter_group )
                    {
                    // InternalPascal.g:2101:2: ( ruleparameter_group )
                    // InternalPascal.g:2102:3: ruleparameter_group
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getParameter_groupParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleparameter_group();

                    state._fsp--;

                     after(grammarAccess.getFormal_parameter_sectionAccess().getParameter_groupParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2107:2: ( ( rule__Formal_parameter_section__Group_1__0 ) )
                    {
                    // InternalPascal.g:2107:2: ( ( rule__Formal_parameter_section__Group_1__0 ) )
                    // InternalPascal.g:2108:3: ( rule__Formal_parameter_section__Group_1__0 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getGroup_1()); 
                    // InternalPascal.g:2109:3: ( rule__Formal_parameter_section__Group_1__0 )
                    // InternalPascal.g:2109:4: rule__Formal_parameter_section__Group_1__0
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
                    // InternalPascal.g:2113:2: ( ( rule__Formal_parameter_section__Group_2__0 ) )
                    {
                    // InternalPascal.g:2113:2: ( ( rule__Formal_parameter_section__Group_2__0 ) )
                    // InternalPascal.g:2114:3: ( rule__Formal_parameter_section__Group_2__0 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getGroup_2()); 
                    // InternalPascal.g:2115:3: ( rule__Formal_parameter_section__Group_2__0 )
                    // InternalPascal.g:2115:4: rule__Formal_parameter_section__Group_2__0
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
                    // InternalPascal.g:2119:2: ( ( rule__Formal_parameter_section__Group_3__0 ) )
                    {
                    // InternalPascal.g:2119:2: ( ( rule__Formal_parameter_section__Group_3__0 ) )
                    // InternalPascal.g:2120:3: ( rule__Formal_parameter_section__Group_3__0 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getGroup_3()); 
                    // InternalPascal.g:2121:3: ( rule__Formal_parameter_section__Group_3__0 )
                    // InternalPascal.g:2121:4: rule__Formal_parameter_section__Group_3__0
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
    // InternalPascal.g:2129:1: rule__Bool__Alternatives : ( ( RULE_TRUE ) | ( RULE_FALSE ) );
    public final void rule__Bool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2133:1: ( ( RULE_TRUE ) | ( RULE_FALSE ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_TRUE) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_FALSE) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascal.g:2134:2: ( RULE_TRUE )
                    {
                    // InternalPascal.g:2134:2: ( RULE_TRUE )
                    // InternalPascal.g:2135:3: RULE_TRUE
                    {
                     before(grammarAccess.getBoolAccess().getTRUETerminalRuleCall_0()); 
                    match(input,RULE_TRUE,FOLLOW_2); 
                     after(grammarAccess.getBoolAccess().getTRUETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2140:2: ( RULE_FALSE )
                    {
                    // InternalPascal.g:2140:2: ( RULE_FALSE )
                    // InternalPascal.g:2141:3: RULE_FALSE
                    {
                     before(grammarAccess.getBoolAccess().getFALSETerminalRuleCall_1()); 
                    match(input,RULE_FALSE,FOLLOW_2); 
                     after(grammarAccess.getBoolAccess().getFALSETerminalRuleCall_1()); 

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
    // InternalPascal.g:2150:1: rule__Sign__Alternatives : ( ( RULE_PLUS ) | ( RULE_MINUS ) );
    public final void rule__Sign__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2154:1: ( ( RULE_PLUS ) | ( RULE_MINUS ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_PLUS) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_MINUS) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascal.g:2155:2: ( RULE_PLUS )
                    {
                    // InternalPascal.g:2155:2: ( RULE_PLUS )
                    // InternalPascal.g:2156:3: RULE_PLUS
                    {
                     before(grammarAccess.getSignAccess().getPLUSTerminalRuleCall_0()); 
                    match(input,RULE_PLUS,FOLLOW_2); 
                     after(grammarAccess.getSignAccess().getPLUSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2161:2: ( RULE_MINUS )
                    {
                    // InternalPascal.g:2161:2: ( RULE_MINUS )
                    // InternalPascal.g:2162:3: RULE_MINUS
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
    // InternalPascal.g:2171:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2175:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPascal.g:2176:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalPascal.g:2183:1: rule__Program__Group__0__Impl : ( ( rule__Program__HeadingAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2187:1: ( ( ( rule__Program__HeadingAssignment_0 ) ) )
            // InternalPascal.g:2188:1: ( ( rule__Program__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:2188:1: ( ( rule__Program__HeadingAssignment_0 ) )
            // InternalPascal.g:2189:2: ( rule__Program__HeadingAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getHeadingAssignment_0()); 
            // InternalPascal.g:2190:2: ( rule__Program__HeadingAssignment_0 )
            // InternalPascal.g:2190:3: rule__Program__HeadingAssignment_0
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
    // InternalPascal.g:2198:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2202:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPascal.g:2203:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalPascal.g:2210:1: rule__Program__Group__1__Impl : ( ( rule__Program__BlockAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2214:1: ( ( ( rule__Program__BlockAssignment_1 ) ) )
            // InternalPascal.g:2215:1: ( ( rule__Program__BlockAssignment_1 ) )
            {
            // InternalPascal.g:2215:1: ( ( rule__Program__BlockAssignment_1 ) )
            // InternalPascal.g:2216:2: ( rule__Program__BlockAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getBlockAssignment_1()); 
            // InternalPascal.g:2217:2: ( rule__Program__BlockAssignment_1 )
            // InternalPascal.g:2217:3: rule__Program__BlockAssignment_1
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
    // InternalPascal.g:2225:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2229:1: ( rule__Program__Group__2__Impl )
            // InternalPascal.g:2230:2: rule__Program__Group__2__Impl
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
    // InternalPascal.g:2236:1: rule__Program__Group__2__Impl : ( '.' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2240:1: ( ( '.' ) )
            // InternalPascal.g:2241:1: ( '.' )
            {
            // InternalPascal.g:2241:1: ( '.' )
            // InternalPascal.g:2242:2: '.'
            {
             before(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalPascal.g:2252:1: rule__Program_heading_block__Group__0 : rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 ;
    public final void rule__Program_heading_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2256:1: ( rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 )
            // InternalPascal.g:2257:2: rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1
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
    // InternalPascal.g:2264:1: rule__Program_heading_block__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program_heading_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2268:1: ( ( 'program' ) )
            // InternalPascal.g:2269:1: ( 'program' )
            {
            // InternalPascal.g:2269:1: ( 'program' )
            // InternalPascal.g:2270:2: 'program'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalPascal.g:2279:1: rule__Program_heading_block__Group__1 : rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 ;
    public final void rule__Program_heading_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2283:1: ( rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 )
            // InternalPascal.g:2284:2: rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2
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
    // InternalPascal.g:2291:1: rule__Program_heading_block__Group__1__Impl : ( ( rule__Program_heading_block__NameAssignment_1 ) ) ;
    public final void rule__Program_heading_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2295:1: ( ( ( rule__Program_heading_block__NameAssignment_1 ) ) )
            // InternalPascal.g:2296:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            {
            // InternalPascal.g:2296:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            // InternalPascal.g:2297:2: ( rule__Program_heading_block__NameAssignment_1 )
            {
             before(grammarAccess.getProgram_heading_blockAccess().getNameAssignment_1()); 
            // InternalPascal.g:2298:2: ( rule__Program_heading_block__NameAssignment_1 )
            // InternalPascal.g:2298:3: rule__Program_heading_block__NameAssignment_1
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
    // InternalPascal.g:2306:1: rule__Program_heading_block__Group__2 : rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3 ;
    public final void rule__Program_heading_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2310:1: ( rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3 )
            // InternalPascal.g:2311:2: rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Program_heading_block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__3();

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
    // InternalPascal.g:2318:1: rule__Program_heading_block__Group__2__Impl : ( ( rule__Program_heading_block__Group_2__0 )? ) ;
    public final void rule__Program_heading_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2322:1: ( ( ( rule__Program_heading_block__Group_2__0 )? ) )
            // InternalPascal.g:2323:1: ( ( rule__Program_heading_block__Group_2__0 )? )
            {
            // InternalPascal.g:2323:1: ( ( rule__Program_heading_block__Group_2__0 )? )
            // InternalPascal.g:2324:2: ( rule__Program_heading_block__Group_2__0 )?
            {
             before(grammarAccess.getProgram_heading_blockAccess().getGroup_2()); 
            // InternalPascal.g:2325:2: ( rule__Program_heading_block__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPascal.g:2325:3: rule__Program_heading_block__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program_heading_block__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgram_heading_blockAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Program_heading_block__Group__3"
    // InternalPascal.g:2333:1: rule__Program_heading_block__Group__3 : rule__Program_heading_block__Group__3__Impl ;
    public final void rule__Program_heading_block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2337:1: ( rule__Program_heading_block__Group__3__Impl )
            // InternalPascal.g:2338:2: rule__Program_heading_block__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__3__Impl();

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
    // $ANTLR end "rule__Program_heading_block__Group__3"


    // $ANTLR start "rule__Program_heading_block__Group__3__Impl"
    // InternalPascal.g:2344:1: rule__Program_heading_block__Group__3__Impl : ( ';' ) ;
    public final void rule__Program_heading_block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2348:1: ( ( ';' ) )
            // InternalPascal.g:2349:1: ( ';' )
            {
            // InternalPascal.g:2349:1: ( ';' )
            // InternalPascal.g:2350:2: ';'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group__3__Impl"


    // $ANTLR start "rule__Program_heading_block__Group_2__0"
    // InternalPascal.g:2360:1: rule__Program_heading_block__Group_2__0 : rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1 ;
    public final void rule__Program_heading_block__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2364:1: ( rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1 )
            // InternalPascal.g:2365:2: rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Program_heading_block__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group_2__1();

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
    // $ANTLR end "rule__Program_heading_block__Group_2__0"


    // $ANTLR start "rule__Program_heading_block__Group_2__0__Impl"
    // InternalPascal.g:2372:1: rule__Program_heading_block__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Program_heading_block__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2376:1: ( ( '(' ) )
            // InternalPascal.g:2377:1: ( '(' )
            {
            // InternalPascal.g:2377:1: ( '(' )
            // InternalPascal.g:2378:2: '('
            {
             before(grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group_2__0__Impl"


    // $ANTLR start "rule__Program_heading_block__Group_2__1"
    // InternalPascal.g:2387:1: rule__Program_heading_block__Group_2__1 : rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2 ;
    public final void rule__Program_heading_block__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2391:1: ( rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2 )
            // InternalPascal.g:2392:2: rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2
            {
            pushFollow(FOLLOW_7);
            rule__Program_heading_block__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group_2__2();

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
    // $ANTLR end "rule__Program_heading_block__Group_2__1"


    // $ANTLR start "rule__Program_heading_block__Group_2__1__Impl"
    // InternalPascal.g:2399:1: rule__Program_heading_block__Group_2__1__Impl : ( ( rule__Program_heading_block__IdentifiersAssignment_2_1 ) ) ;
    public final void rule__Program_heading_block__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2403:1: ( ( ( rule__Program_heading_block__IdentifiersAssignment_2_1 ) ) )
            // InternalPascal.g:2404:1: ( ( rule__Program_heading_block__IdentifiersAssignment_2_1 ) )
            {
            // InternalPascal.g:2404:1: ( ( rule__Program_heading_block__IdentifiersAssignment_2_1 ) )
            // InternalPascal.g:2405:2: ( rule__Program_heading_block__IdentifiersAssignment_2_1 )
            {
             before(grammarAccess.getProgram_heading_blockAccess().getIdentifiersAssignment_2_1()); 
            // InternalPascal.g:2406:2: ( rule__Program_heading_block__IdentifiersAssignment_2_1 )
            // InternalPascal.g:2406:3: rule__Program_heading_block__IdentifiersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__IdentifiersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProgram_heading_blockAccess().getIdentifiersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group_2__1__Impl"


    // $ANTLR start "rule__Program_heading_block__Group_2__2"
    // InternalPascal.g:2414:1: rule__Program_heading_block__Group_2__2 : rule__Program_heading_block__Group_2__2__Impl ;
    public final void rule__Program_heading_block__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2418:1: ( rule__Program_heading_block__Group_2__2__Impl )
            // InternalPascal.g:2419:2: rule__Program_heading_block__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group_2__2__Impl();

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
    // $ANTLR end "rule__Program_heading_block__Group_2__2"


    // $ANTLR start "rule__Program_heading_block__Group_2__2__Impl"
    // InternalPascal.g:2425:1: rule__Program_heading_block__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Program_heading_block__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2429:1: ( ( ')' ) )
            // InternalPascal.g:2430:1: ( ')' )
            {
            // InternalPascal.g:2430:1: ( ')' )
            // InternalPascal.g:2431:2: ')'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group_2__2__Impl"


    // $ANTLR start "rule__Identifier_list__Group__0"
    // InternalPascal.g:2441:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2445:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // InternalPascal.g:2446:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalPascal.g:2453:1: rule__Identifier_list__Group__0__Impl : ( ( rule__Identifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2457:1: ( ( ( rule__Identifier_list__NamesAssignment_0 ) ) )
            // InternalPascal.g:2458:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            {
            // InternalPascal.g:2458:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            // InternalPascal.g:2459:2: ( rule__Identifier_list__NamesAssignment_0 )
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_0()); 
            // InternalPascal.g:2460:2: ( rule__Identifier_list__NamesAssignment_0 )
            // InternalPascal.g:2460:3: rule__Identifier_list__NamesAssignment_0
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
    // InternalPascal.g:2468:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2472:1: ( rule__Identifier_list__Group__1__Impl )
            // InternalPascal.g:2473:2: rule__Identifier_list__Group__1__Impl
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
    // InternalPascal.g:2479:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2483:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // InternalPascal.g:2484:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // InternalPascal.g:2484:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // InternalPascal.g:2485:2: ( rule__Identifier_list__Group_1__0 )*
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            // InternalPascal.g:2486:2: ( rule__Identifier_list__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==46) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPascal.g:2486:3: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalPascal.g:2495:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2499:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // InternalPascal.g:2500:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
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
    // InternalPascal.g:2507:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2511:1: ( ( ',' ) )
            // InternalPascal.g:2512:1: ( ',' )
            {
            // InternalPascal.g:2512:1: ( ',' )
            // InternalPascal.g:2513:2: ','
            {
             before(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalPascal.g:2522:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2526:1: ( rule__Identifier_list__Group_1__1__Impl )
            // InternalPascal.g:2527:2: rule__Identifier_list__Group_1__1__Impl
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
    // InternalPascal.g:2533:1: rule__Identifier_list__Group_1__1__Impl : ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2537:1: ( ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascal.g:2538:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascal.g:2538:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            // InternalPascal.g:2539:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_1_1()); 
            // InternalPascal.g:2540:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            // InternalPascal.g:2540:3: rule__Identifier_list__NamesAssignment_1_1
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
    // InternalPascal.g:2549:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2553:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalPascal.g:2554:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalPascal.g:2561:1: rule__Block__Group__0__Impl : ( ( rule__Block__Alternatives_0 )* ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2565:1: ( ( ( rule__Block__Alternatives_0 )* ) )
            // InternalPascal.g:2566:1: ( ( rule__Block__Alternatives_0 )* )
            {
            // InternalPascal.g:2566:1: ( ( rule__Block__Alternatives_0 )* )
            // InternalPascal.g:2567:2: ( rule__Block__Alternatives_0 )*
            {
             before(grammarAccess.getBlockAccess().getAlternatives_0()); 
            // InternalPascal.g:2568:2: ( rule__Block__Alternatives_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_VAR||(LA26_0>=RULE_PROCEDURE && LA26_0<=RULE_FUNCTION)||LA26_0==47) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPascal.g:2568:3: rule__Block__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Block__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalPascal.g:2576:1: rule__Block__Group__1 : rule__Block__Group__1__Impl ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2580:1: ( rule__Block__Group__1__Impl )
            // InternalPascal.g:2581:2: rule__Block__Group__1__Impl
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
    // InternalPascal.g:2587:1: rule__Block__Group__1__Impl : ( ( rule__Block__StatementAssignment_1 ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2591:1: ( ( ( rule__Block__StatementAssignment_1 ) ) )
            // InternalPascal.g:2592:1: ( ( rule__Block__StatementAssignment_1 ) )
            {
            // InternalPascal.g:2592:1: ( ( rule__Block__StatementAssignment_1 ) )
            // InternalPascal.g:2593:2: ( rule__Block__StatementAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getStatementAssignment_1()); 
            // InternalPascal.g:2594:2: ( rule__Block__StatementAssignment_1 )
            // InternalPascal.g:2594:3: rule__Block__StatementAssignment_1
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
    // InternalPascal.g:2603:1: rule__Constant_definition_part__Group__0 : rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 ;
    public final void rule__Constant_definition_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2607:1: ( rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 )
            // InternalPascal.g:2608:2: rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1
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
    // InternalPascal.g:2615:1: rule__Constant_definition_part__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant_definition_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2619:1: ( ( 'const' ) )
            // InternalPascal.g:2620:1: ( 'const' )
            {
            // InternalPascal.g:2620:1: ( 'const' )
            // InternalPascal.g:2621:2: 'const'
            {
             before(grammarAccess.getConstant_definition_partAccess().getConstKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalPascal.g:2630:1: rule__Constant_definition_part__Group__1 : rule__Constant_definition_part__Group__1__Impl ;
    public final void rule__Constant_definition_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2634:1: ( rule__Constant_definition_part__Group__1__Impl )
            // InternalPascal.g:2635:2: rule__Constant_definition_part__Group__1__Impl
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
    // InternalPascal.g:2641:1: rule__Constant_definition_part__Group__1__Impl : ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) ) ;
    public final void rule__Constant_definition_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2645:1: ( ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) ) )
            // InternalPascal.g:2646:1: ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) )
            {
            // InternalPascal.g:2646:1: ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) )
            // InternalPascal.g:2647:2: ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* )
            {
            // InternalPascal.g:2647:2: ( ( rule__Constant_definition_part__Group_1__0 ) )
            // InternalPascal.g:2648:3: ( rule__Constant_definition_part__Group_1__0 )
            {
             before(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            // InternalPascal.g:2649:3: ( rule__Constant_definition_part__Group_1__0 )
            // InternalPascal.g:2649:4: rule__Constant_definition_part__Group_1__0
            {
            pushFollow(FOLLOW_11);
            rule__Constant_definition_part__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 

            }

            // InternalPascal.g:2652:2: ( ( rule__Constant_definition_part__Group_1__0 )* )
            // InternalPascal.g:2653:3: ( rule__Constant_definition_part__Group_1__0 )*
            {
             before(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            // InternalPascal.g:2654:3: ( rule__Constant_definition_part__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPascal.g:2654:4: rule__Constant_definition_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Constant_definition_part__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalPascal.g:2664:1: rule__Constant_definition_part__Group_1__0 : rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1 ;
    public final void rule__Constant_definition_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2668:1: ( rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1 )
            // InternalPascal.g:2669:2: rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalPascal.g:2676:1: rule__Constant_definition_part__Group_1__0__Impl : ( ( rule__Constant_definition_part__ConstantsAssignment_1_0 ) ) ;
    public final void rule__Constant_definition_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2680:1: ( ( ( rule__Constant_definition_part__ConstantsAssignment_1_0 ) ) )
            // InternalPascal.g:2681:1: ( ( rule__Constant_definition_part__ConstantsAssignment_1_0 ) )
            {
            // InternalPascal.g:2681:1: ( ( rule__Constant_definition_part__ConstantsAssignment_1_0 ) )
            // InternalPascal.g:2682:2: ( rule__Constant_definition_part__ConstantsAssignment_1_0 )
            {
             before(grammarAccess.getConstant_definition_partAccess().getConstantsAssignment_1_0()); 
            // InternalPascal.g:2683:2: ( rule__Constant_definition_part__ConstantsAssignment_1_0 )
            // InternalPascal.g:2683:3: rule__Constant_definition_part__ConstantsAssignment_1_0
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
    // InternalPascal.g:2691:1: rule__Constant_definition_part__Group_1__1 : rule__Constant_definition_part__Group_1__1__Impl ;
    public final void rule__Constant_definition_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2695:1: ( rule__Constant_definition_part__Group_1__1__Impl )
            // InternalPascal.g:2696:2: rule__Constant_definition_part__Group_1__1__Impl
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
    // InternalPascal.g:2702:1: rule__Constant_definition_part__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Constant_definition_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2706:1: ( ( ';' ) )
            // InternalPascal.g:2707:1: ( ';' )
            {
            // InternalPascal.g:2707:1: ( ';' )
            // InternalPascal.g:2708:2: ';'
            {
             before(grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalPascal.g:2718:1: rule__Constant_definition__Group__0 : rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 ;
    public final void rule__Constant_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2722:1: ( rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 )
            // InternalPascal.g:2723:2: rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalPascal.g:2730:1: rule__Constant_definition__Group__0__Impl : ( ( rule__Constant_definition__NameAssignment_0 ) ) ;
    public final void rule__Constant_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2734:1: ( ( ( rule__Constant_definition__NameAssignment_0 ) ) )
            // InternalPascal.g:2735:1: ( ( rule__Constant_definition__NameAssignment_0 ) )
            {
            // InternalPascal.g:2735:1: ( ( rule__Constant_definition__NameAssignment_0 ) )
            // InternalPascal.g:2736:2: ( rule__Constant_definition__NameAssignment_0 )
            {
             before(grammarAccess.getConstant_definitionAccess().getNameAssignment_0()); 
            // InternalPascal.g:2737:2: ( rule__Constant_definition__NameAssignment_0 )
            // InternalPascal.g:2737:3: rule__Constant_definition__NameAssignment_0
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
    // InternalPascal.g:2745:1: rule__Constant_definition__Group__1 : rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 ;
    public final void rule__Constant_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2749:1: ( rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 )
            // InternalPascal.g:2750:2: rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalPascal.g:2757:1: rule__Constant_definition__Group__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__Constant_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2761:1: ( ( RULE_EQUAL ) )
            // InternalPascal.g:2762:1: ( RULE_EQUAL )
            {
            // InternalPascal.g:2762:1: ( RULE_EQUAL )
            // InternalPascal.g:2763:2: RULE_EQUAL
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
    // InternalPascal.g:2772:1: rule__Constant_definition__Group__2 : rule__Constant_definition__Group__2__Impl ;
    public final void rule__Constant_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2776:1: ( rule__Constant_definition__Group__2__Impl )
            // InternalPascal.g:2777:2: rule__Constant_definition__Group__2__Impl
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
    // InternalPascal.g:2783:1: rule__Constant_definition__Group__2__Impl : ( ruleconstant ) ;
    public final void rule__Constant_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2787:1: ( ( ruleconstant ) )
            // InternalPascal.g:2788:1: ( ruleconstant )
            {
            // InternalPascal.g:2788:1: ( ruleconstant )
            // InternalPascal.g:2789:2: ruleconstant
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
    // InternalPascal.g:2799:1: rule__Constant__Group_1__0 : rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 ;
    public final void rule__Constant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2803:1: ( rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 )
            // InternalPascal.g:2804:2: rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalPascal.g:2811:1: rule__Constant__Group_1__0__Impl : ( rulesign ) ;
    public final void rule__Constant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2815:1: ( ( rulesign ) )
            // InternalPascal.g:2816:1: ( rulesign )
            {
            // InternalPascal.g:2816:1: ( rulesign )
            // InternalPascal.g:2817:2: rulesign
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
    // InternalPascal.g:2826:1: rule__Constant__Group_1__1 : rule__Constant__Group_1__1__Impl ;
    public final void rule__Constant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2830:1: ( rule__Constant__Group_1__1__Impl )
            // InternalPascal.g:2831:2: rule__Constant__Group_1__1__Impl
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
    // InternalPascal.g:2837:1: rule__Constant__Group_1__1__Impl : ( ruleunsigned_number ) ;
    public final void rule__Constant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2841:1: ( ( ruleunsigned_number ) )
            // InternalPascal.g:2842:1: ( ruleunsigned_number )
            {
            // InternalPascal.g:2842:1: ( ruleunsigned_number )
            // InternalPascal.g:2843:2: ruleunsigned_number
            {
             before(grammarAccess.getConstantAccess().getUnsigned_numberParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleunsigned_number();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getUnsigned_numberParserRuleCall_1_1()); 

            }


            }

        }
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
    // InternalPascal.g:2853:1: rule__Constant__Group_3__0 : rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 ;
    public final void rule__Constant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2857:1: ( rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 )
            // InternalPascal.g:2858:2: rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1
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
    // InternalPascal.g:2865:1: rule__Constant__Group_3__0__Impl : ( rulesign ) ;
    public final void rule__Constant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2869:1: ( ( rulesign ) )
            // InternalPascal.g:2870:1: ( rulesign )
            {
            // InternalPascal.g:2870:1: ( rulesign )
            // InternalPascal.g:2871:2: rulesign
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
    // InternalPascal.g:2880:1: rule__Constant__Group_3__1 : rule__Constant__Group_3__1__Impl ;
    public final void rule__Constant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2884:1: ( rule__Constant__Group_3__1__Impl )
            // InternalPascal.g:2885:2: rule__Constant__Group_3__1__Impl
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
    // InternalPascal.g:2891:1: rule__Constant__Group_3__1__Impl : ( ( rule__Constant__NamesAssignment_3_1 ) ) ;
    public final void rule__Constant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2895:1: ( ( ( rule__Constant__NamesAssignment_3_1 ) ) )
            // InternalPascal.g:2896:1: ( ( rule__Constant__NamesAssignment_3_1 ) )
            {
            // InternalPascal.g:2896:1: ( ( rule__Constant__NamesAssignment_3_1 ) )
            // InternalPascal.g:2897:2: ( rule__Constant__NamesAssignment_3_1 )
            {
             before(grammarAccess.getConstantAccess().getNamesAssignment_3_1()); 
            // InternalPascal.g:2898:2: ( rule__Constant__NamesAssignment_3_1 )
            // InternalPascal.g:2898:3: rule__Constant__NamesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Constant__NamesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getNamesAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Variable_declaration_part__Group__0"
    // InternalPascal.g:2907:1: rule__Variable_declaration_part__Group__0 : rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 ;
    public final void rule__Variable_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2911:1: ( rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 )
            // InternalPascal.g:2912:2: rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1
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
    // InternalPascal.g:2919:1: rule__Variable_declaration_part__Group__0__Impl : ( RULE_VAR ) ;
    public final void rule__Variable_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2923:1: ( ( RULE_VAR ) )
            // InternalPascal.g:2924:1: ( RULE_VAR )
            {
            // InternalPascal.g:2924:1: ( RULE_VAR )
            // InternalPascal.g:2925:2: RULE_VAR
            {
             before(grammarAccess.getVariable_declaration_partAccess().getVARTerminalRuleCall_0()); 
            match(input,RULE_VAR,FOLLOW_2); 
             after(grammarAccess.getVariable_declaration_partAccess().getVARTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalPascal.g:2934:1: rule__Variable_declaration_part__Group__1 : rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 ;
    public final void rule__Variable_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2938:1: ( rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 )
            // InternalPascal.g:2939:2: rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalPascal.g:2946:1: rule__Variable_declaration_part__Group__1__Impl : ( ( rule__Variable_declaration_part__VariableAssignment_1 ) ) ;
    public final void rule__Variable_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2950:1: ( ( ( rule__Variable_declaration_part__VariableAssignment_1 ) ) )
            // InternalPascal.g:2951:1: ( ( rule__Variable_declaration_part__VariableAssignment_1 ) )
            {
            // InternalPascal.g:2951:1: ( ( rule__Variable_declaration_part__VariableAssignment_1 ) )
            // InternalPascal.g:2952:2: ( rule__Variable_declaration_part__VariableAssignment_1 )
            {
             before(grammarAccess.getVariable_declaration_partAccess().getVariableAssignment_1()); 
            // InternalPascal.g:2953:2: ( rule__Variable_declaration_part__VariableAssignment_1 )
            // InternalPascal.g:2953:3: rule__Variable_declaration_part__VariableAssignment_1
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
    // InternalPascal.g:2961:1: rule__Variable_declaration_part__Group__2 : rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 ;
    public final void rule__Variable_declaration_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2965:1: ( rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 )
            // InternalPascal.g:2966:2: rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalPascal.g:2973:1: rule__Variable_declaration_part__Group__2__Impl : ( ( rule__Variable_declaration_part__Group_2__0 )* ) ;
    public final void rule__Variable_declaration_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2977:1: ( ( ( rule__Variable_declaration_part__Group_2__0 )* ) )
            // InternalPascal.g:2978:1: ( ( rule__Variable_declaration_part__Group_2__0 )* )
            {
            // InternalPascal.g:2978:1: ( ( rule__Variable_declaration_part__Group_2__0 )* )
            // InternalPascal.g:2979:2: ( rule__Variable_declaration_part__Group_2__0 )*
            {
             before(grammarAccess.getVariable_declaration_partAccess().getGroup_2()); 
            // InternalPascal.g:2980:2: ( rule__Variable_declaration_part__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==43) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==RULE_ID) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalPascal.g:2980:3: rule__Variable_declaration_part__Group_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Variable_declaration_part__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalPascal.g:2988:1: rule__Variable_declaration_part__Group__3 : rule__Variable_declaration_part__Group__3__Impl ;
    public final void rule__Variable_declaration_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2992:1: ( rule__Variable_declaration_part__Group__3__Impl )
            // InternalPascal.g:2993:2: rule__Variable_declaration_part__Group__3__Impl
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
    // InternalPascal.g:2999:1: rule__Variable_declaration_part__Group__3__Impl : ( ';' ) ;
    public final void rule__Variable_declaration_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3003:1: ( ( ';' ) )
            // InternalPascal.g:3004:1: ( ';' )
            {
            // InternalPascal.g:3004:1: ( ';' )
            // InternalPascal.g:3005:2: ';'
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalPascal.g:3015:1: rule__Variable_declaration_part__Group_2__0 : rule__Variable_declaration_part__Group_2__0__Impl rule__Variable_declaration_part__Group_2__1 ;
    public final void rule__Variable_declaration_part__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3019:1: ( rule__Variable_declaration_part__Group_2__0__Impl rule__Variable_declaration_part__Group_2__1 )
            // InternalPascal.g:3020:2: rule__Variable_declaration_part__Group_2__0__Impl rule__Variable_declaration_part__Group_2__1
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
    // InternalPascal.g:3027:1: rule__Variable_declaration_part__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Variable_declaration_part__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3031:1: ( ( ';' ) )
            // InternalPascal.g:3032:1: ( ';' )
            {
            // InternalPascal.g:3032:1: ( ';' )
            // InternalPascal.g:3033:2: ';'
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalPascal.g:3042:1: rule__Variable_declaration_part__Group_2__1 : rule__Variable_declaration_part__Group_2__1__Impl ;
    public final void rule__Variable_declaration_part__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3046:1: ( rule__Variable_declaration_part__Group_2__1__Impl )
            // InternalPascal.g:3047:2: rule__Variable_declaration_part__Group_2__1__Impl
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
    // InternalPascal.g:3053:1: rule__Variable_declaration_part__Group_2__1__Impl : ( ( rule__Variable_declaration_part__VariableAssignment_2_1 ) ) ;
    public final void rule__Variable_declaration_part__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3057:1: ( ( ( rule__Variable_declaration_part__VariableAssignment_2_1 ) ) )
            // InternalPascal.g:3058:1: ( ( rule__Variable_declaration_part__VariableAssignment_2_1 ) )
            {
            // InternalPascal.g:3058:1: ( ( rule__Variable_declaration_part__VariableAssignment_2_1 ) )
            // InternalPascal.g:3059:2: ( rule__Variable_declaration_part__VariableAssignment_2_1 )
            {
             before(grammarAccess.getVariable_declaration_partAccess().getVariableAssignment_2_1()); 
            // InternalPascal.g:3060:2: ( rule__Variable_declaration_part__VariableAssignment_2_1 )
            // InternalPascal.g:3060:3: rule__Variable_declaration_part__VariableAssignment_2_1
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
    // InternalPascal.g:3069:1: rule__Variable_declaration__Group__0 : rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 ;
    public final void rule__Variable_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3073:1: ( rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 )
            // InternalPascal.g:3074:2: rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:3081:1: rule__Variable_declaration__Group__0__Impl : ( ruleidentifier_list ) ;
    public final void rule__Variable_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3085:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:3086:1: ( ruleidentifier_list )
            {
            // InternalPascal.g:3086:1: ( ruleidentifier_list )
            // InternalPascal.g:3087:2: ruleidentifier_list
            {
             before(grammarAccess.getVariable_declarationAccess().getIdentifier_listParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getVariable_declarationAccess().getIdentifier_listParserRuleCall_0()); 

            }


            }

        }
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
    // InternalPascal.g:3096:1: rule__Variable_declaration__Group__1 : rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 ;
    public final void rule__Variable_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3100:1: ( rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 )
            // InternalPascal.g:3101:2: rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalPascal.g:3108:1: rule__Variable_declaration__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3112:1: ( ( ':' ) )
            // InternalPascal.g:3113:1: ( ':' )
            {
            // InternalPascal.g:3113:1: ( ':' )
            // InternalPascal.g:3114:2: ':'
            {
             before(grammarAccess.getVariable_declarationAccess().getColonKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalPascal.g:3123:1: rule__Variable_declaration__Group__2 : rule__Variable_declaration__Group__2__Impl ;
    public final void rule__Variable_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3127:1: ( rule__Variable_declaration__Group__2__Impl )
            // InternalPascal.g:3128:2: rule__Variable_declaration__Group__2__Impl
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
    // InternalPascal.g:3134:1: rule__Variable_declaration__Group__2__Impl : ( ( rule__Variable_declaration__TypesAssignment_2 ) ) ;
    public final void rule__Variable_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3138:1: ( ( ( rule__Variable_declaration__TypesAssignment_2 ) ) )
            // InternalPascal.g:3139:1: ( ( rule__Variable_declaration__TypesAssignment_2 ) )
            {
            // InternalPascal.g:3139:1: ( ( rule__Variable_declaration__TypesAssignment_2 ) )
            // InternalPascal.g:3140:2: ( rule__Variable_declaration__TypesAssignment_2 )
            {
             before(grammarAccess.getVariable_declarationAccess().getTypesAssignment_2()); 
            // InternalPascal.g:3141:2: ( rule__Variable_declaration__TypesAssignment_2 )
            // InternalPascal.g:3141:3: rule__Variable_declaration__TypesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration__TypesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declarationAccess().getTypesAssignment_2()); 

            }


            }

        }
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
    // InternalPascal.g:3150:1: rule__Compound_statement__Group__0 : rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1 ;
    public final void rule__Compound_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3154:1: ( rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1 )
            // InternalPascal.g:3155:2: rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalPascal.g:3162:1: rule__Compound_statement__Group__0__Impl : ( 'begin' ) ;
    public final void rule__Compound_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3166:1: ( ( 'begin' ) )
            // InternalPascal.g:3167:1: ( 'begin' )
            {
            // InternalPascal.g:3167:1: ( 'begin' )
            // InternalPascal.g:3168:2: 'begin'
            {
             before(grammarAccess.getCompound_statementAccess().getBeginKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalPascal.g:3177:1: rule__Compound_statement__Group__1 : rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2 ;
    public final void rule__Compound_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3181:1: ( rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2 )
            // InternalPascal.g:3182:2: rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalPascal.g:3189:1: rule__Compound_statement__Group__1__Impl : ( ( rule__Compound_statement__SequenceAssignment_1 ) ) ;
    public final void rule__Compound_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3193:1: ( ( ( rule__Compound_statement__SequenceAssignment_1 ) ) )
            // InternalPascal.g:3194:1: ( ( rule__Compound_statement__SequenceAssignment_1 ) )
            {
            // InternalPascal.g:3194:1: ( ( rule__Compound_statement__SequenceAssignment_1 ) )
            // InternalPascal.g:3195:2: ( rule__Compound_statement__SequenceAssignment_1 )
            {
             before(grammarAccess.getCompound_statementAccess().getSequenceAssignment_1()); 
            // InternalPascal.g:3196:2: ( rule__Compound_statement__SequenceAssignment_1 )
            // InternalPascal.g:3196:3: rule__Compound_statement__SequenceAssignment_1
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
    // InternalPascal.g:3204:1: rule__Compound_statement__Group__2 : rule__Compound_statement__Group__2__Impl ;
    public final void rule__Compound_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3208:1: ( rule__Compound_statement__Group__2__Impl )
            // InternalPascal.g:3209:2: rule__Compound_statement__Group__2__Impl
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
    // InternalPascal.g:3215:1: rule__Compound_statement__Group__2__Impl : ( 'end' ) ;
    public final void rule__Compound_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3219:1: ( ( 'end' ) )
            // InternalPascal.g:3220:1: ( 'end' )
            {
            // InternalPascal.g:3220:1: ( 'end' )
            // InternalPascal.g:3221:2: 'end'
            {
             before(grammarAccess.getCompound_statementAccess().getEndKeyword_2()); 
            match(input,50,FOLLOW_2); 
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
    // InternalPascal.g:3231:1: rule__Statements__Group__0 : rule__Statements__Group__0__Impl rule__Statements__Group__1 ;
    public final void rule__Statements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3235:1: ( rule__Statements__Group__0__Impl rule__Statements__Group__1 )
            // InternalPascal.g:3236:2: rule__Statements__Group__0__Impl rule__Statements__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalPascal.g:3243:1: rule__Statements__Group__0__Impl : ( ( rule__Statements__StatementsAssignment_0 ) ) ;
    public final void rule__Statements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3247:1: ( ( ( rule__Statements__StatementsAssignment_0 ) ) )
            // InternalPascal.g:3248:1: ( ( rule__Statements__StatementsAssignment_0 ) )
            {
            // InternalPascal.g:3248:1: ( ( rule__Statements__StatementsAssignment_0 ) )
            // InternalPascal.g:3249:2: ( rule__Statements__StatementsAssignment_0 )
            {
             before(grammarAccess.getStatementsAccess().getStatementsAssignment_0()); 
            // InternalPascal.g:3250:2: ( rule__Statements__StatementsAssignment_0 )
            // InternalPascal.g:3250:3: rule__Statements__StatementsAssignment_0
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
    // InternalPascal.g:3258:1: rule__Statements__Group__1 : rule__Statements__Group__1__Impl ;
    public final void rule__Statements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3262:1: ( rule__Statements__Group__1__Impl )
            // InternalPascal.g:3263:2: rule__Statements__Group__1__Impl
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
    // InternalPascal.g:3269:1: rule__Statements__Group__1__Impl : ( ( rule__Statements__Group_1__0 )* ) ;
    public final void rule__Statements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3273:1: ( ( ( rule__Statements__Group_1__0 )* ) )
            // InternalPascal.g:3274:1: ( ( rule__Statements__Group_1__0 )* )
            {
            // InternalPascal.g:3274:1: ( ( rule__Statements__Group_1__0 )* )
            // InternalPascal.g:3275:2: ( rule__Statements__Group_1__0 )*
            {
             before(grammarAccess.getStatementsAccess().getGroup_1()); 
            // InternalPascal.g:3276:2: ( rule__Statements__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==43) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPascal.g:3276:3: rule__Statements__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Statements__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalPascal.g:3285:1: rule__Statements__Group_1__0 : rule__Statements__Group_1__0__Impl rule__Statements__Group_1__1 ;
    public final void rule__Statements__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3289:1: ( rule__Statements__Group_1__0__Impl rule__Statements__Group_1__1 )
            // InternalPascal.g:3290:2: rule__Statements__Group_1__0__Impl rule__Statements__Group_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalPascal.g:3297:1: rule__Statements__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Statements__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3301:1: ( ( ';' ) )
            // InternalPascal.g:3302:1: ( ';' )
            {
            // InternalPascal.g:3302:1: ( ';' )
            // InternalPascal.g:3303:2: ';'
            {
             before(grammarAccess.getStatementsAccess().getSemicolonKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalPascal.g:3312:1: rule__Statements__Group_1__1 : rule__Statements__Group_1__1__Impl ;
    public final void rule__Statements__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3316:1: ( rule__Statements__Group_1__1__Impl )
            // InternalPascal.g:3317:2: rule__Statements__Group_1__1__Impl
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
    // InternalPascal.g:3323:1: rule__Statements__Group_1__1__Impl : ( ( rule__Statements__StatementsAssignment_1_1 ) ) ;
    public final void rule__Statements__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3327:1: ( ( ( rule__Statements__StatementsAssignment_1_1 ) ) )
            // InternalPascal.g:3328:1: ( ( rule__Statements__StatementsAssignment_1_1 ) )
            {
            // InternalPascal.g:3328:1: ( ( rule__Statements__StatementsAssignment_1_1 ) )
            // InternalPascal.g:3329:2: ( rule__Statements__StatementsAssignment_1_1 )
            {
             before(grammarAccess.getStatementsAccess().getStatementsAssignment_1_1()); 
            // InternalPascal.g:3330:2: ( rule__Statements__StatementsAssignment_1_1 )
            // InternalPascal.g:3330:3: rule__Statements__StatementsAssignment_1_1
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


    // $ANTLR start "rule__Statement__Group_0__0"
    // InternalPascal.g:3339:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3343:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalPascal.g:3344:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1();

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
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // InternalPascal.g:3351:1: rule__Statement__Group_0__0__Impl : ( ( rule__Statement__LabelAssignment_0_0 ) ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3355:1: ( ( ( rule__Statement__LabelAssignment_0_0 ) ) )
            // InternalPascal.g:3356:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            {
            // InternalPascal.g:3356:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            // InternalPascal.g:3357:2: ( rule__Statement__LabelAssignment_0_0 )
            {
             before(grammarAccess.getStatementAccess().getLabelAssignment_0_0()); 
            // InternalPascal.g:3358:2: ( rule__Statement__LabelAssignment_0_0 )
            // InternalPascal.g:3358:3: rule__Statement__LabelAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__LabelAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getLabelAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // InternalPascal.g:3366:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3370:1: ( rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 )
            // InternalPascal.g:3371:2: rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2
            {
            pushFollow(FOLLOW_21);
            rule__Statement__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__2();

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
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // InternalPascal.g:3378:1: rule__Statement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3382:1: ( ( ':' ) )
            // InternalPascal.g:3383:1: ( ':' )
            {
            // InternalPascal.g:3383:1: ( ':' )
            // InternalPascal.g:3384:2: ':'
            {
             before(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Statement__Group_0__2"
    // InternalPascal.g:3393:1: rule__Statement__Group_0__2 : rule__Statement__Group_0__2__Impl ;
    public final void rule__Statement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3397:1: ( rule__Statement__Group_0__2__Impl )
            // InternalPascal.g:3398:2: rule__Statement__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__2__Impl();

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
    // $ANTLR end "rule__Statement__Group_0__2"


    // $ANTLR start "rule__Statement__Group_0__2__Impl"
    // InternalPascal.g:3404:1: rule__Statement__Group_0__2__Impl : ( ( rule__Statement__StatementAssignment_0_2 ) ) ;
    public final void rule__Statement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3408:1: ( ( ( rule__Statement__StatementAssignment_0_2 ) ) )
            // InternalPascal.g:3409:1: ( ( rule__Statement__StatementAssignment_0_2 ) )
            {
            // InternalPascal.g:3409:1: ( ( rule__Statement__StatementAssignment_0_2 ) )
            // InternalPascal.g:3410:2: ( rule__Statement__StatementAssignment_0_2 )
            {
             before(grammarAccess.getStatementAccess().getStatementAssignment_0_2()); 
            // InternalPascal.g:3411:2: ( rule__Statement__StatementAssignment_0_2 )
            // InternalPascal.g:3411:3: rule__Statement__StatementAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__2__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // InternalPascal.g:3420:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3424:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalPascal.g:3425:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1();

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
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // InternalPascal.g:3432:1: rule__Statement__Group_1__0__Impl : ( () ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3436:1: ( ( () ) )
            // InternalPascal.g:3437:1: ( () )
            {
            // InternalPascal.g:3437:1: ( () )
            // InternalPascal.g:3438:2: ()
            {
             before(grammarAccess.getStatementAccess().getStatementAction_1_0()); 
            // InternalPascal.g:3439:2: ()
            // InternalPascal.g:3439:3: 
            {
            }

             after(grammarAccess.getStatementAccess().getStatementAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // InternalPascal.g:3447:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3451:1: ( rule__Statement__Group_1__1__Impl )
            // InternalPascal.g:3452:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // InternalPascal.g:3458:1: rule__Statement__Group_1__1__Impl : ( ( rule__Statement__StatementAssignment_1_1 )? ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3462:1: ( ( ( rule__Statement__StatementAssignment_1_1 )? ) )
            // InternalPascal.g:3463:1: ( ( rule__Statement__StatementAssignment_1_1 )? )
            {
            // InternalPascal.g:3463:1: ( ( rule__Statement__StatementAssignment_1_1 )? )
            // InternalPascal.g:3464:2: ( rule__Statement__StatementAssignment_1_1 )?
            {
             before(grammarAccess.getStatementAccess().getStatementAssignment_1_1()); 
            // InternalPascal.g:3465:2: ( rule__Statement__StatementAssignment_1_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||(LA30_0>=38 && LA30_0<=39)||LA30_0==51) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPascal.g:3465:3: rule__Statement__StatementAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__StatementAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getStatementAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__Assignment_statement__Group__0"
    // InternalPascal.g:3474:1: rule__Assignment_statement__Group__0 : rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 ;
    public final void rule__Assignment_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3478:1: ( rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 )
            // InternalPascal.g:3479:2: rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPascal.g:3486:1: rule__Assignment_statement__Group__0__Impl : ( ( rule__Assignment_statement__VariableAssignment_0 ) ) ;
    public final void rule__Assignment_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3490:1: ( ( ( rule__Assignment_statement__VariableAssignment_0 ) ) )
            // InternalPascal.g:3491:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            {
            // InternalPascal.g:3491:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            // InternalPascal.g:3492:2: ( rule__Assignment_statement__VariableAssignment_0 )
            {
             before(grammarAccess.getAssignment_statementAccess().getVariableAssignment_0()); 
            // InternalPascal.g:3493:2: ( rule__Assignment_statement__VariableAssignment_0 )
            // InternalPascal.g:3493:3: rule__Assignment_statement__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignment_statementAccess().getVariableAssignment_0()); 

            }


            }

        }
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
    // InternalPascal.g:3501:1: rule__Assignment_statement__Group__1 : rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 ;
    public final void rule__Assignment_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3505:1: ( rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 )
            // InternalPascal.g:3506:2: rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalPascal.g:3513:1: rule__Assignment_statement__Group__1__Impl : ( RULE_ASSIGN ) ;
    public final void rule__Assignment_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3517:1: ( ( RULE_ASSIGN ) )
            // InternalPascal.g:3518:1: ( RULE_ASSIGN )
            {
            // InternalPascal.g:3518:1: ( RULE_ASSIGN )
            // InternalPascal.g:3519:2: RULE_ASSIGN
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
    // InternalPascal.g:3528:1: rule__Assignment_statement__Group__2 : rule__Assignment_statement__Group__2__Impl ;
    public final void rule__Assignment_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3532:1: ( rule__Assignment_statement__Group__2__Impl )
            // InternalPascal.g:3533:2: rule__Assignment_statement__Group__2__Impl
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
    // InternalPascal.g:3539:1: rule__Assignment_statement__Group__2__Impl : ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3543:1: ( ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) )
            // InternalPascal.g:3544:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            {
            // InternalPascal.g:3544:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            // InternalPascal.g:3545:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            {
             before(grammarAccess.getAssignment_statementAccess().getExpressionAssignment_2()); 
            // InternalPascal.g:3546:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            // InternalPascal.g:3546:3: rule__Assignment_statement__ExpressionAssignment_2
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
    // InternalPascal.g:3555:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3559:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPascal.g:3560:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalPascal.g:3567:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__Alternatives_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3571:1: ( ( ( rule__Variable__Alternatives_0 ) ) )
            // InternalPascal.g:3572:1: ( ( rule__Variable__Alternatives_0 ) )
            {
            // InternalPascal.g:3572:1: ( ( rule__Variable__Alternatives_0 ) )
            // InternalPascal.g:3573:2: ( rule__Variable__Alternatives_0 )
            {
             before(grammarAccess.getVariableAccess().getAlternatives_0()); 
            // InternalPascal.g:3574:2: ( rule__Variable__Alternatives_0 )
            // InternalPascal.g:3574:3: rule__Variable__Alternatives_0
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
    // InternalPascal.g:3582:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3586:1: ( rule__Variable__Group__1__Impl )
            // InternalPascal.g:3587:2: rule__Variable__Group__1__Impl
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
    // InternalPascal.g:3593:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__Alternatives_1 )* ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3597:1: ( ( ( rule__Variable__Alternatives_1 )* ) )
            // InternalPascal.g:3598:1: ( ( rule__Variable__Alternatives_1 )* )
            {
            // InternalPascal.g:3598:1: ( ( rule__Variable__Alternatives_1 )* )
            // InternalPascal.g:3599:2: ( rule__Variable__Alternatives_1 )*
            {
             before(grammarAccess.getVariableAccess().getAlternatives_1()); 
            // InternalPascal.g:3600:2: ( rule__Variable__Alternatives_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=40 && LA31_0<=41)||LA31_0==52||LA31_0==54) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPascal.g:3600:3: rule__Variable__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Variable__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalPascal.g:3609:1: rule__Variable__Group_0_0__0 : rule__Variable__Group_0_0__0__Impl rule__Variable__Group_0_0__1 ;
    public final void rule__Variable__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3613:1: ( rule__Variable__Group_0_0__0__Impl rule__Variable__Group_0_0__1 )
            // InternalPascal.g:3614:2: rule__Variable__Group_0_0__0__Impl rule__Variable__Group_0_0__1
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
    // InternalPascal.g:3621:1: rule__Variable__Group_0_0__0__Impl : ( '@' ) ;
    public final void rule__Variable__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3625:1: ( ( '@' ) )
            // InternalPascal.g:3626:1: ( '@' )
            {
            // InternalPascal.g:3626:1: ( '@' )
            // InternalPascal.g:3627:2: '@'
            {
             before(grammarAccess.getVariableAccess().getCommercialAtKeyword_0_0_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalPascal.g:3636:1: rule__Variable__Group_0_0__1 : rule__Variable__Group_0_0__1__Impl ;
    public final void rule__Variable__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3640:1: ( rule__Variable__Group_0_0__1__Impl )
            // InternalPascal.g:3641:2: rule__Variable__Group_0_0__1__Impl
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
    // InternalPascal.g:3647:1: rule__Variable__Group_0_0__1__Impl : ( ( rule__Variable__NamesAssignment_0_0_1 ) ) ;
    public final void rule__Variable__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3651:1: ( ( ( rule__Variable__NamesAssignment_0_0_1 ) ) )
            // InternalPascal.g:3652:1: ( ( rule__Variable__NamesAssignment_0_0_1 ) )
            {
            // InternalPascal.g:3652:1: ( ( rule__Variable__NamesAssignment_0_0_1 ) )
            // InternalPascal.g:3653:2: ( rule__Variable__NamesAssignment_0_0_1 )
            {
             before(grammarAccess.getVariableAccess().getNamesAssignment_0_0_1()); 
            // InternalPascal.g:3654:2: ( rule__Variable__NamesAssignment_0_0_1 )
            // InternalPascal.g:3654:3: rule__Variable__NamesAssignment_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NamesAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNamesAssignment_0_0_1()); 

            }


            }

        }
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
    // InternalPascal.g:3663:1: rule__Variable__Group_1_0__0 : rule__Variable__Group_1_0__0__Impl rule__Variable__Group_1_0__1 ;
    public final void rule__Variable__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3667:1: ( rule__Variable__Group_1_0__0__Impl rule__Variable__Group_1_0__1 )
            // InternalPascal.g:3668:2: rule__Variable__Group_1_0__0__Impl rule__Variable__Group_1_0__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalPascal.g:3675:1: rule__Variable__Group_1_0__0__Impl : ( '[' ) ;
    public final void rule__Variable__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3679:1: ( ( '[' ) )
            // InternalPascal.g:3680:1: ( '[' )
            {
            // InternalPascal.g:3680:1: ( '[' )
            // InternalPascal.g:3681:2: '['
            {
             before(grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_1_0_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalPascal.g:3690:1: rule__Variable__Group_1_0__1 : rule__Variable__Group_1_0__1__Impl rule__Variable__Group_1_0__2 ;
    public final void rule__Variable__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3694:1: ( rule__Variable__Group_1_0__1__Impl rule__Variable__Group_1_0__2 )
            // InternalPascal.g:3695:2: rule__Variable__Group_1_0__1__Impl rule__Variable__Group_1_0__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalPascal.g:3702:1: rule__Variable__Group_1_0__1__Impl : ( ( rule__Variable__ExpressionAssignment_1_0_1 ) ) ;
    public final void rule__Variable__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3706:1: ( ( ( rule__Variable__ExpressionAssignment_1_0_1 ) ) )
            // InternalPascal.g:3707:1: ( ( rule__Variable__ExpressionAssignment_1_0_1 ) )
            {
            // InternalPascal.g:3707:1: ( ( rule__Variable__ExpressionAssignment_1_0_1 ) )
            // InternalPascal.g:3708:2: ( rule__Variable__ExpressionAssignment_1_0_1 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_1_0_1()); 
            // InternalPascal.g:3709:2: ( rule__Variable__ExpressionAssignment_1_0_1 )
            // InternalPascal.g:3709:3: rule__Variable__ExpressionAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ExpressionAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getExpressionAssignment_1_0_1()); 

            }


            }

        }
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
    // InternalPascal.g:3717:1: rule__Variable__Group_1_0__2 : rule__Variable__Group_1_0__2__Impl rule__Variable__Group_1_0__3 ;
    public final void rule__Variable__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3721:1: ( rule__Variable__Group_1_0__2__Impl rule__Variable__Group_1_0__3 )
            // InternalPascal.g:3722:2: rule__Variable__Group_1_0__2__Impl rule__Variable__Group_1_0__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalPascal.g:3729:1: rule__Variable__Group_1_0__2__Impl : ( ( rule__Variable__Group_1_0_2__0 )* ) ;
    public final void rule__Variable__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3733:1: ( ( ( rule__Variable__Group_1_0_2__0 )* ) )
            // InternalPascal.g:3734:1: ( ( rule__Variable__Group_1_0_2__0 )* )
            {
            // InternalPascal.g:3734:1: ( ( rule__Variable__Group_1_0_2__0 )* )
            // InternalPascal.g:3735:2: ( rule__Variable__Group_1_0_2__0 )*
            {
             before(grammarAccess.getVariableAccess().getGroup_1_0_2()); 
            // InternalPascal.g:3736:2: ( rule__Variable__Group_1_0_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==46) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPascal.g:3736:3: rule__Variable__Group_1_0_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Variable__Group_1_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalPascal.g:3744:1: rule__Variable__Group_1_0__3 : rule__Variable__Group_1_0__3__Impl ;
    public final void rule__Variable__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3748:1: ( rule__Variable__Group_1_0__3__Impl )
            // InternalPascal.g:3749:2: rule__Variable__Group_1_0__3__Impl
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
    // InternalPascal.g:3755:1: rule__Variable__Group_1_0__3__Impl : ( ']' ) ;
    public final void rule__Variable__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3759:1: ( ( ']' ) )
            // InternalPascal.g:3760:1: ( ']' )
            {
            // InternalPascal.g:3760:1: ( ']' )
            // InternalPascal.g:3761:2: ']'
            {
             before(grammarAccess.getVariableAccess().getRightSquareBracketKeyword_1_0_3()); 
            match(input,53,FOLLOW_2); 
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
    // InternalPascal.g:3771:1: rule__Variable__Group_1_0_2__0 : rule__Variable__Group_1_0_2__0__Impl rule__Variable__Group_1_0_2__1 ;
    public final void rule__Variable__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3775:1: ( rule__Variable__Group_1_0_2__0__Impl rule__Variable__Group_1_0_2__1 )
            // InternalPascal.g:3776:2: rule__Variable__Group_1_0_2__0__Impl rule__Variable__Group_1_0_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalPascal.g:3783:1: rule__Variable__Group_1_0_2__0__Impl : ( ',' ) ;
    public final void rule__Variable__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3787:1: ( ( ',' ) )
            // InternalPascal.g:3788:1: ( ',' )
            {
            // InternalPascal.g:3788:1: ( ',' )
            // InternalPascal.g:3789:2: ','
            {
             before(grammarAccess.getVariableAccess().getCommaKeyword_1_0_2_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalPascal.g:3798:1: rule__Variable__Group_1_0_2__1 : rule__Variable__Group_1_0_2__1__Impl ;
    public final void rule__Variable__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3802:1: ( rule__Variable__Group_1_0_2__1__Impl )
            // InternalPascal.g:3803:2: rule__Variable__Group_1_0_2__1__Impl
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
    // InternalPascal.g:3809:1: rule__Variable__Group_1_0_2__1__Impl : ( ( rule__Variable__ExpressionAssignment_1_0_2_1 ) ) ;
    public final void rule__Variable__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3813:1: ( ( ( rule__Variable__ExpressionAssignment_1_0_2_1 ) ) )
            // InternalPascal.g:3814:1: ( ( rule__Variable__ExpressionAssignment_1_0_2_1 ) )
            {
            // InternalPascal.g:3814:1: ( ( rule__Variable__ExpressionAssignment_1_0_2_1 ) )
            // InternalPascal.g:3815:2: ( rule__Variable__ExpressionAssignment_1_0_2_1 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_1_0_2_1()); 
            // InternalPascal.g:3816:2: ( rule__Variable__ExpressionAssignment_1_0_2_1 )
            // InternalPascal.g:3816:3: rule__Variable__ExpressionAssignment_1_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ExpressionAssignment_1_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getExpressionAssignment_1_0_2_1()); 

            }


            }

        }
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
    // InternalPascal.g:3825:1: rule__Variable__Group_1_1__0 : rule__Variable__Group_1_1__0__Impl rule__Variable__Group_1_1__1 ;
    public final void rule__Variable__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3829:1: ( rule__Variable__Group_1_1__0__Impl rule__Variable__Group_1_1__1 )
            // InternalPascal.g:3830:2: rule__Variable__Group_1_1__0__Impl rule__Variable__Group_1_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalPascal.g:3837:1: rule__Variable__Group_1_1__0__Impl : ( '(.' ) ;
    public final void rule__Variable__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3841:1: ( ( '(.' ) )
            // InternalPascal.g:3842:1: ( '(.' )
            {
            // InternalPascal.g:3842:1: ( '(.' )
            // InternalPascal.g:3843:2: '(.'
            {
             before(grammarAccess.getVariableAccess().getLeftParenthesisFullStopKeyword_1_1_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalPascal.g:3852:1: rule__Variable__Group_1_1__1 : rule__Variable__Group_1_1__1__Impl rule__Variable__Group_1_1__2 ;
    public final void rule__Variable__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3856:1: ( rule__Variable__Group_1_1__1__Impl rule__Variable__Group_1_1__2 )
            // InternalPascal.g:3857:2: rule__Variable__Group_1_1__1__Impl rule__Variable__Group_1_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalPascal.g:3864:1: rule__Variable__Group_1_1__1__Impl : ( ( rule__Variable__ExpressionAssignment_1_1_1 ) ) ;
    public final void rule__Variable__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3868:1: ( ( ( rule__Variable__ExpressionAssignment_1_1_1 ) ) )
            // InternalPascal.g:3869:1: ( ( rule__Variable__ExpressionAssignment_1_1_1 ) )
            {
            // InternalPascal.g:3869:1: ( ( rule__Variable__ExpressionAssignment_1_1_1 ) )
            // InternalPascal.g:3870:2: ( rule__Variable__ExpressionAssignment_1_1_1 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_1_1_1()); 
            // InternalPascal.g:3871:2: ( rule__Variable__ExpressionAssignment_1_1_1 )
            // InternalPascal.g:3871:3: rule__Variable__ExpressionAssignment_1_1_1
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
    // InternalPascal.g:3879:1: rule__Variable__Group_1_1__2 : rule__Variable__Group_1_1__2__Impl rule__Variable__Group_1_1__3 ;
    public final void rule__Variable__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3883:1: ( rule__Variable__Group_1_1__2__Impl rule__Variable__Group_1_1__3 )
            // InternalPascal.g:3884:2: rule__Variable__Group_1_1__2__Impl rule__Variable__Group_1_1__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalPascal.g:3891:1: rule__Variable__Group_1_1__2__Impl : ( ( rule__Variable__Group_1_1_2__0 )* ) ;
    public final void rule__Variable__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3895:1: ( ( ( rule__Variable__Group_1_1_2__0 )* ) )
            // InternalPascal.g:3896:1: ( ( rule__Variable__Group_1_1_2__0 )* )
            {
            // InternalPascal.g:3896:1: ( ( rule__Variable__Group_1_1_2__0 )* )
            // InternalPascal.g:3897:2: ( rule__Variable__Group_1_1_2__0 )*
            {
             before(grammarAccess.getVariableAccess().getGroup_1_1_2()); 
            // InternalPascal.g:3898:2: ( rule__Variable__Group_1_1_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==46) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPascal.g:3898:3: rule__Variable__Group_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Variable__Group_1_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalPascal.g:3906:1: rule__Variable__Group_1_1__3 : rule__Variable__Group_1_1__3__Impl ;
    public final void rule__Variable__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3910:1: ( rule__Variable__Group_1_1__3__Impl )
            // InternalPascal.g:3911:2: rule__Variable__Group_1_1__3__Impl
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
    // InternalPascal.g:3917:1: rule__Variable__Group_1_1__3__Impl : ( '.)' ) ;
    public final void rule__Variable__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3921:1: ( ( '.)' ) )
            // InternalPascal.g:3922:1: ( '.)' )
            {
            // InternalPascal.g:3922:1: ( '.)' )
            // InternalPascal.g:3923:2: '.)'
            {
             before(grammarAccess.getVariableAccess().getFullStopRightParenthesisKeyword_1_1_3()); 
            match(input,55,FOLLOW_2); 
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
    // InternalPascal.g:3933:1: rule__Variable__Group_1_1_2__0 : rule__Variable__Group_1_1_2__0__Impl rule__Variable__Group_1_1_2__1 ;
    public final void rule__Variable__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3937:1: ( rule__Variable__Group_1_1_2__0__Impl rule__Variable__Group_1_1_2__1 )
            // InternalPascal.g:3938:2: rule__Variable__Group_1_1_2__0__Impl rule__Variable__Group_1_1_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalPascal.g:3945:1: rule__Variable__Group_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__Variable__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3949:1: ( ( ',' ) )
            // InternalPascal.g:3950:1: ( ',' )
            {
            // InternalPascal.g:3950:1: ( ',' )
            // InternalPascal.g:3951:2: ','
            {
             before(grammarAccess.getVariableAccess().getCommaKeyword_1_1_2_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalPascal.g:3960:1: rule__Variable__Group_1_1_2__1 : rule__Variable__Group_1_1_2__1__Impl ;
    public final void rule__Variable__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3964:1: ( rule__Variable__Group_1_1_2__1__Impl )
            // InternalPascal.g:3965:2: rule__Variable__Group_1_1_2__1__Impl
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
    // InternalPascal.g:3971:1: rule__Variable__Group_1_1_2__1__Impl : ( ( rule__Variable__ExpressionAssignment_1_1_2_1 ) ) ;
    public final void rule__Variable__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3975:1: ( ( ( rule__Variable__ExpressionAssignment_1_1_2_1 ) ) )
            // InternalPascal.g:3976:1: ( ( rule__Variable__ExpressionAssignment_1_1_2_1 ) )
            {
            // InternalPascal.g:3976:1: ( ( rule__Variable__ExpressionAssignment_1_1_2_1 ) )
            // InternalPascal.g:3977:2: ( rule__Variable__ExpressionAssignment_1_1_2_1 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_1_1_2_1()); 
            // InternalPascal.g:3978:2: ( rule__Variable__ExpressionAssignment_1_1_2_1 )
            // InternalPascal.g:3978:3: rule__Variable__ExpressionAssignment_1_1_2_1
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
    // InternalPascal.g:3987:1: rule__Variable__Group_1_2__0 : rule__Variable__Group_1_2__0__Impl rule__Variable__Group_1_2__1 ;
    public final void rule__Variable__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3991:1: ( rule__Variable__Group_1_2__0__Impl rule__Variable__Group_1_2__1 )
            // InternalPascal.g:3992:2: rule__Variable__Group_1_2__0__Impl rule__Variable__Group_1_2__1
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
    // InternalPascal.g:3999:1: rule__Variable__Group_1_2__0__Impl : ( '.' ) ;
    public final void rule__Variable__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4003:1: ( ( '.' ) )
            // InternalPascal.g:4004:1: ( '.' )
            {
            // InternalPascal.g:4004:1: ( '.' )
            // InternalPascal.g:4005:2: '.'
            {
             before(grammarAccess.getVariableAccess().getFullStopKeyword_1_2_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalPascal.g:4014:1: rule__Variable__Group_1_2__1 : rule__Variable__Group_1_2__1__Impl ;
    public final void rule__Variable__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4018:1: ( rule__Variable__Group_1_2__1__Impl )
            // InternalPascal.g:4019:2: rule__Variable__Group_1_2__1__Impl
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
    // InternalPascal.g:4025:1: rule__Variable__Group_1_2__1__Impl : ( ( rule__Variable__NamesAssignment_1_2_1 ) ) ;
    public final void rule__Variable__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4029:1: ( ( ( rule__Variable__NamesAssignment_1_2_1 ) ) )
            // InternalPascal.g:4030:1: ( ( rule__Variable__NamesAssignment_1_2_1 ) )
            {
            // InternalPascal.g:4030:1: ( ( rule__Variable__NamesAssignment_1_2_1 ) )
            // InternalPascal.g:4031:2: ( rule__Variable__NamesAssignment_1_2_1 )
            {
             before(grammarAccess.getVariableAccess().getNamesAssignment_1_2_1()); 
            // InternalPascal.g:4032:2: ( rule__Variable__NamesAssignment_1_2_1 )
            // InternalPascal.g:4032:3: rule__Variable__NamesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NamesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNamesAssignment_1_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Expression__Group__0"
    // InternalPascal.g:4041:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4045:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalPascal.g:4046:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalPascal.g:4053:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4057:1: ( ( ( rule__Expression__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:4058:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:4058:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            // InternalPascal.g:4059:2: ( rule__Expression__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionsAssignment_0()); 
            // InternalPascal.g:4060:2: ( rule__Expression__ExpressionsAssignment_0 )
            // InternalPascal.g:4060:3: rule__Expression__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExpressionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExpressionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalPascal.g:4068:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4072:1: ( rule__Expression__Group__1__Impl )
            // InternalPascal.g:4073:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalPascal.g:4079:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4083:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalPascal.g:4084:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalPascal.g:4084:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalPascal.g:4085:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalPascal.g:4086:2: ( rule__Expression__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_EQUAL && LA34_0<=RULE_IN)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPascal.g:4086:3: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalPascal.g:4095:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4099:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalPascal.g:4100:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalPascal.g:4107:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__OperatorsAssignment_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4111:1: ( ( ( rule__Expression__OperatorsAssignment_1_0 ) ) )
            // InternalPascal.g:4112:1: ( ( rule__Expression__OperatorsAssignment_1_0 ) )
            {
            // InternalPascal.g:4112:1: ( ( rule__Expression__OperatorsAssignment_1_0 ) )
            // InternalPascal.g:4113:2: ( rule__Expression__OperatorsAssignment_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0()); 
            // InternalPascal.g:4114:2: ( rule__Expression__OperatorsAssignment_1_0 )
            // InternalPascal.g:4114:3: rule__Expression__OperatorsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OperatorsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalPascal.g:4122:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4126:1: ( rule__Expression__Group_1__1__Impl )
            // InternalPascal.g:4127:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalPascal.g:4133:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4137:1: ( ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:4138:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:4138:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:4139:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionsAssignment_1_1()); 
            // InternalPascal.g:4140:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            // InternalPascal.g:4140:3: rule__Expression__ExpressionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExpressionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExpressionsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Simple_expression__Group__0"
    // InternalPascal.g:4149:1: rule__Simple_expression__Group__0 : rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 ;
    public final void rule__Simple_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4153:1: ( rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 )
            // InternalPascal.g:4154:2: rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalPascal.g:4161:1: rule__Simple_expression__Group__0__Impl : ( ( rule__Simple_expression__TermsAssignment_0 ) ) ;
    public final void rule__Simple_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4165:1: ( ( ( rule__Simple_expression__TermsAssignment_0 ) ) )
            // InternalPascal.g:4166:1: ( ( rule__Simple_expression__TermsAssignment_0 ) )
            {
            // InternalPascal.g:4166:1: ( ( rule__Simple_expression__TermsAssignment_0 ) )
            // InternalPascal.g:4167:2: ( rule__Simple_expression__TermsAssignment_0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_0()); 
            // InternalPascal.g:4168:2: ( rule__Simple_expression__TermsAssignment_0 )
            // InternalPascal.g:4168:3: rule__Simple_expression__TermsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__TermsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimple_expressionAccess().getTermsAssignment_0()); 

            }


            }

        }
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
    // InternalPascal.g:4176:1: rule__Simple_expression__Group__1 : rule__Simple_expression__Group__1__Impl ;
    public final void rule__Simple_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4180:1: ( rule__Simple_expression__Group__1__Impl )
            // InternalPascal.g:4181:2: rule__Simple_expression__Group__1__Impl
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
    // InternalPascal.g:4187:1: rule__Simple_expression__Group__1__Impl : ( ( rule__Simple_expression__Group_1__0 )? ) ;
    public final void rule__Simple_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4191:1: ( ( ( rule__Simple_expression__Group_1__0 )? ) )
            // InternalPascal.g:4192:1: ( ( rule__Simple_expression__Group_1__0 )? )
            {
            // InternalPascal.g:4192:1: ( ( rule__Simple_expression__Group_1__0 )? )
            // InternalPascal.g:4193:2: ( rule__Simple_expression__Group_1__0 )?
            {
             before(grammarAccess.getSimple_expressionAccess().getGroup_1()); 
            // InternalPascal.g:4194:2: ( rule__Simple_expression__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_PLUS && LA35_0<=RULE_OR)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPascal.g:4194:3: rule__Simple_expression__Group_1__0
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
    // InternalPascal.g:4203:1: rule__Simple_expression__Group_1__0 : rule__Simple_expression__Group_1__0__Impl rule__Simple_expression__Group_1__1 ;
    public final void rule__Simple_expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4207:1: ( rule__Simple_expression__Group_1__0__Impl rule__Simple_expression__Group_1__1 )
            // InternalPascal.g:4208:2: rule__Simple_expression__Group_1__0__Impl rule__Simple_expression__Group_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalPascal.g:4215:1: rule__Simple_expression__Group_1__0__Impl : ( ( rule__Simple_expression__OperatorsAssignment_1_0 ) ) ;
    public final void rule__Simple_expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4219:1: ( ( ( rule__Simple_expression__OperatorsAssignment_1_0 ) ) )
            // InternalPascal.g:4220:1: ( ( rule__Simple_expression__OperatorsAssignment_1_0 ) )
            {
            // InternalPascal.g:4220:1: ( ( rule__Simple_expression__OperatorsAssignment_1_0 ) )
            // InternalPascal.g:4221:2: ( rule__Simple_expression__OperatorsAssignment_1_0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_1_0()); 
            // InternalPascal.g:4222:2: ( rule__Simple_expression__OperatorsAssignment_1_0 )
            // InternalPascal.g:4222:3: rule__Simple_expression__OperatorsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__OperatorsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_1_0()); 

            }


            }

        }
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
    // InternalPascal.g:4230:1: rule__Simple_expression__Group_1__1 : rule__Simple_expression__Group_1__1__Impl ;
    public final void rule__Simple_expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4234:1: ( rule__Simple_expression__Group_1__1__Impl )
            // InternalPascal.g:4235:2: rule__Simple_expression__Group_1__1__Impl
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
    // InternalPascal.g:4241:1: rule__Simple_expression__Group_1__1__Impl : ( ( rule__Simple_expression__ExpressionAssignment_1_1 ) ) ;
    public final void rule__Simple_expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4245:1: ( ( ( rule__Simple_expression__ExpressionAssignment_1_1 ) ) )
            // InternalPascal.g:4246:1: ( ( rule__Simple_expression__ExpressionAssignment_1_1 ) )
            {
            // InternalPascal.g:4246:1: ( ( rule__Simple_expression__ExpressionAssignment_1_1 ) )
            // InternalPascal.g:4247:2: ( rule__Simple_expression__ExpressionAssignment_1_1 )
            {
             before(grammarAccess.getSimple_expressionAccess().getExpressionAssignment_1_1()); 
            // InternalPascal.g:4248:2: ( rule__Simple_expression__ExpressionAssignment_1_1 )
            // InternalPascal.g:4248:3: rule__Simple_expression__ExpressionAssignment_1_1
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
    // InternalPascal.g:4257:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4261:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalPascal.g:4262:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalPascal.g:4269:1: rule__Term__Group__0__Impl : ( ( rule__Term__FactorsAssignment_0 ) ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4273:1: ( ( ( rule__Term__FactorsAssignment_0 ) ) )
            // InternalPascal.g:4274:1: ( ( rule__Term__FactorsAssignment_0 ) )
            {
            // InternalPascal.g:4274:1: ( ( rule__Term__FactorsAssignment_0 ) )
            // InternalPascal.g:4275:2: ( rule__Term__FactorsAssignment_0 )
            {
             before(grammarAccess.getTermAccess().getFactorsAssignment_0()); 
            // InternalPascal.g:4276:2: ( rule__Term__FactorsAssignment_0 )
            // InternalPascal.g:4276:3: rule__Term__FactorsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__FactorsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getFactorsAssignment_0()); 

            }


            }

        }
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
    // InternalPascal.g:4284:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4288:1: ( rule__Term__Group__1__Impl )
            // InternalPascal.g:4289:2: rule__Term__Group__1__Impl
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
    // InternalPascal.g:4295:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )? ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4299:1: ( ( ( rule__Term__Group_1__0 )? ) )
            // InternalPascal.g:4300:1: ( ( rule__Term__Group_1__0 )? )
            {
            // InternalPascal.g:4300:1: ( ( rule__Term__Group_1__0 )? )
            // InternalPascal.g:4301:2: ( rule__Term__Group_1__0 )?
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // InternalPascal.g:4302:2: ( rule__Term__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_STAR && LA36_0<=RULE_AND)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPascal.g:4302:3: rule__Term__Group_1__0
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
    // InternalPascal.g:4311:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4315:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalPascal.g:4316:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalPascal.g:4323:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__OperatorsAssignment_1_0 ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4327:1: ( ( ( rule__Term__OperatorsAssignment_1_0 ) ) )
            // InternalPascal.g:4328:1: ( ( rule__Term__OperatorsAssignment_1_0 ) )
            {
            // InternalPascal.g:4328:1: ( ( rule__Term__OperatorsAssignment_1_0 ) )
            // InternalPascal.g:4329:2: ( rule__Term__OperatorsAssignment_1_0 )
            {
             before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0()); 
            // InternalPascal.g:4330:2: ( rule__Term__OperatorsAssignment_1_0 )
            // InternalPascal.g:4330:3: rule__Term__OperatorsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__OperatorsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getOperatorsAssignment_1_0()); 

            }


            }

        }
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
    // InternalPascal.g:4338:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4342:1: ( rule__Term__Group_1__1__Impl )
            // InternalPascal.g:4343:2: rule__Term__Group_1__1__Impl
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
    // InternalPascal.g:4349:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__TermsAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4353:1: ( ( ( rule__Term__TermsAssignment_1_1 ) ) )
            // InternalPascal.g:4354:1: ( ( rule__Term__TermsAssignment_1_1 ) )
            {
            // InternalPascal.g:4354:1: ( ( rule__Term__TermsAssignment_1_1 ) )
            // InternalPascal.g:4355:2: ( rule__Term__TermsAssignment_1_1 )
            {
             before(grammarAccess.getTermAccess().getTermsAssignment_1_1()); 
            // InternalPascal.g:4356:2: ( rule__Term__TermsAssignment_1_1 )
            // InternalPascal.g:4356:3: rule__Term__TermsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Term__TermsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getTermsAssignment_1_1()); 

            }


            }

        }
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
    // InternalPascal.g:4365:1: rule__Signed_factor__Group__0 : rule__Signed_factor__Group__0__Impl rule__Signed_factor__Group__1 ;
    public final void rule__Signed_factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4369:1: ( rule__Signed_factor__Group__0__Impl rule__Signed_factor__Group__1 )
            // InternalPascal.g:4370:2: rule__Signed_factor__Group__0__Impl rule__Signed_factor__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalPascal.g:4377:1: rule__Signed_factor__Group__0__Impl : ( ( rule__Signed_factor__Alternatives_0 )? ) ;
    public final void rule__Signed_factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4381:1: ( ( ( rule__Signed_factor__Alternatives_0 )? ) )
            // InternalPascal.g:4382:1: ( ( rule__Signed_factor__Alternatives_0 )? )
            {
            // InternalPascal.g:4382:1: ( ( rule__Signed_factor__Alternatives_0 )? )
            // InternalPascal.g:4383:2: ( rule__Signed_factor__Alternatives_0 )?
            {
             before(grammarAccess.getSigned_factorAccess().getAlternatives_0()); 
            // InternalPascal.g:4384:2: ( rule__Signed_factor__Alternatives_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_PLUS && LA37_0<=RULE_MINUS)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPascal.g:4384:3: rule__Signed_factor__Alternatives_0
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
    // InternalPascal.g:4392:1: rule__Signed_factor__Group__1 : rule__Signed_factor__Group__1__Impl ;
    public final void rule__Signed_factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4396:1: ( rule__Signed_factor__Group__1__Impl )
            // InternalPascal.g:4397:2: rule__Signed_factor__Group__1__Impl
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
    // InternalPascal.g:4403:1: rule__Signed_factor__Group__1__Impl : ( ( rule__Signed_factor__FactorsAssignment_1 ) ) ;
    public final void rule__Signed_factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4407:1: ( ( ( rule__Signed_factor__FactorsAssignment_1 ) ) )
            // InternalPascal.g:4408:1: ( ( rule__Signed_factor__FactorsAssignment_1 ) )
            {
            // InternalPascal.g:4408:1: ( ( rule__Signed_factor__FactorsAssignment_1 ) )
            // InternalPascal.g:4409:2: ( rule__Signed_factor__FactorsAssignment_1 )
            {
             before(grammarAccess.getSigned_factorAccess().getFactorsAssignment_1()); 
            // InternalPascal.g:4410:2: ( rule__Signed_factor__FactorsAssignment_1 )
            // InternalPascal.g:4410:3: rule__Signed_factor__FactorsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Signed_factor__FactorsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSigned_factorAccess().getFactorsAssignment_1()); 

            }


            }

        }
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
    // InternalPascal.g:4419:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4423:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalPascal.g:4424:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalPascal.g:4431:1: rule__Factor__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4435:1: ( ( '(' ) )
            // InternalPascal.g:4436:1: ( '(' )
            {
            // InternalPascal.g:4436:1: ( '(' )
            // InternalPascal.g:4437:2: '('
            {
             before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalPascal.g:4446:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4450:1: ( rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 )
            // InternalPascal.g:4451:2: rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalPascal.g:4458:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__ExpressionAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4462:1: ( ( ( rule__Factor__ExpressionAssignment_1_1 ) ) )
            // InternalPascal.g:4463:1: ( ( rule__Factor__ExpressionAssignment_1_1 ) )
            {
            // InternalPascal.g:4463:1: ( ( rule__Factor__ExpressionAssignment_1_1 ) )
            // InternalPascal.g:4464:2: ( rule__Factor__ExpressionAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getExpressionAssignment_1_1()); 
            // InternalPascal.g:4465:2: ( rule__Factor__ExpressionAssignment_1_1 )
            // InternalPascal.g:4465:3: rule__Factor__ExpressionAssignment_1_1
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
    // InternalPascal.g:4473:1: rule__Factor__Group_1__2 : rule__Factor__Group_1__2__Impl ;
    public final void rule__Factor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4477:1: ( rule__Factor__Group_1__2__Impl )
            // InternalPascal.g:4478:2: rule__Factor__Group_1__2__Impl
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
    // InternalPascal.g:4484:1: rule__Factor__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4488:1: ( ( ')' ) )
            // InternalPascal.g:4489:1: ( ')' )
            {
            // InternalPascal.g:4489:1: ( ')' )
            // InternalPascal.g:4490:2: ')'
            {
             before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_1_2()); 
            match(input,45,FOLLOW_2); 
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


    // $ANTLR start "rule__Factor__Group_5__0"
    // InternalPascal.g:4500:1: rule__Factor__Group_5__0 : rule__Factor__Group_5__0__Impl rule__Factor__Group_5__1 ;
    public final void rule__Factor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4504:1: ( rule__Factor__Group_5__0__Impl rule__Factor__Group_5__1 )
            // InternalPascal.g:4505:2: rule__Factor__Group_5__0__Impl rule__Factor__Group_5__1
            {
            pushFollow(FOLLOW_23);
            rule__Factor__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_5__1();

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
    // $ANTLR end "rule__Factor__Group_5__0"


    // $ANTLR start "rule__Factor__Group_5__0__Impl"
    // InternalPascal.g:4512:1: rule__Factor__Group_5__0__Impl : ( RULE_NOT ) ;
    public final void rule__Factor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4516:1: ( ( RULE_NOT ) )
            // InternalPascal.g:4517:1: ( RULE_NOT )
            {
            // InternalPascal.g:4517:1: ( RULE_NOT )
            // InternalPascal.g:4518:2: RULE_NOT
            {
             before(grammarAccess.getFactorAccess().getNOTTerminalRuleCall_5_0()); 
            match(input,RULE_NOT,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getNOTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_5__0__Impl"


    // $ANTLR start "rule__Factor__Group_5__1"
    // InternalPascal.g:4527:1: rule__Factor__Group_5__1 : rule__Factor__Group_5__1__Impl ;
    public final void rule__Factor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4531:1: ( rule__Factor__Group_5__1__Impl )
            // InternalPascal.g:4532:2: rule__Factor__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_5__1__Impl();

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
    // $ANTLR end "rule__Factor__Group_5__1"


    // $ANTLR start "rule__Factor__Group_5__1__Impl"
    // InternalPascal.g:4538:1: rule__Factor__Group_5__1__Impl : ( ( rule__Factor__FactorAssignment_5_1 ) ) ;
    public final void rule__Factor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4542:1: ( ( ( rule__Factor__FactorAssignment_5_1 ) ) )
            // InternalPascal.g:4543:1: ( ( rule__Factor__FactorAssignment_5_1 ) )
            {
            // InternalPascal.g:4543:1: ( ( rule__Factor__FactorAssignment_5_1 ) )
            // InternalPascal.g:4544:2: ( rule__Factor__FactorAssignment_5_1 )
            {
             before(grammarAccess.getFactorAccess().getFactorAssignment_5_1()); 
            // InternalPascal.g:4545:2: ( rule__Factor__FactorAssignment_5_1 )
            // InternalPascal.g:4545:3: rule__Factor__FactorAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__FactorAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getFactorAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_5__1__Impl"


    // $ANTLR start "rule__Set__Group_0__0"
    // InternalPascal.g:4554:1: rule__Set__Group_0__0 : rule__Set__Group_0__0__Impl rule__Set__Group_0__1 ;
    public final void rule__Set__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4558:1: ( rule__Set__Group_0__0__Impl rule__Set__Group_0__1 )
            // InternalPascal.g:4559:2: rule__Set__Group_0__0__Impl rule__Set__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__Set__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group_0__1();

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
    // $ANTLR end "rule__Set__Group_0__0"


    // $ANTLR start "rule__Set__Group_0__0__Impl"
    // InternalPascal.g:4566:1: rule__Set__Group_0__0__Impl : ( '[' ) ;
    public final void rule__Set__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4570:1: ( ( '[' ) )
            // InternalPascal.g:4571:1: ( '[' )
            {
            // InternalPascal.g:4571:1: ( '[' )
            // InternalPascal.g:4572:2: '['
            {
             before(grammarAccess.getSetAccess().getLeftSquareBracketKeyword_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getLeftSquareBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_0__0__Impl"


    // $ANTLR start "rule__Set__Group_0__1"
    // InternalPascal.g:4581:1: rule__Set__Group_0__1 : rule__Set__Group_0__1__Impl rule__Set__Group_0__2 ;
    public final void rule__Set__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4585:1: ( rule__Set__Group_0__1__Impl rule__Set__Group_0__2 )
            // InternalPascal.g:4586:2: rule__Set__Group_0__1__Impl rule__Set__Group_0__2
            {
            pushFollow(FOLLOW_31);
            rule__Set__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group_0__2();

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
    // $ANTLR end "rule__Set__Group_0__1"


    // $ANTLR start "rule__Set__Group_0__1__Impl"
    // InternalPascal.g:4593:1: rule__Set__Group_0__1__Impl : ( ( rule__Set__ElementsAssignment_0_1 ) ) ;
    public final void rule__Set__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4597:1: ( ( ( rule__Set__ElementsAssignment_0_1 ) ) )
            // InternalPascal.g:4598:1: ( ( rule__Set__ElementsAssignment_0_1 ) )
            {
            // InternalPascal.g:4598:1: ( ( rule__Set__ElementsAssignment_0_1 ) )
            // InternalPascal.g:4599:2: ( rule__Set__ElementsAssignment_0_1 )
            {
             before(grammarAccess.getSetAccess().getElementsAssignment_0_1()); 
            // InternalPascal.g:4600:2: ( rule__Set__ElementsAssignment_0_1 )
            // InternalPascal.g:4600:3: rule__Set__ElementsAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Set__ElementsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getElementsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_0__1__Impl"


    // $ANTLR start "rule__Set__Group_0__2"
    // InternalPascal.g:4608:1: rule__Set__Group_0__2 : rule__Set__Group_0__2__Impl ;
    public final void rule__Set__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4612:1: ( rule__Set__Group_0__2__Impl )
            // InternalPascal.g:4613:2: rule__Set__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group_0__2__Impl();

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
    // $ANTLR end "rule__Set__Group_0__2"


    // $ANTLR start "rule__Set__Group_0__2__Impl"
    // InternalPascal.g:4619:1: rule__Set__Group_0__2__Impl : ( ']' ) ;
    public final void rule__Set__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4623:1: ( ( ']' ) )
            // InternalPascal.g:4624:1: ( ']' )
            {
            // InternalPascal.g:4624:1: ( ']' )
            // InternalPascal.g:4625:2: ']'
            {
             before(grammarAccess.getSetAccess().getRightSquareBracketKeyword_0_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getRightSquareBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_0__2__Impl"


    // $ANTLR start "rule__Set__Group_1__0"
    // InternalPascal.g:4635:1: rule__Set__Group_1__0 : rule__Set__Group_1__0__Impl rule__Set__Group_1__1 ;
    public final void rule__Set__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4639:1: ( rule__Set__Group_1__0__Impl rule__Set__Group_1__1 )
            // InternalPascal.g:4640:2: rule__Set__Group_1__0__Impl rule__Set__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Set__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group_1__1();

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
    // $ANTLR end "rule__Set__Group_1__0"


    // $ANTLR start "rule__Set__Group_1__0__Impl"
    // InternalPascal.g:4647:1: rule__Set__Group_1__0__Impl : ( '(.' ) ;
    public final void rule__Set__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4651:1: ( ( '(.' ) )
            // InternalPascal.g:4652:1: ( '(.' )
            {
            // InternalPascal.g:4652:1: ( '(.' )
            // InternalPascal.g:4653:2: '(.'
            {
             before(grammarAccess.getSetAccess().getLeftParenthesisFullStopKeyword_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getLeftParenthesisFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_1__0__Impl"


    // $ANTLR start "rule__Set__Group_1__1"
    // InternalPascal.g:4662:1: rule__Set__Group_1__1 : rule__Set__Group_1__1__Impl rule__Set__Group_1__2 ;
    public final void rule__Set__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4666:1: ( rule__Set__Group_1__1__Impl rule__Set__Group_1__2 )
            // InternalPascal.g:4667:2: rule__Set__Group_1__1__Impl rule__Set__Group_1__2
            {
            pushFollow(FOLLOW_32);
            rule__Set__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group_1__2();

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
    // $ANTLR end "rule__Set__Group_1__1"


    // $ANTLR start "rule__Set__Group_1__1__Impl"
    // InternalPascal.g:4674:1: rule__Set__Group_1__1__Impl : ( ( rule__Set__ElementsAssignment_1_1 ) ) ;
    public final void rule__Set__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4678:1: ( ( ( rule__Set__ElementsAssignment_1_1 ) ) )
            // InternalPascal.g:4679:1: ( ( rule__Set__ElementsAssignment_1_1 ) )
            {
            // InternalPascal.g:4679:1: ( ( rule__Set__ElementsAssignment_1_1 ) )
            // InternalPascal.g:4680:2: ( rule__Set__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getSetAccess().getElementsAssignment_1_1()); 
            // InternalPascal.g:4681:2: ( rule__Set__ElementsAssignment_1_1 )
            // InternalPascal.g:4681:3: rule__Set__ElementsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Set__ElementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getElementsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_1__1__Impl"


    // $ANTLR start "rule__Set__Group_1__2"
    // InternalPascal.g:4689:1: rule__Set__Group_1__2 : rule__Set__Group_1__2__Impl ;
    public final void rule__Set__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4693:1: ( rule__Set__Group_1__2__Impl )
            // InternalPascal.g:4694:2: rule__Set__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group_1__2__Impl();

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
    // $ANTLR end "rule__Set__Group_1__2"


    // $ANTLR start "rule__Set__Group_1__2__Impl"
    // InternalPascal.g:4700:1: rule__Set__Group_1__2__Impl : ( '.)' ) ;
    public final void rule__Set__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4704:1: ( ( '.)' ) )
            // InternalPascal.g:4705:1: ( '.)' )
            {
            // InternalPascal.g:4705:1: ( '.)' )
            // InternalPascal.g:4706:2: '.)'
            {
             before(grammarAccess.getSetAccess().getFullStopRightParenthesisKeyword_1_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getFullStopRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_1__2__Impl"


    // $ANTLR start "rule__ElementList__Group__0"
    // InternalPascal.g:4716:1: rule__ElementList__Group__0 : rule__ElementList__Group__0__Impl rule__ElementList__Group__1 ;
    public final void rule__ElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4720:1: ( rule__ElementList__Group__0__Impl rule__ElementList__Group__1 )
            // InternalPascal.g:4721:2: rule__ElementList__Group__0__Impl rule__ElementList__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ElementList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementList__Group__1();

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
    // $ANTLR end "rule__ElementList__Group__0"


    // $ANTLR start "rule__ElementList__Group__0__Impl"
    // InternalPascal.g:4728:1: rule__ElementList__Group__0__Impl : ( ( rule__ElementList__ElementsAssignment_0 ) ) ;
    public final void rule__ElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4732:1: ( ( ( rule__ElementList__ElementsAssignment_0 ) ) )
            // InternalPascal.g:4733:1: ( ( rule__ElementList__ElementsAssignment_0 ) )
            {
            // InternalPascal.g:4733:1: ( ( rule__ElementList__ElementsAssignment_0 ) )
            // InternalPascal.g:4734:2: ( rule__ElementList__ElementsAssignment_0 )
            {
             before(grammarAccess.getElementListAccess().getElementsAssignment_0()); 
            // InternalPascal.g:4735:2: ( rule__ElementList__ElementsAssignment_0 )
            // InternalPascal.g:4735:3: rule__ElementList__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ElementList__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getElementListAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementList__Group__0__Impl"


    // $ANTLR start "rule__ElementList__Group__1"
    // InternalPascal.g:4743:1: rule__ElementList__Group__1 : rule__ElementList__Group__1__Impl ;
    public final void rule__ElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4747:1: ( rule__ElementList__Group__1__Impl )
            // InternalPascal.g:4748:2: rule__ElementList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementList__Group__1__Impl();

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
    // $ANTLR end "rule__ElementList__Group__1"


    // $ANTLR start "rule__ElementList__Group__1__Impl"
    // InternalPascal.g:4754:1: rule__ElementList__Group__1__Impl : ( ( rule__ElementList__Group_1__0 )* ) ;
    public final void rule__ElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4758:1: ( ( ( rule__ElementList__Group_1__0 )* ) )
            // InternalPascal.g:4759:1: ( ( rule__ElementList__Group_1__0 )* )
            {
            // InternalPascal.g:4759:1: ( ( rule__ElementList__Group_1__0 )* )
            // InternalPascal.g:4760:2: ( rule__ElementList__Group_1__0 )*
            {
             before(grammarAccess.getElementListAccess().getGroup_1()); 
            // InternalPascal.g:4761:2: ( rule__ElementList__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==46) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalPascal.g:4761:3: rule__ElementList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ElementList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getElementListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementList__Group__1__Impl"


    // $ANTLR start "rule__ElementList__Group_1__0"
    // InternalPascal.g:4770:1: rule__ElementList__Group_1__0 : rule__ElementList__Group_1__0__Impl rule__ElementList__Group_1__1 ;
    public final void rule__ElementList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4774:1: ( rule__ElementList__Group_1__0__Impl rule__ElementList__Group_1__1 )
            // InternalPascal.g:4775:2: rule__ElementList__Group_1__0__Impl rule__ElementList__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__ElementList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementList__Group_1__1();

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
    // $ANTLR end "rule__ElementList__Group_1__0"


    // $ANTLR start "rule__ElementList__Group_1__0__Impl"
    // InternalPascal.g:4782:1: rule__ElementList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ElementList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4786:1: ( ( ',' ) )
            // InternalPascal.g:4787:1: ( ',' )
            {
            // InternalPascal.g:4787:1: ( ',' )
            // InternalPascal.g:4788:2: ','
            {
             before(grammarAccess.getElementListAccess().getCommaKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getElementListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementList__Group_1__0__Impl"


    // $ANTLR start "rule__ElementList__Group_1__1"
    // InternalPascal.g:4797:1: rule__ElementList__Group_1__1 : rule__ElementList__Group_1__1__Impl ;
    public final void rule__ElementList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4801:1: ( rule__ElementList__Group_1__1__Impl )
            // InternalPascal.g:4802:2: rule__ElementList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementList__Group_1__1__Impl();

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
    // $ANTLR end "rule__ElementList__Group_1__1"


    // $ANTLR start "rule__ElementList__Group_1__1__Impl"
    // InternalPascal.g:4808:1: rule__ElementList__Group_1__1__Impl : ( ( rule__ElementList__ElementsAssignment_1_1 ) ) ;
    public final void rule__ElementList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4812:1: ( ( ( rule__ElementList__ElementsAssignment_1_1 ) ) )
            // InternalPascal.g:4813:1: ( ( rule__ElementList__ElementsAssignment_1_1 ) )
            {
            // InternalPascal.g:4813:1: ( ( rule__ElementList__ElementsAssignment_1_1 ) )
            // InternalPascal.g:4814:2: ( rule__ElementList__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getElementListAccess().getElementsAssignment_1_1()); 
            // InternalPascal.g:4815:2: ( rule__ElementList__ElementsAssignment_1_1 )
            // InternalPascal.g:4815:3: rule__ElementList__ElementsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementList__ElementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getElementListAccess().getElementsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementList__Group_1__1__Impl"


    // $ANTLR start "rule__Element__Group__0"
    // InternalPascal.g:4824:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4828:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalPascal.g:4829:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Element__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__1();

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
    // $ANTLR end "rule__Element__Group__0"


    // $ANTLR start "rule__Element__Group__0__Impl"
    // InternalPascal.g:4836:1: rule__Element__Group__0__Impl : ( ( rule__Element__ExpressionsAssignment_0 ) ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4840:1: ( ( ( rule__Element__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:4841:1: ( ( rule__Element__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:4841:1: ( ( rule__Element__ExpressionsAssignment_0 ) )
            // InternalPascal.g:4842:2: ( rule__Element__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getElementAccess().getExpressionsAssignment_0()); 
            // InternalPascal.g:4843:2: ( rule__Element__ExpressionsAssignment_0 )
            // InternalPascal.g:4843:3: rule__Element__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Element__ExpressionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getExpressionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__0__Impl"


    // $ANTLR start "rule__Element__Group__1"
    // InternalPascal.g:4851:1: rule__Element__Group__1 : rule__Element__Group__1__Impl ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4855:1: ( rule__Element__Group__1__Impl )
            // InternalPascal.g:4856:2: rule__Element__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__1__Impl();

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
    // $ANTLR end "rule__Element__Group__1"


    // $ANTLR start "rule__Element__Group__1__Impl"
    // InternalPascal.g:4862:1: rule__Element__Group__1__Impl : ( ( rule__Element__Group_1__0 )? ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4866:1: ( ( ( rule__Element__Group_1__0 )? ) )
            // InternalPascal.g:4867:1: ( ( rule__Element__Group_1__0 )? )
            {
            // InternalPascal.g:4867:1: ( ( rule__Element__Group_1__0 )? )
            // InternalPascal.g:4868:2: ( rule__Element__Group_1__0 )?
            {
             before(grammarAccess.getElementAccess().getGroup_1()); 
            // InternalPascal.g:4869:2: ( rule__Element__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_DOTDOT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPascal.g:4869:3: rule__Element__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__1__Impl"


    // $ANTLR start "rule__Element__Group_1__0"
    // InternalPascal.g:4878:1: rule__Element__Group_1__0 : rule__Element__Group_1__0__Impl rule__Element__Group_1__1 ;
    public final void rule__Element__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4882:1: ( rule__Element__Group_1__0__Impl rule__Element__Group_1__1 )
            // InternalPascal.g:4883:2: rule__Element__Group_1__0__Impl rule__Element__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Element__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_1__1();

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
    // $ANTLR end "rule__Element__Group_1__0"


    // $ANTLR start "rule__Element__Group_1__0__Impl"
    // InternalPascal.g:4890:1: rule__Element__Group_1__0__Impl : ( ( rule__Element__DotdotAssignment_1_0 ) ) ;
    public final void rule__Element__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4894:1: ( ( ( rule__Element__DotdotAssignment_1_0 ) ) )
            // InternalPascal.g:4895:1: ( ( rule__Element__DotdotAssignment_1_0 ) )
            {
            // InternalPascal.g:4895:1: ( ( rule__Element__DotdotAssignment_1_0 ) )
            // InternalPascal.g:4896:2: ( rule__Element__DotdotAssignment_1_0 )
            {
             before(grammarAccess.getElementAccess().getDotdotAssignment_1_0()); 
            // InternalPascal.g:4897:2: ( rule__Element__DotdotAssignment_1_0 )
            // InternalPascal.g:4897:3: rule__Element__DotdotAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Element__DotdotAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getDotdotAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_1__0__Impl"


    // $ANTLR start "rule__Element__Group_1__1"
    // InternalPascal.g:4905:1: rule__Element__Group_1__1 : rule__Element__Group_1__1__Impl ;
    public final void rule__Element__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4909:1: ( rule__Element__Group_1__1__Impl )
            // InternalPascal.g:4910:2: rule__Element__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group_1__1__Impl();

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
    // $ANTLR end "rule__Element__Group_1__1"


    // $ANTLR start "rule__Element__Group_1__1__Impl"
    // InternalPascal.g:4916:1: rule__Element__Group_1__1__Impl : ( ( rule__Element__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Element__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4920:1: ( ( ( rule__Element__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:4921:1: ( ( rule__Element__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:4921:1: ( ( rule__Element__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:4922:2: ( rule__Element__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getElementAccess().getExpressionsAssignment_1_1()); 
            // InternalPascal.g:4923:2: ( rule__Element__ExpressionsAssignment_1_1 )
            // InternalPascal.g:4923:3: rule__Element__ExpressionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__ExpressionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getExpressionsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_1__1__Impl"


    // $ANTLR start "rule__Scalar_type__Group__0"
    // InternalPascal.g:4932:1: rule__Scalar_type__Group__0 : rule__Scalar_type__Group__0__Impl rule__Scalar_type__Group__1 ;
    public final void rule__Scalar_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4936:1: ( rule__Scalar_type__Group__0__Impl rule__Scalar_type__Group__1 )
            // InternalPascal.g:4937:2: rule__Scalar_type__Group__0__Impl rule__Scalar_type__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Scalar_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scalar_type__Group__1();

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
    // $ANTLR end "rule__Scalar_type__Group__0"


    // $ANTLR start "rule__Scalar_type__Group__0__Impl"
    // InternalPascal.g:4944:1: rule__Scalar_type__Group__0__Impl : ( '(' ) ;
    public final void rule__Scalar_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4948:1: ( ( '(' ) )
            // InternalPascal.g:4949:1: ( '(' )
            {
            // InternalPascal.g:4949:1: ( '(' )
            // InternalPascal.g:4950:2: '('
            {
             before(grammarAccess.getScalar_typeAccess().getLeftParenthesisKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getScalar_typeAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scalar_type__Group__0__Impl"


    // $ANTLR start "rule__Scalar_type__Group__1"
    // InternalPascal.g:4959:1: rule__Scalar_type__Group__1 : rule__Scalar_type__Group__1__Impl rule__Scalar_type__Group__2 ;
    public final void rule__Scalar_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4963:1: ( rule__Scalar_type__Group__1__Impl rule__Scalar_type__Group__2 )
            // InternalPascal.g:4964:2: rule__Scalar_type__Group__1__Impl rule__Scalar_type__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Scalar_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scalar_type__Group__2();

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
    // $ANTLR end "rule__Scalar_type__Group__1"


    // $ANTLR start "rule__Scalar_type__Group__1__Impl"
    // InternalPascal.g:4971:1: rule__Scalar_type__Group__1__Impl : ( ruleidentifier_list ) ;
    public final void rule__Scalar_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4975:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:4976:1: ( ruleidentifier_list )
            {
            // InternalPascal.g:4976:1: ( ruleidentifier_list )
            // InternalPascal.g:4977:2: ruleidentifier_list
            {
             before(grammarAccess.getScalar_typeAccess().getIdentifier_listParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getScalar_typeAccess().getIdentifier_listParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scalar_type__Group__1__Impl"


    // $ANTLR start "rule__Scalar_type__Group__2"
    // InternalPascal.g:4986:1: rule__Scalar_type__Group__2 : rule__Scalar_type__Group__2__Impl ;
    public final void rule__Scalar_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4990:1: ( rule__Scalar_type__Group__2__Impl )
            // InternalPascal.g:4991:2: rule__Scalar_type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scalar_type__Group__2__Impl();

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
    // $ANTLR end "rule__Scalar_type__Group__2"


    // $ANTLR start "rule__Scalar_type__Group__2__Impl"
    // InternalPascal.g:4997:1: rule__Scalar_type__Group__2__Impl : ( ')' ) ;
    public final void rule__Scalar_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5001:1: ( ( ')' ) )
            // InternalPascal.g:5002:1: ( ')' )
            {
            // InternalPascal.g:5002:1: ( ')' )
            // InternalPascal.g:5003:2: ')'
            {
             before(grammarAccess.getScalar_typeAccess().getRightParenthesisKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getScalar_typeAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scalar_type__Group__2__Impl"


    // $ANTLR start "rule__Subrange_type__Group__0"
    // InternalPascal.g:5013:1: rule__Subrange_type__Group__0 : rule__Subrange_type__Group__0__Impl rule__Subrange_type__Group__1 ;
    public final void rule__Subrange_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5017:1: ( rule__Subrange_type__Group__0__Impl rule__Subrange_type__Group__1 )
            // InternalPascal.g:5018:2: rule__Subrange_type__Group__0__Impl rule__Subrange_type__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalPascal.g:5025:1: rule__Subrange_type__Group__0__Impl : ( ( rule__Subrange_type__ConstantsAssignment_0 ) ) ;
    public final void rule__Subrange_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5029:1: ( ( ( rule__Subrange_type__ConstantsAssignment_0 ) ) )
            // InternalPascal.g:5030:1: ( ( rule__Subrange_type__ConstantsAssignment_0 ) )
            {
            // InternalPascal.g:5030:1: ( ( rule__Subrange_type__ConstantsAssignment_0 ) )
            // InternalPascal.g:5031:2: ( rule__Subrange_type__ConstantsAssignment_0 )
            {
             before(grammarAccess.getSubrange_typeAccess().getConstantsAssignment_0()); 
            // InternalPascal.g:5032:2: ( rule__Subrange_type__ConstantsAssignment_0 )
            // InternalPascal.g:5032:3: rule__Subrange_type__ConstantsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__ConstantsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSubrange_typeAccess().getConstantsAssignment_0()); 

            }


            }

        }
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
    // InternalPascal.g:5040:1: rule__Subrange_type__Group__1 : rule__Subrange_type__Group__1__Impl rule__Subrange_type__Group__2 ;
    public final void rule__Subrange_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5044:1: ( rule__Subrange_type__Group__1__Impl rule__Subrange_type__Group__2 )
            // InternalPascal.g:5045:2: rule__Subrange_type__Group__1__Impl rule__Subrange_type__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalPascal.g:5052:1: rule__Subrange_type__Group__1__Impl : ( RULE_DOTDOT ) ;
    public final void rule__Subrange_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5056:1: ( ( RULE_DOTDOT ) )
            // InternalPascal.g:5057:1: ( RULE_DOTDOT )
            {
            // InternalPascal.g:5057:1: ( RULE_DOTDOT )
            // InternalPascal.g:5058:2: RULE_DOTDOT
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
    // InternalPascal.g:5067:1: rule__Subrange_type__Group__2 : rule__Subrange_type__Group__2__Impl ;
    public final void rule__Subrange_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5071:1: ( rule__Subrange_type__Group__2__Impl )
            // InternalPascal.g:5072:2: rule__Subrange_type__Group__2__Impl
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
    // InternalPascal.g:5078:1: rule__Subrange_type__Group__2__Impl : ( ( rule__Subrange_type__ConstantsAssignment_2 ) ) ;
    public final void rule__Subrange_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5082:1: ( ( ( rule__Subrange_type__ConstantsAssignment_2 ) ) )
            // InternalPascal.g:5083:1: ( ( rule__Subrange_type__ConstantsAssignment_2 ) )
            {
            // InternalPascal.g:5083:1: ( ( rule__Subrange_type__ConstantsAssignment_2 ) )
            // InternalPascal.g:5084:2: ( rule__Subrange_type__ConstantsAssignment_2 )
            {
             before(grammarAccess.getSubrange_typeAccess().getConstantsAssignment_2()); 
            // InternalPascal.g:5085:2: ( rule__Subrange_type__ConstantsAssignment_2 )
            // InternalPascal.g:5085:3: rule__Subrange_type__ConstantsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__ConstantsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubrange_typeAccess().getConstantsAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__String_type__Group__0"
    // InternalPascal.g:5094:1: rule__String_type__Group__0 : rule__String_type__Group__0__Impl rule__String_type__Group__1 ;
    public final void rule__String_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5098:1: ( rule__String_type__Group__0__Impl rule__String_type__Group__1 )
            // InternalPascal.g:5099:2: rule__String_type__Group__0__Impl rule__String_type__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__String_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String_type__Group__1();

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
    // $ANTLR end "rule__String_type__Group__0"


    // $ANTLR start "rule__String_type__Group__0__Impl"
    // InternalPascal.g:5106:1: rule__String_type__Group__0__Impl : ( 'string' ) ;
    public final void rule__String_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5110:1: ( ( 'string' ) )
            // InternalPascal.g:5111:1: ( 'string' )
            {
            // InternalPascal.g:5111:1: ( 'string' )
            // InternalPascal.g:5112:2: 'string'
            {
             before(grammarAccess.getString_typeAccess().getStringKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getString_typeAccess().getStringKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String_type__Group__0__Impl"


    // $ANTLR start "rule__String_type__Group__1"
    // InternalPascal.g:5121:1: rule__String_type__Group__1 : rule__String_type__Group__1__Impl rule__String_type__Group__2 ;
    public final void rule__String_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5125:1: ( rule__String_type__Group__1__Impl rule__String_type__Group__2 )
            // InternalPascal.g:5126:2: rule__String_type__Group__1__Impl rule__String_type__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__String_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String_type__Group__2();

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
    // $ANTLR end "rule__String_type__Group__1"


    // $ANTLR start "rule__String_type__Group__1__Impl"
    // InternalPascal.g:5133:1: rule__String_type__Group__1__Impl : ( '[' ) ;
    public final void rule__String_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5137:1: ( ( '[' ) )
            // InternalPascal.g:5138:1: ( '[' )
            {
            // InternalPascal.g:5138:1: ( '[' )
            // InternalPascal.g:5139:2: '['
            {
             before(grammarAccess.getString_typeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getString_typeAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String_type__Group__1__Impl"


    // $ANTLR start "rule__String_type__Group__2"
    // InternalPascal.g:5148:1: rule__String_type__Group__2 : rule__String_type__Group__2__Impl rule__String_type__Group__3 ;
    public final void rule__String_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5152:1: ( rule__String_type__Group__2__Impl rule__String_type__Group__3 )
            // InternalPascal.g:5153:2: rule__String_type__Group__2__Impl rule__String_type__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__String_type__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String_type__Group__3();

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
    // $ANTLR end "rule__String_type__Group__2"


    // $ANTLR start "rule__String_type__Group__2__Impl"
    // InternalPascal.g:5160:1: rule__String_type__Group__2__Impl : ( ( rule__String_type__Alternatives_2 ) ) ;
    public final void rule__String_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5164:1: ( ( ( rule__String_type__Alternatives_2 ) ) )
            // InternalPascal.g:5165:1: ( ( rule__String_type__Alternatives_2 ) )
            {
            // InternalPascal.g:5165:1: ( ( rule__String_type__Alternatives_2 ) )
            // InternalPascal.g:5166:2: ( rule__String_type__Alternatives_2 )
            {
             before(grammarAccess.getString_typeAccess().getAlternatives_2()); 
            // InternalPascal.g:5167:2: ( rule__String_type__Alternatives_2 )
            // InternalPascal.g:5167:3: rule__String_type__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__String_type__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getString_typeAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String_type__Group__2__Impl"


    // $ANTLR start "rule__String_type__Group__3"
    // InternalPascal.g:5175:1: rule__String_type__Group__3 : rule__String_type__Group__3__Impl ;
    public final void rule__String_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5179:1: ( rule__String_type__Group__3__Impl )
            // InternalPascal.g:5180:2: rule__String_type__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__String_type__Group__3__Impl();

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
    // $ANTLR end "rule__String_type__Group__3"


    // $ANTLR start "rule__String_type__Group__3__Impl"
    // InternalPascal.g:5186:1: rule__String_type__Group__3__Impl : ( ']' ) ;
    public final void rule__String_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5190:1: ( ( ']' ) )
            // InternalPascal.g:5191:1: ( ']' )
            {
            // InternalPascal.g:5191:1: ( ']' )
            // InternalPascal.g:5192:2: ']'
            {
             before(grammarAccess.getString_typeAccess().getRightSquareBracketKeyword_3()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getString_typeAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String_type__Group__3__Impl"


    // $ANTLR start "rule__Constant_chr__Group__0"
    // InternalPascal.g:5202:1: rule__Constant_chr__Group__0 : rule__Constant_chr__Group__0__Impl rule__Constant_chr__Group__1 ;
    public final void rule__Constant_chr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5206:1: ( rule__Constant_chr__Group__0__Impl rule__Constant_chr__Group__1 )
            // InternalPascal.g:5207:2: rule__Constant_chr__Group__0__Impl rule__Constant_chr__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Constant_chr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant_chr__Group__1();

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
    // $ANTLR end "rule__Constant_chr__Group__0"


    // $ANTLR start "rule__Constant_chr__Group__0__Impl"
    // InternalPascal.g:5214:1: rule__Constant_chr__Group__0__Impl : ( 'chr' ) ;
    public final void rule__Constant_chr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5218:1: ( ( 'chr' ) )
            // InternalPascal.g:5219:1: ( 'chr' )
            {
            // InternalPascal.g:5219:1: ( 'chr' )
            // InternalPascal.g:5220:2: 'chr'
            {
             before(grammarAccess.getConstant_chrAccess().getChrKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getConstant_chrAccess().getChrKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_chr__Group__0__Impl"


    // $ANTLR start "rule__Constant_chr__Group__1"
    // InternalPascal.g:5229:1: rule__Constant_chr__Group__1 : rule__Constant_chr__Group__1__Impl rule__Constant_chr__Group__2 ;
    public final void rule__Constant_chr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5233:1: ( rule__Constant_chr__Group__1__Impl rule__Constant_chr__Group__2 )
            // InternalPascal.g:5234:2: rule__Constant_chr__Group__1__Impl rule__Constant_chr__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Constant_chr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant_chr__Group__2();

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
    // $ANTLR end "rule__Constant_chr__Group__1"


    // $ANTLR start "rule__Constant_chr__Group__1__Impl"
    // InternalPascal.g:5241:1: rule__Constant_chr__Group__1__Impl : ( '(' ) ;
    public final void rule__Constant_chr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5245:1: ( ( '(' ) )
            // InternalPascal.g:5246:1: ( '(' )
            {
            // InternalPascal.g:5246:1: ( '(' )
            // InternalPascal.g:5247:2: '('
            {
             before(grammarAccess.getConstant_chrAccess().getLeftParenthesisKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getConstant_chrAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_chr__Group__1__Impl"


    // $ANTLR start "rule__Constant_chr__Group__2"
    // InternalPascal.g:5256:1: rule__Constant_chr__Group__2 : rule__Constant_chr__Group__2__Impl rule__Constant_chr__Group__3 ;
    public final void rule__Constant_chr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5260:1: ( rule__Constant_chr__Group__2__Impl rule__Constant_chr__Group__3 )
            // InternalPascal.g:5261:2: rule__Constant_chr__Group__2__Impl rule__Constant_chr__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Constant_chr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant_chr__Group__3();

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
    // $ANTLR end "rule__Constant_chr__Group__2"


    // $ANTLR start "rule__Constant_chr__Group__2__Impl"
    // InternalPascal.g:5268:1: rule__Constant_chr__Group__2__Impl : ( ( rule__Constant_chr__NumbersAssignment_2 ) ) ;
    public final void rule__Constant_chr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5272:1: ( ( ( rule__Constant_chr__NumbersAssignment_2 ) ) )
            // InternalPascal.g:5273:1: ( ( rule__Constant_chr__NumbersAssignment_2 ) )
            {
            // InternalPascal.g:5273:1: ( ( rule__Constant_chr__NumbersAssignment_2 ) )
            // InternalPascal.g:5274:2: ( rule__Constant_chr__NumbersAssignment_2 )
            {
             before(grammarAccess.getConstant_chrAccess().getNumbersAssignment_2()); 
            // InternalPascal.g:5275:2: ( rule__Constant_chr__NumbersAssignment_2 )
            // InternalPascal.g:5275:3: rule__Constant_chr__NumbersAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Constant_chr__NumbersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstant_chrAccess().getNumbersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_chr__Group__2__Impl"


    // $ANTLR start "rule__Constant_chr__Group__3"
    // InternalPascal.g:5283:1: rule__Constant_chr__Group__3 : rule__Constant_chr__Group__3__Impl ;
    public final void rule__Constant_chr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5287:1: ( rule__Constant_chr__Group__3__Impl )
            // InternalPascal.g:5288:2: rule__Constant_chr__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant_chr__Group__3__Impl();

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
    // $ANTLR end "rule__Constant_chr__Group__3"


    // $ANTLR start "rule__Constant_chr__Group__3__Impl"
    // InternalPascal.g:5294:1: rule__Constant_chr__Group__3__Impl : ( ')' ) ;
    public final void rule__Constant_chr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5298:1: ( ( ')' ) )
            // InternalPascal.g:5299:1: ( ')' )
            {
            // InternalPascal.g:5299:1: ( ')' )
            // InternalPascal.g:5300:2: ')'
            {
             before(grammarAccess.getConstant_chrAccess().getRightParenthesisKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getConstant_chrAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_chr__Group__3__Impl"


    // $ANTLR start "rule__Procedure_statement__Group__0"
    // InternalPascal.g:5310:1: rule__Procedure_statement__Group__0 : rule__Procedure_statement__Group__0__Impl rule__Procedure_statement__Group__1 ;
    public final void rule__Procedure_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5314:1: ( rule__Procedure_statement__Group__0__Impl rule__Procedure_statement__Group__1 )
            // InternalPascal.g:5315:2: rule__Procedure_statement__Group__0__Impl rule__Procedure_statement__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalPascal.g:5322:1: rule__Procedure_statement__Group__0__Impl : ( ( rule__Procedure_statement__NamesAssignment_0 ) ) ;
    public final void rule__Procedure_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5326:1: ( ( ( rule__Procedure_statement__NamesAssignment_0 ) ) )
            // InternalPascal.g:5327:1: ( ( rule__Procedure_statement__NamesAssignment_0 ) )
            {
            // InternalPascal.g:5327:1: ( ( rule__Procedure_statement__NamesAssignment_0 ) )
            // InternalPascal.g:5328:2: ( rule__Procedure_statement__NamesAssignment_0 )
            {
             before(grammarAccess.getProcedure_statementAccess().getNamesAssignment_0()); 
            // InternalPascal.g:5329:2: ( rule__Procedure_statement__NamesAssignment_0 )
            // InternalPascal.g:5329:3: rule__Procedure_statement__NamesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_statement__NamesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_statementAccess().getNamesAssignment_0()); 

            }


            }

        }
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
    // InternalPascal.g:5337:1: rule__Procedure_statement__Group__1 : rule__Procedure_statement__Group__1__Impl ;
    public final void rule__Procedure_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5341:1: ( rule__Procedure_statement__Group__1__Impl )
            // InternalPascal.g:5342:2: rule__Procedure_statement__Group__1__Impl
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
    // InternalPascal.g:5348:1: rule__Procedure_statement__Group__1__Impl : ( ( rule__Procedure_statement__Group_1__0 )? ) ;
    public final void rule__Procedure_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5352:1: ( ( ( rule__Procedure_statement__Group_1__0 )? ) )
            // InternalPascal.g:5353:1: ( ( rule__Procedure_statement__Group_1__0 )? )
            {
            // InternalPascal.g:5353:1: ( ( rule__Procedure_statement__Group_1__0 )? )
            // InternalPascal.g:5354:2: ( rule__Procedure_statement__Group_1__0 )?
            {
             before(grammarAccess.getProcedure_statementAccess().getGroup_1()); 
            // InternalPascal.g:5355:2: ( rule__Procedure_statement__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPascal.g:5355:3: rule__Procedure_statement__Group_1__0
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
    // InternalPascal.g:5364:1: rule__Procedure_statement__Group_1__0 : rule__Procedure_statement__Group_1__0__Impl rule__Procedure_statement__Group_1__1 ;
    public final void rule__Procedure_statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5368:1: ( rule__Procedure_statement__Group_1__0__Impl rule__Procedure_statement__Group_1__1 )
            // InternalPascal.g:5369:2: rule__Procedure_statement__Group_1__0__Impl rule__Procedure_statement__Group_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalPascal.g:5376:1: rule__Procedure_statement__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Procedure_statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5380:1: ( ( '(' ) )
            // InternalPascal.g:5381:1: ( '(' )
            {
            // InternalPascal.g:5381:1: ( '(' )
            // InternalPascal.g:5382:2: '('
            {
             before(grammarAccess.getProcedure_statementAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalPascal.g:5391:1: rule__Procedure_statement__Group_1__1 : rule__Procedure_statement__Group_1__1__Impl rule__Procedure_statement__Group_1__2 ;
    public final void rule__Procedure_statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5395:1: ( rule__Procedure_statement__Group_1__1__Impl rule__Procedure_statement__Group_1__2 )
            // InternalPascal.g:5396:2: rule__Procedure_statement__Group_1__1__Impl rule__Procedure_statement__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalPascal.g:5403:1: rule__Procedure_statement__Group_1__1__Impl : ( ( rule__Procedure_statement__TypesAssignment_1_1 ) ) ;
    public final void rule__Procedure_statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5407:1: ( ( ( rule__Procedure_statement__TypesAssignment_1_1 ) ) )
            // InternalPascal.g:5408:1: ( ( rule__Procedure_statement__TypesAssignment_1_1 ) )
            {
            // InternalPascal.g:5408:1: ( ( rule__Procedure_statement__TypesAssignment_1_1 ) )
            // InternalPascal.g:5409:2: ( rule__Procedure_statement__TypesAssignment_1_1 )
            {
             before(grammarAccess.getProcedure_statementAccess().getTypesAssignment_1_1()); 
            // InternalPascal.g:5410:2: ( rule__Procedure_statement__TypesAssignment_1_1 )
            // InternalPascal.g:5410:3: rule__Procedure_statement__TypesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_statement__TypesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_statementAccess().getTypesAssignment_1_1()); 

            }


            }

        }
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
    // InternalPascal.g:5418:1: rule__Procedure_statement__Group_1__2 : rule__Procedure_statement__Group_1__2__Impl ;
    public final void rule__Procedure_statement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5422:1: ( rule__Procedure_statement__Group_1__2__Impl )
            // InternalPascal.g:5423:2: rule__Procedure_statement__Group_1__2__Impl
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
    // InternalPascal.g:5429:1: rule__Procedure_statement__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Procedure_statement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5433:1: ( ( ')' ) )
            // InternalPascal.g:5434:1: ( ')' )
            {
            // InternalPascal.g:5434:1: ( ')' )
            // InternalPascal.g:5435:2: ')'
            {
             before(grammarAccess.getProcedure_statementAccess().getRightParenthesisKeyword_1_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalPascal.g:5445:1: rule__Parameter_list__Group__0 : rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 ;
    public final void rule__Parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5449:1: ( rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 )
            // InternalPascal.g:5450:2: rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalPascal.g:5457:1: rule__Parameter_list__Group__0__Impl : ( ruleactual_parameter ) ;
    public final void rule__Parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5461:1: ( ( ruleactual_parameter ) )
            // InternalPascal.g:5462:1: ( ruleactual_parameter )
            {
            // InternalPascal.g:5462:1: ( ruleactual_parameter )
            // InternalPascal.g:5463:2: ruleactual_parameter
            {
             before(grammarAccess.getParameter_listAccess().getActual_parameterParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleactual_parameter();

            state._fsp--;

             after(grammarAccess.getParameter_listAccess().getActual_parameterParserRuleCall_0()); 

            }


            }

        }
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
    // InternalPascal.g:5472:1: rule__Parameter_list__Group__1 : rule__Parameter_list__Group__1__Impl ;
    public final void rule__Parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5476:1: ( rule__Parameter_list__Group__1__Impl )
            // InternalPascal.g:5477:2: rule__Parameter_list__Group__1__Impl
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
    // InternalPascal.g:5483:1: rule__Parameter_list__Group__1__Impl : ( ( rule__Parameter_list__Group_1__0 )* ) ;
    public final void rule__Parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5487:1: ( ( ( rule__Parameter_list__Group_1__0 )* ) )
            // InternalPascal.g:5488:1: ( ( rule__Parameter_list__Group_1__0 )* )
            {
            // InternalPascal.g:5488:1: ( ( rule__Parameter_list__Group_1__0 )* )
            // InternalPascal.g:5489:2: ( rule__Parameter_list__Group_1__0 )*
            {
             before(grammarAccess.getParameter_listAccess().getGroup_1()); 
            // InternalPascal.g:5490:2: ( rule__Parameter_list__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==46) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPascal.g:5490:3: rule__Parameter_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Parameter_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalPascal.g:5499:1: rule__Parameter_list__Group_1__0 : rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 ;
    public final void rule__Parameter_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5503:1: ( rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 )
            // InternalPascal.g:5504:2: rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalPascal.g:5511:1: rule__Parameter_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parameter_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5515:1: ( ( ',' ) )
            // InternalPascal.g:5516:1: ( ',' )
            {
            // InternalPascal.g:5516:1: ( ',' )
            // InternalPascal.g:5517:2: ','
            {
             before(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalPascal.g:5526:1: rule__Parameter_list__Group_1__1 : rule__Parameter_list__Group_1__1__Impl ;
    public final void rule__Parameter_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5530:1: ( rule__Parameter_list__Group_1__1__Impl )
            // InternalPascal.g:5531:2: rule__Parameter_list__Group_1__1__Impl
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
    // InternalPascal.g:5537:1: rule__Parameter_list__Group_1__1__Impl : ( ( rule__Parameter_list__TypesAssignment_1_1 ) ) ;
    public final void rule__Parameter_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5541:1: ( ( ( rule__Parameter_list__TypesAssignment_1_1 ) ) )
            // InternalPascal.g:5542:1: ( ( rule__Parameter_list__TypesAssignment_1_1 ) )
            {
            // InternalPascal.g:5542:1: ( ( rule__Parameter_list__TypesAssignment_1_1 ) )
            // InternalPascal.g:5543:2: ( rule__Parameter_list__TypesAssignment_1_1 )
            {
             before(grammarAccess.getParameter_listAccess().getTypesAssignment_1_1()); 
            // InternalPascal.g:5544:2: ( rule__Parameter_list__TypesAssignment_1_1 )
            // InternalPascal.g:5544:3: rule__Parameter_list__TypesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_list__TypesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParameter_listAccess().getTypesAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Procedure_and_function_declaration_part__Group__0"
    // InternalPascal.g:5553:1: rule__Procedure_and_function_declaration_part__Group__0 : rule__Procedure_and_function_declaration_part__Group__0__Impl rule__Procedure_and_function_declaration_part__Group__1 ;
    public final void rule__Procedure_and_function_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5557:1: ( rule__Procedure_and_function_declaration_part__Group__0__Impl rule__Procedure_and_function_declaration_part__Group__1 )
            // InternalPascal.g:5558:2: rule__Procedure_and_function_declaration_part__Group__0__Impl rule__Procedure_and_function_declaration_part__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalPascal.g:5565:1: rule__Procedure_and_function_declaration_part__Group__0__Impl : ( ruleprocedure_or_function_declaration ) ;
    public final void rule__Procedure_and_function_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5569:1: ( ( ruleprocedure_or_function_declaration ) )
            // InternalPascal.g:5570:1: ( ruleprocedure_or_function_declaration )
            {
            // InternalPascal.g:5570:1: ( ruleprocedure_or_function_declaration )
            // InternalPascal.g:5571:2: ruleprocedure_or_function_declaration
            {
             before(grammarAccess.getProcedure_and_function_declaration_partAccess().getProcedure_or_function_declarationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleprocedure_or_function_declaration();

            state._fsp--;

             after(grammarAccess.getProcedure_and_function_declaration_partAccess().getProcedure_or_function_declarationParserRuleCall_0()); 

            }


            }

        }
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
    // InternalPascal.g:5580:1: rule__Procedure_and_function_declaration_part__Group__1 : rule__Procedure_and_function_declaration_part__Group__1__Impl ;
    public final void rule__Procedure_and_function_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5584:1: ( rule__Procedure_and_function_declaration_part__Group__1__Impl )
            // InternalPascal.g:5585:2: rule__Procedure_and_function_declaration_part__Group__1__Impl
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
    // InternalPascal.g:5591:1: rule__Procedure_and_function_declaration_part__Group__1__Impl : ( ';' ) ;
    public final void rule__Procedure_and_function_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5595:1: ( ( ';' ) )
            // InternalPascal.g:5596:1: ( ';' )
            {
            // InternalPascal.g:5596:1: ( ';' )
            // InternalPascal.g:5597:2: ';'
            {
             before(grammarAccess.getProcedure_and_function_declaration_partAccess().getSemicolonKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalPascal.g:5607:1: rule__Procedure_declaration__Group__0 : rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1 ;
    public final void rule__Procedure_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5611:1: ( rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1 )
            // InternalPascal.g:5612:2: rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1
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
    // InternalPascal.g:5619:1: rule__Procedure_declaration__Group__0__Impl : ( RULE_PROCEDURE ) ;
    public final void rule__Procedure_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5623:1: ( ( RULE_PROCEDURE ) )
            // InternalPascal.g:5624:1: ( RULE_PROCEDURE )
            {
            // InternalPascal.g:5624:1: ( RULE_PROCEDURE )
            // InternalPascal.g:5625:2: RULE_PROCEDURE
            {
             before(grammarAccess.getProcedure_declarationAccess().getPROCEDURETerminalRuleCall_0()); 
            match(input,RULE_PROCEDURE,FOLLOW_2); 
             after(grammarAccess.getProcedure_declarationAccess().getPROCEDURETerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalPascal.g:5634:1: rule__Procedure_declaration__Group__1 : rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2 ;
    public final void rule__Procedure_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5638:1: ( rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2 )
            // InternalPascal.g:5639:2: rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalPascal.g:5646:1: rule__Procedure_declaration__Group__1__Impl : ( ( rule__Procedure_declaration__NamesAssignment_1 ) ) ;
    public final void rule__Procedure_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5650:1: ( ( ( rule__Procedure_declaration__NamesAssignment_1 ) ) )
            // InternalPascal.g:5651:1: ( ( rule__Procedure_declaration__NamesAssignment_1 ) )
            {
            // InternalPascal.g:5651:1: ( ( rule__Procedure_declaration__NamesAssignment_1 ) )
            // InternalPascal.g:5652:2: ( rule__Procedure_declaration__NamesAssignment_1 )
            {
             before(grammarAccess.getProcedure_declarationAccess().getNamesAssignment_1()); 
            // InternalPascal.g:5653:2: ( rule__Procedure_declaration__NamesAssignment_1 )
            // InternalPascal.g:5653:3: rule__Procedure_declaration__NamesAssignment_1
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
    // InternalPascal.g:5661:1: rule__Procedure_declaration__Group__2 : rule__Procedure_declaration__Group__2__Impl rule__Procedure_declaration__Group__3 ;
    public final void rule__Procedure_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5665:1: ( rule__Procedure_declaration__Group__2__Impl rule__Procedure_declaration__Group__3 )
            // InternalPascal.g:5666:2: rule__Procedure_declaration__Group__2__Impl rule__Procedure_declaration__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalPascal.g:5673:1: rule__Procedure_declaration__Group__2__Impl : ( ( rule__Procedure_declaration__TypesAssignment_2 )? ) ;
    public final void rule__Procedure_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5677:1: ( ( ( rule__Procedure_declaration__TypesAssignment_2 )? ) )
            // InternalPascal.g:5678:1: ( ( rule__Procedure_declaration__TypesAssignment_2 )? )
            {
            // InternalPascal.g:5678:1: ( ( rule__Procedure_declaration__TypesAssignment_2 )? )
            // InternalPascal.g:5679:2: ( rule__Procedure_declaration__TypesAssignment_2 )?
            {
             before(grammarAccess.getProcedure_declarationAccess().getTypesAssignment_2()); 
            // InternalPascal.g:5680:2: ( rule__Procedure_declaration__TypesAssignment_2 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPascal.g:5680:3: rule__Procedure_declaration__TypesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Procedure_declaration__TypesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcedure_declarationAccess().getTypesAssignment_2()); 

            }


            }

        }
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
    // InternalPascal.g:5688:1: rule__Procedure_declaration__Group__3 : rule__Procedure_declaration__Group__3__Impl rule__Procedure_declaration__Group__4 ;
    public final void rule__Procedure_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5692:1: ( rule__Procedure_declaration__Group__3__Impl rule__Procedure_declaration__Group__4 )
            // InternalPascal.g:5693:2: rule__Procedure_declaration__Group__3__Impl rule__Procedure_declaration__Group__4
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
    // InternalPascal.g:5700:1: rule__Procedure_declaration__Group__3__Impl : ( ';' ) ;
    public final void rule__Procedure_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5704:1: ( ( ';' ) )
            // InternalPascal.g:5705:1: ( ';' )
            {
            // InternalPascal.g:5705:1: ( ';' )
            // InternalPascal.g:5706:2: ';'
            {
             before(grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalPascal.g:5715:1: rule__Procedure_declaration__Group__4 : rule__Procedure_declaration__Group__4__Impl ;
    public final void rule__Procedure_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5719:1: ( rule__Procedure_declaration__Group__4__Impl )
            // InternalPascal.g:5720:2: rule__Procedure_declaration__Group__4__Impl
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
    // InternalPascal.g:5726:1: rule__Procedure_declaration__Group__4__Impl : ( ( rule__Procedure_declaration__BlockAssignment_4 ) ) ;
    public final void rule__Procedure_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5730:1: ( ( ( rule__Procedure_declaration__BlockAssignment_4 ) ) )
            // InternalPascal.g:5731:1: ( ( rule__Procedure_declaration__BlockAssignment_4 ) )
            {
            // InternalPascal.g:5731:1: ( ( rule__Procedure_declaration__BlockAssignment_4 ) )
            // InternalPascal.g:5732:2: ( rule__Procedure_declaration__BlockAssignment_4 )
            {
             before(grammarAccess.getProcedure_declarationAccess().getBlockAssignment_4()); 
            // InternalPascal.g:5733:2: ( rule__Procedure_declaration__BlockAssignment_4 )
            // InternalPascal.g:5733:3: rule__Procedure_declaration__BlockAssignment_4
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


    // $ANTLR start "rule__Procedure_type__Group__0"
    // InternalPascal.g:5742:1: rule__Procedure_type__Group__0 : rule__Procedure_type__Group__0__Impl rule__Procedure_type__Group__1 ;
    public final void rule__Procedure_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5746:1: ( rule__Procedure_type__Group__0__Impl rule__Procedure_type__Group__1 )
            // InternalPascal.g:5747:2: rule__Procedure_type__Group__0__Impl rule__Procedure_type__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Procedure_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_type__Group__1();

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
    // $ANTLR end "rule__Procedure_type__Group__0"


    // $ANTLR start "rule__Procedure_type__Group__0__Impl"
    // InternalPascal.g:5754:1: rule__Procedure_type__Group__0__Impl : ( () ) ;
    public final void rule__Procedure_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5758:1: ( ( () ) )
            // InternalPascal.g:5759:1: ( () )
            {
            // InternalPascal.g:5759:1: ( () )
            // InternalPascal.g:5760:2: ()
            {
             before(grammarAccess.getProcedure_typeAccess().getProcedure_typeAction_0()); 
            // InternalPascal.g:5761:2: ()
            // InternalPascal.g:5761:3: 
            {
            }

             after(grammarAccess.getProcedure_typeAccess().getProcedure_typeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_type__Group__0__Impl"


    // $ANTLR start "rule__Procedure_type__Group__1"
    // InternalPascal.g:5769:1: rule__Procedure_type__Group__1 : rule__Procedure_type__Group__1__Impl rule__Procedure_type__Group__2 ;
    public final void rule__Procedure_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5773:1: ( rule__Procedure_type__Group__1__Impl rule__Procedure_type__Group__2 )
            // InternalPascal.g:5774:2: rule__Procedure_type__Group__1__Impl rule__Procedure_type__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Procedure_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_type__Group__2();

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
    // $ANTLR end "rule__Procedure_type__Group__1"


    // $ANTLR start "rule__Procedure_type__Group__1__Impl"
    // InternalPascal.g:5781:1: rule__Procedure_type__Group__1__Impl : ( RULE_PROCEDURE ) ;
    public final void rule__Procedure_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5785:1: ( ( RULE_PROCEDURE ) )
            // InternalPascal.g:5786:1: ( RULE_PROCEDURE )
            {
            // InternalPascal.g:5786:1: ( RULE_PROCEDURE )
            // InternalPascal.g:5787:2: RULE_PROCEDURE
            {
             before(grammarAccess.getProcedure_typeAccess().getPROCEDURETerminalRuleCall_1()); 
            match(input,RULE_PROCEDURE,FOLLOW_2); 
             after(grammarAccess.getProcedure_typeAccess().getPROCEDURETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_type__Group__1__Impl"


    // $ANTLR start "rule__Procedure_type__Group__2"
    // InternalPascal.g:5796:1: rule__Procedure_type__Group__2 : rule__Procedure_type__Group__2__Impl ;
    public final void rule__Procedure_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5800:1: ( rule__Procedure_type__Group__2__Impl )
            // InternalPascal.g:5801:2: rule__Procedure_type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_type__Group__2__Impl();

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
    // $ANTLR end "rule__Procedure_type__Group__2"


    // $ANTLR start "rule__Procedure_type__Group__2__Impl"
    // InternalPascal.g:5807:1: rule__Procedure_type__Group__2__Impl : ( ( rule__Procedure_type__TypesAssignment_2 )? ) ;
    public final void rule__Procedure_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5811:1: ( ( ( rule__Procedure_type__TypesAssignment_2 )? ) )
            // InternalPascal.g:5812:1: ( ( rule__Procedure_type__TypesAssignment_2 )? )
            {
            // InternalPascal.g:5812:1: ( ( rule__Procedure_type__TypesAssignment_2 )? )
            // InternalPascal.g:5813:2: ( rule__Procedure_type__TypesAssignment_2 )?
            {
             before(grammarAccess.getProcedure_typeAccess().getTypesAssignment_2()); 
            // InternalPascal.g:5814:2: ( rule__Procedure_type__TypesAssignment_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==44) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPascal.g:5814:3: rule__Procedure_type__TypesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Procedure_type__TypesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcedure_typeAccess().getTypesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_type__Group__2__Impl"


    // $ANTLR start "rule__Function_declaration__Group__0"
    // InternalPascal.g:5823:1: rule__Function_declaration__Group__0 : rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1 ;
    public final void rule__Function_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5827:1: ( rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1 )
            // InternalPascal.g:5828:2: rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1
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
    // InternalPascal.g:5835:1: rule__Function_declaration__Group__0__Impl : ( RULE_FUNCTION ) ;
    public final void rule__Function_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5839:1: ( ( RULE_FUNCTION ) )
            // InternalPascal.g:5840:1: ( RULE_FUNCTION )
            {
            // InternalPascal.g:5840:1: ( RULE_FUNCTION )
            // InternalPascal.g:5841:2: RULE_FUNCTION
            {
             before(grammarAccess.getFunction_declarationAccess().getFUNCTIONTerminalRuleCall_0()); 
            match(input,RULE_FUNCTION,FOLLOW_2); 
             after(grammarAccess.getFunction_declarationAccess().getFUNCTIONTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalPascal.g:5850:1: rule__Function_declaration__Group__1 : rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2 ;
    public final void rule__Function_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5854:1: ( rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2 )
            // InternalPascal.g:5855:2: rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalPascal.g:5862:1: rule__Function_declaration__Group__1__Impl : ( ( rule__Function_declaration__NamesAssignment_1 ) ) ;
    public final void rule__Function_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5866:1: ( ( ( rule__Function_declaration__NamesAssignment_1 ) ) )
            // InternalPascal.g:5867:1: ( ( rule__Function_declaration__NamesAssignment_1 ) )
            {
            // InternalPascal.g:5867:1: ( ( rule__Function_declaration__NamesAssignment_1 ) )
            // InternalPascal.g:5868:2: ( rule__Function_declaration__NamesAssignment_1 )
            {
             before(grammarAccess.getFunction_declarationAccess().getNamesAssignment_1()); 
            // InternalPascal.g:5869:2: ( rule__Function_declaration__NamesAssignment_1 )
            // InternalPascal.g:5869:3: rule__Function_declaration__NamesAssignment_1
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
    // InternalPascal.g:5877:1: rule__Function_declaration__Group__2 : rule__Function_declaration__Group__2__Impl rule__Function_declaration__Group__3 ;
    public final void rule__Function_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5881:1: ( rule__Function_declaration__Group__2__Impl rule__Function_declaration__Group__3 )
            // InternalPascal.g:5882:2: rule__Function_declaration__Group__2__Impl rule__Function_declaration__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalPascal.g:5889:1: rule__Function_declaration__Group__2__Impl : ( ( rule__Function_declaration__TypesAssignment_2 )? ) ;
    public final void rule__Function_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5893:1: ( ( ( rule__Function_declaration__TypesAssignment_2 )? ) )
            // InternalPascal.g:5894:1: ( ( rule__Function_declaration__TypesAssignment_2 )? )
            {
            // InternalPascal.g:5894:1: ( ( rule__Function_declaration__TypesAssignment_2 )? )
            // InternalPascal.g:5895:2: ( rule__Function_declaration__TypesAssignment_2 )?
            {
             before(grammarAccess.getFunction_declarationAccess().getTypesAssignment_2()); 
            // InternalPascal.g:5896:2: ( rule__Function_declaration__TypesAssignment_2 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==44) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPascal.g:5896:3: rule__Function_declaration__TypesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function_declaration__TypesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunction_declarationAccess().getTypesAssignment_2()); 

            }


            }

        }
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
    // InternalPascal.g:5904:1: rule__Function_declaration__Group__3 : rule__Function_declaration__Group__3__Impl rule__Function_declaration__Group__4 ;
    public final void rule__Function_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5908:1: ( rule__Function_declaration__Group__3__Impl rule__Function_declaration__Group__4 )
            // InternalPascal.g:5909:2: rule__Function_declaration__Group__3__Impl rule__Function_declaration__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalPascal.g:5916:1: rule__Function_declaration__Group__3__Impl : ( ':' ) ;
    public final void rule__Function_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5920:1: ( ( ':' ) )
            // InternalPascal.g:5921:1: ( ':' )
            {
            // InternalPascal.g:5921:1: ( ':' )
            // InternalPascal.g:5922:2: ':'
            {
             before(grammarAccess.getFunction_declarationAccess().getColonKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalPascal.g:5931:1: rule__Function_declaration__Group__4 : rule__Function_declaration__Group__4__Impl rule__Function_declaration__Group__5 ;
    public final void rule__Function_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5935:1: ( rule__Function_declaration__Group__4__Impl rule__Function_declaration__Group__5 )
            // InternalPascal.g:5936:2: rule__Function_declaration__Group__4__Impl rule__Function_declaration__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalPascal.g:5943:1: rule__Function_declaration__Group__4__Impl : ( ( rule__Function_declaration__TypesAssignment_4 ) ) ;
    public final void rule__Function_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5947:1: ( ( ( rule__Function_declaration__TypesAssignment_4 ) ) )
            // InternalPascal.g:5948:1: ( ( rule__Function_declaration__TypesAssignment_4 ) )
            {
            // InternalPascal.g:5948:1: ( ( rule__Function_declaration__TypesAssignment_4 ) )
            // InternalPascal.g:5949:2: ( rule__Function_declaration__TypesAssignment_4 )
            {
             before(grammarAccess.getFunction_declarationAccess().getTypesAssignment_4()); 
            // InternalPascal.g:5950:2: ( rule__Function_declaration__TypesAssignment_4 )
            // InternalPascal.g:5950:3: rule__Function_declaration__TypesAssignment_4
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
    // InternalPascal.g:5958:1: rule__Function_declaration__Group__5 : rule__Function_declaration__Group__5__Impl rule__Function_declaration__Group__6 ;
    public final void rule__Function_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5962:1: ( rule__Function_declaration__Group__5__Impl rule__Function_declaration__Group__6 )
            // InternalPascal.g:5963:2: rule__Function_declaration__Group__5__Impl rule__Function_declaration__Group__6
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
    // InternalPascal.g:5970:1: rule__Function_declaration__Group__5__Impl : ( ';' ) ;
    public final void rule__Function_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5974:1: ( ( ';' ) )
            // InternalPascal.g:5975:1: ( ';' )
            {
            // InternalPascal.g:5975:1: ( ';' )
            // InternalPascal.g:5976:2: ';'
            {
             before(grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_5()); 
            match(input,43,FOLLOW_2); 
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
    // InternalPascal.g:5985:1: rule__Function_declaration__Group__6 : rule__Function_declaration__Group__6__Impl ;
    public final void rule__Function_declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5989:1: ( rule__Function_declaration__Group__6__Impl )
            // InternalPascal.g:5990:2: rule__Function_declaration__Group__6__Impl
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
    // InternalPascal.g:5996:1: rule__Function_declaration__Group__6__Impl : ( ( rule__Function_declaration__BlockAssignment_6 ) ) ;
    public final void rule__Function_declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6000:1: ( ( ( rule__Function_declaration__BlockAssignment_6 ) ) )
            // InternalPascal.g:6001:1: ( ( rule__Function_declaration__BlockAssignment_6 ) )
            {
            // InternalPascal.g:6001:1: ( ( rule__Function_declaration__BlockAssignment_6 ) )
            // InternalPascal.g:6002:2: ( rule__Function_declaration__BlockAssignment_6 )
            {
             before(grammarAccess.getFunction_declarationAccess().getBlockAssignment_6()); 
            // InternalPascal.g:6003:2: ( rule__Function_declaration__BlockAssignment_6 )
            // InternalPascal.g:6003:3: rule__Function_declaration__BlockAssignment_6
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


    // $ANTLR start "rule__Function_type__Group__0"
    // InternalPascal.g:6012:1: rule__Function_type__Group__0 : rule__Function_type__Group__0__Impl rule__Function_type__Group__1 ;
    public final void rule__Function_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6016:1: ( rule__Function_type__Group__0__Impl rule__Function_type__Group__1 )
            // InternalPascal.g:6017:2: rule__Function_type__Group__0__Impl rule__Function_type__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Function_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_type__Group__1();

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
    // $ANTLR end "rule__Function_type__Group__0"


    // $ANTLR start "rule__Function_type__Group__0__Impl"
    // InternalPascal.g:6024:1: rule__Function_type__Group__0__Impl : ( RULE_FUNCTION ) ;
    public final void rule__Function_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6028:1: ( ( RULE_FUNCTION ) )
            // InternalPascal.g:6029:1: ( RULE_FUNCTION )
            {
            // InternalPascal.g:6029:1: ( RULE_FUNCTION )
            // InternalPascal.g:6030:2: RULE_FUNCTION
            {
             before(grammarAccess.getFunction_typeAccess().getFUNCTIONTerminalRuleCall_0()); 
            match(input,RULE_FUNCTION,FOLLOW_2); 
             after(grammarAccess.getFunction_typeAccess().getFUNCTIONTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_type__Group__0__Impl"


    // $ANTLR start "rule__Function_type__Group__1"
    // InternalPascal.g:6039:1: rule__Function_type__Group__1 : rule__Function_type__Group__1__Impl rule__Function_type__Group__2 ;
    public final void rule__Function_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6043:1: ( rule__Function_type__Group__1__Impl rule__Function_type__Group__2 )
            // InternalPascal.g:6044:2: rule__Function_type__Group__1__Impl rule__Function_type__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Function_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_type__Group__2();

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
    // $ANTLR end "rule__Function_type__Group__1"


    // $ANTLR start "rule__Function_type__Group__1__Impl"
    // InternalPascal.g:6051:1: rule__Function_type__Group__1__Impl : ( ( rule__Function_type__TypesAssignment_1 )? ) ;
    public final void rule__Function_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6055:1: ( ( ( rule__Function_type__TypesAssignment_1 )? ) )
            // InternalPascal.g:6056:1: ( ( rule__Function_type__TypesAssignment_1 )? )
            {
            // InternalPascal.g:6056:1: ( ( rule__Function_type__TypesAssignment_1 )? )
            // InternalPascal.g:6057:2: ( rule__Function_type__TypesAssignment_1 )?
            {
             before(grammarAccess.getFunction_typeAccess().getTypesAssignment_1()); 
            // InternalPascal.g:6058:2: ( rule__Function_type__TypesAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==44) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPascal.g:6058:3: rule__Function_type__TypesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function_type__TypesAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunction_typeAccess().getTypesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_type__Group__1__Impl"


    // $ANTLR start "rule__Function_type__Group__2"
    // InternalPascal.g:6066:1: rule__Function_type__Group__2 : rule__Function_type__Group__2__Impl rule__Function_type__Group__3 ;
    public final void rule__Function_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6070:1: ( rule__Function_type__Group__2__Impl rule__Function_type__Group__3 )
            // InternalPascal.g:6071:2: rule__Function_type__Group__2__Impl rule__Function_type__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__Function_type__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_type__Group__3();

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
    // $ANTLR end "rule__Function_type__Group__2"


    // $ANTLR start "rule__Function_type__Group__2__Impl"
    // InternalPascal.g:6078:1: rule__Function_type__Group__2__Impl : ( ':' ) ;
    public final void rule__Function_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6082:1: ( ( ':' ) )
            // InternalPascal.g:6083:1: ( ':' )
            {
            // InternalPascal.g:6083:1: ( ':' )
            // InternalPascal.g:6084:2: ':'
            {
             before(grammarAccess.getFunction_typeAccess().getColonKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFunction_typeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_type__Group__2__Impl"


    // $ANTLR start "rule__Function_type__Group__3"
    // InternalPascal.g:6093:1: rule__Function_type__Group__3 : rule__Function_type__Group__3__Impl ;
    public final void rule__Function_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6097:1: ( rule__Function_type__Group__3__Impl )
            // InternalPascal.g:6098:2: rule__Function_type__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function_type__Group__3__Impl();

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
    // $ANTLR end "rule__Function_type__Group__3"


    // $ANTLR start "rule__Function_type__Group__3__Impl"
    // InternalPascal.g:6104:1: rule__Function_type__Group__3__Impl : ( ( rule__Function_type__TypesAssignment_3 ) ) ;
    public final void rule__Function_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6108:1: ( ( ( rule__Function_type__TypesAssignment_3 ) ) )
            // InternalPascal.g:6109:1: ( ( rule__Function_type__TypesAssignment_3 ) )
            {
            // InternalPascal.g:6109:1: ( ( rule__Function_type__TypesAssignment_3 ) )
            // InternalPascal.g:6110:2: ( rule__Function_type__TypesAssignment_3 )
            {
             before(grammarAccess.getFunction_typeAccess().getTypesAssignment_3()); 
            // InternalPascal.g:6111:2: ( rule__Function_type__TypesAssignment_3 )
            // InternalPascal.g:6111:3: rule__Function_type__TypesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Function_type__TypesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunction_typeAccess().getTypesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_type__Group__3__Impl"


    // $ANTLR start "rule__Function_designator__Group__0"
    // InternalPascal.g:6120:1: rule__Function_designator__Group__0 : rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 ;
    public final void rule__Function_designator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6124:1: ( rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 )
            // InternalPascal.g:6125:2: rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalPascal.g:6132:1: rule__Function_designator__Group__0__Impl : ( ( rule__Function_designator__NamesAssignment_0 ) ) ;
    public final void rule__Function_designator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6136:1: ( ( ( rule__Function_designator__NamesAssignment_0 ) ) )
            // InternalPascal.g:6137:1: ( ( rule__Function_designator__NamesAssignment_0 ) )
            {
            // InternalPascal.g:6137:1: ( ( rule__Function_designator__NamesAssignment_0 ) )
            // InternalPascal.g:6138:2: ( rule__Function_designator__NamesAssignment_0 )
            {
             before(grammarAccess.getFunction_designatorAccess().getNamesAssignment_0()); 
            // InternalPascal.g:6139:2: ( rule__Function_designator__NamesAssignment_0 )
            // InternalPascal.g:6139:3: rule__Function_designator__NamesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Function_designator__NamesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunction_designatorAccess().getNamesAssignment_0()); 

            }


            }

        }
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
    // InternalPascal.g:6147:1: rule__Function_designator__Group__1 : rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 ;
    public final void rule__Function_designator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6151:1: ( rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 )
            // InternalPascal.g:6152:2: rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalPascal.g:6159:1: rule__Function_designator__Group__1__Impl : ( '(' ) ;
    public final void rule__Function_designator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6163:1: ( ( '(' ) )
            // InternalPascal.g:6164:1: ( '(' )
            {
            // InternalPascal.g:6164:1: ( '(' )
            // InternalPascal.g:6165:2: '('
            {
             before(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalPascal.g:6174:1: rule__Function_designator__Group__2 : rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 ;
    public final void rule__Function_designator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6178:1: ( rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 )
            // InternalPascal.g:6179:2: rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalPascal.g:6186:1: rule__Function_designator__Group__2__Impl : ( ( rule__Function_designator__TypesAssignment_2 ) ) ;
    public final void rule__Function_designator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6190:1: ( ( ( rule__Function_designator__TypesAssignment_2 ) ) )
            // InternalPascal.g:6191:1: ( ( rule__Function_designator__TypesAssignment_2 ) )
            {
            // InternalPascal.g:6191:1: ( ( rule__Function_designator__TypesAssignment_2 ) )
            // InternalPascal.g:6192:2: ( rule__Function_designator__TypesAssignment_2 )
            {
             before(grammarAccess.getFunction_designatorAccess().getTypesAssignment_2()); 
            // InternalPascal.g:6193:2: ( rule__Function_designator__TypesAssignment_2 )
            // InternalPascal.g:6193:3: rule__Function_designator__TypesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Function_designator__TypesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunction_designatorAccess().getTypesAssignment_2()); 

            }


            }

        }
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
    // InternalPascal.g:6201:1: rule__Function_designator__Group__3 : rule__Function_designator__Group__3__Impl ;
    public final void rule__Function_designator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6205:1: ( rule__Function_designator__Group__3__Impl )
            // InternalPascal.g:6206:2: rule__Function_designator__Group__3__Impl
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
    // InternalPascal.g:6212:1: rule__Function_designator__Group__3__Impl : ( ')' ) ;
    public final void rule__Function_designator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6216:1: ( ( ')' ) )
            // InternalPascal.g:6217:1: ( ')' )
            {
            // InternalPascal.g:6217:1: ( ')' )
            // InternalPascal.g:6218:2: ')'
            {
             before(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalPascal.g:6228:1: rule__Formal_parameter_list__Group__0 : rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1 ;
    public final void rule__Formal_parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6232:1: ( rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1 )
            // InternalPascal.g:6233:2: rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalPascal.g:6240:1: rule__Formal_parameter_list__Group__0__Impl : ( '(' ) ;
    public final void rule__Formal_parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6244:1: ( ( '(' ) )
            // InternalPascal.g:6245:1: ( '(' )
            {
            // InternalPascal.g:6245:1: ( '(' )
            // InternalPascal.g:6246:2: '('
            {
             before(grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalPascal.g:6255:1: rule__Formal_parameter_list__Group__1 : rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2 ;
    public final void rule__Formal_parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6259:1: ( rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2 )
            // InternalPascal.g:6260:2: rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalPascal.g:6267:1: rule__Formal_parameter_list__Group__1__Impl : ( ruleformal_parameter_section ) ;
    public final void rule__Formal_parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6271:1: ( ( ruleformal_parameter_section ) )
            // InternalPascal.g:6272:1: ( ruleformal_parameter_section )
            {
            // InternalPascal.g:6272:1: ( ruleformal_parameter_section )
            // InternalPascal.g:6273:2: ruleformal_parameter_section
            {
             before(grammarAccess.getFormal_parameter_listAccess().getFormal_parameter_sectionParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleformal_parameter_section();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_listAccess().getFormal_parameter_sectionParserRuleCall_1()); 

            }


            }

        }
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
    // InternalPascal.g:6282:1: rule__Formal_parameter_list__Group__2 : rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3 ;
    public final void rule__Formal_parameter_list__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6286:1: ( rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3 )
            // InternalPascal.g:6287:2: rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalPascal.g:6294:1: rule__Formal_parameter_list__Group__2__Impl : ( ( rule__Formal_parameter_list__Group_2__0 )* ) ;
    public final void rule__Formal_parameter_list__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6298:1: ( ( ( rule__Formal_parameter_list__Group_2__0 )* ) )
            // InternalPascal.g:6299:1: ( ( rule__Formal_parameter_list__Group_2__0 )* )
            {
            // InternalPascal.g:6299:1: ( ( rule__Formal_parameter_list__Group_2__0 )* )
            // InternalPascal.g:6300:2: ( rule__Formal_parameter_list__Group_2__0 )*
            {
             before(grammarAccess.getFormal_parameter_listAccess().getGroup_2()); 
            // InternalPascal.g:6301:2: ( rule__Formal_parameter_list__Group_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==43) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalPascal.g:6301:3: rule__Formal_parameter_list__Group_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Formal_parameter_list__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalPascal.g:6309:1: rule__Formal_parameter_list__Group__3 : rule__Formal_parameter_list__Group__3__Impl ;
    public final void rule__Formal_parameter_list__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6313:1: ( rule__Formal_parameter_list__Group__3__Impl )
            // InternalPascal.g:6314:2: rule__Formal_parameter_list__Group__3__Impl
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
    // InternalPascal.g:6320:1: rule__Formal_parameter_list__Group__3__Impl : ( ')' ) ;
    public final void rule__Formal_parameter_list__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6324:1: ( ( ')' ) )
            // InternalPascal.g:6325:1: ( ')' )
            {
            // InternalPascal.g:6325:1: ( ')' )
            // InternalPascal.g:6326:2: ')'
            {
             before(grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalPascal.g:6336:1: rule__Formal_parameter_list__Group_2__0 : rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1 ;
    public final void rule__Formal_parameter_list__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6340:1: ( rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1 )
            // InternalPascal.g:6341:2: rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalPascal.g:6348:1: rule__Formal_parameter_list__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Formal_parameter_list__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6352:1: ( ( ';' ) )
            // InternalPascal.g:6353:1: ( ';' )
            {
            // InternalPascal.g:6353:1: ( ';' )
            // InternalPascal.g:6354:2: ';'
            {
             before(grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalPascal.g:6363:1: rule__Formal_parameter_list__Group_2__1 : rule__Formal_parameter_list__Group_2__1__Impl ;
    public final void rule__Formal_parameter_list__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6367:1: ( rule__Formal_parameter_list__Group_2__1__Impl )
            // InternalPascal.g:6368:2: rule__Formal_parameter_list__Group_2__1__Impl
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
    // InternalPascal.g:6374:1: rule__Formal_parameter_list__Group_2__1__Impl : ( ( rule__Formal_parameter_list__TypesAssignment_2_1 ) ) ;
    public final void rule__Formal_parameter_list__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6378:1: ( ( ( rule__Formal_parameter_list__TypesAssignment_2_1 ) ) )
            // InternalPascal.g:6379:1: ( ( rule__Formal_parameter_list__TypesAssignment_2_1 ) )
            {
            // InternalPascal.g:6379:1: ( ( rule__Formal_parameter_list__TypesAssignment_2_1 ) )
            // InternalPascal.g:6380:2: ( rule__Formal_parameter_list__TypesAssignment_2_1 )
            {
             before(grammarAccess.getFormal_parameter_listAccess().getTypesAssignment_2_1()); 
            // InternalPascal.g:6381:2: ( rule__Formal_parameter_list__TypesAssignment_2_1 )
            // InternalPascal.g:6381:3: rule__Formal_parameter_list__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__TypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFormal_parameter_listAccess().getTypesAssignment_2_1()); 

            }


            }

        }
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
    // InternalPascal.g:6390:1: rule__Formal_parameter_section__Group_1__0 : rule__Formal_parameter_section__Group_1__0__Impl rule__Formal_parameter_section__Group_1__1 ;
    public final void rule__Formal_parameter_section__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6394:1: ( rule__Formal_parameter_section__Group_1__0__Impl rule__Formal_parameter_section__Group_1__1 )
            // InternalPascal.g:6395:2: rule__Formal_parameter_section__Group_1__0__Impl rule__Formal_parameter_section__Group_1__1
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
    // InternalPascal.g:6402:1: rule__Formal_parameter_section__Group_1__0__Impl : ( RULE_VAR ) ;
    public final void rule__Formal_parameter_section__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6406:1: ( ( RULE_VAR ) )
            // InternalPascal.g:6407:1: ( RULE_VAR )
            {
            // InternalPascal.g:6407:1: ( RULE_VAR )
            // InternalPascal.g:6408:2: RULE_VAR
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getVARTerminalRuleCall_1_0()); 
            match(input,RULE_VAR,FOLLOW_2); 
             after(grammarAccess.getFormal_parameter_sectionAccess().getVARTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalPascal.g:6417:1: rule__Formal_parameter_section__Group_1__1 : rule__Formal_parameter_section__Group_1__1__Impl ;
    public final void rule__Formal_parameter_section__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6421:1: ( rule__Formal_parameter_section__Group_1__1__Impl )
            // InternalPascal.g:6422:2: rule__Formal_parameter_section__Group_1__1__Impl
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
    // InternalPascal.g:6428:1: rule__Formal_parameter_section__Group_1__1__Impl : ( ruleparameter_group ) ;
    public final void rule__Formal_parameter_section__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6432:1: ( ( ruleparameter_group ) )
            // InternalPascal.g:6433:1: ( ruleparameter_group )
            {
            // InternalPascal.g:6433:1: ( ruleparameter_group )
            // InternalPascal.g:6434:2: ruleparameter_group
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getParameter_groupParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleparameter_group();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionAccess().getParameter_groupParserRuleCall_1_1()); 

            }


            }

        }
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
    // InternalPascal.g:6444:1: rule__Formal_parameter_section__Group_2__0 : rule__Formal_parameter_section__Group_2__0__Impl rule__Formal_parameter_section__Group_2__1 ;
    public final void rule__Formal_parameter_section__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6448:1: ( rule__Formal_parameter_section__Group_2__0__Impl rule__Formal_parameter_section__Group_2__1 )
            // InternalPascal.g:6449:2: rule__Formal_parameter_section__Group_2__0__Impl rule__Formal_parameter_section__Group_2__1
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
    // InternalPascal.g:6456:1: rule__Formal_parameter_section__Group_2__0__Impl : ( RULE_FUNCTION ) ;
    public final void rule__Formal_parameter_section__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6460:1: ( ( RULE_FUNCTION ) )
            // InternalPascal.g:6461:1: ( RULE_FUNCTION )
            {
            // InternalPascal.g:6461:1: ( RULE_FUNCTION )
            // InternalPascal.g:6462:2: RULE_FUNCTION
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getFUNCTIONTerminalRuleCall_2_0()); 
            match(input,RULE_FUNCTION,FOLLOW_2); 
             after(grammarAccess.getFormal_parameter_sectionAccess().getFUNCTIONTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalPascal.g:6471:1: rule__Formal_parameter_section__Group_2__1 : rule__Formal_parameter_section__Group_2__1__Impl ;
    public final void rule__Formal_parameter_section__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6475:1: ( rule__Formal_parameter_section__Group_2__1__Impl )
            // InternalPascal.g:6476:2: rule__Formal_parameter_section__Group_2__1__Impl
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
    // InternalPascal.g:6482:1: rule__Formal_parameter_section__Group_2__1__Impl : ( ruleparameter_group ) ;
    public final void rule__Formal_parameter_section__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6486:1: ( ( ruleparameter_group ) )
            // InternalPascal.g:6487:1: ( ruleparameter_group )
            {
            // InternalPascal.g:6487:1: ( ruleparameter_group )
            // InternalPascal.g:6488:2: ruleparameter_group
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getParameter_groupParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleparameter_group();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionAccess().getParameter_groupParserRuleCall_2_1()); 

            }


            }

        }
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
    // InternalPascal.g:6498:1: rule__Formal_parameter_section__Group_3__0 : rule__Formal_parameter_section__Group_3__0__Impl rule__Formal_parameter_section__Group_3__1 ;
    public final void rule__Formal_parameter_section__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6502:1: ( rule__Formal_parameter_section__Group_3__0__Impl rule__Formal_parameter_section__Group_3__1 )
            // InternalPascal.g:6503:2: rule__Formal_parameter_section__Group_3__0__Impl rule__Formal_parameter_section__Group_3__1
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
    // InternalPascal.g:6510:1: rule__Formal_parameter_section__Group_3__0__Impl : ( RULE_PROCEDURE ) ;
    public final void rule__Formal_parameter_section__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6514:1: ( ( RULE_PROCEDURE ) )
            // InternalPascal.g:6515:1: ( RULE_PROCEDURE )
            {
            // InternalPascal.g:6515:1: ( RULE_PROCEDURE )
            // InternalPascal.g:6516:2: RULE_PROCEDURE
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getPROCEDURETerminalRuleCall_3_0()); 
            match(input,RULE_PROCEDURE,FOLLOW_2); 
             after(grammarAccess.getFormal_parameter_sectionAccess().getPROCEDURETerminalRuleCall_3_0()); 

            }


            }

        }
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
    // InternalPascal.g:6525:1: rule__Formal_parameter_section__Group_3__1 : rule__Formal_parameter_section__Group_3__1__Impl ;
    public final void rule__Formal_parameter_section__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6529:1: ( rule__Formal_parameter_section__Group_3__1__Impl )
            // InternalPascal.g:6530:2: rule__Formal_parameter_section__Group_3__1__Impl
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
    // InternalPascal.g:6536:1: rule__Formal_parameter_section__Group_3__1__Impl : ( ruleparameter_group ) ;
    public final void rule__Formal_parameter_section__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6540:1: ( ( ruleparameter_group ) )
            // InternalPascal.g:6541:1: ( ruleparameter_group )
            {
            // InternalPascal.g:6541:1: ( ruleparameter_group )
            // InternalPascal.g:6542:2: ruleparameter_group
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getParameter_groupParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleparameter_group();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionAccess().getParameter_groupParserRuleCall_3_1()); 

            }


            }

        }
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
    // InternalPascal.g:6552:1: rule__Parameter_group__Group__0 : rule__Parameter_group__Group__0__Impl rule__Parameter_group__Group__1 ;
    public final void rule__Parameter_group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6556:1: ( rule__Parameter_group__Group__0__Impl rule__Parameter_group__Group__1 )
            // InternalPascal.g:6557:2: rule__Parameter_group__Group__0__Impl rule__Parameter_group__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:6564:1: rule__Parameter_group__Group__0__Impl : ( ruleidentifier_list ) ;
    public final void rule__Parameter_group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6568:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:6569:1: ( ruleidentifier_list )
            {
            // InternalPascal.g:6569:1: ( ruleidentifier_list )
            // InternalPascal.g:6570:2: ruleidentifier_list
            {
             before(grammarAccess.getParameter_groupAccess().getIdentifier_listParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getParameter_groupAccess().getIdentifier_listParserRuleCall_0()); 

            }


            }

        }
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
    // InternalPascal.g:6579:1: rule__Parameter_group__Group__1 : rule__Parameter_group__Group__1__Impl rule__Parameter_group__Group__2 ;
    public final void rule__Parameter_group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6583:1: ( rule__Parameter_group__Group__1__Impl rule__Parameter_group__Group__2 )
            // InternalPascal.g:6584:2: rule__Parameter_group__Group__1__Impl rule__Parameter_group__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalPascal.g:6591:1: rule__Parameter_group__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter_group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6595:1: ( ( ':' ) )
            // InternalPascal.g:6596:1: ( ':' )
            {
            // InternalPascal.g:6596:1: ( ':' )
            // InternalPascal.g:6597:2: ':'
            {
             before(grammarAccess.getParameter_groupAccess().getColonKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalPascal.g:6606:1: rule__Parameter_group__Group__2 : rule__Parameter_group__Group__2__Impl ;
    public final void rule__Parameter_group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6610:1: ( rule__Parameter_group__Group__2__Impl )
            // InternalPascal.g:6611:2: rule__Parameter_group__Group__2__Impl
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
    // InternalPascal.g:6617:1: rule__Parameter_group__Group__2__Impl : ( ( rule__Parameter_group__TypesAssignment_2 ) ) ;
    public final void rule__Parameter_group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6621:1: ( ( ( rule__Parameter_group__TypesAssignment_2 ) ) )
            // InternalPascal.g:6622:1: ( ( rule__Parameter_group__TypesAssignment_2 ) )
            {
            // InternalPascal.g:6622:1: ( ( rule__Parameter_group__TypesAssignment_2 ) )
            // InternalPascal.g:6623:2: ( rule__Parameter_group__TypesAssignment_2 )
            {
             before(grammarAccess.getParameter_groupAccess().getTypesAssignment_2()); 
            // InternalPascal.g:6624:2: ( rule__Parameter_group__TypesAssignment_2 )
            // InternalPascal.g:6624:3: rule__Parameter_group__TypesAssignment_2
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
    // InternalPascal.g:6633:1: rule__Pascal__ProgramAssignment : ( ruleprogram ) ;
    public final void rule__Pascal__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6637:1: ( ( ruleprogram ) )
            // InternalPascal.g:6638:2: ( ruleprogram )
            {
            // InternalPascal.g:6638:2: ( ruleprogram )
            // InternalPascal.g:6639:3: ruleprogram
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
    // InternalPascal.g:6648:1: rule__Program__HeadingAssignment_0 : ( ruleprogram_heading_block ) ;
    public final void rule__Program__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6652:1: ( ( ruleprogram_heading_block ) )
            // InternalPascal.g:6653:2: ( ruleprogram_heading_block )
            {
            // InternalPascal.g:6653:2: ( ruleprogram_heading_block )
            // InternalPascal.g:6654:3: ruleprogram_heading_block
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
    // InternalPascal.g:6663:1: rule__Program__BlockAssignment_1 : ( ruleblock ) ;
    public final void rule__Program__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6667:1: ( ( ruleblock ) )
            // InternalPascal.g:6668:2: ( ruleblock )
            {
            // InternalPascal.g:6668:2: ( ruleblock )
            // InternalPascal.g:6669:3: ruleblock
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
    // InternalPascal.g:6678:1: rule__Program_heading_block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program_heading_block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6682:1: ( ( RULE_ID ) )
            // InternalPascal.g:6683:2: ( RULE_ID )
            {
            // InternalPascal.g:6683:2: ( RULE_ID )
            // InternalPascal.g:6684:3: RULE_ID
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


    // $ANTLR start "rule__Program_heading_block__IdentifiersAssignment_2_1"
    // InternalPascal.g:6693:1: rule__Program_heading_block__IdentifiersAssignment_2_1 : ( ruleidentifier_list ) ;
    public final void rule__Program_heading_block__IdentifiersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6697:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:6698:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:6698:2: ( ruleidentifier_list )
            // InternalPascal.g:6699:3: ruleidentifier_list
            {
             before(grammarAccess.getProgram_heading_blockAccess().getIdentifiersIdentifier_listParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getProgram_heading_blockAccess().getIdentifiersIdentifier_listParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__IdentifiersAssignment_2_1"


    // $ANTLR start "rule__Identifier_list__NamesAssignment_0"
    // InternalPascal.g:6708:1: rule__Identifier_list__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6712:1: ( ( RULE_ID ) )
            // InternalPascal.g:6713:2: ( RULE_ID )
            {
            // InternalPascal.g:6713:2: ( RULE_ID )
            // InternalPascal.g:6714:3: RULE_ID
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // InternalPascal.g:6723:1: rule__Identifier_list__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6727:1: ( ( RULE_ID ) )
            // InternalPascal.g:6728:2: ( RULE_ID )
            {
            // InternalPascal.g:6728:2: ( RULE_ID )
            // InternalPascal.g:6729:3: RULE_ID
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Block__ConstantpartAssignment_0_0"
    // InternalPascal.g:6738:1: rule__Block__ConstantpartAssignment_0_0 : ( ruleconstant_definition_part ) ;
    public final void rule__Block__ConstantpartAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6742:1: ( ( ruleconstant_definition_part ) )
            // InternalPascal.g:6743:2: ( ruleconstant_definition_part )
            {
            // InternalPascal.g:6743:2: ( ruleconstant_definition_part )
            // InternalPascal.g:6744:3: ruleconstant_definition_part
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


    // $ANTLR start "rule__Block__VariablepartAssignment_0_1"
    // InternalPascal.g:6753:1: rule__Block__VariablepartAssignment_0_1 : ( rulevariable_declaration_part ) ;
    public final void rule__Block__VariablepartAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6757:1: ( ( rulevariable_declaration_part ) )
            // InternalPascal.g:6758:2: ( rulevariable_declaration_part )
            {
            // InternalPascal.g:6758:2: ( rulevariable_declaration_part )
            // InternalPascal.g:6759:3: rulevariable_declaration_part
            {
             before(grammarAccess.getBlockAccess().getVariablepartVariable_declaration_partParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            rulevariable_declaration_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getVariablepartVariable_declaration_partParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__VariablepartAssignment_0_1"


    // $ANTLR start "rule__Block__Procedure_function_partAssignment_0_2"
    // InternalPascal.g:6768:1: rule__Block__Procedure_function_partAssignment_0_2 : ( ruleprocedure_and_function_declaration_part ) ;
    public final void rule__Block__Procedure_function_partAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6772:1: ( ( ruleprocedure_and_function_declaration_part ) )
            // InternalPascal.g:6773:2: ( ruleprocedure_and_function_declaration_part )
            {
            // InternalPascal.g:6773:2: ( ruleprocedure_and_function_declaration_part )
            // InternalPascal.g:6774:3: ruleprocedure_and_function_declaration_part
            {
             before(grammarAccess.getBlockAccess().getProcedure_function_partProcedure_and_function_declaration_partParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleprocedure_and_function_declaration_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getProcedure_function_partProcedure_and_function_declaration_partParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Procedure_function_partAssignment_0_2"


    // $ANTLR start "rule__Block__StatementAssignment_1"
    // InternalPascal.g:6783:1: rule__Block__StatementAssignment_1 : ( rulecompound_statement ) ;
    public final void rule__Block__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6787:1: ( ( rulecompound_statement ) )
            // InternalPascal.g:6788:2: ( rulecompound_statement )
            {
            // InternalPascal.g:6788:2: ( rulecompound_statement )
            // InternalPascal.g:6789:3: rulecompound_statement
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
    // InternalPascal.g:6798:1: rule__Constant_definition_part__ConstantsAssignment_1_0 : ( ruleconstant_definition ) ;
    public final void rule__Constant_definition_part__ConstantsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6802:1: ( ( ruleconstant_definition ) )
            // InternalPascal.g:6803:2: ( ruleconstant_definition )
            {
            // InternalPascal.g:6803:2: ( ruleconstant_definition )
            // InternalPascal.g:6804:3: ruleconstant_definition
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
    // InternalPascal.g:6813:1: rule__Constant_definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constant_definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6817:1: ( ( RULE_ID ) )
            // InternalPascal.g:6818:2: ( RULE_ID )
            {
            // InternalPascal.g:6818:2: ( RULE_ID )
            // InternalPascal.g:6819:3: RULE_ID
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


    // $ANTLR start "rule__Constant__NamesAssignment_2"
    // InternalPascal.g:6828:1: rule__Constant__NamesAssignment_2 : ( RULE_ID ) ;
    public final void rule__Constant__NamesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6832:1: ( ( RULE_ID ) )
            // InternalPascal.g:6833:2: ( RULE_ID )
            {
            // InternalPascal.g:6833:2: ( RULE_ID )
            // InternalPascal.g:6834:3: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getNamesIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getNamesIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__NamesAssignment_2"


    // $ANTLR start "rule__Constant__NamesAssignment_3_1"
    // InternalPascal.g:6843:1: rule__Constant__NamesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Constant__NamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6847:1: ( ( RULE_ID ) )
            // InternalPascal.g:6848:2: ( RULE_ID )
            {
            // InternalPascal.g:6848:2: ( RULE_ID )
            // InternalPascal.g:6849:3: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getNamesIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getNamesIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__NamesAssignment_3_1"


    // $ANTLR start "rule__Constant__StringAssignment_4"
    // InternalPascal.g:6858:1: rule__Constant__StringAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Constant__StringAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6862:1: ( ( RULE_STRING ) )
            // InternalPascal.g:6863:2: ( RULE_STRING )
            {
            // InternalPascal.g:6863:2: ( RULE_STRING )
            // InternalPascal.g:6864:3: RULE_STRING
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


    // $ANTLR start "rule__Variable_declaration_part__VariableAssignment_1"
    // InternalPascal.g:6873:1: rule__Variable_declaration_part__VariableAssignment_1 : ( rulevariable_declaration ) ;
    public final void rule__Variable_declaration_part__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6877:1: ( ( rulevariable_declaration ) )
            // InternalPascal.g:6878:2: ( rulevariable_declaration )
            {
            // InternalPascal.g:6878:2: ( rulevariable_declaration )
            // InternalPascal.g:6879:3: rulevariable_declaration
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
    // InternalPascal.g:6888:1: rule__Variable_declaration_part__VariableAssignment_2_1 : ( rulevariable_declaration ) ;
    public final void rule__Variable_declaration_part__VariableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6892:1: ( ( rulevariable_declaration ) )
            // InternalPascal.g:6893:2: ( rulevariable_declaration )
            {
            // InternalPascal.g:6893:2: ( rulevariable_declaration )
            // InternalPascal.g:6894:3: rulevariable_declaration
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


    // $ANTLR start "rule__Variable_declaration__TypesAssignment_2"
    // InternalPascal.g:6903:1: rule__Variable_declaration__TypesAssignment_2 : ( ruletype ) ;
    public final void rule__Variable_declaration__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6907:1: ( ( ruletype ) )
            // InternalPascal.g:6908:2: ( ruletype )
            {
            // InternalPascal.g:6908:2: ( ruletype )
            // InternalPascal.g:6909:3: ruletype
            {
             before(grammarAccess.getVariable_declarationAccess().getTypesTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getVariable_declarationAccess().getTypesTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__TypesAssignment_2"


    // $ANTLR start "rule__Compound_statement__SequenceAssignment_1"
    // InternalPascal.g:6918:1: rule__Compound_statement__SequenceAssignment_1 : ( rulestatements ) ;
    public final void rule__Compound_statement__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6922:1: ( ( rulestatements ) )
            // InternalPascal.g:6923:2: ( rulestatements )
            {
            // InternalPascal.g:6923:2: ( rulestatements )
            // InternalPascal.g:6924:3: rulestatements
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
    // InternalPascal.g:6933:1: rule__Statements__StatementsAssignment_0 : ( rulestatement ) ;
    public final void rule__Statements__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6937:1: ( ( rulestatement ) )
            // InternalPascal.g:6938:2: ( rulestatement )
            {
            // InternalPascal.g:6938:2: ( rulestatement )
            // InternalPascal.g:6939:3: rulestatement
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
    // InternalPascal.g:6948:1: rule__Statements__StatementsAssignment_1_1 : ( rulestatement ) ;
    public final void rule__Statements__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6952:1: ( ( rulestatement ) )
            // InternalPascal.g:6953:2: ( rulestatement )
            {
            // InternalPascal.g:6953:2: ( rulestatement )
            // InternalPascal.g:6954:3: rulestatement
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


    // $ANTLR start "rule__Statement__LabelAssignment_0_0"
    // InternalPascal.g:6963:1: rule__Statement__LabelAssignment_0_0 : ( rulelabel ) ;
    public final void rule__Statement__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6967:1: ( ( rulelabel ) )
            // InternalPascal.g:6968:2: ( rulelabel )
            {
            // InternalPascal.g:6968:2: ( rulelabel )
            // InternalPascal.g:6969:3: rulelabel
            {
             before(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            rulelabel();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__LabelAssignment_0_0"


    // $ANTLR start "rule__Statement__StatementAssignment_0_2"
    // InternalPascal.g:6978:1: rule__Statement__StatementAssignment_0_2 : ( ruleunlabelled_statement ) ;
    public final void rule__Statement__StatementAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6982:1: ( ( ruleunlabelled_statement ) )
            // InternalPascal.g:6983:2: ( ruleunlabelled_statement )
            {
            // InternalPascal.g:6983:2: ( ruleunlabelled_statement )
            // InternalPascal.g:6984:3: ruleunlabelled_statement
            {
             before(grammarAccess.getStatementAccess().getStatementUnlabelled_statementParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleunlabelled_statement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStatementUnlabelled_statementParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementAssignment_0_2"


    // $ANTLR start "rule__Statement__StatementAssignment_1_1"
    // InternalPascal.g:6993:1: rule__Statement__StatementAssignment_1_1 : ( ruleunlabelled_statement ) ;
    public final void rule__Statement__StatementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6997:1: ( ( ruleunlabelled_statement ) )
            // InternalPascal.g:6998:2: ( ruleunlabelled_statement )
            {
            // InternalPascal.g:6998:2: ( ruleunlabelled_statement )
            // InternalPascal.g:6999:3: ruleunlabelled_statement
            {
             before(grammarAccess.getStatementAccess().getStatementUnlabelled_statementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleunlabelled_statement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStatementUnlabelled_statementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementAssignment_1_1"


    // $ANTLR start "rule__Unlabelled_statement__SimpleAssignment_0"
    // InternalPascal.g:7008:1: rule__Unlabelled_statement__SimpleAssignment_0 : ( rulesimple_statement ) ;
    public final void rule__Unlabelled_statement__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7012:1: ( ( rulesimple_statement ) )
            // InternalPascal.g:7013:2: ( rulesimple_statement )
            {
            // InternalPascal.g:7013:2: ( rulesimple_statement )
            // InternalPascal.g:7014:3: rulesimple_statement
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
    // InternalPascal.g:7023:1: rule__Unlabelled_statement__StructuredAssignment_1 : ( rulestructured_statement ) ;
    public final void rule__Unlabelled_statement__StructuredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7027:1: ( ( rulestructured_statement ) )
            // InternalPascal.g:7028:2: ( rulestructured_statement )
            {
            // InternalPascal.g:7028:2: ( rulestructured_statement )
            // InternalPascal.g:7029:3: rulestructured_statement
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


    // $ANTLR start "rule__Label__NumberAssignment"
    // InternalPascal.g:7038:1: rule__Label__NumberAssignment : ( ruleunsigned_integer ) ;
    public final void rule__Label__NumberAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7042:1: ( ( ruleunsigned_integer ) )
            // InternalPascal.g:7043:2: ( ruleunsigned_integer )
            {
            // InternalPascal.g:7043:2: ( ruleunsigned_integer )
            // InternalPascal.g:7044:3: ruleunsigned_integer
            {
             before(grammarAccess.getLabelAccess().getNumberUnsigned_integerParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleunsigned_integer();

            state._fsp--;

             after(grammarAccess.getLabelAccess().getNumberUnsigned_integerParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__NumberAssignment"


    // $ANTLR start "rule__Simple_statement__AssignmentAssignment_0"
    // InternalPascal.g:7053:1: rule__Simple_statement__AssignmentAssignment_0 : ( ruleassignment_statement ) ;
    public final void rule__Simple_statement__AssignmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7057:1: ( ( ruleassignment_statement ) )
            // InternalPascal.g:7058:2: ( ruleassignment_statement )
            {
            // InternalPascal.g:7058:2: ( ruleassignment_statement )
            // InternalPascal.g:7059:3: ruleassignment_statement
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
    // InternalPascal.g:7068:1: rule__Simple_statement__ProcedureAssignment_1 : ( ruleprocedure_statement ) ;
    public final void rule__Simple_statement__ProcedureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7072:1: ( ( ruleprocedure_statement ) )
            // InternalPascal.g:7073:2: ( ruleprocedure_statement )
            {
            // InternalPascal.g:7073:2: ( ruleprocedure_statement )
            // InternalPascal.g:7074:3: ruleprocedure_statement
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


    // $ANTLR start "rule__Simple_statement__GotoAssignment_2"
    // InternalPascal.g:7083:1: rule__Simple_statement__GotoAssignment_2 : ( rulegoto_statement ) ;
    public final void rule__Simple_statement__GotoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7087:1: ( ( rulegoto_statement ) )
            // InternalPascal.g:7088:2: ( rulegoto_statement )
            {
            // InternalPascal.g:7088:2: ( rulegoto_statement )
            // InternalPascal.g:7089:3: rulegoto_statement
            {
             before(grammarAccess.getSimple_statementAccess().getGotoGoto_statementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulegoto_statement();

            state._fsp--;

             after(grammarAccess.getSimple_statementAccess().getGotoGoto_statementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_statement__GotoAssignment_2"


    // $ANTLR start "rule__Assignment_statement__VariableAssignment_0"
    // InternalPascal.g:7098:1: rule__Assignment_statement__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Assignment_statement__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7102:1: ( ( rulevariable ) )
            // InternalPascal.g:7103:2: ( rulevariable )
            {
            // InternalPascal.g:7103:2: ( rulevariable )
            // InternalPascal.g:7104:3: rulevariable
            {
             before(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulevariable();

            state._fsp--;

             after(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment_statement__VariableAssignment_0"


    // $ANTLR start "rule__Assignment_statement__ExpressionAssignment_2"
    // InternalPascal.g:7113:1: rule__Assignment_statement__ExpressionAssignment_2 : ( ruleexpression ) ;
    public final void rule__Assignment_statement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7117:1: ( ( ruleexpression ) )
            // InternalPascal.g:7118:2: ( ruleexpression )
            {
            // InternalPascal.g:7118:2: ( ruleexpression )
            // InternalPascal.g:7119:3: ruleexpression
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


    // $ANTLR start "rule__Variable__NamesAssignment_0_0_1"
    // InternalPascal.g:7128:1: rule__Variable__NamesAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__Variable__NamesAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7132:1: ( ( RULE_ID ) )
            // InternalPascal.g:7133:2: ( RULE_ID )
            {
            // InternalPascal.g:7133:2: ( RULE_ID )
            // InternalPascal.g:7134:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNamesIDTerminalRuleCall_0_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNamesIDTerminalRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NamesAssignment_0_0_1"


    // $ANTLR start "rule__Variable__NamesAssignment_0_1"
    // InternalPascal.g:7143:1: rule__Variable__NamesAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Variable__NamesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7147:1: ( ( RULE_ID ) )
            // InternalPascal.g:7148:2: ( RULE_ID )
            {
            // InternalPascal.g:7148:2: ( RULE_ID )
            // InternalPascal.g:7149:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNamesIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNamesIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NamesAssignment_0_1"


    // $ANTLR start "rule__Variable__ExpressionAssignment_1_0_1"
    // InternalPascal.g:7158:1: rule__Variable__ExpressionAssignment_1_0_1 : ( ruleexpression ) ;
    public final void rule__Variable__ExpressionAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7162:1: ( ( ruleexpression ) )
            // InternalPascal.g:7163:2: ( ruleexpression )
            {
            // InternalPascal.g:7163:2: ( ruleexpression )
            // InternalPascal.g:7164:3: ruleexpression
            {
             before(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ExpressionAssignment_1_0_1"


    // $ANTLR start "rule__Variable__ExpressionAssignment_1_0_2_1"
    // InternalPascal.g:7173:1: rule__Variable__ExpressionAssignment_1_0_2_1 : ( ruleexpression ) ;
    public final void rule__Variable__ExpressionAssignment_1_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7177:1: ( ( ruleexpression ) )
            // InternalPascal.g:7178:2: ( ruleexpression )
            {
            // InternalPascal.g:7178:2: ( ruleexpression )
            // InternalPascal.g:7179:3: ruleexpression
            {
             before(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ExpressionAssignment_1_0_2_1"


    // $ANTLR start "rule__Variable__ExpressionAssignment_1_1_1"
    // InternalPascal.g:7188:1: rule__Variable__ExpressionAssignment_1_1_1 : ( ruleexpression ) ;
    public final void rule__Variable__ExpressionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7192:1: ( ( ruleexpression ) )
            // InternalPascal.g:7193:2: ( ruleexpression )
            {
            // InternalPascal.g:7193:2: ( ruleexpression )
            // InternalPascal.g:7194:3: ruleexpression
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
    // InternalPascal.g:7203:1: rule__Variable__ExpressionAssignment_1_1_2_1 : ( ruleexpression ) ;
    public final void rule__Variable__ExpressionAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7207:1: ( ( ruleexpression ) )
            // InternalPascal.g:7208:2: ( ruleexpression )
            {
            // InternalPascal.g:7208:2: ( ruleexpression )
            // InternalPascal.g:7209:3: ruleexpression
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


    // $ANTLR start "rule__Variable__NamesAssignment_1_2_1"
    // InternalPascal.g:7218:1: rule__Variable__NamesAssignment_1_2_1 : ( RULE_ID ) ;
    public final void rule__Variable__NamesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7222:1: ( ( RULE_ID ) )
            // InternalPascal.g:7223:2: ( RULE_ID )
            {
            // InternalPascal.g:7223:2: ( RULE_ID )
            // InternalPascal.g:7224:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNamesIDTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNamesIDTerminalRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NamesAssignment_1_2_1"


    // $ANTLR start "rule__Expression__ExpressionsAssignment_0"
    // InternalPascal.g:7233:1: rule__Expression__ExpressionsAssignment_0 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7237:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:7238:2: ( rulesimple_expression )
            {
            // InternalPascal.g:7238:2: ( rulesimple_expression )
            // InternalPascal.g:7239:3: rulesimple_expression
            {
             before(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulesimple_expression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ExpressionsAssignment_0"


    // $ANTLR start "rule__Expression__OperatorsAssignment_1_0"
    // InternalPascal.g:7248:1: rule__Expression__OperatorsAssignment_1_0 : ( rulerelational_operator ) ;
    public final void rule__Expression__OperatorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7252:1: ( ( rulerelational_operator ) )
            // InternalPascal.g:7253:2: ( rulerelational_operator )
            {
            // InternalPascal.g:7253:2: ( rulerelational_operator )
            // InternalPascal.g:7254:3: rulerelational_operator
            {
             before(grammarAccess.getExpressionAccess().getOperatorsRelational_operatorParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulerelational_operator();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOperatorsRelational_operatorParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__OperatorsAssignment_1_0"


    // $ANTLR start "rule__Expression__ExpressionsAssignment_1_1"
    // InternalPascal.g:7263:1: rule__Expression__ExpressionsAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__Expression__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7267:1: ( ( ruleexpression ) )
            // InternalPascal.g:7268:2: ( ruleexpression )
            {
            // InternalPascal.g:7268:2: ( ruleexpression )
            // InternalPascal.g:7269:3: ruleexpression
            {
             before(grammarAccess.getExpressionAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ExpressionsAssignment_1_1"


    // $ANTLR start "rule__Simple_expression__TermsAssignment_0"
    // InternalPascal.g:7278:1: rule__Simple_expression__TermsAssignment_0 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7282:1: ( ( ruleterm ) )
            // InternalPascal.g:7283:2: ( ruleterm )
            {
            // InternalPascal.g:7283:2: ( ruleterm )
            // InternalPascal.g:7284:3: ruleterm
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__TermsAssignment_0"


    // $ANTLR start "rule__Simple_expression__OperatorsAssignment_1_0"
    // InternalPascal.g:7293:1: rule__Simple_expression__OperatorsAssignment_1_0 : ( ruleadditive_operator ) ;
    public final void rule__Simple_expression__OperatorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7297:1: ( ( ruleadditive_operator ) )
            // InternalPascal.g:7298:2: ( ruleadditive_operator )
            {
            // InternalPascal.g:7298:2: ( ruleadditive_operator )
            // InternalPascal.g:7299:3: ruleadditive_operator
            {
             before(grammarAccess.getSimple_expressionAccess().getOperatorsAdditive_operatorParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleadditive_operator();

            state._fsp--;

             after(grammarAccess.getSimple_expressionAccess().getOperatorsAdditive_operatorParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__OperatorsAssignment_1_0"


    // $ANTLR start "rule__Simple_expression__ExpressionAssignment_1_1"
    // InternalPascal.g:7308:1: rule__Simple_expression__ExpressionAssignment_1_1 : ( rulesimple_expression ) ;
    public final void rule__Simple_expression__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7312:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:7313:2: ( rulesimple_expression )
            {
            // InternalPascal.g:7313:2: ( rulesimple_expression )
            // InternalPascal.g:7314:3: rulesimple_expression
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


    // $ANTLR start "rule__Term__FactorsAssignment_0"
    // InternalPascal.g:7323:1: rule__Term__FactorsAssignment_0 : ( rulesigned_factor ) ;
    public final void rule__Term__FactorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7327:1: ( ( rulesigned_factor ) )
            // InternalPascal.g:7328:2: ( rulesigned_factor )
            {
            // InternalPascal.g:7328:2: ( rulesigned_factor )
            // InternalPascal.g:7329:3: rulesigned_factor
            {
             before(grammarAccess.getTermAccess().getFactorsSigned_factorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulesigned_factor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getFactorsSigned_factorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__FactorsAssignment_0"


    // $ANTLR start "rule__Term__OperatorsAssignment_1_0"
    // InternalPascal.g:7338:1: rule__Term__OperatorsAssignment_1_0 : ( rulemultiplicative_operator ) ;
    public final void rule__Term__OperatorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7342:1: ( ( rulemultiplicative_operator ) )
            // InternalPascal.g:7343:2: ( rulemultiplicative_operator )
            {
            // InternalPascal.g:7343:2: ( rulemultiplicative_operator )
            // InternalPascal.g:7344:3: rulemultiplicative_operator
            {
             before(grammarAccess.getTermAccess().getOperatorsMultiplicative_operatorParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulemultiplicative_operator();

            state._fsp--;

             after(grammarAccess.getTermAccess().getOperatorsMultiplicative_operatorParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__OperatorsAssignment_1_0"


    // $ANTLR start "rule__Term__TermsAssignment_1_1"
    // InternalPascal.g:7353:1: rule__Term__TermsAssignment_1_1 : ( ruleterm ) ;
    public final void rule__Term__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7357:1: ( ( ruleterm ) )
            // InternalPascal.g:7358:2: ( ruleterm )
            {
            // InternalPascal.g:7358:2: ( ruleterm )
            // InternalPascal.g:7359:3: ruleterm
            {
             before(grammarAccess.getTermAccess().getTermsTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getTermAccess().getTermsTermParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__TermsAssignment_1_1"


    // $ANTLR start "rule__Signed_factor__OperatorsAssignment_0_0"
    // InternalPascal.g:7368:1: rule__Signed_factor__OperatorsAssignment_0_0 : ( RULE_PLUS ) ;
    public final void rule__Signed_factor__OperatorsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7372:1: ( ( RULE_PLUS ) )
            // InternalPascal.g:7373:2: ( RULE_PLUS )
            {
            // InternalPascal.g:7373:2: ( RULE_PLUS )
            // InternalPascal.g:7374:3: RULE_PLUS
            {
             before(grammarAccess.getSigned_factorAccess().getOperatorsPLUSTerminalRuleCall_0_0_0()); 
            match(input,RULE_PLUS,FOLLOW_2); 
             after(grammarAccess.getSigned_factorAccess().getOperatorsPLUSTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_factor__OperatorsAssignment_0_0"


    // $ANTLR start "rule__Signed_factor__OperatorsAssignment_0_1"
    // InternalPascal.g:7383:1: rule__Signed_factor__OperatorsAssignment_0_1 : ( RULE_MINUS ) ;
    public final void rule__Signed_factor__OperatorsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7387:1: ( ( RULE_MINUS ) )
            // InternalPascal.g:7388:2: ( RULE_MINUS )
            {
            // InternalPascal.g:7388:2: ( RULE_MINUS )
            // InternalPascal.g:7389:3: RULE_MINUS
            {
             before(grammarAccess.getSigned_factorAccess().getOperatorsMINUSTerminalRuleCall_0_1_0()); 
            match(input,RULE_MINUS,FOLLOW_2); 
             after(grammarAccess.getSigned_factorAccess().getOperatorsMINUSTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_factor__OperatorsAssignment_0_1"


    // $ANTLR start "rule__Signed_factor__FactorsAssignment_1"
    // InternalPascal.g:7398:1: rule__Signed_factor__FactorsAssignment_1 : ( rulefactor ) ;
    public final void rule__Signed_factor__FactorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7402:1: ( ( rulefactor ) )
            // InternalPascal.g:7403:2: ( rulefactor )
            {
            // InternalPascal.g:7403:2: ( rulefactor )
            // InternalPascal.g:7404:3: rulefactor
            {
             before(grammarAccess.getSigned_factorAccess().getFactorsFactorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getSigned_factorAccess().getFactorsFactorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_factor__FactorsAssignment_1"


    // $ANTLR start "rule__Factor__VariableAssignment_0"
    // InternalPascal.g:7413:1: rule__Factor__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Factor__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7417:1: ( ( rulevariable ) )
            // InternalPascal.g:7418:2: ( rulevariable )
            {
            // InternalPascal.g:7418:2: ( rulevariable )
            // InternalPascal.g:7419:3: rulevariable
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
    // InternalPascal.g:7428:1: rule__Factor__ExpressionAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__Factor__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7432:1: ( ( ruleexpression ) )
            // InternalPascal.g:7433:2: ( ruleexpression )
            {
            // InternalPascal.g:7433:2: ( ruleexpression )
            // InternalPascal.g:7434:3: ruleexpression
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


    // $ANTLR start "rule__Factor__ConstantAssignment_3"
    // InternalPascal.g:7443:1: rule__Factor__ConstantAssignment_3 : ( ruleunsigned_constant ) ;
    public final void rule__Factor__ConstantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7447:1: ( ( ruleunsigned_constant ) )
            // InternalPascal.g:7448:2: ( ruleunsigned_constant )
            {
            // InternalPascal.g:7448:2: ( ruleunsigned_constant )
            // InternalPascal.g:7449:3: ruleunsigned_constant
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


    // $ANTLR start "rule__Factor__SetAssignment_4"
    // InternalPascal.g:7458:1: rule__Factor__SetAssignment_4 : ( ruleset ) ;
    public final void rule__Factor__SetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7462:1: ( ( ruleset ) )
            // InternalPascal.g:7463:2: ( ruleset )
            {
            // InternalPascal.g:7463:2: ( ruleset )
            // InternalPascal.g:7464:3: ruleset
            {
             before(grammarAccess.getFactorAccess().getSetSetParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleset();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getSetSetParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__SetAssignment_4"


    // $ANTLR start "rule__Factor__FactorAssignment_5_1"
    // InternalPascal.g:7473:1: rule__Factor__FactorAssignment_5_1 : ( rulefactor ) ;
    public final void rule__Factor__FactorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7477:1: ( ( rulefactor ) )
            // InternalPascal.g:7478:2: ( rulefactor )
            {
            // InternalPascal.g:7478:2: ( rulefactor )
            // InternalPascal.g:7479:3: rulefactor
            {
             before(grammarAccess.getFactorAccess().getFactorFactorParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getFactorFactorParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__FactorAssignment_5_1"


    // $ANTLR start "rule__Factor__BooleanAssignment_6"
    // InternalPascal.g:7488:1: rule__Factor__BooleanAssignment_6 : ( rulebool ) ;
    public final void rule__Factor__BooleanAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7492:1: ( ( rulebool ) )
            // InternalPascal.g:7493:2: ( rulebool )
            {
            // InternalPascal.g:7493:2: ( rulebool )
            // InternalPascal.g:7494:3: rulebool
            {
             before(grammarAccess.getFactorAccess().getBooleanBoolParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulebool();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getBooleanBoolParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__BooleanAssignment_6"


    // $ANTLR start "rule__Set__ElementsAssignment_0_1"
    // InternalPascal.g:7503:1: rule__Set__ElementsAssignment_0_1 : ( ruleelementList ) ;
    public final void rule__Set__ElementsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7507:1: ( ( ruleelementList ) )
            // InternalPascal.g:7508:2: ( ruleelementList )
            {
            // InternalPascal.g:7508:2: ( ruleelementList )
            // InternalPascal.g:7509:3: ruleelementList
            {
             before(grammarAccess.getSetAccess().getElementsElementListParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleelementList();

            state._fsp--;

             after(grammarAccess.getSetAccess().getElementsElementListParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__ElementsAssignment_0_1"


    // $ANTLR start "rule__Set__ElementsAssignment_1_1"
    // InternalPascal.g:7518:1: rule__Set__ElementsAssignment_1_1 : ( ruleelementList ) ;
    public final void rule__Set__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7522:1: ( ( ruleelementList ) )
            // InternalPascal.g:7523:2: ( ruleelementList )
            {
            // InternalPascal.g:7523:2: ( ruleelementList )
            // InternalPascal.g:7524:3: ruleelementList
            {
             before(grammarAccess.getSetAccess().getElementsElementListParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleelementList();

            state._fsp--;

             after(grammarAccess.getSetAccess().getElementsElementListParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__ElementsAssignment_1_1"


    // $ANTLR start "rule__ElementList__ElementsAssignment_0"
    // InternalPascal.g:7533:1: rule__ElementList__ElementsAssignment_0 : ( ruleelement ) ;
    public final void rule__ElementList__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7537:1: ( ( ruleelement ) )
            // InternalPascal.g:7538:2: ( ruleelement )
            {
            // InternalPascal.g:7538:2: ( ruleelement )
            // InternalPascal.g:7539:3: ruleelement
            {
             before(grammarAccess.getElementListAccess().getElementsElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleelement();

            state._fsp--;

             after(grammarAccess.getElementListAccess().getElementsElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementList__ElementsAssignment_0"


    // $ANTLR start "rule__ElementList__ElementsAssignment_1_1"
    // InternalPascal.g:7548:1: rule__ElementList__ElementsAssignment_1_1 : ( ruleelement ) ;
    public final void rule__ElementList__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7552:1: ( ( ruleelement ) )
            // InternalPascal.g:7553:2: ( ruleelement )
            {
            // InternalPascal.g:7553:2: ( ruleelement )
            // InternalPascal.g:7554:3: ruleelement
            {
             before(grammarAccess.getElementListAccess().getElementsElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleelement();

            state._fsp--;

             after(grammarAccess.getElementListAccess().getElementsElementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementList__ElementsAssignment_1_1"


    // $ANTLR start "rule__Element__ExpressionsAssignment_0"
    // InternalPascal.g:7563:1: rule__Element__ExpressionsAssignment_0 : ( ruleexpression ) ;
    public final void rule__Element__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7567:1: ( ( ruleexpression ) )
            // InternalPascal.g:7568:2: ( ruleexpression )
            {
            // InternalPascal.g:7568:2: ( ruleexpression )
            // InternalPascal.g:7569:3: ruleexpression
            {
             before(grammarAccess.getElementAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getElementAccess().getExpressionsExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__ExpressionsAssignment_0"


    // $ANTLR start "rule__Element__DotdotAssignment_1_0"
    // InternalPascal.g:7578:1: rule__Element__DotdotAssignment_1_0 : ( RULE_DOTDOT ) ;
    public final void rule__Element__DotdotAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7582:1: ( ( RULE_DOTDOT ) )
            // InternalPascal.g:7583:2: ( RULE_DOTDOT )
            {
            // InternalPascal.g:7583:2: ( RULE_DOTDOT )
            // InternalPascal.g:7584:3: RULE_DOTDOT
            {
             before(grammarAccess.getElementAccess().getDotdotDOTDOTTerminalRuleCall_1_0_0()); 
            match(input,RULE_DOTDOT,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getDotdotDOTDOTTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__DotdotAssignment_1_0"


    // $ANTLR start "rule__Element__ExpressionsAssignment_1_1"
    // InternalPascal.g:7593:1: rule__Element__ExpressionsAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__Element__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7597:1: ( ( ruleexpression ) )
            // InternalPascal.g:7598:2: ( ruleexpression )
            {
            // InternalPascal.g:7598:2: ( ruleexpression )
            // InternalPascal.g:7599:3: ruleexpression
            {
             before(grammarAccess.getElementAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getElementAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__ExpressionsAssignment_1_1"


    // $ANTLR start "rule__Type__TypeAssignment"
    // InternalPascal.g:7608:1: rule__Type__TypeAssignment : ( rulesimple_type ) ;
    public final void rule__Type__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7612:1: ( ( rulesimple_type ) )
            // InternalPascal.g:7613:2: ( rulesimple_type )
            {
            // InternalPascal.g:7613:2: ( rulesimple_type )
            // InternalPascal.g:7614:3: rulesimple_type
            {
             before(grammarAccess.getTypeAccess().getTypeSimple_typeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulesimple_type();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTypeSimple_typeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeAssignment"


    // $ANTLR start "rule__Simple_type__TypesAssignment_0"
    // InternalPascal.g:7623:1: rule__Simple_type__TypesAssignment_0 : ( rulescalar_type ) ;
    public final void rule__Simple_type__TypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7627:1: ( ( rulescalar_type ) )
            // InternalPascal.g:7628:2: ( rulescalar_type )
            {
            // InternalPascal.g:7628:2: ( rulescalar_type )
            // InternalPascal.g:7629:3: rulescalar_type
            {
             before(grammarAccess.getSimple_typeAccess().getTypesScalar_typeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulescalar_type();

            state._fsp--;

             after(grammarAccess.getSimple_typeAccess().getTypesScalar_typeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_type__TypesAssignment_0"


    // $ANTLR start "rule__Simple_type__TypesAssignment_1"
    // InternalPascal.g:7638:1: rule__Simple_type__TypesAssignment_1 : ( rulesubrange_type ) ;
    public final void rule__Simple_type__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7642:1: ( ( rulesubrange_type ) )
            // InternalPascal.g:7643:2: ( rulesubrange_type )
            {
            // InternalPascal.g:7643:2: ( rulesubrange_type )
            // InternalPascal.g:7644:3: rulesubrange_type
            {
             before(grammarAccess.getSimple_typeAccess().getTypesSubrange_typeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulesubrange_type();

            state._fsp--;

             after(grammarAccess.getSimple_typeAccess().getTypesSubrange_typeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_type__TypesAssignment_1"


    // $ANTLR start "rule__Simple_type__TypesAssignment_2"
    // InternalPascal.g:7653:1: rule__Simple_type__TypesAssignment_2 : ( ruletype_identifier ) ;
    public final void rule__Simple_type__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7657:1: ( ( ruletype_identifier ) )
            // InternalPascal.g:7658:2: ( ruletype_identifier )
            {
            // InternalPascal.g:7658:2: ( ruletype_identifier )
            // InternalPascal.g:7659:3: ruletype_identifier
            {
             before(grammarAccess.getSimple_typeAccess().getTypesType_identifierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruletype_identifier();

            state._fsp--;

             after(grammarAccess.getSimple_typeAccess().getTypesType_identifierParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_type__TypesAssignment_2"


    // $ANTLR start "rule__Simple_type__TypesAssignment_3"
    // InternalPascal.g:7668:1: rule__Simple_type__TypesAssignment_3 : ( rulestring_type ) ;
    public final void rule__Simple_type__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7672:1: ( ( rulestring_type ) )
            // InternalPascal.g:7673:2: ( rulestring_type )
            {
            // InternalPascal.g:7673:2: ( rulestring_type )
            // InternalPascal.g:7674:3: rulestring_type
            {
             before(grammarAccess.getSimple_typeAccess().getTypesString_typeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulestring_type();

            state._fsp--;

             after(grammarAccess.getSimple_typeAccess().getTypesString_typeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_type__TypesAssignment_3"


    // $ANTLR start "rule__Subrange_type__ConstantsAssignment_0"
    // InternalPascal.g:7683:1: rule__Subrange_type__ConstantsAssignment_0 : ( ruleconstant ) ;
    public final void rule__Subrange_type__ConstantsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7687:1: ( ( ruleconstant ) )
            // InternalPascal.g:7688:2: ( ruleconstant )
            {
            // InternalPascal.g:7688:2: ( ruleconstant )
            // InternalPascal.g:7689:3: ruleconstant
            {
             before(grammarAccess.getSubrange_typeAccess().getConstantsConstantParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getSubrange_typeAccess().getConstantsConstantParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__ConstantsAssignment_0"


    // $ANTLR start "rule__Subrange_type__ConstantsAssignment_2"
    // InternalPascal.g:7698:1: rule__Subrange_type__ConstantsAssignment_2 : ( ruleconstant ) ;
    public final void rule__Subrange_type__ConstantsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7702:1: ( ( ruleconstant ) )
            // InternalPascal.g:7703:2: ( ruleconstant )
            {
            // InternalPascal.g:7703:2: ( ruleconstant )
            // InternalPascal.g:7704:3: ruleconstant
            {
             before(grammarAccess.getSubrange_typeAccess().getConstantsConstantParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getSubrange_typeAccess().getConstantsConstantParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__ConstantsAssignment_2"


    // $ANTLR start "rule__Type_identifier__NamesAssignment_0"
    // InternalPascal.g:7713:1: rule__Type_identifier__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Type_identifier__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7717:1: ( ( RULE_ID ) )
            // InternalPascal.g:7718:2: ( RULE_ID )
            {
            // InternalPascal.g:7718:2: ( RULE_ID )
            // InternalPascal.g:7719:3: RULE_ID
            {
             before(grammarAccess.getType_identifierAccess().getNamesIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getType_identifierAccess().getNamesIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_identifier__NamesAssignment_0"


    // $ANTLR start "rule__Type_identifier__TypeAssignment_1_0"
    // InternalPascal.g:7728:1: rule__Type_identifier__TypeAssignment_1_0 : ( ( 'CHAR' ) ) ;
    public final void rule__Type_identifier__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7732:1: ( ( ( 'CHAR' ) ) )
            // InternalPascal.g:7733:2: ( ( 'CHAR' ) )
            {
            // InternalPascal.g:7733:2: ( ( 'CHAR' ) )
            // InternalPascal.g:7734:3: ( 'CHAR' )
            {
             before(grammarAccess.getType_identifierAccess().getTypeCHARKeyword_1_0_0()); 
            // InternalPascal.g:7735:3: ( 'CHAR' )
            // InternalPascal.g:7736:4: 'CHAR'
            {
             before(grammarAccess.getType_identifierAccess().getTypeCHARKeyword_1_0_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getType_identifierAccess().getTypeCHARKeyword_1_0_0()); 

            }

             after(grammarAccess.getType_identifierAccess().getTypeCHARKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_identifier__TypeAssignment_1_0"


    // $ANTLR start "rule__Type_identifier__TypeAssignment_1_1"
    // InternalPascal.g:7747:1: rule__Type_identifier__TypeAssignment_1_1 : ( ( 'boolean' ) ) ;
    public final void rule__Type_identifier__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7751:1: ( ( ( 'boolean' ) ) )
            // InternalPascal.g:7752:2: ( ( 'boolean' ) )
            {
            // InternalPascal.g:7752:2: ( ( 'boolean' ) )
            // InternalPascal.g:7753:3: ( 'boolean' )
            {
             before(grammarAccess.getType_identifierAccess().getTypeBooleanKeyword_1_1_0()); 
            // InternalPascal.g:7754:3: ( 'boolean' )
            // InternalPascal.g:7755:4: 'boolean'
            {
             before(grammarAccess.getType_identifierAccess().getTypeBooleanKeyword_1_1_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getType_identifierAccess().getTypeBooleanKeyword_1_1_0()); 

            }

             after(grammarAccess.getType_identifierAccess().getTypeBooleanKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_identifier__TypeAssignment_1_1"


    // $ANTLR start "rule__Type_identifier__TypeAssignment_1_2"
    // InternalPascal.g:7766:1: rule__Type_identifier__TypeAssignment_1_2 : ( ( 'integer' ) ) ;
    public final void rule__Type_identifier__TypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7770:1: ( ( ( 'integer' ) ) )
            // InternalPascal.g:7771:2: ( ( 'integer' ) )
            {
            // InternalPascal.g:7771:2: ( ( 'integer' ) )
            // InternalPascal.g:7772:3: ( 'integer' )
            {
             before(grammarAccess.getType_identifierAccess().getTypeIntegerKeyword_1_2_0()); 
            // InternalPascal.g:7773:3: ( 'integer' )
            // InternalPascal.g:7774:4: 'integer'
            {
             before(grammarAccess.getType_identifierAccess().getTypeIntegerKeyword_1_2_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getType_identifierAccess().getTypeIntegerKeyword_1_2_0()); 

            }

             after(grammarAccess.getType_identifierAccess().getTypeIntegerKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_identifier__TypeAssignment_1_2"


    // $ANTLR start "rule__Type_identifier__TypeAssignment_1_3"
    // InternalPascal.g:7785:1: rule__Type_identifier__TypeAssignment_1_3 : ( ( 'real' ) ) ;
    public final void rule__Type_identifier__TypeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7789:1: ( ( ( 'real' ) ) )
            // InternalPascal.g:7790:2: ( ( 'real' ) )
            {
            // InternalPascal.g:7790:2: ( ( 'real' ) )
            // InternalPascal.g:7791:3: ( 'real' )
            {
             before(grammarAccess.getType_identifierAccess().getTypeRealKeyword_1_3_0()); 
            // InternalPascal.g:7792:3: ( 'real' )
            // InternalPascal.g:7793:4: 'real'
            {
             before(grammarAccess.getType_identifierAccess().getTypeRealKeyword_1_3_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getType_identifierAccess().getTypeRealKeyword_1_3_0()); 

            }

             after(grammarAccess.getType_identifierAccess().getTypeRealKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_identifier__TypeAssignment_1_3"


    // $ANTLR start "rule__Type_identifier__TypeAssignment_1_4"
    // InternalPascal.g:7804:1: rule__Type_identifier__TypeAssignment_1_4 : ( ( 'string' ) ) ;
    public final void rule__Type_identifier__TypeAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7808:1: ( ( ( 'string' ) ) )
            // InternalPascal.g:7809:2: ( ( 'string' ) )
            {
            // InternalPascal.g:7809:2: ( ( 'string' ) )
            // InternalPascal.g:7810:3: ( 'string' )
            {
             before(grammarAccess.getType_identifierAccess().getTypeStringKeyword_1_4_0()); 
            // InternalPascal.g:7811:3: ( 'string' )
            // InternalPascal.g:7812:4: 'string'
            {
             before(grammarAccess.getType_identifierAccess().getTypeStringKeyword_1_4_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getType_identifierAccess().getTypeStringKeyword_1_4_0()); 

            }

             after(grammarAccess.getType_identifierAccess().getTypeStringKeyword_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_identifier__TypeAssignment_1_4"


    // $ANTLR start "rule__String_type__NamesAssignment_2_0"
    // InternalPascal.g:7823:1: rule__String_type__NamesAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__String_type__NamesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7827:1: ( ( RULE_ID ) )
            // InternalPascal.g:7828:2: ( RULE_ID )
            {
            // InternalPascal.g:7828:2: ( RULE_ID )
            // InternalPascal.g:7829:3: RULE_ID
            {
             before(grammarAccess.getString_typeAccess().getNamesIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getString_typeAccess().getNamesIDTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String_type__NamesAssignment_2_0"


    // $ANTLR start "rule__String_type__NumberAssignment_2_1"
    // InternalPascal.g:7838:1: rule__String_type__NumberAssignment_2_1 : ( ruleunsigned_number ) ;
    public final void rule__String_type__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7842:1: ( ( ruleunsigned_number ) )
            // InternalPascal.g:7843:2: ( ruleunsigned_number )
            {
            // InternalPascal.g:7843:2: ( ruleunsigned_number )
            // InternalPascal.g:7844:3: ruleunsigned_number
            {
             before(grammarAccess.getString_typeAccess().getNumberUnsigned_numberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleunsigned_number();

            state._fsp--;

             after(grammarAccess.getString_typeAccess().getNumberUnsigned_numberParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String_type__NumberAssignment_2_1"


    // $ANTLR start "rule__Unsigned_constant__NumberAssignment_0"
    // InternalPascal.g:7853:1: rule__Unsigned_constant__NumberAssignment_0 : ( ruleunsigned_number ) ;
    public final void rule__Unsigned_constant__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7857:1: ( ( ruleunsigned_number ) )
            // InternalPascal.g:7858:2: ( ruleunsigned_number )
            {
            // InternalPascal.g:7858:2: ( ruleunsigned_number )
            // InternalPascal.g:7859:3: ruleunsigned_number
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


    // $ANTLR start "rule__Unsigned_constant__CharAssignment_1"
    // InternalPascal.g:7868:1: rule__Unsigned_constant__CharAssignment_1 : ( ruleconstant_chr ) ;
    public final void rule__Unsigned_constant__CharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7872:1: ( ( ruleconstant_chr ) )
            // InternalPascal.g:7873:2: ( ruleconstant_chr )
            {
            // InternalPascal.g:7873:2: ( ruleconstant_chr )
            // InternalPascal.g:7874:3: ruleconstant_chr
            {
             before(grammarAccess.getUnsigned_constantAccess().getCharConstant_chrParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant_chr();

            state._fsp--;

             after(grammarAccess.getUnsigned_constantAccess().getCharConstant_chrParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unsigned_constant__CharAssignment_1"


    // $ANTLR start "rule__Unsigned_constant__StringAssignment_2"
    // InternalPascal.g:7883:1: rule__Unsigned_constant__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Unsigned_constant__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7887:1: ( ( RULE_STRING ) )
            // InternalPascal.g:7888:2: ( RULE_STRING )
            {
            // InternalPascal.g:7888:2: ( RULE_STRING )
            // InternalPascal.g:7889:3: RULE_STRING
            {
             before(grammarAccess.getUnsigned_constantAccess().getStringSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUnsigned_constantAccess().getStringSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unsigned_constant__StringAssignment_2"


    // $ANTLR start "rule__Unsigned_constant__NilAssignment_3"
    // InternalPascal.g:7898:1: rule__Unsigned_constant__NilAssignment_3 : ( RULE_NIL ) ;
    public final void rule__Unsigned_constant__NilAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7902:1: ( ( RULE_NIL ) )
            // InternalPascal.g:7903:2: ( RULE_NIL )
            {
            // InternalPascal.g:7903:2: ( RULE_NIL )
            // InternalPascal.g:7904:3: RULE_NIL
            {
             before(grammarAccess.getUnsigned_constantAccess().getNilNILTerminalRuleCall_3_0()); 
            match(input,RULE_NIL,FOLLOW_2); 
             after(grammarAccess.getUnsigned_constantAccess().getNilNILTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unsigned_constant__NilAssignment_3"


    // $ANTLR start "rule__Unsigned_number__NumbersAssignment_0"
    // InternalPascal.g:7913:1: rule__Unsigned_number__NumbersAssignment_0 : ( ruleunsigned_integer ) ;
    public final void rule__Unsigned_number__NumbersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7917:1: ( ( ruleunsigned_integer ) )
            // InternalPascal.g:7918:2: ( ruleunsigned_integer )
            {
            // InternalPascal.g:7918:2: ( ruleunsigned_integer )
            // InternalPascal.g:7919:3: ruleunsigned_integer
            {
             before(grammarAccess.getUnsigned_numberAccess().getNumbersUnsigned_integerParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleunsigned_integer();

            state._fsp--;

             after(grammarAccess.getUnsigned_numberAccess().getNumbersUnsigned_integerParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unsigned_number__NumbersAssignment_0"


    // $ANTLR start "rule__Unsigned_number__NumbersAssignment_1"
    // InternalPascal.g:7928:1: rule__Unsigned_number__NumbersAssignment_1 : ( ruleunsigned_real ) ;
    public final void rule__Unsigned_number__NumbersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7932:1: ( ( ruleunsigned_real ) )
            // InternalPascal.g:7933:2: ( ruleunsigned_real )
            {
            // InternalPascal.g:7933:2: ( ruleunsigned_real )
            // InternalPascal.g:7934:3: ruleunsigned_real
            {
             before(grammarAccess.getUnsigned_numberAccess().getNumbersUnsigned_realParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleunsigned_real();

            state._fsp--;

             after(grammarAccess.getUnsigned_numberAccess().getNumbersUnsigned_realParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unsigned_number__NumbersAssignment_1"


    // $ANTLR start "rule__Constant_chr__NumbersAssignment_2"
    // InternalPascal.g:7943:1: rule__Constant_chr__NumbersAssignment_2 : ( ruleunsigned_integer ) ;
    public final void rule__Constant_chr__NumbersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7947:1: ( ( ruleunsigned_integer ) )
            // InternalPascal.g:7948:2: ( ruleunsigned_integer )
            {
            // InternalPascal.g:7948:2: ( ruleunsigned_integer )
            // InternalPascal.g:7949:3: ruleunsigned_integer
            {
             before(grammarAccess.getConstant_chrAccess().getNumbersUnsigned_integerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleunsigned_integer();

            state._fsp--;

             after(grammarAccess.getConstant_chrAccess().getNumbersUnsigned_integerParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_chr__NumbersAssignment_2"


    // $ANTLR start "rule__Procedure_statement__NamesAssignment_0"
    // InternalPascal.g:7958:1: rule__Procedure_statement__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Procedure_statement__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7962:1: ( ( RULE_ID ) )
            // InternalPascal.g:7963:2: ( RULE_ID )
            {
            // InternalPascal.g:7963:2: ( RULE_ID )
            // InternalPascal.g:7964:3: RULE_ID
            {
             before(grammarAccess.getProcedure_statementAccess().getNamesIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcedure_statementAccess().getNamesIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_statement__NamesAssignment_0"


    // $ANTLR start "rule__Procedure_statement__TypesAssignment_1_1"
    // InternalPascal.g:7973:1: rule__Procedure_statement__TypesAssignment_1_1 : ( ruleparameter_list ) ;
    public final void rule__Procedure_statement__TypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7977:1: ( ( ruleparameter_list ) )
            // InternalPascal.g:7978:2: ( ruleparameter_list )
            {
            // InternalPascal.g:7978:2: ( ruleparameter_list )
            // InternalPascal.g:7979:3: ruleparameter_list
            {
             before(grammarAccess.getProcedure_statementAccess().getTypesParameter_listParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleparameter_list();

            state._fsp--;

             after(grammarAccess.getProcedure_statementAccess().getTypesParameter_listParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_statement__TypesAssignment_1_1"


    // $ANTLR start "rule__Parameter_list__TypesAssignment_1_1"
    // InternalPascal.g:7988:1: rule__Parameter_list__TypesAssignment_1_1 : ( ruleactual_parameter ) ;
    public final void rule__Parameter_list__TypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7992:1: ( ( ruleactual_parameter ) )
            // InternalPascal.g:7993:2: ( ruleactual_parameter )
            {
            // InternalPascal.g:7993:2: ( ruleactual_parameter )
            // InternalPascal.g:7994:3: ruleactual_parameter
            {
             before(grammarAccess.getParameter_listAccess().getTypesActual_parameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleactual_parameter();

            state._fsp--;

             after(grammarAccess.getParameter_listAccess().getTypesActual_parameterParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__TypesAssignment_1_1"


    // $ANTLR start "rule__Procedure_declaration__NamesAssignment_1"
    // InternalPascal.g:8003:1: rule__Procedure_declaration__NamesAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure_declaration__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8007:1: ( ( RULE_ID ) )
            // InternalPascal.g:8008:2: ( RULE_ID )
            {
            // InternalPascal.g:8008:2: ( RULE_ID )
            // InternalPascal.g:8009:3: RULE_ID
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


    // $ANTLR start "rule__Procedure_declaration__TypesAssignment_2"
    // InternalPascal.g:8018:1: rule__Procedure_declaration__TypesAssignment_2 : ( ruleformal_parameter_list ) ;
    public final void rule__Procedure_declaration__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8022:1: ( ( ruleformal_parameter_list ) )
            // InternalPascal.g:8023:2: ( ruleformal_parameter_list )
            {
            // InternalPascal.g:8023:2: ( ruleformal_parameter_list )
            // InternalPascal.g:8024:3: ruleformal_parameter_list
            {
             before(grammarAccess.getProcedure_declarationAccess().getTypesFormal_parameter_listParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleformal_parameter_list();

            state._fsp--;

             after(grammarAccess.getProcedure_declarationAccess().getTypesFormal_parameter_listParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__TypesAssignment_2"


    // $ANTLR start "rule__Procedure_declaration__BlockAssignment_4"
    // InternalPascal.g:8033:1: rule__Procedure_declaration__BlockAssignment_4 : ( ruleblock ) ;
    public final void rule__Procedure_declaration__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8037:1: ( ( ruleblock ) )
            // InternalPascal.g:8038:2: ( ruleblock )
            {
            // InternalPascal.g:8038:2: ( ruleblock )
            // InternalPascal.g:8039:3: ruleblock
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


    // $ANTLR start "rule__Procedure_type__TypesAssignment_2"
    // InternalPascal.g:8048:1: rule__Procedure_type__TypesAssignment_2 : ( ruleformal_parameter_list ) ;
    public final void rule__Procedure_type__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8052:1: ( ( ruleformal_parameter_list ) )
            // InternalPascal.g:8053:2: ( ruleformal_parameter_list )
            {
            // InternalPascal.g:8053:2: ( ruleformal_parameter_list )
            // InternalPascal.g:8054:3: ruleformal_parameter_list
            {
             before(grammarAccess.getProcedure_typeAccess().getTypesFormal_parameter_listParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleformal_parameter_list();

            state._fsp--;

             after(grammarAccess.getProcedure_typeAccess().getTypesFormal_parameter_listParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_type__TypesAssignment_2"


    // $ANTLR start "rule__Function_declaration__NamesAssignment_1"
    // InternalPascal.g:8063:1: rule__Function_declaration__NamesAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function_declaration__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8067:1: ( ( RULE_ID ) )
            // InternalPascal.g:8068:2: ( RULE_ID )
            {
            // InternalPascal.g:8068:2: ( RULE_ID )
            // InternalPascal.g:8069:3: RULE_ID
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


    // $ANTLR start "rule__Function_declaration__TypesAssignment_2"
    // InternalPascal.g:8078:1: rule__Function_declaration__TypesAssignment_2 : ( ruleformal_parameter_list ) ;
    public final void rule__Function_declaration__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8082:1: ( ( ruleformal_parameter_list ) )
            // InternalPascal.g:8083:2: ( ruleformal_parameter_list )
            {
            // InternalPascal.g:8083:2: ( ruleformal_parameter_list )
            // InternalPascal.g:8084:3: ruleformal_parameter_list
            {
             before(grammarAccess.getFunction_declarationAccess().getTypesFormal_parameter_listParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleformal_parameter_list();

            state._fsp--;

             after(grammarAccess.getFunction_declarationAccess().getTypesFormal_parameter_listParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__TypesAssignment_2"


    // $ANTLR start "rule__Function_declaration__TypesAssignment_4"
    // InternalPascal.g:8093:1: rule__Function_declaration__TypesAssignment_4 : ( ruleresult_type ) ;
    public final void rule__Function_declaration__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8097:1: ( ( ruleresult_type ) )
            // InternalPascal.g:8098:2: ( ruleresult_type )
            {
            // InternalPascal.g:8098:2: ( ruleresult_type )
            // InternalPascal.g:8099:3: ruleresult_type
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
    // InternalPascal.g:8108:1: rule__Function_declaration__BlockAssignment_6 : ( ruleblock ) ;
    public final void rule__Function_declaration__BlockAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8112:1: ( ( ruleblock ) )
            // InternalPascal.g:8113:2: ( ruleblock )
            {
            // InternalPascal.g:8113:2: ( ruleblock )
            // InternalPascal.g:8114:3: ruleblock
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


    // $ANTLR start "rule__Function_type__TypesAssignment_1"
    // InternalPascal.g:8123:1: rule__Function_type__TypesAssignment_1 : ( ruleformal_parameter_list ) ;
    public final void rule__Function_type__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8127:1: ( ( ruleformal_parameter_list ) )
            // InternalPascal.g:8128:2: ( ruleformal_parameter_list )
            {
            // InternalPascal.g:8128:2: ( ruleformal_parameter_list )
            // InternalPascal.g:8129:3: ruleformal_parameter_list
            {
             before(grammarAccess.getFunction_typeAccess().getTypesFormal_parameter_listParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleformal_parameter_list();

            state._fsp--;

             after(grammarAccess.getFunction_typeAccess().getTypesFormal_parameter_listParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_type__TypesAssignment_1"


    // $ANTLR start "rule__Function_type__TypesAssignment_3"
    // InternalPascal.g:8138:1: rule__Function_type__TypesAssignment_3 : ( ruleresult_type ) ;
    public final void rule__Function_type__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8142:1: ( ( ruleresult_type ) )
            // InternalPascal.g:8143:2: ( ruleresult_type )
            {
            // InternalPascal.g:8143:2: ( ruleresult_type )
            // InternalPascal.g:8144:3: ruleresult_type
            {
             before(grammarAccess.getFunction_typeAccess().getTypesResult_typeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleresult_type();

            state._fsp--;

             after(grammarAccess.getFunction_typeAccess().getTypesResult_typeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_type__TypesAssignment_3"


    // $ANTLR start "rule__Function_designator__NamesAssignment_0"
    // InternalPascal.g:8153:1: rule__Function_designator__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Function_designator__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8157:1: ( ( RULE_ID ) )
            // InternalPascal.g:8158:2: ( RULE_ID )
            {
            // InternalPascal.g:8158:2: ( RULE_ID )
            // InternalPascal.g:8159:3: RULE_ID
            {
             before(grammarAccess.getFunction_designatorAccess().getNamesIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunction_designatorAccess().getNamesIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__NamesAssignment_0"


    // $ANTLR start "rule__Function_designator__TypesAssignment_2"
    // InternalPascal.g:8168:1: rule__Function_designator__TypesAssignment_2 : ( ruleparameter_list ) ;
    public final void rule__Function_designator__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8172:1: ( ( ruleparameter_list ) )
            // InternalPascal.g:8173:2: ( ruleparameter_list )
            {
            // InternalPascal.g:8173:2: ( ruleparameter_list )
            // InternalPascal.g:8174:3: ruleparameter_list
            {
             before(grammarAccess.getFunction_designatorAccess().getTypesParameter_listParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleparameter_list();

            state._fsp--;

             after(grammarAccess.getFunction_designatorAccess().getTypesParameter_listParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__TypesAssignment_2"


    // $ANTLR start "rule__Formal_parameter_list__TypesAssignment_2_1"
    // InternalPascal.g:8183:1: rule__Formal_parameter_list__TypesAssignment_2_1 : ( ruleformal_parameter_section ) ;
    public final void rule__Formal_parameter_list__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8187:1: ( ( ruleformal_parameter_section ) )
            // InternalPascal.g:8188:2: ( ruleformal_parameter_section )
            {
            // InternalPascal.g:8188:2: ( ruleformal_parameter_section )
            // InternalPascal.g:8189:3: ruleformal_parameter_section
            {
             before(grammarAccess.getFormal_parameter_listAccess().getTypesFormal_parameter_sectionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleformal_parameter_section();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_listAccess().getTypesFormal_parameter_sectionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__TypesAssignment_2_1"


    // $ANTLR start "rule__Parameter_group__TypesAssignment_2"
    // InternalPascal.g:8198:1: rule__Parameter_group__TypesAssignment_2 : ( ruletype_identifier ) ;
    public final void rule__Parameter_group__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8202:1: ( ( ruletype_identifier ) )
            // InternalPascal.g:8203:2: ( ruletype_identifier )
            {
            // InternalPascal.g:8203:2: ( ruletype_identifier )
            // InternalPascal.g:8204:3: ruletype_identifier
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0002800018800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000800018800002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x02000000600000F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x3F001000600000F0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000800C020000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000800C020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x02581000E26000F0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0050030000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0050030000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000001FC000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000003E00L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x3D00000020000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000038800000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000280000000000L});

}