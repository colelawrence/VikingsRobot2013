package vikingbot2013.commands.driving;

import vikingbot2013.commands.CommandBase;

/**
 * This command interrupts any other commands using the driveTrain subsystem
 * @author Cole
 *
 */
public class StopDriving extends CommandBase{
	@Override
	protected void initialize() {
		// requires() will interrupt the other commands using this subsystem
		requires(driveTrain);
	}

	@Override
	protected void execute() {		
	}

	@Override
	protected boolean isFinished() {
		// Just needed to interrupt the other commands
		return true;
	}

	@Override
	protected void end() {		
	}

	@Override
	protected void interrupted() {		
	}

}
