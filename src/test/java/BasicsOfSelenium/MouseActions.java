package BasicsOfSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions {
	
	/*
	 * Actions - class
	 * movetoElement
	 * click
	 * doubleclick
	 * contextclick -- rigt click
	 * draganddrop
	 * draganddropby
	 * sendKeys
	 * clickandHold
	 * release
	 */
	
	//@Test
	public void login() throws InterruptedException
	{
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		//browser.manage().window().minimize();
		browser.get("https://www.ebay.com/");
		Actions mouseactions = new Actions(browser);
		//Thread.sleep(2000);
		mouseactions.moveToElement(browser.findElement(By.xpath("//*[@class='vl-flyout-nav__js-tab']//a[text()='Electronics']"))).perform();
		Thread.sleep(2000);
		mouseactions.moveToElement(browser.findElement(By.xpath("//a[text()='Computers and tablets']"))).click().perform();
		
	}
	
	@Test
	public void fb() throws InterruptedException, AWTException
	{
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		//browser.manage().window().minimize();
		browser.get("https://www.facebook.com/");
		Actions mouseactions = new Actions(browser);
		//Thread.sleep(2000);
		//mouseactions.moveToElement(browser.findElement(By.id("email"))).sendKeys("sathish").doubleClick().contextClick().perform();
		
		mouseactions.moveToElement(browser.findElement(By.id("email"))).sendKeys("sathish").perform();
		//mouseactions.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		mouseactions.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
		mouseactions.doubleClick().contextClick().perform();
		Thread.sleep(1000);
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		/*r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);*/
		
		
		
	}
	
	//@Test
	public void dragandDrop() throws InterruptedException
	{
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		//browser.manage().window().minimize();
		browser.get("https://leafground.com/drag.xhtml");
		Actions mouseactions = new Actions(browser);
		//Thread.sleep(2000);
		mouseactions.moveToElement(browser.findElement(By.id("form:drag"))).dragAndDrop(browser.findElement(By.id("form:drag")), browser.findElement(By.id("form:drop_content"))).perform();
		
		mouseactions.moveToElement(browser.findElement(By.id("form:conpnl"))).dragAndDropBy(browser.findElement(By.id("form:conpnl")), 250, 0).perform();
		mouseactions.moveToElement(browser.findElement(By.id("form:conpnl"))).dragAndDropBy(browser.findElement(By.id("form:conpnl")), -50, 0).perform();
		
	}
	
	

}
