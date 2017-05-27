public class InterestCalculator
{
    public static void main(String[] args)
    {
        double balance = 100;
        int year = 0;

        while (balance < 1000000)
        {
            double interest = balance * .1;
            balance = balance + interest;
            year++;
        }
        System.out.println("It will take " + year + " years.");
    }
}