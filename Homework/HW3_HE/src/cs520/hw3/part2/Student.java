package cs520.hw3.part2;

public class Student {
	
	// declare instance variables
	private String name;
	private int homework1, homework2, homework3, homework4, homework5, homework6;
	
	// single constructor 
	public Student(String name) {
		this.name = name;
	}

	// getter setter
	public int getHomework1() {
		return homework1;
	}

	public void setHomework1(int homework1) {
		this.homework1 = homework1;
	}

	public int getHomework2() {
		return homework2;
	}

	public void setHomework2(int homework2) {
		this.homework2 = homework2;
	}

	public int getHomework3() {
		return homework3;
	}

	public void setHomework3(int homework3) {
		this.homework3 = homework3;
	}

	public int getHomework4() {
		return homework4;
	}

	public void setHomework4(int homework4) {
		this.homework4 = homework4;
	}

	public int getHomework5() {
		return homework5;
	}

	public void setHomework5(int homework5) {
		this.homework5 = homework5;
	}

	public int getHomework6() {
		return homework6;
	}

	public void setHomework6(int homework6) {
		this.homework6 = homework6;
	}
	
	// compute average grade method
	public double computeAverage() {
		return ((this.homework1 + this.homework2 + this.homework3 + this.homework4 + this.homework5 + this.homework6) / 6.0);
	}
	
	// override toStirng method
	public String toString() {
		return String.format("The %s's average grade is %.2f", name, computeAverage());
	}
}