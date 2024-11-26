package SImpleJavaPrograms;

public class EvenAndOddCountInGivenNumber_Demo
{
	public static void main(String[] args)
	{
		int evenCount = 0;
		int oddCount = 0;
				
		for(int i = 1; i < 10; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i + "  ");
			}
		}
		for(int j = 1; j< 10; j++)
		{
			if(j % 2 != 0)
			{
				System.out.print(j  + " ");
			}
		}	
				
	}

}
