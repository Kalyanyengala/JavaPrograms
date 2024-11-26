package SImpleJavaPrograms;

import java.util.Arrays;

public class ArraysEqual_Demo 
{
	public static void main(String[] args) 
	{
//		int arr[]= {1,2,3,4,5};
//		int arr1[] = {1,2,3,4,5};
//		boolean status = Arrays.equals(arr, arr1);
//		if(status == true )
//		{
//			System.out.println("Arrays are equals");
//		}
//		else
//		{
//			System.out.println("Arrays are not equals");
//		}
//		
		//Approach 2 using length 
		int Arr[]= {1,2,3,4,5};
		int Arr1[] = {1,2,3,4,5};
		
		boolean Status = true; 
		if(Arr.length == Arr1.length)
		{
			for(int i = 0; i< Arr.length; i++)
			{
				if(Arr[i] != Arr1[i]) {
					Status = false;
				}
			}
		}
		else
		{
			Status = false;
		}
		if(Status == true)
		{
			System.out.println("Arrays are equals");
		}
		else
		{
			System.out.println("Arrays are not equals");
		}		
		
	}

}
