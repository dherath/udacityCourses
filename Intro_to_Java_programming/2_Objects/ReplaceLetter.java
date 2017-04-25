import java.util.Scanner;

public class ReplaceLetter{
	public static void main(String args[]){
		String word,letter1,letter2;
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter word ->");
		word = reader.next();
		System.out.println("Enter letter to replace ->");
		letter1 = reader.next();
		System.out.println("Enter new letter ->");
		letter2 = reader.next();
		word = word.replace(letter1,letter2);

		System.out.println("New word -> " + word);
	}
}