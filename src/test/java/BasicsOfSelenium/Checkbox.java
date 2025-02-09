package BasicsOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Checkbox {
	
	@Test
	public void login() throws InterruptedException
	{
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		//browser.manage().window().minimize();
		browser.get("https://leafground.com/checkbox.xhtml");
		browser.findElement(By.xpath("(//*[@id='j_idt87:j_idt89']//child::div)[last()]")).click();
		Thread.sleep(1000);
		browser.findElement(By.xpath("(//*[@id='j_idt87:j_idt89']//child::div)[last()]")).click();
		
		browser.findElement(By.className("ui-toggleswitch-slider")).click();
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-growl-title")));
		
		String text = browser.findElement(By.className("ui-growl-title")).getText();
		System.out.println(text);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ui-growl-title")));
		browser.findElement(By.className("ui-toggleswitch-slider")).click();
		String value = browser.findElement(By.xpath("(//*[@id='j_idt87:j_idt102']//child::div)[last()]")).getAttribute("class");
		System.out.println(value);
		if(!value.contains("disabled"))
		{
		browser.findElement(By.xpath("(//*[@id='j_idt87:j_idt102']//child::div)[last()]")).click();
		}//browser.navigate().back();
	}

}
