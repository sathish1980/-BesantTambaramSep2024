package BasicsOfSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class Screenshot {


	@Test
	public void launch() throws IOException, InterruptedException
	{
	
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/dashboard.xhtml");
		captureScreenshot(browser,"firstscreenshot");
		JavascriptExecutor js= (JavascriptExecutor)browser;
		//vertical scroll down
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(2000);
		captureScreenshot(browser,"secondscreenshot");
		// verticalupward
		js.executeScript("window.scrollBy(0,-300)", "");
		Thread.sleep(2000);
		captureScreenshot(browser,"thirdscreenshot");
		
	}

	public void captureScreenshot(WebDriver browser,String filename) throws IOException
	{
		TakesScreenshot scr = (TakesScreenshot)browser;
		File sourcefile =scr.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(System.getProperty("user.dir")+"\\Screenshot\\"+filename+".png");
		FileUtils.copyFile(sourcefile, destinationFile);
	}
	
}
