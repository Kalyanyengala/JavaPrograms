package SImpleJavaPrograms;

import java.util.Scanner;

public class ReverseStringAndPalindrome_Demo 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String:");
		String OriginalValue = scanner.nextLine();
		String reverseString = "";
		scanner.close();
		for(int i = OriginalValue.length()-1; i >= 0; i--)
		{
			reverseString = reverseString + OriginalValue.charAt(i);
		}
		
		System.out.println("Reversed String is :" + reverseString);
		
		if(OriginalValue.equals(reverseString))
		{
			System.out.println("Given String: " + OriginalValue + " ReversedString is :" + reverseString + " This is PalindromeString");
			
		}
		else
		{
			System.out.println("Given String: " + OriginalValue + " ReversedString is :" + reverseString + " This is Not PalindromeString");
		}
		
		
		PalindromeNumber_Demo pdemo = new PalindromeNumber_Demo();
		pdemo.getPalindromeNumber(1001);
		
	}

}
