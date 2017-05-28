// Bluej project: lesson6/average
// Write a program that helps a user compute their average time
// for sprinting 100 meters.

import java.util.Scanner;

public class AverageDemo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int count = 0;
		double sum = 0;
		double temp;
		

		// TODO: Collect values from the user until they enter a 0.
		// Track the sum of all the inputs so you can calculate the
		// average at the end
		System.out.print("Enter a value, q to quit: "); 
		while(input.hasNextDouble()){
			temp=input.nextDouble();
			sum+=temp;
			count++;
			System.out.print("Enter a value, q to quit: ");    
	    }

		double average = sum / count;
		System.out.printf("Average: %.2f\n", average);
	}
}
