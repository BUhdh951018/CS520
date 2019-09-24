package cs520.hw2.part1;

import javax.swing.JOptionPane;

public class TuitionProceduralStyle {
	public static void main(String[] args) {
		
		// let user enter the info of the first course
		String nameF = JOptionPane.showInputDialog("Enter the name of the first course:");
		int creditsF = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of credits for the first course"));
		int costF = Integer.parseInt(JOptionPane.showInputDialog("Enter the cost per creit for the first course"));
		
		// let user enter the info of the second course
		String nameS = JOptionPane.showInputDialog("Enter the name of the second course");
		int creditsS = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of credits for the second course"));
		int costS = Integer.parseInt(JOptionPane.showInputDialog("Enter the cost per credit for the second course"));
		
		// compute the tuition for the first course
		int tuitionF = creditsF * costF;
		JOptionPane.showMessageDialog(null, "Course 1:" + nameF + "\n tuition:" + tuitionF);
		// compute and show the tuition for the second course
		int tuitionS = creditsS * costS;
		JOptionPane.showMessageDialog(null, "Course 2:" + nameS + "\n tuition:" + tuitionS);
		
		// show the difference
		int diff = 0;
		if (tuitionF > tuitionS) {
			diff = tuitionF - tuitionS;
			JOptionPane.showMessageDialog(null, "Course 1 tuition " + tuitionF + " - Course 2 tuition " + tuitionS + " = " + diff);
		} else if (tuitionF < tuitionS) {
			diff = tuitionS - tuitionF;
			JOptionPane.showMessageDialog(null, "Course 2 tuition " + tuitionS + " - Course 1 tuition " + tuitionF + " = " + diff);
		} else {
			diff = 0;
			JOptionPane.showMessageDialog(null, "The tuition is same, the difference is zero.");
		}
	}
}
