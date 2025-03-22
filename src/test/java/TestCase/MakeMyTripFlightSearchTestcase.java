package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.Status;

import BrowserDriver.BrowserLaunch;
import Commons.Elements;
import Pages.SearchPage;
import Pages.SearchResultPage;
import Utils.ExcelfileRead;
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

@Test(priority=0,dataProvider="GetFlightSearchData",dataProviderClass=DataProviderDetails.class)
public void ValidateFigltSearchwithValidvalues(String from, String to ,String date, String value) throws InterruptedException
{
	/*
	 * Select from location
	 * select to location
	 * select date
	 * Click search
	 * Validate the result
	 */
	test = extent.createTest("SearchWithinValidValues Testcase");
	SearchPage sp = new SearchPage(driver);
	sp.SelectFromLocation(from);
	test.log(Status.INFO, "From value selected as : "+from);
	sp.SelectToLocation(to);
	test.log(Status.INFO, "to value selected as : "+to);
	sp.SelectDate(date);
	test.log(Status.INFO, "date value selected as : "+date);
	sp.clickOnSearchbutton();
	test.log(Status.INFO, "Search button is clicked");
	boolean expectedResult=true;
	SearchResultPage srp = new SearchResultPage(driver);
	test.log(Status.INFO, "Searchvalidation done "+from);
	boolean actualResult = srp.GetsearchResult(from);
	Assert.assertEquals(actualResult, expectedResult);
	Elements.ClickBackButton(driver);
	//test.log(Status.PASS, "Search validation passsed");
}

@Test(priority=1,dataProvider="GetFlightInvalidSearchData",dataProviderClass=DataProviderDetails.class)
public void ValidateFigltSearchwithinValidvalues(String from, String to) throws InterruptedException
{
	/*
	 * Select from location
	 * select to location
	 * select date
	 * Click search
	 * Validate the resultFrom & To airports cannot be the same
	 */
	test = extent.createTest("SearchWithinValidValues Testcase");
	SearchPage sp = new SearchPage(driver);
	sp.SelectFromLocation(from);
	test.log(Status.INFO, "From value selected as : "+from);
	sp.SelectToLocation(to);
	test.log(Status.INFO, "to value selected as : "+to);
	String expectedResult="From & To airports cannot be the same";
	String actualResult = sp.GetSameCityError();
	Assert.assertEquals(actualResult, expectedResult);
	//test.log(Status.PASS, "Assertion Passed");
}

@AfterMethod
public void WriteInReport(ITestResult result) throws IOException
	{
		if (result.getStatus()==ITestResult.SUCCESS) {
			String filePath = Elements.GetScreenshot(driver,result.getName());
		     test.log(Status.INFO,test.addScreenCaptureFromPath(filePath).toString());
          test.log(Status.PASS,"Test Method named as : "+ result.getName()+" is passed");

      }else if(result.getStatus()==ITestResult.FAILURE) {
          test.log(Status.PASS,"Test Method named as : "+ result.getName()+" is FAILED");
          String filePath = Elements.GetScreenshot(driver,result.getName());
          test.log(Status.INFO,test.addScreenCaptureFromPath(filePath).toString());
          test.log(Status.FAIL,"Test failure : "+ result.getThrowable());
      }
      else if(result.getStatus()==ITestResult.SKIP) {
          test.log(Status.SKIP,"Test Method named as : "+ result.getName()+" is skipped");
      }
	}
@AfterSuite
public void closethebrowser()
{
	ClosetheBrowser();
}
}
