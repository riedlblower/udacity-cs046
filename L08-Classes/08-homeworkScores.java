// BlueJ project: lesson8/collecting2

// TODO: Reimplement this class without collecting the individual scores

/**
 * Holds the homework scores for a student.
 */
public class HomeworkScores
{
    private static final int MAX_SIZE = 1000;
    private double lowest;
    private double totalscore;
    private int counter;
    
    public HomeworkScores()
    {
        lowest = 0.0;
        totalscore = 0.0;
        counter = -1;
    }

    /**
       Adds a score.
       @param score the score to add
    */
    public void addScore(double score)
    {
        totalscore = totalscore + score;
        if (counter == -1)
        {
            lowest = score;
            counter = 1;
        }
        else
        {
            if (score < lowest)
            {
                lowest = score;
            }
        counter++;
        }
    }
    

    /**
       Calculates the sum of all the scores entered, dropping the lowest
       score if there is more than one.
       @return the sum of all the scores in scores.
    */
    public double getTotalExcludingLowest()
    {
        if (counter == 1)
        {
            return totalscore;
        }
        else
        {
            return totalscore - lowest;
        }
    }    
}
