package d1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class getText {
	public static String getAlertBannerText(WebDriver driver)
	{
		return driver.findElement(By.className("alert")).getText();
}}
