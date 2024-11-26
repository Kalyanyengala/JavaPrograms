package SImpleJavaPrograms;

import java.util.Scanner;

public class ArmStrongNumber_Demo 
{
	// ArmStrongNumber is the number will multiples three times and gives same number 
	// 153 = 1*1*1 5*5*5 3*3*3 = 153   ----> this number is called armstrongnumber 
	
	public static void getArmStrongNumber(int number)
	{
		int cube = 0;
		int reminder = 0;
		int temparory;
		temparory = number;
		
		while(number > 0)
		{
			reminder = number % 10;
			number = number / 10;
			cube = cube + (reminder * reminder * reminder);
		}
		if(temparory == cube)
		{
			System.out.println("This is armstrongNumber");
		}
		else 
		{
			System.out.println("This is not armstromngNumber");
		}
	}
	
	public static void main(String[] args) 
	{
//		getArmStrongNumber(370);
//		getArmStrongNumber(153);
//		getArmStrongNumber(0);
//		getArmStrongNumber(1);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number :");
		int number = scanner.nextInt();
		scanner.close();
		int OriginalNumb = number ;
		int CubeNumb = 0;
		while(number > 0)
		{
			int reminder = number % 10;
			CubeNumb = CubeNumb + (reminder * reminder * reminder );
			number = number / 10;
			
		}
		if(OriginalNumb == CubeNumb)
		{
			System.out.println("This is ArmStrongNumber :" + OriginalNumb);
		}
		else
		{
			System.out.println("This is not a ArmStrongNumber : " + OriginalNumb);
		}
	}

}
