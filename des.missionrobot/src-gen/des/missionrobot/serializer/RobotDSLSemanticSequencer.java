/*
 * generated by Xtext 2.10.0
 */
package des.missionrobot.serializer;

import com.google.inject.Inject;
import des.missionrobot.robotDSL.Behavior;
import des.missionrobot.robotDSL.Device;
import des.missionrobot.robotDSL.IO;
import des.missionrobot.robotDSL.Mission;
import des.missionrobot.robotDSL.MoveBackward;
import des.missionrobot.robotDSL.MoveForward;
import des.missionrobot.robotDSL.RobotDSLPackage;
import des.missionrobot.robotDSL.Sound;
import des.missionrobot.robotDSL.Stop;
import des.missionrobot.robotDSL.Trigger;
import des.missionrobot.robotDSL.Turn;
import des.missionrobot.services.RobotDSLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class RobotDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RobotDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RobotDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RobotDSLPackage.BEHAVIOR:
				sequence_Behavior(context, (Behavior) semanticObject); 
				return; 
			case RobotDSLPackage.DEVICE:
				sequence_Device(context, (Device) semanticObject); 
				return; 
			case RobotDSLPackage.IO:
				sequence_IO(context, (IO) semanticObject); 
				return; 
			case RobotDSLPackage.MISSION:
				sequence_Mission(context, (Mission) semanticObject); 
				return; 
			case RobotDSLPackage.MOVE_BACKWARD:
				if (rule == grammarAccess.getActionRule()) {
					sequence_Action_MoveBackward(context, (MoveBackward) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMovementRule()
						|| rule == grammarAccess.getMoveBackwardRule()) {
					sequence_MoveBackward(context, (MoveBackward) semanticObject); 
					return; 
				}
				else break;
			case RobotDSLPackage.MOVE_FORWARD:
				if (rule == grammarAccess.getActionRule()) {
					sequence_Action_MoveForward(context, (MoveForward) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMovementRule()
						|| rule == grammarAccess.getMoveForwardRule()) {
					sequence_MoveForward(context, (MoveForward) semanticObject); 
					return; 
				}
				else break;
			case RobotDSLPackage.SOUND:
				sequence_Sound(context, (Sound) semanticObject); 
				return; 
			case RobotDSLPackage.STOP:
				if (rule == grammarAccess.getActionRule()) {
					sequence_Action_Stop(context, (Stop) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMovementRule()
						|| rule == grammarAccess.getStopRule()) {
					sequence_Stop(context, (Stop) semanticObject); 
					return; 
				}
				else break;
			case RobotDSLPackage.TRIGGER:
				sequence_Trigger(context, (Trigger) semanticObject); 
				return; 
			case RobotDSLPackage.TURN:
				if (rule == grammarAccess.getActionRule()) {
					sequence_Action_Turn(context, (Turn) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMovementRule()
						|| rule == grammarAccess.getTurnRule()) {
					sequence_Turn(context, (Turn) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns MoveBackward
	 *
	 * Constraint:
	 *     (bspeed=INT duration=INT?)
	 */
	protected void sequence_Action_MoveBackward(ISerializationContext context, MoveBackward semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns MoveForward
	 *
	 * Constraint:
	 *     (fspeed=INT duration=INT?)
	 */
	protected void sequence_Action_MoveForward(ISerializationContext context, MoveForward semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Stop
	 *
	 * Constraint:
	 *     (duration=INT duration=INT?)
	 */
	protected void sequence_Action_Stop(ISerializationContext context, Stop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Turn
	 *
	 * Constraint:
	 *     (angle=INT duration=INT?)
	 */
	protected void sequence_Action_Turn(ISerializationContext context, Turn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Behavior returns Behavior
	 *
	 * Constraint:
	 *     (name=ID prio=INT deviceList+=[Device|ID]+ actionList+=Action+ triggerList+=Trigger+)
	 */
	protected void sequence_Behavior(ISerializationContext context, Behavior semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Device returns Device
	 *
	 * Constraint:
	 *     (name=ID type=DeviceType sensorType=SensorType? desc=STRING?)
	 */
	protected void sequence_Device(ISerializationContext context, Device semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns IO
	 *     IO returns IO
	 *
	 * Constraint:
	 *     message=STRING
	 */
	protected void sequence_IO(ISerializationContext context, IO semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.IO__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.IO__MESSAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIOAccess().getMessageSTRINGTerminalRuleCall_1_0(), semanticObject.getMessage());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Mission returns Mission
	 *
	 * Constraint:
	 *     (name=ID deviceList+=Device+ behaviourList+=Behavior+ goalCondition+=Trigger+)
	 */
	protected void sequence_Mission(ISerializationContext context, Mission semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Movement returns MoveBackward
	 *     MoveBackward returns MoveBackward
	 *
	 * Constraint:
	 *     bspeed=INT
	 */
	protected void sequence_MoveBackward(ISerializationContext context, MoveBackward semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.MOVE_BACKWARD__BSPEED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.MOVE_BACKWARD__BSPEED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMoveBackwardAccess().getBspeedINTTerminalRuleCall_1_0(), semanticObject.getBspeed());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Movement returns MoveForward
	 *     MoveForward returns MoveForward
	 *
	 * Constraint:
	 *     fspeed=INT
	 */
	protected void sequence_MoveForward(ISerializationContext context, MoveForward semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.MOVE_FORWARD__FSPEED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.MOVE_FORWARD__FSPEED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMoveForwardAccess().getFspeedINTTerminalRuleCall_1_0(), semanticObject.getFspeed());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Sound
	 *     Sound returns Sound
	 *
	 * Constraint:
	 *     soundName=STRING
	 */
	protected void sequence_Sound(ISerializationContext context, Sound semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.SOUND__SOUND_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.SOUND__SOUND_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSoundAccess().getSoundNameSTRINGTerminalRuleCall_1_0(), semanticObject.getSoundName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Movement returns Stop
	 *     Stop returns Stop
	 *
	 * Constraint:
	 *     duration=INT
	 */
	protected void sequence_Stop(ISerializationContext context, Stop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.MOVEMENT__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.MOVEMENT__DURATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStopAccess().getDurationINTTerminalRuleCall_1_0(), semanticObject.getDuration());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns Trigger
	 *
	 * Constraint:
	 *     (condition=STRING sensorTrigger=[Device|ID]?)
	 */
	protected void sequence_Trigger(ISerializationContext context, Trigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Movement returns Turn
	 *     Turn returns Turn
	 *
	 * Constraint:
	 *     angle=INT
	 */
	protected void sequence_Turn(ISerializationContext context, Turn semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.TURN__ANGLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.TURN__ANGLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTurnAccess().getAngleINTTerminalRuleCall_1_0(), semanticObject.getAngle());
		feeder.finish();
	}
	
	
}
