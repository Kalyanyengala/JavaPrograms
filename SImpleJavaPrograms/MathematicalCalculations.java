package SImpleJavaPrograms;

import java.util.Scanner;

public class MathematicalCalculations 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter firstNumber :" );
		double firstNumber = scanner.nextDouble();
		System.out.println("Enter Any One Oparetor [ + , - , * , / ]" );
		char Oparetor = scanner.next().charAt(0);
		System.out.println("Enter secondNumber :");
		double secondNumber = scanner.nextDouble();
		double result = 0;
		boolean Status = true;
		scanner.close();
		
		switch(Oparetor)
		{
		case '+' : result = firstNumber + secondNumber; break;
		case '-' : result = firstNumber - secondNumber; break;
		case '*' : result = firstNumber * secondNumber; break;
		case '/' : result = firstNumber / secondNumber; break;
		default : System.out.println("Invalid Oparetors " + Oparetor); Status = false;		
		}
		if(Status)
		{
			System.out.println(firstNumber + "" + Oparetor + "" + secondNumber + ":" + result );
		}
	}
}
