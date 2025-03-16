package BrowserDriver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utils.PropertyFileRead;

public class BrowserLaunch {
	
	public static WebDriver driver;
	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	//helps to generate the logs in test report.
	public static ExtentTest test;
	String reportPath=System.getProperty("user.dir")+"//Reports//testing.html";
	public void LaunchTheBrowser() throws IOException
	{
		String browserName = PropertyFileRead.GetDataFromPropFile().getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide a valid browser name");
		}
		driver.manage().window().maximize();
		LaunchExtentReport();
	}
	
	
	public void LaunchExtentReport()
	{
		htmlReporter = new ExtentSparkReporter(reportPath);
	    extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
	}
	
	public void CloseAndSaveExtentReport()
	{
		extent.flush();
	}
	
	public void ClosetheBrowser()
	{
		CloseAndSaveExtentReport();
		driver.quit();
	}

}
