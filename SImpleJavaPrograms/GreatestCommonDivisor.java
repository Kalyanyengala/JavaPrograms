package SImpleJavaPrograms;

import java.util.Scanner;

public class GreatestCommonDivisor
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number :");
		int firstNumber = scanner.nextInt();
		
		System.out.println("Enter number :");
		int secondNumber = scanner.nextInt();
		int greatestCommonNumber = 0;
		
		scanner.close();
		for(int i =0 ; i<= firstNumber && i<= secondNumber; i++)
		{
			if(firstNumber % 2 == 0 && secondNumber % 2 ==0)
			{
				greatestCommonNumber = i;
			}
		}
		System.out.println("Printing greatestCommonNumber is :" + greatestCommonNumber);
		
	}

}
