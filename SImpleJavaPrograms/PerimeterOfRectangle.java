package SImpleJavaPrograms;

import java.util.Scanner;

public class PerimeterOfRectangle
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter value of height:");
		double height = scanner.nextDouble();
		System.out.println("Enter value of weidth:");
		double width = scanner.nextDouble();
		scanner.close();
		System.out.println("Printing area of rectangle :" + 2 * ( height + width)); // 2 * (height+width) = perimeter of rectangle
	}

}
