package SImpleJavaPrograms;

public class ReverseIntValue_Demo 
{
	public static void main(String[] args) 
	{
		int num = 12345;
		int reverse = 0;
		
		while (num !=0)
		{
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(reverse);
		
		reverseIntValue(1237346);
		
		// Example 2
		
		int value = 1234;
		System.out.println("Reversing int value using StringBuilder : "+ new StringBuilder(String.valueOf(value)).reverse());
		
		// Example 3
		
		int v = 129090;
		System.out.println("Reversing int value from stringbuffer :" + new StringBuffer(String.valueOf(v)).reverse());
		
	}
	
	public static void reverseIntValue(int value)
	{
		int number = value;
		int reverse = 0;
		
		while ( number != 0)
		{
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Reversed Value is :" + reverse);
	}

}
