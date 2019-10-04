package cs520.hw2.part2;

public class Test {

	public static void main(String[] args) {
		Course currentCourse;
		
		System.out.println("Taking a regular course...");
		
		currentCourse = new Course("CS520", 815, 4);
		
		System.out.println("Printing...\n" + currentCourse.toString());
		
		System.out.println("\nTaking an online course...");
		
		currentCourse = new OnlineCourse("CS683", 1090, 4, 100);
		
		System.out.println("Printing...\n" + currentCourse.toString());
	}

}
