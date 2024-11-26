package Patterns;

public class PrintLeftPascalsTriangleShape
{
	public static void main(String[] args) 
	{    
	/*      *    ------> 1. findout rows 
		   **    ------> 2. findout how many spaces to print
		  ***    ------> 3. findout how many stars need to print
		 ****    ------> 4. print next line keep in mind 
		*****    ------> 5. divide middle of star into two stages then right a logic !
		 ****
		  ***
		   **
		    *       */
		     
// ________________________________________________________________
		      

//	
//		for(int i = 1; i <= 5; i++)
//		{
//			for(int j = 1; j <= 5 - i; j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k = 1; k <= i; k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = 1; i <= 5; i++)
//		{
//			for(int j = 1; j <= i; j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k = 1; k <= 5 - i; k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//

		// Example 2 
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5 - i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <=5 - i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}
