package SImpleJavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateString_Arrays 
{
	public static void main(String[] args)
	{
		// Example 1 Not Prefared Because it will take 0(n2) represents a time complexity  1 and 2 I Prefared!
		String str[] = {"Java", "Python", "JavaScript", "Selenium", "Java"};
		for ( int i = 0; i<str.length; i++)
		{
			for ( int j = i+1; j<str.length; j++)
			{
				if ( str[i].equals(str[j]))
				{
					System.out.println("Duplicates Founded :" + str[i]);
				}
					
			}
		}
		
		// Example 2 Hashset This will follows 0(n) so it is fast compare to above Preferred for complex values!
		
		Set<String> name = new HashSet<String>();
		
		for ( String value : str)
		{
			if(name.add(value)==false)
			{
				System.out.println("Duplicate Values Founded :" + value);
			}
		}
		
		//Example 3 HashMap This is also prefarred for complex values! 
		
		Map<String,Integer> mapvalue = new HashMap<String,Integer>();
		
		for (String value : str)
		{
			Integer count = mapvalue.get(value);
			
			if(count == null)
			{
				mapvalue.put(value, 1);
			}
			else
			{
				mapvalue.put(value, ++count);
			}
		}
		
		Set<Entry<String,Integer>> entryValue = mapvalue.entrySet();
		for(Entry<String,Integer> entry: entryValue)
		{
			if(entry.getValue()>1)
			{
				System.out.println("Duplicate Found :"+ entry.getKey());
			}
				
		}
		
	}

}
