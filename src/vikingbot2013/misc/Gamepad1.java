package vikingbot2013.misc;

import vikingbot2013.commands.frisbeelauncher.LaunchFrisbee;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class Gamepad1 extends Joystick{
	private final Button launchFrisbee = new JoystickButton(this, K.G1_LAUNCH_FRISBEE);
	private final Button driveForward1s = new JoystickButton(this, K.G1_DRIVE_FORWARD_1s);
	private final Button driveBackward1s = new JoystickButton(this, K.G1_DRIVE_BACKWARD_1s);
	private final Button driving = new JoystickButton(this, K.G1_DRIVING);
	private final Button turning = new JoystickButton(this, K.G1_TURNING);
	private final Button turnleft = new JoystickButton(this, K.G1_TURN_LEFT_1s);
	private final Button turnright = new JoystickButton(this, K.G1_TURN_RIGHT_1s);
	
	public Gamepad1(int port) {
		super(port);
		
		launchFrisbee.whenPressed(new LaunchFrisbee());
		
	}
	
	
}
