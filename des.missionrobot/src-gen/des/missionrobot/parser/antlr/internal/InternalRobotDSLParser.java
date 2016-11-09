package des.missionrobot.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import des.missionrobot.services.RobotDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRobotDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Behavior'", "'priority'", "'movements:'", "'ForwardSpeed:'", "'BackwardSpeed:'", "'TurnAngle:'", "'WaitFor:'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalRobotDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRobotDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRobotDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRobotDSL.g"; }



     	private RobotDSLGrammarAccess grammarAccess;

        public InternalRobotDSLParser(TokenStream input, RobotDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Behaviour";
       	}

       	@Override
       	protected RobotDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBehaviour"
    // InternalRobotDSL.g:64:1: entryRuleBehaviour returns [EObject current=null] : iv_ruleBehaviour= ruleBehaviour EOF ;
    public final EObject entryRuleBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviour = null;


        try {
            // InternalRobotDSL.g:64:50: (iv_ruleBehaviour= ruleBehaviour EOF )
            // InternalRobotDSL.g:65:2: iv_ruleBehaviour= ruleBehaviour EOF
            {
             newCompositeNode(grammarAccess.getBehaviourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviour=ruleBehaviour();

            state._fsp--;

             current =iv_ruleBehaviour; 
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
    // $ANTLR end "entryRuleBehaviour"


    // $ANTLR start "ruleBehaviour"
    // InternalRobotDSL.g:71:1: ruleBehaviour returns [EObject current=null] : (otherlv_0= 'Behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_prio_3_0= RULE_INT ) ) otherlv_4= 'movements:' ( (lv_moves_5_0= ruleMovement ) ) ) ;
    public final EObject ruleBehaviour() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_prio_3_0=null;
        Token otherlv_4=null;
        EObject lv_moves_5_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:77:2: ( (otherlv_0= 'Behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_prio_3_0= RULE_INT ) ) otherlv_4= 'movements:' ( (lv_moves_5_0= ruleMovement ) ) ) )
            // InternalRobotDSL.g:78:2: (otherlv_0= 'Behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_prio_3_0= RULE_INT ) ) otherlv_4= 'movements:' ( (lv_moves_5_0= ruleMovement ) ) )
            {
            // InternalRobotDSL.g:78:2: (otherlv_0= 'Behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_prio_3_0= RULE_INT ) ) otherlv_4= 'movements:' ( (lv_moves_5_0= ruleMovement ) ) )
            // InternalRobotDSL.g:79:3: otherlv_0= 'Behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority' ( (lv_prio_3_0= RULE_INT ) ) otherlv_4= 'movements:' ( (lv_moves_5_0= ruleMovement ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBehaviourAccess().getBehaviorKeyword_0());
            		
            // InternalRobotDSL.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRobotDSL.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRobotDSL.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalRobotDSL.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBehaviourAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBehaviourRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviourAccess().getPriorityKeyword_2());
            		
            // InternalRobotDSL.g:105:3: ( (lv_prio_3_0= RULE_INT ) )
            // InternalRobotDSL.g:106:4: (lv_prio_3_0= RULE_INT )
            {
            // InternalRobotDSL.g:106:4: (lv_prio_3_0= RULE_INT )
            // InternalRobotDSL.g:107:5: lv_prio_3_0= RULE_INT
            {
            lv_prio_3_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_prio_3_0, grammarAccess.getBehaviourAccess().getPrioINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBehaviourRule());
            					}
            					setWithLastConsumed(
            						current,
            						"prio",
            						lv_prio_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getBehaviourAccess().getMovementsKeyword_4());
            		
            // InternalRobotDSL.g:127:3: ( (lv_moves_5_0= ruleMovement ) )
            // InternalRobotDSL.g:128:4: (lv_moves_5_0= ruleMovement )
            {
            // InternalRobotDSL.g:128:4: (lv_moves_5_0= ruleMovement )
            // InternalRobotDSL.g:129:5: lv_moves_5_0= ruleMovement
            {

            					newCompositeNode(grammarAccess.getBehaviourAccess().getMovesMovementParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_moves_5_0=ruleMovement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviourRule());
            					}
            					set(
            						current,
            						"moves",
            						lv_moves_5_0,
            						"des.missionrobot.RobotDSL.Movement");
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
    // $ANTLR end "ruleBehaviour"


    // $ANTLR start "entryRuleMovement"
    // InternalRobotDSL.g:150:1: entryRuleMovement returns [EObject current=null] : iv_ruleMovement= ruleMovement EOF ;
    public final EObject entryRuleMovement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovement = null;


        try {
            // InternalRobotDSL.g:150:49: (iv_ruleMovement= ruleMovement EOF )
            // InternalRobotDSL.g:151:2: iv_ruleMovement= ruleMovement EOF
            {
             newCompositeNode(grammarAccess.getMovementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMovement=ruleMovement();

            state._fsp--;

             current =iv_ruleMovement; 
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
    // $ANTLR end "entryRuleMovement"


    // $ANTLR start "ruleMovement"
    // InternalRobotDSL.g:157:1: ruleMovement returns [EObject current=null] : (this_MoveForward_0= ruleMoveForward | this_MoveBackward_1= ruleMoveBackward | this_Turn_2= ruleTurn | this_Stop_3= ruleStop ) ;
    public final EObject ruleMovement() throws RecognitionException {
        EObject current = null;

        EObject this_MoveForward_0 = null;

        EObject this_MoveBackward_1 = null;

        EObject this_Turn_2 = null;

        EObject this_Stop_3 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:163:2: ( (this_MoveForward_0= ruleMoveForward | this_MoveBackward_1= ruleMoveBackward | this_Turn_2= ruleTurn | this_Stop_3= ruleStop ) )
            // InternalRobotDSL.g:164:2: (this_MoveForward_0= ruleMoveForward | this_MoveBackward_1= ruleMoveBackward | this_Turn_2= ruleTurn | this_Stop_3= ruleStop )
            {
            // InternalRobotDSL.g:164:2: (this_MoveForward_0= ruleMoveForward | this_MoveBackward_1= ruleMoveBackward | this_Turn_2= ruleTurn | this_Stop_3= ruleStop )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 16:
                {
                alt1=3;
                }
                break;
            case 17:
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
                    // InternalRobotDSL.g:165:3: this_MoveForward_0= ruleMoveForward
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getMoveForwardParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveForward_0=ruleMoveForward();

                    state._fsp--;


                    			current = this_MoveForward_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:174:3: this_MoveBackward_1= ruleMoveBackward
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getMoveBackwardParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveBackward_1=ruleMoveBackward();

                    state._fsp--;


                    			current = this_MoveBackward_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:183:3: this_Turn_2= ruleTurn
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getTurnParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Turn_2=ruleTurn();

                    state._fsp--;


                    			current = this_Turn_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:192:3: this_Stop_3= ruleStop
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getStopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Stop_3=ruleStop();

                    state._fsp--;


                    			current = this_Stop_3;
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
    // $ANTLR end "ruleMovement"


    // $ANTLR start "entryRuleMoveForward"
    // InternalRobotDSL.g:204:1: entryRuleMoveForward returns [EObject current=null] : iv_ruleMoveForward= ruleMoveForward EOF ;
    public final EObject entryRuleMoveForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveForward = null;


        try {
            // InternalRobotDSL.g:204:52: (iv_ruleMoveForward= ruleMoveForward EOF )
            // InternalRobotDSL.g:205:2: iv_ruleMoveForward= ruleMoveForward EOF
            {
             newCompositeNode(grammarAccess.getMoveForwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveForward=ruleMoveForward();

            state._fsp--;

             current =iv_ruleMoveForward; 
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
    // $ANTLR end "entryRuleMoveForward"


    // $ANTLR start "ruleMoveForward"
    // InternalRobotDSL.g:211:1: ruleMoveForward returns [EObject current=null] : (otherlv_0= 'ForwardSpeed:' ( (lv_fspeed_1_0= RULE_INT ) ) ) ;
    public final EObject ruleMoveForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fspeed_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:217:2: ( (otherlv_0= 'ForwardSpeed:' ( (lv_fspeed_1_0= RULE_INT ) ) ) )
            // InternalRobotDSL.g:218:2: (otherlv_0= 'ForwardSpeed:' ( (lv_fspeed_1_0= RULE_INT ) ) )
            {
            // InternalRobotDSL.g:218:2: (otherlv_0= 'ForwardSpeed:' ( (lv_fspeed_1_0= RULE_INT ) ) )
            // InternalRobotDSL.g:219:3: otherlv_0= 'ForwardSpeed:' ( (lv_fspeed_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveForwardAccess().getForwardSpeedKeyword_0());
            		
            // InternalRobotDSL.g:223:3: ( (lv_fspeed_1_0= RULE_INT ) )
            // InternalRobotDSL.g:224:4: (lv_fspeed_1_0= RULE_INT )
            {
            // InternalRobotDSL.g:224:4: (lv_fspeed_1_0= RULE_INT )
            // InternalRobotDSL.g:225:5: lv_fspeed_1_0= RULE_INT
            {
            lv_fspeed_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_fspeed_1_0, grammarAccess.getMoveForwardAccess().getFspeedINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveForwardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fspeed",
            						lv_fspeed_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleMoveForward"


    // $ANTLR start "entryRuleMoveBackward"
    // InternalRobotDSL.g:245:1: entryRuleMoveBackward returns [EObject current=null] : iv_ruleMoveBackward= ruleMoveBackward EOF ;
    public final EObject entryRuleMoveBackward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveBackward = null;


        try {
            // InternalRobotDSL.g:245:53: (iv_ruleMoveBackward= ruleMoveBackward EOF )
            // InternalRobotDSL.g:246:2: iv_ruleMoveBackward= ruleMoveBackward EOF
            {
             newCompositeNode(grammarAccess.getMoveBackwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveBackward=ruleMoveBackward();

            state._fsp--;

             current =iv_ruleMoveBackward; 
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
    // $ANTLR end "entryRuleMoveBackward"


    // $ANTLR start "ruleMoveBackward"
    // InternalRobotDSL.g:252:1: ruleMoveBackward returns [EObject current=null] : (otherlv_0= 'BackwardSpeed:' ( (lv_bspeed_1_0= RULE_INT ) ) ) ;
    public final EObject ruleMoveBackward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_bspeed_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:258:2: ( (otherlv_0= 'BackwardSpeed:' ( (lv_bspeed_1_0= RULE_INT ) ) ) )
            // InternalRobotDSL.g:259:2: (otherlv_0= 'BackwardSpeed:' ( (lv_bspeed_1_0= RULE_INT ) ) )
            {
            // InternalRobotDSL.g:259:2: (otherlv_0= 'BackwardSpeed:' ( (lv_bspeed_1_0= RULE_INT ) ) )
            // InternalRobotDSL.g:260:3: otherlv_0= 'BackwardSpeed:' ( (lv_bspeed_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveBackwardAccess().getBackwardSpeedKeyword_0());
            		
            // InternalRobotDSL.g:264:3: ( (lv_bspeed_1_0= RULE_INT ) )
            // InternalRobotDSL.g:265:4: (lv_bspeed_1_0= RULE_INT )
            {
            // InternalRobotDSL.g:265:4: (lv_bspeed_1_0= RULE_INT )
            // InternalRobotDSL.g:266:5: lv_bspeed_1_0= RULE_INT
            {
            lv_bspeed_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_bspeed_1_0, grammarAccess.getMoveBackwardAccess().getBspeedINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveBackwardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bspeed",
            						lv_bspeed_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleMoveBackward"


    // $ANTLR start "entryRuleTurn"
    // InternalRobotDSL.g:286:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalRobotDSL.g:286:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalRobotDSL.g:287:2: iv_ruleTurn= ruleTurn EOF
            {
             newCompositeNode(grammarAccess.getTurnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurn=ruleTurn();

            state._fsp--;

             current =iv_ruleTurn; 
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
    // $ANTLR end "entryRuleTurn"


    // $ANTLR start "ruleTurn"
    // InternalRobotDSL.g:293:1: ruleTurn returns [EObject current=null] : (otherlv_0= 'TurnAngle:' ( (lv_angle_1_0= RULE_INT ) ) ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_angle_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:299:2: ( (otherlv_0= 'TurnAngle:' ( (lv_angle_1_0= RULE_INT ) ) ) )
            // InternalRobotDSL.g:300:2: (otherlv_0= 'TurnAngle:' ( (lv_angle_1_0= RULE_INT ) ) )
            {
            // InternalRobotDSL.g:300:2: (otherlv_0= 'TurnAngle:' ( (lv_angle_1_0= RULE_INT ) ) )
            // InternalRobotDSL.g:301:3: otherlv_0= 'TurnAngle:' ( (lv_angle_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnAccess().getTurnAngleKeyword_0());
            		
            // InternalRobotDSL.g:305:3: ( (lv_angle_1_0= RULE_INT ) )
            // InternalRobotDSL.g:306:4: (lv_angle_1_0= RULE_INT )
            {
            // InternalRobotDSL.g:306:4: (lv_angle_1_0= RULE_INT )
            // InternalRobotDSL.g:307:5: lv_angle_1_0= RULE_INT
            {
            lv_angle_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_angle_1_0, grammarAccess.getTurnAccess().getAngleINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTurnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"angle",
            						lv_angle_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleTurn"


    // $ANTLR start "entryRuleStop"
    // InternalRobotDSL.g:327:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalRobotDSL.g:327:45: (iv_ruleStop= ruleStop EOF )
            // InternalRobotDSL.g:328:2: iv_ruleStop= ruleStop EOF
            {
             newCompositeNode(grammarAccess.getStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStop=ruleStop();

            state._fsp--;

             current =iv_ruleStop; 
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
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // InternalRobotDSL.g:334:1: ruleStop returns [EObject current=null] : (otherlv_0= 'WaitFor:' ( (lv_duration_1_0= RULE_INT ) ) ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_duration_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:340:2: ( (otherlv_0= 'WaitFor:' ( (lv_duration_1_0= RULE_INT ) ) ) )
            // InternalRobotDSL.g:341:2: (otherlv_0= 'WaitFor:' ( (lv_duration_1_0= RULE_INT ) ) )
            {
            // InternalRobotDSL.g:341:2: (otherlv_0= 'WaitFor:' ( (lv_duration_1_0= RULE_INT ) ) )
            // InternalRobotDSL.g:342:3: otherlv_0= 'WaitFor:' ( (lv_duration_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStopAccess().getWaitForKeyword_0());
            		
            // InternalRobotDSL.g:346:3: ( (lv_duration_1_0= RULE_INT ) )
            // InternalRobotDSL.g:347:4: (lv_duration_1_0= RULE_INT )
            {
            // InternalRobotDSL.g:347:4: (lv_duration_1_0= RULE_INT )
            // InternalRobotDSL.g:348:5: lv_duration_1_0= RULE_INT
            {
            lv_duration_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_duration_1_0, grammarAccess.getStopAccess().getDurationINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleStop"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000003C000L});

}