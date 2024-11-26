package SImpleJavaPrograms;

public class MissingNumber_Array 
{
	public static void main(String[] args) 
	{
		int array[] = {1,2,3,4,5,7,8,9}; //-------> Take Simple Range Only
		int sum = 0;		
		
		for ( int i = 0; i<array.length; i++ )
		{
			sum = sum + array[i];
		}
		System.out.println("Sum of elements in array:"+ sum);
		
		
		int sum1 = 0;
		for ( int j = 1; j<=9; j++)
		{
			sum1 = sum1 + j;
		}
		
		System.out.println("Sum of elements in array:"+ sum1);
		
		System.out.println("Missing Number in Array is :" + (sum1 - sum));
		
		// Example 2
		
		int Arrays[] = {1,2,3,4,5,6,8,9};
		int SumValue = 0;
				
		for (int a = 0; a<Arrays.length; a++)
		{
			SumValue = SumValue + Arrays[a];
		}
		
		System.out.println("Value of sum is :" + SumValue);
		
		int SumValue1 = 0;
		
		for ( int b = 1; b<=9; b++)
		{
			SumValue1 = SumValue1 + b;
		}
		
		System.out.println("Value of sum1 is :" + SumValue1);
		
		System.out.println("Final missing value from arrays is :" + (SumValue1 - SumValue));
		
	}
}
