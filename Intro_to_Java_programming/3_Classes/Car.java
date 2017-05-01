public class Car{

	//---------------variables---------------------
	private double milesDriven;
	private double gasInTank;
	private double milesPerGallon; // depends on car

	//--------------Constructor--------------------
	public Car(double mpg){
		milesDriven =0;
		gasInTank =0;
		milesPerGallon=mpg;
	}

	//---------------Methods-----------------------
	public void drive(double distance){
		milesDriven = milesDriven + distance;
		double gasConsumed = distance/milesPerGallon;
		gasInTank -=gasConsumed;
	}

	//public void setMilesPerGalon(double amount){
	//	milesPerGallon = amount;
	//}

	public void addGas(double amount){
		gasInTank+=amount;
	}

	public double getMilesDriven(){
		return milesDriven;
	}

	public double getGasInTank(){
		return gasInTank;
	}

}