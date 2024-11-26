package SImpleJavaPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringsAreANagrams 
{
	/* Anagrams COnditions : 
	 *  
	 *  1. Strings both length should be same and convert to lowercase while working
	 *  2. Strings Characters must be in it but avoid indexing! this strings is anagrams !
	 *  3. Example : string1 : bat string2 : tab ------> anagram String 
	 */
	
	public static void main(String[] args)
	{
		// Example 1 Using Map 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first String :");
		String firstString = scanner.nextLine().toLowerCase().replaceAll("\\s","");
		System.out.println("Enter second String :");
		String secondString = scanner.nextLine().toLowerCase().replaceAll("\\s","");
		scanner.close();
		
		// FirstMethod:
		
		if(isStringAnagram(firstString, secondString))
		{
			System.out.println("Given firstString : " + firstString + " And secondString : " + secondString + " Are Anagrams." );			
		}
		else
		{
			System.out.println("Given firstString : " + firstString + " And secondString : " + secondString + " Are Not Anagrams." );		
		}	
		
		// Second Method Calling :
		
		if(givenStringAnagram(firstString, secondString))
		{
			System.out.println("Given firstString : " + firstString + " And secondString : " + secondString + " Are Anagrams." );			
		}
		else
		{
			System.out.println("Given firstString : " + firstString + " And secondString : " + secondString + " Are Not Anagrams." );		
		}
	}
	
	public static boolean isStringAnagram(String firstString, String secondString)
	{
		Map<Character,Integer> mapOne = new HashMap<Character,Integer>();
		Map<Character,Integer> mapTwo = new HashMap<Character,Integer>();
		
		for(int i = 0; i < firstString.length(); i++)
		{
			char ca = firstString.charAt(i);
			if(mapOne.get(ca) == null)
			{
				mapOne.put(ca,1);
			}
			else
			{
				mapOne.put(ca,mapOne.get(ca) + 1);
			}
		}
		for(int i = 0; i < secondString.length(); i++)
		{
			char ca = secondString.charAt(i);
			if(mapTwo.get(ca) == null)
			{
				mapTwo.put(ca, 1);
			}
			else
			{
				mapTwo.put(ca,mapTwo.get(ca) + 1);
			}
		}
		return mapOne.equals(mapTwo);
	}
	
	public static boolean givenStringAnagram(String firstString, String secondString)
	{
		char arrayOne[] = firstString.toCharArray();
		char arrayTwo[] = secondString.toCharArray();
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		
		return Arrays.equals(arrayOne, arrayTwo);
	}

}
