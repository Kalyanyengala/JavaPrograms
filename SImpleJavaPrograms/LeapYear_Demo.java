package SImpleJavaPrograms;

import java.util.Scanner;

public class LeapYear_Demo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year :");
		int year = sc.nextInt();
		sc.close();
		boolean leapYear = false;
		
		// Year divisible by 4 and not divisible by 100 then gives 0 is leapyear!
		// Year divisible by 4 and 100 then check it divisible by 100 then it is leap year!
		
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{								
				if( year % 400 == 0)
				{
					leapYear = true;
				}
				else
				{
					leapYear = false;
				}
			}
			else
			{
				leapYear = true;
			}
		}
		else
		{
			leapYear = false;
		}
		if(leapYear)
		{
			System.out.println("Given year is:" + year + " is a leap year :" + year);
		}
		else
		{
			System.out.println("Givem year is:" + year + "not a leap year :" + year);
		}
		
		
	}
	

}
