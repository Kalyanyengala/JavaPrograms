package TestMethodClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjectClasses.OrangeHRM;

public class TestClasses {
public static WebDriver driver;

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
	OrangeHRM orange = new OrangeHRM(driver);
	orange.setUser("Admin");
	orange.setuserPassword("amin123");
	orange.clickBTN();
}
@AfterClass
void tearDown()
{   
	driver.close();
	driver.quit();
}

	
	

}
