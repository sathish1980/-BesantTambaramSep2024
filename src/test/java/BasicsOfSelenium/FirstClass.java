package BasicsOfSelenium;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstClass {
	
	@Test
	public void login()
	{
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		//browser.manage().window().minimize();
		browser.get("https://www.facebook.com/");
		//browser.navigate().back();
		//browser.navigate().forward();
		//browser.navigate().refresh();
		//browser.quit();
		/*
		 * locators
		 */
		WebElement username =browser.findElement(By.id("email"));
		username.sendKeys("sathish");
	//	browser.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("fita");
	
		// browser.findElement(By.linkText("Forgotten password?")).click();
		//browser.findElement(By.partialLinkText("Forg")).click();
		browser.findElement(By.cssSelector("input#pass")).sendKeys("Test");
		
	}
	

}
