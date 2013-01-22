package vikingbot2013.commands.frisbeelauncher.launchwheels;

import vikingbot2013.commands.CommandBase;

public class StartLaunchWheels extends CommandBase {
	/**
	 * Create a new StartLaunchWheels Command
	 * @param seconds Seconds to execute this command
	 */
	public StartLaunchWheels(float seconds){
		super(seconds);
	}
	public StartLaunchWheels() {
		super();
	}
	@Override
	protected void initialize() {
		requires(launchWheels);
		
		// Start launch wheels
		launchWheels.startLaunchWheels();
		
		launchArm.setLaunchReady(true);
	}

	@Override
	protected void execute() {
		launchWheels.startLaunchWheels();
	}

	@Override
	protected boolean isFinished() {
		// Using a timeout to determine the end of our command
		return isTimedOut();
	}

	@Override
	protected void end() {
		launchWheels.stopLaunchWheels();
	}

	@Override
	protected void interrupted() {
		// This might occur when another command takes over driving before timeout
		launchWheels.stopLaunchWheels();
	}

}
