/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingbot2013.commands;
import vikingbot2013.AscentRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Cole
 */
public abstract class CommandBase extends Command{   
    protected final AscentRobot robot;
    public CommandBase(AscentRobot r, String name){
        super(name);
        robot = r;
    }
    public void init() {

        // Show what command your subsystem is running on the SmartDashboard
        //SmartDashboard.putData(exampleSubsystem);
    }
    
}
