package cs520.hw3.part1;

import javax.swing.JOptionPane;

public class StringTest {
	
	public static void main(String[] args) {
		try {
			// ask user for input
			String input = JOptionPane.showInputDialog("Please enter data using the format CourseId,CourseName,Tuition");
			
			// trim input 
			input = input.trim();
			
			// display input
			System.out.println(input);
			//find the first comma
			int firstComma = input.indexOf(',');
			// get the course_id from input
			String courseId = input.substring(0, firstComma);
			// display the firstComma and the courseId
			System.out.println("First Comma Position:" + firstComma + ", Course Id:" + courseId + ", Length:" + courseId.length());
			
			// find the second comma
			int secondComma = input.indexOf(',', firstComma + 1);
			// get the course name 
			String courseName = input.substring(firstComma + 1, secondComma);
			//display the secondComma and the course name
			System.out.println("Second Comma Position:" + secondComma + ", Course Name:" + courseName + ", Length:" + courseName.length());
			
			// get tuition 
			int tuition = Integer.parseInt(input.substring(secondComma + 1));
			if (tuition < 0) 
				throw new Exception("Error: Tuition must be a positive number");
			System.out.println("Regular Tuition $" + tuition + ", Discount Tuition $" + (int)(tuition * 0.75));
		} catch (NullPointerException e) {
			System.out.println("ERROR: User click cancel button. Program terminated!");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("ERROR: User enter a digital number of tuition.");
			e.printStackTrace();
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("ERROR: User only enter part of the data.");
			e.printStackTrace();
		} catch (Exception e) {
			//System.err.println(e);
			e.printStackTrace();
		}
	}
}
