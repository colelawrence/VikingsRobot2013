package vikingbot2013.misc;

import edu.wpi.first.wpilibj.buttons.InternalButton;

/**
 * The SmartDashboard class of buttons and such
 * 
 * @author Cole
 * 
 */
public class SmartDash {
	// Launcher Buttons ////////////////
	// Tilt Launcher up
	private final InternalButton btnLauncherUp = new InternalButton();
	// Tilt Launcher down
	private final InternalButton btnLauncherDn = new InternalButton();
	// Push Frisbee into launcher
	private final InternalButton btnLauncherFire = new InternalButton();

	// Driving Buttons ////////////////
	// Drive Forward for 1 second
	private final InternalButton btnDriveForward1s = new InternalButton();
	// Drive Forward for 3 seconds
	private final InternalButton btnDriveForward3s = new InternalButton();
	// Drive Turn Right
	private final InternalButton btnDriveTurnRight1s = new InternalButton();
	// Drive Turn Left
	private final InternalButton btnDriveTurnLeft1s = new InternalButton();

	public SmartDash() {
		
	}
}
