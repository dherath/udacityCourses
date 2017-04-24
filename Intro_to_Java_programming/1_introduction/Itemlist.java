public class Itemlist{
	public static void main(String args[]){
		double[] price = {1.00,10.00};
		double cost=0,tax,tip;
		for (int i=0;i<price.length;i++){
			tax = price[i]*0.08;
			tip = price[i]*0.18;
			cost +=price[i]+tax+tip;
		}
		System.out.println("Cost = "+ cost);
	}
}