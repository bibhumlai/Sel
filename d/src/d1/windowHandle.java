package d1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class windowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","F:\\\\seleniumj\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        driver.get("https://formy-project.herokuapp.com/switch-window");;
        
        WebElement tab = driver.findElement(By.id("new-tab-button"));
       
        tab.click();
        
        String originalHandle = driver.getWindowHandle();
        
        for (String handle1: driver.getWindowHandles()) {
        	driver.switchTo().window(handle1);
        }
        driver.switchTo().window(originalHandle);
    
        
       
        driver.quit();
        
	}

}
