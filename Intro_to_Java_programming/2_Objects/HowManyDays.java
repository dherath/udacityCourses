import java.util.Scanner;

public class HowManyDays{
// Lesson 2 - Objects Vid 19
// calculates number of days betwen two days 
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);// to get user input
		int year[] = new int[2];
		int month[] = new int[2];
		int date[] = new int[2];
		int diff;
		for(int i=0;i<year.length;i++){
			int val = i+1;
			System.out.println("\nEnter year "+val+" ->");
			year[i] = scan.nextInt();
			System.out.println("\nEnter month (1-12) ->");
			month[i] = scan.nextInt();
			System.out.println("\nEnter date ->");
			date[i]= scan.nextInt();
		}
		diff = (year[1]-year[0])*365 + (Math.abs(month[1]-month[0]))*30 + Math.abs(date[1]-date[0]);
		System.out.println("\n number of days in between = "+diff);
	}
}