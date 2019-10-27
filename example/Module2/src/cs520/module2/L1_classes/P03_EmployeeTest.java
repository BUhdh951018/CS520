package cs520.module2.L1_classes;
/*
 * Tests processing of Employee information
 */
 
import javax.swing.JOptionPane;

public class P03_EmployeeTest
{  
   public static void main(String[] args)
   {  
	// Create an employee using default constructor
			P02_Employee e1 = new P02_Employee();
			
			// Display the employee
			e1.printEmployeeData();
			
			// Create another employee with the name
			P02_Employee e2 = new P02_Employee("Alice");
			
			// Display the employee
			e2.printEmployeeData();
			
			// Create another employee with the name and salary
			P02_Employee e3 = new P02_Employee("Bob", 60000);
					
			// Display the employee
			e3.printEmployeeData();
			
			// Create another employee with the name, salary,
			// and time employed
			P02_Employee e4 = new P02_Employee("Charlie", 70000, 2);
							
			// Display the employee
			e4.printEmployeeData();
      
     
      }
      
   }