/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zombiehippie.frc.gameplay2013;

/**
 * This class contains all of our driving information and hook-ups
 * 
 * 
 * @author Cole
 */
public class Driver extends Adjustable{    
    // Initialize our wheels
    private final Motor rightSideDriving;
    private final Motor leftSideDriving;
    
    // The amount we are turning left and right
    private Adjuster directionX = new Adjuster();
    
    
    /**
     * The Driver class to wrap the control of our two wheels together for
     * easier control and cleanliness
     * 
     * @param robotcontrol the robot control
     * @param rightSideCID the Component ID to assign our right side driving wheel
     * @param leftSideCID the Component ID to assign our left side driving wheel
     */
    public Driver(RobotControl robotcontrol, int rightSideCID, int leftSideCID) {
        // Two 5v motors on either side of our robot
        rightSideDriving = new Motor(robotcontrol, rightSideCID, 5);
        leftSideDriving = new Motor(robotcontrol, leftSideCID, 5);
    }
    
    
    /**
     * Adjust the speed at which the robot is moving
     */
    public void update(){
        
    }
}