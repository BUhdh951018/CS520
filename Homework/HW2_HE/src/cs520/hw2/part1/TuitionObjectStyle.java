package cs520.hw2.part1;

import javax.swing.JOptionPane;

public class TuitionObjectStyle {
	public static void main(String[] args) {
		Course course1 = new Course();
		Course course2 = new Course();
		
		// let user enter the info of the first course
		String nameF = JOptionPane.showInputDialog("Enter the name of the first course:");
		course1.setCourseName(nameF);
		int creditsF = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of credits for the first course"));
		course1.setNumberOfCredits(creditsF);
		int costF = Integer.parseInt(JOptionPane.showInputDialog("Enter the cost per creit for the first course"));
		course1.setCostPerCredit(costF);
				
		// let user enter the info of the second course
		String nameS = JOptionPane.showInputDialog("Enter the name of the second course");
		course2.setCourseName(nameS);
		int creditsS = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of credits for the second course"));
		course2.setNumberOfCredits(creditsS);
		int costS = Integer.parseInt(JOptionPane.showInputDialog("Enter the cost per credit for the second course"));
		course2.setCostPerCredit(costS);
				
		// compute the tuition for the first course
		course1.displayTuition();
		// compute and show the tuition for the second course
		course2.displayTuition();
				
		// show the difference
		int diff = 0;
		if (course1.getTotalTuition() > course2.getTotalTuition()) {
			diff = course1.getTotalTuition() - course2.getTotalTuition();
			JOptionPane.showMessageDialog(null, "Course 1 tuition " + course1.getTotalTuition() + " - Course 2 tuition " + course2.getTotalTuition() + " = " + diff);			
		} else if (course1.getTotalTuition() < course2.getTotalTuition()) {
			diff = course2.getTotalTuition() - course1.getTotalTuition();
			JOptionPane.showMessageDialog(null, "Course 2 tuition " + course2.getTotalTuition() + " - Course 1 tuition " + course1.getTotalTuition() + " = " + diff);
		} else {
			diff = 0;
			JOptionPane.showMessageDialog(null, "The tuition is same, the difference is zero.");
		}
	}
}
