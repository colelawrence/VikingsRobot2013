/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingbot2013.commands.userinput;

import vikingbot2013.commands.CommandBase;
import vikingbot2013.Robot;

/**
 *
 * @author Cole
 */
public class DriveWithJoystick extends CommandBase{
    
    
    public DriveWithJoystick(Robot r) {
        super(r,"DriveWithJoystick");
        requires(robot.getRobotControl().getDriveTrain());
    }

    protected void initialize() {
        Robot.log("[" + this.getName() + "] initialized");
    }

    protected void execute() {
        /*if (oi.getDS().getDS().getDigitalIn(kDSDigitalInputArcadeDrive)) {
         drivetrain.arcadeDrive(oi.getJoystick().getAxis(kJoystickAxisY), oi.getJoystick().getAxis(kJoystickAxisX));
         }
         else {
         if (oi.getDS().getDS().getDigitalIn(kDSDigitalInputSlowDrive)) {
         drivetrain.tankDrive(oi.getGamePad().getAxis(kGamepadAxisLeftStickY) * 0.8, oi.getGamePad().getAxis(kGamepadAxisRightStickY) * 0.8);
         }
         else {
         drivetrain.tankDrive(oi.getGamePad().getAxis(kGamepadAxisLeftStickY), oi.getGamePad().getAxis(kGamepadAxisRightStickY));
         }
         }*/
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        robot.getRobotControl().getDriveTrain().setSpeed(0);
    }

    protected void interrupted() {
        Robot.log("[" + getName() + "] interrupted");
    }
}
