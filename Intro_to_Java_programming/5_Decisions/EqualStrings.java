public class EqualStrings{
	public static void main(String[] args) {
		String first = "Uda";
		String second = "city";
		String firstAndSecond = first+second;
		String third = "Udacity";
		if(firstAndSecond.equals(third)){// == checks the location also in addition to content
			System.out.println("They are the same");
		}else{
			System.out.println("firstAndSecond is "+firstAndSecond);
		}
	}
}