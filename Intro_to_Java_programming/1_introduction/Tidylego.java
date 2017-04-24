public class Tidylego{
	public static void main(String args[]){
		String[] sample ={"b","b","y","y","b","y"};// given input
		boolean notInOrder=true;
		String tempChar;

		System.out.println("Initial Sample -> \n");
		for(int i=0;i<sample.length;i++){
			System.out.print(sample[i]+" ");
		}
		System.out.println("\nAfter Switch -> \n");		
		while(notInOrder){
			for (int i=0 ; i < sample.length-1 ; i++){
				if( sample[i].equals("b") && sample[i+1].equals("y")){
					tempChar=sample[i];
					sample[i]=sample[i+1];
					sample[i+1]=tempChar;
				}
			}
			if(sample[0].equals("y") && sample[1].equals("y") && sample[2].equals("y") ){
				notInOrder = false;
			}
			for(int i=0;i<sample.length;i++){
				System.out.print(sample[i]+" ");
			}
			System.out.print("\n");
		}
	}
}