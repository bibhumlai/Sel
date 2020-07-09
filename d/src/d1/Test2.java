package d1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","F:\\\\seleniumj\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        driver.get("https://formy-project.herokuapp.com/form");;
        
       
        
        
       
    
      
        driver.findElement(By.cssSelector("input#first-name")).sendKeys("Bibhu");
        
        driver.findElement(By.cssSelector("input#lastt-name")).sendKeys("Sahu");
        driver.findElement(By.cssSelector("input#job-title")).sendKeys("SSE");
        driver.findElement(By.cssSelector("input#radio-button-3")).click();
        driver.findElement(By.cssSelector("input#checkbox-1")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click();
        driver.findElement(By.className("datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-top")).sendKeys("10/10/1991");
        WebElement dropd = driver.findElement(By.cssSelector("input#Dropdown"));
        dropd.click();
       /** driver.close();**/
        
	}

}
