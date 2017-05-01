public class CopyStrings{
	public static void main(String[] args) {
		String greeting = "Hello,World!"	;
		String greeting2 = greeting;
		greeting2.toUpperCase();
		System.out.println("greeting 1 ->"+greeting);
		System.out.println("greeting2 -> "+greeting2);
		//there are no mutators of strings 
	}
}