// This is part of the Person class from lesson 3.
// A String is not the right way to store the friends of a Person
// We need to refactor this code.
// Change the friends variable to store an ArrayList<String>
// that contains the names of the friends.
// Re-implement the addFriend and getFriends methods.

import java.util.ArrayList;

public class Person
{
    private String name;
    private ArrayList<Person> friendsList;
    private static final String SEPARATOR = ", ";

    public Person(String name)
    {
        this.name = name;
        this.friendsList = new ArrayList<Person>();
    }

    /**
     * Adds the given friend to this Person's friends list.
     * @param friend the friend to add.
     */
    public void addFriend(Person friend)
    {
        friendsList.add(friend);
    }

    /**
     * Gets a list of all of this Person's friends.
     * @return the names of the friends separated by a comma and a space.
     *     e.g. "Sara, Cheng-Han, Cay"
     */
    public String getFriends(String seperator)
    {
        String output="";
        for(Person friend: friendsList){
            output += friend.name + seperator;
        }
        output = output.substring(0,output.length()-seperator.length());
        return output;
    }

    /**
     * Gets a friend at a given index.
     * @param friendIndex the index at which to find the friend (starting at 0)
     * @return the name of the friend at friendIndex, or "" if the friend is not present
     */
    public String getFriend(int friendIndex)
    {
        return friendsList.get(friendIndex).name;
    }

    /**
     * Gets the number of friends this Person has.
     * @return the number of friends.
     */
    public int getNumFriends()
    {
        return friendsList.size();
    }

    /**
     * Removes nonFriend from the list of friends.
     * @param nonFriend the friend to remove
     */
    public void unfriend(Person nonFriend)
    {
        int index = find(nonFriend);
        if(index>0){
            friendsList.remove(index);            
        }
    }


    /**
     * Finds friend in the friends list
     * @param a person to search for
     * @return -1 if the person is not found. The index of the person otherwise.
     */
    public int find(Person friend)
    {
        for (int i = 0; i < friendsList.size(); i++)
        {
            if (friendsList.get(i).equals(friend))
            {
                return i;
            }
        }
        // If the person is not found by the end of the friends list
        return -1;
    }
}
