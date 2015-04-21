//FTC Framework v 1.0 Created by Steven Eisner,
//Gear Grinders #7265

public class Wheel {
	
	private int power;
	private boolean reversed;
	
    public Wheel(boolean rev)	//wheel constructor. Takes 1 argument, reversed boolean.
    {
    	reversed = rev;
    	power = 100;		//power remains at full unless otherwise specified
    }
    
    public void goForTime(float sec, boolean dir)	//takes 2 arguments(time to drive and direction to drive
    {												//direction is boolean: forward or backward
    	//IMPLEMENTATION NOT SHOWN
    }
    
    public void goForDistance(float distance, boolean dir)	//takes 2 arguments, distance and direction.
    {
    	//IMPLEMENTATION NOT SHOWN
    }
    
    //demonstration of encapsulation. Reversed is a private field, so a public function must be used to access it.
    public boolean isReversed()	
    {
    	return reversed;
    }
    public void setReversed(boolean rev)
    {
    	reversed = rev;
    }
    public int getPower()
    {
    	return power;
    }
    
    public void setPower(int newPow)
    {
    	power = newPow;
    }
    
    
}