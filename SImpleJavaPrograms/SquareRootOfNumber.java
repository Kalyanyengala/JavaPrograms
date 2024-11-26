package SImpleJavaPrograms;

import java.util.Scanner;

public class SquareRootOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number :");
		int firstNumber = scanner.nextInt();
		scanner.close();
		int root =  (int) Math.sqrt(firstNumber);
		System.out.println("Printing squareRoot of number: "+ root);
	}

}
