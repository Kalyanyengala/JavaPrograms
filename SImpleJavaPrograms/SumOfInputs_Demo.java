package SImpleJavaPrograms;

import java.util.Scanner;

public class SumOfInputs_Demo 
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter value:");
		int number  = scanner.nextInt();
		int sum = 0;
		
		while(number != 0)
		{
			int reminder = number % 10;
			sum = sum + reminder;
			number = number / 10;
		}
		System.out.println("Printing sum of values of given input :" + sum);		
	}

}
