/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zombiehippie.frc.gameplay2013;

/**
 * This is what I envision the gameplay class to be.
 * This should be all autonomous decision making and robot controlled decisions
 * in gameplay.
 * @author Cole
 */
public class Gameplay {
    final RobotControl robotcontrol;
    
    public Gameplay(Robot robot){
        robotcontrol = robot.getRobotControl();
    }
}
