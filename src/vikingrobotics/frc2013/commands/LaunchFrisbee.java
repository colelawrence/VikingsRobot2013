/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingrobotics.frc2013.commands;

import vikingrobotics.frc2013.RobotCommander;

/**
 * This is the command to launch our Frisbee after adjusting the aim
 * @author Cole
 */
public class LaunchFrisbee extends CommandBase{
    public LaunchFrisbee(RobotCommander rc) {
        super(rc);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        // Check if the Frisbee launcher wheels are spinning
        // Check if there is a Frisbee in place
        // Fire Frisbee
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
