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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Missionset'", "'Missions:'", "'Mission'", "'Flags:'", "'Tasks:'", "'Goal:'", "'Condition:'", "'timeout'", "'Actions:'", "'Task:'", "'priority:'", "'Triggers:'", "'Move'", "'for'", "'milisec'", "'at'", "'speed'", "'Turn'", "'deg'", "'until'", "'Arm'", "'Play'", "'sound'", "'Update'", "'to'", "'is'", "'distance'", "'than'", "'cm'", "'Time:'", "'sec'", "'not'", "'forward'", "'backward'", "'left'", "'right'", "'high'", "'medium'", "'low'", "'raise'", "'lower'", "'buzz'", "'fanfare'", "'Color'", "'LeftLight'", "'RightLight'", "'RearHeight'", "'FrontDistance'", "'LeftTouch'", "'RightTouch'", "'Gyro'", "'red'", "'white'", "'black'", "'green'", "'blue'", "'bright'", "'dark'", "'less'", "'greater'", "'and'", "'or'", "'true'", "'false'"
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
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

                        if ( (LA3_0==RULE_ID||LA3_0==42||(LA3_0>=54 && LA3_0<=61)||(LA3_0>=69 && LA3_0<=74)) ) {
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

                        if ( (LA6_0==23||LA6_0==28||(LA6_0>=31 && LA6_0<=32)||LA6_0==34) ) {
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

                        if ( (LA8_0==RULE_ID||LA8_0==42||(LA8_0>=54 && LA8_0<=61)||(LA8_0>=69 && LA8_0<=74)) ) {
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

                if ( (LA10_0==23||LA10_0==28||(LA10_0>=31 && LA10_0<=32)||LA10_0==34) ) {
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
    // InternalRobotDSL.g:413:1: ruleAction returns [EObject current=null] : ( (otherlv_0= 'Move' ( (lv_moveDir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'milisec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? ) | (otherlv_8= 'Turn' ( (lv_turnDir_9_0= ruleDirection ) ) ( ( ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'until' ( (lv_trig_13_0= ruleTrigger ) )+ ) ) ) | (otherlv_14= 'Arm' ( (lv_op_15_0= ruleArmOp ) ) ) | (otherlv_16= 'Play' otherlv_17= 'sound' ( (lv_sound_18_0= ruleSound ) ) ) | (otherlv_19= 'Update' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'to' ( (lv_bool_22_0= ruleBool ) ) ) ) ;
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
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_moveDir_1_0 = null;

        EObject lv_speed_6_0 = null;

        EObject lv_turnDir_9_0 = null;

        EObject lv_trig_13_0 = null;

        EObject lv_op_15_0 = null;

        EObject lv_sound_18_0 = null;

        EObject lv_bool_22_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:419:2: ( ( (otherlv_0= 'Move' ( (lv_moveDir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'milisec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? ) | (otherlv_8= 'Turn' ( (lv_turnDir_9_0= ruleDirection ) ) ( ( ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'until' ( (lv_trig_13_0= ruleTrigger ) )+ ) ) ) | (otherlv_14= 'Arm' ( (lv_op_15_0= ruleArmOp ) ) ) | (otherlv_16= 'Play' otherlv_17= 'sound' ( (lv_sound_18_0= ruleSound ) ) ) | (otherlv_19= 'Update' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'to' ( (lv_bool_22_0= ruleBool ) ) ) ) )
            // InternalRobotDSL.g:420:2: ( (otherlv_0= 'Move' ( (lv_moveDir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'milisec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? ) | (otherlv_8= 'Turn' ( (lv_turnDir_9_0= ruleDirection ) ) ( ( ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'until' ( (lv_trig_13_0= ruleTrigger ) )+ ) ) ) | (otherlv_14= 'Arm' ( (lv_op_15_0= ruleArmOp ) ) ) | (otherlv_16= 'Play' otherlv_17= 'sound' ( (lv_sound_18_0= ruleSound ) ) ) | (otherlv_19= 'Update' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'to' ( (lv_bool_22_0= ruleBool ) ) ) )
            {
            // InternalRobotDSL.g:420:2: ( (otherlv_0= 'Move' ( (lv_moveDir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'milisec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? ) | (otherlv_8= 'Turn' ( (lv_turnDir_9_0= ruleDirection ) ) ( ( ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'until' ( (lv_trig_13_0= ruleTrigger ) )+ ) ) ) | (otherlv_14= 'Arm' ( (lv_op_15_0= ruleArmOp ) ) ) | (otherlv_16= 'Play' otherlv_17= 'sound' ( (lv_sound_18_0= ruleSound ) ) ) | (otherlv_19= 'Update' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'to' ( (lv_bool_22_0= ruleBool ) ) ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt15=1;
                }
                break;
            case 28:
                {
                alt15=2;
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            case 32:
                {
                alt15=4;
                }
                break;
            case 34:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalRobotDSL.g:421:3: (otherlv_0= 'Move' ( (lv_moveDir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'milisec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? )
                    {
                    // InternalRobotDSL.g:421:3: (otherlv_0= 'Move' ( (lv_moveDir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'milisec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )? )
                    // InternalRobotDSL.g:422:4: otherlv_0= 'Move' ( (lv_moveDir_1_0= ruleDirection ) ) (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'milisec' )? (otherlv_5= 'at' ( (lv_speed_6_0= ruleSpeed ) ) otherlv_7= 'speed' )?
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getActionAccess().getMoveKeyword_0_0());
                    			
                    // InternalRobotDSL.g:426:4: ( (lv_moveDir_1_0= ruleDirection ) )
                    // InternalRobotDSL.g:427:5: (lv_moveDir_1_0= ruleDirection )
                    {
                    // InternalRobotDSL.g:427:5: (lv_moveDir_1_0= ruleDirection )
                    // InternalRobotDSL.g:428:6: lv_moveDir_1_0= ruleDirection
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getMoveDirDirectionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_moveDir_1_0=ruleDirection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"moveDir",
                    							lv_moveDir_1_0,
                    							"des.missionrobot.RobotDSL.Direction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotDSL.g:445:4: (otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'milisec' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==24) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalRobotDSL.g:446:5: otherlv_2= 'for' ( (lv_duration_3_0= RULE_INT ) ) otherlv_4= 'milisec'
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

                            					newLeafNode(otherlv_4, grammarAccess.getActionAccess().getMilisecKeyword_0_2_2());
                            				

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

                            							newCompositeNode(grammarAccess.getActionAccess().getSpeedSpeedParserRuleCall_0_3_1_0());
                            						
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
                    // InternalRobotDSL.g:504:3: (otherlv_8= 'Turn' ( (lv_turnDir_9_0= ruleDirection ) ) ( ( ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'until' ( (lv_trig_13_0= ruleTrigger ) )+ ) ) )
                    {
                    // InternalRobotDSL.g:504:3: (otherlv_8= 'Turn' ( (lv_turnDir_9_0= ruleDirection ) ) ( ( ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'until' ( (lv_trig_13_0= ruleTrigger ) )+ ) ) )
                    // InternalRobotDSL.g:505:4: otherlv_8= 'Turn' ( (lv_turnDir_9_0= ruleDirection ) ) ( ( ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'until' ( (lv_trig_13_0= ruleTrigger ) )+ ) )
                    {
                    otherlv_8=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionAccess().getTurnKeyword_1_0());
                    			
                    // InternalRobotDSL.g:509:4: ( (lv_turnDir_9_0= ruleDirection ) )
                    // InternalRobotDSL.g:510:5: (lv_turnDir_9_0= ruleDirection )
                    {
                    // InternalRobotDSL.g:510:5: (lv_turnDir_9_0= ruleDirection )
                    // InternalRobotDSL.g:511:6: lv_turnDir_9_0= ruleDirection
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getTurnDirDirectionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_turnDir_9_0=ruleDirection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"turnDir",
                    							lv_turnDir_9_0,
                    							"des.missionrobot.RobotDSL.Direction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotDSL.g:528:4: ( ( ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' ) | (otherlv_12= 'until' ( (lv_trig_13_0= ruleTrigger ) )+ ) )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_INT) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==30) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalRobotDSL.g:529:5: ( ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' )
                            {
                            // InternalRobotDSL.g:529:5: ( ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg' )
                            // InternalRobotDSL.g:530:6: ( (lv_degr_10_0= RULE_INT ) ) otherlv_11= 'deg'
                            {
                            // InternalRobotDSL.g:530:6: ( (lv_degr_10_0= RULE_INT ) )
                            // InternalRobotDSL.g:531:7: (lv_degr_10_0= RULE_INT )
                            {
                            // InternalRobotDSL.g:531:7: (lv_degr_10_0= RULE_INT )
                            // InternalRobotDSL.g:532:8: lv_degr_10_0= RULE_INT
                            {
                            lv_degr_10_0=(Token)match(input,RULE_INT,FOLLOW_28); 

                            								newLeafNode(lv_degr_10_0, grammarAccess.getActionAccess().getDegrINTTerminalRuleCall_1_2_0_0_0());
                            							

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

                            						newLeafNode(otherlv_11, grammarAccess.getActionAccess().getDegKeyword_1_2_0_1());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalRobotDSL.g:554:5: (otherlv_12= 'until' ( (lv_trig_13_0= ruleTrigger ) )+ )
                            {
                            // InternalRobotDSL.g:554:5: (otherlv_12= 'until' ( (lv_trig_13_0= ruleTrigger ) )+ )
                            // InternalRobotDSL.g:555:6: otherlv_12= 'until' ( (lv_trig_13_0= ruleTrigger ) )+
                            {
                            otherlv_12=(Token)match(input,30,FOLLOW_11); 

                            						newLeafNode(otherlv_12, grammarAccess.getActionAccess().getUntilKeyword_1_2_1_0());
                            					
                            // InternalRobotDSL.g:559:6: ( (lv_trig_13_0= ruleTrigger ) )+
                            int cnt13=0;
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==RULE_ID||LA13_0==42||(LA13_0>=54 && LA13_0<=61)||(LA13_0>=69 && LA13_0<=74)) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // InternalRobotDSL.g:560:7: (lv_trig_13_0= ruleTrigger )
                            	    {
                            	    // InternalRobotDSL.g:560:7: (lv_trig_13_0= ruleTrigger )
                            	    // InternalRobotDSL.g:561:8: lv_trig_13_0= ruleTrigger
                            	    {

                            	    								newCompositeNode(grammarAccess.getActionAccess().getTrigTriggerParserRuleCall_1_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_29);
                            	    lv_trig_13_0=ruleTrigger();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getActionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"trig",
                            	    									lv_trig_13_0,
                            	    									"des.missionrobot.RobotDSL.Trigger");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt13 >= 1 ) break loop13;
                                        EarlyExitException eee =
                                            new EarlyExitException(13, input);
                                        throw eee;
                                }
                                cnt13++;
                            } while (true);


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:582:3: (otherlv_14= 'Arm' ( (lv_op_15_0= ruleArmOp ) ) )
                    {
                    // InternalRobotDSL.g:582:3: (otherlv_14= 'Arm' ( (lv_op_15_0= ruleArmOp ) ) )
                    // InternalRobotDSL.g:583:4: otherlv_14= 'Arm' ( (lv_op_15_0= ruleArmOp ) )
                    {
                    otherlv_14=(Token)match(input,31,FOLLOW_30); 

                    				newLeafNode(otherlv_14, grammarAccess.getActionAccess().getArmKeyword_2_0());
                    			
                    // InternalRobotDSL.g:587:4: ( (lv_op_15_0= ruleArmOp ) )
                    // InternalRobotDSL.g:588:5: (lv_op_15_0= ruleArmOp )
                    {
                    // InternalRobotDSL.g:588:5: (lv_op_15_0= ruleArmOp )
                    // InternalRobotDSL.g:589:6: lv_op_15_0= ruleArmOp
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getOpArmOpParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_op_15_0=ruleArmOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_15_0,
                    							"des.missionrobot.RobotDSL.ArmOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:608:3: (otherlv_16= 'Play' otherlv_17= 'sound' ( (lv_sound_18_0= ruleSound ) ) )
                    {
                    // InternalRobotDSL.g:608:3: (otherlv_16= 'Play' otherlv_17= 'sound' ( (lv_sound_18_0= ruleSound ) ) )
                    // InternalRobotDSL.g:609:4: otherlv_16= 'Play' otherlv_17= 'sound' ( (lv_sound_18_0= ruleSound ) )
                    {
                    otherlv_16=(Token)match(input,32,FOLLOW_31); 

                    				newLeafNode(otherlv_16, grammarAccess.getActionAccess().getPlayKeyword_3_0());
                    			
                    otherlv_17=(Token)match(input,33,FOLLOW_32); 

                    				newLeafNode(otherlv_17, grammarAccess.getActionAccess().getSoundKeyword_3_1());
                    			
                    // InternalRobotDSL.g:617:4: ( (lv_sound_18_0= ruleSound ) )
                    // InternalRobotDSL.g:618:5: (lv_sound_18_0= ruleSound )
                    {
                    // InternalRobotDSL.g:618:5: (lv_sound_18_0= ruleSound )
                    // InternalRobotDSL.g:619:6: lv_sound_18_0= ruleSound
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getSoundSoundParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sound_18_0=ruleSound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"sound",
                    							lv_sound_18_0,
                    							"des.missionrobot.RobotDSL.Sound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalRobotDSL.g:638:3: (otherlv_19= 'Update' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'to' ( (lv_bool_22_0= ruleBool ) ) )
                    {
                    // InternalRobotDSL.g:638:3: (otherlv_19= 'Update' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'to' ( (lv_bool_22_0= ruleBool ) ) )
                    // InternalRobotDSL.g:639:4: otherlv_19= 'Update' ( (otherlv_20= RULE_ID ) ) otherlv_21= 'to' ( (lv_bool_22_0= ruleBool ) )
                    {
                    otherlv_19=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getActionAccess().getUpdateKeyword_4_0());
                    			
                    // InternalRobotDSL.g:643:4: ( (otherlv_20= RULE_ID ) )
                    // InternalRobotDSL.g:644:5: (otherlv_20= RULE_ID )
                    {
                    // InternalRobotDSL.g:644:5: (otherlv_20= RULE_ID )
                    // InternalRobotDSL.g:645:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						newLeafNode(otherlv_20, grammarAccess.getActionAccess().getFlagFlagCrossReference_4_1_0());
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,35,FOLLOW_34); 

                    				newLeafNode(otherlv_21, grammarAccess.getActionAccess().getToKeyword_4_2());
                    			
                    // InternalRobotDSL.g:660:4: ( (lv_bool_22_0= ruleBool ) )
                    // InternalRobotDSL.g:661:5: (lv_bool_22_0= ruleBool )
                    {
                    // InternalRobotDSL.g:661:5: (lv_bool_22_0= ruleBool )
                    // InternalRobotDSL.g:662:6: lv_bool_22_0= ruleBool
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getBoolBoolParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_bool_22_0=ruleBool();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"bool",
                    							lv_bool_22_0,
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
    // InternalRobotDSL.g:684:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalRobotDSL.g:684:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalRobotDSL.g:685:2: iv_ruleTrigger= ruleTrigger EOF
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
    // InternalRobotDSL.g:691:1: ruleTrigger returns [EObject current=null] : ( ( (lv_boolType_0_0= ruleBool ) )? ( ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) ) ) ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_boolType_0_0 = null;

        EObject lv_neg_1_0 = null;

        EObject lv_sensor_3_0 = null;

        EObject lv_color_5_0 = null;

        EObject lv_dist_7_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:697:2: ( ( ( (lv_boolType_0_0= ruleBool ) )? ( ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) ) ) ) ) )
            // InternalRobotDSL.g:698:2: ( ( (lv_boolType_0_0= ruleBool ) )? ( ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) ) ) ) )
            {
            // InternalRobotDSL.g:698:2: ( ( (lv_boolType_0_0= ruleBool ) )? ( ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) ) ) ) )
            // InternalRobotDSL.g:699:3: ( (lv_boolType_0_0= ruleBool ) )? ( ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) ) ) )
            {
            // InternalRobotDSL.g:699:3: ( (lv_boolType_0_0= ruleBool ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=69 && LA16_0<=74)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRobotDSL.g:700:4: (lv_boolType_0_0= ruleBool )
                    {
                    // InternalRobotDSL.g:700:4: (lv_boolType_0_0= ruleBool )
                    // InternalRobotDSL.g:701:5: lv_boolType_0_0= ruleBool
                    {

                    					newCompositeNode(grammarAccess.getTriggerAccess().getBoolTypeBoolParserRuleCall_0_0());
                    				
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

            // InternalRobotDSL.g:718:3: ( ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) ) | ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==42) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=54 && LA19_0<=61)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalRobotDSL.g:719:4: ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalRobotDSL.g:719:4: ( ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) ) )
                    // InternalRobotDSL.g:720:5: ( (lv_neg_1_0= ruleNegation ) )? ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalRobotDSL.g:720:5: ( (lv_neg_1_0= ruleNegation ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==42) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalRobotDSL.g:721:6: (lv_neg_1_0= ruleNegation )
                            {
                            // InternalRobotDSL.g:721:6: (lv_neg_1_0= ruleNegation )
                            // InternalRobotDSL.g:722:7: lv_neg_1_0= ruleNegation
                            {

                            							newCompositeNode(grammarAccess.getTriggerAccess().getNegNegationParserRuleCall_1_0_0_0());
                            						
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

                    // InternalRobotDSL.g:739:5: ( (otherlv_2= RULE_ID ) )
                    // InternalRobotDSL.g:740:6: (otherlv_2= RULE_ID )
                    {
                    // InternalRobotDSL.g:740:6: (otherlv_2= RULE_ID )
                    // InternalRobotDSL.g:741:7: otherlv_2= RULE_ID
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
                    // InternalRobotDSL.g:754:4: ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) ) )
                    {
                    // InternalRobotDSL.g:754:4: ( ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) ) )
                    // InternalRobotDSL.g:755:5: ( (lv_sensor_3_0= ruleSensor ) ) ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) )
                    {
                    // InternalRobotDSL.g:755:5: ( (lv_sensor_3_0= ruleSensor ) )
                    // InternalRobotDSL.g:756:6: (lv_sensor_3_0= ruleSensor )
                    {
                    // InternalRobotDSL.g:756:6: (lv_sensor_3_0= ruleSensor )
                    // InternalRobotDSL.g:757:7: lv_sensor_3_0= ruleSensor
                    {

                    							newCompositeNode(grammarAccess.getTriggerAccess().getSensorSensorParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_35);
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

                    // InternalRobotDSL.g:774:5: ( (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) ) | (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==36) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==37) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalRobotDSL.g:775:6: (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) )
                            {
                            // InternalRobotDSL.g:775:6: (otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) ) )
                            // InternalRobotDSL.g:776:7: otherlv_4= 'is' ( (lv_color_5_0= ruleColor ) )
                            {
                            otherlv_4=(Token)match(input,36,FOLLOW_36); 

                            							newLeafNode(otherlv_4, grammarAccess.getTriggerAccess().getIsKeyword_1_1_1_0_0());
                            						
                            // InternalRobotDSL.g:780:7: ( (lv_color_5_0= ruleColor ) )
                            // InternalRobotDSL.g:781:8: (lv_color_5_0= ruleColor )
                            {
                            // InternalRobotDSL.g:781:8: (lv_color_5_0= ruleColor )
                            // InternalRobotDSL.g:782:9: lv_color_5_0= ruleColor
                            {

                            									newCompositeNode(grammarAccess.getTriggerAccess().getColorColorParserRuleCall_1_1_1_0_1_0());
                            								
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
                            // InternalRobotDSL.g:801:6: (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) )
                            {
                            // InternalRobotDSL.g:801:6: (otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) ) )
                            // InternalRobotDSL.g:802:7: otherlv_6= 'distance' ( (lv_dist_7_0= ruleDistance ) )
                            {
                            otherlv_6=(Token)match(input,37,FOLLOW_34); 

                            							newLeafNode(otherlv_6, grammarAccess.getTriggerAccess().getDistanceKeyword_1_1_1_1_0());
                            						
                            // InternalRobotDSL.g:806:7: ( (lv_dist_7_0= ruleDistance ) )
                            // InternalRobotDSL.g:807:8: (lv_dist_7_0= ruleDistance )
                            {
                            // InternalRobotDSL.g:807:8: (lv_dist_7_0= ruleDistance )
                            // InternalRobotDSL.g:808:9: lv_dist_7_0= ruleDistance
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
    // InternalRobotDSL.g:833:1: entryRuleDistance returns [EObject current=null] : iv_ruleDistance= ruleDistance EOF ;
    public final EObject entryRuleDistance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistance = null;


        try {
            // InternalRobotDSL.g:833:49: (iv_ruleDistance= ruleDistance EOF )
            // InternalRobotDSL.g:834:2: iv_ruleDistance= ruleDistance EOF
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
    // InternalRobotDSL.g:840:1: ruleDistance returns [EObject current=null] : ( ( (lv_rangeBool_0_0= ruleBool ) ) otherlv_1= 'than' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm' ) ;
    public final EObject ruleDistance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_distance_2_0=null;
        Token otherlv_3=null;
        EObject lv_rangeBool_0_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:846:2: ( ( ( (lv_rangeBool_0_0= ruleBool ) ) otherlv_1= 'than' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm' ) )
            // InternalRobotDSL.g:847:2: ( ( (lv_rangeBool_0_0= ruleBool ) ) otherlv_1= 'than' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm' )
            {
            // InternalRobotDSL.g:847:2: ( ( (lv_rangeBool_0_0= ruleBool ) ) otherlv_1= 'than' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm' )
            // InternalRobotDSL.g:848:3: ( (lv_rangeBool_0_0= ruleBool ) ) otherlv_1= 'than' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm'
            {
            // InternalRobotDSL.g:848:3: ( (lv_rangeBool_0_0= ruleBool ) )
            // InternalRobotDSL.g:849:4: (lv_rangeBool_0_0= ruleBool )
            {
            // InternalRobotDSL.g:849:4: (lv_rangeBool_0_0= ruleBool )
            // InternalRobotDSL.g:850:5: lv_rangeBool_0_0= ruleBool
            {

            					newCompositeNode(grammarAccess.getDistanceAccess().getRangeBoolBoolParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_37);
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

            otherlv_1=(Token)match(input,38,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getDistanceAccess().getThanKeyword_1());
            		
            // InternalRobotDSL.g:871:3: ( (lv_distance_2_0= RULE_INT ) )
            // InternalRobotDSL.g:872:4: (lv_distance_2_0= RULE_INT )
            {
            // InternalRobotDSL.g:872:4: (lv_distance_2_0= RULE_INT )
            // InternalRobotDSL.g:873:5: lv_distance_2_0= RULE_INT
            {
            lv_distance_2_0=(Token)match(input,RULE_INT,FOLLOW_38); 

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

            otherlv_3=(Token)match(input,39,FOLLOW_2); 

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
    // InternalRobotDSL.g:897:1: entryRuleFlag returns [EObject current=null] : iv_ruleFlag= ruleFlag EOF ;
    public final EObject entryRuleFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlag = null;


        try {
            // InternalRobotDSL.g:897:45: (iv_ruleFlag= ruleFlag EOF )
            // InternalRobotDSL.g:898:2: iv_ruleFlag= ruleFlag EOF
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
    // InternalRobotDSL.g:904:1: ruleFlag returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) ) )? ) ;
    public final EObject ruleFlag() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_bool_2_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:910:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) ) )? ) )
            // InternalRobotDSL.g:911:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) ) )? )
            {
            // InternalRobotDSL.g:911:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) ) )? )
            // InternalRobotDSL.g:912:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) ) )?
            {
            // InternalRobotDSL.g:912:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRobotDSL.g:913:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRobotDSL.g:913:4: (lv_name_0_0= RULE_ID )
            // InternalRobotDSL.g:914:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_39); 

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

            // InternalRobotDSL.g:930:3: (otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRobotDSL.g:931:4: otherlv_1= 'is' ( (lv_bool_2_0= ruleBool ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_34); 

                    				newLeafNode(otherlv_1, grammarAccess.getFlagAccess().getIsKeyword_1_0());
                    			
                    // InternalRobotDSL.g:935:4: ( (lv_bool_2_0= ruleBool ) )
                    // InternalRobotDSL.g:936:5: (lv_bool_2_0= ruleBool )
                    {
                    // InternalRobotDSL.g:936:5: (lv_bool_2_0= ruleBool )
                    // InternalRobotDSL.g:937:6: lv_bool_2_0= ruleBool
                    {

                    						newCompositeNode(grammarAccess.getFlagAccess().getBoolBoolParserRuleCall_1_1_0());
                    					
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
    // InternalRobotDSL.g:959:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalRobotDSL.g:959:45: (iv_ruleTime= ruleTime EOF )
            // InternalRobotDSL.g:960:2: iv_ruleTime= ruleTime EOF
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
    // InternalRobotDSL.g:966:1: ruleTime returns [EObject current=null] : (otherlv_0= 'Time:' ( (lv_sec_1_0= RULE_INT ) ) otherlv_2= 'sec' ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sec_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:972:2: ( (otherlv_0= 'Time:' ( (lv_sec_1_0= RULE_INT ) ) otherlv_2= 'sec' ) )
            // InternalRobotDSL.g:973:2: (otherlv_0= 'Time:' ( (lv_sec_1_0= RULE_INT ) ) otherlv_2= 'sec' )
            {
            // InternalRobotDSL.g:973:2: (otherlv_0= 'Time:' ( (lv_sec_1_0= RULE_INT ) ) otherlv_2= 'sec' )
            // InternalRobotDSL.g:974:3: otherlv_0= 'Time:' ( (lv_sec_1_0= RULE_INT ) ) otherlv_2= 'sec'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeAccess().getTimeKeyword_0());
            		
            // InternalRobotDSL.g:978:3: ( (lv_sec_1_0= RULE_INT ) )
            // InternalRobotDSL.g:979:4: (lv_sec_1_0= RULE_INT )
            {
            // InternalRobotDSL.g:979:4: (lv_sec_1_0= RULE_INT )
            // InternalRobotDSL.g:980:5: lv_sec_1_0= RULE_INT
            {
            lv_sec_1_0=(Token)match(input,RULE_INT,FOLLOW_40); 

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

            otherlv_2=(Token)match(input,41,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDirection"
    // InternalRobotDSL.g:1004:1: entryRuleDirection returns [EObject current=null] : iv_ruleDirection= ruleDirection EOF ;
    public final EObject entryRuleDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirection = null;


        try {
            // InternalRobotDSL.g:1004:50: (iv_ruleDirection= ruleDirection EOF )
            // InternalRobotDSL.g:1005:2: iv_ruleDirection= ruleDirection EOF
            {
             newCompositeNode(grammarAccess.getDirectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirection=ruleDirection();

            state._fsp--;

             current =iv_ruleDirection; 
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
    // $ANTLR end "entryRuleDirection"


    // $ANTLR start "ruleDirection"
    // InternalRobotDSL.g:1011:1: ruleDirection returns [EObject current=null] : ( (lv_dir_0_0= ruleDirectionVal ) ) ;
    public final EObject ruleDirection() throws RecognitionException {
        EObject current = null;

        Enumerator lv_dir_0_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:1017:2: ( ( (lv_dir_0_0= ruleDirectionVal ) ) )
            // InternalRobotDSL.g:1018:2: ( (lv_dir_0_0= ruleDirectionVal ) )
            {
            // InternalRobotDSL.g:1018:2: ( (lv_dir_0_0= ruleDirectionVal ) )
            // InternalRobotDSL.g:1019:3: (lv_dir_0_0= ruleDirectionVal )
            {
            // InternalRobotDSL.g:1019:3: (lv_dir_0_0= ruleDirectionVal )
            // InternalRobotDSL.g:1020:4: lv_dir_0_0= ruleDirectionVal
            {

            				newCompositeNode(grammarAccess.getDirectionAccess().getDirDirectionValEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_dir_0_0=ruleDirectionVal();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDirectionRule());
            				}
            				set(
            					current,
            					"dir",
            					lv_dir_0_0,
            					"des.missionrobot.RobotDSL.DirectionVal");
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
    // $ANTLR end "ruleDirection"


    // $ANTLR start "entryRuleSpeed"
    // InternalRobotDSL.g:1040:1: entryRuleSpeed returns [EObject current=null] : iv_ruleSpeed= ruleSpeed EOF ;
    public final EObject entryRuleSpeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeed = null;


        try {
            // InternalRobotDSL.g:1040:46: (iv_ruleSpeed= ruleSpeed EOF )
            // InternalRobotDSL.g:1041:2: iv_ruleSpeed= ruleSpeed EOF
            {
             newCompositeNode(grammarAccess.getSpeedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpeed=ruleSpeed();

            state._fsp--;

             current =iv_ruleSpeed; 
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
    // $ANTLR end "entryRuleSpeed"


    // $ANTLR start "ruleSpeed"
    // InternalRobotDSL.g:1047:1: ruleSpeed returns [EObject current=null] : ( (lv_speed_0_0= ruleSpeedVal ) ) ;
    public final EObject ruleSpeed() throws RecognitionException {
        EObject current = null;

        Enumerator lv_speed_0_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:1053:2: ( ( (lv_speed_0_0= ruleSpeedVal ) ) )
            // InternalRobotDSL.g:1054:2: ( (lv_speed_0_0= ruleSpeedVal ) )
            {
            // InternalRobotDSL.g:1054:2: ( (lv_speed_0_0= ruleSpeedVal ) )
            // InternalRobotDSL.g:1055:3: (lv_speed_0_0= ruleSpeedVal )
            {
            // InternalRobotDSL.g:1055:3: (lv_speed_0_0= ruleSpeedVal )
            // InternalRobotDSL.g:1056:4: lv_speed_0_0= ruleSpeedVal
            {

            				newCompositeNode(grammarAccess.getSpeedAccess().getSpeedSpeedValEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_speed_0_0=ruleSpeedVal();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSpeedRule());
            				}
            				set(
            					current,
            					"speed",
            					lv_speed_0_0,
            					"des.missionrobot.RobotDSL.SpeedVal");
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
    // $ANTLR end "ruleSpeed"


    // $ANTLR start "entryRuleArmOp"
    // InternalRobotDSL.g:1076:1: entryRuleArmOp returns [EObject current=null] : iv_ruleArmOp= ruleArmOp EOF ;
    public final EObject entryRuleArmOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArmOp = null;


        try {
            // InternalRobotDSL.g:1076:46: (iv_ruleArmOp= ruleArmOp EOF )
            // InternalRobotDSL.g:1077:2: iv_ruleArmOp= ruleArmOp EOF
            {
             newCompositeNode(grammarAccess.getArmOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArmOp=ruleArmOp();

            state._fsp--;

             current =iv_ruleArmOp; 
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
    // $ANTLR end "entryRuleArmOp"


    // $ANTLR start "ruleArmOp"
    // InternalRobotDSL.g:1083:1: ruleArmOp returns [EObject current=null] : ( (lv_opType_0_0= ruleArmOpType ) ) ;
    public final EObject ruleArmOp() throws RecognitionException {
        EObject current = null;

        Enumerator lv_opType_0_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:1089:2: ( ( (lv_opType_0_0= ruleArmOpType ) ) )
            // InternalRobotDSL.g:1090:2: ( (lv_opType_0_0= ruleArmOpType ) )
            {
            // InternalRobotDSL.g:1090:2: ( (lv_opType_0_0= ruleArmOpType ) )
            // InternalRobotDSL.g:1091:3: (lv_opType_0_0= ruleArmOpType )
            {
            // InternalRobotDSL.g:1091:3: (lv_opType_0_0= ruleArmOpType )
            // InternalRobotDSL.g:1092:4: lv_opType_0_0= ruleArmOpType
            {

            				newCompositeNode(grammarAccess.getArmOpAccess().getOpTypeArmOpTypeEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_opType_0_0=ruleArmOpType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getArmOpRule());
            				}
            				set(
            					current,
            					"opType",
            					lv_opType_0_0,
            					"des.missionrobot.RobotDSL.ArmOpType");
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
    // $ANTLR end "ruleArmOp"


    // $ANTLR start "entryRuleSound"
    // InternalRobotDSL.g:1112:1: entryRuleSound returns [EObject current=null] : iv_ruleSound= ruleSound EOF ;
    public final EObject entryRuleSound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSound = null;


        try {
            // InternalRobotDSL.g:1112:46: (iv_ruleSound= ruleSound EOF )
            // InternalRobotDSL.g:1113:2: iv_ruleSound= ruleSound EOF
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
    // InternalRobotDSL.g:1119:1: ruleSound returns [EObject current=null] : ( (lv_soundName_0_0= ruleSoundName ) ) ;
    public final EObject ruleSound() throws RecognitionException {
        EObject current = null;

        Enumerator lv_soundName_0_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:1125:2: ( ( (lv_soundName_0_0= ruleSoundName ) ) )
            // InternalRobotDSL.g:1126:2: ( (lv_soundName_0_0= ruleSoundName ) )
            {
            // InternalRobotDSL.g:1126:2: ( (lv_soundName_0_0= ruleSoundName ) )
            // InternalRobotDSL.g:1127:3: (lv_soundName_0_0= ruleSoundName )
            {
            // InternalRobotDSL.g:1127:3: (lv_soundName_0_0= ruleSoundName )
            // InternalRobotDSL.g:1128:4: lv_soundName_0_0= ruleSoundName
            {

            				newCompositeNode(grammarAccess.getSoundAccess().getSoundNameSoundNameEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_soundName_0_0=ruleSoundName();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSoundRule());
            				}
            				set(
            					current,
            					"soundName",
            					lv_soundName_0_0,
            					"des.missionrobot.RobotDSL.SoundName");
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
    // $ANTLR end "ruleSound"


    // $ANTLR start "entryRuleSensor"
    // InternalRobotDSL.g:1148:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalRobotDSL.g:1148:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalRobotDSL.g:1149:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalRobotDSL.g:1155:1: ruleSensor returns [EObject current=null] : ( (lv_sensorType_0_0= ruleSensorType ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Enumerator lv_sensorType_0_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:1161:2: ( ( (lv_sensorType_0_0= ruleSensorType ) ) )
            // InternalRobotDSL.g:1162:2: ( (lv_sensorType_0_0= ruleSensorType ) )
            {
            // InternalRobotDSL.g:1162:2: ( (lv_sensorType_0_0= ruleSensorType ) )
            // InternalRobotDSL.g:1163:3: (lv_sensorType_0_0= ruleSensorType )
            {
            // InternalRobotDSL.g:1163:3: (lv_sensorType_0_0= ruleSensorType )
            // InternalRobotDSL.g:1164:4: lv_sensorType_0_0= ruleSensorType
            {

            				newCompositeNode(grammarAccess.getSensorAccess().getSensorTypeSensorTypeEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_sensorType_0_0=ruleSensorType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSensorRule());
            				}
            				set(
            					current,
            					"sensorType",
            					lv_sensorType_0_0,
            					"des.missionrobot.RobotDSL.SensorType");
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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleColor"
    // InternalRobotDSL.g:1184:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalRobotDSL.g:1184:46: (iv_ruleColor= ruleColor EOF )
            // InternalRobotDSL.g:1185:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalRobotDSL.g:1191:1: ruleColor returns [EObject current=null] : ( (lv_colorName_0_0= ruleColorName ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Enumerator lv_colorName_0_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:1197:2: ( ( (lv_colorName_0_0= ruleColorName ) ) )
            // InternalRobotDSL.g:1198:2: ( (lv_colorName_0_0= ruleColorName ) )
            {
            // InternalRobotDSL.g:1198:2: ( (lv_colorName_0_0= ruleColorName ) )
            // InternalRobotDSL.g:1199:3: (lv_colorName_0_0= ruleColorName )
            {
            // InternalRobotDSL.g:1199:3: (lv_colorName_0_0= ruleColorName )
            // InternalRobotDSL.g:1200:4: lv_colorName_0_0= ruleColorName
            {

            				newCompositeNode(grammarAccess.getColorAccess().getColorNameColorNameEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_colorName_0_0=ruleColorName();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getColorRule());
            				}
            				set(
            					current,
            					"colorName",
            					lv_colorName_0_0,
            					"des.missionrobot.RobotDSL.ColorName");
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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleBool"
    // InternalRobotDSL.g:1220:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // InternalRobotDSL.g:1220:45: (iv_ruleBool= ruleBool EOF )
            // InternalRobotDSL.g:1221:2: iv_ruleBool= ruleBool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBool=ruleBool();

            state._fsp--;

             current =iv_ruleBool; 
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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // InternalRobotDSL.g:1227:1: ruleBool returns [EObject current=null] : ( (lv_boolType_0_0= ruleBoolType ) ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Enumerator lv_boolType_0_0 = null;



        	enterRule();

        try {
            // InternalRobotDSL.g:1233:2: ( ( (lv_boolType_0_0= ruleBoolType ) ) )
            // InternalRobotDSL.g:1234:2: ( (lv_boolType_0_0= ruleBoolType ) )
            {
            // InternalRobotDSL.g:1234:2: ( (lv_boolType_0_0= ruleBoolType ) )
            // InternalRobotDSL.g:1235:3: (lv_boolType_0_0= ruleBoolType )
            {
            // InternalRobotDSL.g:1235:3: (lv_boolType_0_0= ruleBoolType )
            // InternalRobotDSL.g:1236:4: lv_boolType_0_0= ruleBoolType
            {

            				newCompositeNode(grammarAccess.getBoolAccess().getBoolTypeBoolTypeEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_boolType_0_0=ruleBoolType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBoolRule());
            				}
            				set(
            					current,
            					"boolType",
            					lv_boolType_0_0,
            					"des.missionrobot.RobotDSL.BoolType");
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
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleNegation"
    // InternalRobotDSL.g:1256:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalRobotDSL.g:1256:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalRobotDSL.g:1257:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalRobotDSL.g:1263:1: ruleNegation returns [EObject current=null] : ( (lv_NOT_0_0= 'not' ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token lv_NOT_0_0=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1269:2: ( ( (lv_NOT_0_0= 'not' ) ) )
            // InternalRobotDSL.g:1270:2: ( (lv_NOT_0_0= 'not' ) )
            {
            // InternalRobotDSL.g:1270:2: ( (lv_NOT_0_0= 'not' ) )
            // InternalRobotDSL.g:1271:3: (lv_NOT_0_0= 'not' )
            {
            // InternalRobotDSL.g:1271:3: (lv_NOT_0_0= 'not' )
            // InternalRobotDSL.g:1272:4: lv_NOT_0_0= 'not'
            {
            lv_NOT_0_0=(Token)match(input,42,FOLLOW_2); 

            				newLeafNode(lv_NOT_0_0, grammarAccess.getNegationAccess().getNOTNotKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNegationRule());
            				}
            				setWithLastConsumed(current, "NOT", lv_NOT_0_0, "not");
            			

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
    // $ANTLR end "ruleNegation"


    // $ANTLR start "ruleDirectionVal"
    // InternalRobotDSL.g:1287:1: ruleDirectionVal returns [Enumerator current=null] : ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) ) ;
    public final Enumerator ruleDirectionVal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1293:2: ( ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) ) )
            // InternalRobotDSL.g:1294:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) )
            {
            // InternalRobotDSL.g:1294:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt21=1;
                }
                break;
            case 44:
                {
                alt21=2;
                }
                break;
            case 45:
                {
                alt21=3;
                }
                break;
            case 46:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalRobotDSL.g:1295:3: (enumLiteral_0= 'forward' )
                    {
                    // InternalRobotDSL.g:1295:3: (enumLiteral_0= 'forward' )
                    // InternalRobotDSL.g:1296:4: enumLiteral_0= 'forward'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDirectionValAccess().getFORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionValAccess().getFORWARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1303:3: (enumLiteral_1= 'backward' )
                    {
                    // InternalRobotDSL.g:1303:3: (enumLiteral_1= 'backward' )
                    // InternalRobotDSL.g:1304:4: enumLiteral_1= 'backward'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDirectionValAccess().getBACKWARDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionValAccess().getBACKWARDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:1311:3: (enumLiteral_2= 'left' )
                    {
                    // InternalRobotDSL.g:1311:3: (enumLiteral_2= 'left' )
                    // InternalRobotDSL.g:1312:4: enumLiteral_2= 'left'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getDirectionValAccess().getLEFTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionValAccess().getLEFTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:1319:3: (enumLiteral_3= 'right' )
                    {
                    // InternalRobotDSL.g:1319:3: (enumLiteral_3= 'right' )
                    // InternalRobotDSL.g:1320:4: enumLiteral_3= 'right'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getDirectionValAccess().getRIGHTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectionValAccess().getRIGHTEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleDirectionVal"


    // $ANTLR start "ruleSpeedVal"
    // InternalRobotDSL.g:1330:1: ruleSpeedVal returns [Enumerator current=null] : ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'low' ) ) ;
    public final Enumerator ruleSpeedVal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1336:2: ( ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'low' ) ) )
            // InternalRobotDSL.g:1337:2: ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'low' ) )
            {
            // InternalRobotDSL.g:1337:2: ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'medium' ) | (enumLiteral_2= 'low' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt22=1;
                }
                break;
            case 48:
                {
                alt22=2;
                }
                break;
            case 49:
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
                    // InternalRobotDSL.g:1338:3: (enumLiteral_0= 'high' )
                    {
                    // InternalRobotDSL.g:1338:3: (enumLiteral_0= 'high' )
                    // InternalRobotDSL.g:1339:4: enumLiteral_0= 'high'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getSpeedValAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSpeedValAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1346:3: (enumLiteral_1= 'medium' )
                    {
                    // InternalRobotDSL.g:1346:3: (enumLiteral_1= 'medium' )
                    // InternalRobotDSL.g:1347:4: enumLiteral_1= 'medium'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getSpeedValAccess().getMEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSpeedValAccess().getMEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:1354:3: (enumLiteral_2= 'low' )
                    {
                    // InternalRobotDSL.g:1354:3: (enumLiteral_2= 'low' )
                    // InternalRobotDSL.g:1355:4: enumLiteral_2= 'low'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getSpeedValAccess().getLOWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSpeedValAccess().getLOWEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleSpeedVal"


    // $ANTLR start "ruleArmOpType"
    // InternalRobotDSL.g:1365:1: ruleArmOpType returns [Enumerator current=null] : ( (enumLiteral_0= 'raise' ) | (enumLiteral_1= 'lower' ) ) ;
    public final Enumerator ruleArmOpType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1371:2: ( ( (enumLiteral_0= 'raise' ) | (enumLiteral_1= 'lower' ) ) )
            // InternalRobotDSL.g:1372:2: ( (enumLiteral_0= 'raise' ) | (enumLiteral_1= 'lower' ) )
            {
            // InternalRobotDSL.g:1372:2: ( (enumLiteral_0= 'raise' ) | (enumLiteral_1= 'lower' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==50) ) {
                alt23=1;
            }
            else if ( (LA23_0==51) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalRobotDSL.g:1373:3: (enumLiteral_0= 'raise' )
                    {
                    // InternalRobotDSL.g:1373:3: (enumLiteral_0= 'raise' )
                    // InternalRobotDSL.g:1374:4: enumLiteral_0= 'raise'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getArmOpTypeAccess().getUPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getArmOpTypeAccess().getUPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1381:3: (enumLiteral_1= 'lower' )
                    {
                    // InternalRobotDSL.g:1381:3: (enumLiteral_1= 'lower' )
                    // InternalRobotDSL.g:1382:4: enumLiteral_1= 'lower'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getArmOpTypeAccess().getDOWNEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getArmOpTypeAccess().getDOWNEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleArmOpType"


    // $ANTLR start "ruleSoundName"
    // InternalRobotDSL.g:1392:1: ruleSoundName returns [Enumerator current=null] : ( (enumLiteral_0= 'buzz' ) | (enumLiteral_1= 'fanfare' ) ) ;
    public final Enumerator ruleSoundName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1398:2: ( ( (enumLiteral_0= 'buzz' ) | (enumLiteral_1= 'fanfare' ) ) )
            // InternalRobotDSL.g:1399:2: ( (enumLiteral_0= 'buzz' ) | (enumLiteral_1= 'fanfare' ) )
            {
            // InternalRobotDSL.g:1399:2: ( (enumLiteral_0= 'buzz' ) | (enumLiteral_1= 'fanfare' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==52) ) {
                alt24=1;
            }
            else if ( (LA24_0==53) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalRobotDSL.g:1400:3: (enumLiteral_0= 'buzz' )
                    {
                    // InternalRobotDSL.g:1400:3: (enumLiteral_0= 'buzz' )
                    // InternalRobotDSL.g:1401:4: enumLiteral_0= 'buzz'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getSoundNameAccess().getBUZZEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSoundNameAccess().getBUZZEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1408:3: (enumLiteral_1= 'fanfare' )
                    {
                    // InternalRobotDSL.g:1408:3: (enumLiteral_1= 'fanfare' )
                    // InternalRobotDSL.g:1409:4: enumLiteral_1= 'fanfare'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getSoundNameAccess().getFANFAREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSoundNameAccess().getFANFAREEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSoundName"


    // $ANTLR start "ruleSensorType"
    // InternalRobotDSL.g:1419:1: ruleSensorType returns [Enumerator current=null] : ( (enumLiteral_0= 'Color' ) | (enumLiteral_1= 'LeftLight' ) | (enumLiteral_2= 'RightLight' ) | (enumLiteral_3= 'RearHeight' ) | (enumLiteral_4= 'FrontDistance' ) | (enumLiteral_5= 'LeftTouch' ) | (enumLiteral_6= 'RightTouch' ) | (enumLiteral_7= 'Gyro' ) ) ;
    public final Enumerator ruleSensorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1425:2: ( ( (enumLiteral_0= 'Color' ) | (enumLiteral_1= 'LeftLight' ) | (enumLiteral_2= 'RightLight' ) | (enumLiteral_3= 'RearHeight' ) | (enumLiteral_4= 'FrontDistance' ) | (enumLiteral_5= 'LeftTouch' ) | (enumLiteral_6= 'RightTouch' ) | (enumLiteral_7= 'Gyro' ) ) )
            // InternalRobotDSL.g:1426:2: ( (enumLiteral_0= 'Color' ) | (enumLiteral_1= 'LeftLight' ) | (enumLiteral_2= 'RightLight' ) | (enumLiteral_3= 'RearHeight' ) | (enumLiteral_4= 'FrontDistance' ) | (enumLiteral_5= 'LeftTouch' ) | (enumLiteral_6= 'RightTouch' ) | (enumLiteral_7= 'Gyro' ) )
            {
            // InternalRobotDSL.g:1426:2: ( (enumLiteral_0= 'Color' ) | (enumLiteral_1= 'LeftLight' ) | (enumLiteral_2= 'RightLight' ) | (enumLiteral_3= 'RearHeight' ) | (enumLiteral_4= 'FrontDistance' ) | (enumLiteral_5= 'LeftTouch' ) | (enumLiteral_6= 'RightTouch' ) | (enumLiteral_7= 'Gyro' ) )
            int alt25=8;
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
            case 59:
                {
                alt25=6;
                }
                break;
            case 60:
                {
                alt25=7;
                }
                break;
            case 61:
                {
                alt25=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalRobotDSL.g:1427:3: (enumLiteral_0= 'Color' )
                    {
                    // InternalRobotDSL.g:1427:3: (enumLiteral_0= 'Color' )
                    // InternalRobotDSL.g:1428:4: enumLiteral_0= 'Color'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getCOLOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSensorTypeAccess().getCOLOREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1435:3: (enumLiteral_1= 'LeftLight' )
                    {
                    // InternalRobotDSL.g:1435:3: (enumLiteral_1= 'LeftLight' )
                    // InternalRobotDSL.g:1436:4: enumLiteral_1= 'LeftLight'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getLEFTLIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSensorTypeAccess().getLEFTLIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:1443:3: (enumLiteral_2= 'RightLight' )
                    {
                    // InternalRobotDSL.g:1443:3: (enumLiteral_2= 'RightLight' )
                    // InternalRobotDSL.g:1444:4: enumLiteral_2= 'RightLight'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getRIGHTLIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSensorTypeAccess().getRIGHTLIGHTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:1451:3: (enumLiteral_3= 'RearHeight' )
                    {
                    // InternalRobotDSL.g:1451:3: (enumLiteral_3= 'RearHeight' )
                    // InternalRobotDSL.g:1452:4: enumLiteral_3= 'RearHeight'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getBACKUSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSensorTypeAccess().getBACKUSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRobotDSL.g:1459:3: (enumLiteral_4= 'FrontDistance' )
                    {
                    // InternalRobotDSL.g:1459:3: (enumLiteral_4= 'FrontDistance' )
                    // InternalRobotDSL.g:1460:4: enumLiteral_4= 'FrontDistance'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getFRONTUSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSensorTypeAccess().getFRONTUSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRobotDSL.g:1467:3: (enumLiteral_5= 'LeftTouch' )
                    {
                    // InternalRobotDSL.g:1467:3: (enumLiteral_5= 'LeftTouch' )
                    // InternalRobotDSL.g:1468:4: enumLiteral_5= 'LeftTouch'
                    {
                    enumLiteral_5=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getLEFTTOUCHEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSensorTypeAccess().getLEFTTOUCHEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRobotDSL.g:1475:3: (enumLiteral_6= 'RightTouch' )
                    {
                    // InternalRobotDSL.g:1475:3: (enumLiteral_6= 'RightTouch' )
                    // InternalRobotDSL.g:1476:4: enumLiteral_6= 'RightTouch'
                    {
                    enumLiteral_6=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getRIGHTTOUCHEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSensorTypeAccess().getRIGHTTOUCHEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRobotDSL.g:1483:3: (enumLiteral_7= 'Gyro' )
                    {
                    // InternalRobotDSL.g:1483:3: (enumLiteral_7= 'Gyro' )
                    // InternalRobotDSL.g:1484:4: enumLiteral_7= 'Gyro'
                    {
                    enumLiteral_7=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getGYROEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSensorTypeAccess().getGYROEnumLiteralDeclaration_7());
                    			

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


    // $ANTLR start "ruleColorName"
    // InternalRobotDSL.g:1494:1: ruleColorName returns [Enumerator current=null] : ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'white' ) | (enumLiteral_2= 'black' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'blue' ) | (enumLiteral_5= 'bright' ) | (enumLiteral_6= 'dark' ) ) ;
    public final Enumerator ruleColorName() throws RecognitionException {
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
            // InternalRobotDSL.g:1500:2: ( ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'white' ) | (enumLiteral_2= 'black' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'blue' ) | (enumLiteral_5= 'bright' ) | (enumLiteral_6= 'dark' ) ) )
            // InternalRobotDSL.g:1501:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'white' ) | (enumLiteral_2= 'black' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'blue' ) | (enumLiteral_5= 'bright' ) | (enumLiteral_6= 'dark' ) )
            {
            // InternalRobotDSL.g:1501:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'white' ) | (enumLiteral_2= 'black' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'blue' ) | (enumLiteral_5= 'bright' ) | (enumLiteral_6= 'dark' ) )
            int alt26=7;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt26=1;
                }
                break;
            case 63:
                {
                alt26=2;
                }
                break;
            case 64:
                {
                alt26=3;
                }
                break;
            case 65:
                {
                alt26=4;
                }
                break;
            case 66:
                {
                alt26=5;
                }
                break;
            case 67:
                {
                alt26=6;
                }
                break;
            case 68:
                {
                alt26=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalRobotDSL.g:1502:3: (enumLiteral_0= 'red' )
                    {
                    // InternalRobotDSL.g:1502:3: (enumLiteral_0= 'red' )
                    // InternalRobotDSL.g:1503:4: enumLiteral_0= 'red'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getColorNameAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorNameAccess().getREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1510:3: (enumLiteral_1= 'white' )
                    {
                    // InternalRobotDSL.g:1510:3: (enumLiteral_1= 'white' )
                    // InternalRobotDSL.g:1511:4: enumLiteral_1= 'white'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getColorNameAccess().getWHITEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorNameAccess().getWHITEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:1518:3: (enumLiteral_2= 'black' )
                    {
                    // InternalRobotDSL.g:1518:3: (enumLiteral_2= 'black' )
                    // InternalRobotDSL.g:1519:4: enumLiteral_2= 'black'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getColorNameAccess().getBLACKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorNameAccess().getBLACKEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:1526:3: (enumLiteral_3= 'green' )
                    {
                    // InternalRobotDSL.g:1526:3: (enumLiteral_3= 'green' )
                    // InternalRobotDSL.g:1527:4: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getColorNameAccess().getGREENEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorNameAccess().getGREENEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRobotDSL.g:1534:3: (enumLiteral_4= 'blue' )
                    {
                    // InternalRobotDSL.g:1534:3: (enumLiteral_4= 'blue' )
                    // InternalRobotDSL.g:1535:4: enumLiteral_4= 'blue'
                    {
                    enumLiteral_4=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getColorNameAccess().getBLUEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorNameAccess().getBLUEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRobotDSL.g:1542:3: (enumLiteral_5= 'bright' )
                    {
                    // InternalRobotDSL.g:1542:3: (enumLiteral_5= 'bright' )
                    // InternalRobotDSL.g:1543:4: enumLiteral_5= 'bright'
                    {
                    enumLiteral_5=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getColorNameAccess().getBRIGHTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getColorNameAccess().getBRIGHTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRobotDSL.g:1550:3: (enumLiteral_6= 'dark' )
                    {
                    // InternalRobotDSL.g:1550:3: (enumLiteral_6= 'dark' )
                    // InternalRobotDSL.g:1551:4: enumLiteral_6= 'dark'
                    {
                    enumLiteral_6=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getColorNameAccess().getDARKEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getColorNameAccess().getDARKEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleColorName"


    // $ANTLR start "ruleBoolType"
    // InternalRobotDSL.g:1561:1: ruleBoolType returns [Enumerator current=null] : ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'and' ) | (enumLiteral_3= 'or' ) | (enumLiteral_4= 'true' ) | (enumLiteral_5= 'false' ) ) ;
    public final Enumerator ruleBoolType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalRobotDSL.g:1567:2: ( ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'and' ) | (enumLiteral_3= 'or' ) | (enumLiteral_4= 'true' ) | (enumLiteral_5= 'false' ) ) )
            // InternalRobotDSL.g:1568:2: ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'and' ) | (enumLiteral_3= 'or' ) | (enumLiteral_4= 'true' ) | (enumLiteral_5= 'false' ) )
            {
            // InternalRobotDSL.g:1568:2: ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'and' ) | (enumLiteral_3= 'or' ) | (enumLiteral_4= 'true' ) | (enumLiteral_5= 'false' ) )
            int alt27=6;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt27=1;
                }
                break;
            case 70:
                {
                alt27=2;
                }
                break;
            case 71:
                {
                alt27=3;
                }
                break;
            case 72:
                {
                alt27=4;
                }
                break;
            case 73:
                {
                alt27=5;
                }
                break;
            case 74:
                {
                alt27=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalRobotDSL.g:1569:3: (enumLiteral_0= 'less' )
                    {
                    // InternalRobotDSL.g:1569:3: (enumLiteral_0= 'less' )
                    // InternalRobotDSL.g:1570:4: enumLiteral_0= 'less'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getBoolTypeAccess().getLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBoolTypeAccess().getLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobotDSL.g:1577:3: (enumLiteral_1= 'greater' )
                    {
                    // InternalRobotDSL.g:1577:3: (enumLiteral_1= 'greater' )
                    // InternalRobotDSL.g:1578:4: enumLiteral_1= 'greater'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getBoolTypeAccess().getGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBoolTypeAccess().getGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobotDSL.g:1585:3: (enumLiteral_2= 'and' )
                    {
                    // InternalRobotDSL.g:1585:3: (enumLiteral_2= 'and' )
                    // InternalRobotDSL.g:1586:4: enumLiteral_2= 'and'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getBoolTypeAccess().getANDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBoolTypeAccess().getANDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobotDSL.g:1593:3: (enumLiteral_3= 'or' )
                    {
                    // InternalRobotDSL.g:1593:3: (enumLiteral_3= 'or' )
                    // InternalRobotDSL.g:1594:4: enumLiteral_3= 'or'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getBoolTypeAccess().getOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBoolTypeAccess().getOREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRobotDSL.g:1601:3: (enumLiteral_4= 'true' )
                    {
                    // InternalRobotDSL.g:1601:3: (enumLiteral_4= 'true' )
                    // InternalRobotDSL.g:1602:4: enumLiteral_4= 'true'
                    {
                    enumLiteral_4=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getBoolTypeAccess().getTRUEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBoolTypeAccess().getTRUEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRobotDSL.g:1609:3: (enumLiteral_5= 'false' )
                    {
                    // InternalRobotDSL.g:1609:3: (enumLiteral_5= 'false' )
                    // InternalRobotDSL.g:1610:4: enumLiteral_5= 'false'
                    {
                    enumLiteral_5=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getBoolTypeAccess().getFALSEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBoolTypeAccess().getFALSEEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleBoolType"

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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x3FC0040000000010L,0x00000000000007E0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x3FC00400000C0012L,0x00000000000007E0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000590800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000590800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x3FC0040000080010L,0x00000000000007E0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000780000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x3FC0040000000012L,0x00000000000007E0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007E0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xC000000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000000L});

}