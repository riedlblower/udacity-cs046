// BlueJ project: lesson3/cars4

// Write a tester program that prints the actual and
// expected gas level after the given method calls.

public class CarTester
{
    public static void main(String[] args)
    {
        Car car = new Car();
        car.addGas(20);
        car.drive(100);
        System.out.println(car.getGasInTank());
        System.out.println("Expected: 18");

        // TODO: Add 20 gallons and drive 100 miles

        // TODO: Print actual and expected gas level

    }
}
