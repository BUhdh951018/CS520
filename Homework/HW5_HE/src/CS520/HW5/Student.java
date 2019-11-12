package CS520.HW5;

import java.util.ArrayList;

public class Student {
	
	// instance private variables
	private String name;
	private ArrayList<Integer> homeworks;
	
	// constructor(name as the argument)
	public Student (String name){
		this.name = name;
		// initialize the homeworks arraylist
		homeworks = new ArrayList<Integer>();
	}

	// public set set method for the name instance  variable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// method void (add the homework grade)
	public void addHomeworkGrade(int grade) {
		homeworks.add(grade);
	}
	
	// method double (compute the average grade of the student)
	public double computeAverage() {
		int grade = 0;
		int sum = 0;
		for (int i = 0; i < homeworks.size(); i++) {
			grade = getHomeworkGrade(i);
			sum += grade;
		}
		return sum / homeworks.size();
	}
	
	// method int (get each grade in the arraylist)
	public int getHomeworkGrade(int index) {
		return homeworks.get(index);
	}
	
	// method String override
	public String toString() {
		return "The " + getName() + "'s average grade is " + computeAverage();
	}
}
