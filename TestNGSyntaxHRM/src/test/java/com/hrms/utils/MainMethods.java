package com.hrms.utils;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testbase.Constans;

public class MainMethods extends PageInitializer {
	
	/**
	 * Method to clean and send text in web element
	 */
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);		
	}
	
	/**
	 * Method to click on radio button or check box
	 */
	public static void clickRadioOrCheckBox (List<WebElement> radioOrCheck, String value) {
		String actualValue;
		for(WebElement el:radioOrCheck) {
		actualValue=el.getAttribute(value).trim();	
		if(el.isEnabled()&&actualValue.equals(value)) {
			el.click();
			break;
		}
		}	
	}
	
	
	public static void DropBox(WebElement element, String textToSelect) {
		try {
		Select select=new Select(element);
		List<WebElement>option=select.getOptions();
		for(WebElement el: option) {
			if (el.getText().equals(textToSelect)) {
				select.selectByValue(textToSelect);
				break;
			}
		}
		}catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}
	
	public static void DropBox(WebElement element, int index) {
		try {
		Select select=new Select(element);
		int size=select.getOptions().size();
		if(size>index) {
			select.selectByIndex(index);
		}
	}
		catch(UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Method to accept alert
	 */
	public static void acceptAlert() {
		try {
		Alert alert=driver.switchTo().alert();
		alert.accept();
		}catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Method to dismiss alert
	 */
	public static void dismissAlert() {
		try {
			Alert alert= driver.switchTo().alert();
			alert.dismiss();
		}catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Method to get text from alert
	 */
	public static String getAlertText() {
		String alertText=null;
		try {
			Alert alert=driver.switchTo().alert();
			alertText=alert.getText();
		}catch(NoAlertPresentException e) {
			e.printStackTrace();
		}
		return alertText;
	}
	
	/**
	 * Methods that sends text to alert and catches exception if alert is not
	 * present
	 * 
	 */
	public static void alertSendText(String text) {
		try {
			Alert alert=driver.switchTo().alert();
			alert.sendKeys(text);
		}catch(NoAlertPresentException e) {
			e.printStackTrace();
		}
	}
	/**Method to switch frames
	 * 
	 * 
	 */
	
	public static void frameSwitch(String nameOrId) {
		try {
		driver.switchTo().frame(nameOrId);
		}catch(NoSuchFrameException e) {
			e.printStackTrace();
		}
	}
	
	public static void frameSwitch(int index) {
		try {
			driver.switchTo().frame(index);
		}catch(NoSuchFrameException e) {
			e.printStackTrace();
		}
	}
	
	public static void frameSwitch(WebElement element) {
		try {
			driver.switchTo().frame(element);
		}catch(NoSuchFrameException e) {
			e.printStackTrace();
		}
	}
	
	public static WebDriverWait getWaitObject() {
		WebDriverWait wait=new WebDriverWait(driver, Constans.EXPLICIT_WAIT_TIME);
		return wait;
	}
	
	public static WebElement waitToClickabiliti(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}
	public static WebElement waitToVisibiliti(WebElement element) {
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void click(WebElement element) {
		waitToClickabiliti(element);
		element.click();
	}
	
	public static void wait(int second) {
		try {
			Thread.sleep(second*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
