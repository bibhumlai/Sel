package d1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class formPage {
	
	public static void submitForm(WebDriver driver )
	{
driver.findElement(By.cssSelector("input#first-name")).sendKeys("Bibhu");
        
        driver.findElement(By.cssSelector("input#last-name")).sendKeys("Sahu");
        driver.findElement(By.cssSelector("input#job-title")).sendKeys("SSE");
        driver.findElement(By.cssSelector("input#radio-button-3")).click();
        driver.findElement(By.cssSelector("input#checkbox-1")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("10/10/1991");;
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
       /** driver.close();**/
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
	}

}
