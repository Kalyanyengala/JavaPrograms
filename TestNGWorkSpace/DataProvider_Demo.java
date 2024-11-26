package TestNGWorkSpace;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Demo 
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
	
	@Test(dataProvider ="LoginData")
	
	void testLogin(String username , String password)
	{

		WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		boolean status = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
		
		if (status==true)
		{
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			WebElement logout=driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
			logout.click();
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.fail();
		}
	} 
    @AfterClass
    void tearDown()
    {   
    	driver.close();    	
    }
    
    @DataProvider(name = "LoginData")
    Object[][] logindata()
    {
    	Object[][] data =
    	{
    			{"kalyan","kalyan123"},
    			{"guru","guru123"},
    			{"naveen","naveen123"},
    			{"Admin","admin123"}
    	};
    	return data;
    	
    }}

	

