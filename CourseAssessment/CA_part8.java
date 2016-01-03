Course Assessment Part 8 (Intro to Java Programming)

===============================

31. Loops

Question: Come up with a situation in which you would want to use a for loops.
Why would a while loop not work as well for this case?

Answer: I would use a for loop when I know how many loops to iterate
e.g. for i = 0; i < 24; i++
e.g. one for each hour of the day

Question: Now describe a scenario in which a while loop would work better
than a for loop. What makes a while loop more suitable this time?

Answer: I use a while loop when the number of loops in unknown beforehand
e.g. while (electricty_on == false)
e.g. while the switch is off.

--------------------------------------------------

32. Interfaces or Inheritance?

I can inherit once and thereby extend the functionality of the class. With inheritance I get all the functions. 
We can have multiple interfaces. For each interface a function has to be implemented.

https://www.quora.com/What-is-the-main-difference-between-inheritance-and-interface-in-Java
A car is a vehicle (inheritance). A car can drive (interface)
Basically, an interface is just abstract methods whereas inheritance is where you copy a superclass completely, 
and them add a few other things

--------------------------------------------------
33.  Different Kinds of Variables (Parameter, instance and local)

1. A local variable is defined within the scope of a block and must be initialised before use.
A local variale is only visable within the method or block they are declared.
e.g. if (i = 10) { String s = "hello";}

2. An instance field is bound to the object itself and don't have to be initialised before use.
Instance variables are defined within a class but outside a method.
Instance variables can be seen by all methods in the class
e.g. public class Point { 
		private int xValue; 	
		}
		
3. An input parameter is passed into a method or constructor
Its scope is the method or constructor it is passed into.
e.g. public class Point { 
		private int xValue; 	
		public Point(int x){xValue=x;}
		public void setX(int x) {xValue=x;}
		}

Example of all three kinds of variables:		
e.g. public class Point { 
		private int xValue; 	
		public Point(int x){xValue=x;}
		public void showX() {
			String s = "The value is: ";
			System.out.println (s + xValue)}
		public void setX(int x) {xValue=x;}
		}
