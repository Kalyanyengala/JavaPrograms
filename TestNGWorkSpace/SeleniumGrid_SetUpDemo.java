package TestNGWorkSpace;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGrid_SetUpDemo
{
	public static WebDriver driver;
    public Properties p;

    @BeforeClass
    @Parameters({"browser", "url"})
    void setUp(String browser, String url) throws IOException {
        FileReader file = new FileReader("src/test/resources/UtilitysOfPropertyFile.properties");
        p = new Properties();
        p.load(file);

        if (p.getProperty("executionEnv").equalsIgnoreCase("remote")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            if (browser.equalsIgnoreCase("windows")) {
                capabilities.setPlatform(Platform.WIN10);
            } else if (browser.equalsIgnoreCase("mac")) {
                capabilities.setPlatform(Platform.MAC);
            } else {
                System.out.println("No Matching Platforms");
                return;
            }

            switch (browser.toLowerCase()) {
                case "chrome":
                    capabilities.setBrowserName("chrome");
                    break;
                case "edge":
                    capabilities.setBrowserName("MicrosoftEdge");
                    break;
                case "firefox":
                    capabilities.setBrowserName("firefox");
                    break;
                default:
                    System.out.println("No Browser Matching");
                    return;
            }
            String huburl = "http://192.168.0.102:4444/wd/hub";

            driver = new RemoteWebDriver(new URL(huburl), capabilities);
        } 
        else if (p.getProperty("executionEnv").equalsIgnoreCase("local"))
        {
            if (browser.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            }
        }
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Test(dataProvider = "LoginData")
    void loginPage(String username, String password) {
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        boolean status = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
        if (status) {
            driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
            WebElement logout = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
            logout.click();
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }

    @AfterClass
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @DataProvider(name = "LoginData", indices = 3)
    Object[][] logindata() {
        return new Object[][]{
            {"kalyan", "kalyan123"},
            {"guru", "guru123"},
            {"naveen", "naveen123"},
            {"Admin", "admin123"}
        };
    }
}