//FTC Framework v 1.0 Created by Steven Eisner,
//Gear Grinders #7265

import java.util.ArrayList;


public class TwoWheelDrive extends Chassis{	//this needs to be its own function as the functions will differ
											//from four wheel drive.
	
	private ArrayList<Wheel> wheels = new ArrayList<Wheel>();
	
    public TwoWheelDrive(Wheel wLeft, Wheel wRight)
    {
    	wheels.add(wLeft);
    	wheels.add(wRight);
    }
    
    public void turnDeg(float deg, boolean cwCcw)	//We must define our abstract functions here.
    {
    	//IMPLEMENTATION NOT SHOWN
    }
    
    public void turnTime(float sec, boolean cwCcw)
    {
    	//IMPLEMENTATION NOT SHOWN
    }
    
    public void goForTime(float sec, boolean direction)
    {
    	wheels.get(0).goForTime(sec, direction);
    	wheels.get(1).goForTime(sec, direction);
    }
    
    public void goForDistance(float distance, boolean direction)
    {
    	wheels.get(0).goForDistance(distance, direction);
    	wheels.get(1).goForDistance(distance, direction);
    }
    
    
    
    
}