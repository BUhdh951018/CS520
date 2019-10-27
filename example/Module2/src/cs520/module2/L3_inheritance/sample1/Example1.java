package cs520.module2.L3_inheritance.sample1;

// Example1.java
// Description: The base class of our hierarchy

import javax.swing.JOptionPane;

// The Main Class
public class Example1
{
	public static void main(String[] args)
	{
		Person 	p1, p2, p3;

		p1 = new Person();	
		p2 = new Person("Alice", "123-45-1000");
		p3 = new Person("Bob", "456-78-2000");
		
		JOptionPane.showMessageDialog(null, 
			"First Person: " + p1 + "\n" + 
			"Second Person: " + p2.toString() + "\n" +
			"Third Person: " + p3.toString());
	}
}







