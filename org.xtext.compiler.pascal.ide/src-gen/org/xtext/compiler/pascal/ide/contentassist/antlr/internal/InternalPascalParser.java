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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NUM_INT", "RULE_NUM_REAL", "RULE_PLUS", "RULE_MINUS", "RULE_OR", "RULE_STAR", "RULE_SLASH", "RULE_DIV", "RULE_MOD", "RULE_AND", "RULE_EQUAL", "RULE_NOT_EQUAL", "RULE_LT", "RULE_LE", "RULE_GE", "RULE_GT", "RULE_IN", "RULE_TRUE", "RULE_FALSE", "RULE_ASSIGN", "RULE_NOT", "RULE_ID", "RULE_DOTDOT", "RULE_STRING", "RULE_NIL", "RULE_EXPONENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'procedure'", "'goto'", "'structured'", "'^'", "'.'", "'program'", "';'", "'('", "')'", "','", "'begin'", "'end'", "':'", "'@'", "'['", "']'", "'(.'", "'.)'", "'chr'"
    };
    public static final int T__50=50;
    public static final int RULE_LE=17;
    public static final int RULE_GT=19;
    public static final int RULE_DIV=11;
    public static final int RULE_NIL=28;
    public static final int RULE_NOT_EQUAL=15;
    public static final int RULE_GE=18;
    public static final int T__51=51;
    public static final int RULE_OR=8;
    public static final int RULE_STAR=9;
    public static final int RULE_DOTDOT=26;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_MOD=12;
    public static final int RULE_EQUAL=14;
    public static final int RULE_ID=25;
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
    // InternalPascal.g:162:1: ruleblock : ( ( rule__Block__StatementAssignment ) ) ;
    public final void ruleblock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:166:2: ( ( ( rule__Block__StatementAssignment ) ) )
            // InternalPascal.g:167:2: ( ( rule__Block__StatementAssignment ) )
            {
            // InternalPascal.g:167:2: ( ( rule__Block__StatementAssignment ) )
            // InternalPascal.g:168:3: ( rule__Block__StatementAssignment )
            {
             before(grammarAccess.getBlockAccess().getStatementAssignment()); 
            // InternalPascal.g:169:3: ( rule__Block__StatementAssignment )
            // InternalPascal.g:169:4: rule__Block__StatementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Block__StatementAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getStatementAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRulecompound_statement"
    // InternalPascal.g:178:1: entryRulecompound_statement : rulecompound_statement EOF ;
    public final void entryRulecompound_statement() throws RecognitionException {
        try {
            // InternalPascal.g:179:1: ( rulecompound_statement EOF )
            // InternalPascal.g:180:1: rulecompound_statement EOF
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
    // InternalPascal.g:187:1: rulecompound_statement : ( ( rule__Compound_statement__Group__0 ) ) ;
    public final void rulecompound_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:191:2: ( ( ( rule__Compound_statement__Group__0 ) ) )
            // InternalPascal.g:192:2: ( ( rule__Compound_statement__Group__0 ) )
            {
            // InternalPascal.g:192:2: ( ( rule__Compound_statement__Group__0 ) )
            // InternalPascal.g:193:3: ( rule__Compound_statement__Group__0 )
            {
             before(grammarAccess.getCompound_statementAccess().getGroup()); 
            // InternalPascal.g:194:3: ( rule__Compound_statement__Group__0 )
            // InternalPascal.g:194:4: rule__Compound_statement__Group__0
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
    // InternalPascal.g:203:1: entryRulestatements : rulestatements EOF ;
    public final void entryRulestatements() throws RecognitionException {
        try {
            // InternalPascal.g:204:1: ( rulestatements EOF )
            // InternalPascal.g:205:1: rulestatements EOF
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
    // InternalPascal.g:212:1: rulestatements : ( ( rule__Statements__Group__0 ) ) ;
    public final void rulestatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:216:2: ( ( ( rule__Statements__Group__0 ) ) )
            // InternalPascal.g:217:2: ( ( rule__Statements__Group__0 ) )
            {
            // InternalPascal.g:217:2: ( ( rule__Statements__Group__0 ) )
            // InternalPascal.g:218:3: ( rule__Statements__Group__0 )
            {
             before(grammarAccess.getStatementsAccess().getGroup()); 
            // InternalPascal.g:219:3: ( rule__Statements__Group__0 )
            // InternalPascal.g:219:4: rule__Statements__Group__0
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
    // InternalPascal.g:228:1: entryRulestatement : rulestatement EOF ;
    public final void entryRulestatement() throws RecognitionException {
        try {
            // InternalPascal.g:229:1: ( rulestatement EOF )
            // InternalPascal.g:230:1: rulestatement EOF
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
    // InternalPascal.g:237:1: rulestatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void rulestatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:241:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalPascal.g:242:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalPascal.g:242:2: ( ( rule__Statement__Alternatives ) )
            // InternalPascal.g:243:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalPascal.g:244:3: ( rule__Statement__Alternatives )
            // InternalPascal.g:244:4: rule__Statement__Alternatives
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
    // InternalPascal.g:253:1: entryRuleunlabelled_statement : ruleunlabelled_statement EOF ;
    public final void entryRuleunlabelled_statement() throws RecognitionException {
        try {
            // InternalPascal.g:254:1: ( ruleunlabelled_statement EOF )
            // InternalPascal.g:255:1: ruleunlabelled_statement EOF
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
    // InternalPascal.g:262:1: ruleunlabelled_statement : ( ( rule__Unlabelled_statement__Alternatives ) ) ;
    public final void ruleunlabelled_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:266:2: ( ( ( rule__Unlabelled_statement__Alternatives ) ) )
            // InternalPascal.g:267:2: ( ( rule__Unlabelled_statement__Alternatives ) )
            {
            // InternalPascal.g:267:2: ( ( rule__Unlabelled_statement__Alternatives ) )
            // InternalPascal.g:268:3: ( rule__Unlabelled_statement__Alternatives )
            {
             before(grammarAccess.getUnlabelled_statementAccess().getAlternatives()); 
            // InternalPascal.g:269:3: ( rule__Unlabelled_statement__Alternatives )
            // InternalPascal.g:269:4: rule__Unlabelled_statement__Alternatives
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
    // InternalPascal.g:278:1: entryRulelabel : rulelabel EOF ;
    public final void entryRulelabel() throws RecognitionException {
        try {
            // InternalPascal.g:279:1: ( rulelabel EOF )
            // InternalPascal.g:280:1: rulelabel EOF
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
    // InternalPascal.g:287:1: rulelabel : ( ( rule__Label__NumberAssignment ) ) ;
    public final void rulelabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:291:2: ( ( ( rule__Label__NumberAssignment ) ) )
            // InternalPascal.g:292:2: ( ( rule__Label__NumberAssignment ) )
            {
            // InternalPascal.g:292:2: ( ( rule__Label__NumberAssignment ) )
            // InternalPascal.g:293:3: ( rule__Label__NumberAssignment )
            {
             before(grammarAccess.getLabelAccess().getNumberAssignment()); 
            // InternalPascal.g:294:3: ( rule__Label__NumberAssignment )
            // InternalPascal.g:294:4: rule__Label__NumberAssignment
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
    // InternalPascal.g:303:1: entryRulesimple_statement : rulesimple_statement EOF ;
    public final void entryRulesimple_statement() throws RecognitionException {
        try {
            // InternalPascal.g:304:1: ( rulesimple_statement EOF )
            // InternalPascal.g:305:1: rulesimple_statement EOF
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
    // InternalPascal.g:312:1: rulesimple_statement : ( ( rule__Simple_statement__Alternatives ) ) ;
    public final void rulesimple_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:316:2: ( ( ( rule__Simple_statement__Alternatives ) ) )
            // InternalPascal.g:317:2: ( ( rule__Simple_statement__Alternatives ) )
            {
            // InternalPascal.g:317:2: ( ( rule__Simple_statement__Alternatives ) )
            // InternalPascal.g:318:3: ( rule__Simple_statement__Alternatives )
            {
             before(grammarAccess.getSimple_statementAccess().getAlternatives()); 
            // InternalPascal.g:319:3: ( rule__Simple_statement__Alternatives )
            // InternalPascal.g:319:4: rule__Simple_statement__Alternatives
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
    // InternalPascal.g:328:1: entryRuleassignment_statement : ruleassignment_statement EOF ;
    public final void entryRuleassignment_statement() throws RecognitionException {
        try {
            // InternalPascal.g:329:1: ( ruleassignment_statement EOF )
            // InternalPascal.g:330:1: ruleassignment_statement EOF
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
    // InternalPascal.g:337:1: ruleassignment_statement : ( ( rule__Assignment_statement__Group__0 ) ) ;
    public final void ruleassignment_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:341:2: ( ( ( rule__Assignment_statement__Group__0 ) ) )
            // InternalPascal.g:342:2: ( ( rule__Assignment_statement__Group__0 ) )
            {
            // InternalPascal.g:342:2: ( ( rule__Assignment_statement__Group__0 ) )
            // InternalPascal.g:343:3: ( rule__Assignment_statement__Group__0 )
            {
             before(grammarAccess.getAssignment_statementAccess().getGroup()); 
            // InternalPascal.g:344:3: ( rule__Assignment_statement__Group__0 )
            // InternalPascal.g:344:4: rule__Assignment_statement__Group__0
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
    // InternalPascal.g:353:1: entryRulevariable : rulevariable EOF ;
    public final void entryRulevariable() throws RecognitionException {
        try {
            // InternalPascal.g:354:1: ( rulevariable EOF )
            // InternalPascal.g:355:1: rulevariable EOF
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
    // InternalPascal.g:362:1: rulevariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void rulevariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:366:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalPascal.g:367:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalPascal.g:367:2: ( ( rule__Variable__Group__0 ) )
            // InternalPascal.g:368:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalPascal.g:369:3: ( rule__Variable__Group__0 )
            // InternalPascal.g:369:4: rule__Variable__Group__0
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
    // InternalPascal.g:378:1: entryRuleexpression : ruleexpression EOF ;
    public final void entryRuleexpression() throws RecognitionException {
        try {
            // InternalPascal.g:379:1: ( ruleexpression EOF )
            // InternalPascal.g:380:1: ruleexpression EOF
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
    // InternalPascal.g:387:1: ruleexpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:391:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalPascal.g:392:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalPascal.g:392:2: ( ( rule__Expression__Group__0 ) )
            // InternalPascal.g:393:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalPascal.g:394:3: ( rule__Expression__Group__0 )
            // InternalPascal.g:394:4: rule__Expression__Group__0
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
    // InternalPascal.g:403:1: entryRulesimple_expression : rulesimple_expression EOF ;
    public final void entryRulesimple_expression() throws RecognitionException {
        try {
            // InternalPascal.g:404:1: ( rulesimple_expression EOF )
            // InternalPascal.g:405:1: rulesimple_expression EOF
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
    // InternalPascal.g:412:1: rulesimple_expression : ( ( rule__Simple_expression__Group__0 ) ) ;
    public final void rulesimple_expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:416:2: ( ( ( rule__Simple_expression__Group__0 ) ) )
            // InternalPascal.g:417:2: ( ( rule__Simple_expression__Group__0 ) )
            {
            // InternalPascal.g:417:2: ( ( rule__Simple_expression__Group__0 ) )
            // InternalPascal.g:418:3: ( rule__Simple_expression__Group__0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getGroup()); 
            // InternalPascal.g:419:3: ( rule__Simple_expression__Group__0 )
            // InternalPascal.g:419:4: rule__Simple_expression__Group__0
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
    // InternalPascal.g:428:1: entryRuleterm : ruleterm EOF ;
    public final void entryRuleterm() throws RecognitionException {
        try {
            // InternalPascal.g:429:1: ( ruleterm EOF )
            // InternalPascal.g:430:1: ruleterm EOF
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
    // InternalPascal.g:437:1: ruleterm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleterm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:441:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalPascal.g:442:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalPascal.g:442:2: ( ( rule__Term__Group__0 ) )
            // InternalPascal.g:443:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalPascal.g:444:3: ( rule__Term__Group__0 )
            // InternalPascal.g:444:4: rule__Term__Group__0
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
    // InternalPascal.g:453:1: entryRulesigned_factor : rulesigned_factor EOF ;
    public final void entryRulesigned_factor() throws RecognitionException {
        try {
            // InternalPascal.g:454:1: ( rulesigned_factor EOF )
            // InternalPascal.g:455:1: rulesigned_factor EOF
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
    // InternalPascal.g:462:1: rulesigned_factor : ( ( rule__Signed_factor__Group__0 ) ) ;
    public final void rulesigned_factor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:466:2: ( ( ( rule__Signed_factor__Group__0 ) ) )
            // InternalPascal.g:467:2: ( ( rule__Signed_factor__Group__0 ) )
            {
            // InternalPascal.g:467:2: ( ( rule__Signed_factor__Group__0 ) )
            // InternalPascal.g:468:3: ( rule__Signed_factor__Group__0 )
            {
             before(grammarAccess.getSigned_factorAccess().getGroup()); 
            // InternalPascal.g:469:3: ( rule__Signed_factor__Group__0 )
            // InternalPascal.g:469:4: rule__Signed_factor__Group__0
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
    // InternalPascal.g:478:1: entryRulefactor : rulefactor EOF ;
    public final void entryRulefactor() throws RecognitionException {
        try {
            // InternalPascal.g:479:1: ( rulefactor EOF )
            // InternalPascal.g:480:1: rulefactor EOF
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
    // InternalPascal.g:487:1: rulefactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void rulefactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:491:2: ( ( ( rule__Factor__Alternatives ) ) )
            // InternalPascal.g:492:2: ( ( rule__Factor__Alternatives ) )
            {
            // InternalPascal.g:492:2: ( ( rule__Factor__Alternatives ) )
            // InternalPascal.g:493:3: ( rule__Factor__Alternatives )
            {
             before(grammarAccess.getFactorAccess().getAlternatives()); 
            // InternalPascal.g:494:3: ( rule__Factor__Alternatives )
            // InternalPascal.g:494:4: rule__Factor__Alternatives
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
    // InternalPascal.g:503:1: entryRuleset : ruleset EOF ;
    public final void entryRuleset() throws RecognitionException {
        try {
            // InternalPascal.g:504:1: ( ruleset EOF )
            // InternalPascal.g:505:1: ruleset EOF
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
    // InternalPascal.g:512:1: ruleset : ( ( rule__Set__Alternatives ) ) ;
    public final void ruleset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:516:2: ( ( ( rule__Set__Alternatives ) ) )
            // InternalPascal.g:517:2: ( ( rule__Set__Alternatives ) )
            {
            // InternalPascal.g:517:2: ( ( rule__Set__Alternatives ) )
            // InternalPascal.g:518:3: ( rule__Set__Alternatives )
            {
             before(grammarAccess.getSetAccess().getAlternatives()); 
            // InternalPascal.g:519:3: ( rule__Set__Alternatives )
            // InternalPascal.g:519:4: rule__Set__Alternatives
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
    // InternalPascal.g:528:1: entryRuleelementList : ruleelementList EOF ;
    public final void entryRuleelementList() throws RecognitionException {
        try {
            // InternalPascal.g:529:1: ( ruleelementList EOF )
            // InternalPascal.g:530:1: ruleelementList EOF
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
    // InternalPascal.g:537:1: ruleelementList : ( ( rule__ElementList__Group__0 ) ) ;
    public final void ruleelementList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:541:2: ( ( ( rule__ElementList__Group__0 ) ) )
            // InternalPascal.g:542:2: ( ( rule__ElementList__Group__0 ) )
            {
            // InternalPascal.g:542:2: ( ( rule__ElementList__Group__0 ) )
            // InternalPascal.g:543:3: ( rule__ElementList__Group__0 )
            {
             before(grammarAccess.getElementListAccess().getGroup()); 
            // InternalPascal.g:544:3: ( rule__ElementList__Group__0 )
            // InternalPascal.g:544:4: rule__ElementList__Group__0
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
    // InternalPascal.g:553:1: entryRuleelement : ruleelement EOF ;
    public final void entryRuleelement() throws RecognitionException {
        try {
            // InternalPascal.g:554:1: ( ruleelement EOF )
            // InternalPascal.g:555:1: ruleelement EOF
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
    // InternalPascal.g:562:1: ruleelement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleelement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:566:2: ( ( ( rule__Element__Group__0 ) ) )
            // InternalPascal.g:567:2: ( ( rule__Element__Group__0 ) )
            {
            // InternalPascal.g:567:2: ( ( rule__Element__Group__0 ) )
            // InternalPascal.g:568:3: ( rule__Element__Group__0 )
            {
             before(grammarAccess.getElementAccess().getGroup()); 
            // InternalPascal.g:569:3: ( rule__Element__Group__0 )
            // InternalPascal.g:569:4: rule__Element__Group__0
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


    // $ANTLR start "entryRuleunsigned_constant"
    // InternalPascal.g:578:1: entryRuleunsigned_constant : ruleunsigned_constant EOF ;
    public final void entryRuleunsigned_constant() throws RecognitionException {
        try {
            // InternalPascal.g:579:1: ( ruleunsigned_constant EOF )
            // InternalPascal.g:580:1: ruleunsigned_constant EOF
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
    // InternalPascal.g:587:1: ruleunsigned_constant : ( ( rule__Unsigned_constant__Alternatives ) ) ;
    public final void ruleunsigned_constant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:591:2: ( ( ( rule__Unsigned_constant__Alternatives ) ) )
            // InternalPascal.g:592:2: ( ( rule__Unsigned_constant__Alternatives ) )
            {
            // InternalPascal.g:592:2: ( ( rule__Unsigned_constant__Alternatives ) )
            // InternalPascal.g:593:3: ( rule__Unsigned_constant__Alternatives )
            {
             before(grammarAccess.getUnsigned_constantAccess().getAlternatives()); 
            // InternalPascal.g:594:3: ( rule__Unsigned_constant__Alternatives )
            // InternalPascal.g:594:4: rule__Unsigned_constant__Alternatives
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
    // InternalPascal.g:603:1: entryRuleunsigned_number : ruleunsigned_number EOF ;
    public final void entryRuleunsigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:604:1: ( ruleunsigned_number EOF )
            // InternalPascal.g:605:1: ruleunsigned_number EOF
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
    // InternalPascal.g:612:1: ruleunsigned_number : ( ( rule__Unsigned_number__Alternatives ) ) ;
    public final void ruleunsigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:616:2: ( ( ( rule__Unsigned_number__Alternatives ) ) )
            // InternalPascal.g:617:2: ( ( rule__Unsigned_number__Alternatives ) )
            {
            // InternalPascal.g:617:2: ( ( rule__Unsigned_number__Alternatives ) )
            // InternalPascal.g:618:3: ( rule__Unsigned_number__Alternatives )
            {
             before(grammarAccess.getUnsigned_numberAccess().getAlternatives()); 
            // InternalPascal.g:619:3: ( rule__Unsigned_number__Alternatives )
            // InternalPascal.g:619:4: rule__Unsigned_number__Alternatives
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
    // InternalPascal.g:628:1: entryRuleconstant_chr : ruleconstant_chr EOF ;
    public final void entryRuleconstant_chr() throws RecognitionException {
        try {
            // InternalPascal.g:629:1: ( ruleconstant_chr EOF )
            // InternalPascal.g:630:1: ruleconstant_chr EOF
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
    // InternalPascal.g:637:1: ruleconstant_chr : ( ( rule__Constant_chr__Group__0 ) ) ;
    public final void ruleconstant_chr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:641:2: ( ( ( rule__Constant_chr__Group__0 ) ) )
            // InternalPascal.g:642:2: ( ( rule__Constant_chr__Group__0 ) )
            {
            // InternalPascal.g:642:2: ( ( rule__Constant_chr__Group__0 ) )
            // InternalPascal.g:643:3: ( rule__Constant_chr__Group__0 )
            {
             before(grammarAccess.getConstant_chrAccess().getGroup()); 
            // InternalPascal.g:644:3: ( rule__Constant_chr__Group__0 )
            // InternalPascal.g:644:4: rule__Constant_chr__Group__0
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
    // InternalPascal.g:653:1: entryRuleprocedure_statement : ruleprocedure_statement EOF ;
    public final void entryRuleprocedure_statement() throws RecognitionException {
        try {
            // InternalPascal.g:654:1: ( ruleprocedure_statement EOF )
            // InternalPascal.g:655:1: ruleprocedure_statement EOF
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
    // InternalPascal.g:662:1: ruleprocedure_statement : ( 'procedure' ) ;
    public final void ruleprocedure_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:666:2: ( ( 'procedure' ) )
            // InternalPascal.g:667:2: ( 'procedure' )
            {
            // InternalPascal.g:667:2: ( 'procedure' )
            // InternalPascal.g:668:3: 'procedure'
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
    // InternalPascal.g:678:1: entryRulegoto_statement : rulegoto_statement EOF ;
    public final void entryRulegoto_statement() throws RecognitionException {
        try {
            // InternalPascal.g:679:1: ( rulegoto_statement EOF )
            // InternalPascal.g:680:1: rulegoto_statement EOF
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
    // InternalPascal.g:687:1: rulegoto_statement : ( 'goto' ) ;
    public final void rulegoto_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:691:2: ( ( 'goto' ) )
            // InternalPascal.g:692:2: ( 'goto' )
            {
            // InternalPascal.g:692:2: ( 'goto' )
            // InternalPascal.g:693:3: 'goto'
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
    // InternalPascal.g:703:1: entryRulestructured_statement : rulestructured_statement EOF ;
    public final void entryRulestructured_statement() throws RecognitionException {
        try {
            // InternalPascal.g:704:1: ( rulestructured_statement EOF )
            // InternalPascal.g:705:1: rulestructured_statement EOF
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
    // InternalPascal.g:712:1: rulestructured_statement : ( 'structured' ) ;
    public final void rulestructured_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:716:2: ( ( 'structured' ) )
            // InternalPascal.g:717:2: ( 'structured' )
            {
            // InternalPascal.g:717:2: ( 'structured' )
            // InternalPascal.g:718:3: 'structured'
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
    // InternalPascal.g:728:1: entryRuleunsigned_integer : ruleunsigned_integer EOF ;
    public final void entryRuleunsigned_integer() throws RecognitionException {
        try {
            // InternalPascal.g:729:1: ( ruleunsigned_integer EOF )
            // InternalPascal.g:730:1: ruleunsigned_integer EOF
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
    // InternalPascal.g:737:1: ruleunsigned_integer : ( RULE_NUM_INT ) ;
    public final void ruleunsigned_integer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:741:2: ( ( RULE_NUM_INT ) )
            // InternalPascal.g:742:2: ( RULE_NUM_INT )
            {
            // InternalPascal.g:742:2: ( RULE_NUM_INT )
            // InternalPascal.g:743:3: RULE_NUM_INT
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
    // InternalPascal.g:753:1: entryRuleunsigned_real : ruleunsigned_real EOF ;
    public final void entryRuleunsigned_real() throws RecognitionException {
        try {
            // InternalPascal.g:754:1: ( ruleunsigned_real EOF )
            // InternalPascal.g:755:1: ruleunsigned_real EOF
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
    // InternalPascal.g:762:1: ruleunsigned_real : ( RULE_NUM_REAL ) ;
    public final void ruleunsigned_real() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:766:2: ( ( RULE_NUM_REAL ) )
            // InternalPascal.g:767:2: ( RULE_NUM_REAL )
            {
            // InternalPascal.g:767:2: ( RULE_NUM_REAL )
            // InternalPascal.g:768:3: RULE_NUM_REAL
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
    // InternalPascal.g:778:1: entryRuleadditive_operator : ruleadditive_operator EOF ;
    public final void entryRuleadditive_operator() throws RecognitionException {
        try {
            // InternalPascal.g:779:1: ( ruleadditive_operator EOF )
            // InternalPascal.g:780:1: ruleadditive_operator EOF
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
    // InternalPascal.g:787:1: ruleadditive_operator : ( ( rule__Additive_operator__Alternatives ) ) ;
    public final void ruleadditive_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:791:2: ( ( ( rule__Additive_operator__Alternatives ) ) )
            // InternalPascal.g:792:2: ( ( rule__Additive_operator__Alternatives ) )
            {
            // InternalPascal.g:792:2: ( ( rule__Additive_operator__Alternatives ) )
            // InternalPascal.g:793:3: ( rule__Additive_operator__Alternatives )
            {
             before(grammarAccess.getAdditive_operatorAccess().getAlternatives()); 
            // InternalPascal.g:794:3: ( rule__Additive_operator__Alternatives )
            // InternalPascal.g:794:4: rule__Additive_operator__Alternatives
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
    // InternalPascal.g:803:1: entryRulemultiplicative_operator : rulemultiplicative_operator EOF ;
    public final void entryRulemultiplicative_operator() throws RecognitionException {
        try {
            // InternalPascal.g:804:1: ( rulemultiplicative_operator EOF )
            // InternalPascal.g:805:1: rulemultiplicative_operator EOF
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
    // InternalPascal.g:812:1: rulemultiplicative_operator : ( ( rule__Multiplicative_operator__Alternatives ) ) ;
    public final void rulemultiplicative_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:816:2: ( ( ( rule__Multiplicative_operator__Alternatives ) ) )
            // InternalPascal.g:817:2: ( ( rule__Multiplicative_operator__Alternatives ) )
            {
            // InternalPascal.g:817:2: ( ( rule__Multiplicative_operator__Alternatives ) )
            // InternalPascal.g:818:3: ( rule__Multiplicative_operator__Alternatives )
            {
             before(grammarAccess.getMultiplicative_operatorAccess().getAlternatives()); 
            // InternalPascal.g:819:3: ( rule__Multiplicative_operator__Alternatives )
            // InternalPascal.g:819:4: rule__Multiplicative_operator__Alternatives
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
    // InternalPascal.g:828:1: entryRulerelational_operator : rulerelational_operator EOF ;
    public final void entryRulerelational_operator() throws RecognitionException {
        try {
            // InternalPascal.g:829:1: ( rulerelational_operator EOF )
            // InternalPascal.g:830:1: rulerelational_operator EOF
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
    // InternalPascal.g:837:1: rulerelational_operator : ( ( rule__Relational_operator__Alternatives ) ) ;
    public final void rulerelational_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:841:2: ( ( ( rule__Relational_operator__Alternatives ) ) )
            // InternalPascal.g:842:2: ( ( rule__Relational_operator__Alternatives ) )
            {
            // InternalPascal.g:842:2: ( ( rule__Relational_operator__Alternatives ) )
            // InternalPascal.g:843:3: ( rule__Relational_operator__Alternatives )
            {
             before(grammarAccess.getRelational_operatorAccess().getAlternatives()); 
            // InternalPascal.g:844:3: ( rule__Relational_operator__Alternatives )
            // InternalPascal.g:844:4: rule__Relational_operator__Alternatives
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
    // InternalPascal.g:853:1: entryRulebool : rulebool EOF ;
    public final void entryRulebool() throws RecognitionException {
        try {
            // InternalPascal.g:854:1: ( rulebool EOF )
            // InternalPascal.g:855:1: rulebool EOF
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
    // InternalPascal.g:862:1: rulebool : ( ( rule__Bool__Alternatives ) ) ;
    public final void rulebool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:866:2: ( ( ( rule__Bool__Alternatives ) ) )
            // InternalPascal.g:867:2: ( ( rule__Bool__Alternatives ) )
            {
            // InternalPascal.g:867:2: ( ( rule__Bool__Alternatives ) )
            // InternalPascal.g:868:3: ( rule__Bool__Alternatives )
            {
             before(grammarAccess.getBoolAccess().getAlternatives()); 
            // InternalPascal.g:869:3: ( rule__Bool__Alternatives )
            // InternalPascal.g:869:4: rule__Bool__Alternatives
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


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalPascal.g:877:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:881:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_NUM_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF||LA1_0==RULE_ID||(LA1_0>=35 && LA1_0<=37)||LA1_0==41||LA1_0==46||LA1_0==48) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:882:2: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // InternalPascal.g:882:2: ( ( rule__Statement__Group_0__0 ) )
                    // InternalPascal.g:883:3: ( rule__Statement__Group_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_0()); 
                    // InternalPascal.g:884:3: ( rule__Statement__Group_0__0 )
                    // InternalPascal.g:884:4: rule__Statement__Group_0__0
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
                    // InternalPascal.g:888:2: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalPascal.g:888:2: ( ( rule__Statement__Group_1__0 ) )
                    // InternalPascal.g:889:3: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // InternalPascal.g:890:3: ( rule__Statement__Group_1__0 )
                    // InternalPascal.g:890:4: rule__Statement__Group_1__0
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
    // InternalPascal.g:898:1: rule__Unlabelled_statement__Alternatives : ( ( ( rule__Unlabelled_statement__SimpleAssignment_0 ) ) | ( ( rule__Unlabelled_statement__StructuredAssignment_1 ) ) );
    public final void rule__Unlabelled_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:902:1: ( ( ( rule__Unlabelled_statement__SimpleAssignment_0 ) ) | ( ( rule__Unlabelled_statement__StructuredAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||(LA2_0>=35 && LA2_0<=36)||LA2_0==48) ) {
                alt2=1;
            }
            else if ( (LA2_0==37) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPascal.g:903:2: ( ( rule__Unlabelled_statement__SimpleAssignment_0 ) )
                    {
                    // InternalPascal.g:903:2: ( ( rule__Unlabelled_statement__SimpleAssignment_0 ) )
                    // InternalPascal.g:904:3: ( rule__Unlabelled_statement__SimpleAssignment_0 )
                    {
                     before(grammarAccess.getUnlabelled_statementAccess().getSimpleAssignment_0()); 
                    // InternalPascal.g:905:3: ( rule__Unlabelled_statement__SimpleAssignment_0 )
                    // InternalPascal.g:905:4: rule__Unlabelled_statement__SimpleAssignment_0
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
                    // InternalPascal.g:909:2: ( ( rule__Unlabelled_statement__StructuredAssignment_1 ) )
                    {
                    // InternalPascal.g:909:2: ( ( rule__Unlabelled_statement__StructuredAssignment_1 ) )
                    // InternalPascal.g:910:3: ( rule__Unlabelled_statement__StructuredAssignment_1 )
                    {
                     before(grammarAccess.getUnlabelled_statementAccess().getStructuredAssignment_1()); 
                    // InternalPascal.g:911:3: ( rule__Unlabelled_statement__StructuredAssignment_1 )
                    // InternalPascal.g:911:4: rule__Unlabelled_statement__StructuredAssignment_1
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
    // InternalPascal.g:919:1: rule__Simple_statement__Alternatives : ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__ProcedureAssignment_1 ) ) | ( ( rule__Simple_statement__GotoAssignment_2 ) ) );
    public final void rule__Simple_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:923:1: ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__ProcedureAssignment_1 ) ) | ( ( rule__Simple_statement__GotoAssignment_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 48:
                {
                alt3=1;
                }
                break;
            case 35:
                {
                alt3=2;
                }
                break;
            case 36:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPascal.g:924:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    {
                    // InternalPascal.g:924:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    // InternalPascal.g:925:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_0()); 
                    // InternalPascal.g:926:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    // InternalPascal.g:926:4: rule__Simple_statement__AssignmentAssignment_0
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
                    // InternalPascal.g:930:2: ( ( rule__Simple_statement__ProcedureAssignment_1 ) )
                    {
                    // InternalPascal.g:930:2: ( ( rule__Simple_statement__ProcedureAssignment_1 ) )
                    // InternalPascal.g:931:3: ( rule__Simple_statement__ProcedureAssignment_1 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getProcedureAssignment_1()); 
                    // InternalPascal.g:932:3: ( rule__Simple_statement__ProcedureAssignment_1 )
                    // InternalPascal.g:932:4: rule__Simple_statement__ProcedureAssignment_1
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
                    // InternalPascal.g:936:2: ( ( rule__Simple_statement__GotoAssignment_2 ) )
                    {
                    // InternalPascal.g:936:2: ( ( rule__Simple_statement__GotoAssignment_2 ) )
                    // InternalPascal.g:937:3: ( rule__Simple_statement__GotoAssignment_2 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getGotoAssignment_2()); 
                    // InternalPascal.g:938:3: ( rule__Simple_statement__GotoAssignment_2 )
                    // InternalPascal.g:938:4: rule__Simple_statement__GotoAssignment_2
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
    // InternalPascal.g:946:1: rule__Variable__Alternatives_0 : ( ( ( rule__Variable__Group_0_0__0 ) ) | ( ( rule__Variable__NamesAssignment_0_1 ) ) );
    public final void rule__Variable__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:950:1: ( ( ( rule__Variable__Group_0_0__0 ) ) | ( ( rule__Variable__NamesAssignment_0_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==48) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:951:2: ( ( rule__Variable__Group_0_0__0 ) )
                    {
                    // InternalPascal.g:951:2: ( ( rule__Variable__Group_0_0__0 ) )
                    // InternalPascal.g:952:3: ( rule__Variable__Group_0_0__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_0_0()); 
                    // InternalPascal.g:953:3: ( rule__Variable__Group_0_0__0 )
                    // InternalPascal.g:953:4: rule__Variable__Group_0_0__0
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
                    // InternalPascal.g:957:2: ( ( rule__Variable__NamesAssignment_0_1 ) )
                    {
                    // InternalPascal.g:957:2: ( ( rule__Variable__NamesAssignment_0_1 ) )
                    // InternalPascal.g:958:3: ( rule__Variable__NamesAssignment_0_1 )
                    {
                     before(grammarAccess.getVariableAccess().getNamesAssignment_0_1()); 
                    // InternalPascal.g:959:3: ( rule__Variable__NamesAssignment_0_1 )
                    // InternalPascal.g:959:4: rule__Variable__NamesAssignment_0_1
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
    // InternalPascal.g:967:1: rule__Variable__Alternatives_1 : ( ( ( rule__Variable__Group_1_0__0 ) ) | ( ( rule__Variable__Group_1_1__0 ) ) | ( ( rule__Variable__Group_1_2__0 ) ) | ( '^' ) );
    public final void rule__Variable__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:971:1: ( ( ( rule__Variable__Group_1_0__0 ) ) | ( ( rule__Variable__Group_1_1__0 ) ) | ( ( rule__Variable__Group_1_2__0 ) ) | ( '^' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt5=1;
                }
                break;
            case 51:
                {
                alt5=2;
                }
                break;
            case 39:
                {
                alt5=3;
                }
                break;
            case 38:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPascal.g:972:2: ( ( rule__Variable__Group_1_0__0 ) )
                    {
                    // InternalPascal.g:972:2: ( ( rule__Variable__Group_1_0__0 ) )
                    // InternalPascal.g:973:3: ( rule__Variable__Group_1_0__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_1_0()); 
                    // InternalPascal.g:974:3: ( rule__Variable__Group_1_0__0 )
                    // InternalPascal.g:974:4: rule__Variable__Group_1_0__0
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
                    // InternalPascal.g:978:2: ( ( rule__Variable__Group_1_1__0 ) )
                    {
                    // InternalPascal.g:978:2: ( ( rule__Variable__Group_1_1__0 ) )
                    // InternalPascal.g:979:3: ( rule__Variable__Group_1_1__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_1_1()); 
                    // InternalPascal.g:980:3: ( rule__Variable__Group_1_1__0 )
                    // InternalPascal.g:980:4: rule__Variable__Group_1_1__0
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
                    // InternalPascal.g:984:2: ( ( rule__Variable__Group_1_2__0 ) )
                    {
                    // InternalPascal.g:984:2: ( ( rule__Variable__Group_1_2__0 ) )
                    // InternalPascal.g:985:3: ( rule__Variable__Group_1_2__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_1_2()); 
                    // InternalPascal.g:986:3: ( rule__Variable__Group_1_2__0 )
                    // InternalPascal.g:986:4: rule__Variable__Group_1_2__0
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
                    // InternalPascal.g:990:2: ( '^' )
                    {
                    // InternalPascal.g:990:2: ( '^' )
                    // InternalPascal.g:991:3: '^'
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
    // InternalPascal.g:1000:1: rule__Signed_factor__Alternatives_0 : ( ( ( rule__Signed_factor__OperatorsAssignment_0_0 ) ) | ( ( rule__Signed_factor__OperatorsAssignment_0_1 ) ) );
    public final void rule__Signed_factor__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1004:1: ( ( ( rule__Signed_factor__OperatorsAssignment_0_0 ) ) | ( ( rule__Signed_factor__OperatorsAssignment_0_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_PLUS) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_MINUS) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPascal.g:1005:2: ( ( rule__Signed_factor__OperatorsAssignment_0_0 ) )
                    {
                    // InternalPascal.g:1005:2: ( ( rule__Signed_factor__OperatorsAssignment_0_0 ) )
                    // InternalPascal.g:1006:3: ( rule__Signed_factor__OperatorsAssignment_0_0 )
                    {
                     before(grammarAccess.getSigned_factorAccess().getOperatorsAssignment_0_0()); 
                    // InternalPascal.g:1007:3: ( rule__Signed_factor__OperatorsAssignment_0_0 )
                    // InternalPascal.g:1007:4: rule__Signed_factor__OperatorsAssignment_0_0
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
                    // InternalPascal.g:1011:2: ( ( rule__Signed_factor__OperatorsAssignment_0_1 ) )
                    {
                    // InternalPascal.g:1011:2: ( ( rule__Signed_factor__OperatorsAssignment_0_1 ) )
                    // InternalPascal.g:1012:3: ( rule__Signed_factor__OperatorsAssignment_0_1 )
                    {
                     before(grammarAccess.getSigned_factorAccess().getOperatorsAssignment_0_1()); 
                    // InternalPascal.g:1013:3: ( rule__Signed_factor__OperatorsAssignment_0_1 )
                    // InternalPascal.g:1013:4: rule__Signed_factor__OperatorsAssignment_0_1
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
    // InternalPascal.g:1021:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__Group_1__0 ) ) | ( ruleunsigned_constant ) | ( ruleset ) | ( ( rule__Factor__Group_4__0 ) ) | ( rulebool ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1025:1: ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__Group_1__0 ) ) | ( ruleunsigned_constant ) | ( ruleset ) | ( ( rule__Factor__Group_4__0 ) ) | ( rulebool ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 48:
                {
                alt7=1;
                }
                break;
            case 42:
                {
                alt7=2;
                }
                break;
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
            case RULE_STRING:
            case RULE_NIL:
            case 53:
                {
                alt7=3;
                }
                break;
            case 49:
            case 51:
                {
                alt7=4;
                }
                break;
            case RULE_NOT:
                {
                alt7=5;
                }
                break;
            case RULE_TRUE:
            case RULE_FALSE:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPascal.g:1026:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    {
                    // InternalPascal.g:1026:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    // InternalPascal.g:1027:3: ( rule__Factor__VariableAssignment_0 )
                    {
                     before(grammarAccess.getFactorAccess().getVariableAssignment_0()); 
                    // InternalPascal.g:1028:3: ( rule__Factor__VariableAssignment_0 )
                    // InternalPascal.g:1028:4: rule__Factor__VariableAssignment_0
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
                    // InternalPascal.g:1032:2: ( ( rule__Factor__Group_1__0 ) )
                    {
                    // InternalPascal.g:1032:2: ( ( rule__Factor__Group_1__0 ) )
                    // InternalPascal.g:1033:3: ( rule__Factor__Group_1__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1()); 
                    // InternalPascal.g:1034:3: ( rule__Factor__Group_1__0 )
                    // InternalPascal.g:1034:4: rule__Factor__Group_1__0
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
                    // InternalPascal.g:1038:2: ( ruleunsigned_constant )
                    {
                    // InternalPascal.g:1038:2: ( ruleunsigned_constant )
                    // InternalPascal.g:1039:3: ruleunsigned_constant
                    {
                     before(grammarAccess.getFactorAccess().getUnsigned_constantParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleunsigned_constant();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getUnsigned_constantParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1044:2: ( ruleset )
                    {
                    // InternalPascal.g:1044:2: ( ruleset )
                    // InternalPascal.g:1045:3: ruleset
                    {
                     before(grammarAccess.getFactorAccess().getSetParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleset();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getSetParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:1050:2: ( ( rule__Factor__Group_4__0 ) )
                    {
                    // InternalPascal.g:1050:2: ( ( rule__Factor__Group_4__0 ) )
                    // InternalPascal.g:1051:3: ( rule__Factor__Group_4__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_4()); 
                    // InternalPascal.g:1052:3: ( rule__Factor__Group_4__0 )
                    // InternalPascal.g:1052:4: rule__Factor__Group_4__0
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
                    // InternalPascal.g:1056:2: ( rulebool )
                    {
                    // InternalPascal.g:1056:2: ( rulebool )
                    // InternalPascal.g:1057:3: rulebool
                    {
                     before(grammarAccess.getFactorAccess().getBoolParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    rulebool();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getBoolParserRuleCall_5()); 

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
    // InternalPascal.g:1066:1: rule__Set__Alternatives : ( ( ( rule__Set__Group_0__0 ) ) | ( ( rule__Set__Group_1__0 ) ) );
    public final void rule__Set__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1070:1: ( ( ( rule__Set__Group_0__0 ) ) | ( ( rule__Set__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==49) ) {
                alt8=1;
            }
            else if ( (LA8_0==51) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPascal.g:1071:2: ( ( rule__Set__Group_0__0 ) )
                    {
                    // InternalPascal.g:1071:2: ( ( rule__Set__Group_0__0 ) )
                    // InternalPascal.g:1072:3: ( rule__Set__Group_0__0 )
                    {
                     before(grammarAccess.getSetAccess().getGroup_0()); 
                    // InternalPascal.g:1073:3: ( rule__Set__Group_0__0 )
                    // InternalPascal.g:1073:4: rule__Set__Group_0__0
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
                    // InternalPascal.g:1077:2: ( ( rule__Set__Group_1__0 ) )
                    {
                    // InternalPascal.g:1077:2: ( ( rule__Set__Group_1__0 ) )
                    // InternalPascal.g:1078:3: ( rule__Set__Group_1__0 )
                    {
                     before(grammarAccess.getSetAccess().getGroup_1()); 
                    // InternalPascal.g:1079:3: ( rule__Set__Group_1__0 )
                    // InternalPascal.g:1079:4: rule__Set__Group_1__0
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


    // $ANTLR start "rule__Unsigned_constant__Alternatives"
    // InternalPascal.g:1087:1: rule__Unsigned_constant__Alternatives : ( ( ( rule__Unsigned_constant__NumberAssignment_0 ) ) | ( ( rule__Unsigned_constant__CharAssignment_1 ) ) | ( ( rule__Unsigned_constant__StringAssignment_2 ) ) | ( ( rule__Unsigned_constant__NilAssignment_3 ) ) );
    public final void rule__Unsigned_constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1091:1: ( ( ( rule__Unsigned_constant__NumberAssignment_0 ) ) | ( ( rule__Unsigned_constant__CharAssignment_1 ) ) | ( ( rule__Unsigned_constant__StringAssignment_2 ) ) | ( ( rule__Unsigned_constant__NilAssignment_3 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
                {
                alt9=1;
                }
                break;
            case 53:
                {
                alt9=2;
                }
                break;
            case RULE_STRING:
                {
                alt9=3;
                }
                break;
            case RULE_NIL:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalPascal.g:1092:2: ( ( rule__Unsigned_constant__NumberAssignment_0 ) )
                    {
                    // InternalPascal.g:1092:2: ( ( rule__Unsigned_constant__NumberAssignment_0 ) )
                    // InternalPascal.g:1093:3: ( rule__Unsigned_constant__NumberAssignment_0 )
                    {
                     before(grammarAccess.getUnsigned_constantAccess().getNumberAssignment_0()); 
                    // InternalPascal.g:1094:3: ( rule__Unsigned_constant__NumberAssignment_0 )
                    // InternalPascal.g:1094:4: rule__Unsigned_constant__NumberAssignment_0
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
                    // InternalPascal.g:1098:2: ( ( rule__Unsigned_constant__CharAssignment_1 ) )
                    {
                    // InternalPascal.g:1098:2: ( ( rule__Unsigned_constant__CharAssignment_1 ) )
                    // InternalPascal.g:1099:3: ( rule__Unsigned_constant__CharAssignment_1 )
                    {
                     before(grammarAccess.getUnsigned_constantAccess().getCharAssignment_1()); 
                    // InternalPascal.g:1100:3: ( rule__Unsigned_constant__CharAssignment_1 )
                    // InternalPascal.g:1100:4: rule__Unsigned_constant__CharAssignment_1
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
                    // InternalPascal.g:1104:2: ( ( rule__Unsigned_constant__StringAssignment_2 ) )
                    {
                    // InternalPascal.g:1104:2: ( ( rule__Unsigned_constant__StringAssignment_2 ) )
                    // InternalPascal.g:1105:3: ( rule__Unsigned_constant__StringAssignment_2 )
                    {
                     before(grammarAccess.getUnsigned_constantAccess().getStringAssignment_2()); 
                    // InternalPascal.g:1106:3: ( rule__Unsigned_constant__StringAssignment_2 )
                    // InternalPascal.g:1106:4: rule__Unsigned_constant__StringAssignment_2
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
                    // InternalPascal.g:1110:2: ( ( rule__Unsigned_constant__NilAssignment_3 ) )
                    {
                    // InternalPascal.g:1110:2: ( ( rule__Unsigned_constant__NilAssignment_3 ) )
                    // InternalPascal.g:1111:3: ( rule__Unsigned_constant__NilAssignment_3 )
                    {
                     before(grammarAccess.getUnsigned_constantAccess().getNilAssignment_3()); 
                    // InternalPascal.g:1112:3: ( rule__Unsigned_constant__NilAssignment_3 )
                    // InternalPascal.g:1112:4: rule__Unsigned_constant__NilAssignment_3
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
    // InternalPascal.g:1120:1: rule__Unsigned_number__Alternatives : ( ( ( rule__Unsigned_number__NumbersAssignment_0 ) ) | ( ( rule__Unsigned_number__NumbersAssignment_1 ) ) );
    public final void rule__Unsigned_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1124:1: ( ( ( rule__Unsigned_number__NumbersAssignment_0 ) ) | ( ( rule__Unsigned_number__NumbersAssignment_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_NUM_INT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_NUM_REAL) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPascal.g:1125:2: ( ( rule__Unsigned_number__NumbersAssignment_0 ) )
                    {
                    // InternalPascal.g:1125:2: ( ( rule__Unsigned_number__NumbersAssignment_0 ) )
                    // InternalPascal.g:1126:3: ( rule__Unsigned_number__NumbersAssignment_0 )
                    {
                     before(grammarAccess.getUnsigned_numberAccess().getNumbersAssignment_0()); 
                    // InternalPascal.g:1127:3: ( rule__Unsigned_number__NumbersAssignment_0 )
                    // InternalPascal.g:1127:4: rule__Unsigned_number__NumbersAssignment_0
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
                    // InternalPascal.g:1131:2: ( ( rule__Unsigned_number__NumbersAssignment_1 ) )
                    {
                    // InternalPascal.g:1131:2: ( ( rule__Unsigned_number__NumbersAssignment_1 ) )
                    // InternalPascal.g:1132:3: ( rule__Unsigned_number__NumbersAssignment_1 )
                    {
                     before(grammarAccess.getUnsigned_numberAccess().getNumbersAssignment_1()); 
                    // InternalPascal.g:1133:3: ( rule__Unsigned_number__NumbersAssignment_1 )
                    // InternalPascal.g:1133:4: rule__Unsigned_number__NumbersAssignment_1
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
    // InternalPascal.g:1141:1: rule__Additive_operator__Alternatives : ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_OR ) );
    public final void rule__Additive_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1145:1: ( ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_OR ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt11=1;
                }
                break;
            case RULE_MINUS:
                {
                alt11=2;
                }
                break;
            case RULE_OR:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPascal.g:1146:2: ( RULE_PLUS )
                    {
                    // InternalPascal.g:1146:2: ( RULE_PLUS )
                    // InternalPascal.g:1147:3: RULE_PLUS
                    {
                     before(grammarAccess.getAdditive_operatorAccess().getPLUSTerminalRuleCall_0()); 
                    match(input,RULE_PLUS,FOLLOW_2); 
                     after(grammarAccess.getAdditive_operatorAccess().getPLUSTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1152:2: ( RULE_MINUS )
                    {
                    // InternalPascal.g:1152:2: ( RULE_MINUS )
                    // InternalPascal.g:1153:3: RULE_MINUS
                    {
                     before(grammarAccess.getAdditive_operatorAccess().getMINUSTerminalRuleCall_1()); 
                    match(input,RULE_MINUS,FOLLOW_2); 
                     after(grammarAccess.getAdditive_operatorAccess().getMINUSTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1158:2: ( RULE_OR )
                    {
                    // InternalPascal.g:1158:2: ( RULE_OR )
                    // InternalPascal.g:1159:3: RULE_OR
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
    // InternalPascal.g:1168:1: rule__Multiplicative_operator__Alternatives : ( ( RULE_STAR ) | ( RULE_SLASH ) | ( RULE_DIV ) | ( RULE_MOD ) | ( RULE_AND ) );
    public final void rule__Multiplicative_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1172:1: ( ( RULE_STAR ) | ( RULE_SLASH ) | ( RULE_DIV ) | ( RULE_MOD ) | ( RULE_AND ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case RULE_STAR:
                {
                alt12=1;
                }
                break;
            case RULE_SLASH:
                {
                alt12=2;
                }
                break;
            case RULE_DIV:
                {
                alt12=3;
                }
                break;
            case RULE_MOD:
                {
                alt12=4;
                }
                break;
            case RULE_AND:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalPascal.g:1173:2: ( RULE_STAR )
                    {
                    // InternalPascal.g:1173:2: ( RULE_STAR )
                    // InternalPascal.g:1174:3: RULE_STAR
                    {
                     before(grammarAccess.getMultiplicative_operatorAccess().getSTARTerminalRuleCall_0()); 
                    match(input,RULE_STAR,FOLLOW_2); 
                     after(grammarAccess.getMultiplicative_operatorAccess().getSTARTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1179:2: ( RULE_SLASH )
                    {
                    // InternalPascal.g:1179:2: ( RULE_SLASH )
                    // InternalPascal.g:1180:3: RULE_SLASH
                    {
                     before(grammarAccess.getMultiplicative_operatorAccess().getSLASHTerminalRuleCall_1()); 
                    match(input,RULE_SLASH,FOLLOW_2); 
                     after(grammarAccess.getMultiplicative_operatorAccess().getSLASHTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1185:2: ( RULE_DIV )
                    {
                    // InternalPascal.g:1185:2: ( RULE_DIV )
                    // InternalPascal.g:1186:3: RULE_DIV
                    {
                     before(grammarAccess.getMultiplicative_operatorAccess().getDIVTerminalRuleCall_2()); 
                    match(input,RULE_DIV,FOLLOW_2); 
                     after(grammarAccess.getMultiplicative_operatorAccess().getDIVTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1191:2: ( RULE_MOD )
                    {
                    // InternalPascal.g:1191:2: ( RULE_MOD )
                    // InternalPascal.g:1192:3: RULE_MOD
                    {
                     before(grammarAccess.getMultiplicative_operatorAccess().getMODTerminalRuleCall_3()); 
                    match(input,RULE_MOD,FOLLOW_2); 
                     after(grammarAccess.getMultiplicative_operatorAccess().getMODTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:1197:2: ( RULE_AND )
                    {
                    // InternalPascal.g:1197:2: ( RULE_AND )
                    // InternalPascal.g:1198:3: RULE_AND
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
    // InternalPascal.g:1207:1: rule__Relational_operator__Alternatives : ( ( RULE_EQUAL ) | ( RULE_NOT_EQUAL ) | ( RULE_LT ) | ( RULE_LE ) | ( RULE_GE ) | ( RULE_GT ) | ( RULE_IN ) );
    public final void rule__Relational_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1211:1: ( ( RULE_EQUAL ) | ( RULE_NOT_EQUAL ) | ( RULE_LT ) | ( RULE_LE ) | ( RULE_GE ) | ( RULE_GT ) | ( RULE_IN ) )
            int alt13=7;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                alt13=1;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt13=2;
                }
                break;
            case RULE_LT:
                {
                alt13=3;
                }
                break;
            case RULE_LE:
                {
                alt13=4;
                }
                break;
            case RULE_GE:
                {
                alt13=5;
                }
                break;
            case RULE_GT:
                {
                alt13=6;
                }
                break;
            case RULE_IN:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalPascal.g:1212:2: ( RULE_EQUAL )
                    {
                    // InternalPascal.g:1212:2: ( RULE_EQUAL )
                    // InternalPascal.g:1213:3: RULE_EQUAL
                    {
                     before(grammarAccess.getRelational_operatorAccess().getEQUALTerminalRuleCall_0()); 
                    match(input,RULE_EQUAL,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getEQUALTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1218:2: ( RULE_NOT_EQUAL )
                    {
                    // InternalPascal.g:1218:2: ( RULE_NOT_EQUAL )
                    // InternalPascal.g:1219:3: RULE_NOT_EQUAL
                    {
                     before(grammarAccess.getRelational_operatorAccess().getNOT_EQUALTerminalRuleCall_1()); 
                    match(input,RULE_NOT_EQUAL,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getNOT_EQUALTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1224:2: ( RULE_LT )
                    {
                    // InternalPascal.g:1224:2: ( RULE_LT )
                    // InternalPascal.g:1225:3: RULE_LT
                    {
                     before(grammarAccess.getRelational_operatorAccess().getLTTerminalRuleCall_2()); 
                    match(input,RULE_LT,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getLTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1230:2: ( RULE_LE )
                    {
                    // InternalPascal.g:1230:2: ( RULE_LE )
                    // InternalPascal.g:1231:3: RULE_LE
                    {
                     before(grammarAccess.getRelational_operatorAccess().getLETerminalRuleCall_3()); 
                    match(input,RULE_LE,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getLETerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:1236:2: ( RULE_GE )
                    {
                    // InternalPascal.g:1236:2: ( RULE_GE )
                    // InternalPascal.g:1237:3: RULE_GE
                    {
                     before(grammarAccess.getRelational_operatorAccess().getGETerminalRuleCall_4()); 
                    match(input,RULE_GE,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getGETerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:1242:2: ( RULE_GT )
                    {
                    // InternalPascal.g:1242:2: ( RULE_GT )
                    // InternalPascal.g:1243:3: RULE_GT
                    {
                     before(grammarAccess.getRelational_operatorAccess().getGTTerminalRuleCall_5()); 
                    match(input,RULE_GT,FOLLOW_2); 
                     after(grammarAccess.getRelational_operatorAccess().getGTTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPascal.g:1248:2: ( RULE_IN )
                    {
                    // InternalPascal.g:1248:2: ( RULE_IN )
                    // InternalPascal.g:1249:3: RULE_IN
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
    // InternalPascal.g:1258:1: rule__Bool__Alternatives : ( ( RULE_TRUE ) | ( RULE_FALSE ) );
    public final void rule__Bool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1262:1: ( ( RULE_TRUE ) | ( RULE_FALSE ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_TRUE) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_FALSE) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascal.g:1263:2: ( RULE_TRUE )
                    {
                    // InternalPascal.g:1263:2: ( RULE_TRUE )
                    // InternalPascal.g:1264:3: RULE_TRUE
                    {
                     before(grammarAccess.getBoolAccess().getTRUETerminalRuleCall_0()); 
                    match(input,RULE_TRUE,FOLLOW_2); 
                     after(grammarAccess.getBoolAccess().getTRUETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1269:2: ( RULE_FALSE )
                    {
                    // InternalPascal.g:1269:2: ( RULE_FALSE )
                    // InternalPascal.g:1270:3: RULE_FALSE
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


    // $ANTLR start "rule__Program__Group__0"
    // InternalPascal.g:1279:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1283:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPascal.g:1284:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalPascal.g:1291:1: rule__Program__Group__0__Impl : ( ( rule__Program__HeadingAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1295:1: ( ( ( rule__Program__HeadingAssignment_0 ) ) )
            // InternalPascal.g:1296:1: ( ( rule__Program__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:1296:1: ( ( rule__Program__HeadingAssignment_0 ) )
            // InternalPascal.g:1297:2: ( rule__Program__HeadingAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getHeadingAssignment_0()); 
            // InternalPascal.g:1298:2: ( rule__Program__HeadingAssignment_0 )
            // InternalPascal.g:1298:3: rule__Program__HeadingAssignment_0
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
    // InternalPascal.g:1306:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1310:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPascal.g:1311:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalPascal.g:1318:1: rule__Program__Group__1__Impl : ( ( rule__Program__BlockAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1322:1: ( ( ( rule__Program__BlockAssignment_1 ) ) )
            // InternalPascal.g:1323:1: ( ( rule__Program__BlockAssignment_1 ) )
            {
            // InternalPascal.g:1323:1: ( ( rule__Program__BlockAssignment_1 ) )
            // InternalPascal.g:1324:2: ( rule__Program__BlockAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getBlockAssignment_1()); 
            // InternalPascal.g:1325:2: ( rule__Program__BlockAssignment_1 )
            // InternalPascal.g:1325:3: rule__Program__BlockAssignment_1
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
    // InternalPascal.g:1333:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1337:1: ( rule__Program__Group__2__Impl )
            // InternalPascal.g:1338:2: rule__Program__Group__2__Impl
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
    // InternalPascal.g:1344:1: rule__Program__Group__2__Impl : ( '.' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1348:1: ( ( '.' ) )
            // InternalPascal.g:1349:1: ( '.' )
            {
            // InternalPascal.g:1349:1: ( '.' )
            // InternalPascal.g:1350:2: '.'
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
    // InternalPascal.g:1360:1: rule__Program_heading_block__Group__0 : rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 ;
    public final void rule__Program_heading_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1364:1: ( rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 )
            // InternalPascal.g:1365:2: rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1
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
    // InternalPascal.g:1372:1: rule__Program_heading_block__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program_heading_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1376:1: ( ( 'program' ) )
            // InternalPascal.g:1377:1: ( 'program' )
            {
            // InternalPascal.g:1377:1: ( 'program' )
            // InternalPascal.g:1378:2: 'program'
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
    // InternalPascal.g:1387:1: rule__Program_heading_block__Group__1 : rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 ;
    public final void rule__Program_heading_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1391:1: ( rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 )
            // InternalPascal.g:1392:2: rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2
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
    // InternalPascal.g:1399:1: rule__Program_heading_block__Group__1__Impl : ( ( rule__Program_heading_block__NameAssignment_1 ) ) ;
    public final void rule__Program_heading_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1403:1: ( ( ( rule__Program_heading_block__NameAssignment_1 ) ) )
            // InternalPascal.g:1404:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            {
            // InternalPascal.g:1404:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            // InternalPascal.g:1405:2: ( rule__Program_heading_block__NameAssignment_1 )
            {
             before(grammarAccess.getProgram_heading_blockAccess().getNameAssignment_1()); 
            // InternalPascal.g:1406:2: ( rule__Program_heading_block__NameAssignment_1 )
            // InternalPascal.g:1406:3: rule__Program_heading_block__NameAssignment_1
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
    // InternalPascal.g:1414:1: rule__Program_heading_block__Group__2 : rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3 ;
    public final void rule__Program_heading_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1418:1: ( rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3 )
            // InternalPascal.g:1419:2: rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3
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
    // InternalPascal.g:1426:1: rule__Program_heading_block__Group__2__Impl : ( ( rule__Program_heading_block__Group_2__0 )? ) ;
    public final void rule__Program_heading_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1430:1: ( ( ( rule__Program_heading_block__Group_2__0 )? ) )
            // InternalPascal.g:1431:1: ( ( rule__Program_heading_block__Group_2__0 )? )
            {
            // InternalPascal.g:1431:1: ( ( rule__Program_heading_block__Group_2__0 )? )
            // InternalPascal.g:1432:2: ( rule__Program_heading_block__Group_2__0 )?
            {
             before(grammarAccess.getProgram_heading_blockAccess().getGroup_2()); 
            // InternalPascal.g:1433:2: ( rule__Program_heading_block__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1433:3: rule__Program_heading_block__Group_2__0
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
    // InternalPascal.g:1441:1: rule__Program_heading_block__Group__3 : rule__Program_heading_block__Group__3__Impl ;
    public final void rule__Program_heading_block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1445:1: ( rule__Program_heading_block__Group__3__Impl )
            // InternalPascal.g:1446:2: rule__Program_heading_block__Group__3__Impl
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
    // InternalPascal.g:1452:1: rule__Program_heading_block__Group__3__Impl : ( ';' ) ;
    public final void rule__Program_heading_block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1456:1: ( ( ';' ) )
            // InternalPascal.g:1457:1: ( ';' )
            {
            // InternalPascal.g:1457:1: ( ';' )
            // InternalPascal.g:1458:2: ';'
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
    // InternalPascal.g:1468:1: rule__Program_heading_block__Group_2__0 : rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1 ;
    public final void rule__Program_heading_block__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1472:1: ( rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1 )
            // InternalPascal.g:1473:2: rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1
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
    // InternalPascal.g:1480:1: rule__Program_heading_block__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Program_heading_block__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1484:1: ( ( '(' ) )
            // InternalPascal.g:1485:1: ( '(' )
            {
            // InternalPascal.g:1485:1: ( '(' )
            // InternalPascal.g:1486:2: '('
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
    // InternalPascal.g:1495:1: rule__Program_heading_block__Group_2__1 : rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2 ;
    public final void rule__Program_heading_block__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1499:1: ( rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2 )
            // InternalPascal.g:1500:2: rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2
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
    // InternalPascal.g:1507:1: rule__Program_heading_block__Group_2__1__Impl : ( ( rule__Program_heading_block__IdentifiersAssignment_2_1 ) ) ;
    public final void rule__Program_heading_block__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1511:1: ( ( ( rule__Program_heading_block__IdentifiersAssignment_2_1 ) ) )
            // InternalPascal.g:1512:1: ( ( rule__Program_heading_block__IdentifiersAssignment_2_1 ) )
            {
            // InternalPascal.g:1512:1: ( ( rule__Program_heading_block__IdentifiersAssignment_2_1 ) )
            // InternalPascal.g:1513:2: ( rule__Program_heading_block__IdentifiersAssignment_2_1 )
            {
             before(grammarAccess.getProgram_heading_blockAccess().getIdentifiersAssignment_2_1()); 
            // InternalPascal.g:1514:2: ( rule__Program_heading_block__IdentifiersAssignment_2_1 )
            // InternalPascal.g:1514:3: rule__Program_heading_block__IdentifiersAssignment_2_1
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
    // InternalPascal.g:1522:1: rule__Program_heading_block__Group_2__2 : rule__Program_heading_block__Group_2__2__Impl ;
    public final void rule__Program_heading_block__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1526:1: ( rule__Program_heading_block__Group_2__2__Impl )
            // InternalPascal.g:1527:2: rule__Program_heading_block__Group_2__2__Impl
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
    // InternalPascal.g:1533:1: rule__Program_heading_block__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Program_heading_block__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1537:1: ( ( ')' ) )
            // InternalPascal.g:1538:1: ( ')' )
            {
            // InternalPascal.g:1538:1: ( ')' )
            // InternalPascal.g:1539:2: ')'
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
    // InternalPascal.g:1549:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1553:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // InternalPascal.g:1554:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
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
    // InternalPascal.g:1561:1: rule__Identifier_list__Group__0__Impl : ( ( rule__Identifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1565:1: ( ( ( rule__Identifier_list__NamesAssignment_0 ) ) )
            // InternalPascal.g:1566:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            {
            // InternalPascal.g:1566:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            // InternalPascal.g:1567:2: ( rule__Identifier_list__NamesAssignment_0 )
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_0()); 
            // InternalPascal.g:1568:2: ( rule__Identifier_list__NamesAssignment_0 )
            // InternalPascal.g:1568:3: rule__Identifier_list__NamesAssignment_0
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
    // InternalPascal.g:1576:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1580:1: ( rule__Identifier_list__Group__1__Impl )
            // InternalPascal.g:1581:2: rule__Identifier_list__Group__1__Impl
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
    // InternalPascal.g:1587:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1591:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // InternalPascal.g:1592:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // InternalPascal.g:1592:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // InternalPascal.g:1593:2: ( rule__Identifier_list__Group_1__0 )*
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            // InternalPascal.g:1594:2: ( rule__Identifier_list__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==44) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPascal.g:1594:3: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalPascal.g:1603:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1607:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // InternalPascal.g:1608:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
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
    // InternalPascal.g:1615:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1619:1: ( ( ',' ) )
            // InternalPascal.g:1620:1: ( ',' )
            {
            // InternalPascal.g:1620:1: ( ',' )
            // InternalPascal.g:1621:2: ','
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
    // InternalPascal.g:1630:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1634:1: ( rule__Identifier_list__Group_1__1__Impl )
            // InternalPascal.g:1635:2: rule__Identifier_list__Group_1__1__Impl
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
    // InternalPascal.g:1641:1: rule__Identifier_list__Group_1__1__Impl : ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1645:1: ( ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascal.g:1646:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascal.g:1646:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            // InternalPascal.g:1647:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_1_1()); 
            // InternalPascal.g:1648:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            // InternalPascal.g:1648:3: rule__Identifier_list__NamesAssignment_1_1
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


    // $ANTLR start "rule__Compound_statement__Group__0"
    // InternalPascal.g:1657:1: rule__Compound_statement__Group__0 : rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1 ;
    public final void rule__Compound_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1661:1: ( rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1 )
            // InternalPascal.g:1662:2: rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalPascal.g:1669:1: rule__Compound_statement__Group__0__Impl : ( 'begin' ) ;
    public final void rule__Compound_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1673:1: ( ( 'begin' ) )
            // InternalPascal.g:1674:1: ( 'begin' )
            {
            // InternalPascal.g:1674:1: ( 'begin' )
            // InternalPascal.g:1675:2: 'begin'
            {
             before(grammarAccess.getCompound_statementAccess().getBeginKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalPascal.g:1684:1: rule__Compound_statement__Group__1 : rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2 ;
    public final void rule__Compound_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1688:1: ( rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2 )
            // InternalPascal.g:1689:2: rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalPascal.g:1696:1: rule__Compound_statement__Group__1__Impl : ( ( rule__Compound_statement__SequenceAssignment_1 ) ) ;
    public final void rule__Compound_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1700:1: ( ( ( rule__Compound_statement__SequenceAssignment_1 ) ) )
            // InternalPascal.g:1701:1: ( ( rule__Compound_statement__SequenceAssignment_1 ) )
            {
            // InternalPascal.g:1701:1: ( ( rule__Compound_statement__SequenceAssignment_1 ) )
            // InternalPascal.g:1702:2: ( rule__Compound_statement__SequenceAssignment_1 )
            {
             before(grammarAccess.getCompound_statementAccess().getSequenceAssignment_1()); 
            // InternalPascal.g:1703:2: ( rule__Compound_statement__SequenceAssignment_1 )
            // InternalPascal.g:1703:3: rule__Compound_statement__SequenceAssignment_1
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
    // InternalPascal.g:1711:1: rule__Compound_statement__Group__2 : rule__Compound_statement__Group__2__Impl ;
    public final void rule__Compound_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1715:1: ( rule__Compound_statement__Group__2__Impl )
            // InternalPascal.g:1716:2: rule__Compound_statement__Group__2__Impl
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
    // InternalPascal.g:1722:1: rule__Compound_statement__Group__2__Impl : ( 'end' ) ;
    public final void rule__Compound_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1726:1: ( ( 'end' ) )
            // InternalPascal.g:1727:1: ( 'end' )
            {
            // InternalPascal.g:1727:1: ( 'end' )
            // InternalPascal.g:1728:2: 'end'
            {
             before(grammarAccess.getCompound_statementAccess().getEndKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalPascal.g:1738:1: rule__Statements__Group__0 : rule__Statements__Group__0__Impl rule__Statements__Group__1 ;
    public final void rule__Statements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1742:1: ( rule__Statements__Group__0__Impl rule__Statements__Group__1 )
            // InternalPascal.g:1743:2: rule__Statements__Group__0__Impl rule__Statements__Group__1
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
    // InternalPascal.g:1750:1: rule__Statements__Group__0__Impl : ( ( rule__Statements__StatementsAssignment_0 ) ) ;
    public final void rule__Statements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1754:1: ( ( ( rule__Statements__StatementsAssignment_0 ) ) )
            // InternalPascal.g:1755:1: ( ( rule__Statements__StatementsAssignment_0 ) )
            {
            // InternalPascal.g:1755:1: ( ( rule__Statements__StatementsAssignment_0 ) )
            // InternalPascal.g:1756:2: ( rule__Statements__StatementsAssignment_0 )
            {
             before(grammarAccess.getStatementsAccess().getStatementsAssignment_0()); 
            // InternalPascal.g:1757:2: ( rule__Statements__StatementsAssignment_0 )
            // InternalPascal.g:1757:3: rule__Statements__StatementsAssignment_0
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
    // InternalPascal.g:1765:1: rule__Statements__Group__1 : rule__Statements__Group__1__Impl ;
    public final void rule__Statements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1769:1: ( rule__Statements__Group__1__Impl )
            // InternalPascal.g:1770:2: rule__Statements__Group__1__Impl
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
    // InternalPascal.g:1776:1: rule__Statements__Group__1__Impl : ( ( rule__Statements__Group_1__0 )* ) ;
    public final void rule__Statements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1780:1: ( ( ( rule__Statements__Group_1__0 )* ) )
            // InternalPascal.g:1781:1: ( ( rule__Statements__Group_1__0 )* )
            {
            // InternalPascal.g:1781:1: ( ( rule__Statements__Group_1__0 )* )
            // InternalPascal.g:1782:2: ( rule__Statements__Group_1__0 )*
            {
             before(grammarAccess.getStatementsAccess().getGroup_1()); 
            // InternalPascal.g:1783:2: ( rule__Statements__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==41) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPascal.g:1783:3: rule__Statements__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Statements__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalPascal.g:1792:1: rule__Statements__Group_1__0 : rule__Statements__Group_1__0__Impl rule__Statements__Group_1__1 ;
    public final void rule__Statements__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1796:1: ( rule__Statements__Group_1__0__Impl rule__Statements__Group_1__1 )
            // InternalPascal.g:1797:2: rule__Statements__Group_1__0__Impl rule__Statements__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalPascal.g:1804:1: rule__Statements__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Statements__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1808:1: ( ( ';' ) )
            // InternalPascal.g:1809:1: ( ';' )
            {
            // InternalPascal.g:1809:1: ( ';' )
            // InternalPascal.g:1810:2: ';'
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
    // InternalPascal.g:1819:1: rule__Statements__Group_1__1 : rule__Statements__Group_1__1__Impl ;
    public final void rule__Statements__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1823:1: ( rule__Statements__Group_1__1__Impl )
            // InternalPascal.g:1824:2: rule__Statements__Group_1__1__Impl
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
    // InternalPascal.g:1830:1: rule__Statements__Group_1__1__Impl : ( ( rule__Statements__StatementsAssignment_1_1 ) ) ;
    public final void rule__Statements__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1834:1: ( ( ( rule__Statements__StatementsAssignment_1_1 ) ) )
            // InternalPascal.g:1835:1: ( ( rule__Statements__StatementsAssignment_1_1 ) )
            {
            // InternalPascal.g:1835:1: ( ( rule__Statements__StatementsAssignment_1_1 ) )
            // InternalPascal.g:1836:2: ( rule__Statements__StatementsAssignment_1_1 )
            {
             before(grammarAccess.getStatementsAccess().getStatementsAssignment_1_1()); 
            // InternalPascal.g:1837:2: ( rule__Statements__StatementsAssignment_1_1 )
            // InternalPascal.g:1837:3: rule__Statements__StatementsAssignment_1_1
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
    // InternalPascal.g:1846:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1850:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalPascal.g:1851:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalPascal.g:1858:1: rule__Statement__Group_0__0__Impl : ( ( rule__Statement__LabelAssignment_0_0 ) ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1862:1: ( ( ( rule__Statement__LabelAssignment_0_0 ) ) )
            // InternalPascal.g:1863:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            {
            // InternalPascal.g:1863:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            // InternalPascal.g:1864:2: ( rule__Statement__LabelAssignment_0_0 )
            {
             before(grammarAccess.getStatementAccess().getLabelAssignment_0_0()); 
            // InternalPascal.g:1865:2: ( rule__Statement__LabelAssignment_0_0 )
            // InternalPascal.g:1865:3: rule__Statement__LabelAssignment_0_0
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
    // InternalPascal.g:1873:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1877:1: ( rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 )
            // InternalPascal.g:1878:2: rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalPascal.g:1885:1: rule__Statement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1889:1: ( ( ':' ) )
            // InternalPascal.g:1890:1: ( ':' )
            {
            // InternalPascal.g:1890:1: ( ':' )
            // InternalPascal.g:1891:2: ':'
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
    // InternalPascal.g:1900:1: rule__Statement__Group_0__2 : rule__Statement__Group_0__2__Impl ;
    public final void rule__Statement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1904:1: ( rule__Statement__Group_0__2__Impl )
            // InternalPascal.g:1905:2: rule__Statement__Group_0__2__Impl
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
    // InternalPascal.g:1911:1: rule__Statement__Group_0__2__Impl : ( ( rule__Statement__StatementAssignment_0_2 ) ) ;
    public final void rule__Statement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1915:1: ( ( ( rule__Statement__StatementAssignment_0_2 ) ) )
            // InternalPascal.g:1916:1: ( ( rule__Statement__StatementAssignment_0_2 ) )
            {
            // InternalPascal.g:1916:1: ( ( rule__Statement__StatementAssignment_0_2 ) )
            // InternalPascal.g:1917:2: ( rule__Statement__StatementAssignment_0_2 )
            {
             before(grammarAccess.getStatementAccess().getStatementAssignment_0_2()); 
            // InternalPascal.g:1918:2: ( rule__Statement__StatementAssignment_0_2 )
            // InternalPascal.g:1918:3: rule__Statement__StatementAssignment_0_2
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
    // InternalPascal.g:1927:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1931:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalPascal.g:1932:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalPascal.g:1939:1: rule__Statement__Group_1__0__Impl : ( () ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1943:1: ( ( () ) )
            // InternalPascal.g:1944:1: ( () )
            {
            // InternalPascal.g:1944:1: ( () )
            // InternalPascal.g:1945:2: ()
            {
             before(grammarAccess.getStatementAccess().getStatementAction_1_0()); 
            // InternalPascal.g:1946:2: ()
            // InternalPascal.g:1946:3: 
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
    // InternalPascal.g:1954:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1958:1: ( rule__Statement__Group_1__1__Impl )
            // InternalPascal.g:1959:2: rule__Statement__Group_1__1__Impl
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
    // InternalPascal.g:1965:1: rule__Statement__Group_1__1__Impl : ( ( rule__Statement__StatementAssignment_1_1 )? ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1969:1: ( ( ( rule__Statement__StatementAssignment_1_1 )? ) )
            // InternalPascal.g:1970:1: ( ( rule__Statement__StatementAssignment_1_1 )? )
            {
            // InternalPascal.g:1970:1: ( ( rule__Statement__StatementAssignment_1_1 )? )
            // InternalPascal.g:1971:2: ( rule__Statement__StatementAssignment_1_1 )?
            {
             before(grammarAccess.getStatementAccess().getStatementAssignment_1_1()); 
            // InternalPascal.g:1972:2: ( rule__Statement__StatementAssignment_1_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||(LA18_0>=35 && LA18_0<=37)||LA18_0==48) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPascal.g:1972:3: rule__Statement__StatementAssignment_1_1
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
    // InternalPascal.g:1981:1: rule__Assignment_statement__Group__0 : rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 ;
    public final void rule__Assignment_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1985:1: ( rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 )
            // InternalPascal.g:1986:2: rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalPascal.g:1993:1: rule__Assignment_statement__Group__0__Impl : ( ( rule__Assignment_statement__VariableAssignment_0 ) ) ;
    public final void rule__Assignment_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1997:1: ( ( ( rule__Assignment_statement__VariableAssignment_0 ) ) )
            // InternalPascal.g:1998:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            {
            // InternalPascal.g:1998:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            // InternalPascal.g:1999:2: ( rule__Assignment_statement__VariableAssignment_0 )
            {
             before(grammarAccess.getAssignment_statementAccess().getVariableAssignment_0()); 
            // InternalPascal.g:2000:2: ( rule__Assignment_statement__VariableAssignment_0 )
            // InternalPascal.g:2000:3: rule__Assignment_statement__VariableAssignment_0
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
    // InternalPascal.g:2008:1: rule__Assignment_statement__Group__1 : rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 ;
    public final void rule__Assignment_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2012:1: ( rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 )
            // InternalPascal.g:2013:2: rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:2020:1: rule__Assignment_statement__Group__1__Impl : ( RULE_ASSIGN ) ;
    public final void rule__Assignment_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2024:1: ( ( RULE_ASSIGN ) )
            // InternalPascal.g:2025:1: ( RULE_ASSIGN )
            {
            // InternalPascal.g:2025:1: ( RULE_ASSIGN )
            // InternalPascal.g:2026:2: RULE_ASSIGN
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
    // InternalPascal.g:2035:1: rule__Assignment_statement__Group__2 : rule__Assignment_statement__Group__2__Impl ;
    public final void rule__Assignment_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2039:1: ( rule__Assignment_statement__Group__2__Impl )
            // InternalPascal.g:2040:2: rule__Assignment_statement__Group__2__Impl
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
    // InternalPascal.g:2046:1: rule__Assignment_statement__Group__2__Impl : ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2050:1: ( ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) )
            // InternalPascal.g:2051:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            {
            // InternalPascal.g:2051:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            // InternalPascal.g:2052:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            {
             before(grammarAccess.getAssignment_statementAccess().getExpressionAssignment_2()); 
            // InternalPascal.g:2053:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            // InternalPascal.g:2053:3: rule__Assignment_statement__ExpressionAssignment_2
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
    // InternalPascal.g:2062:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2066:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPascal.g:2067:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalPascal.g:2074:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__Alternatives_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2078:1: ( ( ( rule__Variable__Alternatives_0 ) ) )
            // InternalPascal.g:2079:1: ( ( rule__Variable__Alternatives_0 ) )
            {
            // InternalPascal.g:2079:1: ( ( rule__Variable__Alternatives_0 ) )
            // InternalPascal.g:2080:2: ( rule__Variable__Alternatives_0 )
            {
             before(grammarAccess.getVariableAccess().getAlternatives_0()); 
            // InternalPascal.g:2081:2: ( rule__Variable__Alternatives_0 )
            // InternalPascal.g:2081:3: rule__Variable__Alternatives_0
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
    // InternalPascal.g:2089:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2093:1: ( rule__Variable__Group__1__Impl )
            // InternalPascal.g:2094:2: rule__Variable__Group__1__Impl
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
    // InternalPascal.g:2100:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__Alternatives_1 )* ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2104:1: ( ( ( rule__Variable__Alternatives_1 )* ) )
            // InternalPascal.g:2105:1: ( ( rule__Variable__Alternatives_1 )* )
            {
            // InternalPascal.g:2105:1: ( ( rule__Variable__Alternatives_1 )* )
            // InternalPascal.g:2106:2: ( rule__Variable__Alternatives_1 )*
            {
             before(grammarAccess.getVariableAccess().getAlternatives_1()); 
            // InternalPascal.g:2107:2: ( rule__Variable__Alternatives_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=38 && LA19_0<=39)||LA19_0==49||LA19_0==51) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPascal.g:2107:3: rule__Variable__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Variable__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalPascal.g:2116:1: rule__Variable__Group_0_0__0 : rule__Variable__Group_0_0__0__Impl rule__Variable__Group_0_0__1 ;
    public final void rule__Variable__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2120:1: ( rule__Variable__Group_0_0__0__Impl rule__Variable__Group_0_0__1 )
            // InternalPascal.g:2121:2: rule__Variable__Group_0_0__0__Impl rule__Variable__Group_0_0__1
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
    // InternalPascal.g:2128:1: rule__Variable__Group_0_0__0__Impl : ( '@' ) ;
    public final void rule__Variable__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2132:1: ( ( '@' ) )
            // InternalPascal.g:2133:1: ( '@' )
            {
            // InternalPascal.g:2133:1: ( '@' )
            // InternalPascal.g:2134:2: '@'
            {
             before(grammarAccess.getVariableAccess().getCommercialAtKeyword_0_0_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalPascal.g:2143:1: rule__Variable__Group_0_0__1 : rule__Variable__Group_0_0__1__Impl ;
    public final void rule__Variable__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2147:1: ( rule__Variable__Group_0_0__1__Impl )
            // InternalPascal.g:2148:2: rule__Variable__Group_0_0__1__Impl
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
    // InternalPascal.g:2154:1: rule__Variable__Group_0_0__1__Impl : ( ( rule__Variable__NamesAssignment_0_0_1 ) ) ;
    public final void rule__Variable__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2158:1: ( ( ( rule__Variable__NamesAssignment_0_0_1 ) ) )
            // InternalPascal.g:2159:1: ( ( rule__Variable__NamesAssignment_0_0_1 ) )
            {
            // InternalPascal.g:2159:1: ( ( rule__Variable__NamesAssignment_0_0_1 ) )
            // InternalPascal.g:2160:2: ( rule__Variable__NamesAssignment_0_0_1 )
            {
             before(grammarAccess.getVariableAccess().getNamesAssignment_0_0_1()); 
            // InternalPascal.g:2161:2: ( rule__Variable__NamesAssignment_0_0_1 )
            // InternalPascal.g:2161:3: rule__Variable__NamesAssignment_0_0_1
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
    // InternalPascal.g:2170:1: rule__Variable__Group_1_0__0 : rule__Variable__Group_1_0__0__Impl rule__Variable__Group_1_0__1 ;
    public final void rule__Variable__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2174:1: ( rule__Variable__Group_1_0__0__Impl rule__Variable__Group_1_0__1 )
            // InternalPascal.g:2175:2: rule__Variable__Group_1_0__0__Impl rule__Variable__Group_1_0__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:2182:1: rule__Variable__Group_1_0__0__Impl : ( '[' ) ;
    public final void rule__Variable__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2186:1: ( ( '[' ) )
            // InternalPascal.g:2187:1: ( '[' )
            {
            // InternalPascal.g:2187:1: ( '[' )
            // InternalPascal.g:2188:2: '['
            {
             before(grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_1_0_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalPascal.g:2197:1: rule__Variable__Group_1_0__1 : rule__Variable__Group_1_0__1__Impl rule__Variable__Group_1_0__2 ;
    public final void rule__Variable__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2201:1: ( rule__Variable__Group_1_0__1__Impl rule__Variable__Group_1_0__2 )
            // InternalPascal.g:2202:2: rule__Variable__Group_1_0__1__Impl rule__Variable__Group_1_0__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalPascal.g:2209:1: rule__Variable__Group_1_0__1__Impl : ( ( rule__Variable__ExpressionAssignment_1_0_1 ) ) ;
    public final void rule__Variable__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2213:1: ( ( ( rule__Variable__ExpressionAssignment_1_0_1 ) ) )
            // InternalPascal.g:2214:1: ( ( rule__Variable__ExpressionAssignment_1_0_1 ) )
            {
            // InternalPascal.g:2214:1: ( ( rule__Variable__ExpressionAssignment_1_0_1 ) )
            // InternalPascal.g:2215:2: ( rule__Variable__ExpressionAssignment_1_0_1 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_1_0_1()); 
            // InternalPascal.g:2216:2: ( rule__Variable__ExpressionAssignment_1_0_1 )
            // InternalPascal.g:2216:3: rule__Variable__ExpressionAssignment_1_0_1
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
    // InternalPascal.g:2224:1: rule__Variable__Group_1_0__2 : rule__Variable__Group_1_0__2__Impl rule__Variable__Group_1_0__3 ;
    public final void rule__Variable__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2228:1: ( rule__Variable__Group_1_0__2__Impl rule__Variable__Group_1_0__3 )
            // InternalPascal.g:2229:2: rule__Variable__Group_1_0__2__Impl rule__Variable__Group_1_0__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalPascal.g:2236:1: rule__Variable__Group_1_0__2__Impl : ( ( rule__Variable__Group_1_0_2__0 )* ) ;
    public final void rule__Variable__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2240:1: ( ( ( rule__Variable__Group_1_0_2__0 )* ) )
            // InternalPascal.g:2241:1: ( ( rule__Variable__Group_1_0_2__0 )* )
            {
            // InternalPascal.g:2241:1: ( ( rule__Variable__Group_1_0_2__0 )* )
            // InternalPascal.g:2242:2: ( rule__Variable__Group_1_0_2__0 )*
            {
             before(grammarAccess.getVariableAccess().getGroup_1_0_2()); 
            // InternalPascal.g:2243:2: ( rule__Variable__Group_1_0_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==44) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPascal.g:2243:3: rule__Variable__Group_1_0_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Variable__Group_1_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalPascal.g:2251:1: rule__Variable__Group_1_0__3 : rule__Variable__Group_1_0__3__Impl ;
    public final void rule__Variable__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2255:1: ( rule__Variable__Group_1_0__3__Impl )
            // InternalPascal.g:2256:2: rule__Variable__Group_1_0__3__Impl
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
    // InternalPascal.g:2262:1: rule__Variable__Group_1_0__3__Impl : ( ']' ) ;
    public final void rule__Variable__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2266:1: ( ( ']' ) )
            // InternalPascal.g:2267:1: ( ']' )
            {
            // InternalPascal.g:2267:1: ( ']' )
            // InternalPascal.g:2268:2: ']'
            {
             before(grammarAccess.getVariableAccess().getRightSquareBracketKeyword_1_0_3()); 
            match(input,50,FOLLOW_2); 
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
    // InternalPascal.g:2278:1: rule__Variable__Group_1_0_2__0 : rule__Variable__Group_1_0_2__0__Impl rule__Variable__Group_1_0_2__1 ;
    public final void rule__Variable__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2282:1: ( rule__Variable__Group_1_0_2__0__Impl rule__Variable__Group_1_0_2__1 )
            // InternalPascal.g:2283:2: rule__Variable__Group_1_0_2__0__Impl rule__Variable__Group_1_0_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:2290:1: rule__Variable__Group_1_0_2__0__Impl : ( ',' ) ;
    public final void rule__Variable__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2294:1: ( ( ',' ) )
            // InternalPascal.g:2295:1: ( ',' )
            {
            // InternalPascal.g:2295:1: ( ',' )
            // InternalPascal.g:2296:2: ','
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
    // InternalPascal.g:2305:1: rule__Variable__Group_1_0_2__1 : rule__Variable__Group_1_0_2__1__Impl ;
    public final void rule__Variable__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2309:1: ( rule__Variable__Group_1_0_2__1__Impl )
            // InternalPascal.g:2310:2: rule__Variable__Group_1_0_2__1__Impl
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
    // InternalPascal.g:2316:1: rule__Variable__Group_1_0_2__1__Impl : ( ( rule__Variable__ExpressionAssignment_1_0_2_1 ) ) ;
    public final void rule__Variable__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2320:1: ( ( ( rule__Variable__ExpressionAssignment_1_0_2_1 ) ) )
            // InternalPascal.g:2321:1: ( ( rule__Variable__ExpressionAssignment_1_0_2_1 ) )
            {
            // InternalPascal.g:2321:1: ( ( rule__Variable__ExpressionAssignment_1_0_2_1 ) )
            // InternalPascal.g:2322:2: ( rule__Variable__ExpressionAssignment_1_0_2_1 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_1_0_2_1()); 
            // InternalPascal.g:2323:2: ( rule__Variable__ExpressionAssignment_1_0_2_1 )
            // InternalPascal.g:2323:3: rule__Variable__ExpressionAssignment_1_0_2_1
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
    // InternalPascal.g:2332:1: rule__Variable__Group_1_1__0 : rule__Variable__Group_1_1__0__Impl rule__Variable__Group_1_1__1 ;
    public final void rule__Variable__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2336:1: ( rule__Variable__Group_1_1__0__Impl rule__Variable__Group_1_1__1 )
            // InternalPascal.g:2337:2: rule__Variable__Group_1_1__0__Impl rule__Variable__Group_1_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:2344:1: rule__Variable__Group_1_1__0__Impl : ( '(.' ) ;
    public final void rule__Variable__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2348:1: ( ( '(.' ) )
            // InternalPascal.g:2349:1: ( '(.' )
            {
            // InternalPascal.g:2349:1: ( '(.' )
            // InternalPascal.g:2350:2: '(.'
            {
             before(grammarAccess.getVariableAccess().getLeftParenthesisFullStopKeyword_1_1_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalPascal.g:2359:1: rule__Variable__Group_1_1__1 : rule__Variable__Group_1_1__1__Impl rule__Variable__Group_1_1__2 ;
    public final void rule__Variable__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2363:1: ( rule__Variable__Group_1_1__1__Impl rule__Variable__Group_1_1__2 )
            // InternalPascal.g:2364:2: rule__Variable__Group_1_1__1__Impl rule__Variable__Group_1_1__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalPascal.g:2371:1: rule__Variable__Group_1_1__1__Impl : ( ( rule__Variable__ExpressionAssignment_1_1_1 ) ) ;
    public final void rule__Variable__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2375:1: ( ( ( rule__Variable__ExpressionAssignment_1_1_1 ) ) )
            // InternalPascal.g:2376:1: ( ( rule__Variable__ExpressionAssignment_1_1_1 ) )
            {
            // InternalPascal.g:2376:1: ( ( rule__Variable__ExpressionAssignment_1_1_1 ) )
            // InternalPascal.g:2377:2: ( rule__Variable__ExpressionAssignment_1_1_1 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_1_1_1()); 
            // InternalPascal.g:2378:2: ( rule__Variable__ExpressionAssignment_1_1_1 )
            // InternalPascal.g:2378:3: rule__Variable__ExpressionAssignment_1_1_1
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
    // InternalPascal.g:2386:1: rule__Variable__Group_1_1__2 : rule__Variable__Group_1_1__2__Impl rule__Variable__Group_1_1__3 ;
    public final void rule__Variable__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2390:1: ( rule__Variable__Group_1_1__2__Impl rule__Variable__Group_1_1__3 )
            // InternalPascal.g:2391:2: rule__Variable__Group_1_1__2__Impl rule__Variable__Group_1_1__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalPascal.g:2398:1: rule__Variable__Group_1_1__2__Impl : ( ( rule__Variable__Group_1_1_2__0 )* ) ;
    public final void rule__Variable__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2402:1: ( ( ( rule__Variable__Group_1_1_2__0 )* ) )
            // InternalPascal.g:2403:1: ( ( rule__Variable__Group_1_1_2__0 )* )
            {
            // InternalPascal.g:2403:1: ( ( rule__Variable__Group_1_1_2__0 )* )
            // InternalPascal.g:2404:2: ( rule__Variable__Group_1_1_2__0 )*
            {
             before(grammarAccess.getVariableAccess().getGroup_1_1_2()); 
            // InternalPascal.g:2405:2: ( rule__Variable__Group_1_1_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==44) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPascal.g:2405:3: rule__Variable__Group_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Variable__Group_1_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalPascal.g:2413:1: rule__Variable__Group_1_1__3 : rule__Variable__Group_1_1__3__Impl ;
    public final void rule__Variable__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2417:1: ( rule__Variable__Group_1_1__3__Impl )
            // InternalPascal.g:2418:2: rule__Variable__Group_1_1__3__Impl
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
    // InternalPascal.g:2424:1: rule__Variable__Group_1_1__3__Impl : ( '.)' ) ;
    public final void rule__Variable__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2428:1: ( ( '.)' ) )
            // InternalPascal.g:2429:1: ( '.)' )
            {
            // InternalPascal.g:2429:1: ( '.)' )
            // InternalPascal.g:2430:2: '.)'
            {
             before(grammarAccess.getVariableAccess().getFullStopRightParenthesisKeyword_1_1_3()); 
            match(input,52,FOLLOW_2); 
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
    // InternalPascal.g:2440:1: rule__Variable__Group_1_1_2__0 : rule__Variable__Group_1_1_2__0__Impl rule__Variable__Group_1_1_2__1 ;
    public final void rule__Variable__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2444:1: ( rule__Variable__Group_1_1_2__0__Impl rule__Variable__Group_1_1_2__1 )
            // InternalPascal.g:2445:2: rule__Variable__Group_1_1_2__0__Impl rule__Variable__Group_1_1_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:2452:1: rule__Variable__Group_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__Variable__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2456:1: ( ( ',' ) )
            // InternalPascal.g:2457:1: ( ',' )
            {
            // InternalPascal.g:2457:1: ( ',' )
            // InternalPascal.g:2458:2: ','
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
    // InternalPascal.g:2467:1: rule__Variable__Group_1_1_2__1 : rule__Variable__Group_1_1_2__1__Impl ;
    public final void rule__Variable__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2471:1: ( rule__Variable__Group_1_1_2__1__Impl )
            // InternalPascal.g:2472:2: rule__Variable__Group_1_1_2__1__Impl
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
    // InternalPascal.g:2478:1: rule__Variable__Group_1_1_2__1__Impl : ( ( rule__Variable__ExpressionAssignment_1_1_2_1 ) ) ;
    public final void rule__Variable__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2482:1: ( ( ( rule__Variable__ExpressionAssignment_1_1_2_1 ) ) )
            // InternalPascal.g:2483:1: ( ( rule__Variable__ExpressionAssignment_1_1_2_1 ) )
            {
            // InternalPascal.g:2483:1: ( ( rule__Variable__ExpressionAssignment_1_1_2_1 ) )
            // InternalPascal.g:2484:2: ( rule__Variable__ExpressionAssignment_1_1_2_1 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_1_1_2_1()); 
            // InternalPascal.g:2485:2: ( rule__Variable__ExpressionAssignment_1_1_2_1 )
            // InternalPascal.g:2485:3: rule__Variable__ExpressionAssignment_1_1_2_1
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
    // InternalPascal.g:2494:1: rule__Variable__Group_1_2__0 : rule__Variable__Group_1_2__0__Impl rule__Variable__Group_1_2__1 ;
    public final void rule__Variable__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2498:1: ( rule__Variable__Group_1_2__0__Impl rule__Variable__Group_1_2__1 )
            // InternalPascal.g:2499:2: rule__Variable__Group_1_2__0__Impl rule__Variable__Group_1_2__1
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
    // InternalPascal.g:2506:1: rule__Variable__Group_1_2__0__Impl : ( '.' ) ;
    public final void rule__Variable__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2510:1: ( ( '.' ) )
            // InternalPascal.g:2511:1: ( '.' )
            {
            // InternalPascal.g:2511:1: ( '.' )
            // InternalPascal.g:2512:2: '.'
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
    // InternalPascal.g:2521:1: rule__Variable__Group_1_2__1 : rule__Variable__Group_1_2__1__Impl ;
    public final void rule__Variable__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2525:1: ( rule__Variable__Group_1_2__1__Impl )
            // InternalPascal.g:2526:2: rule__Variable__Group_1_2__1__Impl
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
    // InternalPascal.g:2532:1: rule__Variable__Group_1_2__1__Impl : ( ( rule__Variable__NamesAssignment_1_2_1 ) ) ;
    public final void rule__Variable__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2536:1: ( ( ( rule__Variable__NamesAssignment_1_2_1 ) ) )
            // InternalPascal.g:2537:1: ( ( rule__Variable__NamesAssignment_1_2_1 ) )
            {
            // InternalPascal.g:2537:1: ( ( rule__Variable__NamesAssignment_1_2_1 ) )
            // InternalPascal.g:2538:2: ( rule__Variable__NamesAssignment_1_2_1 )
            {
             before(grammarAccess.getVariableAccess().getNamesAssignment_1_2_1()); 
            // InternalPascal.g:2539:2: ( rule__Variable__NamesAssignment_1_2_1 )
            // InternalPascal.g:2539:3: rule__Variable__NamesAssignment_1_2_1
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
    // InternalPascal.g:2548:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2552:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalPascal.g:2553:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPascal.g:2560:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2564:1: ( ( ( rule__Expression__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:2565:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:2565:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            // InternalPascal.g:2566:2: ( rule__Expression__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionsAssignment_0()); 
            // InternalPascal.g:2567:2: ( rule__Expression__ExpressionsAssignment_0 )
            // InternalPascal.g:2567:3: rule__Expression__ExpressionsAssignment_0
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
    // InternalPascal.g:2575:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2579:1: ( rule__Expression__Group__1__Impl )
            // InternalPascal.g:2580:2: rule__Expression__Group__1__Impl
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
    // InternalPascal.g:2586:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2590:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalPascal.g:2591:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalPascal.g:2591:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalPascal.g:2592:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalPascal.g:2593:2: ( rule__Expression__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_EQUAL && LA22_0<=RULE_IN)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascal.g:2593:3: rule__Expression__Group_1__0
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
    // InternalPascal.g:2602:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2606:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalPascal.g:2607:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:2614:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__OperatorsAssignment_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2618:1: ( ( ( rule__Expression__OperatorsAssignment_1_0 ) ) )
            // InternalPascal.g:2619:1: ( ( rule__Expression__OperatorsAssignment_1_0 ) )
            {
            // InternalPascal.g:2619:1: ( ( rule__Expression__OperatorsAssignment_1_0 ) )
            // InternalPascal.g:2620:2: ( rule__Expression__OperatorsAssignment_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0()); 
            // InternalPascal.g:2621:2: ( rule__Expression__OperatorsAssignment_1_0 )
            // InternalPascal.g:2621:3: rule__Expression__OperatorsAssignment_1_0
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
    // InternalPascal.g:2629:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2633:1: ( rule__Expression__Group_1__1__Impl )
            // InternalPascal.g:2634:2: rule__Expression__Group_1__1__Impl
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
    // InternalPascal.g:2640:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2644:1: ( ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:2645:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:2645:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:2646:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionsAssignment_1_1()); 
            // InternalPascal.g:2647:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            // InternalPascal.g:2647:3: rule__Expression__ExpressionsAssignment_1_1
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
    // InternalPascal.g:2656:1: rule__Simple_expression__Group__0 : rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 ;
    public final void rule__Simple_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2660:1: ( rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 )
            // InternalPascal.g:2661:2: rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalPascal.g:2668:1: rule__Simple_expression__Group__0__Impl : ( ( rule__Simple_expression__TermsAssignment_0 ) ) ;
    public final void rule__Simple_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2672:1: ( ( ( rule__Simple_expression__TermsAssignment_0 ) ) )
            // InternalPascal.g:2673:1: ( ( rule__Simple_expression__TermsAssignment_0 ) )
            {
            // InternalPascal.g:2673:1: ( ( rule__Simple_expression__TermsAssignment_0 ) )
            // InternalPascal.g:2674:2: ( rule__Simple_expression__TermsAssignment_0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_0()); 
            // InternalPascal.g:2675:2: ( rule__Simple_expression__TermsAssignment_0 )
            // InternalPascal.g:2675:3: rule__Simple_expression__TermsAssignment_0
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
    // InternalPascal.g:2683:1: rule__Simple_expression__Group__1 : rule__Simple_expression__Group__1__Impl ;
    public final void rule__Simple_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2687:1: ( rule__Simple_expression__Group__1__Impl )
            // InternalPascal.g:2688:2: rule__Simple_expression__Group__1__Impl
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
    // InternalPascal.g:2694:1: rule__Simple_expression__Group__1__Impl : ( ( rule__Simple_expression__Group_1__0 )? ) ;
    public final void rule__Simple_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2698:1: ( ( ( rule__Simple_expression__Group_1__0 )? ) )
            // InternalPascal.g:2699:1: ( ( rule__Simple_expression__Group_1__0 )? )
            {
            // InternalPascal.g:2699:1: ( ( rule__Simple_expression__Group_1__0 )? )
            // InternalPascal.g:2700:2: ( rule__Simple_expression__Group_1__0 )?
            {
             before(grammarAccess.getSimple_expressionAccess().getGroup_1()); 
            // InternalPascal.g:2701:2: ( rule__Simple_expression__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_PLUS && LA23_0<=RULE_OR)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascal.g:2701:3: rule__Simple_expression__Group_1__0
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
    // InternalPascal.g:2710:1: rule__Simple_expression__Group_1__0 : rule__Simple_expression__Group_1__0__Impl rule__Simple_expression__Group_1__1 ;
    public final void rule__Simple_expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2714:1: ( rule__Simple_expression__Group_1__0__Impl rule__Simple_expression__Group_1__1 )
            // InternalPascal.g:2715:2: rule__Simple_expression__Group_1__0__Impl rule__Simple_expression__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:2722:1: rule__Simple_expression__Group_1__0__Impl : ( ( rule__Simple_expression__OperatorsAssignment_1_0 ) ) ;
    public final void rule__Simple_expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2726:1: ( ( ( rule__Simple_expression__OperatorsAssignment_1_0 ) ) )
            // InternalPascal.g:2727:1: ( ( rule__Simple_expression__OperatorsAssignment_1_0 ) )
            {
            // InternalPascal.g:2727:1: ( ( rule__Simple_expression__OperatorsAssignment_1_0 ) )
            // InternalPascal.g:2728:2: ( rule__Simple_expression__OperatorsAssignment_1_0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_1_0()); 
            // InternalPascal.g:2729:2: ( rule__Simple_expression__OperatorsAssignment_1_0 )
            // InternalPascal.g:2729:3: rule__Simple_expression__OperatorsAssignment_1_0
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
    // InternalPascal.g:2737:1: rule__Simple_expression__Group_1__1 : rule__Simple_expression__Group_1__1__Impl ;
    public final void rule__Simple_expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2741:1: ( rule__Simple_expression__Group_1__1__Impl )
            // InternalPascal.g:2742:2: rule__Simple_expression__Group_1__1__Impl
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
    // InternalPascal.g:2748:1: rule__Simple_expression__Group_1__1__Impl : ( ( rule__Simple_expression__ExpressionAssignment_1_1 ) ) ;
    public final void rule__Simple_expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2752:1: ( ( ( rule__Simple_expression__ExpressionAssignment_1_1 ) ) )
            // InternalPascal.g:2753:1: ( ( rule__Simple_expression__ExpressionAssignment_1_1 ) )
            {
            // InternalPascal.g:2753:1: ( ( rule__Simple_expression__ExpressionAssignment_1_1 ) )
            // InternalPascal.g:2754:2: ( rule__Simple_expression__ExpressionAssignment_1_1 )
            {
             before(grammarAccess.getSimple_expressionAccess().getExpressionAssignment_1_1()); 
            // InternalPascal.g:2755:2: ( rule__Simple_expression__ExpressionAssignment_1_1 )
            // InternalPascal.g:2755:3: rule__Simple_expression__ExpressionAssignment_1_1
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
    // InternalPascal.g:2764:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2768:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalPascal.g:2769:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalPascal.g:2776:1: rule__Term__Group__0__Impl : ( ( rule__Term__FactorsAssignment_0 ) ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2780:1: ( ( ( rule__Term__FactorsAssignment_0 ) ) )
            // InternalPascal.g:2781:1: ( ( rule__Term__FactorsAssignment_0 ) )
            {
            // InternalPascal.g:2781:1: ( ( rule__Term__FactorsAssignment_0 ) )
            // InternalPascal.g:2782:2: ( rule__Term__FactorsAssignment_0 )
            {
             before(grammarAccess.getTermAccess().getFactorsAssignment_0()); 
            // InternalPascal.g:2783:2: ( rule__Term__FactorsAssignment_0 )
            // InternalPascal.g:2783:3: rule__Term__FactorsAssignment_0
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
    // InternalPascal.g:2791:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2795:1: ( rule__Term__Group__1__Impl )
            // InternalPascal.g:2796:2: rule__Term__Group__1__Impl
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
    // InternalPascal.g:2802:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )? ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2806:1: ( ( ( rule__Term__Group_1__0 )? ) )
            // InternalPascal.g:2807:1: ( ( rule__Term__Group_1__0 )? )
            {
            // InternalPascal.g:2807:1: ( ( rule__Term__Group_1__0 )? )
            // InternalPascal.g:2808:2: ( rule__Term__Group_1__0 )?
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // InternalPascal.g:2809:2: ( rule__Term__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STAR && LA24_0<=RULE_AND)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPascal.g:2809:3: rule__Term__Group_1__0
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
    // InternalPascal.g:2818:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2822:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalPascal.g:2823:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:2830:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__OperatorsAssignment_1_0 ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2834:1: ( ( ( rule__Term__OperatorsAssignment_1_0 ) ) )
            // InternalPascal.g:2835:1: ( ( rule__Term__OperatorsAssignment_1_0 ) )
            {
            // InternalPascal.g:2835:1: ( ( rule__Term__OperatorsAssignment_1_0 ) )
            // InternalPascal.g:2836:2: ( rule__Term__OperatorsAssignment_1_0 )
            {
             before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0()); 
            // InternalPascal.g:2837:2: ( rule__Term__OperatorsAssignment_1_0 )
            // InternalPascal.g:2837:3: rule__Term__OperatorsAssignment_1_0
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
    // InternalPascal.g:2845:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2849:1: ( rule__Term__Group_1__1__Impl )
            // InternalPascal.g:2850:2: rule__Term__Group_1__1__Impl
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
    // InternalPascal.g:2856:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__TermsAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2860:1: ( ( ( rule__Term__TermsAssignment_1_1 ) ) )
            // InternalPascal.g:2861:1: ( ( rule__Term__TermsAssignment_1_1 ) )
            {
            // InternalPascal.g:2861:1: ( ( rule__Term__TermsAssignment_1_1 ) )
            // InternalPascal.g:2862:2: ( rule__Term__TermsAssignment_1_1 )
            {
             before(grammarAccess.getTermAccess().getTermsAssignment_1_1()); 
            // InternalPascal.g:2863:2: ( rule__Term__TermsAssignment_1_1 )
            // InternalPascal.g:2863:3: rule__Term__TermsAssignment_1_1
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
    // InternalPascal.g:2872:1: rule__Signed_factor__Group__0 : rule__Signed_factor__Group__0__Impl rule__Signed_factor__Group__1 ;
    public final void rule__Signed_factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2876:1: ( rule__Signed_factor__Group__0__Impl rule__Signed_factor__Group__1 )
            // InternalPascal.g:2877:2: rule__Signed_factor__Group__0__Impl rule__Signed_factor__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:2884:1: rule__Signed_factor__Group__0__Impl : ( ( rule__Signed_factor__Alternatives_0 )? ) ;
    public final void rule__Signed_factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2888:1: ( ( ( rule__Signed_factor__Alternatives_0 )? ) )
            // InternalPascal.g:2889:1: ( ( rule__Signed_factor__Alternatives_0 )? )
            {
            // InternalPascal.g:2889:1: ( ( rule__Signed_factor__Alternatives_0 )? )
            // InternalPascal.g:2890:2: ( rule__Signed_factor__Alternatives_0 )?
            {
             before(grammarAccess.getSigned_factorAccess().getAlternatives_0()); 
            // InternalPascal.g:2891:2: ( rule__Signed_factor__Alternatives_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_PLUS && LA25_0<=RULE_MINUS)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPascal.g:2891:3: rule__Signed_factor__Alternatives_0
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
    // InternalPascal.g:2899:1: rule__Signed_factor__Group__1 : rule__Signed_factor__Group__1__Impl ;
    public final void rule__Signed_factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2903:1: ( rule__Signed_factor__Group__1__Impl )
            // InternalPascal.g:2904:2: rule__Signed_factor__Group__1__Impl
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
    // InternalPascal.g:2910:1: rule__Signed_factor__Group__1__Impl : ( ( rule__Signed_factor__FactorsAssignment_1 ) ) ;
    public final void rule__Signed_factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2914:1: ( ( ( rule__Signed_factor__FactorsAssignment_1 ) ) )
            // InternalPascal.g:2915:1: ( ( rule__Signed_factor__FactorsAssignment_1 ) )
            {
            // InternalPascal.g:2915:1: ( ( rule__Signed_factor__FactorsAssignment_1 ) )
            // InternalPascal.g:2916:2: ( rule__Signed_factor__FactorsAssignment_1 )
            {
             before(grammarAccess.getSigned_factorAccess().getFactorsAssignment_1()); 
            // InternalPascal.g:2917:2: ( rule__Signed_factor__FactorsAssignment_1 )
            // InternalPascal.g:2917:3: rule__Signed_factor__FactorsAssignment_1
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
    // InternalPascal.g:2926:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2930:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalPascal.g:2931:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:2938:1: rule__Factor__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2942:1: ( ( '(' ) )
            // InternalPascal.g:2943:1: ( '(' )
            {
            // InternalPascal.g:2943:1: ( '(' )
            // InternalPascal.g:2944:2: '('
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
    // InternalPascal.g:2953:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2957:1: ( rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 )
            // InternalPascal.g:2958:2: rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2
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
    // InternalPascal.g:2965:1: rule__Factor__Group_1__1__Impl : ( ruleexpression ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2969:1: ( ( ruleexpression ) )
            // InternalPascal.g:2970:1: ( ruleexpression )
            {
            // InternalPascal.g:2970:1: ( ruleexpression )
            // InternalPascal.g:2971:2: ruleexpression
            {
             before(grammarAccess.getFactorAccess().getExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getExpressionParserRuleCall_1_1()); 

            }


            }

        }
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
    // InternalPascal.g:2980:1: rule__Factor__Group_1__2 : rule__Factor__Group_1__2__Impl ;
    public final void rule__Factor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2984:1: ( rule__Factor__Group_1__2__Impl )
            // InternalPascal.g:2985:2: rule__Factor__Group_1__2__Impl
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
    // InternalPascal.g:2991:1: rule__Factor__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2995:1: ( ( ')' ) )
            // InternalPascal.g:2996:1: ( ')' )
            {
            // InternalPascal.g:2996:1: ( ')' )
            // InternalPascal.g:2997:2: ')'
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
    // InternalPascal.g:3007:1: rule__Factor__Group_4__0 : rule__Factor__Group_4__0__Impl rule__Factor__Group_4__1 ;
    public final void rule__Factor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3011:1: ( rule__Factor__Group_4__0__Impl rule__Factor__Group_4__1 )
            // InternalPascal.g:3012:2: rule__Factor__Group_4__0__Impl rule__Factor__Group_4__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:3019:1: rule__Factor__Group_4__0__Impl : ( RULE_NOT ) ;
    public final void rule__Factor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3023:1: ( ( RULE_NOT ) )
            // InternalPascal.g:3024:1: ( RULE_NOT )
            {
            // InternalPascal.g:3024:1: ( RULE_NOT )
            // InternalPascal.g:3025:2: RULE_NOT
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
    // InternalPascal.g:3034:1: rule__Factor__Group_4__1 : rule__Factor__Group_4__1__Impl ;
    public final void rule__Factor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3038:1: ( rule__Factor__Group_4__1__Impl )
            // InternalPascal.g:3039:2: rule__Factor__Group_4__1__Impl
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
    // InternalPascal.g:3045:1: rule__Factor__Group_4__1__Impl : ( rulefactor ) ;
    public final void rule__Factor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3049:1: ( ( rulefactor ) )
            // InternalPascal.g:3050:1: ( rulefactor )
            {
            // InternalPascal.g:3050:1: ( rulefactor )
            // InternalPascal.g:3051:2: rulefactor
            {
             before(grammarAccess.getFactorAccess().getFactorParserRuleCall_4_1()); 
            pushFollow(FOLLOW_2);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getFactorParserRuleCall_4_1()); 

            }


            }

        }
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
    // InternalPascal.g:3061:1: rule__Set__Group_0__0 : rule__Set__Group_0__0__Impl rule__Set__Group_0__1 ;
    public final void rule__Set__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3065:1: ( rule__Set__Group_0__0__Impl rule__Set__Group_0__1 )
            // InternalPascal.g:3066:2: rule__Set__Group_0__0__Impl rule__Set__Group_0__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:3073:1: rule__Set__Group_0__0__Impl : ( '[' ) ;
    public final void rule__Set__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3077:1: ( ( '[' ) )
            // InternalPascal.g:3078:1: ( '[' )
            {
            // InternalPascal.g:3078:1: ( '[' )
            // InternalPascal.g:3079:2: '['
            {
             before(grammarAccess.getSetAccess().getLeftSquareBracketKeyword_0_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalPascal.g:3088:1: rule__Set__Group_0__1 : rule__Set__Group_0__1__Impl rule__Set__Group_0__2 ;
    public final void rule__Set__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3092:1: ( rule__Set__Group_0__1__Impl rule__Set__Group_0__2 )
            // InternalPascal.g:3093:2: rule__Set__Group_0__1__Impl rule__Set__Group_0__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalPascal.g:3100:1: rule__Set__Group_0__1__Impl : ( ( rule__Set__ElementsAssignment_0_1 ) ) ;
    public final void rule__Set__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3104:1: ( ( ( rule__Set__ElementsAssignment_0_1 ) ) )
            // InternalPascal.g:3105:1: ( ( rule__Set__ElementsAssignment_0_1 ) )
            {
            // InternalPascal.g:3105:1: ( ( rule__Set__ElementsAssignment_0_1 ) )
            // InternalPascal.g:3106:2: ( rule__Set__ElementsAssignment_0_1 )
            {
             before(grammarAccess.getSetAccess().getElementsAssignment_0_1()); 
            // InternalPascal.g:3107:2: ( rule__Set__ElementsAssignment_0_1 )
            // InternalPascal.g:3107:3: rule__Set__ElementsAssignment_0_1
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
    // InternalPascal.g:3115:1: rule__Set__Group_0__2 : rule__Set__Group_0__2__Impl ;
    public final void rule__Set__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3119:1: ( rule__Set__Group_0__2__Impl )
            // InternalPascal.g:3120:2: rule__Set__Group_0__2__Impl
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
    // InternalPascal.g:3126:1: rule__Set__Group_0__2__Impl : ( ']' ) ;
    public final void rule__Set__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3130:1: ( ( ']' ) )
            // InternalPascal.g:3131:1: ( ']' )
            {
            // InternalPascal.g:3131:1: ( ']' )
            // InternalPascal.g:3132:2: ']'
            {
             before(grammarAccess.getSetAccess().getRightSquareBracketKeyword_0_2()); 
            match(input,50,FOLLOW_2); 
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
    // InternalPascal.g:3142:1: rule__Set__Group_1__0 : rule__Set__Group_1__0__Impl rule__Set__Group_1__1 ;
    public final void rule__Set__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3146:1: ( rule__Set__Group_1__0__Impl rule__Set__Group_1__1 )
            // InternalPascal.g:3147:2: rule__Set__Group_1__0__Impl rule__Set__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:3154:1: rule__Set__Group_1__0__Impl : ( '(.' ) ;
    public final void rule__Set__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3158:1: ( ( '(.' ) )
            // InternalPascal.g:3159:1: ( '(.' )
            {
            // InternalPascal.g:3159:1: ( '(.' )
            // InternalPascal.g:3160:2: '(.'
            {
             before(grammarAccess.getSetAccess().getLeftParenthesisFullStopKeyword_1_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalPascal.g:3169:1: rule__Set__Group_1__1 : rule__Set__Group_1__1__Impl rule__Set__Group_1__2 ;
    public final void rule__Set__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3173:1: ( rule__Set__Group_1__1__Impl rule__Set__Group_1__2 )
            // InternalPascal.g:3174:2: rule__Set__Group_1__1__Impl rule__Set__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalPascal.g:3181:1: rule__Set__Group_1__1__Impl : ( ( rule__Set__ElementsAssignment_1_1 ) ) ;
    public final void rule__Set__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3185:1: ( ( ( rule__Set__ElementsAssignment_1_1 ) ) )
            // InternalPascal.g:3186:1: ( ( rule__Set__ElementsAssignment_1_1 ) )
            {
            // InternalPascal.g:3186:1: ( ( rule__Set__ElementsAssignment_1_1 ) )
            // InternalPascal.g:3187:2: ( rule__Set__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getSetAccess().getElementsAssignment_1_1()); 
            // InternalPascal.g:3188:2: ( rule__Set__ElementsAssignment_1_1 )
            // InternalPascal.g:3188:3: rule__Set__ElementsAssignment_1_1
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
    // InternalPascal.g:3196:1: rule__Set__Group_1__2 : rule__Set__Group_1__2__Impl ;
    public final void rule__Set__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3200:1: ( rule__Set__Group_1__2__Impl )
            // InternalPascal.g:3201:2: rule__Set__Group_1__2__Impl
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
    // InternalPascal.g:3207:1: rule__Set__Group_1__2__Impl : ( '.)' ) ;
    public final void rule__Set__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3211:1: ( ( '.)' ) )
            // InternalPascal.g:3212:1: ( '.)' )
            {
            // InternalPascal.g:3212:1: ( '.)' )
            // InternalPascal.g:3213:2: '.)'
            {
             before(grammarAccess.getSetAccess().getFullStopRightParenthesisKeyword_1_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalPascal.g:3223:1: rule__ElementList__Group__0 : rule__ElementList__Group__0__Impl rule__ElementList__Group__1 ;
    public final void rule__ElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3227:1: ( rule__ElementList__Group__0__Impl rule__ElementList__Group__1 )
            // InternalPascal.g:3228:2: rule__ElementList__Group__0__Impl rule__ElementList__Group__1
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
    // InternalPascal.g:3235:1: rule__ElementList__Group__0__Impl : ( ( rule__ElementList__ElementsAssignment_0 ) ) ;
    public final void rule__ElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3239:1: ( ( ( rule__ElementList__ElementsAssignment_0 ) ) )
            // InternalPascal.g:3240:1: ( ( rule__ElementList__ElementsAssignment_0 ) )
            {
            // InternalPascal.g:3240:1: ( ( rule__ElementList__ElementsAssignment_0 ) )
            // InternalPascal.g:3241:2: ( rule__ElementList__ElementsAssignment_0 )
            {
             before(grammarAccess.getElementListAccess().getElementsAssignment_0()); 
            // InternalPascal.g:3242:2: ( rule__ElementList__ElementsAssignment_0 )
            // InternalPascal.g:3242:3: rule__ElementList__ElementsAssignment_0
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
    // InternalPascal.g:3250:1: rule__ElementList__Group__1 : rule__ElementList__Group__1__Impl ;
    public final void rule__ElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3254:1: ( rule__ElementList__Group__1__Impl )
            // InternalPascal.g:3255:2: rule__ElementList__Group__1__Impl
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
    // InternalPascal.g:3261:1: rule__ElementList__Group__1__Impl : ( ( rule__ElementList__Group_1__0 )* ) ;
    public final void rule__ElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3265:1: ( ( ( rule__ElementList__Group_1__0 )* ) )
            // InternalPascal.g:3266:1: ( ( rule__ElementList__Group_1__0 )* )
            {
            // InternalPascal.g:3266:1: ( ( rule__ElementList__Group_1__0 )* )
            // InternalPascal.g:3267:2: ( rule__ElementList__Group_1__0 )*
            {
             before(grammarAccess.getElementListAccess().getGroup_1()); 
            // InternalPascal.g:3268:2: ( rule__ElementList__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==44) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPascal.g:3268:3: rule__ElementList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ElementList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalPascal.g:3277:1: rule__ElementList__Group_1__0 : rule__ElementList__Group_1__0__Impl rule__ElementList__Group_1__1 ;
    public final void rule__ElementList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3281:1: ( rule__ElementList__Group_1__0__Impl rule__ElementList__Group_1__1 )
            // InternalPascal.g:3282:2: rule__ElementList__Group_1__0__Impl rule__ElementList__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:3289:1: rule__ElementList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ElementList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3293:1: ( ( ',' ) )
            // InternalPascal.g:3294:1: ( ',' )
            {
            // InternalPascal.g:3294:1: ( ',' )
            // InternalPascal.g:3295:2: ','
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
    // InternalPascal.g:3304:1: rule__ElementList__Group_1__1 : rule__ElementList__Group_1__1__Impl ;
    public final void rule__ElementList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3308:1: ( rule__ElementList__Group_1__1__Impl )
            // InternalPascal.g:3309:2: rule__ElementList__Group_1__1__Impl
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
    // InternalPascal.g:3315:1: rule__ElementList__Group_1__1__Impl : ( ( rule__ElementList__ElementsAssignment_1_1 ) ) ;
    public final void rule__ElementList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3319:1: ( ( ( rule__ElementList__ElementsAssignment_1_1 ) ) )
            // InternalPascal.g:3320:1: ( ( rule__ElementList__ElementsAssignment_1_1 ) )
            {
            // InternalPascal.g:3320:1: ( ( rule__ElementList__ElementsAssignment_1_1 ) )
            // InternalPascal.g:3321:2: ( rule__ElementList__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getElementListAccess().getElementsAssignment_1_1()); 
            // InternalPascal.g:3322:2: ( rule__ElementList__ElementsAssignment_1_1 )
            // InternalPascal.g:3322:3: rule__ElementList__ElementsAssignment_1_1
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
    // InternalPascal.g:3331:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3335:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalPascal.g:3336:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalPascal.g:3343:1: rule__Element__Group__0__Impl : ( ( rule__Element__ExpressionsAssignment_0 ) ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3347:1: ( ( ( rule__Element__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:3348:1: ( ( rule__Element__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:3348:1: ( ( rule__Element__ExpressionsAssignment_0 ) )
            // InternalPascal.g:3349:2: ( rule__Element__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getElementAccess().getExpressionsAssignment_0()); 
            // InternalPascal.g:3350:2: ( rule__Element__ExpressionsAssignment_0 )
            // InternalPascal.g:3350:3: rule__Element__ExpressionsAssignment_0
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
    // InternalPascal.g:3358:1: rule__Element__Group__1 : rule__Element__Group__1__Impl ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3362:1: ( rule__Element__Group__1__Impl )
            // InternalPascal.g:3363:2: rule__Element__Group__1__Impl
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
    // InternalPascal.g:3369:1: rule__Element__Group__1__Impl : ( ( rule__Element__Group_1__0 )? ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3373:1: ( ( ( rule__Element__Group_1__0 )? ) )
            // InternalPascal.g:3374:1: ( ( rule__Element__Group_1__0 )? )
            {
            // InternalPascal.g:3374:1: ( ( rule__Element__Group_1__0 )? )
            // InternalPascal.g:3375:2: ( rule__Element__Group_1__0 )?
            {
             before(grammarAccess.getElementAccess().getGroup_1()); 
            // InternalPascal.g:3376:2: ( rule__Element__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_DOTDOT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPascal.g:3376:3: rule__Element__Group_1__0
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
    // InternalPascal.g:3385:1: rule__Element__Group_1__0 : rule__Element__Group_1__0__Impl rule__Element__Group_1__1 ;
    public final void rule__Element__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3389:1: ( rule__Element__Group_1__0__Impl rule__Element__Group_1__1 )
            // InternalPascal.g:3390:2: rule__Element__Group_1__0__Impl rule__Element__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:3397:1: rule__Element__Group_1__0__Impl : ( ( rule__Element__DotdotAssignment_1_0 ) ) ;
    public final void rule__Element__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3401:1: ( ( ( rule__Element__DotdotAssignment_1_0 ) ) )
            // InternalPascal.g:3402:1: ( ( rule__Element__DotdotAssignment_1_0 ) )
            {
            // InternalPascal.g:3402:1: ( ( rule__Element__DotdotAssignment_1_0 ) )
            // InternalPascal.g:3403:2: ( rule__Element__DotdotAssignment_1_0 )
            {
             before(grammarAccess.getElementAccess().getDotdotAssignment_1_0()); 
            // InternalPascal.g:3404:2: ( rule__Element__DotdotAssignment_1_0 )
            // InternalPascal.g:3404:3: rule__Element__DotdotAssignment_1_0
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
    // InternalPascal.g:3412:1: rule__Element__Group_1__1 : rule__Element__Group_1__1__Impl ;
    public final void rule__Element__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3416:1: ( rule__Element__Group_1__1__Impl )
            // InternalPascal.g:3417:2: rule__Element__Group_1__1__Impl
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
    // InternalPascal.g:3423:1: rule__Element__Group_1__1__Impl : ( ( rule__Element__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Element__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3427:1: ( ( ( rule__Element__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:3428:1: ( ( rule__Element__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:3428:1: ( ( rule__Element__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:3429:2: ( rule__Element__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getElementAccess().getExpressionsAssignment_1_1()); 
            // InternalPascal.g:3430:2: ( rule__Element__ExpressionsAssignment_1_1 )
            // InternalPascal.g:3430:3: rule__Element__ExpressionsAssignment_1_1
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


    // $ANTLR start "rule__Constant_chr__Group__0"
    // InternalPascal.g:3439:1: rule__Constant_chr__Group__0 : rule__Constant_chr__Group__0__Impl rule__Constant_chr__Group__1 ;
    public final void rule__Constant_chr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3443:1: ( rule__Constant_chr__Group__0__Impl rule__Constant_chr__Group__1 )
            // InternalPascal.g:3444:2: rule__Constant_chr__Group__0__Impl rule__Constant_chr__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalPascal.g:3451:1: rule__Constant_chr__Group__0__Impl : ( 'chr' ) ;
    public final void rule__Constant_chr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3455:1: ( ( 'chr' ) )
            // InternalPascal.g:3456:1: ( 'chr' )
            {
            // InternalPascal.g:3456:1: ( 'chr' )
            // InternalPascal.g:3457:2: 'chr'
            {
             before(grammarAccess.getConstant_chrAccess().getChrKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalPascal.g:3466:1: rule__Constant_chr__Group__1 : rule__Constant_chr__Group__1__Impl rule__Constant_chr__Group__2 ;
    public final void rule__Constant_chr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3470:1: ( rule__Constant_chr__Group__1__Impl rule__Constant_chr__Group__2 )
            // InternalPascal.g:3471:2: rule__Constant_chr__Group__1__Impl rule__Constant_chr__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalPascal.g:3478:1: rule__Constant_chr__Group__1__Impl : ( '(' ) ;
    public final void rule__Constant_chr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3482:1: ( ( '(' ) )
            // InternalPascal.g:3483:1: ( '(' )
            {
            // InternalPascal.g:3483:1: ( '(' )
            // InternalPascal.g:3484:2: '('
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
    // InternalPascal.g:3493:1: rule__Constant_chr__Group__2 : rule__Constant_chr__Group__2__Impl rule__Constant_chr__Group__3 ;
    public final void rule__Constant_chr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3497:1: ( rule__Constant_chr__Group__2__Impl rule__Constant_chr__Group__3 )
            // InternalPascal.g:3498:2: rule__Constant_chr__Group__2__Impl rule__Constant_chr__Group__3
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
    // InternalPascal.g:3505:1: rule__Constant_chr__Group__2__Impl : ( ( rule__Constant_chr__NumbersAssignment_2 ) ) ;
    public final void rule__Constant_chr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3509:1: ( ( ( rule__Constant_chr__NumbersAssignment_2 ) ) )
            // InternalPascal.g:3510:1: ( ( rule__Constant_chr__NumbersAssignment_2 ) )
            {
            // InternalPascal.g:3510:1: ( ( rule__Constant_chr__NumbersAssignment_2 ) )
            // InternalPascal.g:3511:2: ( rule__Constant_chr__NumbersAssignment_2 )
            {
             before(grammarAccess.getConstant_chrAccess().getNumbersAssignment_2()); 
            // InternalPascal.g:3512:2: ( rule__Constant_chr__NumbersAssignment_2 )
            // InternalPascal.g:3512:3: rule__Constant_chr__NumbersAssignment_2
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
    // InternalPascal.g:3520:1: rule__Constant_chr__Group__3 : rule__Constant_chr__Group__3__Impl ;
    public final void rule__Constant_chr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3524:1: ( rule__Constant_chr__Group__3__Impl )
            // InternalPascal.g:3525:2: rule__Constant_chr__Group__3__Impl
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
    // InternalPascal.g:3531:1: rule__Constant_chr__Group__3__Impl : ( ')' ) ;
    public final void rule__Constant_chr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3535:1: ( ( ')' ) )
            // InternalPascal.g:3536:1: ( ')' )
            {
            // InternalPascal.g:3536:1: ( ')' )
            // InternalPascal.g:3537:2: ')'
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
    // InternalPascal.g:3547:1: rule__Pascal__ProgramAssignment : ( ruleprogram ) ;
    public final void rule__Pascal__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3551:1: ( ( ruleprogram ) )
            // InternalPascal.g:3552:2: ( ruleprogram )
            {
            // InternalPascal.g:3552:2: ( ruleprogram )
            // InternalPascal.g:3553:3: ruleprogram
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
    // InternalPascal.g:3562:1: rule__Program__HeadingAssignment_0 : ( ruleprogram_heading_block ) ;
    public final void rule__Program__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3566:1: ( ( ruleprogram_heading_block ) )
            // InternalPascal.g:3567:2: ( ruleprogram_heading_block )
            {
            // InternalPascal.g:3567:2: ( ruleprogram_heading_block )
            // InternalPascal.g:3568:3: ruleprogram_heading_block
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
    // InternalPascal.g:3577:1: rule__Program__BlockAssignment_1 : ( ruleblock ) ;
    public final void rule__Program__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3581:1: ( ( ruleblock ) )
            // InternalPascal.g:3582:2: ( ruleblock )
            {
            // InternalPascal.g:3582:2: ( ruleblock )
            // InternalPascal.g:3583:3: ruleblock
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
    // InternalPascal.g:3592:1: rule__Program_heading_block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program_heading_block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3596:1: ( ( RULE_ID ) )
            // InternalPascal.g:3597:2: ( RULE_ID )
            {
            // InternalPascal.g:3597:2: ( RULE_ID )
            // InternalPascal.g:3598:3: RULE_ID
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
    // InternalPascal.g:3607:1: rule__Program_heading_block__IdentifiersAssignment_2_1 : ( ruleidentifier_list ) ;
    public final void rule__Program_heading_block__IdentifiersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3611:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:3612:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:3612:2: ( ruleidentifier_list )
            // InternalPascal.g:3613:3: ruleidentifier_list
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
    // InternalPascal.g:3622:1: rule__Identifier_list__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3626:1: ( ( RULE_ID ) )
            // InternalPascal.g:3627:2: ( RULE_ID )
            {
            // InternalPascal.g:3627:2: ( RULE_ID )
            // InternalPascal.g:3628:3: RULE_ID
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
    // InternalPascal.g:3637:1: rule__Identifier_list__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3641:1: ( ( RULE_ID ) )
            // InternalPascal.g:3642:2: ( RULE_ID )
            {
            // InternalPascal.g:3642:2: ( RULE_ID )
            // InternalPascal.g:3643:3: RULE_ID
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


    // $ANTLR start "rule__Block__StatementAssignment"
    // InternalPascal.g:3652:1: rule__Block__StatementAssignment : ( rulecompound_statement ) ;
    public final void rule__Block__StatementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3656:1: ( ( rulecompound_statement ) )
            // InternalPascal.g:3657:2: ( rulecompound_statement )
            {
            // InternalPascal.g:3657:2: ( rulecompound_statement )
            // InternalPascal.g:3658:3: rulecompound_statement
            {
             before(grammarAccess.getBlockAccess().getStatementCompound_statementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulecompound_statement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementCompound_statementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StatementAssignment"


    // $ANTLR start "rule__Compound_statement__SequenceAssignment_1"
    // InternalPascal.g:3667:1: rule__Compound_statement__SequenceAssignment_1 : ( rulestatements ) ;
    public final void rule__Compound_statement__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3671:1: ( ( rulestatements ) )
            // InternalPascal.g:3672:2: ( rulestatements )
            {
            // InternalPascal.g:3672:2: ( rulestatements )
            // InternalPascal.g:3673:3: rulestatements
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
    // InternalPascal.g:3682:1: rule__Statements__StatementsAssignment_0 : ( rulestatement ) ;
    public final void rule__Statements__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3686:1: ( ( rulestatement ) )
            // InternalPascal.g:3687:2: ( rulestatement )
            {
            // InternalPascal.g:3687:2: ( rulestatement )
            // InternalPascal.g:3688:3: rulestatement
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
    // InternalPascal.g:3697:1: rule__Statements__StatementsAssignment_1_1 : ( rulestatement ) ;
    public final void rule__Statements__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3701:1: ( ( rulestatement ) )
            // InternalPascal.g:3702:2: ( rulestatement )
            {
            // InternalPascal.g:3702:2: ( rulestatement )
            // InternalPascal.g:3703:3: rulestatement
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
    // InternalPascal.g:3712:1: rule__Statement__LabelAssignment_0_0 : ( rulelabel ) ;
    public final void rule__Statement__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3716:1: ( ( rulelabel ) )
            // InternalPascal.g:3717:2: ( rulelabel )
            {
            // InternalPascal.g:3717:2: ( rulelabel )
            // InternalPascal.g:3718:3: rulelabel
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
    // InternalPascal.g:3727:1: rule__Statement__StatementAssignment_0_2 : ( ruleunlabelled_statement ) ;
    public final void rule__Statement__StatementAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3731:1: ( ( ruleunlabelled_statement ) )
            // InternalPascal.g:3732:2: ( ruleunlabelled_statement )
            {
            // InternalPascal.g:3732:2: ( ruleunlabelled_statement )
            // InternalPascal.g:3733:3: ruleunlabelled_statement
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
    // InternalPascal.g:3742:1: rule__Statement__StatementAssignment_1_1 : ( ruleunlabelled_statement ) ;
    public final void rule__Statement__StatementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3746:1: ( ( ruleunlabelled_statement ) )
            // InternalPascal.g:3747:2: ( ruleunlabelled_statement )
            {
            // InternalPascal.g:3747:2: ( ruleunlabelled_statement )
            // InternalPascal.g:3748:3: ruleunlabelled_statement
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
    // InternalPascal.g:3757:1: rule__Unlabelled_statement__SimpleAssignment_0 : ( rulesimple_statement ) ;
    public final void rule__Unlabelled_statement__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3761:1: ( ( rulesimple_statement ) )
            // InternalPascal.g:3762:2: ( rulesimple_statement )
            {
            // InternalPascal.g:3762:2: ( rulesimple_statement )
            // InternalPascal.g:3763:3: rulesimple_statement
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
    // InternalPascal.g:3772:1: rule__Unlabelled_statement__StructuredAssignment_1 : ( rulestructured_statement ) ;
    public final void rule__Unlabelled_statement__StructuredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3776:1: ( ( rulestructured_statement ) )
            // InternalPascal.g:3777:2: ( rulestructured_statement )
            {
            // InternalPascal.g:3777:2: ( rulestructured_statement )
            // InternalPascal.g:3778:3: rulestructured_statement
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
    // InternalPascal.g:3787:1: rule__Label__NumberAssignment : ( ruleunsigned_integer ) ;
    public final void rule__Label__NumberAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3791:1: ( ( ruleunsigned_integer ) )
            // InternalPascal.g:3792:2: ( ruleunsigned_integer )
            {
            // InternalPascal.g:3792:2: ( ruleunsigned_integer )
            // InternalPascal.g:3793:3: ruleunsigned_integer
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
    // InternalPascal.g:3802:1: rule__Simple_statement__AssignmentAssignment_0 : ( ruleassignment_statement ) ;
    public final void rule__Simple_statement__AssignmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3806:1: ( ( ruleassignment_statement ) )
            // InternalPascal.g:3807:2: ( ruleassignment_statement )
            {
            // InternalPascal.g:3807:2: ( ruleassignment_statement )
            // InternalPascal.g:3808:3: ruleassignment_statement
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
    // InternalPascal.g:3817:1: rule__Simple_statement__ProcedureAssignment_1 : ( ruleprocedure_statement ) ;
    public final void rule__Simple_statement__ProcedureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3821:1: ( ( ruleprocedure_statement ) )
            // InternalPascal.g:3822:2: ( ruleprocedure_statement )
            {
            // InternalPascal.g:3822:2: ( ruleprocedure_statement )
            // InternalPascal.g:3823:3: ruleprocedure_statement
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
    // InternalPascal.g:3832:1: rule__Simple_statement__GotoAssignment_2 : ( rulegoto_statement ) ;
    public final void rule__Simple_statement__GotoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3836:1: ( ( rulegoto_statement ) )
            // InternalPascal.g:3837:2: ( rulegoto_statement )
            {
            // InternalPascal.g:3837:2: ( rulegoto_statement )
            // InternalPascal.g:3838:3: rulegoto_statement
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
    // InternalPascal.g:3847:1: rule__Assignment_statement__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Assignment_statement__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3851:1: ( ( rulevariable ) )
            // InternalPascal.g:3852:2: ( rulevariable )
            {
            // InternalPascal.g:3852:2: ( rulevariable )
            // InternalPascal.g:3853:3: rulevariable
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
    // InternalPascal.g:3862:1: rule__Assignment_statement__ExpressionAssignment_2 : ( ruleexpression ) ;
    public final void rule__Assignment_statement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3866:1: ( ( ruleexpression ) )
            // InternalPascal.g:3867:2: ( ruleexpression )
            {
            // InternalPascal.g:3867:2: ( ruleexpression )
            // InternalPascal.g:3868:3: ruleexpression
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
    // InternalPascal.g:3877:1: rule__Variable__NamesAssignment_0_0_1 : ( RULE_ID ) ;
    public final void rule__Variable__NamesAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3881:1: ( ( RULE_ID ) )
            // InternalPascal.g:3882:2: ( RULE_ID )
            {
            // InternalPascal.g:3882:2: ( RULE_ID )
            // InternalPascal.g:3883:3: RULE_ID
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
    // InternalPascal.g:3892:1: rule__Variable__NamesAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Variable__NamesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3896:1: ( ( RULE_ID ) )
            // InternalPascal.g:3897:2: ( RULE_ID )
            {
            // InternalPascal.g:3897:2: ( RULE_ID )
            // InternalPascal.g:3898:3: RULE_ID
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
    // InternalPascal.g:3907:1: rule__Variable__ExpressionAssignment_1_0_1 : ( ruleexpression ) ;
    public final void rule__Variable__ExpressionAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3911:1: ( ( ruleexpression ) )
            // InternalPascal.g:3912:2: ( ruleexpression )
            {
            // InternalPascal.g:3912:2: ( ruleexpression )
            // InternalPascal.g:3913:3: ruleexpression
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
    // InternalPascal.g:3922:1: rule__Variable__ExpressionAssignment_1_0_2_1 : ( ruleexpression ) ;
    public final void rule__Variable__ExpressionAssignment_1_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3926:1: ( ( ruleexpression ) )
            // InternalPascal.g:3927:2: ( ruleexpression )
            {
            // InternalPascal.g:3927:2: ( ruleexpression )
            // InternalPascal.g:3928:3: ruleexpression
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
    // InternalPascal.g:3937:1: rule__Variable__ExpressionAssignment_1_1_1 : ( ruleexpression ) ;
    public final void rule__Variable__ExpressionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3941:1: ( ( ruleexpression ) )
            // InternalPascal.g:3942:2: ( ruleexpression )
            {
            // InternalPascal.g:3942:2: ( ruleexpression )
            // InternalPascal.g:3943:3: ruleexpression
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
    // InternalPascal.g:3952:1: rule__Variable__ExpressionAssignment_1_1_2_1 : ( ruleexpression ) ;
    public final void rule__Variable__ExpressionAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3956:1: ( ( ruleexpression ) )
            // InternalPascal.g:3957:2: ( ruleexpression )
            {
            // InternalPascal.g:3957:2: ( ruleexpression )
            // InternalPascal.g:3958:3: ruleexpression
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
    // InternalPascal.g:3967:1: rule__Variable__NamesAssignment_1_2_1 : ( RULE_ID ) ;
    public final void rule__Variable__NamesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3971:1: ( ( RULE_ID ) )
            // InternalPascal.g:3972:2: ( RULE_ID )
            {
            // InternalPascal.g:3972:2: ( RULE_ID )
            // InternalPascal.g:3973:3: RULE_ID
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
    // InternalPascal.g:3982:1: rule__Expression__ExpressionsAssignment_0 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3986:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:3987:2: ( rulesimple_expression )
            {
            // InternalPascal.g:3987:2: ( rulesimple_expression )
            // InternalPascal.g:3988:3: rulesimple_expression
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
    // InternalPascal.g:3997:1: rule__Expression__OperatorsAssignment_1_0 : ( rulerelational_operator ) ;
    public final void rule__Expression__OperatorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4001:1: ( ( rulerelational_operator ) )
            // InternalPascal.g:4002:2: ( rulerelational_operator )
            {
            // InternalPascal.g:4002:2: ( rulerelational_operator )
            // InternalPascal.g:4003:3: rulerelational_operator
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
    // InternalPascal.g:4012:1: rule__Expression__ExpressionsAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__Expression__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4016:1: ( ( ruleexpression ) )
            // InternalPascal.g:4017:2: ( ruleexpression )
            {
            // InternalPascal.g:4017:2: ( ruleexpression )
            // InternalPascal.g:4018:3: ruleexpression
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
    // InternalPascal.g:4027:1: rule__Simple_expression__TermsAssignment_0 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4031:1: ( ( ruleterm ) )
            // InternalPascal.g:4032:2: ( ruleterm )
            {
            // InternalPascal.g:4032:2: ( ruleterm )
            // InternalPascal.g:4033:3: ruleterm
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
    // InternalPascal.g:4042:1: rule__Simple_expression__OperatorsAssignment_1_0 : ( ruleadditive_operator ) ;
    public final void rule__Simple_expression__OperatorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4046:1: ( ( ruleadditive_operator ) )
            // InternalPascal.g:4047:2: ( ruleadditive_operator )
            {
            // InternalPascal.g:4047:2: ( ruleadditive_operator )
            // InternalPascal.g:4048:3: ruleadditive_operator
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
    // InternalPascal.g:4057:1: rule__Simple_expression__ExpressionAssignment_1_1 : ( rulesimple_expression ) ;
    public final void rule__Simple_expression__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4061:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:4062:2: ( rulesimple_expression )
            {
            // InternalPascal.g:4062:2: ( rulesimple_expression )
            // InternalPascal.g:4063:3: rulesimple_expression
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
    // InternalPascal.g:4072:1: rule__Term__FactorsAssignment_0 : ( rulesigned_factor ) ;
    public final void rule__Term__FactorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4076:1: ( ( rulesigned_factor ) )
            // InternalPascal.g:4077:2: ( rulesigned_factor )
            {
            // InternalPascal.g:4077:2: ( rulesigned_factor )
            // InternalPascal.g:4078:3: rulesigned_factor
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
    // InternalPascal.g:4087:1: rule__Term__OperatorsAssignment_1_0 : ( rulemultiplicative_operator ) ;
    public final void rule__Term__OperatorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4091:1: ( ( rulemultiplicative_operator ) )
            // InternalPascal.g:4092:2: ( rulemultiplicative_operator )
            {
            // InternalPascal.g:4092:2: ( rulemultiplicative_operator )
            // InternalPascal.g:4093:3: rulemultiplicative_operator
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
    // InternalPascal.g:4102:1: rule__Term__TermsAssignment_1_1 : ( ruleterm ) ;
    public final void rule__Term__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4106:1: ( ( ruleterm ) )
            // InternalPascal.g:4107:2: ( ruleterm )
            {
            // InternalPascal.g:4107:2: ( ruleterm )
            // InternalPascal.g:4108:3: ruleterm
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
    // InternalPascal.g:4117:1: rule__Signed_factor__OperatorsAssignment_0_0 : ( RULE_PLUS ) ;
    public final void rule__Signed_factor__OperatorsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4121:1: ( ( RULE_PLUS ) )
            // InternalPascal.g:4122:2: ( RULE_PLUS )
            {
            // InternalPascal.g:4122:2: ( RULE_PLUS )
            // InternalPascal.g:4123:3: RULE_PLUS
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
    // InternalPascal.g:4132:1: rule__Signed_factor__OperatorsAssignment_0_1 : ( RULE_MINUS ) ;
    public final void rule__Signed_factor__OperatorsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4136:1: ( ( RULE_MINUS ) )
            // InternalPascal.g:4137:2: ( RULE_MINUS )
            {
            // InternalPascal.g:4137:2: ( RULE_MINUS )
            // InternalPascal.g:4138:3: RULE_MINUS
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
    // InternalPascal.g:4147:1: rule__Signed_factor__FactorsAssignment_1 : ( rulefactor ) ;
    public final void rule__Signed_factor__FactorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4151:1: ( ( rulefactor ) )
            // InternalPascal.g:4152:2: ( rulefactor )
            {
            // InternalPascal.g:4152:2: ( rulefactor )
            // InternalPascal.g:4153:3: rulefactor
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
    // InternalPascal.g:4162:1: rule__Factor__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Factor__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4166:1: ( ( rulevariable ) )
            // InternalPascal.g:4167:2: ( rulevariable )
            {
            // InternalPascal.g:4167:2: ( rulevariable )
            // InternalPascal.g:4168:3: rulevariable
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


    // $ANTLR start "rule__Set__ElementsAssignment_0_1"
    // InternalPascal.g:4177:1: rule__Set__ElementsAssignment_0_1 : ( ruleelementList ) ;
    public final void rule__Set__ElementsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4181:1: ( ( ruleelementList ) )
            // InternalPascal.g:4182:2: ( ruleelementList )
            {
            // InternalPascal.g:4182:2: ( ruleelementList )
            // InternalPascal.g:4183:3: ruleelementList
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
    // InternalPascal.g:4192:1: rule__Set__ElementsAssignment_1_1 : ( ruleelementList ) ;
    public final void rule__Set__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4196:1: ( ( ruleelementList ) )
            // InternalPascal.g:4197:2: ( ruleelementList )
            {
            // InternalPascal.g:4197:2: ( ruleelementList )
            // InternalPascal.g:4198:3: ruleelementList
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
    // InternalPascal.g:4207:1: rule__ElementList__ElementsAssignment_0 : ( ruleelement ) ;
    public final void rule__ElementList__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4211:1: ( ( ruleelement ) )
            // InternalPascal.g:4212:2: ( ruleelement )
            {
            // InternalPascal.g:4212:2: ( ruleelement )
            // InternalPascal.g:4213:3: ruleelement
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
    // InternalPascal.g:4222:1: rule__ElementList__ElementsAssignment_1_1 : ( ruleelement ) ;
    public final void rule__ElementList__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4226:1: ( ( ruleelement ) )
            // InternalPascal.g:4227:2: ( ruleelement )
            {
            // InternalPascal.g:4227:2: ( ruleelement )
            // InternalPascal.g:4228:3: ruleelement
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
    // InternalPascal.g:4237:1: rule__Element__ExpressionsAssignment_0 : ( ruleexpression ) ;
    public final void rule__Element__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4241:1: ( ( ruleexpression ) )
            // InternalPascal.g:4242:2: ( ruleexpression )
            {
            // InternalPascal.g:4242:2: ( ruleexpression )
            // InternalPascal.g:4243:3: ruleexpression
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
    // InternalPascal.g:4252:1: rule__Element__DotdotAssignment_1_0 : ( RULE_DOTDOT ) ;
    public final void rule__Element__DotdotAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4256:1: ( ( RULE_DOTDOT ) )
            // InternalPascal.g:4257:2: ( RULE_DOTDOT )
            {
            // InternalPascal.g:4257:2: ( RULE_DOTDOT )
            // InternalPascal.g:4258:3: RULE_DOTDOT
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
    // InternalPascal.g:4267:1: rule__Element__ExpressionsAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__Element__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4271:1: ( ( ruleexpression ) )
            // InternalPascal.g:4272:2: ( ruleexpression )
            {
            // InternalPascal.g:4272:2: ( ruleexpression )
            // InternalPascal.g:4273:3: ruleexpression
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


    // $ANTLR start "rule__Unsigned_constant__NumberAssignment_0"
    // InternalPascal.g:4282:1: rule__Unsigned_constant__NumberAssignment_0 : ( ruleunsigned_number ) ;
    public final void rule__Unsigned_constant__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4286:1: ( ( ruleunsigned_number ) )
            // InternalPascal.g:4287:2: ( ruleunsigned_number )
            {
            // InternalPascal.g:4287:2: ( ruleunsigned_number )
            // InternalPascal.g:4288:3: ruleunsigned_number
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
    // InternalPascal.g:4297:1: rule__Unsigned_constant__CharAssignment_1 : ( ruleconstant_chr ) ;
    public final void rule__Unsigned_constant__CharAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4301:1: ( ( ruleconstant_chr ) )
            // InternalPascal.g:4302:2: ( ruleconstant_chr )
            {
            // InternalPascal.g:4302:2: ( ruleconstant_chr )
            // InternalPascal.g:4303:3: ruleconstant_chr
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
    // InternalPascal.g:4312:1: rule__Unsigned_constant__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Unsigned_constant__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4316:1: ( ( RULE_STRING ) )
            // InternalPascal.g:4317:2: ( RULE_STRING )
            {
            // InternalPascal.g:4317:2: ( RULE_STRING )
            // InternalPascal.g:4318:3: RULE_STRING
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
    // InternalPascal.g:4327:1: rule__Unsigned_constant__NilAssignment_3 : ( RULE_NIL ) ;
    public final void rule__Unsigned_constant__NilAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4331:1: ( ( RULE_NIL ) )
            // InternalPascal.g:4332:2: ( RULE_NIL )
            {
            // InternalPascal.g:4332:2: ( RULE_NIL )
            // InternalPascal.g:4333:3: RULE_NIL
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
    // InternalPascal.g:4342:1: rule__Unsigned_number__NumbersAssignment_0 : ( ruleunsigned_integer ) ;
    public final void rule__Unsigned_number__NumbersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4346:1: ( ( ruleunsigned_integer ) )
            // InternalPascal.g:4347:2: ( ruleunsigned_integer )
            {
            // InternalPascal.g:4347:2: ( ruleunsigned_integer )
            // InternalPascal.g:4348:3: ruleunsigned_integer
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
    // InternalPascal.g:4357:1: rule__Unsigned_number__NumbersAssignment_1 : ( ruleunsigned_real ) ;
    public final void rule__Unsigned_number__NumbersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4361:1: ( ( ruleunsigned_real ) )
            // InternalPascal.g:4362:2: ( ruleunsigned_real )
            {
            // InternalPascal.g:4362:2: ( ruleunsigned_real )
            // InternalPascal.g:4363:3: ruleunsigned_real
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
    // InternalPascal.g:4372:1: rule__Constant_chr__NumbersAssignment_2 : ( ruleunsigned_integer ) ;
    public final void rule__Constant_chr__NumbersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4376:1: ( ( ruleunsigned_integer ) )
            // InternalPascal.g:4377:2: ( ruleunsigned_integer )
            {
            // InternalPascal.g:4377:2: ( ruleunsigned_integer )
            // InternalPascal.g:4378:3: ruleunsigned_integer
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001003802000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001003802000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x002B04001B6000F0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000A00C000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000A00C000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0004100000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0010100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000001FC000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000003E00L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000010L});

}