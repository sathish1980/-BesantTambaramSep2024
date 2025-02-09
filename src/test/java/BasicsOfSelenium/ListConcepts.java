package BasicsOfSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ListConcepts {
	
	
	@Test
	public void login() throws InterruptedException
	{
		String expectedText = "India";
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		//browser.manage().window().minimize();
		browser.get("https://leafground.com/select.xhtml");
		/*
		 * click the list
		 * wait for the load
		 * get all the values fomr the list
		 * then compare the list value one by one with your expected
		 * then click on it
		 */
		
		browser.findElement(By.xpath("(//*[@id='j_idt87:country']//child::div)[last()]")).click();
		List<WebElement> allcountry = browser.findElements(By.xpath("//*[@id='j_idt87:country_items']//li"));
		
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='j_idt87:country_items']//li)[last()]")));
		
		for(WebElement eachcountry :allcountry)
		{
			String text = eachcountry.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase(expectedText))
			{
				eachcountry.click();
				break;
			}
		}
	}

}
