package d1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxProfile.*;
import org.openqa.selenium.remote.DesiredCapabilities;
public class autocomplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","F:\\\\seleniumj\\geckodriver.exe");
		
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("Permission.default.desktop-notification", 1);
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.PROFILE, profile);
		WebDriver driver = new FirefoxDriver(capabilities);
        driver.get("https://formy-project.herokuapp.com/autocomplete");;
        
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("36 Lee Centre Drive");
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
     
        autocompleteResult.click();
        /**driver.close();**/
        
	}

}
