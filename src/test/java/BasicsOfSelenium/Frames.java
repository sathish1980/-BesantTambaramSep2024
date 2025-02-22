package BasicsOfSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Frames {
	
	/*
	 * id
	 * name
	 * index
	 *  tagname -- > iframe
	 */

	@Test
	public void login() throws InterruptedException
	{
		
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		//browser.manage().window().minimize();
		browser.get("https://leafground.com/frame.xhtml");
		//Thread.sleep(2000);
		//browser.findElement(By.xpath("//*[@id='Click' and contains(@style,'fe875d ')]")).click();
		
		List<WebElement> allFrames = browser.findElements(By.tagName("iframe"));
		for(int i=0;i<allFrames.size();i++)
		{
			browser.switchTo().frame(i); // switch in to frame
			List<WebElement> exist = browser.findElements(By.xpath("//*[@id='Click' and contains(@style,'fe875d ')]"));
			if(exist.size()>0)
			{
				browser.findElement(By.xpath("//*[@id='Click' and contains(@style,'fe875d ')]")).click();
				break;	
			}
			browser.switchTo().defaultContent(); // come out of the frame
		}
		browser.switchTo().defaultContent();
	}
}

