//FTC Framework v 1.0 Created by Steven Eisner,
//Gear Grinders #7265

public interface Sensor {
    /*
     *I chose to make sensors an interface,
     *
     *mostly because I have no idea how they will work in Java.
     *
     *I'm a programmer, not a sensor expert :/
     *
     *Here, I've only defined one method for the sensors called sense.
     *
     *Each sensor senses differently, thus why this is an interface
     */
    public abstract void sense();
}