package cs520.module2.L3_inheritance.sample2;

// Example2.java
// Demonstrates inheritance

import javax.swing.JOptionPane;

// The Main Class
public class Example2
{
	public static void main(String[] args)
	{
		Person 			p1, p2;
		Student 		s1;
		Faculty			f1;
		
		// Create the Person objects
		p1 = new Person();
		p2 = new Person("Alice", "123-45-1000");
		
		// Create a Student object
		s1 	= new Student();
		
		// Create a Faculty object
		f1 	= new Faculty();
		
		JOptionPane.showMessageDialog(null, 
				"First Person: " + p1 + "\n" + 
				"Second Person: " + p2 + "\n" + 
				"First Student: " + s1 + "\n" +
				"First Faculty: " + f1);
	}
}









