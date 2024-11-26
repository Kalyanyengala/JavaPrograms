package SImpleJavaPrograms;

import java.util.Scanner;

public class NumberOfDigitsInGivenNumber_Demo
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scanner.nextInt();
		scanner.close();
		int digitCount = 0;
		while(number > 0)
		{
			digitCount++;
			number = number / 10;
		}
		System.out.println("number of digits in given number :" + digitCount);
		
	}

}
