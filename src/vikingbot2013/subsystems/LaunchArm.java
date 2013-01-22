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
public class LaunchArm extends Subsystem {
    // Pushes the frisbee into the launch wheels
    private final Jaguar frisbeeIndexerJag;
    
    private boolean launchReady = false;
    
    /**
     * The Driver class to wrap the control of our two wheels together for
     * easier control and cleanliness
     */
    public LaunchArm() {
        frisbeeIndexerJag = new Jaguar(K.PORT_FRISBEE_LAUNCHER_INDEXER);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    // Index Procedures
    public void launchFrisbeePush(){
    	frisbeeIndexerJag.set(K.SPEED_FRISBEE_INDEXER);
    }
    public void launchFrisbeeStop(){
    	frisbeeIndexerJag.set(0);
    }

    public boolean isLaunchReady() {
    	return launchReady;
    }
    public void setLaunchReady(boolean bool){
    	launchReady = bool;
    }
}