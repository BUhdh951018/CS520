package cs520.hw3.part2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test {
	public static void main(String[] args) {
		try {
			// read data.txt file
			FileReader fileReader = new FileReader("data.txt");
			
			BufferedReader reader = new BufferedReader(fileReader);
			// read file line by line use a loop
			
			try {
				String content = reader.readLine();
				while (content != null) {
					processInputData(content);
					content = reader.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			// close file reader
			fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void processInputData(String content) {
		// delimiter ","
		String delimiter = ",";
		// tokenize
		StringTokenizer stringTokenizer = new StringTokenizer(content, delimiter);
		// extract the name token
		String name = stringTokenizer.nextToken();
		
		// create a Student object
		Student currentStudent = new Student(name);
		
		// read grade one by one and set the value 
		currentStudent.setHomework1(Integer.parseInt(stringTokenizer.nextToken()));
		currentStudent.setHomework2(Integer.parseInt(stringTokenizer.nextToken()));
		currentStudent.setHomework3(Integer.parseInt(stringTokenizer.nextToken()));
		currentStudent.setHomework4(Integer.parseInt(stringTokenizer.nextToken()));
		currentStudent.setHomework5(Integer.parseInt(stringTokenizer.nextToken()));
		currentStudent.setHomework6(Integer.parseInt(stringTokenizer.nextToken()));
		
		// display the string of currentStudent object
		System.out.println(currentStudent.toString());
	}
}