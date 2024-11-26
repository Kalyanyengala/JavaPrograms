package TestNGWorkSpace;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Grouping_Demo
{
	WebDriver driver;
	
	@Test(priority = 1, groups = "sanity")
	void groupOne( )
	{
		System.out.println("Printing From GroupOne Sanity");
	}
	
	@Test(priority=2,groups ="sanity")
	void groupTwo()
	{
		System.out.println("Printing From groupTwo Sanity");
	}
	
	@Test(priority=3, groups="regression")
	void groupThree()
	{
		System.out.println("Printing From groupThree regression");
	}
	
	@Test(priority = 4, groups = "regression")
	void groupFour()
	{
		System.out.println("Printing From groupFour regression");
	}
	
	@Test(priority = 5, groups = {"sanity", "regression", "functional"})
	void groupFive()
	{
		System.out.println("Printing From groupFive both sanity,regression and Functional  ");
	}
	
	@Test(priority = 6, groups={"sanity", "regression", "functional"})
	void groupSix()
	{
		System.out.println("Printing From groupSix both sanity,regression  and Functional");
	}
	
}
