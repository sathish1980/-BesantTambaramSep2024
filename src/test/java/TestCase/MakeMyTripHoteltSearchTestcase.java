package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import BrowserDriver.BrowserLaunch;
import Commons.Elements;
import Pages.HotelSearchPage;
import Pages.SearchPage;
import Pages.SearchResultPage;
import Utils.PropertyFileRead;

public class MakeMyTripHoteltSearchTestcase extends BrowserLaunch {
	
	/*
	 * valid flight search
	 * invalid flight search
	 */
	


@BeforeClass
public void CickHotels() throws InterruptedException
{
	Thread.sleep(3000);
	Elements.WaitForClickableByElement(driver, driver.findElement(By.xpath("//li[@data-cy='menu_Hotels']//a")));
	Elements.ClickOnButton(driver.findElement(By.xpath("//li[@data-cy='menu_Hotels']//a")));
}

@Test(priority=0)
public void ValidateHotelSearchwithValidvalues() throws InterruptedException
{
	/*
	 * Select from location
	 * select to location
	 * select date
	 * Click search
	 * Validate the result
	 */
	/*SearchPage sp = new SearchPage(driver);
	sp.SelectFromLocation("MAA");
	sp.SelectToLocation("BLR");
	sp.SelectDate("22");
	sp.clickOnSearchbutton();*/
	HotelSearchPage srp = new HotelSearchPage(driver);
	String actualResult=srp.GetURL(driver);
	
	String expectedResult = "https://www.makemytrip.com/hotels/";
	Assert.assertEquals(actualResult, expectedResult);
	Elements.ClickBackButton(driver);
}

//@Test(priority=1)
public void ValidateFigltSearchwithinValidvalues() throws InterruptedException
{
	/*
	 * Select from location
	 * select to location
	 * select date
	 * Click search
	 * Validate the resultFrom & To airports cannot be the same
	 */
	SearchPage sp = new SearchPage(driver);
	sp.SelectFromLocation("MAA");
	sp.SelectToLocation("MAA");
	String expectedResult="From & To airports cannot be the same";
	String actualResult = sp.GetSameCityError();
	Assert.assertEquals(actualResult, expectedResult);
}

}
