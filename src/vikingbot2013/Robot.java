/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingbot2013;

import edu.wpi.first.wpilibj.IterativeRobot;
import vikingbot2013.userinput.UserInput;
/**
 * This class is used to glue our robot's objects together.
 * 
 * Almost no decision making/controlling should be made here.
 * @author Cole
 */
public class Robot extends IterativeRobot{
    private final RobotControl control;
    private final RobotCommander commander;
    private final RobotAI ai;
    private final UserInput ui;
    
    public Robot(){
        // Initiallization of the robot's core
        
        // RobotControl handles Ports, and mechanical parts of the Robot
        control = new RobotControl(this);
        
        // RobotCommander facilitates commands over the robot
        commander = new RobotCommander(this);
        
        // RobotAI is everything the robot does and does not necessarily focus
        // on the Autonomous period
        ai = new RobotAI(this);
        
        // The user input is everything that is user controlled; gamepads,
        // buttons, computer commands, etc. and it connects those with commands.
        ui = new UserInput(this);
        
        // Start-up the AI
        ai.init();
    }
    
    // This is where everything will start
    public static void initiallize(){
        Robot robot = new Robot();
    }
    
    // Log our messages to the user
    public static void log(String msg){
        System.out.println("[Victor] "+msg);
    }
    
    
    public RobotCommander getRobotCommander(){
        return commander;
    }
    public RobotControl getRobotControl(){
        return control;
    }
    public RobotAI getAI(){
        return ai;
    }
}
