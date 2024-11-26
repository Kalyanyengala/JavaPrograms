package TestNGWorkSpace;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityDemo {
WebDriver driver;	
	
	@Test(priority = 1 , groups="sanity")
	void Test1()
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 2 , groups="regression")
	void Test2()
	{
		boolean status = driver.findElement(By.xpath("//h5[normalize-space()='Login']")).isDisplayed();
		System.out.println(status);
	}
	
	@Test(priority = 3 , groups= {"sanity","regression","functional"})
	void Test3()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	@Test(priority = 4)
	void Test4()
	{
		driver.close();
		driver.quit();
	}
		
	
}
