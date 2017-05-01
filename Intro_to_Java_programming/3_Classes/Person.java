public class Person
{
	private String name;
	private String friends;

	public void addFriend(Person friend)
	{
		friends += friend.name + " ";
	}
}