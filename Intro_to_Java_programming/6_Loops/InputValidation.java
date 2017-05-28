import java.util.Scanner;

public class InputValidation{
	public static void main(String[] args) {
		int value;
		Scanner in = new Scanner(System.in);
		do{
			System.out.println("enter integer < 100 :");
			value=in.nextInt();
		}while (value>=100);
		System.out.println("Thank you for entering "+value);
	}
}