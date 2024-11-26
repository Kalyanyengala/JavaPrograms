package Oops_Demo;

public class EncapsulationDemo2 
{
	
	// In Java By Default We Will main One Main Class Only First It Recognises!

	String s1 ;
	String s2 ;
	String s3 ;
	
	 public String gets1()
	{
		return s1;
	}
	 public void sets1(String s1)
	 {
		  this.s1 = s1;
	 }
	 public String gets2()
	 {
		 return s2;
	 }
	 public void sets2(String s2)
	 {
		  this.s2 = s2;
	 }
	 public String gets3()
	 {
		 return s3;
	 }
	 public void sets3( String s3)
	 {
		  this.s3 = s3;
	 }
	 
	 public static void main(String Array[])
	 {
		 EncapsulationDemo2 ecd = new EncapsulationDemo2();
		 ecd.sets1("Hello Kalyan");
		 ecd.sets2("Welcome to Java");
		 ecd.sets3("Welcome to selenium");
		 System.out.println("This Is For ECD Class:");
		 
		 System.out.println(ecd.gets1());
		 System.out.println(ecd.gets2());
		 System.out.println(ecd.gets3());
		 
		 EncapsulationDemo2 O = new EncapsulationDemo2();
		 O.sets1("Renu");
		 O.sets2("pavan");
		 O.sets3("Kalyan");
		 System.out.println("This is for O Class:");
		 
		 System.out.println(O.gets1());
		 System.out.println(O.gets2());
		 System.out.println(O.gets3());
		 
		 Account account = new Account();
		 account.setAccount(100839839);
		 account.setName("GuruKalyan");
		 System.out.println("This is for Account Class:");
		 
		 account.setAmount(500000);
		 System.out.println(account.getAccount());
		 System.out.println(account.getName());
		 System.out.println(account.getAmount());
		 
				 
	 }

}

class User
{
	int i;
	int j;
	String st;
	
	public int geti()
	{
		return i;		
	}
	public void seti(int i)
	{
		this.i = i;
	}
	public int getj()
	{
		return j;
	}
	public void setj (int j)
	{
		this. j =j;
	}
	public String st()
	{
		return st;
	}
	public void setst(String st)
	{
		this.st = st;
	}
	
	
}

 class Account 
 {
	 private int Account;
	 private String Name;
	 private double Amount;
	 
	 
	 public int getAccount()
	 {
		 return Account;
	 }
	 public void setAccount( int Account)
	 {
		 this.Account = Account;
	 }
	 public String getName()
	 {
		 return Name;
	 }
	 public void setName( String Name)
	 {
		 this . Name = Name;
	 }
	 public double getAmount()
	 {
		 return Amount;
	 }
	 public void setAmount( double Amount)
	 {
		 this.Amount =  Amount;
	 }
 }










