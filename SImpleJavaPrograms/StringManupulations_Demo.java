package SImpleJavaPrograms;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StringManupulations_Demo 
{
	//public static void main(String[] args) 
	{
		String string = "Automation Testing With Selenium";
		String string1 = "Automation Testing With Selenium";
		
		
		// 1. finding length of string !
		
		System.out.println("Printing length of string : "+string.length());  // Length is 32 
		
		//2. finding charectear of charecter !
		
		System.out.println("Printing charecter of string :"+ string.charAt(7)); // Charecter is i
		
		// 3. finding index of charectere first occurences of 'n' is 9 !
		
		System.out.println("Printing indexof charecter :" + string.indexOf('n'));  
		
		// 4. finding second occurences of 'n' this will gives second occurences of 'n' is 16 !
		
		System.out.println("Printing second occurences of n : " + string.indexOf('n',string.indexOf('n')+1 ));
		
		// 5. finding third occurences of 'n' this will gives third occurences of 'n' is 28 !
		
		char target = 'n';
		int occurences = 3;
		int count = 0;
		int index = -1;
		
		for (int i = 0; i<string.length(); i++)
		{
			if(string.charAt(i) == target)
			{
				count++;
			}
			if(count == occurences)
			{
				index = i;
				break;
			}
			
		}
		if(index != -1)
		{
			System.out.println("Printing third Occurences of n is:" + index);
		}
		else
		{
			System.out.println("The character 'n' does not occur: " + occurences + " times.");
		}
		
		// 6.finding index of charectere of string !
		
		System.out.println("Printing 'with' of string :" + string.indexOf("With"));
		
		// 7. finding string is part of main string it is not means it gives -1 as output ! Interview question!
		
		System.out.println("Printing index of string which is not part of main string  :" +string.indexOf("Tester"));
		
		// 8. Comparing both strings with same values !
		
		System.out.println("Comparing both strings :"+ string.equals(string1));
		
		// 9. Comparing with strings with difference of casesencitive !
		
		System.out.println("Comparing both strings without casesentivity :" + string.equalsIgnoreCase(string1));
		
		// 10. finding substring 'Testing With Selenium'!
		
		System.out.println("Printing substring of values:" + string.substring(10));
		
		// 10. finding substring of particular range  'Automation Testing' !
		
		System.out.println("Printing substring of values from range :" + string.substring(0, 19));
		
		// 11. triming before and after spaces between string 'Automation Testing With Selenium'!
		
		System.out.println("Printing string with trimmed :" + string.trim());
		
		// 12. removing space between string charecters 'AutomationTestingWithSelenium'! difference of trim and replace
		
		System.out.println("Printing string without spaces :" + string.replace(" ", ""));
		
		// 13. splting of string !
		
		String s[] = string.split(" ");
		for(int i=0; i<s.length; i++)
		{
			System.out.println("Printing split values from string arrays: "+ s[i]);
		}
		
		// 14. concatinate oparetions  Most important interview question if string starts first then + concates string not first then + it will add !
		
		String a = "Hello";
		String b = "World";
		
		int x = 100;
		int y = 200;
		
		System.out.println("Printing both a and b :" + a+b); // HelloWorld
		System.out.println("Printing both of x and y values :" + x+y);  // 100200 here it will concate both values
		System.out.println(x + y ); // here it will add 300
		System.out.println("Printing all values :" + a + b + x + y); // here it will concate HelloWorld100200 because + before has text 
		System.out.println(x + y + a + b); // 300HelloWorld
		System.out.println("Printing both values :" + a + b + (x+y));  // HelloWorld300
		
		// 15.Occurrences of character repeated times 
		
		int length = string.length();
		String replace = string.replace("n","");
		int length2 = replace.length();
		System.out.println("Printing of n :" + (length - length2));
		
		// 16. Occurrences of character repeated times 
		char arr[] = string.toCharArray();
		int Count = 0;
		for(int i = 0; i<arr.length; i++)
		{
			if('n' == arr[i])
			{
				Count++;
			}
		}
		System.out.println("Printing n :" + Count);
		
		// 17. Printing reverse words 
		
		String stringArray[] = string.split(" ");
		String reversedString = "";
		
		for(String Rev:stringArray)
		{
			String reversedWord = "";
			for(int i = Rev.length()-1; i>=0; i--)
			{
				reversedWord = reversedWord + Rev.charAt(i);
			}
			reversedString = reversedString + reversedWord + " ";
		}
		System.out.println("Printing reversedString :" + reversedString);
		
		// 18. version of java 
		System.out.println("Printing version of java :" + System.getProperty("java.version"));
		
		// 19. Print Date
		
		Date date = new Date();
		System.out.println("Printing current date :" + date);
		
		// 20. Capitalizing firstletter in every word !
		
		String words = "this is first statement for capitalization";
		String array[] = words.split(" ");
		String finalStatement = "";
		for(String stringArr : array)
		{
			char charArr[] = stringArr.toCharArray();
			char firstIndex = charArr[0];
			String word = String.valueOf(firstIndex).toUpperCase();
			String finalWord = word;
			
			for(int i = 1; i <charArr.length; i++)
			{
				finalWord = finalWord + charArr[i];
			}
			
			finalStatement = finalStatement + finalWord + " ";
		}
		System.out.println("Printing capitalized letters :" + finalStatement);	
		
		// 21. reverse the position of words in the String using Collections
		
		String sentenc = "This is statement of java";
		String S[] = sentenc.split(" ");
		List<String> collection = Arrays.asList(S);
		Collections.reverse(collection);
		for(String collect : collection)
		{
			System.out.println(collect + " ");
		}
		
		// 22. Print half of string kalyan ---> kal
		
		String half = "Kalyan";
		int lengt = half.length();
		System.out.println(half.substring(0, lengt / 2));
		
		// 23 .Remove duplicates from string 
		
				String coconut = "coconut";
				Set<Character> set = new LinkedHashSet<Character>();  // ---> HashSet couldNot Maintain Order do we use LinkedHashSet
				for(int i = 0; i < string.length(); i++)
				{
					set.add(string.charAt(i));
				}
				StringBuffer stringbuffer = new StringBuffer();
				for(Character letter : set)
				{
				    stringbuffer.append(letter);
				}
				
				System.out.println(stringbuffer);
				
		// 24.left rotate a String by 1 position
				
				String coco = "coconut";
				char coc[] = coco.toCharArray();
				char fi = coc[0];
				for(int i = 0; i< coc.length-1; i++)
				{
					array[i] = array[i + 1];
				}
				coc[coc.length-1] = fi;
				
				StringBuffer sb = new StringBuffer();
				
				for(char C : coc)
				{
					sb.append(C);
				}
				System.out.println(sb);	
				
		// 25. left rotate a string by 3 positions 
				String rotate = "rotate";
				char rot[] = rotate.toCharArray();				
				int number = 3;
				for(int i = 0; i < number; i++)
				{
					char firstIndex = rot[0]; 
					
					for(int j = 0; j<= rot.length-1; j++)
					{
						rot[i] = rot[i+1];
					}
					rot[rot.length-1] = firstIndex;
				}				
				
                StringBuffer r = new StringBuffer();
				
				for(char rott : rot)
				{
					sb.append(rott);
				}
				System.out.println(r);			
		
	}
	
	// Test  
	
	//public static void main(String[] args) 
	{
		String words = "this is first statement for capitalization";
		String array[] = words.split(" ");
		String finalStatement = "";
		for(String stringArr : array)
		{
			char charArr[] = stringArr.toCharArray();
			char firstIndex = charArr[0];
			String word = String.valueOf(firstIndex).toUpperCase();
			String finalWord = word;
			
			for(int i = 1; i <charArr.length; i++)
			{
				finalWord = finalWord + charArr[i];
			}
			
			finalStatement = finalStatement + finalWord + " ";
		}
		System.out.println("Printing capitalized letters :" + finalStatement);
		
		// Example 2
		
		String charectere = "welcome to the world of bharath";
		String stringArray[] = charectere.split(" ");
		String finalLetters = "";
		for(String strArray : stringArray)
		{
			char charArray[] = strArray.toCharArray();
			char firstLetter = charArray[0];
			String covertedValue = String.valueOf(firstLetter).toUpperCase();
			String valueWord = covertedValue;
			
			for(int i = 1; i< charArray.length; i++)
			{
				valueWord = valueWord + charArray[i];
			}
			
			finalLetters = finalLetters + valueWord + " ";
		}
		System.out.println("Printing charecters in capitalLetters :" + finalLetters);		
		
	}
	
	
	public static void main(String[] args) 
	{
//		String sentenc = "This is statement of java";
//		String S[] = sentenc.split(" ");
//		List<String> collection = Arrays.asList(S);
//		Collections.reverse(collection);
//		for(String collect : collection)
//		{
//			System.out.print(collect + " ");
//		}
		
//		String a = "Kalyan";
//		String rev = "";
//		for(int i = 3; i<=a.length()-1;i++)
//		{
//		   rev = rev + a.charAt(i);
//		}
//		System.out.println(rev);
		
		// Remove duplicates from string 
		
//		String string = "coconut";
//		Set<Character> set = new LinkedHashSet<Character>();  // ---> HashSet couldNot Maintain Order do we use LinkedHashSet
//		for(int i = 0; i < string.length(); i++)
//		{
//			set.add(string.charAt(i));
//		}
//		StringBuffer stringbuffer = new StringBuffer();
//		for(Character letter : set)
//		{
//		    stringbuffer.append(letter);
//		}
//		
//		System.out.println(stringbuffer);
//		
		// left rotate a String by 1 position
		
//		String coco = "coconut";
//		char array[] = coco.toCharArray();
//		char first = array[0];
//		for(int i = 0; i< array.length-1; i++)
//		{
//			array[i] = array[i + 1];
//		}
//		array[array.length-1] = first;
//		
//		StringBuffer stringbuffer = new StringBuffer();
//		
//		for(char arr : array)
//		{
//			stringbuffer.append(arr);
//		}
//		System.out.println(stringbuffer);	
		
		
		String rotate = "rotate";
		char rot[] = rotate.toCharArray();				
		int number = 3;
		for(int i = 0; i < number; i++)
		{
			char firstIndex = rot[0]; 
			
			for(int j = 0; j< rot.length-1; j++)
			{
				rot[j] = rot[j+1];
			}
			rot[rot.length-1] = firstIndex;
		}				
		
        StringBuffer r = new StringBuffer();
		
		for(char rott : rot)
		{
			r.append(rott);
		}
		System.out.println(r);	
			
	}
	}
