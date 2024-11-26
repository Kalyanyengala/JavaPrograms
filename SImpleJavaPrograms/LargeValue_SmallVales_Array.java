package SImpleJavaPrograms;

import java.util.Arrays;

public class LargeValue_SmallVales_Array 
{

	public static void main(String[] args) 
	{
		int array[] = {1,34,5,6,67,45,5,3,32,45,8,100};
		int largeValue = array[0];
		int smallValue = array[0];
		
		for(int i = 0; i<array.length; i++)
		{
			if(array[i]>largeValue)
			{
				largeValue = array[i];
			}
			else if(array[i]<smallValue)
			{
				smallValue = array[i];
			}
				
		}
		System.out.println("Printing Values From Arrays :" + Arrays.toString(array));
		
		System.out.println("Printing Values From LargeValue :" + largeValue);
		System.out.println("Printing Values From SmallValue :" + smallValue);
		
	}

}
