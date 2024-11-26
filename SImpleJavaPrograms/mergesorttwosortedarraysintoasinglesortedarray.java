package SImpleJavaPrograms;

import java.util.Arrays;

public class mergesorttwosortedarraysintoasinglesortedarray 
{
	//public static void main(String[] args) 
	{
		int arrayA[] = {1,2,3,4,5,6,7,8,9};
		int arrayB[] = {2,3,4,5,6,7};
		int arrayTemp[] = new int[arrayA.length + arrayB.length];
		int sizeA = arrayA.length;
		int sizeB = arrayB.length;
		int indexi = 0;
		int indexj = 0;
		int indexk = 0;
		while(indexi < sizeA && indexj < sizeB)
		{
			if(arrayA[indexi] <= arrayB[indexj])
			{
				arrayTemp[indexk] = arrayA[indexi];
				indexi++;
				indexk++;
			}
			else
			{
				arrayTemp[indexk] = arrayB[indexj];
				indexj++;
				indexk++;
			}
		}
		while(indexi < sizeA)
		{
			arrayTemp[indexk] = arrayA[indexi];
			indexi++;
			indexk++;			
 		}
		while(indexj < sizeB)
		{
			arrayTemp[indexk] = arrayB[indexj];
			indexj++;
			indexk++;
		}
		System.out.print(Arrays.toString(arrayTemp));		
	}
	
	public static void main(String[] args) 
	{
		// Example 2

		int arrayA[] = {1,3,6,8};
		int arrayB[] = {1,3,4,5,6,7,8,9};
		int arrayTemp[] = new int[arrayA.length + arrayB.length];
		int sizeA = arrayA.length;
		int sizeB = arrayB.length;
		int sizeC = arrayTemp.length;
		int indexA = 0;
		int indexB = 0;
		int indexC = 0;
		
		while(indexA < sizeA && indexB < sizeB)
		{
			if(arrayA[indexA] <= arrayB[indexB])
			{
				arrayTemp[indexC] = arrayA[indexA];
				indexA++;
				indexC++;
			}
			else
			{
				arrayTemp[indexC] = arrayB[indexB];
				indexB++;
				indexC++;
			}
		}
		while(indexA < sizeA)
		{
			arrayTemp[indexC] = arrayA[indexA];
			indexA++;
			indexC++;
		}
		while(indexB < sizeB)
		{
			arrayTemp[indexC] = arrayB[indexB];
			indexB++;
			indexC++;
		}
		System.out.println(Arrays.toString(arrayTemp));
		}	

}
