package vikingbot2013.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import vikingbot2013.misc.K;
import vikingbot2013.misc.Util;

/**
 * This class contains all of our driving information and hook-ups
 * 
 * 
 * @author Cole
 */
public class DriveTrain extends Subsystem {    
    // Initialize our wheels
    private final Jaguar rightJag;
    private final Jaguar leftJag;
    
    // Declare our overall Driving Speed
    private float drivingSpeed = 0;
    
    // The amount we are turning left and right
    // This ranges from [-1, +1]
    // [-1, -.5)    Lv  R^
    // (-.5,  0)    L0  R^
    // (0,   .5)    L^  R0
    // (.5,   1]    L^  Rv
    private float veer = 0;
    
    /**
     * The Driver class to wrap the control of our two wheels together for
     * easier control and cleanliness
     */
    public DriveTrain() {
        // Two motors on either side of our robot
        leftJag = new Jaguar(K.PORT_DRIVING_WHEELS_LEFT);
        rightJag = new Jaguar(K.PORT_DRIVING_WHEELS_RIGHT);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    
    /**
     * Update the veer, and the speed of the robot by joystick control
     * Probably will be on a update loop of about 15ms or less
     * @param xaxis the tilt of the Stick left and right
     * @param yaxis the tilt of the stick forwards and back
     */
    public void joyMove(float xaxis, float yaxis) {
        float x2 = xaxis * xaxis;
        float y2 = yaxis * yaxis;
        double dist = Math.sqrt(x2 + y2);
        
        // Pushing stick forward
        if(yaxis >= 0){
            setSpeed((float)dist);
        } 
        // Pulling stick back
        else {
            setSpeed((float) -dist);
        }
        
        // figure out the angle the stick is tilting in using the distance and 
        // the xaxis values
        setVeer(Util.threshold( xaxis/(float)dist, K.USER_JOYSTICK_THRESHOLD, 1f ));
        
        //update our motor speeds
        update();
    }
    
    /**
     * Set both speed and veer with a single update()
     * @param newSpeed speed of the robot [-1,+1]
     * @param newVeer direction headed of the robot [-1,+1]
     */
    public void set(float newSpeed, float newVeer){
        drivingSpeed = Util.bound(newSpeed);
        veer = Util.bound(newVeer);
        update();
    }
    
    /**
     * Set our turning direction
     * @param newveer value between [-1,+1]
     */
    public void setVeer(float newveer) {
        //Just in case our veer is out of range we will bound it
        veer = Util.bound(newveer);
        update();
    }
    public float getVeer() {
        return veer;
    }
    /**
     * Set our driving speed
     * @param newspeed value between [-1,+1]
     */
    public void setSpeed(float newspeed) {
        //Just in case our speed is out of range we will bound it
        drivingSpeed = Util.bound(newspeed);
        update();
    }
    public float getSpeed() {
        return drivingSpeed;
    }
    public void stop() {
    	set(0,0);
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
        if(getVeer() > 0) {
            // Turning Right
            rightJag.set(getSpeed());
            leftJag .set((-2*getVeer() + 1) * getSpeed());
        } else if (getVeer() < 0) {
            // Turning Left
            rightJag.set(( 2*getVeer() + 1) * getSpeed());
            leftJag .set(getSpeed());
        } else {
            // We are moving forward
            rightJag.set(getSpeed());
            leftJag .set(getSpeed());
        }
    }
}