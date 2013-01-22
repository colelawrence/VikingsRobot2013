/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingbot2013.commands;

import vikingbot2013.AscentRobot;
import vikingbot2013.OI;
import vikingbot2013.subsystems.DriveTrain;
import vikingbot2013.subsystems.LaunchArm;
import vikingbot2013.subsystems.LaunchWheels;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author Cole
 */
public abstract class CommandBase extends Command{   
    public static OI oi;
    public static DriveTrain driveTrain;
    public static LaunchWheels launchWheels;
    public static LaunchArm launchArm;

    public CommandBase(String name){
        super(name);
    }
    public CommandBase(float seconds){
        super(seconds);
    }
    public CommandBase(String name, float seconds){
        super(seconds);
    }
    public CommandBase(){
    	super();
    }
    public static void init(AscentRobot ar) {
    	oi = new OI();
    	driveTrain = new DriveTrain();
    	launchWheels = new LaunchWheels();
    	launchArm = new LaunchArm();
    	
        // Show what command your subsystem is running on the SmartDashboard
        //SmartDashboard.putData(exampleSubsystem);
    }
    
}
