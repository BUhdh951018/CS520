package cs520.hw2.part2;

public class OnlineCourse extends Course{
	private int technologyFee;
	
	public OnlineCourse(String courseName, int numberOfCredits, int costPerCredit, int technologyFee) {
		super(courseName, numberOfCredits, costPerCredit);
		this.technologyFee = technologyFee;
		
		System.out.println("In OnlineCourse Constructor values set: \n CourseName = " + 
		getCourseName() + ", CostPerCredit = $" + getCostPerCredit() + ", NumberOfCredits = " + 
		getNumberOfCredits() + ", TechnologyFee = $" + getTechnologyFee());
	}

	public int getTechnologyFee() {
		return technologyFee;
	}

	public void setTechnologyFee(int technologyFee) {
		this.technologyFee = technologyFee;
	}
	
	public int getTotalTuition() {
		return getTechnologyFee() * getNumberOfCredits() + super.getTotalTuition();
	}
	
	public String toString() {
		return "OnlineCourse: " + getCourseName() + "@ $" + getTotalTuition();
	}
}
