package vikingbot2013.commands.driving;

import vikingbot2013.commands.CommandBase;

public class DriveForward1s extends CommandBase{
	// Use 'countdown' to monitor time
	private int countdown = 1000;
	
	
	@Override
	protected void initialize() {
		
		
	}

	@Override
	protected void execute() {
		countdown--;
		
	}

	@Override
	protected boolean isFinished() {
		// If our countdown reaches 0 then the command is complete
		return countdown <= 0;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
