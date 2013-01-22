package vikingbot2013.commands.driving;

import vikingbot2013.commands.CommandBase;
import vikingbot2013.misc.K;

public class TurnLeft extends CommandBase {
	/**
	 * Create a new TurnLeft Command
	 * @param seconds Seconds to execute this command
	 */
	public TurnLeft(float seconds){
		super(seconds);
	}
	public TurnLeft() {
		super();
	}
	@Override
	protected void initialize() {
		requires(driveTrain);
		
		// Set the speed of our drive wheels to default
		// and set our veer to -1 to set direction left
		driveTrain.set(K.SPEED_DRIVE_WHEELS_DEFAULT, -1);
	}

	@Override
	protected void execute() {
		driveTrain.setSpeed(K.SPEED_DRIVE_WHEELS_DEFAULT);
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
