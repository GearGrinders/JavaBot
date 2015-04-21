//FTC Framework v 1.0 Created by Steven Eisner,
//Gear Grinders #7265

public interface Manipulator
{
/*
 Every Manipulator is so different, that it may as well just be an interface.
 
 An interface has no defined functions. Only declarations.
 
 Here, we will only declare one function: operate.
 
 Operate takes no inital arguments. It can be overloaded if necessary. It is a void as it will not return anything,
 
 But rather complete an action.
 
 To actually work with this interface, you will need to create a new class that implements this interface.
 
 */
public abstract void operate();
    
    
}