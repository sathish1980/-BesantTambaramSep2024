package BasicsOfSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertsConcepts {
	
	@Test
	public void login() throws InterruptedException
	{
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		//browser.manage().window().minimize();
		browser.get("https://leafground.com/alert.xhtml");
		browser.findElement(By.name("j_idt88:j_idt91")).click();
		browser.switchTo().alert().accept();
		String text = browser.findElement(By.id("simple_result")).getText();
		System.out.println(text);
		
		
		browser.findElement(By.name("j_idt88:j_idt93")).click();
		browser.switchTo().alert().dismiss();
		String text1 = browser.findElement(By.id("result")).getText();
		System.out.println(text1);
		

		browser.findElement(By.name("j_idt88:j_idt104")).click();
		Alert al = browser.switchTo().alert();
		System.out.println(al.getText());
		al.sendKeys("FITA");
		al.accept();
		String text3 = browser.findElement(By.id("confirm_result")).getText();
		System.out.println(text3);
		
		browser.findElement(By.name("j_idt88:j_idt95")).click();
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("j_idt88:j_idt98")));
		
		browser.findElement(By.name("j_idt88:j_idt98")).click();
		
	}

}
