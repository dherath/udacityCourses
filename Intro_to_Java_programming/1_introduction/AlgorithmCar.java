public class AlgorithmCar{
	public static void main(String[] args){
		int[] price={15000,30000},mpg={10,50};
		int distance = 50000, unitp=4;
		int gasCost[]=new int[2];
		int totalCost[]=new int[2];

		for (int i =0 ;i<2 ;i++){
			gasCost[i] = (distance/mpg[i])*unitp;
			totalCost[i]= price[i]+gasCost[i];		
		}

		System.out.println("Car 1 = "+totalCost[0]+", Car 2 = "+totalCost[1]);

		if(totalCost[0]<totalCost[1]){
			System.out.println("Buy Car 1 (total price ="+totalCost[0]+")");
		}else{
			System.out.println("Buy Car 2 (total price ="+totalCost[1]+")");
		}

	}
}
