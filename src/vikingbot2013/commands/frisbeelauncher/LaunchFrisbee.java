package vikingbot2013.commands.frisbeelauncher;

import vikingbot2013.AscentRobot;
import vikingbot2013.commands.CommandBase;
import vikingbot2013.misc.K;

public class LaunchFrisbee extends CommandBase {
	@Override
	protected void initialize() {
		requires(frisbeeLauncher);
		setTimeout(K.TIME_FRISBEE_INDEXER_PUSH);
		
		
		if(frisbeeLauncher.isLaunchReady() == false) {
			AscentRobot.log("[LaunchFrisbee] Unable to launch frisbee. isLaunchReady() returned false.");
			// if the frisbee is not ready we cannot launch it.
			cancel();
			// return so as to not activate any motors
			return;
		}
		
		frisbeeLauncher.launchFrisbeePush();
	}

	@Override
	protected void execute() {
		
		
	}

	@Override
	protected boolean isFinished() {
		
		return false;
	}

	@Override
	protected void end() {
		AscentRobot.log("[LaunchFrisbee] end()");
		
		// Stop frisbee indexing motor upon timeout
		frisbeeLauncher.launchFrisbeeStop();
	}

	@Override
	protected void interrupted() {
		// Our command was cancelled due to not being ready maybe
		
	}

}
