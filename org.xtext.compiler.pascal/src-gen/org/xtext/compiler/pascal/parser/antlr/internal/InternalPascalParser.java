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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_EQUAL", "RULE_STRING", "RULE_ASSIGN", "RULE_PLUS", "RULE_MINUS", "RULE_NOT", "RULE_DOTDOT", "RULE_NIL", "RULE_NUM_INT", "RULE_NUM_REAL", "RULE_OR", "RULE_STAR", "RULE_SLASH", "RULE_DIV", "RULE_MOD", "RULE_AND", "RULE_NOT_EQUAL", "RULE_LT", "RULE_LE", "RULE_GE", "RULE_GT", "RULE_IN", "RULE_TRUE", "RULE_FALSE", "RULE_EXPONENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "'('", "')'", "';'", "','", "'const'", "'var'", "':'", "'begin'", "'end'", "'@'", "'['", "']'", "'(.'", "'.)'", "'^'", "'CHAR'", "'boolean'", "'integer'", "'real'", "'string'", "'chr'", "'procedure'", "'goto'", "'structured'"
    };
    public static final int T__50=50;
    public static final int RULE_LE=23;
    public static final int RULE_GT=25;
    public static final int T__59=59;
    public static final int RULE_DIV=18;
    public static final int RULE_NIL=12;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_NOT_EQUAL=21;
    public static final int RULE_GE=24;
    public static final int T__51=51;
    public static final int RULE_DOTDOT=11;
    public static final int RULE_OR=15;
    public static final int RULE_STAR=16;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=4;
    public static final int RULE_EQUAL=5;
    public static final int RULE_MOD=19;
    public static final int RULE_ASSIGN=7;
    public static final int RULE_SLASH=17;
    public static final int RULE_LT=22;
    public static final int RULE_INT=30;
    public static final int RULE_ML_COMMENT=31;
    public static final int RULE_FALSE=28;
    public static final int RULE_STRING=6;
    public static final int RULE_NOT=10;
    public static final int RULE_AND=20;
    public static final int RULE_SL_COMMENT=32;
    public static final int RULE_IN=26;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_TRUE=27;
    public static final int T__35=35;
    public static final int RULE_PLUS=8;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int RULE_WS=33;
    public static final int RULE_NUM_REAL=14;
    public static final int RULE_ANY_OTHER=34;
    public static final int RULE_MINUS=9;
    public static final int RULE_EXPONENT=29;
    public static final int RULE_NUM_INT=13;
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
    // InternalPascal.g:303:1: ruleblock returns [EObject current=null] : ( ( ( (lv_constantpart_0_0= ruleconstant_definition_part ) ) | ( (lv_variablepart_1_0= rulevariable_declaration_part ) ) )* ( (lv_statement_2_0= rulecompound_statement ) ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_constantpart_0_0 = null;

        EObject lv_variablepart_1_0 = null;

        EObject lv_statement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:309:2: ( ( ( ( (lv_constantpart_0_0= ruleconstant_definition_part ) ) | ( (lv_variablepart_1_0= rulevariable_declaration_part ) ) )* ( (lv_statement_2_0= rulecompound_statement ) ) ) )
            // InternalPascal.g:310:2: ( ( ( (lv_constantpart_0_0= ruleconstant_definition_part ) ) | ( (lv_variablepart_1_0= rulevariable_declaration_part ) ) )* ( (lv_statement_2_0= rulecompound_statement ) ) )
            {
            // InternalPascal.g:310:2: ( ( ( (lv_constantpart_0_0= ruleconstant_definition_part ) ) | ( (lv_variablepart_1_0= rulevariable_declaration_part ) ) )* ( (lv_statement_2_0= rulecompound_statement ) ) )
            // InternalPascal.g:311:3: ( ( (lv_constantpart_0_0= ruleconstant_definition_part ) ) | ( (lv_variablepart_1_0= rulevariable_declaration_part ) ) )* ( (lv_statement_2_0= rulecompound_statement ) )
            {
            // InternalPascal.g:311:3: ( ( (lv_constantpart_0_0= ruleconstant_definition_part ) ) | ( (lv_variablepart_1_0= rulevariable_declaration_part ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==41) ) {
                    alt3=1;
                }
                else if ( (LA3_0==42) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPascal.g:312:4: ( (lv_constantpart_0_0= ruleconstant_definition_part ) )
            	    {
            	    // InternalPascal.g:312:4: ( (lv_constantpart_0_0= ruleconstant_definition_part ) )
            	    // InternalPascal.g:313:5: (lv_constantpart_0_0= ruleconstant_definition_part )
            	    {
            	    // InternalPascal.g:313:5: (lv_constantpart_0_0= ruleconstant_definition_part )
            	    // InternalPascal.g:314:6: lv_constantpart_0_0= ruleconstant_definition_part
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getConstantpartConstant_definition_partParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_constantpart_0_0=ruleconstant_definition_part();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constantpart",
            	    							lv_constantpart_0_0,
            	    							"org.xtext.compiler.pascal.Pascal.constant_definition_part");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPascal.g:332:4: ( (lv_variablepart_1_0= rulevariable_declaration_part ) )
            	    {
            	    // InternalPascal.g:332:4: ( (lv_variablepart_1_0= rulevariable_declaration_part ) )
            	    // InternalPascal.g:333:5: (lv_variablepart_1_0= rulevariable_declaration_part )
            	    {
            	    // InternalPascal.g:333:5: (lv_variablepart_1_0= rulevariable_declaration_part )
            	    // InternalPascal.g:334:6: lv_variablepart_1_0= rulevariable_declaration_part
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getVariablepartVariable_declaration_partParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_variablepart_1_0=rulevariable_declaration_part();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variablepart",
            	    							lv_variablepart_1_0,
            	    							"org.xtext.compiler.pascal.Pascal.variable_declaration_part");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalPascal.g:352:3: ( (lv_statement_2_0= rulecompound_statement ) )
            // InternalPascal.g:353:4: (lv_statement_2_0= rulecompound_statement )
            {
            // InternalPascal.g:353:4: (lv_statement_2_0= rulecompound_statement )
            // InternalPascal.g:354:5: lv_statement_2_0= rulecompound_statement
            {

            					newCompositeNode(grammarAccess.getBlockAccess().getStatementCompound_statementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_2_0=rulecompound_statement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_2_0,
            						"org.xtext.compiler.pascal.Pascal.compound_statement");
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
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRuleconstant_definition_part"
    // InternalPascal.g:375:1: entryRuleconstant_definition_part returns [EObject current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final EObject entryRuleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition_part = null;


        try {
            // InternalPascal.g:375:65: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // InternalPascal.g:376:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
            {
             newCompositeNode(grammarAccess.getConstant_definition_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant_definition_part=ruleconstant_definition_part();

            state._fsp--;

             current =iv_ruleconstant_definition_part; 
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
    // $ANTLR end "entryRuleconstant_definition_part"


    // $ANTLR start "ruleconstant_definition_part"
    // InternalPascal.g:382:1: ruleconstant_definition_part returns [EObject current=null] : (otherlv_0= 'const' ( ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_constants_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:388:2: ( (otherlv_0= 'const' ( ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ ) )
            // InternalPascal.g:389:2: (otherlv_0= 'const' ( ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ )
            {
            // InternalPascal.g:389:2: (otherlv_0= 'const' ( ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:390:3: otherlv_0= 'const' ( ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0());
            		
            // InternalPascal.g:394:3: ( ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPascal.g:395:4: ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:395:4: ( (lv_constants_1_0= ruleconstant_definition ) )
            	    // InternalPascal.g:396:5: (lv_constants_1_0= ruleconstant_definition )
            	    {
            	    // InternalPascal.g:396:5: (lv_constants_1_0= ruleconstant_definition )
            	    // InternalPascal.g:397:6: lv_constants_1_0= ruleconstant_definition
            	    {

            	    						newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstantsConstant_definitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_constants_1_0=ruleconstant_definition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstant_definition_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constants",
            	    							lv_constants_1_0,
            	    							"org.xtext.compiler.pascal.Pascal.constant_definition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end "ruleconstant_definition_part"


    // $ANTLR start "entryRuleconstant_definition"
    // InternalPascal.g:423:1: entryRuleconstant_definition returns [EObject current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final EObject entryRuleconstant_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition = null;


        try {
            // InternalPascal.g:423:60: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // InternalPascal.g:424:2: iv_ruleconstant_definition= ruleconstant_definition EOF
            {
             newCompositeNode(grammarAccess.getConstant_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant_definition=ruleconstant_definition();

            state._fsp--;

             current =iv_ruleconstant_definition; 
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
    // $ANTLR end "entryRuleconstant_definition"


    // $ANTLR start "ruleconstant_definition"
    // InternalPascal.g:430:1: ruleconstant_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL this_constant_2= ruleconstant ) ;
    public final EObject ruleconstant_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_EQUAL_1=null;
        EObject this_constant_2 = null;



        	enterRule();

        try {
            // InternalPascal.g:436:2: ( ( ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL this_constant_2= ruleconstant ) )
            // InternalPascal.g:437:2: ( ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL this_constant_2= ruleconstant )
            {
            // InternalPascal.g:437:2: ( ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL this_constant_2= ruleconstant )
            // InternalPascal.g:438:3: ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL this_constant_2= ruleconstant
            {
            // InternalPascal.g:438:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:439:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:439:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:440:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstant_definitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FOLLOW_12); 

            			newLeafNode(this_EQUAL_1, grammarAccess.getConstant_definitionAccess().getEQUALTerminalRuleCall_1());
            		

            			newCompositeNode(grammarAccess.getConstant_definitionAccess().getConstantParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_constant_2=ruleconstant();

            state._fsp--;


            			current = this_constant_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleconstant_definition"


    // $ANTLR start "entryRuleconstant"
    // InternalPascal.g:472:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // InternalPascal.g:472:49: (iv_ruleconstant= ruleconstant EOF )
            // InternalPascal.g:473:2: iv_ruleconstant= ruleconstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant=ruleconstant();

            state._fsp--;

             current =iv_ruleconstant; 
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
    // $ANTLR end "entryRuleconstant"


    // $ANTLR start "ruleconstant"
    // InternalPascal.g:479:1: ruleconstant returns [EObject current=null] : (this_unsigned_number_0= ruleunsigned_number | ( rulesign this_unsigned_number_2= ruleunsigned_number ) | ( (lv_names_3_0= RULE_ID ) ) | ( rulesign ( (lv_names_5_0= RULE_ID ) ) ) | ( (lv_string_6_0= RULE_STRING ) ) | this_constant_chr_7= ruleconstant_chr ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        Token lv_names_3_0=null;
        Token lv_names_5_0=null;
        Token lv_string_6_0=null;
        EObject this_unsigned_number_0 = null;

        EObject this_unsigned_number_2 = null;

        EObject this_constant_chr_7 = null;



        	enterRule();

        try {
            // InternalPascal.g:485:2: ( (this_unsigned_number_0= ruleunsigned_number | ( rulesign this_unsigned_number_2= ruleunsigned_number ) | ( (lv_names_3_0= RULE_ID ) ) | ( rulesign ( (lv_names_5_0= RULE_ID ) ) ) | ( (lv_string_6_0= RULE_STRING ) ) | this_constant_chr_7= ruleconstant_chr ) )
            // InternalPascal.g:486:2: (this_unsigned_number_0= ruleunsigned_number | ( rulesign this_unsigned_number_2= ruleunsigned_number ) | ( (lv_names_3_0= RULE_ID ) ) | ( rulesign ( (lv_names_5_0= RULE_ID ) ) ) | ( (lv_string_6_0= RULE_STRING ) ) | this_constant_chr_7= ruleconstant_chr )
            {
            // InternalPascal.g:486:2: (this_unsigned_number_0= ruleunsigned_number | ( rulesign this_unsigned_number_2= ruleunsigned_number ) | ( (lv_names_3_0= RULE_ID ) ) | ( rulesign ( (lv_names_5_0= RULE_ID ) ) ) | ( (lv_string_6_0= RULE_STRING ) ) | this_constant_chr_7= ruleconstant_chr )
            int alt5=6;
            switch ( input.LA(1) ) {
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
                {
                alt5=1;
                }
                break;
            case RULE_PLUS:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_ID) ) {
                    alt5=4;
                }
                else if ( ((LA5_2>=RULE_NUM_INT && LA5_2<=RULE_NUM_REAL)) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MINUS:
                {
                int LA5_3 = input.LA(2);

                if ( ((LA5_3>=RULE_NUM_INT && LA5_3<=RULE_NUM_REAL)) ) {
                    alt5=2;
                }
                else if ( (LA5_3==RULE_ID) ) {
                    alt5=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            case RULE_STRING:
                {
                alt5=5;
                }
                break;
            case 57:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPascal.g:487:3: this_unsigned_number_0= ruleunsigned_number
                    {

                    			newCompositeNode(grammarAccess.getConstantAccess().getUnsigned_numberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_unsigned_number_0=ruleunsigned_number();

                    state._fsp--;


                    			current = this_unsigned_number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:496:3: ( rulesign this_unsigned_number_2= ruleunsigned_number )
                    {
                    // InternalPascal.g:496:3: ( rulesign this_unsigned_number_2= ruleunsigned_number )
                    // InternalPascal.g:497:4: rulesign this_unsigned_number_2= ruleunsigned_number
                    {

                    				newCompositeNode(grammarAccess.getConstantAccess().getSignParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_13);
                    rulesign();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getConstantAccess().getUnsigned_numberParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_unsigned_number_2=ruleunsigned_number();

                    state._fsp--;


                    				current = this_unsigned_number_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:514:3: ( (lv_names_3_0= RULE_ID ) )
                    {
                    // InternalPascal.g:514:3: ( (lv_names_3_0= RULE_ID ) )
                    // InternalPascal.g:515:4: (lv_names_3_0= RULE_ID )
                    {
                    // InternalPascal.g:515:4: (lv_names_3_0= RULE_ID )
                    // InternalPascal.g:516:5: lv_names_3_0= RULE_ID
                    {
                    lv_names_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_names_3_0, grammarAccess.getConstantAccess().getNamesIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"names",
                    						lv_names_3_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:533:3: ( rulesign ( (lv_names_5_0= RULE_ID ) ) )
                    {
                    // InternalPascal.g:533:3: ( rulesign ( (lv_names_5_0= RULE_ID ) ) )
                    // InternalPascal.g:534:4: rulesign ( (lv_names_5_0= RULE_ID ) )
                    {

                    				newCompositeNode(grammarAccess.getConstantAccess().getSignParserRuleCall_3_0());
                    			
                    pushFollow(FOLLOW_5);
                    rulesign();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalPascal.g:541:4: ( (lv_names_5_0= RULE_ID ) )
                    // InternalPascal.g:542:5: (lv_names_5_0= RULE_ID )
                    {
                    // InternalPascal.g:542:5: (lv_names_5_0= RULE_ID )
                    // InternalPascal.g:543:6: lv_names_5_0= RULE_ID
                    {
                    lv_names_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_names_5_0, grammarAccess.getConstantAccess().getNamesIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstantRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"names",
                    							lv_names_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:561:3: ( (lv_string_6_0= RULE_STRING ) )
                    {
                    // InternalPascal.g:561:3: ( (lv_string_6_0= RULE_STRING ) )
                    // InternalPascal.g:562:4: (lv_string_6_0= RULE_STRING )
                    {
                    // InternalPascal.g:562:4: (lv_string_6_0= RULE_STRING )
                    // InternalPascal.g:563:5: lv_string_6_0= RULE_STRING
                    {
                    lv_string_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_6_0, grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_6_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:580:3: this_constant_chr_7= ruleconstant_chr
                    {

                    			newCompositeNode(grammarAccess.getConstantAccess().getConstant_chrParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_constant_chr_7=ruleconstant_chr();

                    state._fsp--;


                    			current = this_constant_chr_7;
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
    // $ANTLR end "ruleconstant"


    // $ANTLR start "entryRulevariable_declaration_part"
    // InternalPascal.g:592:1: entryRulevariable_declaration_part returns [EObject current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final EObject entryRulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration_part = null;


        try {
            // InternalPascal.g:592:66: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // InternalPascal.g:593:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getVariable_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_declaration_part=rulevariable_declaration_part();

            state._fsp--;

             current =iv_rulevariable_declaration_part; 
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
    // $ANTLR end "entryRulevariable_declaration_part"


    // $ANTLR start "rulevariable_declaration_part"
    // InternalPascal.g:599:1: rulevariable_declaration_part returns [EObject current=null] : (otherlv_0= 'var' ( (lv_variable_1_0= rulevariable_declaration ) ) (otherlv_2= ';' ( (lv_variable_3_0= rulevariable_declaration ) ) )* otherlv_4= ';' ) ;
    public final EObject rulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;

        EObject lv_variable_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:605:2: ( (otherlv_0= 'var' ( (lv_variable_1_0= rulevariable_declaration ) ) (otherlv_2= ';' ( (lv_variable_3_0= rulevariable_declaration ) ) )* otherlv_4= ';' ) )
            // InternalPascal.g:606:2: (otherlv_0= 'var' ( (lv_variable_1_0= rulevariable_declaration ) ) (otherlv_2= ';' ( (lv_variable_3_0= rulevariable_declaration ) ) )* otherlv_4= ';' )
            {
            // InternalPascal.g:606:2: (otherlv_0= 'var' ( (lv_variable_1_0= rulevariable_declaration ) ) (otherlv_2= ';' ( (lv_variable_3_0= rulevariable_declaration ) ) )* otherlv_4= ';' )
            // InternalPascal.g:607:3: otherlv_0= 'var' ( (lv_variable_1_0= rulevariable_declaration ) ) (otherlv_2= ';' ( (lv_variable_3_0= rulevariable_declaration ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0());
            		
            // InternalPascal.g:611:3: ( (lv_variable_1_0= rulevariable_declaration ) )
            // InternalPascal.g:612:4: (lv_variable_1_0= rulevariable_declaration )
            {
            // InternalPascal.g:612:4: (lv_variable_1_0= rulevariable_declaration )
            // InternalPascal.g:613:5: lv_variable_1_0= rulevariable_declaration
            {

            					newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getVariableVariable_declarationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_variable_1_0=rulevariable_declaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
            					}
            					add(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"org.xtext.compiler.pascal.Pascal.variable_declaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:630:3: (otherlv_2= ';' ( (lv_variable_3_0= rulevariable_declaration ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==39) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_ID) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalPascal.g:631:4: otherlv_2= ';' ( (lv_variable_3_0= rulevariable_declaration ) )
            	    {
            	    otherlv_2=(Token)match(input,39,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalPascal.g:635:4: ( (lv_variable_3_0= rulevariable_declaration ) )
            	    // InternalPascal.g:636:5: (lv_variable_3_0= rulevariable_declaration )
            	    {
            	    // InternalPascal.g:636:5: (lv_variable_3_0= rulevariable_declaration )
            	    // InternalPascal.g:637:6: lv_variable_3_0= rulevariable_declaration
            	    {

            	    						newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getVariableVariable_declarationParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_variable_3_0=rulevariable_declaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variable",
            	    							lv_variable_3_0,
            	    							"org.xtext.compiler.pascal.Pascal.variable_declaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "rulevariable_declaration_part"


    // $ANTLR start "entryRulevariable_declaration"
    // InternalPascal.g:663:1: entryRulevariable_declaration returns [EObject current=null] : iv_rulevariable_declaration= rulevariable_declaration EOF ;
    public final EObject entryRulevariable_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration = null;


        try {
            // InternalPascal.g:663:61: (iv_rulevariable_declaration= rulevariable_declaration EOF )
            // InternalPascal.g:664:2: iv_rulevariable_declaration= rulevariable_declaration EOF
            {
             newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_declaration=rulevariable_declaration();

            state._fsp--;

             current =iv_rulevariable_declaration; 
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
    // $ANTLR end "entryRulevariable_declaration"


    // $ANTLR start "rulevariable_declaration"
    // InternalPascal.g:670:1: rulevariable_declaration returns [EObject current=null] : (this_identifier_list_0= ruleidentifier_list otherlv_1= ':' ( (lv_types_2_0= ruletype ) ) ) ;
    public final EObject rulevariable_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_identifier_list_0 = null;

        EObject lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:676:2: ( (this_identifier_list_0= ruleidentifier_list otherlv_1= ':' ( (lv_types_2_0= ruletype ) ) ) )
            // InternalPascal.g:677:2: (this_identifier_list_0= ruleidentifier_list otherlv_1= ':' ( (lv_types_2_0= ruletype ) ) )
            {
            // InternalPascal.g:677:2: (this_identifier_list_0= ruleidentifier_list otherlv_1= ':' ( (lv_types_2_0= ruletype ) ) )
            // InternalPascal.g:678:3: this_identifier_list_0= ruleidentifier_list otherlv_1= ':' ( (lv_types_2_0= ruletype ) )
            {

            			newCompositeNode(grammarAccess.getVariable_declarationAccess().getIdentifier_listParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_identifier_list_0=ruleidentifier_list();

            state._fsp--;


            			current = this_identifier_list_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,43,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getVariable_declarationAccess().getColonKeyword_1());
            		
            // InternalPascal.g:690:3: ( (lv_types_2_0= ruletype ) )
            // InternalPascal.g:691:4: (lv_types_2_0= ruletype )
            {
            // InternalPascal.g:691:4: (lv_types_2_0= ruletype )
            // InternalPascal.g:692:5: lv_types_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getVariable_declarationAccess().getTypesTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_types_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_2_0,
            						"org.xtext.compiler.pascal.Pascal.type");
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
    // $ANTLR end "rulevariable_declaration"


    // $ANTLR start "entryRulecompound_statement"
    // InternalPascal.g:713:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // InternalPascal.g:713:59: (iv_rulecompound_statement= rulecompound_statement EOF )
            // InternalPascal.g:714:2: iv_rulecompound_statement= rulecompound_statement EOF
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
    // InternalPascal.g:720:1: rulecompound_statement returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= 'end' ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:726:2: ( (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:727:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:727:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= 'end' )
            // InternalPascal.g:728:3: otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getCompound_statementAccess().getBeginKeyword_0());
            		
            // InternalPascal.g:732:3: ( (lv_sequence_1_0= rulestatements ) )
            // InternalPascal.g:733:4: (lv_sequence_1_0= rulestatements )
            {
            // InternalPascal.g:733:4: (lv_sequence_1_0= rulestatements )
            // InternalPascal.g:734:5: lv_sequence_1_0= rulestatements
            {

            					newCompositeNode(grammarAccess.getCompound_statementAccess().getSequenceStatementsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,45,FOLLOW_2); 

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
    // InternalPascal.g:759:1: entryRulestatements returns [EObject current=null] : iv_rulestatements= rulestatements EOF ;
    public final EObject entryRulestatements() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatements = null;


        try {
            // InternalPascal.g:759:51: (iv_rulestatements= rulestatements EOF )
            // InternalPascal.g:760:2: iv_rulestatements= rulestatements EOF
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
    // InternalPascal.g:766:1: rulestatements returns [EObject current=null] : ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:772:2: ( ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) )
            // InternalPascal.g:773:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            {
            // InternalPascal.g:773:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            // InternalPascal.g:774:3: ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            {
            // InternalPascal.g:774:3: ( (lv_statements_0_0= rulestatement ) )
            // InternalPascal.g:775:4: (lv_statements_0_0= rulestatement )
            {
            // InternalPascal.g:775:4: (lv_statements_0_0= rulestatement )
            // InternalPascal.g:776:5: lv_statements_0_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalPascal.g:793:3: (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==39) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPascal.g:794:4: otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,39,FOLLOW_16); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStatementsAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalPascal.g:798:4: ( (lv_statements_2_0= rulestatement ) )
            	    // InternalPascal.g:799:5: (lv_statements_2_0= rulestatement )
            	    {
            	    // InternalPascal.g:799:5: (lv_statements_2_0= rulestatement )
            	    // InternalPascal.g:800:6: lv_statements_2_0= rulestatement
            	    {

            	    						newCompositeNode(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
            	    break loop7;
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
    // InternalPascal.g:822:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalPascal.g:822:50: (iv_rulestatement= rulestatement EOF )
            // InternalPascal.g:823:2: iv_rulestatement= rulestatement EOF
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
    // InternalPascal.g:829:1: rulestatement returns [EObject current=null] : ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) ) ) | ( () ( (lv_statement_4_0= ruleunlabelled_statement ) )? ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_label_0_0 = null;

        EObject lv_statement_2_0 = null;

        EObject lv_statement_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:835:2: ( ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) ) ) | ( () ( (lv_statement_4_0= ruleunlabelled_statement ) )? ) ) )
            // InternalPascal.g:836:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) ) ) | ( () ( (lv_statement_4_0= ruleunlabelled_statement ) )? ) )
            {
            // InternalPascal.g:836:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) ) ) | ( () ( (lv_statement_4_0= ruleunlabelled_statement ) )? ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_NUM_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==EOF||LA9_0==RULE_ID||LA9_0==39||(LA9_0>=45 && LA9_0<=46)||(LA9_0>=58 && LA9_0<=60)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:837:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) ) )
                    {
                    // InternalPascal.g:837:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) ) )
                    // InternalPascal.g:838:4: ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) )
                    {
                    // InternalPascal.g:838:4: ( (lv_label_0_0= rulelabel ) )
                    // InternalPascal.g:839:5: (lv_label_0_0= rulelabel )
                    {
                    // InternalPascal.g:839:5: (lv_label_0_0= rulelabel )
                    // InternalPascal.g:840:6: lv_label_0_0= rulelabel
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    otherlv_1=(Token)match(input,43,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_0_1());
                    			
                    // InternalPascal.g:861:4: ( (lv_statement_2_0= ruleunlabelled_statement ) )
                    // InternalPascal.g:862:5: (lv_statement_2_0= ruleunlabelled_statement )
                    {
                    // InternalPascal.g:862:5: (lv_statement_2_0= ruleunlabelled_statement )
                    // InternalPascal.g:863:6: lv_statement_2_0= ruleunlabelled_statement
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
                    // InternalPascal.g:882:3: ( () ( (lv_statement_4_0= ruleunlabelled_statement ) )? )
                    {
                    // InternalPascal.g:882:3: ( () ( (lv_statement_4_0= ruleunlabelled_statement ) )? )
                    // InternalPascal.g:883:4: () ( (lv_statement_4_0= ruleunlabelled_statement ) )?
                    {
                    // InternalPascal.g:883:4: ()
                    // InternalPascal.g:884:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatementAccess().getStatementAction_1_0(),
                    						current);
                    				

                    }

                    // InternalPascal.g:890:4: ( (lv_statement_4_0= ruleunlabelled_statement ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID||LA8_0==46||(LA8_0>=58 && LA8_0<=60)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalPascal.g:891:5: (lv_statement_4_0= ruleunlabelled_statement )
                            {
                            // InternalPascal.g:891:5: (lv_statement_4_0= ruleunlabelled_statement )
                            // InternalPascal.g:892:6: lv_statement_4_0= ruleunlabelled_statement
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
    // InternalPascal.g:914:1: entryRuleunlabelled_statement returns [EObject current=null] : iv_ruleunlabelled_statement= ruleunlabelled_statement EOF ;
    public final EObject entryRuleunlabelled_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunlabelled_statement = null;


        try {
            // InternalPascal.g:914:61: (iv_ruleunlabelled_statement= ruleunlabelled_statement EOF )
            // InternalPascal.g:915:2: iv_ruleunlabelled_statement= ruleunlabelled_statement EOF
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
    // InternalPascal.g:921:1: ruleunlabelled_statement returns [EObject current=null] : ( ( (lv_simple_0_0= rulesimple_statement ) ) | ( (lv_structured_1_0= rulestructured_statement ) ) ) ;
    public final EObject ruleunlabelled_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        AntlrDatatypeRuleToken lv_structured_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:927:2: ( ( ( (lv_simple_0_0= rulesimple_statement ) ) | ( (lv_structured_1_0= rulestructured_statement ) ) ) )
            // InternalPascal.g:928:2: ( ( (lv_simple_0_0= rulesimple_statement ) ) | ( (lv_structured_1_0= rulestructured_statement ) ) )
            {
            // InternalPascal.g:928:2: ( ( (lv_simple_0_0= rulesimple_statement ) ) | ( (lv_structured_1_0= rulestructured_statement ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==46||(LA10_0>=58 && LA10_0<=59)) ) {
                alt10=1;
            }
            else if ( (LA10_0==60) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPascal.g:929:3: ( (lv_simple_0_0= rulesimple_statement ) )
                    {
                    // InternalPascal.g:929:3: ( (lv_simple_0_0= rulesimple_statement ) )
                    // InternalPascal.g:930:4: (lv_simple_0_0= rulesimple_statement )
                    {
                    // InternalPascal.g:930:4: (lv_simple_0_0= rulesimple_statement )
                    // InternalPascal.g:931:5: lv_simple_0_0= rulesimple_statement
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
                    // InternalPascal.g:949:3: ( (lv_structured_1_0= rulestructured_statement ) )
                    {
                    // InternalPascal.g:949:3: ( (lv_structured_1_0= rulestructured_statement ) )
                    // InternalPascal.g:950:4: (lv_structured_1_0= rulestructured_statement )
                    {
                    // InternalPascal.g:950:4: (lv_structured_1_0= rulestructured_statement )
                    // InternalPascal.g:951:5: lv_structured_1_0= rulestructured_statement
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
    // InternalPascal.g:972:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // InternalPascal.g:972:46: (iv_rulelabel= rulelabel EOF )
            // InternalPascal.g:973:2: iv_rulelabel= rulelabel EOF
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
    // InternalPascal.g:979:1: rulelabel returns [EObject current=null] : ( (lv_number_0_0= ruleunsigned_integer ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_number_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:985:2: ( ( (lv_number_0_0= ruleunsigned_integer ) ) )
            // InternalPascal.g:986:2: ( (lv_number_0_0= ruleunsigned_integer ) )
            {
            // InternalPascal.g:986:2: ( (lv_number_0_0= ruleunsigned_integer ) )
            // InternalPascal.g:987:3: (lv_number_0_0= ruleunsigned_integer )
            {
            // InternalPascal.g:987:3: (lv_number_0_0= ruleunsigned_integer )
            // InternalPascal.g:988:4: lv_number_0_0= ruleunsigned_integer
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
    // InternalPascal.g:1008:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // InternalPascal.g:1008:57: (iv_rulesimple_statement= rulesimple_statement EOF )
            // InternalPascal.g:1009:2: iv_rulesimple_statement= rulesimple_statement EOF
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
    // InternalPascal.g:1015:1: rulesimple_statement returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_procedure_1_0= ruleprocedure_statement ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) ) ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_assignment_0_0 = null;

        AntlrDatatypeRuleToken lv_procedure_1_0 = null;

        AntlrDatatypeRuleToken lv_goto_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1021:2: ( ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_procedure_1_0= ruleprocedure_statement ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) ) )
            // InternalPascal.g:1022:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_procedure_1_0= ruleprocedure_statement ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) )
            {
            // InternalPascal.g:1022:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_procedure_1_0= ruleprocedure_statement ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 46:
                {
                alt11=1;
                }
                break;
            case 58:
                {
                alt11=2;
                }
                break;
            case 59:
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
                    // InternalPascal.g:1023:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    {
                    // InternalPascal.g:1023:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    // InternalPascal.g:1024:4: (lv_assignment_0_0= ruleassignment_statement )
                    {
                    // InternalPascal.g:1024:4: (lv_assignment_0_0= ruleassignment_statement )
                    // InternalPascal.g:1025:5: lv_assignment_0_0= ruleassignment_statement
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
                    // InternalPascal.g:1043:3: ( (lv_procedure_1_0= ruleprocedure_statement ) )
                    {
                    // InternalPascal.g:1043:3: ( (lv_procedure_1_0= ruleprocedure_statement ) )
                    // InternalPascal.g:1044:4: (lv_procedure_1_0= ruleprocedure_statement )
                    {
                    // InternalPascal.g:1044:4: (lv_procedure_1_0= ruleprocedure_statement )
                    // InternalPascal.g:1045:5: lv_procedure_1_0= ruleprocedure_statement
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
                    // InternalPascal.g:1063:3: ( (lv_goto_2_0= rulegoto_statement ) )
                    {
                    // InternalPascal.g:1063:3: ( (lv_goto_2_0= rulegoto_statement ) )
                    // InternalPascal.g:1064:4: (lv_goto_2_0= rulegoto_statement )
                    {
                    // InternalPascal.g:1064:4: (lv_goto_2_0= rulegoto_statement )
                    // InternalPascal.g:1065:5: lv_goto_2_0= rulegoto_statement
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
    // InternalPascal.g:1086:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // InternalPascal.g:1086:61: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // InternalPascal.g:1087:2: iv_ruleassignment_statement= ruleassignment_statement EOF
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
    // InternalPascal.g:1093:1: ruleassignment_statement returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token this_ASSIGN_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1099:2: ( ( ( (lv_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) ) ) )
            // InternalPascal.g:1100:2: ( ( (lv_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) ) )
            {
            // InternalPascal.g:1100:2: ( ( (lv_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) ) )
            // InternalPascal.g:1101:3: ( (lv_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) )
            {
            // InternalPascal.g:1101:3: ( (lv_variable_0_0= rulevariable ) )
            // InternalPascal.g:1102:4: (lv_variable_0_0= rulevariable )
            {
            // InternalPascal.g:1102:4: (lv_variable_0_0= rulevariable )
            // InternalPascal.g:1103:5: lv_variable_0_0= rulevariable
            {

            					newCompositeNode(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
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

            this_ASSIGN_1=(Token)match(input,RULE_ASSIGN,FOLLOW_21); 

            			newLeafNode(this_ASSIGN_1, grammarAccess.getAssignment_statementAccess().getASSIGNTerminalRuleCall_1());
            		
            // InternalPascal.g:1124:3: ( (lv_expression_2_0= ruleexpression ) )
            // InternalPascal.g:1125:4: (lv_expression_2_0= ruleexpression )
            {
            // InternalPascal.g:1125:4: (lv_expression_2_0= ruleexpression )
            // InternalPascal.g:1126:5: lv_expression_2_0= ruleexpression
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
    // InternalPascal.g:1147:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalPascal.g:1147:49: (iv_rulevariable= rulevariable EOF )
            // InternalPascal.g:1148:2: iv_rulevariable= rulevariable EOF
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
    // InternalPascal.g:1154:1: rulevariable returns [EObject current=null] : ( ( (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) ) | ( (lv_names_2_0= RULE_ID ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) ) | otherlv_15= '^' )* ) ;
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
            // InternalPascal.g:1160:2: ( ( ( (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) ) | ( (lv_names_2_0= RULE_ID ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) ) | otherlv_15= '^' )* ) )
            // InternalPascal.g:1161:2: ( ( (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) ) | ( (lv_names_2_0= RULE_ID ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) ) | otherlv_15= '^' )* )
            {
            // InternalPascal.g:1161:2: ( ( (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) ) | ( (lv_names_2_0= RULE_ID ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) ) | otherlv_15= '^' )* )
            // InternalPascal.g:1162:3: ( (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) ) | ( (lv_names_2_0= RULE_ID ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) ) | otherlv_15= '^' )*
            {
            // InternalPascal.g:1162:3: ( (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) ) | ( (lv_names_2_0= RULE_ID ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==46) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPascal.g:1163:4: (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) )
                    {
                    // InternalPascal.g:1163:4: (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) )
                    // InternalPascal.g:1164:5: otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getCommercialAtKeyword_0_0_0());
                    				
                    // InternalPascal.g:1168:5: ( (lv_names_1_0= RULE_ID ) )
                    // InternalPascal.g:1169:6: (lv_names_1_0= RULE_ID )
                    {
                    // InternalPascal.g:1169:6: (lv_names_1_0= RULE_ID )
                    // InternalPascal.g:1170:7: lv_names_1_0= RULE_ID
                    {
                    lv_names_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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
                    // InternalPascal.g:1188:4: ( (lv_names_2_0= RULE_ID ) )
                    {
                    // InternalPascal.g:1188:4: ( (lv_names_2_0= RULE_ID ) )
                    // InternalPascal.g:1189:5: (lv_names_2_0= RULE_ID )
                    {
                    // InternalPascal.g:1189:5: (lv_names_2_0= RULE_ID )
                    // InternalPascal.g:1190:6: lv_names_2_0= RULE_ID
                    {
                    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalPascal.g:1207:3: ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) ) | otherlv_15= '^' )*
            loop15:
            do {
                int alt15=5;
                switch ( input.LA(1) ) {
                case 47:
                    {
                    alt15=1;
                    }
                    break;
                case 49:
                    {
                    alt15=2;
                    }
                    break;
                case 35:
                    {
                    alt15=3;
                    }
                    break;
                case 51:
                    {
                    alt15=4;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // InternalPascal.g:1208:4: (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' )
            	    {
            	    // InternalPascal.g:1208:4: (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' )
            	    // InternalPascal.g:1209:5: otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']'
            	    {
            	    otherlv_3=(Token)match(input,47,FOLLOW_21); 

            	    					newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_1_0_0());
            	    				
            	    // InternalPascal.g:1213:5: ( (lv_expression_4_0= ruleexpression ) )
            	    // InternalPascal.g:1214:6: (lv_expression_4_0= ruleexpression )
            	    {
            	    // InternalPascal.g:1214:6: (lv_expression_4_0= ruleexpression )
            	    // InternalPascal.g:1215:7: lv_expression_4_0= ruleexpression
            	    {

            	    							newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_23);
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

            	    // InternalPascal.g:1232:5: (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==40) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalPascal.g:1233:6: otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,40,FOLLOW_21); 

            	    	    						newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getCommaKeyword_1_0_2_0());
            	    	    					
            	    	    // InternalPascal.g:1237:6: ( (lv_expression_6_0= ruleexpression ) )
            	    	    // InternalPascal.g:1238:7: (lv_expression_6_0= ruleexpression )
            	    	    {
            	    	    // InternalPascal.g:1238:7: (lv_expression_6_0= ruleexpression )
            	    	    // InternalPascal.g:1239:8: lv_expression_6_0= ruleexpression
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_0_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_23);
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
            	    	    break loop13;
            	        }
            	    } while (true);

            	    otherlv_7=(Token)match(input,48,FOLLOW_22); 

            	    					newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getRightSquareBracketKeyword_1_0_3());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPascal.g:1263:4: (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' )
            	    {
            	    // InternalPascal.g:1263:4: (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' )
            	    // InternalPascal.g:1264:5: otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)'
            	    {
            	    otherlv_8=(Token)match(input,49,FOLLOW_21); 

            	    					newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getLeftParenthesisFullStopKeyword_1_1_0());
            	    				
            	    // InternalPascal.g:1268:5: ( (lv_expression_9_0= ruleexpression ) )
            	    // InternalPascal.g:1269:6: (lv_expression_9_0= ruleexpression )
            	    {
            	    // InternalPascal.g:1269:6: (lv_expression_9_0= ruleexpression )
            	    // InternalPascal.g:1270:7: lv_expression_9_0= ruleexpression
            	    {

            	    							newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_24);
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

            	    // InternalPascal.g:1287:5: (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==40) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalPascal.g:1288:6: otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,40,FOLLOW_21); 

            	    	    						newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getCommaKeyword_1_1_2_0());
            	    	    					
            	    	    // InternalPascal.g:1292:6: ( (lv_expression_11_0= ruleexpression ) )
            	    	    // InternalPascal.g:1293:7: (lv_expression_11_0= ruleexpression )
            	    	    {
            	    	    // InternalPascal.g:1293:7: (lv_expression_11_0= ruleexpression )
            	    	    // InternalPascal.g:1294:8: lv_expression_11_0= ruleexpression
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_1_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_24);
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
            	    	    break loop14;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,50,FOLLOW_22); 

            	    					newLeafNode(otherlv_12, grammarAccess.getVariableAccess().getFullStopRightParenthesisKeyword_1_1_3());
            	    				

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPascal.g:1318:4: (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) )
            	    {
            	    // InternalPascal.g:1318:4: (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) )
            	    // InternalPascal.g:1319:5: otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) )
            	    {
            	    otherlv_13=(Token)match(input,35,FOLLOW_5); 

            	    					newLeafNode(otherlv_13, grammarAccess.getVariableAccess().getFullStopKeyword_1_2_0());
            	    				
            	    // InternalPascal.g:1323:5: ( (lv_names_14_0= RULE_ID ) )
            	    // InternalPascal.g:1324:6: (lv_names_14_0= RULE_ID )
            	    {
            	    // InternalPascal.g:1324:6: (lv_names_14_0= RULE_ID )
            	    // InternalPascal.g:1325:7: lv_names_14_0= RULE_ID
            	    {
            	    lv_names_14_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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
            	    // InternalPascal.g:1343:4: otherlv_15= '^'
            	    {
            	    otherlv_15=(Token)match(input,51,FOLLOW_22); 

            	    				newLeafNode(otherlv_15, grammarAccess.getVariableAccess().getCircumflexAccentKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalPascal.g:1352:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascal.g:1352:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascal.g:1353:2: iv_ruleexpression= ruleexpression EOF
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
    // InternalPascal.g:1359:1: ruleexpression returns [EObject current=null] : ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;

        AntlrDatatypeRuleToken lv_operators_1_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1365:2: ( ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? ) )
            // InternalPascal.g:1366:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? )
            {
            // InternalPascal.g:1366:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? )
            // InternalPascal.g:1367:3: ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) ) )?
            {
            // InternalPascal.g:1367:3: ( (lv_expressions_0_0= rulesimple_expression ) )
            // InternalPascal.g:1368:4: (lv_expressions_0_0= rulesimple_expression )
            {
            // InternalPascal.g:1368:4: (lv_expressions_0_0= rulesimple_expression )
            // InternalPascal.g:1369:5: lv_expressions_0_0= rulesimple_expression
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalPascal.g:1386:3: ( ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_EQUAL||(LA16_0>=RULE_NOT_EQUAL && LA16_0<=RULE_IN)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1387:4: ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) )
                    {
                    // InternalPascal.g:1387:4: ( (lv_operators_1_0= rulerelational_operator ) )
                    // InternalPascal.g:1388:5: (lv_operators_1_0= rulerelational_operator )
                    {
                    // InternalPascal.g:1388:5: (lv_operators_1_0= rulerelational_operator )
                    // InternalPascal.g:1389:6: lv_operators_1_0= rulerelational_operator
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getOperatorsRelational_operatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    // InternalPascal.g:1406:4: ( (lv_expressions_2_0= ruleexpression ) )
                    // InternalPascal.g:1407:5: (lv_expressions_2_0= ruleexpression )
                    {
                    // InternalPascal.g:1407:5: (lv_expressions_2_0= ruleexpression )
                    // InternalPascal.g:1408:6: lv_expressions_2_0= ruleexpression
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
    // InternalPascal.g:1430:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;


        try {
            // InternalPascal.g:1430:58: (iv_rulesimple_expression= rulesimple_expression EOF )
            // InternalPascal.g:1431:2: iv_rulesimple_expression= rulesimple_expression EOF
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
    // InternalPascal.g:1437:1: rulesimple_expression returns [EObject current=null] : ( ( (lv_terms_0_0= ruleterm ) ) ( ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )? ) ;
    public final EObject rulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject lv_terms_0_0 = null;

        AntlrDatatypeRuleToken lv_operators_1_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1443:2: ( ( ( (lv_terms_0_0= ruleterm ) ) ( ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )? ) )
            // InternalPascal.g:1444:2: ( ( (lv_terms_0_0= ruleterm ) ) ( ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )? )
            {
            // InternalPascal.g:1444:2: ( ( (lv_terms_0_0= ruleterm ) ) ( ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )? )
            // InternalPascal.g:1445:3: ( (lv_terms_0_0= ruleterm ) ) ( ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )?
            {
            // InternalPascal.g:1445:3: ( (lv_terms_0_0= ruleterm ) )
            // InternalPascal.g:1446:4: (lv_terms_0_0= ruleterm )
            {
            // InternalPascal.g:1446:4: (lv_terms_0_0= ruleterm )
            // InternalPascal.g:1447:5: lv_terms_0_0= ruleterm
            {

            					newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalPascal.g:1464:3: ( ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_PLUS && LA17_0<=RULE_MINUS)||LA17_0==RULE_OR) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPascal.g:1465:4: ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) )
                    {
                    // InternalPascal.g:1465:4: ( (lv_operators_1_0= ruleadditive_operator ) )
                    // InternalPascal.g:1466:5: (lv_operators_1_0= ruleadditive_operator )
                    {
                    // InternalPascal.g:1466:5: (lv_operators_1_0= ruleadditive_operator )
                    // InternalPascal.g:1467:6: lv_operators_1_0= ruleadditive_operator
                    {

                    						newCompositeNode(grammarAccess.getSimple_expressionAccess().getOperatorsAdditive_operatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    // InternalPascal.g:1484:4: ( (lv_expression_2_0= rulesimple_expression ) )
                    // InternalPascal.g:1485:5: (lv_expression_2_0= rulesimple_expression )
                    {
                    // InternalPascal.g:1485:5: (lv_expression_2_0= rulesimple_expression )
                    // InternalPascal.g:1486:6: lv_expression_2_0= rulesimple_expression
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
    // InternalPascal.g:1508:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalPascal.g:1508:45: (iv_ruleterm= ruleterm EOF )
            // InternalPascal.g:1509:2: iv_ruleterm= ruleterm EOF
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
    // InternalPascal.g:1515:1: ruleterm returns [EObject current=null] : ( ( (lv_factors_0_0= rulesigned_factor ) ) ( ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) ) )? ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        EObject lv_factors_0_0 = null;

        AntlrDatatypeRuleToken lv_operators_1_0 = null;

        EObject lv_terms_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1521:2: ( ( ( (lv_factors_0_0= rulesigned_factor ) ) ( ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) ) )? ) )
            // InternalPascal.g:1522:2: ( ( (lv_factors_0_0= rulesigned_factor ) ) ( ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) ) )? )
            {
            // InternalPascal.g:1522:2: ( ( (lv_factors_0_0= rulesigned_factor ) ) ( ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) ) )? )
            // InternalPascal.g:1523:3: ( (lv_factors_0_0= rulesigned_factor ) ) ( ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) ) )?
            {
            // InternalPascal.g:1523:3: ( (lv_factors_0_0= rulesigned_factor ) )
            // InternalPascal.g:1524:4: (lv_factors_0_0= rulesigned_factor )
            {
            // InternalPascal.g:1524:4: (lv_factors_0_0= rulesigned_factor )
            // InternalPascal.g:1525:5: lv_factors_0_0= rulesigned_factor
            {

            					newCompositeNode(grammarAccess.getTermAccess().getFactorsSigned_factorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalPascal.g:1542:3: ( ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STAR && LA18_0<=RULE_AND)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPascal.g:1543:4: ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) )
                    {
                    // InternalPascal.g:1543:4: ( (lv_operators_1_0= rulemultiplicative_operator ) )
                    // InternalPascal.g:1544:5: (lv_operators_1_0= rulemultiplicative_operator )
                    {
                    // InternalPascal.g:1544:5: (lv_operators_1_0= rulemultiplicative_operator )
                    // InternalPascal.g:1545:6: lv_operators_1_0= rulemultiplicative_operator
                    {

                    						newCompositeNode(grammarAccess.getTermAccess().getOperatorsMultiplicative_operatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    // InternalPascal.g:1562:4: ( (lv_terms_2_0= ruleterm ) )
                    // InternalPascal.g:1563:5: (lv_terms_2_0= ruleterm )
                    {
                    // InternalPascal.g:1563:5: (lv_terms_2_0= ruleterm )
                    // InternalPascal.g:1564:6: lv_terms_2_0= ruleterm
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
    // InternalPascal.g:1586:1: entryRulesigned_factor returns [EObject current=null] : iv_rulesigned_factor= rulesigned_factor EOF ;
    public final EObject entryRulesigned_factor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigned_factor = null;


        try {
            // InternalPascal.g:1586:54: (iv_rulesigned_factor= rulesigned_factor EOF )
            // InternalPascal.g:1587:2: iv_rulesigned_factor= rulesigned_factor EOF
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
    // InternalPascal.g:1593:1: rulesigned_factor returns [EObject current=null] : ( ( ( (lv_operators_0_0= RULE_PLUS ) ) | ( (lv_operators_1_0= RULE_MINUS ) ) )? ( (lv_factors_2_0= rulefactor ) ) ) ;
    public final EObject rulesigned_factor() throws RecognitionException {
        EObject current = null;

        Token lv_operators_0_0=null;
        Token lv_operators_1_0=null;
        EObject lv_factors_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1599:2: ( ( ( ( (lv_operators_0_0= RULE_PLUS ) ) | ( (lv_operators_1_0= RULE_MINUS ) ) )? ( (lv_factors_2_0= rulefactor ) ) ) )
            // InternalPascal.g:1600:2: ( ( ( (lv_operators_0_0= RULE_PLUS ) ) | ( (lv_operators_1_0= RULE_MINUS ) ) )? ( (lv_factors_2_0= rulefactor ) ) )
            {
            // InternalPascal.g:1600:2: ( ( ( (lv_operators_0_0= RULE_PLUS ) ) | ( (lv_operators_1_0= RULE_MINUS ) ) )? ( (lv_factors_2_0= rulefactor ) ) )
            // InternalPascal.g:1601:3: ( ( (lv_operators_0_0= RULE_PLUS ) ) | ( (lv_operators_1_0= RULE_MINUS ) ) )? ( (lv_factors_2_0= rulefactor ) )
            {
            // InternalPascal.g:1601:3: ( ( (lv_operators_0_0= RULE_PLUS ) ) | ( (lv_operators_1_0= RULE_MINUS ) ) )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_PLUS) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_MINUS) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // InternalPascal.g:1602:4: ( (lv_operators_0_0= RULE_PLUS ) )
                    {
                    // InternalPascal.g:1602:4: ( (lv_operators_0_0= RULE_PLUS ) )
                    // InternalPascal.g:1603:5: (lv_operators_0_0= RULE_PLUS )
                    {
                    // InternalPascal.g:1603:5: (lv_operators_0_0= RULE_PLUS )
                    // InternalPascal.g:1604:6: lv_operators_0_0= RULE_PLUS
                    {
                    lv_operators_0_0=(Token)match(input,RULE_PLUS,FOLLOW_21); 

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
                    // InternalPascal.g:1621:4: ( (lv_operators_1_0= RULE_MINUS ) )
                    {
                    // InternalPascal.g:1621:4: ( (lv_operators_1_0= RULE_MINUS ) )
                    // InternalPascal.g:1622:5: (lv_operators_1_0= RULE_MINUS )
                    {
                    // InternalPascal.g:1622:5: (lv_operators_1_0= RULE_MINUS )
                    // InternalPascal.g:1623:6: lv_operators_1_0= RULE_MINUS
                    {
                    lv_operators_1_0=(Token)match(input,RULE_MINUS,FOLLOW_21); 

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

            // InternalPascal.g:1640:3: ( (lv_factors_2_0= rulefactor ) )
            // InternalPascal.g:1641:4: (lv_factors_2_0= rulefactor )
            {
            // InternalPascal.g:1641:4: (lv_factors_2_0= rulefactor )
            // InternalPascal.g:1642:5: lv_factors_2_0= rulefactor
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
    // InternalPascal.g:1663:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // InternalPascal.g:1663:47: (iv_rulefactor= rulefactor EOF )
            // InternalPascal.g:1664:2: iv_rulefactor= rulefactor EOF
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
    // InternalPascal.g:1670:1: rulefactor returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')' ) | ( (lv_constant_4_0= ruleunsigned_constant ) ) | ( (lv_set_5_0= ruleset ) ) | (this_NOT_6= RULE_NOT ( (lv_factor_7_0= rulefactor ) ) ) | ( (lv_boolean_8_0= rulebool ) ) ) ;
    public final EObject rulefactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_NOT_6=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;

        EObject lv_constant_4_0 = null;

        EObject lv_set_5_0 = null;

        EObject lv_factor_7_0 = null;

        AntlrDatatypeRuleToken lv_boolean_8_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1676:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')' ) | ( (lv_constant_4_0= ruleunsigned_constant ) ) | ( (lv_set_5_0= ruleset ) ) | (this_NOT_6= RULE_NOT ( (lv_factor_7_0= rulefactor ) ) ) | ( (lv_boolean_8_0= rulebool ) ) ) )
            // InternalPascal.g:1677:2: ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')' ) | ( (lv_constant_4_0= ruleunsigned_constant ) ) | ( (lv_set_5_0= ruleset ) ) | (this_NOT_6= RULE_NOT ( (lv_factor_7_0= rulefactor ) ) ) | ( (lv_boolean_8_0= rulebool ) ) )
            {
            // InternalPascal.g:1677:2: ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')' ) | ( (lv_constant_4_0= ruleunsigned_constant ) ) | ( (lv_set_5_0= ruleset ) ) | (this_NOT_6= RULE_NOT ( (lv_factor_7_0= rulefactor ) ) ) | ( (lv_boolean_8_0= rulebool ) ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 46:
                {
                alt20=1;
                }
                break;
            case 37:
                {
                alt20=2;
                }
                break;
            case RULE_STRING:
            case RULE_NIL:
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
            case 57:
                {
                alt20=3;
                }
                break;
            case 47:
            case 49:
                {
                alt20=4;
                }
                break;
            case RULE_NOT:
                {
                alt20=5;
                }
                break;
            case RULE_TRUE:
            case RULE_FALSE:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalPascal.g:1678:3: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // InternalPascal.g:1678:3: ( (lv_variable_0_0= rulevariable ) )
                    // InternalPascal.g:1679:4: (lv_variable_0_0= rulevariable )
                    {
                    // InternalPascal.g:1679:4: (lv_variable_0_0= rulevariable )
                    // InternalPascal.g:1680:5: lv_variable_0_0= rulevariable
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
                    // InternalPascal.g:1698:3: (otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')' )
                    {
                    // InternalPascal.g:1698:3: (otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')' )
                    // InternalPascal.g:1699:4: otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalPascal.g:1703:4: ( (lv_expression_2_0= ruleexpression ) )
                    // InternalPascal.g:1704:5: (lv_expression_2_0= ruleexpression )
                    {
                    // InternalPascal.g:1704:5: (lv_expression_2_0= ruleexpression )
                    // InternalPascal.g:1705:6: lv_expression_2_0= ruleexpression
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_expression_2_0=ruleexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_2_0,
                    							"org.xtext.compiler.pascal.Pascal.expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1728:3: ( (lv_constant_4_0= ruleunsigned_constant ) )
                    {
                    // InternalPascal.g:1728:3: ( (lv_constant_4_0= ruleunsigned_constant ) )
                    // InternalPascal.g:1729:4: (lv_constant_4_0= ruleunsigned_constant )
                    {
                    // InternalPascal.g:1729:4: (lv_constant_4_0= ruleunsigned_constant )
                    // InternalPascal.g:1730:5: lv_constant_4_0= ruleunsigned_constant
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getConstantUnsigned_constantParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_constant_4_0=ruleunsigned_constant();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"constant",
                    						lv_constant_4_0,
                    						"org.xtext.compiler.pascal.Pascal.unsigned_constant");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1748:3: ( (lv_set_5_0= ruleset ) )
                    {
                    // InternalPascal.g:1748:3: ( (lv_set_5_0= ruleset ) )
                    // InternalPascal.g:1749:4: (lv_set_5_0= ruleset )
                    {
                    // InternalPascal.g:1749:4: (lv_set_5_0= ruleset )
                    // InternalPascal.g:1750:5: lv_set_5_0= ruleset
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_set_5_0=ruleset();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"set",
                    						lv_set_5_0,
                    						"org.xtext.compiler.pascal.Pascal.set");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:1768:3: (this_NOT_6= RULE_NOT ( (lv_factor_7_0= rulefactor ) ) )
                    {
                    // InternalPascal.g:1768:3: (this_NOT_6= RULE_NOT ( (lv_factor_7_0= rulefactor ) ) )
                    // InternalPascal.g:1769:4: this_NOT_6= RULE_NOT ( (lv_factor_7_0= rulefactor ) )
                    {
                    this_NOT_6=(Token)match(input,RULE_NOT,FOLLOW_21); 

                    				newLeafNode(this_NOT_6, grammarAccess.getFactorAccess().getNOTTerminalRuleCall_4_0());
                    			
                    // InternalPascal.g:1773:4: ( (lv_factor_7_0= rulefactor ) )
                    // InternalPascal.g:1774:5: (lv_factor_7_0= rulefactor )
                    {
                    // InternalPascal.g:1774:5: (lv_factor_7_0= rulefactor )
                    // InternalPascal.g:1775:6: lv_factor_7_0= rulefactor
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getFactorFactorParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_factor_7_0=rulefactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"factor",
                    							lv_factor_7_0,
                    							"org.xtext.compiler.pascal.Pascal.factor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:1794:3: ( (lv_boolean_8_0= rulebool ) )
                    {
                    // InternalPascal.g:1794:3: ( (lv_boolean_8_0= rulebool ) )
                    // InternalPascal.g:1795:4: (lv_boolean_8_0= rulebool )
                    {
                    // InternalPascal.g:1795:4: (lv_boolean_8_0= rulebool )
                    // InternalPascal.g:1796:5: lv_boolean_8_0= rulebool
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getBooleanBoolParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_boolean_8_0=rulebool();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					add(
                    						current,
                    						"boolean",
                    						lv_boolean_8_0,
                    						"org.xtext.compiler.pascal.Pascal.bool");
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
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRuleset"
    // InternalPascal.g:1817:1: entryRuleset returns [EObject current=null] : iv_ruleset= ruleset EOF ;
    public final EObject entryRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset = null;


        try {
            // InternalPascal.g:1817:44: (iv_ruleset= ruleset EOF )
            // InternalPascal.g:1818:2: iv_ruleset= ruleset EOF
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
    // InternalPascal.g:1824:1: ruleset returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']' ) | (otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)' ) ) ;
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
            // InternalPascal.g:1830:2: ( ( (otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']' ) | (otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)' ) ) )
            // InternalPascal.g:1831:2: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']' ) | (otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)' ) )
            {
            // InternalPascal.g:1831:2: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']' ) | (otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            else if ( (LA21_0==49) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPascal.g:1832:3: (otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']' )
                    {
                    // InternalPascal.g:1832:3: (otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']' )
                    // InternalPascal.g:1833:4: otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getSetAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalPascal.g:1837:4: ( (lv_elements_1_0= ruleelementList ) )
                    // InternalPascal.g:1838:5: (lv_elements_1_0= ruleelementList )
                    {
                    // InternalPascal.g:1838:5: (lv_elements_1_0= ruleelementList )
                    // InternalPascal.g:1839:6: lv_elements_1_0= ruleelementList
                    {

                    						newCompositeNode(grammarAccess.getSetAccess().getElementsElementListParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_2=(Token)match(input,48,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getSetAccess().getRightSquareBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1862:3: (otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)' )
                    {
                    // InternalPascal.g:1862:3: (otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)' )
                    // InternalPascal.g:1863:4: otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)'
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getSetAccess().getLeftParenthesisFullStopKeyword_1_0());
                    			
                    // InternalPascal.g:1867:4: ( (lv_elements_4_0= ruleelementList ) )
                    // InternalPascal.g:1868:5: (lv_elements_4_0= ruleelementList )
                    {
                    // InternalPascal.g:1868:5: (lv_elements_4_0= ruleelementList )
                    // InternalPascal.g:1869:6: lv_elements_4_0= ruleelementList
                    {

                    						newCompositeNode(grammarAccess.getSetAccess().getElementsElementListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_5=(Token)match(input,50,FOLLOW_2); 

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
    // InternalPascal.g:1895:1: entryRuleelementList returns [EObject current=null] : iv_ruleelementList= ruleelementList EOF ;
    public final EObject entryRuleelementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelementList = null;


        try {
            // InternalPascal.g:1895:52: (iv_ruleelementList= ruleelementList EOF )
            // InternalPascal.g:1896:2: iv_ruleelementList= ruleelementList EOF
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
    // InternalPascal.g:1902:1: ruleelementList returns [EObject current=null] : ( ( (lv_elements_0_0= ruleelement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) ) )* ) ;
    public final EObject ruleelementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1908:2: ( ( ( (lv_elements_0_0= ruleelement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) ) )* ) )
            // InternalPascal.g:1909:2: ( ( (lv_elements_0_0= ruleelement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) ) )* )
            {
            // InternalPascal.g:1909:2: ( ( (lv_elements_0_0= ruleelement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) ) )* )
            // InternalPascal.g:1910:3: ( (lv_elements_0_0= ruleelement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) ) )*
            {
            // InternalPascal.g:1910:3: ( (lv_elements_0_0= ruleelement ) )
            // InternalPascal.g:1911:4: (lv_elements_0_0= ruleelement )
            {
            // InternalPascal.g:1911:4: (lv_elements_0_0= ruleelement )
            // InternalPascal.g:1912:5: lv_elements_0_0= ruleelement
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

            // InternalPascal.g:1929:3: (otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==40) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPascal.g:1930:4: otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) )
            	    {
            	    otherlv_1=(Token)match(input,40,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getElementListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:1934:4: ( (lv_elements_2_0= ruleelement ) )
            	    // InternalPascal.g:1935:5: (lv_elements_2_0= ruleelement )
            	    {
            	    // InternalPascal.g:1935:5: (lv_elements_2_0= ruleelement )
            	    // InternalPascal.g:1936:6: lv_elements_2_0= ruleelement
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
            	    break loop22;
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
    // InternalPascal.g:1958:1: entryRuleelement returns [EObject current=null] : iv_ruleelement= ruleelement EOF ;
    public final EObject entryRuleelement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelement = null;


        try {
            // InternalPascal.g:1958:48: (iv_ruleelement= ruleelement EOF )
            // InternalPascal.g:1959:2: iv_ruleelement= ruleelement EOF
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
    // InternalPascal.g:1965:1: ruleelement returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleexpression ) ) ( ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? ) ;
    public final EObject ruleelement() throws RecognitionException {
        EObject current = null;

        Token lv_dotdot_1_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1971:2: ( ( ( (lv_expressions_0_0= ruleexpression ) ) ( ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? ) )
            // InternalPascal.g:1972:2: ( ( (lv_expressions_0_0= ruleexpression ) ) ( ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? )
            {
            // InternalPascal.g:1972:2: ( ( (lv_expressions_0_0= ruleexpression ) ) ( ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? )
            // InternalPascal.g:1973:3: ( (lv_expressions_0_0= ruleexpression ) ) ( ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) ) )?
            {
            // InternalPascal.g:1973:3: ( (lv_expressions_0_0= ruleexpression ) )
            // InternalPascal.g:1974:4: (lv_expressions_0_0= ruleexpression )
            {
            // InternalPascal.g:1974:4: (lv_expressions_0_0= ruleexpression )
            // InternalPascal.g:1975:5: lv_expressions_0_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getElementAccess().getExpressionsExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalPascal.g:1992:3: ( ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_DOTDOT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascal.g:1993:4: ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) )
                    {
                    // InternalPascal.g:1993:4: ( (lv_dotdot_1_0= RULE_DOTDOT ) )
                    // InternalPascal.g:1994:5: (lv_dotdot_1_0= RULE_DOTDOT )
                    {
                    // InternalPascal.g:1994:5: (lv_dotdot_1_0= RULE_DOTDOT )
                    // InternalPascal.g:1995:6: lv_dotdot_1_0= RULE_DOTDOT
                    {
                    lv_dotdot_1_0=(Token)match(input,RULE_DOTDOT,FOLLOW_21); 

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

                    // InternalPascal.g:2011:4: ( (lv_expressions_2_0= ruleexpression ) )
                    // InternalPascal.g:2012:5: (lv_expressions_2_0= ruleexpression )
                    {
                    // InternalPascal.g:2012:5: (lv_expressions_2_0= ruleexpression )
                    // InternalPascal.g:2013:6: lv_expressions_2_0= ruleexpression
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


    // $ANTLR start "entryRuletype"
    // InternalPascal.g:2035:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // InternalPascal.g:2035:45: (iv_ruletype= ruletype EOF )
            // InternalPascal.g:2036:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype; 
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
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // InternalPascal.g:2042:1: ruletype returns [EObject current=null] : ( (lv_type_0_0= rulesimple_type ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2048:2: ( ( (lv_type_0_0= rulesimple_type ) ) )
            // InternalPascal.g:2049:2: ( (lv_type_0_0= rulesimple_type ) )
            {
            // InternalPascal.g:2049:2: ( (lv_type_0_0= rulesimple_type ) )
            // InternalPascal.g:2050:3: (lv_type_0_0= rulesimple_type )
            {
            // InternalPascal.g:2050:3: (lv_type_0_0= rulesimple_type )
            // InternalPascal.g:2051:4: lv_type_0_0= rulesimple_type
            {

            				newCompositeNode(grammarAccess.getTypeAccess().getTypeSimple_typeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_type_0_0=rulesimple_type();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getTypeRule());
            				}
            				add(
            					current,
            					"type",
            					lv_type_0_0,
            					"org.xtext.compiler.pascal.Pascal.simple_type");
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
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulesimple_type"
    // InternalPascal.g:2071:1: entryRulesimple_type returns [EObject current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final EObject entryRulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type = null;


        try {
            // InternalPascal.g:2071:52: (iv_rulesimple_type= rulesimple_type EOF )
            // InternalPascal.g:2072:2: iv_rulesimple_type= rulesimple_type EOF
            {
             newCompositeNode(grammarAccess.getSimple_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimple_type=rulesimple_type();

            state._fsp--;

             current =iv_rulesimple_type; 
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
    // $ANTLR end "entryRulesimple_type"


    // $ANTLR start "rulesimple_type"
    // InternalPascal.g:2078:1: rulesimple_type returns [EObject current=null] : ( ( (lv_types_0_0= rulescalar_type ) ) | ( (lv_types_1_0= rulesubrange_type ) ) | ( (lv_types_2_0= ruletype_identifier ) ) | ( (lv_types_3_0= rulestring_type ) ) ) ;
    public final EObject rulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0_0 = null;

        EObject lv_types_1_0 = null;

        EObject lv_types_2_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2084:2: ( ( ( (lv_types_0_0= rulescalar_type ) ) | ( (lv_types_1_0= rulesubrange_type ) ) | ( (lv_types_2_0= ruletype_identifier ) ) | ( (lv_types_3_0= rulestring_type ) ) ) )
            // InternalPascal.g:2085:2: ( ( (lv_types_0_0= rulescalar_type ) ) | ( (lv_types_1_0= rulesubrange_type ) ) | ( (lv_types_2_0= ruletype_identifier ) ) | ( (lv_types_3_0= rulestring_type ) ) )
            {
            // InternalPascal.g:2085:2: ( ( (lv_types_0_0= rulescalar_type ) ) | ( (lv_types_1_0= rulesubrange_type ) ) | ( (lv_types_2_0= ruletype_identifier ) ) | ( (lv_types_3_0= rulestring_type ) ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt24=1;
                }
                break;
            case RULE_STRING:
            case RULE_PLUS:
            case RULE_MINUS:
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
            case 57:
                {
                alt24=2;
                }
                break;
            case RULE_ID:
                {
                int LA24_3 = input.LA(2);

                if ( (LA24_3==RULE_DOTDOT) ) {
                    alt24=2;
                }
                else if ( (LA24_3==EOF||LA24_3==39) ) {
                    alt24=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 3, input);

                    throw nvae;
                }
                }
                break;
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt24=3;
                }
                break;
            case 56:
                {
                int LA24_5 = input.LA(2);

                if ( (LA24_5==EOF||LA24_5==39) ) {
                    alt24=3;
                }
                else if ( (LA24_5==47) ) {
                    alt24=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalPascal.g:2086:3: ( (lv_types_0_0= rulescalar_type ) )
                    {
                    // InternalPascal.g:2086:3: ( (lv_types_0_0= rulescalar_type ) )
                    // InternalPascal.g:2087:4: (lv_types_0_0= rulescalar_type )
                    {
                    // InternalPascal.g:2087:4: (lv_types_0_0= rulescalar_type )
                    // InternalPascal.g:2088:5: lv_types_0_0= rulescalar_type
                    {

                    					newCompositeNode(grammarAccess.getSimple_typeAccess().getTypesScalar_typeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_types_0_0=rulescalar_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    					}
                    					add(
                    						current,
                    						"types",
                    						lv_types_0_0,
                    						"org.xtext.compiler.pascal.Pascal.scalar_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2106:3: ( (lv_types_1_0= rulesubrange_type ) )
                    {
                    // InternalPascal.g:2106:3: ( (lv_types_1_0= rulesubrange_type ) )
                    // InternalPascal.g:2107:4: (lv_types_1_0= rulesubrange_type )
                    {
                    // InternalPascal.g:2107:4: (lv_types_1_0= rulesubrange_type )
                    // InternalPascal.g:2108:5: lv_types_1_0= rulesubrange_type
                    {

                    					newCompositeNode(grammarAccess.getSimple_typeAccess().getTypesSubrange_typeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_types_1_0=rulesubrange_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    					}
                    					add(
                    						current,
                    						"types",
                    						lv_types_1_0,
                    						"org.xtext.compiler.pascal.Pascal.subrange_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2126:3: ( (lv_types_2_0= ruletype_identifier ) )
                    {
                    // InternalPascal.g:2126:3: ( (lv_types_2_0= ruletype_identifier ) )
                    // InternalPascal.g:2127:4: (lv_types_2_0= ruletype_identifier )
                    {
                    // InternalPascal.g:2127:4: (lv_types_2_0= ruletype_identifier )
                    // InternalPascal.g:2128:5: lv_types_2_0= ruletype_identifier
                    {

                    					newCompositeNode(grammarAccess.getSimple_typeAccess().getTypesType_identifierParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_types_2_0=ruletype_identifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    					}
                    					add(
                    						current,
                    						"types",
                    						lv_types_2_0,
                    						"org.xtext.compiler.pascal.Pascal.type_identifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:2146:3: ( (lv_types_3_0= rulestring_type ) )
                    {
                    // InternalPascal.g:2146:3: ( (lv_types_3_0= rulestring_type ) )
                    // InternalPascal.g:2147:4: (lv_types_3_0= rulestring_type )
                    {
                    // InternalPascal.g:2147:4: (lv_types_3_0= rulestring_type )
                    // InternalPascal.g:2148:5: lv_types_3_0= rulestring_type
                    {

                    					newCompositeNode(grammarAccess.getSimple_typeAccess().getTypesString_typeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_types_3_0=rulestring_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    					}
                    					add(
                    						current,
                    						"types",
                    						lv_types_3_0,
                    						"org.xtext.compiler.pascal.Pascal.string_type");
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
    // $ANTLR end "rulesimple_type"


    // $ANTLR start "entryRulescalar_type"
    // InternalPascal.g:2169:1: entryRulescalar_type returns [EObject current=null] : iv_rulescalar_type= rulescalar_type EOF ;
    public final EObject entryRulescalar_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulescalar_type = null;


        try {
            // InternalPascal.g:2169:52: (iv_rulescalar_type= rulescalar_type EOF )
            // InternalPascal.g:2170:2: iv_rulescalar_type= rulescalar_type EOF
            {
             newCompositeNode(grammarAccess.getScalar_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulescalar_type=rulescalar_type();

            state._fsp--;

             current =iv_rulescalar_type; 
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
    // $ANTLR end "entryRulescalar_type"


    // $ANTLR start "rulescalar_type"
    // InternalPascal.g:2176:1: rulescalar_type returns [EObject current=null] : (otherlv_0= '(' this_identifier_list_1= ruleidentifier_list otherlv_2= ')' ) ;
    public final EObject rulescalar_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_identifier_list_1 = null;



        	enterRule();

        try {
            // InternalPascal.g:2182:2: ( (otherlv_0= '(' this_identifier_list_1= ruleidentifier_list otherlv_2= ')' ) )
            // InternalPascal.g:2183:2: (otherlv_0= '(' this_identifier_list_1= ruleidentifier_list otherlv_2= ')' )
            {
            // InternalPascal.g:2183:2: (otherlv_0= '(' this_identifier_list_1= ruleidentifier_list otherlv_2= ')' )
            // InternalPascal.g:2184:3: otherlv_0= '(' this_identifier_list_1= ruleidentifier_list otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getScalar_typeAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getScalar_typeAccess().getIdentifier_listParserRuleCall_1());
            		
            pushFollow(FOLLOW_7);
            this_identifier_list_1=ruleidentifier_list();

            state._fsp--;


            			current = this_identifier_list_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getScalar_typeAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "rulescalar_type"


    // $ANTLR start "entryRulesubrange_type"
    // InternalPascal.g:2204:1: entryRulesubrange_type returns [EObject current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final EObject entryRulesubrange_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrange_type = null;


        try {
            // InternalPascal.g:2204:54: (iv_rulesubrange_type= rulesubrange_type EOF )
            // InternalPascal.g:2205:2: iv_rulesubrange_type= rulesubrange_type EOF
            {
             newCompositeNode(grammarAccess.getSubrange_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesubrange_type=rulesubrange_type();

            state._fsp--;

             current =iv_rulesubrange_type; 
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
    // $ANTLR end "entryRulesubrange_type"


    // $ANTLR start "rulesubrange_type"
    // InternalPascal.g:2211:1: rulesubrange_type returns [EObject current=null] : ( ( (lv_constants_0_0= ruleconstant ) ) this_DOTDOT_1= RULE_DOTDOT ( (lv_constants_2_0= ruleconstant ) ) ) ;
    public final EObject rulesubrange_type() throws RecognitionException {
        EObject current = null;

        Token this_DOTDOT_1=null;
        EObject lv_constants_0_0 = null;

        EObject lv_constants_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2217:2: ( ( ( (lv_constants_0_0= ruleconstant ) ) this_DOTDOT_1= RULE_DOTDOT ( (lv_constants_2_0= ruleconstant ) ) ) )
            // InternalPascal.g:2218:2: ( ( (lv_constants_0_0= ruleconstant ) ) this_DOTDOT_1= RULE_DOTDOT ( (lv_constants_2_0= ruleconstant ) ) )
            {
            // InternalPascal.g:2218:2: ( ( (lv_constants_0_0= ruleconstant ) ) this_DOTDOT_1= RULE_DOTDOT ( (lv_constants_2_0= ruleconstant ) ) )
            // InternalPascal.g:2219:3: ( (lv_constants_0_0= ruleconstant ) ) this_DOTDOT_1= RULE_DOTDOT ( (lv_constants_2_0= ruleconstant ) )
            {
            // InternalPascal.g:2219:3: ( (lv_constants_0_0= ruleconstant ) )
            // InternalPascal.g:2220:4: (lv_constants_0_0= ruleconstant )
            {
            // InternalPascal.g:2220:4: (lv_constants_0_0= ruleconstant )
            // InternalPascal.g:2221:5: lv_constants_0_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstantsConstantParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_constants_0_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
            					}
            					add(
            						current,
            						"constants",
            						lv_constants_0_0,
            						"org.xtext.compiler.pascal.Pascal.constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_DOTDOT_1=(Token)match(input,RULE_DOTDOT,FOLLOW_12); 

            			newLeafNode(this_DOTDOT_1, grammarAccess.getSubrange_typeAccess().getDOTDOTTerminalRuleCall_1());
            		
            // InternalPascal.g:2242:3: ( (lv_constants_2_0= ruleconstant ) )
            // InternalPascal.g:2243:4: (lv_constants_2_0= ruleconstant )
            {
            // InternalPascal.g:2243:4: (lv_constants_2_0= ruleconstant )
            // InternalPascal.g:2244:5: lv_constants_2_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstantsConstantParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_constants_2_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
            					}
            					add(
            						current,
            						"constants",
            						lv_constants_2_0,
            						"org.xtext.compiler.pascal.Pascal.constant");
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
    // $ANTLR end "rulesubrange_type"


    // $ANTLR start "entryRuletype_identifier"
    // InternalPascal.g:2265:1: entryRuletype_identifier returns [EObject current=null] : iv_ruletype_identifier= ruletype_identifier EOF ;
    public final EObject entryRuletype_identifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_identifier = null;


        try {
            // InternalPascal.g:2265:56: (iv_ruletype_identifier= ruletype_identifier EOF )
            // InternalPascal.g:2266:2: iv_ruletype_identifier= ruletype_identifier EOF
            {
             newCompositeNode(grammarAccess.getType_identifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype_identifier=ruletype_identifier();

            state._fsp--;

             current =iv_ruletype_identifier; 
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
    // $ANTLR end "entryRuletype_identifier"


    // $ANTLR start "ruletype_identifier"
    // InternalPascal.g:2272:1: ruletype_identifier returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) | ( ( (lv_type_1_0= 'CHAR' ) ) | ( (lv_type_2_0= 'boolean' ) ) | ( (lv_type_3_0= 'integer' ) ) | ( (lv_type_4_0= 'real' ) ) | ( (lv_type_5_0= 'string' ) ) ) ) ;
    public final EObject ruletype_identifier() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token lv_type_1_0=null;
        Token lv_type_2_0=null;
        Token lv_type_3_0=null;
        Token lv_type_4_0=null;
        Token lv_type_5_0=null;


        	enterRule();

        try {
            // InternalPascal.g:2278:2: ( ( ( (lv_names_0_0= RULE_ID ) ) | ( ( (lv_type_1_0= 'CHAR' ) ) | ( (lv_type_2_0= 'boolean' ) ) | ( (lv_type_3_0= 'integer' ) ) | ( (lv_type_4_0= 'real' ) ) | ( (lv_type_5_0= 'string' ) ) ) ) )
            // InternalPascal.g:2279:2: ( ( (lv_names_0_0= RULE_ID ) ) | ( ( (lv_type_1_0= 'CHAR' ) ) | ( (lv_type_2_0= 'boolean' ) ) | ( (lv_type_3_0= 'integer' ) ) | ( (lv_type_4_0= 'real' ) ) | ( (lv_type_5_0= 'string' ) ) ) )
            {
            // InternalPascal.g:2279:2: ( ( (lv_names_0_0= RULE_ID ) ) | ( ( (lv_type_1_0= 'CHAR' ) ) | ( (lv_type_2_0= 'boolean' ) ) | ( (lv_type_3_0= 'integer' ) ) | ( (lv_type_4_0= 'real' ) ) | ( (lv_type_5_0= 'string' ) ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=52 && LA26_0<=56)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalPascal.g:2280:3: ( (lv_names_0_0= RULE_ID ) )
                    {
                    // InternalPascal.g:2280:3: ( (lv_names_0_0= RULE_ID ) )
                    // InternalPascal.g:2281:4: (lv_names_0_0= RULE_ID )
                    {
                    // InternalPascal.g:2281:4: (lv_names_0_0= RULE_ID )
                    // InternalPascal.g:2282:5: lv_names_0_0= RULE_ID
                    {
                    lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_names_0_0, grammarAccess.getType_identifierAccess().getNamesIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getType_identifierRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"names",
                    						lv_names_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2299:3: ( ( (lv_type_1_0= 'CHAR' ) ) | ( (lv_type_2_0= 'boolean' ) ) | ( (lv_type_3_0= 'integer' ) ) | ( (lv_type_4_0= 'real' ) ) | ( (lv_type_5_0= 'string' ) ) )
                    {
                    // InternalPascal.g:2299:3: ( ( (lv_type_1_0= 'CHAR' ) ) | ( (lv_type_2_0= 'boolean' ) ) | ( (lv_type_3_0= 'integer' ) ) | ( (lv_type_4_0= 'real' ) ) | ( (lv_type_5_0= 'string' ) ) )
                    int alt25=5;
                    switch ( input.LA(1) ) {
                    case 52:
                        {
                        alt25=1;
                        }
                        break;
                    case 53:
                        {
                        alt25=2;
                        }
                        break;
                    case 54:
                        {
                        alt25=3;
                        }
                        break;
                    case 55:
                        {
                        alt25=4;
                        }
                        break;
                    case 56:
                        {
                        alt25=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }

                    switch (alt25) {
                        case 1 :
                            // InternalPascal.g:2300:4: ( (lv_type_1_0= 'CHAR' ) )
                            {
                            // InternalPascal.g:2300:4: ( (lv_type_1_0= 'CHAR' ) )
                            // InternalPascal.g:2301:5: (lv_type_1_0= 'CHAR' )
                            {
                            // InternalPascal.g:2301:5: (lv_type_1_0= 'CHAR' )
                            // InternalPascal.g:2302:6: lv_type_1_0= 'CHAR'
                            {
                            lv_type_1_0=(Token)match(input,52,FOLLOW_2); 

                            						newLeafNode(lv_type_1_0, grammarAccess.getType_identifierAccess().getTypeCHARKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getType_identifierRule());
                            						}
                            						addWithLastConsumed(current, "type", lv_type_1_0, "CHAR");
                            					

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPascal.g:2315:4: ( (lv_type_2_0= 'boolean' ) )
                            {
                            // InternalPascal.g:2315:4: ( (lv_type_2_0= 'boolean' ) )
                            // InternalPascal.g:2316:5: (lv_type_2_0= 'boolean' )
                            {
                            // InternalPascal.g:2316:5: (lv_type_2_0= 'boolean' )
                            // InternalPascal.g:2317:6: lv_type_2_0= 'boolean'
                            {
                            lv_type_2_0=(Token)match(input,53,FOLLOW_2); 

                            						newLeafNode(lv_type_2_0, grammarAccess.getType_identifierAccess().getTypeBooleanKeyword_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getType_identifierRule());
                            						}
                            						addWithLastConsumed(current, "type", lv_type_2_0, "boolean");
                            					

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalPascal.g:2330:4: ( (lv_type_3_0= 'integer' ) )
                            {
                            // InternalPascal.g:2330:4: ( (lv_type_3_0= 'integer' ) )
                            // InternalPascal.g:2331:5: (lv_type_3_0= 'integer' )
                            {
                            // InternalPascal.g:2331:5: (lv_type_3_0= 'integer' )
                            // InternalPascal.g:2332:6: lv_type_3_0= 'integer'
                            {
                            lv_type_3_0=(Token)match(input,54,FOLLOW_2); 

                            						newLeafNode(lv_type_3_0, grammarAccess.getType_identifierAccess().getTypeIntegerKeyword_1_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getType_identifierRule());
                            						}
                            						addWithLastConsumed(current, "type", lv_type_3_0, "integer");
                            					

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalPascal.g:2345:4: ( (lv_type_4_0= 'real' ) )
                            {
                            // InternalPascal.g:2345:4: ( (lv_type_4_0= 'real' ) )
                            // InternalPascal.g:2346:5: (lv_type_4_0= 'real' )
                            {
                            // InternalPascal.g:2346:5: (lv_type_4_0= 'real' )
                            // InternalPascal.g:2347:6: lv_type_4_0= 'real'
                            {
                            lv_type_4_0=(Token)match(input,55,FOLLOW_2); 

                            						newLeafNode(lv_type_4_0, grammarAccess.getType_identifierAccess().getTypeRealKeyword_1_3_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getType_identifierRule());
                            						}
                            						addWithLastConsumed(current, "type", lv_type_4_0, "real");
                            					

                            }


                            }


                            }
                            break;
                        case 5 :
                            // InternalPascal.g:2360:4: ( (lv_type_5_0= 'string' ) )
                            {
                            // InternalPascal.g:2360:4: ( (lv_type_5_0= 'string' ) )
                            // InternalPascal.g:2361:5: (lv_type_5_0= 'string' )
                            {
                            // InternalPascal.g:2361:5: (lv_type_5_0= 'string' )
                            // InternalPascal.g:2362:6: lv_type_5_0= 'string'
                            {
                            lv_type_5_0=(Token)match(input,56,FOLLOW_2); 

                            						newLeafNode(lv_type_5_0, grammarAccess.getType_identifierAccess().getTypeStringKeyword_1_4_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getType_identifierRule());
                            						}
                            						addWithLastConsumed(current, "type", lv_type_5_0, "string");
                            					

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruletype_identifier"


    // $ANTLR start "entryRulestring_type"
    // InternalPascal.g:2379:1: entryRulestring_type returns [EObject current=null] : iv_rulestring_type= rulestring_type EOF ;
    public final EObject entryRulestring_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring_type = null;


        try {
            // InternalPascal.g:2379:52: (iv_rulestring_type= rulestring_type EOF )
            // InternalPascal.g:2380:2: iv_rulestring_type= rulestring_type EOF
            {
             newCompositeNode(grammarAccess.getString_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestring_type=rulestring_type();

            state._fsp--;

             current =iv_rulestring_type; 
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
    // $ANTLR end "entryRulestring_type"


    // $ANTLR start "rulestring_type"
    // InternalPascal.g:2386:1: rulestring_type returns [EObject current=null] : (otherlv_0= 'string' otherlv_1= '[' ( ( (lv_names_2_0= RULE_ID ) ) | ( (lv_number_3_0= ruleunsigned_number ) ) ) otherlv_4= ']' ) ;
    public final EObject rulestring_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;
        Token otherlv_4=null;
        EObject lv_number_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2392:2: ( (otherlv_0= 'string' otherlv_1= '[' ( ( (lv_names_2_0= RULE_ID ) ) | ( (lv_number_3_0= ruleunsigned_number ) ) ) otherlv_4= ']' ) )
            // InternalPascal.g:2393:2: (otherlv_0= 'string' otherlv_1= '[' ( ( (lv_names_2_0= RULE_ID ) ) | ( (lv_number_3_0= ruleunsigned_number ) ) ) otherlv_4= ']' )
            {
            // InternalPascal.g:2393:2: (otherlv_0= 'string' otherlv_1= '[' ( ( (lv_names_2_0= RULE_ID ) ) | ( (lv_number_3_0= ruleunsigned_number ) ) ) otherlv_4= ']' )
            // InternalPascal.g:2394:3: otherlv_0= 'string' otherlv_1= '[' ( ( (lv_names_2_0= RULE_ID ) ) | ( (lv_number_3_0= ruleunsigned_number ) ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getString_typeAccess().getStringKeyword_0());
            		
            otherlv_1=(Token)match(input,47,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getString_typeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalPascal.g:2402:3: ( ( (lv_names_2_0= RULE_ID ) ) | ( (lv_number_3_0= ruleunsigned_number ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=RULE_NUM_INT && LA27_0<=RULE_NUM_REAL)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalPascal.g:2403:4: ( (lv_names_2_0= RULE_ID ) )
                    {
                    // InternalPascal.g:2403:4: ( (lv_names_2_0= RULE_ID ) )
                    // InternalPascal.g:2404:5: (lv_names_2_0= RULE_ID )
                    {
                    // InternalPascal.g:2404:5: (lv_names_2_0= RULE_ID )
                    // InternalPascal.g:2405:6: lv_names_2_0= RULE_ID
                    {
                    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(lv_names_2_0, grammarAccess.getString_typeAccess().getNamesIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getString_typeRule());
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
                case 2 :
                    // InternalPascal.g:2422:4: ( (lv_number_3_0= ruleunsigned_number ) )
                    {
                    // InternalPascal.g:2422:4: ( (lv_number_3_0= ruleunsigned_number ) )
                    // InternalPascal.g:2423:5: (lv_number_3_0= ruleunsigned_number )
                    {
                    // InternalPascal.g:2423:5: (lv_number_3_0= ruleunsigned_number )
                    // InternalPascal.g:2424:6: lv_number_3_0= ruleunsigned_number
                    {

                    						newCompositeNode(grammarAccess.getString_typeAccess().getNumberUnsigned_numberParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_number_3_0=ruleunsigned_number();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getString_typeRule());
                    						}
                    						add(
                    							current,
                    							"number",
                    							lv_number_3_0,
                    							"org.xtext.compiler.pascal.Pascal.unsigned_number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getString_typeAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "rulestring_type"


    // $ANTLR start "entryRuleunsigned_constant"
    // InternalPascal.g:2450:1: entryRuleunsigned_constant returns [EObject current=null] : iv_ruleunsigned_constant= ruleunsigned_constant EOF ;
    public final EObject entryRuleunsigned_constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_constant = null;


        try {
            // InternalPascal.g:2450:58: (iv_ruleunsigned_constant= ruleunsigned_constant EOF )
            // InternalPascal.g:2451:2: iv_ruleunsigned_constant= ruleunsigned_constant EOF
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
    // InternalPascal.g:2457:1: ruleunsigned_constant returns [EObject current=null] : ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_char_1_0= ruleconstant_chr ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_nil_3_0= RULE_NIL ) ) ) ;
    public final EObject ruleunsigned_constant() throws RecognitionException {
        EObject current = null;

        Token lv_string_2_0=null;
        Token lv_nil_3_0=null;
        EObject lv_number_0_0 = null;

        EObject lv_char_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2463:2: ( ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_char_1_0= ruleconstant_chr ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_nil_3_0= RULE_NIL ) ) ) )
            // InternalPascal.g:2464:2: ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_char_1_0= ruleconstant_chr ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_nil_3_0= RULE_NIL ) ) )
            {
            // InternalPascal.g:2464:2: ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_char_1_0= ruleconstant_chr ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_nil_3_0= RULE_NIL ) ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
                {
                alt28=1;
                }
                break;
            case 57:
                {
                alt28=2;
                }
                break;
            case RULE_STRING:
                {
                alt28=3;
                }
                break;
            case RULE_NIL:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalPascal.g:2465:3: ( (lv_number_0_0= ruleunsigned_number ) )
                    {
                    // InternalPascal.g:2465:3: ( (lv_number_0_0= ruleunsigned_number ) )
                    // InternalPascal.g:2466:4: (lv_number_0_0= ruleunsigned_number )
                    {
                    // InternalPascal.g:2466:4: (lv_number_0_0= ruleunsigned_number )
                    // InternalPascal.g:2467:5: lv_number_0_0= ruleunsigned_number
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
                    // InternalPascal.g:2485:3: ( (lv_char_1_0= ruleconstant_chr ) )
                    {
                    // InternalPascal.g:2485:3: ( (lv_char_1_0= ruleconstant_chr ) )
                    // InternalPascal.g:2486:4: (lv_char_1_0= ruleconstant_chr )
                    {
                    // InternalPascal.g:2486:4: (lv_char_1_0= ruleconstant_chr )
                    // InternalPascal.g:2487:5: lv_char_1_0= ruleconstant_chr
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
                    // InternalPascal.g:2505:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalPascal.g:2505:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalPascal.g:2506:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalPascal.g:2506:4: (lv_string_2_0= RULE_STRING )
                    // InternalPascal.g:2507:5: lv_string_2_0= RULE_STRING
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
                    // InternalPascal.g:2524:3: ( (lv_nil_3_0= RULE_NIL ) )
                    {
                    // InternalPascal.g:2524:3: ( (lv_nil_3_0= RULE_NIL ) )
                    // InternalPascal.g:2525:4: (lv_nil_3_0= RULE_NIL )
                    {
                    // InternalPascal.g:2525:4: (lv_nil_3_0= RULE_NIL )
                    // InternalPascal.g:2526:5: lv_nil_3_0= RULE_NIL
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
    // InternalPascal.g:2546:1: entryRuleunsigned_number returns [EObject current=null] : iv_ruleunsigned_number= ruleunsigned_number EOF ;
    public final EObject entryRuleunsigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_number = null;


        try {
            // InternalPascal.g:2546:56: (iv_ruleunsigned_number= ruleunsigned_number EOF )
            // InternalPascal.g:2547:2: iv_ruleunsigned_number= ruleunsigned_number EOF
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
    // InternalPascal.g:2553:1: ruleunsigned_number returns [EObject current=null] : ( ( (lv_numbers_0_0= ruleunsigned_integer ) ) | ( (lv_numbers_1_0= ruleunsigned_real ) ) ) ;
    public final EObject ruleunsigned_number() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_numbers_0_0 = null;

        AntlrDatatypeRuleToken lv_numbers_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2559:2: ( ( ( (lv_numbers_0_0= ruleunsigned_integer ) ) | ( (lv_numbers_1_0= ruleunsigned_real ) ) ) )
            // InternalPascal.g:2560:2: ( ( (lv_numbers_0_0= ruleunsigned_integer ) ) | ( (lv_numbers_1_0= ruleunsigned_real ) ) )
            {
            // InternalPascal.g:2560:2: ( ( (lv_numbers_0_0= ruleunsigned_integer ) ) | ( (lv_numbers_1_0= ruleunsigned_real ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_NUM_INT) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_NUM_REAL) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalPascal.g:2561:3: ( (lv_numbers_0_0= ruleunsigned_integer ) )
                    {
                    // InternalPascal.g:2561:3: ( (lv_numbers_0_0= ruleunsigned_integer ) )
                    // InternalPascal.g:2562:4: (lv_numbers_0_0= ruleunsigned_integer )
                    {
                    // InternalPascal.g:2562:4: (lv_numbers_0_0= ruleunsigned_integer )
                    // InternalPascal.g:2563:5: lv_numbers_0_0= ruleunsigned_integer
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
                    // InternalPascal.g:2581:3: ( (lv_numbers_1_0= ruleunsigned_real ) )
                    {
                    // InternalPascal.g:2581:3: ( (lv_numbers_1_0= ruleunsigned_real ) )
                    // InternalPascal.g:2582:4: (lv_numbers_1_0= ruleunsigned_real )
                    {
                    // InternalPascal.g:2582:4: (lv_numbers_1_0= ruleunsigned_real )
                    // InternalPascal.g:2583:5: lv_numbers_1_0= ruleunsigned_real
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
    // InternalPascal.g:2604:1: entryRuleconstant_chr returns [EObject current=null] : iv_ruleconstant_chr= ruleconstant_chr EOF ;
    public final EObject entryRuleconstant_chr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_chr = null;


        try {
            // InternalPascal.g:2604:53: (iv_ruleconstant_chr= ruleconstant_chr EOF )
            // InternalPascal.g:2605:2: iv_ruleconstant_chr= ruleconstant_chr EOF
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
    // InternalPascal.g:2611:1: ruleconstant_chr returns [EObject current=null] : (otherlv_0= 'chr' otherlv_1= '(' ( (lv_numbers_2_0= ruleunsigned_integer ) ) otherlv_3= ')' ) ;
    public final EObject ruleconstant_chr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_numbers_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2617:2: ( (otherlv_0= 'chr' otherlv_1= '(' ( (lv_numbers_2_0= ruleunsigned_integer ) ) otherlv_3= ')' ) )
            // InternalPascal.g:2618:2: (otherlv_0= 'chr' otherlv_1= '(' ( (lv_numbers_2_0= ruleunsigned_integer ) ) otherlv_3= ')' )
            {
            // InternalPascal.g:2618:2: (otherlv_0= 'chr' otherlv_1= '(' ( (lv_numbers_2_0= ruleunsigned_integer ) ) otherlv_3= ')' )
            // InternalPascal.g:2619:3: otherlv_0= 'chr' otherlv_1= '(' ( (lv_numbers_2_0= ruleunsigned_integer ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getConstant_chrAccess().getChrKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getConstant_chrAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPascal.g:2627:3: ( (lv_numbers_2_0= ruleunsigned_integer ) )
            // InternalPascal.g:2628:4: (lv_numbers_2_0= ruleunsigned_integer )
            {
            // InternalPascal.g:2628:4: (lv_numbers_2_0= ruleunsigned_integer )
            // InternalPascal.g:2629:5: lv_numbers_2_0= ruleunsigned_integer
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
    // InternalPascal.g:2654:1: entryRuleprocedure_statement returns [String current=null] : iv_ruleprocedure_statement= ruleprocedure_statement EOF ;
    public final String entryRuleprocedure_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprocedure_statement = null;


        try {
            // InternalPascal.g:2654:59: (iv_ruleprocedure_statement= ruleprocedure_statement EOF )
            // InternalPascal.g:2655:2: iv_ruleprocedure_statement= ruleprocedure_statement EOF
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
    // InternalPascal.g:2661:1: ruleprocedure_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'procedure' ;
    public final AntlrDatatypeRuleToken ruleprocedure_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:2667:2: (kw= 'procedure' )
            // InternalPascal.g:2668:2: kw= 'procedure'
            {
            kw=(Token)match(input,58,FOLLOW_2); 

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
    // InternalPascal.g:2676:1: entryRulegoto_statement returns [String current=null] : iv_rulegoto_statement= rulegoto_statement EOF ;
    public final String entryRulegoto_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegoto_statement = null;


        try {
            // InternalPascal.g:2676:54: (iv_rulegoto_statement= rulegoto_statement EOF )
            // InternalPascal.g:2677:2: iv_rulegoto_statement= rulegoto_statement EOF
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
    // InternalPascal.g:2683:1: rulegoto_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'goto' ;
    public final AntlrDatatypeRuleToken rulegoto_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:2689:2: (kw= 'goto' )
            // InternalPascal.g:2690:2: kw= 'goto'
            {
            kw=(Token)match(input,59,FOLLOW_2); 

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
    // InternalPascal.g:2698:1: entryRulestructured_statement returns [String current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final String entryRulestructured_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestructured_statement = null;


        try {
            // InternalPascal.g:2698:60: (iv_rulestructured_statement= rulestructured_statement EOF )
            // InternalPascal.g:2699:2: iv_rulestructured_statement= rulestructured_statement EOF
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
    // InternalPascal.g:2705:1: rulestructured_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'structured' ;
    public final AntlrDatatypeRuleToken rulestructured_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:2711:2: (kw= 'structured' )
            // InternalPascal.g:2712:2: kw= 'structured'
            {
            kw=(Token)match(input,60,FOLLOW_2); 

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
    // InternalPascal.g:2720:1: entryRuleunsigned_integer returns [String current=null] : iv_ruleunsigned_integer= ruleunsigned_integer EOF ;
    public final String entryRuleunsigned_integer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsigned_integer = null;


        try {
            // InternalPascal.g:2720:56: (iv_ruleunsigned_integer= ruleunsigned_integer EOF )
            // InternalPascal.g:2721:2: iv_ruleunsigned_integer= ruleunsigned_integer EOF
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
    // InternalPascal.g:2727:1: ruleunsigned_integer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NUM_INT_0= RULE_NUM_INT ;
    public final AntlrDatatypeRuleToken ruleunsigned_integer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NUM_INT_0=null;


        	enterRule();

        try {
            // InternalPascal.g:2733:2: (this_NUM_INT_0= RULE_NUM_INT )
            // InternalPascal.g:2734:2: this_NUM_INT_0= RULE_NUM_INT
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
    // InternalPascal.g:2744:1: entryRuleunsigned_real returns [String current=null] : iv_ruleunsigned_real= ruleunsigned_real EOF ;
    public final String entryRuleunsigned_real() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsigned_real = null;


        try {
            // InternalPascal.g:2744:53: (iv_ruleunsigned_real= ruleunsigned_real EOF )
            // InternalPascal.g:2745:2: iv_ruleunsigned_real= ruleunsigned_real EOF
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
    // InternalPascal.g:2751:1: ruleunsigned_real returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NUM_REAL_0= RULE_NUM_REAL ;
    public final AntlrDatatypeRuleToken ruleunsigned_real() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NUM_REAL_0=null;


        	enterRule();

        try {
            // InternalPascal.g:2757:2: (this_NUM_REAL_0= RULE_NUM_REAL )
            // InternalPascal.g:2758:2: this_NUM_REAL_0= RULE_NUM_REAL
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
    // InternalPascal.g:2768:1: entryRuleadditive_operator returns [String current=null] : iv_ruleadditive_operator= ruleadditive_operator EOF ;
    public final String entryRuleadditive_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleadditive_operator = null;


        try {
            // InternalPascal.g:2768:57: (iv_ruleadditive_operator= ruleadditive_operator EOF )
            // InternalPascal.g:2769:2: iv_ruleadditive_operator= ruleadditive_operator EOF
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
    // InternalPascal.g:2775:1: ruleadditive_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_OR_2= RULE_OR ) ;
    public final AntlrDatatypeRuleToken ruleadditive_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_MINUS_1=null;
        Token this_OR_2=null;


        	enterRule();

        try {
            // InternalPascal.g:2781:2: ( (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_OR_2= RULE_OR ) )
            // InternalPascal.g:2782:2: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_OR_2= RULE_OR )
            {
            // InternalPascal.g:2782:2: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_OR_2= RULE_OR )
            int alt30=3;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt30=1;
                }
                break;
            case RULE_MINUS:
                {
                alt30=2;
                }
                break;
            case RULE_OR:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalPascal.g:2783:3: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_2); 

                    			current.merge(this_PLUS_0);
                    		

                    			newLeafNode(this_PLUS_0, grammarAccess.getAdditive_operatorAccess().getPLUSTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2791:3: this_MINUS_1= RULE_MINUS
                    {
                    this_MINUS_1=(Token)match(input,RULE_MINUS,FOLLOW_2); 

                    			current.merge(this_MINUS_1);
                    		

                    			newLeafNode(this_MINUS_1, grammarAccess.getAdditive_operatorAccess().getMINUSTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascal.g:2799:3: this_OR_2= RULE_OR
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
    // InternalPascal.g:2810:1: entryRulemultiplicative_operator returns [String current=null] : iv_rulemultiplicative_operator= rulemultiplicative_operator EOF ;
    public final String entryRulemultiplicative_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemultiplicative_operator = null;


        try {
            // InternalPascal.g:2810:63: (iv_rulemultiplicative_operator= rulemultiplicative_operator EOF )
            // InternalPascal.g:2811:2: iv_rulemultiplicative_operator= rulemultiplicative_operator EOF
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
    // InternalPascal.g:2817:1: rulemultiplicative_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_DIV_2= RULE_DIV | this_MOD_3= RULE_MOD | this_AND_4= RULE_AND ) ;
    public final AntlrDatatypeRuleToken rulemultiplicative_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STAR_0=null;
        Token this_SLASH_1=null;
        Token this_DIV_2=null;
        Token this_MOD_3=null;
        Token this_AND_4=null;


        	enterRule();

        try {
            // InternalPascal.g:2823:2: ( (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_DIV_2= RULE_DIV | this_MOD_3= RULE_MOD | this_AND_4= RULE_AND ) )
            // InternalPascal.g:2824:2: (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_DIV_2= RULE_DIV | this_MOD_3= RULE_MOD | this_AND_4= RULE_AND )
            {
            // InternalPascal.g:2824:2: (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_DIV_2= RULE_DIV | this_MOD_3= RULE_MOD | this_AND_4= RULE_AND )
            int alt31=5;
            switch ( input.LA(1) ) {
            case RULE_STAR:
                {
                alt31=1;
                }
                break;
            case RULE_SLASH:
                {
                alt31=2;
                }
                break;
            case RULE_DIV:
                {
                alt31=3;
                }
                break;
            case RULE_MOD:
                {
                alt31=4;
                }
                break;
            case RULE_AND:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalPascal.g:2825:3: this_STAR_0= RULE_STAR
                    {
                    this_STAR_0=(Token)match(input,RULE_STAR,FOLLOW_2); 

                    			current.merge(this_STAR_0);
                    		

                    			newLeafNode(this_STAR_0, grammarAccess.getMultiplicative_operatorAccess().getSTARTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2833:3: this_SLASH_1= RULE_SLASH
                    {
                    this_SLASH_1=(Token)match(input,RULE_SLASH,FOLLOW_2); 

                    			current.merge(this_SLASH_1);
                    		

                    			newLeafNode(this_SLASH_1, grammarAccess.getMultiplicative_operatorAccess().getSLASHTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascal.g:2841:3: this_DIV_2= RULE_DIV
                    {
                    this_DIV_2=(Token)match(input,RULE_DIV,FOLLOW_2); 

                    			current.merge(this_DIV_2);
                    		

                    			newLeafNode(this_DIV_2, grammarAccess.getMultiplicative_operatorAccess().getDIVTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPascal.g:2849:3: this_MOD_3= RULE_MOD
                    {
                    this_MOD_3=(Token)match(input,RULE_MOD,FOLLOW_2); 

                    			current.merge(this_MOD_3);
                    		

                    			newLeafNode(this_MOD_3, grammarAccess.getMultiplicative_operatorAccess().getMODTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPascal.g:2857:3: this_AND_4= RULE_AND
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
    // InternalPascal.g:2868:1: entryRulerelational_operator returns [String current=null] : iv_rulerelational_operator= rulerelational_operator EOF ;
    public final String entryRulerelational_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerelational_operator = null;


        try {
            // InternalPascal.g:2868:59: (iv_rulerelational_operator= rulerelational_operator EOF )
            // InternalPascal.g:2869:2: iv_rulerelational_operator= rulerelational_operator EOF
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
    // InternalPascal.g:2875:1: rulerelational_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_LT_2= RULE_LT | this_LE_3= RULE_LE | this_GE_4= RULE_GE | this_GT_5= RULE_GT | this_IN_6= RULE_IN ) ;
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
            // InternalPascal.g:2881:2: ( (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_LT_2= RULE_LT | this_LE_3= RULE_LE | this_GE_4= RULE_GE | this_GT_5= RULE_GT | this_IN_6= RULE_IN ) )
            // InternalPascal.g:2882:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_LT_2= RULE_LT | this_LE_3= RULE_LE | this_GE_4= RULE_GE | this_GT_5= RULE_GT | this_IN_6= RULE_IN )
            {
            // InternalPascal.g:2882:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_LT_2= RULE_LT | this_LE_3= RULE_LE | this_GE_4= RULE_GE | this_GT_5= RULE_GT | this_IN_6= RULE_IN )
            int alt32=7;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                alt32=1;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt32=2;
                }
                break;
            case RULE_LT:
                {
                alt32=3;
                }
                break;
            case RULE_LE:
                {
                alt32=4;
                }
                break;
            case RULE_GE:
                {
                alt32=5;
                }
                break;
            case RULE_GT:
                {
                alt32=6;
                }
                break;
            case RULE_IN:
                {
                alt32=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalPascal.g:2883:3: this_EQUAL_0= RULE_EQUAL
                    {
                    this_EQUAL_0=(Token)match(input,RULE_EQUAL,FOLLOW_2); 

                    			current.merge(this_EQUAL_0);
                    		

                    			newLeafNode(this_EQUAL_0, grammarAccess.getRelational_operatorAccess().getEQUALTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2891:3: this_NOT_EQUAL_1= RULE_NOT_EQUAL
                    {
                    this_NOT_EQUAL_1=(Token)match(input,RULE_NOT_EQUAL,FOLLOW_2); 

                    			current.merge(this_NOT_EQUAL_1);
                    		

                    			newLeafNode(this_NOT_EQUAL_1, grammarAccess.getRelational_operatorAccess().getNOT_EQUALTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascal.g:2899:3: this_LT_2= RULE_LT
                    {
                    this_LT_2=(Token)match(input,RULE_LT,FOLLOW_2); 

                    			current.merge(this_LT_2);
                    		

                    			newLeafNode(this_LT_2, grammarAccess.getRelational_operatorAccess().getLTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPascal.g:2907:3: this_LE_3= RULE_LE
                    {
                    this_LE_3=(Token)match(input,RULE_LE,FOLLOW_2); 

                    			current.merge(this_LE_3);
                    		

                    			newLeafNode(this_LE_3, grammarAccess.getRelational_operatorAccess().getLETerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPascal.g:2915:3: this_GE_4= RULE_GE
                    {
                    this_GE_4=(Token)match(input,RULE_GE,FOLLOW_2); 

                    			current.merge(this_GE_4);
                    		

                    			newLeafNode(this_GE_4, grammarAccess.getRelational_operatorAccess().getGETerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPascal.g:2923:3: this_GT_5= RULE_GT
                    {
                    this_GT_5=(Token)match(input,RULE_GT,FOLLOW_2); 

                    			current.merge(this_GT_5);
                    		

                    			newLeafNode(this_GT_5, grammarAccess.getRelational_operatorAccess().getGTTerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalPascal.g:2931:3: this_IN_6= RULE_IN
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
    // InternalPascal.g:2942:1: entryRulebool returns [String current=null] : iv_rulebool= rulebool EOF ;
    public final String entryRulebool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebool = null;


        try {
            // InternalPascal.g:2942:44: (iv_rulebool= rulebool EOF )
            // InternalPascal.g:2943:2: iv_rulebool= rulebool EOF
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
    // InternalPascal.g:2949:1: rulebool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE ) ;
    public final AntlrDatatypeRuleToken rulebool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TRUE_0=null;
        Token this_FALSE_1=null;


        	enterRule();

        try {
            // InternalPascal.g:2955:2: ( (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE ) )
            // InternalPascal.g:2956:2: (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE )
            {
            // InternalPascal.g:2956:2: (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_TRUE) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_FALSE) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalPascal.g:2957:3: this_TRUE_0= RULE_TRUE
                    {
                    this_TRUE_0=(Token)match(input,RULE_TRUE,FOLLOW_2); 

                    			current.merge(this_TRUE_0);
                    		

                    			newLeafNode(this_TRUE_0, grammarAccess.getBoolAccess().getTRUETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2965:3: this_FALSE_1= RULE_FALSE
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


    // $ANTLR start "entryRulesign"
    // InternalPascal.g:2976:1: entryRulesign returns [String current=null] : iv_rulesign= rulesign EOF ;
    public final String entryRulesign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesign = null;


        try {
            // InternalPascal.g:2976:44: (iv_rulesign= rulesign EOF )
            // InternalPascal.g:2977:2: iv_rulesign= rulesign EOF
            {
             newCompositeNode(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesign=rulesign();

            state._fsp--;

             current =iv_rulesign.getText(); 
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
    // $ANTLR end "entryRulesign"


    // $ANTLR start "rulesign"
    // InternalPascal.g:2983:1: rulesign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS ) ;
    public final AntlrDatatypeRuleToken rulesign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_MINUS_1=null;


        	enterRule();

        try {
            // InternalPascal.g:2989:2: ( (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS ) )
            // InternalPascal.g:2990:2: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS )
            {
            // InternalPascal.g:2990:2: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_PLUS) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_MINUS) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalPascal.g:2991:3: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_2); 

                    			current.merge(this_PLUS_0);
                    		

                    			newLeafNode(this_PLUS_0, grammarAccess.getSignAccess().getPLUSTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2999:3: this_MINUS_1= RULE_MINUS
                    {
                    this_MINUS_1=(Token)match(input,RULE_MINUS,FOLLOW_2); 

                    			current.merge(this_MINUS_1);
                    		

                    			newLeafNode(this_MINUS_1, grammarAccess.getSignAccess().getMINUSTerminalRuleCall_1());
                    		

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
    // $ANTLR end "rulesign"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000160000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0200000000006350L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x03F0002000006350L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x1C00408000002010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1C00400000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0202C02018007750L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000A800800000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0004010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000007E00022L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000008302L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000001F0002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000002000L});

}