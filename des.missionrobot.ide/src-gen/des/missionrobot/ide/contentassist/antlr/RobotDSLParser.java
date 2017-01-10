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
					put(grammarAccess.getActionAccess().getAlternatives_1_2(), "rule__Action__Alternatives_1_2");
					put(grammarAccess.getTriggerAccess().getAlternatives_2(), "rule__Trigger__Alternatives_2");
					put(grammarAccess.getTriggerAccess().getAlternatives_2_1_1(), "rule__Trigger__Alternatives_2_1_1");
					put(grammarAccess.getDirectionValAccess().getAlternatives(), "rule__DirectionVal__Alternatives");
					put(grammarAccess.getSpeedValAccess().getAlternatives(), "rule__SpeedVal__Alternatives");
					put(grammarAccess.getArmOpTypeAccess().getAlternatives(), "rule__ArmOpType__Alternatives");
					put(grammarAccess.getSoundNameAccess().getAlternatives(), "rule__SoundName__Alternatives");
					put(grammarAccess.getSensorTypeAccess().getAlternatives(), "rule__SensorType__Alternatives");
					put(grammarAccess.getColorNameAccess().getAlternatives(), "rule__ColorName__Alternatives");
					put(grammarAccess.getBoolTypeAccess().getAlternatives(), "rule__BoolType__Alternatives");
					put(grammarAccess.getMissionsAccess().getGroup(), "rule__Missions__Group__0");
					put(grammarAccess.getMissionAccess().getGroup(), "rule__Mission__Group__0");
					put(grammarAccess.getGoalAccess().getGroup(), "rule__Goal__Group__0");
					put(grammarAccess.getGoalAccess().getGroup_0(), "rule__Goal__Group_0__0");
					put(grammarAccess.getGoalAccess().getGroup_2(), "rule__Goal__Group_2__0");
					put(grammarAccess.getTaskAccess().getGroup(), "rule__Task__Group__0");
					put(grammarAccess.getTaskAccess().getGroup_4(), "rule__Task__Group_4__0");
					put(grammarAccess.getActionAccess().getGroup_0(), "rule__Action__Group_0__0");
					put(grammarAccess.getActionAccess().getGroup_0_2(), "rule__Action__Group_0_2__0");
					put(grammarAccess.getActionAccess().getGroup_0_3(), "rule__Action__Group_0_3__0");
					put(grammarAccess.getActionAccess().getGroup_1(), "rule__Action__Group_1__0");
					put(grammarAccess.getActionAccess().getGroup_1_2_0(), "rule__Action__Group_1_2_0__0");
					put(grammarAccess.getActionAccess().getGroup_1_2_1(), "rule__Action__Group_1_2_1__0");
					put(grammarAccess.getActionAccess().getGroup_2(), "rule__Action__Group_2__0");
					put(grammarAccess.getActionAccess().getGroup_3(), "rule__Action__Group_3__0");
					put(grammarAccess.getActionAccess().getGroup_4(), "rule__Action__Group_4__0");
					put(grammarAccess.getTriggerAccess().getGroup(), "rule__Trigger__Group__0");
					put(grammarAccess.getTriggerAccess().getGroup_2_1(), "rule__Trigger__Group_2_1__0");
					put(grammarAccess.getTriggerAccess().getGroup_2_1_1_0(), "rule__Trigger__Group_2_1_1_0__0");
					put(grammarAccess.getTriggerAccess().getGroup_2_1_1_1(), "rule__Trigger__Group_2_1_1_1__0");
					put(grammarAccess.getTriggerAccess().getGroup_2_1_1_2(), "rule__Trigger__Group_2_1_1_2__0");
					put(grammarAccess.getDistanceAccess().getGroup(), "rule__Distance__Group__0");
					put(grammarAccess.getTimeAccess().getGroup(), "rule__Time__Group__0");
					put(grammarAccess.getMissionsAccess().getNameAssignment_1(), "rule__Missions__NameAssignment_1");
					put(grammarAccess.getMissionsAccess().getMissionListAssignment_3(), "rule__Missions__MissionListAssignment_3");
					put(grammarAccess.getMissionAccess().getNameAssignment_1(), "rule__Mission__NameAssignment_1");
					put(grammarAccess.getMissionAccess().getFlagsListAssignment_3(), "rule__Mission__FlagsListAssignment_3");
					put(grammarAccess.getMissionAccess().getTaskListAssignment_5(), "rule__Mission__TaskListAssignment_5");
					put(grammarAccess.getMissionAccess().getGoalAssignment_7(), "rule__Mission__GoalAssignment_7");
					put(grammarAccess.getGoalAccess().getGoalEventsAssignment_0_1(), "rule__Goal__GoalEventsAssignment_0_1");
					put(grammarAccess.getGoalAccess().getTimeoutAssignment_1(), "rule__Goal__TimeoutAssignment_1");
					put(grammarAccess.getGoalAccess().getFinishActionsAssignment_2_1(), "rule__Goal__FinishActionsAssignment_2_1");
					put(grammarAccess.getTaskAccess().getNameAssignment_1(), "rule__Task__NameAssignment_1");
					put(grammarAccess.getTaskAccess().getPrioAssignment_3(), "rule__Task__PrioAssignment_3");
					put(grammarAccess.getTaskAccess().getTriggerListAssignment_4_1(), "rule__Task__TriggerListAssignment_4_1");
					put(grammarAccess.getTaskAccess().getActionListAssignment_6(), "rule__Task__ActionListAssignment_6");
					put(grammarAccess.getActionAccess().getMoveDirAssignment_0_1(), "rule__Action__MoveDirAssignment_0_1");
					put(grammarAccess.getActionAccess().getDurationAssignment_0_2_1(), "rule__Action__DurationAssignment_0_2_1");
					put(grammarAccess.getActionAccess().getSpeedAssignment_0_3_1(), "rule__Action__SpeedAssignment_0_3_1");
					put(grammarAccess.getActionAccess().getTurnDirAssignment_1_1(), "rule__Action__TurnDirAssignment_1_1");
					put(grammarAccess.getActionAccess().getDegrAssignment_1_2_0_0(), "rule__Action__DegrAssignment_1_2_0_0");
					put(grammarAccess.getActionAccess().getTrigAssignment_1_2_1_1(), "rule__Action__TrigAssignment_1_2_1_1");
					put(grammarAccess.getActionAccess().getOpAssignment_2_1(), "rule__Action__OpAssignment_2_1");
					put(grammarAccess.getActionAccess().getSoundAssignment_3_2(), "rule__Action__SoundAssignment_3_2");
					put(grammarAccess.getActionAccess().getFlagAssignment_4_1(), "rule__Action__FlagAssignment_4_1");
					put(grammarAccess.getActionAccess().getBoolAssignment_4_3(), "rule__Action__BoolAssignment_4_3");
					put(grammarAccess.getActionAccess().getCentAssignment_5(), "rule__Action__CentAssignment_5");
					put(grammarAccess.getTriggerAccess().getBoolTypeAssignment_0(), "rule__Trigger__BoolTypeAssignment_0");
					put(grammarAccess.getTriggerAccess().getNegAssignment_1(), "rule__Trigger__NegAssignment_1");
					put(grammarAccess.getTriggerAccess().getFlagAssignment_2_0(), "rule__Trigger__FlagAssignment_2_0");
					put(grammarAccess.getTriggerAccess().getSensorAssignment_2_1_0(), "rule__Trigger__SensorAssignment_2_1_0");
					put(grammarAccess.getTriggerAccess().getColorAssignment_2_1_1_0_1(), "rule__Trigger__ColorAssignment_2_1_1_0_1");
					put(grammarAccess.getTriggerAccess().getDistAssignment_2_1_1_1_1(), "rule__Trigger__DistAssignment_2_1_1_1_1");
					put(grammarAccess.getTriggerAccess().getTouchingAssignment_2_1_1_2_1(), "rule__Trigger__TouchingAssignment_2_1_1_2_1");
					put(grammarAccess.getDistanceAccess().getRangeBoolAssignment_0(), "rule__Distance__RangeBoolAssignment_0");
					put(grammarAccess.getDistanceAccess().getDistanceAssignment_2(), "rule__Distance__DistanceAssignment_2");
					put(grammarAccess.getFlagAccess().getNameAssignment(), "rule__Flag__NameAssignment");
					put(grammarAccess.getTimeAccess().getSecAssignment_1(), "rule__Time__SecAssignment_1");
					put(grammarAccess.getDirectionAccess().getDirAssignment(), "rule__Direction__DirAssignment");
					put(grammarAccess.getSpeedAccess().getSpeedAssignment(), "rule__Speed__SpeedAssignment");
					put(grammarAccess.getArmOpAccess().getOpTypeAssignment(), "rule__ArmOp__OpTypeAssignment");
					put(grammarAccess.getSoundAccess().getSoundNameAssignment(), "rule__Sound__SoundNameAssignment");
					put(grammarAccess.getSensorAccess().getSensorTypeAssignment(), "rule__Sensor__SensorTypeAssignment");
					put(grammarAccess.getColorAccess().getColorNameAssignment(), "rule__Color__ColorNameAssignment");
					put(grammarAccess.getBoolAccess().getBoolTypeAssignment(), "rule__Bool__BoolTypeAssignment");
					put(grammarAccess.getNegationAccess().getNOTAssignment(), "rule__Negation__NOTAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalRobotDSLParser typedParser = (InternalRobotDSLParser) parser;
			typedParser.entryRuleMissions();
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
