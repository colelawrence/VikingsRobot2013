/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zombiehippie.frc.gameplay2013;

/**
 * Anything that has a changeable speed should extend this class
 * State will range from [-1, +1]
 * -1 being full on backwards movement
 * 0 being non moving
 * +1 being full on forwards movement
 * 
 * @author Cole
 */
public abstract class Speedable implements BackForthStop{
    // Make variables private when possible
    // All adjustments should be made through functions on this page
    private float currentSpeed = 0;
    
    public void setCurrentSpeed(float newspeed){
        //This basically says:
        // If the newspeed is between [-1, 1] set current speed to the newspeed
        // else: set the 
        if(newspeed >= -1 && newspeed <= 1) {
            currentSpeed = newspeed;
            updateSpeed();
        }
    }
    
    public void adjustCurrentSpeed(float adjustment) {
        // Add Adjustments first then we can correct it next
        currentSpeed += adjustment;
        
        // If the adjusted puts our speed out of range we put it in range and
        // continue.
        if(currentSpeed > 1) {
            // Our adjustment was too high
            currentSpeed = +1;
        } else if (currentSpeed < -1) {
            //Our adjustment was too low
            currentSpeed = -1;
        }
        
        // Our currentSpeed should be between [-1, +1] now.
        updateSpeed();
    }
    
    
    // We can add the functions from BackForthStop now that we have our
    // currentSpeed variable and updateSpeed() function
    // We use setCurrentSpeed(x) so as to not reinvent the wheel as they say.
    // It limits us from using updateSpeed() in every method also
    public void BackwardsMotion(){
        setCurrentSpeed(-1);
    }
    public void ForwardsMotion(){
        setCurrentSpeed(+1);
    }
    public void Stop(){
        setCurrentSpeed(0);
    }
    
    
    
    // The speed should only be updated by the class and its children. 
    // Updating is automatic upon adjustment and is carried out by the children
    // of this class who know what to do when the speed needs updating
    // for example: a specific motor will adjust its voltage
    protected abstract void updateSpeed();
}
