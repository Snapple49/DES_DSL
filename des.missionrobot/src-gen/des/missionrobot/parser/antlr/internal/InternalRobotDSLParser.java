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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mission'", "'Flags:'", "'Tasks:'", "'Goal:'", "'Condition:'", "'timeout'", "'Actions:'", "'Task:'", "'priority:'", "'Triggers:'", "'Move'", "'for'", "'sec'", "'at'", "'speed'", "'Turn'", "'deg'", "'Arm'", "'Play'", "'sound'", "'Update'", "'to'", "'is'", "'distance'", "'than'", "'cm'", "'Time:'", "'forward'", "'backward'", "'left'", "'right'", "'high'", "'medium'", "'low'", "'raise'", "'lower'", "'buzz'", "'fanfare'", "'Color'", "'LeftLight'", "'RightLight'", "'RearHeight'", "'FrontDistance'", "'red'", "'white'", "'black'", "'green'", "'blue'", "'less'", "'greater'", "'and'", "'or'", "'true'", "'false'", "'not'"
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
    public static final int T__60=60;
    public static final int T__61=61;
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
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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
    // InternalRobotDSL.g:108:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Flags:' ( (lv_flagsList_3_0= ruleFlag ) )* otherlv_4= 'Tasks:' ( (lv_behaviorList_5_0= ruleTask ) )+ otherlv_6= 'Goal:' (otherlv_7= 'Condition:' ( (lv_goalEvents_8_0= ruleTrigger ) )+ )? (otherlv_9= 'timeout' ( (lv_timeout_10_0= ruleTime ) ) )? (otherlv_11= 'Actions:' ( (lv_finishActions_12_0= ruleAction ) )+ )? ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_flagsList_3_0 = null;

        EObject lv_behaviorList_5_0 = null;

        EObject lv_goalEvents_8_0 = null;

        EObject lv_timeout_10_0 = null;

        EObject lv_finishActions_12_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:114:2: ( (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Flags:' ( (lv_flagsList_3_0= ruleFlag ) )* otherlv_4= 'Tasks:' ( (lv_behaviorList_5_0= ruleTask ) )+ otherlv_6= 'Goal:' (otherlv_7= 'Condition:' ( (lv_goalEvents_8_0= ruleTrigger ) )+ )? (otherlv_9= 'timeout' ( (lv_timeout_10_0= ruleTime ) ) )? (otherlv_11= 'Actions:' ( (lv_finishActions_12_0= ruleAction ) )+ )? ) )
            // InternalRobotDSL.g:115:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Flags:' ( (lv_flagsList_3_0= ruleFlag ) )* otherlv_4= 'Tasks:' ( (lv_behaviorList_5_0= ruleTask ) )+ otherlv_6= 'Goal:' (otherlv_7= 'Condition:' ( (lv_goalEvents_8_0= ruleTrigger ) )+ )? (otherlv_9= 'timeout' ( (lv_timeout_10_0= ruleTime ) ) )? (otherlv_11= 'Actions:' ( (lv_finishActions_12_0= ruleAction ) )+ )? )
            {
            // InternalRobotDSL.g:115:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Flags:' ( (lv_flagsList_3_0= ruleFlag ) )* otherlv_4= 'Tasks:' ( (lv_behaviorList_5_0= ruleTask ) )+ otherlv_6= 'Goal:' (otherlv_7= 'Condition:' ( (lv_goalEvents_8_0= ruleTrigger ) )+ )? (otherlv_9= 'timeout' ( (lv_timeout_10_0= ruleTime ) ) )? (otherlv_11= 'Actions:' ( (lv_finishActions_12_0= ruleAction ) )+ )? )
            // InternalRobotDSL.g:116:3: otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Flags:' ( (lv_flagsList_3_0= ruleFlag ) )* otherlv_4= 'Tasks:' ( (lv_behaviorList_5_0= ruleTask ) )+ otherlv_6= 'Goal:' (otherlv_7= 'Condition:' ( (lv_goalEvents_8_0= ruleTrigger ) )+ )? (otherlv_9= 'timeout' ( (lv_timeout_10_0= ruleTime ) ) )? (otherlv_11= 'Actions:' ( (lv_finishActions_12_0= ruleAction ) )+ )?
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

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getFlagsKeyword_2());
            		
            // InternalRobotDSL.g:142:3: ( (lv_flagsList_3_0= ruleFlag ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRobotDSL.g:143:4: (lv_flagsList_3_0= ruleFlag )
            	    {
            	    // InternalRobotDSL.g:143:4: (lv_flagsList_3_0= ruleFlag )
            	    // InternalRobotDSL.g:144:5: lv_flagsList_3_0= ruleFlag
            	    {

            	    					newCompositeNode(grammarAccess.getMissionAccess().getFlagsListFlagParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_flagsList_3_0=ruleFlag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMissionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"flagsList",
            	    						lv_flagsList_3_0,
            	    						"des.missionrobot.RobotDSL.Flag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getTasksKeyword_4());
            		
            // InternalRobotDSL.g:165:3: ( (lv_behaviorList_5_0= ruleTask ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRobotDSL.g:166:4: (lv_behaviorList_5_0= ruleTask )
            	    {
            	    // InternalRobotDSL.g:166:4: (lv_behaviorList_5_0= ruleTask )
            	    // InternalRobotDSL.g:167:5: lv_behaviorList_5_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getMissionAccess().getBehaviorListTaskParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_behaviorList_5_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMissionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"behaviorList",
            	    						lv_behaviorList_5_0,
            	    						"des.missionrobot.RobotDSL.Task");
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

            otherlv_6=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getGoalKeyword_6());
            		
            // InternalRobotDSL.g:188:3: (otherlv_7= 'Condition:' ( (lv_goalEvents_8_0= ruleTrigger ) )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRobotDSL.g:189:4: otherlv_7= 'Condition:' ( (lv_goalEvents_8_0= ruleTrigger ) )+
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getMissionAccess().getConditionKeyword_7_0());
                    			
                    // InternalRobotDSL.g:193:4: ( (lv_goalEvents_8_0= ruleTrigger ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID||(LA4_0>=49 && LA4_0<=53)||(LA4_0>=59 && LA4_0<=65)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRobotDSL.g:194:5: (lv_goalEvents_8_0= ruleTrigger )
                    	    {
                    	    // InternalRobotDSL.g:194:5: (lv_goalEvents_8_0= ruleTrigger )
                    	    // InternalRobotDSL.g:195:6: lv_goalEvents_8_0= ruleTrigger
                    	    {

                    	    						newCompositeNode(grammarAccess.getMissionAccess().getGoalEventsTriggerParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_goalEvents_8_0=ruleTrigger();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"goalEvents",
                    	    							lv_goalEvents_8_0,
                    	    							"des.missionrobot.RobotDSL.Trigger");
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

            // InternalRobotDSL.g:213:3: (otherlv_9= 'timeout' ( (lv_timeout_10_0= ruleTime ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRobotDSL.g:214:4: otherlv_9= 'timeout' ( (lv_timeout_10_0= ruleTime ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getMissionAccess().getTimeoutKeyword_8_0());
                    			
                    // InternalRobotDSL.g:218:4: ( (lv_timeout_10_0= ruleTime ) )
                    // InternalRobotDSL.g:219:5: (lv_timeout_10_0= ruleTime )
                    {
                    // InternalRobotDSL.g:219:5: (lv_timeout_10_0= ruleTime )
                    // InternalRobotDSL.g:220:6: lv_timeout_10_0= ruleTime
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getTimeoutTimeParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_timeout_10_0=ruleTime();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						set(
                    							current,
                    							"timeout",
                    							lv_timeout_10_0,
                    							"des.missionrobot.RobotDSL.Time");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRobotDSL.g:238:3: (otherlv_11= 'Actions:' ( (lv_finishActions_12_0= ruleAction ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRobotDSL.g:239:4: otherlv_11= 'Actions:' ( (lv_finishActions_12_0= ruleAction ) )+
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getMissionAccess().getActionsKeyword_9_0());
                    			
                    // InternalRobotDSL.g:243:4: ( (lv_finishActions_12_0= ruleAction ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21||LA7_0==26||(LA7_0>=28 && LA7_0<=29)||LA7_0==31) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRobotDSL.g:244:5: (lv_finishActions_12_0= ruleAction )
                    	    {
                    	    // InternalRobotDSL.g:244:5: (lv_finishActions_12_0= ruleAction )
                    	    // InternalRobotDSL.g:245:6: lv_finishActions_12_0= ruleAction
                    	    {

                    	    						newCompositeNode(grammarAccess.getMissionAccess().getFinishActionsActionParserRuleCall_9_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_finishActions_12_0=ruleAction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"finishActions",
                    	    							lv_finishActions_12_0,
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
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleTask"
    // InternalRobotDSL.g:267:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalRobotDSL.g:267:45: (iv_ruleTask= ruleTask EOF )
            // InternalRobotDSL.g:268:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalRobotDSL.g:274:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ )? otherlv_6= 'Actions:' ( (lv_actionList_7_0= ruleAction ) )+ ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_prio_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_triggerList_5_0 = null;

        EObject lv_actionList_7_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:280:2: ( (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ )? otherlv_6= 'Actions:' ( (lv_actionList_7_0= ruleAction ) )+ ) )
            // InternalRobotDSL.g:281:2: (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ )? otherlv_6= 'Actions:' ( (lv_actionList_7_0= ruleAction ) )+ )
            {
            // InternalRobotDSL.g:281:2: (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ )? otherlv_6= 'Actions:' ( (lv_actionList_7_0= ruleAction ) )+ )
            // InternalRobotDSL.g:282:3: otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ )? otherlv_6= 'Actions:' ( (lv_actionList_7_0= ruleAction ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalRobotDSL.g:286:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRobotDSL.g:287:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRobotDSL.g:287:4: (lv_name_1_0= RULE_ID )
            // InternalRobotDSL.g:288:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getPriorityKeyword_2());
            		
            // InternalRobotDSL.g:308:3: ( (lv_prio_3_0= RULE_INT ) )
            // InternalRobotDSL.g:309:4: (lv_prio_3_0= RULE_INT )
            {
            // InternalRobotDSL.g:309:4: (lv_prio_3_0= RULE_INT )
            // InternalRobotDSL.g:310:5: lv_prio_3_0= RULE_INT
            {
            lv_prio_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_prio_3_0, grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"prio",
            						lv_prio_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalRobotDSL.g:326:3: (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRobotDSL.g:327:4: otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getTriggersKeyword_4_0());
                    			
                    // InternalRobotDSL.g:331:4: ( (lv_triggerList_5_0= ruleTrigger ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID||(LA9_0>=49 && LA9_0<=53)||(LA9_0>=59 && LA9_0<=65)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRobotDSL.g:332:5: (lv_triggerList_5_0= ruleTrigger )
                    	    {
                    	    // InternalRobotDSL.g:332:5: (lv_triggerList_5_0= ruleTrigger )
                    	    // InternalRobotDSL.g:333:6: lv_triggerList_5_0= ruleTrigger
                    	    {

                    	    						newCompositeNode(grammarAccess.getTaskAccess().getTriggerListTriggerParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_triggerList_5_0=ruleTrigger();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTaskRule());
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
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getActionsKeyword_5());
            		
            // InternalRobotDSL.g:355:3: ( (lv_actionList_7_0= ruleAction ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21||LA11_0==26||(LA11_0>=28 && LA11_0<=29)||LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRobotDSL.g:356:4: (lv_actionList_7_0= ruleAction )
            	    {
            	    // InternalRobotDSL.g:356:4: (lv_actionList_7_0= ruleAction )
            	    // InternalRobotDSL.g:357:5: lv_actionList_7_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getTaskAccess().getActionListActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_actionList_7_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskRule());
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleAction"
    // InternalRobotDSL.g:378:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRobotDSL.g:378:47: (iv_ruleAction= ruleAction EOF )
            // InternalRobotDSL.g:379:2: iv_ruleAction= ruleAction EOF
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
    // InternalRobotDSL.g:385:1: ruleAction returns [EObject current=null] : ( (otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? ) | (otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) ) ) | (otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) ) ) | (otherlv_17= 'Update' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'to' ( (lv_bool_20_0= ruleBool ) ) ) ) ;
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
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Enumerator lv_dir_1_0 = null;

        Enumerator lv_speed_6_0 = null;

        Enumerator lv_dir_9_0 = null;

        Enumerator lv_op_13_0 = null;

        Enumerator lv_sound_16_0 = null;

        Enumerator lv_bool_20_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:391:2: ( ( (otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? ) | (otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) ) ) | (otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) ) ) | (otherlv_17= 'Update' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'to' ( (lv_bool_20_0= ruleBool ) ) ) ) )
            // InternalRobotDSL.g:392:2: ( (otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? ) | (otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) ) ) | (otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) ) ) | (otherlv_17= 'Update' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'to' ( (lv_bool_20_0= ruleBool ) ) ) )
            {
            // InternalRobotDSL.g:392:2: ( (otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? ) | (otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) ) ) | (otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) ) ) | (otherlv_17= 'Update' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'to' ( (lv_bool_20_0= ruleBool ) ) ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt14=1;
                }
                break;
            case 26:
                {
                alt14=2;
                }
                break;
            case 28:
                {
                alt14=3;
                }
                break;
            case 29:
                {
                alt14=4;
                }
                break;
            case 31:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalRobotDSL.g:393:3: (otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? )
                    {
                    // InternalRobotDSL.g:393:3: (otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? )
                    // InternalRobotDSL.g:394:4: otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )?
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_20); 

                    				newLeafNode(otherlv_0, grammarAccess.getActionAccess().getMoveKeyword_0_0());
                    			
                    // InternalRobotDSL.g:398:4: ( (lv_dir_1_0= ruleDirection ) )
                    // InternalRobotDSL.g:399:5: (lv_dir_1_0= ruleDirection )
                    {
                    // InternalRobotDSL.g:399:5: (lv_dir_1_0= ruleDirection )
                    // InternalRobotDSL.g:400:6: lv_dir_1_0= ruleDirection
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getDirDirectionEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    // InternalRobotDSL.g:417:4: (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==22) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalRobotDSL.g:418:5: otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec'
                            {
                            otherlv_2=(Token)match(input,22,FOLLOW_17); 

                            					newLeafNode(otherlv_2, grammarAccess.getActionAccess().getForKeyword_0_2_0());
                            				
                            // InternalRobotDSL.g:422:5: ( (lv_duration_3_0= RULE_INT ) )
                            // InternalRobotDSL.g:423:6: (lv_duration_3_0= RULE_INT )
                            {
                            // InternalRobotDSL.g:423:6: (lv_duration_3_0= RULE_INT )
                            // InternalRobotDSL.g:424:7: lv_duration_3_0= RULE_INT
                            {
                            lv_duration_3_0=(Token)match(input,RULE_INT,FOLLOW_22); 

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

                            otherlv_4=(Token)match(input,23,FOLLOW_23); 

                            					newLeafNode(otherlv_4, grammarAccess.getActionAccess().getSecKeyword_0_2_2());
                            				

                            }
                            break;

                    }

                    // InternalRobotDSL.g:445:4: (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==24) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalRobotDSL.g:446:5: otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed'
                            {
                            otherlv_5=(Token)match(input,24,FOLLOW_24); 

                            					newLeafNode(otherlv_5, grammarAccess.getActionAccess().getAtKeyword_0_3_0());
                            				
                            // InternalRobotDSL.g:450:5: ( (lv_speed_6_0= ruleSpeed ) )
                            // InternalRobotDSL.g:451:6: (lv_speed_6_0= ruleSpeed )
                            {
                            // InternalRobotDSL.g:451:6: (lv_speed_6_0= ruleSpeed )
                            // InternalRobotDSL.g:452:7: lv_speed_6_0= ruleSpeed
                            {

                            							newCompositeNode(grammarAccess.getActionAccess().getSpeedSpeedEnumRuleCall_0_3_1_0());
                            						
                            pushFollow(FOLLOW_25);
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

                            otherlv_7=(Token)match(input,25,FOLLOW_2); 

                            					newLeafNode(otherlv_7, grammarAccess.getActionAccess().getSpeedKeyword_0_3_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:476:3: (otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' )
                    {
                    // InternalRobotDSL.g:476:3: (otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' )
                    // InternalRobotDSL.g:477:4: otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg'
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionAccess().getTurnKeyword_1_0());
                    			
                    // InternalRobotDSL.g:481:4: ( (lv_dir_9_0= ruleDirection ) )
                    // InternalRobotDSL.g:482:5: (lv_dir_9_0= ruleDirection )
                    {
                    // InternalRobotDSL.g:482:5: (lv_dir_9_0= ruleDirection )
                    // InternalRobotDSL.g:483:6: lv_dir_9_0= ruleDirection
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getDirDirectionEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_17);
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

                    // InternalRobotDSL.g:500:4: ( (lv_degr_10_0= RULE_INT ) )
                    // InternalRobotDSL.g:501:5: (lv_degr_10_0= RULE_INT )
                    {
                    // InternalRobotDSL.g:501:5: (lv_degr_10_0= RULE_INT )
                    // InternalRobotDSL.g:502:6: lv_degr_10_0= RULE_INT
                    {
                    lv_degr_10_0=(Token)match(input,RULE_INT,FOLLOW_26); 

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

                    otherlv_11=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getActionAccess().getDegKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:524:3: (otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) ) )
                    {
                    // InternalRobotDSL.g:524:3: (otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) ) )
                    // InternalRobotDSL.g:525:4: otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) )
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_27); 

                    				newLeafNode(otherlv_12, grammarAccess.getActionAccess().getArmKeyword_2_0());
                    			
                    // InternalRobotDSL.g:529:4: ( (lv_op_13_0= ruleArmOp ) )
                    // InternalRobotDSL.g:530:5: (lv_op_13_0= ruleArmOp )
                    {
                    // InternalRobotDSL.g:530:5: (lv_op_13_0= ruleArmOp )
                    // InternalRobotDSL.g:531:6: lv_op_13_0= ruleArmOp
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
                    // InternalRobotDSL.g:550:3: (otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) ) )
                    {
                    // InternalRobotDSL.g:550:3: (otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) ) )
                    // InternalRobotDSL.g:551:4: otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) )
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_28); 

                    				newLeafNode(otherlv_14, grammarAccess.getActionAccess().getPlayKeyword_3_0());
                    			
                    otherlv_15=(Token)match(input,30,FOLLOW_29); 

                    				newLeafNode(otherlv_15, grammarAccess.getActionAccess().getSoundKeyword_3_1());
                    			
                    // InternalRobotDSL.g:559:4: ( (lv_sound_16_0= ruleSound ) )
                    // InternalRobotDSL.g:560:5: (lv_sound_16_0= ruleSound )
                    {
                    // InternalRobotDSL.g:560:5: (lv_sound_16_0= ruleSound )
                    // InternalRobotDSL.g:561:6: lv_sound_16_0= ruleSound
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
                case 5 :
                    // InternalRobotDSL.g:580:3: (otherlv_17= 'Update' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'to' ( (lv_bool_20_0= ruleBool ) ) )
                    {
                    // InternalRobotDSL.g:580:3: (otherlv_17= 'Update' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'to' ( (lv_bool_20_0= ruleBool ) ) )
                    // InternalRobotDSL.g:581:4: otherlv_17= 'Update' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'to' ( (lv_bool_20_0= ruleBool ) )
                    {
                    otherlv_17=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getActionAccess().getUpdateKeyword_4_0());
                    			
                    // InternalRobotDSL.g:585:4: ( (otherlv_18= RULE_ID ) )
                    // InternalRobotDSL.g:586:5: (otherlv_18= RULE_ID )
                    {
                    // InternalRobotDSL.g:586:5: (otherlv_18= RULE_ID )
                    // InternalRobotDSL.g:587:6: otherlv_18= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    					
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_18, grammarAccess.getActionAccess().getFlagFlagCrossReference_4_1_0());
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,32,FOLLOW_31); 

                    				newLeafNode(otherlv_19, grammarAccess.getActionAccess().getToKeyword_4_2());
                    			
                    // InternalRobotDSL.g:602:4: ( (lv_bool_20_0= ruleBool ) )
                    // InternalRobotDSL.g:603:5: (lv_bool_20_0= ruleBool )
                    {
                    // InternalRobotDSL.g:603:5: (lv_bool_20_0= ruleBool )
                    // InternalRobotDSL.g:604:6: lv_bool_20_0= ruleBool
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getBoolBoolEnumRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_bool_20_0=ruleBool();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"bool",
                    							lv_bool_20_0,
                    							"des.missionrobot.RobotDSL.Bool");
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


    // $ANTLR start "entryRuleTrigger"
    // InternalRobotDSL.g:626:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalRobotDSL.g:626:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalRobotDSL.g:627:2: iv_ruleTrigger= ruleTrigger EOF
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
    // InternalRobotDSL.g:633:1: ruleTrigger returns [EObject current=null] : ( ( (lv_boolType_0_0= ruleBool ) )? ( ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_bool_7_0= ruleBool ) ) otherlv_8= 'than' ( (lv_distance_9_0= RULE_INT ) ) otherlv_10= 'cm' ) ) ) ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_distance_9_0=null;
        Token otherlv_10=null;
        Enumerator lv_boolType_0_0 = null;

        Enumerator lv_neg_1_0 = null;

        Enumerator lv_sensor_3_0 = null;

        Enumerator lv_color_5_0 = null;

        Enumerator lv_bool_7_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:639:2: ( ( ( (lv_boolType_0_0= ruleBool ) )? ( ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_bool_7_0= ruleBool ) ) otherlv_8= 'than' ( (lv_distance_9_0= RULE_INT ) ) otherlv_10= 'cm' ) ) ) ) ) )
            // InternalRobotDSL.g:640:2: ( ( (lv_boolType_0_0= ruleBool ) )? ( ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_bool_7_0= ruleBool ) ) otherlv_8= 'than' ( (lv_distance_9_0= RULE_INT ) ) otherlv_10= 'cm' ) ) ) ) )
            {
            // InternalRobotDSL.g:640:2: ( ( (lv_boolType_0_0= ruleBool ) )? ( ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_bool_7_0= ruleBool ) ) otherlv_8= 'than' ( (lv_distance_9_0= RULE_INT ) ) otherlv_10= 'cm' ) ) ) ) )
            // InternalRobotDSL.g:641:3: ( (lv_boolType_0_0= ruleBool ) )? ( ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_bool_7_0= ruleBool ) ) otherlv_8= 'than' ( (lv_distance_9_0= RULE_INT ) ) otherlv_10= 'cm' ) ) ) )
            {
            // InternalRobotDSL.g:641:3: ( (lv_boolType_0_0= ruleBool ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=59 && LA15_0<=64)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRobotDSL.g:642:4: (lv_boolType_0_0= ruleBool )
                    {
                    // InternalRobotDSL.g:642:4: (lv_boolType_0_0= ruleBool )
                    // InternalRobotDSL.g:643:5: lv_boolType_0_0= ruleBool
                    {

                    					newCompositeNode(grammarAccess.getTriggerAccess().getBoolTypeBoolEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_10);
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

            // InternalRobotDSL.g:660:3: ( ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_bool_7_0= ruleBool ) ) otherlv_8= 'than' ( (lv_distance_9_0= RULE_INT ) ) otherlv_10= 'cm' ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||LA18_0==65) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=49 && LA18_0<=53)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalRobotDSL.g:661:4: ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalRobotDSL.g:661:4: ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) )
                    // InternalRobotDSL.g:662:5: ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalRobotDSL.g:662:5: ( (lv_neg_1_0= ruleNegation ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==65) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalRobotDSL.g:663:6: (lv_neg_1_0= ruleNegation )
                            {
                            // InternalRobotDSL.g:663:6: (lv_neg_1_0= ruleNegation )
                            // InternalRobotDSL.g:664:7: lv_neg_1_0= ruleNegation
                            {

                            							newCompositeNode(grammarAccess.getTriggerAccess().getNegNegationEnumRuleCall_1_0_0_0());
                            						
                            pushFollow(FOLLOW_4);
                            lv_neg_1_0=ruleNegation();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTriggerRule());
                            							}
                            							set(
                            								current,
                            								"neg",
                            								lv_neg_1_0,
                            								"des.missionrobot.RobotDSL.Negation");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalRobotDSL.g:681:5: ( (otherlv_2= RULE_ID ) )
                    // InternalRobotDSL.g:682:6: (otherlv_2= RULE_ID )
                    {
                    // InternalRobotDSL.g:682:6: (otherlv_2= RULE_ID )
                    // InternalRobotDSL.g:683:7: otherlv_2= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTriggerRule());
                    							}
                    						
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(otherlv_2, grammarAccess.getTriggerAccess().getFlagFlagCrossReference_1_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:696:4: ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_bool_7_0= ruleBool ) ) otherlv_8= 'than' ( (lv_distance_9_0= RULE_INT ) ) otherlv_10= 'cm' ) ) )
                    {
                    // InternalRobotDSL.g:696:4: ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_bool_7_0= ruleBool ) ) otherlv_8= 'than' ( (lv_distance_9_0= RULE_INT ) ) otherlv_10= 'cm' ) ) )
                    // InternalRobotDSL.g:697:5: ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_bool_7_0= ruleBool ) ) otherlv_8= 'than' ( (lv_distance_9_0= RULE_INT ) ) otherlv_10= 'cm' ) )
                    {
                    // InternalRobotDSL.g:697:5: ( (lv_sensor_3_0= ruleSensor ) )
                    // InternalRobotDSL.g:698:6: (lv_sensor_3_0= ruleSensor )
                    {
                    // InternalRobotDSL.g:698:6: (lv_sensor_3_0= ruleSensor )
                    // InternalRobotDSL.g:699:7: lv_sensor_3_0= ruleSensor
                    {

                    							newCompositeNode(grammarAccess.getTriggerAccess().getSensorSensorEnumRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_32);
                    lv_sensor_3_0=ruleSensor();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTriggerRule());
                    							}
                    							set(
                    								current,
                    								"sensor",
                    								lv_sensor_3_0,
                    								"des.missionrobot.RobotDSL.Sensor");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRobotDSL.g:716:5: ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_bool_7_0= ruleBool ) ) otherlv_8= 'than' ( (lv_distance_9_0= RULE_INT ) ) otherlv_10= 'cm' ) )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==33) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==34) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalRobotDSL.g:717:6: (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) )
                            {
                            // InternalRobotDSL.g:717:6: (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) )
                            // InternalRobotDSL.g:718:7: otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) )
                            {
                            otherlv_4=(Token)match(input,33,FOLLOW_33); 

                            							newLeafNode(otherlv_4, grammarAccess.getTriggerAccess().getIsKeyword_1_1_1_0_0());
                            						
                            // InternalRobotDSL.g:722:7: ( (lv_color_5_0= ruleColor ) )
                            // InternalRobotDSL.g:723:8: (lv_color_5_0= ruleColor )
                            {
                            // InternalRobotDSL.g:723:8: (lv_color_5_0= ruleColor )
                            // InternalRobotDSL.g:724:9: lv_color_5_0= ruleColor
                            {

                            									newCompositeNode(grammarAccess.getTriggerAccess().getColorColorEnumRuleCall_1_1_1_0_1_0());
                            								
                            pushFollow(FOLLOW_2);
                            lv_color_5_0=ruleColor();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getTriggerRule());
                            									}
                            									set(
                            										current,
                            										"color",
                            										lv_color_5_0,
                            										"des.missionrobot.RobotDSL.Color");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalRobotDSL.g:743:6: (otherlv_6= 'distance' ( (lv_bool_7_0= ruleBool ) ) otherlv_8= 'than' ( (lv_distance_9_0= RULE_INT ) ) otherlv_10= 'cm' )
                            {
                            // InternalRobotDSL.g:743:6: (otherlv_6= 'distance' ( (lv_bool_7_0= ruleBool ) ) otherlv_8= 'than' ( (lv_distance_9_0= RULE_INT ) ) otherlv_10= 'cm' )
                            // InternalRobotDSL.g:744:7: otherlv_6= 'distance' ( (lv_bool_7_0= ruleBool ) ) otherlv_8= 'than' ( (lv_distance_9_0= RULE_INT ) ) otherlv_10= 'cm'
                            {
                            otherlv_6=(Token)match(input,34,FOLLOW_31); 

                            							newLeafNode(otherlv_6, grammarAccess.getTriggerAccess().getDistanceKeyword_1_1_1_1_0());
                            						
                            // InternalRobotDSL.g:748:7: ( (lv_bool_7_0= ruleBool ) )
                            // InternalRobotDSL.g:749:8: (lv_bool_7_0= ruleBool )
                            {
                            // InternalRobotDSL.g:749:8: (lv_bool_7_0= ruleBool )
                            // InternalRobotDSL.g:750:9: lv_bool_7_0= ruleBool
                            {

                            									newCompositeNode(grammarAccess.getTriggerAccess().getBoolBoolEnumRuleCall_1_1_1_1_1_0());
                            								
                            pushFollow(FOLLOW_34);
                            lv_bool_7_0=ruleBool();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getTriggerRule());
                            									}
                            									set(
                            										current,
                            										"bool",
                            										lv_bool_7_0,
                            										"des.missionrobot.RobotDSL.Bool");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            otherlv_8=(Token)match(input,35,FOLLOW_17); 

                            							newLeafNode(otherlv_8, grammarAccess.getTriggerAccess().getThanKeyword_1_1_1_1_2());
                            						
                            // InternalRobotDSL.g:771:7: ( (lv_distance_9_0= RULE_INT ) )
                            // InternalRobotDSL.g:772:8: (lv_distance_9_0= RULE_INT )
                            {
                            // InternalRobotDSL.g:772:8: (lv_distance_9_0= RULE_INT )
                            // InternalRobotDSL.g:773:9: lv_distance_9_0= RULE_INT
                            {
                            lv_distance_9_0=(Token)match(input,RULE_INT,FOLLOW_35); 

                            									newLeafNode(lv_distance_9_0, grammarAccess.getTriggerAccess().getDistanceINTTerminalRuleCall_1_1_1_1_3_0());
                            								

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getTriggerRule());
                            									}
                            									setWithLastConsumed(
                            										current,
                            										"distance",
                            										lv_distance_9_0,
                            										"org.eclipse.xtext.common.Terminals.INT");
                            								

                            }


                            }

                            otherlv_10=(Token)match(input,36,FOLLOW_2); 

                            							newLeafNode(otherlv_10, grammarAccess.getTriggerAccess().getCmKeyword_1_1_1_1_4());
                            						

                            }


                            }
                            break;

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


    // $ANTLR start "entryRuleFlag"
    // InternalRobotDSL.g:801:1: entryRuleFlag returns [EObject current=null] : iv_ruleFlag= ruleFlag EOF ;
    public final EObject entryRuleFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlag = null;


        try {
            // InternalRobotDSL.g:801:45: (iv_ruleFlag= ruleFlag EOF )
            // InternalRobotDSL.g:802:2: iv_ruleFlag= ruleFlag EOF
            {
             newCompositeNode(grammarAccess.getFlagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlag=ruleFlag();

            state._fsp--;

             current =iv_ruleFlag; 
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
    // $ANTLR end "entryRuleFlag"


    // $ANTLR start "ruleFlag"
    // InternalRobotDSL.g:808:1: ruleFlag returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) ) )? ) ;
    public final EObject ruleFlag() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_bool_2_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:814:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) ) )? ) )
            // InternalRobotDSL.g:815:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) ) )? )
            {
            // InternalRobotDSL.g:815:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) ) )? )
            // InternalRobotDSL.g:816:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) ) )?
            {
            // InternalRobotDSL.g:816:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRobotDSL.g:817:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRobotDSL.g:817:4: (lv_name_0_0= RULE_ID )
            // InternalRobotDSL.g:818:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFlagAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRobotDSL.g:834:3: (otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRobotDSL.g:835:4: otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) )
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getFlagAccess().getIsKeyword_1_0());
                    			
                    // InternalRobotDSL.g:839:4: ( (lv_bool_2_0= ruleBool ) )
                    // InternalRobotDSL.g:840:5: (lv_bool_2_0= ruleBool )
                    {
                    // InternalRobotDSL.g:840:5: (lv_bool_2_0= ruleBool )
                    // InternalRobotDSL.g:841:6: lv_bool_2_0= ruleBool
                    {

                    						newCompositeNode(grammarAccess.getFlagAccess().getBoolBoolEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_bool_2_0=ruleBool();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFlagRule());
                    						}
                    						set(
                    							current,
                    							"bool",
                    							lv_bool_2_0,
                    							"des.missionrobot.RobotDSL.Bool");
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
    // $ANTLR end "ruleFlag"


    // $ANTLR start "entryRuleTime"
    // InternalRobotDSL.g:863:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalRobotDSL.g:863:45: (iv_ruleTime= ruleTime EOF )
            // InternalRobotDSL.g:864:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalRobotDSL.g:870:1: ruleTime returns [EObject current=null] : (otherlv_0= 'Time:' ( (lv_sec_1_0= RULE_INT ) ) otherlv_2= 'sec' ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sec_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:876:2: ( (otherlv_0= 'Time:' ( (lv_sec_1_0= RULE_INT ) ) otherlv_2= 'sec' ) )
            // InternalRobotDSL.g:877:2: (otherlv_0= 'Time:' ( (lv_sec_1_0= RULE_INT ) ) otherlv_2= 'sec' )
            {
            // InternalRobotDSL.g:877:2: (otherlv_0= 'Time:' ( (lv_sec_1_0= RULE_INT ) ) otherlv_2= 'sec' )
            // InternalRobotDSL.g:878:3: otherlv_0= 'Time:' ( (lv_sec_1_0= RULE_INT ) ) otherlv_2= 'sec'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeAccess().getTimeKeyword_0());
            		
            // InternalRobotDSL.g:882:3: ( (lv_sec_1_0= RULE_INT ) )
            // InternalRobotDSL.g:883:4: (lv_sec_1_0= RULE_INT )
            {
            // InternalRobotDSL.g:883:4: (lv_sec_1_0= RULE_INT )
            // InternalRobotDSL.g:884:5: lv_sec_1_0= RULE_INT
            {
            lv_sec_1_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_sec_1_0, grammarAccess.getTimeAccess().getSecINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sec",
            						lv_sec_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeAccess().getSecKeyword_2());
            		

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
    // $ANTLR end "ruleTime"


    // $ANTLR start "ruleDirection"
    // InternalRobotDSL.g:908:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:914:2: ( ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) ) )
            // InternalRobotDSL.g:915:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) )
            {
            // InternalRobotDSL.g:915:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt20=1;
                }
                break;
            case 39:
                {
                alt20=2;
                }
                break;
            case 40:
                {
                alt20=3;
                }
                break;
            case 41:
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
                    // InternalRobotDSL.g:916:3: (enumLiteral_0= 'forward' )
                    {
                    // InternalRobotDSL.g:916:3: (enumLiteral_0= 'forward' )
                    // InternalRobotDSL.g:917:4: enumLiteral_0= 'forward'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getFORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getFORWARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:924:3: (enumLiteral_1= 'backward' )
                    {
                    // InternalRobotDSL.g:924:3: (enumLiteral_1= 'backward' )
                    // InternalRobotDSL.g:925:4: enumLiteral_1= 'backward'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getBACKWARDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getBACKWARDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:932:3: (enumLiteral_2= 'left' )
                    {
                    // InternalRobotDSL.g:932:3: (enumLiteral_2= 'left' )
                    // InternalRobotDSL.g:933:4: enumLiteral_2= 'left'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:940:3: (enumLiteral_3= 'right' )
                    {
                    // InternalRobotDSL.g:940:3: (enumLiteral_3= 'right' )
                    // InternalRobotDSL.g:941:4: enumLiteral_3= 'right'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); 

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
    // InternalRobotDSL.g:951:1: ruleSpeed returns [Enumerator current=null] : ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'low' ) ) ;
    public final Enumerator ruleSpeed() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:957:2: ( ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'low' ) ) )
            // InternalRobotDSL.g:958:2: ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'low' ) )
            {
            // InternalRobotDSL.g:958:2: ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'low' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt21=1;
                }
                break;
            case 43:
                {
                alt21=2;
                }
                break;
            case 44:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalRobotDSL.g:959:3: (enumLiteral_0= 'high' )
                    {
                    // InternalRobotDSL.g:959:3: (enumLiteral_0= 'high' )
                    // InternalRobotDSL.g:960:4: enumLiteral_0= 'high'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getSpeedAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSpeedAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:967:3: (enumLiteral_1= 'medium' )
                    {
                    // InternalRobotDSL.g:967:3: (enumLiteral_1= 'medium' )
                    // InternalRobotDSL.g:968:4: enumLiteral_1= 'medium'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getSpeedAccess().getMEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSpeedAccess().getMEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:975:3: (enumLiteral_2= 'low' )
                    {
                    // InternalRobotDSL.g:975:3: (enumLiteral_2= 'low' )
                    // InternalRobotDSL.g:976:4: enumLiteral_2= 'low'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

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
    // InternalRobotDSL.g:986:1: ruleArmOp returns [Enumerator current=null] : ( (enumLiteral_0= 'raise' ) | (enumLiteral_1= 'lower' ) ) ;
    public final Enumerator ruleArmOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:992:2: ( ( (enumLiteral_0= 'raise' ) | (enumLiteral_1= 'lower' ) ) )
            // InternalRobotDSL.g:993:2: ( (enumLiteral_0= 'raise' ) | (enumLiteral_1= 'lower' ) )
            {
            // InternalRobotDSL.g:993:2: ( (enumLiteral_0= 'raise' ) | (enumLiteral_1= 'lower' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            else if ( (LA22_0==46) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalRobotDSL.g:994:3: (enumLiteral_0= 'raise' )
                    {
                    // InternalRobotDSL.g:994:3: (enumLiteral_0= 'raise' )
                    // InternalRobotDSL.g:995:4: enumLiteral_0= 'raise'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getArmOpAccess().getUPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getArmOpAccess().getUPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1002:3: (enumLiteral_1= 'lower' )
                    {
                    // InternalRobotDSL.g:1002:3: (enumLiteral_1= 'lower' )
                    // InternalRobotDSL.g:1003:4: enumLiteral_1= 'lower'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

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
    // InternalRobotDSL.g:1013:1: ruleSound returns [Enumerator current=null] : ( (enumLiteral_0= 'buzz' ) | (enumLiteral_1= 'fanfare' ) ) ;
    public final Enumerator ruleSound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1019:2: ( ( (enumLiteral_0= 'buzz' ) | (enumLiteral_1= 'fanfare' ) ) )
            // InternalRobotDSL.g:1020:2: ( (enumLiteral_0= 'buzz' ) | (enumLiteral_1= 'fanfare' ) )
            {
            // InternalRobotDSL.g:1020:2: ( (enumLiteral_0= 'buzz' ) | (enumLiteral_1= 'fanfare' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            else if ( (LA23_0==48) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalRobotDSL.g:1021:3: (enumLiteral_0= 'buzz' )
                    {
                    // InternalRobotDSL.g:1021:3: (enumLiteral_0= 'buzz' )
                    // InternalRobotDSL.g:1022:4: enumLiteral_0= 'buzz'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getSoundAccess().getBuzzEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSoundAccess().getBuzzEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1029:3: (enumLiteral_1= 'fanfare' )
                    {
                    // InternalRobotDSL.g:1029:3: (enumLiteral_1= 'fanfare' )
                    // InternalRobotDSL.g:1030:4: enumLiteral_1= 'fanfare'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

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
    // InternalRobotDSL.g:1040:1: ruleSensor returns [Enumerator current=null] : ( (enumLiteral_0= 'Color' ) | (enumLiteral_1= 'LeftLight' ) | (enumLiteral_2= 'RightLight' ) | (enumLiteral_3= 'RearHeight' ) | (enumLiteral_4= 'FrontDistance' ) ) ;
    public final Enumerator ruleSensor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1046:2: ( ( (enumLiteral_0= 'Color' ) | (enumLiteral_1= 'LeftLight' ) | (enumLiteral_2= 'RightLight' ) | (enumLiteral_3= 'RearHeight' ) | (enumLiteral_4= 'FrontDistance' ) ) )
            // InternalRobotDSL.g:1047:2: ( (enumLiteral_0= 'Color' ) | (enumLiteral_1= 'LeftLight' ) | (enumLiteral_2= 'RightLight' ) | (enumLiteral_3= 'RearHeight' ) | (enumLiteral_4= 'FrontDistance' ) )
            {
            // InternalRobotDSL.g:1047:2: ( (enumLiteral_0= 'Color' ) | (enumLiteral_1= 'LeftLight' ) | (enumLiteral_2= 'RightLight' ) | (enumLiteral_3= 'RearHeight' ) | (enumLiteral_4= 'FrontDistance' ) )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt24=1;
                }
                break;
            case 50:
                {
                alt24=2;
                }
                break;
            case 51:
                {
                alt24=3;
                }
                break;
            case 52:
                {
                alt24=4;
                }
                break;
            case 53:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalRobotDSL.g:1048:3: (enumLiteral_0= 'Color' )
                    {
                    // InternalRobotDSL.g:1048:3: (enumLiteral_0= 'Color' )
                    // InternalRobotDSL.g:1049:4: enumLiteral_0= 'Color'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getSensorAccess().getCOLOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSensorAccess().getCOLOREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1056:3: (enumLiteral_1= 'LeftLight' )
                    {
                    // InternalRobotDSL.g:1056:3: (enumLiteral_1= 'LeftLight' )
                    // InternalRobotDSL.g:1057:4: enumLiteral_1= 'LeftLight'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getSensorAccess().getLEFTLIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSensorAccess().getLEFTLIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:1064:3: (enumLiteral_2= 'RightLight' )
                    {
                    // InternalRobotDSL.g:1064:3: (enumLiteral_2= 'RightLight' )
                    // InternalRobotDSL.g:1065:4: enumLiteral_2= 'RightLight'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getSensorAccess().getRIGHTLIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSensorAccess().getRIGHTLIGHTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:1072:3: (enumLiteral_3= 'RearHeight' )
                    {
                    // InternalRobotDSL.g:1072:3: (enumLiteral_3= 'RearHeight' )
                    // InternalRobotDSL.g:1073:4: enumLiteral_3= 'RearHeight'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getSensorAccess().getBACKUSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSensorAccess().getBACKUSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRobotDSL.g:1080:3: (enumLiteral_4= 'FrontDistance' )
                    {
                    // InternalRobotDSL.g:1080:3: (enumLiteral_4= 'FrontDistance' )
                    // InternalRobotDSL.g:1081:4: enumLiteral_4= 'FrontDistance'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

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
    // InternalRobotDSL.g:1091:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'white' ) | (enumLiteral_2= 'black' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'blue' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1097:2: ( ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'white' ) | (enumLiteral_2= 'black' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'blue' ) ) )
            // InternalRobotDSL.g:1098:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'white' ) | (enumLiteral_2= 'black' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'blue' ) )
            {
            // InternalRobotDSL.g:1098:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'white' ) | (enumLiteral_2= 'black' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'blue' ) )
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
                    // InternalRobotDSL.g:1099:3: (enumLiteral_0= 'red' )
                    {
                    // InternalRobotDSL.g:1099:3: (enumLiteral_0= 'red' )
                    // InternalRobotDSL.g:1100:4: enumLiteral_0= 'red'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1107:3: (enumLiteral_1= 'white' )
                    {
                    // InternalRobotDSL.g:1107:3: (enumLiteral_1= 'white' )
                    // InternalRobotDSL.g:1108:4: enumLiteral_1= 'white'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getWHITEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getWHITEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:1115:3: (enumLiteral_2= 'black' )
                    {
                    // InternalRobotDSL.g:1115:3: (enumLiteral_2= 'black' )
                    // InternalRobotDSL.g:1116:4: enumLiteral_2= 'black'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:1123:3: (enumLiteral_3= 'green' )
                    {
                    // InternalRobotDSL.g:1123:3: (enumLiteral_3= 'green' )
                    // InternalRobotDSL.g:1124:4: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRobotDSL.g:1131:3: (enumLiteral_4= 'blue' )
                    {
                    // InternalRobotDSL.g:1131:3: (enumLiteral_4= 'blue' )
                    // InternalRobotDSL.g:1132:4: enumLiteral_4= 'blue'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBLUEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorAccess().getBLUEEnumLiteralDeclaration_4());
                    			

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
    // InternalRobotDSL.g:1142:1: ruleBool returns [Enumerator current=null] : ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'and' ) | (enumLiteral_3= 'or' ) | (enumLiteral_4= 'true' ) | (enumLiteral_5= 'false' ) ) ;
    public final Enumerator ruleBool() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1148:2: ( ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'and' ) | (enumLiteral_3= 'or' ) | (enumLiteral_4= 'true' ) | (enumLiteral_5= 'false' ) ) )
            // InternalRobotDSL.g:1149:2: ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'and' ) | (enumLiteral_3= 'or' ) | (enumLiteral_4= 'true' ) | (enumLiteral_5= 'false' ) )
            {
            // InternalRobotDSL.g:1149:2: ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'and' ) | (enumLiteral_3= 'or' ) | (enumLiteral_4= 'true' ) | (enumLiteral_5= 'false' ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt26=1;
                }
                break;
            case 60:
                {
                alt26=2;
                }
                break;
            case 61:
                {
                alt26=3;
                }
                break;
            case 62:
                {
                alt26=4;
                }
                break;
            case 63:
                {
                alt26=5;
                }
                break;
            case 64:
                {
                alt26=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalRobotDSL.g:1150:3: (enumLiteral_0= 'less' )
                    {
                    // InternalRobotDSL.g:1150:3: (enumLiteral_0= 'less' )
                    // InternalRobotDSL.g:1151:4: enumLiteral_0= 'less'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getBoolAccess().getLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBoolAccess().getLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1158:3: (enumLiteral_1= 'greater' )
                    {
                    // InternalRobotDSL.g:1158:3: (enumLiteral_1= 'greater' )
                    // InternalRobotDSL.g:1159:4: enumLiteral_1= 'greater'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getBoolAccess().getGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBoolAccess().getGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:1166:3: (enumLiteral_2= 'and' )
                    {
                    // InternalRobotDSL.g:1166:3: (enumLiteral_2= 'and' )
                    // InternalRobotDSL.g:1167:4: enumLiteral_2= 'and'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getBoolAccess().getANDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBoolAccess().getANDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:1174:3: (enumLiteral_3= 'or' )
                    {
                    // InternalRobotDSL.g:1174:3: (enumLiteral_3= 'or' )
                    // InternalRobotDSL.g:1175:4: enumLiteral_3= 'or'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getBoolAccess().getOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBoolAccess().getOREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRobotDSL.g:1182:3: (enumLiteral_4= 'true' )
                    {
                    // InternalRobotDSL.g:1182:3: (enumLiteral_4= 'true' )
                    // InternalRobotDSL.g:1183:4: enumLiteral_4= 'true'
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getBoolAccess().getTRUEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBoolAccess().getTRUEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRobotDSL.g:1190:3: (enumLiteral_5= 'false' )
                    {
                    // InternalRobotDSL.g:1190:3: (enumLiteral_5= 'false' )
                    // InternalRobotDSL.g:1191:4: enumLiteral_5= 'false'
                    {
                    enumLiteral_5=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getBoolAccess().getFALSEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBoolAccess().getFALSEEnumLiteralDeclaration_5());
                    			

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


    // $ANTLR start "ruleNegation"
    // InternalRobotDSL.g:1201:1: ruleNegation returns [Enumerator current=null] : (enumLiteral_0= 'not' ) ;
    public final Enumerator ruleNegation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1207:2: ( (enumLiteral_0= 'not' ) )
            // InternalRobotDSL.g:1208:2: (enumLiteral_0= 'not' )
            {
            // InternalRobotDSL.g:1208:2: (enumLiteral_0= 'not' )
            // InternalRobotDSL.g:1209:3: enumLiteral_0= 'not'
            {
            enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

            			current = grammarAccess.getNegationAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getNegationAccess().getNOTEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleNegation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xF83E000000000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xF83E000000030012L,0x0000000000000003L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000B4200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000B4200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xF83E000000020010L,0x0000000000000003L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x07C0000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200000002L});

}