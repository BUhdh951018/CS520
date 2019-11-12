package cs520.module4.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		// Create an empty ArrayList of String elements
		ArrayList<String> nameList = new ArrayList<String>();
					
		// Add elements to the list (in this case String objects)
		nameList.add("Alice");
		nameList.add("Bob");
		nameList.add("Charlie");
		nameList.add("Dave");
		nameList.add("Ed");
		
		// get the iterator and iterate over the list
		Iterator<String> itr1 = nameList.iterator();
		while (itr1.hasNext())
		{
			String nextElement = itr1.next();
			System.out.printf("  Next Element: %s\n", nextElement);
		}	
		System.out.println();

	}

}
