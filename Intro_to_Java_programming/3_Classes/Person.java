public class Person{
	//-----------variables-------------
	private String name;
	private String friends;

	//-----------Constructor-----------
	public Person(String aName){
		name = aName;
		friends="";
	}

	//-----------Method----------------
	public void addFriend(Person friend)
	{
		friends += friend.name + " ";
	}

	public void unfriend(Person nonFriend)
	{
		friends = friends.replace(nonFriend.name+" ","");
	}

	public String getfriends(){
		return friends;
	}
}