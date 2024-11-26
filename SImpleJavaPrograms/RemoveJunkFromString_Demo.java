package SImpleJavaPrograms;

public class RemoveJunkFromString_Demo 
{
	public static void main(String[] args) 
	{
		String str = "!@#$%^&*() SeleniumJava @*&^%$#@! With Automation *&**&";
		
		//Removing Junk from string is with regular expression !
		
		str = str.replaceAll("[^0-1a-zA-Z]", "");  // ^ it is excludes particular statement
		System.out.println(str);
		
		String s = "*&^%$# Selenium";
		s = s.replaceAll("[^0-1a-zA-Z]", "");
		System.out.println(s);
		
		
		String replace = "*&^%$#Replace Junk &^%$## Charecters";
		replace = replace.replaceAll("[^0-1a-zA-Z]", "");
		System.out.println(replace);
		
		replaceStringJunk("*&^%$# QAEngineer &^%$##");
		
	}
	
	public static void replaceStringJunk(String input)
	{
		input = input.replaceAll("[^0-1a-zA-Z]", "");
		System.out.println("Replaced Junked Charecters From String:" +  input);
	}

}
