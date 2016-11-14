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
    	return "Mission";
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
		otherlv_2='UsedDevices:'
		{
			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getUsedDevicesKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMissionAccess().getDeviceListDeviceParserRuleCall_3_0());
				}
				lv_deviceList_3_0=ruleDevice
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMissionRule());
					}
					add(
						$current,
						"deviceList",
						lv_deviceList_3_0,
						"des.missionrobot.RobotDSL.Device");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='Behaviours:'
		{
			newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getBehavioursKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMissionAccess().getBehaviourListBehaviourParserRuleCall_5_0());
				}
				lv_behaviourList_5_0=ruleBehaviour
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMissionRule());
					}
					add(
						$current,
						"behaviourList",
						lv_behaviourList_5_0,
						"des.missionrobot.RobotDSL.Behaviour");
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
					newCompositeNode(grammarAccess.getMissionAccess().getGoalConditionTriggerParserRuleCall_7_0());
				}
				lv_goalCondition_7_0=ruleTrigger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMissionRule());
					}
					add(
						$current,
						"goalCondition",
						lv_goalCondition_7_0,
						"des.missionrobot.RobotDSL.Trigger");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleBehaviour
entryRuleBehaviour returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBehaviourRule()); }
	iv_ruleBehaviour=ruleBehaviour
	{ $current=$iv_ruleBehaviour.current; }
	EOF;

// Rule Behaviour
ruleBehaviour returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Behavior:'
		{
			newLeafNode(otherlv_0, grammarAccess.getBehaviourAccess().getBehaviorKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getBehaviourAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBehaviourRule());
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
			newLeafNode(otherlv_2, grammarAccess.getBehaviourAccess().getPriorityKeyword_2());
		}
		(
			(
				lv_prio_3_0=RULE_INT
				{
					newLeafNode(lv_prio_3_0, grammarAccess.getBehaviourAccess().getPrioINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBehaviourRule());
					}
					setWithLastConsumed(
						$current,
						"prio",
						lv_prio_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4='devices:'
		{
			newLeafNode(otherlv_4, grammarAccess.getBehaviourAccess().getDevicesKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBehaviourRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getBehaviourAccess().getDeviceListDeviceCrossReference_5_0());
				}
			)
		)+
		otherlv_6='actions:'
		{
			newLeafNode(otherlv_6, grammarAccess.getBehaviourAccess().getActionsKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBehaviourAccess().getActionListActionParserRuleCall_7_0());
				}
				lv_actionList_7_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBehaviourRule());
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
		otherlv_8='triggers:'
		{
			newLeafNode(otherlv_8, grammarAccess.getBehaviourAccess().getTriggersKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBehaviourAccess().getTriggerListTriggerParserRuleCall_9_0());
				}
				lv_triggerList_9_0=ruleTrigger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBehaviourRule());
					}
					add(
						$current,
						"triggerList",
						lv_triggerList_9_0,
						"des.missionrobot.RobotDSL.Trigger");
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
			{
				newCompositeNode(grammarAccess.getActionAccess().getMovementParserRuleCall_0_0());
			}
			this_Movement_0=ruleMovement
			{
				$current = $this_Movement_0.current;
				afterParserOrEnumRuleCall();
			}
			(
				otherlv_1='Duration'
				{
					newLeafNode(otherlv_1, grammarAccess.getActionAccess().getDurationKeyword_0_1_0());
				}
				(
					(
						lv_duration_2_0=RULE_INT
						{
							newLeafNode(lv_duration_2_0, grammarAccess.getActionAccess().getDurationINTTerminalRuleCall_0_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getActionRule());
							}
							setWithLastConsumed(
								$current,
								"duration",
								lv_duration_2_0,
								"org.eclipse.xtext.common.Terminals.INT");
						}
					)
				)
			)?
		)
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getSoundParserRuleCall_1());
		}
		this_Sound_3=ruleSound
		{
			$current = $this_Sound_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getIOParserRuleCall_2());
		}
		this_IO_4=ruleIO
		{
			$current = $this_IO_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMovement
entryRuleMovement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMovementRule()); }
	iv_ruleMovement=ruleMovement
	{ $current=$iv_ruleMovement.current; }
	EOF;

// Rule Movement
ruleMovement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMovementAccess().getMoveForwardParserRuleCall_0());
		}
		this_MoveForward_0=ruleMoveForward
		{
			$current = $this_MoveForward_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMovementAccess().getMoveBackwardParserRuleCall_1());
		}
		this_MoveBackward_1=ruleMoveBackward
		{
			$current = $this_MoveBackward_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMovementAccess().getTurnParserRuleCall_2());
		}
		this_Turn_2=ruleTurn
		{
			$current = $this_Turn_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMovementAccess().getStopParserRuleCall_3());
		}
		this_Stop_3=ruleStop
		{
			$current = $this_Stop_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMoveForward
entryRuleMoveForward returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMoveForwardRule()); }
	iv_ruleMoveForward=ruleMoveForward
	{ $current=$iv_ruleMoveForward.current; }
	EOF;

// Rule MoveForward
ruleMoveForward returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Forward'
		{
			newLeafNode(otherlv_0, grammarAccess.getMoveForwardAccess().getForwardKeyword_0());
		}
		(
			(
				lv_fspeed_1_0=RULE_INT
				{
					newLeafNode(lv_fspeed_1_0, grammarAccess.getMoveForwardAccess().getFspeedINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMoveForwardRule());
					}
					setWithLastConsumed(
						$current,
						"fspeed",
						lv_fspeed_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleMoveBackward
entryRuleMoveBackward returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMoveBackwardRule()); }
	iv_ruleMoveBackward=ruleMoveBackward
	{ $current=$iv_ruleMoveBackward.current; }
	EOF;

// Rule MoveBackward
ruleMoveBackward returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Backward'
		{
			newLeafNode(otherlv_0, grammarAccess.getMoveBackwardAccess().getBackwardKeyword_0());
		}
		(
			(
				lv_bspeed_1_0=RULE_INT
				{
					newLeafNode(lv_bspeed_1_0, grammarAccess.getMoveBackwardAccess().getBspeedINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMoveBackwardRule());
					}
					setWithLastConsumed(
						$current,
						"bspeed",
						lv_bspeed_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleTurn
entryRuleTurn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTurnRule()); }
	iv_ruleTurn=ruleTurn
	{ $current=$iv_ruleTurn.current; }
	EOF;

// Rule Turn
ruleTurn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Turn'
		{
			newLeafNode(otherlv_0, grammarAccess.getTurnAccess().getTurnKeyword_0());
		}
		(
			(
				lv_angle_1_0=RULE_INT
				{
					newLeafNode(lv_angle_1_0, grammarAccess.getTurnAccess().getAngleINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTurnRule());
					}
					setWithLastConsumed(
						$current,
						"angle",
						lv_angle_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleStop
entryRuleStop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStopRule()); }
	iv_ruleStop=ruleStop
	{ $current=$iv_ruleStop.current; }
	EOF;

// Rule Stop
ruleStop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Stop'
		{
			newLeafNode(otherlv_0, grammarAccess.getStopAccess().getStopKeyword_0());
		}
		(
			(
				lv_duration_1_0=RULE_INT
				{
					newLeafNode(lv_duration_1_0, grammarAccess.getStopAccess().getDurationINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStopRule());
					}
					setWithLastConsumed(
						$current,
						"duration",
						lv_duration_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
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
		otherlv_0='PlaySound:'
		{
			newLeafNode(otherlv_0, grammarAccess.getSoundAccess().getPlaySoundKeyword_0());
		}
		(
			(
				lv_soundName_1_0=RULE_STRING
				{
					newLeafNode(lv_soundName_1_0, grammarAccess.getSoundAccess().getSoundNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSoundRule());
					}
					setWithLastConsumed(
						$current,
						"soundName",
						lv_soundName_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleIO
entryRuleIO returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIORule()); }
	iv_ruleIO=ruleIO
	{ $current=$iv_ruleIO.current; }
	EOF;

// Rule IO
ruleIO returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='PrintMessage'
		{
			newLeafNode(otherlv_0, grammarAccess.getIOAccess().getPrintMessageKeyword_0());
		}
		(
			(
				lv_message_1_0=RULE_STRING
				{
					newLeafNode(lv_message_1_0, grammarAccess.getIOAccess().getMessageSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIORule());
					}
					setWithLastConsumed(
						$current,
						"message",
						lv_message_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
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
		otherlv_0='Condition:'
		{
			newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getConditionKeyword_0());
		}
		(
			(
				lv_condition_1_0=RULE_STRING
				{
					newLeafNode(lv_condition_1_0, grammarAccess.getTriggerAccess().getConditionSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTriggerRule());
					}
					setWithLastConsumed(
						$current,
						"condition",
						lv_condition_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleDevice
entryRuleDevice returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeviceRule()); }
	iv_ruleDevice=ruleDevice
	{ $current=$iv_ruleDevice.current; }
	EOF;

// Rule Device
ruleDevice returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Name:'
		{
			newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getNameKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeviceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='Device:'
		{
			newLeafNode(otherlv_2, grammarAccess.getDeviceAccess().getDeviceKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDeviceAccess().getTypeDeviceTypeEnumRuleCall_3_0());
				}
				lv_type_3_0=ruleDeviceType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeviceRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"des.missionrobot.RobotDSL.DeviceType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='SensorType:'
			{
				newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getSensorTypeKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDeviceAccess().getSensorTypeSensorTypeEnumRuleCall_4_1_0());
					}
					lv_sensorType_5_0=ruleSensorType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDeviceRule());
						}
						set(
							$current,
							"sensorType",
							lv_sensorType_5_0,
							"des.missionrobot.RobotDSL.SensorType");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='description:'
			{
				newLeafNode(otherlv_6, grammarAccess.getDeviceAccess().getDescriptionKeyword_5_0());
			}
			(
				(
					lv_desc_7_0=RULE_STRING
					{
						newLeafNode(lv_desc_7_0, grammarAccess.getDeviceAccess().getDescSTRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDeviceRule());
						}
						setWithLastConsumed(
							$current,
							"desc",
							lv_desc_7_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
	)
;

// Rule DeviceType
ruleDeviceType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Motor'
			{
				$current = grammarAccess.getDeviceTypeAccess().getMOTOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDeviceTypeAccess().getMOTOREnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Sensor'
			{
				$current = grammarAccess.getDeviceTypeAccess().getSENSOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDeviceTypeAccess().getSENSOREnumLiteralDeclaration_1());
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
			enumLiteral_0='Ultrasonic'
			{
				$current = grammarAccess.getSensorTypeAccess().getULTRASONICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSensorTypeAccess().getULTRASONICEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Touch'
			{
				$current = grammarAccess.getSensorTypeAccess().getTOUCHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSensorTypeAccess().getTOUCHEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Colour'
			{
				$current = grammarAccess.getSensorTypeAccess().getCOLOUREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getSensorTypeAccess().getCOLOUREnumLiteralDeclaration_2());
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
