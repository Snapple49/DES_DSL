/*
 * generated by Xtext 2.10.0
 */
package des.missionrobot.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RobotDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("des/missionrobot/parser/antlr/internal/InternalRobotDSL.tokens");
	}
}