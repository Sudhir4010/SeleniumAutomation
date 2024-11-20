package genricUtility;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	/**
	 * This method is used to maximize window
	 * 
	 * @param driver
	 */
	public void maximzeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * This method is used to maximize window
	 * 
	 * @param driver
	 * @return
	 */
	public Dimension getSize(WebDriver driver) {
		return driver.manage().window().getSize();

	}

	/**
	 * this method is used to switch driver control to window based on url
	 * 
	 * @param driver
	 * @param url
	 */

	public void switchToWindow(WebDriver driver, String url) {
		// step 1 caputre window ids
		Set<String> allWindowIds = driver.getWindowHandles();

		// step2 navigate through all the windows
		for (String id : allWindowIds) {
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();

			if (actUrl.contains(url)) {
				break;
			}
		}
	}

	/**
	 * this method is perform mouse keyborad by using actions class to perform
	 * contextclick
	 * 
	 * @param driver
	 */
	public void rightClick(WebDriver driver) {
		Actions act = new Actions(driver);
		act.contextClick().perform();

	}

	/**
	 * this method perform mouse keyboard actions class using method click and hold
	 * 
	 * @param driver
	 * @param element
	 */
	public void clickAndHold(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.clickAndHold(element).perform();

	}

	/**
	 * this method perform mouse keyboard actions class using method mouseHover
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();

	}

	/**
	 * this method perform mouse keyboard actions class using method mdragAndDrop
	 * 
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void dragAndDrop(WebDriver driver, int x, int y) {
		Actions act = new Actions(driver);
		act.moveByOffset(x, y).perform();

	}
	/**
	 * this method is used toswitch driver control to frame using web Element
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver,String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	public void switchToFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	public void swictBackToManinPage(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	/**
	 * this method is used to selectdropDown in a webpage by index
	 * @param driver
	 * @param element
	 * @param indexs
	 */
	
	public void selectByIndex(WebElement element,int index) {
		Select dropDown=new Select(element);
		dropDown.selectByIndex(index);
	}
	/**
	 * this method is used to selectdropDown in a webpage by String value
	 * @param driver
	 * @param element
	 * @param value
	 */
	public void selectByValue(WebElement element,String value) {
		Select dropDown=new Select(element);
		dropDown.selectByValue(value);;
	}
	/**
	 * this method is used to selectdropDown in a webpage String text
	 * @param driver
	 * @param element
	 * @param text
	 */
	public void selectByVisibleText(WebElement element,String text) {
		Select dropDown=new Select(element);
		dropDown.selectByVisibleText(text);;
	}
	/**
	 * this method is used to  switch to popUps and  alert notification
	 * @param driver
	 * @return
	 */

	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	/**
	 *  this method is used to  switch to popUps and accept alert click and ok
	 * @param driver
	 */
	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}
	/**
	 *  this method is used to  switch to popUps and accept alert and click on dismiss
	 * @param driver
	 */
	public void switchToAlertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
		
	}
	/**
	 *  this method is used to  switch to popUps and accept alert and send data on textField
	 * @param driver
	 * @param data
	 */
	public void switchToAlertAndSendKeys(WebDriver driver,String data) {
		driver.switchTo().alert().sendKeys(data);
	}
	/**
	 *  this method is used to  switch to popUps and accept alert and sroll the window x and y coordinate
	 * @param driver
	 * @param X
	 * @param Y
	 */
	public void jsScroll(WebDriver driver,int X,int Y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+X+","+Y+")");
	}

	
}
