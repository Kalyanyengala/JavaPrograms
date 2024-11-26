package PageObjectClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM 
{
	static WebDriver driver;
	
	public OrangeHRM(WebDriver driver)
	{
		this.driver = driver;
	}
	
	static By usertext = By.xpath("//input[@placeholder='Username']");
	static By userpassword = By.xpath("//input[@placeholder='Password']");
	static By buttonLogin = By.xpath("//button[normalize-space()='Login']");
	// By status = By.xpath("//h6[normalize-space()='Dashboard']");

	public static void setUser(String user)
	{
		try {
			driver.findElement(usertext).sendKeys("Admin");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static void setuserPassword(String password)
	{
		try {
			driver.findElement(userpassword).sendKeys("admin123");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void clickBTN()
	{
		driver.findElement(buttonLogin).click();
	}
	
	
	
	
}
