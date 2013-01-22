/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingbot2013.commands;

import vikingbot2013.AscentRobot;
import vikingbot2013.OI;
import vikingbot2013.subsystems.DriveTrain;
import vikingbot2013.subsystems.FrisbeeLauncher;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author Cole
 */
public abstract class CommandBase extends Command{   
    public static OI oi;
    public static DriveTrain driveTrain;
    public static FrisbeeLauncher frisbeeLauncher;
    
    public CommandBase(String name){
        super(name);
    }
    public CommandBase(){
    	super();
    }
    public static void init(AscentRobot ar) {
    	oi = new OI();
    	driveTrain = new DriveTrain();
    	frisbeeLauncher = new FrisbeeLauncher();
    	
        // Show what command your subsystem is running on the SmartDashboard
        //SmartDashboard.putData(exampleSubsystem);
    }
    
}
