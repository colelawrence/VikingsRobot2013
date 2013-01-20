/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingbot2013;

import vikingbot2013.commands.userinput.DriveWithJoystick;

// We are going need all them commands

/**
 * This is the glue that sticks all of the robot commands together
 * @author Cole
 */
public class RobotCommander {
    private final Robot robot;
    
    // User input commands
    private final DriveWithJoystick driveWithJoystick;
    
    public RobotCommander(Robot r){
       robot = r;
       driveWithJoystick = new DriveWithJoystick(robot);
    }
    
    
    public DriveWithJoystick getDriveWithJoystick(){
        return driveWithJoystick;
    }
}
