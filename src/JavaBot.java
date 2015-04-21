//FTC Framework v 1.0 Created by Steven Eisner,
//Gear Grinders #7265


import java.util.ArrayList;

public class JavaBot {
/*
 *JavaBot presumes some familiarity with object-oriented programming
 *
 *JavaBot is your robot.
 *
 *In this file, as well as all the classes, no proper implementation of important functions is shown.
 *
 *This is because this is meant to be a framework for you to program every year,
 *meaning that the implementation may change year after year.
 *
 *Furthermore, you will notice that there is no main class or main method, meaning THIS WILL NOT RUN.
 *It's a framework; that's okay.
 *!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 *Version 2 of the Framework to come in the fall featuring:
 *Joystick assignments
 *Motor Controller Assignments for wheels and Manipulators
 *Servo Controller Assignments for Manipulators
 *Sensor assignments
 *!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 *Your code should expand and evolve off of this.
 *
 *This is just a framework, a loose perscription for how I wold like to program my robot.
 *
 *Do with it what you will.
 *
 *If you have any feedback, good or bad, please email me personally at stevene@glenelg.org,
 *or tweet us @GearGrindersFTC.
 *
 *We compete in Maryland and are looking forward to seeing you out there :)
*/
	
	private ArrayList<Manipulator> manipulators;
	private ArrayList<Sensor> sensors;
	private Chassis chassis;
    public JavaBot(Chassis c)	//note that though the constructor takes a chassis, you will give it either				
   	{							// a "FourWheelDrive" or "TwoWheelDrive" argument
   		chassis = c;
   		manipulators = new ArrayList<Manipulator>();
   		sensors = new ArrayList<Sensor>();			
    }
    
    public void addManipulator(Manipulator m)
    {
    	manipulators.add(m);
    }
    
    public void addSensor(Sensor s)
    {
    	sensors.add(s);
    }
    public void autonomous()
    {
    	/*
    	 *This is where you will program your autonomous.
    	 *
    	 *In your main method, for autonomous, you simply have to call "JavaBot.Autonomous()".
    	 *
    	 *
    	 **/
    }
    
    
}