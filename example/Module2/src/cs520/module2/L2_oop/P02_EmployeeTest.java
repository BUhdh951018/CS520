package cs520.module2.L2_oop;
/*
 * Tests processing of Employee information
 */
 
public class P02_EmployeeTest
{  
   public static void main(String[] args)
   {  
			
			// Create an employee 
			P02_Employee e = new P02_Employee("Bob", 60000, 2);
			
			for (int raise = 2; raise <= 8; raise += 2) 
			{
				System.out.printf("%s's salary @ %d%% raise = $%.2f\n",
						e.getName(), raise, e.getCurrentSalary(raise));
			}
			
			for (double raise = 0.02; raise <= .08; raise += 0.02) 
			{
				System.out.printf("%s's salary @ %.2f raise = $%.2f\n",
						e.getName(), raise, e.getCurrentSalary(raise));
			}
      }
   }




