package cs520.module2.L1_classes;

public class P01_EmployeeTest {

	public static void main(String[] args) {
	
		// Create an employee
		P01_Employee e1 = new P01_Employee();
		
		// Display the employee
		e1.printEmployeeData();
		
		// Create another employee
		P01_Employee e2 = new P01_Employee();
		P01_Employee e3 = e2;
		
		// Set employee's data
		e2.setName("Alice");
		e2.setStartingSalary(50000);
		e2.setTimeEmployed(2);
		
		// Display the employee
		e2.printEmployeeData();
				
	}

}











