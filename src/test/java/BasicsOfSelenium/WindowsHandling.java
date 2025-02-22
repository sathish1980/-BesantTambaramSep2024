package BasicsOfSelenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WindowsHandling {

	@Test
	public void login() throws InterruptedException
	{
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		//browser.manage().window().minimize();
		browser.get("https://leafground.com/window.xhtml");
		
		//get the current window name
		String parentWindow = browser.getWindowHandle();
		browser.findElement(By.id("j_idt88:new")).click();
		Set<String> AllWindows = browser.getWindowHandles();
		for(String childwindow : AllWindows)
		{
			if(!childwindow.equalsIgnoreCase(parentWindow))
			{
				browser.switchTo().window(childwindow);
				List<WebElement> exist = browser.findElements(By.id("menuform:j_idt40"));
				if(exist.size()>0)
				{
					browser.findElement(By.id("menuform:j_idt40")).click();
					browser.findElement(By.id("menuform:m_input")).click();
					browser.findElement(By.id("j_idt88:name")).sendKeys("FITA");
					break;
					
				}
			}
			
		}
		browser.switchTo().window(parentWindow);
		browser.close();
	}
}
