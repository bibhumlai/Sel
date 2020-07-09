package d1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class selectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","F:\\\\seleniumj\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        driver.get("https://formy-project.herokuapp.com/radiobutton");;
        
       
        
        
       
    
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        
        radioButton2.click();
        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        
        radioButton3.click();
        
        WebElement radioButton1 = driver.findElement(By.cssSelector("input#radio-button-1"));
        
        radioButton1.click();
       
       /** driver.close();**/
        
	}

}
