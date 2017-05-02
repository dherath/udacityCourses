public class Person{
	//-----------variables-------------
	private String name;
	private String friends;
	private int numberOfFriends;

	//-----------Constructor-----------
	public Person(String aName){
		name = aName;
		friends="";
	}

	//-----------Method----------------
	public void addFriend(Person friend)
	{
		friends += friend.name + " ";
		numberOfFriends++;
	}

	public void unFriend(Person nonFriend)
	{
		friends = friends.replace(nonFriend.name+" ","");//mutator
		numberOfFriends--;
	}

	public String getFriends(){
		if(friends !=null && !friends.isEmpty()){
			return friends;
		}else{
			return name+" has no friends";
		}
	}
}