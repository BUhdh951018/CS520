package cs520.module4.Collections;

import java.util.LinkedList;
import java.util.Collection;

public class LinkedListDemo {

	public static void main(String[] args) {
		// Create an empty list of String objects
		LinkedList<String> colorList = new LinkedList<String>();
		
		System.out.printf("Initial size = %d\n",
				colorList.size());
					
		// Add elements to the list (in this case String objects)
		colorList.add("Red");
		System.out.println("Colors: " + colorList);
		
		colorList.add("Green");
		System.out.println("Colors: " + colorList);
		
		colorList.add("Blue");
		System.out.println("Colors: " + colorList);
		
		System.out.printf("Size = %d\n", colorList.size());
	
		System.out.println("Customized list printing:");
		for (int i = 0; i < colorList.size(); i++)
		{
			System.out.printf(" Index: %d, Element: %s\n",
					i, colorList.get(i));
		}		
		
		System.out.println("For-Each Loop:");
		for (String element : colorList)
		{
			System.out.printf(" Element: %s\n",
					element);
		}
		
		System.out.printf("Element at position 1 = %s\n",
				colorList.get(1));
		
		// Remove Bob from the list
		System.out.println("Removing Red from the list");
		colorList.remove("Red");
		
		System.out.printf("Size = %d\n", colorList.size());
		System.out.println("List: " + colorList);
		System.out.printf("Element at position 1 = %s\n",
				colorList.get(1));
		
		// Find the index of Blue in the list
		int index = colorList.indexOf("Blue");
		System.out.printf("Index of Blue = %d\n", index);
		
		// Remove element at the above index
		String oldElement = colorList.remove(index);
		System.out.printf("Element %s at index %d is removed\n",
				oldElement, index);
		System.out.printf("Size = %d\n", colorList.size());
		System.out.println("List: " + colorList);
		
		colorList.clear();
		colorList.add("Red");
		colorList.add("Green");
		colorList.add("Blue");

		// using the Collection interface
		Collection c = colorList;
		for (String i: colorList) {
			System.out.println(i);
		}
		


	}

}
