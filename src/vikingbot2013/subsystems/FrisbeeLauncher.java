/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingbot2013.subsystems;

import vikingbot2013.RobotControl;

/**
 * This is the Frisbee Launcher Object's Class
 * We will send information that concerns the the launcher through here.
 * Most of this code is going to be used in the autonomous part of the competition
 *
 * @author Cole
 */
public class FrisbeeLauncher {
    // Control our robot
    final RobotControl robotControl;
    // Later we will need to add hooks for physical connections on the robot
    
    public FrisbeeLauncher(RobotControl robotcontrol){
        robotControl = robotcontrol;
    }
}
