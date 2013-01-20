/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingbot2013;

import vikingbot2013.subsystems.DriveTrain;
import vikingbot2013.maps.RobotMap;

/**
 * This class is kind of imaginary for the moment and will contain the inactive
 * code used to control the robot. We can start working on programming our robot
 * sooner though and migrate the code later.
 * 
 * @author Cole
 */
public class RobotControl {
    private final Robot robot;
    
    // Subsystems
    private final DriveTrain driveTrain; 
    
    public RobotControl(Robot therobot){
        robot = therobot;
        driveTrain = new DriveTrain(robot, RobotMap.DRIVING_WHEELS_LEFT_PORT, RobotMap.DRIVING_WHEELS_RIGHT_PORT);
    }
    
    // Get the drive train subsystem
    public DriveTrain getDriveTrain() {
        return driveTrain;
    }
}
