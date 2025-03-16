package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Commons.Elements;

public class SearchResultPage {

	WebDriver driver;
	
	public SearchResultPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public boolean GetsearchResult(String value) throws InterruptedException
	{
		Thread.sleep(3000);
		String title = Elements.GetTitle(driver);
		if(title.contains(title))
		{
			return true;
		}
		/*Elements.WaitForVisible(driver, By.xpath("//*[@class='error-title']"));
		return Elements.GetText(driver.findElement(By.xpath("//*[@class='error-title']")));
		 */
		return false;
	}
	
}
