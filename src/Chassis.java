//FTC Framework v 1.0 Created by Steven Eisner,
//Gear Grinders #7265

import java.util.ArrayList;

public abstract class Chassis {	//chassis is abstract here. We need something more specific to work properly.
	
	private ArrayList<Wheel> wheels = new ArrayList<Wheel>();
	
	
	//function is abstract. No implementation needs to be declared.
	public abstract void turnDeg(float deg, boolean cwCcw);	//takes argument of degrees to turn and direction
	
	public abstract void turnTime(float sec, boolean cwCcw);	//takes argument of seconds to turn for and direction
	
	public abstract void goForTime(float sec, boolean direction);
	
	public abstract void goForDistance(float distance, boolean direction);

	public void setSpeed(int newPow)
	{
		if(wheels != null)	//protect from null pointer exception if wheels fails to initialize
		{
			for(int i = 0; i < wheels.size(); i++)	//loop through all the wheels.
			{
				wheels.get(i).setPower(newPow);	//set each wheel = to new power.
			}
		}
		else
		{
			return;	//if null do nothing.
		}
	}
	
	
	
    
}