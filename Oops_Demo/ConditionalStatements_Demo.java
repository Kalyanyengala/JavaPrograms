package Oops_Demo;

public class ConditionalStatements_Demo {

	public static void main(String[] args) {
		ConditionalStatements_Demo Cd = new ConditionalStatements_Demo();
		Cd.getWeekName(2);
		
		// Example 1
		
		int age = 25;
		if ( age >= 18)
			System.out.println("Person Eligible For Vote : " + age);
		
		// Example2 [If Else]

		int Age = 20;
		if ( Age >= 18)
			System.out.println("Person Eligible For Vote : " + Age);
		else
			System.out.println("Person Not Eligible For Vote: " + Age);
		
		//Example 3
		
		int number = 10;
		if ( number %2 == 0)
		System.out.println("This Number Is EvenNumber : " + number);
		else 
			System.out.println("This Number Is OddNumber : "+ number);
		
		//Example4 
		
		int Numb = 10;
		if ( Numb > 0)
			System.out.println("This Number Is A PositiveNumber :" + Numb);
		else if (Numb<0) 
			System.out.println("This Is NegativeNumber: " + Numb);
		else 
			System.out.println("Entered Number Is Zero: "+ Numb);
		
		// Example 5
		
		int a = 100 , b= 200, c= 300;
		
		if (a > b && a>c)
			System.out.println("A Is LargestNumber : " + a);
		else if (b>a && b>c)
			System.out.println("B Is LargestNumber :  " + b);
		else
			System.out.println("C Is LargestNumber: "+ c);
		
		//Example6 
		// Print Example For Nested [If Else if Else] Statement 
		
		int Weekno = 1;
		
		if (Weekno == 0)
			System.out.println("Sunday");
		else if (Weekno == 1)
			System.out.println("Monday");
		else if (Weekno == 2)
			System.out.println("Tuesday");
		else if (Weekno == 3)
			System.out.println("Wednesday");
		else if (Weekno == 4)
			System.out.println("Thursday");
		else if ( Weekno == 5)
			System.out.println("Friday");
		else if (Weekno == 6)
			System.out.println("Saturday");
		else
			System.out.println("Invalid Day");
		
			
		// Example 7 Using SwitchCase 
		
		int weeknumber = 1;
		
		switch (weeknumber)
		{
		case 0 : System.out.println("Sunday");break;
		case 1 : System.out.println("Monday");break;
		case 2 : System.out.println("Tuesday");break;
		case 3 : System.out.println("Wednesday");break;
		case 4 : System.out.println("Thursday");break;
		case 5 : System.out.println("Friday");break;
		case 6 : System.out.println("Saturday");break;
		default : System.out.println("Invalid weeknumber");
		
		}
		
		// Example 8
		String weekname = "sunday";
		
		switch (weekname)
		{
		case "sunday" : System.out.println("1");break;
		case "Monday" : System.out.println("2");break;
		case "Tuesday" : System.out.println("3");break;
		case "Wednesday" : System.out.println("4");break;
		case "Thursday": System.out.println("5");break;
		case "Friday": System.out.println("6");break;
		case "Saturday" : System.out.println("7");break;
		default : System.out.println("Invalid weeknumber");
		
		}

	}
	public void getWeekName(int number)
	{
		switch (number)
		{
		case 0 : System.out.println("Sunday");break;
		case 1 : System.out.println("Monday");break;
		case 2 : System.out.println("Tuesday");break;
		case 3 : System.out.println("Wednesday");break;
		case 4 : System.out.println("Thursday");break;
		case 5 : System.out.println("Friday");break;
		case 6 : System.out.println("Saturday");break;
		default : System.out.println("Invalid weeknumber");
		
	}

}}

