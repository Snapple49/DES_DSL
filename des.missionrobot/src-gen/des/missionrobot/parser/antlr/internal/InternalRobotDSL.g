/*
 * generated by Xtext 2.10.0
 */
grammar InternalRobotDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package des.missionrobot.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMissions
entryRuleMissions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMissionsRule()); }
	iv_ruleMissions=ruleMissions
	{ $current=$iv_ruleMissions.current; }
	EOF;

// Rule Missions
ruleMissions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Missionset'
		{
			newLeafNode(otherlv_0, grammarAccess.getMissionsAccess().getMissionsetKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMissionsAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMissionsRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='Missions:'
		{
			newLeafNode(otherlv_2, grammarAccess.getMissionsAccess().getMissionsKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMissionsAccess().getMissionListMissionParserRuleCall_3_0());
				}
				lv_missionList_3_0=ruleMission
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMissionsRule());
					}
					add(
						$current,
						"missionList",
						lv_missionList_3_0,
						"des.missionrobot.RobotDSL.Mission");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleMission
entryRuleMission returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMissionRule()); }
	iv_ruleMission=ruleMission
	{ $current=$iv_ruleMission.current; }
	EOF;

// Rule Mission
ruleMission returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Mission'
		{
			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMissionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='Flags:'
		{
			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getFlagsKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMissionAccess().getFlagsListFlagParserRuleCall_3_0());
				}
				lv_flagsList_3_0=ruleFlag
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMissionRule());
					}
					add(
						$current,
						"flagsList",
						lv_flagsList_3_0,
						"des.missionrobot.RobotDSL.Flag");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='Tasks:'
		{
			newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getTasksKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMissionAccess().getTaskListTaskParserRuleCall_5_0());
				}
				lv_taskList_5_0=ruleTask
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMissionRule());
					}
					add(
						$current,
						"taskList",
						lv_taskList_5_0,
						"des.missionrobot.RobotDSL.Task");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_6='Goal:'
		{
			newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getGoalKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMissionAccess().getGoalGoalParserRuleCall_7_0());
				}
				lv_goal_7_0=ruleGoal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMissionRule());
					}
					set(
						$current,
						"goal",
						lv_goal_7_0,
						"des.missionrobot.RobotDSL.Goal");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleGoal
entryRuleGoal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGoalRule()); }
	iv_ruleGoal=ruleGoal
	{ $current=$iv_ruleGoal.current; }
	EOF;

// Rule Goal
ruleGoal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Condition:'
			{
				newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getConditionKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGoalAccess().getGoalEventsTriggerParserRuleCall_0_1_0());
					}
					lv_goalEvents_1_0=ruleTrigger
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGoalRule());
						}
						add(
							$current,
							"goalEvents",
							lv_goalEvents_1_0,
							"des.missionrobot.RobotDSL.Trigger");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGoalAccess().getTimeoutTimeParserRuleCall_1_0());
				}
				lv_timeout_2_0=ruleTime
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGoalRule());
					}
					set(
						$current,
						"timeout",
						lv_timeout_2_0,
						"des.missionrobot.RobotDSL.Time");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_3='Actions:'
			{
				newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getActionsKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGoalAccess().getFinishActionsActionParserRuleCall_2_1_0());
					}
					lv_finishActions_4_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGoalRule());
						}
						add(
							$current,
							"finishActions",
							lv_finishActions_4_0,
							"des.missionrobot.RobotDSL.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)?
	)
;

// Entry rule entryRuleTask
entryRuleTask returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTaskRule()); }
	iv_ruleTask=ruleTask
	{ $current=$iv_ruleTask.current; }
	EOF;

// Rule Task
ruleTask returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Task:'
		{
			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTaskRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='priority:'
		{
			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getPriorityKeyword_2());
		}
		(
			(
				lv_prio_3_0=RULE_INT
				{
					newLeafNode(lv_prio_3_0, grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTaskRule());
					}
					setWithLastConsumed(
						$current,
						"prio",
						lv_prio_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			otherlv_4='Triggers:'
			{
				newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getTriggersKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTaskAccess().getTriggerListTriggerParserRuleCall_4_1_0());
					}
					lv_triggerList_5_0=ruleTrigger
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTaskRule());
						}
						add(
							$current,
							"triggerList",
							lv_triggerList_5_0,
							"des.missionrobot.RobotDSL.Trigger");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)?
		otherlv_6='Actions:'
		{
			newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getActionsKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTaskAccess().getActionListActionParserRuleCall_6_0());
				}
				lv_actionList_7_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTaskRule());
					}
					add(
						$current,
						"actionList",
						lv_actionList_7_0,
						"des.missionrobot.RobotDSL.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Move'
			{
				newLeafNode(otherlv_0, grammarAccess.getActionAccess().getMoveKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getActionAccess().getMoveDirDirectionParserRuleCall_0_1_0());
					}
					lv_moveDir_1_0=ruleDirection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActionRule());
						}
						set(
							$current,
							"moveDir",
							lv_moveDir_1_0,
							"des.missionrobot.RobotDSL.Direction");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_2='for'
				{
					newLeafNode(otherlv_2, grammarAccess.getActionAccess().getForKeyword_0_2_0());
				}
				(
					(
						lv_duration_3_0=RULE_INT
						{
							newLeafNode(lv_duration_3_0, grammarAccess.getActionAccess().getDurationINTTerminalRuleCall_0_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getActionRule());
							}
							setWithLastConsumed(
								$current,
								"duration",
								lv_duration_3_0,
								"org.eclipse.xtext.common.Terminals.INT");
						}
					)
				)
				otherlv_4='millisec'
				{
					newLeafNode(otherlv_4, grammarAccess.getActionAccess().getMillisecKeyword_0_2_2());
				}
			)?
			(
				otherlv_5='at'
				{
					newLeafNode(otherlv_5, grammarAccess.getActionAccess().getAtKeyword_0_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getActionAccess().getSpeedSpeedParserRuleCall_0_3_1_0());
						}
						lv_speed_6_0=ruleSpeed
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getActionRule());
							}
							set(
								$current,
								"speed",
								lv_speed_6_0,
								"des.missionrobot.RobotDSL.Speed");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_7='speed'
				{
					newLeafNode(otherlv_7, grammarAccess.getActionAccess().getSpeedKeyword_0_3_2());
				}
			)?
		)
		    |
		(
			otherlv_8='Turn'
			{
				newLeafNode(otherlv_8, grammarAccess.getActionAccess().getTurnKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getActionAccess().getTurnDirDirectionParserRuleCall_1_1_0());
					}
					lv_turnDir_9_0=ruleDirection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActionRule());
						}
						set(
							$current,
							"turnDir",
							lv_turnDir_9_0,
							"des.missionrobot.RobotDSL.Direction");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					(
						(
							lv_degr_10_0=RULE_INT
							{
								newLeafNode(lv_degr_10_0, grammarAccess.getActionAccess().getDegrINTTerminalRuleCall_1_2_0_0_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getActionRule());
								}
								setWithLastConsumed(
									$current,
									"degr",
									lv_degr_10_0,
									"org.eclipse.xtext.common.Terminals.INT");
							}
						)
					)
					otherlv_11='deg'
					{
						newLeafNode(otherlv_11, grammarAccess.getActionAccess().getDegKeyword_1_2_0_1());
					}
				)
				    |
				(
					otherlv_12='until'
					{
						newLeafNode(otherlv_12, grammarAccess.getActionAccess().getUntilKeyword_1_2_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getActionAccess().getTrigTriggerParserRuleCall_1_2_1_1_0());
							}
							lv_trig_13_0=ruleTrigger
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getActionRule());
								}
								add(
									$current,
									"trig",
									lv_trig_13_0,
									"des.missionrobot.RobotDSL.Trigger");
								afterParserOrEnumRuleCall();
							}
						)
					)+
				)
			)
		)
		    |
		(
			otherlv_14='Arm'
			{
				newLeafNode(otherlv_14, grammarAccess.getActionAccess().getArmKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getActionAccess().getOpArmOpParserRuleCall_2_1_0());
					}
					lv_op_15_0=ruleArmOp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActionRule());
						}
						set(
							$current,
							"op",
							lv_op_15_0,
							"des.missionrobot.RobotDSL.ArmOp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_16='Play'
			{
				newLeafNode(otherlv_16, grammarAccess.getActionAccess().getPlayKeyword_3_0());
			}
			otherlv_17='sound'
			{
				newLeafNode(otherlv_17, grammarAccess.getActionAccess().getSoundKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getActionAccess().getSoundSoundParserRuleCall_3_2_0());
					}
					lv_sound_18_0=ruleSound
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActionRule());
						}
						set(
							$current,
							"sound",
							lv_sound_18_0,
							"des.missionrobot.RobotDSL.Sound");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_19='Update'
			{
				newLeafNode(otherlv_19, grammarAccess.getActionAccess().getUpdateKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getActionRule());
						}
					}
					otherlv_20=RULE_ID
					{
						newLeafNode(otherlv_20, grammarAccess.getActionAccess().getFlagFlagCrossReference_4_1_0());
					}
				)
			)
			otherlv_21='to'
			{
				newLeafNode(otherlv_21, grammarAccess.getActionAccess().getToKeyword_4_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getActionAccess().getBoolBoolParserRuleCall_4_3_0());
					}
					lv_bool_22_0=ruleBool
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActionRule());
						}
						set(
							$current,
							"bool",
							lv_bool_22_0,
							"des.missionrobot.RobotDSL.Bool");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				lv_cent_23_0='Centalize'
				{
					newLeafNode(lv_cent_23_0, grammarAccess.getActionAccess().getCentCentalizeKeyword_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActionRule());
					}
					setWithLastConsumed($current, "cent", lv_cent_23_0, "Centalize");
				}
			)
		)
	)
;

// Entry rule entryRuleTrigger
entryRuleTrigger returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTriggerRule()); }
	iv_ruleTrigger=ruleTrigger
	{ $current=$iv_ruleTrigger.current; }
	EOF;

// Rule Trigger
ruleTrigger returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTriggerAccess().getBoolTypeBoolParserRuleCall_0_0());
				}
				lv_boolType_0_0=ruleBool
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTriggerRule());
					}
					set(
						$current,
						"boolType",
						lv_boolType_0_0,
						"des.missionrobot.RobotDSL.Bool");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getTriggerAccess().getNegNegationParserRuleCall_1_0_0_0());
						}
						lv_neg_1_0=ruleNegation
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTriggerRule());
							}
							set(
								$current,
								"neg",
								lv_neg_1_0,
								"des.missionrobot.RobotDSL.Negation");
							afterParserOrEnumRuleCall();
						}
					)
				)?
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTriggerRule());
							}
						}
						otherlv_2=RULE_ID
						{
							newLeafNode(otherlv_2, grammarAccess.getTriggerAccess().getFlagFlagCrossReference_1_0_1_0());
						}
					)
				)
			)
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getTriggerAccess().getSensorSensorParserRuleCall_1_1_0_0());
						}
						lv_sensor_3_0=ruleSensor
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTriggerRule());
							}
							set(
								$current,
								"sensor",
								lv_sensor_3_0,
								"des.missionrobot.RobotDSL.Sensor");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						otherlv_4='is'
						{
							newLeafNode(otherlv_4, grammarAccess.getTriggerAccess().getIsKeyword_1_1_1_0_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getTriggerAccess().getColorColorParserRuleCall_1_1_1_0_1_0());
								}
								lv_color_5_0=ruleColor
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getTriggerRule());
									}
									set(
										$current,
										"color",
										lv_color_5_0,
										"des.missionrobot.RobotDSL.Color");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)
					    |
					(
						otherlv_6='distance'
						{
							newLeafNode(otherlv_6, grammarAccess.getTriggerAccess().getDistanceKeyword_1_1_1_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getTriggerAccess().getDistDistanceParserRuleCall_1_1_1_1_1_0());
								}
								lv_dist_7_0=ruleDistance
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getTriggerRule());
									}
									set(
										$current,
										"dist",
										lv_dist_7_0,
										"des.missionrobot.RobotDSL.Distance");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)
					    |
					(
						otherlv_8='touching'
						{
							newLeafNode(otherlv_8, grammarAccess.getTriggerAccess().getTouchingKeyword_1_1_1_2_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getTriggerAccess().getTouchingBoolParserRuleCall_1_1_1_2_1_0());
								}
								lv_touching_9_0=ruleBool
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getTriggerRule());
									}
									set(
										$current,
										"touching",
										lv_touching_9_0,
										"des.missionrobot.RobotDSL.Bool");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)
				)
			)
		)
	)
;

// Entry rule entryRuleDistance
entryRuleDistance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDistanceRule()); }
	iv_ruleDistance=ruleDistance
	{ $current=$iv_ruleDistance.current; }
	EOF;

// Rule Distance
ruleDistance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDistanceAccess().getRangeBoolBoolParserRuleCall_0_0());
				}
				lv_rangeBool_0_0=ruleBool
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDistanceRule());
					}
					set(
						$current,
						"rangeBool",
						lv_rangeBool_0_0,
						"des.missionrobot.RobotDSL.Bool");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='than'
		{
			newLeafNode(otherlv_1, grammarAccess.getDistanceAccess().getThanKeyword_1());
		}
		(
			(
				lv_distance_2_0=RULE_INT
				{
					newLeafNode(lv_distance_2_0, grammarAccess.getDistanceAccess().getDistanceINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDistanceRule());
					}
					setWithLastConsumed(
						$current,
						"distance",
						lv_distance_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_3='cm'
		{
			newLeafNode(otherlv_3, grammarAccess.getDistanceAccess().getCmKeyword_3());
		}
	)
;

// Entry rule entryRuleFlag
entryRuleFlag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFlagRule()); }
	iv_ruleFlag=ruleFlag
	{ $current=$iv_ruleFlag.current; }
	EOF;

// Rule Flag
ruleFlag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getFlagAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFlagRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleTime
entryRuleTime returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTimeRule()); }
	iv_ruleTime=ruleTime
	{ $current=$iv_ruleTime.current; }
	EOF;

// Rule Time
ruleTime returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Time:'
		{
			newLeafNode(otherlv_0, grammarAccess.getTimeAccess().getTimeKeyword_0());
		}
		(
			(
				lv_sec_1_0=RULE_INT
				{
					newLeafNode(lv_sec_1_0, grammarAccess.getTimeAccess().getSecINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTimeRule());
					}
					setWithLastConsumed(
						$current,
						"sec",
						lv_sec_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_2='sec'
		{
			newLeafNode(otherlv_2, grammarAccess.getTimeAccess().getSecKeyword_2());
		}
	)
;

// Entry rule entryRuleDirection
entryRuleDirection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDirectionRule()); }
	iv_ruleDirection=ruleDirection
	{ $current=$iv_ruleDirection.current; }
	EOF;

// Rule Direction
ruleDirection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getDirectionAccess().getDirDirectionValEnumRuleCall_0());
			}
			lv_dir_0_0=ruleDirectionVal
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getDirectionRule());
				}
				set(
					$current,
					"dir",
					lv_dir_0_0,
					"des.missionrobot.RobotDSL.DirectionVal");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleSpeed
entryRuleSpeed returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSpeedRule()); }
	iv_ruleSpeed=ruleSpeed
	{ $current=$iv_ruleSpeed.current; }
	EOF;

// Rule Speed
ruleSpeed returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getSpeedAccess().getSpeedSpeedValEnumRuleCall_0());
			}
			lv_speed_0_0=ruleSpeedVal
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getSpeedRule());
				}
				set(
					$current,
					"speed",
					lv_speed_0_0,
					"des.missionrobot.RobotDSL.SpeedVal");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleArmOp
entryRuleArmOp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArmOpRule()); }
	iv_ruleArmOp=ruleArmOp
	{ $current=$iv_ruleArmOp.current; }
	EOF;

// Rule ArmOp
ruleArmOp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getArmOpAccess().getOpTypeArmOpTypeEnumRuleCall_0());
			}
			lv_opType_0_0=ruleArmOpType
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getArmOpRule());
				}
				set(
					$current,
					"opType",
					lv_opType_0_0,
					"des.missionrobot.RobotDSL.ArmOpType");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleSound
entryRuleSound returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSoundRule()); }
	iv_ruleSound=ruleSound
	{ $current=$iv_ruleSound.current; }
	EOF;

// Rule Sound
ruleSound returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getSoundAccess().getSoundNameSoundNameEnumRuleCall_0());
			}
			lv_soundName_0_0=ruleSoundName
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getSoundRule());
				}
				set(
					$current,
					"soundName",
					lv_soundName_0_0,
					"des.missionrobot.RobotDSL.SoundName");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleSensor
entryRuleSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSensorRule()); }
	iv_ruleSensor=ruleSensor
	{ $current=$iv_ruleSensor.current; }
	EOF;

// Rule Sensor
ruleSensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getSensorAccess().getSensorTypeSensorTypeEnumRuleCall_0());
			}
			lv_sensorType_0_0=ruleSensorType
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getSensorRule());
				}
				set(
					$current,
					"sensorType",
					lv_sensorType_0_0,
					"des.missionrobot.RobotDSL.SensorType");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleColor
entryRuleColor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColorRule()); }
	iv_ruleColor=ruleColor
	{ $current=$iv_ruleColor.current; }
	EOF;

// Rule Color
ruleColor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getColorAccess().getColorNameColorNameEnumRuleCall_0());
			}
			lv_colorName_0_0=ruleColorName
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getColorRule());
				}
				set(
					$current,
					"colorName",
					lv_colorName_0_0,
					"des.missionrobot.RobotDSL.ColorName");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleBool
entryRuleBool returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBoolRule()); }
	iv_ruleBool=ruleBool
	{ $current=$iv_ruleBool.current; }
	EOF;

// Rule Bool
ruleBool returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getBoolAccess().getBoolTypeBoolTypeEnumRuleCall_0());
			}
			lv_boolType_0_0=ruleBoolType
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getBoolRule());
				}
				set(
					$current,
					"boolType",
					lv_boolType_0_0,
					"des.missionrobot.RobotDSL.BoolType");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleNegation
entryRuleNegation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNegationRule()); }
	iv_ruleNegation=ruleNegation
	{ $current=$iv_ruleNegation.current; }
	EOF;

// Rule Negation
ruleNegation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_NOT_0_0='not'
			{
				newLeafNode(lv_NOT_0_0, grammarAccess.getNegationAccess().getNOTNotKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNegationRule());
				}
				setWithLastConsumed($current, "NOT", lv_NOT_0_0, "not");
			}
		)
	)
;

// Rule DirectionVal
ruleDirectionVal returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='forward'
			{
				$current = grammarAccess.getDirectionValAccess().getFORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDirectionValAccess().getFORWARDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='backward'
			{
				$current = grammarAccess.getDirectionValAccess().getBACKWARDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDirectionValAccess().getBACKWARDEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='left'
			{
				$current = grammarAccess.getDirectionValAccess().getLEFTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDirectionValAccess().getLEFTEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='right'
			{
				$current = grammarAccess.getDirectionValAccess().getRIGHTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getDirectionValAccess().getRIGHTEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule SpeedVal
ruleSpeedVal returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='high'
			{
				$current = grammarAccess.getSpeedValAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSpeedValAccess().getHIGHEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='medium'
			{
				$current = grammarAccess.getSpeedValAccess().getMEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSpeedValAccess().getMEDEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='low'
			{
				$current = grammarAccess.getSpeedValAccess().getLOWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getSpeedValAccess().getLOWEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule ArmOpType
ruleArmOpType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='raise'
			{
				$current = grammarAccess.getArmOpTypeAccess().getUPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getArmOpTypeAccess().getUPEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='lower'
			{
				$current = grammarAccess.getArmOpTypeAccess().getDOWNEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getArmOpTypeAccess().getDOWNEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule SoundName
ruleSoundName returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='buzz'
			{
				$current = grammarAccess.getSoundNameAccess().getBUZZEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSoundNameAccess().getBUZZEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='fanfare'
			{
				$current = grammarAccess.getSoundNameAccess().getFANFAREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSoundNameAccess().getFANFAREEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule SensorType
ruleSensorType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Color'
			{
				$current = grammarAccess.getSensorTypeAccess().getCOLOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSensorTypeAccess().getCOLOREnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='LeftLight'
			{
				$current = grammarAccess.getSensorTypeAccess().getLEFTLIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSensorTypeAccess().getLEFTLIGHTEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='RightLight'
			{
				$current = grammarAccess.getSensorTypeAccess().getRIGHTLIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getSensorTypeAccess().getRIGHTLIGHTEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='RearHeight'
			{
				$current = grammarAccess.getSensorTypeAccess().getBACKUSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getSensorTypeAccess().getBACKUSEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='FrontDistance'
			{
				$current = grammarAccess.getSensorTypeAccess().getFRONTUSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getSensorTypeAccess().getFRONTUSEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='LeftTouch'
			{
				$current = grammarAccess.getSensorTypeAccess().getLEFTTOUCHEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getSensorTypeAccess().getLEFTTOUCHEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='RightTouch'
			{
				$current = grammarAccess.getSensorTypeAccess().getRIGHTTOUCHEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getSensorTypeAccess().getRIGHTTOUCHEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='Gyro'
			{
				$current = grammarAccess.getSensorTypeAccess().getGYROEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getSensorTypeAccess().getGYROEnumLiteralDeclaration_7());
			}
		)
	)
;

// Rule ColorName
ruleColorName returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='red'
			{
				$current = grammarAccess.getColorNameAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getColorNameAccess().getREDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='white'
			{
				$current = grammarAccess.getColorNameAccess().getWHITEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getColorNameAccess().getWHITEEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='black'
			{
				$current = grammarAccess.getColorNameAccess().getBLACKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getColorNameAccess().getBLACKEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='green'
			{
				$current = grammarAccess.getColorNameAccess().getGREENEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getColorNameAccess().getGREENEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='blue'
			{
				$current = grammarAccess.getColorNameAccess().getBLUEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getColorNameAccess().getBLUEEnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule BoolType
ruleBoolType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='less'
			{
				$current = grammarAccess.getBoolTypeAccess().getLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getBoolTypeAccess().getLEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='greater'
			{
				$current = grammarAccess.getBoolTypeAccess().getGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getBoolTypeAccess().getGEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='and'
			{
				$current = grammarAccess.getBoolTypeAccess().getANDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getBoolTypeAccess().getANDEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='or'
			{
				$current = grammarAccess.getBoolTypeAccess().getOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getBoolTypeAccess().getOREnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='true'
			{
				$current = grammarAccess.getBoolTypeAccess().getTRUEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getBoolTypeAccess().getTRUEEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='false'
			{
				$current = grammarAccess.getBoolTypeAccess().getFALSEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getBoolTypeAccess().getFALSEEnumLiteralDeclaration_5());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
