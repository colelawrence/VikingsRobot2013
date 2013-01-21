/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingbot2013;

import edu.wpi.first.wpilibj.IterativeRobot;
/**
 * This class is used to glue our robot's objects together.
 * 
 * Almost no decision making/controlling should be made here.
 * @author Cole
 */
public class AscentRobot extends IterativeRobot{
    private final RobotAI aI;
    private final OI oI;
    
    public AscentRobot(){
        // Initiallization of the robot's core
    	oI = new OI(this);    	
        
        // RobotAI is everything the robot does and does not necessarily focus
        // on the Autonomous period
        aI = new RobotAI(this);
        
        // Start-up the AI
        aI.init();
    }
    
    public void run(){
    	aI.run();
    }
    
    // This is where everything will start
    public static void initiallize(){
        AscentRobot robot = new AscentRobot();
        robot.run();
    }
    
    // Log our messages to the user
    public static void log(String msg){
        System.out.println("[Victor] "+msg);
    }
    
    
    public RobotAI getAI(){
        return aI;
    }
}
