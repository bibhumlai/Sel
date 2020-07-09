package d1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","F:\\\\seleniumj\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        driver.get("https://formy-project.herokuapp.com/scroll");;
        
        WebElement name = driver.findElement(By.id("name"));
       
        
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Hi");
        
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("12/12/2019");
        
       
        driver.close();
        
	}

}
