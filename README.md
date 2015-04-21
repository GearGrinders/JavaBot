# JavaBot
A Java Framework for First Tech Challenge Robots

Hello, my name is Steven Eisner.
I'm 17, and a junior in high school. Next year will be my fourth and last year in FTC.

I am my team, 7265 Gear Grinders, programming captain. I am therefore super excited to be working with Java next year. And understandably,
a lot of people aren't. I get it. change is scary.

And that's why I've created JavaBot, a Java framework meant to help you understand the sort of organizational structure to apply to your robot
when working in JAVA. It's really not that different form RobotC; all the syntax is the same.

Now, I assume that if you're interested in this, that you aren't that frequent a visitor to GitHub. So let me first congratulate you that you
figured out to download the README. If you downloaded the ZIP, even better!

Let's talk about what I've given you in this edition:

JAVABOT V. 1.0: the Bear Necessities ;)

First there is what I'll call the main class, even though technically it's not. That's the file called "JavaBot.java". If you're using Eclipse,
open up my folder titled "src" and open the appropriate file. If you use JCREATOR, like me, you can just open up the project fiel.

The comments are really helpful in my opinion, in helping you understand exactly what I'm doing, while still leaving some mystery.

Don't expect me to tell you exactly how everything works in the code right down to the semicolon though. You need to know something.
I mention in the comments that I recommend you understand something about object oriented programming. This program will be
confusing if you don't. Google is super helpful, as are books.

Now you see me reference 3 different objects within JavaBot. I reference "Manipulators", "Sensors", and "Chassis". They should all be there in
their respective .java files. Note that sensors and manipulators are both interfaces though, with no substance. Remember that this is just a
framework.

Chassis.java is a bit more complicated. It's an abstract class. It also has two descendents (Inheritence) called TwoWheelDrive and FourWheelDrive.
The reason I made these two separate files is that the contents of the functions change depending on how many wheels you're using.

Speaking of wheels, there should also be Wheel.Java, while is as simple as it comes. Go Forward. Go backward. Am I reversed? Simple stuff?

Now, to recap. Wheels go together to make the chassis which is part of the robot along with manipulators and sensors. That's not just programming.
It's building too. A program that works with the build is good and it's efficient and it will be an asset to you not just next year, but for years to come.


If you have any questions, email me at stevene@glenelg.org,
or Tweet us @GearGrindersFTC.

CopyRight April 2015.
