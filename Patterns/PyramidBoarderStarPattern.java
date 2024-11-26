package Patterns;

public class PyramidBoarderStarPattern 
{
	public static void main(String[] args)
	{
	/*	    *
		   * *
		  *   *
		 *     *
		*********       */
//_________________________________________________________________
		
		// Example 2
//		for(int i = 1; i <= 5; i++)
//		{
//			for(int j = 1; j <= 5 - i; j++)
//			{
//				System.out.print(" ");
//			}
//					
//			for(int k = 1; k <= 2 * i -1; k++)
//			{
//				if(k == 1 || k == 2 * i -1 || i == 5)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}				
//			}
//			System.out.println();
//		}
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5 - i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= 2 * i -1; k++)
			{
				if(k == 1 || k == 2 * i -1 || i == 5)
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
