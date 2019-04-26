package com.class25;
/*
 * Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement(). 
 * Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
public interface WebDriver {


public void openBrowser();
public void closeBrowser();
public void maximizeWindow();
public void findElement();

}
 class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
System.out.println("The ChromeDriver can open the Browser");	
	}

	@Override
	public void closeBrowser() {
System.out.println("The ChromeDriver can close the  Browser");		
	}

	@Override
	public void maximizeWindow() {
System.out.println("The ChromeDriver can maximaze the Browser");		
	}

	@Override
	public void findElement() {
System.out.println("The ChromeDriver can find an element in Browser");		
	}
	
}
 class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("The FirefoxDriver can open the Browser");		
	}

	@Override
	public void closeBrowser() {
		System.out.println("The FirefoxDriver can close the  Browser");		
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("The FirefoxDriver can maximaze the Browser");		
		
	}

	@Override
	public void findElement() {
		System.out.println("The FirefoxDriver can find an element in Browser");		
		
	}
	 
 }