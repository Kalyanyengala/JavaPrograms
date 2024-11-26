package SImpleJavaPrograms;

import java.util.Scanner;

public class SquareOfGivenNumberAndCube_demo 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number :");
		int number = scanner.nextInt();
		scanner.close();
		System.out.println("SquareRoot of given number is :" + (number * number ));
		System.out.println("Cube of given number is : " + (number * number * number));
	}

}
