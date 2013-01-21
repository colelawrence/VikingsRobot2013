/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingbot2013;

/**
 * This is what I envision the gameplay class to be.
 * This should be all autonomous decision making and robot controlled decisions
 * in gameplay.
 * @author Cole
 */
public class RobotAI {
	// Called rC for less verbose references
    private final RobotCommander rC;
    
    public RobotAI(Robot robot){
        rC = robot.getRobotCommander();
    }
    
    public void init() {
        
    }
    
    public void run() {
        
    }
    
    public void recordChanges() {
    	rC.getDriveWithJoystick();
    }
}
