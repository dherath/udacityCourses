// BlueJ project: lesson7/scores1

import java.util.Arrays;
import java.util.Scanner;

/**
 * Holds the homework scores for a student.
 */
public class HomeworkScores
{
    private double[] scores;
    private int currentSize; // The currentSize of the array of scores.
    private int maxScores;

    /**
     * @param maxScores the maximum number of scores this object can hold.
     */
    public HomeworkScores(int maxScores)
    {
        scores = new double[maxScores];
	this.maxScores = maxScores;
        currentSize = 0;
    }

    public void readScores(Scanner userInput)
    {
        // YOUR CODE HERE
        // Read (userInput) scores between 0 and 100 until a non number is entered.
        // Use the scanner passed in in the argument userInput.
        // Save each score that is read in the partially filled scores array.
        // Make sure not to lose track of how filled the array is.
	while(userInput.hasNextDouble()) {
	    double inputValue = userInput.nextDouble();
	    scores[currentSize] = inputValue;
	    currentSize++;
	    if (currentSize==maxScores) {
		maxScores *= 2;
		scores = Arrays.copyOf(scores,maxScores);
	    }
	}
    }

    /**
     * Calculates the Sum of all the scores entered.
     * @return the sum of all the scores in scores.
     */
    public double sumScores()
    {
        // YOUR CODE HERE
        // Sum all the scores that have been entered so far and
        // return the result.
        double val=0;
	for (int i =0;i<currentSize;i++) {
	    val += scores[currentSize];
	}
	return val;
    }

    /**
     * Calculates the average of all the scores collected so far.
     * @return the average of the scores in scores.
     */
    public double averageScore()
    {
        // TODO: Calculate the average score.
        // Add up all the scores and divide by the number of scores.
        // return the result.
	double avgVal = 0;
	if (currentSize!=0){
	    avgVal =(double) (this.sumScores()/currentSize);
	}
        return avgVal;
	
    }

    /**
     * Finds the index of the lowest score.
     * @return the index of the lowest score.
     */
    public int getLowScoreIndex()
    {
        // TODO: Find and return the index of the lowest score in scores.
        double lowestSoFar = scores[0];
	int lowestIndex =0;
        for (int i = 1; i < currentSize; i++)
	    {
		if (scores[i] < lowestSoFar)
		    {
			lowestSoFar = scores[i];
			lowestIndex = i;
		    }
	    }
        return lowestIndex;	
    }

    /**
     * Removes the lowest score.
     */
    public void removeLowest()
    {
        // YOUR CODE HERE
        // Remove the lowest score.
        // You can use any of the other methods in this class.
	double lowestVal = this.lowScore();
	int lowestIndex = this.find(lowestVal);
	this.remove(lowestIndex);
    }

    /**
     * Finds the first occurrence of the given score.
     * @param searchedValue the score to look for
     * @return the position of scoreToFind, -1 if it's not there
     */
    public int find(double searchedValue)
    {
        int pos = 0;
        boolean found = false;
        while (pos < currentSize && !found)
	    {
		if (scores[pos] == searchedValue)
		    {
			found = true;
		    }
		else
		    {
			pos++;
		    }
	    }
        if (found)
	    {
		return pos;
	    }
        else
	    {
		return -1;
	    }
    }

    /**
     * Returns the lowest of the scores.
     * @return the lowest score
     */
    public double lowScore()
    {
        double lowestSoFar = scores[0];
        for (int i = 1; i < currentSize; i++)
	    {
		if (scores[i] < lowestSoFar)
		    {
			lowestSoFar = scores[i];
		    }
	    }
        return lowestSoFar;
    }

    /**
     * Removes the score at the given position.
     * @param pos the position of the value to remove.
     */
    public void remove(int pos)
    {
        for (int i = pos + 1; i < currentSize; i++)
	    {
		scores[i - 1] = scores[i];
	    }
        currentSize--;
    }

    
    /**
     * Builds an easy-to-read description of the scores in the object.
     * @return A description of the scores.
     */
    public String toString()
    {
        return Arrays.toString(Arrays.copyOf(scores, currentSize));
    }
}
