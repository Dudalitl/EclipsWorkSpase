package com.syntax.class25;

public interface WebDriver {
	
	void openBrowse();
	
	void closeBrowser();
	
	void maximizeWindows();
	
	void findElements();



class ChromeDriver implements WebDriver {

	@Override
	public void openBrowse() {
		System.out.println("Chrome browser is open");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome browser is close");
		
	}

	@Override
	public void maximizeWindows() {
		System.out.println("Chrome browser maximize windows");
		
	}

	@Override
	public void findElements() {
		System.out.println("Chrome browser find elements");
		
	}
	
}

class FirefoxDriver implements WebDriver {

	@Override
	public void openBrowse() {
		System.out.println("Firefox browser is open");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Firefox browser is close");
		
	}

	@Override
	public void maximizeWindows() {
		System.out.println("Firefox browser maximize windows");
		
	}

	@Override
	public void findElements() {
		System.out.println("Firefox browser find elements");
		
	}
	
}

public static void main (String[] args) {
	
	WebDriver chrome=new ChromeDriver();
	chrome.closeBrowser();
	chrome.findElements();
	chrome.maximizeWindows();
	chrome.openBrowse();
	
	WebDriver firefox= new FirefoxDriver();
	firefox.closeBrowser();
	firefox.openBrowse();
	firefox.maximizeWindows();
	firefox.findElements();
	
}
}