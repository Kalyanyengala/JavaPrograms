package SImpleJavaPrograms;

import java.util.Scanner;

public class AreaOfRectangle_Demo 
{
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter value of height");
		double height = scanner.nextDouble();
		System.out.println("Enter value of weidth");
		double width = scanner.nextDouble();
		scanner.close();
		System.out.println("Printing area of rectangle :" + ( height * width)); // height*width = area of rectangle
	}
}
