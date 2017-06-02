// Complete the method in this class to compute and return the shortest string
// (the one with the fewest characters)
// HINT: You can use the ArrayList algorithm for finding the minimum

import java.util.ArrayList;

public class StringArrayUtil
{
    public String shortestString(ArrayList<String> words)
    {
        // TODO: initialize the string to the hold the shortest string
        String shortest = words.get(0); //initialize

        for (String _word : words)
        {
        	if(shortest.length()>=_word.length()){
        		shortest=_word;
        	}
        }	
        return shortest;
    }
}
