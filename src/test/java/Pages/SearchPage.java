package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Commons.Elements;

public class SearchPage {
	
	WebDriver driver;

	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void CloseThePopupIfExist()
	{
		try
		{
		Elements.WaitForClickable(driver, By.xpath("//*[@data-cy='closeModal']"));
		Elements.ClickOnButton(driver.findElement(By.xpath("//*[@data-cy='closeModal']")));
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void SelectFromLocation(String from)
	{
		ClickFromLocationdropdown();
		SelectValueFromList(from);
	}
	
	public void SelectToLocation(String to)
	{
		ClickToLocationdropdown();
		SelectValueFromList(to);
	}
	
	public void SelectDate(String expectedDate) throws InterruptedException
	{
		Thread.sleep(3000);
		List<WebElement> allWeeks = driver.findElements(By.xpath("(//*[@class='DayPicker-Months']//div[@class='DayPicker-Month'])[last()]//div[@class='DayPicker-Week']"));
		for(WebElement eachWeek : allWeeks)
		{
			List<WebElement> allDaysInaWeek=	eachWeek.findElements(By.cssSelector("div[class^='DayPicker-Day']"));
			for (WebElement eachday : allDaysInaWeek)
			{
				
				String className = Elements.GetAttribute(eachday,"class");
				System.out.println(className);
				if(!(className.contains("outside")||className.contains("disabled")||className.contains("selected")))
				{
					String actualDate =Elements.GetText(eachday.findElement(By.tagName("p")));
					System.out.println(actualDate);
					if(actualDate.equalsIgnoreCase(expectedDate))
					{
						Elements.WaitForClickableByElement(driver, eachday);
						Elements.ClickOnButton(eachday);
						return ;
					}
				}
			}
		}
	}
	
	public void clickOnSearchbutton()
	{
		Elements.WaitForClickable(driver, By.xpath("//a[text()='Search']"));
		Elements.ClickOnButton(driver.findElement(By.xpath("//a[text()='Search']")));

	}
	public void ClickFromLocationdropdown()
	{
		Elements.WaitForClickable(driver, By.cssSelector("[for='fromCity']"));
		WebElement from = driver.findElement(By.cssSelector("[for='fromCity']"));
		Elements.ClickOnButton(from);

	}
	
	public void ClickToLocationdropdown()
	{
		Elements.WaitForClickable(driver, By.cssSelector("[for='toCity']"));
		WebElement to = driver.findElement(By.cssSelector("[for='toCity']"));
		
		Elements.ClickOnButton(to);
	}
	
	public void SelectValueFromList(String selectValue)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='react-autowhatever-1']//li)[last()]")));
		
		List<WebElement> allcountry =driver.findElements(By.xpath("//*[@id='react-autowhatever-1']//li"));
	
		for (WebElement eachElement : allcountry)
		{
			String Code = eachElement.findElement(By.cssSelector("div[class^='font14']")).getText();
			System.out.println(Code);
			if(Code.equalsIgnoreCase(selectValue))
			{
				eachElement.click();
				break;
			}
		}
	}
	
	
	public String GetSameCityError()
	{
		Elements.WaitForVisible(driver, By.cssSelector("[data-cy='sameCityError']"));
		
		return Elements.GetText(driver.findElement(By.cssSelector("[data-cy='sameCityError']")));
	}


	

}
