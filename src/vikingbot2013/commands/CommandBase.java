/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingbot2013.commands;
import vikingbot2013.RobotCommander;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Cole
 */
public abstract class CommandBase extends Command{
    // All Commands are going to hook up into the robotCommander
    private final RobotCommander robotCommander;
    
    public CommandBase(RobotCommander r){
        robotCommander=r;
    }
    public void init() {

        // Show what command your subsystem is running on the SmartDashboard
        //SmartDashboard.putData(exampleSubsystem);
    }
    
}
