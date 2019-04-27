package com.class26;

public interface WebDriver extends TakesShreenshot, Executes {

	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();

	void takesScreenShot();

}