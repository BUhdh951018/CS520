package CS520.HW5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

import javax.imageio.IIOException;

public class Test {
	
	public static void main(String[] args) {
		// declare and initialize the student queue
		LinkedList<Student> studentQueue = new LinkedList<Student>();
		
		// declare and initialize student map
		HashMap<String, Student> studentMap = new HashMap<String, Student>();
		
		// read data.txt file
		
		// first detect whether the file is exist
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("data.txt");
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		// use BufferedReader to read the file
		BufferedReader reader = new BufferedReader(fileReader);
		
		try {
			
			// read the contents one line at a time
			String content = reader.readLine().trim();
			
			System.out.println("Input file processing...");
			
			// the loop
			while (content != null) {
				// invoke the method 
				Student student = processInputData(content);
				// add student to studentQueue
				studentQueue.add(student);
				// insert student into studentMap
				studentMap.put(student.getName(), student);
				// read the next line
				content = reader.readLine();
			}
			
			// iterate the studentQueue 
			Iterator<Student> queueIterator = studentQueue.iterator();
			
			// display each element
			System.out.println("\nInterating over student list...");
			
			while (queueIterator.hasNext()) {
				System.out.println(queueIterator.next().toString());
			}
			
			System.out.println("\nInteraing over student map...");
			
			// iterate over the keys
			Iterator<String> keyIterator = studentMap.keySet().iterator();
			
			// display the object
			while (keyIterator.hasNext()) {
				String nextKeyString = keyIterator.next();
				System.out.println(studentMap.get(nextKeyString).toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// method Student(return corresponding Student object)
	private static Student processInputData(String line) {
		
		// tokenize the string use comma delimiter
		StringTokenizer tokenizer = new StringTokenizer(line, ",");
		
		// create student object
		Student currentStudent = new Student(tokenizer.nextToken());
		
		// read the homework grade 
		while (tokenizer.hasMoreTokens()) {
			
			// use the addHomeworkGrade method to add the grade to Student object
			currentStudent.addHomeworkGrade(Integer.parseInt(tokenizer.nextToken().trim()));
		}
		
		// display the string representation 
		System.out.println(currentStudent.toString());
		
		return currentStudent;
	}
}
