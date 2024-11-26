package SImpleJavaPrograms;

import java.util.Scanner;

public class FibnociNumber_Demo
{
	public static void main(String[] args) 
	{
		//Fibnoci means if [0+1=1,1+1=2,2+3=5,3+5=8,5+8=13] This is Fibnocci Series
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value:");
		int number = scanner.nextInt();
		scanner.close();
		int a = 1, b = 1;
		System.out.print(" " + a);
		System.out.print(" " + b);
		
		int fibnoci = 0;	
		
		while(fibnoci <= number)
		{
			fibnoci = a + b;			
			if(fibnoci > number )
			{ break;
			}
			System.out.print(" " + fibnoci);
			a = b;
			b = fibnoci;
			
		}		
	}

}
