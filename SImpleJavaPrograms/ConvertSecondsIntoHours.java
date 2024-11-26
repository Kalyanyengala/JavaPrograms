package SImpleJavaPrograms;

import java.util.Scanner;

public class ConvertSecondsIntoHours
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter seconds :");
		int seconds = scanner.nextInt();
		scanner.close();
		int minutes = seconds / 60;
		int reminingSeconds = seconds % 60;
		int hours = minutes / 60;
		int remainingMinutes= minutes % 60;
		
		System.out.println("Priniting hours :" + hours + ":" + remainingMinutes + ":" + reminingSeconds);
	}

}
