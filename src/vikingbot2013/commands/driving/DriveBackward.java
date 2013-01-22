package vikingbot2013.commands.driving;

import vikingbot2013.commands.CommandBase;
import vikingbot2013.misc.K;

public class DriveBackward extends CommandBase {
	/**
	 * Create a new DriveBackward Command
	 * @param seconds Seconds to execute this command
	 */
	public DriveBackward(float seconds){
		super(seconds);
	}
	public DriveBackward() {
		super();
	}

	@Override
	protected void initialize() {
		requires(driveTrain);
		
		// Set the speed of our drive wheels to negative default to roll backwards
		// and set our veer to 0 to set direction forward
		driveTrain.set(-K.SPEED_DRIVE_WHEELS_DEFAULT, 0);
	}

	@Override
	protected void execute() {
		driveTrain.setSpeed(-K.SPEED_DRIVE_WHEELS_DEFAULT);
	}

	@Override
	protected boolean isFinished() {
		// Using a timeout to determine the end of our command
		return isTimedOut();
	}

	@Override
	protected void end() {
		driveTrain.stop();
	}

	@Override
	protected void interrupted() {
		// This might occur when another command takes over driving before timeout
		driveTrain.stop();
	}

}
