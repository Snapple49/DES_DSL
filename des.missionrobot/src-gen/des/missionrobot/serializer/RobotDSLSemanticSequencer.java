/*
 * generated by Xtext 2.10.0
 */
package des.missionrobot.serializer;

import com.google.inject.Inject;
import des.missionrobot.robotDSL.Behaviour;
import des.missionrobot.robotDSL.MoveBackward;
import des.missionrobot.robotDSL.MoveForward;
import des.missionrobot.robotDSL.RobotDSLPackage;
import des.missionrobot.robotDSL.Stop;
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
			case RobotDSLPackage.BEHAVIOUR:
				sequence_Behaviour(context, (Behaviour) semanticObject); 
				return; 
			case RobotDSLPackage.MOVE_BACKWARD:
				sequence_MoveBackward(context, (MoveBackward) semanticObject); 
				return; 
			case RobotDSLPackage.MOVE_FORWARD:
				sequence_MoveForward(context, (MoveForward) semanticObject); 
				return; 
			case RobotDSLPackage.STOP:
				sequence_Stop(context, (Stop) semanticObject); 
				return; 
			case RobotDSLPackage.TURN:
				sequence_Turn(context, (Turn) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Behaviour returns Behaviour
	 *
	 * Constraint:
	 *     (name=ID prio=INT moves=Movement)
	 */
	protected void sequence_Behaviour(ISerializationContext context, Behaviour semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.BEHAVIOUR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.BEHAVIOUR__NAME));
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.BEHAVIOUR__PRIO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.BEHAVIOUR__PRIO));
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.BEHAVIOUR__MOVES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.BEHAVIOUR__MOVES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBehaviourAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBehaviourAccess().getPrioINTTerminalRuleCall_3_0(), semanticObject.getPrio());
		feeder.accept(grammarAccess.getBehaviourAccess().getMovesMovementParserRuleCall_5_0(), semanticObject.getMoves());
		feeder.finish();
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
	 *     Movement returns Stop
	 *     Stop returns Stop
	 *
	 * Constraint:
	 *     duration=INT
	 */
	protected void sequence_Stop(ISerializationContext context, Stop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RobotDSLPackage.Literals.STOP__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RobotDSLPackage.Literals.STOP__DURATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStopAccess().getDurationINTTerminalRuleCall_1_0(), semanticObject.getDuration());
		feeder.finish();
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