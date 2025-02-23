package BasicsOfSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tables {

	@Test
	public void login() throws InterruptedException
	{
		String expectedCountry="India";
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		//browser.manage().window().minimize();
		browser.get("https://leafground.com/table.xhtml");
		List<WebElement> allpages =browser.findElements(By.xpath("//span[@class='ui-paginator-pages']//a"));
		for(int j=1;j<=allpages.size();j++)
		{
			browser.findElement(By.xpath("//span[@class='ui-paginator-pages']//a["+j+"]")).click();
			Thread.sleep(1000);
		
		
			List<WebElement> allrows =	browser.findElements(By.xpath("//tbody[@id='form:j_idt89_data']//tr"));
			for(int i=1;i<=allrows.size();i++)
			{
				String actualCountry =browser.findElement(By.xpath("//tbody[@id='form:j_idt89_data']//tr["+i+"]//td[2]//span[contains(@style,'vertical')]")).getText();
				if(actualCountry.equalsIgnoreCase(expectedCountry))
				{
					String name = browser.findElement(By.xpath("//tbody[@id='form:j_idt89_data']//tr["+i+"]//td[3]//span[contains(@style,'vertical')]")).getText();
					System.out.println(name);
				}
			}
			}
	}
}
