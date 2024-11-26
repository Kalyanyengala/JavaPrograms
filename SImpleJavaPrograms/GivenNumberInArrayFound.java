package SImpleJavaPrograms;

import java.util.Scanner;

public class GivenNumberInArrayFound 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = scanner.nextInt();
		int array[] = {1,2,3,4,5,6,7,8};
		boolean status = false;
		for(int i = 0; i < array.length; i++)
		{
			if(number == array[i])
			{
				System.out.println(number + " is searched number found at index of: " + i);
				status = true;
				break;
			}
		}
		if(!status)
		{
			System.out.println("Searched number is not found");
		}
		
	}

}
