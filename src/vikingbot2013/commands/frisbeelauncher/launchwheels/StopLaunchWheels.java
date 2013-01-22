package vikingbot2013.commands.frisbeelauncher.launchwheels;

import vikingbot2013.commands.CommandBase;

/**
 * This command interrupts any other commands using the launchWheels subsystem
 * @author Cole
 *
 */
public class StopLaunchWheels extends CommandBase {
	@Override
	protected void initialize() {
		// Requiring the launchWheels should interrupt any other
		// commands regarding the launchwheels
		requires(launchWheels);
		launchArm.setLaunchReady(false);
		launchWheels.stopLaunchWheels();
	}

	@Override
	protected void execute() {
	}

	@Override
	protected boolean isFinished() {
		// Finished immediately after interrupting
		return true;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
	}

}
