package Patterns;

public class SandGlassPattern 
{
	public static void main(String[] args) 
	{
	/*	* * * * *       ------> 1. findout rows
		 * * * *        ------> 2. findout how many spaces to print
		  * * *         ------> 3. findout how many stars need to print
		   * *          ------> 4. print next line keep in mind 
		    *           ------> 5. divide middle of star into two stages then right a logic !
		    * 
		   * * 
		  * * * 
		 * * * * 
		* * * * *      */
// ______________________________________________________
		
		// Example 1
		
//		for(int i = 5; i > 0; i--)
//		{
//			for(int j = 5 - i; j >= 1; j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k = 1; k <= i; k++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for(int i = 1; i <= 5; i++)
//		{
//			for(int j = 1; j <= 5 - i; j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k = 1; k <= i; k++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
		for(int i = 5; i > 0; i--)
		{
			for(int j = 5 - i; j >= 1; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				System.out.print("* ");      // -------> give space after * then only it print correct code !
			}
			System.out.println();				
		}
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5 - i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
}