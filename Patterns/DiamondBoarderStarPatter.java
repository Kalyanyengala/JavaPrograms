package Patterns;

public class DiamondBoarderStarPatter 
{
	public static void main(String[] args) 
	{
	/*	    *
		   * *
		  *   *
		 *     *
		*       *
		*       *
		 *     *
		  *   *
		   * *
		    *         */
//____________________________________________________________		
		
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5 - i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= 2 * i -1; k++)
			{
				if(k == 1 ||k == 2 * i -1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		for(int i = 5; i >= 1;  i--)
		{
			for(int j = 5 - i; j >= 1; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= 2 * i -1; k++)
			{
				if(k == 1 || k == 2 * i -1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();					
		}
		
	}

}
