package SImpleJavaPrograms;

import java.util.Scanner;

public class PrintDigits_Commas_NumbersInString
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value:");
		String name = scanner.nextLine();     // ------> next will take line charecters and nextLine will take all spaces extras
		char array[] = name.toCharArray();
		
		int digits = 0;
		int spaces = 0;
		int letters = 0;
		int others = 0;
		scanner.close();
		
		for(Character ch : array)
		{
			if(Character.isDigit(ch))
			{
				digits++;
			}
			else if(Character.isSpaceChar(ch))
			{
				spaces++;
			}
			else if(Character.isLetter(ch))
			{
				letters++;
			}
			else
			{
				others++;
			}
		}
		
		System.out.println("Printing Digits :" + digits);
		System.out.println("Printing spaces :" + spaces);
		System.out.println("Printing letters :" + letters);
		System.out.println("Printing others :" + others);
		
	}

}
