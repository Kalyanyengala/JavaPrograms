package SImpleJavaPrograms;

import java.util.Scanner;

public class PowerOfNumber_Demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		int number = sc.nextInt();
		int initialValue = number;
		System.out.println("Enter a powerValue :");
		int power = sc.nextInt();
		sc.close();
		
		// Power of number is 5 is number and 3 is power 5 * 5 * 5 = 125 five multipli with 3 times gives powervalue
		for(int i = 1; i<power; i++)
		{
			number = initialValue * number;
		}
		
		System.out.println("Power Of Number is :" + number);
		
	}}
