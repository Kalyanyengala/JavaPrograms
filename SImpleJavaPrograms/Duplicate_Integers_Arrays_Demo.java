package SImpleJavaPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicate_Integers_Arrays_Demo 
{
	public static void main(String[] args) 
	{
		int array[] = {1, 2, 3, 4, 5, 5, 6, 7, 7, 8};
		Set<Integer> setValue = new HashSet<Integer>();
		System.out.println("Before Values :"+ (Arrays.toString(array)));
		for(int i = 0; i <array.length; i++)
		{
			setValue.add(array[i]);         // ------> Adding to set 
		}
		
	    Integer[] value = setValue.toArray(new Integer[setValue.size()]);// -------> Converting Integer
		System.out.println("After Values :" + Arrays.toString(value));
		
		
		// Another way to print set values 
		for(int i = 0; i<setValue.size(); i++)
		{
			
		}
		
		System.out.println();
		
		// Using Index aslo we can findOut Duplicates 
		
//		int Array[] = {1, 2, 3, 4, 5, 5, 6, 7, 7, 8};
//		int j = 0;
//		for(int i = 0; i < Array.length-1; i++)
//		{
//			if(Array[i] != Array[i+1])
//			{
//				Array[j] = Array[i];
//				j++;
//			}
//		}
//		
//		Array[j] = Array[Array.length-1];
//		
//		for(int a = 0; a <= j; a++)
//		{
//			System.out.print( Array[a]);
//		}
//		
		// Using another way to findout 
		
		int Arr[] = {1, 2, 3, 4, 5, 5, 6, 7, 7, 8};
		for(int x = 0; x<Arr.length; x++)
		{
			for(int y = x+1; y<Arr.length; y++)
			{
				if(Arr[x] == Arr[y])
				{
					System.out.println("Duplicates Founded :" + Arr[x]);
				}
			}
		}
		
		// Another Way to findout duplicates 
		
		int A[] = {1, 2, 3, 4, 5, 5, 6, 7, 7, 8};
		HashSet<Integer> hset = new HashSet<Integer>();
		for(int i = 0; i<A.length; i++)
		{
			if(hset.add(A[i]) == false)
			{
				System.out.print( A[i]);
			}
		}
		
		}

}
