package vikingbot2013.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import vikingbot2013.misc.K;

/**
 * This class contains all of our frisbee launcher information and hook-ups
 * 
 * 
 * @author Cole
 */
public class LaunchWheels extends Subsystem {    
    // Wheels that launch the frisbee
    private final Jaguar launchWheelsJag;
    // Adjusts the height of our launcher
    private final Jaguar frisbeeLifterJag;
    
    /**
     * The Driver class to wrap the control of our two wheels together for
     * easier control and cleanliness
     */
    public LaunchWheels() {
        launchWheelsJag = new Jaguar(K.PORT_FRISBEE_LAUNCHER_BELTCIM);
        frisbeeLifterJag = new Jaguar(K.PORT_FRISBEE_LAUNCHER_LIFTER);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    // Lift Procedures
    public void liftLauncherUp() {
    	frisbeeLifterJag.set(+K.SPEED_FRISBEE_LIFTER);
    }
    public void liftLauncherDn() {
    	frisbeeLifterJag.set(-K.SPEED_FRISBEE_LIFTER);
    }
    public void liftLauncherStop() {
    	frisbeeLifterJag.set(0);
    }
    
    // Launch Wheels Procedure
    public void startLaunchWheels() {
    	launchWheelsJag.set(K.SPEED_FRISBEE_LAUNCHER_WHEELS);
    }
    public void stopLaunchWheels() {
    	launchWheelsJag.set(0);
    }
}