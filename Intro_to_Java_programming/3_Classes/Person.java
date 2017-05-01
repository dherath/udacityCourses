public class Person
{
	private String name;
	private String friends;

	public void addFriend(Person friend)
	{
		friends += friend.name + " ";
	}

	public void unfriend(Person nonFriend)
	{
		friends = friends.replace(nonFriend.name+" ","");
	}
}