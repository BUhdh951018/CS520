package cs520.module2.L1_classes;
/**
 * Defines Employee class
 */
 
import javax.swing.JOptionPane;

public class P01_Employee
{     
   //Employee data are stored in fields or instance variables
   private String 	name;   
   private int 		startingSalary;
   private double 	timeEmployed;
   
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
   
   public void printEmployeeData()
   {
      JOptionPane.showMessageDialog(null,
         "Employee " + name + 
         "\n started with a salary of $" + getStartingSalary() + 
         "\n" + getTimeEmployed() + " years ago and has a" + 
         "\n current salary of $" + getCurrentSalary());  
   }
   
}






