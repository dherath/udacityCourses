public class Car
{
	private double milesDriven;
	private double gasInTank;
	private double milesPerGallon; // depends on car

	public void drive(double distance)
	{
		milesDriven = milesDriven + distance;
		double gasConsumed = distance/milesPerGallon;
		gasInTank -=gasConsumed;
	}

	public void addMilesPerGalon(double amount){
		milesPerGallon = amount;
	}

	public void addGas(double amount)
	{
		gasInTank+=amount;
	}

	public double getMilesDriven()
	{
		return milesDriven;
	}

	public double getGasInTank()
	{
		return gasInTank;
	}

}