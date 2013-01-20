/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zombiehippie.frc.gameplay2013;

/**
 * This object is used to glue all of our other objects together.
 * 
 * Almost no decision making/controlling should be made here.
 * @author Cole
 */
public class Robot {
    private final RobotControl robotcontrol;
    private final Gameplay gameplay;
    
    public Robot(){
        // This imagination start-up of the robot
        robotcontrol = new RobotControl(this);
        gameplay = new Gameplay(this);
    }
    
    
    public RobotControl getRobotControl(){
        return robotcontrol;
    }
    public Gameplay getGameplay(){
        return gameplay;
    }
}
