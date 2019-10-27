package cs520.module2.L3_inheritance.sample4;

public class OnlineStudent extends Student
{
	// instance variable
	private double discussionScore;
	
	// constructors
	public 	OnlineStudent()
	{
	}
	
	public OnlineStudent(String theName, String theId)
	{
		super(theName, theId);
	}
	
	public OnlineStudent(String theName,String theId,String theProgram)
	{
		super(theName, theId, theProgram);
	}
	
	// set and get methods
	public void setDiscussionScore(double score)
	{
		discussionScore = score;
	}
	
	public double getDiscussionScore()
	{
		return discussionScore;
	}
	
	// override the method from the Student class
	public double computeScore()
	{
		return 0.4 * getHomeworkScore() + 
			0.4 * getExamScore() + 
			0.2 * getDiscussionScore();
	}
}
