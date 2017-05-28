import java.util.Scanner;

public class InputValidation{
	public static void main(String[] args) {
		int value;
		Scanner in = new Scanner(System.in);
		do{
			System.out.print("enter integer between 0 & 100 inclusive : ");
			value=in.nextInt();
		}while (value>100 || value<0);
		System.out.println("Thank you for entering "+value);
	}
}