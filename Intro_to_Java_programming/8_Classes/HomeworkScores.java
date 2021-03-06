// BlueJ project: lesson8/collecting2

// TODO: Reimplement this class without collecting the individual scores

/**
 * Holds the homework scores for a student.
 */
public class HomeworkScores
{
    // private double[] scores;
    // private int currentSize; // The current size of the array of scores
    // private static final int MAX_SIZE = 1000;

    private double total;
    private int size;
    private double tempScore;

    HomeworkScores()
    {
        // scores = new double[MAX_SIZE];
        // currentSize = 0;
	total = 0;
	size = 0;
	tempScore = 0;
    }

    /**
     *  Adds a score.
     *  @param score the score to add
     */
    public void addScore(double score)
    {
        // if (currentSize < scores.length)
        // {
        //     scores[currentSize] = score;
        //     currentSize++;
        // }
0	if (size ==0) {
	    tempScore = score;
	}else if (tempScore>=score) {
	    tempScore = score;
	}

	total += score;
	size++;
	
    }

    /**
     *  Calculates the sum of all the scores entered, dropping the lowest
     *  score if there is more than one.
     *  @return the sum of all the scores in scores.
     */
    public double getTotalExcludingLowest()
    {
        // if (currentSize == 0)
        // {
        //     return 0;

        // }
        // else if (currentSize == 1)
        // {
        //     return scores[0];
        // }
        // else
        // {
        //     double sum = 0;
        //     for (int i = 0; i < currentSize; i++)
        //     {
        //         sum = sum + scores[i];
        //     }
        //     return sum - getLowest();
        // }
	double result;
	if (size == 0){
	    result = 0;
	}else if (size ==1){
	    result = total;
	}else{
	    total -= tempScore;
	    result = total;
	}

	return result;
    }

   // /**
   //  *  Calculates the lowest score.
   //  *  @return the lowest score or 0 if there are no scores 
   //  */
   //  private double getLowest()
   //  {
   //      if (currentSize == 0) 
   //      {
   //          return 0;
   //      }
   //      else
   //      {
   //          double lowest = scores[0];
   //          for (int i = 1; i < currentSize; i++)
   //          {
   //              if (scores[i] < lowest)
   //              {
   //                  lowest = scores[i];
   //              }
   //          }
   //          return lowest;
   //      }
   //  }       
}
