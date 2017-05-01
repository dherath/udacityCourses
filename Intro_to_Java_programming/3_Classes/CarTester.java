public class CarTester extends Car{
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.addGas(20);
		car1.addMilesPerGalon(50);
		car1.drive(100);
		System.out.println("Miles driven -> "+car1.getMilesDriven());
		System.out.println("Gas in tank -> "+car1.getGasInTank());
		//System.out.println("Actual gas level ->"+car1.);
	}
}