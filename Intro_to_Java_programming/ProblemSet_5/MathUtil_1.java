// Complete this method to read integer scores from the user and find the average
// Stop asking for input when the user enters a negative number.
// Keep a running total and keep track of the number of entries,
// then find and return the average

// Be sure not to divide by 0. Return 0 if no scores are entered

import java.util.Scanner;

public class MathUtil
{
    public double averageScore()
    {
        //TODO Find and return the average of the numbers entered.
        //use this for the prompt
        Scanner input = new Scanner(System.in);
        double sum=0;
        int count=0;
        int flag=0;
        
        System.out.print("Enter a score. -1 to quit: ");
        if(input.hasNextInt()){
            flag=input.nextInt();
        }
        do{
            count++;
            sum+=flag;
            System.out.print("Enter a score. -1 to quit: ");
            if(input.hasNextInt()){
                flag=input.nextInt();
            }    
        }while (flag!=-1);
        
        if(count==0){
            return 0;
        }else{
            return (double)(sum/count);
        }
    }

    public static void main(String[] args) {
        MathUtil test = new MathUtil();
        System.out.println(test.averageScore());
    }
}
