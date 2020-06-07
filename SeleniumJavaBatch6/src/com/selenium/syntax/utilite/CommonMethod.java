package com.selenium.syntax.utilite;



import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;

public class CommonMethod extends BaseClass{
	
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);	
	}
	
	
	public static void clickRadioOrChekBox(List<WebElement> radioOrCheckBox, String value) {
		String actualValue;
		for(WebElement el:radioOrCheckBox) {
			actualValue=el.getAttribute("value");
			if(actualValue.equals(value)) {
				el.click();
				break;
			}
		}	
	}
	
	
	public static void acceptAlert() {
		try {
			Alert alert =driver.switchTo().alert();
			alert.accept();
		}catch(NoAlertPresentException e){
			e.printStackTrace();
		}	
	}
	
	public static void dismisAlert() {
		try {
			Alert alert =driver.switchTo().alert();
			alert.dismiss();
		}catch(NoAlertPresentException e){
			e.printStackTrace();
		}	
	}
	
	public static String getAletrText() {
		String alerText=null;
		try {
		Alert alert=driver.switchTo().alert();
		alerText= alert.getText();
		}catch(NoAlertPresentException e){
			e.printStackTrace();	
		}
		return alerText;
	}
	
	public static void switchToChaildWindow() {
		String mainWindow=driver.getWindowHandle();
		Set<String>windows=driver.getWindowHandles();
		for(String window:windows) {
			if (!window.equals(mainWindow)){
				driver.switchTo().window(window);
				break;
				
			}
		}
	}
	
	public static JavascriptExecutor getJSObject() {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		return js;
	}
	
	public static void jsClick(WebElement element) {
		getJSObject().executeScript("arguments[0].click();", element);
		
	}
	
	public static void scrollToElement(WebElement element) {
		getJSObject().executeScript("arguments[0].scrollIntoView(true);", element);	
		
		
	}
	
	

}
