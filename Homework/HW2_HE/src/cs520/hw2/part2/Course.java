package cs520.hw2.part2;

public class Course {
	private String courseName;
	private int costPerCredit;
	private int numberOfCredits;

	public Course(String courseName, int costPerCredit, int numberOfCredits) {
		this.courseName = courseName;
		this.costPerCredit = costPerCredit;
		this.numberOfCredits = numberOfCredits;
		System.out.println("In Course Constructor values set:\n CourseName = " + 
		getCourseName() + ", CostPerCredit = $" + 
		getCostPerCredit() + ", NumberOfCredits = " + getNumberOfCredits());	
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
		return getCostPerCredit() * getNumberOfCredits();
	}
	
	public String toString() {
		return "Course: " + getCourseName() + "@ $" + getTotalTuition();
	}
}
