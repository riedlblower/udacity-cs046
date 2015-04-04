//
//Complete the class TripPlan which describes the cities that are visited by a tour conducted by Java Now Tours.
//Keep an arraylist of cities (just the string name). Have methods to add a city, remove a city,
//to return the names of the cities in a String, and to reverse the order of the elements in the array list.
//
//Notice that the reverse method is void.

import java.util.ArrayList;

/**
 * A TripPlan represents a trip and holds a collection of city names.
 */
public class TripPlan
{
    // TODO: add instance variable here
    ArrayList<String> cities; //instance variable
    
    /**
     * Constructs an empty trip.
     */
    public TripPlan()
    {
        // TODO: Initialize the instance variable
        cities = new ArrayList<String>();
    }

    /**
     * Add a city to the list.
     * @param cityName the city to add
     */
    public void addCity(String cityName)
    {
        // TODO: Write code to add a city to the array list instance variable
        cities.add(cityName);
    }

    /**
     * Returns a string describing the object.
     * @return a string in the format "TripPlan[cityName1,cityName2,...]"
     */
    public String toString()
    {
       // System.out.println(cities);
        //String TripPlan = "TripPlan[";
        //for (int i = 0; i < cities.size()-1; i++)   //get all bar last city
       // {
       //     TripPlan = TripPlan + cities.get(i) + ",";   
       // }
       // TripPlan = TripPlan + cities.get(cities.size()-1) + "]";
       /// return TripPlan;
        return "TripPlan" + cities.toString().replace(", ",",");
    }

    /**
     * Removes a city form the this trip
     * @param cityName city to remove
     */
    public void removeCity(String cityName)
    {
        // TODO: Write code to remove a city to the array list instance variable
        cities.remove(cityName);
    }

    /**
     * Reverses the elements in the itinerary.
     */
    public void reverse()
    {
        int insertAt = 0;
        for (int i = cities.size()-1; i > 0; i--)
        {
            // put last city to front of array, then to 2nd loccation, 3rd, etc.
            cities.add(insertAt,cities.remove(cities.size()-1));
            insertAt++;
        }
    }
}
