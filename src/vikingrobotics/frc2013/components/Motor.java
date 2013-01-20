/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingrobotics.frc2013.components;

import vikingrobotics.frc2013.RobotControl;

/**
 * This class pertains specifically to our motors and requires Adjustable to
 * voltage conversion factors
 * @author Cole
 */
public class Motor extends Adjustable{
    
    private final float multiplier;
    private final int componentID;
    private final RobotControl robotControl;
    
    /**
     * The motor is a component on our robot
     * 
     * @param rc The RobotControl
     * @param CID Component ID to assign
     * @param conversion_ratio The conversion ratio from [-1,+1] : [min_voltage,max_voltage] e.g. 5v motor = 5
     */
    public Motor(RobotControl rc, int CID, float conversion_ratio) {
        multiplier = conversion_ratio;
        componentID = CID;
        robotControl = rc;
    }
    
    public void setVoltage(float voltage) {
        // We need to convert it to an adjustable value
        // Divide by the multiplier
        voltage /= multiplier;
        
        //From Adjustable class parent
        setValue(voltage);
    }
    
    /**
     * Updates our motor's speed via RobotControl
     */
    public void update(){
        // First set voltage equal to our adjustable value between [-1, +1]
        float voltage = getValue();
        // Multiply it by our multiplier
        voltage *= multiplier;
        
        robotControl.changeComponent(componentID, voltage);
    }
}
