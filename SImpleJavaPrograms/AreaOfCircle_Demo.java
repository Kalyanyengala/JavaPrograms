package SImpleJavaPrograms;

import java.util.Scanner;

public class AreaOfCircle_Demo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		double radius = sc.nextDouble();
		sc.close();
		
		// Formula is pi*radius*radius = area of circle
		
		System.out.println("Radius of circle is :" + (Math.PI * radius * radius));
		
	}

}