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
     * Builds an easy-to-read description of the scores in the object.
     * @return A description of the scores.
     */
    public String toString()
    {
        return Arrays.toString(Arrays.copyOf(scores, currentSize));
    }
}
