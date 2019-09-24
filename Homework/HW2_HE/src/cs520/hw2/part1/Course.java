package cs520.hw2.part1;

import javax.swing.JOptionPane;

public class Course {
	private String courseName;
	private int costPerCredit;
	private int numberOfCredits;
	
	public Course() {
		courseName = "";
		costPerCredit = 0;
		numberOfCredits = 0;
	}
	
	public Course(String courseName, int costPerCredit, int numberOfCredits) {
		this.costPerCredit  = costPerCredit;
		this.courseName = courseName;
		this.numberOfCredits = numberOfCredits;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCostPerCredit() {
		return costPerCredit;
	}

	public void setCostPerCredit(int costPerCredit) {
		this.costPerCredit = costPerCredit;
	}

	public int getNumberOfCredits() {
		return numberOfCredits;
	}

	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}
	
	public int getTotalTuition() {
		return numberOfCredits * costPerCredit;
	}
	
	public void displayTuition() {
		String message;
		message = "Course: " + getCourseName() + "@ $" + getTotalTuition();
		JOptionPane.showMessageDialog(null, message);
	}
}
