package SImpleJavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharectersOfString_Demo 
{
	//public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string value:");
		String name = scanner.next();
		char array[] = name.toCharArray();
		scanner.close();
		Map<Character,Integer> mapValue = new HashMap<Character,Integer>();		
		
		for(Character arr:array)
		{
			if(mapValue.containsKey(arr))
			{
				mapValue.put(arr,mapValue.get(arr)+1);
			}
			else
			{
				mapValue.put(arr,1);
			}
			
		}
		for(Character mp:mapValue.keySet())
		{
			if(mapValue.get(mp)>1)
			{
				System.out.println("Character " + mp + " is repeted " + mapValue.get(mp) +  " times ");
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string value:");
		String name = scanner.next();
		char array[] = name.toCharArray();
		scanner.close();
		Map<Character,Integer> mapValue = new HashMap<Character,Integer>();		
		
		for(Character ar:array)
		{
			if(mapValue.containsKey(ar))
			{
				mapValue.put(ar,mapValue.get(ar)+1);
			}
			else
			{
				mapValue.put(ar,1);
			}
		}
		for(Character values : mapValue.keySet())
		{
			if(mapValue.get(values)>1)
			{
				System.out.println("Character " + values +  " is repeted " + mapValue.get(values) + " times " );
			}
		}        
		
	}

}
