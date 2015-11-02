1. We want to define an interface Growable. Many things are Growable. Fill in the blank in the given header.

public interface Growable 
{ ... }

2. We want to declare an interface Readable. It has one method read(). Read() takes no parameters and is void. Complete the code

public interface Readable
{  void read();  }

3. A class Dog wishes to implement the Growable interace. Complete the class header to do that.

public class Dog implements Growable

4. The class Billboard implements the Readable interface. It has one method read() which is void and takes no parameters. Bill board may contain many methods but there is one method that is required. Provide the header for that method

public void read()
{  ..  }

5. What is the name of the metod that a class must provide if the class implements the Comparable interface from the standard Java library?

compareTo()

6. // Here is a class called UnitCircle. Its radius is an int. A couple of methods have been
// provided.

// Add the code so that the UnitCircle class implements the Comparable interface

/**
 * Represents a circle whose radius is multiples of the unit circle - a circle with radius 1
 */
// TODO: add everything necessary for this class to implement Comparable
// HINT: There are two things you need to do
public class UnitCircle implements Comparable<UnitCircle>
{
    private int radius;

    public UnitCircle(int radius)
    {
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public String toString()
    {
        return "UnitCircle[r=" + radius + "]";
    }

    //... other methods
    public int compareTo(UnitCircle x)
    {
        int answer = x.getRadius();
        if (answer < radius) {return 1;}
        else if (answer == radius) {return 0;}
        else return -1;
    }
}

=============================================================================
7. String and Integer classes both implement the Comparable interface.
For each of the following statements mark if it is valid or invalid

Comparable c1 = new String("Hello");	valid
Comparable c2 = new Integer(42);		valid
Comparable c3 = new Comparable();		invalid
String s = c1;							invalid

=============================================================================
