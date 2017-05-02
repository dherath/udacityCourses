public class PersonTest{
	public static void main(String[] args) {
		Person dinal = new Person("dinal");
		Person chang = new Person("chang");
		Person sara = new Person("sara");
		sara.addFriend(chang);
		sara.addFriend(dinal);

		System.out.println("saras friends -> "+sara.getFriends());

	}
}