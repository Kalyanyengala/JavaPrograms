package SImpleJavaPrograms;

import java.util.Scanner;

public class CompareGivenNumberIs 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number :" );
		int firstNumber = scanner.nextInt();
		
		System.out.println("Enter secondnumber :" );
		int secondNumber = scanner.nextInt();
		scanner.close();
		if(firstNumber > secondNumber)
		{
			System.out.println(firstNumber + " is greaterthen : " + secondNumber);
		}
		else if(firstNumber < secondNumber)
		{
			System.out.println(firstNumber + " is lessthen : " + secondNumber);
		}
		else if(firstNumber == secondNumber) // Optional else if
		{
			System.out.println(firstNumber + "BothNumbers are equal : " + secondNumber);
		}		
	}

}
