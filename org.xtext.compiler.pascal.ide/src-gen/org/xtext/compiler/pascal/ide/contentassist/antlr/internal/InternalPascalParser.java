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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NUM_INT", "RULE_NUM_REAL", "RULE_PLUS", "RULE_MINUS", "RULE_OR", "RULE_STAR", "RULE_SLASH", "RULE_DIV", "RULE_MOD", "RULE_AND", "RULE_EQUAL", "RULE_NOT_EQUAL", "RULE_LT", "RULE_LE", "RULE_GE", "RULE_GT", "RULE_IN", "RULE_TRUE", "RULE_FALSE", "RULE_ASSIGN", "RULE_NOT", "RULE_DOTDOT", "RULE_ID", "RULE_STRING", "RULE_NIL", "RULE_EXPONENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'procedure'", "'goto'", "'structured'", "'^'", "'.'", "'program'", "';'", "'('", "')'", "','", "'const'", "'var'", "':'", "'begin'", "'end'", "'@'", "'['", "']'", "'(.'", "'.)'", "'string'", "'chr'", "'CHAR'", "'boolean'", "'integer'", "'real'"
    };
    public static final int T__50=50;
    public static final int RULE_LE=17;
    public static final int RULE_GT=19;
    public static final int T__59=59;
    public static final int RULE_DIV=11;
    public static final int RULE_NIL=28;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_NOT_EQUAL=15;
    public static final int RULE_GE=18;
    public static final int T__51=51;
    public static final int RULE_OR=8;
    public static final int RULE_STAR=9;
    public static final int RULE_DOTDOT=25;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_MOD=12;
    public static final int RULE_EQUAL=14;
    public static final int RULE_ID=26;
    public static final int RULE_ASSIGN=23;
    public static final int RULE_SLASH=10;
    public static final int RULE_LT=16;
    public static final int RULE_INT=30;
    public static final int RULE_ML_COMMENT=31;
    public static final int RULE_FALSE=22;
    public static final int RULE_STRING=27;
    public static final int RULE_NOT=24;
    public static final int RULE_AND=13;
    public static final int RULE_SL_COMMENT=32;
    public static final int RULE_IN=20;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_TRUE=21;
    public static final int T__35=35;
    public static final int RULE_PLUS=6;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int RULE_WS=33;
    public static final int RULE_NUM_REAL=5;
    public static final int RULE_ANY_OTHER=34;
    public static final int RULE_MINUS=7;
    public static final int RULE_EXPONENT=29;
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
    // InternalPascal.g:937:1: ruleprocedure_statement : ( 'procedure' ) ;
    public final void ruleprocedure_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:941:2: ( ( 'procedure' ) )
            // InternalPascal.g:942:2: ( 'procedure' )
            {
            // InternalPascal.g:942:2: ( 'procedure' )
            // InternalPascal.g:943:3: 'procedure'
            {
             before(grammarAccess.getProcedure_statementAccess().getProcedureKeyword()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProcedure_statementAccess().getProcedureKeyword()); 

            }


            }

        }
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


    // $ANTLR start "entryRulegoto_statement"
    // InternalPascal.g:953:1: entryRulegoto_statement : rulegoto_statement EOF ;
    public final void entryRulegoto_statement() throws RecognitionException {
        try {
            // InternalPascal.g:954:1: ( rulegoto_statement EOF )
            // InternalPascal.g:955:1: rulegoto_statement EOF
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
    // InternalPascal.g:962:1: rulegoto_statement : ( 'goto' ) ;
    public final void rulegoto_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:966:2: ( ( 'goto' ) )
            // InternalPascal.g:967:2: ( 'goto' )
            {
            // InternalPascal.g:967:2: ( 'goto' )
            // InternalPascal.g:968:3: 'goto'
            {
             before(grammarAccess.getGoto_statementAccess().getGotoKeyword()); 
            match(input,36,FOLLOW_2); 
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
    // InternalPascal.g:978:1: entryRulestructured_statement : rulestructured_statement EOF ;
    public final void entryRulestructured_statement() throws RecognitionException {
        try {
            // InternalPascal.g:979:1: ( rulestructured_statement EOF )
            // InternalPascal.g:980:1: rulestructured_statement EOF
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
    // InternalPascal.g:987:1: rulestructured_statement : ( 'structured' ) ;
    public final void rulestructured_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:991:2: ( ( 'structured' ) )
            // InternalPascal.g:992:2: ( 'structured' )
            {
            // InternalPascal.g:992:2: ( 'structured' )
            // InternalPascal.g:993:3: 'structured'
            {
             before(grammarAccess.getStructured_statementAccess().getStructuredKeyword()); 
            match(input,37,FOLLOW_2); 
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
    // InternalPascal.g:1003:1: entryRuleunsigned_integer : ruleunsigned_integer EOF ;
    public final void entryRuleunsigned_integer() throws RecognitionException {
        try {
            // InternalPascal.g:1004:1: ( ruleunsigned_integer EOF )
            // InternalPascal.g:1005:1: ruleunsigned_integer EOF
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
    // InternalPascal.g:1012:1: ruleunsigned_integer : ( RULE_NUM_INT ) ;
    public final void ruleunsigned_integer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1016:2: ( ( RULE_NUM_INT ) )
            // InternalPascal.g:1017:2: ( RULE_NUM_INT )
            {
            // InternalPascal.g:1017:2: ( RULE_NUM_INT )
            // InternalPascal.g:1018:3: RULE_NUM_INT
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
    // InternalPascal.g:1028:1: entryRuleunsigned_real : ruleunsigned_real EOF ;
    public final void entryRuleunsigned_real() throws RecognitionException {
        try {
            // InternalPascal.g:1029:1: ( ruleunsigned_real EOF )
            // InternalPascal.g:1030:1: ruleunsigned_real EOF
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
    // InternalPascal.g:1037:1: ruleunsigned_real : ( RULE_NUM_REAL ) ;
    public final void ruleunsigned_real() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1041:2: ( ( RULE_NUM_REAL ) )
            // InternalPascal.g:1042:2: ( RULE_NUM_REAL )
            {
            // InternalPascal.g:1042:2: ( RULE_NUM_REAL )
            // InternalPascal.g:1043:3: RULE_NUM_REAL
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
    // InternalPascal.g:1053:1: entryRuleadditive_operator : ruleadditive_operator EOF ;
    public final void entryRuleadditive_operator() throws RecognitionException {
        try {
            // InternalPascal.g:1054:1: ( ruleadditive_operator EOF )
            // InternalPascal.g:1055:1: ruleadditive_operator EOF
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
    // InternalPascal.g:1062:1: ruleadditive_operator : ( ( rule__Additive_operator__Alternatives ) ) ;
    public final void ruleadditive_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1066:2: ( ( ( rule__Additive_operator__Alternatives ) ) )
            // InternalPascal.g:1067:2: ( ( rule__Additive_operator__Alternatives ) )
            {
            // InternalPascal.g:1067:2: ( ( rule__Additive_operator__Alternatives ) )
            // InternalPascal.g:1068:3: ( rule__Additive_operator__Alternatives )
            {
             before(grammarAccess.getAdditive_operatorAccess().getAlternatives()); 
            // InternalPascal.g:1069:3: ( rule__Additive_operator__Alternatives )
            // InternalPascal.g:1069:4: rule__Additive_operator__Alternatives
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
    // InternalPascal.g:1078:1: entryRulemultiplicative_operator : rulemultiplicative_operator EOF ;
    public final void entryRulemultiplicative_operator() throws RecognitionException {
        try {
            // InternalPascal.g:1079:1: ( rulemultiplicative_operator EOF )
            // InternalPascal.g:1080:1: rulemultiplicative_operator EOF
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
    // InternalPascal.g:1087:1: rulemultiplicative_operator : ( ( rule__Multiplicative_operator__Alternatives ) ) ;
    public final void rulemultiplicative_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1091:2: ( ( ( rule__Multiplicative_operator__Alternatives ) ) )
            // InternalPascal.g:1092:2: ( ( rule__Multiplicative_operator__Alternatives ) )
            {
            // InternalPascal.g:1092:2: ( ( rule__Multiplicative_operator__Alternatives ) )
            // InternalPascal.g:1093:3: ( rule__Multiplicative_operator__Alternatives )
            {
             before(grammarAccess.getMultiplicative_operatorAccess().getAlternatives()); 
            // InternalPascal.g:1094:3: ( rule__Multiplicative_operator__Alternatives )
            // InternalPascal.g:1094:4: rule__Multiplicative_operator__Alternatives
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
    // InternalPascal.g:1103:1: entryRulerelational_operator : rulerelational_operator EOF ;
    public final void entryRulerelational_operator() throws RecognitionException {
        try {
            // InternalPascal.g:1104:1: ( rulerelational_operator EOF )
            // InternalPascal.g:1105:1: rulerelational_operator EOF
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
    // InternalPascal.g:1112:1: rulerelational_operator : ( ( rule__Relational_operator__Alternatives ) ) ;
    public final void rulerelational_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1116:2: ( ( ( rule__Relational_operator__Alternatives ) ) )
            // InternalPascal.g:1117:2: ( ( rule__Relational_operator__Alternatives ) )
            {
            // InternalPascal.g:1117:2: ( ( rule__Relational_operator__Alternatives ) )
            // InternalPascal.g:1118:3: ( rule__Relational_operator__Alternatives )
            {
             before(grammarAccess.getRelational_operatorAccess().getAlternatives()); 
            // InternalPascal.g:1119:3: ( rule__Relational_operator__Alternatives )
            // InternalPascal.g:1119:4: rule__Relational_operator__Alternatives
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


    // $ANTLR start "entryRulebool"
    // InternalPascal.g:1128:1: entryRulebool : rulebool EOF ;
    public final void entryRulebool() throws RecognitionException {
        try {
            // InternalPascal.g:1129:1: ( rulebool EOF )
            // InternalPascal.g:1130:1: rulebool EOF
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
    // InternalPascal.g:1137:1: rulebool : ( ( rule__Bool__Alternatives ) ) ;
    public final void rulebool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1141:2: ( ( ( rule__Bool__Alternatives ) ) )
            // InternalPascal.g:1142:2: ( ( rule__Bool__Alternatives ) )
            {
            // InternalPascal.g:1142:2: ( ( rule__Bool__Alternatives ) )
            // InternalPascal.g:1143:3: ( rule__Bool__Alternatives )
            {
             before(grammarAccess.getBoolAccess().getAlternatives()); 
            // InternalPascal.g:1144:3: ( rule__Bool__Alternatives )
            // InternalPascal.g:1144:4: rule__Bool__Alternatives
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
    // InternalPascal.g:1153:1: entryRulesign : rulesign EOF ;
    public final void entryRulesign() throws RecognitionException {
        try {
            // InternalPascal.g:1154:1: ( rulesign EOF )
            // InternalPascal.g:1155:1: rulesign EOF
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
    // InternalPascal.g:1162:1: rulesign : ( ( rule__Sign__Alternatives ) ) ;
    public final void rulesign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1166:2: ( ( ( rule__Sign__Alternatives ) ) )
            // InternalPascal.g:1167:2: ( ( rule__Sign__Alternatives ) )
            {
            // InternalPascal.g:1167:2: ( ( rule__Sign__Alternatives ) )
            // InternalPascal.g:1168:3: ( rule__Sign__Alternatives )
            {
             before(grammarAccess.getSignAccess().getAlternatives()); 
            // InternalPascal.g:1169:3: ( rule__Sign__Alternatives )
            // InternalPascal.g:1169:4: rule__Sign__Alternatives
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
    // InternalPascal.g:1177:1: rule__Block__Alternatives_0 : ( ( ( rule__Block__ConstantpartAssignment_0_0 ) ) | ( ( rule__Block__VariablepartAssignment_0_1 ) ) );
    public final void rule__Block__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1181:1: ( ( ( rule__Block__ConstantpartAssignment_0_0 ) ) | ( ( rule__Block__VariablepartAssignment_0_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==45) ) {
                alt1=1;
            }
            else if ( (LA1_0==46) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:1182:2: ( ( rule__Block__ConstantpartAssignment_0_0 ) )
                    {
                    // InternalPascal.g:1182:2: ( ( rule__Block__ConstantpartAssignment_0_0 ) )
                    // InternalPascal.g:1183:3: ( rule__Block__ConstantpartAssignment_0_0 )
                    {
                     before(grammarAccess.getBlockAccess().getConstantpartAssignment_0_0()); 
                    // InternalPascal.g:1184:3: ( rule__Block__ConstantpartAssignment_0_0 )
                    // InternalPascal.g:1184:4: rule__Block__ConstantpartAssignment_0_0
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
                    // InternalPascal.g:1188:2: ( ( rule__Block__VariablepartAssignment_0_1 ) )
                    {
                    // InternalPascal.g:1188:2: ( ( rule__Block__VariablepartAssignment_0_1 ) )
                    // InternalPascal.g:1189:3: ( rule__Block__VariablepartAssignment_0_1 )
                    {
                     before(grammarAccess.getBlockAccess().getVariablepartAssignment_0_1()); 
                    // InternalPascal.g:1190:3: ( rule__Block__VariablepartAssignment_0_1 )
                    // InternalPascal.g:1190:4: rule__Block__VariablepartAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__VariablepartAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBlockAccess().getVariablepartAssignment_0_1()); 

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
    // InternalPascal.g:1198:1: rule__Constant__Alternatives : ( ( ruleunsigned_number ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__NamesAssignment_2 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__StringAssignment_4 ) ) | ( ruleconstant_chr ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1202:1: ( ( ruleunsigned_number ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__NamesAssignment_2 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__StringAssignment_4 ) ) | ( ruleconstant_chr ) )
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

                if ( (LA2_2==RULE_ID) ) {
                    alt2=4;
                }
                else if ( ((LA2_2>=RULE_NUM_INT && LA2_2<=RULE_NUM_REAL)) ) {
                    alt2=2;
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
            case 56:
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
                    // InternalPascal.g:1203:2: ( ruleunsigned_number )
                    {
                    // InternalPascal.g:1203:2: ( ruleunsigned_number )
                    // InternalPascal.g:1204:3: ruleunsigned_number
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
                    // InternalPascal.g:1209:2: ( ( rule__Constant__Group_1__0 ) )
                    {
                    // InternalPascal.g:1209:2: ( ( rule__Constant__Group_1__0 ) )
                    // InternalPascal.g:1210:3: ( rule__Constant__Group_1__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_1()); 
                    // InternalPascal.g:1211:3: ( rule__Constant__Group_1__0 )
                    // InternalPascal.g:1211:4: rule__Constant__Group_1__0
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
                    // InternalPascal.g:1215:2: ( ( rule__Constant__NamesAssignment_2 ) )
                    {
                    // InternalPascal.g:1215:2: ( ( rule__Constant__NamesAssignment_2 ) )
                    // InternalPascal.g:1216:3: ( rule__Constant__NamesAssignment_2 )
                    {
                     before(grammarAccess.getConstantAccess().getNamesAssignment_2()); 
                    // InternalPascal.g:1217:3: ( rule__Constant__NamesAssignment_2 )
                    // InternalPascal.g:1217:4: rule__Constant__NamesAssignment_2
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
                    // InternalPascal.g:1221:2: ( ( rule__Constant__Group_3__0 ) )
                    {
                    // InternalPascal.g:1221:2: ( ( rule__Constant__Group_3__0 ) )
                    // InternalPascal.g:1222:3: ( rule__Constant__Group_3__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_3()); 
                    // InternalPascal.g:1223:3: ( rule__Constant__Group_3__0 )
                    // InternalPascal.g:1223:4: rule__Constant__Group_3__0
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
                    // InternalPascal.g:1227:2: ( ( rule__Constant__StringAssignment_4 ) )
                    {
                    // InternalPascal.g:1227:2: ( ( rule__Constant__StringAssignment_4 ) )
                    // InternalPascal.g:1228:3: ( rule__Constant__StringAssignment_4 )
                    {
                     before(grammarAccess.getConstantAccess().getStringAssignment_4()); 
                    // InternalPascal.g:1229:3: ( rule__Constant__StringAssignment_4 )
                    // InternalPascal.g:1229:4: rule__Constant__StringAssignment_4
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
                    // InternalPascal.g:1233:2: ( ruleconstant_chr )
                    {
                    // InternalPascal.g:1233:2: ( ruleconstant_chr )
                    // InternalPascal.g:1234:3: ruleconstant_chr
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
    // InternalPascal.g:1243:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1247:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_NUM_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==EOF||LA3_0==RULE_ID||(LA3_0>=35 && LA3_0<=37)||LA3_0==41||(LA3_0>=49 && LA3_0<=50)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascal.g:1248:2: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // InternalPascal.g:1248:2: ( ( rule__Statement__Group_0__0 ) )
                    // InternalPascal.g:1249:3: ( rule__Statement__Group_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_0()); 
                    // InternalPascal.g:1250:3: ( rule__Statement__Group_0__0 )
                    // InternalPascal.g:1250:4: rule__Statement__Group_0__0
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
                    // InternalPascal.g:1254:2: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalPascal.g:1254:2: ( ( rule__Statement__Group_1__0 ) )
                    // InternalPascal.g:1255:3: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // InternalPascal.g:1256:3: ( rule__Statement__Group_1__0 )
                    // InternalPascal.g:1256:4: rule__Statement__Group_1__0
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
    // InternalPascal.g:1264:1: rule__Unlabelled_statement__Alternatives : ( ( ( rule__Unlabelled_statement__SimpleAssignment_0 ) ) | ( ( rule__Unlabelled_statement__StructuredAssignment_1 ) ) );
    public final void rule__Unlabelled_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1268:1: ( ( ( rule__Unlabelled_statement__SimpleAssignment_0 ) ) | ( ( rule__Unlabelled_statement__StructuredAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||(LA4_0>=35 && LA4_0<=36)||LA4_0==50) ) {
                alt4=1;
            }
            else if ( (LA4_0==37) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:1269:2: ( ( rule__Unlabelled_statement__SimpleAssignment_0 ) )
                    {
                    // InternalPascal.g:1269:2: ( ( rule__Unlabelled_statement__SimpleAssignment_0 ) )
                    // InternalPascal.g:1270:3: ( rule__Unlabelled_statement__SimpleAssignment_0 )
                    {
                     before(grammarAccess.getUnlabelled_statementAccess().getSimpleAssignment_0()); 
                    // InternalPascal.g:1271:3: ( rule__Unlabelled_statement__SimpleAssignment_0 )
                    // InternalPascal.g:1271:4: rule__Unlabelled_statement__SimpleAssignment_0
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
                    // InternalPascal.g:1275:2: ( ( rule__Unlabelled_statement__StructuredAssignment_1 ) )
                    {
                    // InternalPascal.g:1275:2: ( ( rule__Unlabelled_statement__StructuredAssignment_1 ) )
                    // InternalPascal.g:1276:3: ( rule__Unlabelled_statement__StructuredAssignment_1 )
                    {
                     before(grammarAccess.getUnlabelled_statementAccess().getStructuredAssignment_1()); 
                    // InternalPascal.g:1277:3: ( rule__Unlabelled_statement__StructuredAssignment_1 )
                    // InternalPascal.g:1277:4: rule__Unlabelled_statement__StructuredAssignment_1
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
    // InternalPascal.g:1285:1: rule__Simple_statement__Alternatives : ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__ProcedureAssignment_1 ) ) | ( ( rule__Simple_statement__GotoAssignment_2 ) ) );
    public final void rule__Simple_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1289:1: ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__ProcedureAssignment_1 ) ) | ( ( rule__Simple_statement__GotoAssignment_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 50:
                {
                alt5=1;
                }
                break;
            case 35:
                {
                alt5=2;
                }
                break;
            case 36:
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
                    // InternalPascal.g:1290:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    {
                    // InternalPascal.g:1290:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    // InternalPascal.g:1291:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_0()); 
                    // InternalPascal.g:1292:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    // InternalPascal.g:1292:4: rule__Simple_statement__AssignmentAssignment_0
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
                    // InternalPascal.g:1296:2: ( ( rule__Simple_statement__ProcedureAssignment_1 ) )
                    {
                    // InternalPascal.g:1296:2: ( ( rule__Simple_statement__ProcedureAssignment_1 ) )
                    // InternalPascal.g:1297:3: ( rule__Simple_statement__ProcedureAssignment_1 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getProcedureAssignment_1()); 
                    // InternalPascal.g:1298:3: ( rule__Simple_statement__ProcedureAssignment_1 )
                    // InternalPascal.g:1298:4: rule__Simple_statement__ProcedureAssignment_1
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
                    // InternalPascal.g:1302:2: ( ( rule__Simple_statement__GotoAssignment_2 ) )
                    {
                    // InternalPascal.g:1302:2: ( ( rule__Simple_statement__GotoAssignment_2 ) )
                    // InternalPascal.g:1303:3: ( rule__Simple_statement__GotoAssignment_2 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getGotoAssignment_2()); 
                    // InternalPascal.g:1304:3: ( rule__Simple_statement__GotoAssignment_2 )
                    // InternalPascal.g:1304:4: rule__Simple_statement__GotoAssignment_2
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
    // InternalPascal.g:1312:1: rule__Variable__Alternatives_0 : ( ( ( rule__Variable__Group_0_0__0 ) ) | ( ( rule__Variable__NamesAssignment_0_1 ) ) );
    public final void rule__Variable__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1316:1: ( ( ( rule__Variable__Group_0_0__0 ) ) | ( ( rule__Variable__NamesAssignment_0_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==50) ) {
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
                    // InternalPascal.g:1317:2: ( ( rule__Variable__Group_0_0__0 ) )
                    {
                    // InternalPascal.g:1317:2: ( ( rule__Variable__Group_0_0__0 ) )
                    // InternalPascal.g:1318:3: ( rule__Variable__Group_0_0__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_0_0()); 
                    // InternalPascal.g:1319:3: ( rule__Variable__Group_0_0__0 )
                    // InternalPascal.g:1319:4: rule__Variable__Group_0_0__0
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
                    // InternalPascal.g:1323:2: ( ( rule__Variable__NamesAssignment_0_1 ) )
                    {
                    // InternalPascal.g:1323:2: ( ( rule__Variable__NamesAssignment_0_1 ) )
                    // InternalPascal.g:1324:3: ( rule__Variable__NamesAssignment_0_1 )
                    {
                     before(grammarAccess.getVariableAccess().getNamesAssignment_0_1()); 
                    // InternalPascal.g:1325:3: ( rule__Variable__NamesAssignment_0_1 )
                    // InternalPascal.g:1325:4: rule__Variable__NamesAssignment_0_1
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
    // InternalPascal.g:1333:1: rule__Variable__Alternatives_1 : ( ( ( rule__Variable__Group_1_0__0 ) ) | ( ( rule__Variable__Group_1_1__0 ) ) | ( ( rule__Variable__Group_1_2__0 ) ) | ( '^' ) );
    public final void rule__Variable__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1337:1: ( ( ( rule__Variable__Group_1_0__0 ) ) | ( ( rule__Variable__Group_1_1__0 ) ) | ( ( rule__Variable__Group_1_2__0 ) ) | ( '^' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt7=1;
                }
                break;
            case 53:
                {
                alt7=2;
                }
                break;
            case 39:
                {
                alt7=3;
                }
                break;
            case 38:
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
                    // InternalPascal.g:1338:2: ( ( rule__Variable__Group_1_0__0 ) )
                    {
                    // InternalPascal.g:1338:2: ( ( rule__Variable__Group_1_0__0 ) )
                    // InternalPascal.g:1339:3: ( rule__Variable__Group_1_0__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_1_0()); 
                    // InternalPascal.g:1340:3: ( rule__Variable__Group_1_0__0 )
                    // InternalPascal.g:1340:4: rule__Variable__Group_1_0__0
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
                    // InternalPascal.g:1344:2: ( ( rule__Variable__Group_1_1__0 ) )
                    {
                    // InternalPascal.g:1344:2: ( ( rule__Variable__Group_1_1__0 ) )
                    // InternalPascal.g:1345:3: ( rule__Variable__Group_1_1__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_1_1()); 
                    // InternalPascal.g:1346:3: ( rule__Variable__Group_1_1__0 )
                    // InternalPascal.g:1346:4: rule__Variable__Group_1_1__0
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
                    // InternalPascal.g:1350:2: ( ( rule__Variable__Group_1_2__0 ) )
                    {
                    // InternalPascal.g:1350:2: ( ( rule__Variable__Group_1_2__0 ) )
                    // InternalPascal.g:1351:3: ( rule__Variable__Group_1_2__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_1_2()); 
                    // InternalPascal.g:1352:3: ( rule__Variable__Group_1_2__0 )
                    // InternalPascal.g:1352:4: rule__Variable__Group_1_2__0
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
                    // InternalPascal.g:1356:2: ( '^' )
                    {
                    // InternalPascal.g:1356:2: ( '^' )
                    // InternalPascal.g:1357:3: '^'
                    {
                     before(grammarAccess.getVariableAccess().getCircumflexAccentKeyword_1_3()); 
                    match(input,38,FOLLOW_2); 
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
    // InternalPascal.g:1366:1: rule__Signed_factor__Alternatives_0 : ( ( ( rule__Signed_factor__OperatorsAssignment_0_0 ) ) | ( ( rule__Signed_factor__OperatorsAssignment_0_1 ) ) );
    public final void rule__Signed_factor__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1370:1: ( ( ( rule__Signed_factor__OperatorsAssignment_0_0 ) ) | ( ( rule__Signed_factor__OperatorsAssignment_0_1 ) ) )
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
                    // InternalPascal.g:1371:2: ( ( rule__Signed_factor__OperatorsAssignment_0_0 ) )
                    {
                    // InternalPascal.g:1371:2: ( ( rule__Signed_factor__OperatorsAssignment_0_0 ) )
                    // InternalPascal.g:1372:3: ( rule__Signed_factor__OperatorsAssignment_0_0 )
                    {
                     before(grammarAccess.getSigned_factorAccess().getOperatorsAssignment_0_0()); 
                    // InternalPascal.g:1373:3: ( rule__Signed_factor__OperatorsAssignment_0_0 )
                    // InternalPascal.g:1373:4: rule__Signed_factor__OperatorsAssignment_0_0
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
                    // InternalPascal.g:1377:2: ( ( rule__Signed_factor__OperatorsAssignment_0_1 ) )
                    {
                    // InternalPascal.g:1377:2: ( ( rule__Signed_factor__OperatorsAssignment_0_1 ) )
                    // InternalPascal.g:1378:3: ( rule__Signed_factor__OperatorsAssignment_0_1 )
                    {
                     before(grammarAccess.getSigned_factorAccess().getOperatorsAssignment_0_1()); 
                    // InternalPascal.g:1379:3: ( rule__Signed_factor__OperatorsAssignment_0_1 )
                    // InternalPascal.g:1379:4: rule__Signed_factor__OperatorsAssignment_0_1
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
    // InternalPascal.g:1387:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__Group_1__0 ) ) | ( ( rule__Factor__ConstantAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__Group_4__0 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1391:1: ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__Group_1__0 ) ) | ( ( rule__Factor__ConstantAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__Group_4__0 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 50:
                {
                alt9=1;
                }
                break;
            case 42:
                {
                alt9=2;
                }
                break;
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
            case RULE_STRING:
            case RULE_NIL:
            case 56:
                {
                alt9=3;
                }
                break;
            case 51:
            case 53:
                {
                alt9=4;
                }
                break;
            case RULE_NOT:
                {
                alt9=5;
                }
                break;
            case RULE_TRUE:
            case RULE_FALSE:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalPascal.g:1392:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    {
                    // InternalPascal.g:1392:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    // InternalPascal.g:1393:3: ( rule__Factor__VariableAssignment_0 )
                    {
                     before(grammarAccess.getFactorAccess().getVariableAssignment_0()); 
                    // InternalPascal.g:1394:3: ( rule__Factor__VariableAssignment_0 )
                    // InternalPascal.g:1394:4: rule__Factor__VariableAssignment_0
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
                    // InternalPascal.g:1398:2: ( ( rule__Factor__Group_1__0 ) )
                    {
                    // InternalPascal.g:1398:2: ( ( rule__Factor__Group_1__0 ) )
                    // InternalPascal.g:1399:3: ( rule__Factor__Group_1__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1()); 
                    // InternalPascal.g:1400:3: ( rule__Factor__Group_1__0 )
                    // InternalPascal.g:1400:4: rule__Factor__Group_1__0
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
                    // InternalPascal.g:1404:2: ( ( rule__Factor__ConstantAssignment_2 ) )
                    {
                    // InternalPascal.g:1404:2: ( ( rule__Factor__ConstantAssignment_2 ) )
                    // InternalPascal.g:1405:3: ( rule__Factor__ConstantAssignment_2 )
                    {
                     before(grammarAccess.getFactorAccess().getConstantAssignment_2()); 
                    // InternalPascal.g:1406:3: ( rule__Factor__ConstantAssignment_2 )
                    // InternalPascal.g:1406:4: rule__Factor__ConstantAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__ConstantAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getConstantAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1410:2: ( ( rule__Factor__SetAssignment_3 ) )
                    {
                    // InternalPascal.g:1410:2: ( ( rule__Factor__SetAssignment_3 ) )
                    // InternalPascal.g:1411:3: ( rule__Factor__SetAssignment_3 )
                    {
                     before(grammarAccess.getFactorAccess().getSetAssignment_3()); 
                    // InternalPascal.g:1412:3: ( rule__Factor__SetAssignment_3 )
                    // InternalPascal.g:1412:4: rule__Factor__SetAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__SetAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getSetAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:1416:2: ( ( rule__Factor__Group_4__0 ) )
                    {
                    // InternalPascal.g:1416:2: ( ( rule__Factor__Group_4__0 ) )
                    // InternalPascal.g:1417:3: ( rule__Factor__Group_4__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_4()); 
                    // InternalPascal.g:1418:3: ( rule__Factor__Group_4__0 )
                    // InternalPascal.g:1418:4: rule__Factor__Group_4__0
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
                    // InternalPascal.g:1422:2: ( ( rule__Factor__BooleanAssignment_5 ) )
                    {
                    // InternalPascal.g:1422:2: ( ( rule__Factor__BooleanAssignment_5 ) )
                    // InternalPascal.g:1423:3: ( rule__Factor__BooleanAssignment_5 )
                    {
                     before(grammarAccess.getFactorAccess().getBooleanAssignment_5()); 
                    // InternalPascal.g:1424:3: ( rule__Factor__BooleanAssignment_5 )
                    // InternalPascal.g:1424:4: rule__Factor__BooleanAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__BooleanAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getBooleanAssignment_5()); 

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
    // InternalPascal.g:1432:1: rule__Set__Alternatives : ( ( ( rule__Set__Group_0__0 ) ) | ( ( rule__Set__Group_1__0 ) ) );
    public final void rule__Set__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1436:1: ( ( ( rule__Set__Group_0__0 ) ) | ( ( rule__Set__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==51) ) {
                alt10=1;
            }
            else if ( (LA10_0==53) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPascal.g:1437:2: ( ( rule__Set__Group_0__0 ) )
                    {
                    // InternalPascal.g:1437:2: ( ( rule__Set__Group_0__0 ) )
                    // InternalPascal.g:1438:3: ( rule__Set__Group_0__0 )
                    {
                     before(grammarAccess.getSetAccess().getGroup_0()); 
                    // InternalPascal.g:1439:3: ( rule__Set__Group_0__0 )
                    // InternalPascal.g:1439:4: rule__Set__Group_0__0
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
                    // InternalPascal.g:1443:2: ( ( rule__Set__Group_1__0 ) )
                    {
                    // InternalPascal.g:1443:2: ( ( rule__Set__Group_1__0 ) )
                    // InternalPascal.g:1444:3: ( rule__Set__Group_1__0 )
                    {
                     before(grammarAccess.getSetAccess().getGroup_1()); 
                    // InternalPascal.g:1445:3: ( rule__Set__Group_1__0 )
                    // InternalPascal.g:1445:4: rule__Set__Group_1__0
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
    // InternalPascal.g:1453:1: rule__Simple_type__Alternatives : ( ( ( rule__Simple_type__TypesAssignment_0 ) ) | ( ( rule__Simple_type__TypesAssignment_1 ) ) | ( ( rule__Simple_type__TypesAssignment_2 ) ) | ( ( rule__Simple_type__TypesAssignment_3 ) ) );
    public final void rule__Simple_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1457:1: ( ( ( rule__Simple_type__TypesAssignment_0 ) ) | ( ( rule__Simple_type__TypesAssignment_1 ) ) | ( ( rule__Simple_type__TypesAssignment_2 ) ) | ( ( rule__Simple_type__TypesAssignment_3 ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt11=1;
                }
                break;
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
            case RULE_PLUS:
            case RULE_MINUS:
            case RULE_STRING:
            case 56:
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
                else if ( (LA11_3==EOF||LA11_3==41) ) {
                    alt11=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt11=3;
                }
                break;
            case 55:
                {
                int LA11_5 = input.LA(2);

                if ( (LA11_5==51) ) {
                    alt11=4;
                }
                else if ( (LA11_5==EOF||LA11_5==41) ) {
                    alt11=3;
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
                    // InternalPascal.g:1458:2: ( ( rule__Simple_type__TypesAssignment_0 ) )
                    {
                    // InternalPascal.g:1458:2: ( ( rule__Simple_type__TypesAssignment_0 ) )
                    // InternalPascal.g:1459:3: ( rule__Simple_type__TypesAssignment_0 )
                    {
                     before(grammarAccess.getSimple_typeAccess().getTypesAssignment_0()); 
                    // InternalPascal.g:1460:3: ( rule__Simple_type__TypesAssignment_0 )
                    // InternalPascal.g:1460:4: rule__Simple_type__TypesAssignment_0
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
                    // InternalPascal.g:1464:2: ( ( rule__Simple_type__TypesAssignment_1 ) )
                    {
                    // InternalPascal.g:1464:2: ( ( rule__Simple_type__TypesAssignment_1 ) )
                    // InternalPascal.g:1465:3: ( rule__Simple_type__TypesAssignment_1 )
                    {
                     before(grammarAccess.getSimple_typeAccess().getTypesAssignment_1()); 
                    // InternalPascal.g:1466:3: ( rule__Simple_type__TypesAssignment_1 )
                    // InternalPascal.g:1466:4: rule__Simple_type__TypesAssignment_1
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
                    // InternalPascal.g:1470:2: ( ( rule__Simple_type__TypesAssignment_2 ) )
                    {
                    // InternalPascal.g:1470:2: ( ( rule__Simple_type__TypesAssignment_2 ) )
                    // InternalPascal.g:1471:3: ( rule__Simple_type__TypesAssignment_2 )
                    {
                     before(grammarAccess.getSimple_typeAccess().getTypesAssignment_2()); 
                    // InternalPascal.g:1472:3: ( rule__Simple_type__TypesAssignment_2 )
                    // InternalPascal.g:1472:4: rule__Simple_type__TypesAssignment_2
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
                    // InternalPascal.g:1476:2: ( ( rule__Simple_type__TypesAssignment_3 ) )
                    {
                    // InternalPascal.g:1476:2: ( ( rule__Simple_type__TypesAssignment_3 ) )
                    // InternalPascal.g:1477:3: ( rule__Simple_type__TypesAssignment_3 )
                    {
                     before(grammarAccess.getSimple_typeAccess().getTypesAssignment_3()); 
                    // InternalPascal.g:1478:3: ( rule__Simple_type__TypesAssignment_3 )
                    // InternalPascal.g:1478:4: rule__Simple_type__TypesAssignment_3
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
    // InternalPascal.g:1486:1: rule__Type_identifier__Alternatives : ( ( ( rule__Type_identifier__NamesAssignment_0 ) ) | ( ( rule__Type_identifier__Alternatives_1 ) ) );
    public final void rule__Type_identifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1490:1: ( ( ( rule__Type_identifier__NamesAssignment_0 ) ) | ( ( rule__Type_identifier__Alternatives_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==55||(LA12_0>=57 && LA12_0<=60)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPascal.g:1491:2: ( ( rule__Type_identifier__NamesAssignment_0 ) )
                    {
                    // InternalPascal.g:1491:2: ( ( rule__Type_identifier__NamesAssignment_0 ) )
                    // InternalPascal.g:1492:3: ( rule__Type_identifier__NamesAssignment_0 )
                    {
                     before(grammarAccess.getType_identifierAccess().getNamesAssignment_0()); 
                    // InternalPascal.g:1493:3: ( rule__Type_identifier__NamesAssignment_0 )
                    // InternalPascal.g:1493:4: rule__Type_identifier__NamesAssignment_0
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
                    // InternalPascal.g:1497:2: ( ( rule__Type_identifier__Alternatives_1 ) )
                    {
                    // InternalPascal.g:1497:2: ( ( rule__Type_identifier__Alternatives_1 ) )
                    // InternalPascal.g:1498:3: ( rule__Type_identifier__Alternatives_1 )
                    {
                     before(grammarAccess.getType_identifierAccess().getAlternatives_1()); 
                    // InternalPascal.g:1499:3: ( rule__Type_identifier__Alternatives_1 )
                    // InternalPascal.g:1499:4: rule__Type_identifier__Alternatives_1
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
    // InternalPascal.g:1507:1: rule__Type_identifier__Alternatives_1 : ( ( ( rule__Type_identifier__TypeAssignment_1_0 ) ) | ( ( rule__Type_identifier__TypeAssignment_1_1 ) ) | ( ( rule__Type_identifier__TypeAssignment_1_2 ) ) | ( ( rule__Type_identifier__TypeAssignment_1_3 ) ) | ( ( rule__Type_identifier__TypeAssignment_1_4 ) ) );
    public final void rule__Type_identifier__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1511:1: ( ( ( rule__Type_identifier__TypeAssignment_1_0 ) ) | ( ( rule__Type_identifier__TypeAssignment_1_1 ) ) | ( ( rule__Type_identifier__TypeAssignment_1_2 ) ) | ( ( rule__Type_identifier__TypeAssignment_1_3 ) ) | ( ( rule__Type_identifier__TypeAssignment_1_4 ) ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt13=1;
                }
                break;
            case 58:
                {
                alt13=2;
                }
                break;
            case 59:
                {
                alt13=3;
                }
                break;
            case 60:
                {
                alt13=4;
                }
                break;
            case 55:
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
                    // InternalPascal.g:1512:2: ( ( rule__Type_identifier__TypeAssignment_1_0 ) )
                    {
                    // InternalPascal.g:1512:2: ( ( rule__Type_identifier__TypeAssignment_1_0 ) )
                    // InternalPascal.g:1513:3: ( rule__Type_identifier__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getType_identifierAccess().getTypeAssignment_1_0()); 
                    // InternalPascal.g:1514:3: ( rule__Type_identifier__TypeAssignment_1_0 )
                    // InternalPascal.g:1514:4: rule__Type_identifier__TypeAssignment_1_0
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
                    // InternalPascal.g:1518:2: ( ( rule__Type_identifier__TypeAssignment_1_1 ) )
                    {
                    // InternalPascal.g:1518:2: ( ( rule__Type_identifier__TypeAssignment_1_1 ) )
                    // InternalPascal.g:1519:3: ( rule__Type_identifier__TypeAssignment_1_1 )
                    {
                     before(grammarAccess.getType_identifierAccess().getTypeAssignment_1_1()); 
                    // InternalPascal.g:1520:3: ( rule__Type_identifier__TypeAssignment_1_1 )
                    // InternalPascal.g:1520:4: rule__Type_identifier__TypeAssignment_1_1
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
                    // InternalPascal.g:1524:2: ( ( rule__Type_identifier__TypeAssignment_1_2 ) )
                    {
                    // InternalPascal.g:1524:2: ( ( rule__Type_identifier__TypeAssignment_1_2 ) )
                    // InternalPascal.g:1525:3: ( rule__Type_identifier__TypeAssignment_1_2 )
                    {
                     before(grammarAccess.getType_identifierAccess().getTypeAssignment_1_2()); 
                    // InternalPascal.g:1526:3: ( rule__Type_identifier__TypeAssignment_1_2 )
                    // InternalPascal.g:1526:4: rule__Type_identifier__TypeAssignment_1_2
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
                    // InternalPascal.g:1530:2: ( ( rule__Type_identifier__TypeAssignment_1_3 ) )
                    {
                    // InternalPascal.g:1530:2: ( ( rule__Type_identifier__TypeAssignment_1_3 ) )
                    // InternalPascal.g:1531:3: ( rule__Type_identifier__TypeAssignment_1_3 )
                    {
                     before(grammarAccess.getType_identifierAccess().getTypeAssignment_1_3()); 
                    // InternalPascal.g:1532:3: ( rule__Type_identifier__TypeAssignment_1_3 )
                    // InternalPascal.g:1532:4: rule__Type_identifier__TypeAssignment_1_3
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
                    // InternalPascal.g:1536:2: ( ( rule__Type_identifier__TypeAssignment_1_4 ) )
                    {
                    // InternalPascal.g:1536:2: ( ( rule__Type_identifier__TypeAssignment_1_4 ) )
                    // InternalPascal.g:1537:3: ( rule__Type_identifier__TypeAssignment_1_4 )
                    {
                     before(grammarAccess.getType_identifierAccess().getTypeAssignment_1_4()); 
                    // InternalPascal.g:1538:3: ( rule__Type_identifier__TypeAssignment_1_4 )
                    // InternalPascal.g:1538:4: rule__Type_identifier__TypeAssignment_1_4
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
    // InternalPascal.g:1546:1: rule__String_type__Alternatives_2 : ( ( ( rule__String_type__NamesAssignment_2_0 ) ) | ( ( rule__String_type__NumberAssignment_2_1 ) ) );
    public final void rule__String_type__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1550:1: ( ( ( rule__String_type__NamesAssignment_2_0 ) ) | ( ( rule__String_type__NumberAssignment_2_1 ) ) )
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
                    // InternalPascal.g:1551:2: ( ( rule__String_type__NamesAssignment_2_0 ) )
                    {
                    // InternalPascal.g:1551:2: ( ( rule__String_type__NamesAssignment_2_0 ) )
                    // InternalPascal.g:1552:3: ( rule__String_type__NamesAssignment_2_0 )
                    {
                     before(grammarAccess.getString_typeAccess().getNamesAssignment_2_0()); 
                    // InternalPascal.g:1553:3: ( rule__String_type__NamesAssignment_2_0 )
                    // InternalPascal.g:1553:4: rule__String_type__NamesAssignment_2_0
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
                    // InternalPascal.g:1557:2: ( ( rule__String_type__NumberAssignment_2_1 ) )
                    {
                    // InternalPascal.g:1557:2: ( ( rule__String_type__NumberAssignment_2_1 ) )
                    // InternalPascal.g:1558:3: ( rule__String_type__NumberAssignment_2_1 )
                    {
                     before(grammarAccess.getString_typeAccess().getNumberAssignment_2_1()); 
                    // InternalPascal.g:1559:3: ( rule__String_type__NumberAssignment_2_1 )
                    // InternalPascal.g:1559:4: rule__String_type__NumberAssignment_2_1
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
    // InternalPascal.g:1567:1: rule__Unsigned_constant__Alternatives : ( ( ( rule__Unsigned_constant__NumberAssignment_0 ) ) | ( ( rule__Unsigned_constant__CharAssignment_1 ) ) | ( ( rule__Unsigned_constant__StringAssignment_2 ) ) | ( ( rule__Unsigned_constant__NilAssignment_3 ) ) );
    public final void rule__Unsigned_constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1571:1: ( ( ( rule__Unsigned_constant__NumberAssignment_0 ) ) | ( ( rule__Unsigned_constant__CharAssignment_1 ) ) | ( ( rule__Unsigned_constant__StringAssignment_2 ) ) | ( ( rule__Unsigned_constant__NilAssignment_3 ) ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
                {
                alt15=1;
                }
                break;
            case 56:
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
                    // InternalPascal.g:1572:2: ( ( rule__Unsigned_constant__NumberAssignment_0 ) )
                    {
                    // InternalPascal.g:1572:2: ( ( rule__Unsigned_constant__NumberAssignment_0 ) )
                    // InternalPascal.g:1573:3: ( rule__Unsigned_constant__NumberAssignment_0 )
                    {
                     before(grammarAccess.getUnsigned_constantAccess().getNumberAssignment_0()); 
                    // InternalPascal.g:1574:3: ( rule__Unsigned_constant__NumberAssignment_0 )
                    // InternalPascal.g:1574:4: rule__Unsigned_constant__NumberAssignment_0
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
                    // InternalPascal.g:1578:2: ( ( rule__Unsigned_constant__CharAssignment_1 ) )
                    {
                    // InternalPascal.g:1578:2: ( ( rule__Unsigned_constant__CharAssignment_1 ) )
                    // InternalPascal.g:1579:3: ( rule__Unsigned_constant__CharAssignment_1 )
                    {
                     before(grammarAccess.getUnsigned_constantAccess().getCharAssignment_1()); 
                    // InternalPascal.g:1580:3: ( rule__Unsigned_constant__CharAssignment_1 )
                    // InternalPascal.g:1580:4: rule__Unsigned_constant__CharAssignment_1
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
                    // InternalPascal.g:1584:2: ( ( rule__Unsigned_constant__StringAssignment_2 ) )
                    {
                    // InternalPascal.g:1584:2: ( ( rule__Unsigned_constant__StringAssignment_2 ) )
                    // InternalPascal.g:1585:3: ( rule__Unsigned_constant__StringAssignment_2 )
                    {
                     before(grammarAccess.getUnsigned_constantAccess().getStringAssignment_2()); 
                    // InternalPascal.g:1586:3: ( rule__Unsigned_constant__StringAssignment_2 )
                    // InternalPascal.g:1586:4: rule__Unsigned_constant__StringAssignment_2
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
                    // InternalPascal.g:1590:2: ( ( rule__Unsigned_constant__NilAssignment_3 ) )
                    {
                    // InternalPascal.g:1590:2: ( ( rule__Unsigned_constant__NilAssignment_3 ) )
                    // InternalPascal.g:1591:3: ( rule__Unsigned_constant__NilAssignment_3 )
                    {
                     before(grammarAccess.getUnsigned_constantAccess().getNilAssignment_3()); 
                    // InternalPascal.g:1592:3: ( rule__Unsigned_constant__NilAssignment_3 )
                    // InternalPascal.g:1592:4: rule__Unsigned_constant__NilAssignment_3
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
    // InternalPascal.g:1600:1: rule__Unsigned_number__Alternatives : ( ( ( rule__Unsigned_number__NumbersAssignment_0 ) ) | ( ( rule__Unsigned_number__NumbersAssignment_1 ) ) );
    public final void rule__Unsigned_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1604:1: ( ( ( rule__Unsigned_number__NumbersAssignment_0 ) ) | ( ( rule__Unsigned_number__NumbersAssignment_1 ) ) )
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
                    // InternalPascal.g:1605:2: ( ( rule__Unsigned_number__NumbersAssignment_0 ) )
                    {
                    // InternalPascal.g:1605:2: ( ( rule__Unsigned_number__NumbersAssignment_0 ) )
                    // InternalPascal.g:1606:3: ( rule__Unsigned_number__NumbersAssignment_0 )
                    {
                     before(grammarAccess.getUnsigned_numberAccess().getNumbersAssignment_0()); 
                    // InternalPascal.g:1607:3: ( rule__Unsigned_number__NumbersAssignment_0 )
                    // InternalPascal.g:1607:4: rule__Unsigned_number__NumbersAssignment_0
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
                    // InternalPascal.g:1611:2: ( ( rule__Unsigned_number__NumbersAssignment_1 ) )
                    {
                    // InternalPascal.g:1611:2: ( ( rule__Unsigned_number__NumbersAssignment_1 ) )
                    // InternalPascal.g:1612:3: ( rule__Unsigned_number__NumbersAssignment_1 )
                    {
                     before(grammarAccess.getUnsigned_numberAccess().getNumbersAssignment_1()); 
                    // InternalPascal.g:1613:3: ( rule__Unsigned_number__NumbersAssignment_1 )
                    // InternalPascal.g:1613:4: rule__Unsigned_number__NumbersAssignment_1
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
    // InternalPascal.g:1621:1: rule__Additive_operator__Alternatives : ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_OR ) );
    public final void rule__Additive_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1625:1: ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_OR ) )
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
                    // InternalPascal.g:1626:2: ( RULE_PLUS )
                    {
                    // InternalPascal.g:1626:2: ( RULE_PLUS )
                    // InternalPascal.g:1627:3: RULE_PLUS
                    {
                     before(grammarAccess.getAdditive_operatorAccess().getPLUSTerminalRuleCall_0()); 
                    match(input,RULE_PLUS,FOLLOW_2); 
                     after(grammarAccess.getAdditive_operatorAccess().getPLUSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1632:2: ( RULE_MINUS )
                    {
                    // InternalPascal.g:1632:2: ( RULE_MINUS )
                    // InternalPascal.g:1633:3: RULE_MINUS
                    {
                     before(grammarAccess.getAdditive_operatorAccess().getMINUSTerminalRuleCall_1()); 
                    match(input,RULE_MINUS,FOLLOW_2); 
                     after(grammarAccess.getAdditive_operatorAccess().getMINUSTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1638:2: ( RULE_OR )
                    {
                    // InternalPascal.g:1638:2: ( RULE_OR )
                    // InternalPascal.g:1639:3: RULE_OR
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
    // InternalPascal.g:1648:1: rule__Multiplicative_operator__Alternatives : ( ( RULE_STAR ) | ( RULE_SLASH ) | ( RULE_DIV ) | ( RULE_MOD ) | ( RULE_AND ) );
    public final void rule__Multiplicative_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1652:1: ( ( RULE_STAR ) | ( RULE_SLASH ) | ( RULE_DIV ) | ( RULE_MOD ) | ( RULE_AND ) )
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
                    // InternalPascal.g:1653:2: ( RULE_STAR )
                    {
                    // InternalPascal.g:1653:2: ( RULE_STAR )
                    // InternalPascal.g:1654:3: RULE_STAR
                    {
                     before(grammarAccess.getMultiplicative_operatorAccess().getSTARTerminalRuleCall_0()); 
                    match(input,RULE_STAR,FOLLOW_2); 
                     after(grammarAccess.getMultiplicative_operatorAccess().getSTARTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1659:2: ( RULE_SLASH )
                    {
                    // InternalPascal.g:1659:2: ( RULE_SLASH )
                    // InternalPascal.g:1660:3: RULE_SLASH
                    {
                     before(grammarAccess.getMultiplicative_operatorAccess().getSLASHTerminalRuleCall_1()); 
                    match(input,RULE_SLASH,FOLLOW_2); 
                     after(grammarAccess.getMultiplicative_operatorAccess().getSLASHTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1665:2: ( RULE_DIV )
                    {
                    // InternalPascal.g:1665:2: ( RULE_DIV )
                    // InternalPascal.g:1666:3: RULE_DIV
                    {
                     before(grammarAccess.getMultiplicative_operatorAccess().getDIVTerminalRuleCall_2()); 
                    match(input,RULE_DIV,FOLLOW_2); 
                     after(grammarAccess.getMultiplicative_operatorAccess().getDIVTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1671:2: ( RULE_MOD )
                    {
                    // InternalPascal.g:1671:2: ( RULE_MOD )
                    // InternalPascal.g:1672:3: RULE_MOD
                    {
                     before(grammarAccess.getMultiplicative_operatorAccess().getMODTerminalRuleCall_3()); 
                    match(input,RULE_MOD,FOLLOW_2); 
                     after(grammarAccess.getMultiplicative_operatorAccess().getMODTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:1677:2: ( RULE_AND )
                    {
                    // InternalPascal.g:1677:2: ( RULE_AND )
                    // InternalPascal.g:1678:3: RULE_AND
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
    // InternalPascal.g:1687:1: rule__Relational_operator__Alternatives : ( ( RULE_EQUAL ) | ( RULE_NOT_EQUAL ) | ( RULE_LT ) | ( RULE_LE ) | ( RULE_GE ) | ( RULE_GT ) | ( RULE_IN ) );
    public final void rule__Relational_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1691:1: ( ( RULE_EQUAL ) | ( RULE_NOT_EQUAL ) | ( RULE_LT ) | ( RULE_LE ) | ( RULE_GE ) | ( RULE_GT ) | ( RULE_IN ) )
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
                    // InternalPascal.g:1692:2: ( RULE_EQUAL )
                    {
                    // InternalPascal.g:1692:2: ( RULE_EQUAL )
                    // InternalPascal.g:1693:3: RULE_EQUAL
                    {
                     before(grammarAccess.getRelational_operatorAccess().getEQUALTerminalRuleCall_0()); 
                    match(input,RULE_EQUAL,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getEQUALTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1698:2: ( RULE_NOT_EQUAL )
                    {
                    // InternalPascal.g:1698:2: ( RULE_NOT_EQUAL )
                    // InternalPascal.g:1699:3: RULE_NOT_EQUAL
                    {
                     before(grammarAccess.getRelational_operatorAccess().getNOT_EQUALTerminalRuleCall_1()); 
                    match(input,RULE_NOT_EQUAL,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getNOT_EQUALTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1704:2: ( RULE_LT )
                    {
                    // InternalPascal.g:1704:2: ( RULE_LT )
                    // InternalPascal.g:1705:3: RULE_LT
                    {
                     before(grammarAccess.getRelational_operatorAccess().getLTTerminalRuleCall_2()); 
                    match(input,RULE_LT,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getLTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1710:2: ( RULE_LE )
                    {
                    // InternalPascal.g:1710:2: ( RULE_LE )
                    // InternalPascal.g:1711:3: RULE_LE
                    {
                     before(grammarAccess.getRelational_operatorAccess().getLETerminalRuleCall_3()); 
                    match(input,RULE_LE,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getLETerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:1716:2: ( RULE_GE )
                    {
                    // InternalPascal.g:1716:2: ( RULE_GE )
                    // InternalPascal.g:1717:3: RULE_GE
                    {
                     before(grammarAccess.getRelational_operatorAccess().getGETerminalRuleCall_4()); 
                    match(input,RULE_GE,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getGETerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:1722:2: ( RULE_GT )
                    {
                    // InternalPascal.g:1722:2: ( RULE_GT )
                    // InternalPascal.g:1723:3: RULE_GT
                    {
                     before(grammarAccess.getRelational_operatorAccess().getGTTerminalRuleCall_5()); 
                    match(input,RULE_GT,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getGTTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPascal.g:1728:2: ( RULE_IN )
                    {
                    // InternalPascal.g:1728:2: ( RULE_IN )
                    // InternalPascal.g:1729:3: RULE_IN
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


    // $ANTLR start "rule__Bool__Alternatives"
    // InternalPascal.g:1738:1: rule__Bool__Alternatives : ( ( RULE_TRUE ) | ( RULE_FALSE ) );
    public final void rule__Bool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1742:1: ( ( RULE_TRUE ) | ( RULE_FALSE ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_TRUE) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_FALSE) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalPascal.g:1743:2: ( RULE_TRUE )
                    {
                    // InternalPascal.g:1743:2: ( RULE_TRUE )
                    // InternalPascal.g:1744:3: RULE_TRUE
                    {
                     before(grammarAccess.getBoolAccess().getTRUETerminalRuleCall_0()); 
                    match(input,RULE_TRUE,FOLLOW_2); 
                     after(grammarAccess.getBoolAccess().getTRUETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1749:2: ( RULE_FALSE )
                    {
                    // InternalPascal.g:1749:2: ( RULE_FALSE )
                    // InternalPascal.g:1750:3: RULE_FALSE
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
    // InternalPascal.g:1759:1: rule__Sign__Alternatives : ( ( RULE_PLUS ) | ( RULE_MINUS ) );
    public final void rule__Sign__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1763:1: ( ( RULE_PLUS ) | ( RULE_MINUS ) )
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
                    // InternalPascal.g:1764:2: ( RULE_PLUS )
                    {
                    // InternalPascal.g:1764:2: ( RULE_PLUS )
                    // InternalPascal.g:1765:3: RULE_PLUS
                    {
                     before(grammarAccess.getSignAccess().getPLUSTerminalRuleCall_0()); 
                    match(input,RULE_PLUS,FOLLOW_2); 
                     after(grammarAccess.getSignAccess().getPLUSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1770:2: ( RULE_MINUS )
                    {
                    // InternalPascal.g:1770:2: ( RULE_MINUS )
                    // InternalPascal.g:1771:3: RULE_MINUS
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
    // InternalPascal.g:1780:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1784:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPascal.g:1785:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalPascal.g:1792:1: rule__Program__Group__0__Impl : ( ( rule__Program__HeadingAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1796:1: ( ( ( rule__Program__HeadingAssignment_0 ) ) )
            // InternalPascal.g:1797:1: ( ( rule__Program__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:1797:1: ( ( rule__Program__HeadingAssignment_0 ) )
            // InternalPascal.g:1798:2: ( rule__Program__HeadingAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getHeadingAssignment_0()); 
            // InternalPascal.g:1799:2: ( rule__Program__HeadingAssignment_0 )
            // InternalPascal.g:1799:3: rule__Program__HeadingAssignment_0
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
    // InternalPascal.g:1807:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1811:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPascal.g:1812:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalPascal.g:1819:1: rule__Program__Group__1__Impl : ( ( rule__Program__BlockAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1823:1: ( ( ( rule__Program__BlockAssignment_1 ) ) )
            // InternalPascal.g:1824:1: ( ( rule__Program__BlockAssignment_1 ) )
            {
            // InternalPascal.g:1824:1: ( ( rule__Program__BlockAssignment_1 ) )
            // InternalPascal.g:1825:2: ( rule__Program__BlockAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getBlockAssignment_1()); 
            // InternalPascal.g:1826:2: ( rule__Program__BlockAssignment_1 )
            // InternalPascal.g:1826:3: rule__Program__BlockAssignment_1
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
    // InternalPascal.g:1834:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1838:1: ( rule__Program__Group__2__Impl )
            // InternalPascal.g:1839:2: rule__Program__Group__2__Impl
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
    // InternalPascal.g:1845:1: rule__Program__Group__2__Impl : ( '.' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1849:1: ( ( '.' ) )
            // InternalPascal.g:1850:1: ( '.' )
            {
            // InternalPascal.g:1850:1: ( '.' )
            // InternalPascal.g:1851:2: '.'
            {
             before(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalPascal.g:1861:1: rule__Program_heading_block__Group__0 : rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 ;
    public final void rule__Program_heading_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1865:1: ( rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 )
            // InternalPascal.g:1866:2: rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1
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
    // InternalPascal.g:1873:1: rule__Program_heading_block__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program_heading_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1877:1: ( ( 'program' ) )
            // InternalPascal.g:1878:1: ( 'program' )
            {
            // InternalPascal.g:1878:1: ( 'program' )
            // InternalPascal.g:1879:2: 'program'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalPascal.g:1888:1: rule__Program_heading_block__Group__1 : rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 ;
    public final void rule__Program_heading_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1892:1: ( rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 )
            // InternalPascal.g:1893:2: rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2
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
    // InternalPascal.g:1900:1: rule__Program_heading_block__Group__1__Impl : ( ( rule__Program_heading_block__NameAssignment_1 ) ) ;
    public final void rule__Program_heading_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1904:1: ( ( ( rule__Program_heading_block__NameAssignment_1 ) ) )
            // InternalPascal.g:1905:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            {
            // InternalPascal.g:1905:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            // InternalPascal.g:1906:2: ( rule__Program_heading_block__NameAssignment_1 )
            {
             before(grammarAccess.getProgram_heading_blockAccess().getNameAssignment_1()); 
            // InternalPascal.g:1907:2: ( rule__Program_heading_block__NameAssignment_1 )
            // InternalPascal.g:1907:3: rule__Program_heading_block__NameAssignment_1
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
    // InternalPascal.g:1915:1: rule__Program_heading_block__Group__2 : rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3 ;
    public final void rule__Program_heading_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1919:1: ( rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3 )
            // InternalPascal.g:1920:2: rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3
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
    // InternalPascal.g:1927:1: rule__Program_heading_block__Group__2__Impl : ( ( rule__Program_heading_block__Group_2__0 )? ) ;
    public final void rule__Program_heading_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1931:1: ( ( ( rule__Program_heading_block__Group_2__0 )? ) )
            // InternalPascal.g:1932:1: ( ( rule__Program_heading_block__Group_2__0 )? )
            {
            // InternalPascal.g:1932:1: ( ( rule__Program_heading_block__Group_2__0 )? )
            // InternalPascal.g:1933:2: ( rule__Program_heading_block__Group_2__0 )?
            {
             before(grammarAccess.getProgram_heading_blockAccess().getGroup_2()); 
            // InternalPascal.g:1934:2: ( rule__Program_heading_block__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascal.g:1934:3: rule__Program_heading_block__Group_2__0
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
    // InternalPascal.g:1942:1: rule__Program_heading_block__Group__3 : rule__Program_heading_block__Group__3__Impl ;
    public final void rule__Program_heading_block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1946:1: ( rule__Program_heading_block__Group__3__Impl )
            // InternalPascal.g:1947:2: rule__Program_heading_block__Group__3__Impl
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
    // InternalPascal.g:1953:1: rule__Program_heading_block__Group__3__Impl : ( ';' ) ;
    public final void rule__Program_heading_block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1957:1: ( ( ';' ) )
            // InternalPascal.g:1958:1: ( ';' )
            {
            // InternalPascal.g:1958:1: ( ';' )
            // InternalPascal.g:1959:2: ';'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalPascal.g:1969:1: rule__Program_heading_block__Group_2__0 : rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1 ;
    public final void rule__Program_heading_block__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1973:1: ( rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1 )
            // InternalPascal.g:1974:2: rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1
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
    // InternalPascal.g:1981:1: rule__Program_heading_block__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Program_heading_block__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1985:1: ( ( '(' ) )
            // InternalPascal.g:1986:1: ( '(' )
            {
            // InternalPascal.g:1986:1: ( '(' )
            // InternalPascal.g:1987:2: '('
            {
             before(grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalPascal.g:1996:1: rule__Program_heading_block__Group_2__1 : rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2 ;
    public final void rule__Program_heading_block__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2000:1: ( rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2 )
            // InternalPascal.g:2001:2: rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2
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
    // InternalPascal.g:2008:1: rule__Program_heading_block__Group_2__1__Impl : ( ( rule__Program_heading_block__IdentifiersAssignment_2_1 ) ) ;
    public final void rule__Program_heading_block__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2012:1: ( ( ( rule__Program_heading_block__IdentifiersAssignment_2_1 ) ) )
            // InternalPascal.g:2013:1: ( ( rule__Program_heading_block__IdentifiersAssignment_2_1 ) )
            {
            // InternalPascal.g:2013:1: ( ( rule__Program_heading_block__IdentifiersAssignment_2_1 ) )
            // InternalPascal.g:2014:2: ( rule__Program_heading_block__IdentifiersAssignment_2_1 )
            {
             before(grammarAccess.getProgram_heading_blockAccess().getIdentifiersAssignment_2_1()); 
            // InternalPascal.g:2015:2: ( rule__Program_heading_block__IdentifiersAssignment_2_1 )
            // InternalPascal.g:2015:3: rule__Program_heading_block__IdentifiersAssignment_2_1
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
    // InternalPascal.g:2023:1: rule__Program_heading_block__Group_2__2 : rule__Program_heading_block__Group_2__2__Impl ;
    public final void rule__Program_heading_block__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2027:1: ( rule__Program_heading_block__Group_2__2__Impl )
            // InternalPascal.g:2028:2: rule__Program_heading_block__Group_2__2__Impl
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
    // InternalPascal.g:2034:1: rule__Program_heading_block__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Program_heading_block__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2038:1: ( ( ')' ) )
            // InternalPascal.g:2039:1: ( ')' )
            {
            // InternalPascal.g:2039:1: ( ')' )
            // InternalPascal.g:2040:2: ')'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalPascal.g:2050:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2054:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // InternalPascal.g:2055:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
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
    // InternalPascal.g:2062:1: rule__Identifier_list__Group__0__Impl : ( ( rule__Identifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2066:1: ( ( ( rule__Identifier_list__NamesAssignment_0 ) ) )
            // InternalPascal.g:2067:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            {
            // InternalPascal.g:2067:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            // InternalPascal.g:2068:2: ( rule__Identifier_list__NamesAssignment_0 )
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_0()); 
            // InternalPascal.g:2069:2: ( rule__Identifier_list__NamesAssignment_0 )
            // InternalPascal.g:2069:3: rule__Identifier_list__NamesAssignment_0
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
    // InternalPascal.g:2077:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2081:1: ( rule__Identifier_list__Group__1__Impl )
            // InternalPascal.g:2082:2: rule__Identifier_list__Group__1__Impl
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
    // InternalPascal.g:2088:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2092:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // InternalPascal.g:2093:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // InternalPascal.g:2093:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // InternalPascal.g:2094:2: ( rule__Identifier_list__Group_1__0 )*
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            // InternalPascal.g:2095:2: ( rule__Identifier_list__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==44) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPascal.g:2095:3: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalPascal.g:2104:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2108:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // InternalPascal.g:2109:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
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
    // InternalPascal.g:2116:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2120:1: ( ( ',' ) )
            // InternalPascal.g:2121:1: ( ',' )
            {
            // InternalPascal.g:2121:1: ( ',' )
            // InternalPascal.g:2122:2: ','
            {
             before(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalPascal.g:2131:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2135:1: ( rule__Identifier_list__Group_1__1__Impl )
            // InternalPascal.g:2136:2: rule__Identifier_list__Group_1__1__Impl
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
    // InternalPascal.g:2142:1: rule__Identifier_list__Group_1__1__Impl : ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2146:1: ( ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascal.g:2147:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascal.g:2147:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            // InternalPascal.g:2148:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_1_1()); 
            // InternalPascal.g:2149:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            // InternalPascal.g:2149:3: rule__Identifier_list__NamesAssignment_1_1
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
    // InternalPascal.g:2158:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2162:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalPascal.g:2163:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalPascal.g:2170:1: rule__Block__Group__0__Impl : ( ( rule__Block__Alternatives_0 )* ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2174:1: ( ( ( rule__Block__Alternatives_0 )* ) )
            // InternalPascal.g:2175:1: ( ( rule__Block__Alternatives_0 )* )
            {
            // InternalPascal.g:2175:1: ( ( rule__Block__Alternatives_0 )* )
            // InternalPascal.g:2176:2: ( rule__Block__Alternatives_0 )*
            {
             before(grammarAccess.getBlockAccess().getAlternatives_0()); 
            // InternalPascal.g:2177:2: ( rule__Block__Alternatives_0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=45 && LA24_0<=46)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPascal.g:2177:3: rule__Block__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Block__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalPascal.g:2185:1: rule__Block__Group__1 : rule__Block__Group__1__Impl ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2189:1: ( rule__Block__Group__1__Impl )
            // InternalPascal.g:2190:2: rule__Block__Group__1__Impl
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
    // InternalPascal.g:2196:1: rule__Block__Group__1__Impl : ( ( rule__Block__StatementAssignment_1 ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2200:1: ( ( ( rule__Block__StatementAssignment_1 ) ) )
            // InternalPascal.g:2201:1: ( ( rule__Block__StatementAssignment_1 ) )
            {
            // InternalPascal.g:2201:1: ( ( rule__Block__StatementAssignment_1 ) )
            // InternalPascal.g:2202:2: ( rule__Block__StatementAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getStatementAssignment_1()); 
            // InternalPascal.g:2203:2: ( rule__Block__StatementAssignment_1 )
            // InternalPascal.g:2203:3: rule__Block__StatementAssignment_1
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
    // InternalPascal.g:2212:1: rule__Constant_definition_part__Group__0 : rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 ;
    public final void rule__Constant_definition_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2216:1: ( rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 )
            // InternalPascal.g:2217:2: rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1
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
    // InternalPascal.g:2224:1: rule__Constant_definition_part__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant_definition_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2228:1: ( ( 'const' ) )
            // InternalPascal.g:2229:1: ( 'const' )
            {
            // InternalPascal.g:2229:1: ( 'const' )
            // InternalPascal.g:2230:2: 'const'
            {
             before(grammarAccess.getConstant_definition_partAccess().getConstKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalPascal.g:2239:1: rule__Constant_definition_part__Group__1 : rule__Constant_definition_part__Group__1__Impl ;
    public final void rule__Constant_definition_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2243:1: ( rule__Constant_definition_part__Group__1__Impl )
            // InternalPascal.g:2244:2: rule__Constant_definition_part__Group__1__Impl
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
    // InternalPascal.g:2250:1: rule__Constant_definition_part__Group__1__Impl : ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) ) ;
    public final void rule__Constant_definition_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2254:1: ( ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) ) )
            // InternalPascal.g:2255:1: ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) )
            {
            // InternalPascal.g:2255:1: ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) )
            // InternalPascal.g:2256:2: ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* )
            {
            // InternalPascal.g:2256:2: ( ( rule__Constant_definition_part__Group_1__0 ) )
            // InternalPascal.g:2257:3: ( rule__Constant_definition_part__Group_1__0 )
            {
             before(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            // InternalPascal.g:2258:3: ( rule__Constant_definition_part__Group_1__0 )
            // InternalPascal.g:2258:4: rule__Constant_definition_part__Group_1__0
            {
            pushFollow(FOLLOW_11);
            rule__Constant_definition_part__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 

            }

            // InternalPascal.g:2261:2: ( ( rule__Constant_definition_part__Group_1__0 )* )
            // InternalPascal.g:2262:3: ( rule__Constant_definition_part__Group_1__0 )*
            {
             before(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            // InternalPascal.g:2263:3: ( rule__Constant_definition_part__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPascal.g:2263:4: rule__Constant_definition_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Constant_definition_part__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalPascal.g:2273:1: rule__Constant_definition_part__Group_1__0 : rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1 ;
    public final void rule__Constant_definition_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2277:1: ( rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1 )
            // InternalPascal.g:2278:2: rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1
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
    // InternalPascal.g:2285:1: rule__Constant_definition_part__Group_1__0__Impl : ( ( rule__Constant_definition_part__ConstantsAssignment_1_0 ) ) ;
    public final void rule__Constant_definition_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2289:1: ( ( ( rule__Constant_definition_part__ConstantsAssignment_1_0 ) ) )
            // InternalPascal.g:2290:1: ( ( rule__Constant_definition_part__ConstantsAssignment_1_0 ) )
            {
            // InternalPascal.g:2290:1: ( ( rule__Constant_definition_part__ConstantsAssignment_1_0 ) )
            // InternalPascal.g:2291:2: ( rule__Constant_definition_part__ConstantsAssignment_1_0 )
            {
             before(grammarAccess.getConstant_definition_partAccess().getConstantsAssignment_1_0()); 
            // InternalPascal.g:2292:2: ( rule__Constant_definition_part__ConstantsAssignment_1_0 )
            // InternalPascal.g:2292:3: rule__Constant_definition_part__ConstantsAssignment_1_0
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
    // InternalPascal.g:2300:1: rule__Constant_definition_part__Group_1__1 : rule__Constant_definition_part__Group_1__1__Impl ;
    public final void rule__Constant_definition_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2304:1: ( rule__Constant_definition_part__Group_1__1__Impl )
            // InternalPascal.g:2305:2: rule__Constant_definition_part__Group_1__1__Impl
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
    // InternalPascal.g:2311:1: rule__Constant_definition_part__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Constant_definition_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2315:1: ( ( ';' ) )
            // InternalPascal.g:2316:1: ( ';' )
            {
            // InternalPascal.g:2316:1: ( ';' )
            // InternalPascal.g:2317:2: ';'
            {
             before(grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalPascal.g:2327:1: rule__Constant_definition__Group__0 : rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 ;
    public final void rule__Constant_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2331:1: ( rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 )
            // InternalPascal.g:2332:2: rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1
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
    // InternalPascal.g:2339:1: rule__Constant_definition__Group__0__Impl : ( ( rule__Constant_definition__NameAssignment_0 ) ) ;
    public final void rule__Constant_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2343:1: ( ( ( rule__Constant_definition__NameAssignment_0 ) ) )
            // InternalPascal.g:2344:1: ( ( rule__Constant_definition__NameAssignment_0 ) )
            {
            // InternalPascal.g:2344:1: ( ( rule__Constant_definition__NameAssignment_0 ) )
            // InternalPascal.g:2345:2: ( rule__Constant_definition__NameAssignment_0 )
            {
             before(grammarAccess.getConstant_definitionAccess().getNameAssignment_0()); 
            // InternalPascal.g:2346:2: ( rule__Constant_definition__NameAssignment_0 )
            // InternalPascal.g:2346:3: rule__Constant_definition__NameAssignment_0
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
    // InternalPascal.g:2354:1: rule__Constant_definition__Group__1 : rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 ;
    public final void rule__Constant_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2358:1: ( rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 )
            // InternalPascal.g:2359:2: rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2
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
    // InternalPascal.g:2366:1: rule__Constant_definition__Group__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__Constant_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2370:1: ( ( RULE_EQUAL ) )
            // InternalPascal.g:2371:1: ( RULE_EQUAL )
            {
            // InternalPascal.g:2371:1: ( RULE_EQUAL )
            // InternalPascal.g:2372:2: RULE_EQUAL
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
    // InternalPascal.g:2381:1: rule__Constant_definition__Group__2 : rule__Constant_definition__Group__2__Impl ;
    public final void rule__Constant_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2385:1: ( rule__Constant_definition__Group__2__Impl )
            // InternalPascal.g:2386:2: rule__Constant_definition__Group__2__Impl
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
    // InternalPascal.g:2392:1: rule__Constant_definition__Group__2__Impl : ( ruleconstant ) ;
    public final void rule__Constant_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2396:1: ( ( ruleconstant ) )
            // InternalPascal.g:2397:1: ( ruleconstant )
            {
            // InternalPascal.g:2397:1: ( ruleconstant )
            // InternalPascal.g:2398:2: ruleconstant
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
    // InternalPascal.g:2408:1: rule__Constant__Group_1__0 : rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 ;
    public final void rule__Constant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2412:1: ( rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 )
            // InternalPascal.g:2413:2: rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1
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
    // InternalPascal.g:2420:1: rule__Constant__Group_1__0__Impl : ( rulesign ) ;
    public final void rule__Constant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2424:1: ( ( rulesign ) )
            // InternalPascal.g:2425:1: ( rulesign )
            {
            // InternalPascal.g:2425:1: ( rulesign )
            // InternalPascal.g:2426:2: rulesign
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
    // InternalPascal.g:2435:1: rule__Constant__Group_1__1 : rule__Constant__Group_1__1__Impl ;
    public final void rule__Constant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2439:1: ( rule__Constant__Group_1__1__Impl )
            // InternalPascal.g:2440:2: rule__Constant__Group_1__1__Impl
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
    // InternalPascal.g:2446:1: rule__Constant__Group_1__1__Impl : ( ruleunsigned_number ) ;
    public final void rule__Constant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2450:1: ( ( ruleunsigned_number ) )
            // InternalPascal.g:2451:1: ( ruleunsigned_number )
            {
            // InternalPascal.g:2451:1: ( ruleunsigned_number )
            // InternalPascal.g:2452:2: ruleunsigned_number
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
    // InternalPascal.g:2462:1: rule__Constant__Group_3__0 : rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 ;
    public final void rule__Constant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2466:1: ( rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 )
            // InternalPascal.g:2467:2: rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1
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
    // InternalPascal.g:2474:1: rule__Constant__Group_3__0__Impl : ( rulesign ) ;
    public final void rule__Constant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2478:1: ( ( rulesign ) )
            // InternalPascal.g:2479:1: ( rulesign )
            {
            // InternalPascal.g:2479:1: ( rulesign )
            // InternalPascal.g:2480:2: rulesign
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
    // InternalPascal.g:2489:1: rule__Constant__Group_3__1 : rule__Constant__Group_3__1__Impl ;
    public final void rule__Constant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2493:1: ( rule__Constant__Group_3__1__Impl )
            // InternalPascal.g:2494:2: rule__Constant__Group_3__1__Impl
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
    // InternalPascal.g:2500:1: rule__Constant__Group_3__1__Impl : ( ( rule__Constant__NamesAssignment_3_1 ) ) ;
    public final void rule__Constant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2504:1: ( ( ( rule__Constant__NamesAssignment_3_1 ) ) )
            // InternalPascal.g:2505:1: ( ( rule__Constant__NamesAssignment_3_1 ) )
            {
            // InternalPascal.g:2505:1: ( ( rule__Constant__NamesAssignment_3_1 ) )
            // InternalPascal.g:2506:2: ( rule__Constant__NamesAssignment_3_1 )
            {
             before(grammarAccess.getConstantAccess().getNamesAssignment_3_1()); 
            // InternalPascal.g:2507:2: ( rule__Constant__NamesAssignment_3_1 )
            // InternalPascal.g:2507:3: rule__Constant__NamesAssignment_3_1
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
    // InternalPascal.g:2516:1: rule__Variable_declaration_part__Group__0 : rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 ;
    public final void rule__Variable_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2520:1: ( rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 )
            // InternalPascal.g:2521:2: rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1
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
    // InternalPascal.g:2528:1: rule__Variable_declaration_part__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2532:1: ( ( 'var' ) )
            // InternalPascal.g:2533:1: ( 'var' )
            {
            // InternalPascal.g:2533:1: ( 'var' )
            // InternalPascal.g:2534:2: 'var'
            {
             before(grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalPascal.g:2543:1: rule__Variable_declaration_part__Group__1 : rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 ;
    public final void rule__Variable_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2547:1: ( rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 )
            // InternalPascal.g:2548:2: rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2
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
    // InternalPascal.g:2555:1: rule__Variable_declaration_part__Group__1__Impl : ( ( rule__Variable_declaration_part__VariableAssignment_1 ) ) ;
    public final void rule__Variable_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2559:1: ( ( ( rule__Variable_declaration_part__VariableAssignment_1 ) ) )
            // InternalPascal.g:2560:1: ( ( rule__Variable_declaration_part__VariableAssignment_1 ) )
            {
            // InternalPascal.g:2560:1: ( ( rule__Variable_declaration_part__VariableAssignment_1 ) )
            // InternalPascal.g:2561:2: ( rule__Variable_declaration_part__VariableAssignment_1 )
            {
             before(grammarAccess.getVariable_declaration_partAccess().getVariableAssignment_1()); 
            // InternalPascal.g:2562:2: ( rule__Variable_declaration_part__VariableAssignment_1 )
            // InternalPascal.g:2562:3: rule__Variable_declaration_part__VariableAssignment_1
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
    // InternalPascal.g:2570:1: rule__Variable_declaration_part__Group__2 : rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 ;
    public final void rule__Variable_declaration_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2574:1: ( rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 )
            // InternalPascal.g:2575:2: rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3
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
    // InternalPascal.g:2582:1: rule__Variable_declaration_part__Group__2__Impl : ( ( rule__Variable_declaration_part__Group_2__0 )* ) ;
    public final void rule__Variable_declaration_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2586:1: ( ( ( rule__Variable_declaration_part__Group_2__0 )* ) )
            // InternalPascal.g:2587:1: ( ( rule__Variable_declaration_part__Group_2__0 )* )
            {
            // InternalPascal.g:2587:1: ( ( rule__Variable_declaration_part__Group_2__0 )* )
            // InternalPascal.g:2588:2: ( rule__Variable_declaration_part__Group_2__0 )*
            {
             before(grammarAccess.getVariable_declaration_partAccess().getGroup_2()); 
            // InternalPascal.g:2589:2: ( rule__Variable_declaration_part__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==41) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==RULE_ID) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalPascal.g:2589:3: rule__Variable_declaration_part__Group_2__0
            	    {
            	    pushFollow(FOLLOW_16);
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
    // InternalPascal.g:2597:1: rule__Variable_declaration_part__Group__3 : rule__Variable_declaration_part__Group__3__Impl ;
    public final void rule__Variable_declaration_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2601:1: ( rule__Variable_declaration_part__Group__3__Impl )
            // InternalPascal.g:2602:2: rule__Variable_declaration_part__Group__3__Impl
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
    // InternalPascal.g:2608:1: rule__Variable_declaration_part__Group__3__Impl : ( ';' ) ;
    public final void rule__Variable_declaration_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2612:1: ( ( ';' ) )
            // InternalPascal.g:2613:1: ( ';' )
            {
            // InternalPascal.g:2613:1: ( ';' )
            // InternalPascal.g:2614:2: ';'
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalPascal.g:2624:1: rule__Variable_declaration_part__Group_2__0 : rule__Variable_declaration_part__Group_2__0__Impl rule__Variable_declaration_part__Group_2__1 ;
    public final void rule__Variable_declaration_part__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2628:1: ( rule__Variable_declaration_part__Group_2__0__Impl rule__Variable_declaration_part__Group_2__1 )
            // InternalPascal.g:2629:2: rule__Variable_declaration_part__Group_2__0__Impl rule__Variable_declaration_part__Group_2__1
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
    // InternalPascal.g:2636:1: rule__Variable_declaration_part__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Variable_declaration_part__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2640:1: ( ( ';' ) )
            // InternalPascal.g:2641:1: ( ';' )
            {
            // InternalPascal.g:2641:1: ( ';' )
            // InternalPascal.g:2642:2: ';'
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalPascal.g:2651:1: rule__Variable_declaration_part__Group_2__1 : rule__Variable_declaration_part__Group_2__1__Impl ;
    public final void rule__Variable_declaration_part__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2655:1: ( rule__Variable_declaration_part__Group_2__1__Impl )
            // InternalPascal.g:2656:2: rule__Variable_declaration_part__Group_2__1__Impl
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
    // InternalPascal.g:2662:1: rule__Variable_declaration_part__Group_2__1__Impl : ( ( rule__Variable_declaration_part__VariableAssignment_2_1 ) ) ;
    public final void rule__Variable_declaration_part__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2666:1: ( ( ( rule__Variable_declaration_part__VariableAssignment_2_1 ) ) )
            // InternalPascal.g:2667:1: ( ( rule__Variable_declaration_part__VariableAssignment_2_1 ) )
            {
            // InternalPascal.g:2667:1: ( ( rule__Variable_declaration_part__VariableAssignment_2_1 ) )
            // InternalPascal.g:2668:2: ( rule__Variable_declaration_part__VariableAssignment_2_1 )
            {
             before(grammarAccess.getVariable_declaration_partAccess().getVariableAssignment_2_1()); 
            // InternalPascal.g:2669:2: ( rule__Variable_declaration_part__VariableAssignment_2_1 )
            // InternalPascal.g:2669:3: rule__Variable_declaration_part__VariableAssignment_2_1
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
    // InternalPascal.g:2678:1: rule__Variable_declaration__Group__0 : rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 ;
    public final void rule__Variable_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2682:1: ( rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 )
            // InternalPascal.g:2683:2: rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1
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
    // InternalPascal.g:2690:1: rule__Variable_declaration__Group__0__Impl : ( ruleidentifier_list ) ;
    public final void rule__Variable_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2694:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:2695:1: ( ruleidentifier_list )
            {
            // InternalPascal.g:2695:1: ( ruleidentifier_list )
            // InternalPascal.g:2696:2: ruleidentifier_list
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
    // InternalPascal.g:2705:1: rule__Variable_declaration__Group__1 : rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 ;
    public final void rule__Variable_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2709:1: ( rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 )
            // InternalPascal.g:2710:2: rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2
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
    // InternalPascal.g:2717:1: rule__Variable_declaration__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2721:1: ( ( ':' ) )
            // InternalPascal.g:2722:1: ( ':' )
            {
            // InternalPascal.g:2722:1: ( ':' )
            // InternalPascal.g:2723:2: ':'
            {
             before(grammarAccess.getVariable_declarationAccess().getColonKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalPascal.g:2732:1: rule__Variable_declaration__Group__2 : rule__Variable_declaration__Group__2__Impl ;
    public final void rule__Variable_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2736:1: ( rule__Variable_declaration__Group__2__Impl )
            // InternalPascal.g:2737:2: rule__Variable_declaration__Group__2__Impl
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
    // InternalPascal.g:2743:1: rule__Variable_declaration__Group__2__Impl : ( ( rule__Variable_declaration__TypesAssignment_2 ) ) ;
    public final void rule__Variable_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2747:1: ( ( ( rule__Variable_declaration__TypesAssignment_2 ) ) )
            // InternalPascal.g:2748:1: ( ( rule__Variable_declaration__TypesAssignment_2 ) )
            {
            // InternalPascal.g:2748:1: ( ( rule__Variable_declaration__TypesAssignment_2 ) )
            // InternalPascal.g:2749:2: ( rule__Variable_declaration__TypesAssignment_2 )
            {
             before(grammarAccess.getVariable_declarationAccess().getTypesAssignment_2()); 
            // InternalPascal.g:2750:2: ( rule__Variable_declaration__TypesAssignment_2 )
            // InternalPascal.g:2750:3: rule__Variable_declaration__TypesAssignment_2
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
    // InternalPascal.g:2759:1: rule__Compound_statement__Group__0 : rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1 ;
    public final void rule__Compound_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2763:1: ( rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1 )
            // InternalPascal.g:2764:2: rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1
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
    // InternalPascal.g:2771:1: rule__Compound_statement__Group__0__Impl : ( 'begin' ) ;
    public final void rule__Compound_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2775:1: ( ( 'begin' ) )
            // InternalPascal.g:2776:1: ( 'begin' )
            {
            // InternalPascal.g:2776:1: ( 'begin' )
            // InternalPascal.g:2777:2: 'begin'
            {
             before(grammarAccess.getCompound_statementAccess().getBeginKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalPascal.g:2786:1: rule__Compound_statement__Group__1 : rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2 ;
    public final void rule__Compound_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2790:1: ( rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2 )
            // InternalPascal.g:2791:2: rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2
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
    // InternalPascal.g:2798:1: rule__Compound_statement__Group__1__Impl : ( ( rule__Compound_statement__SequenceAssignment_1 ) ) ;
    public final void rule__Compound_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2802:1: ( ( ( rule__Compound_statement__SequenceAssignment_1 ) ) )
            // InternalPascal.g:2803:1: ( ( rule__Compound_statement__SequenceAssignment_1 ) )
            {
            // InternalPascal.g:2803:1: ( ( rule__Compound_statement__SequenceAssignment_1 ) )
            // InternalPascal.g:2804:2: ( rule__Compound_statement__SequenceAssignment_1 )
            {
             before(grammarAccess.getCompound_statementAccess().getSequenceAssignment_1()); 
            // InternalPascal.g:2805:2: ( rule__Compound_statement__SequenceAssignment_1 )
            // InternalPascal.g:2805:3: rule__Compound_statement__SequenceAssignment_1
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
    // InternalPascal.g:2813:1: rule__Compound_statement__Group__2 : rule__Compound_statement__Group__2__Impl ;
    public final void rule__Compound_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2817:1: ( rule__Compound_statement__Group__2__Impl )
            // InternalPascal.g:2818:2: rule__Compound_statement__Group__2__Impl
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
    // InternalPascal.g:2824:1: rule__Compound_statement__Group__2__Impl : ( 'end' ) ;
    public final void rule__Compound_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2828:1: ( ( 'end' ) )
            // InternalPascal.g:2829:1: ( 'end' )
            {
            // InternalPascal.g:2829:1: ( 'end' )
            // InternalPascal.g:2830:2: 'end'
            {
             before(grammarAccess.getCompound_statementAccess().getEndKeyword_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalPascal.g:2840:1: rule__Statements__Group__0 : rule__Statements__Group__0__Impl rule__Statements__Group__1 ;
    public final void rule__Statements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2844:1: ( rule__Statements__Group__0__Impl rule__Statements__Group__1 )
            // InternalPascal.g:2845:2: rule__Statements__Group__0__Impl rule__Statements__Group__1
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
    // InternalPascal.g:2852:1: rule__Statements__Group__0__Impl : ( ( rule__Statements__StatementsAssignment_0 ) ) ;
    public final void rule__Statements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2856:1: ( ( ( rule__Statements__StatementsAssignment_0 ) ) )
            // InternalPascal.g:2857:1: ( ( rule__Statements__StatementsAssignment_0 ) )
            {
            // InternalPascal.g:2857:1: ( ( rule__Statements__StatementsAssignment_0 ) )
            // InternalPascal.g:2858:2: ( rule__Statements__StatementsAssignment_0 )
            {
             before(grammarAccess.getStatementsAccess().getStatementsAssignment_0()); 
            // InternalPascal.g:2859:2: ( rule__Statements__StatementsAssignment_0 )
            // InternalPascal.g:2859:3: rule__Statements__StatementsAssignment_0
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
    // InternalPascal.g:2867:1: rule__Statements__Group__1 : rule__Statements__Group__1__Impl ;
    public final void rule__Statements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2871:1: ( rule__Statements__Group__1__Impl )
            // InternalPascal.g:2872:2: rule__Statements__Group__1__Impl
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
    // InternalPascal.g:2878:1: rule__Statements__Group__1__Impl : ( ( rule__Statements__Group_1__0 )* ) ;
    public final void rule__Statements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2882:1: ( ( ( rule__Statements__Group_1__0 )* ) )
            // InternalPascal.g:2883:1: ( ( rule__Statements__Group_1__0 )* )
            {
            // InternalPascal.g:2883:1: ( ( rule__Statements__Group_1__0 )* )
            // InternalPascal.g:2884:2: ( rule__Statements__Group_1__0 )*
            {
             before(grammarAccess.getStatementsAccess().getGroup_1()); 
            // InternalPascal.g:2885:2: ( rule__Statements__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==41) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPascal.g:2885:3: rule__Statements__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
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
    // InternalPascal.g:2894:1: rule__Statements__Group_1__0 : rule__Statements__Group_1__0__Impl rule__Statements__Group_1__1 ;
    public final void rule__Statements__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2898:1: ( rule__Statements__Group_1__0__Impl rule__Statements__Group_1__1 )
            // InternalPascal.g:2899:2: rule__Statements__Group_1__0__Impl rule__Statements__Group_1__1
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
    // InternalPascal.g:2906:1: rule__Statements__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Statements__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2910:1: ( ( ';' ) )
            // InternalPascal.g:2911:1: ( ';' )
            {
            // InternalPascal.g:2911:1: ( ';' )
            // InternalPascal.g:2912:2: ';'
            {
             before(grammarAccess.getStatementsAccess().getSemicolonKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalPascal.g:2921:1: rule__Statements__Group_1__1 : rule__Statements__Group_1__1__Impl ;
    public final void rule__Statements__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2925:1: ( rule__Statements__Group_1__1__Impl )
            // InternalPascal.g:2926:2: rule__Statements__Group_1__1__Impl
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
    // InternalPascal.g:2932:1: rule__Statements__Group_1__1__Impl : ( ( rule__Statements__StatementsAssignment_1_1 ) ) ;
    public final void rule__Statements__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2936:1: ( ( ( rule__Statements__StatementsAssignment_1_1 ) ) )
            // InternalPascal.g:2937:1: ( ( rule__Statements__StatementsAssignment_1_1 ) )
            {
            // InternalPascal.g:2937:1: ( ( rule__Statements__StatementsAssignment_1_1 ) )
            // InternalPascal.g:2938:2: ( rule__Statements__StatementsAssignment_1_1 )
            {
             before(grammarAccess.getStatementsAccess().getStatementsAssignment_1_1()); 
            // InternalPascal.g:2939:2: ( rule__Statements__StatementsAssignment_1_1 )
            // InternalPascal.g:2939:3: rule__Statements__StatementsAssignment_1_1
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
    // InternalPascal.g:2948:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2952:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalPascal.g:2953:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
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
    // InternalPascal.g:2960:1: rule__Statement__Group_0__0__Impl : ( ( rule__Statement__LabelAssignment_0_0 ) ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2964:1: ( ( ( rule__Statement__LabelAssignment_0_0 ) ) )
            // InternalPascal.g:2965:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            {
            // InternalPascal.g:2965:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            // InternalPascal.g:2966:2: ( rule__Statement__LabelAssignment_0_0 )
            {
             before(grammarAccess.getStatementAccess().getLabelAssignment_0_0()); 
            // InternalPascal.g:2967:2: ( rule__Statement__LabelAssignment_0_0 )
            // InternalPascal.g:2967:3: rule__Statement__LabelAssignment_0_0
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
    // InternalPascal.g:2975:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2979:1: ( rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 )
            // InternalPascal.g:2980:2: rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2
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
    // InternalPascal.g:2987:1: rule__Statement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2991:1: ( ( ':' ) )
            // InternalPascal.g:2992:1: ( ':' )
            {
            // InternalPascal.g:2992:1: ( ':' )
            // InternalPascal.g:2993:2: ':'
            {
             before(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalPascal.g:3002:1: rule__Statement__Group_0__2 : rule__Statement__Group_0__2__Impl ;
    public final void rule__Statement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3006:1: ( rule__Statement__Group_0__2__Impl )
            // InternalPascal.g:3007:2: rule__Statement__Group_0__2__Impl
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
    // InternalPascal.g:3013:1: rule__Statement__Group_0__2__Impl : ( ( rule__Statement__StatementAssignment_0_2 ) ) ;
    public final void rule__Statement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3017:1: ( ( ( rule__Statement__StatementAssignment_0_2 ) ) )
            // InternalPascal.g:3018:1: ( ( rule__Statement__StatementAssignment_0_2 ) )
            {
            // InternalPascal.g:3018:1: ( ( rule__Statement__StatementAssignment_0_2 ) )
            // InternalPascal.g:3019:2: ( rule__Statement__StatementAssignment_0_2 )
            {
             before(grammarAccess.getStatementAccess().getStatementAssignment_0_2()); 
            // InternalPascal.g:3020:2: ( rule__Statement__StatementAssignment_0_2 )
            // InternalPascal.g:3020:3: rule__Statement__StatementAssignment_0_2
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
    // InternalPascal.g:3029:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3033:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalPascal.g:3034:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
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
    // InternalPascal.g:3041:1: rule__Statement__Group_1__0__Impl : ( () ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3045:1: ( ( () ) )
            // InternalPascal.g:3046:1: ( () )
            {
            // InternalPascal.g:3046:1: ( () )
            // InternalPascal.g:3047:2: ()
            {
             before(grammarAccess.getStatementAccess().getStatementAction_1_0()); 
            // InternalPascal.g:3048:2: ()
            // InternalPascal.g:3048:3: 
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
    // InternalPascal.g:3056:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3060:1: ( rule__Statement__Group_1__1__Impl )
            // InternalPascal.g:3061:2: rule__Statement__Group_1__1__Impl
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
    // InternalPascal.g:3067:1: rule__Statement__Group_1__1__Impl : ( ( rule__Statement__StatementAssignment_1_1 )? ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3071:1: ( ( ( rule__Statement__StatementAssignment_1_1 )? ) )
            // InternalPascal.g:3072:1: ( ( rule__Statement__StatementAssignment_1_1 )? )
            {
            // InternalPascal.g:3072:1: ( ( rule__Statement__StatementAssignment_1_1 )? )
            // InternalPascal.g:3073:2: ( rule__Statement__StatementAssignment_1_1 )?
            {
             before(grammarAccess.getStatementAccess().getStatementAssignment_1_1()); 
            // InternalPascal.g:3074:2: ( rule__Statement__StatementAssignment_1_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID||(LA28_0>=35 && LA28_0<=37)||LA28_0==50) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPascal.g:3074:3: rule__Statement__StatementAssignment_1_1
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
    // InternalPascal.g:3083:1: rule__Assignment_statement__Group__0 : rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 ;
    public final void rule__Assignment_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3087:1: ( rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 )
            // InternalPascal.g:3088:2: rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1
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
    // InternalPascal.g:3095:1: rule__Assignment_statement__Group__0__Impl : ( ( rule__Assignment_statement__VariableAssignment_0 ) ) ;
    public final void rule__Assignment_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3099:1: ( ( ( rule__Assignment_statement__VariableAssignment_0 ) ) )
            // InternalPascal.g:3100:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            {
            // InternalPascal.g:3100:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            // InternalPascal.g:3101:2: ( rule__Assignment_statement__VariableAssignment_0 )
            {
             before(grammarAccess.getAssignment_statementAccess().getVariableAssignment_0()); 
            // InternalPascal.g:3102:2: ( rule__Assignment_statement__VariableAssignment_0 )
            // InternalPascal.g:3102:3: rule__Assignment_statement__VariableAssignment_0
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
    // InternalPascal.g:3110:1: rule__Assignment_statement__Group__1 : rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 ;
    public final void rule__Assignment_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3114:1: ( rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 )
            // InternalPascal.g:3115:2: rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2
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
    // InternalPascal.g:3122:1: rule__Assignment_statement__Group__1__Impl : ( RULE_ASSIGN ) ;
    public final void rule__Assignment_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3126:1: ( ( RULE_ASSIGN ) )
            // InternalPascal.g:3127:1: ( RULE_ASSIGN )
            {
            // InternalPascal.g:3127:1: ( RULE_ASSIGN )
            // InternalPascal.g:3128:2: RULE_ASSIGN
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
    // InternalPascal.g:3137:1: rule__Assignment_statement__Group__2 : rule__Assignment_statement__Group__2__Impl ;
    public final void rule__Assignment_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3141:1: ( rule__Assignment_statement__Group__2__Impl )
            // InternalPascal.g:3142:2: rule__Assignment_statement__Group__2__Impl
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
    // InternalPascal.g:3148:1: rule__Assignment_statement__Group__2__Impl : ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3152:1: ( ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) )
            // InternalPascal.g:3153:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            {
            // InternalPascal.g:3153:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            // InternalPascal.g:3154:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            {
             before(grammarAccess.getAssignment_statementAccess().getExpressionAssignment_2()); 
            // InternalPascal.g:3155:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            // InternalPascal.g:3155:3: rule__Assignment_statement__ExpressionAssignment_2
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
    // InternalPascal.g:3164:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3168:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPascal.g:3169:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalPascal.g:3176:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__Alternatives_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3180:1: ( ( ( rule__Variable__Alternatives_0 ) ) )
            // InternalPascal.g:3181:1: ( ( rule__Variable__Alternatives_0 ) )
            {
            // InternalPascal.g:3181:1: ( ( rule__Variable__Alternatives_0 ) )
            // InternalPascal.g:3182:2: ( rule__Variable__Alternatives_0 )
            {
             before(grammarAccess.getVariableAccess().getAlternatives_0()); 
            // InternalPascal.g:3183:2: ( rule__Variable__Alternatives_0 )
            // InternalPascal.g:3183:3: rule__Variable__Alternatives_0
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
    // InternalPascal.g:3191:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3195:1: ( rule__Variable__Group__1__Impl )
            // InternalPascal.g:3196:2: rule__Variable__Group__1__Impl
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
    // InternalPascal.g:3202:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__Alternatives_1 )* ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3206:1: ( ( ( rule__Variable__Alternatives_1 )* ) )
            // InternalPascal.g:3207:1: ( ( rule__Variable__Alternatives_1 )* )
            {
            // InternalPascal.g:3207:1: ( ( rule__Variable__Alternatives_1 )* )
            // InternalPascal.g:3208:2: ( rule__Variable__Alternatives_1 )*
            {
             before(grammarAccess.getVariableAccess().getAlternatives_1()); 
            // InternalPascal.g:3209:2: ( rule__Variable__Alternatives_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=38 && LA29_0<=39)||LA29_0==51||LA29_0==53) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPascal.g:3209:3: rule__Variable__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_25);
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
    // InternalPascal.g:3218:1: rule__Variable__Group_0_0__0 : rule__Variable__Group_0_0__0__Impl rule__Variable__Group_0_0__1 ;
    public final void rule__Variable__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3222:1: ( rule__Variable__Group_0_0__0__Impl rule__Variable__Group_0_0__1 )
            // InternalPascal.g:3223:2: rule__Variable__Group_0_0__0__Impl rule__Variable__Group_0_0__1
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
    // InternalPascal.g:3230:1: rule__Variable__Group_0_0__0__Impl : ( '@' ) ;
    public final void rule__Variable__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3234:1: ( ( '@' ) )
            // InternalPascal.g:3235:1: ( '@' )
            {
            // InternalPascal.g:3235:1: ( '@' )
            // InternalPascal.g:3236:2: '@'
            {
             before(grammarAccess.getVariableAccess().getCommercialAtKeyword_0_0_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalPascal.g:3245:1: rule__Variable__Group_0_0__1 : rule__Variable__Group_0_0__1__Impl ;
    public final void rule__Variable__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3249:1: ( rule__Variable__Group_0_0__1__Impl )
            // InternalPascal.g:3250:2: rule__Variable__Group_0_0__1__Impl
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
    // InternalPascal.g:3256:1: rule__Variable__Group_0_0__1__Impl : ( ( rule__Variable__NamesAssignment_0_0_1 ) ) ;
    public final void rule__Variable__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3260:1: ( ( ( rule__Variable__NamesAssignment_0_0_1 ) ) )
            // InternalPascal.g:3261:1: ( ( rule__Variable__NamesAssignment_0_0_1 ) )
            {
            // InternalPascal.g:3261:1: ( ( rule__Variable__NamesAssignment_0_0_1 ) )
            // InternalPascal.g:3262:2: ( rule__Variable__NamesAssignment_0_0_1 )
            {
             before(grammarAccess.getVariableAccess().getNamesAssignment_0_0_1()); 
            // InternalPascal.g:3263:2: ( rule__Variable__NamesAssignment_0_0_1 )
            // InternalPascal.g:3263:3: rule__Variable__NamesAssignment_0_0_1
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
    // InternalPascal.g:3272:1: rule__Variable__Group_1_0__0 : rule__Variable__Group_1_0__0__Impl rule__Variable__Group_1_0__1 ;
    public final void rule__Variable__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3276:1: ( rule__Variable__Group_1_0__0__Impl rule__Variable__Group_1_0__1 )
            // InternalPascal.g:3277:2: rule__Variable__Group_1_0__0__Impl rule__Variable__Group_1_0__1
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
    // InternalPascal.g:3284:1: rule__Variable__Group_1_0__0__Impl : ( '[' ) ;
    public final void rule__Variable__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3288:1: ( ( '[' ) )
            // InternalPascal.g:3289:1: ( '[' )
            {
            // InternalPascal.g:3289:1: ( '[' )
            // InternalPascal.g:3290:2: '['
            {
             before(grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_1_0_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalPascal.g:3299:1: rule__Variable__Group_1_0__1 : rule__Variable__Group_1_0__1__Impl rule__Variable__Group_1_0__2 ;
    public final void rule__Variable__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3303:1: ( rule__Variable__Group_1_0__1__Impl rule__Variable__Group_1_0__2 )
            // InternalPascal.g:3304:2: rule__Variable__Group_1_0__1__Impl rule__Variable__Group_1_0__2
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
    // InternalPascal.g:3311:1: rule__Variable__Group_1_0__1__Impl : ( ( rule__Variable__ExpressionAssignment_1_0_1 ) ) ;
    public final void rule__Variable__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3315:1: ( ( ( rule__Variable__ExpressionAssignment_1_0_1 ) ) )
            // InternalPascal.g:3316:1: ( ( rule__Variable__ExpressionAssignment_1_0_1 ) )
            {
            // InternalPascal.g:3316:1: ( ( rule__Variable__ExpressionAssignment_1_0_1 ) )
            // InternalPascal.g:3317:2: ( rule__Variable__ExpressionAssignment_1_0_1 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_1_0_1()); 
            // InternalPascal.g:3318:2: ( rule__Variable__ExpressionAssignment_1_0_1 )
            // InternalPascal.g:3318:3: rule__Variable__ExpressionAssignment_1_0_1
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
    // InternalPascal.g:3326:1: rule__Variable__Group_1_0__2 : rule__Variable__Group_1_0__2__Impl rule__Variable__Group_1_0__3 ;
    public final void rule__Variable__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3330:1: ( rule__Variable__Group_1_0__2__Impl rule__Variable__Group_1_0__3 )
            // InternalPascal.g:3331:2: rule__Variable__Group_1_0__2__Impl rule__Variable__Group_1_0__3
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
    // InternalPascal.g:3338:1: rule__Variable__Group_1_0__2__Impl : ( ( rule__Variable__Group_1_0_2__0 )* ) ;
    public final void rule__Variable__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3342:1: ( ( ( rule__Variable__Group_1_0_2__0 )* ) )
            // InternalPascal.g:3343:1: ( ( rule__Variable__Group_1_0_2__0 )* )
            {
            // InternalPascal.g:3343:1: ( ( rule__Variable__Group_1_0_2__0 )* )
            // InternalPascal.g:3344:2: ( rule__Variable__Group_1_0_2__0 )*
            {
             before(grammarAccess.getVariableAccess().getGroup_1_0_2()); 
            // InternalPascal.g:3345:2: ( rule__Variable__Group_1_0_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==44) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPascal.g:3345:3: rule__Variable__Group_1_0_2__0
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalPascal.g:3353:1: rule__Variable__Group_1_0__3 : rule__Variable__Group_1_0__3__Impl ;
    public final void rule__Variable__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3357:1: ( rule__Variable__Group_1_0__3__Impl )
            // InternalPascal.g:3358:2: rule__Variable__Group_1_0__3__Impl
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
    // InternalPascal.g:3364:1: rule__Variable__Group_1_0__3__Impl : ( ']' ) ;
    public final void rule__Variable__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3368:1: ( ( ']' ) )
            // InternalPascal.g:3369:1: ( ']' )
            {
            // InternalPascal.g:3369:1: ( ']' )
            // InternalPascal.g:3370:2: ']'
            {
             before(grammarAccess.getVariableAccess().getRightSquareBracketKeyword_1_0_3()); 
            match(input,52,FOLLOW_2); 
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
    // InternalPascal.g:3380:1: rule__Variable__Group_1_0_2__0 : rule__Variable__Group_1_0_2__0__Impl rule__Variable__Group_1_0_2__1 ;
    public final void rule__Variable__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3384:1: ( rule__Variable__Group_1_0_2__0__Impl rule__Variable__Group_1_0_2__1 )
            // InternalPascal.g:3385:2: rule__Variable__Group_1_0_2__0__Impl rule__Variable__Group_1_0_2__1
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
    // InternalPascal.g:3392:1: rule__Variable__Group_1_0_2__0__Impl : ( ',' ) ;
    public final void rule__Variable__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3396:1: ( ( ',' ) )
            // InternalPascal.g:3397:1: ( ',' )
            {
            // InternalPascal.g:3397:1: ( ',' )
            // InternalPascal.g:3398:2: ','
            {
             before(grammarAccess.getVariableAccess().getCommaKeyword_1_0_2_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalPascal.g:3407:1: rule__Variable__Group_1_0_2__1 : rule__Variable__Group_1_0_2__1__Impl ;
    public final void rule__Variable__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3411:1: ( rule__Variable__Group_1_0_2__1__Impl )
            // InternalPascal.g:3412:2: rule__Variable__Group_1_0_2__1__Impl
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
    // InternalPascal.g:3418:1: rule__Variable__Group_1_0_2__1__Impl : ( ( rule__Variable__ExpressionAssignment_1_0_2_1 ) ) ;
    public final void rule__Variable__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3422:1: ( ( ( rule__Variable__ExpressionAssignment_1_0_2_1 ) ) )
            // InternalPascal.g:3423:1: ( ( rule__Variable__ExpressionAssignment_1_0_2_1 ) )
            {
            // InternalPascal.g:3423:1: ( ( rule__Variable__ExpressionAssignment_1_0_2_1 ) )
            // InternalPascal.g:3424:2: ( rule__Variable__ExpressionAssignment_1_0_2_1 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_1_0_2_1()); 
            // InternalPascal.g:3425:2: ( rule__Variable__ExpressionAssignment_1_0_2_1 )
            // InternalPascal.g:3425:3: rule__Variable__ExpressionAssignment_1_0_2_1
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
    // InternalPascal.g:3434:1: rule__Variable__Group_1_1__0 : rule__Variable__Group_1_1__0__Impl rule__Variable__Group_1_1__1 ;
    public final void rule__Variable__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3438:1: ( rule__Variable__Group_1_1__0__Impl rule__Variable__Group_1_1__1 )
            // InternalPascal.g:3439:2: rule__Variable__Group_1_1__0__Impl rule__Variable__Group_1_1__1
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
    // InternalPascal.g:3446:1: rule__Variable__Group_1_1__0__Impl : ( '(.' ) ;
    public final void rule__Variable__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3450:1: ( ( '(.' ) )
            // InternalPascal.g:3451:1: ( '(.' )
            {
            // InternalPascal.g:3451:1: ( '(.' )
            // InternalPascal.g:3452:2: '(.'
            {
             before(grammarAccess.getVariableAccess().getLeftParenthesisFullStopKeyword_1_1_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalPascal.g:3461:1: rule__Variable__Group_1_1__1 : rule__Variable__Group_1_1__1__Impl rule__Variable__Group_1_1__2 ;
    public final void rule__Variable__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3465:1: ( rule__Variable__Group_1_1__1__Impl rule__Variable__Group_1_1__2 )
            // InternalPascal.g:3466:2: rule__Variable__Group_1_1__1__Impl rule__Variable__Group_1_1__2
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
    // InternalPascal.g:3473:1: rule__Variable__Group_1_1__1__Impl : ( ( rule__Variable__ExpressionAssignment_1_1_1 ) ) ;
    public final void rule__Variable__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3477:1: ( ( ( rule__Variable__ExpressionAssignment_1_1_1 ) ) )
            // InternalPascal.g:3478:1: ( ( rule__Variable__ExpressionAssignment_1_1_1 ) )
            {
            // InternalPascal.g:3478:1: ( ( rule__Variable__ExpressionAssignment_1_1_1 ) )
            // InternalPascal.g:3479:2: ( rule__Variable__ExpressionAssignment_1_1_1 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_1_1_1()); 
            // InternalPascal.g:3480:2: ( rule__Variable__ExpressionAssignment_1_1_1 )
            // InternalPascal.g:3480:3: rule__Variable__ExpressionAssignment_1_1_1
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
    // InternalPascal.g:3488:1: rule__Variable__Group_1_1__2 : rule__Variable__Group_1_1__2__Impl rule__Variable__Group_1_1__3 ;
    public final void rule__Variable__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3492:1: ( rule__Variable__Group_1_1__2__Impl rule__Variable__Group_1_1__3 )
            // InternalPascal.g:3493:2: rule__Variable__Group_1_1__2__Impl rule__Variable__Group_1_1__3
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
    // InternalPascal.g:3500:1: rule__Variable__Group_1_1__2__Impl : ( ( rule__Variable__Group_1_1_2__0 )* ) ;
    public final void rule__Variable__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3504:1: ( ( ( rule__Variable__Group_1_1_2__0 )* ) )
            // InternalPascal.g:3505:1: ( ( rule__Variable__Group_1_1_2__0 )* )
            {
            // InternalPascal.g:3505:1: ( ( rule__Variable__Group_1_1_2__0 )* )
            // InternalPascal.g:3506:2: ( rule__Variable__Group_1_1_2__0 )*
            {
             before(grammarAccess.getVariableAccess().getGroup_1_1_2()); 
            // InternalPascal.g:3507:2: ( rule__Variable__Group_1_1_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==44) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPascal.g:3507:3: rule__Variable__Group_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalPascal.g:3515:1: rule__Variable__Group_1_1__3 : rule__Variable__Group_1_1__3__Impl ;
    public final void rule__Variable__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3519:1: ( rule__Variable__Group_1_1__3__Impl )
            // InternalPascal.g:3520:2: rule__Variable__Group_1_1__3__Impl
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
    // InternalPascal.g:3526:1: rule__Variable__Group_1_1__3__Impl : ( '.)' ) ;
    public final void rule__Variable__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3530:1: ( ( '.)' ) )
            // InternalPascal.g:3531:1: ( '.)' )
            {
            // InternalPascal.g:3531:1: ( '.)' )
            // InternalPascal.g:3532:2: '.)'
            {
             before(grammarAccess.getVariableAccess().getFullStopRightParenthesisKeyword_1_1_3()); 
            match(input,54,FOLLOW_2); 
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
    // InternalPascal.g:3542:1: rule__Variable__Group_1_1_2__0 : rule__Variable__Group_1_1_2__0__Impl rule__Variable__Group_1_1_2__1 ;
    public final void rule__Variable__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3546:1: ( rule__Variable__Group_1_1_2__0__Impl rule__Variable__Group_1_1_2__1 )
            // InternalPascal.g:3547:2: rule__Variable__Group_1_1_2__0__Impl rule__Variable__Group_1_1_2__1
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
    // InternalPascal.g:3554:1: rule__Variable__Group_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__Variable__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3558:1: ( ( ',' ) )
            // InternalPascal.g:3559:1: ( ',' )
            {
            // InternalPascal.g:3559:1: ( ',' )
            // InternalPascal.g:3560:2: ','
            {
             before(grammarAccess.getVariableAccess().getCommaKeyword_1_1_2_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalPascal.g:3569:1: rule__Variable__Group_1_1_2__1 : rule__Variable__Group_1_1_2__1__Impl ;
    public final void rule__Variable__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3573:1: ( rule__Variable__Group_1_1_2__1__Impl )
            // InternalPascal.g:3574:2: rule__Variable__Group_1_1_2__1__Impl
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
    // InternalPascal.g:3580:1: rule__Variable__Group_1_1_2__1__Impl : ( ( rule__Variable__ExpressionAssignment_1_1_2_1 ) ) ;
    public final void rule__Variable__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3584:1: ( ( ( rule__Variable__ExpressionAssignment_1_1_2_1 ) ) )
            // InternalPascal.g:3585:1: ( ( rule__Variable__ExpressionAssignment_1_1_2_1 ) )
            {
            // InternalPascal.g:3585:1: ( ( rule__Variable__ExpressionAssignment_1_1_2_1 ) )
            // InternalPascal.g:3586:2: ( rule__Variable__ExpressionAssignment_1_1_2_1 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_1_1_2_1()); 
            // InternalPascal.g:3587:2: ( rule__Variable__ExpressionAssignment_1_1_2_1 )
            // InternalPascal.g:3587:3: rule__Variable__ExpressionAssignment_1_1_2_1
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
    // InternalPascal.g:3596:1: rule__Variable__Group_1_2__0 : rule__Variable__Group_1_2__0__Impl rule__Variable__Group_1_2__1 ;
    public final void rule__Variable__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3600:1: ( rule__Variable__Group_1_2__0__Impl rule__Variable__Group_1_2__1 )
            // InternalPascal.g:3601:2: rule__Variable__Group_1_2__0__Impl rule__Variable__Group_1_2__1
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
    // InternalPascal.g:3608:1: rule__Variable__Group_1_2__0__Impl : ( '.' ) ;
    public final void rule__Variable__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3612:1: ( ( '.' ) )
            // InternalPascal.g:3613:1: ( '.' )
            {
            // InternalPascal.g:3613:1: ( '.' )
            // InternalPascal.g:3614:2: '.'
            {
             before(grammarAccess.getVariableAccess().getFullStopKeyword_1_2_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalPascal.g:3623:1: rule__Variable__Group_1_2__1 : rule__Variable__Group_1_2__1__Impl ;
    public final void rule__Variable__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3627:1: ( rule__Variable__Group_1_2__1__Impl )
            // InternalPascal.g:3628:2: rule__Variable__Group_1_2__1__Impl
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
    // InternalPascal.g:3634:1: rule__Variable__Group_1_2__1__Impl : ( ( rule__Variable__NamesAssignment_1_2_1 ) ) ;
    public final void rule__Variable__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3638:1: ( ( ( rule__Variable__NamesAssignment_1_2_1 ) ) )
            // InternalPascal.g:3639:1: ( ( rule__Variable__NamesAssignment_1_2_1 ) )
            {
            // InternalPascal.g:3639:1: ( ( rule__Variable__NamesAssignment_1_2_1 ) )
            // InternalPascal.g:3640:2: ( rule__Variable__NamesAssignment_1_2_1 )
            {
             before(grammarAccess.getVariableAccess().getNamesAssignment_1_2_1()); 
            // InternalPascal.g:3641:2: ( rule__Variable__NamesAssignment_1_2_1 )
            // InternalPascal.g:3641:3: rule__Variable__NamesAssignment_1_2_1
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
    // InternalPascal.g:3650:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3654:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalPascal.g:3655:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
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
    // InternalPascal.g:3662:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3666:1: ( ( ( rule__Expression__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:3667:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:3667:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            // InternalPascal.g:3668:2: ( rule__Expression__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionsAssignment_0()); 
            // InternalPascal.g:3669:2: ( rule__Expression__ExpressionsAssignment_0 )
            // InternalPascal.g:3669:3: rule__Expression__ExpressionsAssignment_0
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
    // InternalPascal.g:3677:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3681:1: ( rule__Expression__Group__1__Impl )
            // InternalPascal.g:3682:2: rule__Expression__Group__1__Impl
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
    // InternalPascal.g:3688:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3692:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalPascal.g:3693:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalPascal.g:3693:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalPascal.g:3694:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalPascal.g:3695:2: ( rule__Expression__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_EQUAL && LA32_0<=RULE_IN)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPascal.g:3695:3: rule__Expression__Group_1__0
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
    // InternalPascal.g:3704:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3708:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalPascal.g:3709:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
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
    // InternalPascal.g:3716:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__OperatorsAssignment_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3720:1: ( ( ( rule__Expression__OperatorsAssignment_1_0 ) ) )
            // InternalPascal.g:3721:1: ( ( rule__Expression__OperatorsAssignment_1_0 ) )
            {
            // InternalPascal.g:3721:1: ( ( rule__Expression__OperatorsAssignment_1_0 ) )
            // InternalPascal.g:3722:2: ( rule__Expression__OperatorsAssignment_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0()); 
            // InternalPascal.g:3723:2: ( rule__Expression__OperatorsAssignment_1_0 )
            // InternalPascal.g:3723:3: rule__Expression__OperatorsAssignment_1_0
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
    // InternalPascal.g:3731:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3735:1: ( rule__Expression__Group_1__1__Impl )
            // InternalPascal.g:3736:2: rule__Expression__Group_1__1__Impl
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
    // InternalPascal.g:3742:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3746:1: ( ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:3747:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:3747:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:3748:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionsAssignment_1_1()); 
            // InternalPascal.g:3749:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            // InternalPascal.g:3749:3: rule__Expression__ExpressionsAssignment_1_1
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
    // InternalPascal.g:3758:1: rule__Simple_expression__Group__0 : rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 ;
    public final void rule__Simple_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3762:1: ( rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 )
            // InternalPascal.g:3763:2: rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1
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
    // InternalPascal.g:3770:1: rule__Simple_expression__Group__0__Impl : ( ( rule__Simple_expression__TermsAssignment_0 ) ) ;
    public final void rule__Simple_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3774:1: ( ( ( rule__Simple_expression__TermsAssignment_0 ) ) )
            // InternalPascal.g:3775:1: ( ( rule__Simple_expression__TermsAssignment_0 ) )
            {
            // InternalPascal.g:3775:1: ( ( rule__Simple_expression__TermsAssignment_0 ) )
            // InternalPascal.g:3776:2: ( rule__Simple_expression__TermsAssignment_0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_0()); 
            // InternalPascal.g:3777:2: ( rule__Simple_expression__TermsAssignment_0 )
            // InternalPascal.g:3777:3: rule__Simple_expression__TermsAssignment_0
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
    // InternalPascal.g:3785:1: rule__Simple_expression__Group__1 : rule__Simple_expression__Group__1__Impl ;
    public final void rule__Simple_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3789:1: ( rule__Simple_expression__Group__1__Impl )
            // InternalPascal.g:3790:2: rule__Simple_expression__Group__1__Impl
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
    // InternalPascal.g:3796:1: rule__Simple_expression__Group__1__Impl : ( ( rule__Simple_expression__Group_1__0 )? ) ;
    public final void rule__Simple_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3800:1: ( ( ( rule__Simple_expression__Group_1__0 )? ) )
            // InternalPascal.g:3801:1: ( ( rule__Simple_expression__Group_1__0 )? )
            {
            // InternalPascal.g:3801:1: ( ( rule__Simple_expression__Group_1__0 )? )
            // InternalPascal.g:3802:2: ( rule__Simple_expression__Group_1__0 )?
            {
             before(grammarAccess.getSimple_expressionAccess().getGroup_1()); 
            // InternalPascal.g:3803:2: ( rule__Simple_expression__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_PLUS && LA33_0<=RULE_OR)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPascal.g:3803:3: rule__Simple_expression__Group_1__0
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
    // InternalPascal.g:3812:1: rule__Simple_expression__Group_1__0 : rule__Simple_expression__Group_1__0__Impl rule__Simple_expression__Group_1__1 ;
    public final void rule__Simple_expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3816:1: ( rule__Simple_expression__Group_1__0__Impl rule__Simple_expression__Group_1__1 )
            // InternalPascal.g:3817:2: rule__Simple_expression__Group_1__0__Impl rule__Simple_expression__Group_1__1
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
    // InternalPascal.g:3824:1: rule__Simple_expression__Group_1__0__Impl : ( ( rule__Simple_expression__OperatorsAssignment_1_0 ) ) ;
    public final void rule__Simple_expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3828:1: ( ( ( rule__Simple_expression__OperatorsAssignment_1_0 ) ) )
            // InternalPascal.g:3829:1: ( ( rule__Simple_expression__OperatorsAssignment_1_0 ) )
            {
            // InternalPascal.g:3829:1: ( ( rule__Simple_expression__OperatorsAssignment_1_0 ) )
            // InternalPascal.g:3830:2: ( rule__Simple_expression__OperatorsAssignment_1_0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_1_0()); 
            // InternalPascal.g:3831:2: ( rule__Simple_expression__OperatorsAssignment_1_0 )
            // InternalPascal.g:3831:3: rule__Simple_expression__OperatorsAssignment_1_0
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
    // InternalPascal.g:3839:1: rule__Simple_expression__Group_1__1 : rule__Simple_expression__Group_1__1__Impl ;
    public final void rule__Simple_expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3843:1: ( rule__Simple_expression__Group_1__1__Impl )
            // InternalPascal.g:3844:2: rule__Simple_expression__Group_1__1__Impl
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
    // InternalPascal.g:3850:1: rule__Simple_expression__Group_1__1__Impl : ( ( rule__Simple_expression__ExpressionAssignment_1_1 ) ) ;
    public final void rule__Simple_expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3854:1: ( ( ( rule__Simple_expression__ExpressionAssignment_1_1 ) ) )
            // InternalPascal.g:3855:1: ( ( rule__Simple_expression__ExpressionAssignment_1_1 ) )
            {
            // InternalPascal.g:3855:1: ( ( rule__Simple_expression__ExpressionAssignment_1_1 ) )
            // InternalPascal.g:3856:2: ( rule__Simple_expression__ExpressionAssignment_1_1 )
            {
             before(grammarAccess.getSimple_expressionAccess().getExpressionAssignment_1_1()); 
            // InternalPascal.g:3857:2: ( rule__Simple_expression__ExpressionAssignment_1_1 )
            // InternalPascal.g:3857:3: rule__Simple_expression__ExpressionAssignment_1_1
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
    // InternalPascal.g:3866:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3870:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalPascal.g:3871:2: rule__Term__Group__0__Impl rule__Term__Group__1
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
    // InternalPascal.g:3878:1: rule__Term__Group__0__Impl : ( ( rule__Term__FactorsAssignment_0 ) ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3882:1: ( ( ( rule__Term__FactorsAssignment_0 ) ) )
            // InternalPascal.g:3883:1: ( ( rule__Term__FactorsAssignment_0 ) )
            {
            // InternalPascal.g:3883:1: ( ( rule__Term__FactorsAssignment_0 ) )
            // InternalPascal.g:3884:2: ( rule__Term__FactorsAssignment_0 )
            {
             before(grammarAccess.getTermAccess().getFactorsAssignment_0()); 
            // InternalPascal.g:3885:2: ( rule__Term__FactorsAssignment_0 )
            // InternalPascal.g:3885:3: rule__Term__FactorsAssignment_0
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
    // InternalPascal.g:3893:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3897:1: ( rule__Term__Group__1__Impl )
            // InternalPascal.g:3898:2: rule__Term__Group__1__Impl
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
    // InternalPascal.g:3904:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )? ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3908:1: ( ( ( rule__Term__Group_1__0 )? ) )
            // InternalPascal.g:3909:1: ( ( rule__Term__Group_1__0 )? )
            {
            // InternalPascal.g:3909:1: ( ( rule__Term__Group_1__0 )? )
            // InternalPascal.g:3910:2: ( rule__Term__Group_1__0 )?
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // InternalPascal.g:3911:2: ( rule__Term__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STAR && LA34_0<=RULE_AND)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPascal.g:3911:3: rule__Term__Group_1__0
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
    // InternalPascal.g:3920:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3924:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalPascal.g:3925:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
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
    // InternalPascal.g:3932:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__OperatorsAssignment_1_0 ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3936:1: ( ( ( rule__Term__OperatorsAssignment_1_0 ) ) )
            // InternalPascal.g:3937:1: ( ( rule__Term__OperatorsAssignment_1_0 ) )
            {
            // InternalPascal.g:3937:1: ( ( rule__Term__OperatorsAssignment_1_0 ) )
            // InternalPascal.g:3938:2: ( rule__Term__OperatorsAssignment_1_0 )
            {
             before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0()); 
            // InternalPascal.g:3939:2: ( rule__Term__OperatorsAssignment_1_0 )
            // InternalPascal.g:3939:3: rule__Term__OperatorsAssignment_1_0
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
    // InternalPascal.g:3947:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3951:1: ( rule__Term__Group_1__1__Impl )
            // InternalPascal.g:3952:2: rule__Term__Group_1__1__Impl
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
    // InternalPascal.g:3958:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__TermsAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3962:1: ( ( ( rule__Term__TermsAssignment_1_1 ) ) )
            // InternalPascal.g:3963:1: ( ( rule__Term__TermsAssignment_1_1 ) )
            {
            // InternalPascal.g:3963:1: ( ( rule__Term__TermsAssignment_1_1 ) )
            // InternalPascal.g:3964:2: ( rule__Term__TermsAssignment_1_1 )
            {
             before(grammarAccess.getTermAccess().getTermsAssignment_1_1()); 
            // InternalPascal.g:3965:2: ( rule__Term__TermsAssignment_1_1 )
            // InternalPascal.g:3965:3: rule__Term__TermsAssignment_1_1
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
    // InternalPascal.g:3974:1: rule__Signed_factor__Group__0 : rule__Signed_factor__Group__0__Impl rule__Signed_factor__Group__1 ;
    public final void rule__Signed_factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3978:1: ( rule__Signed_factor__Group__0__Impl rule__Signed_factor__Group__1 )
            // InternalPascal.g:3979:2: rule__Signed_factor__Group__0__Impl rule__Signed_factor__Group__1
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
    // InternalPascal.g:3986:1: rule__Signed_factor__Group__0__Impl : ( ( rule__Signed_factor__Alternatives_0 )? ) ;
    public final void rule__Signed_factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3990:1: ( ( ( rule__Signed_factor__Alternatives_0 )? ) )
            // InternalPascal.g:3991:1: ( ( rule__Signed_factor__Alternatives_0 )? )
            {
            // InternalPascal.g:3991:1: ( ( rule__Signed_factor__Alternatives_0 )? )
            // InternalPascal.g:3992:2: ( rule__Signed_factor__Alternatives_0 )?
            {
             before(grammarAccess.getSigned_factorAccess().getAlternatives_0()); 
            // InternalPascal.g:3993:2: ( rule__Signed_factor__Alternatives_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_PLUS && LA35_0<=RULE_MINUS)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPascal.g:3993:3: rule__Signed_factor__Alternatives_0
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
    // InternalPascal.g:4001:1: rule__Signed_factor__Group__1 : rule__Signed_factor__Group__1__Impl ;
    public final void rule__Signed_factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4005:1: ( rule__Signed_factor__Group__1__Impl )
            // InternalPascal.g:4006:2: rule__Signed_factor__Group__1__Impl
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
    // InternalPascal.g:4012:1: rule__Signed_factor__Group__1__Impl : ( ( rule__Signed_factor__FactorsAssignment_1 ) ) ;
    public final void rule__Signed_factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4016:1: ( ( ( rule__Signed_factor__FactorsAssignment_1 ) ) )
            // InternalPascal.g:4017:1: ( ( rule__Signed_factor__FactorsAssignment_1 ) )
            {
            // InternalPascal.g:4017:1: ( ( rule__Signed_factor__FactorsAssignment_1 ) )
            // InternalPascal.g:4018:2: ( rule__Signed_factor__FactorsAssignment_1 )
            {
             before(grammarAccess.getSigned_factorAccess().getFactorsAssignment_1()); 
            // InternalPascal.g:4019:2: ( rule__Signed_factor__FactorsAssignment_1 )
            // InternalPascal.g:4019:3: rule__Signed_factor__FactorsAssignment_1
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
    // InternalPascal.g:4028:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4032:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalPascal.g:4033:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
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
    // InternalPascal.g:4040:1: rule__Factor__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4044:1: ( ( '(' ) )
            // InternalPascal.g:4045:1: ( '(' )
            {
            // InternalPascal.g:4045:1: ( '(' )
            // InternalPascal.g:4046:2: '('
            {
             before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalPascal.g:4055:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4059:1: ( rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 )
            // InternalPascal.g:4060:2: rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2
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
    // InternalPascal.g:4067:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__ExpressionAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4071:1: ( ( ( rule__Factor__ExpressionAssignment_1_1 ) ) )
            // InternalPascal.g:4072:1: ( ( rule__Factor__ExpressionAssignment_1_1 ) )
            {
            // InternalPascal.g:4072:1: ( ( rule__Factor__ExpressionAssignment_1_1 ) )
            // InternalPascal.g:4073:2: ( rule__Factor__ExpressionAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getExpressionAssignment_1_1()); 
            // InternalPascal.g:4074:2: ( rule__Factor__ExpressionAssignment_1_1 )
            // InternalPascal.g:4074:3: rule__Factor__ExpressionAssignment_1_1
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
    // InternalPascal.g:4082:1: rule__Factor__Group_1__2 : rule__Factor__Group_1__2__Impl ;
    public final void rule__Factor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4086:1: ( rule__Factor__Group_1__2__Impl )
            // InternalPascal.g:4087:2: rule__Factor__Group_1__2__Impl
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
    // InternalPascal.g:4093:1: rule__Factor__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4097:1: ( ( ')' ) )
            // InternalPascal.g:4098:1: ( ')' )
            {
            // InternalPascal.g:4098:1: ( ')' )
            // InternalPascal.g:4099:2: ')'
            {
             before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_1_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalPascal.g:4109:1: rule__Factor__Group_4__0 : rule__Factor__Group_4__0__Impl rule__Factor__Group_4__1 ;
    public final void rule__Factor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4113:1: ( rule__Factor__Group_4__0__Impl rule__Factor__Group_4__1 )
            // InternalPascal.g:4114:2: rule__Factor__Group_4__0__Impl rule__Factor__Group_4__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalPascal.g:4121:1: rule__Factor__Group_4__0__Impl : ( RULE_NOT ) ;
    public final void rule__Factor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4125:1: ( ( RULE_NOT ) )
            // InternalPascal.g:4126:1: ( RULE_NOT )
            {
            // InternalPascal.g:4126:1: ( RULE_NOT )
            // InternalPascal.g:4127:2: RULE_NOT
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
    // InternalPascal.g:4136:1: rule__Factor__Group_4__1 : rule__Factor__Group_4__1__Impl ;
    public final void rule__Factor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4140:1: ( rule__Factor__Group_4__1__Impl )
            // InternalPascal.g:4141:2: rule__Factor__Group_4__1__Impl
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
    // InternalPascal.g:4147:1: rule__Factor__Group_4__1__Impl : ( ( rule__Factor__FactorAssignment_4_1 ) ) ;
    public final void rule__Factor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4151:1: ( ( ( rule__Factor__FactorAssignment_4_1 ) ) )
            // InternalPascal.g:4152:1: ( ( rule__Factor__FactorAssignment_4_1 ) )
            {
            // InternalPascal.g:4152:1: ( ( rule__Factor__FactorAssignment_4_1 ) )
            // InternalPascal.g:4153:2: ( rule__Factor__FactorAssignment_4_1 )
            {
             before(grammarAccess.getFactorAccess().getFactorAssignment_4_1()); 
            // InternalPascal.g:4154:2: ( rule__Factor__FactorAssignment_4_1 )
            // InternalPascal.g:4154:3: rule__Factor__FactorAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__FactorAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getFactorAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Set__Group_0__0"
    // InternalPascal.g:4163:1: rule__Set__Group_0__0 : rule__Set__Group_0__0__Impl rule__Set__Group_0__1 ;
    public final void rule__Set__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4167:1: ( rule__Set__Group_0__0__Impl rule__Set__Group_0__1 )
            // InternalPascal.g:4168:2: rule__Set__Group_0__0__Impl rule__Set__Group_0__1
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
    // InternalPascal.g:4175:1: rule__Set__Group_0__0__Impl : ( '[' ) ;
    public final void rule__Set__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4179:1: ( ( '[' ) )
            // InternalPascal.g:4180:1: ( '[' )
            {
            // InternalPascal.g:4180:1: ( '[' )
            // InternalPascal.g:4181:2: '['
            {
             before(grammarAccess.getSetAccess().getLeftSquareBracketKeyword_0_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalPascal.g:4190:1: rule__Set__Group_0__1 : rule__Set__Group_0__1__Impl rule__Set__Group_0__2 ;
    public final void rule__Set__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4194:1: ( rule__Set__Group_0__1__Impl rule__Set__Group_0__2 )
            // InternalPascal.g:4195:2: rule__Set__Group_0__1__Impl rule__Set__Group_0__2
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
    // InternalPascal.g:4202:1: rule__Set__Group_0__1__Impl : ( ( rule__Set__ElementsAssignment_0_1 ) ) ;
    public final void rule__Set__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4206:1: ( ( ( rule__Set__ElementsAssignment_0_1 ) ) )
            // InternalPascal.g:4207:1: ( ( rule__Set__ElementsAssignment_0_1 ) )
            {
            // InternalPascal.g:4207:1: ( ( rule__Set__ElementsAssignment_0_1 ) )
            // InternalPascal.g:4208:2: ( rule__Set__ElementsAssignment_0_1 )
            {
             before(grammarAccess.getSetAccess().getElementsAssignment_0_1()); 
            // InternalPascal.g:4209:2: ( rule__Set__ElementsAssignment_0_1 )
            // InternalPascal.g:4209:3: rule__Set__ElementsAssignment_0_1
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
    // InternalPascal.g:4217:1: rule__Set__Group_0__2 : rule__Set__Group_0__2__Impl ;
    public final void rule__Set__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4221:1: ( rule__Set__Group_0__2__Impl )
            // InternalPascal.g:4222:2: rule__Set__Group_0__2__Impl
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
    // InternalPascal.g:4228:1: rule__Set__Group_0__2__Impl : ( ']' ) ;
    public final void rule__Set__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4232:1: ( ( ']' ) )
            // InternalPascal.g:4233:1: ( ']' )
            {
            // InternalPascal.g:4233:1: ( ']' )
            // InternalPascal.g:4234:2: ']'
            {
             before(grammarAccess.getSetAccess().getRightSquareBracketKeyword_0_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalPascal.g:4244:1: rule__Set__Group_1__0 : rule__Set__Group_1__0__Impl rule__Set__Group_1__1 ;
    public final void rule__Set__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4248:1: ( rule__Set__Group_1__0__Impl rule__Set__Group_1__1 )
            // InternalPascal.g:4249:2: rule__Set__Group_1__0__Impl rule__Set__Group_1__1
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
    // InternalPascal.g:4256:1: rule__Set__Group_1__0__Impl : ( '(.' ) ;
    public final void rule__Set__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4260:1: ( ( '(.' ) )
            // InternalPascal.g:4261:1: ( '(.' )
            {
            // InternalPascal.g:4261:1: ( '(.' )
            // InternalPascal.g:4262:2: '(.'
            {
             before(grammarAccess.getSetAccess().getLeftParenthesisFullStopKeyword_1_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalPascal.g:4271:1: rule__Set__Group_1__1 : rule__Set__Group_1__1__Impl rule__Set__Group_1__2 ;
    public final void rule__Set__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4275:1: ( rule__Set__Group_1__1__Impl rule__Set__Group_1__2 )
            // InternalPascal.g:4276:2: rule__Set__Group_1__1__Impl rule__Set__Group_1__2
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
    // InternalPascal.g:4283:1: rule__Set__Group_1__1__Impl : ( ( rule__Set__ElementsAssignment_1_1 ) ) ;
    public final void rule__Set__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4287:1: ( ( ( rule__Set__ElementsAssignment_1_1 ) ) )
            // InternalPascal.g:4288:1: ( ( rule__Set__ElementsAssignment_1_1 ) )
            {
            // InternalPascal.g:4288:1: ( ( rule__Set__ElementsAssignment_1_1 ) )
            // InternalPascal.g:4289:2: ( rule__Set__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getSetAccess().getElementsAssignment_1_1()); 
            // InternalPascal.g:4290:2: ( rule__Set__ElementsAssignment_1_1 )
            // InternalPascal.g:4290:3: rule__Set__ElementsAssignment_1_1
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
    // InternalPascal.g:4298:1: rule__Set__Group_1__2 : rule__Set__Group_1__2__Impl ;
    public final void rule__Set__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4302:1: ( rule__Set__Group_1__2__Impl )
            // InternalPascal.g:4303:2: rule__Set__Group_1__2__Impl
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
    // InternalPascal.g:4309:1: rule__Set__Group_1__2__Impl : ( '.)' ) ;
    public final void rule__Set__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4313:1: ( ( '.)' ) )
            // InternalPascal.g:4314:1: ( '.)' )
            {
            // InternalPascal.g:4314:1: ( '.)' )
            // InternalPascal.g:4315:2: '.)'
            {
             before(grammarAccess.getSetAccess().getFullStopRightParenthesisKeyword_1_2()); 
            match(input,54,FOLLOW_2); 
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
    // InternalPascal.g:4325:1: rule__ElementList__Group__0 : rule__ElementList__Group__0__Impl rule__ElementList__Group__1 ;
    public final void rule__ElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4329:1: ( rule__ElementList__Group__0__Impl rule__ElementList__Group__1 )
            // InternalPascal.g:4330:2: rule__ElementList__Group__0__Impl rule__ElementList__Group__1
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
    // InternalPascal.g:4337:1: rule__ElementList__Group__0__Impl : ( ( rule__ElementList__ElementsAssignment_0 ) ) ;
    public final void rule__ElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4341:1: ( ( ( rule__ElementList__ElementsAssignment_0 ) ) )
            // InternalPascal.g:4342:1: ( ( rule__ElementList__ElementsAssignment_0 ) )
            {
            // InternalPascal.g:4342:1: ( ( rule__ElementList__ElementsAssignment_0 ) )
            // InternalPascal.g:4343:2: ( rule__ElementList__ElementsAssignment_0 )
            {
             before(grammarAccess.getElementListAccess().getElementsAssignment_0()); 
            // InternalPascal.g:4344:2: ( rule__ElementList__ElementsAssignment_0 )
            // InternalPascal.g:4344:3: rule__ElementList__ElementsAssignment_0
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
    // InternalPascal.g:4352:1: rule__ElementList__Group__1 : rule__ElementList__Group__1__Impl ;
    public final void rule__ElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4356:1: ( rule__ElementList__Group__1__Impl )
            // InternalPascal.g:4357:2: rule__ElementList__Group__1__Impl
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
    // InternalPascal.g:4363:1: rule__ElementList__Group__1__Impl : ( ( rule__ElementList__Group_1__0 )* ) ;
    public final void rule__ElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4367:1: ( ( ( rule__ElementList__Group_1__0 )* ) )
            // InternalPascal.g:4368:1: ( ( rule__ElementList__Group_1__0 )* )
            {
            // InternalPascal.g:4368:1: ( ( rule__ElementList__Group_1__0 )* )
            // InternalPascal.g:4369:2: ( rule__ElementList__Group_1__0 )*
            {
             before(grammarAccess.getElementListAccess().getGroup_1()); 
            // InternalPascal.g:4370:2: ( rule__ElementList__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==44) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPascal.g:4370:3: rule__ElementList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ElementList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalPascal.g:4379:1: rule__ElementList__Group_1__0 : rule__ElementList__Group_1__0__Impl rule__ElementList__Group_1__1 ;
    public final void rule__ElementList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4383:1: ( rule__ElementList__Group_1__0__Impl rule__ElementList__Group_1__1 )
            // InternalPascal.g:4384:2: rule__ElementList__Group_1__0__Impl rule__ElementList__Group_1__1
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
    // InternalPascal.g:4391:1: rule__ElementList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ElementList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4395:1: ( ( ',' ) )
            // InternalPascal.g:4396:1: ( ',' )
            {
            // InternalPascal.g:4396:1: ( ',' )
            // InternalPascal.g:4397:2: ','
            {
             before(grammarAccess.getElementListAccess().getCommaKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalPascal.g:4406:1: rule__ElementList__Group_1__1 : rule__ElementList__Group_1__1__Impl ;
    public final void rule__ElementList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4410:1: ( rule__ElementList__Group_1__1__Impl )
            // InternalPascal.g:4411:2: rule__ElementList__Group_1__1__Impl
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
    // InternalPascal.g:4417:1: rule__ElementList__Group_1__1__Impl : ( ( rule__ElementList__ElementsAssignment_1_1 ) ) ;
    public final void rule__ElementList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4421:1: ( ( ( rule__ElementList__ElementsAssignment_1_1 ) ) )
            // InternalPascal.g:4422:1: ( ( rule__ElementList__ElementsAssignment_1_1 ) )
            {
            // InternalPascal.g:4422:1: ( ( rule__ElementList__ElementsAssignment_1_1 ) )
            // InternalPascal.g:4423:2: ( rule__ElementList__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getElementListAccess().getElementsAssignment_1_1()); 
            // InternalPascal.g:4424:2: ( rule__ElementList__ElementsAssignment_1_1 )
            // InternalPascal.g:4424:3: rule__ElementList__ElementsAssignment_1_1
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
    // InternalPascal.g:4433:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4437:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalPascal.g:4438:2: rule__Element__Group__0__Impl rule__Element__Group__1
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
    // InternalPascal.g:4445:1: rule__Element__Group__0__Impl : ( ( rule__Element__ExpressionsAssignment_0 ) ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4449:1: ( ( ( rule__Element__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:4450:1: ( ( rule__Element__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:4450:1: ( ( rule__Element__ExpressionsAssignment_0 ) )
            // InternalPascal.g:4451:2: ( rule__Element__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getElementAccess().getExpressionsAssignment_0()); 
            // InternalPascal.g:4452:2: ( rule__Element__ExpressionsAssignment_0 )
            // InternalPascal.g:4452:3: rule__Element__ExpressionsAssignment_0
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
    // InternalPascal.g:4460:1: rule__Element__Group__1 : rule__Element__Group__1__Impl ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4464:1: ( rule__Element__Group__1__Impl )
            // InternalPascal.g:4465:2: rule__Element__Group__1__Impl
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
    // InternalPascal.g:4471:1: rule__Element__Group__1__Impl : ( ( rule__Element__Group_1__0 )? ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4475:1: ( ( ( rule__Element__Group_1__0 )? ) )
            // InternalPascal.g:4476:1: ( ( rule__Element__Group_1__0 )? )
            {
            // InternalPascal.g:4476:1: ( ( rule__Element__Group_1__0 )? )
            // InternalPascal.g:4477:2: ( rule__Element__Group_1__0 )?
            {
             before(grammarAccess.getElementAccess().getGroup_1()); 
            // InternalPascal.g:4478:2: ( rule__Element__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_DOTDOT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPascal.g:4478:3: rule__Element__Group_1__0
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
    // InternalPascal.g:4487:1: rule__Element__Group_1__0 : rule__Element__Group_1__0__Impl rule__Element__Group_1__1 ;
    public final void rule__Element__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4491:1: ( rule__Element__Group_1__0__Impl rule__Element__Group_1__1 )
            // InternalPascal.g:4492:2: rule__Element__Group_1__0__Impl rule__Element__Group_1__1
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
    // InternalPascal.g:4499:1: rule__Element__Group_1__0__Impl : ( ( rule__Element__DotdotAssignment_1_0 ) ) ;
    public final void rule__Element__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4503:1: ( ( ( rule__Element__DotdotAssignment_1_0 ) ) )
            // InternalPascal.g:4504:1: ( ( rule__Element__DotdotAssignment_1_0 ) )
            {
            // InternalPascal.g:4504:1: ( ( rule__Element__DotdotAssignment_1_0 ) )
            // InternalPascal.g:4505:2: ( rule__Element__DotdotAssignment_1_0 )
            {
             before(grammarAccess.getElementAccess().getDotdotAssignment_1_0()); 
            // InternalPascal.g:4506:2: ( rule__Element__DotdotAssignment_1_0 )
            // InternalPascal.g:4506:3: rule__Element__DotdotAssignment_1_0
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
    // InternalPascal.g:4514:1: rule__Element__Group_1__1 : rule__Element__Group_1__1__Impl ;
    public final void rule__Element__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4518:1: ( rule__Element__Group_1__1__Impl )
            // InternalPascal.g:4519:2: rule__Element__Group_1__1__Impl
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
    // InternalPascal.g:4525:1: rule__Element__Group_1__1__Impl : ( ( rule__Element__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Element__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4529:1: ( ( ( rule__Element__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:4530:1: ( ( rule__Element__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:4530:1: ( ( rule__Element__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:4531:2: ( rule__Element__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getElementAccess().getExpressionsAssignment_1_1()); 
            // InternalPascal.g:4532:2: ( rule__Element__ExpressionsAssignment_1_1 )
            // InternalPascal.g:4532:3: rule__Element__ExpressionsAssignment_1_1
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
    // InternalPascal.g:4541:1: rule__Scalar_type__Group__0 : rule__Scalar_type__Group__0__Impl rule__Scalar_type__Group__1 ;
    public final void rule__Scalar_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4545:1: ( rule__Scalar_type__Group__0__Impl rule__Scalar_type__Group__1 )
            // InternalPascal.g:4546:2: rule__Scalar_type__Group__0__Impl rule__Scalar_type__Group__1
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
    // InternalPascal.g:4553:1: rule__Scalar_type__Group__0__Impl : ( '(' ) ;
    public final void rule__Scalar_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4557:1: ( ( '(' ) )
            // InternalPascal.g:4558:1: ( '(' )
            {
            // InternalPascal.g:4558:1: ( '(' )
            // InternalPascal.g:4559:2: '('
            {
             before(grammarAccess.getScalar_typeAccess().getLeftParenthesisKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalPascal.g:4568:1: rule__Scalar_type__Group__1 : rule__Scalar_type__Group__1__Impl rule__Scalar_type__Group__2 ;
    public final void rule__Scalar_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4572:1: ( rule__Scalar_type__Group__1__Impl rule__Scalar_type__Group__2 )
            // InternalPascal.g:4573:2: rule__Scalar_type__Group__1__Impl rule__Scalar_type__Group__2
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
    // InternalPascal.g:4580:1: rule__Scalar_type__Group__1__Impl : ( ruleidentifier_list ) ;
    public final void rule__Scalar_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4584:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:4585:1: ( ruleidentifier_list )
            {
            // InternalPascal.g:4585:1: ( ruleidentifier_list )
            // InternalPascal.g:4586:2: ruleidentifier_list
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
    // InternalPascal.g:4595:1: rule__Scalar_type__Group__2 : rule__Scalar_type__Group__2__Impl ;
    public final void rule__Scalar_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4599:1: ( rule__Scalar_type__Group__2__Impl )
            // InternalPascal.g:4600:2: rule__Scalar_type__Group__2__Impl
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
    // InternalPascal.g:4606:1: rule__Scalar_type__Group__2__Impl : ( ')' ) ;
    public final void rule__Scalar_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4610:1: ( ( ')' ) )
            // InternalPascal.g:4611:1: ( ')' )
            {
            // InternalPascal.g:4611:1: ( ')' )
            // InternalPascal.g:4612:2: ')'
            {
             before(grammarAccess.getScalar_typeAccess().getRightParenthesisKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalPascal.g:4622:1: rule__Subrange_type__Group__0 : rule__Subrange_type__Group__0__Impl rule__Subrange_type__Group__1 ;
    public final void rule__Subrange_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4626:1: ( rule__Subrange_type__Group__0__Impl rule__Subrange_type__Group__1 )
            // InternalPascal.g:4627:2: rule__Subrange_type__Group__0__Impl rule__Subrange_type__Group__1
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
    // InternalPascal.g:4634:1: rule__Subrange_type__Group__0__Impl : ( ( rule__Subrange_type__ConstantsAssignment_0 ) ) ;
    public final void rule__Subrange_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4638:1: ( ( ( rule__Subrange_type__ConstantsAssignment_0 ) ) )
            // InternalPascal.g:4639:1: ( ( rule__Subrange_type__ConstantsAssignment_0 ) )
            {
            // InternalPascal.g:4639:1: ( ( rule__Subrange_type__ConstantsAssignment_0 ) )
            // InternalPascal.g:4640:2: ( rule__Subrange_type__ConstantsAssignment_0 )
            {
             before(grammarAccess.getSubrange_typeAccess().getConstantsAssignment_0()); 
            // InternalPascal.g:4641:2: ( rule__Subrange_type__ConstantsAssignment_0 )
            // InternalPascal.g:4641:3: rule__Subrange_type__ConstantsAssignment_0
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
    // InternalPascal.g:4649:1: rule__Subrange_type__Group__1 : rule__Subrange_type__Group__1__Impl rule__Subrange_type__Group__2 ;
    public final void rule__Subrange_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4653:1: ( rule__Subrange_type__Group__1__Impl rule__Subrange_type__Group__2 )
            // InternalPascal.g:4654:2: rule__Subrange_type__Group__1__Impl rule__Subrange_type__Group__2
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
    // InternalPascal.g:4661:1: rule__Subrange_type__Group__1__Impl : ( RULE_DOTDOT ) ;
    public final void rule__Subrange_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4665:1: ( ( RULE_DOTDOT ) )
            // InternalPascal.g:4666:1: ( RULE_DOTDOT )
            {
            // InternalPascal.g:4666:1: ( RULE_DOTDOT )
            // InternalPascal.g:4667:2: RULE_DOTDOT
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
    // InternalPascal.g:4676:1: rule__Subrange_type__Group__2 : rule__Subrange_type__Group__2__Impl ;
    public final void rule__Subrange_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4680:1: ( rule__Subrange_type__Group__2__Impl )
            // InternalPascal.g:4681:2: rule__Subrange_type__Group__2__Impl
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
    // InternalPascal.g:4687:1: rule__Subrange_type__Group__2__Impl : ( ( rule__Subrange_type__ConstantsAssignment_2 ) ) ;
    public final void rule__Subrange_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4691:1: ( ( ( rule__Subrange_type__ConstantsAssignment_2 ) ) )
            // InternalPascal.g:4692:1: ( ( rule__Subrange_type__ConstantsAssignment_2 ) )
            {
            // InternalPascal.g:4692:1: ( ( rule__Subrange_type__ConstantsAssignment_2 ) )
            // InternalPascal.g:4693:2: ( rule__Subrange_type__ConstantsAssignment_2 )
            {
             before(grammarAccess.getSubrange_typeAccess().getConstantsAssignment_2()); 
            // InternalPascal.g:4694:2: ( rule__Subrange_type__ConstantsAssignment_2 )
            // InternalPascal.g:4694:3: rule__Subrange_type__ConstantsAssignment_2
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
    // InternalPascal.g:4703:1: rule__String_type__Group__0 : rule__String_type__Group__0__Impl rule__String_type__Group__1 ;
    public final void rule__String_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4707:1: ( rule__String_type__Group__0__Impl rule__String_type__Group__1 )
            // InternalPascal.g:4708:2: rule__String_type__Group__0__Impl rule__String_type__Group__1
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
    // InternalPascal.g:4715:1: rule__String_type__Group__0__Impl : ( 'string' ) ;
    public final void rule__String_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4719:1: ( ( 'string' ) )
            // InternalPascal.g:4720:1: ( 'string' )
            {
            // InternalPascal.g:4720:1: ( 'string' )
            // InternalPascal.g:4721:2: 'string'
            {
             before(grammarAccess.getString_typeAccess().getStringKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalPascal.g:4730:1: rule__String_type__Group__1 : rule__String_type__Group__1__Impl rule__String_type__Group__2 ;
    public final void rule__String_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4734:1: ( rule__String_type__Group__1__Impl rule__String_type__Group__2 )
            // InternalPascal.g:4735:2: rule__String_type__Group__1__Impl rule__String_type__Group__2
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
    // InternalPascal.g:4742:1: rule__String_type__Group__1__Impl : ( '[' ) ;
    public final void rule__String_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4746:1: ( ( '[' ) )
            // InternalPascal.g:4747:1: ( '[' )
            {
            // InternalPascal.g:4747:1: ( '[' )
            // InternalPascal.g:4748:2: '['
            {
             before(grammarAccess.getString_typeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalPascal.g:4757:1: rule__String_type__Group__2 : rule__String_type__Group__2__Impl rule__String_type__Group__3 ;
    public final void rule__String_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4761:1: ( rule__String_type__Group__2__Impl rule__String_type__Group__3 )
            // InternalPascal.g:4762:2: rule__String_type__Group__2__Impl rule__String_type__Group__3
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
    // InternalPascal.g:4769:1: rule__String_type__Group__2__Impl : ( ( rule__String_type__Alternatives_2 ) ) ;
    public final void rule__String_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4773:1: ( ( ( rule__String_type__Alternatives_2 ) ) )
            // InternalPascal.g:4774:1: ( ( rule__String_type__Alternatives_2 ) )
            {
            // InternalPascal.g:4774:1: ( ( rule__String_type__Alternatives_2 ) )
            // InternalPascal.g:4775:2: ( rule__String_type__Alternatives_2 )
            {
             before(grammarAccess.getString_typeAccess().getAlternatives_2()); 
            // InternalPascal.g:4776:2: ( rule__String_type__Alternatives_2 )
            // InternalPascal.g:4776:3: rule__String_type__Alternatives_2
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
    // InternalPascal.g:4784:1: rule__String_type__Group__3 : rule__String_type__Group__3__Impl ;
    public final void rule__String_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4788:1: ( rule__String_type__Group__3__Impl )
            // InternalPascal.g:4789:2: rule__String_type__Group__3__Impl
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
    // InternalPascal.g:4795:1: rule__String_type__Group__3__Impl : ( ']' ) ;
    public final void rule__String_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4799:1: ( ( ']' ) )
            // InternalPascal.g:4800:1: ( ']' )
            {
            // InternalPascal.g:4800:1: ( ']' )
            // InternalPascal.g:4801:2: ']'
            {
             before(grammarAccess.getString_typeAccess().getRightSquareBracketKeyword_3()); 
            match(input,52,FOLLOW_2); 
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
    // InternalPascal.g:4811:1: rule__Constant_chr__Group__0 : rule__Constant_chr__Group__0__Impl rule__Constant_chr__Group__1 ;
    public final void rule__Constant_chr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4815:1: ( rule__Constant_chr__Group__0__Impl rule__Constant_chr__Group__1 )
            // InternalPascal.g:4816:2: rule__Constant_chr__Group__0__Impl rule__Constant_chr__Group__1
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
    // InternalPascal.g:4823:1: rule__Constant_chr__Group__0__Impl : ( 'chr' ) ;
    public final void rule__Constant_chr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4827:1: ( ( 'chr' ) )
            // InternalPascal.g:4828:1: ( 'chr' )
            {
            // InternalPascal.g:4828:1: ( 'chr' )
            // InternalPascal.g:4829:2: 'chr'
            {
             before(grammarAccess.getConstant_chrAccess().getChrKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalPascal.g:4838:1: rule__Constant_chr__Group__1 : rule__Constant_chr__Group__1__Impl rule__Constant_chr__Group__2 ;
    public final void rule__Constant_chr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4842:1: ( rule__Constant_chr__Group__1__Impl rule__Constant_chr__Group__2 )
            // InternalPascal.g:4843:2: rule__Constant_chr__Group__1__Impl rule__Constant_chr__Group__2
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
    // InternalPascal.g:4850:1: rule__Constant_chr__Group__1__Impl : ( '(' ) ;
    public final void rule__Constant_chr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4854:1: ( ( '(' ) )
            // InternalPascal.g:4855:1: ( '(' )
            {
            // InternalPascal.g:4855:1: ( '(' )
            // InternalPascal.g:4856:2: '('
            {
             before(grammarAccess.getConstant_chrAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalPascal.g:4865:1: rule__Constant_chr__Group__2 : rule__Constant_chr__Group__2__Impl rule__Constant_chr__Group__3 ;
    public final void rule__Constant_chr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4869:1: ( rule__Constant_chr__Group__2__Impl rule__Constant_chr__Group__3 )
            // InternalPascal.g:4870:2: rule__Constant_chr__Group__2__Impl rule__Constant_chr__Group__3
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
    // InternalPascal.g:4877:1: rule__Constant_chr__Group__2__Impl : ( ( rule__Constant_chr__NumbersAssignment_2 ) ) ;
    public final void rule__Constant_chr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4881:1: ( ( ( rule__Constant_chr__NumbersAssignment_2 ) ) )
            // InternalPascal.g:4882:1: ( ( rule__Constant_chr__NumbersAssignment_2 ) )
            {
            // InternalPascal.g:4882:1: ( ( rule__Constant_chr__NumbersAssignment_2 ) )
            // InternalPascal.g:4883:2: ( rule__Constant_chr__NumbersAssignment_2 )
            {
             before(grammarAccess.getConstant_chrAccess().getNumbersAssignment_2()); 
            // InternalPascal.g:4884:2: ( rule__Constant_chr__NumbersAssignment_2 )
            // InternalPascal.g:4884:3: rule__Constant_chr__NumbersAssignment_2
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
    // InternalPascal.g:4892:1: rule__Constant_chr__Group__3 : rule__Constant_chr__Group__3__Impl ;
    public final void rule__Constant_chr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4896:1: ( rule__Constant_chr__Group__3__Impl )
            // InternalPascal.g:4897:2: rule__Constant_chr__Group__3__Impl
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
    // InternalPascal.g:4903:1: rule__Constant_chr__Group__3__Impl : ( ')' ) ;
    public final void rule__Constant_chr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4907:1: ( ( ')' ) )
            // InternalPascal.g:4908:1: ( ')' )
            {
            // InternalPascal.g:4908:1: ( ')' )
            // InternalPascal.g:4909:2: ')'
            {
             before(grammarAccess.getConstant_chrAccess().getRightParenthesisKeyword_3()); 
            match(input,43,FOLLOW_2); 
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


    // $ANTLR start "rule__Pascal__ProgramAssignment"
    // InternalPascal.g:4919:1: rule__Pascal__ProgramAssignment : ( ruleprogram ) ;
    public final void rule__Pascal__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4923:1: ( ( ruleprogram ) )
            // InternalPascal.g:4924:2: ( ruleprogram )
            {
            // InternalPascal.g:4924:2: ( ruleprogram )
            // InternalPascal.g:4925:3: ruleprogram
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
    // InternalPascal.g:4934:1: rule__Program__HeadingAssignment_0 : ( ruleprogram_heading_block ) ;
    public final void rule__Program__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4938:1: ( ( ruleprogram_heading_block ) )
            // InternalPascal.g:4939:2: ( ruleprogram_heading_block )
            {
            // InternalPascal.g:4939:2: ( ruleprogram_heading_block )
            // InternalPascal.g:4940:3: ruleprogram_heading_block
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
    // InternalPascal.g:4949:1: rule__Program__BlockAssignment_1 : ( ruleblock ) ;
    public final void rule__Program__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4953:1: ( ( ruleblock ) )
            // InternalPascal.g:4954:2: ( ruleblock )
            {
            // InternalPascal.g:4954:2: ( ruleblock )
            // InternalPascal.g:4955:3: ruleblock
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
    // InternalPascal.g:4964:1: rule__Program_heading_block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program_heading_block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4968:1: ( ( RULE_ID ) )
            // InternalPascal.g:4969:2: ( RULE_ID )
            {
            // InternalPascal.g:4969:2: ( RULE_ID )
            // InternalPascal.g:4970:3: RULE_ID
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
    // InternalPascal.g:4979:1: rule__Program_heading_block__IdentifiersAssignment_2_1 : ( ruleidentifier_list ) ;
    public final void rule__Program_heading_block__IdentifiersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4983:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:4984:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:4984:2: ( ruleidentifier_list )
            // InternalPascal.g:4985:3: ruleidentifier_list
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
    // InternalPascal.g:4994:1: rule__Identifier_list__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4998:1: ( ( RULE_ID ) )
            // InternalPascal.g:4999:2: ( RULE_ID )
            {
            // InternalPascal.g:4999:2: ( RULE_ID )
            // InternalPascal.g:5000:3: RULE_ID
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
    // InternalPascal.g:5009:1: rule__Identifier_list__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5013:1: ( ( RULE_ID ) )
            // InternalPascal.g:5014:2: ( RULE_ID )
            {
            // InternalPascal.g:5014:2: ( RULE_ID )
            // InternalPascal.g:5015:3: RULE_ID
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
    // InternalPascal.g:5024:1: rule__Block__ConstantpartAssignment_0_0 : ( ruleconstant_definition_part ) ;
    public final void rule__Block__ConstantpartAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5028:1: ( ( ruleconstant_definition_part ) )
            // InternalPascal.g:5029:2: ( ruleconstant_definition_part )
            {
            // InternalPascal.g:5029:2: ( ruleconstant_definition_part )
            // InternalPascal.g:5030:3: ruleconstant_definition_part
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
    // InternalPascal.g:5039:1: rule__Block__VariablepartAssignment_0_1 : ( rulevariable_declaration_part ) ;
    public final void rule__Block__VariablepartAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5043:1: ( ( rulevariable_declaration_part ) )
            // InternalPascal.g:5044:2: ( rulevariable_declaration_part )
            {
            // InternalPascal.g:5044:2: ( rulevariable_declaration_part )
            // InternalPascal.g:5045:3: rulevariable_declaration_part
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


    // $ANTLR start "rule__Block__StatementAssignment_1"
    // InternalPascal.g:5054:1: rule__Block__StatementAssignment_1 : ( rulecompound_statement ) ;
    public final void rule__Block__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5058:1: ( ( rulecompound_statement ) )
            // InternalPascal.g:5059:2: ( rulecompound_statement )
            {
            // InternalPascal.g:5059:2: ( rulecompound_statement )
            // InternalPascal.g:5060:3: rulecompound_statement
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
    // InternalPascal.g:5069:1: rule__Constant_definition_part__ConstantsAssignment_1_0 : ( ruleconstant_definition ) ;
    public final void rule__Constant_definition_part__ConstantsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5073:1: ( ( ruleconstant_definition ) )
            // InternalPascal.g:5074:2: ( ruleconstant_definition )
            {
            // InternalPascal.g:5074:2: ( ruleconstant_definition )
            // InternalPascal.g:5075:3: ruleconstant_definition
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
    // InternalPascal.g:5084:1: rule__Constant_definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constant_definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5088:1: ( ( RULE_ID ) )
            // InternalPascal.g:5089:2: ( RULE_ID )
            {
            // InternalPascal.g:5089:2: ( RULE_ID )
            // InternalPascal.g:5090:3: RULE_ID
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
    // InternalPascal.g:5099:1: rule__Constant__NamesAssignment_2 : ( RULE_ID ) ;
    public final void rule__Constant__NamesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5103:1: ( ( RULE_ID ) )
            // InternalPascal.g:5104:2: ( RULE_ID )
            {
            // InternalPascal.g:5104:2: ( RULE_ID )
            // InternalPascal.g:5105:3: RULE_ID
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
    // InternalPascal.g:5114:1: rule__Constant__NamesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Constant__NamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5118:1: ( ( RULE_ID ) )
            // InternalPascal.g:5119:2: ( RULE_ID )
            {
            // InternalPascal.g:5119:2: ( RULE_ID )
            // InternalPascal.g:5120:3: RULE_ID
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
    // InternalPascal.g:5129:1: rule__Constant__StringAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Constant__StringAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5133:1: ( ( RULE_STRING ) )
            // InternalPascal.g:5134:2: ( RULE_STRING )
            {
            // InternalPascal.g:5134:2: ( RULE_STRING )
            // InternalPascal.g:5135:3: RULE_STRING
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
    // InternalPascal.g:5144:1: rule__Variable_declaration_part__VariableAssignment_1 : ( rulevariable_declaration ) ;
    public final void rule__Variable_declaration_part__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5148:1: ( ( rulevariable_declaration ) )
            // InternalPascal.g:5149:2: ( rulevariable_declaration )
            {
            // InternalPascal.g:5149:2: ( rulevariable_declaration )
            // InternalPascal.g:5150:3: rulevariable_declaration
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
    // InternalPascal.g:5159:1: rule__Variable_declaration_part__VariableAssignment_2_1 : ( rulevariable_declaration ) ;
    public final void rule__Variable_declaration_part__VariableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5163:1: ( ( rulevariable_declaration ) )
            // InternalPascal.g:5164:2: ( rulevariable_declaration )
            {
            // InternalPascal.g:5164:2: ( rulevariable_declaration )
            // InternalPascal.g:5165:3: rulevariable_declaration
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
    // InternalPascal.g:5174:1: rule__Variable_declaration__TypesAssignment_2 : ( ruletype ) ;
    public final void rule__Variable_declaration__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5178:1: ( ( ruletype ) )
            // InternalPascal.g:5179:2: ( ruletype )
            {
            // InternalPascal.g:5179:2: ( ruletype )
            // InternalPascal.g:5180:3: ruletype
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
    // InternalPascal.g:5189:1: rule__Compound_statement__SequenceAssignment_1 : ( rulestatements ) ;
    public final void rule__Compound_statement__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5193:1: ( ( rulestatements ) )
            // InternalPascal.g:5194:2: ( rulestatements )
            {
            // InternalPascal.g:5194:2: ( rulestatements )
            // InternalPascal.g:5195:3: rulestatements
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
    // InternalPascal.g:5204:1: rule__Statements__StatementsAssignment_0 : ( rulestatement ) ;
    public final void rule__Statements__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5208:1: ( ( rulestatement ) )
            // InternalPascal.g:5209:2: ( rulestatement )
            {
            // InternalPascal.g:5209:2: ( rulestatement )
            // InternalPascal.g:5210:3: rulestatement
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
    // InternalPascal.g:5219:1: rule__Statements__StatementsAssignment_1_1 : ( rulestatement ) ;
    public final void rule__Statements__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5223:1: ( ( rulestatement ) )
            // InternalPascal.g:5224:2: ( rulestatement )
            {
            // InternalPascal.g:5224:2: ( rulestatement )
            // InternalPascal.g:5225:3: rulestatement
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
    // InternalPascal.g:5234:1: rule__Statement__LabelAssignment_0_0 : ( rulelabel ) ;
    public final void rule__Statement__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5238:1: ( ( rulelabel ) )
            // InternalPascal.g:5239:2: ( rulelabel )
            {
            // InternalPascal.g:5239:2: ( rulelabel )
            // InternalPascal.g:5240:3: rulelabel
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
    // InternalPascal.g:5249:1: rule__Statement__StatementAssignment_0_2 : ( ruleunlabelled_statement ) ;
    public final void rule__Statement__StatementAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5253:1: ( ( ruleunlabelled_statement ) )
            // InternalPascal.g:5254:2: ( ruleunlabelled_statement )
            {
            // InternalPascal.g:5254:2: ( ruleunlabelled_statement )
            // InternalPascal.g:5255:3: ruleunlabelled_statement
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
    // InternalPascal.g:5264:1: rule__Statement__StatementAssignment_1_1 : ( ruleunlabelled_statement ) ;
    public final void rule__Statement__StatementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5268:1: ( ( ruleunlabelled_statement ) )
            // InternalPascal.g:5269:2: ( ruleunlabelled_statement )
            {
            // InternalPascal.g:5269:2: ( ruleunlabelled_statement )
            // InternalPascal.g:5270:3: ruleunlabelled_statement
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
    // InternalPascal.g:5279:1: rule__Unlabelled_statement__SimpleAssignment_0 : ( rulesimple_statement ) ;
    public final void rule__Unlabelled_statement__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5283:1: ( ( rulesimple_statement ) )
            // InternalPascal.g:5284:2: ( rulesimple_statement )
            {
            // InternalPascal.g:5284:2: ( rulesimple_statement )
            // InternalPascal.g:5285:3: rulesimple_statement
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
    // InternalPascal.g:5294:1: rule__Unlabelled_statement__StructuredAssignment_1 : ( rulestructured_statement ) ;
    public final void rule__Unlabelled_statement__StructuredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5298:1: ( ( rulestructured_statement ) )
            // InternalPascal.g:5299:2: ( rulestructured_statement )
            {
            // InternalPascal.g:5299:2: ( rulestructured_statement )
            // InternalPascal.g:5300:3: rulestructured_statement
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
    // InternalPascal.g:5309:1: rule__Label__NumberAssignment : ( ruleunsigned_integer ) ;
    public final void rule__Label__NumberAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5313:1: ( ( ruleunsigned_integer ) )
            // InternalPascal.g:5314:2: ( ruleunsigned_integer )
            {
            // InternalPascal.g:5314:2: ( ruleunsigned_integer )
            // InternalPascal.g:5315:3: ruleunsigned_integer
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
    // InternalPascal.g:5324:1: rule__Simple_statement__AssignmentAssignment_0 : ( ruleassignment_statement ) ;
    public final void rule__Simple_statement__AssignmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5328:1: ( ( ruleassignment_statement ) )
            // InternalPascal.g:5329:2: ( ruleassignment_statement )
            {
            // InternalPascal.g:5329:2: ( ruleassignment_statement )
            // InternalPascal.g:5330:3: ruleassignment_statement
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
    // InternalPascal.g:5339:1: rule__Simple_statement__ProcedureAssignment_1 : ( ruleprocedure_statement ) ;
    public final void rule__Simple_statement__ProcedureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5343:1: ( ( ruleprocedure_statement ) )
            // InternalPascal.g:5344:2: ( ruleprocedure_statement )
            {
            // InternalPascal.g:5344:2: ( ruleprocedure_statement )
            // InternalPascal.g:5345:3: ruleprocedure_statement
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
    // InternalPascal.g:5354:1: rule__Simple_statement__GotoAssignment_2 : ( rulegoto_statement ) ;
    public final void rule__Simple_statement__GotoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5358:1: ( ( rulegoto_statement ) )
            // InternalPascal.g:5359:2: ( rulegoto_statement )
            {
            // InternalPascal.g:5359:2: ( rulegoto_statement )
            // InternalPascal.g:5360:3: rulegoto_statement
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
    // InternalPascal.g:5369:1: rule__Assignment_statement__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Assignment_statement__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5373:1: ( ( rulevariable ) )
            // InternalPascal.g:5374:2: ( rulevariable )
            {
            // InternalPascal.g:5374:2: ( rulevariable )
            // InternalPascal.g:5375:3: rulevariable
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
    // InternalPascal.g:5384:1: rule__Assignment_statement__ExpressionAssignment_2 : ( ruleexpression ) ;
    public final void rule__Assignment_statement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5388:1: ( ( ruleexpression ) )
            // InternalPascal.g:5389:2: ( ruleexpression )
            {
            // InternalPascal.g:5389:2: ( ruleexpression )
            // InternalPascal.g:5390:3: ruleexpression
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
    // InternalPascal.g:5399:1: rule__Variable__NamesAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__Variable__NamesAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5403:1: ( ( RULE_ID ) )
            // InternalPascal.g:5404:2: ( RULE_ID )
            {
            // InternalPascal.g:5404:2: ( RULE_ID )
            // InternalPascal.g:5405:3: RULE_ID
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
    // InternalPascal.g:5414:1: rule__Variable__NamesAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Variable__NamesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5418:1: ( ( RULE_ID ) )
            // InternalPascal.g:5419:2: ( RULE_ID )
            {
            // InternalPascal.g:5419:2: ( RULE_ID )
            // InternalPascal.g:5420:3: RULE_ID
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
    // InternalPascal.g:5429:1: rule__Variable__ExpressionAssignment_1_0_1 : ( ruleexpression ) ;
    public final void rule__Variable__ExpressionAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5433:1: ( ( ruleexpression ) )
            // InternalPascal.g:5434:2: ( ruleexpression )
            {
            // InternalPascal.g:5434:2: ( ruleexpression )
            // InternalPascal.g:5435:3: ruleexpression
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
    // InternalPascal.g:5444:1: rule__Variable__ExpressionAssignment_1_0_2_1 : ( ruleexpression ) ;
    public final void rule__Variable__ExpressionAssignment_1_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5448:1: ( ( ruleexpression ) )
            // InternalPascal.g:5449:2: ( ruleexpression )
            {
            // InternalPascal.g:5449:2: ( ruleexpression )
            // InternalPascal.g:5450:3: ruleexpression
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
    // InternalPascal.g:5459:1: rule__Variable__ExpressionAssignment_1_1_1 : ( ruleexpression ) ;
    public final void rule__Variable__ExpressionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5463:1: ( ( ruleexpression ) )
            // InternalPascal.g:5464:2: ( ruleexpression )
            {
            // InternalPascal.g:5464:2: ( ruleexpression )
            // InternalPascal.g:5465:3: ruleexpression
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
    // InternalPascal.g:5474:1: rule__Variable__ExpressionAssignment_1_1_2_1 : ( ruleexpression ) ;
    public final void rule__Variable__ExpressionAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5478:1: ( ( ruleexpression ) )
            // InternalPascal.g:5479:2: ( ruleexpression )
            {
            // InternalPascal.g:5479:2: ( ruleexpression )
            // InternalPascal.g:5480:3: ruleexpression
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
    // InternalPascal.g:5489:1: rule__Variable__NamesAssignment_1_2_1 : ( RULE_ID ) ;
    public final void rule__Variable__NamesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5493:1: ( ( RULE_ID ) )
            // InternalPascal.g:5494:2: ( RULE_ID )
            {
            // InternalPascal.g:5494:2: ( RULE_ID )
            // InternalPascal.g:5495:3: RULE_ID
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
    // InternalPascal.g:5504:1: rule__Expression__ExpressionsAssignment_0 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5508:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:5509:2: ( rulesimple_expression )
            {
            // InternalPascal.g:5509:2: ( rulesimple_expression )
            // InternalPascal.g:5510:3: rulesimple_expression
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
    // InternalPascal.g:5519:1: rule__Expression__OperatorsAssignment_1_0 : ( rulerelational_operator ) ;
    public final void rule__Expression__OperatorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5523:1: ( ( rulerelational_operator ) )
            // InternalPascal.g:5524:2: ( rulerelational_operator )
            {
            // InternalPascal.g:5524:2: ( rulerelational_operator )
            // InternalPascal.g:5525:3: rulerelational_operator
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
    // InternalPascal.g:5534:1: rule__Expression__ExpressionsAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__Expression__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5538:1: ( ( ruleexpression ) )
            // InternalPascal.g:5539:2: ( ruleexpression )
            {
            // InternalPascal.g:5539:2: ( ruleexpression )
            // InternalPascal.g:5540:3: ruleexpression
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
    // InternalPascal.g:5549:1: rule__Simple_expression__TermsAssignment_0 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5553:1: ( ( ruleterm ) )
            // InternalPascal.g:5554:2: ( ruleterm )
            {
            // InternalPascal.g:5554:2: ( ruleterm )
            // InternalPascal.g:5555:3: ruleterm
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
    // InternalPascal.g:5564:1: rule__Simple_expression__OperatorsAssignment_1_0 : ( ruleadditive_operator ) ;
    public final void rule__Simple_expression__OperatorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5568:1: ( ( ruleadditive_operator ) )
            // InternalPascal.g:5569:2: ( ruleadditive_operator )
            {
            // InternalPascal.g:5569:2: ( ruleadditive_operator )
            // InternalPascal.g:5570:3: ruleadditive_operator
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
    // InternalPascal.g:5579:1: rule__Simple_expression__ExpressionAssignment_1_1 : ( rulesimple_expression ) ;
    public final void rule__Simple_expression__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5583:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:5584:2: ( rulesimple_expression )
            {
            // InternalPascal.g:5584:2: ( rulesimple_expression )
            // InternalPascal.g:5585:3: rulesimple_expression
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
    // InternalPascal.g:5594:1: rule__Term__FactorsAssignment_0 : ( rulesigned_factor ) ;
    public final void rule__Term__FactorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5598:1: ( ( rulesigned_factor ) )
            // InternalPascal.g:5599:2: ( rulesigned_factor )
            {
            // InternalPascal.g:5599:2: ( rulesigned_factor )
            // InternalPascal.g:5600:3: rulesigned_factor
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
    // InternalPascal.g:5609:1: rule__Term__OperatorsAssignment_1_0 : ( rulemultiplicative_operator ) ;
    public final void rule__Term__OperatorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5613:1: ( ( rulemultiplicative_operator ) )
            // InternalPascal.g:5614:2: ( rulemultiplicative_operator )
            {
            // InternalPascal.g:5614:2: ( rulemultiplicative_operator )
            // InternalPascal.g:5615:3: rulemultiplicative_operator
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
    // InternalPascal.g:5624:1: rule__Term__TermsAssignment_1_1 : ( ruleterm ) ;
    public final void rule__Term__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5628:1: ( ( ruleterm ) )
            // InternalPascal.g:5629:2: ( ruleterm )
            {
            // InternalPascal.g:5629:2: ( ruleterm )
            // InternalPascal.g:5630:3: ruleterm
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
    // InternalPascal.g:5639:1: rule__Signed_factor__OperatorsAssignment_0_0 : ( RULE_PLUS ) ;
    public final void rule__Signed_factor__OperatorsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5643:1: ( ( RULE_PLUS ) )
            // InternalPascal.g:5644:2: ( RULE_PLUS )
            {
            // InternalPascal.g:5644:2: ( RULE_PLUS )
            // InternalPascal.g:5645:3: RULE_PLUS
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
    // InternalPascal.g:5654:1: rule__Signed_factor__OperatorsAssignment_0_1 : ( RULE_MINUS ) ;
    public final void rule__Signed_factor__OperatorsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5658:1: ( ( RULE_MINUS ) )
            // InternalPascal.g:5659:2: ( RULE_MINUS )
            {
            // InternalPascal.g:5659:2: ( RULE_MINUS )
            // InternalPascal.g:5660:3: RULE_MINUS
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
    // InternalPascal.g:5669:1: rule__Signed_factor__FactorsAssignment_1 : ( rulefactor ) ;
    public final void rule__Signed_factor__FactorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5673:1: ( ( rulefactor ) )
            // InternalPascal.g:5674:2: ( rulefactor )
            {
            // InternalPascal.g:5674:2: ( rulefactor )
            // InternalPascal.g:5675:3: rulefactor
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
    // InternalPascal.g:5684:1: rule__Factor__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Factor__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5688:1: ( ( rulevariable ) )
            // InternalPascal.g:5689:2: ( rulevariable )
            {
            // InternalPascal.g:5689:2: ( rulevariable )
            // InternalPascal.g:5690:3: rulevariable
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
    // InternalPascal.g:5699:1: rule__Factor__ExpressionAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__Factor__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5703:1: ( ( ruleexpression ) )
            // InternalPascal.g:5704:2: ( ruleexpression )
            {
            // InternalPascal.g:5704:2: ( ruleexpression )
            // InternalPascal.g:5705:3: ruleexpression
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


    // $ANTLR start "rule__Factor__ConstantAssignment_2"
    // InternalPascal.g:5714:1: rule__Factor__ConstantAssignment_2 : ( ruleunsigned_constant ) ;
    public final void rule__Factor__ConstantAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5718:1: ( ( ruleunsigned_constant ) )
            // InternalPascal.g:5719:2: ( ruleunsigned_constant )
            {
            // InternalPascal.g:5719:2: ( ruleunsigned_constant )
            // InternalPascal.g:5720:3: ruleunsigned_constant
            {
             before(grammarAccess.getFactorAccess().getConstantUnsigned_constantParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleunsigned_constant();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getConstantUnsigned_constantParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__ConstantAssignment_2"


    // $ANTLR start "rule__Factor__SetAssignment_3"
    // InternalPascal.g:5729:1: rule__Factor__SetAssignment_3 : ( ruleset ) ;
    public final void rule__Factor__SetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5733:1: ( ( ruleset ) )
            // InternalPascal.g:5734:2: ( ruleset )
            {
            // InternalPascal.g:5734:2: ( ruleset )
            // InternalPascal.g:5735:3: ruleset
            {
             before(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleset();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__SetAssignment_3"


    // $ANTLR start "rule__Factor__FactorAssignment_4_1"
    // InternalPascal.g:5744:1: rule__Factor__FactorAssignment_4_1 : ( rulefactor ) ;
    public final void rule__Factor__FactorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5748:1: ( ( rulefactor ) )
            // InternalPascal.g:5749:2: ( rulefactor )
            {
            // InternalPascal.g:5749:2: ( rulefactor )
            // InternalPascal.g:5750:3: rulefactor
            {
             before(grammarAccess.getFactorAccess().getFactorFactorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getFactorFactorParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__FactorAssignment_4_1"


    // $ANTLR start "rule__Factor__BooleanAssignment_5"
    // InternalPascal.g:5759:1: rule__Factor__BooleanAssignment_5 : ( rulebool ) ;
    public final void rule__Factor__BooleanAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5763:1: ( ( rulebool ) )
            // InternalPascal.g:5764:2: ( rulebool )
            {
            // InternalPascal.g:5764:2: ( rulebool )
            // InternalPascal.g:5765:3: rulebool
            {
             before(grammarAccess.getFactorAccess().getBooleanBoolParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulebool();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getBooleanBoolParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__BooleanAssignment_5"


    // $ANTLR start "rule__Set__ElementsAssignment_0_1"
    // InternalPascal.g:5774:1: rule__Set__ElementsAssignment_0_1 : ( ruleelementList ) ;
    public final void rule__Set__ElementsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5778:1: ( ( ruleelementList ) )
            // InternalPascal.g:5779:2: ( ruleelementList )
            {
            // InternalPascal.g:5779:2: ( ruleelementList )
            // InternalPascal.g:5780:3: ruleelementList
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
    // InternalPascal.g:5789:1: rule__Set__ElementsAssignment_1_1 : ( ruleelementList ) ;
    public final void rule__Set__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5793:1: ( ( ruleelementList ) )
            // InternalPascal.g:5794:2: ( ruleelementList )
            {
            // InternalPascal.g:5794:2: ( ruleelementList )
            // InternalPascal.g:5795:3: ruleelementList
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
    // InternalPascal.g:5804:1: rule__ElementList__ElementsAssignment_0 : ( ruleelement ) ;
    public final void rule__ElementList__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5808:1: ( ( ruleelement ) )
            // InternalPascal.g:5809:2: ( ruleelement )
            {
            // InternalPascal.g:5809:2: ( ruleelement )
            // InternalPascal.g:5810:3: ruleelement
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
    // InternalPascal.g:5819:1: rule__ElementList__ElementsAssignment_1_1 : ( ruleelement ) ;
    public final void rule__ElementList__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5823:1: ( ( ruleelement ) )
            // InternalPascal.g:5824:2: ( ruleelement )
            {
            // InternalPascal.g:5824:2: ( ruleelement )
            // InternalPascal.g:5825:3: ruleelement
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
    // InternalPascal.g:5834:1: rule__Element__ExpressionsAssignment_0 : ( ruleexpression ) ;
    public final void rule__Element__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5838:1: ( ( ruleexpression ) )
            // InternalPascal.g:5839:2: ( ruleexpression )
            {
            // InternalPascal.g:5839:2: ( ruleexpression )
            // InternalPascal.g:5840:3: ruleexpression
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
    // InternalPascal.g:5849:1: rule__Element__DotdotAssignment_1_0 : ( RULE_DOTDOT ) ;
    public final void rule__Element__DotdotAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5853:1: ( ( RULE_DOTDOT ) )
            // InternalPascal.g:5854:2: ( RULE_DOTDOT )
            {
            // InternalPascal.g:5854:2: ( RULE_DOTDOT )
            // InternalPascal.g:5855:3: RULE_DOTDOT
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
    // InternalPascal.g:5864:1: rule__Element__ExpressionsAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__Element__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5868:1: ( ( ruleexpression ) )
            // InternalPascal.g:5869:2: ( ruleexpression )
            {
            // InternalPascal.g:5869:2: ( ruleexpression )
            // InternalPascal.g:5870:3: ruleexpression
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
    // InternalPascal.g:5879:1: rule__Type__TypeAssignment : ( rulesimple_type ) ;
    public final void rule__Type__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5883:1: ( ( rulesimple_type ) )
            // InternalPascal.g:5884:2: ( rulesimple_type )
            {
            // InternalPascal.g:5884:2: ( rulesimple_type )
            // InternalPascal.g:5885:3: rulesimple_type
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
    // InternalPascal.g:5894:1: rule__Simple_type__TypesAssignment_0 : ( rulescalar_type ) ;
    public final void rule__Simple_type__TypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5898:1: ( ( rulescalar_type ) )
            // InternalPascal.g:5899:2: ( rulescalar_type )
            {
            // InternalPascal.g:5899:2: ( rulescalar_type )
            // InternalPascal.g:5900:3: rulescalar_type
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
    // InternalPascal.g:5909:1: rule__Simple_type__TypesAssignment_1 : ( rulesubrange_type ) ;
    public final void rule__Simple_type__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5913:1: ( ( rulesubrange_type ) )
            // InternalPascal.g:5914:2: ( rulesubrange_type )
            {
            // InternalPascal.g:5914:2: ( rulesubrange_type )
            // InternalPascal.g:5915:3: rulesubrange_type
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
    // InternalPascal.g:5924:1: rule__Simple_type__TypesAssignment_2 : ( ruletype_identifier ) ;
    public final void rule__Simple_type__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5928:1: ( ( ruletype_identifier ) )
            // InternalPascal.g:5929:2: ( ruletype_identifier )
            {
            // InternalPascal.g:5929:2: ( ruletype_identifier )
            // InternalPascal.g:5930:3: ruletype_identifier
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
    // InternalPascal.g:5939:1: rule__Simple_type__TypesAssignment_3 : ( rulestring_type ) ;
    public final void rule__Simple_type__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5943:1: ( ( rulestring_type ) )
            // InternalPascal.g:5944:2: ( rulestring_type )
            {
            // InternalPascal.g:5944:2: ( rulestring_type )
            // InternalPascal.g:5945:3: rulestring_type
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
    // InternalPascal.g:5954:1: rule__Subrange_type__ConstantsAssignment_0 : ( ruleconstant ) ;
    public final void rule__Subrange_type__ConstantsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5958:1: ( ( ruleconstant ) )
            // InternalPascal.g:5959:2: ( ruleconstant )
            {
            // InternalPascal.g:5959:2: ( ruleconstant )
            // InternalPascal.g:5960:3: ruleconstant
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
    // InternalPascal.g:5969:1: rule__Subrange_type__ConstantsAssignment_2 : ( ruleconstant ) ;
    public final void rule__Subrange_type__ConstantsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5973:1: ( ( ruleconstant ) )
            // InternalPascal.g:5974:2: ( ruleconstant )
            {
            // InternalPascal.g:5974:2: ( ruleconstant )
            // InternalPascal.g:5975:3: ruleconstant
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
    // InternalPascal.g:5984:1: rule__Type_identifier__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Type_identifier__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5988:1: ( ( RULE_ID ) )
            // InternalPascal.g:5989:2: ( RULE_ID )
            {
            // InternalPascal.g:5989:2: ( RULE_ID )
            // InternalPascal.g:5990:3: RULE_ID
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
    // InternalPascal.g:5999:1: rule__Type_identifier__TypeAssignment_1_0 : ( ( 'CHAR' ) ) ;
    public final void rule__Type_identifier__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6003:1: ( ( ( 'CHAR' ) ) )
            // InternalPascal.g:6004:2: ( ( 'CHAR' ) )
            {
            // InternalPascal.g:6004:2: ( ( 'CHAR' ) )
            // InternalPascal.g:6005:3: ( 'CHAR' )
            {
             before(grammarAccess.getType_identifierAccess().getTypeCHARKeyword_1_0_0()); 
            // InternalPascal.g:6006:3: ( 'CHAR' )
            // InternalPascal.g:6007:4: 'CHAR'
            {
             before(grammarAccess.getType_identifierAccess().getTypeCHARKeyword_1_0_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalPascal.g:6018:1: rule__Type_identifier__TypeAssignment_1_1 : ( ( 'boolean' ) ) ;
    public final void rule__Type_identifier__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6022:1: ( ( ( 'boolean' ) ) )
            // InternalPascal.g:6023:2: ( ( 'boolean' ) )
            {
            // InternalPascal.g:6023:2: ( ( 'boolean' ) )
            // InternalPascal.g:6024:3: ( 'boolean' )
            {
             before(grammarAccess.getType_identifierAccess().getTypeBooleanKeyword_1_1_0()); 
            // InternalPascal.g:6025:3: ( 'boolean' )
            // InternalPascal.g:6026:4: 'boolean'
            {
             before(grammarAccess.getType_identifierAccess().getTypeBooleanKeyword_1_1_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalPascal.g:6037:1: rule__Type_identifier__TypeAssignment_1_2 : ( ( 'integer' ) ) ;
    public final void rule__Type_identifier__TypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6041:1: ( ( ( 'integer' ) ) )
            // InternalPascal.g:6042:2: ( ( 'integer' ) )
            {
            // InternalPascal.g:6042:2: ( ( 'integer' ) )
            // InternalPascal.g:6043:3: ( 'integer' )
            {
             before(grammarAccess.getType_identifierAccess().getTypeIntegerKeyword_1_2_0()); 
            // InternalPascal.g:6044:3: ( 'integer' )
            // InternalPascal.g:6045:4: 'integer'
            {
             before(grammarAccess.getType_identifierAccess().getTypeIntegerKeyword_1_2_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalPascal.g:6056:1: rule__Type_identifier__TypeAssignment_1_3 : ( ( 'real' ) ) ;
    public final void rule__Type_identifier__TypeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6060:1: ( ( ( 'real' ) ) )
            // InternalPascal.g:6061:2: ( ( 'real' ) )
            {
            // InternalPascal.g:6061:2: ( ( 'real' ) )
            // InternalPascal.g:6062:3: ( 'real' )
            {
             before(grammarAccess.getType_identifierAccess().getTypeRealKeyword_1_3_0()); 
            // InternalPascal.g:6063:3: ( 'real' )
            // InternalPascal.g:6064:4: 'real'
            {
             before(grammarAccess.getType_identifierAccess().getTypeRealKeyword_1_3_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalPascal.g:6075:1: rule__Type_identifier__TypeAssignment_1_4 : ( ( 'string' ) ) ;
    public final void rule__Type_identifier__TypeAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6079:1: ( ( ( 'string' ) ) )
            // InternalPascal.g:6080:2: ( ( 'string' ) )
            {
            // InternalPascal.g:6080:2: ( ( 'string' ) )
            // InternalPascal.g:6081:3: ( 'string' )
            {
             before(grammarAccess.getType_identifierAccess().getTypeStringKeyword_1_4_0()); 
            // InternalPascal.g:6082:3: ( 'string' )
            // InternalPascal.g:6083:4: 'string'
            {
             before(grammarAccess.getType_identifierAccess().getTypeStringKeyword_1_4_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalPascal.g:6094:1: rule__String_type__NamesAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__String_type__NamesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6098:1: ( ( RULE_ID ) )
            // InternalPascal.g:6099:2: ( RULE_ID )
            {
            // InternalPascal.g:6099:2: ( RULE_ID )
            // InternalPascal.g:6100:3: RULE_ID
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
    // InternalPascal.g:6109:1: rule__String_type__NumberAssignment_2_1 : ( ruleunsigned_number ) ;
    public final void rule__String_type__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6113:1: ( ( ruleunsigned_number ) )
            // InternalPascal.g:6114:2: ( ruleunsigned_number )
            {
            // InternalPascal.g:6114:2: ( ruleunsigned_number )
            // InternalPascal.g:6115:3: ruleunsigned_number
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
    // InternalPascal.g:6124:1: rule__Unsigned_constant__NumberAssignment_0 : ( ruleunsigned_number ) ;
    public final void rule__Unsigned_constant__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6128:1: ( ( ruleunsigned_number ) )
            // InternalPascal.g:6129:2: ( ruleunsigned_number )
            {
            // InternalPascal.g:6129:2: ( ruleunsigned_number )
            // InternalPascal.g:6130:3: ruleunsigned_number
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
    // InternalPascal.g:6139:1: rule__Unsigned_constant__CharAssignment_1 : ( ruleconstant_chr ) ;
    public final void rule__Unsigned_constant__CharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6143:1: ( ( ruleconstant_chr ) )
            // InternalPascal.g:6144:2: ( ruleconstant_chr )
            {
            // InternalPascal.g:6144:2: ( ruleconstant_chr )
            // InternalPascal.g:6145:3: ruleconstant_chr
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
    // InternalPascal.g:6154:1: rule__Unsigned_constant__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Unsigned_constant__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6158:1: ( ( RULE_STRING ) )
            // InternalPascal.g:6159:2: ( RULE_STRING )
            {
            // InternalPascal.g:6159:2: ( RULE_STRING )
            // InternalPascal.g:6160:3: RULE_STRING
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
    // InternalPascal.g:6169:1: rule__Unsigned_constant__NilAssignment_3 : ( RULE_NIL ) ;
    public final void rule__Unsigned_constant__NilAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6173:1: ( ( RULE_NIL ) )
            // InternalPascal.g:6174:2: ( RULE_NIL )
            {
            // InternalPascal.g:6174:2: ( RULE_NIL )
            // InternalPascal.g:6175:3: RULE_NIL
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
    // InternalPascal.g:6184:1: rule__Unsigned_number__NumbersAssignment_0 : ( ruleunsigned_integer ) ;
    public final void rule__Unsigned_number__NumbersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6188:1: ( ( ruleunsigned_integer ) )
            // InternalPascal.g:6189:2: ( ruleunsigned_integer )
            {
            // InternalPascal.g:6189:2: ( ruleunsigned_integer )
            // InternalPascal.g:6190:3: ruleunsigned_integer
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
    // InternalPascal.g:6199:1: rule__Unsigned_number__NumbersAssignment_1 : ( ruleunsigned_real ) ;
    public final void rule__Unsigned_number__NumbersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6203:1: ( ( ruleunsigned_real ) )
            // InternalPascal.g:6204:2: ( ruleunsigned_real )
            {
            // InternalPascal.g:6204:2: ( ruleunsigned_real )
            // InternalPascal.g:6205:3: ruleunsigned_real
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
    // InternalPascal.g:6214:1: rule__Constant_chr__NumbersAssignment_2 : ( ruleunsigned_integer ) ;
    public final void rule__Constant_chr__NumbersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6218:1: ( ( ruleunsigned_integer ) )
            // InternalPascal.g:6219:2: ( ruleunsigned_integer )
            {
            // InternalPascal.g:6219:2: ( ruleunsigned_integer )
            // InternalPascal.g:6220:3: ruleunsigned_integer
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0001600000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x010000000C0000F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x1F8004000C0000F0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0004003804000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0004003804000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x012C04001D6000F0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x002800C000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x002800C000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0010100000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0040100000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000001FC000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000003E00L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000004000030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000010L});

}