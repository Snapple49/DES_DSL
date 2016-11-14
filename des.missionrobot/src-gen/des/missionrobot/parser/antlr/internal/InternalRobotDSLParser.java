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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mission'", "'Behaviours:'", "'Goal:'", "'Behavior:'", "'priority:'", "'devices:'", "'actions:'", "'trigger:'", "'ForwardSpeed:'", "'BackwardSpeed:'", "'TurnAngle:'", "'WaitFor:'", "'PlaySound:'", "'PrintMessage'", "'Condition'", "'Device:'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
        	return "Mission";
       	}

       	@Override
       	protected RobotDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMission"
    // InternalRobotDSL.g:64:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalRobotDSL.g:64:48: (iv_ruleMission= ruleMission EOF )
            // InternalRobotDSL.g:65:2: iv_ruleMission= ruleMission EOF
            {
             newCompositeNode(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMission=ruleMission();

            state._fsp--;

             current =iv_ruleMission; 
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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalRobotDSL.g:71:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Behaviours:' ( (lv_behaviourList_3_0= ruleBehaviour ) )+ otherlv_4= 'Goal:' ( (lv_goalCondition_5_0= ruleTrigger ) )+ ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_behaviourList_3_0 = null;

        EObject lv_goalCondition_5_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:77:2: ( (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Behaviours:' ( (lv_behaviourList_3_0= ruleBehaviour ) )+ otherlv_4= 'Goal:' ( (lv_goalCondition_5_0= ruleTrigger ) )+ ) )
            // InternalRobotDSL.g:78:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Behaviours:' ( (lv_behaviourList_3_0= ruleBehaviour ) )+ otherlv_4= 'Goal:' ( (lv_goalCondition_5_0= ruleTrigger ) )+ )
            {
            // InternalRobotDSL.g:78:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Behaviours:' ( (lv_behaviourList_3_0= ruleBehaviour ) )+ otherlv_4= 'Goal:' ( (lv_goalCondition_5_0= ruleTrigger ) )+ )
            // InternalRobotDSL.g:79:3: otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Behaviours:' ( (lv_behaviourList_3_0= ruleBehaviour ) )+ otherlv_4= 'Goal:' ( (lv_goalCondition_5_0= ruleTrigger ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalRobotDSL.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRobotDSL.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRobotDSL.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalRobotDSL.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getBehavioursKeyword_2());
            		
            // InternalRobotDSL.g:105:3: ( (lv_behaviourList_3_0= ruleBehaviour ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRobotDSL.g:106:4: (lv_behaviourList_3_0= ruleBehaviour )
            	    {
            	    // InternalRobotDSL.g:106:4: (lv_behaviourList_3_0= ruleBehaviour )
            	    // InternalRobotDSL.g:107:5: lv_behaviourList_3_0= ruleBehaviour
            	    {

            	    					newCompositeNode(grammarAccess.getMissionAccess().getBehaviourListBehaviourParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_behaviourList_3_0=ruleBehaviour();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMissionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"behaviourList",
            	    						lv_behaviourList_3_0,
            	    						"des.missionrobot.RobotDSL.Behaviour");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getGoalKeyword_4());
            		
            // InternalRobotDSL.g:128:3: ( (lv_goalCondition_5_0= ruleTrigger ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRobotDSL.g:129:4: (lv_goalCondition_5_0= ruleTrigger )
            	    {
            	    // InternalRobotDSL.g:129:4: (lv_goalCondition_5_0= ruleTrigger )
            	    // InternalRobotDSL.g:130:5: lv_goalCondition_5_0= ruleTrigger
            	    {

            	    					newCompositeNode(grammarAccess.getMissionAccess().getGoalConditionTriggerParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_goalCondition_5_0=ruleTrigger();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMissionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"goalCondition",
            	    						lv_goalCondition_5_0,
            	    						"des.missionrobot.RobotDSL.Trigger");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleBehaviour"
    // InternalRobotDSL.g:151:1: entryRuleBehaviour returns [EObject current=null] : iv_ruleBehaviour= ruleBehaviour EOF ;
    public final EObject entryRuleBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviour = null;


        try {
            // InternalRobotDSL.g:151:50: (iv_ruleBehaviour= ruleBehaviour EOF )
            // InternalRobotDSL.g:152:2: iv_ruleBehaviour= ruleBehaviour EOF
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
    // InternalRobotDSL.g:158:1: ruleBehaviour returns [EObject current=null] : (otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) otherlv_4= 'devices:' ( (lv_deviceList_5_0= ruleDevice ) )+ otherlv_6= 'actions:' ( (lv_actionList_7_0= ruleAction ) )+ otherlv_8= 'trigger:' ( (lv_triggerList_9_0= ruleTrigger ) ) ) ;
    public final EObject ruleBehaviour() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_prio_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_deviceList_5_0 = null;

        EObject lv_actionList_7_0 = null;

        EObject lv_triggerList_9_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:164:2: ( (otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) otherlv_4= 'devices:' ( (lv_deviceList_5_0= ruleDevice ) )+ otherlv_6= 'actions:' ( (lv_actionList_7_0= ruleAction ) )+ otherlv_8= 'trigger:' ( (lv_triggerList_9_0= ruleTrigger ) ) ) )
            // InternalRobotDSL.g:165:2: (otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) otherlv_4= 'devices:' ( (lv_deviceList_5_0= ruleDevice ) )+ otherlv_6= 'actions:' ( (lv_actionList_7_0= ruleAction ) )+ otherlv_8= 'trigger:' ( (lv_triggerList_9_0= ruleTrigger ) ) )
            {
            // InternalRobotDSL.g:165:2: (otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) otherlv_4= 'devices:' ( (lv_deviceList_5_0= ruleDevice ) )+ otherlv_6= 'actions:' ( (lv_actionList_7_0= ruleAction ) )+ otherlv_8= 'trigger:' ( (lv_triggerList_9_0= ruleTrigger ) ) )
            // InternalRobotDSL.g:166:3: otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) otherlv_4= 'devices:' ( (lv_deviceList_5_0= ruleDevice ) )+ otherlv_6= 'actions:' ( (lv_actionList_7_0= ruleAction ) )+ otherlv_8= 'trigger:' ( (lv_triggerList_9_0= ruleTrigger ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBehaviourAccess().getBehaviorKeyword_0());
            		
            // InternalRobotDSL.g:170:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRobotDSL.g:171:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRobotDSL.g:171:4: (lv_name_1_0= RULE_ID )
            // InternalRobotDSL.g:172:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviourAccess().getPriorityKeyword_2());
            		
            // InternalRobotDSL.g:192:3: ( (lv_prio_3_0= RULE_INT ) )
            // InternalRobotDSL.g:193:4: (lv_prio_3_0= RULE_INT )
            {
            // InternalRobotDSL.g:193:4: (lv_prio_3_0= RULE_INT )
            // InternalRobotDSL.g:194:5: lv_prio_3_0= RULE_INT
            {
            lv_prio_3_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

            otherlv_4=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getBehaviourAccess().getDevicesKeyword_4());
            		
            // InternalRobotDSL.g:214:3: ( (lv_deviceList_5_0= ruleDevice ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRobotDSL.g:215:4: (lv_deviceList_5_0= ruleDevice )
            	    {
            	    // InternalRobotDSL.g:215:4: (lv_deviceList_5_0= ruleDevice )
            	    // InternalRobotDSL.g:216:5: lv_deviceList_5_0= ruleDevice
            	    {

            	    					newCompositeNode(grammarAccess.getBehaviourAccess().getDeviceListDeviceParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_deviceList_5_0=ruleDevice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBehaviourRule());
            	    					}
            	    					add(
            	    						current,
            	    						"deviceList",
            	    						lv_deviceList_5_0,
            	    						"des.missionrobot.RobotDSL.Device");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_6=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getBehaviourAccess().getActionsKeyword_6());
            		
            // InternalRobotDSL.g:237:3: ( (lv_actionList_7_0= ruleAction ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=19 && LA4_0<=24)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRobotDSL.g:238:4: (lv_actionList_7_0= ruleAction )
            	    {
            	    // InternalRobotDSL.g:238:4: (lv_actionList_7_0= ruleAction )
            	    // InternalRobotDSL.g:239:5: lv_actionList_7_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getBehaviourAccess().getActionListActionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_actionList_7_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBehaviourRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actionList",
            	    						lv_actionList_7_0,
            	    						"des.missionrobot.RobotDSL.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_8=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getBehaviourAccess().getTriggerKeyword_8());
            		
            // InternalRobotDSL.g:260:3: ( (lv_triggerList_9_0= ruleTrigger ) )
            // InternalRobotDSL.g:261:4: (lv_triggerList_9_0= ruleTrigger )
            {
            // InternalRobotDSL.g:261:4: (lv_triggerList_9_0= ruleTrigger )
            // InternalRobotDSL.g:262:5: lv_triggerList_9_0= ruleTrigger
            {

            					newCompositeNode(grammarAccess.getBehaviourAccess().getTriggerListTriggerParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_triggerList_9_0=ruleTrigger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviourRule());
            					}
            					set(
            						current,
            						"triggerList",
            						lv_triggerList_9_0,
            						"des.missionrobot.RobotDSL.Trigger");
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


    // $ANTLR start "entryRuleAction"
    // InternalRobotDSL.g:283:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRobotDSL.g:283:47: (iv_ruleAction= ruleAction EOF )
            // InternalRobotDSL.g:284:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalRobotDSL.g:290:1: ruleAction returns [EObject current=null] : (this_Movement_0= ruleMovement | this_Sound_1= ruleSound | this_IO_2= ruleIO ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Movement_0 = null;

        EObject this_Sound_1 = null;

        EObject this_IO_2 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:296:2: ( (this_Movement_0= ruleMovement | this_Sound_1= ruleSound | this_IO_2= ruleIO ) )
            // InternalRobotDSL.g:297:2: (this_Movement_0= ruleMovement | this_Sound_1= ruleSound | this_IO_2= ruleIO )
            {
            // InternalRobotDSL.g:297:2: (this_Movement_0= ruleMovement | this_Sound_1= ruleSound | this_IO_2= ruleIO )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
            case 20:
            case 21:
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
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
                    // InternalRobotDSL.g:298:3: this_Movement_0= ruleMovement
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getMovementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Movement_0=ruleMovement();

                    state._fsp--;


                    			current = this_Movement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:307:3: this_Sound_1= ruleSound
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSoundParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sound_1=ruleSound();

                    state._fsp--;


                    			current = this_Sound_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:316:3: this_IO_2= ruleIO
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getIOParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IO_2=ruleIO();

                    state._fsp--;


                    			current = this_IO_2;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleMovement"
    // InternalRobotDSL.g:328:1: entryRuleMovement returns [EObject current=null] : iv_ruleMovement= ruleMovement EOF ;
    public final EObject entryRuleMovement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovement = null;


        try {
            // InternalRobotDSL.g:328:49: (iv_ruleMovement= ruleMovement EOF )
            // InternalRobotDSL.g:329:2: iv_ruleMovement= ruleMovement EOF
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
    // InternalRobotDSL.g:335:1: ruleMovement returns [EObject current=null] : (this_MoveForward_0= ruleMoveForward | this_MoveBackward_1= ruleMoveBackward | this_Turn_2= ruleTurn | this_Stop_3= ruleStop ) ;
    public final EObject ruleMovement() throws RecognitionException {
        EObject current = null;

        EObject this_MoveForward_0 = null;

        EObject this_MoveBackward_1 = null;

        EObject this_Turn_2 = null;

        EObject this_Stop_3 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:341:2: ( (this_MoveForward_0= ruleMoveForward | this_MoveBackward_1= ruleMoveBackward | this_Turn_2= ruleTurn | this_Stop_3= ruleStop ) )
            // InternalRobotDSL.g:342:2: (this_MoveForward_0= ruleMoveForward | this_MoveBackward_1= ruleMoveBackward | this_Turn_2= ruleTurn | this_Stop_3= ruleStop )
            {
            // InternalRobotDSL.g:342:2: (this_MoveForward_0= ruleMoveForward | this_MoveBackward_1= ruleMoveBackward | this_Turn_2= ruleTurn | this_Stop_3= ruleStop )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
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
                    // InternalRobotDSL.g:343:3: this_MoveForward_0= ruleMoveForward
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
                    // InternalRobotDSL.g:352:3: this_MoveBackward_1= ruleMoveBackward
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
                    // InternalRobotDSL.g:361:3: this_Turn_2= ruleTurn
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
                    // InternalRobotDSL.g:370:3: this_Stop_3= ruleStop
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
    // InternalRobotDSL.g:382:1: entryRuleMoveForward returns [EObject current=null] : iv_ruleMoveForward= ruleMoveForward EOF ;
    public final EObject entryRuleMoveForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveForward = null;


        try {
            // InternalRobotDSL.g:382:52: (iv_ruleMoveForward= ruleMoveForward EOF )
            // InternalRobotDSL.g:383:2: iv_ruleMoveForward= ruleMoveForward EOF
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
    // InternalRobotDSL.g:389:1: ruleMoveForward returns [EObject current=null] : (otherlv_0= 'ForwardSpeed:' ( (lv_fspeed_1_0= RULE_INT ) ) ) ;
    public final EObject ruleMoveForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fspeed_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:395:2: ( (otherlv_0= 'ForwardSpeed:' ( (lv_fspeed_1_0= RULE_INT ) ) ) )
            // InternalRobotDSL.g:396:2: (otherlv_0= 'ForwardSpeed:' ( (lv_fspeed_1_0= RULE_INT ) ) )
            {
            // InternalRobotDSL.g:396:2: (otherlv_0= 'ForwardSpeed:' ( (lv_fspeed_1_0= RULE_INT ) ) )
            // InternalRobotDSL.g:397:3: otherlv_0= 'ForwardSpeed:' ( (lv_fspeed_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveForwardAccess().getForwardSpeedKeyword_0());
            		
            // InternalRobotDSL.g:401:3: ( (lv_fspeed_1_0= RULE_INT ) )
            // InternalRobotDSL.g:402:4: (lv_fspeed_1_0= RULE_INT )
            {
            // InternalRobotDSL.g:402:4: (lv_fspeed_1_0= RULE_INT )
            // InternalRobotDSL.g:403:5: lv_fspeed_1_0= RULE_INT
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
    // InternalRobotDSL.g:423:1: entryRuleMoveBackward returns [EObject current=null] : iv_ruleMoveBackward= ruleMoveBackward EOF ;
    public final EObject entryRuleMoveBackward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveBackward = null;


        try {
            // InternalRobotDSL.g:423:53: (iv_ruleMoveBackward= ruleMoveBackward EOF )
            // InternalRobotDSL.g:424:2: iv_ruleMoveBackward= ruleMoveBackward EOF
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
    // InternalRobotDSL.g:430:1: ruleMoveBackward returns [EObject current=null] : (otherlv_0= 'BackwardSpeed:' ( (lv_bspeed_1_0= RULE_INT ) ) ) ;
    public final EObject ruleMoveBackward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_bspeed_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:436:2: ( (otherlv_0= 'BackwardSpeed:' ( (lv_bspeed_1_0= RULE_INT ) ) ) )
            // InternalRobotDSL.g:437:2: (otherlv_0= 'BackwardSpeed:' ( (lv_bspeed_1_0= RULE_INT ) ) )
            {
            // InternalRobotDSL.g:437:2: (otherlv_0= 'BackwardSpeed:' ( (lv_bspeed_1_0= RULE_INT ) ) )
            // InternalRobotDSL.g:438:3: otherlv_0= 'BackwardSpeed:' ( (lv_bspeed_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveBackwardAccess().getBackwardSpeedKeyword_0());
            		
            // InternalRobotDSL.g:442:3: ( (lv_bspeed_1_0= RULE_INT ) )
            // InternalRobotDSL.g:443:4: (lv_bspeed_1_0= RULE_INT )
            {
            // InternalRobotDSL.g:443:4: (lv_bspeed_1_0= RULE_INT )
            // InternalRobotDSL.g:444:5: lv_bspeed_1_0= RULE_INT
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
    // InternalRobotDSL.g:464:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalRobotDSL.g:464:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalRobotDSL.g:465:2: iv_ruleTurn= ruleTurn EOF
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
    // InternalRobotDSL.g:471:1: ruleTurn returns [EObject current=null] : (otherlv_0= 'TurnAngle:' ( (lv_angle_1_0= RULE_INT ) ) ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_angle_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:477:2: ( (otherlv_0= 'TurnAngle:' ( (lv_angle_1_0= RULE_INT ) ) ) )
            // InternalRobotDSL.g:478:2: (otherlv_0= 'TurnAngle:' ( (lv_angle_1_0= RULE_INT ) ) )
            {
            // InternalRobotDSL.g:478:2: (otherlv_0= 'TurnAngle:' ( (lv_angle_1_0= RULE_INT ) ) )
            // InternalRobotDSL.g:479:3: otherlv_0= 'TurnAngle:' ( (lv_angle_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnAccess().getTurnAngleKeyword_0());
            		
            // InternalRobotDSL.g:483:3: ( (lv_angle_1_0= RULE_INT ) )
            // InternalRobotDSL.g:484:4: (lv_angle_1_0= RULE_INT )
            {
            // InternalRobotDSL.g:484:4: (lv_angle_1_0= RULE_INT )
            // InternalRobotDSL.g:485:5: lv_angle_1_0= RULE_INT
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
    // InternalRobotDSL.g:505:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalRobotDSL.g:505:45: (iv_ruleStop= ruleStop EOF )
            // InternalRobotDSL.g:506:2: iv_ruleStop= ruleStop EOF
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
    // InternalRobotDSL.g:512:1: ruleStop returns [EObject current=null] : (otherlv_0= 'WaitFor:' ( (lv_duration_1_0= RULE_INT ) ) ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_duration_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:518:2: ( (otherlv_0= 'WaitFor:' ( (lv_duration_1_0= RULE_INT ) ) ) )
            // InternalRobotDSL.g:519:2: (otherlv_0= 'WaitFor:' ( (lv_duration_1_0= RULE_INT ) ) )
            {
            // InternalRobotDSL.g:519:2: (otherlv_0= 'WaitFor:' ( (lv_duration_1_0= RULE_INT ) ) )
            // InternalRobotDSL.g:520:3: otherlv_0= 'WaitFor:' ( (lv_duration_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getStopAccess().getWaitForKeyword_0());
            		
            // InternalRobotDSL.g:524:3: ( (lv_duration_1_0= RULE_INT ) )
            // InternalRobotDSL.g:525:4: (lv_duration_1_0= RULE_INT )
            {
            // InternalRobotDSL.g:525:4: (lv_duration_1_0= RULE_INT )
            // InternalRobotDSL.g:526:5: lv_duration_1_0= RULE_INT
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


    // $ANTLR start "entryRuleSound"
    // InternalRobotDSL.g:546:1: entryRuleSound returns [EObject current=null] : iv_ruleSound= ruleSound EOF ;
    public final EObject entryRuleSound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSound = null;


        try {
            // InternalRobotDSL.g:546:46: (iv_ruleSound= ruleSound EOF )
            // InternalRobotDSL.g:547:2: iv_ruleSound= ruleSound EOF
            {
             newCompositeNode(grammarAccess.getSoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSound=ruleSound();

            state._fsp--;

             current =iv_ruleSound; 
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
    // $ANTLR end "entryRuleSound"


    // $ANTLR start "ruleSound"
    // InternalRobotDSL.g:553:1: ruleSound returns [EObject current=null] : (otherlv_0= 'PlaySound:' ( (lv_soundName_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_soundName_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:559:2: ( (otherlv_0= 'PlaySound:' ( (lv_soundName_1_0= RULE_STRING ) ) ) )
            // InternalRobotDSL.g:560:2: (otherlv_0= 'PlaySound:' ( (lv_soundName_1_0= RULE_STRING ) ) )
            {
            // InternalRobotDSL.g:560:2: (otherlv_0= 'PlaySound:' ( (lv_soundName_1_0= RULE_STRING ) ) )
            // InternalRobotDSL.g:561:3: otherlv_0= 'PlaySound:' ( (lv_soundName_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSoundAccess().getPlaySoundKeyword_0());
            		
            // InternalRobotDSL.g:565:3: ( (lv_soundName_1_0= RULE_STRING ) )
            // InternalRobotDSL.g:566:4: (lv_soundName_1_0= RULE_STRING )
            {
            // InternalRobotDSL.g:566:4: (lv_soundName_1_0= RULE_STRING )
            // InternalRobotDSL.g:567:5: lv_soundName_1_0= RULE_STRING
            {
            lv_soundName_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_soundName_1_0, grammarAccess.getSoundAccess().getSoundNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSoundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"soundName",
            						lv_soundName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleSound"


    // $ANTLR start "entryRuleIO"
    // InternalRobotDSL.g:587:1: entryRuleIO returns [EObject current=null] : iv_ruleIO= ruleIO EOF ;
    public final EObject entryRuleIO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIO = null;


        try {
            // InternalRobotDSL.g:587:43: (iv_ruleIO= ruleIO EOF )
            // InternalRobotDSL.g:588:2: iv_ruleIO= ruleIO EOF
            {
             newCompositeNode(grammarAccess.getIORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIO=ruleIO();

            state._fsp--;

             current =iv_ruleIO; 
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
    // $ANTLR end "entryRuleIO"


    // $ANTLR start "ruleIO"
    // InternalRobotDSL.g:594:1: ruleIO returns [EObject current=null] : (otherlv_0= 'PrintMessage' ( (lv_message_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleIO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_message_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:600:2: ( (otherlv_0= 'PrintMessage' ( (lv_message_1_0= RULE_STRING ) ) ) )
            // InternalRobotDSL.g:601:2: (otherlv_0= 'PrintMessage' ( (lv_message_1_0= RULE_STRING ) ) )
            {
            // InternalRobotDSL.g:601:2: (otherlv_0= 'PrintMessage' ( (lv_message_1_0= RULE_STRING ) ) )
            // InternalRobotDSL.g:602:3: otherlv_0= 'PrintMessage' ( (lv_message_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getIOAccess().getPrintMessageKeyword_0());
            		
            // InternalRobotDSL.g:606:3: ( (lv_message_1_0= RULE_STRING ) )
            // InternalRobotDSL.g:607:4: (lv_message_1_0= RULE_STRING )
            {
            // InternalRobotDSL.g:607:4: (lv_message_1_0= RULE_STRING )
            // InternalRobotDSL.g:608:5: lv_message_1_0= RULE_STRING
            {
            lv_message_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_message_1_0, grammarAccess.getIOAccess().getMessageSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIORule());
            					}
            					setWithLastConsumed(
            						current,
            						"message",
            						lv_message_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleIO"


    // $ANTLR start "entryRuleTrigger"
    // InternalRobotDSL.g:628:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalRobotDSL.g:628:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalRobotDSL.g:629:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalRobotDSL.g:635:1: ruleTrigger returns [EObject current=null] : (otherlv_0= 'Condition' ( (lv_condition_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_condition_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:641:2: ( (otherlv_0= 'Condition' ( (lv_condition_1_0= RULE_STRING ) ) ) )
            // InternalRobotDSL.g:642:2: (otherlv_0= 'Condition' ( (lv_condition_1_0= RULE_STRING ) ) )
            {
            // InternalRobotDSL.g:642:2: (otherlv_0= 'Condition' ( (lv_condition_1_0= RULE_STRING ) ) )
            // InternalRobotDSL.g:643:3: otherlv_0= 'Condition' ( (lv_condition_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getConditionKeyword_0());
            		
            // InternalRobotDSL.g:647:3: ( (lv_condition_1_0= RULE_STRING ) )
            // InternalRobotDSL.g:648:4: (lv_condition_1_0= RULE_STRING )
            {
            // InternalRobotDSL.g:648:4: (lv_condition_1_0= RULE_STRING )
            // InternalRobotDSL.g:649:5: lv_condition_1_0= RULE_STRING
            {
            lv_condition_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_condition_1_0, grammarAccess.getTriggerAccess().getConditionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleDevice"
    // InternalRobotDSL.g:669:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalRobotDSL.g:669:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalRobotDSL.g:670:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalRobotDSL.g:676:1: ruleDevice returns [EObject current=null] : (otherlv_0= 'Device:' ( (lv_type_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:682:2: ( (otherlv_0= 'Device:' ( (lv_type_1_0= RULE_STRING ) ) ) )
            // InternalRobotDSL.g:683:2: (otherlv_0= 'Device:' ( (lv_type_1_0= RULE_STRING ) ) )
            {
            // InternalRobotDSL.g:683:2: (otherlv_0= 'Device:' ( (lv_type_1_0= RULE_STRING ) ) )
            // InternalRobotDSL.g:684:3: otherlv_0= 'Device:' ( (lv_type_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getDeviceKeyword_0());
            		
            // InternalRobotDSL.g:688:3: ( (lv_type_1_0= RULE_STRING ) )
            // InternalRobotDSL.g:689:4: (lv_type_1_0= RULE_STRING )
            {
            // InternalRobotDSL.g:689:4: (lv_type_1_0= RULE_STRING )
            // InternalRobotDSL.g:690:5: lv_type_1_0= RULE_STRING
            {
            lv_type_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_type_1_0, grammarAccess.getDeviceAccess().getTypeSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleDevice"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});

}