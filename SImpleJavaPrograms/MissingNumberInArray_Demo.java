package SImpleJavaPrograms;

public class MissingNumberInArray_Demo 
{
	public static void main(String[] args) 
	{
		int array[] = {1,3,4,5,6,7};
		int sum = 0;
		int sum1 = 0;
		for(int i = 0; i<array.length; i++)
		{
			sum = sum + array[i];
		}
		System.out.println("Printing sum of :" + sum);
		
		for(int i = 1; i<=7; i++)
		{
			sum1 = sum1 + i;
		}
		System.out.println("Printing sum1 of :" + sum1);
		
		System.out.println("Missing number is :"+ (sum1 - sum));
	}

}
