package PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithPageFactory
{
	WebDriver driver;
	
	public WithPageFactory(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@placeholder='Username']")
	WebElement userName;
	
	@FindBy (xpath = "//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy (xpath = "//button[normalize-space()='Login']")
	WebElement clickBtn;
	
	public void setUpUserName(String username)
	{
		userName.sendKeys(username);
	}
	public void setuserPassword(String Password)
	{
		password.sendKeys(Password);
	}
	public void clickButton()
	{
		clickBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
