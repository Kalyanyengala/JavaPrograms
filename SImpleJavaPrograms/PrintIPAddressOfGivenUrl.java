package SImpleJavaPrograms;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class PrintIPAddressOfGivenUrl 
{
	public static void main(String[] args) throws UnknownHostException 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter URL :" );
		String userURL = scanner.nextLine();       // input should be : www.google.com
		try 
		{
		InetAddress ipAddress = InetAddress.getByName(userURL);
		System.out.println("IPAddress of Page is :" + ipAddress);
		}
		catch(Exception e)
		{
			System.out.println("Invalid URL");
		}
	}

}
