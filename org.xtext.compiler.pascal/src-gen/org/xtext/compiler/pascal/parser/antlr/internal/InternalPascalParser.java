package org.xtext.compiler.pascal.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.compiler.pascal.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ASSIGN", "RULE_PLUS", "RULE_MINUS", "RULE_NOT", "RULE_DOTDOT", "RULE_STRING", "RULE_NIL", "RULE_NUM_INT", "RULE_NUM_REAL", "RULE_OR", "RULE_STAR", "RULE_SLASH", "RULE_DIV", "RULE_MOD", "RULE_AND", "RULE_EQUAL", "RULE_NOT_EQUAL", "RULE_LT", "RULE_LE", "RULE_GE", "RULE_GT", "RULE_IN", "RULE_TRUE", "RULE_FALSE", "RULE_EXPONENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "'('", "')'", "';'", "','", "'begin'", "'end'", "':'", "'@'", "'['", "']'", "'(.'", "'.)'", "'^'", "'chr'", "'procedure'", "'goto'", "'structured'"
    };
    public static final int T__50=50;
    public static final int RULE_LE=23;
    public static final int RULE_GT=25;
    public static final int RULE_DIV=17;
    public static final int RULE_NIL=11;
    public static final int RULE_NOT_EQUAL=21;
    public static final int RULE_GE=24;
    public static final int T__51=51;
    public static final int RULE_DOTDOT=9;
    public static final int RULE_OR=14;
    public static final int RULE_STAR=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=4;
    public static final int RULE_MOD=18;
    public static final int RULE_EQUAL=20;
    public static final int RULE_ASSIGN=5;
    public static final int RULE_SLASH=16;
    public static final int RULE_LT=22;
    public static final int RULE_INT=30;
    public static final int RULE_ML_COMMENT=31;
    public static final int RULE_FALSE=28;
    public static final int RULE_STRING=10;
    public static final int RULE_NOT=8;
    public static final int RULE_AND=19;
    public static final int RULE_SL_COMMENT=32;
    public static final int RULE_IN=26;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_TRUE=27;
    public static final int T__35=35;
    public static final int RULE_PLUS=6;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int RULE_WS=33;
    public static final int RULE_NUM_REAL=13;
    public static final int RULE_ANY_OTHER=34;
    public static final int RULE_MINUS=7;
    public static final int RULE_EXPONENT=29;
    public static final int RULE_NUM_INT=12;
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

        public InternalPascalParser(TokenStream input, PascalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "pascal";
       	}

       	@Override
       	protected PascalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulepascal"
    // InternalPascal.g:64:1: entryRulepascal returns [EObject current=null] : iv_rulepascal= rulepascal EOF ;
    public final EObject entryRulepascal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepascal = null;


        try {
            // InternalPascal.g:64:47: (iv_rulepascal= rulepascal EOF )
            // InternalPascal.g:65:2: iv_rulepascal= rulepascal EOF
            {
             newCompositeNode(grammarAccess.getPascalRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepascal=rulepascal();

            state._fsp--;

             current =iv_rulepascal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepascal"


    // $ANTLR start "rulepascal"
    // InternalPascal.g:71:1: rulepascal returns [EObject current=null] : ( (lv_program_0_0= ruleprogram ) ) ;
    public final EObject rulepascal() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:77:2: ( ( (lv_program_0_0= ruleprogram ) ) )
            // InternalPascal.g:78:2: ( (lv_program_0_0= ruleprogram ) )
            {
            // InternalPascal.g:78:2: ( (lv_program_0_0= ruleprogram ) )
            // InternalPascal.g:79:3: (lv_program_0_0= ruleprogram )
            {
            // InternalPascal.g:79:3: (lv_program_0_0= ruleprogram )
            // InternalPascal.g:80:4: lv_program_0_0= ruleprogram
            {

            				newCompositeNode(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_program_0_0=ruleprogram();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPascalRule());
            				}
            				add(
            					current,
            					"program",
            					lv_program_0_0,
            					"org.xtext.compiler.pascal.Pascal.program");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepascal"


    // $ANTLR start "entryRuleprogram"
    // InternalPascal.g:100:1: entryRuleprogram returns [EObject current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final EObject entryRuleprogram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram = null;


        try {
            // InternalPascal.g:100:48: (iv_ruleprogram= ruleprogram EOF )
            // InternalPascal.g:101:2: iv_ruleprogram= ruleprogram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogram=ruleprogram();

            state._fsp--;

             current =iv_ruleprogram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // InternalPascal.g:107:1: ruleprogram returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:113:2: ( ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' ) )
            // InternalPascal.g:114:2: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' )
            {
            // InternalPascal.g:114:2: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' )
            // InternalPascal.g:115:3: ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.'
            {
            // InternalPascal.g:115:3: ( (lv_heading_0_0= ruleprogram_heading_block ) )
            // InternalPascal.g:116:4: (lv_heading_0_0= ruleprogram_heading_block )
            {
            // InternalPascal.g:116:4: (lv_heading_0_0= ruleprogram_heading_block )
            // InternalPascal.g:117:5: lv_heading_0_0= ruleprogram_heading_block
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getHeadingProgram_heading_blockParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_heading_0_0=ruleprogram_heading_block();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"heading",
            						lv_heading_0_0,
            						"org.xtext.compiler.pascal.Pascal.program_heading_block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:134:3: ( (lv_block_1_0= ruleblock ) )
            // InternalPascal.g:135:4: (lv_block_1_0= ruleblock )
            {
            // InternalPascal.g:135:4: (lv_block_1_0= ruleblock )
            // InternalPascal.g:136:5: lv_block_1_0= ruleblock
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_block_1_0=ruleblock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_1_0,
            						"org.xtext.compiler.pascal.Pascal.block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getFullStopKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRuleprogram_heading_block"
    // InternalPascal.g:161:1: entryRuleprogram_heading_block returns [EObject current=null] : iv_ruleprogram_heading_block= ruleprogram_heading_block EOF ;
    public final EObject entryRuleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram_heading_block = null;


        try {
            // InternalPascal.g:161:62: (iv_ruleprogram_heading_block= ruleprogram_heading_block EOF )
            // InternalPascal.g:162:2: iv_ruleprogram_heading_block= ruleprogram_heading_block EOF
            {
             newCompositeNode(grammarAccess.getProgram_heading_blockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogram_heading_block=ruleprogram_heading_block();

            state._fsp--;

             current =iv_ruleprogram_heading_block; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprogram_heading_block"


    // $ANTLR start "ruleprogram_heading_block"
    // InternalPascal.g:168:1: ruleprogram_heading_block returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' ) ;
    public final EObject ruleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_identifiers_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:174:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' ) )
            // InternalPascal.g:175:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' )
            {
            // InternalPascal.g:175:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' )
            // InternalPascal.g:176:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0());
            		
            // InternalPascal.g:180:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:181:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:181:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:182:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgram_heading_blockAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgram_heading_blockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:198:3: (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==37) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:199:4: otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalPascal.g:203:4: ( (lv_identifiers_3_0= ruleidentifier_list ) )
                    // InternalPascal.g:204:5: (lv_identifiers_3_0= ruleidentifier_list )
                    {
                    // InternalPascal.g:204:5: (lv_identifiers_3_0= ruleidentifier_list )
                    // InternalPascal.g:205:6: lv_identifiers_3_0= ruleidentifier_list
                    {

                    						newCompositeNode(grammarAccess.getProgram_heading_blockAccess().getIdentifiersIdentifier_listParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_identifiers_3_0=ruleidentifier_list();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgram_heading_blockRule());
                    						}
                    						set(
                    							current,
                    							"identifiers",
                    							lv_identifiers_3_0,
                    							"org.xtext.compiler.pascal.Pascal.identifier_list");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,38,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogram_heading_block"


    // $ANTLR start "entryRuleidentifier_list"
    // InternalPascal.g:235:1: entryRuleidentifier_list returns [EObject current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final EObject entryRuleidentifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier_list = null;


        try {
            // InternalPascal.g:235:56: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // InternalPascal.g:236:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
             newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;

             current =iv_ruleidentifier_list; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleidentifier_list"


    // $ANTLR start "ruleidentifier_list"
    // InternalPascal.g:242:1: ruleidentifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleidentifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalPascal.g:248:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // InternalPascal.g:249:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // InternalPascal.g:249:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // InternalPascal.g:250:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // InternalPascal.g:250:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalPascal.g:251:4: (lv_names_0_0= RULE_ID )
            {
            // InternalPascal.g:251:4: (lv_names_0_0= RULE_ID )
            // InternalPascal.g:252:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_names_0_0, grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdentifier_listRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:268:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==40) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPascal.g:269:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,40,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:273:4: ( (lv_names_2_0= RULE_ID ) )
            	    // InternalPascal.g:274:5: (lv_names_2_0= RULE_ID )
            	    {
            	    // InternalPascal.g:274:5: (lv_names_2_0= RULE_ID )
            	    // InternalPascal.g:275:6: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    						newLeafNode(lv_names_2_0, grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIdentifier_listRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"names",
            	    							lv_names_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleidentifier_list"


    // $ANTLR start "entryRuleblock"
    // InternalPascal.g:296:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // InternalPascal.g:296:46: (iv_ruleblock= ruleblock EOF )
            // InternalPascal.g:297:2: iv_ruleblock= ruleblock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // InternalPascal.g:303:1: ruleblock returns [EObject current=null] : ( (lv_statement_0_0= rulecompound_statement ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:309:2: ( ( (lv_statement_0_0= rulecompound_statement ) ) )
            // InternalPascal.g:310:2: ( (lv_statement_0_0= rulecompound_statement ) )
            {
            // InternalPascal.g:310:2: ( (lv_statement_0_0= rulecompound_statement ) )
            // InternalPascal.g:311:3: (lv_statement_0_0= rulecompound_statement )
            {
            // InternalPascal.g:311:3: (lv_statement_0_0= rulecompound_statement )
            // InternalPascal.g:312:4: lv_statement_0_0= rulecompound_statement
            {

            				newCompositeNode(grammarAccess.getBlockAccess().getStatementCompound_statementParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_statement_0_0=rulecompound_statement();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBlockRule());
            				}
            				set(
            					current,
            					"statement",
            					lv_statement_0_0,
            					"org.xtext.compiler.pascal.Pascal.compound_statement");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRulecompound_statement"
    // InternalPascal.g:332:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // InternalPascal.g:332:59: (iv_rulecompound_statement= rulecompound_statement EOF )
            // InternalPascal.g:333:2: iv_rulecompound_statement= rulecompound_statement EOF
            {
             newCompositeNode(grammarAccess.getCompound_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecompound_statement=rulecompound_statement();

            state._fsp--;

             current =iv_rulecompound_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecompound_statement"


    // $ANTLR start "rulecompound_statement"
    // InternalPascal.g:339:1: rulecompound_statement returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= 'end' ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:345:2: ( (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:346:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:346:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= 'end' )
            // InternalPascal.g:347:3: otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCompound_statementAccess().getBeginKeyword_0());
            		
            // InternalPascal.g:351:3: ( (lv_sequence_1_0= rulestatements ) )
            // InternalPascal.g:352:4: (lv_sequence_1_0= rulestatements )
            {
            // InternalPascal.g:352:4: (lv_sequence_1_0= rulestatements )
            // InternalPascal.g:353:5: lv_sequence_1_0= rulestatements
            {

            					newCompositeNode(grammarAccess.getCompound_statementAccess().getSequenceStatementsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_sequence_1_0=rulestatements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompound_statementRule());
            					}
            					set(
            						current,
            						"sequence",
            						lv_sequence_1_0,
            						"org.xtext.compiler.pascal.Pascal.statements");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCompound_statementAccess().getEndKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecompound_statement"


    // $ANTLR start "entryRulestatements"
    // InternalPascal.g:378:1: entryRulestatements returns [EObject current=null] : iv_rulestatements= rulestatements EOF ;
    public final EObject entryRulestatements() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatements = null;


        try {
            // InternalPascal.g:378:51: (iv_rulestatements= rulestatements EOF )
            // InternalPascal.g:379:2: iv_rulestatements= rulestatements EOF
            {
             newCompositeNode(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatements=rulestatements();

            state._fsp--;

             current =iv_rulestatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatements"


    // $ANTLR start "rulestatements"
    // InternalPascal.g:385:1: rulestatements returns [EObject current=null] : ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:391:2: ( ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) )
            // InternalPascal.g:392:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            {
            // InternalPascal.g:392:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            // InternalPascal.g:393:3: ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            {
            // InternalPascal.g:393:3: ( (lv_statements_0_0= rulestatement ) )
            // InternalPascal.g:394:4: (lv_statements_0_0= rulestatement )
            {
            // InternalPascal.g:394:4: (lv_statements_0_0= rulestatement )
            // InternalPascal.g:395:5: lv_statements_0_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_statements_0_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementsRule());
            					}
            					add(
            						current,
            						"statements",
            						lv_statements_0_0,
            						"org.xtext.compiler.pascal.Pascal.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:412:3: (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==39) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPascal.g:413:4: otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,39,FOLLOW_10); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStatementsAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalPascal.g:417:4: ( (lv_statements_2_0= rulestatement ) )
            	    // InternalPascal.g:418:5: (lv_statements_2_0= rulestatement )
            	    {
            	    // InternalPascal.g:418:5: (lv_statements_2_0= rulestatement )
            	    // InternalPascal.g:419:6: lv_statements_2_0= rulestatement
            	    {

            	    						newCompositeNode(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_statements_2_0=rulestatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStatementsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statements",
            	    							lv_statements_2_0,
            	    							"org.xtext.compiler.pascal.Pascal.statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatements"


    // $ANTLR start "entryRulestatement"
    // InternalPascal.g:441:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalPascal.g:441:50: (iv_rulestatement= rulestatement EOF )
            // InternalPascal.g:442:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalPascal.g:448:1: rulestatement returns [EObject current=null] : ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) ) ) | ( () ( (lv_statement_4_0= ruleunlabelled_statement ) )? ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_label_0_0 = null;

        EObject lv_statement_2_0 = null;

        EObject lv_statement_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:454:2: ( ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) ) ) | ( () ( (lv_statement_4_0= ruleunlabelled_statement ) )? ) ) )
            // InternalPascal.g:455:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) ) ) | ( () ( (lv_statement_4_0= ruleunlabelled_statement ) )? ) )
            {
            // InternalPascal.g:455:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) ) ) | ( () ( (lv_statement_4_0= ruleunlabelled_statement ) )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_NUM_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==EOF||LA5_0==RULE_ID||LA5_0==39||LA5_0==42||LA5_0==44||(LA5_0>=51 && LA5_0<=53)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:456:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) ) )
                    {
                    // InternalPascal.g:456:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) ) )
                    // InternalPascal.g:457:4: ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) )
                    {
                    // InternalPascal.g:457:4: ( (lv_label_0_0= rulelabel ) )
                    // InternalPascal.g:458:5: (lv_label_0_0= rulelabel )
                    {
                    // InternalPascal.g:458:5: (lv_label_0_0= rulelabel )
                    // InternalPascal.g:459:6: lv_label_0_0= rulelabel
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_label_0_0=rulelabel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_0_0,
                    							"org.xtext.compiler.pascal.Pascal.label");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,43,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_0_1());
                    			
                    // InternalPascal.g:480:4: ( (lv_statement_2_0= ruleunlabelled_statement ) )
                    // InternalPascal.g:481:5: (lv_statement_2_0= ruleunlabelled_statement )
                    {
                    // InternalPascal.g:481:5: (lv_statement_2_0= ruleunlabelled_statement )
                    // InternalPascal.g:482:6: lv_statement_2_0= ruleunlabelled_statement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getStatementUnlabelled_statementParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_statement_2_0=ruleunlabelled_statement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						add(
                    							current,
                    							"statement",
                    							lv_statement_2_0,
                    							"org.xtext.compiler.pascal.Pascal.unlabelled_statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:501:3: ( () ( (lv_statement_4_0= ruleunlabelled_statement ) )? )
                    {
                    // InternalPascal.g:501:3: ( () ( (lv_statement_4_0= ruleunlabelled_statement ) )? )
                    // InternalPascal.g:502:4: () ( (lv_statement_4_0= ruleunlabelled_statement ) )?
                    {
                    // InternalPascal.g:502:4: ()
                    // InternalPascal.g:503:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatementAccess().getStatementAction_1_0(),
                    						current);
                    				

                    }

                    // InternalPascal.g:509:4: ( (lv_statement_4_0= ruleunlabelled_statement ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID||LA4_0==44||(LA4_0>=51 && LA4_0<=53)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalPascal.g:510:5: (lv_statement_4_0= ruleunlabelled_statement )
                            {
                            // InternalPascal.g:510:5: (lv_statement_4_0= ruleunlabelled_statement )
                            // InternalPascal.g:511:6: lv_statement_4_0= ruleunlabelled_statement
                            {

                            						newCompositeNode(grammarAccess.getStatementAccess().getStatementUnlabelled_statementParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_statement_4_0=ruleunlabelled_statement();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getStatementRule());
                            						}
                            						add(
                            							current,
                            							"statement",
                            							lv_statement_4_0,
                            							"org.xtext.compiler.pascal.Pascal.unlabelled_statement");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRuleunlabelled_statement"
    // InternalPascal.g:533:1: entryRuleunlabelled_statement returns [EObject current=null] : iv_ruleunlabelled_statement= ruleunlabelled_statement EOF ;
    public final EObject entryRuleunlabelled_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunlabelled_statement = null;


        try {
            // InternalPascal.g:533:61: (iv_ruleunlabelled_statement= ruleunlabelled_statement EOF )
            // InternalPascal.g:534:2: iv_ruleunlabelled_statement= ruleunlabelled_statement EOF
            {
             newCompositeNode(grammarAccess.getUnlabelled_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunlabelled_statement=ruleunlabelled_statement();

            state._fsp--;

             current =iv_ruleunlabelled_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunlabelled_statement"


    // $ANTLR start "ruleunlabelled_statement"
    // InternalPascal.g:540:1: ruleunlabelled_statement returns [EObject current=null] : ( ( (lv_simple_0_0= rulesimple_statement ) ) | ( (lv_structured_1_0= rulestructured_statement ) ) ) ;
    public final EObject ruleunlabelled_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        AntlrDatatypeRuleToken lv_structured_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:546:2: ( ( ( (lv_simple_0_0= rulesimple_statement ) ) | ( (lv_structured_1_0= rulestructured_statement ) ) ) )
            // InternalPascal.g:547:2: ( ( (lv_simple_0_0= rulesimple_statement ) ) | ( (lv_structured_1_0= rulestructured_statement ) ) )
            {
            // InternalPascal.g:547:2: ( ( (lv_simple_0_0= rulesimple_statement ) ) | ( (lv_structured_1_0= rulestructured_statement ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==44||(LA6_0>=51 && LA6_0<=52)) ) {
                alt6=1;
            }
            else if ( (LA6_0==53) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPascal.g:548:3: ( (lv_simple_0_0= rulesimple_statement ) )
                    {
                    // InternalPascal.g:548:3: ( (lv_simple_0_0= rulesimple_statement ) )
                    // InternalPascal.g:549:4: (lv_simple_0_0= rulesimple_statement )
                    {
                    // InternalPascal.g:549:4: (lv_simple_0_0= rulesimple_statement )
                    // InternalPascal.g:550:5: lv_simple_0_0= rulesimple_statement
                    {

                    					newCompositeNode(grammarAccess.getUnlabelled_statementAccess().getSimpleSimple_statementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_simple_0_0=rulesimple_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnlabelled_statementRule());
                    					}
                    					set(
                    						current,
                    						"simple",
                    						lv_simple_0_0,
                    						"org.xtext.compiler.pascal.Pascal.simple_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:568:3: ( (lv_structured_1_0= rulestructured_statement ) )
                    {
                    // InternalPascal.g:568:3: ( (lv_structured_1_0= rulestructured_statement ) )
                    // InternalPascal.g:569:4: (lv_structured_1_0= rulestructured_statement )
                    {
                    // InternalPascal.g:569:4: (lv_structured_1_0= rulestructured_statement )
                    // InternalPascal.g:570:5: lv_structured_1_0= rulestructured_statement
                    {

                    					newCompositeNode(grammarAccess.getUnlabelled_statementAccess().getStructuredStructured_statementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_structured_1_0=rulestructured_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnlabelled_statementRule());
                    					}
                    					set(
                    						current,
                    						"structured",
                    						lv_structured_1_0,
                    						"org.xtext.compiler.pascal.Pascal.structured_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunlabelled_statement"


    // $ANTLR start "entryRulelabel"
    // InternalPascal.g:591:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // InternalPascal.g:591:46: (iv_rulelabel= rulelabel EOF )
            // InternalPascal.g:592:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelabel"


    // $ANTLR start "rulelabel"
    // InternalPascal.g:598:1: rulelabel returns [EObject current=null] : ( (lv_number_0_0= ruleunsigned_integer ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_number_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:604:2: ( ( (lv_number_0_0= ruleunsigned_integer ) ) )
            // InternalPascal.g:605:2: ( (lv_number_0_0= ruleunsigned_integer ) )
            {
            // InternalPascal.g:605:2: ( (lv_number_0_0= ruleunsigned_integer ) )
            // InternalPascal.g:606:3: (lv_number_0_0= ruleunsigned_integer )
            {
            // InternalPascal.g:606:3: (lv_number_0_0= ruleunsigned_integer )
            // InternalPascal.g:607:4: lv_number_0_0= ruleunsigned_integer
            {

            				newCompositeNode(grammarAccess.getLabelAccess().getNumberUnsigned_integerParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_number_0_0=ruleunsigned_integer();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLabelRule());
            				}
            				set(
            					current,
            					"number",
            					lv_number_0_0,
            					"org.xtext.compiler.pascal.Pascal.unsigned_integer");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelabel"


    // $ANTLR start "entryRulesimple_statement"
    // InternalPascal.g:627:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // InternalPascal.g:627:57: (iv_rulesimple_statement= rulesimple_statement EOF )
            // InternalPascal.g:628:2: iv_rulesimple_statement= rulesimple_statement EOF
            {
             newCompositeNode(grammarAccess.getSimple_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimple_statement=rulesimple_statement();

            state._fsp--;

             current =iv_rulesimple_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimple_statement"


    // $ANTLR start "rulesimple_statement"
    // InternalPascal.g:634:1: rulesimple_statement returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_procedure_1_0= ruleprocedure_statement ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) ) ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_assignment_0_0 = null;

        AntlrDatatypeRuleToken lv_procedure_1_0 = null;

        AntlrDatatypeRuleToken lv_goto_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:640:2: ( ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_procedure_1_0= ruleprocedure_statement ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) ) )
            // InternalPascal.g:641:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_procedure_1_0= ruleprocedure_statement ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) )
            {
            // InternalPascal.g:641:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_procedure_1_0= ruleprocedure_statement ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 44:
                {
                alt7=1;
                }
                break;
            case 51:
                {
                alt7=2;
                }
                break;
            case 52:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPascal.g:642:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    {
                    // InternalPascal.g:642:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    // InternalPascal.g:643:4: (lv_assignment_0_0= ruleassignment_statement )
                    {
                    // InternalPascal.g:643:4: (lv_assignment_0_0= ruleassignment_statement )
                    // InternalPascal.g:644:5: lv_assignment_0_0= ruleassignment_statement
                    {

                    					newCompositeNode(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_statementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_assignment_0_0=ruleassignment_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    					}
                    					set(
                    						current,
                    						"assignment",
                    						lv_assignment_0_0,
                    						"org.xtext.compiler.pascal.Pascal.assignment_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:662:3: ( (lv_procedure_1_0= ruleprocedure_statement ) )
                    {
                    // InternalPascal.g:662:3: ( (lv_procedure_1_0= ruleprocedure_statement ) )
                    // InternalPascal.g:663:4: (lv_procedure_1_0= ruleprocedure_statement )
                    {
                    // InternalPascal.g:663:4: (lv_procedure_1_0= ruleprocedure_statement )
                    // InternalPascal.g:664:5: lv_procedure_1_0= ruleprocedure_statement
                    {

                    					newCompositeNode(grammarAccess.getSimple_statementAccess().getProcedureProcedure_statementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_procedure_1_0=ruleprocedure_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    					}
                    					set(
                    						current,
                    						"procedure",
                    						lv_procedure_1_0,
                    						"org.xtext.compiler.pascal.Pascal.procedure_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:682:3: ( (lv_goto_2_0= rulegoto_statement ) )
                    {
                    // InternalPascal.g:682:3: ( (lv_goto_2_0= rulegoto_statement ) )
                    // InternalPascal.g:683:4: (lv_goto_2_0= rulegoto_statement )
                    {
                    // InternalPascal.g:683:4: (lv_goto_2_0= rulegoto_statement )
                    // InternalPascal.g:684:5: lv_goto_2_0= rulegoto_statement
                    {

                    					newCompositeNode(grammarAccess.getSimple_statementAccess().getGotoGoto_statementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_goto_2_0=rulegoto_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    					}
                    					set(
                    						current,
                    						"goto",
                    						lv_goto_2_0,
                    						"org.xtext.compiler.pascal.Pascal.goto_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRuleassignment_statement"
    // InternalPascal.g:705:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // InternalPascal.g:705:61: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // InternalPascal.g:706:2: iv_ruleassignment_statement= ruleassignment_statement EOF
            {
             newCompositeNode(grammarAccess.getAssignment_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleassignment_statement=ruleassignment_statement();

            state._fsp--;

             current =iv_ruleassignment_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleassignment_statement"


    // $ANTLR start "ruleassignment_statement"
    // InternalPascal.g:712:1: ruleassignment_statement returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token this_ASSIGN_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:718:2: ( ( ( (lv_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) ) ) )
            // InternalPascal.g:719:2: ( ( (lv_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) ) )
            {
            // InternalPascal.g:719:2: ( ( (lv_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) ) )
            // InternalPascal.g:720:3: ( (lv_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) )
            {
            // InternalPascal.g:720:3: ( (lv_variable_0_0= rulevariable ) )
            // InternalPascal.g:721:4: (lv_variable_0_0= rulevariable )
            {
            // InternalPascal.g:721:4: (lv_variable_0_0= rulevariable )
            // InternalPascal.g:722:5: lv_variable_0_0= rulevariable
            {

            					newCompositeNode(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_variable_0_0=rulevariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"org.xtext.compiler.pascal.Pascal.variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ASSIGN_1=(Token)match(input,RULE_ASSIGN,FOLLOW_16); 

            			newLeafNode(this_ASSIGN_1, grammarAccess.getAssignment_statementAccess().getASSIGNTerminalRuleCall_1());
            		
            // InternalPascal.g:743:3: ( (lv_expression_2_0= ruleexpression ) )
            // InternalPascal.g:744:4: (lv_expression_2_0= ruleexpression )
            {
            // InternalPascal.g:744:4: (lv_expression_2_0= ruleexpression )
            // InternalPascal.g:745:5: lv_expression_2_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.xtext.compiler.pascal.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassignment_statement"


    // $ANTLR start "entryRulevariable"
    // InternalPascal.g:766:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalPascal.g:766:49: (iv_rulevariable= rulevariable EOF )
            // InternalPascal.g:767:2: iv_rulevariable= rulevariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable=rulevariable();

            state._fsp--;

             current =iv_rulevariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable"


    // $ANTLR start "rulevariable"
    // InternalPascal.g:773:1: rulevariable returns [EObject current=null] : ( ( (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) ) | ( (lv_names_2_0= RULE_ID ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) ) | otherlv_15= '^' )* ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_names_1_0=null;
        Token lv_names_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_names_14_0=null;
        Token otherlv_15=null;
        EObject lv_expression_4_0 = null;

        EObject lv_expression_6_0 = null;

        EObject lv_expression_9_0 = null;

        EObject lv_expression_11_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:779:2: ( ( ( (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) ) | ( (lv_names_2_0= RULE_ID ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) ) | otherlv_15= '^' )* ) )
            // InternalPascal.g:780:2: ( ( (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) ) | ( (lv_names_2_0= RULE_ID ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) ) | otherlv_15= '^' )* )
            {
            // InternalPascal.g:780:2: ( ( (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) ) | ( (lv_names_2_0= RULE_ID ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) ) | otherlv_15= '^' )* )
            // InternalPascal.g:781:3: ( (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) ) | ( (lv_names_2_0= RULE_ID ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) ) | otherlv_15= '^' )*
            {
            // InternalPascal.g:781:3: ( (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) ) | ( (lv_names_2_0= RULE_ID ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==44) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPascal.g:782:4: (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) )
                    {
                    // InternalPascal.g:782:4: (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) )
                    // InternalPascal.g:783:5: otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getCommercialAtKeyword_0_0_0());
                    				
                    // InternalPascal.g:787:5: ( (lv_names_1_0= RULE_ID ) )
                    // InternalPascal.g:788:6: (lv_names_1_0= RULE_ID )
                    {
                    // InternalPascal.g:788:6: (lv_names_1_0= RULE_ID )
                    // InternalPascal.g:789:7: lv_names_1_0= RULE_ID
                    {
                    lv_names_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    							newLeafNode(lv_names_1_0, grammarAccess.getVariableAccess().getNamesIDTerminalRuleCall_0_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getVariableRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"names",
                    								lv_names_1_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:807:4: ( (lv_names_2_0= RULE_ID ) )
                    {
                    // InternalPascal.g:807:4: ( (lv_names_2_0= RULE_ID ) )
                    // InternalPascal.g:808:5: (lv_names_2_0= RULE_ID )
                    {
                    // InternalPascal.g:808:5: (lv_names_2_0= RULE_ID )
                    // InternalPascal.g:809:6: lv_names_2_0= RULE_ID
                    {
                    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_names_2_0, grammarAccess.getVariableAccess().getNamesIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"names",
                    							lv_names_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPascal.g:826:3: ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) ) | otherlv_15= '^' )*
            loop11:
            do {
                int alt11=5;
                switch ( input.LA(1) ) {
                case 45:
                    {
                    alt11=1;
                    }
                    break;
                case 47:
                    {
                    alt11=2;
                    }
                    break;
                case 35:
                    {
                    alt11=3;
                    }
                    break;
                case 49:
                    {
                    alt11=4;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // InternalPascal.g:827:4: (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' )
            	    {
            	    // InternalPascal.g:827:4: (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' )
            	    // InternalPascal.g:828:5: otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']'
            	    {
            	    otherlv_3=(Token)match(input,45,FOLLOW_16); 

            	    					newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_1_0_0());
            	    				
            	    // InternalPascal.g:832:5: ( (lv_expression_4_0= ruleexpression ) )
            	    // InternalPascal.g:833:6: (lv_expression_4_0= ruleexpression )
            	    {
            	    // InternalPascal.g:833:6: (lv_expression_4_0= ruleexpression )
            	    // InternalPascal.g:834:7: lv_expression_4_0= ruleexpression
            	    {

            	    							newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_18);
            	    lv_expression_4_0=ruleexpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVariableRule());
            	    							}
            	    							add(
            	    								current,
            	    								"expression",
            	    								lv_expression_4_0,
            	    								"org.xtext.compiler.pascal.Pascal.expression");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalPascal.g:851:5: (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==40) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalPascal.g:852:6: otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,40,FOLLOW_16); 

            	    	    						newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getCommaKeyword_1_0_2_0());
            	    	    					
            	    	    // InternalPascal.g:856:6: ( (lv_expression_6_0= ruleexpression ) )
            	    	    // InternalPascal.g:857:7: (lv_expression_6_0= ruleexpression )
            	    	    {
            	    	    // InternalPascal.g:857:7: (lv_expression_6_0= ruleexpression )
            	    	    // InternalPascal.g:858:8: lv_expression_6_0= ruleexpression
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_0_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_18);
            	    	    lv_expression_6_0=ruleexpression();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getVariableRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"expression",
            	    	    									lv_expression_6_0,
            	    	    									"org.xtext.compiler.pascal.Pascal.expression");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    otherlv_7=(Token)match(input,46,FOLLOW_17); 

            	    					newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getRightSquareBracketKeyword_1_0_3());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPascal.g:882:4: (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' )
            	    {
            	    // InternalPascal.g:882:4: (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' )
            	    // InternalPascal.g:883:5: otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)'
            	    {
            	    otherlv_8=(Token)match(input,47,FOLLOW_16); 

            	    					newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getLeftParenthesisFullStopKeyword_1_1_0());
            	    				
            	    // InternalPascal.g:887:5: ( (lv_expression_9_0= ruleexpression ) )
            	    // InternalPascal.g:888:6: (lv_expression_9_0= ruleexpression )
            	    {
            	    // InternalPascal.g:888:6: (lv_expression_9_0= ruleexpression )
            	    // InternalPascal.g:889:7: lv_expression_9_0= ruleexpression
            	    {

            	    							newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_19);
            	    lv_expression_9_0=ruleexpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVariableRule());
            	    							}
            	    							add(
            	    								current,
            	    								"expression",
            	    								lv_expression_9_0,
            	    								"org.xtext.compiler.pascal.Pascal.expression");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalPascal.g:906:5: (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==40) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalPascal.g:907:6: otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,40,FOLLOW_16); 

            	    	    						newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getCommaKeyword_1_1_2_0());
            	    	    					
            	    	    // InternalPascal.g:911:6: ( (lv_expression_11_0= ruleexpression ) )
            	    	    // InternalPascal.g:912:7: (lv_expression_11_0= ruleexpression )
            	    	    {
            	    	    // InternalPascal.g:912:7: (lv_expression_11_0= ruleexpression )
            	    	    // InternalPascal.g:913:8: lv_expression_11_0= ruleexpression
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_1_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_19);
            	    	    lv_expression_11_0=ruleexpression();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getVariableRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"expression",
            	    	    									lv_expression_11_0,
            	    	    									"org.xtext.compiler.pascal.Pascal.expression");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,48,FOLLOW_17); 

            	    					newLeafNode(otherlv_12, grammarAccess.getVariableAccess().getFullStopRightParenthesisKeyword_1_1_3());
            	    				

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPascal.g:937:4: (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) )
            	    {
            	    // InternalPascal.g:937:4: (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) )
            	    // InternalPascal.g:938:5: otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) )
            	    {
            	    otherlv_13=(Token)match(input,35,FOLLOW_5); 

            	    					newLeafNode(otherlv_13, grammarAccess.getVariableAccess().getFullStopKeyword_1_2_0());
            	    				
            	    // InternalPascal.g:942:5: ( (lv_names_14_0= RULE_ID ) )
            	    // InternalPascal.g:943:6: (lv_names_14_0= RULE_ID )
            	    {
            	    // InternalPascal.g:943:6: (lv_names_14_0= RULE_ID )
            	    // InternalPascal.g:944:7: lv_names_14_0= RULE_ID
            	    {
            	    lv_names_14_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    							newLeafNode(lv_names_14_0, grammarAccess.getVariableAccess().getNamesIDTerminalRuleCall_1_2_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getVariableRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"names",
            	    								lv_names_14_0,
            	    								"org.eclipse.xtext.common.Terminals.ID");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPascal.g:962:4: otherlv_15= '^'
            	    {
            	    otherlv_15=(Token)match(input,49,FOLLOW_17); 

            	    				newLeafNode(otherlv_15, grammarAccess.getVariableAccess().getCircumflexAccentKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRuleexpression"
    // InternalPascal.g:971:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascal.g:971:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascal.g:972:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalPascal.g:978:1: ruleexpression returns [EObject current=null] : ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;

        AntlrDatatypeRuleToken lv_operators_1_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:984:2: ( ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? ) )
            // InternalPascal.g:985:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? )
            {
            // InternalPascal.g:985:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? )
            // InternalPascal.g:986:3: ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) ) )?
            {
            // InternalPascal.g:986:3: ( (lv_expressions_0_0= rulesimple_expression ) )
            // InternalPascal.g:987:4: (lv_expressions_0_0= rulesimple_expression )
            {
            // InternalPascal.g:987:4: (lv_expressions_0_0= rulesimple_expression )
            // InternalPascal.g:988:5: lv_expressions_0_0= rulesimple_expression
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_expressions_0_0=rulesimple_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_0_0,
            						"org.xtext.compiler.pascal.Pascal.simple_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:1005:3: ( ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_EQUAL && LA12_0<=RULE_IN)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPascal.g:1006:4: ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) )
                    {
                    // InternalPascal.g:1006:4: ( (lv_operators_1_0= rulerelational_operator ) )
                    // InternalPascal.g:1007:5: (lv_operators_1_0= rulerelational_operator )
                    {
                    // InternalPascal.g:1007:5: (lv_operators_1_0= rulerelational_operator )
                    // InternalPascal.g:1008:6: lv_operators_1_0= rulerelational_operator
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getOperatorsRelational_operatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_operators_1_0=rulerelational_operator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operators",
                    							lv_operators_1_0,
                    							"org.xtext.compiler.pascal.Pascal.relational_operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascal.g:1025:4: ( (lv_expressions_2_0= ruleexpression ) )
                    // InternalPascal.g:1026:5: (lv_expressions_2_0= ruleexpression )
                    {
                    // InternalPascal.g:1026:5: (lv_expressions_2_0= ruleexpression )
                    // InternalPascal.g:1027:6: lv_expressions_2_0= ruleexpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expressions_2_0=ruleexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						add(
                    							current,
                    							"expressions",
                    							lv_expressions_2_0,
                    							"org.xtext.compiler.pascal.Pascal.expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesimple_expression"
    // InternalPascal.g:1049:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;


        try {
            // InternalPascal.g:1049:58: (iv_rulesimple_expression= rulesimple_expression EOF )
            // InternalPascal.g:1050:2: iv_rulesimple_expression= rulesimple_expression EOF
            {
             newCompositeNode(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimple_expression=rulesimple_expression();

            state._fsp--;

             current =iv_rulesimple_expression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimple_expression"


    // $ANTLR start "rulesimple_expression"
    // InternalPascal.g:1056:1: rulesimple_expression returns [EObject current=null] : ( ( (lv_terms_0_0= ruleterm ) ) ( ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )? ) ;
    public final EObject rulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject lv_terms_0_0 = null;

        AntlrDatatypeRuleToken lv_operators_1_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1062:2: ( ( ( (lv_terms_0_0= ruleterm ) ) ( ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )? ) )
            // InternalPascal.g:1063:2: ( ( (lv_terms_0_0= ruleterm ) ) ( ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )? )
            {
            // InternalPascal.g:1063:2: ( ( (lv_terms_0_0= ruleterm ) ) ( ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )? )
            // InternalPascal.g:1064:3: ( (lv_terms_0_0= ruleterm ) ) ( ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )?
            {
            // InternalPascal.g:1064:3: ( (lv_terms_0_0= ruleterm ) )
            // InternalPascal.g:1065:4: (lv_terms_0_0= ruleterm )
            {
            // InternalPascal.g:1065:4: (lv_terms_0_0= ruleterm )
            // InternalPascal.g:1066:5: lv_terms_0_0= ruleterm
            {

            					newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_terms_0_0=ruleterm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            					}
            					add(
            						current,
            						"terms",
            						lv_terms_0_0,
            						"org.xtext.compiler.pascal.Pascal.term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:1083:3: ( ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_PLUS && LA13_0<=RULE_MINUS)||LA13_0==RULE_OR) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPascal.g:1084:4: ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) )
                    {
                    // InternalPascal.g:1084:4: ( (lv_operators_1_0= ruleadditive_operator ) )
                    // InternalPascal.g:1085:5: (lv_operators_1_0= ruleadditive_operator )
                    {
                    // InternalPascal.g:1085:5: (lv_operators_1_0= ruleadditive_operator )
                    // InternalPascal.g:1086:6: lv_operators_1_0= ruleadditive_operator
                    {

                    						newCompositeNode(grammarAccess.getSimple_expressionAccess().getOperatorsAdditive_operatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_operators_1_0=ruleadditive_operator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
                    						}
                    						add(
                    							current,
                    							"operators",
                    							lv_operators_1_0,
                    							"org.xtext.compiler.pascal.Pascal.additive_operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascal.g:1103:4: ( (lv_expression_2_0= rulesimple_expression ) )
                    // InternalPascal.g:1104:5: (lv_expression_2_0= rulesimple_expression )
                    {
                    // InternalPascal.g:1104:5: (lv_expression_2_0= rulesimple_expression )
                    // InternalPascal.g:1105:6: lv_expression_2_0= rulesimple_expression
                    {

                    						newCompositeNode(grammarAccess.getSimple_expressionAccess().getExpressionSimple_expressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=rulesimple_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
                    						}
                    						add(
                    							current,
                    							"expression",
                    							lv_expression_2_0,
                    							"org.xtext.compiler.pascal.Pascal.simple_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_expression"


    // $ANTLR start "entryRuleterm"
    // InternalPascal.g:1127:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalPascal.g:1127:45: (iv_ruleterm= ruleterm EOF )
            // InternalPascal.g:1128:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // InternalPascal.g:1134:1: ruleterm returns [EObject current=null] : ( ( (lv_factors_0_0= rulesigned_factor ) ) ( ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) ) )? ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        EObject lv_factors_0_0 = null;

        AntlrDatatypeRuleToken lv_operators_1_0 = null;

        EObject lv_terms_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1140:2: ( ( ( (lv_factors_0_0= rulesigned_factor ) ) ( ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) ) )? ) )
            // InternalPascal.g:1141:2: ( ( (lv_factors_0_0= rulesigned_factor ) ) ( ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) ) )? )
            {
            // InternalPascal.g:1141:2: ( ( (lv_factors_0_0= rulesigned_factor ) ) ( ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) ) )? )
            // InternalPascal.g:1142:3: ( (lv_factors_0_0= rulesigned_factor ) ) ( ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) ) )?
            {
            // InternalPascal.g:1142:3: ( (lv_factors_0_0= rulesigned_factor ) )
            // InternalPascal.g:1143:4: (lv_factors_0_0= rulesigned_factor )
            {
            // InternalPascal.g:1143:4: (lv_factors_0_0= rulesigned_factor )
            // InternalPascal.g:1144:5: lv_factors_0_0= rulesigned_factor
            {

            					newCompositeNode(grammarAccess.getTermAccess().getFactorsSigned_factorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_factors_0_0=rulesigned_factor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermRule());
            					}
            					add(
            						current,
            						"factors",
            						lv_factors_0_0,
            						"org.xtext.compiler.pascal.Pascal.signed_factor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:1161:3: ( ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STAR && LA14_0<=RULE_AND)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascal.g:1162:4: ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) )
                    {
                    // InternalPascal.g:1162:4: ( (lv_operators_1_0= rulemultiplicative_operator ) )
                    // InternalPascal.g:1163:5: (lv_operators_1_0= rulemultiplicative_operator )
                    {
                    // InternalPascal.g:1163:5: (lv_operators_1_0= rulemultiplicative_operator )
                    // InternalPascal.g:1164:6: lv_operators_1_0= rulemultiplicative_operator
                    {

                    						newCompositeNode(grammarAccess.getTermAccess().getOperatorsMultiplicative_operatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_operators_1_0=rulemultiplicative_operator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTermRule());
                    						}
                    						add(
                    							current,
                    							"operators",
                    							lv_operators_1_0,
                    							"org.xtext.compiler.pascal.Pascal.multiplicative_operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascal.g:1181:4: ( (lv_terms_2_0= ruleterm ) )
                    // InternalPascal.g:1182:5: (lv_terms_2_0= ruleterm )
                    {
                    // InternalPascal.g:1182:5: (lv_terms_2_0= ruleterm )
                    // InternalPascal.g:1183:6: lv_terms_2_0= ruleterm
                    {

                    						newCompositeNode(grammarAccess.getTermAccess().getTermsTermParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_terms_2_0=ruleterm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTermRule());
                    						}
                    						add(
                    							current,
                    							"terms",
                    							lv_terms_2_0,
                    							"org.xtext.compiler.pascal.Pascal.term");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulesigned_factor"
    // InternalPascal.g:1205:1: entryRulesigned_factor returns [EObject current=null] : iv_rulesigned_factor= rulesigned_factor EOF ;
    public final EObject entryRulesigned_factor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigned_factor = null;


        try {
            // InternalPascal.g:1205:54: (iv_rulesigned_factor= rulesigned_factor EOF )
            // InternalPascal.g:1206:2: iv_rulesigned_factor= rulesigned_factor EOF
            {
             newCompositeNode(grammarAccess.getSigned_factorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesigned_factor=rulesigned_factor();

            state._fsp--;

             current =iv_rulesigned_factor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesigned_factor"


    // $ANTLR start "rulesigned_factor"
    // InternalPascal.g:1212:1: rulesigned_factor returns [EObject current=null] : ( ( ( (lv_operators_0_0= RULE_PLUS ) ) | ( (lv_operators_1_0= RULE_MINUS ) ) )? ( (lv_factors_2_0= rulefactor ) ) ) ;
    public final EObject rulesigned_factor() throws RecognitionException {
        EObject current = null;

        Token lv_operators_0_0=null;
        Token lv_operators_1_0=null;
        EObject lv_factors_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1218:2: ( ( ( ( (lv_operators_0_0= RULE_PLUS ) ) | ( (lv_operators_1_0= RULE_MINUS ) ) )? ( (lv_factors_2_0= rulefactor ) ) ) )
            // InternalPascal.g:1219:2: ( ( ( (lv_operators_0_0= RULE_PLUS ) ) | ( (lv_operators_1_0= RULE_MINUS ) ) )? ( (lv_factors_2_0= rulefactor ) ) )
            {
            // InternalPascal.g:1219:2: ( ( ( (lv_operators_0_0= RULE_PLUS ) ) | ( (lv_operators_1_0= RULE_MINUS ) ) )? ( (lv_factors_2_0= rulefactor ) ) )
            // InternalPascal.g:1220:3: ( ( (lv_operators_0_0= RULE_PLUS ) ) | ( (lv_operators_1_0= RULE_MINUS ) ) )? ( (lv_factors_2_0= rulefactor ) )
            {
            // InternalPascal.g:1220:3: ( ( (lv_operators_0_0= RULE_PLUS ) ) | ( (lv_operators_1_0= RULE_MINUS ) ) )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_PLUS) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_MINUS) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1221:4: ( (lv_operators_0_0= RULE_PLUS ) )
                    {
                    // InternalPascal.g:1221:4: ( (lv_operators_0_0= RULE_PLUS ) )
                    // InternalPascal.g:1222:5: (lv_operators_0_0= RULE_PLUS )
                    {
                    // InternalPascal.g:1222:5: (lv_operators_0_0= RULE_PLUS )
                    // InternalPascal.g:1223:6: lv_operators_0_0= RULE_PLUS
                    {
                    lv_operators_0_0=(Token)match(input,RULE_PLUS,FOLLOW_16); 

                    						newLeafNode(lv_operators_0_0, grammarAccess.getSigned_factorAccess().getOperatorsPLUSTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSigned_factorRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"operators",
                    							lv_operators_0_0,
                    							"org.xtext.compiler.pascal.Pascal.PLUS");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1240:4: ( (lv_operators_1_0= RULE_MINUS ) )
                    {
                    // InternalPascal.g:1240:4: ( (lv_operators_1_0= RULE_MINUS ) )
                    // InternalPascal.g:1241:5: (lv_operators_1_0= RULE_MINUS )
                    {
                    // InternalPascal.g:1241:5: (lv_operators_1_0= RULE_MINUS )
                    // InternalPascal.g:1242:6: lv_operators_1_0= RULE_MINUS
                    {
                    lv_operators_1_0=(Token)match(input,RULE_MINUS,FOLLOW_16); 

                    						newLeafNode(lv_operators_1_0, grammarAccess.getSigned_factorAccess().getOperatorsMINUSTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSigned_factorRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"operators",
                    							lv_operators_1_0,
                    							"org.xtext.compiler.pascal.Pascal.MINUS");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPascal.g:1259:3: ( (lv_factors_2_0= rulefactor ) )
            // InternalPascal.g:1260:4: (lv_factors_2_0= rulefactor )
            {
            // InternalPascal.g:1260:4: (lv_factors_2_0= rulefactor )
            // InternalPascal.g:1261:5: lv_factors_2_0= rulefactor
            {

            					newCompositeNode(grammarAccess.getSigned_factorAccess().getFactorsFactorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_factors_2_0=rulefactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSigned_factorRule());
            					}
            					add(
            						current,
            						"factors",
            						lv_factors_2_0,
            						"org.xtext.compiler.pascal.Pascal.factor");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesigned_factor"


    // $ANTLR start "entryRulefactor"
    // InternalPascal.g:1282:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // InternalPascal.g:1282:47: (iv_rulefactor= rulefactor EOF )
            // InternalPascal.g:1283:2: iv_rulefactor= rulefactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefactor=rulefactor();

            state._fsp--;

             current =iv_rulefactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefactor"


    // $ANTLR start "rulefactor"
    // InternalPascal.g:1289:1: rulefactor returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= '(' this_expression_2= ruleexpression otherlv_3= ')' ) | this_unsigned_constant_4= ruleunsigned_constant | this_set_5= ruleset | (this_NOT_6= RULE_NOT this_factor_7= rulefactor ) | rulebool ) ;
    public final EObject rulefactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_NOT_6=null;
        EObject lv_variable_0_0 = null;

        EObject this_expression_2 = null;

        EObject this_unsigned_constant_4 = null;

        EObject this_set_5 = null;

        EObject this_factor_7 = null;



        	enterRule();

        try {
            // InternalPascal.g:1295:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= '(' this_expression_2= ruleexpression otherlv_3= ')' ) | this_unsigned_constant_4= ruleunsigned_constant | this_set_5= ruleset | (this_NOT_6= RULE_NOT this_factor_7= rulefactor ) | rulebool ) )
            // InternalPascal.g:1296:2: ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= '(' this_expression_2= ruleexpression otherlv_3= ')' ) | this_unsigned_constant_4= ruleunsigned_constant | this_set_5= ruleset | (this_NOT_6= RULE_NOT this_factor_7= rulefactor ) | rulebool )
            {
            // InternalPascal.g:1296:2: ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= '(' this_expression_2= ruleexpression otherlv_3= ')' ) | this_unsigned_constant_4= ruleunsigned_constant | this_set_5= ruleset | (this_NOT_6= RULE_NOT this_factor_7= rulefactor ) | rulebool )
            int alt16=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 44:
                {
                alt16=1;
                }
                break;
            case 37:
                {
                alt16=2;
                }
                break;
            case RULE_STRING:
            case RULE_NIL:
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
            case 50:
                {
                alt16=3;
                }
                break;
            case 45:
            case 47:
                {
                alt16=4;
                }
                break;
            case RULE_NOT:
                {
                alt16=5;
                }
                break;
            case RULE_TRUE:
            case RULE_FALSE:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1297:3: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // InternalPascal.g:1297:3: ( (lv_variable_0_0= rulevariable ) )
                    // InternalPascal.g:1298:4: (lv_variable_0_0= rulevariable )
                    {
                    // InternalPascal.g:1298:4: (lv_variable_0_0= rulevariable )
                    // InternalPascal.g:1299:5: lv_variable_0_0= rulevariable
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_0_0=rulevariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_0_0,
                    						"org.xtext.compiler.pascal.Pascal.variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1317:3: (otherlv_1= '(' this_expression_2= ruleexpression otherlv_3= ')' )
                    {
                    // InternalPascal.g:1317:3: (otherlv_1= '(' this_expression_2= ruleexpression otherlv_3= ')' )
                    // InternalPascal.g:1318:4: otherlv_1= '(' this_expression_2= ruleexpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getFactorAccess().getExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_7);
                    this_expression_2=ruleexpression();

                    state._fsp--;


                    				current = this_expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1336:3: this_unsigned_constant_4= ruleunsigned_constant
                    {

                    			newCompositeNode(grammarAccess.getFactorAccess().getUnsigned_constantParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_unsigned_constant_4=ruleunsigned_constant();

                    state._fsp--;


                    			current = this_unsigned_constant_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPascal.g:1345:3: this_set_5= ruleset
                    {

                    			newCompositeNode(grammarAccess.getFactorAccess().getSetParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_set_5=ruleset();

                    state._fsp--;


                    			current = this_set_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPascal.g:1354:3: (this_NOT_6= RULE_NOT this_factor_7= rulefactor )
                    {
                    // InternalPascal.g:1354:3: (this_NOT_6= RULE_NOT this_factor_7= rulefactor )
                    // InternalPascal.g:1355:4: this_NOT_6= RULE_NOT this_factor_7= rulefactor
                    {
                    this_NOT_6=(Token)match(input,RULE_NOT,FOLLOW_16); 

                    				newLeafNode(this_NOT_6, grammarAccess.getFactorAccess().getNOTTerminalRuleCall_4_0());
                    			

                    				newCompositeNode(grammarAccess.getFactorAccess().getFactorParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_factor_7=rulefactor();

                    state._fsp--;


                    				current = this_factor_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:1369:3: rulebool
                    {

                    			newCompositeNode(grammarAccess.getFactorAccess().getBoolParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    rulebool();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRuleset"
    // InternalPascal.g:1380:1: entryRuleset returns [EObject current=null] : iv_ruleset= ruleset EOF ;
    public final EObject entryRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset = null;


        try {
            // InternalPascal.g:1380:44: (iv_ruleset= ruleset EOF )
            // InternalPascal.g:1381:2: iv_ruleset= ruleset EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleset=ruleset();

            state._fsp--;

             current =iv_ruleset; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleset"


    // $ANTLR start "ruleset"
    // InternalPascal.g:1387:1: ruleset returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']' ) | (otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)' ) ) ;
    public final EObject ruleset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1393:2: ( ( (otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']' ) | (otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)' ) ) )
            // InternalPascal.g:1394:2: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']' ) | (otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)' ) )
            {
            // InternalPascal.g:1394:2: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']' ) | (otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            else if ( (LA17_0==47) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalPascal.g:1395:3: (otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']' )
                    {
                    // InternalPascal.g:1395:3: (otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']' )
                    // InternalPascal.g:1396:4: otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_16); 

                    				newLeafNode(otherlv_0, grammarAccess.getSetAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalPascal.g:1400:4: ( (lv_elements_1_0= ruleelementList ) )
                    // InternalPascal.g:1401:5: (lv_elements_1_0= ruleelementList )
                    {
                    // InternalPascal.g:1401:5: (lv_elements_1_0= ruleelementList )
                    // InternalPascal.g:1402:6: lv_elements_1_0= ruleelementList
                    {

                    						newCompositeNode(grammarAccess.getSetAccess().getElementsElementListParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_elements_1_0=ruleelementList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_1_0,
                    							"org.xtext.compiler.pascal.Pascal.elementList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,46,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getSetAccess().getRightSquareBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1425:3: (otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)' )
                    {
                    // InternalPascal.g:1425:3: (otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)' )
                    // InternalPascal.g:1426:4: otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)'
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getSetAccess().getLeftParenthesisFullStopKeyword_1_0());
                    			
                    // InternalPascal.g:1430:4: ( (lv_elements_4_0= ruleelementList ) )
                    // InternalPascal.g:1431:5: (lv_elements_4_0= ruleelementList )
                    {
                    // InternalPascal.g:1431:5: (lv_elements_4_0= ruleelementList )
                    // InternalPascal.g:1432:6: lv_elements_4_0= ruleelementList
                    {

                    						newCompositeNode(grammarAccess.getSetAccess().getElementsElementListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_elements_4_0=ruleelementList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_4_0,
                    							"org.xtext.compiler.pascal.Pascal.elementList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,48,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSetAccess().getFullStopRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleset"


    // $ANTLR start "entryRuleelementList"
    // InternalPascal.g:1458:1: entryRuleelementList returns [EObject current=null] : iv_ruleelementList= ruleelementList EOF ;
    public final EObject entryRuleelementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelementList = null;


        try {
            // InternalPascal.g:1458:52: (iv_ruleelementList= ruleelementList EOF )
            // InternalPascal.g:1459:2: iv_ruleelementList= ruleelementList EOF
            {
             newCompositeNode(grammarAccess.getElementListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleelementList=ruleelementList();

            state._fsp--;

             current =iv_ruleelementList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleelementList"


    // $ANTLR start "ruleelementList"
    // InternalPascal.g:1465:1: ruleelementList returns [EObject current=null] : ( ( (lv_elements_0_0= ruleelement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) ) )* ) ;
    public final EObject ruleelementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1471:2: ( ( ( (lv_elements_0_0= ruleelement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) ) )* ) )
            // InternalPascal.g:1472:2: ( ( (lv_elements_0_0= ruleelement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) ) )* )
            {
            // InternalPascal.g:1472:2: ( ( (lv_elements_0_0= ruleelement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) ) )* )
            // InternalPascal.g:1473:3: ( (lv_elements_0_0= ruleelement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) ) )*
            {
            // InternalPascal.g:1473:3: ( (lv_elements_0_0= ruleelement ) )
            // InternalPascal.g:1474:4: (lv_elements_0_0= ruleelement )
            {
            // InternalPascal.g:1474:4: (lv_elements_0_0= ruleelement )
            // InternalPascal.g:1475:5: lv_elements_0_0= ruleelement
            {

            					newCompositeNode(grammarAccess.getElementListAccess().getElementsElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_elements_0_0=ruleelement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementListRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"org.xtext.compiler.pascal.Pascal.element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:1492:3: (otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==40) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPascal.g:1493:4: otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) )
            	    {
            	    otherlv_1=(Token)match(input,40,FOLLOW_16); 

            	    				newLeafNode(otherlv_1, grammarAccess.getElementListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:1497:4: ( (lv_elements_2_0= ruleelement ) )
            	    // InternalPascal.g:1498:5: (lv_elements_2_0= ruleelement )
            	    {
            	    // InternalPascal.g:1498:5: (lv_elements_2_0= ruleelement )
            	    // InternalPascal.g:1499:6: lv_elements_2_0= ruleelement
            	    {

            	    						newCompositeNode(grammarAccess.getElementListAccess().getElementsElementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_elements_2_0=ruleelement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getElementListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_2_0,
            	    							"org.xtext.compiler.pascal.Pascal.element");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleelementList"


    // $ANTLR start "entryRuleelement"
    // InternalPascal.g:1521:1: entryRuleelement returns [EObject current=null] : iv_ruleelement= ruleelement EOF ;
    public final EObject entryRuleelement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelement = null;


        try {
            // InternalPascal.g:1521:48: (iv_ruleelement= ruleelement EOF )
            // InternalPascal.g:1522:2: iv_ruleelement= ruleelement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleelement=ruleelement();

            state._fsp--;

             current =iv_ruleelement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleelement"


    // $ANTLR start "ruleelement"
    // InternalPascal.g:1528:1: ruleelement returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleexpression ) ) ( ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? ) ;
    public final EObject ruleelement() throws RecognitionException {
        EObject current = null;

        Token lv_dotdot_1_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1534:2: ( ( ( (lv_expressions_0_0= ruleexpression ) ) ( ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? ) )
            // InternalPascal.g:1535:2: ( ( (lv_expressions_0_0= ruleexpression ) ) ( ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? )
            {
            // InternalPascal.g:1535:2: ( ( (lv_expressions_0_0= ruleexpression ) ) ( ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? )
            // InternalPascal.g:1536:3: ( (lv_expressions_0_0= ruleexpression ) ) ( ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) ) )?
            {
            // InternalPascal.g:1536:3: ( (lv_expressions_0_0= ruleexpression ) )
            // InternalPascal.g:1537:4: (lv_expressions_0_0= ruleexpression )
            {
            // InternalPascal.g:1537:4: (lv_expressions_0_0= ruleexpression )
            // InternalPascal.g:1538:5: lv_expressions_0_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getElementAccess().getExpressionsExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_expressions_0_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_0_0,
            						"org.xtext.compiler.pascal.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:1555:3: ( ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DOTDOT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPascal.g:1556:4: ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) )
                    {
                    // InternalPascal.g:1556:4: ( (lv_dotdot_1_0= RULE_DOTDOT ) )
                    // InternalPascal.g:1557:5: (lv_dotdot_1_0= RULE_DOTDOT )
                    {
                    // InternalPascal.g:1557:5: (lv_dotdot_1_0= RULE_DOTDOT )
                    // InternalPascal.g:1558:6: lv_dotdot_1_0= RULE_DOTDOT
                    {
                    lv_dotdot_1_0=(Token)match(input,RULE_DOTDOT,FOLLOW_16); 

                    						newLeafNode(lv_dotdot_1_0, grammarAccess.getElementAccess().getDotdotDOTDOTTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"dotdot",
                    							lv_dotdot_1_0,
                    							"org.xtext.compiler.pascal.Pascal.DOTDOT");
                    					

                    }


                    }

                    // InternalPascal.g:1574:4: ( (lv_expressions_2_0= ruleexpression ) )
                    // InternalPascal.g:1575:5: (lv_expressions_2_0= ruleexpression )
                    {
                    // InternalPascal.g:1575:5: (lv_expressions_2_0= ruleexpression )
                    // InternalPascal.g:1576:6: lv_expressions_2_0= ruleexpression
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getExpressionsExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expressions_2_0=ruleexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						add(
                    							current,
                    							"expressions",
                    							lv_expressions_2_0,
                    							"org.xtext.compiler.pascal.Pascal.expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleelement"


    // $ANTLR start "entryRuleunsigned_constant"
    // InternalPascal.g:1598:1: entryRuleunsigned_constant returns [EObject current=null] : iv_ruleunsigned_constant= ruleunsigned_constant EOF ;
    public final EObject entryRuleunsigned_constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_constant = null;


        try {
            // InternalPascal.g:1598:58: (iv_ruleunsigned_constant= ruleunsigned_constant EOF )
            // InternalPascal.g:1599:2: iv_ruleunsigned_constant= ruleunsigned_constant EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_constantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunsigned_constant=ruleunsigned_constant();

            state._fsp--;

             current =iv_ruleunsigned_constant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunsigned_constant"


    // $ANTLR start "ruleunsigned_constant"
    // InternalPascal.g:1605:1: ruleunsigned_constant returns [EObject current=null] : ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_char_1_0= ruleconstant_chr ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_nil_3_0= RULE_NIL ) ) ) ;
    public final EObject ruleunsigned_constant() throws RecognitionException {
        EObject current = null;

        Token lv_string_2_0=null;
        Token lv_nil_3_0=null;
        EObject lv_number_0_0 = null;

        EObject lv_char_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1611:2: ( ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_char_1_0= ruleconstant_chr ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_nil_3_0= RULE_NIL ) ) ) )
            // InternalPascal.g:1612:2: ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_char_1_0= ruleconstant_chr ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_nil_3_0= RULE_NIL ) ) )
            {
            // InternalPascal.g:1612:2: ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_char_1_0= ruleconstant_chr ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_nil_3_0= RULE_NIL ) ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
                {
                alt20=1;
                }
                break;
            case 50:
                {
                alt20=2;
                }
                break;
            case RULE_STRING:
                {
                alt20=3;
                }
                break;
            case RULE_NIL:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalPascal.g:1613:3: ( (lv_number_0_0= ruleunsigned_number ) )
                    {
                    // InternalPascal.g:1613:3: ( (lv_number_0_0= ruleunsigned_number ) )
                    // InternalPascal.g:1614:4: (lv_number_0_0= ruleunsigned_number )
                    {
                    // InternalPascal.g:1614:4: (lv_number_0_0= ruleunsigned_number )
                    // InternalPascal.g:1615:5: lv_number_0_0= ruleunsigned_number
                    {

                    					newCompositeNode(grammarAccess.getUnsigned_constantAccess().getNumberUnsigned_numberParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_number_0_0=ruleunsigned_number();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnsigned_constantRule());
                    					}
                    					add(
                    						current,
                    						"number",
                    						lv_number_0_0,
                    						"org.xtext.compiler.pascal.Pascal.unsigned_number");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1633:3: ( (lv_char_1_0= ruleconstant_chr ) )
                    {
                    // InternalPascal.g:1633:3: ( (lv_char_1_0= ruleconstant_chr ) )
                    // InternalPascal.g:1634:4: (lv_char_1_0= ruleconstant_chr )
                    {
                    // InternalPascal.g:1634:4: (lv_char_1_0= ruleconstant_chr )
                    // InternalPascal.g:1635:5: lv_char_1_0= ruleconstant_chr
                    {

                    					newCompositeNode(grammarAccess.getUnsigned_constantAccess().getCharConstant_chrParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_char_1_0=ruleconstant_chr();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnsigned_constantRule());
                    					}
                    					add(
                    						current,
                    						"char",
                    						lv_char_1_0,
                    						"org.xtext.compiler.pascal.Pascal.constant_chr");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1653:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalPascal.g:1653:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalPascal.g:1654:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalPascal.g:1654:4: (lv_string_2_0= RULE_STRING )
                    // InternalPascal.g:1655:5: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_2_0, grammarAccess.getUnsigned_constantAccess().getStringSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnsigned_constantRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1672:3: ( (lv_nil_3_0= RULE_NIL ) )
                    {
                    // InternalPascal.g:1672:3: ( (lv_nil_3_0= RULE_NIL ) )
                    // InternalPascal.g:1673:4: (lv_nil_3_0= RULE_NIL )
                    {
                    // InternalPascal.g:1673:4: (lv_nil_3_0= RULE_NIL )
                    // InternalPascal.g:1674:5: lv_nil_3_0= RULE_NIL
                    {
                    lv_nil_3_0=(Token)match(input,RULE_NIL,FOLLOW_2); 

                    					newLeafNode(lv_nil_3_0, grammarAccess.getUnsigned_constantAccess().getNilNILTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnsigned_constantRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"nil",
                    						lv_nil_3_0,
                    						"org.xtext.compiler.pascal.Pascal.NIL");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunsigned_constant"


    // $ANTLR start "entryRuleunsigned_number"
    // InternalPascal.g:1694:1: entryRuleunsigned_number returns [EObject current=null] : iv_ruleunsigned_number= ruleunsigned_number EOF ;
    public final EObject entryRuleunsigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_number = null;


        try {
            // InternalPascal.g:1694:56: (iv_ruleunsigned_number= ruleunsigned_number EOF )
            // InternalPascal.g:1695:2: iv_ruleunsigned_number= ruleunsigned_number EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_numberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunsigned_number=ruleunsigned_number();

            state._fsp--;

             current =iv_ruleunsigned_number; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunsigned_number"


    // $ANTLR start "ruleunsigned_number"
    // InternalPascal.g:1701:1: ruleunsigned_number returns [EObject current=null] : ( ( (lv_numbers_0_0= ruleunsigned_integer ) ) | ( (lv_numbers_1_0= ruleunsigned_real ) ) ) ;
    public final EObject ruleunsigned_number() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_numbers_0_0 = null;

        AntlrDatatypeRuleToken lv_numbers_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1707:2: ( ( ( (lv_numbers_0_0= ruleunsigned_integer ) ) | ( (lv_numbers_1_0= ruleunsigned_real ) ) ) )
            // InternalPascal.g:1708:2: ( ( (lv_numbers_0_0= ruleunsigned_integer ) ) | ( (lv_numbers_1_0= ruleunsigned_real ) ) )
            {
            // InternalPascal.g:1708:2: ( ( (lv_numbers_0_0= ruleunsigned_integer ) ) | ( (lv_numbers_1_0= ruleunsigned_real ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_NUM_INT) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_NUM_REAL) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPascal.g:1709:3: ( (lv_numbers_0_0= ruleunsigned_integer ) )
                    {
                    // InternalPascal.g:1709:3: ( (lv_numbers_0_0= ruleunsigned_integer ) )
                    // InternalPascal.g:1710:4: (lv_numbers_0_0= ruleunsigned_integer )
                    {
                    // InternalPascal.g:1710:4: (lv_numbers_0_0= ruleunsigned_integer )
                    // InternalPascal.g:1711:5: lv_numbers_0_0= ruleunsigned_integer
                    {

                    					newCompositeNode(grammarAccess.getUnsigned_numberAccess().getNumbersUnsigned_integerParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_numbers_0_0=ruleunsigned_integer();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnsigned_numberRule());
                    					}
                    					add(
                    						current,
                    						"numbers",
                    						lv_numbers_0_0,
                    						"org.xtext.compiler.pascal.Pascal.unsigned_integer");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1729:3: ( (lv_numbers_1_0= ruleunsigned_real ) )
                    {
                    // InternalPascal.g:1729:3: ( (lv_numbers_1_0= ruleunsigned_real ) )
                    // InternalPascal.g:1730:4: (lv_numbers_1_0= ruleunsigned_real )
                    {
                    // InternalPascal.g:1730:4: (lv_numbers_1_0= ruleunsigned_real )
                    // InternalPascal.g:1731:5: lv_numbers_1_0= ruleunsigned_real
                    {

                    					newCompositeNode(grammarAccess.getUnsigned_numberAccess().getNumbersUnsigned_realParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_numbers_1_0=ruleunsigned_real();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnsigned_numberRule());
                    					}
                    					add(
                    						current,
                    						"numbers",
                    						lv_numbers_1_0,
                    						"org.xtext.compiler.pascal.Pascal.unsigned_real");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunsigned_number"


    // $ANTLR start "entryRuleconstant_chr"
    // InternalPascal.g:1752:1: entryRuleconstant_chr returns [EObject current=null] : iv_ruleconstant_chr= ruleconstant_chr EOF ;
    public final EObject entryRuleconstant_chr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_chr = null;


        try {
            // InternalPascal.g:1752:53: (iv_ruleconstant_chr= ruleconstant_chr EOF )
            // InternalPascal.g:1753:2: iv_ruleconstant_chr= ruleconstant_chr EOF
            {
             newCompositeNode(grammarAccess.getConstant_chrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant_chr=ruleconstant_chr();

            state._fsp--;

             current =iv_ruleconstant_chr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant_chr"


    // $ANTLR start "ruleconstant_chr"
    // InternalPascal.g:1759:1: ruleconstant_chr returns [EObject current=null] : (otherlv_0= 'chr' otherlv_1= '(' ( (lv_numbers_2_0= ruleunsigned_integer ) ) otherlv_3= ')' ) ;
    public final EObject ruleconstant_chr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_numbers_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1765:2: ( (otherlv_0= 'chr' otherlv_1= '(' ( (lv_numbers_2_0= ruleunsigned_integer ) ) otherlv_3= ')' ) )
            // InternalPascal.g:1766:2: (otherlv_0= 'chr' otherlv_1= '(' ( (lv_numbers_2_0= ruleunsigned_integer ) ) otherlv_3= ')' )
            {
            // InternalPascal.g:1766:2: (otherlv_0= 'chr' otherlv_1= '(' ( (lv_numbers_2_0= ruleunsigned_integer ) ) otherlv_3= ')' )
            // InternalPascal.g:1767:3: otherlv_0= 'chr' otherlv_1= '(' ( (lv_numbers_2_0= ruleunsigned_integer ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getConstant_chrAccess().getChrKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getConstant_chrAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPascal.g:1775:3: ( (lv_numbers_2_0= ruleunsigned_integer ) )
            // InternalPascal.g:1776:4: (lv_numbers_2_0= ruleunsigned_integer )
            {
            // InternalPascal.g:1776:4: (lv_numbers_2_0= ruleunsigned_integer )
            // InternalPascal.g:1777:5: lv_numbers_2_0= ruleunsigned_integer
            {

            					newCompositeNode(grammarAccess.getConstant_chrAccess().getNumbersUnsigned_integerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_numbers_2_0=ruleunsigned_integer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstant_chrRule());
            					}
            					add(
            						current,
            						"numbers",
            						lv_numbers_2_0,
            						"org.xtext.compiler.pascal.Pascal.unsigned_integer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConstant_chrAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant_chr"


    // $ANTLR start "entryRuleprocedure_statement"
    // InternalPascal.g:1802:1: entryRuleprocedure_statement returns [String current=null] : iv_ruleprocedure_statement= ruleprocedure_statement EOF ;
    public final String entryRuleprocedure_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprocedure_statement = null;


        try {
            // InternalPascal.g:1802:59: (iv_ruleprocedure_statement= ruleprocedure_statement EOF )
            // InternalPascal.g:1803:2: iv_ruleprocedure_statement= ruleprocedure_statement EOF
            {
             newCompositeNode(grammarAccess.getProcedure_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_statement=ruleprocedure_statement();

            state._fsp--;

             current =iv_ruleprocedure_statement.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedure_statement"


    // $ANTLR start "ruleprocedure_statement"
    // InternalPascal.g:1809:1: ruleprocedure_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'procedure' ;
    public final AntlrDatatypeRuleToken ruleprocedure_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:1815:2: (kw= 'procedure' )
            // InternalPascal.g:1816:2: kw= 'procedure'
            {
            kw=(Token)match(input,51,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getProcedure_statementAccess().getProcedureKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_statement"


    // $ANTLR start "entryRulegoto_statement"
    // InternalPascal.g:1824:1: entryRulegoto_statement returns [String current=null] : iv_rulegoto_statement= rulegoto_statement EOF ;
    public final String entryRulegoto_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegoto_statement = null;


        try {
            // InternalPascal.g:1824:54: (iv_rulegoto_statement= rulegoto_statement EOF )
            // InternalPascal.g:1825:2: iv_rulegoto_statement= rulegoto_statement EOF
            {
             newCompositeNode(grammarAccess.getGoto_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulegoto_statement=rulegoto_statement();

            state._fsp--;

             current =iv_rulegoto_statement.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegoto_statement"


    // $ANTLR start "rulegoto_statement"
    // InternalPascal.g:1831:1: rulegoto_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'goto' ;
    public final AntlrDatatypeRuleToken rulegoto_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:1837:2: (kw= 'goto' )
            // InternalPascal.g:1838:2: kw= 'goto'
            {
            kw=(Token)match(input,52,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getGoto_statementAccess().getGotoKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegoto_statement"


    // $ANTLR start "entryRulestructured_statement"
    // InternalPascal.g:1846:1: entryRulestructured_statement returns [String current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final String entryRulestructured_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestructured_statement = null;


        try {
            // InternalPascal.g:1846:60: (iv_rulestructured_statement= rulestructured_statement EOF )
            // InternalPascal.g:1847:2: iv_rulestructured_statement= rulestructured_statement EOF
            {
             newCompositeNode(grammarAccess.getStructured_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestructured_statement=rulestructured_statement();

            state._fsp--;

             current =iv_rulestructured_statement.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestructured_statement"


    // $ANTLR start "rulestructured_statement"
    // InternalPascal.g:1853:1: rulestructured_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'structured' ;
    public final AntlrDatatypeRuleToken rulestructured_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:1859:2: (kw= 'structured' )
            // InternalPascal.g:1860:2: kw= 'structured'
            {
            kw=(Token)match(input,53,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getStructured_statementAccess().getStructuredKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructured_statement"


    // $ANTLR start "entryRuleunsigned_integer"
    // InternalPascal.g:1868:1: entryRuleunsigned_integer returns [String current=null] : iv_ruleunsigned_integer= ruleunsigned_integer EOF ;
    public final String entryRuleunsigned_integer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsigned_integer = null;


        try {
            // InternalPascal.g:1868:56: (iv_ruleunsigned_integer= ruleunsigned_integer EOF )
            // InternalPascal.g:1869:2: iv_ruleunsigned_integer= ruleunsigned_integer EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_integerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunsigned_integer=ruleunsigned_integer();

            state._fsp--;

             current =iv_ruleunsigned_integer.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunsigned_integer"


    // $ANTLR start "ruleunsigned_integer"
    // InternalPascal.g:1875:1: ruleunsigned_integer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NUM_INT_0= RULE_NUM_INT ;
    public final AntlrDatatypeRuleToken ruleunsigned_integer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NUM_INT_0=null;


        	enterRule();

        try {
            // InternalPascal.g:1881:2: (this_NUM_INT_0= RULE_NUM_INT )
            // InternalPascal.g:1882:2: this_NUM_INT_0= RULE_NUM_INT
            {
            this_NUM_INT_0=(Token)match(input,RULE_NUM_INT,FOLLOW_2); 

            		current.merge(this_NUM_INT_0);
            	

            		newLeafNode(this_NUM_INT_0, grammarAccess.getUnsigned_integerAccess().getNUM_INTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunsigned_integer"


    // $ANTLR start "entryRuleunsigned_real"
    // InternalPascal.g:1892:1: entryRuleunsigned_real returns [String current=null] : iv_ruleunsigned_real= ruleunsigned_real EOF ;
    public final String entryRuleunsigned_real() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsigned_real = null;


        try {
            // InternalPascal.g:1892:53: (iv_ruleunsigned_real= ruleunsigned_real EOF )
            // InternalPascal.g:1893:2: iv_ruleunsigned_real= ruleunsigned_real EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_realRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunsigned_real=ruleunsigned_real();

            state._fsp--;

             current =iv_ruleunsigned_real.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunsigned_real"


    // $ANTLR start "ruleunsigned_real"
    // InternalPascal.g:1899:1: ruleunsigned_real returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NUM_REAL_0= RULE_NUM_REAL ;
    public final AntlrDatatypeRuleToken ruleunsigned_real() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NUM_REAL_0=null;


        	enterRule();

        try {
            // InternalPascal.g:1905:2: (this_NUM_REAL_0= RULE_NUM_REAL )
            // InternalPascal.g:1906:2: this_NUM_REAL_0= RULE_NUM_REAL
            {
            this_NUM_REAL_0=(Token)match(input,RULE_NUM_REAL,FOLLOW_2); 

            		current.merge(this_NUM_REAL_0);
            	

            		newLeafNode(this_NUM_REAL_0, grammarAccess.getUnsigned_realAccess().getNUM_REALTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunsigned_real"


    // $ANTLR start "entryRuleadditive_operator"
    // InternalPascal.g:1916:1: entryRuleadditive_operator returns [String current=null] : iv_ruleadditive_operator= ruleadditive_operator EOF ;
    public final String entryRuleadditive_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleadditive_operator = null;


        try {
            // InternalPascal.g:1916:57: (iv_ruleadditive_operator= ruleadditive_operator EOF )
            // InternalPascal.g:1917:2: iv_ruleadditive_operator= ruleadditive_operator EOF
            {
             newCompositeNode(grammarAccess.getAdditive_operatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleadditive_operator=ruleadditive_operator();

            state._fsp--;

             current =iv_ruleadditive_operator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleadditive_operator"


    // $ANTLR start "ruleadditive_operator"
    // InternalPascal.g:1923:1: ruleadditive_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_OR_2= RULE_OR ) ;
    public final AntlrDatatypeRuleToken ruleadditive_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_MINUS_1=null;
        Token this_OR_2=null;


        	enterRule();

        try {
            // InternalPascal.g:1929:2: ( (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_OR_2= RULE_OR ) )
            // InternalPascal.g:1930:2: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_OR_2= RULE_OR )
            {
            // InternalPascal.g:1930:2: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_OR_2= RULE_OR )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt22=1;
                }
                break;
            case RULE_MINUS:
                {
                alt22=2;
                }
                break;
            case RULE_OR:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalPascal.g:1931:3: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_2); 

                    			current.merge(this_PLUS_0);
                    		

                    			newLeafNode(this_PLUS_0, grammarAccess.getAdditive_operatorAccess().getPLUSTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1939:3: this_MINUS_1= RULE_MINUS
                    {
                    this_MINUS_1=(Token)match(input,RULE_MINUS,FOLLOW_2); 

                    			current.merge(this_MINUS_1);
                    		

                    			newLeafNode(this_MINUS_1, grammarAccess.getAdditive_operatorAccess().getMINUSTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascal.g:1947:3: this_OR_2= RULE_OR
                    {
                    this_OR_2=(Token)match(input,RULE_OR,FOLLOW_2); 

                    			current.merge(this_OR_2);
                    		

                    			newLeafNode(this_OR_2, grammarAccess.getAdditive_operatorAccess().getORTerminalRuleCall_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleadditive_operator"


    // $ANTLR start "entryRulemultiplicative_operator"
    // InternalPascal.g:1958:1: entryRulemultiplicative_operator returns [String current=null] : iv_rulemultiplicative_operator= rulemultiplicative_operator EOF ;
    public final String entryRulemultiplicative_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemultiplicative_operator = null;


        try {
            // InternalPascal.g:1958:63: (iv_rulemultiplicative_operator= rulemultiplicative_operator EOF )
            // InternalPascal.g:1959:2: iv_rulemultiplicative_operator= rulemultiplicative_operator EOF
            {
             newCompositeNode(grammarAccess.getMultiplicative_operatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemultiplicative_operator=rulemultiplicative_operator();

            state._fsp--;

             current =iv_rulemultiplicative_operator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemultiplicative_operator"


    // $ANTLR start "rulemultiplicative_operator"
    // InternalPascal.g:1965:1: rulemultiplicative_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_DIV_2= RULE_DIV | this_MOD_3= RULE_MOD | this_AND_4= RULE_AND ) ;
    public final AntlrDatatypeRuleToken rulemultiplicative_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STAR_0=null;
        Token this_SLASH_1=null;
        Token this_DIV_2=null;
        Token this_MOD_3=null;
        Token this_AND_4=null;


        	enterRule();

        try {
            // InternalPascal.g:1971:2: ( (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_DIV_2= RULE_DIV | this_MOD_3= RULE_MOD | this_AND_4= RULE_AND ) )
            // InternalPascal.g:1972:2: (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_DIV_2= RULE_DIV | this_MOD_3= RULE_MOD | this_AND_4= RULE_AND )
            {
            // InternalPascal.g:1972:2: (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_DIV_2= RULE_DIV | this_MOD_3= RULE_MOD | this_AND_4= RULE_AND )
            int alt23=5;
            switch ( input.LA(1) ) {
            case RULE_STAR:
                {
                alt23=1;
                }
                break;
            case RULE_SLASH:
                {
                alt23=2;
                }
                break;
            case RULE_DIV:
                {
                alt23=3;
                }
                break;
            case RULE_MOD:
                {
                alt23=4;
                }
                break;
            case RULE_AND:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalPascal.g:1973:3: this_STAR_0= RULE_STAR
                    {
                    this_STAR_0=(Token)match(input,RULE_STAR,FOLLOW_2); 

                    			current.merge(this_STAR_0);
                    		

                    			newLeafNode(this_STAR_0, grammarAccess.getMultiplicative_operatorAccess().getSTARTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1981:3: this_SLASH_1= RULE_SLASH
                    {
                    this_SLASH_1=(Token)match(input,RULE_SLASH,FOLLOW_2); 

                    			current.merge(this_SLASH_1);
                    		

                    			newLeafNode(this_SLASH_1, grammarAccess.getMultiplicative_operatorAccess().getSLASHTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascal.g:1989:3: this_DIV_2= RULE_DIV
                    {
                    this_DIV_2=(Token)match(input,RULE_DIV,FOLLOW_2); 

                    			current.merge(this_DIV_2);
                    		

                    			newLeafNode(this_DIV_2, grammarAccess.getMultiplicative_operatorAccess().getDIVTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPascal.g:1997:3: this_MOD_3= RULE_MOD
                    {
                    this_MOD_3=(Token)match(input,RULE_MOD,FOLLOW_2); 

                    			current.merge(this_MOD_3);
                    		

                    			newLeafNode(this_MOD_3, grammarAccess.getMultiplicative_operatorAccess().getMODTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPascal.g:2005:3: this_AND_4= RULE_AND
                    {
                    this_AND_4=(Token)match(input,RULE_AND,FOLLOW_2); 

                    			current.merge(this_AND_4);
                    		

                    			newLeafNode(this_AND_4, grammarAccess.getMultiplicative_operatorAccess().getANDTerminalRuleCall_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemultiplicative_operator"


    // $ANTLR start "entryRulerelational_operator"
    // InternalPascal.g:2016:1: entryRulerelational_operator returns [String current=null] : iv_rulerelational_operator= rulerelational_operator EOF ;
    public final String entryRulerelational_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerelational_operator = null;


        try {
            // InternalPascal.g:2016:59: (iv_rulerelational_operator= rulerelational_operator EOF )
            // InternalPascal.g:2017:2: iv_rulerelational_operator= rulerelational_operator EOF
            {
             newCompositeNode(grammarAccess.getRelational_operatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerelational_operator=rulerelational_operator();

            state._fsp--;

             current =iv_rulerelational_operator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerelational_operator"


    // $ANTLR start "rulerelational_operator"
    // InternalPascal.g:2023:1: rulerelational_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_LT_2= RULE_LT | this_LE_3= RULE_LE | this_GE_4= RULE_GE | this_GT_5= RULE_GT | this_IN_6= RULE_IN ) ;
    public final AntlrDatatypeRuleToken rulerelational_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EQUAL_0=null;
        Token this_NOT_EQUAL_1=null;
        Token this_LT_2=null;
        Token this_LE_3=null;
        Token this_GE_4=null;
        Token this_GT_5=null;
        Token this_IN_6=null;


        	enterRule();

        try {
            // InternalPascal.g:2029:2: ( (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_LT_2= RULE_LT | this_LE_3= RULE_LE | this_GE_4= RULE_GE | this_GT_5= RULE_GT | this_IN_6= RULE_IN ) )
            // InternalPascal.g:2030:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_LT_2= RULE_LT | this_LE_3= RULE_LE | this_GE_4= RULE_GE | this_GT_5= RULE_GT | this_IN_6= RULE_IN )
            {
            // InternalPascal.g:2030:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_LT_2= RULE_LT | this_LE_3= RULE_LE | this_GE_4= RULE_GE | this_GT_5= RULE_GT | this_IN_6= RULE_IN )
            int alt24=7;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                alt24=1;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt24=2;
                }
                break;
            case RULE_LT:
                {
                alt24=3;
                }
                break;
            case RULE_LE:
                {
                alt24=4;
                }
                break;
            case RULE_GE:
                {
                alt24=5;
                }
                break;
            case RULE_GT:
                {
                alt24=6;
                }
                break;
            case RULE_IN:
                {
                alt24=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalPascal.g:2031:3: this_EQUAL_0= RULE_EQUAL
                    {
                    this_EQUAL_0=(Token)match(input,RULE_EQUAL,FOLLOW_2); 

                    			current.merge(this_EQUAL_0);
                    		

                    			newLeafNode(this_EQUAL_0, grammarAccess.getRelational_operatorAccess().getEQUALTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2039:3: this_NOT_EQUAL_1= RULE_NOT_EQUAL
                    {
                    this_NOT_EQUAL_1=(Token)match(input,RULE_NOT_EQUAL,FOLLOW_2); 

                    			current.merge(this_NOT_EQUAL_1);
                    		

                    			newLeafNode(this_NOT_EQUAL_1, grammarAccess.getRelational_operatorAccess().getNOT_EQUALTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascal.g:2047:3: this_LT_2= RULE_LT
                    {
                    this_LT_2=(Token)match(input,RULE_LT,FOLLOW_2); 

                    			current.merge(this_LT_2);
                    		

                    			newLeafNode(this_LT_2, grammarAccess.getRelational_operatorAccess().getLTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPascal.g:2055:3: this_LE_3= RULE_LE
                    {
                    this_LE_3=(Token)match(input,RULE_LE,FOLLOW_2); 

                    			current.merge(this_LE_3);
                    		

                    			newLeafNode(this_LE_3, grammarAccess.getRelational_operatorAccess().getLETerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPascal.g:2063:3: this_GE_4= RULE_GE
                    {
                    this_GE_4=(Token)match(input,RULE_GE,FOLLOW_2); 

                    			current.merge(this_GE_4);
                    		

                    			newLeafNode(this_GE_4, grammarAccess.getRelational_operatorAccess().getGETerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPascal.g:2071:3: this_GT_5= RULE_GT
                    {
                    this_GT_5=(Token)match(input,RULE_GT,FOLLOW_2); 

                    			current.merge(this_GT_5);
                    		

                    			newLeafNode(this_GT_5, grammarAccess.getRelational_operatorAccess().getGTTerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalPascal.g:2079:3: this_IN_6= RULE_IN
                    {
                    this_IN_6=(Token)match(input,RULE_IN,FOLLOW_2); 

                    			current.merge(this_IN_6);
                    		

                    			newLeafNode(this_IN_6, grammarAccess.getRelational_operatorAccess().getINTerminalRuleCall_6());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerelational_operator"


    // $ANTLR start "entryRulebool"
    // InternalPascal.g:2090:1: entryRulebool returns [String current=null] : iv_rulebool= rulebool EOF ;
    public final String entryRulebool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebool = null;


        try {
            // InternalPascal.g:2090:44: (iv_rulebool= rulebool EOF )
            // InternalPascal.g:2091:2: iv_rulebool= rulebool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebool=rulebool();

            state._fsp--;

             current =iv_rulebool.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebool"


    // $ANTLR start "rulebool"
    // InternalPascal.g:2097:1: rulebool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE ) ;
    public final AntlrDatatypeRuleToken rulebool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TRUE_0=null;
        Token this_FALSE_1=null;


        	enterRule();

        try {
            // InternalPascal.g:2103:2: ( (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE ) )
            // InternalPascal.g:2104:2: (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE )
            {
            // InternalPascal.g:2104:2: (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_TRUE) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_FALSE) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalPascal.g:2105:3: this_TRUE_0= RULE_TRUE
                    {
                    this_TRUE_0=(Token)match(input,RULE_TRUE,FOLLOW_2); 

                    			current.merge(this_TRUE_0);
                    		

                    			newLeafNode(this_TRUE_0, grammarAccess.getBoolAccess().getTRUETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2113:3: this_FALSE_1= RULE_FALSE
                    {
                    this_FALSE_1=(Token)match(input,RULE_FALSE,FOLLOW_2); 

                    			current.merge(this_FALSE_1);
                    		

                    			newLeafNode(this_FALSE_1, grammarAccess.getBoolAccess().getFALSETerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebool"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0038108000001010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0038100000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0004B02018003DD0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0002A00800000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000007F00002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000000040C2L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000F8002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001000L});

}