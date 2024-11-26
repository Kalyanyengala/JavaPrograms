package SImpleJavaPrograms;

public class LargestNumber_Demo
{
	public static void main(String[] args)
	{
		int a = 100;
		int b = 200;
		int c = 300;
		
		if(a>b && a>c)
		{
			System.out.println("A is largestNumber : " + a );
		}
		else if(b>a && b>c)
		{
			System.out.println("B is LargestNumber : " + b);
		}
		else
		{
			System.out.println(" C is LargestNumber: " + c);
		}
		
	}

}
