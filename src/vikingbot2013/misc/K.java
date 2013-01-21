package vikingbot2013.misc;

/**
 * Various static values for our robot.
 * @author Cole
 *
 */
public interface K {
	/*   
     *    PORTS      I´´,  ,´`.  I´´,  ´´T´´  /´´
     *               I´´   `..'  I´`.    I    ..7
     * 
     * 
     */
	public static final int PORT_DRIVING_WHEELS_LEFT		= 1; // PWM 1
	public static final int PORT_DRIVING_WHEELS_RIGHT 		= 2; // PWM 2
	public static final int PORT_FRISBEE_LAUNCHER_BELTCIM	= 3; // PWM 3
	public static final int PORT_FRISBEE_LAUNCHER_LIFTER	= 4; // PWM 4
	public static final int PORT_JOYSTICK_1					= 1; // Port 1
		
	
	/*
     *    BUTTONS   I´D  I  I  ´´T´´  ´´T´´  ,´`.  I`.I  /´´
     *              I.D  `..I    I      I    `..´  I `I  ..7
     *   
     */

	public static final int USER_G1_AXIS_LEFT_STICK_X 	= 1;
	public static final int USER_G1_AXIS_LEFT_STICK_Y 	= 2;
	public static final int USER_G1_AXIS_TRIGGER 		= 3;
	public static final int USER_G1_AXIS_RIGHT_STICK_X 	= 4;
	public static final int USER_G1_AXIS_RIGHT_STICK_Y	= 5;
	public static final int USER_G1_AXIS_DPAD_X			= 6;

	public static final int USER_G1_BUTTON_A			= 1;//  / Y \
	public static final int USER_G1_BUTTON_B			= 2;// |X + B|
	public static final int USER_G1_BUTTON_X			= 3;//  \ A /
	public static final int USER_G1_BUTTON_Y			= 4;
	public static final int USER_G1_BUTTON_LB			= 5;
	public static final int USER_G1_BUTTON_RB			= 6;
	public static final int USER_G1_BUTTON_BACK			= 7;
	public static final int USER_G1_BUTTON_START		= 8;
	public static final int USER_G1_BUTTON_LEFT_STICK	= 9;
	public static final int USER_G1_BUTTON_RIGHT_STICK 	= 10;

	
	/*
     *    MAP       IVI .^. I´´,
     *              I I I^I I´´ 
     *   
     */
	
	public static final int G1_LAUNCH_FRISBEE 		= USER_G1_BUTTON_B;
    public static final int G1_DRIVE_FORWARD_1s 	= USER_G1_BUTTON_B;
    public static final int G1_DRIVE_BACKWARD_1s 	= USER_G1_BUTTON_BACK;
    public static final int G1_TURN_RIGHT_1s 		= USER_G1_BUTTON_RB;
    public static final int G1_TURN_LEFT_1s 		= USER_G1_BUTTON_LB;
    public static final int G1_TURNING 				= USER_G1_AXIS_RIGHT_STICK_X;
    public static final int G1_DRIVING 				= USER_G1_AXIS_LEFT_STICK_Y;
}
