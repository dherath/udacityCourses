public class MovetoYellowBlue{
	public static void main(String args[]){
		String[] sample = {"b","b","b","y","y","b","b"};
		int ans=0;
		for (int i=0;i<sample.length;i++){ // starts from leftmost
			if (sample[i].equals("y")){// loops through one ata time
				ans = i+1; // checks only the block to the right 
				break;
			}
		}
		System.out.println("The leftmost yellow block is at the "+ans+" position");
	} 
}