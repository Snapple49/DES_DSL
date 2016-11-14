package des.missionrobot.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mission'", "'UsedDevices:'", "'Behaviors:'", "'Goal:'", "'Behavior:'", "'priority:'", "'devices:'", "'actions:'", "'triggers:'", "'Duration'", "'Forward'", "'Backward'", "'Turn'", "'Stop'", "'PlaySound:'", "'PrintMessage'", "'Condition:'", "'Sensor'", "'Device:'", "'SensorType:'", "'description:'", "'Motor'", "'Ultrasonic'", "'Touch'", "'Color'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
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
    // InternalRobotDSL.g:65:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalRobotDSL.g:65:48: (iv_ruleMission= ruleMission EOF )
            // InternalRobotDSL.g:66:2: iv_ruleMission= ruleMission EOF
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
    // InternalRobotDSL.g:72:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'UsedDevices:' ( (lv_deviceList_3_0= ruleDevice ) )+ otherlv_4= 'Behaviors:' ( (lv_behaviourList_5_0= ruleBehavior ) )+ otherlv_6= 'Goal:' ( (lv_goalCondition_7_0= ruleTrigger ) )+ ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_deviceList_3_0 = null;

        EObject lv_behaviourList_5_0 = null;

        EObject lv_goalCondition_7_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:78:2: ( (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'UsedDevices:' ( (lv_deviceList_3_0= ruleDevice ) )+ otherlv_4= 'Behaviors:' ( (lv_behaviourList_5_0= ruleBehavior ) )+ otherlv_6= 'Goal:' ( (lv_goalCondition_7_0= ruleTrigger ) )+ ) )
            // InternalRobotDSL.g:79:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'UsedDevices:' ( (lv_deviceList_3_0= ruleDevice ) )+ otherlv_4= 'Behaviors:' ( (lv_behaviourList_5_0= ruleBehavior ) )+ otherlv_6= 'Goal:' ( (lv_goalCondition_7_0= ruleTrigger ) )+ )
            {
            // InternalRobotDSL.g:79:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'UsedDevices:' ( (lv_deviceList_3_0= ruleDevice ) )+ otherlv_4= 'Behaviors:' ( (lv_behaviourList_5_0= ruleBehavior ) )+ otherlv_6= 'Goal:' ( (lv_goalCondition_7_0= ruleTrigger ) )+ )
            // InternalRobotDSL.g:80:3: otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'UsedDevices:' ( (lv_deviceList_3_0= ruleDevice ) )+ otherlv_4= 'Behaviors:' ( (lv_behaviourList_5_0= ruleBehavior ) )+ otherlv_6= 'Goal:' ( (lv_goalCondition_7_0= ruleTrigger ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalRobotDSL.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRobotDSL.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRobotDSL.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalRobotDSL.g:86:5: lv_name_1_0= RULE_ID
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

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getUsedDevicesKeyword_2());
            		
            // InternalRobotDSL.g:106:3: ( (lv_deviceList_3_0= ruleDevice ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRobotDSL.g:107:4: (lv_deviceList_3_0= ruleDevice )
            	    {
            	    // InternalRobotDSL.g:107:4: (lv_deviceList_3_0= ruleDevice )
            	    // InternalRobotDSL.g:108:5: lv_deviceList_3_0= ruleDevice
            	    {

            	    					newCompositeNode(grammarAccess.getMissionAccess().getDeviceListDeviceParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_deviceList_3_0=ruleDevice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMissionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"deviceList",
            	    						lv_deviceList_3_0,
            	    						"des.missionrobot.RobotDSL.Device");
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

            			newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getBehaviorsKeyword_4());
            		
            // InternalRobotDSL.g:129:3: ( (lv_behaviourList_5_0= ruleBehavior ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRobotDSL.g:130:4: (lv_behaviourList_5_0= ruleBehavior )
            	    {
            	    // InternalRobotDSL.g:130:4: (lv_behaviourList_5_0= ruleBehavior )
            	    // InternalRobotDSL.g:131:5: lv_behaviourList_5_0= ruleBehavior
            	    {

            	    					newCompositeNode(grammarAccess.getMissionAccess().getBehaviourListBehaviorParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_behaviourList_5_0=ruleBehavior();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMissionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"behaviourList",
            	    						lv_behaviourList_5_0,
            	    						"des.missionrobot.RobotDSL.Behavior");
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

            otherlv_6=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getGoalKeyword_6());
            		
            // InternalRobotDSL.g:152:3: ( (lv_goalCondition_7_0= ruleTrigger ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRobotDSL.g:153:4: (lv_goalCondition_7_0= ruleTrigger )
            	    {
            	    // InternalRobotDSL.g:153:4: (lv_goalCondition_7_0= ruleTrigger )
            	    // InternalRobotDSL.g:154:5: lv_goalCondition_7_0= ruleTrigger
            	    {

            	    					newCompositeNode(grammarAccess.getMissionAccess().getGoalConditionTriggerParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_goalCondition_7_0=ruleTrigger();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMissionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"goalCondition",
            	    						lv_goalCondition_7_0,
            	    						"des.missionrobot.RobotDSL.Trigger");
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


    // $ANTLR start "entryRuleBehavior"
    // InternalRobotDSL.g:175:1: entryRuleBehavior returns [EObject current=null] : iv_ruleBehavior= ruleBehavior EOF ;
    public final EObject entryRuleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavior = null;


        try {
            // InternalRobotDSL.g:175:49: (iv_ruleBehavior= ruleBehavior EOF )
            // InternalRobotDSL.g:176:2: iv_ruleBehavior= ruleBehavior EOF
            {
             newCompositeNode(grammarAccess.getBehaviorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehavior=ruleBehavior();

            state._fsp--;

             current =iv_ruleBehavior; 
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
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // InternalRobotDSL.g:182:1: ruleBehavior returns [EObject current=null] : (otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) otherlv_4= 'devices:' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'actions:' ( (lv_actionList_7_0= ruleAction ) )+ otherlv_8= 'triggers:' ( (lv_triggerList_9_0= ruleTrigger ) )+ ) ;
    public final EObject ruleBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_prio_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_actionList_7_0 = null;

        EObject lv_triggerList_9_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:188:2: ( (otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) otherlv_4= 'devices:' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'actions:' ( (lv_actionList_7_0= ruleAction ) )+ otherlv_8= 'triggers:' ( (lv_triggerList_9_0= ruleTrigger ) )+ ) )
            // InternalRobotDSL.g:189:2: (otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) otherlv_4= 'devices:' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'actions:' ( (lv_actionList_7_0= ruleAction ) )+ otherlv_8= 'triggers:' ( (lv_triggerList_9_0= ruleTrigger ) )+ )
            {
            // InternalRobotDSL.g:189:2: (otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) otherlv_4= 'devices:' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'actions:' ( (lv_actionList_7_0= ruleAction ) )+ otherlv_8= 'triggers:' ( (lv_triggerList_9_0= ruleTrigger ) )+ )
            // InternalRobotDSL.g:190:3: otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) otherlv_4= 'devices:' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'actions:' ( (lv_actionList_7_0= ruleAction ) )+ otherlv_8= 'triggers:' ( (lv_triggerList_9_0= ruleTrigger ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBehaviorAccess().getBehaviorKeyword_0());
            		
            // InternalRobotDSL.g:194:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRobotDSL.g:195:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRobotDSL.g:195:4: (lv_name_1_0= RULE_ID )
            // InternalRobotDSL.g:196:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBehaviorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBehaviorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviorAccess().getPriorityKeyword_2());
            		
            // InternalRobotDSL.g:216:3: ( (lv_prio_3_0= RULE_INT ) )
            // InternalRobotDSL.g:217:4: (lv_prio_3_0= RULE_INT )
            {
            // InternalRobotDSL.g:217:4: (lv_prio_3_0= RULE_INT )
            // InternalRobotDSL.g:218:5: lv_prio_3_0= RULE_INT
            {
            lv_prio_3_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_prio_3_0, grammarAccess.getBehaviorAccess().getPrioINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBehaviorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"prio",
            						lv_prio_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getBehaviorAccess().getDevicesKeyword_4());
            		
            // InternalRobotDSL.g:238:3: ( (otherlv_5= RULE_ID ) )+
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
            	    // InternalRobotDSL.g:239:4: (otherlv_5= RULE_ID )
            	    {
            	    // InternalRobotDSL.g:239:4: (otherlv_5= RULE_ID )
            	    // InternalRobotDSL.g:240:5: otherlv_5= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getBehaviorRule());
            	    					}
            	    				
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    					newLeafNode(otherlv_5, grammarAccess.getBehaviorAccess().getDeviceListDeviceCrossReference_5_0());
            	    				

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

            otherlv_6=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getBehaviorAccess().getActionsKeyword_6());
            		
            // InternalRobotDSL.g:255:3: ( (lv_actionList_7_0= ruleAction ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=21 && LA5_0<=26)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRobotDSL.g:256:4: (lv_actionList_7_0= ruleAction )
            	    {
            	    // InternalRobotDSL.g:256:4: (lv_actionList_7_0= ruleAction )
            	    // InternalRobotDSL.g:257:5: lv_actionList_7_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getBehaviorAccess().getActionListActionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_actionList_7_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBehaviorRule());
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getBehaviorAccess().getTriggersKeyword_8());
            		
            // InternalRobotDSL.g:278:3: ( (lv_triggerList_9_0= ruleTrigger ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRobotDSL.g:279:4: (lv_triggerList_9_0= ruleTrigger )
            	    {
            	    // InternalRobotDSL.g:279:4: (lv_triggerList_9_0= ruleTrigger )
            	    // InternalRobotDSL.g:280:5: lv_triggerList_9_0= ruleTrigger
            	    {

            	    					newCompositeNode(grammarAccess.getBehaviorAccess().getTriggerListTriggerParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_triggerList_9_0=ruleTrigger();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBehaviorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"triggerList",
            	    						lv_triggerList_9_0,
            	    						"des.missionrobot.RobotDSL.Trigger");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleAction"
    // InternalRobotDSL.g:301:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRobotDSL.g:301:47: (iv_ruleAction= ruleAction EOF )
            // InternalRobotDSL.g:302:2: iv_ruleAction= ruleAction EOF
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
    // InternalRobotDSL.g:308:1: ruleAction returns [EObject current=null] : ( (this_Movement_0= ruleMovement (otherlv_1= 'Duration' ( (lv_duration_2_0= RULE_INT ) ) )? ) | this_Sound_3= ruleSound | this_IO_4= ruleIO ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_duration_2_0=null;
        EObject this_Movement_0 = null;

        EObject this_Sound_3 = null;

        EObject this_IO_4 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:314:2: ( ( (this_Movement_0= ruleMovement (otherlv_1= 'Duration' ( (lv_duration_2_0= RULE_INT ) ) )? ) | this_Sound_3= ruleSound | this_IO_4= ruleIO ) )
            // InternalRobotDSL.g:315:2: ( (this_Movement_0= ruleMovement (otherlv_1= 'Duration' ( (lv_duration_2_0= RULE_INT ) ) )? ) | this_Sound_3= ruleSound | this_IO_4= ruleIO )
            {
            // InternalRobotDSL.g:315:2: ( (this_Movement_0= ruleMovement (otherlv_1= 'Duration' ( (lv_duration_2_0= RULE_INT ) ) )? ) | this_Sound_3= ruleSound | this_IO_4= ruleIO )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
            case 23:
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRobotDSL.g:316:3: (this_Movement_0= ruleMovement (otherlv_1= 'Duration' ( (lv_duration_2_0= RULE_INT ) ) )? )
                    {
                    // InternalRobotDSL.g:316:3: (this_Movement_0= ruleMovement (otherlv_1= 'Duration' ( (lv_duration_2_0= RULE_INT ) ) )? )
                    // InternalRobotDSL.g:317:4: this_Movement_0= ruleMovement (otherlv_1= 'Duration' ( (lv_duration_2_0= RULE_INT ) ) )?
                    {

                    				newCompositeNode(grammarAccess.getActionAccess().getMovementParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_17);
                    this_Movement_0=ruleMovement();

                    state._fsp--;


                    				current = this_Movement_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalRobotDSL.g:325:4: (otherlv_1= 'Duration' ( (lv_duration_2_0= RULE_INT ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==20) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalRobotDSL.g:326:5: otherlv_1= 'Duration' ( (lv_duration_2_0= RULE_INT ) )
                            {
                            otherlv_1=(Token)match(input,20,FOLLOW_12); 

                            					newLeafNode(otherlv_1, grammarAccess.getActionAccess().getDurationKeyword_0_1_0());
                            				
                            // InternalRobotDSL.g:330:5: ( (lv_duration_2_0= RULE_INT ) )
                            // InternalRobotDSL.g:331:6: (lv_duration_2_0= RULE_INT )
                            {
                            // InternalRobotDSL.g:331:6: (lv_duration_2_0= RULE_INT )
                            // InternalRobotDSL.g:332:7: lv_duration_2_0= RULE_INT
                            {
                            lv_duration_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                            							newLeafNode(lv_duration_2_0, grammarAccess.getActionAccess().getDurationINTTerminalRuleCall_0_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getActionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"duration",
                            								lv_duration_2_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:351:3: this_Sound_3= ruleSound
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSoundParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sound_3=ruleSound();

                    state._fsp--;


                    			current = this_Sound_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:360:3: this_IO_4= ruleIO
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getIOParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IO_4=ruleIO();

                    state._fsp--;


                    			current = this_IO_4;
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
    // InternalRobotDSL.g:372:1: entryRuleMovement returns [EObject current=null] : iv_ruleMovement= ruleMovement EOF ;
    public final EObject entryRuleMovement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovement = null;


        try {
            // InternalRobotDSL.g:372:49: (iv_ruleMovement= ruleMovement EOF )
            // InternalRobotDSL.g:373:2: iv_ruleMovement= ruleMovement EOF
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
    // InternalRobotDSL.g:379:1: ruleMovement returns [EObject current=null] : (this_MoveForward_0= ruleMoveForward | this_MoveBackward_1= ruleMoveBackward | this_Turn_2= ruleTurn | this_Stop_3= ruleStop ) ;
    public final EObject ruleMovement() throws RecognitionException {
        EObject current = null;

        EObject this_MoveForward_0 = null;

        EObject this_MoveBackward_1 = null;

        EObject this_Turn_2 = null;

        EObject this_Stop_3 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:385:2: ( (this_MoveForward_0= ruleMoveForward | this_MoveBackward_1= ruleMoveBackward | this_Turn_2= ruleTurn | this_Stop_3= ruleStop ) )
            // InternalRobotDSL.g:386:2: (this_MoveForward_0= ruleMoveForward | this_MoveBackward_1= ruleMoveBackward | this_Turn_2= ruleTurn | this_Stop_3= ruleStop )
            {
            // InternalRobotDSL.g:386:2: (this_MoveForward_0= ruleMoveForward | this_MoveBackward_1= ruleMoveBackward | this_Turn_2= ruleTurn | this_Stop_3= ruleStop )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            case 24:
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
                    // InternalRobotDSL.g:387:3: this_MoveForward_0= ruleMoveForward
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
                    // InternalRobotDSL.g:396:3: this_MoveBackward_1= ruleMoveBackward
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
                    // InternalRobotDSL.g:405:3: this_Turn_2= ruleTurn
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
                    // InternalRobotDSL.g:414:3: this_Stop_3= ruleStop
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
    // InternalRobotDSL.g:426:1: entryRuleMoveForward returns [EObject current=null] : iv_ruleMoveForward= ruleMoveForward EOF ;
    public final EObject entryRuleMoveForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveForward = null;


        try {
            // InternalRobotDSL.g:426:52: (iv_ruleMoveForward= ruleMoveForward EOF )
            // InternalRobotDSL.g:427:2: iv_ruleMoveForward= ruleMoveForward EOF
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
    // InternalRobotDSL.g:433:1: ruleMoveForward returns [EObject current=null] : (otherlv_0= 'Forward' ( (lv_fspeed_1_0= RULE_INT ) ) ) ;
    public final EObject ruleMoveForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fspeed_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:439:2: ( (otherlv_0= 'Forward' ( (lv_fspeed_1_0= RULE_INT ) ) ) )
            // InternalRobotDSL.g:440:2: (otherlv_0= 'Forward' ( (lv_fspeed_1_0= RULE_INT ) ) )
            {
            // InternalRobotDSL.g:440:2: (otherlv_0= 'Forward' ( (lv_fspeed_1_0= RULE_INT ) ) )
            // InternalRobotDSL.g:441:3: otherlv_0= 'Forward' ( (lv_fspeed_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveForwardAccess().getForwardKeyword_0());
            		
            // InternalRobotDSL.g:445:3: ( (lv_fspeed_1_0= RULE_INT ) )
            // InternalRobotDSL.g:446:4: (lv_fspeed_1_0= RULE_INT )
            {
            // InternalRobotDSL.g:446:4: (lv_fspeed_1_0= RULE_INT )
            // InternalRobotDSL.g:447:5: lv_fspeed_1_0= RULE_INT
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
    // InternalRobotDSL.g:467:1: entryRuleMoveBackward returns [EObject current=null] : iv_ruleMoveBackward= ruleMoveBackward EOF ;
    public final EObject entryRuleMoveBackward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveBackward = null;


        try {
            // InternalRobotDSL.g:467:53: (iv_ruleMoveBackward= ruleMoveBackward EOF )
            // InternalRobotDSL.g:468:2: iv_ruleMoveBackward= ruleMoveBackward EOF
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
    // InternalRobotDSL.g:474:1: ruleMoveBackward returns [EObject current=null] : (otherlv_0= 'Backward' ( (lv_bspeed_1_0= RULE_INT ) ) ) ;
    public final EObject ruleMoveBackward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_bspeed_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:480:2: ( (otherlv_0= 'Backward' ( (lv_bspeed_1_0= RULE_INT ) ) ) )
            // InternalRobotDSL.g:481:2: (otherlv_0= 'Backward' ( (lv_bspeed_1_0= RULE_INT ) ) )
            {
            // InternalRobotDSL.g:481:2: (otherlv_0= 'Backward' ( (lv_bspeed_1_0= RULE_INT ) ) )
            // InternalRobotDSL.g:482:3: otherlv_0= 'Backward' ( (lv_bspeed_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveBackwardAccess().getBackwardKeyword_0());
            		
            // InternalRobotDSL.g:486:3: ( (lv_bspeed_1_0= RULE_INT ) )
            // InternalRobotDSL.g:487:4: (lv_bspeed_1_0= RULE_INT )
            {
            // InternalRobotDSL.g:487:4: (lv_bspeed_1_0= RULE_INT )
            // InternalRobotDSL.g:488:5: lv_bspeed_1_0= RULE_INT
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
    // InternalRobotDSL.g:508:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalRobotDSL.g:508:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalRobotDSL.g:509:2: iv_ruleTurn= ruleTurn EOF
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
    // InternalRobotDSL.g:515:1: ruleTurn returns [EObject current=null] : (otherlv_0= 'Turn' ( (lv_angle_1_0= RULE_INT ) ) ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_angle_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:521:2: ( (otherlv_0= 'Turn' ( (lv_angle_1_0= RULE_INT ) ) ) )
            // InternalRobotDSL.g:522:2: (otherlv_0= 'Turn' ( (lv_angle_1_0= RULE_INT ) ) )
            {
            // InternalRobotDSL.g:522:2: (otherlv_0= 'Turn' ( (lv_angle_1_0= RULE_INT ) ) )
            // InternalRobotDSL.g:523:3: otherlv_0= 'Turn' ( (lv_angle_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnAccess().getTurnKeyword_0());
            		
            // InternalRobotDSL.g:527:3: ( (lv_angle_1_0= RULE_INT ) )
            // InternalRobotDSL.g:528:4: (lv_angle_1_0= RULE_INT )
            {
            // InternalRobotDSL.g:528:4: (lv_angle_1_0= RULE_INT )
            // InternalRobotDSL.g:529:5: lv_angle_1_0= RULE_INT
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
    // InternalRobotDSL.g:549:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalRobotDSL.g:549:45: (iv_ruleStop= ruleStop EOF )
            // InternalRobotDSL.g:550:2: iv_ruleStop= ruleStop EOF
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
    // InternalRobotDSL.g:556:1: ruleStop returns [EObject current=null] : (otherlv_0= 'Stop' ( (lv_duration_1_0= RULE_INT ) ) ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_duration_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:562:2: ( (otherlv_0= 'Stop' ( (lv_duration_1_0= RULE_INT ) ) ) )
            // InternalRobotDSL.g:563:2: (otherlv_0= 'Stop' ( (lv_duration_1_0= RULE_INT ) ) )
            {
            // InternalRobotDSL.g:563:2: (otherlv_0= 'Stop' ( (lv_duration_1_0= RULE_INT ) ) )
            // InternalRobotDSL.g:564:3: otherlv_0= 'Stop' ( (lv_duration_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getStopAccess().getStopKeyword_0());
            		
            // InternalRobotDSL.g:568:3: ( (lv_duration_1_0= RULE_INT ) )
            // InternalRobotDSL.g:569:4: (lv_duration_1_0= RULE_INT )
            {
            // InternalRobotDSL.g:569:4: (lv_duration_1_0= RULE_INT )
            // InternalRobotDSL.g:570:5: lv_duration_1_0= RULE_INT
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
    // InternalRobotDSL.g:590:1: entryRuleSound returns [EObject current=null] : iv_ruleSound= ruleSound EOF ;
    public final EObject entryRuleSound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSound = null;


        try {
            // InternalRobotDSL.g:590:46: (iv_ruleSound= ruleSound EOF )
            // InternalRobotDSL.g:591:2: iv_ruleSound= ruleSound EOF
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
    // InternalRobotDSL.g:597:1: ruleSound returns [EObject current=null] : (otherlv_0= 'PlaySound:' ( (lv_soundName_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_soundName_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:603:2: ( (otherlv_0= 'PlaySound:' ( (lv_soundName_1_0= RULE_STRING ) ) ) )
            // InternalRobotDSL.g:604:2: (otherlv_0= 'PlaySound:' ( (lv_soundName_1_0= RULE_STRING ) ) )
            {
            // InternalRobotDSL.g:604:2: (otherlv_0= 'PlaySound:' ( (lv_soundName_1_0= RULE_STRING ) ) )
            // InternalRobotDSL.g:605:3: otherlv_0= 'PlaySound:' ( (lv_soundName_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getSoundAccess().getPlaySoundKeyword_0());
            		
            // InternalRobotDSL.g:609:3: ( (lv_soundName_1_0= RULE_STRING ) )
            // InternalRobotDSL.g:610:4: (lv_soundName_1_0= RULE_STRING )
            {
            // InternalRobotDSL.g:610:4: (lv_soundName_1_0= RULE_STRING )
            // InternalRobotDSL.g:611:5: lv_soundName_1_0= RULE_STRING
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
    // InternalRobotDSL.g:631:1: entryRuleIO returns [EObject current=null] : iv_ruleIO= ruleIO EOF ;
    public final EObject entryRuleIO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIO = null;


        try {
            // InternalRobotDSL.g:631:43: (iv_ruleIO= ruleIO EOF )
            // InternalRobotDSL.g:632:2: iv_ruleIO= ruleIO EOF
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
    // InternalRobotDSL.g:638:1: ruleIO returns [EObject current=null] : (otherlv_0= 'PrintMessage' ( (lv_message_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleIO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_message_1_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:644:2: ( (otherlv_0= 'PrintMessage' ( (lv_message_1_0= RULE_STRING ) ) ) )
            // InternalRobotDSL.g:645:2: (otherlv_0= 'PrintMessage' ( (lv_message_1_0= RULE_STRING ) ) )
            {
            // InternalRobotDSL.g:645:2: (otherlv_0= 'PrintMessage' ( (lv_message_1_0= RULE_STRING ) ) )
            // InternalRobotDSL.g:646:3: otherlv_0= 'PrintMessage' ( (lv_message_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getIOAccess().getPrintMessageKeyword_0());
            		
            // InternalRobotDSL.g:650:3: ( (lv_message_1_0= RULE_STRING ) )
            // InternalRobotDSL.g:651:4: (lv_message_1_0= RULE_STRING )
            {
            // InternalRobotDSL.g:651:4: (lv_message_1_0= RULE_STRING )
            // InternalRobotDSL.g:652:5: lv_message_1_0= RULE_STRING
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
    // InternalRobotDSL.g:672:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalRobotDSL.g:672:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalRobotDSL.g:673:2: iv_ruleTrigger= ruleTrigger EOF
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
    // InternalRobotDSL.g:679:1: ruleTrigger returns [EObject current=null] : (otherlv_0= 'Condition:' ( (lv_condition_1_0= RULE_STRING ) ) (otherlv_2= 'Sensor' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_condition_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:685:2: ( (otherlv_0= 'Condition:' ( (lv_condition_1_0= RULE_STRING ) ) (otherlv_2= 'Sensor' ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalRobotDSL.g:686:2: (otherlv_0= 'Condition:' ( (lv_condition_1_0= RULE_STRING ) ) (otherlv_2= 'Sensor' ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalRobotDSL.g:686:2: (otherlv_0= 'Condition:' ( (lv_condition_1_0= RULE_STRING ) ) (otherlv_2= 'Sensor' ( (otherlv_3= RULE_ID ) ) )? )
            // InternalRobotDSL.g:687:3: otherlv_0= 'Condition:' ( (lv_condition_1_0= RULE_STRING ) ) (otherlv_2= 'Sensor' ( (otherlv_3= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getConditionKeyword_0());
            		
            // InternalRobotDSL.g:691:3: ( (lv_condition_1_0= RULE_STRING ) )
            // InternalRobotDSL.g:692:4: (lv_condition_1_0= RULE_STRING )
            {
            // InternalRobotDSL.g:692:4: (lv_condition_1_0= RULE_STRING )
            // InternalRobotDSL.g:693:5: lv_condition_1_0= RULE_STRING
            {
            lv_condition_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            // InternalRobotDSL.g:709:3: (otherlv_2= 'Sensor' ( (otherlv_3= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRobotDSL.g:710:4: otherlv_2= 'Sensor' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTriggerAccess().getSensorKeyword_2_0());
                    			
                    // InternalRobotDSL.g:714:4: ( (otherlv_3= RULE_ID ) )
                    // InternalRobotDSL.g:715:5: (otherlv_3= RULE_ID )
                    {
                    // InternalRobotDSL.g:715:5: (otherlv_3= RULE_ID )
                    // InternalRobotDSL.g:716:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTriggerRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getTriggerAccess().getSensorTriggerDeviceCrossReference_2_1_0());
                    					

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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleDevice"
    // InternalRobotDSL.g:732:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalRobotDSL.g:732:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalRobotDSL.g:733:2: iv_ruleDevice= ruleDevice EOF
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
    // InternalRobotDSL.g:739:1: ruleDevice returns [EObject current=null] : (otherlv_0= 'Device:' ( (lv_type_1_0= ruleDeviceType ) ) (otherlv_2= 'SensorType:' ( (lv_sensorType_3_0= ruleSensorType ) ) )? (otherlv_4= 'description:' ( (lv_desc_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_desc_5_0=null;
        Enumerator lv_type_1_0 = null;

        Enumerator lv_sensorType_3_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:745:2: ( (otherlv_0= 'Device:' ( (lv_type_1_0= ruleDeviceType ) ) (otherlv_2= 'SensorType:' ( (lv_sensorType_3_0= ruleSensorType ) ) )? (otherlv_4= 'description:' ( (lv_desc_5_0= RULE_STRING ) ) )? ) )
            // InternalRobotDSL.g:746:2: (otherlv_0= 'Device:' ( (lv_type_1_0= ruleDeviceType ) ) (otherlv_2= 'SensorType:' ( (lv_sensorType_3_0= ruleSensorType ) ) )? (otherlv_4= 'description:' ( (lv_desc_5_0= RULE_STRING ) ) )? )
            {
            // InternalRobotDSL.g:746:2: (otherlv_0= 'Device:' ( (lv_type_1_0= ruleDeviceType ) ) (otherlv_2= 'SensorType:' ( (lv_sensorType_3_0= ruleSensorType ) ) )? (otherlv_4= 'description:' ( (lv_desc_5_0= RULE_STRING ) ) )? )
            // InternalRobotDSL.g:747:3: otherlv_0= 'Device:' ( (lv_type_1_0= ruleDeviceType ) ) (otherlv_2= 'SensorType:' ( (lv_sensorType_3_0= ruleSensorType ) ) )? (otherlv_4= 'description:' ( (lv_desc_5_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getDeviceKeyword_0());
            		
            // InternalRobotDSL.g:751:3: ( (lv_type_1_0= ruleDeviceType ) )
            // InternalRobotDSL.g:752:4: (lv_type_1_0= ruleDeviceType )
            {
            // InternalRobotDSL.g:752:4: (lv_type_1_0= ruleDeviceType )
            // InternalRobotDSL.g:753:5: lv_type_1_0= ruleDeviceType
            {

            					newCompositeNode(grammarAccess.getDeviceAccess().getTypeDeviceTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_type_1_0=ruleDeviceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeviceRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"des.missionrobot.RobotDSL.DeviceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotDSL.g:770:3: (otherlv_2= 'SensorType:' ( (lv_sensorType_3_0= ruleSensorType ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRobotDSL.g:771:4: otherlv_2= 'SensorType:' ( (lv_sensorType_3_0= ruleSensorType ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeviceAccess().getSensorTypeKeyword_2_0());
                    			
                    // InternalRobotDSL.g:775:4: ( (lv_sensorType_3_0= ruleSensorType ) )
                    // InternalRobotDSL.g:776:5: (lv_sensorType_3_0= ruleSensorType )
                    {
                    // InternalRobotDSL.g:776:5: (lv_sensorType_3_0= ruleSensorType )
                    // InternalRobotDSL.g:777:6: lv_sensorType_3_0= ruleSensorType
                    {

                    						newCompositeNode(grammarAccess.getDeviceAccess().getSensorTypeSensorTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_sensorType_3_0=ruleSensorType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeviceRule());
                    						}
                    						set(
                    							current,
                    							"sensorType",
                    							lv_sensorType_3_0,
                    							"des.missionrobot.RobotDSL.SensorType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRobotDSL.g:795:3: (otherlv_4= 'description:' ( (lv_desc_5_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRobotDSL.g:796:4: otherlv_4= 'description:' ( (lv_desc_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalRobotDSL.g:800:4: ( (lv_desc_5_0= RULE_STRING ) )
                    // InternalRobotDSL.g:801:5: (lv_desc_5_0= RULE_STRING )
                    {
                    // InternalRobotDSL.g:801:5: (lv_desc_5_0= RULE_STRING )
                    // InternalRobotDSL.g:802:6: lv_desc_5_0= RULE_STRING
                    {
                    lv_desc_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_desc_5_0, grammarAccess.getDeviceAccess().getDescSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeviceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"desc",
                    							lv_desc_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "ruleDeviceType"
    // InternalRobotDSL.g:823:1: ruleDeviceType returns [Enumerator current=null] : ( (enumLiteral_0= 'Motor' ) | (enumLiteral_1= 'Sensor' ) ) ;
    public final Enumerator ruleDeviceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:829:2: ( ( (enumLiteral_0= 'Motor' ) | (enumLiteral_1= 'Sensor' ) ) )
            // InternalRobotDSL.g:830:2: ( (enumLiteral_0= 'Motor' ) | (enumLiteral_1= 'Sensor' ) )
            {
            // InternalRobotDSL.g:830:2: ( (enumLiteral_0= 'Motor' ) | (enumLiteral_1= 'Sensor' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRobotDSL.g:831:3: (enumLiteral_0= 'Motor' )
                    {
                    // InternalRobotDSL.g:831:3: (enumLiteral_0= 'Motor' )
                    // InternalRobotDSL.g:832:4: enumLiteral_0= 'Motor'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getDeviceTypeAccess().getMOTOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDeviceTypeAccess().getMOTOREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:839:3: (enumLiteral_1= 'Sensor' )
                    {
                    // InternalRobotDSL.g:839:3: (enumLiteral_1= 'Sensor' )
                    // InternalRobotDSL.g:840:4: enumLiteral_1= 'Sensor'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDeviceTypeAccess().getSENSOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDeviceTypeAccess().getSENSOREnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleDeviceType"


    // $ANTLR start "ruleSensorType"
    // InternalRobotDSL.g:850:1: ruleSensorType returns [Enumerator current=null] : ( (enumLiteral_0= 'Ultrasonic' ) | (enumLiteral_1= 'Touch' ) | (enumLiteral_2= 'Color' ) ) ;
    public final Enumerator ruleSensorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:856:2: ( ( (enumLiteral_0= 'Ultrasonic' ) | (enumLiteral_1= 'Touch' ) | (enumLiteral_2= 'Color' ) ) )
            // InternalRobotDSL.g:857:2: ( (enumLiteral_0= 'Ultrasonic' ) | (enumLiteral_1= 'Touch' ) | (enumLiteral_2= 'Color' ) )
            {
            // InternalRobotDSL.g:857:2: ( (enumLiteral_0= 'Ultrasonic' ) | (enumLiteral_1= 'Touch' ) | (enumLiteral_2= 'Color' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt14=1;
                }
                break;
            case 34:
                {
                alt14=2;
                }
                break;
            case 35:
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
                    // InternalRobotDSL.g:858:3: (enumLiteral_0= 'Ultrasonic' )
                    {
                    // InternalRobotDSL.g:858:3: (enumLiteral_0= 'Ultrasonic' )
                    // InternalRobotDSL.g:859:4: enumLiteral_0= 'Ultrasonic'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getULTRASONICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSensorTypeAccess().getULTRASONICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:866:3: (enumLiteral_1= 'Touch' )
                    {
                    // InternalRobotDSL.g:866:3: (enumLiteral_1= 'Touch' )
                    // InternalRobotDSL.g:867:4: enumLiteral_1= 'Touch'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getTOUCHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSensorTypeAccess().getTOUCHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:874:3: (enumLiteral_2= 'Color' )
                    {
                    // InternalRobotDSL.g:874:3: (enumLiteral_2= 'Color' )
                    // InternalRobotDSL.g:875:4: enumLiteral_2= 'Color'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getCOLOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSensorTypeAccess().getCOLOREnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleSensorType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000007E00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007E80000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000002L});

}