package vikingbot2013.misc;

import vikingbot2013.commands.driving.Drive;
import vikingbot2013.commands.driving.StopDriving;
import vikingbot2013.commands.frisbeelauncher.launcharm.PushLaunchArm;
import vikingbot2013.commands.frisbeelauncher.launchwheels.StartLaunchWheels;
import vikingbot2013.commands.frisbeelauncher.launchwheels.StopLaunchWheels;
import edu.wpi.first.wpilibj.buttons.InternalButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The SmartDashboard class of buttons and such
 * 
 * @author Cole
 * 
 */
public class SmartDash {
	private final SmartDashboard smartDashboard = new SmartDashboard();
	
	// Launcher Buttons ////////////////
	// Tilt Launcher up
	private final InternalButton btnLaunchWheelsStart = new InternalButton();
	// Tilt Launcher down
	private final InternalButton btnLaunchWheelsStop = new InternalButton();
	// Push Frisbee into launcher
	private final InternalButton btnLauncherFire = new InternalButton();

	// Driving Buttons ////////////////
	// Drive Forward for as long as the button is held
	private final InternalButton btnDriveForward = new InternalButton();
	// Drive Turn Right
	private final InternalButton btnDriveTurnRight1s = new InternalButton();
	// Drive Turn Left
	private final InternalButton btnDriveTurnLeft1s = new InternalButton();

	public SmartDash() {
		btnLaunchWheelsStart.whenPressed(new StartLaunchWheels());
		btnLaunchWheelsStop.whenPressed(new StopLaunchWheels());
		
		btnLauncherFire.whenPressed(new PushLaunchArm());
		
		btnDriveForward.whenPressed(new Drive(1));
		btnDriveForward.whenReleased(new StopDriving());
	}
}
