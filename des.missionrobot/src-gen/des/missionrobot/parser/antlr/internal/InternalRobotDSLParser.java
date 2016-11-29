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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mission'", "'Behaviors:'", "'Goal:'", "'Behavior:'", "'priority:'", "'Triggers:'", "'Reactions:'", "'Actions:'", "'Move'", "'for'", "'sec'", "'at'", "'speed'", "'Turn'", "'deg'", "'Arm'", "'Play'", "'sound'", "'if'", "'triggered'", "'Do:'", "'is'", "'distance'", "'than'", "'cm'", "'forward'", "'backward'", "'left'", "'right'", "'high'", "'medium'", "'low'", "'raise'", "'lower'", "'buzz'", "'fanfare'", "'Color'", "'LeftLight'", "'RightLight'", "'RearHeight'", "'FrontDistance'", "'red'", "'white'", "'less'", "'greater'", "'and'", "'or'", "'once'", "'repeatable'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
        	return "MissionList";
       	}

       	@Override
       	protected RobotDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMissionList"
    // InternalRobotDSL.g:65:1: entryRuleMissionList returns [EObject current=null] : iv_ruleMissionList= ruleMissionList EOF ;
    public final EObject entryRuleMissionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionList = null;


        try {
            // InternalRobotDSL.g:65:52: (iv_ruleMissionList= ruleMissionList EOF )
            // InternalRobotDSL.g:66:2: iv_ruleMissionList= ruleMissionList EOF
            {
             newCompositeNode(grammarAccess.getMissionListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMissionList=ruleMissionList();

            state._fsp--;

             current =iv_ruleMissionList; 
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
    // $ANTLR end "entryRuleMissionList"


    // $ANTLR start "ruleMissionList"
    // InternalRobotDSL.g:72:1: ruleMissionList returns [EObject current=null] : ( (lv_missionList_0_0= ruleMission ) )+ ;
    public final EObject ruleMissionList() throws RecognitionException {
        EObject current = null;

        EObject lv_missionList_0_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:78:2: ( ( (lv_missionList_0_0= ruleMission ) )+ )
            // InternalRobotDSL.g:79:2: ( (lv_missionList_0_0= ruleMission ) )+
            {
            // InternalRobotDSL.g:79:2: ( (lv_missionList_0_0= ruleMission ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRobotDSL.g:80:3: (lv_missionList_0_0= ruleMission )
            	    {
            	    // InternalRobotDSL.g:80:3: (lv_missionList_0_0= ruleMission )
            	    // InternalRobotDSL.g:81:4: lv_missionList_0_0= ruleMission
            	    {

            	    				newCompositeNode(grammarAccess.getMissionListAccess().getMissionListMissionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_missionList_0_0=ruleMission();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMissionListRule());
            	    				}
            	    				add(
            	    					current,
            	    					"missionList",
            	    					lv_missionList_0_0,
            	    					"des.missionrobot.RobotDSL.Mission");
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
    // $ANTLR end "ruleMissionList"


    // $ANTLR start "entryRuleMission"
    // InternalRobotDSL.g:101:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalRobotDSL.g:101:48: (iv_ruleMission= ruleMission EOF )
            // InternalRobotDSL.g:102:2: iv_ruleMission= ruleMission EOF
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
    // InternalRobotDSL.g:108:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Behaviors:' ( (lv_behaviorList_3_0= ruleBehavior ) )+ otherlv_4= 'Goal:' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_behaviorList_3_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:114:2: ( (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Behaviors:' ( (lv_behaviorList_3_0= ruleBehavior ) )+ otherlv_4= 'Goal:' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalRobotDSL.g:115:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Behaviors:' ( (lv_behaviorList_3_0= ruleBehavior ) )+ otherlv_4= 'Goal:' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalRobotDSL.g:115:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Behaviors:' ( (lv_behaviorList_3_0= ruleBehavior ) )+ otherlv_4= 'Goal:' ( (otherlv_5= RULE_ID ) ) )
            // InternalRobotDSL.g:116:3: otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Behaviors:' ( (lv_behaviorList_3_0= ruleBehavior ) )+ otherlv_4= 'Goal:' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalRobotDSL.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRobotDSL.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRobotDSL.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalRobotDSL.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getBehaviorsKeyword_2());
            		
            // InternalRobotDSL.g:142:3: ( (lv_behaviorList_3_0= ruleBehavior ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRobotDSL.g:143:4: (lv_behaviorList_3_0= ruleBehavior )
            	    {
            	    // InternalRobotDSL.g:143:4: (lv_behaviorList_3_0= ruleBehavior )
            	    // InternalRobotDSL.g:144:5: lv_behaviorList_3_0= ruleBehavior
            	    {

            	    					newCompositeNode(grammarAccess.getMissionAccess().getBehaviorListBehaviorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_behaviorList_3_0=ruleBehavior();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMissionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"behaviorList",
            	    						lv_behaviorList_3_0,
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

            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getGoalKeyword_4());
            		
            // InternalRobotDSL.g:165:3: ( (otherlv_5= RULE_ID ) )
            // InternalRobotDSL.g:166:4: (otherlv_5= RULE_ID )
            {
            // InternalRobotDSL.g:166:4: (otherlv_5= RULE_ID )
            // InternalRobotDSL.g:167:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getMissionAccess().getGoalEventsEventCrossReference_5_0());
            				

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
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleBehavior"
    // InternalRobotDSL.g:182:1: entryRuleBehavior returns [EObject current=null] : iv_ruleBehavior= ruleBehavior EOF ;
    public final EObject entryRuleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavior = null;


        try {
            // InternalRobotDSL.g:182:49: (iv_ruleBehavior= ruleBehavior EOF )
            // InternalRobotDSL.g:183:2: iv_ruleBehavior= ruleBehavior EOF
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
    // InternalRobotDSL.g:189:1: ruleBehavior returns [EObject current=null] : (otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) ( (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ ) (otherlv_6= 'Reactions:' ( (lv_reactionList_7_0= ruleReaction ) )+ )? )? (otherlv_8= 'Actions:' ( (lv_actionList_9_0= ruleAction ) )+ )? ) ;
    public final EObject ruleBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_prio_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_triggerList_5_0 = null;

        EObject lv_reactionList_7_0 = null;

        EObject lv_actionList_9_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:195:2: ( (otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) ( (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ ) (otherlv_6= 'Reactions:' ( (lv_reactionList_7_0= ruleReaction ) )+ )? )? (otherlv_8= 'Actions:' ( (lv_actionList_9_0= ruleAction ) )+ )? ) )
            // InternalRobotDSL.g:196:2: (otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) ( (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ ) (otherlv_6= 'Reactions:' ( (lv_reactionList_7_0= ruleReaction ) )+ )? )? (otherlv_8= 'Actions:' ( (lv_actionList_9_0= ruleAction ) )+ )? )
            {
            // InternalRobotDSL.g:196:2: (otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) ( (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ ) (otherlv_6= 'Reactions:' ( (lv_reactionList_7_0= ruleReaction ) )+ )? )? (otherlv_8= 'Actions:' ( (lv_actionList_9_0= ruleAction ) )+ )? )
            // InternalRobotDSL.g:197:3: otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) ( (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ ) (otherlv_6= 'Reactions:' ( (lv_reactionList_7_0= ruleReaction ) )+ )? )? (otherlv_8= 'Actions:' ( (lv_actionList_9_0= ruleAction ) )+ )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBehaviorAccess().getBehaviorKeyword_0());
            		
            // InternalRobotDSL.g:201:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRobotDSL.g:202:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRobotDSL.g:202:4: (lv_name_1_0= RULE_ID )
            // InternalRobotDSL.g:203:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviorAccess().getPriorityKeyword_2());
            		
            // InternalRobotDSL.g:223:3: ( (lv_prio_3_0= RULE_INT ) )
            // InternalRobotDSL.g:224:4: (lv_prio_3_0= RULE_INT )
            {
            // InternalRobotDSL.g:224:4: (lv_prio_3_0= RULE_INT )
            // InternalRobotDSL.g:225:5: lv_prio_3_0= RULE_INT
            {
            lv_prio_3_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            // InternalRobotDSL.g:241:3: ( (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ ) (otherlv_6= 'Reactions:' ( (lv_reactionList_7_0= ruleReaction ) )+ )? )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRobotDSL.g:242:4: (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ ) (otherlv_6= 'Reactions:' ( (lv_reactionList_7_0= ruleReaction ) )+ )?
                    {
                    // InternalRobotDSL.g:242:4: (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ )
                    // InternalRobotDSL.g:243:5: otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_11); 

                    					newLeafNode(otherlv_4, grammarAccess.getBehaviorAccess().getTriggersKeyword_4_0_0());
                    				
                    // InternalRobotDSL.g:247:5: ( (lv_triggerList_5_0= ruleTrigger ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID||(LA3_0>=47 && LA3_0<=51)||(LA3_0>=54 && LA3_0<=57)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRobotDSL.g:248:6: (lv_triggerList_5_0= ruleTrigger )
                    	    {
                    	    // InternalRobotDSL.g:248:6: (lv_triggerList_5_0= ruleTrigger )
                    	    // InternalRobotDSL.g:249:7: lv_triggerList_5_0= ruleTrigger
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviorAccess().getTriggerListTriggerParserRuleCall_4_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_triggerList_5_0=ruleTrigger();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"triggerList",
                    	    								lv_triggerList_5_0,
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

                    // InternalRobotDSL.g:267:4: (otherlv_6= 'Reactions:' ( (lv_reactionList_7_0= ruleReaction ) )+ )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==17) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalRobotDSL.g:268:5: otherlv_6= 'Reactions:' ( (lv_reactionList_7_0= ruleReaction ) )+
                            {
                            otherlv_6=(Token)match(input,17,FOLLOW_13); 

                            					newLeafNode(otherlv_6, grammarAccess.getBehaviorAccess().getReactionsKeyword_4_1_0());
                            				
                            // InternalRobotDSL.g:272:5: ( (lv_reactionList_7_0= ruleReaction ) )+
                            int cnt4=0;
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==29) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // InternalRobotDSL.g:273:6: (lv_reactionList_7_0= ruleReaction )
                            	    {
                            	    // InternalRobotDSL.g:273:6: (lv_reactionList_7_0= ruleReaction )
                            	    // InternalRobotDSL.g:274:7: lv_reactionList_7_0= ruleReaction
                            	    {

                            	    							newCompositeNode(grammarAccess.getBehaviorAccess().getReactionListReactionParserRuleCall_4_1_1_0());
                            	    						
                            	    pushFollow(FOLLOW_14);
                            	    lv_reactionList_7_0=ruleReaction();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getBehaviorRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"reactionList",
                            	    								lv_reactionList_7_0,
                            	    								"des.missionrobot.RobotDSL.Reaction");
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


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalRobotDSL.g:293:3: (otherlv_8= 'Actions:' ( (lv_actionList_9_0= ruleAction ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRobotDSL.g:294:4: otherlv_8= 'Actions:' ( (lv_actionList_9_0= ruleAction ) )+
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getBehaviorAccess().getActionsKeyword_5_0());
                    			
                    // InternalRobotDSL.g:298:4: ( (lv_actionList_9_0= ruleAction ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==19||LA7_0==24||(LA7_0>=26 && LA7_0<=27)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRobotDSL.g:299:5: (lv_actionList_9_0= ruleAction )
                    	    {
                    	    // InternalRobotDSL.g:299:5: (lv_actionList_9_0= ruleAction )
                    	    // InternalRobotDSL.g:300:6: lv_actionList_9_0= ruleAction
                    	    {

                    	    						newCompositeNode(grammarAccess.getBehaviorAccess().getActionListActionParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_actionList_9_0=ruleAction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBehaviorRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"actionList",
                    	    							lv_actionList_9_0,
                    	    							"des.missionrobot.RobotDSL.Action");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


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
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleAction"
    // InternalRobotDSL.g:322:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRobotDSL.g:322:47: (iv_ruleAction= ruleAction EOF )
            // InternalRobotDSL.g:323:2: iv_ruleAction= ruleAction EOF
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
    // InternalRobotDSL.g:329:1: ruleAction returns [EObject current=null] : ( (otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? ) | (otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) ) ) | (otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_duration_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_degr_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_dir_1_0 = null;

        Enumerator lv_speed_6_0 = null;

        Enumerator lv_dir_9_0 = null;

        Enumerator lv_op_13_0 = null;

        Enumerator lv_sound_16_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:335:2: ( ( (otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? ) | (otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) ) ) | (otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) ) ) ) )
            // InternalRobotDSL.g:336:2: ( (otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? ) | (otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) ) ) | (otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) ) ) )
            {
            // InternalRobotDSL.g:336:2: ( (otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? ) | (otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) ) ) | (otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 27:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRobotDSL.g:337:3: (otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? )
                    {
                    // InternalRobotDSL.g:337:3: (otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? )
                    // InternalRobotDSL.g:338:4: otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )?
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getActionAccess().getMoveKeyword_0_0());
                    			
                    // InternalRobotDSL.g:342:4: ( (lv_dir_1_0= ruleDirection ) )
                    // InternalRobotDSL.g:343:5: (lv_dir_1_0= ruleDirection )
                    {
                    // InternalRobotDSL.g:343:5: (lv_dir_1_0= ruleDirection )
                    // InternalRobotDSL.g:344:6: lv_dir_1_0= ruleDirection
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getDirDirectionEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_dir_1_0=ruleDirection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"dir",
                    							lv_dir_1_0,
                    							"des.missionrobot.RobotDSL.Direction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotDSL.g:361:4: (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==20) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRobotDSL.g:362:5: otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec'
                            {
                            otherlv_2=(Token)match(input,20,FOLLOW_9); 

                            					newLeafNode(otherlv_2, grammarAccess.getActionAccess().getForKeyword_0_2_0());
                            				
                            // InternalRobotDSL.g:366:5: ( (lv_duration_3_0= RULE_INT ) )
                            // InternalRobotDSL.g:367:6: (lv_duration_3_0= RULE_INT )
                            {
                            // InternalRobotDSL.g:367:6: (lv_duration_3_0= RULE_INT )
                            // InternalRobotDSL.g:368:7: lv_duration_3_0= RULE_INT
                            {
                            lv_duration_3_0=(Token)match(input,RULE_INT,FOLLOW_19); 

                            							newLeafNode(lv_duration_3_0, grammarAccess.getActionAccess().getDurationINTTerminalRuleCall_0_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getActionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"duration",
                            								lv_duration_3_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }

                            otherlv_4=(Token)match(input,21,FOLLOW_20); 

                            					newLeafNode(otherlv_4, grammarAccess.getActionAccess().getSecKeyword_0_2_2());
                            				

                            }
                            break;

                    }

                    // InternalRobotDSL.g:389:4: (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==22) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalRobotDSL.g:390:5: otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed'
                            {
                            otherlv_5=(Token)match(input,22,FOLLOW_21); 

                            					newLeafNode(otherlv_5, grammarAccess.getActionAccess().getAtKeyword_0_3_0());
                            				
                            // InternalRobotDSL.g:394:5: ( (lv_speed_6_0= ruleSpeed ) )
                            // InternalRobotDSL.g:395:6: (lv_speed_6_0= ruleSpeed )
                            {
                            // InternalRobotDSL.g:395:6: (lv_speed_6_0= ruleSpeed )
                            // InternalRobotDSL.g:396:7: lv_speed_6_0= ruleSpeed
                            {

                            							newCompositeNode(grammarAccess.getActionAccess().getSpeedSpeedEnumRuleCall_0_3_1_0());
                            						
                            pushFollow(FOLLOW_22);
                            lv_speed_6_0=ruleSpeed();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getActionRule());
                            							}
                            							set(
                            								current,
                            								"speed",
                            								lv_speed_6_0,
                            								"des.missionrobot.RobotDSL.Speed");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_7=(Token)match(input,23,FOLLOW_2); 

                            					newLeafNode(otherlv_7, grammarAccess.getActionAccess().getSpeedKeyword_0_3_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:420:3: (otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' )
                    {
                    // InternalRobotDSL.g:420:3: (otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' )
                    // InternalRobotDSL.g:421:4: otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg'
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionAccess().getTurnKeyword_1_0());
                    			
                    // InternalRobotDSL.g:425:4: ( (lv_dir_9_0= ruleDirection ) )
                    // InternalRobotDSL.g:426:5: (lv_dir_9_0= ruleDirection )
                    {
                    // InternalRobotDSL.g:426:5: (lv_dir_9_0= ruleDirection )
                    // InternalRobotDSL.g:427:6: lv_dir_9_0= ruleDirection
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getDirDirectionEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_dir_9_0=ruleDirection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"dir",
                    							lv_dir_9_0,
                    							"des.missionrobot.RobotDSL.Direction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotDSL.g:444:4: ( (lv_degr_10_0= RULE_INT ) )
                    // InternalRobotDSL.g:445:5: (lv_degr_10_0= RULE_INT )
                    {
                    // InternalRobotDSL.g:445:5: (lv_degr_10_0= RULE_INT )
                    // InternalRobotDSL.g:446:6: lv_degr_10_0= RULE_INT
                    {
                    lv_degr_10_0=(Token)match(input,RULE_INT,FOLLOW_23); 

                    						newLeafNode(lv_degr_10_0, grammarAccess.getActionAccess().getDegrINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"degr",
                    							lv_degr_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getActionAccess().getDegKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:468:3: (otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) ) )
                    {
                    // InternalRobotDSL.g:468:3: (otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) ) )
                    // InternalRobotDSL.g:469:4: otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) )
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_12, grammarAccess.getActionAccess().getArmKeyword_2_0());
                    			
                    // InternalRobotDSL.g:473:4: ( (lv_op_13_0= ruleArmOp ) )
                    // InternalRobotDSL.g:474:5: (lv_op_13_0= ruleArmOp )
                    {
                    // InternalRobotDSL.g:474:5: (lv_op_13_0= ruleArmOp )
                    // InternalRobotDSL.g:475:6: lv_op_13_0= ruleArmOp
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getOpArmOpEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_op_13_0=ruleArmOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_13_0,
                    							"des.missionrobot.RobotDSL.ArmOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:494:3: (otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) ) )
                    {
                    // InternalRobotDSL.g:494:3: (otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) ) )
                    // InternalRobotDSL.g:495:4: otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) )
                    {
                    otherlv_14=(Token)match(input,27,FOLLOW_25); 

                    				newLeafNode(otherlv_14, grammarAccess.getActionAccess().getPlayKeyword_3_0());
                    			
                    otherlv_15=(Token)match(input,28,FOLLOW_26); 

                    				newLeafNode(otherlv_15, grammarAccess.getActionAccess().getSoundKeyword_3_1());
                    			
                    // InternalRobotDSL.g:503:4: ( (lv_sound_16_0= ruleSound ) )
                    // InternalRobotDSL.g:504:5: (lv_sound_16_0= ruleSound )
                    {
                    // InternalRobotDSL.g:504:5: (lv_sound_16_0= ruleSound )
                    // InternalRobotDSL.g:505:6: lv_sound_16_0= ruleSound
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getSoundSoundEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sound_16_0=ruleSound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"sound",
                    							lv_sound_16_0,
                    							"des.missionrobot.RobotDSL.Sound");
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleReaction"
    // InternalRobotDSL.g:527:1: entryRuleReaction returns [EObject current=null] : iv_ruleReaction= ruleReaction EOF ;
    public final EObject entryRuleReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaction = null;


        try {
            // InternalRobotDSL.g:527:49: (iv_ruleReaction= ruleReaction EOF )
            // InternalRobotDSL.g:528:2: iv_ruleReaction= ruleReaction EOF
            {
             newCompositeNode(grammarAccess.getReactionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReaction=ruleReaction();

            state._fsp--;

             current =iv_ruleReaction; 
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
    // $ANTLR end "entryRuleReaction"


    // $ANTLR start "ruleReaction"
    // InternalRobotDSL.g:534:1: ruleReaction returns [EObject current=null] : (otherlv_0= 'if' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'triggered' otherlv_3= 'Do:' ( (lv_reactions_4_0= ruleAction ) )+ ) ;
    public final EObject ruleReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_reactions_4_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:540:2: ( (otherlv_0= 'if' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'triggered' otherlv_3= 'Do:' ( (lv_reactions_4_0= ruleAction ) )+ ) )
            // InternalRobotDSL.g:541:2: (otherlv_0= 'if' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'triggered' otherlv_3= 'Do:' ( (lv_reactions_4_0= ruleAction ) )+ )
            {
            // InternalRobotDSL.g:541:2: (otherlv_0= 'if' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'triggered' otherlv_3= 'Do:' ( (lv_reactions_4_0= ruleAction ) )+ )
            // InternalRobotDSL.g:542:3: otherlv_0= 'if' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'triggered' otherlv_3= 'Do:' ( (lv_reactions_4_0= ruleAction ) )+
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReactionAccess().getIfKeyword_0());
            		
            // InternalRobotDSL.g:546:3: ( (otherlv_1= RULE_ID ) )
            // InternalRobotDSL.g:547:4: (otherlv_1= RULE_ID )
            {
            // InternalRobotDSL.g:547:4: (otherlv_1= RULE_ID )
            // InternalRobotDSL.g:548:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_1, grammarAccess.getReactionAccess().getEventEventCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getReactionAccess().getTriggeredKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getReactionAccess().getDoKeyword_3());
            		
            // InternalRobotDSL.g:567:3: ( (lv_reactions_4_0= ruleAction ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19||LA12_0==24||(LA12_0>=26 && LA12_0<=27)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRobotDSL.g:568:4: (lv_reactions_4_0= ruleAction )
            	    {
            	    // InternalRobotDSL.g:568:4: (lv_reactions_4_0= ruleAction )
            	    // InternalRobotDSL.g:569:5: lv_reactions_4_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getReactionAccess().getReactionsActionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_reactions_4_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reactions",
            	    						lv_reactions_4_0,
            	    						"des.missionrobot.RobotDSL.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // $ANTLR end "ruleReaction"


    // $ANTLR start "entryRuleTrigger"
    // InternalRobotDSL.g:590:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalRobotDSL.g:590:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalRobotDSL.g:591:2: iv_ruleTrigger= ruleTrigger EOF
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
    // InternalRobotDSL.g:597:1: ruleTrigger returns [EObject current=null] : ( ( (lv_boolType_0_0= ruleBool ) )? ( (otherlv_1= RULE_ID ) )? ( (lv_sensor_2_0= ruleSensor ) ) ( (otherlv_3= 'is' ( (lv_color_4_0= ruleColor ) ) ) | (otherlv_5= 'distance' ( (lv_bool_6_0= ruleBool ) ) otherlv_7= 'than' ( (lv_distance_8_0= RULE_INT ) ) otherlv_9= 'cm' ) ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_distance_8_0=null;
        Token otherlv_9=null;
        Enumerator lv_boolType_0_0 = null;

        Enumerator lv_sensor_2_0 = null;

        Enumerator lv_color_4_0 = null;

        Enumerator lv_bool_6_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:603:2: ( ( ( (lv_boolType_0_0= ruleBool ) )? ( (otherlv_1= RULE_ID ) )? ( (lv_sensor_2_0= ruleSensor ) ) ( (otherlv_3= 'is' ( (lv_color_4_0= ruleColor ) ) ) | (otherlv_5= 'distance' ( (lv_bool_6_0= ruleBool ) ) otherlv_7= 'than' ( (lv_distance_8_0= RULE_INT ) ) otherlv_9= 'cm' ) ) ) )
            // InternalRobotDSL.g:604:2: ( ( (lv_boolType_0_0= ruleBool ) )? ( (otherlv_1= RULE_ID ) )? ( (lv_sensor_2_0= ruleSensor ) ) ( (otherlv_3= 'is' ( (lv_color_4_0= ruleColor ) ) ) | (otherlv_5= 'distance' ( (lv_bool_6_0= ruleBool ) ) otherlv_7= 'than' ( (lv_distance_8_0= RULE_INT ) ) otherlv_9= 'cm' ) ) )
            {
            // InternalRobotDSL.g:604:2: ( ( (lv_boolType_0_0= ruleBool ) )? ( (otherlv_1= RULE_ID ) )? ( (lv_sensor_2_0= ruleSensor ) ) ( (otherlv_3= 'is' ( (lv_color_4_0= ruleColor ) ) ) | (otherlv_5= 'distance' ( (lv_bool_6_0= ruleBool ) ) otherlv_7= 'than' ( (lv_distance_8_0= RULE_INT ) ) otherlv_9= 'cm' ) ) )
            // InternalRobotDSL.g:605:3: ( (lv_boolType_0_0= ruleBool ) )? ( (otherlv_1= RULE_ID ) )? ( (lv_sensor_2_0= ruleSensor ) ) ( (otherlv_3= 'is' ( (lv_color_4_0= ruleColor ) ) ) | (otherlv_5= 'distance' ( (lv_bool_6_0= ruleBool ) ) otherlv_7= 'than' ( (lv_distance_8_0= RULE_INT ) ) otherlv_9= 'cm' ) )
            {
            // InternalRobotDSL.g:605:3: ( (lv_boolType_0_0= ruleBool ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=54 && LA13_0<=57)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRobotDSL.g:606:4: (lv_boolType_0_0= ruleBool )
                    {
                    // InternalRobotDSL.g:606:4: (lv_boolType_0_0= ruleBool )
                    // InternalRobotDSL.g:607:5: lv_boolType_0_0= ruleBool
                    {

                    					newCompositeNode(grammarAccess.getTriggerAccess().getBoolTypeBoolEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_boolType_0_0=ruleBool();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTriggerRule());
                    					}
                    					set(
                    						current,
                    						"boolType",
                    						lv_boolType_0_0,
                    						"des.missionrobot.RobotDSL.Bool");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalRobotDSL.g:624:3: ( (otherlv_1= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRobotDSL.g:625:4: (otherlv_1= RULE_ID )
                    {
                    // InternalRobotDSL.g:625:4: (otherlv_1= RULE_ID )
                    // InternalRobotDSL.g:626:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTriggerRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

                    					newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getEventEventCrossReference_1_0());
                    				

                    }


                    }
                    break;

            }

            // InternalRobotDSL.g:637:3: ( (lv_sensor_2_0= ruleSensor ) )
            // InternalRobotDSL.g:638:4: (lv_sensor_2_0= ruleSensor )
            {
            // InternalRobotDSL.g:638:4: (lv_sensor_2_0= ruleSensor )
            // InternalRobotDSL.g:639:5: lv_sensor_2_0= ruleSensor
            {

            					newCompositeNode(grammarAccess.getTriggerAccess().getSensorSensorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
            lv_sensor_2_0=ruleSensor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTriggerRule());
            					}
            					set(
            						current,
            						"sensor",
            						lv_sensor_2_0,
            						"des.missionrobot.RobotDSL.Sensor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotDSL.g:656:3: ( (otherlv_3= 'is' ( (lv_color_4_0= ruleColor ) ) ) | (otherlv_5= 'distance' ( (lv_bool_6_0= ruleBool ) ) otherlv_7= 'than' ( (lv_distance_8_0= RULE_INT ) ) otherlv_9= 'cm' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            else if ( (LA15_0==33) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRobotDSL.g:657:4: (otherlv_3= 'is' ( (lv_color_4_0= ruleColor ) ) )
                    {
                    // InternalRobotDSL.g:657:4: (otherlv_3= 'is' ( (lv_color_4_0= ruleColor ) ) )
                    // InternalRobotDSL.g:658:5: otherlv_3= 'is' ( (lv_color_4_0= ruleColor ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_30); 

                    					newLeafNode(otherlv_3, grammarAccess.getTriggerAccess().getIsKeyword_3_0_0());
                    				
                    // InternalRobotDSL.g:662:5: ( (lv_color_4_0= ruleColor ) )
                    // InternalRobotDSL.g:663:6: (lv_color_4_0= ruleColor )
                    {
                    // InternalRobotDSL.g:663:6: (lv_color_4_0= ruleColor )
                    // InternalRobotDSL.g:664:7: lv_color_4_0= ruleColor
                    {

                    							newCompositeNode(grammarAccess.getTriggerAccess().getColorColorEnumRuleCall_3_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_color_4_0=ruleColor();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTriggerRule());
                    							}
                    							set(
                    								current,
                    								"color",
                    								lv_color_4_0,
                    								"des.missionrobot.RobotDSL.Color");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:683:4: (otherlv_5= 'distance' ( (lv_bool_6_0= ruleBool ) ) otherlv_7= 'than' ( (lv_distance_8_0= RULE_INT ) ) otherlv_9= 'cm' )
                    {
                    // InternalRobotDSL.g:683:4: (otherlv_5= 'distance' ( (lv_bool_6_0= ruleBool ) ) otherlv_7= 'than' ( (lv_distance_8_0= RULE_INT ) ) otherlv_9= 'cm' )
                    // InternalRobotDSL.g:684:5: otherlv_5= 'distance' ( (lv_bool_6_0= ruleBool ) ) otherlv_7= 'than' ( (lv_distance_8_0= RULE_INT ) ) otherlv_9= 'cm'
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_31); 

                    					newLeafNode(otherlv_5, grammarAccess.getTriggerAccess().getDistanceKeyword_3_1_0());
                    				
                    // InternalRobotDSL.g:688:5: ( (lv_bool_6_0= ruleBool ) )
                    // InternalRobotDSL.g:689:6: (lv_bool_6_0= ruleBool )
                    {
                    // InternalRobotDSL.g:689:6: (lv_bool_6_0= ruleBool )
                    // InternalRobotDSL.g:690:7: lv_bool_6_0= ruleBool
                    {

                    							newCompositeNode(grammarAccess.getTriggerAccess().getBoolBoolEnumRuleCall_3_1_1_0());
                    						
                    pushFollow(FOLLOW_32);
                    lv_bool_6_0=ruleBool();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTriggerRule());
                    							}
                    							set(
                    								current,
                    								"bool",
                    								lv_bool_6_0,
                    								"des.missionrobot.RobotDSL.Bool");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,34,FOLLOW_9); 

                    					newLeafNode(otherlv_7, grammarAccess.getTriggerAccess().getThanKeyword_3_1_2());
                    				
                    // InternalRobotDSL.g:711:5: ( (lv_distance_8_0= RULE_INT ) )
                    // InternalRobotDSL.g:712:6: (lv_distance_8_0= RULE_INT )
                    {
                    // InternalRobotDSL.g:712:6: (lv_distance_8_0= RULE_INT )
                    // InternalRobotDSL.g:713:7: lv_distance_8_0= RULE_INT
                    {
                    lv_distance_8_0=(Token)match(input,RULE_INT,FOLLOW_33); 

                    							newLeafNode(lv_distance_8_0, grammarAccess.getTriggerAccess().getDistanceINTTerminalRuleCall_3_1_3_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTriggerRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"distance",
                    								lv_distance_8_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    otherlv_9=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(otherlv_9, grammarAccess.getTriggerAccess().getCmKeyword_3_1_4());
                    				

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


    // $ANTLR start "ruleDirection"
    // InternalRobotDSL.g:739:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:745:2: ( ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) ) )
            // InternalRobotDSL.g:746:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) )
            {
            // InternalRobotDSL.g:746:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt16=1;
                }
                break;
            case 37:
                {
                alt16=2;
                }
                break;
            case 38:
                {
                alt16=3;
                }
                break;
            case 39:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalRobotDSL.g:747:3: (enumLiteral_0= 'forward' )
                    {
                    // InternalRobotDSL.g:747:3: (enumLiteral_0= 'forward' )
                    // InternalRobotDSL.g:748:4: enumLiteral_0= 'forward'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getFORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getFORWARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:755:3: (enumLiteral_1= 'backward' )
                    {
                    // InternalRobotDSL.g:755:3: (enumLiteral_1= 'backward' )
                    // InternalRobotDSL.g:756:4: enumLiteral_1= 'backward'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getBACKWARDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getBACKWARDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:763:3: (enumLiteral_2= 'left' )
                    {
                    // InternalRobotDSL.g:763:3: (enumLiteral_2= 'left' )
                    // InternalRobotDSL.g:764:4: enumLiteral_2= 'left'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:771:3: (enumLiteral_3= 'right' )
                    {
                    // InternalRobotDSL.g:771:3: (enumLiteral_3= 'right' )
                    // InternalRobotDSL.g:772:4: enumLiteral_3= 'right'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getRIGHTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectionAccess().getRIGHTEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleDirection"


    // $ANTLR start "ruleSpeed"
    // InternalRobotDSL.g:782:1: ruleSpeed returns [Enumerator current=null] : ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'low' ) ) ;
    public final Enumerator ruleSpeed() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:788:2: ( ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'low' ) ) )
            // InternalRobotDSL.g:789:2: ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'low' ) )
            {
            // InternalRobotDSL.g:789:2: ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'low' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt17=1;
                }
                break;
            case 41:
                {
                alt17=2;
                }
                break;
            case 42:
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
                    // InternalRobotDSL.g:790:3: (enumLiteral_0= 'high' )
                    {
                    // InternalRobotDSL.g:790:3: (enumLiteral_0= 'high' )
                    // InternalRobotDSL.g:791:4: enumLiteral_0= 'high'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getSpeedAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSpeedAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:798:3: (enumLiteral_1= 'medium' )
                    {
                    // InternalRobotDSL.g:798:3: (enumLiteral_1= 'medium' )
                    // InternalRobotDSL.g:799:4: enumLiteral_1= 'medium'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getSpeedAccess().getMEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSpeedAccess().getMEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:806:3: (enumLiteral_2= 'low' )
                    {
                    // InternalRobotDSL.g:806:3: (enumLiteral_2= 'low' )
                    // InternalRobotDSL.g:807:4: enumLiteral_2= 'low'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getSpeedAccess().getLOWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSpeedAccess().getLOWEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleSpeed"


    // $ANTLR start "ruleArmOp"
    // InternalRobotDSL.g:817:1: ruleArmOp returns [Enumerator current=null] : ( (enumLiteral_0= 'raise' ) | (enumLiteral_1= 'lower' ) ) ;
    public final Enumerator ruleArmOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:823:2: ( ( (enumLiteral_0= 'raise' ) | (enumLiteral_1= 'lower' ) ) )
            // InternalRobotDSL.g:824:2: ( (enumLiteral_0= 'raise' ) | (enumLiteral_1= 'lower' ) )
            {
            // InternalRobotDSL.g:824:2: ( (enumLiteral_0= 'raise' ) | (enumLiteral_1= 'lower' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            else if ( (LA18_0==44) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalRobotDSL.g:825:3: (enumLiteral_0= 'raise' )
                    {
                    // InternalRobotDSL.g:825:3: (enumLiteral_0= 'raise' )
                    // InternalRobotDSL.g:826:4: enumLiteral_0= 'raise'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getArmOpAccess().getUPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getArmOpAccess().getUPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:833:3: (enumLiteral_1= 'lower' )
                    {
                    // InternalRobotDSL.g:833:3: (enumLiteral_1= 'lower' )
                    // InternalRobotDSL.g:834:4: enumLiteral_1= 'lower'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getArmOpAccess().getDOWNEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getArmOpAccess().getDOWNEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleArmOp"


    // $ANTLR start "ruleSound"
    // InternalRobotDSL.g:844:1: ruleSound returns [Enumerator current=null] : ( (enumLiteral_0= 'buzz' ) | (enumLiteral_1= 'fanfare' ) ) ;
    public final Enumerator ruleSound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:850:2: ( ( (enumLiteral_0= 'buzz' ) | (enumLiteral_1= 'fanfare' ) ) )
            // InternalRobotDSL.g:851:2: ( (enumLiteral_0= 'buzz' ) | (enumLiteral_1= 'fanfare' ) )
            {
            // InternalRobotDSL.g:851:2: ( (enumLiteral_0= 'buzz' ) | (enumLiteral_1= 'fanfare' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            else if ( (LA19_0==46) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalRobotDSL.g:852:3: (enumLiteral_0= 'buzz' )
                    {
                    // InternalRobotDSL.g:852:3: (enumLiteral_0= 'buzz' )
                    // InternalRobotDSL.g:853:4: enumLiteral_0= 'buzz'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getSoundAccess().getBuzzEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSoundAccess().getBuzzEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:860:3: (enumLiteral_1= 'fanfare' )
                    {
                    // InternalRobotDSL.g:860:3: (enumLiteral_1= 'fanfare' )
                    // InternalRobotDSL.g:861:4: enumLiteral_1= 'fanfare'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getSoundAccess().getFanfareEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSoundAccess().getFanfareEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSound"


    // $ANTLR start "ruleSensor"
    // InternalRobotDSL.g:871:1: ruleSensor returns [Enumerator current=null] : ( (enumLiteral_0= 'Color' ) | (enumLiteral_1= 'LeftLight' ) | (enumLiteral_2= 'RightLight' ) | (enumLiteral_3= 'RearHeight' ) | (enumLiteral_4= 'FrontDistance' ) ) ;
    public final Enumerator ruleSensor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:877:2: ( ( (enumLiteral_0= 'Color' ) | (enumLiteral_1= 'LeftLight' ) | (enumLiteral_2= 'RightLight' ) | (enumLiteral_3= 'RearHeight' ) | (enumLiteral_4= 'FrontDistance' ) ) )
            // InternalRobotDSL.g:878:2: ( (enumLiteral_0= 'Color' ) | (enumLiteral_1= 'LeftLight' ) | (enumLiteral_2= 'RightLight' ) | (enumLiteral_3= 'RearHeight' ) | (enumLiteral_4= 'FrontDistance' ) )
            {
            // InternalRobotDSL.g:878:2: ( (enumLiteral_0= 'Color' ) | (enumLiteral_1= 'LeftLight' ) | (enumLiteral_2= 'RightLight' ) | (enumLiteral_3= 'RearHeight' ) | (enumLiteral_4= 'FrontDistance' ) )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt20=1;
                }
                break;
            case 48:
                {
                alt20=2;
                }
                break;
            case 49:
                {
                alt20=3;
                }
                break;
            case 50:
                {
                alt20=4;
                }
                break;
            case 51:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalRobotDSL.g:879:3: (enumLiteral_0= 'Color' )
                    {
                    // InternalRobotDSL.g:879:3: (enumLiteral_0= 'Color' )
                    // InternalRobotDSL.g:880:4: enumLiteral_0= 'Color'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getSensorAccess().getCOLOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSensorAccess().getCOLOREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:887:3: (enumLiteral_1= 'LeftLight' )
                    {
                    // InternalRobotDSL.g:887:3: (enumLiteral_1= 'LeftLight' )
                    // InternalRobotDSL.g:888:4: enumLiteral_1= 'LeftLight'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getSensorAccess().getLEFTLIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSensorAccess().getLEFTLIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:895:3: (enumLiteral_2= 'RightLight' )
                    {
                    // InternalRobotDSL.g:895:3: (enumLiteral_2= 'RightLight' )
                    // InternalRobotDSL.g:896:4: enumLiteral_2= 'RightLight'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getSensorAccess().getRIGHTLIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSensorAccess().getRIGHTLIGHTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:903:3: (enumLiteral_3= 'RearHeight' )
                    {
                    // InternalRobotDSL.g:903:3: (enumLiteral_3= 'RearHeight' )
                    // InternalRobotDSL.g:904:4: enumLiteral_3= 'RearHeight'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getSensorAccess().getBACKUSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSensorAccess().getBACKUSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRobotDSL.g:911:3: (enumLiteral_4= 'FrontDistance' )
                    {
                    // InternalRobotDSL.g:911:3: (enumLiteral_4= 'FrontDistance' )
                    // InternalRobotDSL.g:912:4: enumLiteral_4= 'FrontDistance'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getSensorAccess().getFRONTUSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSensorAccess().getFRONTUSEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "ruleColor"
    // InternalRobotDSL.g:922:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'white' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:928:2: ( ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'white' ) ) )
            // InternalRobotDSL.g:929:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'white' ) )
            {
            // InternalRobotDSL.g:929:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'white' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==52) ) {
                alt21=1;
            }
            else if ( (LA21_0==53) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalRobotDSL.g:930:3: (enumLiteral_0= 'red' )
                    {
                    // InternalRobotDSL.g:930:3: (enumLiteral_0= 'red' )
                    // InternalRobotDSL.g:931:4: enumLiteral_0= 'red'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:938:3: (enumLiteral_1= 'white' )
                    {
                    // InternalRobotDSL.g:938:3: (enumLiteral_1= 'white' )
                    // InternalRobotDSL.g:939:4: enumLiteral_1= 'white'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getWHITEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getWHITEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "ruleBool"
    // InternalRobotDSL.g:949:1: ruleBool returns [Enumerator current=null] : ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'and' ) | (enumLiteral_3= 'or' ) ) ;
    public final Enumerator ruleBool() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:955:2: ( ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'and' ) | (enumLiteral_3= 'or' ) ) )
            // InternalRobotDSL.g:956:2: ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'and' ) | (enumLiteral_3= 'or' ) )
            {
            // InternalRobotDSL.g:956:2: ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'and' ) | (enumLiteral_3= 'or' ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt22=1;
                }
                break;
            case 55:
                {
                alt22=2;
                }
                break;
            case 56:
                {
                alt22=3;
                }
                break;
            case 57:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalRobotDSL.g:957:3: (enumLiteral_0= 'less' )
                    {
                    // InternalRobotDSL.g:957:3: (enumLiteral_0= 'less' )
                    // InternalRobotDSL.g:958:4: enumLiteral_0= 'less'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getBoolAccess().getLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBoolAccess().getLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:965:3: (enumLiteral_1= 'greater' )
                    {
                    // InternalRobotDSL.g:965:3: (enumLiteral_1= 'greater' )
                    // InternalRobotDSL.g:966:4: enumLiteral_1= 'greater'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getBoolAccess().getGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBoolAccess().getGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:973:3: (enumLiteral_2= 'and' )
                    {
                    // InternalRobotDSL.g:973:3: (enumLiteral_2= 'and' )
                    // InternalRobotDSL.g:974:4: enumLiteral_2= 'and'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getBoolAccess().getANDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBoolAccess().getANDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:981:3: (enumLiteral_3= 'or' )
                    {
                    // InternalRobotDSL.g:981:3: (enumLiteral_3= 'or' )
                    // InternalRobotDSL.g:982:4: enumLiteral_3= 'or'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getBoolAccess().getOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBoolAccess().getOREnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleBool"


    // $ANTLR start "ruleRepeat"
    // InternalRobotDSL.g:992:1: ruleRepeat returns [Enumerator current=null] : ( (enumLiteral_0= 'once' ) | (enumLiteral_1= 'repeatable' ) ) ;
    public final Enumerator ruleRepeat() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:998:2: ( ( (enumLiteral_0= 'once' ) | (enumLiteral_1= 'repeatable' ) ) )
            // InternalRobotDSL.g:999:2: ( (enumLiteral_0= 'once' ) | (enumLiteral_1= 'repeatable' ) )
            {
            // InternalRobotDSL.g:999:2: ( (enumLiteral_0= 'once' ) | (enumLiteral_1= 'repeatable' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==58) ) {
                alt23=1;
            }
            else if ( (LA23_0==59) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalRobotDSL.g:1000:3: (enumLiteral_0= 'once' )
                    {
                    // InternalRobotDSL.g:1000:3: (enumLiteral_0= 'once' )
                    // InternalRobotDSL.g:1001:4: enumLiteral_0= 'once'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getRepeatAccess().getONCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRepeatAccess().getONCEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1008:3: (enumLiteral_1= 'repeatable' )
                    {
                    // InternalRobotDSL.g:1008:3: (enumLiteral_1= 'repeatable' )
                    // InternalRobotDSL.g:1009:4: enumLiteral_1= 'repeatable'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getRepeatAccess().getREPEATEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRepeatAccess().getREPEATEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleRepeat"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x03CF800000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x03CF800000060012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000D080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000D080002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x03C0000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});

}