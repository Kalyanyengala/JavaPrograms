package SImpleJavaPrograms;

public class RandomNumbersWithinRange
{
	public static void main(String[] args)
	{
		int range = 100;
		double randomNumber = Math.random();	
		System.out.println("Printing randomNumbers with in range :" + (int)(randomNumber * range )); // TypeCasting because randomMethod gives numbers in double
	}

}
