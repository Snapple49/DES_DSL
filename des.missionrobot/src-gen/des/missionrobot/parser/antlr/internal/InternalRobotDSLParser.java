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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Missionset'", "'Missions:'", "'Mission'", "'Flags:'", "'Tasks:'", "'Goal:'", "'Condition:'", "'timeout'", "'Actions:'", "'Task:'", "'priority:'", "'Triggers:'", "'Move'", "'for'", "'sec'", "'at'", "'speed'", "'Turn'", "'deg'", "'Arm'", "'Play'", "'sound'", "'Update'", "'to'", "'is'", "'distance'", "'than'", "'cm'", "'Time:'", "'forward'", "'backward'", "'left'", "'right'", "'high'", "'medium'", "'low'", "'raise'", "'lower'", "'buzz'", "'fanfare'", "'Color'", "'LeftLight'", "'RightLight'", "'RearHeight'", "'FrontDistance'", "'red'", "'white'", "'black'", "'green'", "'blue'", "'bright'", "'dark'", "'less'", "'greater'", "'and'", "'or'", "'true'", "'false'", "'not'"
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
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
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
        	return "Missions";
       	}

       	@Override
       	protected RobotDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMissions"
    // InternalRobotDSL.g:65:1: entryRuleMissions returns [EObject current=null] : iv_ruleMissions= ruleMissions EOF ;
    public final EObject entryRuleMissions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissions = null;


        try {
            // InternalRobotDSL.g:65:49: (iv_ruleMissions= ruleMissions EOF )
            // InternalRobotDSL.g:66:2: iv_ruleMissions= ruleMissions EOF
            {
             newCompositeNode(grammarAccess.getMissionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMissions=ruleMissions();

            state._fsp--;

             current =iv_ruleMissions; 
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
    // $ANTLR end "entryRuleMissions"


    // $ANTLR start "ruleMissions"
    // InternalRobotDSL.g:72:1: ruleMissions returns [EObject current=null] : (otherlv_0= 'Missionset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Missions:' ( (lv_missionList_3_0= ruleMission ) ) ) ;
    public final EObject ruleMissions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_missionList_3_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:78:2: ( (otherlv_0= 'Missionset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Missions:' ( (lv_missionList_3_0= ruleMission ) ) ) )
            // InternalRobotDSL.g:79:2: (otherlv_0= 'Missionset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Missions:' ( (lv_missionList_3_0= ruleMission ) ) )
            {
            // InternalRobotDSL.g:79:2: (otherlv_0= 'Missionset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Missions:' ( (lv_missionList_3_0= ruleMission ) ) )
            // InternalRobotDSL.g:80:3: otherlv_0= 'Missionset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Missions:' ( (lv_missionList_3_0= ruleMission ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionsAccess().getMissionsetKeyword_0());
            		
            // InternalRobotDSL.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRobotDSL.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRobotDSL.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalRobotDSL.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMissionsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionsAccess().getMissionsKeyword_2());
            		
            // InternalRobotDSL.g:106:3: ( (lv_missionList_3_0= ruleMission ) )
            // InternalRobotDSL.g:107:4: (lv_missionList_3_0= ruleMission )
            {
            // InternalRobotDSL.g:107:4: (lv_missionList_3_0= ruleMission )
            // InternalRobotDSL.g:108:5: lv_missionList_3_0= ruleMission
            {

            					newCompositeNode(grammarAccess.getMissionsAccess().getMissionListMissionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_missionList_3_0=ruleMission();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionsRule());
            					}
            					add(
            						current,
            						"missionList",
            						lv_missionList_3_0,
            						"des.missionrobot.RobotDSL.Mission");
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
    // $ANTLR end "ruleMissions"


    // $ANTLR start "entryRuleMission"
    // InternalRobotDSL.g:129:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalRobotDSL.g:129:48: (iv_ruleMission= ruleMission EOF )
            // InternalRobotDSL.g:130:2: iv_ruleMission= ruleMission EOF
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
    // InternalRobotDSL.g:136:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Flags:' ( (lv_flagsList_3_0= ruleFlag ) )* otherlv_4= 'Tasks:' ( (lv_taskList_5_0= ruleTask ) )+ otherlv_6= 'Goal:' (otherlv_7= 'Condition:' ( (lv_goalEvents_8_0= ruleTrigger ) )+ )? (otherlv_9= 'timeout' ( (lv_timeout_10_0= ruleTime ) ) )? (otherlv_11= 'Actions:' ( (lv_finishActions_12_0= ruleAction ) )+ )? ) ;
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

        EObject lv_taskList_5_0 = null;

        EObject lv_goalEvents_8_0 = null;

        EObject lv_timeout_10_0 = null;

        EObject lv_finishActions_12_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:142:2: ( (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Flags:' ( (lv_flagsList_3_0= ruleFlag ) )* otherlv_4= 'Tasks:' ( (lv_taskList_5_0= ruleTask ) )+ otherlv_6= 'Goal:' (otherlv_7= 'Condition:' ( (lv_goalEvents_8_0= ruleTrigger ) )+ )? (otherlv_9= 'timeout' ( (lv_timeout_10_0= ruleTime ) ) )? (otherlv_11= 'Actions:' ( (lv_finishActions_12_0= ruleAction ) )+ )? ) )
            // InternalRobotDSL.g:143:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Flags:' ( (lv_flagsList_3_0= ruleFlag ) )* otherlv_4= 'Tasks:' ( (lv_taskList_5_0= ruleTask ) )+ otherlv_6= 'Goal:' (otherlv_7= 'Condition:' ( (lv_goalEvents_8_0= ruleTrigger ) )+ )? (otherlv_9= 'timeout' ( (lv_timeout_10_0= ruleTime ) ) )? (otherlv_11= 'Actions:' ( (lv_finishActions_12_0= ruleAction ) )+ )? )
            {
            // InternalRobotDSL.g:143:2: (otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Flags:' ( (lv_flagsList_3_0= ruleFlag ) )* otherlv_4= 'Tasks:' ( (lv_taskList_5_0= ruleTask ) )+ otherlv_6= 'Goal:' (otherlv_7= 'Condition:' ( (lv_goalEvents_8_0= ruleTrigger ) )+ )? (otherlv_9= 'timeout' ( (lv_timeout_10_0= ruleTime ) ) )? (otherlv_11= 'Actions:' ( (lv_finishActions_12_0= ruleAction ) )+ )? )
            // InternalRobotDSL.g:144:3: otherlv_0= 'Mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Flags:' ( (lv_flagsList_3_0= ruleFlag ) )* otherlv_4= 'Tasks:' ( (lv_taskList_5_0= ruleTask ) )+ otherlv_6= 'Goal:' (otherlv_7= 'Condition:' ( (lv_goalEvents_8_0= ruleTrigger ) )+ )? (otherlv_9= 'timeout' ( (lv_timeout_10_0= ruleTime ) ) )? (otherlv_11= 'Actions:' ( (lv_finishActions_12_0= ruleAction ) )+ )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalRobotDSL.g:148:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRobotDSL.g:149:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRobotDSL.g:149:4: (lv_name_1_0= RULE_ID )
            // InternalRobotDSL.g:150:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getFlagsKeyword_2());
            		
            // InternalRobotDSL.g:170:3: ( (lv_flagsList_3_0= ruleFlag ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRobotDSL.g:171:4: (lv_flagsList_3_0= ruleFlag )
            	    {
            	    // InternalRobotDSL.g:171:4: (lv_flagsList_3_0= ruleFlag )
            	    // InternalRobotDSL.g:172:5: lv_flagsList_3_0= ruleFlag
            	    {

            	    					newCompositeNode(grammarAccess.getMissionAccess().getFlagsListFlagParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
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
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getTasksKeyword_4());
            		
            // InternalRobotDSL.g:193:3: ( (lv_taskList_5_0= ruleTask ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRobotDSL.g:194:4: (lv_taskList_5_0= ruleTask )
            	    {
            	    // InternalRobotDSL.g:194:4: (lv_taskList_5_0= ruleTask )
            	    // InternalRobotDSL.g:195:5: lv_taskList_5_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getMissionAccess().getTaskListTaskParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_taskList_5_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMissionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"taskList",
            	    						lv_taskList_5_0,
            	    						"des.missionrobot.RobotDSL.Task");
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

            otherlv_6=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getGoalKeyword_6());
            		
            // InternalRobotDSL.g:216:3: (otherlv_7= 'Condition:' ( (lv_goalEvents_8_0= ruleTrigger ) )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRobotDSL.g:217:4: otherlv_7= 'Condition:' ( (lv_goalEvents_8_0= ruleTrigger ) )+
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getMissionAccess().getConditionKeyword_7_0());
                    			
                    // InternalRobotDSL.g:221:4: ( (lv_goalEvents_8_0= ruleTrigger ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID||(LA3_0>=51 && LA3_0<=55)||(LA3_0>=63 && LA3_0<=69)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRobotDSL.g:222:5: (lv_goalEvents_8_0= ruleTrigger )
                    	    {
                    	    // InternalRobotDSL.g:222:5: (lv_goalEvents_8_0= ruleTrigger )
                    	    // InternalRobotDSL.g:223:6: lv_goalEvents_8_0= ruleTrigger
                    	    {

                    	    						newCompositeNode(grammarAccess.getMissionAccess().getGoalEventsTriggerParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
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
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }

            // InternalRobotDSL.g:241:3: (otherlv_9= 'timeout' ( (lv_timeout_10_0= ruleTime ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRobotDSL.g:242:4: otherlv_9= 'timeout' ( (lv_timeout_10_0= ruleTime ) )
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getMissionAccess().getTimeoutKeyword_8_0());
                    			
                    // InternalRobotDSL.g:246:4: ( (lv_timeout_10_0= ruleTime ) )
                    // InternalRobotDSL.g:247:5: (lv_timeout_10_0= ruleTime )
                    {
                    // InternalRobotDSL.g:247:5: (lv_timeout_10_0= ruleTime )
                    // InternalRobotDSL.g:248:6: lv_timeout_10_0= ruleTime
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getTimeoutTimeParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

            // InternalRobotDSL.g:266:3: (otherlv_11= 'Actions:' ( (lv_finishActions_12_0= ruleAction ) )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRobotDSL.g:267:4: otherlv_11= 'Actions:' ( (lv_finishActions_12_0= ruleAction ) )+
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getMissionAccess().getActionsKeyword_9_0());
                    			
                    // InternalRobotDSL.g:271:4: ( (lv_finishActions_12_0= ruleAction ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==23||LA6_0==28||(LA6_0>=30 && LA6_0<=31)||LA6_0==33) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRobotDSL.g:272:5: (lv_finishActions_12_0= ruleAction )
                    	    {
                    	    // InternalRobotDSL.g:272:5: (lv_finishActions_12_0= ruleAction )
                    	    // InternalRobotDSL.g:273:6: lv_finishActions_12_0= ruleAction
                    	    {

                    	    						newCompositeNode(grammarAccess.getMissionAccess().getFinishActionsActionParserRuleCall_9_1_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
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
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
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
    // InternalRobotDSL.g:295:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalRobotDSL.g:295:45: (iv_ruleTask= ruleTask EOF )
            // InternalRobotDSL.g:296:2: iv_ruleTask= ruleTask EOF
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
    // InternalRobotDSL.g:302:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ )? otherlv_6= 'Actions:' ( (lv_actionList_7_0= ruleAction ) )+ ) ;
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
            // InternalRobotDSL.g:308:2: ( (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ )? otherlv_6= 'Actions:' ( (lv_actionList_7_0= ruleAction ) )+ ) )
            // InternalRobotDSL.g:309:2: (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ )? otherlv_6= 'Actions:' ( (lv_actionList_7_0= ruleAction ) )+ )
            {
            // InternalRobotDSL.g:309:2: (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ )? otherlv_6= 'Actions:' ( (lv_actionList_7_0= ruleAction ) )+ )
            // InternalRobotDSL.g:310:3: otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'priority:' ( (lv_prio_3_0= RULE_INT ) ) (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ )? otherlv_6= 'Actions:' ( (lv_actionList_7_0= ruleAction ) )+
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalRobotDSL.g:314:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRobotDSL.g:315:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRobotDSL.g:315:4: (lv_name_1_0= RULE_ID )
            // InternalRobotDSL.g:316:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getPriorityKeyword_2());
            		
            // InternalRobotDSL.g:336:3: ( (lv_prio_3_0= RULE_INT ) )
            // InternalRobotDSL.g:337:4: (lv_prio_3_0= RULE_INT )
            {
            // InternalRobotDSL.g:337:4: (lv_prio_3_0= RULE_INT )
            // InternalRobotDSL.g:338:5: lv_prio_3_0= RULE_INT
            {
            lv_prio_3_0=(Token)match(input,RULE_INT,FOLLOW_19); 

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

            // InternalRobotDSL.g:354:3: (otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRobotDSL.g:355:4: otherlv_4= 'Triggers:' ( (lv_triggerList_5_0= ruleTrigger ) )+
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getTriggersKeyword_4_0());
                    			
                    // InternalRobotDSL.g:359:4: ( (lv_triggerList_5_0= ruleTrigger ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID||(LA8_0>=51 && LA8_0<=55)||(LA8_0>=63 && LA8_0<=69)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalRobotDSL.g:360:5: (lv_triggerList_5_0= ruleTrigger )
                    	    {
                    	    // InternalRobotDSL.g:360:5: (lv_triggerList_5_0= ruleTrigger )
                    	    // InternalRobotDSL.g:361:6: lv_triggerList_5_0= ruleTrigger
                    	    {

                    	    						newCompositeNode(grammarAccess.getTaskAccess().getTriggerListTriggerParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
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
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getActionsKeyword_5());
            		
            // InternalRobotDSL.g:383:3: ( (lv_actionList_7_0= ruleAction ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23||LA10_0==28||(LA10_0>=30 && LA10_0<=31)||LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRobotDSL.g:384:4: (lv_actionList_7_0= ruleAction )
            	    {
            	    // InternalRobotDSL.g:384:4: (lv_actionList_7_0= ruleAction )
            	    // InternalRobotDSL.g:385:5: lv_actionList_7_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getTaskAccess().getActionListActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // InternalRobotDSL.g:406:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRobotDSL.g:406:47: (iv_ruleAction= ruleAction EOF )
            // InternalRobotDSL.g:407:2: iv_ruleAction= ruleAction EOF
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
    // InternalRobotDSL.g:413:1: ruleAction returns [EObject current=null] : ( (otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? ) | (otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) ) ) | (otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) ) ) | (otherlv_17= 'Update' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'to' ( (lv_bool_20_0= ruleBool ) ) ) ) ;
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
            // InternalRobotDSL.g:419:2: ( ( (otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? ) | (otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) ) ) | (otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) ) ) | (otherlv_17= 'Update' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'to' ( (lv_bool_20_0= ruleBool ) ) ) ) )
            // InternalRobotDSL.g:420:2: ( (otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? ) | (otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) ) ) | (otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) ) ) | (otherlv_17= 'Update' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'to' ( (lv_bool_20_0= ruleBool ) ) ) )
            {
            // InternalRobotDSL.g:420:2: ( (otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? ) | (otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) ) ) | (otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) ) ) | (otherlv_17= 'Update' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'to' ( (lv_bool_20_0= ruleBool ) ) ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt13=1;
                }
                break;
            case 28:
                {
                alt13=2;
                }
                break;
            case 30:
                {
                alt13=3;
                }
                break;
            case 31:
                {
                alt13=4;
                }
                break;
            case 33:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRobotDSL.g:421:3: (otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? )
                    {
                    // InternalRobotDSL.g:421:3: (otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? )
                    // InternalRobotDSL.g:422:4: otherlv_0= 'Move' ( (lv_dir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )?
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getActionAccess().getMoveKeyword_0_0());
                    			
                    // InternalRobotDSL.g:426:4: ( (lv_dir_1_0= ruleDirection ) )
                    // InternalRobotDSL.g:427:5: (lv_dir_1_0= ruleDirection )
                    {
                    // InternalRobotDSL.g:427:5: (lv_dir_1_0= ruleDirection )
                    // InternalRobotDSL.g:428:6: lv_dir_1_0= ruleDirection
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getDirDirectionEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    // InternalRobotDSL.g:445:4: (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==24) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalRobotDSL.g:446:5: otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'sec'
                            {
                            otherlv_2=(Token)match(input,24,FOLLOW_18); 

                            					newLeafNode(otherlv_2, grammarAccess.getActionAccess().getForKeyword_0_2_0());
                            				
                            // InternalRobotDSL.g:450:5: ( (lv_duration_3_0= RULE_INT ) )
                            // InternalRobotDSL.g:451:6: (lv_duration_3_0= RULE_INT )
                            {
                            // InternalRobotDSL.g:451:6: (lv_duration_3_0= RULE_INT )
                            // InternalRobotDSL.g:452:7: lv_duration_3_0= RULE_INT
                            {
                            lv_duration_3_0=(Token)match(input,RULE_INT,FOLLOW_23); 

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

                            otherlv_4=(Token)match(input,25,FOLLOW_24); 

                            					newLeafNode(otherlv_4, grammarAccess.getActionAccess().getSecKeyword_0_2_2());
                            				

                            }
                            break;

                    }

                    // InternalRobotDSL.g:473:4: (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==26) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalRobotDSL.g:474:5: otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed'
                            {
                            otherlv_5=(Token)match(input,26,FOLLOW_25); 

                            					newLeafNode(otherlv_5, grammarAccess.getActionAccess().getAtKeyword_0_3_0());
                            				
                            // InternalRobotDSL.g:478:5: ( (lv_speed_6_0= ruleSpeed ) )
                            // InternalRobotDSL.g:479:6: (lv_speed_6_0= ruleSpeed )
                            {
                            // InternalRobotDSL.g:479:6: (lv_speed_6_0= ruleSpeed )
                            // InternalRobotDSL.g:480:7: lv_speed_6_0= ruleSpeed
                            {

                            							newCompositeNode(grammarAccess.getActionAccess().getSpeedSpeedEnumRuleCall_0_3_1_0());
                            						
                            pushFollow(FOLLOW_26);
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

                            otherlv_7=(Token)match(input,27,FOLLOW_2); 

                            					newLeafNode(otherlv_7, grammarAccess.getActionAccess().getSpeedKeyword_0_3_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:504:3: (otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' )
                    {
                    // InternalRobotDSL.g:504:3: (otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' )
                    // InternalRobotDSL.g:505:4: otherlv_8= 'Turn' ( (lv_dir_9_0= ruleDirection ) ) ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg'
                    {
                    otherlv_8=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionAccess().getTurnKeyword_1_0());
                    			
                    // InternalRobotDSL.g:509:4: ( (lv_dir_9_0= ruleDirection ) )
                    // InternalRobotDSL.g:510:5: (lv_dir_9_0= ruleDirection )
                    {
                    // InternalRobotDSL.g:510:5: (lv_dir_9_0= ruleDirection )
                    // InternalRobotDSL.g:511:6: lv_dir_9_0= ruleDirection
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getDirDirectionEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

                    // InternalRobotDSL.g:528:4: ( (lv_degr_10_0= RULE_INT ) )
                    // InternalRobotDSL.g:529:5: (lv_degr_10_0= RULE_INT )
                    {
                    // InternalRobotDSL.g:529:5: (lv_degr_10_0= RULE_INT )
                    // InternalRobotDSL.g:530:6: lv_degr_10_0= RULE_INT
                    {
                    lv_degr_10_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

                    otherlv_11=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getActionAccess().getDegKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:552:3: (otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) ) )
                    {
                    // InternalRobotDSL.g:552:3: (otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) ) )
                    // InternalRobotDSL.g:553:4: otherlv_12= 'Arm' ( (lv_op_13_0= ruleArmOp ) )
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_28); 

                    				newLeafNode(otherlv_12, grammarAccess.getActionAccess().getArmKeyword_2_0());
                    			
                    // InternalRobotDSL.g:557:4: ( (lv_op_13_0= ruleArmOp ) )
                    // InternalRobotDSL.g:558:5: (lv_op_13_0= ruleArmOp )
                    {
                    // InternalRobotDSL.g:558:5: (lv_op_13_0= ruleArmOp )
                    // InternalRobotDSL.g:559:6: lv_op_13_0= ruleArmOp
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
                    // InternalRobotDSL.g:578:3: (otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) ) )
                    {
                    // InternalRobotDSL.g:578:3: (otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) ) )
                    // InternalRobotDSL.g:579:4: otherlv_14= 'Play' otherlv_15= 'sound' ( (lv_sound_16_0= ruleSound ) )
                    {
                    otherlv_14=(Token)match(input,31,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getActionAccess().getPlayKeyword_3_0());
                    			
                    otherlv_15=(Token)match(input,32,FOLLOW_30); 

                    				newLeafNode(otherlv_15, grammarAccess.getActionAccess().getSoundKeyword_3_1());
                    			
                    // InternalRobotDSL.g:587:4: ( (lv_sound_16_0= ruleSound ) )
                    // InternalRobotDSL.g:588:5: (lv_sound_16_0= ruleSound )
                    {
                    // InternalRobotDSL.g:588:5: (lv_sound_16_0= ruleSound )
                    // InternalRobotDSL.g:589:6: lv_sound_16_0= ruleSound
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
                    // InternalRobotDSL.g:608:3: (otherlv_17= 'Update' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'to' ( (lv_bool_20_0= ruleBool ) ) )
                    {
                    // InternalRobotDSL.g:608:3: (otherlv_17= 'Update' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'to' ( (lv_bool_20_0= ruleBool ) ) )
                    // InternalRobotDSL.g:609:4: otherlv_17= 'Update' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'to' ( (lv_bool_20_0= ruleBool ) )
                    {
                    otherlv_17=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getActionAccess().getUpdateKeyword_4_0());
                    			
                    // InternalRobotDSL.g:613:4: ( (otherlv_18= RULE_ID ) )
                    // InternalRobotDSL.g:614:5: (otherlv_18= RULE_ID )
                    {
                    // InternalRobotDSL.g:614:5: (otherlv_18= RULE_ID )
                    // InternalRobotDSL.g:615:6: otherlv_18= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    					
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(otherlv_18, grammarAccess.getActionAccess().getFlagFlagCrossReference_4_1_0());
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,34,FOLLOW_32); 

                    				newLeafNode(otherlv_19, grammarAccess.getActionAccess().getToKeyword_4_2());
                    			
                    // InternalRobotDSL.g:630:4: ( (lv_bool_20_0= ruleBool ) )
                    // InternalRobotDSL.g:631:5: (lv_bool_20_0= ruleBool )
                    {
                    // InternalRobotDSL.g:631:5: (lv_bool_20_0= ruleBool )
                    // InternalRobotDSL.g:632:6: lv_bool_20_0= ruleBool
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
    // InternalRobotDSL.g:654:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalRobotDSL.g:654:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalRobotDSL.g:655:2: iv_ruleTrigger= ruleTrigger EOF
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
    // InternalRobotDSL.g:661:1: ruleTrigger returns [EObject current=null] : ( ( (lv_boolType_0_0= ruleBool ) )? ( ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) ) ) ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_boolType_0_0 = null;

        Enumerator lv_neg_1_0 = null;

        Enumerator lv_sensor_3_0 = null;

        Enumerator lv_color_5_0 = null;

        EObject lv_dist_7_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:667:2: ( ( ( (lv_boolType_0_0= ruleBool ) )? ( ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) ) ) ) ) )
            // InternalRobotDSL.g:668:2: ( ( (lv_boolType_0_0= ruleBool ) )? ( ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) ) ) ) )
            {
            // InternalRobotDSL.g:668:2: ( ( (lv_boolType_0_0= ruleBool ) )? ( ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) ) ) ) )
            // InternalRobotDSL.g:669:3: ( (lv_boolType_0_0= ruleBool ) )? ( ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) ) ) )
            {
            // InternalRobotDSL.g:669:3: ( (lv_boolType_0_0= ruleBool ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=63 && LA14_0<=68)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRobotDSL.g:670:4: (lv_boolType_0_0= ruleBool )
                    {
                    // InternalRobotDSL.g:670:4: (lv_boolType_0_0= ruleBool )
                    // InternalRobotDSL.g:671:5: lv_boolType_0_0= ruleBool
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

            // InternalRobotDSL.g:688:3: ( ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==69) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=51 && LA17_0<=55)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRobotDSL.g:689:4: ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalRobotDSL.g:689:4: ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) )
                    // InternalRobotDSL.g:690:5: ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalRobotDSL.g:690:5: ( (lv_neg_1_0= ruleNegation ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==69) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalRobotDSL.g:691:6: (lv_neg_1_0= ruleNegation )
                            {
                            // InternalRobotDSL.g:691:6: (lv_neg_1_0= ruleNegation )
                            // InternalRobotDSL.g:692:7: lv_neg_1_0= ruleNegation
                            {

                            							newCompositeNode(grammarAccess.getTriggerAccess().getNegNegationEnumRuleCall_1_0_0_0());
                            						
                            pushFollow(FOLLOW_3);
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

                    // InternalRobotDSL.g:709:5: ( (otherlv_2= RULE_ID ) )
                    // InternalRobotDSL.g:710:6: (otherlv_2= RULE_ID )
                    {
                    // InternalRobotDSL.g:710:6: (otherlv_2= RULE_ID )
                    // InternalRobotDSL.g:711:7: otherlv_2= RULE_ID
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
                    // InternalRobotDSL.g:724:4: ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) ) )
                    {
                    // InternalRobotDSL.g:724:4: ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) ) )
                    // InternalRobotDSL.g:725:5: ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) )
                    {
                    // InternalRobotDSL.g:725:5: ( (lv_sensor_3_0= ruleSensor ) )
                    // InternalRobotDSL.g:726:6: (lv_sensor_3_0= ruleSensor )
                    {
                    // InternalRobotDSL.g:726:6: (lv_sensor_3_0= ruleSensor )
                    // InternalRobotDSL.g:727:7: lv_sensor_3_0= ruleSensor
                    {

                    							newCompositeNode(grammarAccess.getTriggerAccess().getSensorSensorEnumRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_33);
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

                    // InternalRobotDSL.g:744:5: ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==35) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==36) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalRobotDSL.g:745:6: (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) )
                            {
                            // InternalRobotDSL.g:745:6: (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) )
                            // InternalRobotDSL.g:746:7: otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) )
                            {
                            otherlv_4=(Token)match(input,35,FOLLOW_34); 

                            							newLeafNode(otherlv_4, grammarAccess.getTriggerAccess().getIsKeyword_1_1_1_0_0());
                            						
                            // InternalRobotDSL.g:750:7: ( (lv_color_5_0= ruleColor ) )
                            // InternalRobotDSL.g:751:8: (lv_color_5_0= ruleColor )
                            {
                            // InternalRobotDSL.g:751:8: (lv_color_5_0= ruleColor )
                            // InternalRobotDSL.g:752:9: lv_color_5_0= ruleColor
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
                            // InternalRobotDSL.g:771:6: (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) )
                            {
                            // InternalRobotDSL.g:771:6: (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) )
                            // InternalRobotDSL.g:772:7: otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) )
                            {
                            otherlv_6=(Token)match(input,36,FOLLOW_32); 

                            							newLeafNode(otherlv_6, grammarAccess.getTriggerAccess().getDistanceKeyword_1_1_1_1_0());
                            						
                            // InternalRobotDSL.g:776:7: ( (lv_dist_7_0= ruleDistance ) )
                            // InternalRobotDSL.g:777:8: (lv_dist_7_0= ruleDistance )
                            {
                            // InternalRobotDSL.g:777:8: (lv_dist_7_0= ruleDistance )
                            // InternalRobotDSL.g:778:9: lv_dist_7_0= ruleDistance
                            {

                            									newCompositeNode(grammarAccess.getTriggerAccess().getDistDistanceParserRuleCall_1_1_1_1_1_0());
                            								
                            pushFollow(FOLLOW_2);
                            lv_dist_7_0=ruleDistance();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getTriggerRule());
                            									}
                            									set(
                            										current,
                            										"dist",
                            										lv_dist_7_0,
                            										"des.missionrobot.RobotDSL.Distance");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }


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


    // $ANTLR start "entryRuleDistance"
    // InternalRobotDSL.g:803:1: entryRuleDistance returns [EObject current=null] : iv_ruleDistance= ruleDistance EOF ;
    public final EObject entryRuleDistance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistance = null;


        try {
            // InternalRobotDSL.g:803:49: (iv_ruleDistance= ruleDistance EOF )
            // InternalRobotDSL.g:804:2: iv_ruleDistance= ruleDistance EOF
            {
             newCompositeNode(grammarAccess.getDistanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistance=ruleDistance();

            state._fsp--;

             current =iv_ruleDistance; 
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
    // $ANTLR end "entryRuleDistance"


    // $ANTLR start "ruleDistance"
    // InternalRobotDSL.g:810:1: ruleDistance returns [EObject current=null] : ( ( (lv_rangeBool_0_0= ruleBool ) ) otherlv_1= 'than' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm' ) ;
    public final EObject ruleDistance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_distance_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_rangeBool_0_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:816:2: ( ( ( (lv_rangeBool_0_0= ruleBool ) ) otherlv_1= 'than' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm' ) )
            // InternalRobotDSL.g:817:2: ( ( (lv_rangeBool_0_0= ruleBool ) ) otherlv_1= 'than' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm' )
            {
            // InternalRobotDSL.g:817:2: ( ( (lv_rangeBool_0_0= ruleBool ) ) otherlv_1= 'than' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm' )
            // InternalRobotDSL.g:818:3: ( (lv_rangeBool_0_0= ruleBool ) ) otherlv_1= 'than' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm'
            {
            // InternalRobotDSL.g:818:3: ( (lv_rangeBool_0_0= ruleBool ) )
            // InternalRobotDSL.g:819:4: (lv_rangeBool_0_0= ruleBool )
            {
            // InternalRobotDSL.g:819:4: (lv_rangeBool_0_0= ruleBool )
            // InternalRobotDSL.g:820:5: lv_rangeBool_0_0= ruleBool
            {

            					newCompositeNode(grammarAccess.getDistanceAccess().getRangeBoolBoolEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
            lv_rangeBool_0_0=ruleBool();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceRule());
            					}
            					set(
            						current,
            						"rangeBool",
            						lv_rangeBool_0_0,
            						"des.missionrobot.RobotDSL.Bool");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getDistanceAccess().getThanKeyword_1());
            		
            // InternalRobotDSL.g:841:3: ( (lv_distance_2_0= RULE_INT ) )
            // InternalRobotDSL.g:842:4: (lv_distance_2_0= RULE_INT )
            {
            // InternalRobotDSL.g:842:4: (lv_distance_2_0= RULE_INT )
            // InternalRobotDSL.g:843:5: lv_distance_2_0= RULE_INT
            {
            lv_distance_2_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            					newLeafNode(lv_distance_2_0, grammarAccess.getDistanceAccess().getDistanceINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDistanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDistanceAccess().getCmKeyword_3());
            		

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
    // $ANTLR end "ruleDistance"


    // $ANTLR start "entryRuleFlag"
    // InternalRobotDSL.g:867:1: entryRuleFlag returns [EObject current=null] : iv_ruleFlag= ruleFlag EOF ;
    public final EObject entryRuleFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlag = null;


        try {
            // InternalRobotDSL.g:867:45: (iv_ruleFlag= ruleFlag EOF )
            // InternalRobotDSL.g:868:2: iv_ruleFlag= ruleFlag EOF
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
    // InternalRobotDSL.g:874:1: ruleFlag returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) ) )? ) ;
    public final EObject ruleFlag() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_bool_2_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:880:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) ) )? ) )
            // InternalRobotDSL.g:881:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) ) )? )
            {
            // InternalRobotDSL.g:881:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) ) )? )
            // InternalRobotDSL.g:882:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) ) )?
            {
            // InternalRobotDSL.g:882:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRobotDSL.g:883:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRobotDSL.g:883:4: (lv_name_0_0= RULE_ID )
            // InternalRobotDSL.g:884:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_37); 

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

            // InternalRobotDSL.g:900:3: (otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRobotDSL.g:901:4: otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) )
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_32); 

                    				newLeafNode(otherlv_1, grammarAccess.getFlagAccess().getIsKeyword_1_0());
                    			
                    // InternalRobotDSL.g:905:4: ( (lv_bool_2_0= ruleBool ) )
                    // InternalRobotDSL.g:906:5: (lv_bool_2_0= ruleBool )
                    {
                    // InternalRobotDSL.g:906:5: (lv_bool_2_0= ruleBool )
                    // InternalRobotDSL.g:907:6: lv_bool_2_0= ruleBool
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
    // InternalRobotDSL.g:929:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalRobotDSL.g:929:45: (iv_ruleTime= ruleTime EOF )
            // InternalRobotDSL.g:930:2: iv_ruleTime= ruleTime EOF
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
    // InternalRobotDSL.g:936:1: ruleTime returns [EObject current=null] : (otherlv_0= 'Time:' ( (lv_sec_1_0= RULE_INT ) ) otherlv_2= 'sec' ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sec_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:942:2: ( (otherlv_0= 'Time:' ( (lv_sec_1_0= RULE_INT ) ) otherlv_2= 'sec' ) )
            // InternalRobotDSL.g:943:2: (otherlv_0= 'Time:' ( (lv_sec_1_0= RULE_INT ) ) otherlv_2= 'sec' )
            {
            // InternalRobotDSL.g:943:2: (otherlv_0= 'Time:' ( (lv_sec_1_0= RULE_INT ) ) otherlv_2= 'sec' )
            // InternalRobotDSL.g:944:3: otherlv_0= 'Time:' ( (lv_sec_1_0= RULE_INT ) ) otherlv_2= 'sec'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeAccess().getTimeKeyword_0());
            		
            // InternalRobotDSL.g:948:3: ( (lv_sec_1_0= RULE_INT ) )
            // InternalRobotDSL.g:949:4: (lv_sec_1_0= RULE_INT )
            {
            // InternalRobotDSL.g:949:4: (lv_sec_1_0= RULE_INT )
            // InternalRobotDSL.g:950:5: lv_sec_1_0= RULE_INT
            {
            lv_sec_1_0=(Token)match(input,RULE_INT,FOLLOW_23); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

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
    // InternalRobotDSL.g:974:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:980:2: ( ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) ) )
            // InternalRobotDSL.g:981:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) )
            {
            // InternalRobotDSL.g:981:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt19=1;
                }
                break;
            case 41:
                {
                alt19=2;
                }
                break;
            case 42:
                {
                alt19=3;
                }
                break;
            case 43:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalRobotDSL.g:982:3: (enumLiteral_0= 'forward' )
                    {
                    // InternalRobotDSL.g:982:3: (enumLiteral_0= 'forward' )
                    // InternalRobotDSL.g:983:4: enumLiteral_0= 'forward'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getFORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getFORWARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:990:3: (enumLiteral_1= 'backward' )
                    {
                    // InternalRobotDSL.g:990:3: (enumLiteral_1= 'backward' )
                    // InternalRobotDSL.g:991:4: enumLiteral_1= 'backward'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getBACKWARDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getBACKWARDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:998:3: (enumLiteral_2= 'left' )
                    {
                    // InternalRobotDSL.g:998:3: (enumLiteral_2= 'left' )
                    // InternalRobotDSL.g:999:4: enumLiteral_2= 'left'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getLEFTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:1006:3: (enumLiteral_3= 'right' )
                    {
                    // InternalRobotDSL.g:1006:3: (enumLiteral_3= 'right' )
                    // InternalRobotDSL.g:1007:4: enumLiteral_3= 'right'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

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
    // InternalRobotDSL.g:1017:1: ruleSpeed returns [Enumerator current=null] : ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'low' ) ) ;
    public final Enumerator ruleSpeed() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1023:2: ( ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'low' ) ) )
            // InternalRobotDSL.g:1024:2: ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'low' ) )
            {
            // InternalRobotDSL.g:1024:2: ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'low' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt20=1;
                }
                break;
            case 45:
                {
                alt20=2;
                }
                break;
            case 46:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalRobotDSL.g:1025:3: (enumLiteral_0= 'high' )
                    {
                    // InternalRobotDSL.g:1025:3: (enumLiteral_0= 'high' )
                    // InternalRobotDSL.g:1026:4: enumLiteral_0= 'high'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getSpeedAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSpeedAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1033:3: (enumLiteral_1= 'medium' )
                    {
                    // InternalRobotDSL.g:1033:3: (enumLiteral_1= 'medium' )
                    // InternalRobotDSL.g:1034:4: enumLiteral_1= 'medium'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getSpeedAccess().getMEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSpeedAccess().getMEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:1041:3: (enumLiteral_2= 'low' )
                    {
                    // InternalRobotDSL.g:1041:3: (enumLiteral_2= 'low' )
                    // InternalRobotDSL.g:1042:4: enumLiteral_2= 'low'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

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
    // InternalRobotDSL.g:1052:1: ruleArmOp returns [Enumerator current=null] : ( (enumLiteral_0= 'raise' ) | (enumLiteral_1= 'lower' ) ) ;
    public final Enumerator ruleArmOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1058:2: ( ( (enumLiteral_0= 'raise' ) | (enumLiteral_1= 'lower' ) ) )
            // InternalRobotDSL.g:1059:2: ( (enumLiteral_0= 'raise' ) | (enumLiteral_1= 'lower' ) )
            {
            // InternalRobotDSL.g:1059:2: ( (enumLiteral_0= 'raise' ) | (enumLiteral_1= 'lower' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            else if ( (LA21_0==48) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalRobotDSL.g:1060:3: (enumLiteral_0= 'raise' )
                    {
                    // InternalRobotDSL.g:1060:3: (enumLiteral_0= 'raise' )
                    // InternalRobotDSL.g:1061:4: enumLiteral_0= 'raise'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getArmOpAccess().getUPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getArmOpAccess().getUPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1068:3: (enumLiteral_1= 'lower' )
                    {
                    // InternalRobotDSL.g:1068:3: (enumLiteral_1= 'lower' )
                    // InternalRobotDSL.g:1069:4: enumLiteral_1= 'lower'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

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
    // InternalRobotDSL.g:1079:1: ruleSound returns [Enumerator current=null] : ( (enumLiteral_0= 'buzz' ) | (enumLiteral_1= 'fanfare' ) ) ;
    public final Enumerator ruleSound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1085:2: ( ( (enumLiteral_0= 'buzz' ) | (enumLiteral_1= 'fanfare' ) ) )
            // InternalRobotDSL.g:1086:2: ( (enumLiteral_0= 'buzz' ) | (enumLiteral_1= 'fanfare' ) )
            {
            // InternalRobotDSL.g:1086:2: ( (enumLiteral_0= 'buzz' ) | (enumLiteral_1= 'fanfare' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==49) ) {
                alt22=1;
            }
            else if ( (LA22_0==50) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalRobotDSL.g:1087:3: (enumLiteral_0= 'buzz' )
                    {
                    // InternalRobotDSL.g:1087:3: (enumLiteral_0= 'buzz' )
                    // InternalRobotDSL.g:1088:4: enumLiteral_0= 'buzz'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getSoundAccess().getBuzzEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSoundAccess().getBuzzEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1095:3: (enumLiteral_1= 'fanfare' )
                    {
                    // InternalRobotDSL.g:1095:3: (enumLiteral_1= 'fanfare' )
                    // InternalRobotDSL.g:1096:4: enumLiteral_1= 'fanfare'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

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
    // InternalRobotDSL.g:1106:1: ruleSensor returns [Enumerator current=null] : ( (enumLiteral_0= 'Color' ) | (enumLiteral_1= 'LeftLight' ) | (enumLiteral_2= 'RightLight' ) | (enumLiteral_3= 'RearHeight' ) | (enumLiteral_4= 'FrontDistance' ) ) ;
    public final Enumerator ruleSensor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1112:2: ( ( (enumLiteral_0= 'Color' ) | (enumLiteral_1= 'LeftLight' ) | (enumLiteral_2= 'RightLight' ) | (enumLiteral_3= 'RearHeight' ) | (enumLiteral_4= 'FrontDistance' ) ) )
            // InternalRobotDSL.g:1113:2: ( (enumLiteral_0= 'Color' ) | (enumLiteral_1= 'LeftLight' ) | (enumLiteral_2= 'RightLight' ) | (enumLiteral_3= 'RearHeight' ) | (enumLiteral_4= 'FrontDistance' ) )
            {
            // InternalRobotDSL.g:1113:2: ( (enumLiteral_0= 'Color' ) | (enumLiteral_1= 'LeftLight' ) | (enumLiteral_2= 'RightLight' ) | (enumLiteral_3= 'RearHeight' ) | (enumLiteral_4= 'FrontDistance' ) )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt23=1;
                }
                break;
            case 52:
                {
                alt23=2;
                }
                break;
            case 53:
                {
                alt23=3;
                }
                break;
            case 54:
                {
                alt23=4;
                }
                break;
            case 55:
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
                    // InternalRobotDSL.g:1114:3: (enumLiteral_0= 'Color' )
                    {
                    // InternalRobotDSL.g:1114:3: (enumLiteral_0= 'Color' )
                    // InternalRobotDSL.g:1115:4: enumLiteral_0= 'Color'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getSensorAccess().getCOLOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSensorAccess().getCOLOREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1122:3: (enumLiteral_1= 'LeftLight' )
                    {
                    // InternalRobotDSL.g:1122:3: (enumLiteral_1= 'LeftLight' )
                    // InternalRobotDSL.g:1123:4: enumLiteral_1= 'LeftLight'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getSensorAccess().getLEFTLIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSensorAccess().getLEFTLIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:1130:3: (enumLiteral_2= 'RightLight' )
                    {
                    // InternalRobotDSL.g:1130:3: (enumLiteral_2= 'RightLight' )
                    // InternalRobotDSL.g:1131:4: enumLiteral_2= 'RightLight'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getSensorAccess().getRIGHTLIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSensorAccess().getRIGHTLIGHTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:1138:3: (enumLiteral_3= 'RearHeight' )
                    {
                    // InternalRobotDSL.g:1138:3: (enumLiteral_3= 'RearHeight' )
                    // InternalRobotDSL.g:1139:4: enumLiteral_3= 'RearHeight'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getSensorAccess().getBACKUSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSensorAccess().getBACKUSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRobotDSL.g:1146:3: (enumLiteral_4= 'FrontDistance' )
                    {
                    // InternalRobotDSL.g:1146:3: (enumLiteral_4= 'FrontDistance' )
                    // InternalRobotDSL.g:1147:4: enumLiteral_4= 'FrontDistance'
                    {
                    enumLiteral_4=(Token)match(input,55,FOLLOW_2); 

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
    // InternalRobotDSL.g:1157:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'white' ) | (enumLiteral_2= 'black' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'blue' ) | (enumLiteral_5= 'bright' ) | (enumLiteral_6= 'dark' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1163:2: ( ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'white' ) | (enumLiteral_2= 'black' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'blue' ) | (enumLiteral_5= 'bright' ) | (enumLiteral_6= 'dark' ) ) )
            // InternalRobotDSL.g:1164:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'white' ) | (enumLiteral_2= 'black' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'blue' ) | (enumLiteral_5= 'bright' ) | (enumLiteral_6= 'dark' ) )
            {
            // InternalRobotDSL.g:1164:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'white' ) | (enumLiteral_2= 'black' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'blue' ) | (enumLiteral_5= 'bright' ) | (enumLiteral_6= 'dark' ) )
            int alt24=7;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt24=1;
                }
                break;
            case 57:
                {
                alt24=2;
                }
                break;
            case 58:
                {
                alt24=3;
                }
                break;
            case 59:
                {
                alt24=4;
                }
                break;
            case 60:
                {
                alt24=5;
                }
                break;
            case 61:
                {
                alt24=6;
                }
                break;
            case 62:
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
                    // InternalRobotDSL.g:1165:3: (enumLiteral_0= 'red' )
                    {
                    // InternalRobotDSL.g:1165:3: (enumLiteral_0= 'red' )
                    // InternalRobotDSL.g:1166:4: enumLiteral_0= 'red'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1173:3: (enumLiteral_1= 'white' )
                    {
                    // InternalRobotDSL.g:1173:3: (enumLiteral_1= 'white' )
                    // InternalRobotDSL.g:1174:4: enumLiteral_1= 'white'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getWHITEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getWHITEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:1181:3: (enumLiteral_2= 'black' )
                    {
                    // InternalRobotDSL.g:1181:3: (enumLiteral_2= 'black' )
                    // InternalRobotDSL.g:1182:4: enumLiteral_2= 'black'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:1189:3: (enumLiteral_3= 'green' )
                    {
                    // InternalRobotDSL.g:1189:3: (enumLiteral_3= 'green' )
                    // InternalRobotDSL.g:1190:4: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRobotDSL.g:1197:3: (enumLiteral_4= 'blue' )
                    {
                    // InternalRobotDSL.g:1197:3: (enumLiteral_4= 'blue' )
                    // InternalRobotDSL.g:1198:4: enumLiteral_4= 'blue'
                    {
                    enumLiteral_4=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBLUEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorAccess().getBLUEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRobotDSL.g:1205:3: (enumLiteral_5= 'bright' )
                    {
                    // InternalRobotDSL.g:1205:3: (enumLiteral_5= 'bright' )
                    // InternalRobotDSL.g:1206:4: enumLiteral_5= 'bright'
                    {
                    enumLiteral_5=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBRIGHTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getColorAccess().getBRIGHTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRobotDSL.g:1213:3: (enumLiteral_6= 'dark' )
                    {
                    // InternalRobotDSL.g:1213:3: (enumLiteral_6= 'dark' )
                    // InternalRobotDSL.g:1214:4: enumLiteral_6= 'dark'
                    {
                    enumLiteral_6=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getDARKEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getColorAccess().getDARKEnumLiteralDeclaration_6());
                    			

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
    // InternalRobotDSL.g:1224:1: ruleBool returns [Enumerator current=null] : ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'and' ) | (enumLiteral_3= 'or' ) | (enumLiteral_4= 'true' ) | (enumLiteral_5= 'false' ) ) ;
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
            // InternalRobotDSL.g:1230:2: ( ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'and' ) | (enumLiteral_3= 'or' ) | (enumLiteral_4= 'true' ) | (enumLiteral_5= 'false' ) ) )
            // InternalRobotDSL.g:1231:2: ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'and' ) | (enumLiteral_3= 'or' ) | (enumLiteral_4= 'true' ) | (enumLiteral_5= 'false' ) )
            {
            // InternalRobotDSL.g:1231:2: ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'and' ) | (enumLiteral_3= 'or' ) | (enumLiteral_4= 'true' ) | (enumLiteral_5= 'false' ) )
            int alt25=6;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt25=1;
                }
                break;
            case 64:
                {
                alt25=2;
                }
                break;
            case 65:
                {
                alt25=3;
                }
                break;
            case 66:
                {
                alt25=4;
                }
                break;
            case 67:
                {
                alt25=5;
                }
                break;
            case 68:
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalRobotDSL.g:1232:3: (enumLiteral_0= 'less' )
                    {
                    // InternalRobotDSL.g:1232:3: (enumLiteral_0= 'less' )
                    // InternalRobotDSL.g:1233:4: enumLiteral_0= 'less'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getBoolAccess().getLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBoolAccess().getLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1240:3: (enumLiteral_1= 'greater' )
                    {
                    // InternalRobotDSL.g:1240:3: (enumLiteral_1= 'greater' )
                    // InternalRobotDSL.g:1241:4: enumLiteral_1= 'greater'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getBoolAccess().getGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBoolAccess().getGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:1248:3: (enumLiteral_2= 'and' )
                    {
                    // InternalRobotDSL.g:1248:3: (enumLiteral_2= 'and' )
                    // InternalRobotDSL.g:1249:4: enumLiteral_2= 'and'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getBoolAccess().getANDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBoolAccess().getANDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:1256:3: (enumLiteral_3= 'or' )
                    {
                    // InternalRobotDSL.g:1256:3: (enumLiteral_3= 'or' )
                    // InternalRobotDSL.g:1257:4: enumLiteral_3= 'or'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getBoolAccess().getOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBoolAccess().getOREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRobotDSL.g:1264:3: (enumLiteral_4= 'true' )
                    {
                    // InternalRobotDSL.g:1264:3: (enumLiteral_4= 'true' )
                    // InternalRobotDSL.g:1265:4: enumLiteral_4= 'true'
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getBoolAccess().getTRUEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBoolAccess().getTRUEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRobotDSL.g:1272:3: (enumLiteral_5= 'false' )
                    {
                    // InternalRobotDSL.g:1272:3: (enumLiteral_5= 'false' )
                    // InternalRobotDSL.g:1273:4: enumLiteral_5= 'false'
                    {
                    enumLiteral_5=(Token)match(input,68,FOLLOW_2); 

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
    // InternalRobotDSL.g:1283:1: ruleNegation returns [Enumerator current=null] : (enumLiteral_0= 'not' ) ;
    public final Enumerator ruleNegation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1289:2: ( (enumLiteral_0= 'not' ) )
            // InternalRobotDSL.g:1290:2: (enumLiteral_0= 'not' )
            {
            // InternalRobotDSL.g:1290:2: (enumLiteral_0= 'not' )
            // InternalRobotDSL.g:1291:3: enumLiteral_0= 'not'
            {
            enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x80F8000000000010L,0x000000000000003FL});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x80F80000000C0012L,0x000000000000003FL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000002D0800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000002D0800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x80F8000000080010L,0x000000000000003FL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x8000000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x7F00000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000002L});

}