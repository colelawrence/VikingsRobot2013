package vikingbot2013.commands.driving;

import vikingbot2013.commands.CommandBase;
import vikingbot2013.misc.K;

public class DriveForward1s extends CommandBase {
	
	@Override
	protected void initialize() {
		requires(driveTrain);
		
		// Set the speed of our drive wheels to default
		// and set our veer to 0 to set direction forward
		driveTrain.set(K.SPEED_DRIVE_WHEELS_DEFAULT, 0);
		
		// Stop Command after 1 second
		setTimeout(1.0);
	}

	@Override
	protected void execute() {
		// Tests?
	}

	@Override
	protected boolean isFinished() {
		// Using a timeout to determine the end of our command
		return false;
	}

	@Override
	protected void end() {
		driveTrain.stop();
	}

	@Override
	protected void interrupted() {
		// This might occur when another command takes over driving before timeout
	}

}
