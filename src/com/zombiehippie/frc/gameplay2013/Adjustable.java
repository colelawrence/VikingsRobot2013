/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zombiehippie.frc.gameplay2013;

/**
 * Anything that has a changeable value should extend this class
 * State will range from [-1, +1]
 * -1 being full on backwards movement / turning left
 * 0 being non moving
 * +1 being full on forwards movement / turning right
 * 
 * @author Cole
 */
public abstract class Adjustable implements BackForthStop{
    // Make variables private when possible
    // All adjustments should be made through functions on this page
    private float value = 0;
    
    public void setValue(float newvalue){
        //This basically says:
        // If the newvalue is between [-1, 1] set current value to the newvalue
        // else: set the 
        if(newvalue >= -1 && newvalue <= 1) {
            value = newvalue;
            update();
        }
    }
    
    public void adjustCurrentValue(float adjustment) {
        // We will let the setCurrentValue(x) handle this request for
        // cleanliness.
        setValue(value + adjustment);
    }
    
    // We can add the functions from BackForthStop now that we have our
    // currentValue variable and update() function
    // We use setValue(x) so as to not reinvent the wheel as they say.
    // It limits us from using update() in every method also
    public void BackwardsMotion(){
        setValue(-1);
    }
    public void ForwardsMotion(){
        setValue(+1);
    }
    public void Stop(){
        setValue(0);
    }
    
    // We will need to use this method when we use update() in the child
    // classes
    public float getValue() {
        return value;
    }
    
    // The value should only be updated by the class and its children. 
    // Updating is automatic upon adjustment and is carried out by the children
    // of this class who know what to do when the value needs updating
    // for example: a specific motor will adjust its voltage
    protected abstract void update();
}
