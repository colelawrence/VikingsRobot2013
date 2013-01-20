/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingrobotics.frc2013;

/**
 * This class is kind of imaginary for the moment and will contain the inactive
 * code used to control the robot. We can start working on programming our robot
 * sooner though and migrate the code later.
 * 
 * @author Cole
 */
public class RobotControl {
    private final Robot robot;
    
    // Frisbee Launcher controls
    private final FrisbeeLauncher frisbeeLauncher; 
    
    public RobotControl(Robot therobot){
        robot = therobot;
        frisbeeLauncher = new FrisbeeLauncher(this);
    }
    
    /**
     * Component Output Manipulation.
     * Manipulate power going towards different components
     * 
     * @param cID the component's id assigned at initialization
     * @param change the change in value. This can range a great deal depending on what kind of component it is
     */
    public void changeComponent(int cID, float change) {
        
    }
    
}
