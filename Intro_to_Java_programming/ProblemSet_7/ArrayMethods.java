// Complete the methods below. These methods manipulate Arrays of Strings

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 7 - Question 1" for some tips on 
// how to begin.

import java.util.Arrays;

public class ArrayMethods
{
    String[] list; //instance variable
    /**
     * Constructor for objects of class ArrayMethods
     */
    public ArrayMethods(String[] list)
    {
        // initialise instance variables
        this.list = list;
    }

    /**
     * Determines if the array is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array  is sorted, else false.
     */
    public boolean isSorted()
    {
        // TODO: Write the code to loop through the array and determine that each
        // successive element is larger than the one before it
	for (int i=0;i<list.length-1;i++)   {
	    for (int j = i+1 ; j<list.length; j++)   {
		if (list[i].toLowerCase().compareTo(list[j].toLowerCase())>0) {
		    return false; 
		}
	    }
	} 
       return true;
    }

    /**
     * Replaces all but the first and last with the larger of its to neighbors
     * You can use the compareTo to determine which string is larger (later in alphabetical
     * order).
     */
    public void replaceWithLargerNeighbor()
    {
	if (this.isSorted()) {
	    for (int i=1;i<list.length-1;i++){
		list[i] = list[i+1];
	    }
	}else{
	    String[] temp =list;
	    temp[0]=list[0];
	    for (int i=1;i<list.length-1;i++) {
		if (list[i].toLowerCase().compareTo(list[i+1].toLowerCase())>0){
		    temp[i] = list[i];
		}else{
		    temp[i] = list[i+1];
		}
	    }
	    list = temp;
	}
	
    }

    /**
     * Gets the number of duplicates in the array.
     * (Be careful to only count each duplicate once. Start at index 0. Does it match any of the other element?
     * Get the next word. It is at index i. Does it match any of the words with index > i?)
     * @return the number of duplicate words in the array.
     */
    public int countDuplicates()
    {
        // int duplicates = 0;
	// int count;
	// String[] tempList = list;
	// for (int i=0;i<tempList.length-1;i++){
	//     count =0;
	//     for (int j=1;j<tempList.length;j++){
	// 	if (list[i].toLowerCase().compareTo(tempList[j].toLowerCase())==0){
	// 	    count++;
	// 	    tempList[j]="";
	// 	}
	//     }
	//     if(count>0){
	// 	duplicates++;
	//     }
	// }
        // return duplicates;
	    
    }

    /**
     * Moves any word that starts with x, y, or z to the front of the array, but
     * otherwise preserves the order
     */
    public void xyzToFront()
    {
        int insertAt = 0;

    }

    /**
     * gets the string representation of this array 
     * @return a string representation of the array. (do this with Arrays.toString(list))
     */
    public String toString()
    {
        return Arrays.toString(list);
	
    }
}
