/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingbot2013;

// We are going need all them commands

/**
 * This is the glue that sticks all of the robot commands together
 * @author Cole
 */
public class RobotCommander {
    private final Robot robot;
    public RobotCommander(Robot r){
       robot = r;
    }
    
    /**
     * Will command to start throwing a Frisbee. If the Frisbee is not ready it
     * will not be thrown unless it is forced
     * @param force Force throw the Frisbee
     */
    public void launchFrisbee(boolean force) {
        
    }
}
