/*
 * generated by Xtext 2.10.0
 */
package des.missionrobot.ide.contentassist.antlr;

import com.google.inject.Inject;
import des.missionrobot.ide.contentassist.antlr.internal.InternalRobotDSLParser;
import des.missionrobot.services.RobotDSLGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class RobotDSLParser extends AbstractContentAssistParser {

	@Inject
	private RobotDSLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalRobotDSLParser createParser() {
		InternalRobotDSLParser result = new InternalRobotDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
					put(grammarAccess.getMovementAccess().getAlternatives(), "rule__Movement__Alternatives");
					put(grammarAccess.getMissionAccess().getGroup(), "rule__Mission__Group__0");
					put(grammarAccess.getBehaviourAccess().getGroup(), "rule__Behaviour__Group__0");
					put(grammarAccess.getMoveForwardAccess().getGroup(), "rule__MoveForward__Group__0");
					put(grammarAccess.getMoveBackwardAccess().getGroup(), "rule__MoveBackward__Group__0");
					put(grammarAccess.getTurnAccess().getGroup(), "rule__Turn__Group__0");
					put(grammarAccess.getStopAccess().getGroup(), "rule__Stop__Group__0");
					put(grammarAccess.getSoundAccess().getGroup(), "rule__Sound__Group__0");
					put(grammarAccess.getIOAccess().getGroup(), "rule__IO__Group__0");
					put(grammarAccess.getTriggerAccess().getGroup(), "rule__Trigger__Group__0");
					put(grammarAccess.getDeviceAccess().getGroup(), "rule__Device__Group__0");
					put(grammarAccess.getMissionAccess().getNameAssignment_1(), "rule__Mission__NameAssignment_1");
					put(grammarAccess.getMissionAccess().getBehaviourListAssignment_3(), "rule__Mission__BehaviourListAssignment_3");
					put(grammarAccess.getMissionAccess().getGoalConditionAssignment_5(), "rule__Mission__GoalConditionAssignment_5");
					put(grammarAccess.getBehaviourAccess().getNameAssignment_1(), "rule__Behaviour__NameAssignment_1");
					put(grammarAccess.getBehaviourAccess().getPrioAssignment_3(), "rule__Behaviour__PrioAssignment_3");
					put(grammarAccess.getBehaviourAccess().getDeviceListAssignment_5(), "rule__Behaviour__DeviceListAssignment_5");
					put(grammarAccess.getBehaviourAccess().getActionListAssignment_7(), "rule__Behaviour__ActionListAssignment_7");
					put(grammarAccess.getBehaviourAccess().getTriggerListAssignment_9(), "rule__Behaviour__TriggerListAssignment_9");
					put(grammarAccess.getMoveForwardAccess().getFspeedAssignment_1(), "rule__MoveForward__FspeedAssignment_1");
					put(grammarAccess.getMoveBackwardAccess().getBspeedAssignment_1(), "rule__MoveBackward__BspeedAssignment_1");
					put(grammarAccess.getTurnAccess().getAngleAssignment_1(), "rule__Turn__AngleAssignment_1");
					put(grammarAccess.getStopAccess().getDurationAssignment_1(), "rule__Stop__DurationAssignment_1");
					put(grammarAccess.getSoundAccess().getSoundNameAssignment_1(), "rule__Sound__SoundNameAssignment_1");
					put(grammarAccess.getIOAccess().getMessageAssignment_1(), "rule__IO__MessageAssignment_1");
					put(grammarAccess.getTriggerAccess().getConditionAssignment_1(), "rule__Trigger__ConditionAssignment_1");
					put(grammarAccess.getDeviceAccess().getTypeAssignment_1(), "rule__Device__TypeAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalRobotDSLParser typedParser = (InternalRobotDSLParser) parser;
			typedParser.entryRuleMission();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RobotDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RobotDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
