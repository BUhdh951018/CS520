package cs520.module2.L1_classes;
@SuppressWarnings("unused")
public class P05_EmployeeTest {
	
	public static void displayNumberOfEmployees() {
		// invoke the static method
		int employeeCount = P05_Employee.getEmployeeCount();
		System.out.printf("Employee Count = %d\n",employeeCount);
	}

	public static void main(String[] args) {
	
		// Create an employee 
		P05_Employee e1 = new P05_Employee();
		displayNumberOfEmployees();
		
		// Create another employee 
		P05_Employee e2 = new P05_Employee("Alice");
		displayNumberOfEmployees();
		
		// Create another employee 
		P05_Employee e3 = new P05_Employee("Bob", 60000);
		displayNumberOfEmployees();
		
		// Create another employee 
		P05_Employee e4 = new P05_Employee("Charlie", 70000, 2);
		displayNumberOfEmployees();	
		
	}
}
