/*
 * generated by Xtext 2.10.0
 */
package des.missionrobot.serializer;

import com.google.inject.Inject;
import des.missionrobot.robotDSL.ArmOp;
import des.missionrobot.robotDSL.Bool;
import des.missionrobot.robotDSL.Color;
import des.missionrobot.robotDSL.Direction;
import des.missionrobot.robotDSL.Distance;
import des.missionrobot.robotDSL.Flag;
import des.missionrobot.robotDSL.Goal;
import des.missionrobot.robotDSL.Mission;
import des.missionrobot.robotDSL.Missions;
import des.missionrobot.robotDSL.Negation;
import des.missionrobot.robotDSL.RobotDSLPackage;
import des.missionrobot.robotDSL.Sensor;
import des.missionrobot.robotDSL.Sound;
import des.missionrobot.robotDSL.Speed;
import des.missionrobot.robotDSL.Task;
import des.missionrobot.robotDSL.Time;
import des.missionrobot.robotDSL.Trigger;
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
			case RobotDSLPackage.ACTION:
				sequence_Action(context, (des.missionrobot.robotDSL.Action) semanticObject); 
				return; 
			case RobotDSLPackage.ARM_OP:
				sequence_ArmOp(context, (ArmOp) semanticObject); 
				return; 
			case RobotDSLPackage.BOOL:
				sequence_Bool(context, (Bool) semanticObject); 
				return; 
			case RobotDSLPackage.COLOR:
				sequence_Color(context, (Color) semanticObject); 
				return; 
			case RobotDSLPackage.DIRECTION:
				sequence_Direction(context, (Direction) semanticObject); 
				return; 
			case RobotDSLPackage.DISTANCE:
				sequence_Distance(context, (Distance) semanticObject); 
				return; 
			case RobotDSLPackage.FLAG:
				sequence_Flag(context, (Flag) semanticObject); 
				return; 
			case RobotDSLPackage.GOAL:
				sequence_Goal(context, (Goal) semanticObject); 
				return; 
			case RobotDSLPackage.MISSION:
				sequence_Mission(context, (Mission) semanticObject); 
				return; 
			case RobotDSLPackage.MISSIONS:
				sequence_Missions(context, (Missions) semanticObject); 
				return; 
			case RobotDSLPackage.NEGATION:
				sequence_Negation(context, (Negation) semanticObject); 
				return; 
			case RobotDSLPackage.SENSOR:
				sequence_Sensor(context, (Sensor) semanticObject); 
				return; 
			case RobotDSLPackage.SOUND:
				sequence_Sound(context, (Sound) semanticObject); 
				return; 
			case RobotDSLPackage.SPEED:
				sequence_Speed(context, (Speed) semanticObject); 
				return; 
			case RobotDSLPackage.TASK:
				sequence_Task(context, (Task) semanticObject); 
				return; 
			case RobotDSLPackage.TIME:
				sequence_Time(context, (Time) semanticObject); 
				return; 
			case RobotDSLPackage.TRIGGER:
				sequence_Trigger(context, (Trigger) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (
	 *         (moveDir=Direction duration=INT? speed=Speed?) | 
	 *         (turnDir=Direction (degr=INT | trig+=Trigger+)) | 
	 *         op=ArmOp | 
	 *         sound=Sound | 
	 *         (flag=[Flag|ID] bool=Bool) | 
	 *         cent='Centalize'
	 *     )
	 */
	protected void sequence_Action(ISerializationContext context, des.missionrobot.robotDSL.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ArmOp returns ArmOp
	 *
	 * Constraint:
	 *     opType=ArmOpType
	 */
	protected void sequence_ArmOp(ISerializationContext context, ArmOp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.ARM_OP__OP_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.ARM_OP__OP_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArmOpAccess().getOpTypeArmOpTypeEnumRuleCall_0(), semanticObject.getOpType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Bool returns Bool
	 *
	 * Constraint:
	 *     boolType=BoolType
	 */
	protected void sequence_Bool(ISerializationContext context, Bool semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.BOOL__BOOL_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.BOOL__BOOL_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBoolAccess().getBoolTypeBoolTypeEnumRuleCall_0(), semanticObject.getBoolType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Color returns Color
	 *
	 * Constraint:
	 *     colorName=ColorName
	 */
	protected void sequence_Color(ISerializationContext context, Color semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.COLOR__COLOR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.COLOR__COLOR_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColorAccess().getColorNameColorNameEnumRuleCall_0(), semanticObject.getColorName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Direction returns Direction
	 *
	 * Constraint:
	 *     dir=DirectionVal
	 */
	protected void sequence_Direction(ISerializationContext context, Direction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.DIRECTION__DIR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.DIRECTION__DIR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDirectionAccess().getDirDirectionValEnumRuleCall_0(), semanticObject.getDir());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Distance returns Distance
	 *
	 * Constraint:
	 *     (rangeBool=Bool distance=INT)
	 */
	protected void sequence_Distance(ISerializationContext context, Distance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.DISTANCE__RANGE_BOOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.DISTANCE__RANGE_BOOL));
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.DISTANCE__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.DISTANCE__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDistanceAccess().getRangeBoolBoolParserRuleCall_0_0(), semanticObject.getRangeBool());
		feeder.accept(grammarAccess.getDistanceAccess().getDistanceINTTerminalRuleCall_2_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Flag returns Flag
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Flag(ISerializationContext context, Flag semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.FLAG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.FLAG__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFlagAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Goal returns Goal
	 *
	 * Constraint:
	 *     ((goalEvents+=Trigger* timeout=Time finishActions+=Action+) | (goalEvents+=Trigger* finishActions+=Action+) | finishActions+=Action+)?
	 */
	protected void sequence_Goal(ISerializationContext context, Goal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Mission returns Mission
	 *
	 * Constraint:
	 *     (name=ID flagsList+=Flag* taskList+=Task+ goal=Goal)
	 */
	protected void sequence_Mission(ISerializationContext context, Mission semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Missions returns Missions
	 *
	 * Constraint:
	 *     (name=ID missionList+=Mission+)
	 */
	protected void sequence_Missions(ISerializationContext context, Missions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Negation returns Negation
	 *
	 * Constraint:
	 *     NOT='not'
	 */
	protected void sequence_Negation(ISerializationContext context, Negation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.NEGATION__NOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.NEGATION__NOT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNegationAccess().getNOTNotKeyword_0(), semanticObject.getNOT());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sensor returns Sensor
	 *
	 * Constraint:
	 *     sensorType=SensorType
	 */
	protected void sequence_Sensor(ISerializationContext context, Sensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.SENSOR__SENSOR_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.SENSOR__SENSOR_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSensorAccess().getSensorTypeSensorTypeEnumRuleCall_0(), semanticObject.getSensorType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sound returns Sound
	 *
	 * Constraint:
	 *     soundName=SoundName
	 */
	protected void sequence_Sound(ISerializationContext context, Sound semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.SOUND__SOUND_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.SOUND__SOUND_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSoundAccess().getSoundNameSoundNameEnumRuleCall_0(), semanticObject.getSoundName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Speed returns Speed
	 *
	 * Constraint:
	 *     speed=SpeedVal
	 */
	protected void sequence_Speed(ISerializationContext context, Speed semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.SPEED__SPEED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.SPEED__SPEED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSpeedAccess().getSpeedSpeedValEnumRuleCall_0(), semanticObject.getSpeed());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Task returns Task
	 *
	 * Constraint:
	 *     (name=ID prio=INT triggerList+=Trigger* actionList+=Action+)
	 */
	protected void sequence_Task(ISerializationContext context, Task semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Time returns Time
	 *
	 * Constraint:
	 *     sec=INT
	 */
	protected void sequence_Time(ISerializationContext context, Time semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.TIME__SEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.TIME__SEC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTimeAccess().getSecINTTerminalRuleCall_1_0(), semanticObject.getSec());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns Trigger
	 *
	 * Constraint:
	 *     (boolType=Bool? ((neg=Negation? flag=[Flag|ID]) | (sensor=Sensor (color=Color | dist=Distance | pressed='touching'))))
	 */
	protected void sequence_Trigger(ISerializationContext context, Trigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
