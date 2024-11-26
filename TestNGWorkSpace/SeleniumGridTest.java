package TestNGWorkSpace;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class SeleniumGridTest {
    public static void main(String[] args) {
        try {
            
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setPlatform(Platform.WINDOWS);
            capabilities.setBrowserName("chrome");
            
            URL hubUrl = new URL("http://localhost:4444/wd/hub");

           
            WebDriver driver = new RemoteWebDriver(hubUrl, capabilities);

            
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            System.out.println("Page title is: " + driver.getTitle());

           
            driver.quit();
        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
