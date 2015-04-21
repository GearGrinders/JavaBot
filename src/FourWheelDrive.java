//FTC Framework v 1.0 Created by Steven Eisner,
//Gear Grinders #7265

import java.util.ArrayList;

public class FourWheelDrive {

	private ArrayList<Wheel> wheels = new ArrayList<Wheel>();
	
	
    public FourWheelDrive(Wheel wTopLeft, Wheel wTopRight, Wheel wBackLeft, Wheel wBackRight) 
    {
    	wheels.add(wTopLeft);
    	wheels.add(wTopRight);
    	wheels.add(wBackLeft);
    	wheels.add(wBackRight);
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
    	wheels.get(2).goForTime(sec, direction);
    	wheels.get(3).goForTime(sec, direction);
    }
    
    public void goForDistance(float distance, boolean direction)
    {
    	wheels.get(0).goForDistance(distance, direction);
    	wheels.get(1).goForDistance(distance, direction);
    	wheels.get(2).goForDistance(distance, direction);
    	wheels.get(3).goForDistance(distance, direction);
    }
    
    
}