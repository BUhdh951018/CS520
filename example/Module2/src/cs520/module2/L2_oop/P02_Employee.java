package cs520.module2.L2_oop;
/**
 * Defines Employee class and demonstrates Method Overloading.
 */
 
import javax.swing.JOptionPane;

public class P02_Employee
{     
   //Employee data are stored in fields or instance variables
   private String 	name;   
   private int 		startingSalary;
   private double 	timeEmployed;
   
   // Default Constructor
   
   public P02_Employee()
   {
	   this("Unknown", 50000, 0);
   }
   
   // Constructor with one argument - name
   
   public P02_Employee(String name)
   {
	   this(name, 50000, 0);
   }
   
   // Constructor with two arguments 
   // - name and starting salary
   
   public P02_Employee(String name, int startingSalary)
   {
	   this(name, startingSalary, 0);
   }
   
   // Constructor with three arguments 
   // - name, starting salary, and time employed
   
   public P02_Employee(String name, int startingSalary, 
		   				double timeEmployed)
   {
	   this.name = name;
	   this.startingSalary = startingSalary;
	   this.timeEmployed = timeEmployed;
   }
   
   //setter or mutator methods change the field values
   public void setName(String x)
   { 
      name = x;     
   }
      
   public void setStartingSalary(int value)
   {
      startingSalary = value;
   }
   
   public void setTimeEmployed(double value)
   {
      timeEmployed = value;
   }
      
   //accessors or getter methods provide the field values 
   public String getName()
   {
      return name;
   }
      
   public int getStartingSalary()
   {
      return startingSalary;
   }  
   
   public double getTimeEmployed()
   {
      return timeEmployed;
   }   
   
   //other methods perform operations on Employee data
   public double getCurrentSalary()
   {
	   double result;
	   result = startingSalary + startingSalary*0.04*timeEmployed;
      return result;
   }
   
   public double getCurrentSalary(double raise)
   {
	   double result;
	   result = startingSalary + 
			   startingSalary * raise * timeEmployed;
      return result;
   }
   
   public double getCurrentSalary(int percentRaise)
   {
	   double result;
	   result = startingSalary + 
			   startingSalary * percentRaise * timeEmployed / 100;
      return result;
   }
   
   
   public void printEmployeeData()
   {
      JOptionPane.showMessageDialog(null,
         "Employee " + name + 
         "\n started with a salary of $ " + getStartingSalary() + 
         "\n" + getTimeEmployed() + " years ago and has a" + 
         "\n current salary of $" + getCurrentSalary());  
   }
   
}