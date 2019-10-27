package cs520.module2.L3_inheritance.sample4;

// Example4.java
// Demonstrates inheritance and method overriding

import javax.swing.JOptionPane;

// The Main Class
public class Example4
{
	public static void main(String[] args)
	{
		OnlineStudent 		s1;
		TraditionalStudent s2;
		
		// Create an Online Student and set the properties
		s1	= new OnlineStudent("Bob", "321-456-1234", "MS in CIS");
		s1.setHomeworkScore(90.0);
		s1.setExamScore(75.0);
		s1.setDiscussionScore(100.0);
	
		// Create a Traditional Student and set the properties
		s2	= new TraditionalStudent("Alice","456-324-3456","MS in CS");
		s2.setHomeworkScore(90.0);
		s2.setExamScore(75.0);
	
		// Display the scores
		JOptionPane.showMessageDialog(null, 
				s1.getName() + "'s score is " + s1.computeScore() +
				"\n" + s2.getName() + "'s score is " + s2.computeScore()
				);
			}
}







