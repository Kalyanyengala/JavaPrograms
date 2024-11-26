package SImpleJavaPrograms;

import java.util.Scanner;

public class AsciiValueOfGivenChar
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a charectere :");
		char charecter = scanner.nextLine().charAt(0);
		scanner.close();
		int asciValue = (int)charecter;
		System.out.println("Printing asciValue of given charectere :" + asciValue);
		
	}

}
