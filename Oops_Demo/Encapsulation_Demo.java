package Oops_Demo;

public class Encapsulation_Demo {
	
	String s1;
	String s2;
	String s3;
	

	// Example 1
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}
	public void setS2(String s2) {
		this.s2 = s2;
	}

	public String getS3() {
		return s3;
	}
	public void setS3(String s3) {
		this.s3 = s3;
	}
	
	public static void main(String[] args)
	{
		Encapsulation_Demo ec = new Encapsulation_Demo ();
	
		ec.setS1("Hello");
		ec.setS2("Welcome");
		ec.setS3("Java");
		
		System.out.println(ec.getS1());
		System.out.println(ec.getS2());
		System.out.println(ec.getS3());
		
		Class clas = new Class ();
		clas.setinti(100);
		clas.setString("Hello");
	    System.out.print(clas.getinti());
	    System.out.print(clas.getString());
		
	}

}
class Class 
{
	int i;
	String st;
	
	
	public int getinti()
	{
		return i;
	}
	public int setinti( int i)
	{
		return this.i = i;
	}
	public String getString()
	{
		return st;
	}
	public String setString( String st)
	{
		return this.st = st;
	}

}
























