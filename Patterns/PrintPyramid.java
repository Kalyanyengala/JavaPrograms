package Patterns;

public class PrintPyramid 
{
	/*
	 *
    * * 
   * * * 
  * * * * 
 * * * * * 
	 * 
	 * 
	 */
	public static void main(String[] args) 
	{
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5 - i; j++)
			{
				System.out.print(" ");
			}
			
			for(int k = 0; k <= i; k++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		// Example 2
		
		for(int i = 0; i < 5 ; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		// Example 3
		
		for(int i = 0; i< 5; i++)
		{
			for(int j = 0; j<= 5-i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 0; k<= i; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}		
	}

}
