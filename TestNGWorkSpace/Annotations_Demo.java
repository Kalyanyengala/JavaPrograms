package TestNGWorkSpace;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations_Demo 
{  WebDriver driver;
	

    @Test
    @BeforeClass
	void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	void status()
	{
		boolean status = driver.findElement(By.xpath("//h5[normalize-space()='Login']")).isDisplayed();
		System.out.println(status);
	}
	
	@Test(priority = 1, dependsOnMethods = "setUp")
	void pageLocators()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	

}
