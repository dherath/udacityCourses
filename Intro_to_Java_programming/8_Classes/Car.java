// BlueJ project: lesson8/counting

// TODO: Provide an instance variable for counting the passengers.
// TODO: Complete the addPassenger and getPassengerCount methods.

import java.util.ArrayList;

public class Car
{
    private int numberOfSeats;
    private int numberOfPassengers;
    private String driverName;
    private ArrayList<String> passengers;

    /**
     *  Constructs a car with a given number of seats
     *  @param numberOfSeats the number of seats in this car.
     */
    public Car(int numberOfSeats)
    {
        this.numberOfSeats = numberOfSeats;
	this.driverName = null;
	this.passengers = new ArrayList<String>();
    }


    /**
     *  Adds a passenger to this car, provided that there is space.
     *  @param name the name of the passenger
     */
    public void addPassenger(String name)
    {
	if (numberOfPassengers+1<numberOfSeats){
	    numberOfPassengers++;
	    passengers.add(name);
	}
    }

    /**
     *  Gets the number of passengers in this car (not counting the driver).
     *  @return the number of passengers
     */
    public int getPassengerCount()
    {
	return numberOfPassengers;
    }

    /**
     * Gets the number of Occupants in car.
     * @return the number of occupents
     **/
    public int getOccupantCount()
    {
	int count = passengers.size();
	if (driverName != null){
	    count++;
	}
	return count;
    }

    /**
     * Sets the driver name .
     * @param the drivers name 
     **/
    public void setDriverName(String driverName)
    {
	this.driverName = driverName;
    }

    /**
     * gets the Driver Name.
     * @return the drivers name
     **/
    public String getDriverName()
    {
	if (driverName != null) {
	    return this.driverName;
	}else {
	    return "No Driver";
	}
    }
    
    /**
     * Gts the list of all the passengers in th car.
     * @return a listof the form [name1, name2, ...]
     **/
    public String getPassengerList()
    {
        String output ="[";
        if (passengers.size()==0) {
            output +="";
    	}else if (passengers.size()==1) {
    	    output += passengers.get(0);
    	}else {
    	    for (String passengerName : passengers) {
    		output += passengerName + ", ";
    	    }
    	    output = output.substring(0,output.length()-2);
    	}
        output += "]";
	return output;
    }
}
