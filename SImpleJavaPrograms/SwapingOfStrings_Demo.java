package SImpleJavaPrograms;

public class SwapingOfStrings_Demo 
{
	public static void main(String[] args)
	{
		
		String a = "Automation";
		String b = "Testing";
		
		System.out.println("Before swapping of strings:");
		System.out.println("Printing a value :" + a);
		System.out.println("Printing b value :" + b);
		
//		a = a+b;
//		System.out.println("Printing a value after swapping  :" + a);
//		
//		b = a.substring(0, a.length()-b.length());
//		System.out.println("Printing b value after swapping  :"+ b);
//		
//		a = a.substring(b.length());
//		System.out.println("Printing a value after swapping :" + a);
		
		// Example 2
		a = a + b ;
		
		b = a.substring(0, a.length()-b.length());
		
		a = a.substring(b.length());
		
		System.out.println("Printing a value after swapping :" + a);
		System.out.println("Printing b value after swapping :" + b);
				
		
		
	}

}
