/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingbot2013.commands;

import vikingbot2013.OI;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author Cole
 */
public abstract class CommandBase extends Command{   
    public static OI oi;
    public CommandBase(String name){
        super(name);
    }
    public CommandBase(){
    	super();
    }
    public static void init() {
    	oi = new OI();
        // Show what command your subsystem is running on the SmartDashboard
        //SmartDashboard.putData(exampleSubsystem);
    }
    
}
