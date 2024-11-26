package Patterns;

public class NumberPattern 
{
	//public static void main(String[] args) 
	{
	/*	1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5 
		1 2 3 4 5 6 
		1 2 3 4 5 6 7 
		1 2 3 4 5 6 7 8 
		1 2 3 4 5 6 7 8 9 
		1 2 3 4 5 6 7 8 9 10     */
		
//____________________________________________________________
		
		for(int i = 1; i <= 10; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
//_______________________________________________________________________
		
		// Example 2 
		
		for(int i = 10; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	/*	1 2 3 4 5 6 7 8 9 10 
		1 2 3 4 5 6 7 8 9 
		1 2 3 4 5 6 7 8 
		1 2 3 4 5 6 7 
		1 2 3 4 5 6 
		1 2 3 4 5 
		1 2 3 4 
		1 2 3 
		1 2 
		1       */

//________________________________________________________________________		
		
		// Example 3
		
		for(int i = 5; i >= 1; i--)
		{
			for(int j = 5; j >= i; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}	
		
	/*	5 
		5 4 
		5 4 3 
		5 4 3 2 
		5 4 3 2 1        */
//_______________________________________________________________________
		
		// Example 4
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}	
		
	/*	1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5    */
//______________________________________________________________________________
		// Example 5
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(j % 2 == 0)
				{
					System.out.print(0 + " ");
				}
				else
				{
					System.out.print(1 + " ");
				}
			}
			System.out.println();
		}	
		
	/*	1 
		1 0 
		1 0 1 
		1 0 1 0 
		1 0 1 0 1      */
//_____________________________________________________________________
		//Example 6 
		
		for(int i = 1; i <= 5; i++)
		{
			int number ;
			if(i % 2 == 0)
			{
				number = 0;
				System.out.print(number + " ");
			}
			else
			{
				number = 1;
				System.out.print(number + " ");
			}
			for(int j = 1; j < 5; j++)
			{
				if(number == 1)
				{
					System.out.print(0 + " ");
				}
				else
				{
					System.out.print(1 + " ");
				}
			}
			System.out.println();			
		}
	/*	1 0 0 0 0 
		0 1 1 1 1 
		1 0 0 0 0 
		0 1 1 1 1 
		1 0 0 0 0     */
//______________________________________________________________________
		// Example 7
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
			for(int k = i; k <= 5; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		for(int i = 4; i >= 1; i--)
		{
			for(int j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
			for(int k = i; k <= 5; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
	/*	1 2 3 4 5 
		 2 3 4 5 
		  3 4 5 
		   4 5 
		    5 
		   4 5 
		  3 4 5 
		 2 3 4 5 
		1 2 3 4 5     */		

	}
	
	// Test
	public static void main(String[] args)
	{
//		for(int i = 1; i <= 5; i++)
//		{
//			for(int j = 1; j <= i; j++)
//			{
//				if(j % 2 == 0)
//				{
//					System.out.print(0 + " ");
//				}
//				else
//				{
//					System.out.print(1 + " ");
//				}
//			}
//			System.out.println();
//		}		
		
//		for(int i = 1; i <= 5; i++)
//		{
//			int number ;
//			if(i % 2 == 0)
//			{
//				number = 0;
//				System.out.print(number + " ");
//			}
//			else
//			{
//				number = 1;
//				System.out.print(number + " ");
//			}
//			for(int j = 1; j < 5; j++)
//			{
//				if(number == 1)
//				{
//					System.out.print(0 + " ");
//				}
//				else
//				{
//					System.out.print(1 + " ");
//				}
//			}
//			System.out.println();			
//		}
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
			for(int k = i; k <= 5; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		for(int i = 4; i >= 1; i--)
		{
			for(int j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
			for(int k = i; k <= 5; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}		
	}
}
