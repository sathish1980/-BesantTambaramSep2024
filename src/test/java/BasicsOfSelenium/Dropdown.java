package BasicsOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dropdown {
	
	@Test
	public void login() throws InterruptedException
	{
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		//browser.manage().window().minimize();
		browser.get("https://leafground.com/select.xhtml");
		Select dropdown = new Select(browser.findElement(By.className("ui-selectonemenu")));
		System.out.println(dropdown.isMultiple());
		dropdown.selectByIndex(2);
		Thread.sleep(1000);
		dropdown.selectByVisibleText("Cypress");
		//dropdown.selectByValue("");
		/*
		 * deselectbyindex
		 * deselectByvalue
		 * deselectbyVisibleText
		 * deselectall
		 */
	}

}
