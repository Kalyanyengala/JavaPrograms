package TestMethodClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjectClasses.OrangeHRM;
import PageObjectClasses.WithPageFactory;

public class TestMethod1 
{  
	WebDriver driver;
	
	
	@BeforeClass
	void setUp()
	{		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test()
	void testLogin()
	{
		WithPageFactory factory = new WithPageFactory(driver);
		factory.setUpUserName("Admin");
		factory.setuserPassword("admin123");
		factory.clickButton();		
		
	}
	@AfterClass
	void tearDown()
	{   
		driver.close();
		driver.quit();
	}
	
}
