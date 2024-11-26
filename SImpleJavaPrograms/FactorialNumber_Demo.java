package SImpleJavaPrograms;

import java.util.Scanner;

public class FactorialNumber_Demo
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number :");
		int number = scanner.nextInt();
		scanner.close();
		int FactorialNumb = 1 ;
		for(int i = 1; i<= number ; i++)
		{
			FactorialNumb = FactorialNumb * i;
		}
		System.out.println("Factorial Number is :"+FactorialNumb);	
		
	}

}
