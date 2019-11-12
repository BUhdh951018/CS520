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
		
		BufferedReader reader = new BufferedReader(fileReader);
		
		try {
			String content = reader.readLine().trim();
			
			System.out.println("Input file processing...");
			
			while (content != null) {
				Student student = processInputData(content);
				studentQueue.add(student);
				studentMap.put(student.getName(), student);
				content = reader.readLine();
			}
			
			Iterator<Student> queueIterator = studentQueue.iterator();
			
			System.out.println("\nInterating over student list...");
			
			while (queueIterator.hasNext()) {
				System.out.println(queueIterator.next().toString());
			}
			
			System.out.println("\nInteraing over student map...");
			
			Iterator<String> keyIterator = studentMap.keySet().iterator();
			
			while (keyIterator.hasNext()) {
				String nextKeyString = keyIterator.next();
				System.out.println(studentMap.get(nextKeyString).toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static Student processInputData(String line) {
		StringTokenizer tokenizer = new StringTokenizer(line, ",");
		
		Student currentStudent = new Student(tokenizer.nextToken());
		
		while (tokenizer.hasMoreTokens()) {
			currentStudent.addHomeworkGrade(Integer.parseInt(tokenizer.nextToken().trim()));
		}
		
		System.out.println(currentStudent.toString());
		
		return currentStudent;
	}
}
