package TestNGWorkSpace;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Utilities.ExtentReportManager;


import com.google.common.io.Files;

import org.testng.annotations.Parameters;  


//1. First implement itestlisteners interface into one new class 
//2. Then add listeners methods into that class 
//3. Once added methods then create xml file and add listener class and testcase class twp different tags and run it!
//4. Finalyy without xml also we can run listeners with class by adding listeners class name at top of public class in testclass!
//5. Syntax is "Listeners(Listeners_Implemented.class) " like this then automatically listeners will triggers !
//6. Map extent reporter implementation into listeners class as per actions we can add and run this through xml file!



//@Listeners(ExtentReportManager.class) 
public class DataProvider_SwitchCaseBrowser 
{
  WebDriver driver;
 
  
  @BeforeClass
  @Parameters({"browser", "url"})
  void setUp(String browser, String url)
  {     	  
	  if(browser.equalsIgnoreCase("chrome")) //------> Another way to using to open browser
	  {
		    driver = new ChromeDriver();
		    driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();  
	  }
	  if(browser.equalsIgnoreCase("edge"))
	  { 
		    driver = new EdgeDriver();
		    driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();		  
	  }
	  if(browser.equalsIgnoreCase("firefox"))
	  {
		    driver = new FirefoxDriver();
		    driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
	  }
	  

  
  }
  
  @Test(dataProvider = "LoginData")
  void loginPage(String username, String password)
  {
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
  
  
  
  @DataProvider(name = "LoginData", indices = 3)
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
  	
  }
  

//@Parameters("browser")
//void browserSetUp(String browser)
//{
//	  switch(browser.toLowerCase())    //-----> One Way to provide browser using switch case
//	  {
//	  case "chrome" : driver = new ChromeDriver();break;
//	  case "edge" : driver = new EdgeDriver();break;
//	  case "firefox" : driver = new FirefoxDriver();break;
//	  default: System.out.println("Illegal Entry : "+browser);return;
//	  
//	  }
//}
//	browserSetUp(browser);   ------> One way by using SwitchCase for this method void browserSetUp(String browser)
//  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	driver.manage().window().maximize();


}
  
  