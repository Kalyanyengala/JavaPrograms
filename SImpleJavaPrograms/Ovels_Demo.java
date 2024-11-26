package SImpleJavaPrograms;

import java.util.Scanner;

public class Ovels_Demo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charecter :");
		char value = sc.next().charAt(0);
		sc.close();
		boolean voovels = false;
		
		switch(value)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': voovels = true;			
		}
		if(voovels)
		{
			System.out.println("Given Charecter is voovel :" + value);
		}
		else
		{
			System.out.println("Given Charecter is Not a voovel :" + value);
		}
		
	}

}
