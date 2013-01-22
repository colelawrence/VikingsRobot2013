package vikingbot2013.misc;

import vikingbot2013.commands.driving.Drive;
import vikingbot2013.commands.driving.StopDriving;
import vikingbot2013.commands.driving.Turn;
import vikingbot2013.commands.frisbeelauncher.launcharm.PushLaunchArm;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class Gamepad1 extends Joystick{
	private final Button launchFrisbee = new JoystickButton(this, K.G1_LAUNCH_FRISBEE);
	private final Button startLaunchWheels = new JoystickButton(this, K.G1_START_LAUNCH_WHEELS);
	private final Button stopLaunchWheels = new JoystickButton(this, K.G1_STOP_LAUNCH_WHEELS);
	private final Button driveForward = new JoystickButton(this, K.G1_DRIVE_FORWARD);
	private final Button driveBackward = new JoystickButton(this, K.G1_DRIVE_BACKWARD);
	private final Button driving = new JoystickButton(this, K.G1_DRIVING);
	private final Button turning = new JoystickButton(this, K.G1_TURNING);
	private final Button turnLeft = new JoystickButton(this, K.G1_TURN_LEFT);
	private final Button turnRight = new JoystickButton(this, K.G1_TURN_RIGHT);
	
	public Gamepad1(int port) {
		super(port);

		launchFrisbee.whenPressed(new PushLaunchArm());
		startLaunchWheels.whenPressed(new PushLaunchArm());
		stopLaunchWheels.whenPressed(new PushLaunchArm());
		
		// Driving buttons
		driveForward.whenPressed(new Drive(+1));
		driveBackward.whenPressed(new Drive(-1));
		turnLeft.whenPressed(new Turn(-1));
		turnRight.whenPressed(new Turn(+1));
		driveForward.whenReleased(new StopDriving());
		driveBackward.whenReleased(new StopDriving());
		turnLeft.whenReleased(new StopDriving());
		turnRight.whenReleased(new StopDriving());
	}
	
	
}
