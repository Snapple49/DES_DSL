/**
 * generated by Xtext 2.10.0
 */
package des.missionrobot;

import des.missionrobot.RobotDSLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class RobotDSLStandaloneSetup extends RobotDSLStandaloneSetupGenerated {
  public static void doSetup() {
    RobotDSLStandaloneSetup _robotDSLStandaloneSetup = new RobotDSLStandaloneSetup();
    _robotDSLStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
