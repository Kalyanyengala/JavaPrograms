package SImpleJavaPrograms;

import java.util.Scanner;

public class AverageOfGivenNumbers_Demo 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter firstNumber:");
		int firstNumber = scanner.nextInt();
		
		System.out.println("Enter secondNumber:");
		int secondNumber = scanner.nextInt();
		
		System.out.println("Enter thirdNumber:");
		int thirdNumber = scanner.nextInt();
		
		System.out.println("Enter forthNumber:");
		int forthNumber = scanner.nextInt();
		
		System.out.println("Enter fifthNumber:");
		int fifthNumber = scanner.nextInt();
		
		System.out.println("Enter sixthNumber:");
		int sixthNumber = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("Average of this sum numbers is :" 
				+ (firstNumber
				+ secondNumber 
				+ thirdNumber 
				+ forthNumber 
				+ fifthNumber
				+ sixthNumber) / 6);
		
	}

}
