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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_EQUAL", "RULE_STRING", "RULE_VAR", "RULE_ASSIGN", "RULE_PLUS", "RULE_MINUS", "RULE_NOT", "RULE_DOTDOT", "RULE_NIL", "RULE_NUM_INT", "RULE_NUM_REAL", "RULE_OR", "RULE_STAR", "RULE_SLASH", "RULE_DIV", "RULE_MOD", "RULE_AND", "RULE_NOT_EQUAL", "RULE_LT", "RULE_LE", "RULE_GE", "RULE_GT", "RULE_IN", "RULE_PROCEDURE", "RULE_FUNCTION", "RULE_TRUE", "RULE_FALSE", "RULE_EXPONENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "'('", "')'", "';'", "','", "'const'", "':'", "'begin'", "'end'", "'@'", "'['", "']'", "'(.'", "'.)'", "'^'", "'CHAR'", "'boolean'", "'integer'", "'real'", "'string'", "'chr'", "'goto'", "'structured'"
    };
    public static final int T__50=50;
    public static final int RULE_LE=24;
    public static final int RULE_GT=26;
    public static final int T__59=59;
    public static final int RULE_DIV=19;
    public static final int RULE_NIL=13;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_NOT_EQUAL=22;
    public static final int RULE_GE=25;
    public static final int T__51=51;
    public static final int RULE_DOTDOT=12;
    public static final int RULE_OR=16;
    public static final int RULE_STAR=17;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_EQUAL=5;
    public static final int RULE_MOD=20;
    public static final int RULE_ASSIGN=8;
    public static final int RULE_SLASH=18;
    public static final int RULE_LT=23;
    public static final int RULE_INT=33;
    public static final int RULE_ML_COMMENT=34;
    public static final int RULE_FALSE=31;
    public static final int RULE_FUNCTION=29;
    public static final int RULE_STRING=6;
    public static final int RULE_NOT=11;
    public static final int RULE_AND=21;
    public static final int RULE_PROCEDURE=28;
    public static final int RULE_SL_COMMENT=35;
    public static final int RULE_IN=27;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_TRUE=30;
    public static final int RULE_PLUS=9;
    public static final int EOF=-1;
    public static final int RULE_WS=36;
    public static final int RULE_NUM_REAL=15;
    public static final int RULE_ANY_OTHER=37;
    public static final int RULE_MINUS=10;
    public static final int RULE_EXPONENT=32;
    public static final int RULE_NUM_INT=14;
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
    public static final int RULE_VAR=7;

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

            otherlv_2=(Token)match(input,38,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,39,FOLLOW_5); 

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

            if ( (LA1_0==40) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:199:4: otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_5); 

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

                    otherlv_4=(Token)match(input,41,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,42,FOLLOW_2); 

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

                if ( (LA2_0==43) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPascal.g:269:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,43,FOLLOW_5); 

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
    // InternalPascal.g:303:1: ruleblock returns [EObject current=null] : ( ( ( (lv_constantpart_0_0= ruleconstant_definition_part ) ) | ( (lv_variablepart_1_0= rulevariable_declaration_part ) ) | ( (lv_procedure_function_part_2_0= ruleprocedure_and_function_declaration_part ) ) )* ( (lv_statement_3_0= rulecompound_statement ) ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_constantpart_0_0 = null;

        EObject lv_variablepart_1_0 = null;

        EObject lv_procedure_function_part_2_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:309:2: ( ( ( ( (lv_constantpart_0_0= ruleconstant_definition_part ) ) | ( (lv_variablepart_1_0= rulevariable_declaration_part ) ) | ( (lv_procedure_function_part_2_0= ruleprocedure_and_function_declaration_part ) ) )* ( (lv_statement_3_0= rulecompound_statement ) ) ) )
            // InternalPascal.g:310:2: ( ( ( (lv_constantpart_0_0= ruleconstant_definition_part ) ) | ( (lv_variablepart_1_0= rulevariable_declaration_part ) ) | ( (lv_procedure_function_part_2_0= ruleprocedure_and_function_declaration_part ) ) )* ( (lv_statement_3_0= rulecompound_statement ) ) )
            {
            // InternalPascal.g:310:2: ( ( ( (lv_constantpart_0_0= ruleconstant_definition_part ) ) | ( (lv_variablepart_1_0= rulevariable_declaration_part ) ) | ( (lv_procedure_function_part_2_0= ruleprocedure_and_function_declaration_part ) ) )* ( (lv_statement_3_0= rulecompound_statement ) ) )
            // InternalPascal.g:311:3: ( ( (lv_constantpart_0_0= ruleconstant_definition_part ) ) | ( (lv_variablepart_1_0= rulevariable_declaration_part ) ) | ( (lv_procedure_function_part_2_0= ruleprocedure_and_function_declaration_part ) ) )* ( (lv_statement_3_0= rulecompound_statement ) )
            {
            // InternalPascal.g:311:3: ( ( (lv_constantpart_0_0= ruleconstant_definition_part ) ) | ( (lv_variablepart_1_0= rulevariable_declaration_part ) ) | ( (lv_procedure_function_part_2_0= ruleprocedure_and_function_declaration_part ) ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    alt3=1;
                    }
                    break;
                case RULE_VAR:
                    {
                    alt3=2;
                    }
                    break;
                case RULE_PROCEDURE:
                case RULE_FUNCTION:
                    {
                    alt3=3;
                    }
                    break;

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
            	case 3 :
            	    // InternalPascal.g:352:4: ( (lv_procedure_function_part_2_0= ruleprocedure_and_function_declaration_part ) )
            	    {
            	    // InternalPascal.g:352:4: ( (lv_procedure_function_part_2_0= ruleprocedure_and_function_declaration_part ) )
            	    // InternalPascal.g:353:5: (lv_procedure_function_part_2_0= ruleprocedure_and_function_declaration_part )
            	    {
            	    // InternalPascal.g:353:5: (lv_procedure_function_part_2_0= ruleprocedure_and_function_declaration_part )
            	    // InternalPascal.g:354:6: lv_procedure_function_part_2_0= ruleprocedure_and_function_declaration_part
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getProcedure_function_partProcedure_and_function_declaration_partParserRuleCall_0_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_procedure_function_part_2_0=ruleprocedure_and_function_declaration_part();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"procedure_function_part",
            	    							lv_procedure_function_part_2_0,
            	    							"org.xtext.compiler.pascal.Pascal.procedure_and_function_declaration_part");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalPascal.g:372:3: ( (lv_statement_3_0= rulecompound_statement ) )
            // InternalPascal.g:373:4: (lv_statement_3_0= rulecompound_statement )
            {
            // InternalPascal.g:373:4: (lv_statement_3_0= rulecompound_statement )
            // InternalPascal.g:374:5: lv_statement_3_0= rulecompound_statement
            {

            					newCompositeNode(grammarAccess.getBlockAccess().getStatementCompound_statementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_3_0=rulecompound_statement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_3_0,
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
    // InternalPascal.g:395:1: entryRuleconstant_definition_part returns [EObject current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final EObject entryRuleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition_part = null;


        try {
            // InternalPascal.g:395:65: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // InternalPascal.g:396:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
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
    // InternalPascal.g:402:1: ruleconstant_definition_part returns [EObject current=null] : (otherlv_0= 'const' ( ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_constants_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:408:2: ( (otherlv_0= 'const' ( ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ ) )
            // InternalPascal.g:409:2: (otherlv_0= 'const' ( ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ )
            {
            // InternalPascal.g:409:2: (otherlv_0= 'const' ( ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:410:3: otherlv_0= 'const' ( ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0());
            		
            // InternalPascal.g:414:3: ( ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+
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
            	    // InternalPascal.g:415:4: ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:415:4: ( (lv_constants_1_0= ruleconstant_definition ) )
            	    // InternalPascal.g:416:5: (lv_constants_1_0= ruleconstant_definition )
            	    {
            	    // InternalPascal.g:416:5: (lv_constants_1_0= ruleconstant_definition )
            	    // InternalPascal.g:417:6: lv_constants_1_0= ruleconstant_definition
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

            	    otherlv_2=(Token)match(input,42,FOLLOW_10); 

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
    // InternalPascal.g:443:1: entryRuleconstant_definition returns [EObject current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final EObject entryRuleconstant_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition = null;


        try {
            // InternalPascal.g:443:60: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // InternalPascal.g:444:2: iv_ruleconstant_definition= ruleconstant_definition EOF
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
    // InternalPascal.g:450:1: ruleconstant_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL this_constant_2= ruleconstant ) ;
    public final EObject ruleconstant_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_EQUAL_1=null;
        EObject this_constant_2 = null;



        	enterRule();

        try {
            // InternalPascal.g:456:2: ( ( ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL this_constant_2= ruleconstant ) )
            // InternalPascal.g:457:2: ( ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL this_constant_2= ruleconstant )
            {
            // InternalPascal.g:457:2: ( ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL this_constant_2= ruleconstant )
            // InternalPascal.g:458:3: ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL this_constant_2= ruleconstant
            {
            // InternalPascal.g:458:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:459:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:459:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:460:5: lv_name_0_0= RULE_ID
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
    // InternalPascal.g:492:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // InternalPascal.g:492:49: (iv_ruleconstant= ruleconstant EOF )
            // InternalPascal.g:493:2: iv_ruleconstant= ruleconstant EOF
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
    // InternalPascal.g:499:1: ruleconstant returns [EObject current=null] : (this_unsigned_number_0= ruleunsigned_number | ( rulesign this_unsigned_number_2= ruleunsigned_number ) | ( (lv_names_3_0= RULE_ID ) ) | ( rulesign ( (lv_names_5_0= RULE_ID ) ) ) | ( (lv_string_6_0= RULE_STRING ) ) | this_constant_chr_7= ruleconstant_chr ) ;
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
            // InternalPascal.g:505:2: ( (this_unsigned_number_0= ruleunsigned_number | ( rulesign this_unsigned_number_2= ruleunsigned_number ) | ( (lv_names_3_0= RULE_ID ) ) | ( rulesign ( (lv_names_5_0= RULE_ID ) ) ) | ( (lv_string_6_0= RULE_STRING ) ) | this_constant_chr_7= ruleconstant_chr ) )
            // InternalPascal.g:506:2: (this_unsigned_number_0= ruleunsigned_number | ( rulesign this_unsigned_number_2= ruleunsigned_number ) | ( (lv_names_3_0= RULE_ID ) ) | ( rulesign ( (lv_names_5_0= RULE_ID ) ) ) | ( (lv_string_6_0= RULE_STRING ) ) | this_constant_chr_7= ruleconstant_chr )
            {
            // InternalPascal.g:506:2: (this_unsigned_number_0= ruleunsigned_number | ( rulesign this_unsigned_number_2= ruleunsigned_number ) | ( (lv_names_3_0= RULE_ID ) ) | ( rulesign ( (lv_names_5_0= RULE_ID ) ) ) | ( (lv_string_6_0= RULE_STRING ) ) | this_constant_chr_7= ruleconstant_chr )
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

                if ( ((LA5_2>=RULE_NUM_INT && LA5_2<=RULE_NUM_REAL)) ) {
                    alt5=2;
                }
                else if ( (LA5_2==RULE_ID) ) {
                    alt5=4;
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

                if ( (LA5_3==RULE_ID) ) {
                    alt5=4;
                }
                else if ( ((LA5_3>=RULE_NUM_INT && LA5_3<=RULE_NUM_REAL)) ) {
                    alt5=2;
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
            case 59:
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
                    // InternalPascal.g:507:3: this_unsigned_number_0= ruleunsigned_number
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
                    // InternalPascal.g:516:3: ( rulesign this_unsigned_number_2= ruleunsigned_number )
                    {
                    // InternalPascal.g:516:3: ( rulesign this_unsigned_number_2= ruleunsigned_number )
                    // InternalPascal.g:517:4: rulesign this_unsigned_number_2= ruleunsigned_number
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
                    // InternalPascal.g:534:3: ( (lv_names_3_0= RULE_ID ) )
                    {
                    // InternalPascal.g:534:3: ( (lv_names_3_0= RULE_ID ) )
                    // InternalPascal.g:535:4: (lv_names_3_0= RULE_ID )
                    {
                    // InternalPascal.g:535:4: (lv_names_3_0= RULE_ID )
                    // InternalPascal.g:536:5: lv_names_3_0= RULE_ID
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
                    // InternalPascal.g:553:3: ( rulesign ( (lv_names_5_0= RULE_ID ) ) )
                    {
                    // InternalPascal.g:553:3: ( rulesign ( (lv_names_5_0= RULE_ID ) ) )
                    // InternalPascal.g:554:4: rulesign ( (lv_names_5_0= RULE_ID ) )
                    {

                    				newCompositeNode(grammarAccess.getConstantAccess().getSignParserRuleCall_3_0());
                    			
                    pushFollow(FOLLOW_5);
                    rulesign();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalPascal.g:561:4: ( (lv_names_5_0= RULE_ID ) )
                    // InternalPascal.g:562:5: (lv_names_5_0= RULE_ID )
                    {
                    // InternalPascal.g:562:5: (lv_names_5_0= RULE_ID )
                    // InternalPascal.g:563:6: lv_names_5_0= RULE_ID
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
                    // InternalPascal.g:581:3: ( (lv_string_6_0= RULE_STRING ) )
                    {
                    // InternalPascal.g:581:3: ( (lv_string_6_0= RULE_STRING ) )
                    // InternalPascal.g:582:4: (lv_string_6_0= RULE_STRING )
                    {
                    // InternalPascal.g:582:4: (lv_string_6_0= RULE_STRING )
                    // InternalPascal.g:583:5: lv_string_6_0= RULE_STRING
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
                    // InternalPascal.g:600:3: this_constant_chr_7= ruleconstant_chr
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
    // InternalPascal.g:612:1: entryRulevariable_declaration_part returns [EObject current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final EObject entryRulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration_part = null;


        try {
            // InternalPascal.g:612:66: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // InternalPascal.g:613:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
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
    // InternalPascal.g:619:1: rulevariable_declaration_part returns [EObject current=null] : (this_VAR_0= RULE_VAR ( (lv_variable_1_0= rulevariable_declaration ) ) (otherlv_2= ';' ( (lv_variable_3_0= rulevariable_declaration ) ) )* otherlv_4= ';' ) ;
    public final EObject rulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        Token this_VAR_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;

        EObject lv_variable_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:625:2: ( (this_VAR_0= RULE_VAR ( (lv_variable_1_0= rulevariable_declaration ) ) (otherlv_2= ';' ( (lv_variable_3_0= rulevariable_declaration ) ) )* otherlv_4= ';' ) )
            // InternalPascal.g:626:2: (this_VAR_0= RULE_VAR ( (lv_variable_1_0= rulevariable_declaration ) ) (otherlv_2= ';' ( (lv_variable_3_0= rulevariable_declaration ) ) )* otherlv_4= ';' )
            {
            // InternalPascal.g:626:2: (this_VAR_0= RULE_VAR ( (lv_variable_1_0= rulevariable_declaration ) ) (otherlv_2= ';' ( (lv_variable_3_0= rulevariable_declaration ) ) )* otherlv_4= ';' )
            // InternalPascal.g:627:3: this_VAR_0= RULE_VAR ( (lv_variable_1_0= rulevariable_declaration ) ) (otherlv_2= ';' ( (lv_variable_3_0= rulevariable_declaration ) ) )* otherlv_4= ';'
            {
            this_VAR_0=(Token)match(input,RULE_VAR,FOLLOW_5); 

            			newLeafNode(this_VAR_0, grammarAccess.getVariable_declaration_partAccess().getVARTerminalRuleCall_0());
            		
            // InternalPascal.g:631:3: ( (lv_variable_1_0= rulevariable_declaration ) )
            // InternalPascal.g:632:4: (lv_variable_1_0= rulevariable_declaration )
            {
            // InternalPascal.g:632:4: (lv_variable_1_0= rulevariable_declaration )
            // InternalPascal.g:633:5: lv_variable_1_0= rulevariable_declaration
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

            // InternalPascal.g:650:3: (otherlv_2= ';' ( (lv_variable_3_0= rulevariable_declaration ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==42) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_ID) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalPascal.g:651:4: otherlv_2= ';' ( (lv_variable_3_0= rulevariable_declaration ) )
            	    {
            	    otherlv_2=(Token)match(input,42,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalPascal.g:655:4: ( (lv_variable_3_0= rulevariable_declaration ) )
            	    // InternalPascal.g:656:5: (lv_variable_3_0= rulevariable_declaration )
            	    {
            	    // InternalPascal.g:656:5: (lv_variable_3_0= rulevariable_declaration )
            	    // InternalPascal.g:657:6: lv_variable_3_0= rulevariable_declaration
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

            otherlv_4=(Token)match(input,42,FOLLOW_2); 

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
    // InternalPascal.g:683:1: entryRulevariable_declaration returns [EObject current=null] : iv_rulevariable_declaration= rulevariable_declaration EOF ;
    public final EObject entryRulevariable_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration = null;


        try {
            // InternalPascal.g:683:61: (iv_rulevariable_declaration= rulevariable_declaration EOF )
            // InternalPascal.g:684:2: iv_rulevariable_declaration= rulevariable_declaration EOF
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
    // InternalPascal.g:690:1: rulevariable_declaration returns [EObject current=null] : (this_identifier_list_0= ruleidentifier_list otherlv_1= ':' ( (lv_types_2_0= ruletype ) ) ) ;
    public final EObject rulevariable_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_identifier_list_0 = null;

        EObject lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:696:2: ( (this_identifier_list_0= ruleidentifier_list otherlv_1= ':' ( (lv_types_2_0= ruletype ) ) ) )
            // InternalPascal.g:697:2: (this_identifier_list_0= ruleidentifier_list otherlv_1= ':' ( (lv_types_2_0= ruletype ) ) )
            {
            // InternalPascal.g:697:2: (this_identifier_list_0= ruleidentifier_list otherlv_1= ':' ( (lv_types_2_0= ruletype ) ) )
            // InternalPascal.g:698:3: this_identifier_list_0= ruleidentifier_list otherlv_1= ':' ( (lv_types_2_0= ruletype ) )
            {

            			newCompositeNode(grammarAccess.getVariable_declarationAccess().getIdentifier_listParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_identifier_list_0=ruleidentifier_list();

            state._fsp--;


            			current = this_identifier_list_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,45,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getVariable_declarationAccess().getColonKeyword_1());
            		
            // InternalPascal.g:710:3: ( (lv_types_2_0= ruletype ) )
            // InternalPascal.g:711:4: (lv_types_2_0= ruletype )
            {
            // InternalPascal.g:711:4: (lv_types_2_0= ruletype )
            // InternalPascal.g:712:5: lv_types_2_0= ruletype
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
    // InternalPascal.g:733:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // InternalPascal.g:733:59: (iv_rulecompound_statement= rulecompound_statement EOF )
            // InternalPascal.g:734:2: iv_rulecompound_statement= rulecompound_statement EOF
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
    // InternalPascal.g:740:1: rulecompound_statement returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= 'end' ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:746:2: ( (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:747:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:747:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= 'end' )
            // InternalPascal.g:748:3: otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getCompound_statementAccess().getBeginKeyword_0());
            		
            // InternalPascal.g:752:3: ( (lv_sequence_1_0= rulestatements ) )
            // InternalPascal.g:753:4: (lv_sequence_1_0= rulestatements )
            {
            // InternalPascal.g:753:4: (lv_sequence_1_0= rulestatements )
            // InternalPascal.g:754:5: lv_sequence_1_0= rulestatements
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

            otherlv_2=(Token)match(input,47,FOLLOW_2); 

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
    // InternalPascal.g:779:1: entryRulestatements returns [EObject current=null] : iv_rulestatements= rulestatements EOF ;
    public final EObject entryRulestatements() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatements = null;


        try {
            // InternalPascal.g:779:51: (iv_rulestatements= rulestatements EOF )
            // InternalPascal.g:780:2: iv_rulestatements= rulestatements EOF
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
    // InternalPascal.g:786:1: rulestatements returns [EObject current=null] : ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:792:2: ( ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) )
            // InternalPascal.g:793:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            {
            // InternalPascal.g:793:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            // InternalPascal.g:794:3: ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            {
            // InternalPascal.g:794:3: ( (lv_statements_0_0= rulestatement ) )
            // InternalPascal.g:795:4: (lv_statements_0_0= rulestatement )
            {
            // InternalPascal.g:795:4: (lv_statements_0_0= rulestatement )
            // InternalPascal.g:796:5: lv_statements_0_0= rulestatement
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

            // InternalPascal.g:813:3: (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==42) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPascal.g:814:4: otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,42,FOLLOW_16); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStatementsAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalPascal.g:818:4: ( (lv_statements_2_0= rulestatement ) )
            	    // InternalPascal.g:819:5: (lv_statements_2_0= rulestatement )
            	    {
            	    // InternalPascal.g:819:5: (lv_statements_2_0= rulestatement )
            	    // InternalPascal.g:820:6: lv_statements_2_0= rulestatement
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
    // InternalPascal.g:842:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalPascal.g:842:50: (iv_rulestatement= rulestatement EOF )
            // InternalPascal.g:843:2: iv_rulestatement= rulestatement EOF
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
    // InternalPascal.g:849:1: rulestatement returns [EObject current=null] : ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) ) ) | ( () ( (lv_statement_4_0= ruleunlabelled_statement ) )? ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_label_0_0 = null;

        EObject lv_statement_2_0 = null;

        EObject lv_statement_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:855:2: ( ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) ) ) | ( () ( (lv_statement_4_0= ruleunlabelled_statement ) )? ) ) )
            // InternalPascal.g:856:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) ) ) | ( () ( (lv_statement_4_0= ruleunlabelled_statement ) )? ) )
            {
            // InternalPascal.g:856:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) ) ) | ( () ( (lv_statement_4_0= ruleunlabelled_statement ) )? ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_NUM_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==EOF||LA9_0==RULE_ID||LA9_0==42||(LA9_0>=47 && LA9_0<=48)||(LA9_0>=60 && LA9_0<=61)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:857:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) ) )
                    {
                    // InternalPascal.g:857:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) ) )
                    // InternalPascal.g:858:4: ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleunlabelled_statement ) )
                    {
                    // InternalPascal.g:858:4: ( (lv_label_0_0= rulelabel ) )
                    // InternalPascal.g:859:5: (lv_label_0_0= rulelabel )
                    {
                    // InternalPascal.g:859:5: (lv_label_0_0= rulelabel )
                    // InternalPascal.g:860:6: lv_label_0_0= rulelabel
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

                    otherlv_1=(Token)match(input,45,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_0_1());
                    			
                    // InternalPascal.g:881:4: ( (lv_statement_2_0= ruleunlabelled_statement ) )
                    // InternalPascal.g:882:5: (lv_statement_2_0= ruleunlabelled_statement )
                    {
                    // InternalPascal.g:882:5: (lv_statement_2_0= ruleunlabelled_statement )
                    // InternalPascal.g:883:6: lv_statement_2_0= ruleunlabelled_statement
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
                    // InternalPascal.g:902:3: ( () ( (lv_statement_4_0= ruleunlabelled_statement ) )? )
                    {
                    // InternalPascal.g:902:3: ( () ( (lv_statement_4_0= ruleunlabelled_statement ) )? )
                    // InternalPascal.g:903:4: () ( (lv_statement_4_0= ruleunlabelled_statement ) )?
                    {
                    // InternalPascal.g:903:4: ()
                    // InternalPascal.g:904:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatementAccess().getStatementAction_1_0(),
                    						current);
                    				

                    }

                    // InternalPascal.g:910:4: ( (lv_statement_4_0= ruleunlabelled_statement ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID||LA8_0==48||(LA8_0>=60 && LA8_0<=61)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalPascal.g:911:5: (lv_statement_4_0= ruleunlabelled_statement )
                            {
                            // InternalPascal.g:911:5: (lv_statement_4_0= ruleunlabelled_statement )
                            // InternalPascal.g:912:6: lv_statement_4_0= ruleunlabelled_statement
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
    // InternalPascal.g:934:1: entryRuleunlabelled_statement returns [EObject current=null] : iv_ruleunlabelled_statement= ruleunlabelled_statement EOF ;
    public final EObject entryRuleunlabelled_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunlabelled_statement = null;


        try {
            // InternalPascal.g:934:61: (iv_ruleunlabelled_statement= ruleunlabelled_statement EOF )
            // InternalPascal.g:935:2: iv_ruleunlabelled_statement= ruleunlabelled_statement EOF
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
    // InternalPascal.g:941:1: ruleunlabelled_statement returns [EObject current=null] : ( ( (lv_simple_0_0= rulesimple_statement ) ) | ( (lv_structured_1_0= rulestructured_statement ) ) ) ;
    public final EObject ruleunlabelled_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        AntlrDatatypeRuleToken lv_structured_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:947:2: ( ( ( (lv_simple_0_0= rulesimple_statement ) ) | ( (lv_structured_1_0= rulestructured_statement ) ) ) )
            // InternalPascal.g:948:2: ( ( (lv_simple_0_0= rulesimple_statement ) ) | ( (lv_structured_1_0= rulestructured_statement ) ) )
            {
            // InternalPascal.g:948:2: ( ( (lv_simple_0_0= rulesimple_statement ) ) | ( (lv_structured_1_0= rulestructured_statement ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==48||LA10_0==60) ) {
                alt10=1;
            }
            else if ( (LA10_0==61) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPascal.g:949:3: ( (lv_simple_0_0= rulesimple_statement ) )
                    {
                    // InternalPascal.g:949:3: ( (lv_simple_0_0= rulesimple_statement ) )
                    // InternalPascal.g:950:4: (lv_simple_0_0= rulesimple_statement )
                    {
                    // InternalPascal.g:950:4: (lv_simple_0_0= rulesimple_statement )
                    // InternalPascal.g:951:5: lv_simple_0_0= rulesimple_statement
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
                    // InternalPascal.g:969:3: ( (lv_structured_1_0= rulestructured_statement ) )
                    {
                    // InternalPascal.g:969:3: ( (lv_structured_1_0= rulestructured_statement ) )
                    // InternalPascal.g:970:4: (lv_structured_1_0= rulestructured_statement )
                    {
                    // InternalPascal.g:970:4: (lv_structured_1_0= rulestructured_statement )
                    // InternalPascal.g:971:5: lv_structured_1_0= rulestructured_statement
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
    // InternalPascal.g:992:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // InternalPascal.g:992:46: (iv_rulelabel= rulelabel EOF )
            // InternalPascal.g:993:2: iv_rulelabel= rulelabel EOF
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
    // InternalPascal.g:999:1: rulelabel returns [EObject current=null] : ( (lv_number_0_0= ruleunsigned_integer ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_number_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1005:2: ( ( (lv_number_0_0= ruleunsigned_integer ) ) )
            // InternalPascal.g:1006:2: ( (lv_number_0_0= ruleunsigned_integer ) )
            {
            // InternalPascal.g:1006:2: ( (lv_number_0_0= ruleunsigned_integer ) )
            // InternalPascal.g:1007:3: (lv_number_0_0= ruleunsigned_integer )
            {
            // InternalPascal.g:1007:3: (lv_number_0_0= ruleunsigned_integer )
            // InternalPascal.g:1008:4: lv_number_0_0= ruleunsigned_integer
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
    // InternalPascal.g:1028:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // InternalPascal.g:1028:57: (iv_rulesimple_statement= rulesimple_statement EOF )
            // InternalPascal.g:1029:2: iv_rulesimple_statement= rulesimple_statement EOF
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
    // InternalPascal.g:1035:1: rulesimple_statement returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_procedure_1_0= ruleprocedure_statement ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) ) ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_assignment_0_0 = null;

        EObject lv_procedure_1_0 = null;

        AntlrDatatypeRuleToken lv_goto_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1041:2: ( ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_procedure_1_0= ruleprocedure_statement ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) ) )
            // InternalPascal.g:1042:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_procedure_1_0= ruleprocedure_statement ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) )
            {
            // InternalPascal.g:1042:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_procedure_1_0= ruleprocedure_statement ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==EOF||LA11_2==40||LA11_2==42||LA11_2==47) ) {
                    alt11=2;
                }
                else if ( (LA11_2==RULE_ASSIGN||LA11_2==38||LA11_2==49||LA11_2==51||LA11_2==53) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case 60:
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
                    // InternalPascal.g:1043:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    {
                    // InternalPascal.g:1043:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    // InternalPascal.g:1044:4: (lv_assignment_0_0= ruleassignment_statement )
                    {
                    // InternalPascal.g:1044:4: (lv_assignment_0_0= ruleassignment_statement )
                    // InternalPascal.g:1045:5: lv_assignment_0_0= ruleassignment_statement
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
                    // InternalPascal.g:1063:3: ( (lv_procedure_1_0= ruleprocedure_statement ) )
                    {
                    // InternalPascal.g:1063:3: ( (lv_procedure_1_0= ruleprocedure_statement ) )
                    // InternalPascal.g:1064:4: (lv_procedure_1_0= ruleprocedure_statement )
                    {
                    // InternalPascal.g:1064:4: (lv_procedure_1_0= ruleprocedure_statement )
                    // InternalPascal.g:1065:5: lv_procedure_1_0= ruleprocedure_statement
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
                    // InternalPascal.g:1083:3: ( (lv_goto_2_0= rulegoto_statement ) )
                    {
                    // InternalPascal.g:1083:3: ( (lv_goto_2_0= rulegoto_statement ) )
                    // InternalPascal.g:1084:4: (lv_goto_2_0= rulegoto_statement )
                    {
                    // InternalPascal.g:1084:4: (lv_goto_2_0= rulegoto_statement )
                    // InternalPascal.g:1085:5: lv_goto_2_0= rulegoto_statement
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
    // InternalPascal.g:1106:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // InternalPascal.g:1106:61: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // InternalPascal.g:1107:2: iv_ruleassignment_statement= ruleassignment_statement EOF
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
    // InternalPascal.g:1113:1: ruleassignment_statement returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token this_ASSIGN_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1119:2: ( ( ( (lv_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) ) ) )
            // InternalPascal.g:1120:2: ( ( (lv_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) ) )
            {
            // InternalPascal.g:1120:2: ( ( (lv_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) ) )
            // InternalPascal.g:1121:3: ( (lv_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) )
            {
            // InternalPascal.g:1121:3: ( (lv_variable_0_0= rulevariable ) )
            // InternalPascal.g:1122:4: (lv_variable_0_0= rulevariable )
            {
            // InternalPascal.g:1122:4: (lv_variable_0_0= rulevariable )
            // InternalPascal.g:1123:5: lv_variable_0_0= rulevariable
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
            		
            // InternalPascal.g:1144:3: ( (lv_expression_2_0= ruleexpression ) )
            // InternalPascal.g:1145:4: (lv_expression_2_0= ruleexpression )
            {
            // InternalPascal.g:1145:4: (lv_expression_2_0= ruleexpression )
            // InternalPascal.g:1146:5: lv_expression_2_0= ruleexpression
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
    // InternalPascal.g:1167:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalPascal.g:1167:49: (iv_rulevariable= rulevariable EOF )
            // InternalPascal.g:1168:2: iv_rulevariable= rulevariable EOF
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
    // InternalPascal.g:1174:1: rulevariable returns [EObject current=null] : ( ( (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) ) | ( (lv_names_2_0= RULE_ID ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) ) | otherlv_15= '^' )* ) ;
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
            // InternalPascal.g:1180:2: ( ( ( (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) ) | ( (lv_names_2_0= RULE_ID ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) ) | otherlv_15= '^' )* ) )
            // InternalPascal.g:1181:2: ( ( (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) ) | ( (lv_names_2_0= RULE_ID ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) ) | otherlv_15= '^' )* )
            {
            // InternalPascal.g:1181:2: ( ( (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) ) | ( (lv_names_2_0= RULE_ID ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) ) | otherlv_15= '^' )* )
            // InternalPascal.g:1182:3: ( (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) ) | ( (lv_names_2_0= RULE_ID ) ) ) ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) ) | otherlv_15= '^' )*
            {
            // InternalPascal.g:1182:3: ( (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) ) | ( (lv_names_2_0= RULE_ID ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==48) ) {
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
                    // InternalPascal.g:1183:4: (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) )
                    {
                    // InternalPascal.g:1183:4: (otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) ) )
                    // InternalPascal.g:1184:5: otherlv_0= '@' ( (lv_names_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,48,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getCommercialAtKeyword_0_0_0());
                    				
                    // InternalPascal.g:1188:5: ( (lv_names_1_0= RULE_ID ) )
                    // InternalPascal.g:1189:6: (lv_names_1_0= RULE_ID )
                    {
                    // InternalPascal.g:1189:6: (lv_names_1_0= RULE_ID )
                    // InternalPascal.g:1190:7: lv_names_1_0= RULE_ID
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
                    // InternalPascal.g:1208:4: ( (lv_names_2_0= RULE_ID ) )
                    {
                    // InternalPascal.g:1208:4: ( (lv_names_2_0= RULE_ID ) )
                    // InternalPascal.g:1209:5: (lv_names_2_0= RULE_ID )
                    {
                    // InternalPascal.g:1209:5: (lv_names_2_0= RULE_ID )
                    // InternalPascal.g:1210:6: lv_names_2_0= RULE_ID
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

            // InternalPascal.g:1227:3: ( (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' ) | (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' ) | (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) ) | otherlv_15= '^' )*
            loop15:
            do {
                int alt15=5;
                switch ( input.LA(1) ) {
                case 49:
                    {
                    alt15=1;
                    }
                    break;
                case 51:
                    {
                    alt15=2;
                    }
                    break;
                case 38:
                    {
                    alt15=3;
                    }
                    break;
                case 53:
                    {
                    alt15=4;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // InternalPascal.g:1228:4: (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' )
            	    {
            	    // InternalPascal.g:1228:4: (otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']' )
            	    // InternalPascal.g:1229:5: otherlv_3= '[' ( (lv_expression_4_0= ruleexpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )* otherlv_7= ']'
            	    {
            	    otherlv_3=(Token)match(input,49,FOLLOW_21); 

            	    					newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_1_0_0());
            	    				
            	    // InternalPascal.g:1233:5: ( (lv_expression_4_0= ruleexpression ) )
            	    // InternalPascal.g:1234:6: (lv_expression_4_0= ruleexpression )
            	    {
            	    // InternalPascal.g:1234:6: (lv_expression_4_0= ruleexpression )
            	    // InternalPascal.g:1235:7: lv_expression_4_0= ruleexpression
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

            	    // InternalPascal.g:1252:5: (otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) ) )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==43) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalPascal.g:1253:6: otherlv_5= ',' ( (lv_expression_6_0= ruleexpression ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,43,FOLLOW_21); 

            	    	    						newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getCommaKeyword_1_0_2_0());
            	    	    					
            	    	    // InternalPascal.g:1257:6: ( (lv_expression_6_0= ruleexpression ) )
            	    	    // InternalPascal.g:1258:7: (lv_expression_6_0= ruleexpression )
            	    	    {
            	    	    // InternalPascal.g:1258:7: (lv_expression_6_0= ruleexpression )
            	    	    // InternalPascal.g:1259:8: lv_expression_6_0= ruleexpression
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

            	    otherlv_7=(Token)match(input,50,FOLLOW_22); 

            	    					newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getRightSquareBracketKeyword_1_0_3());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPascal.g:1283:4: (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' )
            	    {
            	    // InternalPascal.g:1283:4: (otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)' )
            	    // InternalPascal.g:1284:5: otherlv_8= '(.' ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= '.)'
            	    {
            	    otherlv_8=(Token)match(input,51,FOLLOW_21); 

            	    					newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getLeftParenthesisFullStopKeyword_1_1_0());
            	    				
            	    // InternalPascal.g:1288:5: ( (lv_expression_9_0= ruleexpression ) )
            	    // InternalPascal.g:1289:6: (lv_expression_9_0= ruleexpression )
            	    {
            	    // InternalPascal.g:1289:6: (lv_expression_9_0= ruleexpression )
            	    // InternalPascal.g:1290:7: lv_expression_9_0= ruleexpression
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

            	    // InternalPascal.g:1307:5: (otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==43) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalPascal.g:1308:6: otherlv_10= ',' ( (lv_expression_11_0= ruleexpression ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,43,FOLLOW_21); 

            	    	    						newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getCommaKeyword_1_1_2_0());
            	    	    					
            	    	    // InternalPascal.g:1312:6: ( (lv_expression_11_0= ruleexpression ) )
            	    	    // InternalPascal.g:1313:7: (lv_expression_11_0= ruleexpression )
            	    	    {
            	    	    // InternalPascal.g:1313:7: (lv_expression_11_0= ruleexpression )
            	    	    // InternalPascal.g:1314:8: lv_expression_11_0= ruleexpression
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

            	    otherlv_12=(Token)match(input,52,FOLLOW_22); 

            	    					newLeafNode(otherlv_12, grammarAccess.getVariableAccess().getFullStopRightParenthesisKeyword_1_1_3());
            	    				

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPascal.g:1338:4: (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) )
            	    {
            	    // InternalPascal.g:1338:4: (otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) ) )
            	    // InternalPascal.g:1339:5: otherlv_13= '.' ( (lv_names_14_0= RULE_ID ) )
            	    {
            	    otherlv_13=(Token)match(input,38,FOLLOW_5); 

            	    					newLeafNode(otherlv_13, grammarAccess.getVariableAccess().getFullStopKeyword_1_2_0());
            	    				
            	    // InternalPascal.g:1343:5: ( (lv_names_14_0= RULE_ID ) )
            	    // InternalPascal.g:1344:6: (lv_names_14_0= RULE_ID )
            	    {
            	    // InternalPascal.g:1344:6: (lv_names_14_0= RULE_ID )
            	    // InternalPascal.g:1345:7: lv_names_14_0= RULE_ID
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
            	    // InternalPascal.g:1363:4: otherlv_15= '^'
            	    {
            	    otherlv_15=(Token)match(input,53,FOLLOW_22); 

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
    // InternalPascal.g:1372:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascal.g:1372:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascal.g:1373:2: iv_ruleexpression= ruleexpression EOF
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
    // InternalPascal.g:1379:1: ruleexpression returns [EObject current=null] : ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;

        AntlrDatatypeRuleToken lv_operators_1_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1385:2: ( ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? ) )
            // InternalPascal.g:1386:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? )
            {
            // InternalPascal.g:1386:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? )
            // InternalPascal.g:1387:3: ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) ) )?
            {
            // InternalPascal.g:1387:3: ( (lv_expressions_0_0= rulesimple_expression ) )
            // InternalPascal.g:1388:4: (lv_expressions_0_0= rulesimple_expression )
            {
            // InternalPascal.g:1388:4: (lv_expressions_0_0= rulesimple_expression )
            // InternalPascal.g:1389:5: lv_expressions_0_0= rulesimple_expression
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

            // InternalPascal.g:1406:3: ( ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_EQUAL||(LA16_0>=RULE_NOT_EQUAL && LA16_0<=RULE_IN)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1407:4: ( (lv_operators_1_0= rulerelational_operator ) ) ( (lv_expressions_2_0= ruleexpression ) )
                    {
                    // InternalPascal.g:1407:4: ( (lv_operators_1_0= rulerelational_operator ) )
                    // InternalPascal.g:1408:5: (lv_operators_1_0= rulerelational_operator )
                    {
                    // InternalPascal.g:1408:5: (lv_operators_1_0= rulerelational_operator )
                    // InternalPascal.g:1409:6: lv_operators_1_0= rulerelational_operator
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

                    // InternalPascal.g:1426:4: ( (lv_expressions_2_0= ruleexpression ) )
                    // InternalPascal.g:1427:5: (lv_expressions_2_0= ruleexpression )
                    {
                    // InternalPascal.g:1427:5: (lv_expressions_2_0= ruleexpression )
                    // InternalPascal.g:1428:6: lv_expressions_2_0= ruleexpression
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
    // InternalPascal.g:1450:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;


        try {
            // InternalPascal.g:1450:58: (iv_rulesimple_expression= rulesimple_expression EOF )
            // InternalPascal.g:1451:2: iv_rulesimple_expression= rulesimple_expression EOF
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
    // InternalPascal.g:1457:1: rulesimple_expression returns [EObject current=null] : ( ( (lv_terms_0_0= ruleterm ) ) ( ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )? ) ;
    public final EObject rulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject lv_terms_0_0 = null;

        AntlrDatatypeRuleToken lv_operators_1_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1463:2: ( ( ( (lv_terms_0_0= ruleterm ) ) ( ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )? ) )
            // InternalPascal.g:1464:2: ( ( (lv_terms_0_0= ruleterm ) ) ( ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )? )
            {
            // InternalPascal.g:1464:2: ( ( (lv_terms_0_0= ruleterm ) ) ( ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )? )
            // InternalPascal.g:1465:3: ( (lv_terms_0_0= ruleterm ) ) ( ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )?
            {
            // InternalPascal.g:1465:3: ( (lv_terms_0_0= ruleterm ) )
            // InternalPascal.g:1466:4: (lv_terms_0_0= ruleterm )
            {
            // InternalPascal.g:1466:4: (lv_terms_0_0= ruleterm )
            // InternalPascal.g:1467:5: lv_terms_0_0= ruleterm
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

            // InternalPascal.g:1484:3: ( ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_PLUS && LA17_0<=RULE_MINUS)||LA17_0==RULE_OR) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPascal.g:1485:4: ( (lv_operators_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) )
                    {
                    // InternalPascal.g:1485:4: ( (lv_operators_1_0= ruleadditive_operator ) )
                    // InternalPascal.g:1486:5: (lv_operators_1_0= ruleadditive_operator )
                    {
                    // InternalPascal.g:1486:5: (lv_operators_1_0= ruleadditive_operator )
                    // InternalPascal.g:1487:6: lv_operators_1_0= ruleadditive_operator
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

                    // InternalPascal.g:1504:4: ( (lv_expression_2_0= rulesimple_expression ) )
                    // InternalPascal.g:1505:5: (lv_expression_2_0= rulesimple_expression )
                    {
                    // InternalPascal.g:1505:5: (lv_expression_2_0= rulesimple_expression )
                    // InternalPascal.g:1506:6: lv_expression_2_0= rulesimple_expression
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
    // InternalPascal.g:1528:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalPascal.g:1528:45: (iv_ruleterm= ruleterm EOF )
            // InternalPascal.g:1529:2: iv_ruleterm= ruleterm EOF
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
    // InternalPascal.g:1535:1: ruleterm returns [EObject current=null] : ( ( (lv_factors_0_0= rulesigned_factor ) ) ( ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) ) )? ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        EObject lv_factors_0_0 = null;

        AntlrDatatypeRuleToken lv_operators_1_0 = null;

        EObject lv_terms_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1541:2: ( ( ( (lv_factors_0_0= rulesigned_factor ) ) ( ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) ) )? ) )
            // InternalPascal.g:1542:2: ( ( (lv_factors_0_0= rulesigned_factor ) ) ( ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) ) )? )
            {
            // InternalPascal.g:1542:2: ( ( (lv_factors_0_0= rulesigned_factor ) ) ( ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) ) )? )
            // InternalPascal.g:1543:3: ( (lv_factors_0_0= rulesigned_factor ) ) ( ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) ) )?
            {
            // InternalPascal.g:1543:3: ( (lv_factors_0_0= rulesigned_factor ) )
            // InternalPascal.g:1544:4: (lv_factors_0_0= rulesigned_factor )
            {
            // InternalPascal.g:1544:4: (lv_factors_0_0= rulesigned_factor )
            // InternalPascal.g:1545:5: lv_factors_0_0= rulesigned_factor
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

            // InternalPascal.g:1562:3: ( ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STAR && LA18_0<=RULE_AND)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPascal.g:1563:4: ( (lv_operators_1_0= rulemultiplicative_operator ) ) ( (lv_terms_2_0= ruleterm ) )
                    {
                    // InternalPascal.g:1563:4: ( (lv_operators_1_0= rulemultiplicative_operator ) )
                    // InternalPascal.g:1564:5: (lv_operators_1_0= rulemultiplicative_operator )
                    {
                    // InternalPascal.g:1564:5: (lv_operators_1_0= rulemultiplicative_operator )
                    // InternalPascal.g:1565:6: lv_operators_1_0= rulemultiplicative_operator
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

                    // InternalPascal.g:1582:4: ( (lv_terms_2_0= ruleterm ) )
                    // InternalPascal.g:1583:5: (lv_terms_2_0= ruleterm )
                    {
                    // InternalPascal.g:1583:5: (lv_terms_2_0= ruleterm )
                    // InternalPascal.g:1584:6: lv_terms_2_0= ruleterm
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
    // InternalPascal.g:1606:1: entryRulesigned_factor returns [EObject current=null] : iv_rulesigned_factor= rulesigned_factor EOF ;
    public final EObject entryRulesigned_factor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigned_factor = null;


        try {
            // InternalPascal.g:1606:54: (iv_rulesigned_factor= rulesigned_factor EOF )
            // InternalPascal.g:1607:2: iv_rulesigned_factor= rulesigned_factor EOF
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
    // InternalPascal.g:1613:1: rulesigned_factor returns [EObject current=null] : ( ( ( (lv_operators_0_0= RULE_PLUS ) ) | ( (lv_operators_1_0= RULE_MINUS ) ) )? ( (lv_factors_2_0= rulefactor ) ) ) ;
    public final EObject rulesigned_factor() throws RecognitionException {
        EObject current = null;

        Token lv_operators_0_0=null;
        Token lv_operators_1_0=null;
        EObject lv_factors_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1619:2: ( ( ( ( (lv_operators_0_0= RULE_PLUS ) ) | ( (lv_operators_1_0= RULE_MINUS ) ) )? ( (lv_factors_2_0= rulefactor ) ) ) )
            // InternalPascal.g:1620:2: ( ( ( (lv_operators_0_0= RULE_PLUS ) ) | ( (lv_operators_1_0= RULE_MINUS ) ) )? ( (lv_factors_2_0= rulefactor ) ) )
            {
            // InternalPascal.g:1620:2: ( ( ( (lv_operators_0_0= RULE_PLUS ) ) | ( (lv_operators_1_0= RULE_MINUS ) ) )? ( (lv_factors_2_0= rulefactor ) ) )
            // InternalPascal.g:1621:3: ( ( (lv_operators_0_0= RULE_PLUS ) ) | ( (lv_operators_1_0= RULE_MINUS ) ) )? ( (lv_factors_2_0= rulefactor ) )
            {
            // InternalPascal.g:1621:3: ( ( (lv_operators_0_0= RULE_PLUS ) ) | ( (lv_operators_1_0= RULE_MINUS ) ) )?
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
                    // InternalPascal.g:1622:4: ( (lv_operators_0_0= RULE_PLUS ) )
                    {
                    // InternalPascal.g:1622:4: ( (lv_operators_0_0= RULE_PLUS ) )
                    // InternalPascal.g:1623:5: (lv_operators_0_0= RULE_PLUS )
                    {
                    // InternalPascal.g:1623:5: (lv_operators_0_0= RULE_PLUS )
                    // InternalPascal.g:1624:6: lv_operators_0_0= RULE_PLUS
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
                    // InternalPascal.g:1641:4: ( (lv_operators_1_0= RULE_MINUS ) )
                    {
                    // InternalPascal.g:1641:4: ( (lv_operators_1_0= RULE_MINUS ) )
                    // InternalPascal.g:1642:5: (lv_operators_1_0= RULE_MINUS )
                    {
                    // InternalPascal.g:1642:5: (lv_operators_1_0= RULE_MINUS )
                    // InternalPascal.g:1643:6: lv_operators_1_0= RULE_MINUS
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

            // InternalPascal.g:1660:3: ( (lv_factors_2_0= rulefactor ) )
            // InternalPascal.g:1661:4: (lv_factors_2_0= rulefactor )
            {
            // InternalPascal.g:1661:4: (lv_factors_2_0= rulefactor )
            // InternalPascal.g:1662:5: lv_factors_2_0= rulefactor
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
    // InternalPascal.g:1683:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // InternalPascal.g:1683:47: (iv_rulefactor= rulefactor EOF )
            // InternalPascal.g:1684:2: iv_rulefactor= rulefactor EOF
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
    // InternalPascal.g:1690:1: rulefactor returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')' ) | ( (lv_constant_4_0= ruleunsigned_constant ) ) | ( (lv_set_5_0= ruleset ) ) | (this_NOT_6= RULE_NOT ( (lv_factor_7_0= rulefactor ) ) ) | ( (lv_boolean_8_0= rulebool ) ) ) ;
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
            // InternalPascal.g:1696:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')' ) | ( (lv_constant_4_0= ruleunsigned_constant ) ) | ( (lv_set_5_0= ruleset ) ) | (this_NOT_6= RULE_NOT ( (lv_factor_7_0= rulefactor ) ) ) | ( (lv_boolean_8_0= rulebool ) ) ) )
            // InternalPascal.g:1697:2: ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')' ) | ( (lv_constant_4_0= ruleunsigned_constant ) ) | ( (lv_set_5_0= ruleset ) ) | (this_NOT_6= RULE_NOT ( (lv_factor_7_0= rulefactor ) ) ) | ( (lv_boolean_8_0= rulebool ) ) )
            {
            // InternalPascal.g:1697:2: ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')' ) | ( (lv_constant_4_0= ruleunsigned_constant ) ) | ( (lv_set_5_0= ruleset ) ) | (this_NOT_6= RULE_NOT ( (lv_factor_7_0= rulefactor ) ) ) | ( (lv_boolean_8_0= rulebool ) ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 48:
                {
                alt20=1;
                }
                break;
            case 40:
                {
                alt20=2;
                }
                break;
            case RULE_STRING:
            case RULE_NIL:
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
            case 59:
                {
                alt20=3;
                }
                break;
            case 49:
            case 51:
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
                    // InternalPascal.g:1698:3: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // InternalPascal.g:1698:3: ( (lv_variable_0_0= rulevariable ) )
                    // InternalPascal.g:1699:4: (lv_variable_0_0= rulevariable )
                    {
                    // InternalPascal.g:1699:4: (lv_variable_0_0= rulevariable )
                    // InternalPascal.g:1700:5: lv_variable_0_0= rulevariable
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
                    // InternalPascal.g:1718:3: (otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')' )
                    {
                    // InternalPascal.g:1718:3: (otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')' )
                    // InternalPascal.g:1719:4: otherlv_1= '(' ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalPascal.g:1723:4: ( (lv_expression_2_0= ruleexpression ) )
                    // InternalPascal.g:1724:5: (lv_expression_2_0= ruleexpression )
                    {
                    // InternalPascal.g:1724:5: (lv_expression_2_0= ruleexpression )
                    // InternalPascal.g:1725:6: lv_expression_2_0= ruleexpression
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

                    otherlv_3=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1748:3: ( (lv_constant_4_0= ruleunsigned_constant ) )
                    {
                    // InternalPascal.g:1748:3: ( (lv_constant_4_0= ruleunsigned_constant ) )
                    // InternalPascal.g:1749:4: (lv_constant_4_0= ruleunsigned_constant )
                    {
                    // InternalPascal.g:1749:4: (lv_constant_4_0= ruleunsigned_constant )
                    // InternalPascal.g:1750:5: lv_constant_4_0= ruleunsigned_constant
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
                    // InternalPascal.g:1768:3: ( (lv_set_5_0= ruleset ) )
                    {
                    // InternalPascal.g:1768:3: ( (lv_set_5_0= ruleset ) )
                    // InternalPascal.g:1769:4: (lv_set_5_0= ruleset )
                    {
                    // InternalPascal.g:1769:4: (lv_set_5_0= ruleset )
                    // InternalPascal.g:1770:5: lv_set_5_0= ruleset
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
                    // InternalPascal.g:1788:3: (this_NOT_6= RULE_NOT ( (lv_factor_7_0= rulefactor ) ) )
                    {
                    // InternalPascal.g:1788:3: (this_NOT_6= RULE_NOT ( (lv_factor_7_0= rulefactor ) ) )
                    // InternalPascal.g:1789:4: this_NOT_6= RULE_NOT ( (lv_factor_7_0= rulefactor ) )
                    {
                    this_NOT_6=(Token)match(input,RULE_NOT,FOLLOW_21); 

                    				newLeafNode(this_NOT_6, grammarAccess.getFactorAccess().getNOTTerminalRuleCall_4_0());
                    			
                    // InternalPascal.g:1793:4: ( (lv_factor_7_0= rulefactor ) )
                    // InternalPascal.g:1794:5: (lv_factor_7_0= rulefactor )
                    {
                    // InternalPascal.g:1794:5: (lv_factor_7_0= rulefactor )
                    // InternalPascal.g:1795:6: lv_factor_7_0= rulefactor
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
                    // InternalPascal.g:1814:3: ( (lv_boolean_8_0= rulebool ) )
                    {
                    // InternalPascal.g:1814:3: ( (lv_boolean_8_0= rulebool ) )
                    // InternalPascal.g:1815:4: (lv_boolean_8_0= rulebool )
                    {
                    // InternalPascal.g:1815:4: (lv_boolean_8_0= rulebool )
                    // InternalPascal.g:1816:5: lv_boolean_8_0= rulebool
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
    // InternalPascal.g:1837:1: entryRuleset returns [EObject current=null] : iv_ruleset= ruleset EOF ;
    public final EObject entryRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset = null;


        try {
            // InternalPascal.g:1837:44: (iv_ruleset= ruleset EOF )
            // InternalPascal.g:1838:2: iv_ruleset= ruleset EOF
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
    // InternalPascal.g:1844:1: ruleset returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']' ) | (otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)' ) ) ;
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
            // InternalPascal.g:1850:2: ( ( (otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']' ) | (otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)' ) ) )
            // InternalPascal.g:1851:2: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']' ) | (otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)' ) )
            {
            // InternalPascal.g:1851:2: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']' ) | (otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==49) ) {
                alt21=1;
            }
            else if ( (LA21_0==51) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPascal.g:1852:3: (otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']' )
                    {
                    // InternalPascal.g:1852:3: (otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']' )
                    // InternalPascal.g:1853:4: otherlv_0= '[' ( (lv_elements_1_0= ruleelementList ) ) otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,49,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getSetAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalPascal.g:1857:4: ( (lv_elements_1_0= ruleelementList ) )
                    // InternalPascal.g:1858:5: (lv_elements_1_0= ruleelementList )
                    {
                    // InternalPascal.g:1858:5: (lv_elements_1_0= ruleelementList )
                    // InternalPascal.g:1859:6: lv_elements_1_0= ruleelementList
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

                    otherlv_2=(Token)match(input,50,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getSetAccess().getRightSquareBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1882:3: (otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)' )
                    {
                    // InternalPascal.g:1882:3: (otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)' )
                    // InternalPascal.g:1883:4: otherlv_3= '(.' ( (lv_elements_4_0= ruleelementList ) ) otherlv_5= '.)'
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getSetAccess().getLeftParenthesisFullStopKeyword_1_0());
                    			
                    // InternalPascal.g:1887:4: ( (lv_elements_4_0= ruleelementList ) )
                    // InternalPascal.g:1888:5: (lv_elements_4_0= ruleelementList )
                    {
                    // InternalPascal.g:1888:5: (lv_elements_4_0= ruleelementList )
                    // InternalPascal.g:1889:6: lv_elements_4_0= ruleelementList
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

                    otherlv_5=(Token)match(input,52,FOLLOW_2); 

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
    // InternalPascal.g:1915:1: entryRuleelementList returns [EObject current=null] : iv_ruleelementList= ruleelementList EOF ;
    public final EObject entryRuleelementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelementList = null;


        try {
            // InternalPascal.g:1915:52: (iv_ruleelementList= ruleelementList EOF )
            // InternalPascal.g:1916:2: iv_ruleelementList= ruleelementList EOF
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
    // InternalPascal.g:1922:1: ruleelementList returns [EObject current=null] : ( ( (lv_elements_0_0= ruleelement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) ) )* ) ;
    public final EObject ruleelementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1928:2: ( ( ( (lv_elements_0_0= ruleelement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) ) )* ) )
            // InternalPascal.g:1929:2: ( ( (lv_elements_0_0= ruleelement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) ) )* )
            {
            // InternalPascal.g:1929:2: ( ( (lv_elements_0_0= ruleelement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) ) )* )
            // InternalPascal.g:1930:3: ( (lv_elements_0_0= ruleelement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) ) )*
            {
            // InternalPascal.g:1930:3: ( (lv_elements_0_0= ruleelement ) )
            // InternalPascal.g:1931:4: (lv_elements_0_0= ruleelement )
            {
            // InternalPascal.g:1931:4: (lv_elements_0_0= ruleelement )
            // InternalPascal.g:1932:5: lv_elements_0_0= ruleelement
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

            // InternalPascal.g:1949:3: (otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==43) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPascal.g:1950:4: otherlv_1= ',' ( (lv_elements_2_0= ruleelement ) )
            	    {
            	    otherlv_1=(Token)match(input,43,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getElementListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:1954:4: ( (lv_elements_2_0= ruleelement ) )
            	    // InternalPascal.g:1955:5: (lv_elements_2_0= ruleelement )
            	    {
            	    // InternalPascal.g:1955:5: (lv_elements_2_0= ruleelement )
            	    // InternalPascal.g:1956:6: lv_elements_2_0= ruleelement
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
    // InternalPascal.g:1978:1: entryRuleelement returns [EObject current=null] : iv_ruleelement= ruleelement EOF ;
    public final EObject entryRuleelement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelement = null;


        try {
            // InternalPascal.g:1978:48: (iv_ruleelement= ruleelement EOF )
            // InternalPascal.g:1979:2: iv_ruleelement= ruleelement EOF
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
    // InternalPascal.g:1985:1: ruleelement returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleexpression ) ) ( ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? ) ;
    public final EObject ruleelement() throws RecognitionException {
        EObject current = null;

        Token lv_dotdot_1_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1991:2: ( ( ( (lv_expressions_0_0= ruleexpression ) ) ( ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? ) )
            // InternalPascal.g:1992:2: ( ( (lv_expressions_0_0= ruleexpression ) ) ( ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? )
            {
            // InternalPascal.g:1992:2: ( ( (lv_expressions_0_0= ruleexpression ) ) ( ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) ) )? )
            // InternalPascal.g:1993:3: ( (lv_expressions_0_0= ruleexpression ) ) ( ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) ) )?
            {
            // InternalPascal.g:1993:3: ( (lv_expressions_0_0= ruleexpression ) )
            // InternalPascal.g:1994:4: (lv_expressions_0_0= ruleexpression )
            {
            // InternalPascal.g:1994:4: (lv_expressions_0_0= ruleexpression )
            // InternalPascal.g:1995:5: lv_expressions_0_0= ruleexpression
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

            // InternalPascal.g:2012:3: ( ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_DOTDOT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascal.g:2013:4: ( (lv_dotdot_1_0= RULE_DOTDOT ) ) ( (lv_expressions_2_0= ruleexpression ) )
                    {
                    // InternalPascal.g:2013:4: ( (lv_dotdot_1_0= RULE_DOTDOT ) )
                    // InternalPascal.g:2014:5: (lv_dotdot_1_0= RULE_DOTDOT )
                    {
                    // InternalPascal.g:2014:5: (lv_dotdot_1_0= RULE_DOTDOT )
                    // InternalPascal.g:2015:6: lv_dotdot_1_0= RULE_DOTDOT
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

                    // InternalPascal.g:2031:4: ( (lv_expressions_2_0= ruleexpression ) )
                    // InternalPascal.g:2032:5: (lv_expressions_2_0= ruleexpression )
                    {
                    // InternalPascal.g:2032:5: (lv_expressions_2_0= ruleexpression )
                    // InternalPascal.g:2033:6: lv_expressions_2_0= ruleexpression
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
    // InternalPascal.g:2055:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // InternalPascal.g:2055:45: (iv_ruletype= ruletype EOF )
            // InternalPascal.g:2056:2: iv_ruletype= ruletype EOF
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
    // InternalPascal.g:2062:1: ruletype returns [EObject current=null] : ( (lv_type_0_0= rulesimple_type ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2068:2: ( ( (lv_type_0_0= rulesimple_type ) ) )
            // InternalPascal.g:2069:2: ( (lv_type_0_0= rulesimple_type ) )
            {
            // InternalPascal.g:2069:2: ( (lv_type_0_0= rulesimple_type ) )
            // InternalPascal.g:2070:3: (lv_type_0_0= rulesimple_type )
            {
            // InternalPascal.g:2070:3: (lv_type_0_0= rulesimple_type )
            // InternalPascal.g:2071:4: lv_type_0_0= rulesimple_type
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
    // InternalPascal.g:2091:1: entryRulesimple_type returns [EObject current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final EObject entryRulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type = null;


        try {
            // InternalPascal.g:2091:52: (iv_rulesimple_type= rulesimple_type EOF )
            // InternalPascal.g:2092:2: iv_rulesimple_type= rulesimple_type EOF
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
    // InternalPascal.g:2098:1: rulesimple_type returns [EObject current=null] : ( ( (lv_types_0_0= rulescalar_type ) ) | ( (lv_types_1_0= rulesubrange_type ) ) | ( (lv_types_2_0= ruletype_identifier ) ) | ( (lv_types_3_0= rulestring_type ) ) ) ;
    public final EObject rulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0_0 = null;

        EObject lv_types_1_0 = null;

        EObject lv_types_2_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2104:2: ( ( ( (lv_types_0_0= rulescalar_type ) ) | ( (lv_types_1_0= rulesubrange_type ) ) | ( (lv_types_2_0= ruletype_identifier ) ) | ( (lv_types_3_0= rulestring_type ) ) ) )
            // InternalPascal.g:2105:2: ( ( (lv_types_0_0= rulescalar_type ) ) | ( (lv_types_1_0= rulesubrange_type ) ) | ( (lv_types_2_0= ruletype_identifier ) ) | ( (lv_types_3_0= rulestring_type ) ) )
            {
            // InternalPascal.g:2105:2: ( ( (lv_types_0_0= rulescalar_type ) ) | ( (lv_types_1_0= rulesubrange_type ) ) | ( (lv_types_2_0= ruletype_identifier ) ) | ( (lv_types_3_0= rulestring_type ) ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt24=1;
                }
                break;
            case RULE_STRING:
            case RULE_PLUS:
            case RULE_MINUS:
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
            case 59:
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
                else if ( (LA24_3==EOF||LA24_3==42) ) {
                    alt24=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 3, input);

                    throw nvae;
                }
                }
                break;
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt24=3;
                }
                break;
            case 58:
                {
                int LA24_5 = input.LA(2);

                if ( (LA24_5==EOF||LA24_5==42) ) {
                    alt24=3;
                }
                else if ( (LA24_5==49) ) {
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
                    // InternalPascal.g:2106:3: ( (lv_types_0_0= rulescalar_type ) )
                    {
                    // InternalPascal.g:2106:3: ( (lv_types_0_0= rulescalar_type ) )
                    // InternalPascal.g:2107:4: (lv_types_0_0= rulescalar_type )
                    {
                    // InternalPascal.g:2107:4: (lv_types_0_0= rulescalar_type )
                    // InternalPascal.g:2108:5: lv_types_0_0= rulescalar_type
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
                    // InternalPascal.g:2126:3: ( (lv_types_1_0= rulesubrange_type ) )
                    {
                    // InternalPascal.g:2126:3: ( (lv_types_1_0= rulesubrange_type ) )
                    // InternalPascal.g:2127:4: (lv_types_1_0= rulesubrange_type )
                    {
                    // InternalPascal.g:2127:4: (lv_types_1_0= rulesubrange_type )
                    // InternalPascal.g:2128:5: lv_types_1_0= rulesubrange_type
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
                    // InternalPascal.g:2146:3: ( (lv_types_2_0= ruletype_identifier ) )
                    {
                    // InternalPascal.g:2146:3: ( (lv_types_2_0= ruletype_identifier ) )
                    // InternalPascal.g:2147:4: (lv_types_2_0= ruletype_identifier )
                    {
                    // InternalPascal.g:2147:4: (lv_types_2_0= ruletype_identifier )
                    // InternalPascal.g:2148:5: lv_types_2_0= ruletype_identifier
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
                    // InternalPascal.g:2166:3: ( (lv_types_3_0= rulestring_type ) )
                    {
                    // InternalPascal.g:2166:3: ( (lv_types_3_0= rulestring_type ) )
                    // InternalPascal.g:2167:4: (lv_types_3_0= rulestring_type )
                    {
                    // InternalPascal.g:2167:4: (lv_types_3_0= rulestring_type )
                    // InternalPascal.g:2168:5: lv_types_3_0= rulestring_type
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
    // InternalPascal.g:2189:1: entryRulescalar_type returns [EObject current=null] : iv_rulescalar_type= rulescalar_type EOF ;
    public final EObject entryRulescalar_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulescalar_type = null;


        try {
            // InternalPascal.g:2189:52: (iv_rulescalar_type= rulescalar_type EOF )
            // InternalPascal.g:2190:2: iv_rulescalar_type= rulescalar_type EOF
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
    // InternalPascal.g:2196:1: rulescalar_type returns [EObject current=null] : (otherlv_0= '(' this_identifier_list_1= ruleidentifier_list otherlv_2= ')' ) ;
    public final EObject rulescalar_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_identifier_list_1 = null;



        	enterRule();

        try {
            // InternalPascal.g:2202:2: ( (otherlv_0= '(' this_identifier_list_1= ruleidentifier_list otherlv_2= ')' ) )
            // InternalPascal.g:2203:2: (otherlv_0= '(' this_identifier_list_1= ruleidentifier_list otherlv_2= ')' )
            {
            // InternalPascal.g:2203:2: (otherlv_0= '(' this_identifier_list_1= ruleidentifier_list otherlv_2= ')' )
            // InternalPascal.g:2204:3: otherlv_0= '(' this_identifier_list_1= ruleidentifier_list otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getScalar_typeAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getScalar_typeAccess().getIdentifier_listParserRuleCall_1());
            		
            pushFollow(FOLLOW_7);
            this_identifier_list_1=ruleidentifier_list();

            state._fsp--;


            			current = this_identifier_list_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,41,FOLLOW_2); 

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
    // InternalPascal.g:2224:1: entryRulesubrange_type returns [EObject current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final EObject entryRulesubrange_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrange_type = null;


        try {
            // InternalPascal.g:2224:54: (iv_rulesubrange_type= rulesubrange_type EOF )
            // InternalPascal.g:2225:2: iv_rulesubrange_type= rulesubrange_type EOF
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
    // InternalPascal.g:2231:1: rulesubrange_type returns [EObject current=null] : ( ( (lv_constants_0_0= ruleconstant ) ) this_DOTDOT_1= RULE_DOTDOT ( (lv_constants_2_0= ruleconstant ) ) ) ;
    public final EObject rulesubrange_type() throws RecognitionException {
        EObject current = null;

        Token this_DOTDOT_1=null;
        EObject lv_constants_0_0 = null;

        EObject lv_constants_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2237:2: ( ( ( (lv_constants_0_0= ruleconstant ) ) this_DOTDOT_1= RULE_DOTDOT ( (lv_constants_2_0= ruleconstant ) ) ) )
            // InternalPascal.g:2238:2: ( ( (lv_constants_0_0= ruleconstant ) ) this_DOTDOT_1= RULE_DOTDOT ( (lv_constants_2_0= ruleconstant ) ) )
            {
            // InternalPascal.g:2238:2: ( ( (lv_constants_0_0= ruleconstant ) ) this_DOTDOT_1= RULE_DOTDOT ( (lv_constants_2_0= ruleconstant ) ) )
            // InternalPascal.g:2239:3: ( (lv_constants_0_0= ruleconstant ) ) this_DOTDOT_1= RULE_DOTDOT ( (lv_constants_2_0= ruleconstant ) )
            {
            // InternalPascal.g:2239:3: ( (lv_constants_0_0= ruleconstant ) )
            // InternalPascal.g:2240:4: (lv_constants_0_0= ruleconstant )
            {
            // InternalPascal.g:2240:4: (lv_constants_0_0= ruleconstant )
            // InternalPascal.g:2241:5: lv_constants_0_0= ruleconstant
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
            		
            // InternalPascal.g:2262:3: ( (lv_constants_2_0= ruleconstant ) )
            // InternalPascal.g:2263:4: (lv_constants_2_0= ruleconstant )
            {
            // InternalPascal.g:2263:4: (lv_constants_2_0= ruleconstant )
            // InternalPascal.g:2264:5: lv_constants_2_0= ruleconstant
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
    // InternalPascal.g:2285:1: entryRuletype_identifier returns [EObject current=null] : iv_ruletype_identifier= ruletype_identifier EOF ;
    public final EObject entryRuletype_identifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_identifier = null;


        try {
            // InternalPascal.g:2285:56: (iv_ruletype_identifier= ruletype_identifier EOF )
            // InternalPascal.g:2286:2: iv_ruletype_identifier= ruletype_identifier EOF
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
    // InternalPascal.g:2292:1: ruletype_identifier returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) | ( ( (lv_type_1_0= 'CHAR' ) ) | ( (lv_type_2_0= 'boolean' ) ) | ( (lv_type_3_0= 'integer' ) ) | ( (lv_type_4_0= 'real' ) ) | ( (lv_type_5_0= 'string' ) ) ) ) ;
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
            // InternalPascal.g:2298:2: ( ( ( (lv_names_0_0= RULE_ID ) ) | ( ( (lv_type_1_0= 'CHAR' ) ) | ( (lv_type_2_0= 'boolean' ) ) | ( (lv_type_3_0= 'integer' ) ) | ( (lv_type_4_0= 'real' ) ) | ( (lv_type_5_0= 'string' ) ) ) ) )
            // InternalPascal.g:2299:2: ( ( (lv_names_0_0= RULE_ID ) ) | ( ( (lv_type_1_0= 'CHAR' ) ) | ( (lv_type_2_0= 'boolean' ) ) | ( (lv_type_3_0= 'integer' ) ) | ( (lv_type_4_0= 'real' ) ) | ( (lv_type_5_0= 'string' ) ) ) )
            {
            // InternalPascal.g:2299:2: ( ( (lv_names_0_0= RULE_ID ) ) | ( ( (lv_type_1_0= 'CHAR' ) ) | ( (lv_type_2_0= 'boolean' ) ) | ( (lv_type_3_0= 'integer' ) ) | ( (lv_type_4_0= 'real' ) ) | ( (lv_type_5_0= 'string' ) ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=54 && LA26_0<=58)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalPascal.g:2300:3: ( (lv_names_0_0= RULE_ID ) )
                    {
                    // InternalPascal.g:2300:3: ( (lv_names_0_0= RULE_ID ) )
                    // InternalPascal.g:2301:4: (lv_names_0_0= RULE_ID )
                    {
                    // InternalPascal.g:2301:4: (lv_names_0_0= RULE_ID )
                    // InternalPascal.g:2302:5: lv_names_0_0= RULE_ID
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
                    // InternalPascal.g:2319:3: ( ( (lv_type_1_0= 'CHAR' ) ) | ( (lv_type_2_0= 'boolean' ) ) | ( (lv_type_3_0= 'integer' ) ) | ( (lv_type_4_0= 'real' ) ) | ( (lv_type_5_0= 'string' ) ) )
                    {
                    // InternalPascal.g:2319:3: ( ( (lv_type_1_0= 'CHAR' ) ) | ( (lv_type_2_0= 'boolean' ) ) | ( (lv_type_3_0= 'integer' ) ) | ( (lv_type_4_0= 'real' ) ) | ( (lv_type_5_0= 'string' ) ) )
                    int alt25=5;
                    switch ( input.LA(1) ) {
                    case 54:
                        {
                        alt25=1;
                        }
                        break;
                    case 55:
                        {
                        alt25=2;
                        }
                        break;
                    case 56:
                        {
                        alt25=3;
                        }
                        break;
                    case 57:
                        {
                        alt25=4;
                        }
                        break;
                    case 58:
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
                            // InternalPascal.g:2320:4: ( (lv_type_1_0= 'CHAR' ) )
                            {
                            // InternalPascal.g:2320:4: ( (lv_type_1_0= 'CHAR' ) )
                            // InternalPascal.g:2321:5: (lv_type_1_0= 'CHAR' )
                            {
                            // InternalPascal.g:2321:5: (lv_type_1_0= 'CHAR' )
                            // InternalPascal.g:2322:6: lv_type_1_0= 'CHAR'
                            {
                            lv_type_1_0=(Token)match(input,54,FOLLOW_2); 

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
                            // InternalPascal.g:2335:4: ( (lv_type_2_0= 'boolean' ) )
                            {
                            // InternalPascal.g:2335:4: ( (lv_type_2_0= 'boolean' ) )
                            // InternalPascal.g:2336:5: (lv_type_2_0= 'boolean' )
                            {
                            // InternalPascal.g:2336:5: (lv_type_2_0= 'boolean' )
                            // InternalPascal.g:2337:6: lv_type_2_0= 'boolean'
                            {
                            lv_type_2_0=(Token)match(input,55,FOLLOW_2); 

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
                            // InternalPascal.g:2350:4: ( (lv_type_3_0= 'integer' ) )
                            {
                            // InternalPascal.g:2350:4: ( (lv_type_3_0= 'integer' ) )
                            // InternalPascal.g:2351:5: (lv_type_3_0= 'integer' )
                            {
                            // InternalPascal.g:2351:5: (lv_type_3_0= 'integer' )
                            // InternalPascal.g:2352:6: lv_type_3_0= 'integer'
                            {
                            lv_type_3_0=(Token)match(input,56,FOLLOW_2); 

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
                            // InternalPascal.g:2365:4: ( (lv_type_4_0= 'real' ) )
                            {
                            // InternalPascal.g:2365:4: ( (lv_type_4_0= 'real' ) )
                            // InternalPascal.g:2366:5: (lv_type_4_0= 'real' )
                            {
                            // InternalPascal.g:2366:5: (lv_type_4_0= 'real' )
                            // InternalPascal.g:2367:6: lv_type_4_0= 'real'
                            {
                            lv_type_4_0=(Token)match(input,57,FOLLOW_2); 

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
                            // InternalPascal.g:2380:4: ( (lv_type_5_0= 'string' ) )
                            {
                            // InternalPascal.g:2380:4: ( (lv_type_5_0= 'string' ) )
                            // InternalPascal.g:2381:5: (lv_type_5_0= 'string' )
                            {
                            // InternalPascal.g:2381:5: (lv_type_5_0= 'string' )
                            // InternalPascal.g:2382:6: lv_type_5_0= 'string'
                            {
                            lv_type_5_0=(Token)match(input,58,FOLLOW_2); 

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
    // InternalPascal.g:2399:1: entryRulestring_type returns [EObject current=null] : iv_rulestring_type= rulestring_type EOF ;
    public final EObject entryRulestring_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring_type = null;


        try {
            // InternalPascal.g:2399:52: (iv_rulestring_type= rulestring_type EOF )
            // InternalPascal.g:2400:2: iv_rulestring_type= rulestring_type EOF
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
    // InternalPascal.g:2406:1: rulestring_type returns [EObject current=null] : (otherlv_0= 'string' otherlv_1= '[' ( ( (lv_names_2_0= RULE_ID ) ) | ( (lv_number_3_0= ruleunsigned_number ) ) ) otherlv_4= ']' ) ;
    public final EObject rulestring_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;
        Token otherlv_4=null;
        EObject lv_number_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2412:2: ( (otherlv_0= 'string' otherlv_1= '[' ( ( (lv_names_2_0= RULE_ID ) ) | ( (lv_number_3_0= ruleunsigned_number ) ) ) otherlv_4= ']' ) )
            // InternalPascal.g:2413:2: (otherlv_0= 'string' otherlv_1= '[' ( ( (lv_names_2_0= RULE_ID ) ) | ( (lv_number_3_0= ruleunsigned_number ) ) ) otherlv_4= ']' )
            {
            // InternalPascal.g:2413:2: (otherlv_0= 'string' otherlv_1= '[' ( ( (lv_names_2_0= RULE_ID ) ) | ( (lv_number_3_0= ruleunsigned_number ) ) ) otherlv_4= ']' )
            // InternalPascal.g:2414:3: otherlv_0= 'string' otherlv_1= '[' ( ( (lv_names_2_0= RULE_ID ) ) | ( (lv_number_3_0= ruleunsigned_number ) ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getString_typeAccess().getStringKeyword_0());
            		
            otherlv_1=(Token)match(input,49,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getString_typeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalPascal.g:2422:3: ( ( (lv_names_2_0= RULE_ID ) ) | ( (lv_number_3_0= ruleunsigned_number ) ) )
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
                    // InternalPascal.g:2423:4: ( (lv_names_2_0= RULE_ID ) )
                    {
                    // InternalPascal.g:2423:4: ( (lv_names_2_0= RULE_ID ) )
                    // InternalPascal.g:2424:5: (lv_names_2_0= RULE_ID )
                    {
                    // InternalPascal.g:2424:5: (lv_names_2_0= RULE_ID )
                    // InternalPascal.g:2425:6: lv_names_2_0= RULE_ID
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
                    // InternalPascal.g:2442:4: ( (lv_number_3_0= ruleunsigned_number ) )
                    {
                    // InternalPascal.g:2442:4: ( (lv_number_3_0= ruleunsigned_number ) )
                    // InternalPascal.g:2443:5: (lv_number_3_0= ruleunsigned_number )
                    {
                    // InternalPascal.g:2443:5: (lv_number_3_0= ruleunsigned_number )
                    // InternalPascal.g:2444:6: lv_number_3_0= ruleunsigned_number
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

            otherlv_4=(Token)match(input,50,FOLLOW_2); 

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
    // InternalPascal.g:2470:1: entryRuleunsigned_constant returns [EObject current=null] : iv_ruleunsigned_constant= ruleunsigned_constant EOF ;
    public final EObject entryRuleunsigned_constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_constant = null;


        try {
            // InternalPascal.g:2470:58: (iv_ruleunsigned_constant= ruleunsigned_constant EOF )
            // InternalPascal.g:2471:2: iv_ruleunsigned_constant= ruleunsigned_constant EOF
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
    // InternalPascal.g:2477:1: ruleunsigned_constant returns [EObject current=null] : ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_char_1_0= ruleconstant_chr ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_nil_3_0= RULE_NIL ) ) ) ;
    public final EObject ruleunsigned_constant() throws RecognitionException {
        EObject current = null;

        Token lv_string_2_0=null;
        Token lv_nil_3_0=null;
        EObject lv_number_0_0 = null;

        EObject lv_char_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2483:2: ( ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_char_1_0= ruleconstant_chr ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_nil_3_0= RULE_NIL ) ) ) )
            // InternalPascal.g:2484:2: ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_char_1_0= ruleconstant_chr ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_nil_3_0= RULE_NIL ) ) )
            {
            // InternalPascal.g:2484:2: ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_char_1_0= ruleconstant_chr ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_nil_3_0= RULE_NIL ) ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case RULE_NUM_INT:
            case RULE_NUM_REAL:
                {
                alt28=1;
                }
                break;
            case 59:
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
                    // InternalPascal.g:2485:3: ( (lv_number_0_0= ruleunsigned_number ) )
                    {
                    // InternalPascal.g:2485:3: ( (lv_number_0_0= ruleunsigned_number ) )
                    // InternalPascal.g:2486:4: (lv_number_0_0= ruleunsigned_number )
                    {
                    // InternalPascal.g:2486:4: (lv_number_0_0= ruleunsigned_number )
                    // InternalPascal.g:2487:5: lv_number_0_0= ruleunsigned_number
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
                    // InternalPascal.g:2505:3: ( (lv_char_1_0= ruleconstant_chr ) )
                    {
                    // InternalPascal.g:2505:3: ( (lv_char_1_0= ruleconstant_chr ) )
                    // InternalPascal.g:2506:4: (lv_char_1_0= ruleconstant_chr )
                    {
                    // InternalPascal.g:2506:4: (lv_char_1_0= ruleconstant_chr )
                    // InternalPascal.g:2507:5: lv_char_1_0= ruleconstant_chr
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
                    // InternalPascal.g:2525:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalPascal.g:2525:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalPascal.g:2526:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalPascal.g:2526:4: (lv_string_2_0= RULE_STRING )
                    // InternalPascal.g:2527:5: lv_string_2_0= RULE_STRING
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
                    // InternalPascal.g:2544:3: ( (lv_nil_3_0= RULE_NIL ) )
                    {
                    // InternalPascal.g:2544:3: ( (lv_nil_3_0= RULE_NIL ) )
                    // InternalPascal.g:2545:4: (lv_nil_3_0= RULE_NIL )
                    {
                    // InternalPascal.g:2545:4: (lv_nil_3_0= RULE_NIL )
                    // InternalPascal.g:2546:5: lv_nil_3_0= RULE_NIL
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
    // InternalPascal.g:2566:1: entryRuleunsigned_number returns [EObject current=null] : iv_ruleunsigned_number= ruleunsigned_number EOF ;
    public final EObject entryRuleunsigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_number = null;


        try {
            // InternalPascal.g:2566:56: (iv_ruleunsigned_number= ruleunsigned_number EOF )
            // InternalPascal.g:2567:2: iv_ruleunsigned_number= ruleunsigned_number EOF
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
    // InternalPascal.g:2573:1: ruleunsigned_number returns [EObject current=null] : ( ( (lv_numbers_0_0= ruleunsigned_integer ) ) | ( (lv_numbers_1_0= ruleunsigned_real ) ) ) ;
    public final EObject ruleunsigned_number() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_numbers_0_0 = null;

        AntlrDatatypeRuleToken lv_numbers_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2579:2: ( ( ( (lv_numbers_0_0= ruleunsigned_integer ) ) | ( (lv_numbers_1_0= ruleunsigned_real ) ) ) )
            // InternalPascal.g:2580:2: ( ( (lv_numbers_0_0= ruleunsigned_integer ) ) | ( (lv_numbers_1_0= ruleunsigned_real ) ) )
            {
            // InternalPascal.g:2580:2: ( ( (lv_numbers_0_0= ruleunsigned_integer ) ) | ( (lv_numbers_1_0= ruleunsigned_real ) ) )
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
                    // InternalPascal.g:2581:3: ( (lv_numbers_0_0= ruleunsigned_integer ) )
                    {
                    // InternalPascal.g:2581:3: ( (lv_numbers_0_0= ruleunsigned_integer ) )
                    // InternalPascal.g:2582:4: (lv_numbers_0_0= ruleunsigned_integer )
                    {
                    // InternalPascal.g:2582:4: (lv_numbers_0_0= ruleunsigned_integer )
                    // InternalPascal.g:2583:5: lv_numbers_0_0= ruleunsigned_integer
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
                    // InternalPascal.g:2601:3: ( (lv_numbers_1_0= ruleunsigned_real ) )
                    {
                    // InternalPascal.g:2601:3: ( (lv_numbers_1_0= ruleunsigned_real ) )
                    // InternalPascal.g:2602:4: (lv_numbers_1_0= ruleunsigned_real )
                    {
                    // InternalPascal.g:2602:4: (lv_numbers_1_0= ruleunsigned_real )
                    // InternalPascal.g:2603:5: lv_numbers_1_0= ruleunsigned_real
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
    // InternalPascal.g:2624:1: entryRuleconstant_chr returns [EObject current=null] : iv_ruleconstant_chr= ruleconstant_chr EOF ;
    public final EObject entryRuleconstant_chr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_chr = null;


        try {
            // InternalPascal.g:2624:53: (iv_ruleconstant_chr= ruleconstant_chr EOF )
            // InternalPascal.g:2625:2: iv_ruleconstant_chr= ruleconstant_chr EOF
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
    // InternalPascal.g:2631:1: ruleconstant_chr returns [EObject current=null] : (otherlv_0= 'chr' otherlv_1= '(' ( (lv_numbers_2_0= ruleunsigned_integer ) ) otherlv_3= ')' ) ;
    public final EObject ruleconstant_chr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_numbers_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2637:2: ( (otherlv_0= 'chr' otherlv_1= '(' ( (lv_numbers_2_0= ruleunsigned_integer ) ) otherlv_3= ')' ) )
            // InternalPascal.g:2638:2: (otherlv_0= 'chr' otherlv_1= '(' ( (lv_numbers_2_0= ruleunsigned_integer ) ) otherlv_3= ')' )
            {
            // InternalPascal.g:2638:2: (otherlv_0= 'chr' otherlv_1= '(' ( (lv_numbers_2_0= ruleunsigned_integer ) ) otherlv_3= ')' )
            // InternalPascal.g:2639:3: otherlv_0= 'chr' otherlv_1= '(' ( (lv_numbers_2_0= ruleunsigned_integer ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getConstant_chrAccess().getChrKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getConstant_chrAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPascal.g:2647:3: ( (lv_numbers_2_0= ruleunsigned_integer ) )
            // InternalPascal.g:2648:4: (lv_numbers_2_0= ruleunsigned_integer )
            {
            // InternalPascal.g:2648:4: (lv_numbers_2_0= ruleunsigned_integer )
            // InternalPascal.g:2649:5: lv_numbers_2_0= ruleunsigned_integer
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

            otherlv_3=(Token)match(input,41,FOLLOW_2); 

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
    // InternalPascal.g:2674:1: entryRuleprocedure_statement returns [EObject current=null] : iv_ruleprocedure_statement= ruleprocedure_statement EOF ;
    public final EObject entryRuleprocedure_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_statement = null;


        try {
            // InternalPascal.g:2674:60: (iv_ruleprocedure_statement= ruleprocedure_statement EOF )
            // InternalPascal.g:2675:2: iv_ruleprocedure_statement= ruleprocedure_statement EOF
            {
             newCompositeNode(grammarAccess.getProcedure_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_statement=ruleprocedure_statement();

            state._fsp--;

             current =iv_ruleprocedure_statement; 
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
    // InternalPascal.g:2681:1: ruleprocedure_statement returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_types_2_0= ruleparameter_list ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleprocedure_statement() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2687:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_types_2_0= ruleparameter_list ) ) otherlv_3= ')' )? ) )
            // InternalPascal.g:2688:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_types_2_0= ruleparameter_list ) ) otherlv_3= ')' )? )
            {
            // InternalPascal.g:2688:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_types_2_0= ruleparameter_list ) ) otherlv_3= ')' )? )
            // InternalPascal.g:2689:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_types_2_0= ruleparameter_list ) ) otherlv_3= ')' )?
            {
            // InternalPascal.g:2689:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalPascal.g:2690:4: (lv_names_0_0= RULE_ID )
            {
            // InternalPascal.g:2690:4: (lv_names_0_0= RULE_ID )
            // InternalPascal.g:2691:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_names_0_0, grammarAccess.getProcedure_statementAccess().getNamesIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcedure_statementRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:2707:3: (otherlv_1= '(' ( (lv_types_2_0= ruleparameter_list ) ) otherlv_3= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPascal.g:2708:4: otherlv_1= '(' ( (lv_types_2_0= ruleparameter_list ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getProcedure_statementAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalPascal.g:2712:4: ( (lv_types_2_0= ruleparameter_list ) )
                    // InternalPascal.g:2713:5: (lv_types_2_0= ruleparameter_list )
                    {
                    // InternalPascal.g:2713:5: (lv_types_2_0= ruleparameter_list )
                    // InternalPascal.g:2714:6: lv_types_2_0= ruleparameter_list
                    {

                    						newCompositeNode(grammarAccess.getProcedure_statementAccess().getTypesParameter_listParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_types_2_0=ruleparameter_list();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedure_statementRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_2_0,
                    							"org.xtext.compiler.pascal.Pascal.parameter_list");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getProcedure_statementAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "ruleprocedure_statement"


    // $ANTLR start "entryRuleparameter_list"
    // InternalPascal.g:2740:1: entryRuleparameter_list returns [EObject current=null] : iv_ruleparameter_list= ruleparameter_list EOF ;
    public final EObject entryRuleparameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_list = null;


        try {
            // InternalPascal.g:2740:55: (iv_ruleparameter_list= ruleparameter_list EOF )
            // InternalPascal.g:2741:2: iv_ruleparameter_list= ruleparameter_list EOF
            {
             newCompositeNode(grammarAccess.getParameter_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleparameter_list=ruleparameter_list();

            state._fsp--;

             current =iv_ruleparameter_list; 
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
    // $ANTLR end "entryRuleparameter_list"


    // $ANTLR start "ruleparameter_list"
    // InternalPascal.g:2747:1: ruleparameter_list returns [EObject current=null] : (this_actual_parameter_0= ruleactual_parameter (otherlv_1= ',' ( (lv_types_2_0= ruleactual_parameter ) ) )* ) ;
    public final EObject ruleparameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_actual_parameter_0 = null;

        EObject lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2753:2: ( (this_actual_parameter_0= ruleactual_parameter (otherlv_1= ',' ( (lv_types_2_0= ruleactual_parameter ) ) )* ) )
            // InternalPascal.g:2754:2: (this_actual_parameter_0= ruleactual_parameter (otherlv_1= ',' ( (lv_types_2_0= ruleactual_parameter ) ) )* )
            {
            // InternalPascal.g:2754:2: (this_actual_parameter_0= ruleactual_parameter (otherlv_1= ',' ( (lv_types_2_0= ruleactual_parameter ) ) )* )
            // InternalPascal.g:2755:3: this_actual_parameter_0= ruleactual_parameter (otherlv_1= ',' ( (lv_types_2_0= ruleactual_parameter ) ) )*
            {

            			newCompositeNode(grammarAccess.getParameter_listAccess().getActual_parameterParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_actual_parameter_0=ruleactual_parameter();

            state._fsp--;


            			current = this_actual_parameter_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPascal.g:2763:3: (otherlv_1= ',' ( (lv_types_2_0= ruleactual_parameter ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==43) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPascal.g:2764:4: otherlv_1= ',' ( (lv_types_2_0= ruleactual_parameter ) )
            	    {
            	    otherlv_1=(Token)match(input,43,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParameter_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:2768:4: ( (lv_types_2_0= ruleactual_parameter ) )
            	    // InternalPascal.g:2769:5: (lv_types_2_0= ruleactual_parameter )
            	    {
            	    // InternalPascal.g:2769:5: (lv_types_2_0= ruleactual_parameter )
            	    // InternalPascal.g:2770:6: lv_types_2_0= ruleactual_parameter
            	    {

            	    						newCompositeNode(grammarAccess.getParameter_listAccess().getTypesActual_parameterParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_types_2_0=ruleactual_parameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameter_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_2_0,
            	    							"org.xtext.compiler.pascal.Pascal.actual_parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "ruleparameter_list"


    // $ANTLR start "entryRuleactual_parameter"
    // InternalPascal.g:2792:1: entryRuleactual_parameter returns [EObject current=null] : iv_ruleactual_parameter= ruleactual_parameter EOF ;
    public final EObject entryRuleactual_parameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_parameter = null;


        try {
            // InternalPascal.g:2792:57: (iv_ruleactual_parameter= ruleactual_parameter EOF )
            // InternalPascal.g:2793:2: iv_ruleactual_parameter= ruleactual_parameter EOF
            {
             newCompositeNode(grammarAccess.getActual_parameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleactual_parameter=ruleactual_parameter();

            state._fsp--;

             current =iv_ruleactual_parameter; 
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
    // $ANTLR end "entryRuleactual_parameter"


    // $ANTLR start "ruleactual_parameter"
    // InternalPascal.g:2799:1: ruleactual_parameter returns [EObject current=null] : this_expression_0= ruleexpression ;
    public final EObject ruleactual_parameter() throws RecognitionException {
        EObject current = null;

        EObject this_expression_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2805:2: (this_expression_0= ruleexpression )
            // InternalPascal.g:2806:2: this_expression_0= ruleexpression
            {

            		newCompositeNode(grammarAccess.getActual_parameterAccess().getExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_expression_0=ruleexpression();

            state._fsp--;


            		current = this_expression_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleactual_parameter"


    // $ANTLR start "entryRulegoto_statement"
    // InternalPascal.g:2817:1: entryRulegoto_statement returns [String current=null] : iv_rulegoto_statement= rulegoto_statement EOF ;
    public final String entryRulegoto_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegoto_statement = null;


        try {
            // InternalPascal.g:2817:54: (iv_rulegoto_statement= rulegoto_statement EOF )
            // InternalPascal.g:2818:2: iv_rulegoto_statement= rulegoto_statement EOF
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
    // InternalPascal.g:2824:1: rulegoto_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'goto' ;
    public final AntlrDatatypeRuleToken rulegoto_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:2830:2: (kw= 'goto' )
            // InternalPascal.g:2831:2: kw= 'goto'
            {
            kw=(Token)match(input,60,FOLLOW_2); 

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
    // InternalPascal.g:2839:1: entryRulestructured_statement returns [String current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final String entryRulestructured_statement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestructured_statement = null;


        try {
            // InternalPascal.g:2839:60: (iv_rulestructured_statement= rulestructured_statement EOF )
            // InternalPascal.g:2840:2: iv_rulestructured_statement= rulestructured_statement EOF
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
    // InternalPascal.g:2846:1: rulestructured_statement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'structured' ;
    public final AntlrDatatypeRuleToken rulestructured_statement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascal.g:2852:2: (kw= 'structured' )
            // InternalPascal.g:2853:2: kw= 'structured'
            {
            kw=(Token)match(input,61,FOLLOW_2); 

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
    // InternalPascal.g:2861:1: entryRuleunsigned_integer returns [String current=null] : iv_ruleunsigned_integer= ruleunsigned_integer EOF ;
    public final String entryRuleunsigned_integer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsigned_integer = null;


        try {
            // InternalPascal.g:2861:56: (iv_ruleunsigned_integer= ruleunsigned_integer EOF )
            // InternalPascal.g:2862:2: iv_ruleunsigned_integer= ruleunsigned_integer EOF
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
    // InternalPascal.g:2868:1: ruleunsigned_integer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NUM_INT_0= RULE_NUM_INT ;
    public final AntlrDatatypeRuleToken ruleunsigned_integer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NUM_INT_0=null;


        	enterRule();

        try {
            // InternalPascal.g:2874:2: (this_NUM_INT_0= RULE_NUM_INT )
            // InternalPascal.g:2875:2: this_NUM_INT_0= RULE_NUM_INT
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
    // InternalPascal.g:2885:1: entryRuleunsigned_real returns [String current=null] : iv_ruleunsigned_real= ruleunsigned_real EOF ;
    public final String entryRuleunsigned_real() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsigned_real = null;


        try {
            // InternalPascal.g:2885:53: (iv_ruleunsigned_real= ruleunsigned_real EOF )
            // InternalPascal.g:2886:2: iv_ruleunsigned_real= ruleunsigned_real EOF
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
    // InternalPascal.g:2892:1: ruleunsigned_real returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NUM_REAL_0= RULE_NUM_REAL ;
    public final AntlrDatatypeRuleToken ruleunsigned_real() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NUM_REAL_0=null;


        	enterRule();

        try {
            // InternalPascal.g:2898:2: (this_NUM_REAL_0= RULE_NUM_REAL )
            // InternalPascal.g:2899:2: this_NUM_REAL_0= RULE_NUM_REAL
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
    // InternalPascal.g:2909:1: entryRuleadditive_operator returns [String current=null] : iv_ruleadditive_operator= ruleadditive_operator EOF ;
    public final String entryRuleadditive_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleadditive_operator = null;


        try {
            // InternalPascal.g:2909:57: (iv_ruleadditive_operator= ruleadditive_operator EOF )
            // InternalPascal.g:2910:2: iv_ruleadditive_operator= ruleadditive_operator EOF
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
    // InternalPascal.g:2916:1: ruleadditive_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_OR_2= RULE_OR ) ;
    public final AntlrDatatypeRuleToken ruleadditive_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_MINUS_1=null;
        Token this_OR_2=null;


        	enterRule();

        try {
            // InternalPascal.g:2922:2: ( (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_OR_2= RULE_OR ) )
            // InternalPascal.g:2923:2: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_OR_2= RULE_OR )
            {
            // InternalPascal.g:2923:2: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_OR_2= RULE_OR )
            int alt32=3;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt32=1;
                }
                break;
            case RULE_MINUS:
                {
                alt32=2;
                }
                break;
            case RULE_OR:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalPascal.g:2924:3: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_2); 

                    			current.merge(this_PLUS_0);
                    		

                    			newLeafNode(this_PLUS_0, grammarAccess.getAdditive_operatorAccess().getPLUSTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2932:3: this_MINUS_1= RULE_MINUS
                    {
                    this_MINUS_1=(Token)match(input,RULE_MINUS,FOLLOW_2); 

                    			current.merge(this_MINUS_1);
                    		

                    			newLeafNode(this_MINUS_1, grammarAccess.getAdditive_operatorAccess().getMINUSTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascal.g:2940:3: this_OR_2= RULE_OR
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
    // InternalPascal.g:2951:1: entryRulemultiplicative_operator returns [String current=null] : iv_rulemultiplicative_operator= rulemultiplicative_operator EOF ;
    public final String entryRulemultiplicative_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemultiplicative_operator = null;


        try {
            // InternalPascal.g:2951:63: (iv_rulemultiplicative_operator= rulemultiplicative_operator EOF )
            // InternalPascal.g:2952:2: iv_rulemultiplicative_operator= rulemultiplicative_operator EOF
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
    // InternalPascal.g:2958:1: rulemultiplicative_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_DIV_2= RULE_DIV | this_MOD_3= RULE_MOD | this_AND_4= RULE_AND ) ;
    public final AntlrDatatypeRuleToken rulemultiplicative_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STAR_0=null;
        Token this_SLASH_1=null;
        Token this_DIV_2=null;
        Token this_MOD_3=null;
        Token this_AND_4=null;


        	enterRule();

        try {
            // InternalPascal.g:2964:2: ( (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_DIV_2= RULE_DIV | this_MOD_3= RULE_MOD | this_AND_4= RULE_AND ) )
            // InternalPascal.g:2965:2: (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_DIV_2= RULE_DIV | this_MOD_3= RULE_MOD | this_AND_4= RULE_AND )
            {
            // InternalPascal.g:2965:2: (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_DIV_2= RULE_DIV | this_MOD_3= RULE_MOD | this_AND_4= RULE_AND )
            int alt33=5;
            switch ( input.LA(1) ) {
            case RULE_STAR:
                {
                alt33=1;
                }
                break;
            case RULE_SLASH:
                {
                alt33=2;
                }
                break;
            case RULE_DIV:
                {
                alt33=3;
                }
                break;
            case RULE_MOD:
                {
                alt33=4;
                }
                break;
            case RULE_AND:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalPascal.g:2966:3: this_STAR_0= RULE_STAR
                    {
                    this_STAR_0=(Token)match(input,RULE_STAR,FOLLOW_2); 

                    			current.merge(this_STAR_0);
                    		

                    			newLeafNode(this_STAR_0, grammarAccess.getMultiplicative_operatorAccess().getSTARTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2974:3: this_SLASH_1= RULE_SLASH
                    {
                    this_SLASH_1=(Token)match(input,RULE_SLASH,FOLLOW_2); 

                    			current.merge(this_SLASH_1);
                    		

                    			newLeafNode(this_SLASH_1, grammarAccess.getMultiplicative_operatorAccess().getSLASHTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascal.g:2982:3: this_DIV_2= RULE_DIV
                    {
                    this_DIV_2=(Token)match(input,RULE_DIV,FOLLOW_2); 

                    			current.merge(this_DIV_2);
                    		

                    			newLeafNode(this_DIV_2, grammarAccess.getMultiplicative_operatorAccess().getDIVTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPascal.g:2990:3: this_MOD_3= RULE_MOD
                    {
                    this_MOD_3=(Token)match(input,RULE_MOD,FOLLOW_2); 

                    			current.merge(this_MOD_3);
                    		

                    			newLeafNode(this_MOD_3, grammarAccess.getMultiplicative_operatorAccess().getMODTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPascal.g:2998:3: this_AND_4= RULE_AND
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
    // InternalPascal.g:3009:1: entryRulerelational_operator returns [String current=null] : iv_rulerelational_operator= rulerelational_operator EOF ;
    public final String entryRulerelational_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerelational_operator = null;


        try {
            // InternalPascal.g:3009:59: (iv_rulerelational_operator= rulerelational_operator EOF )
            // InternalPascal.g:3010:2: iv_rulerelational_operator= rulerelational_operator EOF
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
    // InternalPascal.g:3016:1: rulerelational_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_LT_2= RULE_LT | this_LE_3= RULE_LE | this_GE_4= RULE_GE | this_GT_5= RULE_GT | this_IN_6= RULE_IN ) ;
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
            // InternalPascal.g:3022:2: ( (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_LT_2= RULE_LT | this_LE_3= RULE_LE | this_GE_4= RULE_GE | this_GT_5= RULE_GT | this_IN_6= RULE_IN ) )
            // InternalPascal.g:3023:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_LT_2= RULE_LT | this_LE_3= RULE_LE | this_GE_4= RULE_GE | this_GT_5= RULE_GT | this_IN_6= RULE_IN )
            {
            // InternalPascal.g:3023:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_LT_2= RULE_LT | this_LE_3= RULE_LE | this_GE_4= RULE_GE | this_GT_5= RULE_GT | this_IN_6= RULE_IN )
            int alt34=7;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                alt34=1;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt34=2;
                }
                break;
            case RULE_LT:
                {
                alt34=3;
                }
                break;
            case RULE_LE:
                {
                alt34=4;
                }
                break;
            case RULE_GE:
                {
                alt34=5;
                }
                break;
            case RULE_GT:
                {
                alt34=6;
                }
                break;
            case RULE_IN:
                {
                alt34=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalPascal.g:3024:3: this_EQUAL_0= RULE_EQUAL
                    {
                    this_EQUAL_0=(Token)match(input,RULE_EQUAL,FOLLOW_2); 

                    			current.merge(this_EQUAL_0);
                    		

                    			newLeafNode(this_EQUAL_0, grammarAccess.getRelational_operatorAccess().getEQUALTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:3032:3: this_NOT_EQUAL_1= RULE_NOT_EQUAL
                    {
                    this_NOT_EQUAL_1=(Token)match(input,RULE_NOT_EQUAL,FOLLOW_2); 

                    			current.merge(this_NOT_EQUAL_1);
                    		

                    			newLeafNode(this_NOT_EQUAL_1, grammarAccess.getRelational_operatorAccess().getNOT_EQUALTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascal.g:3040:3: this_LT_2= RULE_LT
                    {
                    this_LT_2=(Token)match(input,RULE_LT,FOLLOW_2); 

                    			current.merge(this_LT_2);
                    		

                    			newLeafNode(this_LT_2, grammarAccess.getRelational_operatorAccess().getLTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPascal.g:3048:3: this_LE_3= RULE_LE
                    {
                    this_LE_3=(Token)match(input,RULE_LE,FOLLOW_2); 

                    			current.merge(this_LE_3);
                    		

                    			newLeafNode(this_LE_3, grammarAccess.getRelational_operatorAccess().getLETerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPascal.g:3056:3: this_GE_4= RULE_GE
                    {
                    this_GE_4=(Token)match(input,RULE_GE,FOLLOW_2); 

                    			current.merge(this_GE_4);
                    		

                    			newLeafNode(this_GE_4, grammarAccess.getRelational_operatorAccess().getGETerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPascal.g:3064:3: this_GT_5= RULE_GT
                    {
                    this_GT_5=(Token)match(input,RULE_GT,FOLLOW_2); 

                    			current.merge(this_GT_5);
                    		

                    			newLeafNode(this_GT_5, grammarAccess.getRelational_operatorAccess().getGTTerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalPascal.g:3072:3: this_IN_6= RULE_IN
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


    // $ANTLR start "entryRuleprocedure_and_function_declaration_part"
    // InternalPascal.g:3083:1: entryRuleprocedure_and_function_declaration_part returns [EObject current=null] : iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF ;
    public final EObject entryRuleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_and_function_declaration_part = null;


        try {
            // InternalPascal.g:3083:80: (iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF )
            // InternalPascal.g:3084:2: iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_and_function_declaration_part=ruleprocedure_and_function_declaration_part();

            state._fsp--;

             current =iv_ruleprocedure_and_function_declaration_part; 
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
    // $ANTLR end "entryRuleprocedure_and_function_declaration_part"


    // $ANTLR start "ruleprocedure_and_function_declaration_part"
    // InternalPascal.g:3090:1: ruleprocedure_and_function_declaration_part returns [EObject current=null] : (this_procedure_or_function_declaration_0= ruleprocedure_or_function_declaration otherlv_1= ';' ) ;
    public final EObject ruleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_procedure_or_function_declaration_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3096:2: ( (this_procedure_or_function_declaration_0= ruleprocedure_or_function_declaration otherlv_1= ';' ) )
            // InternalPascal.g:3097:2: (this_procedure_or_function_declaration_0= ruleprocedure_or_function_declaration otherlv_1= ';' )
            {
            // InternalPascal.g:3097:2: (this_procedure_or_function_declaration_0= ruleprocedure_or_function_declaration otherlv_1= ';' )
            // InternalPascal.g:3098:3: this_procedure_or_function_declaration_0= ruleprocedure_or_function_declaration otherlv_1= ';'
            {

            			newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getProcedure_or_function_declarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_procedure_or_function_declaration_0=ruleprocedure_or_function_declaration();

            state._fsp--;


            			current = this_procedure_or_function_declaration_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getProcedure_and_function_declaration_partAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleprocedure_and_function_declaration_part"


    // $ANTLR start "entryRuleprocedure_or_function_declaration"
    // InternalPascal.g:3114:1: entryRuleprocedure_or_function_declaration returns [EObject current=null] : iv_ruleprocedure_or_function_declaration= ruleprocedure_or_function_declaration EOF ;
    public final EObject entryRuleprocedure_or_function_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_or_function_declaration = null;


        try {
            // InternalPascal.g:3114:74: (iv_ruleprocedure_or_function_declaration= ruleprocedure_or_function_declaration EOF )
            // InternalPascal.g:3115:2: iv_ruleprocedure_or_function_declaration= ruleprocedure_or_function_declaration EOF
            {
             newCompositeNode(grammarAccess.getProcedure_or_function_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_or_function_declaration=ruleprocedure_or_function_declaration();

            state._fsp--;

             current =iv_ruleprocedure_or_function_declaration; 
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
    // $ANTLR end "entryRuleprocedure_or_function_declaration"


    // $ANTLR start "ruleprocedure_or_function_declaration"
    // InternalPascal.g:3121:1: ruleprocedure_or_function_declaration returns [EObject current=null] : (this_procedure_declaration_0= ruleprocedure_declaration | this_function_declaration_1= rulefunction_declaration ) ;
    public final EObject ruleprocedure_or_function_declaration() throws RecognitionException {
        EObject current = null;

        EObject this_procedure_declaration_0 = null;

        EObject this_function_declaration_1 = null;



        	enterRule();

        try {
            // InternalPascal.g:3127:2: ( (this_procedure_declaration_0= ruleprocedure_declaration | this_function_declaration_1= rulefunction_declaration ) )
            // InternalPascal.g:3128:2: (this_procedure_declaration_0= ruleprocedure_declaration | this_function_declaration_1= rulefunction_declaration )
            {
            // InternalPascal.g:3128:2: (this_procedure_declaration_0= ruleprocedure_declaration | this_function_declaration_1= rulefunction_declaration )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_PROCEDURE) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_FUNCTION) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalPascal.g:3129:3: this_procedure_declaration_0= ruleprocedure_declaration
                    {

                    			newCompositeNode(grammarAccess.getProcedure_or_function_declarationAccess().getProcedure_declarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_procedure_declaration_0=ruleprocedure_declaration();

                    state._fsp--;


                    			current = this_procedure_declaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:3138:3: this_function_declaration_1= rulefunction_declaration
                    {

                    			newCompositeNode(grammarAccess.getProcedure_or_function_declarationAccess().getFunction_declarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_function_declaration_1=rulefunction_declaration();

                    state._fsp--;


                    			current = this_function_declaration_1;
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
    // $ANTLR end "ruleprocedure_or_function_declaration"


    // $ANTLR start "entryRuleprocedure_declaration"
    // InternalPascal.g:3150:1: entryRuleprocedure_declaration returns [EObject current=null] : iv_ruleprocedure_declaration= ruleprocedure_declaration EOF ;
    public final EObject entryRuleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_declaration = null;


        try {
            // InternalPascal.g:3150:62: (iv_ruleprocedure_declaration= ruleprocedure_declaration EOF )
            // InternalPascal.g:3151:2: iv_ruleprocedure_declaration= ruleprocedure_declaration EOF
            {
             newCompositeNode(grammarAccess.getProcedure_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_declaration=ruleprocedure_declaration();

            state._fsp--;

             current =iv_ruleprocedure_declaration; 
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
    // $ANTLR end "entryRuleprocedure_declaration"


    // $ANTLR start "ruleprocedure_declaration"
    // InternalPascal.g:3157:1: ruleprocedure_declaration returns [EObject current=null] : (this_PROCEDURE_0= RULE_PROCEDURE ( (lv_names_1_0= RULE_ID ) ) ( (lv_types_2_0= ruleformal_parameter_list ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) ) ) ;
    public final EObject ruleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        Token this_PROCEDURE_0=null;
        Token lv_names_1_0=null;
        Token otherlv_3=null;
        EObject lv_types_2_0 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3163:2: ( (this_PROCEDURE_0= RULE_PROCEDURE ( (lv_names_1_0= RULE_ID ) ) ( (lv_types_2_0= ruleformal_parameter_list ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) ) ) )
            // InternalPascal.g:3164:2: (this_PROCEDURE_0= RULE_PROCEDURE ( (lv_names_1_0= RULE_ID ) ) ( (lv_types_2_0= ruleformal_parameter_list ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) ) )
            {
            // InternalPascal.g:3164:2: (this_PROCEDURE_0= RULE_PROCEDURE ( (lv_names_1_0= RULE_ID ) ) ( (lv_types_2_0= ruleformal_parameter_list ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) ) )
            // InternalPascal.g:3165:3: this_PROCEDURE_0= RULE_PROCEDURE ( (lv_names_1_0= RULE_ID ) ) ( (lv_types_2_0= ruleformal_parameter_list ) )? otherlv_3= ';' ( (lv_block_4_0= ruleblock ) )
            {
            this_PROCEDURE_0=(Token)match(input,RULE_PROCEDURE,FOLLOW_5); 

            			newLeafNode(this_PROCEDURE_0, grammarAccess.getProcedure_declarationAccess().getPROCEDURETerminalRuleCall_0());
            		
            // InternalPascal.g:3169:3: ( (lv_names_1_0= RULE_ID ) )
            // InternalPascal.g:3170:4: (lv_names_1_0= RULE_ID )
            {
            // InternalPascal.g:3170:4: (lv_names_1_0= RULE_ID )
            // InternalPascal.g:3171:5: lv_names_1_0= RULE_ID
            {
            lv_names_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_names_1_0, grammarAccess.getProcedure_declarationAccess().getNamesIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcedure_declarationRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:3187:3: ( (lv_types_2_0= ruleformal_parameter_list ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPascal.g:3188:4: (lv_types_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:3188:4: (lv_types_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:3189:5: lv_types_2_0= ruleformal_parameter_list
                    {

                    					newCompositeNode(grammarAccess.getProcedure_declarationAccess().getTypesFormal_parameter_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_types_2_0=ruleformal_parameter_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
                    					}
                    					add(
                    						current,
                    						"types",
                    						lv_types_2_0,
                    						"org.xtext.compiler.pascal.Pascal.formal_parameter_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_3());
            		
            // InternalPascal.g:3210:3: ( (lv_block_4_0= ruleblock ) )
            // InternalPascal.g:3211:4: (lv_block_4_0= ruleblock )
            {
            // InternalPascal.g:3211:4: (lv_block_4_0= ruleblock )
            // InternalPascal.g:3212:5: lv_block_4_0= ruleblock
            {

            					newCompositeNode(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_4_0=ruleblock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_4_0,
            						"org.xtext.compiler.pascal.Pascal.block");
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
    // $ANTLR end "ruleprocedure_declaration"


    // $ANTLR start "entryRuleprocedure_type"
    // InternalPascal.g:3233:1: entryRuleprocedure_type returns [EObject current=null] : iv_ruleprocedure_type= ruleprocedure_type EOF ;
    public final EObject entryRuleprocedure_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_type = null;


        try {
            // InternalPascal.g:3233:55: (iv_ruleprocedure_type= ruleprocedure_type EOF )
            // InternalPascal.g:3234:2: iv_ruleprocedure_type= ruleprocedure_type EOF
            {
             newCompositeNode(grammarAccess.getProcedure_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_type=ruleprocedure_type();

            state._fsp--;

             current =iv_ruleprocedure_type; 
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
    // $ANTLR end "entryRuleprocedure_type"


    // $ANTLR start "ruleprocedure_type"
    // InternalPascal.g:3240:1: ruleprocedure_type returns [EObject current=null] : ( () this_PROCEDURE_1= RULE_PROCEDURE ( (lv_types_2_0= ruleformal_parameter_list ) )? ) ;
    public final EObject ruleprocedure_type() throws RecognitionException {
        EObject current = null;

        Token this_PROCEDURE_1=null;
        EObject lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3246:2: ( ( () this_PROCEDURE_1= RULE_PROCEDURE ( (lv_types_2_0= ruleformal_parameter_list ) )? ) )
            // InternalPascal.g:3247:2: ( () this_PROCEDURE_1= RULE_PROCEDURE ( (lv_types_2_0= ruleformal_parameter_list ) )? )
            {
            // InternalPascal.g:3247:2: ( () this_PROCEDURE_1= RULE_PROCEDURE ( (lv_types_2_0= ruleformal_parameter_list ) )? )
            // InternalPascal.g:3248:3: () this_PROCEDURE_1= RULE_PROCEDURE ( (lv_types_2_0= ruleformal_parameter_list ) )?
            {
            // InternalPascal.g:3248:3: ()
            // InternalPascal.g:3249:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProcedure_typeAccess().getProcedure_typeAction_0(),
            					current);
            			

            }

            this_PROCEDURE_1=(Token)match(input,RULE_PROCEDURE,FOLLOW_36); 

            			newLeafNode(this_PROCEDURE_1, grammarAccess.getProcedure_typeAccess().getPROCEDURETerminalRuleCall_1());
            		
            // InternalPascal.g:3259:3: ( (lv_types_2_0= ruleformal_parameter_list ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==40) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPascal.g:3260:4: (lv_types_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:3260:4: (lv_types_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:3261:5: lv_types_2_0= ruleformal_parameter_list
                    {

                    					newCompositeNode(grammarAccess.getProcedure_typeAccess().getTypesFormal_parameter_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_types_2_0=ruleformal_parameter_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedure_typeRule());
                    					}
                    					add(
                    						current,
                    						"types",
                    						lv_types_2_0,
                    						"org.xtext.compiler.pascal.Pascal.formal_parameter_list");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleprocedure_type"


    // $ANTLR start "entryRulefunction_declaration"
    // InternalPascal.g:3282:1: entryRulefunction_declaration returns [EObject current=null] : iv_rulefunction_declaration= rulefunction_declaration EOF ;
    public final EObject entryRulefunction_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_declaration = null;


        try {
            // InternalPascal.g:3282:61: (iv_rulefunction_declaration= rulefunction_declaration EOF )
            // InternalPascal.g:3283:2: iv_rulefunction_declaration= rulefunction_declaration EOF
            {
             newCompositeNode(grammarAccess.getFunction_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_declaration=rulefunction_declaration();

            state._fsp--;

             current =iv_rulefunction_declaration; 
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
    // $ANTLR end "entryRulefunction_declaration"


    // $ANTLR start "rulefunction_declaration"
    // InternalPascal.g:3289:1: rulefunction_declaration returns [EObject current=null] : (this_FUNCTION_0= RULE_FUNCTION ( (lv_names_1_0= RULE_ID ) ) ( (lv_types_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_types_4_0= ruleresult_type ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) ) ) ;
    public final EObject rulefunction_declaration() throws RecognitionException {
        EObject current = null;

        Token this_FUNCTION_0=null;
        Token lv_names_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_types_2_0 = null;

        EObject lv_types_4_0 = null;

        EObject lv_block_6_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3295:2: ( (this_FUNCTION_0= RULE_FUNCTION ( (lv_names_1_0= RULE_ID ) ) ( (lv_types_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_types_4_0= ruleresult_type ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) ) ) )
            // InternalPascal.g:3296:2: (this_FUNCTION_0= RULE_FUNCTION ( (lv_names_1_0= RULE_ID ) ) ( (lv_types_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_types_4_0= ruleresult_type ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) ) )
            {
            // InternalPascal.g:3296:2: (this_FUNCTION_0= RULE_FUNCTION ( (lv_names_1_0= RULE_ID ) ) ( (lv_types_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_types_4_0= ruleresult_type ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) ) )
            // InternalPascal.g:3297:3: this_FUNCTION_0= RULE_FUNCTION ( (lv_names_1_0= RULE_ID ) ) ( (lv_types_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_types_4_0= ruleresult_type ) ) otherlv_5= ';' ( (lv_block_6_0= ruleblock ) )
            {
            this_FUNCTION_0=(Token)match(input,RULE_FUNCTION,FOLLOW_5); 

            			newLeafNode(this_FUNCTION_0, grammarAccess.getFunction_declarationAccess().getFUNCTIONTerminalRuleCall_0());
            		
            // InternalPascal.g:3301:3: ( (lv_names_1_0= RULE_ID ) )
            // InternalPascal.g:3302:4: (lv_names_1_0= RULE_ID )
            {
            // InternalPascal.g:3302:4: (lv_names_1_0= RULE_ID )
            // InternalPascal.g:3303:5: lv_names_1_0= RULE_ID
            {
            lv_names_1_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(lv_names_1_0, grammarAccess.getFunction_declarationAccess().getNamesIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunction_declarationRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:3319:3: ( (lv_types_2_0= ruleformal_parameter_list ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPascal.g:3320:4: (lv_types_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:3320:4: (lv_types_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:3321:5: lv_types_2_0= ruleformal_parameter_list
                    {

                    					newCompositeNode(grammarAccess.getFunction_declarationAccess().getTypesFormal_parameter_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_types_2_0=ruleformal_parameter_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
                    					}
                    					add(
                    						current,
                    						"types",
                    						lv_types_2_0,
                    						"org.xtext.compiler.pascal.Pascal.formal_parameter_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,45,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getFunction_declarationAccess().getColonKeyword_3());
            		
            // InternalPascal.g:3342:3: ( (lv_types_4_0= ruleresult_type ) )
            // InternalPascal.g:3343:4: (lv_types_4_0= ruleresult_type )
            {
            // InternalPascal.g:3343:4: (lv_types_4_0= ruleresult_type )
            // InternalPascal.g:3344:5: lv_types_4_0= ruleresult_type
            {

            					newCompositeNode(grammarAccess.getFunction_declarationAccess().getTypesResult_typeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_types_4_0=ruleresult_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_4_0,
            						"org.xtext.compiler.pascal.Pascal.result_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_5());
            		
            // InternalPascal.g:3365:3: ( (lv_block_6_0= ruleblock ) )
            // InternalPascal.g:3366:4: (lv_block_6_0= ruleblock )
            {
            // InternalPascal.g:3366:4: (lv_block_6_0= ruleblock )
            // InternalPascal.g:3367:5: lv_block_6_0= ruleblock
            {

            					newCompositeNode(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_6_0=ruleblock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_6_0,
            						"org.xtext.compiler.pascal.Pascal.block");
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
    // $ANTLR end "rulefunction_declaration"


    // $ANTLR start "entryRulefunction_type"
    // InternalPascal.g:3388:1: entryRulefunction_type returns [EObject current=null] : iv_rulefunction_type= rulefunction_type EOF ;
    public final EObject entryRulefunction_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_type = null;


        try {
            // InternalPascal.g:3388:54: (iv_rulefunction_type= rulefunction_type EOF )
            // InternalPascal.g:3389:2: iv_rulefunction_type= rulefunction_type EOF
            {
             newCompositeNode(grammarAccess.getFunction_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_type=rulefunction_type();

            state._fsp--;

             current =iv_rulefunction_type; 
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
    // $ANTLR end "entryRulefunction_type"


    // $ANTLR start "rulefunction_type"
    // InternalPascal.g:3395:1: rulefunction_type returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) ( (lv_types_1_0= ruleformal_parameter_list ) )? otherlv_2= ':' ( (lv_types_3_0= ruleresult_type ) ) ) ;
    public final EObject rulefunction_type() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3401:2: ( ( ( (lv_names_0_0= RULE_ID ) ) ( (lv_types_1_0= ruleformal_parameter_list ) )? otherlv_2= ':' ( (lv_types_3_0= ruleresult_type ) ) ) )
            // InternalPascal.g:3402:2: ( ( (lv_names_0_0= RULE_ID ) ) ( (lv_types_1_0= ruleformal_parameter_list ) )? otherlv_2= ':' ( (lv_types_3_0= ruleresult_type ) ) )
            {
            // InternalPascal.g:3402:2: ( ( (lv_names_0_0= RULE_ID ) ) ( (lv_types_1_0= ruleformal_parameter_list ) )? otherlv_2= ':' ( (lv_types_3_0= ruleresult_type ) ) )
            // InternalPascal.g:3403:3: ( (lv_names_0_0= RULE_ID ) ) ( (lv_types_1_0= ruleformal_parameter_list ) )? otherlv_2= ':' ( (lv_types_3_0= ruleresult_type ) )
            {
            // InternalPascal.g:3403:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalPascal.g:3404:4: (lv_names_0_0= RULE_ID )
            {
            // InternalPascal.g:3404:4: (lv_names_0_0= RULE_ID )
            // InternalPascal.g:3405:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(lv_names_0_0, grammarAccess.getFunction_typeAccess().getNamesIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunction_typeRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:3421:3: ( (lv_types_1_0= ruleformal_parameter_list ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPascal.g:3422:4: (lv_types_1_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:3422:4: (lv_types_1_0= ruleformal_parameter_list )
                    // InternalPascal.g:3423:5: lv_types_1_0= ruleformal_parameter_list
                    {

                    					newCompositeNode(grammarAccess.getFunction_typeAccess().getTypesFormal_parameter_listParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_types_1_0=ruleformal_parameter_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunction_typeRule());
                    					}
                    					add(
                    						current,
                    						"types",
                    						lv_types_1_0,
                    						"org.xtext.compiler.pascal.Pascal.formal_parameter_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,45,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getFunction_typeAccess().getColonKeyword_2());
            		
            // InternalPascal.g:3444:3: ( (lv_types_3_0= ruleresult_type ) )
            // InternalPascal.g:3445:4: (lv_types_3_0= ruleresult_type )
            {
            // InternalPascal.g:3445:4: (lv_types_3_0= ruleresult_type )
            // InternalPascal.g:3446:5: lv_types_3_0= ruleresult_type
            {

            					newCompositeNode(grammarAccess.getFunction_typeAccess().getTypesResult_typeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_types_3_0=ruleresult_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunction_typeRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_3_0,
            						"org.xtext.compiler.pascal.Pascal.result_type");
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
    // $ANTLR end "rulefunction_type"


    // $ANTLR start "entryRuleformal_parameter_list"
    // InternalPascal.g:3467:1: entryRuleformal_parameter_list returns [EObject current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final EObject entryRuleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_list = null;


        try {
            // InternalPascal.g:3467:62: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // InternalPascal.g:3468:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleformal_parameter_list=ruleformal_parameter_list();

            state._fsp--;

             current =iv_ruleformal_parameter_list; 
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
    // $ANTLR end "entryRuleformal_parameter_list"


    // $ANTLR start "ruleformal_parameter_list"
    // InternalPascal.g:3474:1: ruleformal_parameter_list returns [EObject current=null] : (otherlv_0= '(' this_formal_parameter_section_1= ruleformal_parameter_section (otherlv_2= ';' ( (lv_types_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_formal_parameter_section_1 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3480:2: ( (otherlv_0= '(' this_formal_parameter_section_1= ruleformal_parameter_section (otherlv_2= ';' ( (lv_types_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) )
            // InternalPascal.g:3481:2: (otherlv_0= '(' this_formal_parameter_section_1= ruleformal_parameter_section (otherlv_2= ';' ( (lv_types_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            {
            // InternalPascal.g:3481:2: (otherlv_0= '(' this_formal_parameter_section_1= ruleformal_parameter_section (otherlv_2= ';' ( (lv_types_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            // InternalPascal.g:3482:3: otherlv_0= '(' this_formal_parameter_section_1= ruleformal_parameter_section (otherlv_2= ';' ( (lv_types_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getFormal_parameter_sectionParserRuleCall_1());
            		
            pushFollow(FOLLOW_40);
            this_formal_parameter_section_1=ruleformal_parameter_section();

            state._fsp--;


            			current = this_formal_parameter_section_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalPascal.g:3494:3: (otherlv_2= ';' ( (lv_types_3_0= ruleformal_parameter_section ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==42) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPascal.g:3495:4: otherlv_2= ';' ( (lv_types_3_0= ruleformal_parameter_section ) )
            	    {
            	    otherlv_2=(Token)match(input,42,FOLLOW_39); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalPascal.g:3499:4: ( (lv_types_3_0= ruleformal_parameter_section ) )
            	    // InternalPascal.g:3500:5: (lv_types_3_0= ruleformal_parameter_section )
            	    {
            	    // InternalPascal.g:3500:5: (lv_types_3_0= ruleformal_parameter_section )
            	    // InternalPascal.g:3501:6: lv_types_3_0= ruleformal_parameter_section
            	    {

            	    						newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getTypesFormal_parameter_sectionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_types_3_0=ruleformal_parameter_section();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_3_0,
            	    							"org.xtext.compiler.pascal.Pascal.formal_parameter_section");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_4=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleformal_parameter_list"


    // $ANTLR start "entryRuleformal_parameter_section"
    // InternalPascal.g:3527:1: entryRuleformal_parameter_section returns [EObject current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final EObject entryRuleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_section = null;


        try {
            // InternalPascal.g:3527:65: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // InternalPascal.g:3528:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleformal_parameter_section=ruleformal_parameter_section();

            state._fsp--;

             current =iv_ruleformal_parameter_section; 
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
    // $ANTLR end "entryRuleformal_parameter_section"


    // $ANTLR start "ruleformal_parameter_section"
    // InternalPascal.g:3534:1: ruleformal_parameter_section returns [EObject current=null] : (this_parameter_group_0= ruleparameter_group | (this_VAR_1= RULE_VAR this_parameter_group_2= ruleparameter_group ) | (this_FUNCTION_3= RULE_FUNCTION this_parameter_group_4= ruleparameter_group ) | (this_PROCEDURE_5= RULE_PROCEDURE this_parameter_group_6= ruleparameter_group ) ) ;
    public final EObject ruleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        Token this_VAR_1=null;
        Token this_FUNCTION_3=null;
        Token this_PROCEDURE_5=null;
        EObject this_parameter_group_0 = null;

        EObject this_parameter_group_2 = null;

        EObject this_parameter_group_4 = null;

        EObject this_parameter_group_6 = null;



        	enterRule();

        try {
            // InternalPascal.g:3540:2: ( (this_parameter_group_0= ruleparameter_group | (this_VAR_1= RULE_VAR this_parameter_group_2= ruleparameter_group ) | (this_FUNCTION_3= RULE_FUNCTION this_parameter_group_4= ruleparameter_group ) | (this_PROCEDURE_5= RULE_PROCEDURE this_parameter_group_6= ruleparameter_group ) ) )
            // InternalPascal.g:3541:2: (this_parameter_group_0= ruleparameter_group | (this_VAR_1= RULE_VAR this_parameter_group_2= ruleparameter_group ) | (this_FUNCTION_3= RULE_FUNCTION this_parameter_group_4= ruleparameter_group ) | (this_PROCEDURE_5= RULE_PROCEDURE this_parameter_group_6= ruleparameter_group ) )
            {
            // InternalPascal.g:3541:2: (this_parameter_group_0= ruleparameter_group | (this_VAR_1= RULE_VAR this_parameter_group_2= ruleparameter_group ) | (this_FUNCTION_3= RULE_FUNCTION this_parameter_group_4= ruleparameter_group ) | (this_PROCEDURE_5= RULE_PROCEDURE this_parameter_group_6= ruleparameter_group ) )
            int alt41=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt41=1;
                }
                break;
            case RULE_VAR:
                {
                alt41=2;
                }
                break;
            case RULE_FUNCTION:
                {
                alt41=3;
                }
                break;
            case RULE_PROCEDURE:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalPascal.g:3542:3: this_parameter_group_0= ruleparameter_group
                    {

                    			newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getParameter_groupParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_parameter_group_0=ruleparameter_group();

                    state._fsp--;


                    			current = this_parameter_group_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:3551:3: (this_VAR_1= RULE_VAR this_parameter_group_2= ruleparameter_group )
                    {
                    // InternalPascal.g:3551:3: (this_VAR_1= RULE_VAR this_parameter_group_2= ruleparameter_group )
                    // InternalPascal.g:3552:4: this_VAR_1= RULE_VAR this_parameter_group_2= ruleparameter_group
                    {
                    this_VAR_1=(Token)match(input,RULE_VAR,FOLLOW_5); 

                    				newLeafNode(this_VAR_1, grammarAccess.getFormal_parameter_sectionAccess().getVARTerminalRuleCall_1_0());
                    			

                    				newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getParameter_groupParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_parameter_group_2=ruleparameter_group();

                    state._fsp--;


                    				current = this_parameter_group_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:3566:3: (this_FUNCTION_3= RULE_FUNCTION this_parameter_group_4= ruleparameter_group )
                    {
                    // InternalPascal.g:3566:3: (this_FUNCTION_3= RULE_FUNCTION this_parameter_group_4= ruleparameter_group )
                    // InternalPascal.g:3567:4: this_FUNCTION_3= RULE_FUNCTION this_parameter_group_4= ruleparameter_group
                    {
                    this_FUNCTION_3=(Token)match(input,RULE_FUNCTION,FOLLOW_5); 

                    				newLeafNode(this_FUNCTION_3, grammarAccess.getFormal_parameter_sectionAccess().getFUNCTIONTerminalRuleCall_2_0());
                    			

                    				newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getParameter_groupParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_parameter_group_4=ruleparameter_group();

                    state._fsp--;


                    				current = this_parameter_group_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:3581:3: (this_PROCEDURE_5= RULE_PROCEDURE this_parameter_group_6= ruleparameter_group )
                    {
                    // InternalPascal.g:3581:3: (this_PROCEDURE_5= RULE_PROCEDURE this_parameter_group_6= ruleparameter_group )
                    // InternalPascal.g:3582:4: this_PROCEDURE_5= RULE_PROCEDURE this_parameter_group_6= ruleparameter_group
                    {
                    this_PROCEDURE_5=(Token)match(input,RULE_PROCEDURE,FOLLOW_5); 

                    				newLeafNode(this_PROCEDURE_5, grammarAccess.getFormal_parameter_sectionAccess().getPROCEDURETerminalRuleCall_3_0());
                    			

                    				newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getParameter_groupParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_parameter_group_6=ruleparameter_group();

                    state._fsp--;


                    				current = this_parameter_group_6;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleformal_parameter_section"


    // $ANTLR start "entryRuleparameter_group"
    // InternalPascal.g:3599:1: entryRuleparameter_group returns [EObject current=null] : iv_ruleparameter_group= ruleparameter_group EOF ;
    public final EObject entryRuleparameter_group() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_group = null;


        try {
            // InternalPascal.g:3599:56: (iv_ruleparameter_group= ruleparameter_group EOF )
            // InternalPascal.g:3600:2: iv_ruleparameter_group= ruleparameter_group EOF
            {
             newCompositeNode(grammarAccess.getParameter_groupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleparameter_group=ruleparameter_group();

            state._fsp--;

             current =iv_ruleparameter_group; 
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
    // $ANTLR end "entryRuleparameter_group"


    // $ANTLR start "ruleparameter_group"
    // InternalPascal.g:3606:1: ruleparameter_group returns [EObject current=null] : (this_identifier_list_0= ruleidentifier_list otherlv_1= ':' ( (lv_types_2_0= ruletype_identifier ) ) ) ;
    public final EObject ruleparameter_group() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_identifier_list_0 = null;

        EObject lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3612:2: ( (this_identifier_list_0= ruleidentifier_list otherlv_1= ':' ( (lv_types_2_0= ruletype_identifier ) ) ) )
            // InternalPascal.g:3613:2: (this_identifier_list_0= ruleidentifier_list otherlv_1= ':' ( (lv_types_2_0= ruletype_identifier ) ) )
            {
            // InternalPascal.g:3613:2: (this_identifier_list_0= ruleidentifier_list otherlv_1= ':' ( (lv_types_2_0= ruletype_identifier ) ) )
            // InternalPascal.g:3614:3: this_identifier_list_0= ruleidentifier_list otherlv_1= ':' ( (lv_types_2_0= ruletype_identifier ) )
            {

            			newCompositeNode(grammarAccess.getParameter_groupAccess().getIdentifier_listParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_identifier_list_0=ruleidentifier_list();

            state._fsp--;


            			current = this_identifier_list_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,45,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getParameter_groupAccess().getColonKeyword_1());
            		
            // InternalPascal.g:3626:3: ( (lv_types_2_0= ruletype_identifier ) )
            // InternalPascal.g:3627:4: (lv_types_2_0= ruletype_identifier )
            {
            // InternalPascal.g:3627:4: (lv_types_2_0= ruletype_identifier )
            // InternalPascal.g:3628:5: lv_types_2_0= ruletype_identifier
            {

            					newCompositeNode(grammarAccess.getParameter_groupAccess().getTypesType_identifierParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_types_2_0=ruletype_identifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameter_groupRule());
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
    // $ANTLR end "ruleparameter_group"


    // $ANTLR start "entryRuleresult_type"
    // InternalPascal.g:3649:1: entryRuleresult_type returns [EObject current=null] : iv_ruleresult_type= ruleresult_type EOF ;
    public final EObject entryRuleresult_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleresult_type = null;


        try {
            // InternalPascal.g:3649:52: (iv_ruleresult_type= ruleresult_type EOF )
            // InternalPascal.g:3650:2: iv_ruleresult_type= ruleresult_type EOF
            {
             newCompositeNode(grammarAccess.getResult_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleresult_type=ruleresult_type();

            state._fsp--;

             current =iv_ruleresult_type; 
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
    // $ANTLR end "entryRuleresult_type"


    // $ANTLR start "ruleresult_type"
    // InternalPascal.g:3656:1: ruleresult_type returns [EObject current=null] : this_type_identifier_0= ruletype_identifier ;
    public final EObject ruleresult_type() throws RecognitionException {
        EObject current = null;

        EObject this_type_identifier_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3662:2: (this_type_identifier_0= ruletype_identifier )
            // InternalPascal.g:3663:2: this_type_identifier_0= ruletype_identifier
            {

            		newCompositeNode(grammarAccess.getResult_typeAccess().getType_identifierParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_type_identifier_0=ruletype_identifier();

            state._fsp--;


            		current = this_type_identifier_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleresult_type"


    // $ANTLR start "entryRulebool"
    // InternalPascal.g:3674:1: entryRulebool returns [String current=null] : iv_rulebool= rulebool EOF ;
    public final String entryRulebool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebool = null;


        try {
            // InternalPascal.g:3674:44: (iv_rulebool= rulebool EOF )
            // InternalPascal.g:3675:2: iv_rulebool= rulebool EOF
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
    // InternalPascal.g:3681:1: rulebool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE ) ;
    public final AntlrDatatypeRuleToken rulebool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TRUE_0=null;
        Token this_FALSE_1=null;


        	enterRule();

        try {
            // InternalPascal.g:3687:2: ( (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE ) )
            // InternalPascal.g:3688:2: (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE )
            {
            // InternalPascal.g:3688:2: (this_TRUE_0= RULE_TRUE | this_FALSE_1= RULE_FALSE )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_TRUE) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_FALSE) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalPascal.g:3689:3: this_TRUE_0= RULE_TRUE
                    {
                    this_TRUE_0=(Token)match(input,RULE_TRUE,FOLLOW_2); 

                    			current.merge(this_TRUE_0);
                    		

                    			newLeafNode(this_TRUE_0, grammarAccess.getBoolAccess().getTRUETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:3697:3: this_FALSE_1= RULE_FALSE
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
    // InternalPascal.g:3708:1: entryRulesign returns [String current=null] : iv_rulesign= rulesign EOF ;
    public final String entryRulesign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesign = null;


        try {
            // InternalPascal.g:3708:44: (iv_rulesign= rulesign EOF )
            // InternalPascal.g:3709:2: iv_rulesign= rulesign EOF
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
    // InternalPascal.g:3715:1: rulesign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS ) ;
    public final AntlrDatatypeRuleToken rulesign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_MINUS_1=null;


        	enterRule();

        try {
            // InternalPascal.g:3721:2: ( (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS ) )
            // InternalPascal.g:3722:2: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS )
            {
            // InternalPascal.g:3722:2: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_PLUS) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_MINUS) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalPascal.g:3723:3: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_2); 

                    			current.merge(this_PLUS_0);
                    		

                    			newLeafNode(this_PLUS_0, grammarAccess.getSignAccess().getPLUSTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:3731:3: this_MINUS_1= RULE_MINUS
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000500030000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x080000000000C650L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0FC001000000C650L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x3001040000004010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x3001000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x080B0100C000EE50L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x002A004000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0004080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0010080000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000FC00022L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000010602L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000003E0002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000210000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x07C0000000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000030000090L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000060000000000L});

}