package SImpleJavaPrograms;

import java.util.Arrays;

public class SwapTwoIntegers_Demo 
{
	public static void main(String[] args)
	{
		
//		int a = 10;
//		int b = 20;
		
		// 1. Using third variable 
		
//		int temp = 0;
//		
//		temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.println("Printing swapped int a value :" + a);
//		System.out.println("Printing swapped int  b value :" + b);
		
		// 2. Without using third variable
		
//		a = a + b;
//		b = a - b;
//		a = a - b;
//		
//		System.out.println("Printing swapped int a value :" + a);
//		System.out.println("Printing swapped int  b value :" + b);
		
		// 3. Using Multiplications 
		
//		a = a * b;
//		b = a / b ;
//		a = a / b ;
//		
//		System.out.println("Printing swapped int a value :" + a);
//		System.out.println("Printing swapped int  b value :" + b);
		
		// 4. Using XOR : ^ Oparetor 
		
//		a = a ^ b; // 15 ----> 1111
//		b = a ^ b; // 10 -----> 1010
//		a = a ^ b; // 5 ------> 0101
//		
//		System.out.println("Printing swapped int a value :" + a);
//		System.out.println("Printing swapped int  b value :" + b);
		
		// Swapping of arrays 
		
		int Array[] = {1, 2, 3, 4, 5};
		int temp = 0;
		temp = Array[0];
		Array[0] = Array[Array.length-1];
		Array[Array.length-1] = temp; 
		System.out.println(Arrays.toString(Array));
		
		
		
	}

}
