package SImpleJavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class GettingInputFromUserAndStoreIntoArray 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int ArraySize = scanner.nextInt();
		int Array[] = new int[ArraySize];
		for(int i = 0; i<ArraySize; i++)
		{
			System.out.println("Enter number :");
			Array[i] = scanner.nextInt();
		}
		System.out.println("Printing Array :" + Arrays.toString(Array));
		scanner.close();
	}

}
