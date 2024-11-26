package SImpleJavaPrograms;

import java.util.Scanner;

public class MultiplicationTable 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int number = sc.nextInt();	
		sc.close();
		
		for(int i = 0; i<=10; i++)
		{
			System.out.println(number + "X" + i + " = " + (number * i));
		}
		
	}

}
