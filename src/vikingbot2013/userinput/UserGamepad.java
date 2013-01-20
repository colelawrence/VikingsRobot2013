/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingbot2013.userinput;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import vikingbot2013.maps.RobotMap;

/**
 * This class will receive input from our pad and communicate that back and
 * forth with the UserInput
 * 
 * @author Cole
 */
public class UserGamepad {
    private final UserInput ui;
    
    public UserGamepad(UserInput u){
        // Declare our UserInput
        ui=u;
        
        //Declare our controls
        Joystick stick = new Joystick(RobotMap.JOYSTICK_1_PORT);
        //Button button = new JoystickButton(stick, buttonNumber);
    }
}
