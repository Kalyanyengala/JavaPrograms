package SImpleJavaPrograms;

public class ReverseNumber_Demo 
{
	public static void main(String[] args) 
	{
		int number = 1234;
		int reversNumber = 0;
		
		while(number != 0)
		{
			reversNumber = reversNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Printing reversedNumber :" + reversNumber);
		
	}

}
