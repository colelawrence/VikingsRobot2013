/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingbot2013.misc;

/**
 *
 * @author Cole
 */
public class Util {
    
    /**
     * Get the position between two values using its percent between min and max
     * eg scaleBetween(.5, 4, 8) = 6; scale 50% between 4 and 8
     * @param t the position between the min and max; value between [0,1]
     * @param min the lower bounds of the range
     * @param max the upper bounds of the range
     * @return the position t% from min to max
     */
    public static float scaleBetween(final float t, final float min, final float max) {
        // Scale the value up and then add it to the minimum
        return min + t * (max-min);
    }
    
    /**
     * Bound a number to be between 1 and -1
     * @param a The number you want to be bounded
     * @return A number between [-1,+1]
     */
    public static float bound(float a){
        // '+' operator is unnecessary; remains for readability
        if      (a >+1) { a=+1; } 
        else if (a <-1) { a=-1; } 
        return a;
    }
    
    /**
     * Snap numbers to a certain interval.
     * Snap(8, 10) returns 10
     * Snap (2, 10) returns 0
     * Snap (17,5) returns 15
     * @param v The value to be snapped
     * @param s The step size
     * @return The snapped value, dividing this by "step" = a non decimal number
     */
    public static float snap(float v, final float s){
        // Determine the remainder after dividing our value by the step size
        final float r = v%s;
        // Find out which step the value is closer to
        if (r > s/2) { v += s-r; } // Add the step size minus the remainder
        else         { v -= r;   } // Subtract the remainder from the initial value
        return v;
    }
    
    /**
     * Use this to determine if the value is within the threshold at zero on the
     * number line. for example is .1 (v) in the threshold of .2 (thres) between 0 and 10 (maxabs)
     * if it is not then we rescale it so that we have a value between the thres and maxabs
     * e.g. threshold(.1, .2, 1) = 0;
     *      threshold(.6, .2, 1) = .5;
     * 
     * @param v the value
     * @param thres our set threshold
     * @param max the maximum of our range 
     * @return the new value with respect to the threshold
     */
    public static float threshold(final float v, final float thres, final float max) {
        if (v > thres) {
            // Our value is between our +threshold and our +max
            // return the scaled value
            return scaleBetween(v/max, thres, max);
        } else if (v < -thres) {
            // Our value is between our -threshold and our -max
            // return the scaled value
            return scaleBetween(v/max, -thres, -max);
        } else {
            // Our value is in the threshold
            return 0f;
        }
    }
}
