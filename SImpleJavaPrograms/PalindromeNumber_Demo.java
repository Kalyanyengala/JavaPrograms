package SImpleJavaPrograms;

public class PalindromeNumber_Demo 
{
	
	public static void main(String[] args)
	{
		getPalindromeNumber(12321);
		getPalindromeNumber(1001);
		getPalindromeNumber(12312);
		getPalindromeString("MadaM");
		
	}	
	
	public static void getPalindromeNumber(int number)
	{
		int numb = number;
		int originalNumber = numb;
		int reverse = 0;
		
		while(numb > 0)
		{
			reverse = reverse * 10 + numb % 10;
			numb = numb / 10;
		}
		if(originalNumber == reverse)
		{
			System.out.println("This is palindrome Number: " + originalNumber);
		}
		else
		{
			System.out.println("Not a palindrome number: " + reverse);
		}
	}
	
	public static void getPalindromeString(String name)
	{
		String value = name;
		String originalValue = value;
		String reverse = "";
		
		for(int i = originalValue.length()-1; i>=0; i--)
		{
			reverse = reverse + originalValue.charAt(i);
		}
		if(originalValue.equals(reverse))
		{
			System.out.println("This is palindrome String :" + originalValue);
		}
		else
		{
			System.out.println("This is not a palindrome String :" + reverse);
		}
	}	

}
