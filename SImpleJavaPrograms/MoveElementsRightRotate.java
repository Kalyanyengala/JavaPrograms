package SImpleJavaPrograms;

import java.util.Arrays;

public class MoveElementsRightRotate 
{
	public static void main(String[] args)
	{
		
//		int array[] = {1,2,3,4,5};
//		//int temp = array[array.length-1];		
//		int numberOfTimes = 3;
//		
//		for(int j = 1; j <= numberOfTimes; j++)
//		{
//			int last = array[array.length -1];
//			
//		for(int i = array.length-1; i > 0; i--)
//		{
//			array[i] = array[i - 1];
//		}
//		array[0] = last;
//		
//		}
//		
//		System.out.println(Arrays.toString(array));
		
//		for(int i = array.length-1; i>0; i--)
//		{
//			array[i] = array[i-1];
//		}
//		array[0] = temp;
//		System.out.println(Arrays.toString(array));
		
		// Example 2
		
		int Arr[] = {1, 2, 3, 4, 5};
		int First = Arr[0];
		for(int i = 0; i < Arr.length -1; i++)
		{
			Arr[i] = Arr[i + 1];
		}
		Arr[Arr.length-1] = First;
		System.out.println(Arrays.toString(Arr));
		
		// Example 3
		
		int Array[] = {1, 2, 3, 4, 5};		
		int noofTimes = 3;
		for(int i = 0; i < noofTimes; i++)
		{		
			int first = Array[0];
			
			for(int j = 0; j < Array.length -1; j++)
			{
				Array[j] = Array[j + 1];
			}
			
			Array[Array.length -1] = first;
		}
		
		System.out.println(Arrays.toString(Array));
		
		
	}

}
