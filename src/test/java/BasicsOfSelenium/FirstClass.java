package BasicsOfSelenium;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstClass {
	
	@Test
	public void login() throws InterruptedException
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
		Thread.sleep(5000);
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("email")));
		WebElement username =browser.findElement(By.id("email"));
		username.sendKeys("sathish");
		username.clear();
	//	browser.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("fita");
	
		// browser.findElement(By.linkText("Forgotten password?")).click();
		//browser.findElement(By.partialLinkText("Forg")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input#pass")));
		
		browser.findElement(By.cssSelector("input#pass")).sendKeys("Test");
		
		
	}
	

}
