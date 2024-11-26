package SImpleJavaPrograms;

public class ReverseString_Demo 
{
	public static void main(String[] args) {
		
		// Example 1
		String str = "Automation Testing";
		String rev = "";
		
		for ( int i = str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println("Rversed String Is :" + rev);
		
		// Example 2
		
		StringBuilder builder = new StringBuilder(str);
		System.out.println(builder.reverse());
		
		// Example 3
		
		StringBuffer buffer = new StringBuffer(str);
		System.out.println(buffer.reverse());
		
		reverseString("Kalyan");
		
	}
	
	public static void reverseString(String input)
	{		
		String rev = "";
		
		for ( int i = input.length()-1; i>=0; i--)
		{
			rev = rev + input.charAt(i);
		}
		
		System.out.println("Reversed String Is :" + rev);
		
	}

}
