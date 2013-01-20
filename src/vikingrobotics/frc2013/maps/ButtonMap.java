/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingrobotics.frc2013.maps;

/**
 *
 * @author Cole
 */
public interface ButtonMap {    
    /*
     *    BUTTONS   I´D  I  I  ´´T´´  ´´T´´  ,´`.  I`.I  /´´
     *              I.D  `..I    I      I    `..´  I `I  ..7
     *   
     */
    
    public static final float JOYSTICK_THRESHOLD            =   0.2f;
    
    
    public static final int USER_GAMEPAD_AXIS_LEFT_STICK_X  =   1;
    public static final int USER_GAMEPAD_AXIS_LEFT_STICK_Y  =   2;
    public static final int USER_GAMEPAD_AXIS_TRIGGER       =   3;
    public static final int USER_GAMEPAD_AXIS_RIGHT_STICK_X =   4;
    public static final int USER_GAMEPAD_AXIS_RIGHT_STICK_Y =   5;
    public static final int USER_GAMEPAD_AXIS_DPAD_X        =   6;
    
    public static final int USER_GAMEPAD_BUTTON_A           =   1; //  /  Y  \
    public static final int USER_GAMEPAD_BUTTON_B           =   2; // | X + B |
    public static final int USER_GAMEPAD_BUTTON_X           =   3; //  \  A  /
    public static final int USER_GAMEPAD_BUTTON_Y           =   4;
    public static final int USER_GAMEPAD_BUTTON_LB          =   5;
    public static final int USER_GAMEPAD_BUTTON_RB          =   6;
    public static final int USER_GAMEPAD_BUTTON_BACK        =   7;
    public static final int USER_GAMEPAD_BUTTON_START       =   8;
    public static final int USER_GAMEPAD_BUTTON_LEFT_STICK  =   9;
    public static final int USER_GAMEPAD_BUTTON_RIGHT_STICK =   10;

}
