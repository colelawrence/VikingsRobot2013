/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingbot2013.components;

import vikingbot2013.RobotControl;
import vikingbot2013.components.LimitedValue;
import vikingbot2013.components.Limited;
import vikingbot2013.components.Motor;

/**
 * This class contains all of our driving information and hook-ups
 * 
 * 
 * @author Cole
 */
public class DrivingWheels extends Limited{    
    // Initialize our wheels
    private final Motor rightSideDriving;
    private final Motor leftSideDriving;
    
    // The amount we are turning left and right
    // This ranges from [-1, +1]
    // [-1, -.5)    Lv  R^
    // (-.5,  0)    L0  R^
    // (0,   .5)    L^  R0
    // (.5,   1]    L^  Rv
    private LimitedValue veer = new LimitedValue();
    
    /**
     * Update the veer, and the speed of the robot by joystick control
     * Probably will be on a update loop of about 15ms or less
     * @param xaxis the tilt of the Stick left and right
     * @param yaxis the tilt of the stick forwards and back
     */
    public void updateFromJoystick(float xaxis, float yaxis) {
        float x2 = xaxis * xaxis;
        float y2 = yaxis * yaxis;
        double dist = Math.sqrt(x2 + y2);
        
        // Pushing stick forward
        if(yaxis >= 0){
            setValue((float)dist);
        } 
        // Pulling stick back
        else {
            setValue((float) -dist);
        }
        
        // figure out the angle the stick is tilting in using the distance and 
        // the xaxis values
        veer.setValue(xaxis/(float)dist);
    }
    
    
    /**
     * The Driver class to wrap the control of our two wheels together for
     * easier control and cleanliness
     * 
     * @param robotcontrol the robot control
     * @param rightSideCID the Component ID to assign our right side driving wheel
     * @param leftSideCID the Component ID to assign our left side driving wheel
     */
    public DrivingWheels(RobotControl robotcontrol, int rightSideCID, int leftSideCID) {
        // Two 5v motors on either side of our robot
        rightSideDriving = new Motor(robotcontrol, rightSideCID, 5);
        leftSideDriving = new Motor(robotcontrol, leftSideCID, 5);
    }
    
    
    /**
     * Adjust the speed at which the robot's wheels are moving
     */
    public void update(){        
        // Depending on how much shift there is, will determine how fast the
        // individual sides are rotating their wheels.
        // getValue() is our robot's speed.
        // when our robot is not moving turning our shift would be .5, which
        // will end up limiting our robot's speed so we do some math here.
        
        // Check the direction we are turning
        if(veer.getValue() > 0) {
            // Turning Right
            rightSideDriving.setValue(getValue());
            leftSideDriving .setValue((-2*veer.getValue() + 1) * getValue());
        } else if (veer.getValue() < 0) {
            // Turning Left
            rightSideDriving.setValue(( 2*veer.getValue() + 1) * getValue());
            leftSideDriving .setValue(getValue());
        } else {
            // We are moving forward
            rightSideDriving.setValue(getValue());
            leftSideDriving .setValue(getValue());
        }
    }
}