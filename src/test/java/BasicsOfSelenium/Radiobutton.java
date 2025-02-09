package BasicsOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Radiobutton {
	
	@Test
	public void login() throws InterruptedException
	{
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		//browser.manage().window().minimize();
		browser.get("https://leafground.com/radio.xhtml");
		browser.findElement(By.xpath("(//*[@id='j_idt87:console1']//div[starts-with(@class,'ui-radiobutton-box')])[last()]")).click();
		
	}

}
