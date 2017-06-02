public class PersonTest{
	public static void main(String[] args) {
		Person dinal = new Person("dinal");
		Person chang = new Person("chang");
		Person sara = new Person("sara");
		Person ann = new Person("ann");
		sara.addFriend(chang);
		sara.addFriend(dinal);
		sara.addFriend(ann);

		System.out.println("saras friends -> "+sara.getFriends(","));
		System.out.println("saras friends -> "+sara.getFriends("-"));		
		System.out.println("saras newest friend -> "+sara.getFriend(2));
		// sara.unFriend(dinal);
		// sara.unFriend(chang);
		// System.out.println("saras friends -> "+sara.getFriends());

	}
}