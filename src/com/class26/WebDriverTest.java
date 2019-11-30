package com.class26;

public class WebDriverTest {

	public static void main(String[] args) {
		
		ChromeDriver chrome=new ChromeDriver();
		chrome.refresh();
		chrome.open();
		
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.refresh();
		firefox.open();
		//creating obj of child class and given reference to the parent
		WebDriver driver=new FirefoxDriver();
		driver.open();
		driver.refresh();
		//driver.getTitle(); not avail bc its being declared in child class and NOT PARENT
		//no access to child specific class thru parent type
	}

}
