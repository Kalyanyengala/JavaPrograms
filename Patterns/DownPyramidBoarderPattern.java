package Patterns;

public class DownPyramidBoarderPattern
{
	public static void main(String[] args) 
	{
	/*	*********
		 *     *
		  *   *
		   * *
		    *        */
//_______________________________________________
				
		for(int i = 5; i > 0; i--)
		{
			for(int j = 5 - i; j > 0; j--)
			{
				System.out.print(" ");
			}
			for(int k = 2 * i -1; k > 0; k--)
			{
				if(k == 1 || k == 2 * i -1 || i == 5 )
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
