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
    // InternalPascalParser.g:57:1: entryRulepascal returns [EObject current=null] : iv_rulepascal= rulepascal EOF ;
    public final EObject entryRulepascal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepascal = null;


        try {
            // InternalPascalParser.g:57:47: (iv_rulepascal= rulepascal EOF )
            // InternalPascalParser.g:58:2: iv_rulepascal= rulepascal EOF
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
    // InternalPascalParser.g:64:1: rulepascal returns [EObject current=null] : ( (lv_program_0_0= ruleprogram ) ) ;
    public final EObject rulepascal() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:70:2: ( ( (lv_program_0_0= ruleprogram ) ) )
            // InternalPascalParser.g:71:2: ( (lv_program_0_0= ruleprogram ) )
            {
            // InternalPascalParser.g:71:2: ( (lv_program_0_0= ruleprogram ) )
            // InternalPascalParser.g:72:3: (lv_program_0_0= ruleprogram )
            {
            // InternalPascalParser.g:72:3: (lv_program_0_0= ruleprogram )
            // InternalPascalParser.g:73:4: lv_program_0_0= ruleprogram
            {

            				newCompositeNode(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_program_0_0=ruleprogram();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPascalRule());
            				}
            				set(
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
    // InternalPascalParser.g:93:1: entryRuleprogram returns [EObject current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final EObject entryRuleprogram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram = null;


        try {
            // InternalPascalParser.g:93:48: (iv_ruleprogram= ruleprogram EOF )
            // InternalPascalParser.g:94:2: iv_ruleprogram= ruleprogram EOF
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
    // InternalPascalParser.g:100:1: ruleprogram returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= FullStop ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:106:2: ( ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= FullStop ) )
            // InternalPascalParser.g:107:2: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= FullStop )
            {
            // InternalPascalParser.g:107:2: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= FullStop )
            // InternalPascalParser.g:108:3: ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= FullStop
            {
            // InternalPascalParser.g:108:3: ( (lv_heading_0_0= ruleprogram_heading_block ) )
            // InternalPascalParser.g:109:4: (lv_heading_0_0= ruleprogram_heading_block )
            {
            // InternalPascalParser.g:109:4: (lv_heading_0_0= ruleprogram_heading_block )
            // InternalPascalParser.g:110:5: lv_heading_0_0= ruleprogram_heading_block
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

            // InternalPascalParser.g:127:3: ( (lv_block_1_0= ruleblock ) )
            // InternalPascalParser.g:128:4: (lv_block_1_0= ruleblock )
            {
            // InternalPascalParser.g:128:4: (lv_block_1_0= ruleblock )
            // InternalPascalParser.g:129:5: lv_block_1_0= ruleblock
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

            otherlv_2=(Token)match(input,FullStop,FOLLOW_2); 

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
    // InternalPascalParser.g:154:1: entryRuleprogram_heading_block returns [EObject current=null] : iv_ruleprogram_heading_block= ruleprogram_heading_block EOF ;
    public final EObject entryRuleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram_heading_block = null;


        try {
            // InternalPascalParser.g:154:62: (iv_ruleprogram_heading_block= ruleprogram_heading_block EOF )
            // InternalPascalParser.g:155:2: iv_ruleprogram_heading_block= ruleprogram_heading_block EOF
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
    // InternalPascalParser.g:161:1: ruleprogram_heading_block returns [EObject current=null] : (otherlv_0= Program ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPascalParser.g:167:2: ( (otherlv_0= Program ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon ) )
            // InternalPascalParser.g:168:2: (otherlv_0= Program ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon )
            {
            // InternalPascalParser.g:168:2: (otherlv_0= Program ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon )
            // InternalPascalParser.g:169:3: otherlv_0= Program ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Program,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0());
            		
            // InternalPascalParser.g:173:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascalParser.g:174:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascalParser.g:174:4: (lv_name_1_0= RULE_ID )
            // InternalPascalParser.g:175:5: lv_name_1_0= RULE_ID
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
            						"org.xtext.compiler.pascal.Pascal.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_2());
            		

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
    // InternalPascalParser.g:199:1: entryRuleidentifier_list returns [EObject current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final EObject entryRuleidentifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier_list = null;


        try {
            // InternalPascalParser.g:199:56: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // InternalPascalParser.g:200:2: iv_ruleidentifier_list= ruleidentifier_list EOF
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
    // InternalPascalParser.g:206:1: ruleidentifier_list returns [EObject current=null] : ( ( (lv_names_0_0= ruleidentifier ) ) (otherlv_1= Comma ( (lv_names_2_0= ruleidentifier ) ) )* ) ;
    public final EObject ruleidentifier_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_names_0_0 = null;

        EObject lv_names_2_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:212:2: ( ( ( (lv_names_0_0= ruleidentifier ) ) (otherlv_1= Comma ( (lv_names_2_0= ruleidentifier ) ) )* ) )
            // InternalPascalParser.g:213:2: ( ( (lv_names_0_0= ruleidentifier ) ) (otherlv_1= Comma ( (lv_names_2_0= ruleidentifier ) ) )* )
            {
            // InternalPascalParser.g:213:2: ( ( (lv_names_0_0= ruleidentifier ) ) (otherlv_1= Comma ( (lv_names_2_0= ruleidentifier ) ) )* )
            // InternalPascalParser.g:214:3: ( (lv_names_0_0= ruleidentifier ) ) (otherlv_1= Comma ( (lv_names_2_0= ruleidentifier ) ) )*
            {
            // InternalPascalParser.g:214:3: ( (lv_names_0_0= ruleidentifier ) )
            // InternalPascalParser.g:215:4: (lv_names_0_0= ruleidentifier )
            {
            // InternalPascalParser.g:215:4: (lv_names_0_0= ruleidentifier )
            // InternalPascalParser.g:216:5: lv_names_0_0= ruleidentifier
            {

            					newCompositeNode(grammarAccess.getIdentifier_listAccess().getNamesIdentifierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_names_0_0=ruleidentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIdentifier_listRule());
            					}
            					add(
            						current,
            						"names",
            						lv_names_0_0,
            						"org.xtext.compiler.pascal.Pascal.identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascalParser.g:233:3: (otherlv_1= Comma ( (lv_names_2_0= ruleidentifier ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Comma) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPascalParser.g:234:4: otherlv_1= Comma ( (lv_names_2_0= ruleidentifier ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascalParser.g:238:4: ( (lv_names_2_0= ruleidentifier ) )
            	    // InternalPascalParser.g:239:5: (lv_names_2_0= ruleidentifier )
            	    {
            	    // InternalPascalParser.g:239:5: (lv_names_2_0= ruleidentifier )
            	    // InternalPascalParser.g:240:6: lv_names_2_0= ruleidentifier
            	    {

            	    						newCompositeNode(grammarAccess.getIdentifier_listAccess().getNamesIdentifierParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_names_2_0=ruleidentifier();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIdentifier_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"names",
            	    							lv_names_2_0,
            	    							"org.xtext.compiler.pascal.Pascal.identifier");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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


    // $ANTLR start "entryRuleidentifier"
    // InternalPascalParser.g:262:1: entryRuleidentifier returns [EObject current=null] : iv_ruleidentifier= ruleidentifier EOF ;
    public final EObject entryRuleidentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier = null;


        try {
            // InternalPascalParser.g:262:51: (iv_ruleidentifier= ruleidentifier EOF )
            // InternalPascalParser.g:263:2: iv_ruleidentifier= ruleidentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleidentifier=ruleidentifier();

            state._fsp--;

             current =iv_ruleidentifier; 
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
    // $ANTLR end "entryRuleidentifier"


    // $ANTLR start "ruleidentifier"
    // InternalPascalParser.g:269:1: ruleidentifier returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleidentifier() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalPascalParser.g:275:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalPascalParser.g:276:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalPascalParser.g:276:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalPascalParser.g:277:3: (lv_id_0_0= RULE_ID )
            {
            // InternalPascalParser.g:277:3: (lv_id_0_0= RULE_ID )
            // InternalPascalParser.g:278:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getIdentifierAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIdentifierRule());
            				}
            				setWithLastConsumed(
            					current,
            					"id",
            					lv_id_0_0,
            					"org.xtext.compiler.pascal.Pascal.ID");
            			

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
    // $ANTLR end "ruleidentifier"


    // $ANTLR start "entryRuleblock"
    // InternalPascalParser.g:297:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // InternalPascalParser.g:297:46: (iv_ruleblock= ruleblock EOF )
            // InternalPascalParser.g:298:2: iv_ruleblock= ruleblock EOF
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
    // InternalPascalParser.g:304:1: ruleblock returns [EObject current=null] : ( ( ( (lv_constantpart_0_0= ruleconstant_definition_part ) ) | ( (lv_type_part_1_0= ruletype_definition_part ) ) | ( (lv_variablepart_2_0= rulevariable_declaration_part ) ) | ( (lv_procedure_function_part_3_0= ruleprocedure_and_function_declaration_part ) ) )* ( (lv_statement_4_0= rulecompound_statement ) ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_constantpart_0_0 = null;

        EObject lv_type_part_1_0 = null;

        EObject lv_variablepart_2_0 = null;

        EObject lv_procedure_function_part_3_0 = null;

        EObject lv_statement_4_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:310:2: ( ( ( ( (lv_constantpart_0_0= ruleconstant_definition_part ) ) | ( (lv_type_part_1_0= ruletype_definition_part ) ) | ( (lv_variablepart_2_0= rulevariable_declaration_part ) ) | ( (lv_procedure_function_part_3_0= ruleprocedure_and_function_declaration_part ) ) )* ( (lv_statement_4_0= rulecompound_statement ) ) ) )
            // InternalPascalParser.g:311:2: ( ( ( (lv_constantpart_0_0= ruleconstant_definition_part ) ) | ( (lv_type_part_1_0= ruletype_definition_part ) ) | ( (lv_variablepart_2_0= rulevariable_declaration_part ) ) | ( (lv_procedure_function_part_3_0= ruleprocedure_and_function_declaration_part ) ) )* ( (lv_statement_4_0= rulecompound_statement ) ) )
            {
            // InternalPascalParser.g:311:2: ( ( ( (lv_constantpart_0_0= ruleconstant_definition_part ) ) | ( (lv_type_part_1_0= ruletype_definition_part ) ) | ( (lv_variablepart_2_0= rulevariable_declaration_part ) ) | ( (lv_procedure_function_part_3_0= ruleprocedure_and_function_declaration_part ) ) )* ( (lv_statement_4_0= rulecompound_statement ) ) )
            // InternalPascalParser.g:312:3: ( ( (lv_constantpart_0_0= ruleconstant_definition_part ) ) | ( (lv_type_part_1_0= ruletype_definition_part ) ) | ( (lv_variablepart_2_0= rulevariable_declaration_part ) ) | ( (lv_procedure_function_part_3_0= ruleprocedure_and_function_declaration_part ) ) )* ( (lv_statement_4_0= rulecompound_statement ) )
            {
            // InternalPascalParser.g:312:3: ( ( (lv_constantpart_0_0= ruleconstant_definition_part ) ) | ( (lv_type_part_1_0= ruletype_definition_part ) ) | ( (lv_variablepart_2_0= rulevariable_declaration_part ) ) | ( (lv_procedure_function_part_3_0= ruleprocedure_and_function_declaration_part ) ) )*
            loop2:
            do {
                int alt2=5;
                switch ( input.LA(1) ) {
                case Const:
                    {
                    alt2=1;
                    }
                    break;
                case Type:
                    {
                    alt2=2;
                    }
                    break;
                case Var:
                    {
                    alt2=3;
                    }
                    break;
                case Procedure:
                case Function:
                    {
                    alt2=4;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalPascalParser.g:313:4: ( (lv_constantpart_0_0= ruleconstant_definition_part ) )
            	    {
            	    // InternalPascalParser.g:313:4: ( (lv_constantpart_0_0= ruleconstant_definition_part ) )
            	    // InternalPascalParser.g:314:5: (lv_constantpart_0_0= ruleconstant_definition_part )
            	    {
            	    // InternalPascalParser.g:314:5: (lv_constantpart_0_0= ruleconstant_definition_part )
            	    // InternalPascalParser.g:315:6: lv_constantpart_0_0= ruleconstant_definition_part
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
            	    // InternalPascalParser.g:333:4: ( (lv_type_part_1_0= ruletype_definition_part ) )
            	    {
            	    // InternalPascalParser.g:333:4: ( (lv_type_part_1_0= ruletype_definition_part ) )
            	    // InternalPascalParser.g:334:5: (lv_type_part_1_0= ruletype_definition_part )
            	    {
            	    // InternalPascalParser.g:334:5: (lv_type_part_1_0= ruletype_definition_part )
            	    // InternalPascalParser.g:335:6: lv_type_part_1_0= ruletype_definition_part
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getType_partType_definition_partParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_type_part_1_0=ruletype_definition_part();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"type_part",
            	    							lv_type_part_1_0,
            	    							"org.xtext.compiler.pascal.Pascal.type_definition_part");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPascalParser.g:353:4: ( (lv_variablepart_2_0= rulevariable_declaration_part ) )
            	    {
            	    // InternalPascalParser.g:353:4: ( (lv_variablepart_2_0= rulevariable_declaration_part ) )
            	    // InternalPascalParser.g:354:5: (lv_variablepart_2_0= rulevariable_declaration_part )
            	    {
            	    // InternalPascalParser.g:354:5: (lv_variablepart_2_0= rulevariable_declaration_part )
            	    // InternalPascalParser.g:355:6: lv_variablepart_2_0= rulevariable_declaration_part
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getVariablepartVariable_declaration_partParserRuleCall_0_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_variablepart_2_0=rulevariable_declaration_part();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variablepart",
            	    							lv_variablepart_2_0,
            	    							"org.xtext.compiler.pascal.Pascal.variable_declaration_part");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPascalParser.g:373:4: ( (lv_procedure_function_part_3_0= ruleprocedure_and_function_declaration_part ) )
            	    {
            	    // InternalPascalParser.g:373:4: ( (lv_procedure_function_part_3_0= ruleprocedure_and_function_declaration_part ) )
            	    // InternalPascalParser.g:374:5: (lv_procedure_function_part_3_0= ruleprocedure_and_function_declaration_part )
            	    {
            	    // InternalPascalParser.g:374:5: (lv_procedure_function_part_3_0= ruleprocedure_and_function_declaration_part )
            	    // InternalPascalParser.g:375:6: lv_procedure_function_part_3_0= ruleprocedure_and_function_declaration_part
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getProcedure_function_partProcedure_and_function_declaration_partParserRuleCall_0_3_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_procedure_function_part_3_0=ruleprocedure_and_function_declaration_part();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"procedure_function_part",
            	    							lv_procedure_function_part_3_0,
            	    							"org.xtext.compiler.pascal.Pascal.procedure_and_function_declaration_part");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalPascalParser.g:393:3: ( (lv_statement_4_0= rulecompound_statement ) )
            // InternalPascalParser.g:394:4: (lv_statement_4_0= rulecompound_statement )
            {
            // InternalPascalParser.g:394:4: (lv_statement_4_0= rulecompound_statement )
            // InternalPascalParser.g:395:5: lv_statement_4_0= rulecompound_statement
            {

            					newCompositeNode(grammarAccess.getBlockAccess().getStatementCompound_statementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_4_0=rulecompound_statement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_4_0,
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
    // InternalPascalParser.g:416:1: entryRuleconstant_definition_part returns [EObject current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final EObject entryRuleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition_part = null;


        try {
            // InternalPascalParser.g:416:65: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // InternalPascalParser.g:417:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
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
    // InternalPascalParser.g:423:1: ruleconstant_definition_part returns [EObject current=null] : (otherlv_0= Const ( ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+ ) ;
    public final EObject ruleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_constants_1_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:429:2: ( (otherlv_0= Const ( ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+ ) )
            // InternalPascalParser.g:430:2: (otherlv_0= Const ( ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+ )
            {
            // InternalPascalParser.g:430:2: (otherlv_0= Const ( ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+ )
            // InternalPascalParser.g:431:3: otherlv_0= Const ( ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+
            {
            otherlv_0=(Token)match(input,Const,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0());
            		
            // InternalPascalParser.g:435:3: ( ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPascalParser.g:436:4: ( (lv_constants_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon
            	    {
            	    // InternalPascalParser.g:436:4: ( (lv_constants_1_0= ruleconstant_definition ) )
            	    // InternalPascalParser.g:437:5: (lv_constants_1_0= ruleconstant_definition )
            	    {
            	    // InternalPascalParser.g:437:5: (lv_constants_1_0= ruleconstant_definition )
            	    // InternalPascalParser.g:438:6: lv_constants_1_0= ruleconstant_definition
            	    {

            	    						newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstantsConstant_definitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
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

            	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // InternalPascalParser.g:464:1: entryRuleconstant_definition returns [EObject current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final EObject entryRuleconstant_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition = null;


        try {
            // InternalPascalParser.g:464:60: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // InternalPascalParser.g:465:2: iv_ruleconstant_definition= ruleconstant_definition EOF
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
    // InternalPascalParser.g:471:1: ruleconstant_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL this_constant_2= ruleconstant ) ;
    public final EObject ruleconstant_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_EQUAL_1=null;
        EObject this_constant_2 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:477:2: ( ( ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL this_constant_2= ruleconstant ) )
            // InternalPascalParser.g:478:2: ( ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL this_constant_2= ruleconstant )
            {
            // InternalPascalParser.g:478:2: ( ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL this_constant_2= ruleconstant )
            // InternalPascalParser.g:479:3: ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL this_constant_2= ruleconstant
            {
            // InternalPascalParser.g:479:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascalParser.g:480:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascalParser.g:480:4: (lv_name_0_0= RULE_ID )
            // InternalPascalParser.g:481:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstant_definitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.compiler.pascal.Pascal.ID");
            				

            }


            }

            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FOLLOW_10); 

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
    // InternalPascalParser.g:513:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // InternalPascalParser.g:513:49: (iv_ruleconstant= ruleconstant EOF )
            // InternalPascalParser.g:514:2: iv_ruleconstant= ruleconstant EOF
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
    // InternalPascalParser.g:520:1: ruleconstant returns [EObject current=null] : ( ( (lv_uns_number_0_0= ruleunsigned_number ) ) | ( rulesign ( (lv_sig_number_2_0= ruleunsigned_number ) ) ) | ( (lv_name_id_3_0= RULE_ID ) ) | ( rulesign ( (lv_sig_name_id_5_0= RULE_ID ) ) ) | ( (lv_string_6_0= RULE_STRING ) ) | ( (lv_booltype_7_0= rulebool ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_id_3_0=null;
        Token lv_sig_name_id_5_0=null;
        Token lv_string_6_0=null;
        EObject lv_uns_number_0_0 = null;

        EObject lv_sig_number_2_0 = null;

        AntlrDatatypeRuleToken lv_booltype_7_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:526:2: ( ( ( (lv_uns_number_0_0= ruleunsigned_number ) ) | ( rulesign ( (lv_sig_number_2_0= ruleunsigned_number ) ) ) | ( (lv_name_id_3_0= RULE_ID ) ) | ( rulesign ( (lv_sig_name_id_5_0= RULE_ID ) ) ) | ( (lv_string_6_0= RULE_STRING ) ) | ( (lv_booltype_7_0= rulebool ) ) ) )
            // InternalPascalParser.g:527:2: ( ( (lv_uns_number_0_0= ruleunsigned_number ) ) | ( rulesign ( (lv_sig_number_2_0= ruleunsigned_number ) ) ) | ( (lv_name_id_3_0= RULE_ID ) ) | ( rulesign ( (lv_sig_name_id_5_0= RULE_ID ) ) ) | ( (lv_string_6_0= RULE_STRING ) ) | ( (lv_booltype_7_0= rulebool ) ) )
            {
            // InternalPascalParser.g:527:2: ( ( (lv_uns_number_0_0= ruleunsigned_number ) ) | ( rulesign ( (lv_sig_number_2_0= ruleunsigned_number ) ) ) | ( (lv_name_id_3_0= RULE_ID ) ) | ( rulesign ( (lv_sig_name_id_5_0= RULE_ID ) ) ) | ( (lv_string_6_0= RULE_STRING ) ) | ( (lv_booltype_7_0= rulebool ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_NUM_INT:
                {
                alt4=1;
                }
                break;
            case RULE_PLUS:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_ID) ) {
                    alt4=4;
                }
                else if ( (LA4_2==RULE_NUM_INT) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MINUS:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==RULE_NUM_INT) ) {
                    alt4=2;
                }
                else if ( (LA4_3==RULE_ID) ) {
                    alt4=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt4=3;
                }
                break;
            case RULE_STRING:
                {
                alt4=5;
                }
                break;
            case False:
            case True:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalPascalParser.g:528:3: ( (lv_uns_number_0_0= ruleunsigned_number ) )
                    {
                    // InternalPascalParser.g:528:3: ( (lv_uns_number_0_0= ruleunsigned_number ) )
                    // InternalPascalParser.g:529:4: (lv_uns_number_0_0= ruleunsigned_number )
                    {
                    // InternalPascalParser.g:529:4: (lv_uns_number_0_0= ruleunsigned_number )
                    // InternalPascalParser.g:530:5: lv_uns_number_0_0= ruleunsigned_number
                    {

                    					newCompositeNode(grammarAccess.getConstantAccess().getUns_numberUnsigned_numberParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_uns_number_0_0=ruleunsigned_number();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConstantRule());
                    					}
                    					set(
                    						current,
                    						"uns_number",
                    						lv_uns_number_0_0,
                    						"org.xtext.compiler.pascal.Pascal.unsigned_number");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:548:3: ( rulesign ( (lv_sig_number_2_0= ruleunsigned_number ) ) )
                    {
                    // InternalPascalParser.g:548:3: ( rulesign ( (lv_sig_number_2_0= ruleunsigned_number ) ) )
                    // InternalPascalParser.g:549:4: rulesign ( (lv_sig_number_2_0= ruleunsigned_number ) )
                    {

                    				newCompositeNode(grammarAccess.getConstantAccess().getSignParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_11);
                    rulesign();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalPascalParser.g:556:4: ( (lv_sig_number_2_0= ruleunsigned_number ) )
                    // InternalPascalParser.g:557:5: (lv_sig_number_2_0= ruleunsigned_number )
                    {
                    // InternalPascalParser.g:557:5: (lv_sig_number_2_0= ruleunsigned_number )
                    // InternalPascalParser.g:558:6: lv_sig_number_2_0= ruleunsigned_number
                    {

                    						newCompositeNode(grammarAccess.getConstantAccess().getSig_numberUnsigned_numberParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sig_number_2_0=ruleunsigned_number();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantRule());
                    						}
                    						set(
                    							current,
                    							"sig_number",
                    							lv_sig_number_2_0,
                    							"org.xtext.compiler.pascal.Pascal.unsigned_number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascalParser.g:577:3: ( (lv_name_id_3_0= RULE_ID ) )
                    {
                    // InternalPascalParser.g:577:3: ( (lv_name_id_3_0= RULE_ID ) )
                    // InternalPascalParser.g:578:4: (lv_name_id_3_0= RULE_ID )
                    {
                    // InternalPascalParser.g:578:4: (lv_name_id_3_0= RULE_ID )
                    // InternalPascalParser.g:579:5: lv_name_id_3_0= RULE_ID
                    {
                    lv_name_id_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_id_3_0, grammarAccess.getConstantAccess().getName_idIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name_id",
                    						lv_name_id_3_0,
                    						"org.xtext.compiler.pascal.Pascal.ID");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascalParser.g:596:3: ( rulesign ( (lv_sig_name_id_5_0= RULE_ID ) ) )
                    {
                    // InternalPascalParser.g:596:3: ( rulesign ( (lv_sig_name_id_5_0= RULE_ID ) ) )
                    // InternalPascalParser.g:597:4: rulesign ( (lv_sig_name_id_5_0= RULE_ID ) )
                    {

                    				newCompositeNode(grammarAccess.getConstantAccess().getSignParserRuleCall_3_0());
                    			
                    pushFollow(FOLLOW_5);
                    rulesign();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalPascalParser.g:604:4: ( (lv_sig_name_id_5_0= RULE_ID ) )
                    // InternalPascalParser.g:605:5: (lv_sig_name_id_5_0= RULE_ID )
                    {
                    // InternalPascalParser.g:605:5: (lv_sig_name_id_5_0= RULE_ID )
                    // InternalPascalParser.g:606:6: lv_sig_name_id_5_0= RULE_ID
                    {
                    lv_sig_name_id_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_sig_name_id_5_0, grammarAccess.getConstantAccess().getSig_name_idIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"sig_name_id",
                    							lv_sig_name_id_5_0,
                    							"org.xtext.compiler.pascal.Pascal.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascalParser.g:624:3: ( (lv_string_6_0= RULE_STRING ) )
                    {
                    // InternalPascalParser.g:624:3: ( (lv_string_6_0= RULE_STRING ) )
                    // InternalPascalParser.g:625:4: (lv_string_6_0= RULE_STRING )
                    {
                    // InternalPascalParser.g:625:4: (lv_string_6_0= RULE_STRING )
                    // InternalPascalParser.g:626:5: lv_string_6_0= RULE_STRING
                    {
                    lv_string_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_6_0, grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_6_0,
                    						"org.xtext.compiler.pascal.Pascal.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPascalParser.g:643:3: ( (lv_booltype_7_0= rulebool ) )
                    {
                    // InternalPascalParser.g:643:3: ( (lv_booltype_7_0= rulebool ) )
                    // InternalPascalParser.g:644:4: (lv_booltype_7_0= rulebool )
                    {
                    // InternalPascalParser.g:644:4: (lv_booltype_7_0= rulebool )
                    // InternalPascalParser.g:645:5: lv_booltype_7_0= rulebool
                    {

                    					newCompositeNode(grammarAccess.getConstantAccess().getBooltypeBoolParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_booltype_7_0=rulebool();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConstantRule());
                    					}
                    					set(
                    						current,
                    						"booltype",
                    						lv_booltype_7_0,
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
    // $ANTLR end "ruleconstant"


    // $ANTLR start "entryRuletype_definition_part"
    // InternalPascalParser.g:666:1: entryRuletype_definition_part returns [EObject current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final EObject entryRuletype_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition_part = null;


        try {
            // InternalPascalParser.g:666:61: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // InternalPascalParser.g:667:2: iv_ruletype_definition_part= ruletype_definition_part EOF
            {
             newCompositeNode(grammarAccess.getType_definition_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype_definition_part=ruletype_definition_part();

            state._fsp--;

             current =iv_ruletype_definition_part; 
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
    // $ANTLR end "entryRuletype_definition_part"


    // $ANTLR start "ruletype_definition_part"
    // InternalPascalParser.g:673:1: ruletype_definition_part returns [EObject current=null] : (otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+ ) ;
    public final EObject ruletype_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:679:2: ( (otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+ ) )
            // InternalPascalParser.g:680:2: (otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+ )
            {
            // InternalPascalParser.g:680:2: (otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+ )
            // InternalPascalParser.g:681:3: otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getType_definition_partAccess().getTypeKeyword_0());
            		
            // InternalPascalParser.g:685:3: ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPascalParser.g:686:4: ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon
            	    {
            	    // InternalPascalParser.g:686:4: ( (lv_types_1_0= ruletype_definition ) )
            	    // InternalPascalParser.g:687:5: (lv_types_1_0= ruletype_definition )
            	    {
            	    // InternalPascalParser.g:687:5: (lv_types_1_0= ruletype_definition )
            	    // InternalPascalParser.g:688:6: lv_types_1_0= ruletype_definition
            	    {

            	    						newCompositeNode(grammarAccess.getType_definition_partAccess().getTypesType_definitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_types_1_0=ruletype_definition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getType_definition_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_1_0,
            	    							"org.xtext.compiler.pascal.Pascal.type_definition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // $ANTLR end "ruletype_definition_part"


    // $ANTLR start "entryRuletype_definition"
    // InternalPascalParser.g:714:1: entryRuletype_definition returns [EObject current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final EObject entryRuletype_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition = null;


        try {
            // InternalPascalParser.g:714:56: (iv_ruletype_definition= ruletype_definition EOF )
            // InternalPascalParser.g:715:2: iv_ruletype_definition= ruletype_definition EOF
            {
             newCompositeNode(grammarAccess.getType_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype_definition=ruletype_definition();

            state._fsp--;

             current =iv_ruletype_definition; 
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
    // $ANTLR end "entryRuletype_definition"


    // $ANTLR start "ruletype_definition"
    // InternalPascalParser.g:721:1: ruletype_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruletype_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_EQUAL_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:727:2: ( ( ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascalParser.g:728:2: ( ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascalParser.g:728:2: ( ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL ( (lv_type_2_0= ruletype ) ) )
            // InternalPascalParser.g:729:3: ( (lv_name_0_0= RULE_ID ) ) this_EQUAL_1= RULE_EQUAL ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascalParser.g:729:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascalParser.g:730:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascalParser.g:730:4: (lv_name_0_0= RULE_ID )
            // InternalPascalParser.g:731:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getType_definitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getType_definitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.compiler.pascal.Pascal.ID");
            				

            }


            }

            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FOLLOW_12); 

            			newLeafNode(this_EQUAL_1, grammarAccess.getType_definitionAccess().getEQUALTerminalRuleCall_1());
            		
            // InternalPascalParser.g:751:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascalParser.g:752:4: (lv_type_2_0= ruletype )
            {
            // InternalPascalParser.g:752:4: (lv_type_2_0= ruletype )
            // InternalPascalParser.g:753:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getType_definitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
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
    // $ANTLR end "ruletype_definition"


    // $ANTLR start "entryRulevariable_declaration_part"
    // InternalPascalParser.g:774:1: entryRulevariable_declaration_part returns [EObject current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final EObject entryRulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration_part = null;


        try {
            // InternalPascalParser.g:774:66: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // InternalPascalParser.g:775:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
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
    // InternalPascalParser.g:781:1: rulevariable_declaration_part returns [EObject current=null] : (otherlv_0= Var ( (lv_variable_1_0= rulevariable_declaration ) ) (otherlv_2= Semicolon ( (lv_variable_3_0= rulevariable_declaration ) ) )* otherlv_4= Semicolon ) ;
    public final EObject rulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;

        EObject lv_variable_3_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:787:2: ( (otherlv_0= Var ( (lv_variable_1_0= rulevariable_declaration ) ) (otherlv_2= Semicolon ( (lv_variable_3_0= rulevariable_declaration ) ) )* otherlv_4= Semicolon ) )
            // InternalPascalParser.g:788:2: (otherlv_0= Var ( (lv_variable_1_0= rulevariable_declaration ) ) (otherlv_2= Semicolon ( (lv_variable_3_0= rulevariable_declaration ) ) )* otherlv_4= Semicolon )
            {
            // InternalPascalParser.g:788:2: (otherlv_0= Var ( (lv_variable_1_0= rulevariable_declaration ) ) (otherlv_2= Semicolon ( (lv_variable_3_0= rulevariable_declaration ) ) )* otherlv_4= Semicolon )
            // InternalPascalParser.g:789:3: otherlv_0= Var ( (lv_variable_1_0= rulevariable_declaration ) ) (otherlv_2= Semicolon ( (lv_variable_3_0= rulevariable_declaration ) ) )* otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0());
            		
            // InternalPascalParser.g:793:3: ( (lv_variable_1_0= rulevariable_declaration ) )
            // InternalPascalParser.g:794:4: (lv_variable_1_0= rulevariable_declaration )
            {
            // InternalPascalParser.g:794:4: (lv_variable_1_0= rulevariable_declaration )
            // InternalPascalParser.g:795:5: lv_variable_1_0= rulevariable_declaration
            {

            					newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getVariableVariable_declarationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalPascalParser.g:812:3: (otherlv_2= Semicolon ( (lv_variable_3_0= rulevariable_declaration ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Semicolon) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_ID) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalPascalParser.g:813:4: otherlv_2= Semicolon ( (lv_variable_3_0= rulevariable_declaration ) )
            	    {
            	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalPascalParser.g:817:4: ( (lv_variable_3_0= rulevariable_declaration ) )
            	    // InternalPascalParser.g:818:5: (lv_variable_3_0= rulevariable_declaration )
            	    {
            	    // InternalPascalParser.g:818:5: (lv_variable_3_0= rulevariable_declaration )
            	    // InternalPascalParser.g:819:6: lv_variable_3_0= rulevariable_declaration
            	    {

            	    						newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getVariableVariable_declarationParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
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

            otherlv_4=(Token)match(input,Semicolon,FOLLOW_2); 

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
    // InternalPascalParser.g:845:1: entryRulevariable_declaration returns [EObject current=null] : iv_rulevariable_declaration= rulevariable_declaration EOF ;
    public final EObject entryRulevariable_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration = null;


        try {
            // InternalPascalParser.g:845:61: (iv_rulevariable_declaration= rulevariable_declaration EOF )
            // InternalPascalParser.g:846:2: iv_rulevariable_declaration= rulevariable_declaration EOF
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
    // InternalPascalParser.g:852:1: rulevariable_declaration returns [EObject current=null] : ( ( (lv_list_names_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_variable_2_0= ruletype ) ) ) ;
    public final EObject rulevariable_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_list_names_0_0 = null;

        EObject lv_type_variable_2_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:858:2: ( ( ( (lv_list_names_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_variable_2_0= ruletype ) ) ) )
            // InternalPascalParser.g:859:2: ( ( (lv_list_names_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_variable_2_0= ruletype ) ) )
            {
            // InternalPascalParser.g:859:2: ( ( (lv_list_names_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_variable_2_0= ruletype ) ) )
            // InternalPascalParser.g:860:3: ( (lv_list_names_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_variable_2_0= ruletype ) )
            {
            // InternalPascalParser.g:860:3: ( (lv_list_names_0_0= ruleidentifier_list ) )
            // InternalPascalParser.g:861:4: (lv_list_names_0_0= ruleidentifier_list )
            {
            // InternalPascalParser.g:861:4: (lv_list_names_0_0= ruleidentifier_list )
            // InternalPascalParser.g:862:5: lv_list_names_0_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getVariable_declarationAccess().getList_namesIdentifier_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_list_names_0_0=ruleidentifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
            					}
            					set(
            						current,
            						"list_names",
            						lv_list_names_0_0,
            						"org.xtext.compiler.pascal.Pascal.identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getVariable_declarationAccess().getColonKeyword_1());
            		
            // InternalPascalParser.g:883:3: ( (lv_type_variable_2_0= ruletype ) )
            // InternalPascalParser.g:884:4: (lv_type_variable_2_0= ruletype )
            {
            // InternalPascalParser.g:884:4: (lv_type_variable_2_0= ruletype )
            // InternalPascalParser.g:885:5: lv_type_variable_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getVariable_declarationAccess().getType_variableTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_variable_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
            					}
            					set(
            						current,
            						"type_variable",
            						lv_type_variable_2_0,
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
    // InternalPascalParser.g:906:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // InternalPascalParser.g:906:59: (iv_rulecompound_statement= rulecompound_statement EOF )
            // InternalPascalParser.g:907:2: iv_rulecompound_statement= rulecompound_statement EOF
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
    // InternalPascalParser.g:913:1: rulecompound_statement returns [EObject current=null] : (otherlv_0= Begin ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= End ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:919:2: ( (otherlv_0= Begin ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= End ) )
            // InternalPascalParser.g:920:2: (otherlv_0= Begin ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= End )
            {
            // InternalPascalParser.g:920:2: (otherlv_0= Begin ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= End )
            // InternalPascalParser.g:921:3: otherlv_0= Begin ( (lv_sequence_1_0= rulestatements ) ) otherlv_2= End
            {
            otherlv_0=(Token)match(input,Begin,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCompound_statementAccess().getBeginKeyword_0());
            		
            // InternalPascalParser.g:925:3: ( (lv_sequence_1_0= rulestatements ) )
            // InternalPascalParser.g:926:4: (lv_sequence_1_0= rulestatements )
            {
            // InternalPascalParser.g:926:4: (lv_sequence_1_0= rulestatements )
            // InternalPascalParser.g:927:5: lv_sequence_1_0= rulestatements
            {

            					newCompositeNode(grammarAccess.getCompound_statementAccess().getSequenceStatementsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,End,FOLLOW_2); 

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
    // InternalPascalParser.g:952:1: entryRulestatements returns [EObject current=null] : iv_rulestatements= rulestatements EOF ;
    public final EObject entryRulestatements() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatements = null;


        try {
            // InternalPascalParser.g:952:51: (iv_rulestatements= rulestatements EOF )
            // InternalPascalParser.g:953:2: iv_rulestatements= rulestatements EOF
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
    // InternalPascalParser.g:959:1: rulestatements returns [EObject current=null] : ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:965:2: ( ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) ) )* ) )
            // InternalPascalParser.g:966:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) ) )* )
            {
            // InternalPascalParser.g:966:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) ) )* )
            // InternalPascalParser.g:967:3: ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) ) )*
            {
            // InternalPascalParser.g:967:3: ( (lv_statements_0_0= rulestatement ) )
            // InternalPascalParser.g:968:4: (lv_statements_0_0= rulestatement )
            {
            // InternalPascalParser.g:968:4: (lv_statements_0_0= rulestatement )
            // InternalPascalParser.g:969:5: lv_statements_0_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalPascalParser.g:986:3: (otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Semicolon) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPascalParser.g:987:4: otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,Semicolon,FOLLOW_14); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStatementsAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalPascalParser.g:991:4: ( (lv_statements_2_0= rulestatement ) )
            	    // InternalPascalParser.g:992:5: (lv_statements_2_0= rulestatement )
            	    {
            	    // InternalPascalParser.g:992:5: (lv_statements_2_0= rulestatement )
            	    // InternalPascalParser.g:993:6: lv_statements_2_0= rulestatement
            	    {

            	    						newCompositeNode(grammarAccess.getStatementsAccess().getStatementsStatementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
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
    // InternalPascalParser.g:1015:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalPascalParser.g:1015:50: (iv_rulestatement= rulestatement EOF )
            // InternalPascalParser.g:1016:2: iv_rulestatement= rulestatement EOF
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
    // InternalPascalParser.g:1022:1: rulestatement returns [EObject current=null] : ( () ( (lv_statement_1_0= ruleunlabelled_statement ) )? ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_1_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:1028:2: ( ( () ( (lv_statement_1_0= ruleunlabelled_statement ) )? ) )
            // InternalPascalParser.g:1029:2: ( () ( (lv_statement_1_0= ruleunlabelled_statement ) )? )
            {
            // InternalPascalParser.g:1029:2: ( () ( (lv_statement_1_0= ruleunlabelled_statement ) )? )
            // InternalPascalParser.g:1030:3: () ( (lv_statement_1_0= ruleunlabelled_statement ) )?
            {
            // InternalPascalParser.g:1030:3: ()
            // InternalPascalParser.g:1031:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatementAccess().getStatementAction_0(),
            					current);
            			

            }

            // InternalPascalParser.g:1037:3: ( (lv_statement_1_0= ruleunlabelled_statement ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Begin||LA8_0==Case||LA8_0==CommercialAt||LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPascalParser.g:1038:4: (lv_statement_1_0= ruleunlabelled_statement )
                    {
                    // InternalPascalParser.g:1038:4: (lv_statement_1_0= ruleunlabelled_statement )
                    // InternalPascalParser.g:1039:5: lv_statement_1_0= ruleunlabelled_statement
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getStatementUnlabelled_statementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_statement_1_0=ruleunlabelled_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					add(
                    						current,
                    						"statement",
                    						lv_statement_1_0,
                    						"org.xtext.compiler.pascal.Pascal.unlabelled_statement");
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
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRuleunlabelled_statement"
    // InternalPascalParser.g:1060:1: entryRuleunlabelled_statement returns [EObject current=null] : iv_ruleunlabelled_statement= ruleunlabelled_statement EOF ;
    public final EObject entryRuleunlabelled_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunlabelled_statement = null;


        try {
            // InternalPascalParser.g:1060:61: (iv_ruleunlabelled_statement= ruleunlabelled_statement EOF )
            // InternalPascalParser.g:1061:2: iv_ruleunlabelled_statement= ruleunlabelled_statement EOF
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
    // InternalPascalParser.g:1067:1: ruleunlabelled_statement returns [EObject current=null] : ( ( (lv_simple_0_0= rulesimple_statement ) ) | ( (lv_structured_1_0= rulestructured_statement ) ) ) ;
    public final EObject ruleunlabelled_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_structured_1_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:1073:2: ( ( ( (lv_simple_0_0= rulesimple_statement ) ) | ( (lv_structured_1_0= rulestructured_statement ) ) ) )
            // InternalPascalParser.g:1074:2: ( ( (lv_simple_0_0= rulesimple_statement ) ) | ( (lv_structured_1_0= rulestructured_statement ) ) )
            {
            // InternalPascalParser.g:1074:2: ( ( (lv_simple_0_0= rulesimple_statement ) ) | ( (lv_structured_1_0= rulestructured_statement ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==CommercialAt||LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==Begin||LA9_0==Case) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascalParser.g:1075:3: ( (lv_simple_0_0= rulesimple_statement ) )
                    {
                    // InternalPascalParser.g:1075:3: ( (lv_simple_0_0= rulesimple_statement ) )
                    // InternalPascalParser.g:1076:4: (lv_simple_0_0= rulesimple_statement )
                    {
                    // InternalPascalParser.g:1076:4: (lv_simple_0_0= rulesimple_statement )
                    // InternalPascalParser.g:1077:5: lv_simple_0_0= rulesimple_statement
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
                    // InternalPascalParser.g:1095:3: ( (lv_structured_1_0= rulestructured_statement ) )
                    {
                    // InternalPascalParser.g:1095:3: ( (lv_structured_1_0= rulestructured_statement ) )
                    // InternalPascalParser.g:1096:4: (lv_structured_1_0= rulestructured_statement )
                    {
                    // InternalPascalParser.g:1096:4: (lv_structured_1_0= rulestructured_statement )
                    // InternalPascalParser.g:1097:5: lv_structured_1_0= rulestructured_statement
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


    // $ANTLR start "entryRulesimple_statement"
    // InternalPascalParser.g:1118:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // InternalPascalParser.g:1118:57: (iv_rulesimple_statement= rulesimple_statement EOF )
            // InternalPascalParser.g:1119:2: iv_rulesimple_statement= rulesimple_statement EOF
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
    // InternalPascalParser.g:1125:1: rulesimple_statement returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_procedure_1_0= ruleprocedure_statement ) ) ) ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_assignment_0_0 = null;

        EObject lv_procedure_1_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:1131:2: ( ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_procedure_1_0= ruleprocedure_statement ) ) ) )
            // InternalPascalParser.g:1132:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_procedure_1_0= ruleprocedure_statement ) ) )
            {
            // InternalPascalParser.g:1132:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_procedure_1_0= ruleprocedure_statement ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==CommercialAt) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==EOF||LA10_2==Else||LA10_2==End||LA10_2==LeftParenthesis||LA10_2==Semicolon) ) {
                    alt10=2;
                }
                else if ( (LA10_2==LeftParenthesisFullStop||LA10_2==FullStop||LA10_2==LeftSquareBracket||LA10_2==CircumflexAccent||LA10_2==RULE_ASSIGN) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPascalParser.g:1133:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    {
                    // InternalPascalParser.g:1133:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    // InternalPascalParser.g:1134:4: (lv_assignment_0_0= ruleassignment_statement )
                    {
                    // InternalPascalParser.g:1134:4: (lv_assignment_0_0= ruleassignment_statement )
                    // InternalPascalParser.g:1135:5: lv_assignment_0_0= ruleassignment_statement
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
                    // InternalPascalParser.g:1153:3: ( (lv_procedure_1_0= ruleprocedure_statement ) )
                    {
                    // InternalPascalParser.g:1153:3: ( (lv_procedure_1_0= ruleprocedure_statement ) )
                    // InternalPascalParser.g:1154:4: (lv_procedure_1_0= ruleprocedure_statement )
                    {
                    // InternalPascalParser.g:1154:4: (lv_procedure_1_0= ruleprocedure_statement )
                    // InternalPascalParser.g:1155:5: lv_procedure_1_0= ruleprocedure_statement
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
    // InternalPascalParser.g:1176:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // InternalPascalParser.g:1176:61: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // InternalPascalParser.g:1177:2: iv_ruleassignment_statement= ruleassignment_statement EOF
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
    // InternalPascalParser.g:1183:1: ruleassignment_statement returns [EObject current=null] : ( ( (lv_declared_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token this_ASSIGN_1=null;
        EObject lv_declared_variable_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:1189:2: ( ( ( (lv_declared_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) ) ) )
            // InternalPascalParser.g:1190:2: ( ( (lv_declared_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) ) )
            {
            // InternalPascalParser.g:1190:2: ( ( (lv_declared_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) ) )
            // InternalPascalParser.g:1191:3: ( (lv_declared_variable_0_0= rulevariable ) ) this_ASSIGN_1= RULE_ASSIGN ( (lv_expression_2_0= ruleexpression ) )
            {
            // InternalPascalParser.g:1191:3: ( (lv_declared_variable_0_0= rulevariable ) )
            // InternalPascalParser.g:1192:4: (lv_declared_variable_0_0= rulevariable )
            {
            // InternalPascalParser.g:1192:4: (lv_declared_variable_0_0= rulevariable )
            // InternalPascalParser.g:1193:5: lv_declared_variable_0_0= rulevariable
            {

            					newCompositeNode(grammarAccess.getAssignment_statementAccess().getDeclared_variableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_declared_variable_0_0=rulevariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
            					}
            					set(
            						current,
            						"declared_variable",
            						lv_declared_variable_0_0,
            						"org.xtext.compiler.pascal.Pascal.variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ASSIGN_1=(Token)match(input,RULE_ASSIGN,FOLLOW_18); 

            			newLeafNode(this_ASSIGN_1, grammarAccess.getAssignment_statementAccess().getASSIGNTerminalRuleCall_1());
            		
            // InternalPascalParser.g:1214:3: ( (lv_expression_2_0= ruleexpression ) )
            // InternalPascalParser.g:1215:4: (lv_expression_2_0= ruleexpression )
            {
            // InternalPascalParser.g:1215:4: (lv_expression_2_0= ruleexpression )
            // InternalPascalParser.g:1216:5: lv_expression_2_0= ruleexpression
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
    // InternalPascalParser.g:1237:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalPascalParser.g:1237:49: (iv_rulevariable= rulevariable EOF )
            // InternalPascalParser.g:1238:2: iv_rulevariable= rulevariable EOF
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
    // InternalPascalParser.g:1244:1: rulevariable returns [EObject current=null] : ( ( (otherlv_0= CommercialAt ( (lv_variable_id_1_0= RULE_ID ) ) ) | ( (lv_variable_id_2_0= RULE_ID ) ) ) ( (otherlv_3= LeftSquareBracket ( (lv_indice_4_0= ruleexpression ) ) (otherlv_5= Comma ( (lv_indice_6_0= ruleexpression ) ) )* otherlv_7= RightSquareBracket ) | (otherlv_8= LeftParenthesisFullStop ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= Comma ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= FullStopRightParenthesis ) | (otherlv_13= FullStop ( (lv_names_exp_14_0= RULE_ID ) ) ) | otherlv_15= CircumflexAccent )* ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_id_1_0=null;
        Token lv_variable_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_names_exp_14_0=null;
        Token otherlv_15=null;
        EObject lv_indice_4_0 = null;

        EObject lv_indice_6_0 = null;

        EObject lv_expression_9_0 = null;

        EObject lv_expression_11_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:1250:2: ( ( ( (otherlv_0= CommercialAt ( (lv_variable_id_1_0= RULE_ID ) ) ) | ( (lv_variable_id_2_0= RULE_ID ) ) ) ( (otherlv_3= LeftSquareBracket ( (lv_indice_4_0= ruleexpression ) ) (otherlv_5= Comma ( (lv_indice_6_0= ruleexpression ) ) )* otherlv_7= RightSquareBracket ) | (otherlv_8= LeftParenthesisFullStop ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= Comma ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= FullStopRightParenthesis ) | (otherlv_13= FullStop ( (lv_names_exp_14_0= RULE_ID ) ) ) | otherlv_15= CircumflexAccent )* ) )
            // InternalPascalParser.g:1251:2: ( ( (otherlv_0= CommercialAt ( (lv_variable_id_1_0= RULE_ID ) ) ) | ( (lv_variable_id_2_0= RULE_ID ) ) ) ( (otherlv_3= LeftSquareBracket ( (lv_indice_4_0= ruleexpression ) ) (otherlv_5= Comma ( (lv_indice_6_0= ruleexpression ) ) )* otherlv_7= RightSquareBracket ) | (otherlv_8= LeftParenthesisFullStop ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= Comma ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= FullStopRightParenthesis ) | (otherlv_13= FullStop ( (lv_names_exp_14_0= RULE_ID ) ) ) | otherlv_15= CircumflexAccent )* )
            {
            // InternalPascalParser.g:1251:2: ( ( (otherlv_0= CommercialAt ( (lv_variable_id_1_0= RULE_ID ) ) ) | ( (lv_variable_id_2_0= RULE_ID ) ) ) ( (otherlv_3= LeftSquareBracket ( (lv_indice_4_0= ruleexpression ) ) (otherlv_5= Comma ( (lv_indice_6_0= ruleexpression ) ) )* otherlv_7= RightSquareBracket ) | (otherlv_8= LeftParenthesisFullStop ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= Comma ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= FullStopRightParenthesis ) | (otherlv_13= FullStop ( (lv_names_exp_14_0= RULE_ID ) ) ) | otherlv_15= CircumflexAccent )* )
            // InternalPascalParser.g:1252:3: ( (otherlv_0= CommercialAt ( (lv_variable_id_1_0= RULE_ID ) ) ) | ( (lv_variable_id_2_0= RULE_ID ) ) ) ( (otherlv_3= LeftSquareBracket ( (lv_indice_4_0= ruleexpression ) ) (otherlv_5= Comma ( (lv_indice_6_0= ruleexpression ) ) )* otherlv_7= RightSquareBracket ) | (otherlv_8= LeftParenthesisFullStop ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= Comma ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= FullStopRightParenthesis ) | (otherlv_13= FullStop ( (lv_names_exp_14_0= RULE_ID ) ) ) | otherlv_15= CircumflexAccent )*
            {
            // InternalPascalParser.g:1252:3: ( (otherlv_0= CommercialAt ( (lv_variable_id_1_0= RULE_ID ) ) ) | ( (lv_variable_id_2_0= RULE_ID ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==CommercialAt) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPascalParser.g:1253:4: (otherlv_0= CommercialAt ( (lv_variable_id_1_0= RULE_ID ) ) )
                    {
                    // InternalPascalParser.g:1253:4: (otherlv_0= CommercialAt ( (lv_variable_id_1_0= RULE_ID ) ) )
                    // InternalPascalParser.g:1254:5: otherlv_0= CommercialAt ( (lv_variable_id_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,CommercialAt,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getCommercialAtKeyword_0_0_0());
                    				
                    // InternalPascalParser.g:1258:5: ( (lv_variable_id_1_0= RULE_ID ) )
                    // InternalPascalParser.g:1259:6: (lv_variable_id_1_0= RULE_ID )
                    {
                    // InternalPascalParser.g:1259:6: (lv_variable_id_1_0= RULE_ID )
                    // InternalPascalParser.g:1260:7: lv_variable_id_1_0= RULE_ID
                    {
                    lv_variable_id_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    							newLeafNode(lv_variable_id_1_0, grammarAccess.getVariableAccess().getVariable_idIDTerminalRuleCall_0_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getVariableRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"variable_id",
                    								lv_variable_id_1_0,
                    								"org.xtext.compiler.pascal.Pascal.ID");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1278:4: ( (lv_variable_id_2_0= RULE_ID ) )
                    {
                    // InternalPascalParser.g:1278:4: ( (lv_variable_id_2_0= RULE_ID ) )
                    // InternalPascalParser.g:1279:5: (lv_variable_id_2_0= RULE_ID )
                    {
                    // InternalPascalParser.g:1279:5: (lv_variable_id_2_0= RULE_ID )
                    // InternalPascalParser.g:1280:6: lv_variable_id_2_0= RULE_ID
                    {
                    lv_variable_id_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_variable_id_2_0, grammarAccess.getVariableAccess().getVariable_idIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"variable_id",
                    							lv_variable_id_2_0,
                    							"org.xtext.compiler.pascal.Pascal.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPascalParser.g:1297:3: ( (otherlv_3= LeftSquareBracket ( (lv_indice_4_0= ruleexpression ) ) (otherlv_5= Comma ( (lv_indice_6_0= ruleexpression ) ) )* otherlv_7= RightSquareBracket ) | (otherlv_8= LeftParenthesisFullStop ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= Comma ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= FullStopRightParenthesis ) | (otherlv_13= FullStop ( (lv_names_exp_14_0= RULE_ID ) ) ) | otherlv_15= CircumflexAccent )*
            loop14:
            do {
                int alt14=5;
                switch ( input.LA(1) ) {
                case LeftSquareBracket:
                    {
                    alt14=1;
                    }
                    break;
                case LeftParenthesisFullStop:
                    {
                    alt14=2;
                    }
                    break;
                case FullStop:
                    {
                    alt14=3;
                    }
                    break;
                case CircumflexAccent:
                    {
                    alt14=4;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // InternalPascalParser.g:1298:4: (otherlv_3= LeftSquareBracket ( (lv_indice_4_0= ruleexpression ) ) (otherlv_5= Comma ( (lv_indice_6_0= ruleexpression ) ) )* otherlv_7= RightSquareBracket )
            	    {
            	    // InternalPascalParser.g:1298:4: (otherlv_3= LeftSquareBracket ( (lv_indice_4_0= ruleexpression ) ) (otherlv_5= Comma ( (lv_indice_6_0= ruleexpression ) ) )* otherlv_7= RightSquareBracket )
            	    // InternalPascalParser.g:1299:5: otherlv_3= LeftSquareBracket ( (lv_indice_4_0= ruleexpression ) ) (otherlv_5= Comma ( (lv_indice_6_0= ruleexpression ) ) )* otherlv_7= RightSquareBracket
            	    {
            	    otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_18); 

            	    					newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_1_0_0());
            	    				
            	    // InternalPascalParser.g:1303:5: ( (lv_indice_4_0= ruleexpression ) )
            	    // InternalPascalParser.g:1304:6: (lv_indice_4_0= ruleexpression )
            	    {
            	    // InternalPascalParser.g:1304:6: (lv_indice_4_0= ruleexpression )
            	    // InternalPascalParser.g:1305:7: lv_indice_4_0= ruleexpression
            	    {

            	    							newCompositeNode(grammarAccess.getVariableAccess().getIndiceExpressionParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_20);
            	    lv_indice_4_0=ruleexpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVariableRule());
            	    							}
            	    							add(
            	    								current,
            	    								"indice",
            	    								lv_indice_4_0,
            	    								"org.xtext.compiler.pascal.Pascal.expression");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalPascalParser.g:1322:5: (otherlv_5= Comma ( (lv_indice_6_0= ruleexpression ) ) )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==Comma) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalPascalParser.g:1323:6: otherlv_5= Comma ( (lv_indice_6_0= ruleexpression ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,Comma,FOLLOW_18); 

            	    	    						newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getCommaKeyword_1_0_2_0());
            	    	    					
            	    	    // InternalPascalParser.g:1327:6: ( (lv_indice_6_0= ruleexpression ) )
            	    	    // InternalPascalParser.g:1328:7: (lv_indice_6_0= ruleexpression )
            	    	    {
            	    	    // InternalPascalParser.g:1328:7: (lv_indice_6_0= ruleexpression )
            	    	    // InternalPascalParser.g:1329:8: lv_indice_6_0= ruleexpression
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getVariableAccess().getIndiceExpressionParserRuleCall_1_0_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_20);
            	    	    lv_indice_6_0=ruleexpression();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getVariableRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"indice",
            	    	    									lv_indice_6_0,
            	    	    									"org.xtext.compiler.pascal.Pascal.expression");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);

            	    otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_19); 

            	    					newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getRightSquareBracketKeyword_1_0_3());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPascalParser.g:1353:4: (otherlv_8= LeftParenthesisFullStop ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= Comma ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= FullStopRightParenthesis )
            	    {
            	    // InternalPascalParser.g:1353:4: (otherlv_8= LeftParenthesisFullStop ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= Comma ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= FullStopRightParenthesis )
            	    // InternalPascalParser.g:1354:5: otherlv_8= LeftParenthesisFullStop ( (lv_expression_9_0= ruleexpression ) ) (otherlv_10= Comma ( (lv_expression_11_0= ruleexpression ) ) )* otherlv_12= FullStopRightParenthesis
            	    {
            	    otherlv_8=(Token)match(input,LeftParenthesisFullStop,FOLLOW_18); 

            	    					newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getLeftParenthesisFullStopKeyword_1_1_0());
            	    				
            	    // InternalPascalParser.g:1358:5: ( (lv_expression_9_0= ruleexpression ) )
            	    // InternalPascalParser.g:1359:6: (lv_expression_9_0= ruleexpression )
            	    {
            	    // InternalPascalParser.g:1359:6: (lv_expression_9_0= ruleexpression )
            	    // InternalPascalParser.g:1360:7: lv_expression_9_0= ruleexpression
            	    {

            	    							newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_21);
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

            	    // InternalPascalParser.g:1377:5: (otherlv_10= Comma ( (lv_expression_11_0= ruleexpression ) ) )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==Comma) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalPascalParser.g:1378:6: otherlv_10= Comma ( (lv_expression_11_0= ruleexpression ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,Comma,FOLLOW_18); 

            	    	    						newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getCommaKeyword_1_1_2_0());
            	    	    					
            	    	    // InternalPascalParser.g:1382:6: ( (lv_expression_11_0= ruleexpression ) )
            	    	    // InternalPascalParser.g:1383:7: (lv_expression_11_0= ruleexpression )
            	    	    {
            	    	    // InternalPascalParser.g:1383:7: (lv_expression_11_0= ruleexpression )
            	    	    // InternalPascalParser.g:1384:8: lv_expression_11_0= ruleexpression
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_1_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_21);
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
            	    	    break loop13;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,FullStopRightParenthesis,FOLLOW_19); 

            	    					newLeafNode(otherlv_12, grammarAccess.getVariableAccess().getFullStopRightParenthesisKeyword_1_1_3());
            	    				

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPascalParser.g:1408:4: (otherlv_13= FullStop ( (lv_names_exp_14_0= RULE_ID ) ) )
            	    {
            	    // InternalPascalParser.g:1408:4: (otherlv_13= FullStop ( (lv_names_exp_14_0= RULE_ID ) ) )
            	    // InternalPascalParser.g:1409:5: otherlv_13= FullStop ( (lv_names_exp_14_0= RULE_ID ) )
            	    {
            	    otherlv_13=(Token)match(input,FullStop,FOLLOW_5); 

            	    					newLeafNode(otherlv_13, grammarAccess.getVariableAccess().getFullStopKeyword_1_2_0());
            	    				
            	    // InternalPascalParser.g:1413:5: ( (lv_names_exp_14_0= RULE_ID ) )
            	    // InternalPascalParser.g:1414:6: (lv_names_exp_14_0= RULE_ID )
            	    {
            	    // InternalPascalParser.g:1414:6: (lv_names_exp_14_0= RULE_ID )
            	    // InternalPascalParser.g:1415:7: lv_names_exp_14_0= RULE_ID
            	    {
            	    lv_names_exp_14_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    							newLeafNode(lv_names_exp_14_0, grammarAccess.getVariableAccess().getNames_expIDTerminalRuleCall_1_2_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getVariableRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"names_exp",
            	    								lv_names_exp_14_0,
            	    								"org.xtext.compiler.pascal.Pascal.ID");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPascalParser.g:1433:4: otherlv_15= CircumflexAccent
            	    {
            	    otherlv_15=(Token)match(input,CircumflexAccent,FOLLOW_19); 

            	    				newLeafNode(otherlv_15, grammarAccess.getVariableAccess().getCircumflexAccentKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalPascalParser.g:1442:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascalParser.g:1442:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascalParser.g:1443:2: iv_ruleexpression= ruleexpression EOF
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
    // InternalPascalParser.g:1449:1: ruleexpression returns [EObject current=null] : ( (lv_simple_0_0= rulesimple_expression ) ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:1455:2: ( ( (lv_simple_0_0= rulesimple_expression ) ) )
            // InternalPascalParser.g:1456:2: ( (lv_simple_0_0= rulesimple_expression ) )
            {
            // InternalPascalParser.g:1456:2: ( (lv_simple_0_0= rulesimple_expression ) )
            // InternalPascalParser.g:1457:3: (lv_simple_0_0= rulesimple_expression )
            {
            // InternalPascalParser.g:1457:3: (lv_simple_0_0= rulesimple_expression )
            // InternalPascalParser.g:1458:4: lv_simple_0_0= rulesimple_expression
            {

            				newCompositeNode(grammarAccess.getExpressionAccess().getSimpleSimple_expressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_simple_0_0=rulesimple_expression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getExpressionRule());
            				}
            				set(
            					current,
            					"simple",
            					lv_simple_0_0,
            					"org.xtext.compiler.pascal.Pascal.simple_expression");
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
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesimple_expression"
    // InternalPascalParser.g:1478:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;


        try {
            // InternalPascalParser.g:1478:58: (iv_rulesimple_expression= rulesimple_expression EOF )
            // InternalPascalParser.g:1479:2: iv_rulesimple_expression= rulesimple_expression EOF
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
    // InternalPascalParser.g:1485:1: rulesimple_expression returns [EObject current=null] : ( ( (lv_term_exp_0_0= ruleterm ) ) ( ( (lv_operator_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )? ) ;
    public final EObject rulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject lv_term_exp_0_0 = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:1491:2: ( ( ( (lv_term_exp_0_0= ruleterm ) ) ( ( (lv_operator_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )? ) )
            // InternalPascalParser.g:1492:2: ( ( (lv_term_exp_0_0= ruleterm ) ) ( ( (lv_operator_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )? )
            {
            // InternalPascalParser.g:1492:2: ( ( (lv_term_exp_0_0= ruleterm ) ) ( ( (lv_operator_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )? )
            // InternalPascalParser.g:1493:3: ( (lv_term_exp_0_0= ruleterm ) ) ( ( (lv_operator_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )?
            {
            // InternalPascalParser.g:1493:3: ( (lv_term_exp_0_0= ruleterm ) )
            // InternalPascalParser.g:1494:4: (lv_term_exp_0_0= ruleterm )
            {
            // InternalPascalParser.g:1494:4: (lv_term_exp_0_0= ruleterm )
            // InternalPascalParser.g:1495:5: lv_term_exp_0_0= ruleterm
            {

            					newCompositeNode(grammarAccess.getSimple_expressionAccess().getTerm_expTermParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_term_exp_0_0=ruleterm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            					}
            					set(
            						current,
            						"term_exp",
            						lv_term_exp_0_0,
            						"org.xtext.compiler.pascal.Pascal.term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascalParser.g:1512:3: ( ( (lv_operator_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_PLUS && LA15_0<=RULE_MINUS)||LA15_0==RULE_OR) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPascalParser.g:1513:4: ( (lv_operator_1_0= ruleadditive_operator ) ) ( (lv_expression_2_0= rulesimple_expression ) )
                    {
                    // InternalPascalParser.g:1513:4: ( (lv_operator_1_0= ruleadditive_operator ) )
                    // InternalPascalParser.g:1514:5: (lv_operator_1_0= ruleadditive_operator )
                    {
                    // InternalPascalParser.g:1514:5: (lv_operator_1_0= ruleadditive_operator )
                    // InternalPascalParser.g:1515:6: lv_operator_1_0= ruleadditive_operator
                    {

                    						newCompositeNode(grammarAccess.getSimple_expressionAccess().getOperatorAdditive_operatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_operator_1_0=ruleadditive_operator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_1_0,
                    							"org.xtext.compiler.pascal.Pascal.additive_operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascalParser.g:1532:4: ( (lv_expression_2_0= rulesimple_expression ) )
                    // InternalPascalParser.g:1533:5: (lv_expression_2_0= rulesimple_expression )
                    {
                    // InternalPascalParser.g:1533:5: (lv_expression_2_0= rulesimple_expression )
                    // InternalPascalParser.g:1534:6: lv_expression_2_0= rulesimple_expression
                    {

                    						newCompositeNode(grammarAccess.getSimple_expressionAccess().getExpressionSimple_expressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=rulesimple_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
                    						}
                    						set(
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
    // InternalPascalParser.g:1556:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalPascalParser.g:1556:45: (iv_ruleterm= ruleterm EOF )
            // InternalPascalParser.g:1557:2: iv_ruleterm= ruleterm EOF
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
    // InternalPascalParser.g:1563:1: ruleterm returns [EObject current=null] : ( ( (lv_factor_0_0= rulesigned_factor ) ) ( ( (lv_operator_1_0= rulemultiplicative_operator ) ) ( (lv_term2_2_0= ruleterm ) ) )? ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        EObject lv_factor_0_0 = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_term2_2_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:1569:2: ( ( ( (lv_factor_0_0= rulesigned_factor ) ) ( ( (lv_operator_1_0= rulemultiplicative_operator ) ) ( (lv_term2_2_0= ruleterm ) ) )? ) )
            // InternalPascalParser.g:1570:2: ( ( (lv_factor_0_0= rulesigned_factor ) ) ( ( (lv_operator_1_0= rulemultiplicative_operator ) ) ( (lv_term2_2_0= ruleterm ) ) )? )
            {
            // InternalPascalParser.g:1570:2: ( ( (lv_factor_0_0= rulesigned_factor ) ) ( ( (lv_operator_1_0= rulemultiplicative_operator ) ) ( (lv_term2_2_0= ruleterm ) ) )? )
            // InternalPascalParser.g:1571:3: ( (lv_factor_0_0= rulesigned_factor ) ) ( ( (lv_operator_1_0= rulemultiplicative_operator ) ) ( (lv_term2_2_0= ruleterm ) ) )?
            {
            // InternalPascalParser.g:1571:3: ( (lv_factor_0_0= rulesigned_factor ) )
            // InternalPascalParser.g:1572:4: (lv_factor_0_0= rulesigned_factor )
            {
            // InternalPascalParser.g:1572:4: (lv_factor_0_0= rulesigned_factor )
            // InternalPascalParser.g:1573:5: lv_factor_0_0= rulesigned_factor
            {

            					newCompositeNode(grammarAccess.getTermAccess().getFactorSigned_factorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_factor_0_0=rulesigned_factor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermRule());
            					}
            					set(
            						current,
            						"factor",
            						lv_factor_0_0,
            						"org.xtext.compiler.pascal.Pascal.signed_factor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascalParser.g:1590:3: ( ( (lv_operator_1_0= rulemultiplicative_operator ) ) ( (lv_term2_2_0= ruleterm ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STAR && LA16_0<=RULE_MOD)||LA16_0==RULE_AND) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPascalParser.g:1591:4: ( (lv_operator_1_0= rulemultiplicative_operator ) ) ( (lv_term2_2_0= ruleterm ) )
                    {
                    // InternalPascalParser.g:1591:4: ( (lv_operator_1_0= rulemultiplicative_operator ) )
                    // InternalPascalParser.g:1592:5: (lv_operator_1_0= rulemultiplicative_operator )
                    {
                    // InternalPascalParser.g:1592:5: (lv_operator_1_0= rulemultiplicative_operator )
                    // InternalPascalParser.g:1593:6: lv_operator_1_0= rulemultiplicative_operator
                    {

                    						newCompositeNode(grammarAccess.getTermAccess().getOperatorMultiplicative_operatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_operator_1_0=rulemultiplicative_operator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTermRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_1_0,
                    							"org.xtext.compiler.pascal.Pascal.multiplicative_operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPascalParser.g:1610:4: ( (lv_term2_2_0= ruleterm ) )
                    // InternalPascalParser.g:1611:5: (lv_term2_2_0= ruleterm )
                    {
                    // InternalPascalParser.g:1611:5: (lv_term2_2_0= ruleterm )
                    // InternalPascalParser.g:1612:6: lv_term2_2_0= ruleterm
                    {

                    						newCompositeNode(grammarAccess.getTermAccess().getTerm2TermParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_term2_2_0=ruleterm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTermRule());
                    						}
                    						set(
                    							current,
                    							"term2",
                    							lv_term2_2_0,
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
    // InternalPascalParser.g:1634:1: entryRulesigned_factor returns [EObject current=null] : iv_rulesigned_factor= rulesigned_factor EOF ;
    public final EObject entryRulesigned_factor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigned_factor = null;


        try {
            // InternalPascalParser.g:1634:54: (iv_rulesigned_factor= rulesigned_factor EOF )
            // InternalPascalParser.g:1635:2: iv_rulesigned_factor= rulesigned_factor EOF
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
    // InternalPascalParser.g:1641:1: rulesigned_factor returns [EObject current=null] : ( ( ( (lv_signal_0_0= RULE_PLUS ) ) | ( (lv_signal_1_0= RULE_MINUS ) ) )? ( (lv_factor_2_0= rulefactor ) ) ) ;
    public final EObject rulesigned_factor() throws RecognitionException {
        EObject current = null;

        Token lv_signal_0_0=null;
        Token lv_signal_1_0=null;
        EObject lv_factor_2_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:1647:2: ( ( ( ( (lv_signal_0_0= RULE_PLUS ) ) | ( (lv_signal_1_0= RULE_MINUS ) ) )? ( (lv_factor_2_0= rulefactor ) ) ) )
            // InternalPascalParser.g:1648:2: ( ( ( (lv_signal_0_0= RULE_PLUS ) ) | ( (lv_signal_1_0= RULE_MINUS ) ) )? ( (lv_factor_2_0= rulefactor ) ) )
            {
            // InternalPascalParser.g:1648:2: ( ( ( (lv_signal_0_0= RULE_PLUS ) ) | ( (lv_signal_1_0= RULE_MINUS ) ) )? ( (lv_factor_2_0= rulefactor ) ) )
            // InternalPascalParser.g:1649:3: ( ( (lv_signal_0_0= RULE_PLUS ) ) | ( (lv_signal_1_0= RULE_MINUS ) ) )? ( (lv_factor_2_0= rulefactor ) )
            {
            // InternalPascalParser.g:1649:3: ( ( (lv_signal_0_0= RULE_PLUS ) ) | ( (lv_signal_1_0= RULE_MINUS ) ) )?
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_PLUS) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_MINUS) ) {
                alt17=2;
            }
            switch (alt17) {
                case 1 :
                    // InternalPascalParser.g:1650:4: ( (lv_signal_0_0= RULE_PLUS ) )
                    {
                    // InternalPascalParser.g:1650:4: ( (lv_signal_0_0= RULE_PLUS ) )
                    // InternalPascalParser.g:1651:5: (lv_signal_0_0= RULE_PLUS )
                    {
                    // InternalPascalParser.g:1651:5: (lv_signal_0_0= RULE_PLUS )
                    // InternalPascalParser.g:1652:6: lv_signal_0_0= RULE_PLUS
                    {
                    lv_signal_0_0=(Token)match(input,RULE_PLUS,FOLLOW_18); 

                    						newLeafNode(lv_signal_0_0, grammarAccess.getSigned_factorAccess().getSignalPLUSTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSigned_factorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"signal",
                    							lv_signal_0_0,
                    							"org.xtext.compiler.pascal.Pascal.PLUS");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1669:4: ( (lv_signal_1_0= RULE_MINUS ) )
                    {
                    // InternalPascalParser.g:1669:4: ( (lv_signal_1_0= RULE_MINUS ) )
                    // InternalPascalParser.g:1670:5: (lv_signal_1_0= RULE_MINUS )
                    {
                    // InternalPascalParser.g:1670:5: (lv_signal_1_0= RULE_MINUS )
                    // InternalPascalParser.g:1671:6: lv_signal_1_0= RULE_MINUS
                    {
                    lv_signal_1_0=(Token)match(input,RULE_MINUS,FOLLOW_18); 

                    						newLeafNode(lv_signal_1_0, grammarAccess.getSigned_factorAccess().getSignalMINUSTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSigned_factorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"signal",
                    							lv_signal_1_0,
                    							"org.xtext.compiler.pascal.Pascal.MINUS");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPascalParser.g:1688:3: ( (lv_factor_2_0= rulefactor ) )
            // InternalPascalParser.g:1689:4: (lv_factor_2_0= rulefactor )
            {
            // InternalPascalParser.g:1689:4: (lv_factor_2_0= rulefactor )
            // InternalPascalParser.g:1690:5: lv_factor_2_0= rulefactor
            {

            					newCompositeNode(grammarAccess.getSigned_factorAccess().getFactorFactorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_factor_2_0=rulefactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSigned_factorRule());
            					}
            					set(
            						current,
            						"factor",
            						lv_factor_2_0,
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
    // InternalPascalParser.g:1711:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // InternalPascalParser.g:1711:47: (iv_rulefactor= rulefactor EOF )
            // InternalPascalParser.g:1712:2: iv_rulefactor= rulefactor EOF
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
    // InternalPascalParser.g:1718:1: rulefactor returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= RightParenthesis ) | ( (lv_function_4_0= rulefunction_designator ) ) | ( (lv_constant_5_0= ruleunsigned_constant ) ) | (this_NOT_6= RULE_NOT ( (lv_not_factor_7_0= rulefactor ) ) ) | ( (lv_bool_factor_8_0= rulebool ) ) ) ;
    public final EObject rulefactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_NOT_6=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;

        EObject lv_function_4_0 = null;

        EObject lv_constant_5_0 = null;

        EObject lv_not_factor_7_0 = null;

        AntlrDatatypeRuleToken lv_bool_factor_8_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:1724:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= RightParenthesis ) | ( (lv_function_4_0= rulefunction_designator ) ) | ( (lv_constant_5_0= ruleunsigned_constant ) ) | (this_NOT_6= RULE_NOT ( (lv_not_factor_7_0= rulefactor ) ) ) | ( (lv_bool_factor_8_0= rulebool ) ) ) )
            // InternalPascalParser.g:1725:2: ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= RightParenthesis ) | ( (lv_function_4_0= rulefunction_designator ) ) | ( (lv_constant_5_0= ruleunsigned_constant ) ) | (this_NOT_6= RULE_NOT ( (lv_not_factor_7_0= rulefactor ) ) ) | ( (lv_bool_factor_8_0= rulebool ) ) )
            {
            // InternalPascalParser.g:1725:2: ( ( (lv_variable_0_0= rulevariable ) ) | (otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= RightParenthesis ) | ( (lv_function_4_0= rulefunction_designator ) ) | ( (lv_constant_5_0= ruleunsigned_constant ) ) | (this_NOT_6= RULE_NOT ( (lv_not_factor_7_0= rulefactor ) ) ) | ( (lv_bool_factor_8_0= rulebool ) ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case CommercialAt:
                {
                alt18=1;
                }
                break;
            case RULE_ID:
                {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==EOF||LA18_2==Else||LA18_2==End||(LA18_2>=LeftParenthesisFullStop && LA18_2<=Of)||(LA18_2>=RightParenthesis && LA18_2<=FullStop)||LA18_2==Semicolon||(LA18_2>=LeftSquareBracket && LA18_2<=CircumflexAccent)||(LA18_2>=RULE_STAR && LA18_2<=RULE_OR)) ) {
                    alt18=1;
                }
                else if ( (LA18_2==LeftParenthesis) ) {
                    alt18=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
                }
                break;
            case LeftParenthesis:
                {
                alt18=2;
                }
                break;
            case RULE_NIL:
            case RULE_NUM_INT:
            case RULE_STRING:
                {
                alt18=4;
                }
                break;
            case RULE_NOT:
                {
                alt18=5;
                }
                break;
            case False:
            case True:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalPascalParser.g:1726:3: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // InternalPascalParser.g:1726:3: ( (lv_variable_0_0= rulevariable ) )
                    // InternalPascalParser.g:1727:4: (lv_variable_0_0= rulevariable )
                    {
                    // InternalPascalParser.g:1727:4: (lv_variable_0_0= rulevariable )
                    // InternalPascalParser.g:1728:5: lv_variable_0_0= rulevariable
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
                    // InternalPascalParser.g:1746:3: (otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= RightParenthesis )
                    {
                    // InternalPascalParser.g:1746:3: (otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= RightParenthesis )
                    // InternalPascalParser.g:1747:4: otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleexpression ) ) otherlv_3= RightParenthesis
                    {
                    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalPascalParser.g:1751:4: ( (lv_expression_2_0= ruleexpression ) )
                    // InternalPascalParser.g:1752:5: (lv_expression_2_0= ruleexpression )
                    {
                    // InternalPascalParser.g:1752:5: (lv_expression_2_0= ruleexpression )
                    // InternalPascalParser.g:1753:6: lv_expression_2_0= ruleexpression
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_24);
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

                    otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPascalParser.g:1776:3: ( (lv_function_4_0= rulefunction_designator ) )
                    {
                    // InternalPascalParser.g:1776:3: ( (lv_function_4_0= rulefunction_designator ) )
                    // InternalPascalParser.g:1777:4: (lv_function_4_0= rulefunction_designator )
                    {
                    // InternalPascalParser.g:1777:4: (lv_function_4_0= rulefunction_designator )
                    // InternalPascalParser.g:1778:5: lv_function_4_0= rulefunction_designator
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_function_4_0=rulefunction_designator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"function",
                    						lv_function_4_0,
                    						"org.xtext.compiler.pascal.Pascal.function_designator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascalParser.g:1796:3: ( (lv_constant_5_0= ruleunsigned_constant ) )
                    {
                    // InternalPascalParser.g:1796:3: ( (lv_constant_5_0= ruleunsigned_constant ) )
                    // InternalPascalParser.g:1797:4: (lv_constant_5_0= ruleunsigned_constant )
                    {
                    // InternalPascalParser.g:1797:4: (lv_constant_5_0= ruleunsigned_constant )
                    // InternalPascalParser.g:1798:5: lv_constant_5_0= ruleunsigned_constant
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getConstantUnsigned_constantParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_constant_5_0=ruleunsigned_constant();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"constant",
                    						lv_constant_5_0,
                    						"org.xtext.compiler.pascal.Pascal.unsigned_constant");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascalParser.g:1816:3: (this_NOT_6= RULE_NOT ( (lv_not_factor_7_0= rulefactor ) ) )
                    {
                    // InternalPascalParser.g:1816:3: (this_NOT_6= RULE_NOT ( (lv_not_factor_7_0= rulefactor ) ) )
                    // InternalPascalParser.g:1817:4: this_NOT_6= RULE_NOT ( (lv_not_factor_7_0= rulefactor ) )
                    {
                    this_NOT_6=(Token)match(input,RULE_NOT,FOLLOW_18); 

                    				newLeafNode(this_NOT_6, grammarAccess.getFactorAccess().getNOTTerminalRuleCall_4_0());
                    			
                    // InternalPascalParser.g:1821:4: ( (lv_not_factor_7_0= rulefactor ) )
                    // InternalPascalParser.g:1822:5: (lv_not_factor_7_0= rulefactor )
                    {
                    // InternalPascalParser.g:1822:5: (lv_not_factor_7_0= rulefactor )
                    // InternalPascalParser.g:1823:6: lv_not_factor_7_0= rulefactor
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getNot_factorFactorParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_not_factor_7_0=rulefactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"not_factor",
                    							lv_not_factor_7_0,
                    							"org.xtext.compiler.pascal.Pascal.factor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPascalParser.g:1842:3: ( (lv_bool_factor_8_0= rulebool ) )
                    {
                    // InternalPascalParser.g:1842:3: ( (lv_bool_factor_8_0= rulebool ) )
                    // InternalPascalParser.g:1843:4: (lv_bool_factor_8_0= rulebool )
                    {
                    // InternalPascalParser.g:1843:4: (lv_bool_factor_8_0= rulebool )
                    // InternalPascalParser.g:1844:5: lv_bool_factor_8_0= rulebool
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getBool_factorBoolParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_bool_factor_8_0=rulebool();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"bool_factor",
                    						lv_bool_factor_8_0,
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


    // $ANTLR start "entryRuletype"
    // InternalPascalParser.g:1865:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // InternalPascalParser.g:1865:45: (iv_ruletype= ruletype EOF )
            // InternalPascalParser.g:1866:2: iv_ruletype= ruletype EOF
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
    // InternalPascalParser.g:1872:1: ruletype returns [EObject current=null] : ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_structured_1_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:1878:2: ( ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) ) )
            // InternalPascalParser.g:1879:2: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) )
            {
            // InternalPascalParser.g:1879:2: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=Boolean && LA19_0<=Integer)||LA19_0==String||LA19_0==False||LA19_0==True||(LA19_0>=RULE_PLUS && LA19_0<=RULE_MINUS)||LA19_0==RULE_NUM_INT||(LA19_0>=RULE_ID && LA19_0<=RULE_STRING)) ) {
                alt19=1;
            }
            else if ( (LA19_0==Array) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalPascalParser.g:1880:3: ( (lv_simple_0_0= rulesimple_type ) )
                    {
                    // InternalPascalParser.g:1880:3: ( (lv_simple_0_0= rulesimple_type ) )
                    // InternalPascalParser.g:1881:4: (lv_simple_0_0= rulesimple_type )
                    {
                    // InternalPascalParser.g:1881:4: (lv_simple_0_0= rulesimple_type )
                    // InternalPascalParser.g:1882:5: lv_simple_0_0= rulesimple_type
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getSimpleSimple_typeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_simple_0_0=rulesimple_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"simple",
                    						lv_simple_0_0,
                    						"org.xtext.compiler.pascal.Pascal.simple_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1900:3: ( (lv_structured_1_0= rulestructured_type ) )
                    {
                    // InternalPascalParser.g:1900:3: ( (lv_structured_1_0= rulestructured_type ) )
                    // InternalPascalParser.g:1901:4: (lv_structured_1_0= rulestructured_type )
                    {
                    // InternalPascalParser.g:1901:4: (lv_structured_1_0= rulestructured_type )
                    // InternalPascalParser.g:1902:5: lv_structured_1_0= rulestructured_type
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getStructuredStructured_typeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_structured_1_0=rulestructured_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"structured",
                    						lv_structured_1_0,
                    						"org.xtext.compiler.pascal.Pascal.structured_type");
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
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulesimple_type"
    // InternalPascalParser.g:1923:1: entryRulesimple_type returns [EObject current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final EObject entryRulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type = null;


        try {
            // InternalPascalParser.g:1923:52: (iv_rulesimple_type= rulesimple_type EOF )
            // InternalPascalParser.g:1924:2: iv_rulesimple_type= rulesimple_type EOF
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
    // InternalPascalParser.g:1930:1: rulesimple_type returns [EObject current=null] : ( ( (lv_type_0_0= ruletype_identifier ) ) | ( (lv_subrange_type_1_0= rulesubrange_type ) ) ) ;
    public final EObject rulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;

        EObject lv_subrange_type_1_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:1936:2: ( ( ( (lv_type_0_0= ruletype_identifier ) ) | ( (lv_subrange_type_1_0= rulesubrange_type ) ) ) )
            // InternalPascalParser.g:1937:2: ( ( (lv_type_0_0= ruletype_identifier ) ) | ( (lv_subrange_type_1_0= rulesubrange_type ) ) )
            {
            // InternalPascalParser.g:1937:2: ( ( (lv_type_0_0= ruletype_identifier ) ) | ( (lv_subrange_type_1_0= rulesubrange_type ) ) )
            int alt20=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_DOTDOT) ) {
                    alt20=2;
                }
                else if ( (LA20_1==EOF||LA20_1==Comma||LA20_1==Semicolon||LA20_1==RightSquareBracket) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case Boolean:
            case Integer:
            case String:
                {
                alt20=1;
                }
                break;
            case False:
            case True:
            case RULE_PLUS:
            case RULE_MINUS:
            case RULE_NUM_INT:
            case RULE_STRING:
                {
                alt20=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalPascalParser.g:1938:3: ( (lv_type_0_0= ruletype_identifier ) )
                    {
                    // InternalPascalParser.g:1938:3: ( (lv_type_0_0= ruletype_identifier ) )
                    // InternalPascalParser.g:1939:4: (lv_type_0_0= ruletype_identifier )
                    {
                    // InternalPascalParser.g:1939:4: (lv_type_0_0= ruletype_identifier )
                    // InternalPascalParser.g:1940:5: lv_type_0_0= ruletype_identifier
                    {

                    					newCompositeNode(grammarAccess.getSimple_typeAccess().getTypeType_identifierParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_0=ruletype_identifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_0,
                    						"org.xtext.compiler.pascal.Pascal.type_identifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:1958:3: ( (lv_subrange_type_1_0= rulesubrange_type ) )
                    {
                    // InternalPascalParser.g:1958:3: ( (lv_subrange_type_1_0= rulesubrange_type ) )
                    // InternalPascalParser.g:1959:4: (lv_subrange_type_1_0= rulesubrange_type )
                    {
                    // InternalPascalParser.g:1959:4: (lv_subrange_type_1_0= rulesubrange_type )
                    // InternalPascalParser.g:1960:5: lv_subrange_type_1_0= rulesubrange_type
                    {

                    					newCompositeNode(grammarAccess.getSimple_typeAccess().getSubrange_typeSubrange_typeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subrange_type_1_0=rulesubrange_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    					}
                    					add(
                    						current,
                    						"subrange_type",
                    						lv_subrange_type_1_0,
                    						"org.xtext.compiler.pascal.Pascal.subrange_type");
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


    // $ANTLR start "entryRulesubrange_type"
    // InternalPascalParser.g:1981:1: entryRulesubrange_type returns [EObject current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final EObject entryRulesubrange_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrange_type = null;


        try {
            // InternalPascalParser.g:1981:54: (iv_rulesubrange_type= rulesubrange_type EOF )
            // InternalPascalParser.g:1982:2: iv_rulesubrange_type= rulesubrange_type EOF
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
    // InternalPascalParser.g:1988:1: rulesubrange_type returns [EObject current=null] : ( ( (lv_constantInit_0_0= ruleconstant ) ) this_DOTDOT_1= RULE_DOTDOT ( (lv_constantFinal_2_0= ruleconstant ) ) ) ;
    public final EObject rulesubrange_type() throws RecognitionException {
        EObject current = null;

        Token this_DOTDOT_1=null;
        EObject lv_constantInit_0_0 = null;

        EObject lv_constantFinal_2_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:1994:2: ( ( ( (lv_constantInit_0_0= ruleconstant ) ) this_DOTDOT_1= RULE_DOTDOT ( (lv_constantFinal_2_0= ruleconstant ) ) ) )
            // InternalPascalParser.g:1995:2: ( ( (lv_constantInit_0_0= ruleconstant ) ) this_DOTDOT_1= RULE_DOTDOT ( (lv_constantFinal_2_0= ruleconstant ) ) )
            {
            // InternalPascalParser.g:1995:2: ( ( (lv_constantInit_0_0= ruleconstant ) ) this_DOTDOT_1= RULE_DOTDOT ( (lv_constantFinal_2_0= ruleconstant ) ) )
            // InternalPascalParser.g:1996:3: ( (lv_constantInit_0_0= ruleconstant ) ) this_DOTDOT_1= RULE_DOTDOT ( (lv_constantFinal_2_0= ruleconstant ) )
            {
            // InternalPascalParser.g:1996:3: ( (lv_constantInit_0_0= ruleconstant ) )
            // InternalPascalParser.g:1997:4: (lv_constantInit_0_0= ruleconstant )
            {
            // InternalPascalParser.g:1997:4: (lv_constantInit_0_0= ruleconstant )
            // InternalPascalParser.g:1998:5: lv_constantInit_0_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstantInitConstantParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_constantInit_0_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
            					}
            					set(
            						current,
            						"constantInit",
            						lv_constantInit_0_0,
            						"org.xtext.compiler.pascal.Pascal.constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_DOTDOT_1=(Token)match(input,RULE_DOTDOT,FOLLOW_10); 

            			newLeafNode(this_DOTDOT_1, grammarAccess.getSubrange_typeAccess().getDOTDOTTerminalRuleCall_1());
            		
            // InternalPascalParser.g:2019:3: ( (lv_constantFinal_2_0= ruleconstant ) )
            // InternalPascalParser.g:2020:4: (lv_constantFinal_2_0= ruleconstant )
            {
            // InternalPascalParser.g:2020:4: (lv_constantFinal_2_0= ruleconstant )
            // InternalPascalParser.g:2021:5: lv_constantFinal_2_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstantFinalConstantParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_constantFinal_2_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
            					}
            					set(
            						current,
            						"constantFinal",
            						lv_constantFinal_2_0,
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


    // $ANTLR start "entryRulestructured_type"
    // InternalPascalParser.g:2042:1: entryRulestructured_type returns [EObject current=null] : iv_rulestructured_type= rulestructured_type EOF ;
    public final EObject entryRulestructured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_type = null;


        try {
            // InternalPascalParser.g:2042:56: (iv_rulestructured_type= rulestructured_type EOF )
            // InternalPascalParser.g:2043:2: iv_rulestructured_type= rulestructured_type EOF
            {
             newCompositeNode(grammarAccess.getStructured_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestructured_type=rulestructured_type();

            state._fsp--;

             current =iv_rulestructured_type; 
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
    // $ANTLR end "entryRulestructured_type"


    // $ANTLR start "rulestructured_type"
    // InternalPascalParser.g:2049:1: rulestructured_type returns [EObject current=null] : ( (lv_unpacked_0_0= ruleunpacked_structured_type ) ) ;
    public final EObject rulestructured_type() throws RecognitionException {
        EObject current = null;

        EObject lv_unpacked_0_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:2055:2: ( ( (lv_unpacked_0_0= ruleunpacked_structured_type ) ) )
            // InternalPascalParser.g:2056:2: ( (lv_unpacked_0_0= ruleunpacked_structured_type ) )
            {
            // InternalPascalParser.g:2056:2: ( (lv_unpacked_0_0= ruleunpacked_structured_type ) )
            // InternalPascalParser.g:2057:3: (lv_unpacked_0_0= ruleunpacked_structured_type )
            {
            // InternalPascalParser.g:2057:3: (lv_unpacked_0_0= ruleunpacked_structured_type )
            // InternalPascalParser.g:2058:4: lv_unpacked_0_0= ruleunpacked_structured_type
            {

            				newCompositeNode(grammarAccess.getStructured_typeAccess().getUnpackedUnpacked_structured_typeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_unpacked_0_0=ruleunpacked_structured_type();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStructured_typeRule());
            				}
            				set(
            					current,
            					"unpacked",
            					lv_unpacked_0_0,
            					"org.xtext.compiler.pascal.Pascal.unpacked_structured_type");
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
    // $ANTLR end "rulestructured_type"


    // $ANTLR start "entryRuleunpacked_structured_type"
    // InternalPascalParser.g:2078:1: entryRuleunpacked_structured_type returns [EObject current=null] : iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF ;
    public final EObject entryRuleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_structured_type = null;


        try {
            // InternalPascalParser.g:2078:65: (iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF )
            // InternalPascalParser.g:2079:2: iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_structured_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunpacked_structured_type=ruleunpacked_structured_type();

            state._fsp--;

             current =iv_ruleunpacked_structured_type; 
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
    // $ANTLR end "entryRuleunpacked_structured_type"


    // $ANTLR start "ruleunpacked_structured_type"
    // InternalPascalParser.g:2085:1: ruleunpacked_structured_type returns [EObject current=null] : ( ( (lv_static_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) ) ;
    public final EObject ruleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject lv_static_array_0_0 = null;

        EObject lv_dynamic_1_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:2091:2: ( ( ( (lv_static_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) ) )
            // InternalPascalParser.g:2092:2: ( ( (lv_static_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) )
            {
            // InternalPascalParser.g:2092:2: ( ( (lv_static_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Array) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==Of) ) {
                    alt21=2;
                }
                else if ( (LA21_1==LeftSquareBracket) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPascalParser.g:2093:3: ( (lv_static_array_0_0= rulearray_type ) )
                    {
                    // InternalPascalParser.g:2093:3: ( (lv_static_array_0_0= rulearray_type ) )
                    // InternalPascalParser.g:2094:4: (lv_static_array_0_0= rulearray_type )
                    {
                    // InternalPascalParser.g:2094:4: (lv_static_array_0_0= rulearray_type )
                    // InternalPascalParser.g:2095:5: lv_static_array_0_0= rulearray_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getStatic_arrayArray_typeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_static_array_0_0=rulearray_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"static_array",
                    						lv_static_array_0_0,
                    						"org.xtext.compiler.pascal.Pascal.array_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:2113:3: ( (lv_dynamic_1_0= ruledynamic_array_type ) )
                    {
                    // InternalPascalParser.g:2113:3: ( (lv_dynamic_1_0= ruledynamic_array_type ) )
                    // InternalPascalParser.g:2114:4: (lv_dynamic_1_0= ruledynamic_array_type )
                    {
                    // InternalPascalParser.g:2114:4: (lv_dynamic_1_0= ruledynamic_array_type )
                    // InternalPascalParser.g:2115:5: lv_dynamic_1_0= ruledynamic_array_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getDynamicDynamic_array_typeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dynamic_1_0=ruledynamic_array_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"dynamic",
                    						lv_dynamic_1_0,
                    						"org.xtext.compiler.pascal.Pascal.dynamic_array_type");
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
    // $ANTLR end "ruleunpacked_structured_type"


    // $ANTLR start "entryRuledynamic_array_type"
    // InternalPascalParser.g:2136:1: entryRuledynamic_array_type returns [EObject current=null] : iv_ruledynamic_array_type= ruledynamic_array_type EOF ;
    public final EObject entryRuledynamic_array_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledynamic_array_type = null;


        try {
            // InternalPascalParser.g:2136:59: (iv_ruledynamic_array_type= ruledynamic_array_type EOF )
            // InternalPascalParser.g:2137:2: iv_ruledynamic_array_type= ruledynamic_array_type EOF
            {
             newCompositeNode(grammarAccess.getDynamic_array_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledynamic_array_type=ruledynamic_array_type();

            state._fsp--;

             current =iv_ruledynamic_array_type; 
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
    // $ANTLR end "entryRuledynamic_array_type"


    // $ANTLR start "ruledynamic_array_type"
    // InternalPascalParser.g:2143:1: ruledynamic_array_type returns [EObject current=null] : (otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype_identifier ) ) ) ;
    public final EObject ruledynamic_array_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:2149:2: ( (otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype_identifier ) ) ) )
            // InternalPascalParser.g:2150:2: (otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype_identifier ) ) )
            {
            // InternalPascalParser.g:2150:2: (otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype_identifier ) ) )
            // InternalPascalParser.g:2151:3: otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype_identifier ) )
            {
            otherlv_0=(Token)match(input,Array,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getDynamic_array_typeAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,Of,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getDynamic_array_typeAccess().getOfKeyword_1());
            		
            // InternalPascalParser.g:2159:3: ( (lv_type_2_0= ruletype_identifier ) )
            // InternalPascalParser.g:2160:4: (lv_type_2_0= ruletype_identifier )
            {
            // InternalPascalParser.g:2160:4: (lv_type_2_0= ruletype_identifier )
            // InternalPascalParser.g:2161:5: lv_type_2_0= ruletype_identifier
            {

            					newCompositeNode(grammarAccess.getDynamic_array_typeAccess().getTypeType_identifierParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype_identifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDynamic_array_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
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
    // $ANTLR end "ruledynamic_array_type"


    // $ANTLR start "entryRulearray_type"
    // InternalPascalParser.g:2182:1: entryRulearray_type returns [EObject current=null] : iv_rulearray_type= rulearray_type EOF ;
    public final EObject entryRulearray_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_type = null;


        try {
            // InternalPascalParser.g:2182:51: (iv_rulearray_type= rulearray_type EOF )
            // InternalPascalParser.g:2183:2: iv_rulearray_type= rulearray_type EOF
            {
             newCompositeNode(grammarAccess.getArray_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulearray_type=rulearray_type();

            state._fsp--;

             current =iv_rulearray_type; 
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
    // $ANTLR end "entryRulearray_type"


    // $ANTLR start "rulearray_type"
    // InternalPascalParser.g:2189:1: rulearray_type returns [EObject current=null] : (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_l_2_0= ruletype_list ) ) otherlv_3= RightSquareBracket otherlv_4= Of ( (lv_type_5_0= ruletype_identifier ) ) ) ;
    public final EObject rulearray_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_type_l_2_0 = null;

        EObject lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:2195:2: ( (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_l_2_0= ruletype_list ) ) otherlv_3= RightSquareBracket otherlv_4= Of ( (lv_type_5_0= ruletype_identifier ) ) ) )
            // InternalPascalParser.g:2196:2: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_l_2_0= ruletype_list ) ) otherlv_3= RightSquareBracket otherlv_4= Of ( (lv_type_5_0= ruletype_identifier ) ) )
            {
            // InternalPascalParser.g:2196:2: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_l_2_0= ruletype_list ) ) otherlv_3= RightSquareBracket otherlv_4= Of ( (lv_type_5_0= ruletype_identifier ) ) )
            // InternalPascalParser.g:2197:3: otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_l_2_0= ruletype_list ) ) otherlv_3= RightSquareBracket otherlv_4= Of ( (lv_type_5_0= ruletype_identifier ) )
            {
            otherlv_0=(Token)match(input,Array,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getArray_typeAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalPascalParser.g:2205:3: ( (lv_type_l_2_0= ruletype_list ) )
            // InternalPascalParser.g:2206:4: (lv_type_l_2_0= ruletype_list )
            {
            // InternalPascalParser.g:2206:4: (lv_type_l_2_0= ruletype_list )
            // InternalPascalParser.g:2207:5: lv_type_l_2_0= ruletype_list
            {

            					newCompositeNode(grammarAccess.getArray_typeAccess().getType_lType_listParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_type_l_2_0=ruletype_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArray_typeRule());
            					}
            					set(
            						current,
            						"type_l",
            						lv_type_l_2_0,
            						"org.xtext.compiler.pascal.Pascal.type_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,RightSquareBracket,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,Of,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getArray_typeAccess().getOfKeyword_4());
            		
            // InternalPascalParser.g:2232:3: ( (lv_type_5_0= ruletype_identifier ) )
            // InternalPascalParser.g:2233:4: (lv_type_5_0= ruletype_identifier )
            {
            // InternalPascalParser.g:2233:4: (lv_type_5_0= ruletype_identifier )
            // InternalPascalParser.g:2234:5: lv_type_5_0= ruletype_identifier
            {

            					newCompositeNode(grammarAccess.getArray_typeAccess().getTypeType_identifierParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_5_0=ruletype_identifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArray_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
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
    // $ANTLR end "rulearray_type"


    // $ANTLR start "entryRuletype_list"
    // InternalPascalParser.g:2255:1: entryRuletype_list returns [EObject current=null] : iv_ruletype_list= ruletype_list EOF ;
    public final EObject entryRuletype_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_list = null;


        try {
            // InternalPascalParser.g:2255:50: (iv_ruletype_list= ruletype_list EOF )
            // InternalPascalParser.g:2256:2: iv_ruletype_list= ruletype_list EOF
            {
             newCompositeNode(grammarAccess.getType_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype_list=ruletype_list();

            state._fsp--;

             current =iv_ruletype_list; 
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
    // $ANTLR end "entryRuletype_list"


    // $ANTLR start "ruletype_list"
    // InternalPascalParser.g:2262:1: ruletype_list returns [EObject current=null] : ( ( (lv_indexes_0_0= ruleindex_type ) ) (otherlv_1= Comma ( (lv_indexes_2_0= ruleindex_type ) ) )* ) ;
    public final EObject ruletype_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_indexes_0_0 = null;

        EObject lv_indexes_2_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:2268:2: ( ( ( (lv_indexes_0_0= ruleindex_type ) ) (otherlv_1= Comma ( (lv_indexes_2_0= ruleindex_type ) ) )* ) )
            // InternalPascalParser.g:2269:2: ( ( (lv_indexes_0_0= ruleindex_type ) ) (otherlv_1= Comma ( (lv_indexes_2_0= ruleindex_type ) ) )* )
            {
            // InternalPascalParser.g:2269:2: ( ( (lv_indexes_0_0= ruleindex_type ) ) (otherlv_1= Comma ( (lv_indexes_2_0= ruleindex_type ) ) )* )
            // InternalPascalParser.g:2270:3: ( (lv_indexes_0_0= ruleindex_type ) ) (otherlv_1= Comma ( (lv_indexes_2_0= ruleindex_type ) ) )*
            {
            // InternalPascalParser.g:2270:3: ( (lv_indexes_0_0= ruleindex_type ) )
            // InternalPascalParser.g:2271:4: (lv_indexes_0_0= ruleindex_type )
            {
            // InternalPascalParser.g:2271:4: (lv_indexes_0_0= ruleindex_type )
            // InternalPascalParser.g:2272:5: lv_indexes_0_0= ruleindex_type
            {

            					newCompositeNode(grammarAccess.getType_listAccess().getIndexesIndex_typeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_indexes_0_0=ruleindex_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getType_listRule());
            					}
            					add(
            						current,
            						"indexes",
            						lv_indexes_0_0,
            						"org.xtext.compiler.pascal.Pascal.index_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascalParser.g:2289:3: (otherlv_1= Comma ( (lv_indexes_2_0= ruleindex_type ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Comma) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPascalParser.g:2290:4: otherlv_1= Comma ( (lv_indexes_2_0= ruleindex_type ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_29); 

            	    				newLeafNode(otherlv_1, grammarAccess.getType_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascalParser.g:2294:4: ( (lv_indexes_2_0= ruleindex_type ) )
            	    // InternalPascalParser.g:2295:5: (lv_indexes_2_0= ruleindex_type )
            	    {
            	    // InternalPascalParser.g:2295:5: (lv_indexes_2_0= ruleindex_type )
            	    // InternalPascalParser.g:2296:6: lv_indexes_2_0= ruleindex_type
            	    {

            	    						newCompositeNode(grammarAccess.getType_listAccess().getIndexesIndex_typeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_indexes_2_0=ruleindex_type();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getType_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"indexes",
            	    							lv_indexes_2_0,
            	    							"org.xtext.compiler.pascal.Pascal.index_type");
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
    // $ANTLR end "ruletype_list"


    // $ANTLR start "entryRuleindex_type"
    // InternalPascalParser.g:2318:1: entryRuleindex_type returns [EObject current=null] : iv_ruleindex_type= ruleindex_type EOF ;
    public final EObject entryRuleindex_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleindex_type = null;


        try {
            // InternalPascalParser.g:2318:51: (iv_ruleindex_type= ruleindex_type EOF )
            // InternalPascalParser.g:2319:2: iv_ruleindex_type= ruleindex_type EOF
            {
             newCompositeNode(grammarAccess.getIndex_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleindex_type=ruleindex_type();

            state._fsp--;

             current =iv_ruleindex_type; 
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
    // $ANTLR end "entryRuleindex_type"


    // $ANTLR start "ruleindex_type"
    // InternalPascalParser.g:2325:1: ruleindex_type returns [EObject current=null] : ( (lv_content_0_0= rulesimple_type ) ) ;
    public final EObject ruleindex_type() throws RecognitionException {
        EObject current = null;

        EObject lv_content_0_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:2331:2: ( ( (lv_content_0_0= rulesimple_type ) ) )
            // InternalPascalParser.g:2332:2: ( (lv_content_0_0= rulesimple_type ) )
            {
            // InternalPascalParser.g:2332:2: ( (lv_content_0_0= rulesimple_type ) )
            // InternalPascalParser.g:2333:3: (lv_content_0_0= rulesimple_type )
            {
            // InternalPascalParser.g:2333:3: (lv_content_0_0= rulesimple_type )
            // InternalPascalParser.g:2334:4: lv_content_0_0= rulesimple_type
            {

            				newCompositeNode(grammarAccess.getIndex_typeAccess().getContentSimple_typeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_content_0_0=rulesimple_type();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getIndex_typeRule());
            				}
            				set(
            					current,
            					"content",
            					lv_content_0_0,
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
    // $ANTLR end "ruleindex_type"


    // $ANTLR start "entryRuletype_identifier"
    // InternalPascalParser.g:2354:1: entryRuletype_identifier returns [EObject current=null] : iv_ruletype_identifier= ruletype_identifier EOF ;
    public final EObject entryRuletype_identifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_identifier = null;


        try {
            // InternalPascalParser.g:2354:56: (iv_ruletype_identifier= ruletype_identifier EOF )
            // InternalPascalParser.g:2355:2: iv_ruletype_identifier= ruletype_identifier EOF
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
    // InternalPascalParser.g:2361:1: ruletype_identifier returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) | ( ( (lv_boolean_1_0= Boolean ) ) | ( (lv_integer_2_0= Integer ) ) | ( (lv_string_3_0= String ) ) ) ) ;
    public final EObject ruletype_identifier() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_boolean_1_0=null;
        Token lv_integer_2_0=null;
        Token lv_string_3_0=null;


        	enterRule();

        try {
            // InternalPascalParser.g:2367:2: ( ( ( (lv_id_0_0= RULE_ID ) ) | ( ( (lv_boolean_1_0= Boolean ) ) | ( (lv_integer_2_0= Integer ) ) | ( (lv_string_3_0= String ) ) ) ) )
            // InternalPascalParser.g:2368:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( ( (lv_boolean_1_0= Boolean ) ) | ( (lv_integer_2_0= Integer ) ) | ( (lv_string_3_0= String ) ) ) )
            {
            // InternalPascalParser.g:2368:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( ( (lv_boolean_1_0= Boolean ) ) | ( (lv_integer_2_0= Integer ) ) | ( (lv_string_3_0= String ) ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=Boolean && LA24_0<=Integer)||LA24_0==String) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalPascalParser.g:2369:3: ( (lv_id_0_0= RULE_ID ) )
                    {
                    // InternalPascalParser.g:2369:3: ( (lv_id_0_0= RULE_ID ) )
                    // InternalPascalParser.g:2370:4: (lv_id_0_0= RULE_ID )
                    {
                    // InternalPascalParser.g:2370:4: (lv_id_0_0= RULE_ID )
                    // InternalPascalParser.g:2371:5: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_id_0_0, grammarAccess.getType_identifierAccess().getIdIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getType_identifierRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"id",
                    						lv_id_0_0,
                    						"org.xtext.compiler.pascal.Pascal.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:2388:3: ( ( (lv_boolean_1_0= Boolean ) ) | ( (lv_integer_2_0= Integer ) ) | ( (lv_string_3_0= String ) ) )
                    {
                    // InternalPascalParser.g:2388:3: ( ( (lv_boolean_1_0= Boolean ) ) | ( (lv_integer_2_0= Integer ) ) | ( (lv_string_3_0= String ) ) )
                    int alt23=3;
                    switch ( input.LA(1) ) {
                    case Boolean:
                        {
                        alt23=1;
                        }
                        break;
                    case Integer:
                        {
                        alt23=2;
                        }
                        break;
                    case String:
                        {
                        alt23=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }

                    switch (alt23) {
                        case 1 :
                            // InternalPascalParser.g:2389:4: ( (lv_boolean_1_0= Boolean ) )
                            {
                            // InternalPascalParser.g:2389:4: ( (lv_boolean_1_0= Boolean ) )
                            // InternalPascalParser.g:2390:5: (lv_boolean_1_0= Boolean )
                            {
                            // InternalPascalParser.g:2390:5: (lv_boolean_1_0= Boolean )
                            // InternalPascalParser.g:2391:6: lv_boolean_1_0= Boolean
                            {
                            lv_boolean_1_0=(Token)match(input,Boolean,FOLLOW_2); 

                            						newLeafNode(lv_boolean_1_0, grammarAccess.getType_identifierAccess().getBooleanBooleanKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getType_identifierRule());
                            						}
                            						setWithLastConsumed(current, "boolean", lv_boolean_1_0, "boolean");
                            					

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPascalParser.g:2404:4: ( (lv_integer_2_0= Integer ) )
                            {
                            // InternalPascalParser.g:2404:4: ( (lv_integer_2_0= Integer ) )
                            // InternalPascalParser.g:2405:5: (lv_integer_2_0= Integer )
                            {
                            // InternalPascalParser.g:2405:5: (lv_integer_2_0= Integer )
                            // InternalPascalParser.g:2406:6: lv_integer_2_0= Integer
                            {
                            lv_integer_2_0=(Token)match(input,Integer,FOLLOW_2); 

                            						newLeafNode(lv_integer_2_0, grammarAccess.getType_identifierAccess().getIntegerIntegerKeyword_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getType_identifierRule());
                            						}
                            						setWithLastConsumed(current, "integer", lv_integer_2_0, "integer");
                            					

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalPascalParser.g:2419:4: ( (lv_string_3_0= String ) )
                            {
                            // InternalPascalParser.g:2419:4: ( (lv_string_3_0= String ) )
                            // InternalPascalParser.g:2420:5: (lv_string_3_0= String )
                            {
                            // InternalPascalParser.g:2420:5: (lv_string_3_0= String )
                            // InternalPascalParser.g:2421:6: lv_string_3_0= String
                            {
                            lv_string_3_0=(Token)match(input,String,FOLLOW_2); 

                            						newLeafNode(lv_string_3_0, grammarAccess.getType_identifierAccess().getStringStringKeyword_1_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getType_identifierRule());
                            						}
                            						setWithLastConsumed(current, "string", lv_string_3_0, "string");
                            					

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


    // $ANTLR start "entryRuleunsigned_constant"
    // InternalPascalParser.g:2438:1: entryRuleunsigned_constant returns [EObject current=null] : iv_ruleunsigned_constant= ruleunsigned_constant EOF ;
    public final EObject entryRuleunsigned_constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_constant = null;


        try {
            // InternalPascalParser.g:2438:58: (iv_ruleunsigned_constant= ruleunsigned_constant EOF )
            // InternalPascalParser.g:2439:2: iv_ruleunsigned_constant= ruleunsigned_constant EOF
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
    // InternalPascalParser.g:2445:1: ruleunsigned_constant returns [EObject current=null] : ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_nil_2_0= RULE_NIL ) ) ) ;
    public final EObject ruleunsigned_constant() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        Token lv_nil_2_0=null;
        EObject lv_number_0_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:2451:2: ( ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_nil_2_0= RULE_NIL ) ) ) )
            // InternalPascalParser.g:2452:2: ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_nil_2_0= RULE_NIL ) ) )
            {
            // InternalPascalParser.g:2452:2: ( ( (lv_number_0_0= ruleunsigned_number ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_nil_2_0= RULE_NIL ) ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_NUM_INT:
                {
                alt25=1;
                }
                break;
            case RULE_STRING:
                {
                alt25=2;
                }
                break;
            case RULE_NIL:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalPascalParser.g:2453:3: ( (lv_number_0_0= ruleunsigned_number ) )
                    {
                    // InternalPascalParser.g:2453:3: ( (lv_number_0_0= ruleunsigned_number ) )
                    // InternalPascalParser.g:2454:4: (lv_number_0_0= ruleunsigned_number )
                    {
                    // InternalPascalParser.g:2454:4: (lv_number_0_0= ruleunsigned_number )
                    // InternalPascalParser.g:2455:5: lv_number_0_0= ruleunsigned_number
                    {

                    					newCompositeNode(grammarAccess.getUnsigned_constantAccess().getNumberUnsigned_numberParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_number_0_0=ruleunsigned_number();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnsigned_constantRule());
                    					}
                    					set(
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
                    // InternalPascalParser.g:2473:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalPascalParser.g:2473:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalPascalParser.g:2474:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalPascalParser.g:2474:4: (lv_string_1_0= RULE_STRING )
                    // InternalPascalParser.g:2475:5: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_1_0, grammarAccess.getUnsigned_constantAccess().getStringSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnsigned_constantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_1_0,
                    						"org.xtext.compiler.pascal.Pascal.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascalParser.g:2492:3: ( (lv_nil_2_0= RULE_NIL ) )
                    {
                    // InternalPascalParser.g:2492:3: ( (lv_nil_2_0= RULE_NIL ) )
                    // InternalPascalParser.g:2493:4: (lv_nil_2_0= RULE_NIL )
                    {
                    // InternalPascalParser.g:2493:4: (lv_nil_2_0= RULE_NIL )
                    // InternalPascalParser.g:2494:5: lv_nil_2_0= RULE_NIL
                    {
                    lv_nil_2_0=(Token)match(input,RULE_NIL,FOLLOW_2); 

                    					newLeafNode(lv_nil_2_0, grammarAccess.getUnsigned_constantAccess().getNilNILTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnsigned_constantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"nil",
                    						lv_nil_2_0,
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
    // InternalPascalParser.g:2514:1: entryRuleunsigned_number returns [EObject current=null] : iv_ruleunsigned_number= ruleunsigned_number EOF ;
    public final EObject entryRuleunsigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_number = null;


        try {
            // InternalPascalParser.g:2514:56: (iv_ruleunsigned_number= ruleunsigned_number EOF )
            // InternalPascalParser.g:2515:2: iv_ruleunsigned_number= ruleunsigned_number EOF
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
    // InternalPascalParser.g:2521:1: ruleunsigned_number returns [EObject current=null] : ( (lv_numbers_0_0= ruleunsigned_integer ) ) ;
    public final EObject ruleunsigned_number() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_numbers_0_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:2527:2: ( ( (lv_numbers_0_0= ruleunsigned_integer ) ) )
            // InternalPascalParser.g:2528:2: ( (lv_numbers_0_0= ruleunsigned_integer ) )
            {
            // InternalPascalParser.g:2528:2: ( (lv_numbers_0_0= ruleunsigned_integer ) )
            // InternalPascalParser.g:2529:3: (lv_numbers_0_0= ruleunsigned_integer )
            {
            // InternalPascalParser.g:2529:3: (lv_numbers_0_0= ruleunsigned_integer )
            // InternalPascalParser.g:2530:4: lv_numbers_0_0= ruleunsigned_integer
            {

            				newCompositeNode(grammarAccess.getUnsigned_numberAccess().getNumbersUnsigned_integerParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_numbers_0_0=ruleunsigned_integer();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getUnsigned_numberRule());
            				}
            				set(
            					current,
            					"numbers",
            					lv_numbers_0_0,
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
    // $ANTLR end "ruleunsigned_number"


    // $ANTLR start "entryRuleprocedure_statement"
    // InternalPascalParser.g:2550:1: entryRuleprocedure_statement returns [EObject current=null] : iv_ruleprocedure_statement= ruleprocedure_statement EOF ;
    public final EObject entryRuleprocedure_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_statement = null;


        try {
            // InternalPascalParser.g:2550:60: (iv_ruleprocedure_statement= ruleprocedure_statement EOF )
            // InternalPascalParser.g:2551:2: iv_ruleprocedure_statement= ruleprocedure_statement EOF
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
    // InternalPascalParser.g:2557:1: ruleprocedure_statement returns [EObject current=null] : ( ( (lv_name_id_0_0= RULE_ID ) ) (otherlv_1= LeftParenthesis ( (lv_parameters_2_0= ruleparameter_list ) ) otherlv_3= RightParenthesis )? ) ;
    public final EObject ruleprocedure_statement() throws RecognitionException {
        EObject current = null;

        Token lv_name_id_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:2563:2: ( ( ( (lv_name_id_0_0= RULE_ID ) ) (otherlv_1= LeftParenthesis ( (lv_parameters_2_0= ruleparameter_list ) ) otherlv_3= RightParenthesis )? ) )
            // InternalPascalParser.g:2564:2: ( ( (lv_name_id_0_0= RULE_ID ) ) (otherlv_1= LeftParenthesis ( (lv_parameters_2_0= ruleparameter_list ) ) otherlv_3= RightParenthesis )? )
            {
            // InternalPascalParser.g:2564:2: ( ( (lv_name_id_0_0= RULE_ID ) ) (otherlv_1= LeftParenthesis ( (lv_parameters_2_0= ruleparameter_list ) ) otherlv_3= RightParenthesis )? )
            // InternalPascalParser.g:2565:3: ( (lv_name_id_0_0= RULE_ID ) ) (otherlv_1= LeftParenthesis ( (lv_parameters_2_0= ruleparameter_list ) ) otherlv_3= RightParenthesis )?
            {
            // InternalPascalParser.g:2565:3: ( (lv_name_id_0_0= RULE_ID ) )
            // InternalPascalParser.g:2566:4: (lv_name_id_0_0= RULE_ID )
            {
            // InternalPascalParser.g:2566:4: (lv_name_id_0_0= RULE_ID )
            // InternalPascalParser.g:2567:5: lv_name_id_0_0= RULE_ID
            {
            lv_name_id_0_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_id_0_0, grammarAccess.getProcedure_statementAccess().getName_idIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcedure_statementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name_id",
            						lv_name_id_0_0,
            						"org.xtext.compiler.pascal.Pascal.ID");
            				

            }


            }

            // InternalPascalParser.g:2583:3: (otherlv_1= LeftParenthesis ( (lv_parameters_2_0= ruleparameter_list ) ) otherlv_3= RightParenthesis )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LeftParenthesis) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPascalParser.g:2584:4: otherlv_1= LeftParenthesis ( (lv_parameters_2_0= ruleparameter_list ) ) otherlv_3= RightParenthesis
                    {
                    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getProcedure_statementAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalPascalParser.g:2588:4: ( (lv_parameters_2_0= ruleparameter_list ) )
                    // InternalPascalParser.g:2589:5: (lv_parameters_2_0= ruleparameter_list )
                    {
                    // InternalPascalParser.g:2589:5: (lv_parameters_2_0= ruleparameter_list )
                    // InternalPascalParser.g:2590:6: lv_parameters_2_0= ruleparameter_list
                    {

                    						newCompositeNode(grammarAccess.getProcedure_statementAccess().getParametersParameter_listParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_parameters_2_0=ruleparameter_list();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedure_statementRule());
                    						}
                    						set(
                    							current,
                    							"parameters",
                    							lv_parameters_2_0,
                    							"org.xtext.compiler.pascal.Pascal.parameter_list");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); 

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
    // InternalPascalParser.g:2616:1: entryRuleparameter_list returns [EObject current=null] : iv_ruleparameter_list= ruleparameter_list EOF ;
    public final EObject entryRuleparameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_list = null;


        try {
            // InternalPascalParser.g:2616:55: (iv_ruleparameter_list= ruleparameter_list EOF )
            // InternalPascalParser.g:2617:2: iv_ruleparameter_list= ruleparameter_list EOF
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
    // InternalPascalParser.g:2623:1: ruleparameter_list returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleactual_parameter ) ) (otherlv_1= Comma ( (lv_parameters_2_0= ruleactual_parameter ) ) )* ) ;
    public final EObject ruleparameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:2629:2: ( ( ( (lv_parameters_0_0= ruleactual_parameter ) ) (otherlv_1= Comma ( (lv_parameters_2_0= ruleactual_parameter ) ) )* ) )
            // InternalPascalParser.g:2630:2: ( ( (lv_parameters_0_0= ruleactual_parameter ) ) (otherlv_1= Comma ( (lv_parameters_2_0= ruleactual_parameter ) ) )* )
            {
            // InternalPascalParser.g:2630:2: ( ( (lv_parameters_0_0= ruleactual_parameter ) ) (otherlv_1= Comma ( (lv_parameters_2_0= ruleactual_parameter ) ) )* )
            // InternalPascalParser.g:2631:3: ( (lv_parameters_0_0= ruleactual_parameter ) ) (otherlv_1= Comma ( (lv_parameters_2_0= ruleactual_parameter ) ) )*
            {
            // InternalPascalParser.g:2631:3: ( (lv_parameters_0_0= ruleactual_parameter ) )
            // InternalPascalParser.g:2632:4: (lv_parameters_0_0= ruleactual_parameter )
            {
            // InternalPascalParser.g:2632:4: (lv_parameters_0_0= ruleactual_parameter )
            // InternalPascalParser.g:2633:5: lv_parameters_0_0= ruleactual_parameter
            {

            					newCompositeNode(grammarAccess.getParameter_listAccess().getParametersActual_parameterParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_parameters_0_0=ruleactual_parameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameter_listRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_0_0,
            						"org.xtext.compiler.pascal.Pascal.actual_parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascalParser.g:2650:3: (otherlv_1= Comma ( (lv_parameters_2_0= ruleactual_parameter ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Comma) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPascalParser.g:2651:4: otherlv_1= Comma ( (lv_parameters_2_0= ruleactual_parameter ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_18); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParameter_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascalParser.g:2655:4: ( (lv_parameters_2_0= ruleactual_parameter ) )
            	    // InternalPascalParser.g:2656:5: (lv_parameters_2_0= ruleactual_parameter )
            	    {
            	    // InternalPascalParser.g:2656:5: (lv_parameters_2_0= ruleactual_parameter )
            	    // InternalPascalParser.g:2657:6: lv_parameters_2_0= ruleactual_parameter
            	    {

            	    						newCompositeNode(grammarAccess.getParameter_listAccess().getParametersActual_parameterParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_parameters_2_0=ruleactual_parameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameter_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_2_0,
            	    							"org.xtext.compiler.pascal.Pascal.actual_parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalPascalParser.g:2679:1: entryRuleactual_parameter returns [EObject current=null] : iv_ruleactual_parameter= ruleactual_parameter EOF ;
    public final EObject entryRuleactual_parameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactual_parameter = null;


        try {
            // InternalPascalParser.g:2679:57: (iv_ruleactual_parameter= ruleactual_parameter EOF )
            // InternalPascalParser.g:2680:2: iv_ruleactual_parameter= ruleactual_parameter EOF
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
    // InternalPascalParser.g:2686:1: ruleactual_parameter returns [EObject current=null] : ( (lv_content_0_0= ruleexpression ) ) ;
    public final EObject ruleactual_parameter() throws RecognitionException {
        EObject current = null;

        EObject lv_content_0_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:2692:2: ( ( (lv_content_0_0= ruleexpression ) ) )
            // InternalPascalParser.g:2693:2: ( (lv_content_0_0= ruleexpression ) )
            {
            // InternalPascalParser.g:2693:2: ( (lv_content_0_0= ruleexpression ) )
            // InternalPascalParser.g:2694:3: (lv_content_0_0= ruleexpression )
            {
            // InternalPascalParser.g:2694:3: (lv_content_0_0= ruleexpression )
            // InternalPascalParser.g:2695:4: lv_content_0_0= ruleexpression
            {

            				newCompositeNode(grammarAccess.getActual_parameterAccess().getContentExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_content_0_0=ruleexpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getActual_parameterRule());
            				}
            				set(
            					current,
            					"content",
            					lv_content_0_0,
            					"org.xtext.compiler.pascal.Pascal.expression");
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
    // $ANTLR end "ruleactual_parameter"


    // $ANTLR start "entryRulestructured_statement"
    // InternalPascalParser.g:2715:1: entryRulestructured_statement returns [EObject current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final EObject entryRulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_statement = null;


        try {
            // InternalPascalParser.g:2715:61: (iv_rulestructured_statement= rulestructured_statement EOF )
            // InternalPascalParser.g:2716:2: iv_rulestructured_statement= rulestructured_statement EOF
            {
             newCompositeNode(grammarAccess.getStructured_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestructured_statement=rulestructured_statement();

            state._fsp--;

             current =iv_rulestructured_statement; 
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
    // InternalPascalParser.g:2722:1: rulestructured_statement returns [EObject current=null] : ( ( (lv_compound_stat_0_0= rulecompound_statement ) ) | ( (lv_conditional_stat_1_0= ruleconditional_statement ) ) ) ;
    public final EObject rulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_compound_stat_0_0 = null;

        EObject lv_conditional_stat_1_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:2728:2: ( ( ( (lv_compound_stat_0_0= rulecompound_statement ) ) | ( (lv_conditional_stat_1_0= ruleconditional_statement ) ) ) )
            // InternalPascalParser.g:2729:2: ( ( (lv_compound_stat_0_0= rulecompound_statement ) ) | ( (lv_conditional_stat_1_0= ruleconditional_statement ) ) )
            {
            // InternalPascalParser.g:2729:2: ( ( (lv_compound_stat_0_0= rulecompound_statement ) ) | ( (lv_conditional_stat_1_0= ruleconditional_statement ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Begin) ) {
                alt28=1;
            }
            else if ( (LA28_0==Case) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalPascalParser.g:2730:3: ( (lv_compound_stat_0_0= rulecompound_statement ) )
                    {
                    // InternalPascalParser.g:2730:3: ( (lv_compound_stat_0_0= rulecompound_statement ) )
                    // InternalPascalParser.g:2731:4: (lv_compound_stat_0_0= rulecompound_statement )
                    {
                    // InternalPascalParser.g:2731:4: (lv_compound_stat_0_0= rulecompound_statement )
                    // InternalPascalParser.g:2732:5: lv_compound_stat_0_0= rulecompound_statement
                    {

                    					newCompositeNode(grammarAccess.getStructured_statementAccess().getCompound_statCompound_statementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_compound_stat_0_0=rulecompound_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    					}
                    					set(
                    						current,
                    						"compound_stat",
                    						lv_compound_stat_0_0,
                    						"org.xtext.compiler.pascal.Pascal.compound_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:2750:3: ( (lv_conditional_stat_1_0= ruleconditional_statement ) )
                    {
                    // InternalPascalParser.g:2750:3: ( (lv_conditional_stat_1_0= ruleconditional_statement ) )
                    // InternalPascalParser.g:2751:4: (lv_conditional_stat_1_0= ruleconditional_statement )
                    {
                    // InternalPascalParser.g:2751:4: (lv_conditional_stat_1_0= ruleconditional_statement )
                    // InternalPascalParser.g:2752:5: lv_conditional_stat_1_0= ruleconditional_statement
                    {

                    					newCompositeNode(grammarAccess.getStructured_statementAccess().getConditional_statConditional_statementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_conditional_stat_1_0=ruleconditional_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    					}
                    					set(
                    						current,
                    						"conditional_stat",
                    						lv_conditional_stat_1_0,
                    						"org.xtext.compiler.pascal.Pascal.conditional_statement");
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
    // $ANTLR end "rulestructured_statement"


    // $ANTLR start "entryRuleconditional_statement"
    // InternalPascalParser.g:2773:1: entryRuleconditional_statement returns [EObject current=null] : iv_ruleconditional_statement= ruleconditional_statement EOF ;
    public final EObject entryRuleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconditional_statement = null;


        try {
            // InternalPascalParser.g:2773:62: (iv_ruleconditional_statement= ruleconditional_statement EOF )
            // InternalPascalParser.g:2774:2: iv_ruleconditional_statement= ruleconditional_statement EOF
            {
             newCompositeNode(grammarAccess.getConditional_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconditional_statement=ruleconditional_statement();

            state._fsp--;

             current =iv_ruleconditional_statement; 
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
    // $ANTLR end "entryRuleconditional_statement"


    // $ANTLR start "ruleconditional_statement"
    // InternalPascalParser.g:2780:1: ruleconditional_statement returns [EObject current=null] : ( (lv_cond_statements_0_0= rulecase_statement ) ) ;
    public final EObject ruleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_cond_statements_0_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:2786:2: ( ( (lv_cond_statements_0_0= rulecase_statement ) ) )
            // InternalPascalParser.g:2787:2: ( (lv_cond_statements_0_0= rulecase_statement ) )
            {
            // InternalPascalParser.g:2787:2: ( (lv_cond_statements_0_0= rulecase_statement ) )
            // InternalPascalParser.g:2788:3: (lv_cond_statements_0_0= rulecase_statement )
            {
            // InternalPascalParser.g:2788:3: (lv_cond_statements_0_0= rulecase_statement )
            // InternalPascalParser.g:2789:4: lv_cond_statements_0_0= rulecase_statement
            {

            				newCompositeNode(grammarAccess.getConditional_statementAccess().getCond_statementsCase_statementParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_cond_statements_0_0=rulecase_statement();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getConditional_statementRule());
            				}
            				set(
            					current,
            					"cond_statements",
            					lv_cond_statements_0_0,
            					"org.xtext.compiler.pascal.Pascal.case_statement");
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
    // $ANTLR end "ruleconditional_statement"


    // $ANTLR start "entryRulecase_statement"
    // InternalPascalParser.g:2809:1: entryRulecase_statement returns [EObject current=null] : iv_rulecase_statement= rulecase_statement EOF ;
    public final EObject entryRulecase_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_statement = null;


        try {
            // InternalPascalParser.g:2809:55: (iv_rulecase_statement= rulecase_statement EOF )
            // InternalPascalParser.g:2810:2: iv_rulecase_statement= rulecase_statement EOF
            {
             newCompositeNode(grammarAccess.getCase_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecase_statement=rulecase_statement();

            state._fsp--;

             current =iv_rulecase_statement; 
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
    // $ANTLR end "entryRulecase_statement"


    // $ANTLR start "rulecase_statement"
    // InternalPascalParser.g:2816:1: rulecase_statement returns [EObject current=null] : (otherlv_0= Case ( (lv_exp_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_case_list_3_0= rulecase_list_element ) ) (otherlv_4= Semicolon ( (lv_case_list_5_0= rulecase_list_element ) ) )* (otherlv_6= Semicolon )? (otherlv_7= Else ( (lv_case_statements_8_0= rulestatements ) ) )? otherlv_9= End ) ;
    public final EObject rulecase_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_exp_1_0 = null;

        EObject lv_case_list_3_0 = null;

        EObject lv_case_list_5_0 = null;

        EObject lv_case_statements_8_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:2822:2: ( (otherlv_0= Case ( (lv_exp_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_case_list_3_0= rulecase_list_element ) ) (otherlv_4= Semicolon ( (lv_case_list_5_0= rulecase_list_element ) ) )* (otherlv_6= Semicolon )? (otherlv_7= Else ( (lv_case_statements_8_0= rulestatements ) ) )? otherlv_9= End ) )
            // InternalPascalParser.g:2823:2: (otherlv_0= Case ( (lv_exp_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_case_list_3_0= rulecase_list_element ) ) (otherlv_4= Semicolon ( (lv_case_list_5_0= rulecase_list_element ) ) )* (otherlv_6= Semicolon )? (otherlv_7= Else ( (lv_case_statements_8_0= rulestatements ) ) )? otherlv_9= End )
            {
            // InternalPascalParser.g:2823:2: (otherlv_0= Case ( (lv_exp_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_case_list_3_0= rulecase_list_element ) ) (otherlv_4= Semicolon ( (lv_case_list_5_0= rulecase_list_element ) ) )* (otherlv_6= Semicolon )? (otherlv_7= Else ( (lv_case_statements_8_0= rulestatements ) ) )? otherlv_9= End )
            // InternalPascalParser.g:2824:3: otherlv_0= Case ( (lv_exp_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_case_list_3_0= rulecase_list_element ) ) (otherlv_4= Semicolon ( (lv_case_list_5_0= rulecase_list_element ) ) )* (otherlv_6= Semicolon )? (otherlv_7= Else ( (lv_case_statements_8_0= rulestatements ) ) )? otherlv_9= End
            {
            otherlv_0=(Token)match(input,Case,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getCase_statementAccess().getCaseKeyword_0());
            		
            // InternalPascalParser.g:2828:3: ( (lv_exp_1_0= ruleexpression ) )
            // InternalPascalParser.g:2829:4: (lv_exp_1_0= ruleexpression )
            {
            // InternalPascalParser.g:2829:4: (lv_exp_1_0= ruleexpression )
            // InternalPascalParser.g:2830:5: lv_exp_1_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getCase_statementAccess().getExpExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_exp_1_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCase_statementRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"org.xtext.compiler.pascal.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Of,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getCase_statementAccess().getOfKeyword_2());
            		
            // InternalPascalParser.g:2851:3: ( (lv_case_list_3_0= rulecase_list_element ) )
            // InternalPascalParser.g:2852:4: (lv_case_list_3_0= rulecase_list_element )
            {
            // InternalPascalParser.g:2852:4: (lv_case_list_3_0= rulecase_list_element )
            // InternalPascalParser.g:2853:5: lv_case_list_3_0= rulecase_list_element
            {

            					newCompositeNode(grammarAccess.getCase_statementAccess().getCase_listCase_list_elementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
            lv_case_list_3_0=rulecase_list_element();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCase_statementRule());
            					}
            					add(
            						current,
            						"case_list",
            						lv_case_list_3_0,
            						"org.xtext.compiler.pascal.Pascal.case_list_element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascalParser.g:2870:3: (otherlv_4= Semicolon ( (lv_case_list_5_0= rulecase_list_element ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Semicolon) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==False||LA29_1==True||(LA29_1>=RULE_PLUS && LA29_1<=RULE_MINUS)||LA29_1==RULE_NUM_INT||(LA29_1>=RULE_ID && LA29_1<=RULE_STRING)) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalPascalParser.g:2871:4: otherlv_4= Semicolon ( (lv_case_list_5_0= rulecase_list_element ) )
            	    {
            	    otherlv_4=(Token)match(input,Semicolon,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCase_statementAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalPascalParser.g:2875:4: ( (lv_case_list_5_0= rulecase_list_element ) )
            	    // InternalPascalParser.g:2876:5: (lv_case_list_5_0= rulecase_list_element )
            	    {
            	    // InternalPascalParser.g:2876:5: (lv_case_list_5_0= rulecase_list_element )
            	    // InternalPascalParser.g:2877:6: lv_case_list_5_0= rulecase_list_element
            	    {

            	    						newCompositeNode(grammarAccess.getCase_statementAccess().getCase_listCase_list_elementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_case_list_5_0=rulecase_list_element();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCase_statementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"case_list",
            	    							lv_case_list_5_0,
            	    							"org.xtext.compiler.pascal.Pascal.case_list_element");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalPascalParser.g:2895:3: (otherlv_6= Semicolon )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Semicolon) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPascalParser.g:2896:4: otherlv_6= Semicolon
                    {
                    otherlv_6=(Token)match(input,Semicolon,FOLLOW_33); 

                    				newLeafNode(otherlv_6, grammarAccess.getCase_statementAccess().getSemicolonKeyword_5());
                    			

                    }
                    break;

            }

            // InternalPascalParser.g:2901:3: (otherlv_7= Else ( (lv_case_statements_8_0= rulestatements ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Else) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPascalParser.g:2902:4: otherlv_7= Else ( (lv_case_statements_8_0= rulestatements ) )
                    {
                    otherlv_7=(Token)match(input,Else,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getCase_statementAccess().getElseKeyword_6_0());
                    			
                    // InternalPascalParser.g:2906:4: ( (lv_case_statements_8_0= rulestatements ) )
                    // InternalPascalParser.g:2907:5: (lv_case_statements_8_0= rulestatements )
                    {
                    // InternalPascalParser.g:2907:5: (lv_case_statements_8_0= rulestatements )
                    // InternalPascalParser.g:2908:6: lv_case_statements_8_0= rulestatements
                    {

                    						newCompositeNode(grammarAccess.getCase_statementAccess().getCase_statementsStatementsParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_case_statements_8_0=rulestatements();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCase_statementRule());
                    						}
                    						set(
                    							current,
                    							"case_statements",
                    							lv_case_statements_8_0,
                    							"org.xtext.compiler.pascal.Pascal.statements");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,End,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCase_statementAccess().getEndKeyword_7());
            		

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
    // $ANTLR end "rulecase_statement"


    // $ANTLR start "entryRulecase_list_element"
    // InternalPascalParser.g:2934:1: entryRulecase_list_element returns [EObject current=null] : iv_rulecase_list_element= rulecase_list_element EOF ;
    public final EObject entryRulecase_list_element() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_list_element = null;


        try {
            // InternalPascalParser.g:2934:58: (iv_rulecase_list_element= rulecase_list_element EOF )
            // InternalPascalParser.g:2935:2: iv_rulecase_list_element= rulecase_list_element EOF
            {
             newCompositeNode(grammarAccess.getCase_list_elementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecase_list_element=rulecase_list_element();

            state._fsp--;

             current =iv_rulecase_list_element; 
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
    // $ANTLR end "entryRulecase_list_element"


    // $ANTLR start "rulecase_list_element"
    // InternalPascalParser.g:2941:1: rulecase_list_element returns [EObject current=null] : ( ( (lv_consts_0_0= ruleconst_list ) ) otherlv_1= Colon ( (lv_case_statement_2_0= rulestatement ) ) ) ;
    public final EObject rulecase_list_element() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_consts_0_0 = null;

        EObject lv_case_statement_2_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:2947:2: ( ( ( (lv_consts_0_0= ruleconst_list ) ) otherlv_1= Colon ( (lv_case_statement_2_0= rulestatement ) ) ) )
            // InternalPascalParser.g:2948:2: ( ( (lv_consts_0_0= ruleconst_list ) ) otherlv_1= Colon ( (lv_case_statement_2_0= rulestatement ) ) )
            {
            // InternalPascalParser.g:2948:2: ( ( (lv_consts_0_0= ruleconst_list ) ) otherlv_1= Colon ( (lv_case_statement_2_0= rulestatement ) ) )
            // InternalPascalParser.g:2949:3: ( (lv_consts_0_0= ruleconst_list ) ) otherlv_1= Colon ( (lv_case_statement_2_0= rulestatement ) )
            {
            // InternalPascalParser.g:2949:3: ( (lv_consts_0_0= ruleconst_list ) )
            // InternalPascalParser.g:2950:4: (lv_consts_0_0= ruleconst_list )
            {
            // InternalPascalParser.g:2950:4: (lv_consts_0_0= ruleconst_list )
            // InternalPascalParser.g:2951:5: lv_consts_0_0= ruleconst_list
            {

            					newCompositeNode(grammarAccess.getCase_list_elementAccess().getConstsConst_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_consts_0_0=ruleconst_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCase_list_elementRule());
            					}
            					set(
            						current,
            						"consts",
            						lv_consts_0_0,
            						"org.xtext.compiler.pascal.Pascal.const_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getCase_list_elementAccess().getColonKeyword_1());
            		
            // InternalPascalParser.g:2972:3: ( (lv_case_statement_2_0= rulestatement ) )
            // InternalPascalParser.g:2973:4: (lv_case_statement_2_0= rulestatement )
            {
            // InternalPascalParser.g:2973:4: (lv_case_statement_2_0= rulestatement )
            // InternalPascalParser.g:2974:5: lv_case_statement_2_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getCase_list_elementAccess().getCase_statementStatementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_case_statement_2_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCase_list_elementRule());
            					}
            					set(
            						current,
            						"case_statement",
            						lv_case_statement_2_0,
            						"org.xtext.compiler.pascal.Pascal.statement");
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
    // $ANTLR end "rulecase_list_element"


    // $ANTLR start "entryRuleconst_list"
    // InternalPascalParser.g:2995:1: entryRuleconst_list returns [EObject current=null] : iv_ruleconst_list= ruleconst_list EOF ;
    public final EObject entryRuleconst_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconst_list = null;


        try {
            // InternalPascalParser.g:2995:51: (iv_ruleconst_list= ruleconst_list EOF )
            // InternalPascalParser.g:2996:2: iv_ruleconst_list= ruleconst_list EOF
            {
             newCompositeNode(grammarAccess.getConst_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconst_list=ruleconst_list();

            state._fsp--;

             current =iv_ruleconst_list; 
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
    // $ANTLR end "entryRuleconst_list"


    // $ANTLR start "ruleconst_list"
    // InternalPascalParser.g:3002:1: ruleconst_list returns [EObject current=null] : ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )* ) ;
    public final EObject ruleconst_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constants_0_0 = null;

        EObject lv_constants_2_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:3008:2: ( ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )* ) )
            // InternalPascalParser.g:3009:2: ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )* )
            {
            // InternalPascalParser.g:3009:2: ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )* )
            // InternalPascalParser.g:3010:3: ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )*
            {
            // InternalPascalParser.g:3010:3: ( (lv_constants_0_0= ruleconstant ) )
            // InternalPascalParser.g:3011:4: (lv_constants_0_0= ruleconstant )
            {
            // InternalPascalParser.g:3011:4: (lv_constants_0_0= ruleconstant )
            // InternalPascalParser.g:3012:5: lv_constants_0_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getConst_listAccess().getConstantsConstantParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_constants_0_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConst_listRule());
            					}
            					add(
            						current,
            						"constants",
            						lv_constants_0_0,
            						"org.xtext.compiler.pascal.Pascal.constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascalParser.g:3029:3: (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Comma) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPascalParser.g:3030:4: otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_10); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConst_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascalParser.g:3034:4: ( (lv_constants_2_0= ruleconstant ) )
            	    // InternalPascalParser.g:3035:5: (lv_constants_2_0= ruleconstant )
            	    {
            	    // InternalPascalParser.g:3035:5: (lv_constants_2_0= ruleconstant )
            	    // InternalPascalParser.g:3036:6: lv_constants_2_0= ruleconstant
            	    {

            	    						newCompositeNode(grammarAccess.getConst_listAccess().getConstantsConstantParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_constants_2_0=ruleconstant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConst_listRule());
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
            	    break;

            	default :
            	    break loop32;
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
    // $ANTLR end "ruleconst_list"


    // $ANTLR start "entryRuleunsigned_integer"
    // InternalPascalParser.g:3058:1: entryRuleunsigned_integer returns [String current=null] : iv_ruleunsigned_integer= ruleunsigned_integer EOF ;
    public final String entryRuleunsigned_integer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunsigned_integer = null;


        try {
            // InternalPascalParser.g:3058:56: (iv_ruleunsigned_integer= ruleunsigned_integer EOF )
            // InternalPascalParser.g:3059:2: iv_ruleunsigned_integer= ruleunsigned_integer EOF
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
    // InternalPascalParser.g:3065:1: ruleunsigned_integer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NUM_INT_0= RULE_NUM_INT ;
    public final AntlrDatatypeRuleToken ruleunsigned_integer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NUM_INT_0=null;


        	enterRule();

        try {
            // InternalPascalParser.g:3071:2: (this_NUM_INT_0= RULE_NUM_INT )
            // InternalPascalParser.g:3072:2: this_NUM_INT_0= RULE_NUM_INT
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


    // $ANTLR start "entryRuleadditive_operator"
    // InternalPascalParser.g:3082:1: entryRuleadditive_operator returns [String current=null] : iv_ruleadditive_operator= ruleadditive_operator EOF ;
    public final String entryRuleadditive_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleadditive_operator = null;


        try {
            // InternalPascalParser.g:3082:57: (iv_ruleadditive_operator= ruleadditive_operator EOF )
            // InternalPascalParser.g:3083:2: iv_ruleadditive_operator= ruleadditive_operator EOF
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
    // InternalPascalParser.g:3089:1: ruleadditive_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_OR_2= RULE_OR ) ;
    public final AntlrDatatypeRuleToken ruleadditive_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_MINUS_1=null;
        Token this_OR_2=null;


        	enterRule();

        try {
            // InternalPascalParser.g:3095:2: ( (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_OR_2= RULE_OR ) )
            // InternalPascalParser.g:3096:2: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_OR_2= RULE_OR )
            {
            // InternalPascalParser.g:3096:2: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_OR_2= RULE_OR )
            int alt33=3;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt33=1;
                }
                break;
            case RULE_MINUS:
                {
                alt33=2;
                }
                break;
            case RULE_OR:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalPascalParser.g:3097:3: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_2); 

                    			current.merge(this_PLUS_0);
                    		

                    			newLeafNode(this_PLUS_0, grammarAccess.getAdditive_operatorAccess().getPLUSTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:3105:3: this_MINUS_1= RULE_MINUS
                    {
                    this_MINUS_1=(Token)match(input,RULE_MINUS,FOLLOW_2); 

                    			current.merge(this_MINUS_1);
                    		

                    			newLeafNode(this_MINUS_1, grammarAccess.getAdditive_operatorAccess().getMINUSTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascalParser.g:3113:3: this_OR_2= RULE_OR
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
    // InternalPascalParser.g:3124:1: entryRulemultiplicative_operator returns [String current=null] : iv_rulemultiplicative_operator= rulemultiplicative_operator EOF ;
    public final String entryRulemultiplicative_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemultiplicative_operator = null;


        try {
            // InternalPascalParser.g:3124:63: (iv_rulemultiplicative_operator= rulemultiplicative_operator EOF )
            // InternalPascalParser.g:3125:2: iv_rulemultiplicative_operator= rulemultiplicative_operator EOF
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
    // InternalPascalParser.g:3131:1: rulemultiplicative_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_DIV_2= RULE_DIV | this_MOD_3= RULE_MOD | this_AND_4= RULE_AND ) ;
    public final AntlrDatatypeRuleToken rulemultiplicative_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STAR_0=null;
        Token this_SLASH_1=null;
        Token this_DIV_2=null;
        Token this_MOD_3=null;
        Token this_AND_4=null;


        	enterRule();

        try {
            // InternalPascalParser.g:3137:2: ( (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_DIV_2= RULE_DIV | this_MOD_3= RULE_MOD | this_AND_4= RULE_AND ) )
            // InternalPascalParser.g:3138:2: (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_DIV_2= RULE_DIV | this_MOD_3= RULE_MOD | this_AND_4= RULE_AND )
            {
            // InternalPascalParser.g:3138:2: (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_DIV_2= RULE_DIV | this_MOD_3= RULE_MOD | this_AND_4= RULE_AND )
            int alt34=5;
            switch ( input.LA(1) ) {
            case RULE_STAR:
                {
                alt34=1;
                }
                break;
            case RULE_SLASH:
                {
                alt34=2;
                }
                break;
            case RULE_DIV:
                {
                alt34=3;
                }
                break;
            case RULE_MOD:
                {
                alt34=4;
                }
                break;
            case RULE_AND:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalPascalParser.g:3139:3: this_STAR_0= RULE_STAR
                    {
                    this_STAR_0=(Token)match(input,RULE_STAR,FOLLOW_2); 

                    			current.merge(this_STAR_0);
                    		

                    			newLeafNode(this_STAR_0, grammarAccess.getMultiplicative_operatorAccess().getSTARTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:3147:3: this_SLASH_1= RULE_SLASH
                    {
                    this_SLASH_1=(Token)match(input,RULE_SLASH,FOLLOW_2); 

                    			current.merge(this_SLASH_1);
                    		

                    			newLeafNode(this_SLASH_1, grammarAccess.getMultiplicative_operatorAccess().getSLASHTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascalParser.g:3155:3: this_DIV_2= RULE_DIV
                    {
                    this_DIV_2=(Token)match(input,RULE_DIV,FOLLOW_2); 

                    			current.merge(this_DIV_2);
                    		

                    			newLeafNode(this_DIV_2, grammarAccess.getMultiplicative_operatorAccess().getDIVTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPascalParser.g:3163:3: this_MOD_3= RULE_MOD
                    {
                    this_MOD_3=(Token)match(input,RULE_MOD,FOLLOW_2); 

                    			current.merge(this_MOD_3);
                    		

                    			newLeafNode(this_MOD_3, grammarAccess.getMultiplicative_operatorAccess().getMODTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPascalParser.g:3171:3: this_AND_4= RULE_AND
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


    // $ANTLR start "entryRuleprocedure_and_function_declaration_part"
    // InternalPascalParser.g:3182:1: entryRuleprocedure_and_function_declaration_part returns [EObject current=null] : iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF ;
    public final EObject entryRuleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_and_function_declaration_part = null;


        try {
            // InternalPascalParser.g:3182:80: (iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF )
            // InternalPascalParser.g:3183:2: iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF
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
    // InternalPascalParser.g:3189:1: ruleprocedure_and_function_declaration_part returns [EObject current=null] : ( ( (lv_subroutine_0_0= ruleprocedure_or_function_declaration ) ) otherlv_1= Semicolon ) ;
    public final EObject ruleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_subroutine_0_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:3195:2: ( ( ( (lv_subroutine_0_0= ruleprocedure_or_function_declaration ) ) otherlv_1= Semicolon ) )
            // InternalPascalParser.g:3196:2: ( ( (lv_subroutine_0_0= ruleprocedure_or_function_declaration ) ) otherlv_1= Semicolon )
            {
            // InternalPascalParser.g:3196:2: ( ( (lv_subroutine_0_0= ruleprocedure_or_function_declaration ) ) otherlv_1= Semicolon )
            // InternalPascalParser.g:3197:3: ( (lv_subroutine_0_0= ruleprocedure_or_function_declaration ) ) otherlv_1= Semicolon
            {
            // InternalPascalParser.g:3197:3: ( (lv_subroutine_0_0= ruleprocedure_or_function_declaration ) )
            // InternalPascalParser.g:3198:4: (lv_subroutine_0_0= ruleprocedure_or_function_declaration )
            {
            // InternalPascalParser.g:3198:4: (lv_subroutine_0_0= ruleprocedure_or_function_declaration )
            // InternalPascalParser.g:3199:5: lv_subroutine_0_0= ruleprocedure_or_function_declaration
            {

            					newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getSubroutineProcedure_or_function_declarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_subroutine_0_0=ruleprocedure_or_function_declaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedure_and_function_declaration_partRule());
            					}
            					set(
            						current,
            						"subroutine",
            						lv_subroutine_0_0,
            						"org.xtext.compiler.pascal.Pascal.procedure_or_function_declaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,Semicolon,FOLLOW_2); 

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
    // InternalPascalParser.g:3224:1: entryRuleprocedure_or_function_declaration returns [EObject current=null] : iv_ruleprocedure_or_function_declaration= ruleprocedure_or_function_declaration EOF ;
    public final EObject entryRuleprocedure_or_function_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_or_function_declaration = null;


        try {
            // InternalPascalParser.g:3224:74: (iv_ruleprocedure_or_function_declaration= ruleprocedure_or_function_declaration EOF )
            // InternalPascalParser.g:3225:2: iv_ruleprocedure_or_function_declaration= ruleprocedure_or_function_declaration EOF
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
    // InternalPascalParser.g:3231:1: ruleprocedure_or_function_declaration returns [EObject current=null] : ( ( (lv_proc_0_0= ruleprocedure_declaration ) ) | ( (lv_func_1_0= rulefunction_declaration ) ) ) ;
    public final EObject ruleprocedure_or_function_declaration() throws RecognitionException {
        EObject current = null;

        EObject lv_proc_0_0 = null;

        EObject lv_func_1_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:3237:2: ( ( ( (lv_proc_0_0= ruleprocedure_declaration ) ) | ( (lv_func_1_0= rulefunction_declaration ) ) ) )
            // InternalPascalParser.g:3238:2: ( ( (lv_proc_0_0= ruleprocedure_declaration ) ) | ( (lv_func_1_0= rulefunction_declaration ) ) )
            {
            // InternalPascalParser.g:3238:2: ( ( (lv_proc_0_0= ruleprocedure_declaration ) ) | ( (lv_func_1_0= rulefunction_declaration ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Procedure) ) {
                alt35=1;
            }
            else if ( (LA35_0==Function) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalPascalParser.g:3239:3: ( (lv_proc_0_0= ruleprocedure_declaration ) )
                    {
                    // InternalPascalParser.g:3239:3: ( (lv_proc_0_0= ruleprocedure_declaration ) )
                    // InternalPascalParser.g:3240:4: (lv_proc_0_0= ruleprocedure_declaration )
                    {
                    // InternalPascalParser.g:3240:4: (lv_proc_0_0= ruleprocedure_declaration )
                    // InternalPascalParser.g:3241:5: lv_proc_0_0= ruleprocedure_declaration
                    {

                    					newCompositeNode(grammarAccess.getProcedure_or_function_declarationAccess().getProcProcedure_declarationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_proc_0_0=ruleprocedure_declaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedure_or_function_declarationRule());
                    					}
                    					set(
                    						current,
                    						"proc",
                    						lv_proc_0_0,
                    						"org.xtext.compiler.pascal.Pascal.procedure_declaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:3259:3: ( (lv_func_1_0= rulefunction_declaration ) )
                    {
                    // InternalPascalParser.g:3259:3: ( (lv_func_1_0= rulefunction_declaration ) )
                    // InternalPascalParser.g:3260:4: (lv_func_1_0= rulefunction_declaration )
                    {
                    // InternalPascalParser.g:3260:4: (lv_func_1_0= rulefunction_declaration )
                    // InternalPascalParser.g:3261:5: lv_func_1_0= rulefunction_declaration
                    {

                    					newCompositeNode(grammarAccess.getProcedure_or_function_declarationAccess().getFuncFunction_declarationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_func_1_0=rulefunction_declaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedure_or_function_declarationRule());
                    					}
                    					set(
                    						current,
                    						"func",
                    						lv_func_1_0,
                    						"org.xtext.compiler.pascal.Pascal.function_declaration");
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
    // $ANTLR end "ruleprocedure_or_function_declaration"


    // $ANTLR start "entryRuleprocedure_declaration"
    // InternalPascalParser.g:3282:1: entryRuleprocedure_declaration returns [EObject current=null] : iv_ruleprocedure_declaration= ruleprocedure_declaration EOF ;
    public final EObject entryRuleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_declaration = null;


        try {
            // InternalPascalParser.g:3282:62: (iv_ruleprocedure_declaration= ruleprocedure_declaration EOF )
            // InternalPascalParser.g:3283:2: iv_ruleprocedure_declaration= ruleprocedure_declaration EOF
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
    // InternalPascalParser.g:3289:1: ruleprocedure_declaration returns [EObject current=null] : ( ruleprocedure ( (lv_names_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Semicolon ( (lv_block_4_0= ruleblock ) ) ) ;
    public final EObject ruleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_names_1_0=null;
        Token otherlv_3=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:3295:2: ( ( ruleprocedure ( (lv_names_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Semicolon ( (lv_block_4_0= ruleblock ) ) ) )
            // InternalPascalParser.g:3296:2: ( ruleprocedure ( (lv_names_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Semicolon ( (lv_block_4_0= ruleblock ) ) )
            {
            // InternalPascalParser.g:3296:2: ( ruleprocedure ( (lv_names_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Semicolon ( (lv_block_4_0= ruleblock ) ) )
            // InternalPascalParser.g:3297:3: ruleprocedure ( (lv_names_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Semicolon ( (lv_block_4_0= ruleblock ) )
            {

            			newCompositeNode(grammarAccess.getProcedure_declarationAccess().getProcedureParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            ruleprocedure();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalPascalParser.g:3304:3: ( (lv_names_1_0= RULE_ID ) )
            // InternalPascalParser.g:3305:4: (lv_names_1_0= RULE_ID )
            {
            // InternalPascalParser.g:3305:4: (lv_names_1_0= RULE_ID )
            // InternalPascalParser.g:3306:5: lv_names_1_0= RULE_ID
            {
            lv_names_1_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(lv_names_1_0, grammarAccess.getProcedure_declarationAccess().getNamesIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcedure_declarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"names",
            						lv_names_1_0,
            						"org.xtext.compiler.pascal.Pascal.ID");
            				

            }


            }

            // InternalPascalParser.g:3322:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LeftParenthesis) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPascalParser.g:3323:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascalParser.g:3323:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalPascalParser.g:3324:5: lv_parameters_2_0= ruleformal_parameter_list
                    {

                    					newCompositeNode(grammarAccess.getProcedure_declarationAccess().getParametersFormal_parameter_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
                    					}
                    					set(
                    						current,
                    						"parameters",
                    						lv_parameters_2_0,
                    						"org.xtext.compiler.pascal.Pascal.formal_parameter_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,Semicolon,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_3());
            		
            // InternalPascalParser.g:3345:3: ( (lv_block_4_0= ruleblock ) )
            // InternalPascalParser.g:3346:4: (lv_block_4_0= ruleblock )
            {
            // InternalPascalParser.g:3346:4: (lv_block_4_0= ruleblock )
            // InternalPascalParser.g:3347:5: lv_block_4_0= ruleblock
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


    // $ANTLR start "entryRulefunction_declaration"
    // InternalPascalParser.g:3368:1: entryRulefunction_declaration returns [EObject current=null] : iv_rulefunction_declaration= rulefunction_declaration EOF ;
    public final EObject entryRulefunction_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_declaration = null;


        try {
            // InternalPascalParser.g:3368:61: (iv_rulefunction_declaration= rulefunction_declaration EOF )
            // InternalPascalParser.g:3369:2: iv_rulefunction_declaration= rulefunction_declaration EOF
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
    // InternalPascalParser.g:3375:1: rulefunction_declaration returns [EObject current=null] : ( rulefunction ( (lv_names_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_types_4_0= ruleresult_type ) ) otherlv_5= Semicolon ( (lv_block_6_0= ruleblock ) ) ) ;
    public final EObject rulefunction_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_names_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_types_4_0 = null;

        EObject lv_block_6_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:3381:2: ( ( rulefunction ( (lv_names_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_types_4_0= ruleresult_type ) ) otherlv_5= Semicolon ( (lv_block_6_0= ruleblock ) ) ) )
            // InternalPascalParser.g:3382:2: ( rulefunction ( (lv_names_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_types_4_0= ruleresult_type ) ) otherlv_5= Semicolon ( (lv_block_6_0= ruleblock ) ) )
            {
            // InternalPascalParser.g:3382:2: ( rulefunction ( (lv_names_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_types_4_0= ruleresult_type ) ) otherlv_5= Semicolon ( (lv_block_6_0= ruleblock ) ) )
            // InternalPascalParser.g:3383:3: rulefunction ( (lv_names_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_types_4_0= ruleresult_type ) ) otherlv_5= Semicolon ( (lv_block_6_0= ruleblock ) )
            {

            			newCompositeNode(grammarAccess.getFunction_declarationAccess().getFunctionParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            rulefunction();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalPascalParser.g:3390:3: ( (lv_names_1_0= RULE_ID ) )
            // InternalPascalParser.g:3391:4: (lv_names_1_0= RULE_ID )
            {
            // InternalPascalParser.g:3391:4: (lv_names_1_0= RULE_ID )
            // InternalPascalParser.g:3392:5: lv_names_1_0= RULE_ID
            {
            lv_names_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_names_1_0, grammarAccess.getFunction_declarationAccess().getNamesIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunction_declarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"names",
            						lv_names_1_0,
            						"org.xtext.compiler.pascal.Pascal.ID");
            				

            }


            }

            // InternalPascalParser.g:3408:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==LeftParenthesis) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPascalParser.g:3409:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascalParser.g:3409:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalPascalParser.g:3410:5: lv_parameters_2_0= ruleformal_parameter_list
                    {

                    					newCompositeNode(grammarAccess.getFunction_declarationAccess().getParametersFormal_parameter_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
                    					}
                    					set(
                    						current,
                    						"parameters",
                    						lv_parameters_2_0,
                    						"org.xtext.compiler.pascal.Pascal.formal_parameter_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,Colon,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getFunction_declarationAccess().getColonKeyword_3());
            		
            // InternalPascalParser.g:3431:3: ( (lv_types_4_0= ruleresult_type ) )
            // InternalPascalParser.g:3432:4: (lv_types_4_0= ruleresult_type )
            {
            // InternalPascalParser.g:3432:4: (lv_types_4_0= ruleresult_type )
            // InternalPascalParser.g:3433:5: lv_types_4_0= ruleresult_type
            {

            					newCompositeNode(grammarAccess.getFunction_declarationAccess().getTypesResult_typeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_types_4_0=ruleresult_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
            					}
            					set(
            						current,
            						"types",
            						lv_types_4_0,
            						"org.xtext.compiler.pascal.Pascal.result_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,Semicolon,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_5());
            		
            // InternalPascalParser.g:3454:3: ( (lv_block_6_0= ruleblock ) )
            // InternalPascalParser.g:3455:4: (lv_block_6_0= ruleblock )
            {
            // InternalPascalParser.g:3455:4: (lv_block_6_0= ruleblock )
            // InternalPascalParser.g:3456:5: lv_block_6_0= ruleblock
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


    // $ANTLR start "entryRulefunction_designator"
    // InternalPascalParser.g:3477:1: entryRulefunction_designator returns [EObject current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final EObject entryRulefunction_designator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_designator = null;


        try {
            // InternalPascalParser.g:3477:60: (iv_rulefunction_designator= rulefunction_designator EOF )
            // InternalPascalParser.g:3478:2: iv_rulefunction_designator= rulefunction_designator EOF
            {
             newCompositeNode(grammarAccess.getFunction_designatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_designator=rulefunction_designator();

            state._fsp--;

             current =iv_rulefunction_designator; 
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
    // $ANTLR end "entryRulefunction_designator"


    // $ANTLR start "rulefunction_designator"
    // InternalPascalParser.g:3484:1: rulefunction_designator returns [EObject current=null] : ( ( (lv_name_function_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_parameters_2_0= ruleparameter_list ) ) otherlv_3= RightParenthesis ) ;
    public final EObject rulefunction_designator() throws RecognitionException {
        EObject current = null;

        Token lv_name_function_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:3490:2: ( ( ( (lv_name_function_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_parameters_2_0= ruleparameter_list ) ) otherlv_3= RightParenthesis ) )
            // InternalPascalParser.g:3491:2: ( ( (lv_name_function_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_parameters_2_0= ruleparameter_list ) ) otherlv_3= RightParenthesis )
            {
            // InternalPascalParser.g:3491:2: ( ( (lv_name_function_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_parameters_2_0= ruleparameter_list ) ) otherlv_3= RightParenthesis )
            // InternalPascalParser.g:3492:3: ( (lv_name_function_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_parameters_2_0= ruleparameter_list ) ) otherlv_3= RightParenthesis
            {
            // InternalPascalParser.g:3492:3: ( (lv_name_function_0_0= RULE_ID ) )
            // InternalPascalParser.g:3493:4: (lv_name_function_0_0= RULE_ID )
            {
            // InternalPascalParser.g:3493:4: (lv_name_function_0_0= RULE_ID )
            // InternalPascalParser.g:3494:5: lv_name_function_0_0= RULE_ID
            {
            lv_name_function_0_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(lv_name_function_0_0, grammarAccess.getFunction_designatorAccess().getName_functionIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunction_designatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name_function",
            						lv_name_function_0_0,
            						"org.xtext.compiler.pascal.Pascal.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPascalParser.g:3514:3: ( (lv_parameters_2_0= ruleparameter_list ) )
            // InternalPascalParser.g:3515:4: (lv_parameters_2_0= ruleparameter_list )
            {
            // InternalPascalParser.g:3515:4: (lv_parameters_2_0= ruleparameter_list )
            // InternalPascalParser.g:3516:5: lv_parameters_2_0= ruleparameter_list
            {

            					newCompositeNode(grammarAccess.getFunction_designatorAccess().getParametersParameter_listParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_parameters_2_0=ruleparameter_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunction_designatorRule());
            					}
            					set(
            						current,
            						"parameters",
            						lv_parameters_2_0,
            						"org.xtext.compiler.pascal.Pascal.parameter_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "rulefunction_designator"


    // $ANTLR start "entryRuleformal_parameter_list"
    // InternalPascalParser.g:3541:1: entryRuleformal_parameter_list returns [EObject current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final EObject entryRuleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_list = null;


        try {
            // InternalPascalParser.g:3541:62: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // InternalPascalParser.g:3542:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
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
    // InternalPascalParser.g:3548:1: ruleformal_parameter_list returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis ) ;
    public final EObject ruleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:3554:2: ( (otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis ) )
            // InternalPascalParser.g:3555:2: (otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis )
            {
            // InternalPascalParser.g:3555:2: (otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis )
            // InternalPascalParser.g:3556:3: otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0());
            		
            // InternalPascalParser.g:3560:3: ( (lv_parameters_1_0= ruleformal_parameter_section ) )
            // InternalPascalParser.g:3561:4: (lv_parameters_1_0= ruleformal_parameter_section )
            {
            // InternalPascalParser.g:3561:4: (lv_parameters_1_0= ruleformal_parameter_section )
            // InternalPascalParser.g:3562:5: lv_parameters_1_0= ruleformal_parameter_section
            {

            					newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
            lv_parameters_1_0=ruleformal_parameter_section();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_1_0,
            						"org.xtext.compiler.pascal.Pascal.formal_parameter_section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascalParser.g:3579:3: (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==Semicolon) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalPascalParser.g:3580:4: otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    {
            	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_38); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalPascalParser.g:3584:4: ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    // InternalPascalParser.g:3585:5: (lv_parameters_3_0= ruleformal_parameter_section )
            	    {
            	    // InternalPascalParser.g:3585:5: (lv_parameters_3_0= ruleformal_parameter_section )
            	    // InternalPascalParser.g:3586:6: lv_parameters_3_0= ruleformal_parameter_section
            	    {

            	    						newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_parameters_3_0=ruleformal_parameter_section();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_3_0,
            	    							"org.xtext.compiler.pascal.Pascal.formal_parameter_section");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); 

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
    // InternalPascalParser.g:3612:1: entryRuleformal_parameter_section returns [EObject current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final EObject entryRuleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_section = null;


        try {
            // InternalPascalParser.g:3612:65: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // InternalPascalParser.g:3613:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
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
    // InternalPascalParser.g:3619:1: ruleformal_parameter_section returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleparameter_group ) ) | (otherlv_1= Var ( (lv_parameters_2_0= ruleparameter_group ) ) ) | ( rulefunction ( (lv_parameters_4_0= ruleparameter_group ) ) ) | ( ruleprocedure ( (lv_parameters_6_0= ruleparameter_group ) ) ) ) ;
    public final EObject ruleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:3625:2: ( ( ( (lv_parameters_0_0= ruleparameter_group ) ) | (otherlv_1= Var ( (lv_parameters_2_0= ruleparameter_group ) ) ) | ( rulefunction ( (lv_parameters_4_0= ruleparameter_group ) ) ) | ( ruleprocedure ( (lv_parameters_6_0= ruleparameter_group ) ) ) ) )
            // InternalPascalParser.g:3626:2: ( ( (lv_parameters_0_0= ruleparameter_group ) ) | (otherlv_1= Var ( (lv_parameters_2_0= ruleparameter_group ) ) ) | ( rulefunction ( (lv_parameters_4_0= ruleparameter_group ) ) ) | ( ruleprocedure ( (lv_parameters_6_0= ruleparameter_group ) ) ) )
            {
            // InternalPascalParser.g:3626:2: ( ( (lv_parameters_0_0= ruleparameter_group ) ) | (otherlv_1= Var ( (lv_parameters_2_0= ruleparameter_group ) ) ) | ( rulefunction ( (lv_parameters_4_0= ruleparameter_group ) ) ) | ( ruleprocedure ( (lv_parameters_6_0= ruleparameter_group ) ) ) )
            int alt39=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt39=1;
                }
                break;
            case Var:
                {
                alt39=2;
                }
                break;
            case Function:
                {
                alt39=3;
                }
                break;
            case Procedure:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalPascalParser.g:3627:3: ( (lv_parameters_0_0= ruleparameter_group ) )
                    {
                    // InternalPascalParser.g:3627:3: ( (lv_parameters_0_0= ruleparameter_group ) )
                    // InternalPascalParser.g:3628:4: (lv_parameters_0_0= ruleparameter_group )
                    {
                    // InternalPascalParser.g:3628:4: (lv_parameters_0_0= ruleparameter_group )
                    // InternalPascalParser.g:3629:5: lv_parameters_0_0= ruleparameter_group
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getParametersParameter_groupParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parameters_0_0=ruleparameter_group();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    					}
                    					add(
                    						current,
                    						"parameters",
                    						lv_parameters_0_0,
                    						"org.xtext.compiler.pascal.Pascal.parameter_group");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:3647:3: (otherlv_1= Var ( (lv_parameters_2_0= ruleparameter_group ) ) )
                    {
                    // InternalPascalParser.g:3647:3: (otherlv_1= Var ( (lv_parameters_2_0= ruleparameter_group ) ) )
                    // InternalPascalParser.g:3648:4: otherlv_1= Var ( (lv_parameters_2_0= ruleparameter_group ) )
                    {
                    otherlv_1=(Token)match(input,Var,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getFormal_parameter_sectionAccess().getVarKeyword_1_0());
                    			
                    // InternalPascalParser.g:3652:4: ( (lv_parameters_2_0= ruleparameter_group ) )
                    // InternalPascalParser.g:3653:5: (lv_parameters_2_0= ruleparameter_group )
                    {
                    // InternalPascalParser.g:3653:5: (lv_parameters_2_0= ruleparameter_group )
                    // InternalPascalParser.g:3654:6: lv_parameters_2_0= ruleparameter_group
                    {

                    						newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getParametersParameter_groupParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parameters_2_0=ruleparameter_group();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_2_0,
                    							"org.xtext.compiler.pascal.Pascal.parameter_group");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascalParser.g:3673:3: ( rulefunction ( (lv_parameters_4_0= ruleparameter_group ) ) )
                    {
                    // InternalPascalParser.g:3673:3: ( rulefunction ( (lv_parameters_4_0= ruleparameter_group ) ) )
                    // InternalPascalParser.g:3674:4: rulefunction ( (lv_parameters_4_0= ruleparameter_group ) )
                    {

                    				newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getFunctionParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_5);
                    rulefunction();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalPascalParser.g:3681:4: ( (lv_parameters_4_0= ruleparameter_group ) )
                    // InternalPascalParser.g:3682:5: (lv_parameters_4_0= ruleparameter_group )
                    {
                    // InternalPascalParser.g:3682:5: (lv_parameters_4_0= ruleparameter_group )
                    // InternalPascalParser.g:3683:6: lv_parameters_4_0= ruleparameter_group
                    {

                    						newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getParametersParameter_groupParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parameters_4_0=ruleparameter_group();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"org.xtext.compiler.pascal.Pascal.parameter_group");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascalParser.g:3702:3: ( ruleprocedure ( (lv_parameters_6_0= ruleparameter_group ) ) )
                    {
                    // InternalPascalParser.g:3702:3: ( ruleprocedure ( (lv_parameters_6_0= ruleparameter_group ) ) )
                    // InternalPascalParser.g:3703:4: ruleprocedure ( (lv_parameters_6_0= ruleparameter_group ) )
                    {

                    				newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getProcedureParserRuleCall_3_0());
                    			
                    pushFollow(FOLLOW_5);
                    ruleprocedure();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalPascalParser.g:3710:4: ( (lv_parameters_6_0= ruleparameter_group ) )
                    // InternalPascalParser.g:3711:5: (lv_parameters_6_0= ruleparameter_group )
                    {
                    // InternalPascalParser.g:3711:5: (lv_parameters_6_0= ruleparameter_group )
                    // InternalPascalParser.g:3712:6: lv_parameters_6_0= ruleparameter_group
                    {

                    						newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getParametersParameter_groupParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parameters_6_0=ruleparameter_group();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_6_0,
                    							"org.xtext.compiler.pascal.Pascal.parameter_group");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleformal_parameter_section"


    // $ANTLR start "entryRuleparameter_group"
    // InternalPascalParser.g:3734:1: entryRuleparameter_group returns [EObject current=null] : iv_ruleparameter_group= ruleparameter_group EOF ;
    public final EObject entryRuleparameter_group() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_group = null;


        try {
            // InternalPascalParser.g:3734:56: (iv_ruleparameter_group= ruleparameter_group EOF )
            // InternalPascalParser.g:3735:2: iv_ruleparameter_group= ruleparameter_group EOF
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
    // InternalPascalParser.g:3741:1: ruleparameter_group returns [EObject current=null] : ( ( (lv_names_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_types_2_0= ruletype_identifier ) ) ) ;
    public final EObject ruleparameter_group() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_names_0_0 = null;

        EObject lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:3747:2: ( ( ( (lv_names_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_types_2_0= ruletype_identifier ) ) ) )
            // InternalPascalParser.g:3748:2: ( ( (lv_names_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_types_2_0= ruletype_identifier ) ) )
            {
            // InternalPascalParser.g:3748:2: ( ( (lv_names_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_types_2_0= ruletype_identifier ) ) )
            // InternalPascalParser.g:3749:3: ( (lv_names_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_types_2_0= ruletype_identifier ) )
            {
            // InternalPascalParser.g:3749:3: ( (lv_names_0_0= ruleidentifier_list ) )
            // InternalPascalParser.g:3750:4: (lv_names_0_0= ruleidentifier_list )
            {
            // InternalPascalParser.g:3750:4: (lv_names_0_0= ruleidentifier_list )
            // InternalPascalParser.g:3751:5: lv_names_0_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getParameter_groupAccess().getNamesIdentifier_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_names_0_0=ruleidentifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameter_groupRule());
            					}
            					set(
            						current,
            						"names",
            						lv_names_0_0,
            						"org.xtext.compiler.pascal.Pascal.identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getParameter_groupAccess().getColonKeyword_1());
            		
            // InternalPascalParser.g:3772:3: ( (lv_types_2_0= ruletype_identifier ) )
            // InternalPascalParser.g:3773:4: (lv_types_2_0= ruletype_identifier )
            {
            // InternalPascalParser.g:3773:4: (lv_types_2_0= ruletype_identifier )
            // InternalPascalParser.g:3774:5: lv_types_2_0= ruletype_identifier
            {

            					newCompositeNode(grammarAccess.getParameter_groupAccess().getTypesType_identifierParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_types_2_0=ruletype_identifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameter_groupRule());
            					}
            					set(
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
    // InternalPascalParser.g:3795:1: entryRuleresult_type returns [EObject current=null] : iv_ruleresult_type= ruleresult_type EOF ;
    public final EObject entryRuleresult_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleresult_type = null;


        try {
            // InternalPascalParser.g:3795:52: (iv_ruleresult_type= ruleresult_type EOF )
            // InternalPascalParser.g:3796:2: iv_ruleresult_type= ruleresult_type EOF
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
    // InternalPascalParser.g:3802:1: ruleresult_type returns [EObject current=null] : this_type_identifier_0= ruletype_identifier ;
    public final EObject ruleresult_type() throws RecognitionException {
        EObject current = null;

        EObject this_type_identifier_0 = null;



        	enterRule();

        try {
            // InternalPascalParser.g:3808:2: (this_type_identifier_0= ruletype_identifier )
            // InternalPascalParser.g:3809:2: this_type_identifier_0= ruletype_identifier
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
    // InternalPascalParser.g:3820:1: entryRulebool returns [String current=null] : iv_rulebool= rulebool EOF ;
    public final String entryRulebool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebool = null;


        try {
            // InternalPascalParser.g:3820:44: (iv_rulebool= rulebool EOF )
            // InternalPascalParser.g:3821:2: iv_rulebool= rulebool EOF
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
    // InternalPascalParser.g:3827:1: rulebool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken rulebool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascalParser.g:3833:2: ( (kw= True | kw= False ) )
            // InternalPascalParser.g:3834:2: (kw= True | kw= False )
            {
            // InternalPascalParser.g:3834:2: (kw= True | kw= False )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==True) ) {
                alt40=1;
            }
            else if ( (LA40_0==False) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalPascalParser.g:3835:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:3841:3: kw= False
                    {
                    kw=(Token)match(input,False,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolAccess().getFalseKeyword_1());
                    		

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


    // $ANTLR start "entryRuleprocedure"
    // InternalPascalParser.g:3850:1: entryRuleprocedure returns [String current=null] : iv_ruleprocedure= ruleprocedure EOF ;
    public final String entryRuleprocedure() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprocedure = null;


        try {
            // InternalPascalParser.g:3850:49: (iv_ruleprocedure= ruleprocedure EOF )
            // InternalPascalParser.g:3851:2: iv_ruleprocedure= ruleprocedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure=ruleprocedure();

            state._fsp--;

             current =iv_ruleprocedure.getText(); 
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
    // $ANTLR end "entryRuleprocedure"


    // $ANTLR start "ruleprocedure"
    // InternalPascalParser.g:3857:1: ruleprocedure returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Procedure ;
    public final AntlrDatatypeRuleToken ruleprocedure() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascalParser.g:3863:2: (kw= Procedure )
            // InternalPascalParser.g:3864:2: kw= Procedure
            {
            kw=(Token)match(input,Procedure,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getProcedureAccess().getProcedureKeyword());
            	

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
    // $ANTLR end "ruleprocedure"


    // $ANTLR start "entryRulefunction"
    // InternalPascalParser.g:3872:1: entryRulefunction returns [String current=null] : iv_rulefunction= rulefunction EOF ;
    public final String entryRulefunction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefunction = null;


        try {
            // InternalPascalParser.g:3872:48: (iv_rulefunction= rulefunction EOF )
            // InternalPascalParser.g:3873:2: iv_rulefunction= rulefunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction=rulefunction();

            state._fsp--;

             current =iv_rulefunction.getText(); 
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
    // $ANTLR end "entryRulefunction"


    // $ANTLR start "rulefunction"
    // InternalPascalParser.g:3879:1: rulefunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Function ;
    public final AntlrDatatypeRuleToken rulefunction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascalParser.g:3885:2: (kw= Function )
            // InternalPascalParser.g:3886:2: kw= Function
            {
            kw=(Token)match(input,Function,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFunctionAccess().getFunctionKeyword());
            	

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
    // $ANTLR end "rulefunction"


    // $ANTLR start "entryRulesign"
    // InternalPascalParser.g:3894:1: entryRulesign returns [String current=null] : iv_rulesign= rulesign EOF ;
    public final String entryRulesign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesign = null;


        try {
            // InternalPascalParser.g:3894:44: (iv_rulesign= rulesign EOF )
            // InternalPascalParser.g:3895:2: iv_rulesign= rulesign EOF
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
    // InternalPascalParser.g:3901:1: rulesign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS ) ;
    public final AntlrDatatypeRuleToken rulesign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_MINUS_1=null;


        	enterRule();

        try {
            // InternalPascalParser.g:3907:2: ( (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS ) )
            // InternalPascalParser.g:3908:2: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS )
            {
            // InternalPascalParser.g:3908:2: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_PLUS) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_MINUS) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalPascalParser.g:3909:3: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_2); 

                    			current.merge(this_PLUS_0);
                    		

                    			newLeafNode(this_PLUS_0, grammarAccess.getSignAccess().getPLUSTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascalParser.g:3917:3: this_MINUS_1= RULE_MINUS
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000A1830L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001A30000012000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001A300000126C0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00008000300A5830L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001A30A20812000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000144100002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000B0000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000004F000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00008000000002C0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001A300000122C0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010048000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00008000200A5830L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00008000000A1030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000011000000L});

}