package vikingbot2013;

import vikingbot2013.misc.Gamepad1;
import vikingbot2013.misc.K;
import vikingbot2013.misc.SmartDash;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;

/**
 * This class handles our connections
 * 
 * @author Cole
 *
 */
public class OI {
	private SmartDash smartDash;
	private Gamepad1 gamepad1;   // port 1
	private Joystick gamepad2;   // port 1
	private Joystick gamepad3;   // port 1
	private DriverStation m_ds;

	public OI() {
		gamepad1 = new Gamepad1(K.PORT_JOYSTICK_1);
	}
}
