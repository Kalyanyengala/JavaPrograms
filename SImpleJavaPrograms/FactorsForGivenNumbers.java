package SImpleJavaPrograms;

import java.util.Scanner;

public class FactorsForGivenNumbers
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number :");
		int givenNumber = scanner.nextInt();
		scanner.close();
		int count = 0;
		for(int i = 1; i <= givenNumber; i++)
		{
			if(givenNumber % i == 0)
			{
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("The number of factores for given number is :" + count);
		
	}

}
