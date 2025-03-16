package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

import BrowserDriver.BrowserLaunch;
import Commons.Elements;
import Pages.SearchPage;
import Pages.SearchResultPage;
import Utils.PropertyFileRead;

public class MakeMyTripFlightSearchTestcase extends BrowserLaunch {
	
	/*
	 * valid flight search
	 * invalid flight search
	 */
	
@BeforeSuite
public void Launch() throws IOException
{
	LaunchTheBrowser();	
}

@BeforeTest
public void EnterUrl() throws IOException
{
	String url = PropertyFileRead.GetDataFromPropFile().getProperty("url");
	driver.get(url);
}

@BeforeClass
public void ClearPopups() throws InterruptedException
{
	Thread.sleep(3000);
	Elements.WaitForClickableByElement(driver, driver.findElement(By.xpath("//span[@data-cy='closeModal']")));
	
	Elements.ClickOnButton(driver.findElement(By.xpath("//span[@data-cy='closeModal']")));
}

@Test(priority=0)
public void ValidateFigltSearchwithValidvalues() throws InterruptedException
{
	/*
	 * Select from location
	 * select to location
	 * select date
	 * Click search
	 * Validate the result
	 */
	SearchPage sp = new SearchPage(driver);
	sp.SelectFromLocation("MAA");
	sp.SelectToLocation("BLR");
	sp.SelectDate("22");
	sp.clickOnSearchbutton();
	boolean expectedResult=true;
	SearchResultPage srp = new SearchResultPage(driver);
	boolean actualResult = srp.GetsearchResult("MAA");
	Assert.assertEquals(actualResult, expectedResult);
	Elements.ClickBackButton(driver);
}

@Test(priority=1)
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

@AfterSuite
public void closethebrowser()
{
	ClosetheBrowser();
}
}
