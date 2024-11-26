package FreqventlyAsked_Qa_Java;

import java.util.Arrays;

public class BinarySearch_Demo {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		int searchElement = 5;
		int highvalue = a.length-1;
		int lowvalue = 0;
		boolean status = false;
		
		while ( lowvalue <= highvalue)
		{
			int middlevalue = (lowvalue+highvalue)/2;
			
			if (a[middlevalue] == searchElement)
			{
				System.out.println("SearchElement Found: " + middlevalue);
				status = true;
				break;
			}
			if ( a[middlevalue]< searchElement)
			{
				lowvalue =middlevalue + 1;
			}
			
			if ( a[middlevalue] > searchElement)
			{
				highvalue = middlevalue -1;
			}
		}
		
		if ( status == false)
		{
			System.out.println("SearcheElement Not Found");
		}
		
		// Approach 2
		
		int arr[]= {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.binarySearch(arr, 6));
		
		//Example 1
		
		int array[]= {10,20,30,40,50,60};
		int searchEle = 10;
		int LargestValue = array.length-1;
		int SmallValue = 0;
		boolean Status = false;
		
		while ( SmallValue <= LargestValue)
		{
			int MiddValue =(SmallValue+LargestValue) /2;
			
			if ( array[MiddValue] == searchEle)
			{
				System.out.println("SearchElement Found ");
				Status = true;
				break;
			}
			if (array[MiddValue] < searchEle)
			{
				SmallValue = MiddValue+1;
			}
			if (array[MiddValue]> searchEle)
			{
				LargestValue = MiddValue-1;
			}
		}
		if (Status == false)
		{
			System.out.println("Element NotFound");
		}
		
		//Example 2
		
		int A[] = {5,6,7,8,9};
		int SearchElement = 6;
		int LargeValue = A.length-1;
		int SmallVal = 0;
		boolean Flag = false;
		
		while ( SmallVal <= LargeValue)
		{
			int MiddleValue = SmallVal+LargeValue /2;
			
			if ( SearchElement == MiddleValue)
			{
				System.out.println("Searchable Element Found");
				Flag = true;
				break;
			}
			if (A[MiddleValue]< SearchElement  )
			{
				SmallVal = MiddleValue+1;
			}
			if (A[MiddleValue] > SearchElement)
			{
				LargeValue = MiddleValue -1;
			}
		}
		
		if (Flag == false )
		{
			System.out.println("Element Not Found");
		}
		
		// Approach2
		System.out.println(Arrays.binarySearch(A, SearchElement));
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
