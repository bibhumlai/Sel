package d1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class dragndrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","F:\\\\seleniumj\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        driver.get("https://formy-project.herokuapp.com/dragdrop");;
        
        WebElement image = driver.findElement(By.id("image"));
       
      
        
        
        WebElement box = driver.findElement(By.id("box"));
        
        Actions actions = new Actions(driver);
        actions.dragAndDrop(image, box).build().perform();
        
    
        
       
       /** driver.close();**/
        
	}

}
