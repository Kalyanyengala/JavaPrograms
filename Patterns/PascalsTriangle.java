package Patterns;

public class PascalsTriangle 
{
	public static void main(String[] args)
	{
	/*	 1 
	    1 1 
	   1 2 1 
	  1 3 3 1 
	 1 4 6 4 1       */
//________________________________________
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5 - i; j++)
			{
				System.out.print(" ");
			}
			int number = 1;
			for(int k = 0; k <= i; k++)
			{
				System.out.print(number + " ");
				number = number * (i - k) / (k + 1);
			}
			System.out.println();
		}
		
	}

}
