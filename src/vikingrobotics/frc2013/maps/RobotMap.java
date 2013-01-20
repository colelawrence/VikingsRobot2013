/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingrobotics.frc2013.maps;

/**
 * This class is used as a quick adjust of magic numbers to reduce code hunting.
 * 
 * 
 * @author Cole
 */
public interface RobotMap {
    
    public static final int TEAM_NUMBER                     =   1777;
    
    
    /*   
     *    PORTS      I创,  ,碻.  I创,  创T创  /创
     *               I创   `..'  I碻.    I    ..7
     * 
     * 
     */
    public static final int DRIVING_WHEELS_LEFT_PORT        =   1;  // PWM 1
    public static final int DRIVING_WHEELS_RIGHT_PORT       =   2;  // PWM 2
    
    public static final int FRISBEE_LAUNCHER_BELTCIM_PORT   =   3;  // PWM 3
    public static final int FRISBEE_LAUNCHER_LIFTER_PORT    =   4;  // PWM 4
    
    public static final int JOYSTICK_1_PORT                 =   1;  // Port 1
    
    /*    MODULES    IVI  ,碻.  I`.  I  I  I    I.`  /创
     *               I I  `..'  I./  `..I  L..  I..  ..7
     */
}
