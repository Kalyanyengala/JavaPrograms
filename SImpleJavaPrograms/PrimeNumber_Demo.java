package SImpleJavaPrograms;

public class PrimeNumber_Demo 
{
	//public static void main(String[] args) 
	{
		int a = 20;
		boolean primeNumber = true;
		
		if(a > 1)
		{
			for(int i = 2; i<a; i++)
			{
				if(a %i == 0)
				{				
					primeNumber = false;
					break;
				}
			}
		}
		else
		{
			primeNumber = false;
		}
		
		if(primeNumber)
		{
			System.out.println("This is primeNumber: "+ a);
		}
		else
		{
			System.out.println("This is not a primeNumber:" + a);
		}
	}
	
	//public static void main(String[] args)
	{
		int number = 13;
		boolean primeNumber = true;
		if(number > 1)
		{
			for(int i = 2; i<number ; i++)
			{
				if(number % 2 == 0)
				{
					primeNumber = false;
					break;
				}
			}
		}
		else
		{
			primeNumber = false;
		}
		if(primeNumber)
		{
			System.out.println("Number : " + number + "  is a PrimeNumber ");
		}
		else
		{
			System.out.println("Number :" + number +"  is not a primeNumber");
		}
		
	}
	//public static void main(String[] args)
	{
		int number = 100;         
		boolean primeNumber = true;
		if(number > 1)
		{
			for(int i = 2; i< number ; i++)
			{
				if(number % i == 0)
				{
					primeNumber = false;
					break;
				}
			}
		}
		else
		{
			primeNumber = false;
		}
		if(primeNumber)
		{
			System.out.println("Number : " + number + "  is a PrimeNumber ");
		}
		else
		{
			System.out.println("Number :" + number +"  is not a primeNumber");
		}		
	}
	
	//public static void main(String[] args) 
	{
		
		for(int i = 1; i <= 100; i++)
		{
			boolean status = true;
			if(i > 1)
			{
			for(int j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					status = false;
				}
			}
			}
			else
			{
				status = false;
			}
			
			if(status)
			{
				System.out.print(i + " ");
			}
			
		}	
		
	}
	
	public static void main(String[] args)
	{
		
		for(int i = 1; i <= 100; i++)
		{
			boolean status = true;
			if(i > 1)
			{
				for(int j = 2; j < i; j++)
				{
					if(i % j == 0)
						{
						status = false;
						}
				}
			}
			else
			{
				status = false;
			}
			
			if(status)
			{
				System.out.print(i + " ");
			}
			
		}
		
	}
	}
