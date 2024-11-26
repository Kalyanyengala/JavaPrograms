package SImpleJavaPrograms;

import java.util.Scanner;

public class Print_QuotientAndReminder_Demo 
{
//	public static void main(String[] args)
//	{
//		
//		int divident = 50;
//		int divisor = 2;
//		int quotient = divident / divisor ;
//		int reminder = divident % divisor ;
//		
//		System.out.println("Printing quotient :" + quotient);
//		System.out.println("Printing reminder :" + reminder);
//		
//	}
	
	// Example 2 
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter firstNumber:");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter secondNumber:");
		int secondNumber = scanner.nextInt();
		scanner.close();
		
		System.out.println("Printing Quotient value:" + firstNumber / secondNumber);
		System.out.println("Printing Reminder value:" + firstNumber % secondNumber);
		
	}
	
	
	
	
	
	
	

}
