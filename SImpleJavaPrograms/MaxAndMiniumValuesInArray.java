package SImpleJavaPrograms;

public class MaxAndMiniumValuesInArray 
{
	public static void main(String[] args) 
	{
		int array[] = {1,2,3,4,10,20,40,60,89,200};
		int max_Value = array[0];
		int minimum_Value = array[0];
		for(int i = 0; i<array.length; i++)
		{
			if(max_Value > array[i])
			{
				max_Value =  array[i];
			}
			if(minimum_Value < array[i])
			{
				minimum_Value = array[i];
			}
		}
		
//		for(int i = 1; i<array.length; i++)
//		{
//			if(minimum_Value < array[i])
//			{
//				minimum_Value = array[i];
//			}
//		}
		
		System.out.println("Printing maximumValue is :" + max_Value);
		System.out.println("Printing maximumValue is :" + minimum_Value);
			
	}

}
