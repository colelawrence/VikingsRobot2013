/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zombiehippie.frc.gameplay2013;

/**
 * This is an Interface to make it easier to define robotic part objects that 
 * have the BACKWARDS, FORWARDS, OFF states
 * Any object that has these toggleable states should implement this class
 * 
 * @author Cole
 */
public interface BackForthStop {
    public void ForwardsMotion();
    public void BackwardsMotion();
    public void Stop();
}