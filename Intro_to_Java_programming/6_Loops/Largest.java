// BlueJ project: lesson6/largest1
// Read in the values that the user supplies, stopping
// when the user enters Q (or any other input that is
// not a number). Print out the largest value that
// the user entered.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Largest
{
    public static void main(String[] args)
    throws FileNotFoundException 
    {
        String filename= "input.txt";
        File inputFile = new File(filename);
        //-------
        Scanner in = new Scanner(inputFile);
        System.out.println("Enter values, Q to quit: ");
        double largest = in.nextDouble();
        if (in.hasNextDouble()){
            while(in.hasNextDouble()){
                double input = in.nextDouble() ;
                if(input>=largest){
                    largest=input;
                }
            }
            System.out.println("Largest value: " + largest);            
        }else{
            System.out.println("Error, no values");
        }
    }
}
