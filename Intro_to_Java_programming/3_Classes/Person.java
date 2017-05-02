public class Person{
	//-----------variables-------------
	private String name;
	private String friends;
	private int numberOfFriends;

	//-----------Constructor-----------
	public Person(String aName){
		name = aName;
		friends="";
		numberOfFriends = 0;
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

	public int getNumberOfFriends(){
		return numberOfFriends;
	}

	public void makeMutualFriend(Person friend){
		this.addFriend(friend);
		friend.addFriend(this);
	}

	public void mutualUnFriend(Person nonFriend){
		this.unFriend(nonFriend);
		nonFriend.unFriend(this);
	}

}