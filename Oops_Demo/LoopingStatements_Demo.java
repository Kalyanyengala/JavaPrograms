package Oops_Demo;

public class LoopingStatements_Demo {

	public static void main(String[] args) {
		
		
		// Example 1
		
		for ( int i = 0 ; i<=10; i++)
			System.out.println("Printing " + i);
		
		//Example 2
		
		for (int j = 0; j<= 10 ; j++)
		{
			if ( j%2 == 0)
			{
				System.out.println("EvenNumber"+ j);
			}
			else
				System.out.println("OddNumber" + j);
		}
		
		// Example 3
		
		for ( int a = 0; a<=10; a++)
		{
			System.out.println("Printing :"+ a + "\t");
		}
		
		// Example 4
		
		for (int j = 1; j<= 10 ; j++)
		{
			if ( j == 5)
			{
				break;
			}
			
				System.out.println("OddNumber" + j);
		}
		
		// Example 5
		
		for (int j = 1; j<= 10 ; j++)
		{
			if ( j == 5)
			{
				continue;
			}
			
				System.out.println("OddNumber" + j);
		}
		
		//Example 6
		
		for (int j = 1; j<= 10 ; j++)
		{
			if (j == 3 || j==5 || j==7)
			{
				continue;
			}
			
				System.out.println("OddNumber" + j);
		}
		
			
		

		
		
		
	}

}
