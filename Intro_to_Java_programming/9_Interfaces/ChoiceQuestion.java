// BlueJ project: lesson9/quiz2
import java.util.ArrayList;

/**
   A question with multiple choices.
*/
public class ChoiceQuestion extends Question
{
    // TODO: Add an ArrayList<String> instance variable to hold the choices

    ArrayList<String> choices;
    
    /**
       Constructs a choice question with no choices.
    */
    public ChoiceQuestion()
    {
        // TODO: Initialize the list of choices
	choices = new ArrayList<String>();
    }

    /**
       Adds an answer choice to this question.
       @param choice the choice to add
       @param correct true if this is the correct choice, false otherwise
    */
    public void addChoice(String choice, boolean correct)
    {
        choices.add(choice);

        // TODO: If this is the correct choice,
        // set the choice number (1, 2, 3, 4) as the answer.
        // Tip #1: What's choices.size()?
        // Tip #2: Use "" + n to change n to a string

	if (correct) {
	    String choiceString = "" + choices.size();
	    setAnswer(choiceString);
	}
    }

    public void display()
    {
	super.display();
        // Display the answer choices
        for (int i = 0; i < choices.size(); i++)  {
	    int choiceNumber = i + 1;
	    System.out.println(choiceNumber + ": " + choices.get(i));
	}
    }
}

