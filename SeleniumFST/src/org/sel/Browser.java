package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browser {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
WebDriver  driver= new ChromeDriver();
driver.get("https://accounts.google.com/servicelogin/webreauth?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
String CurrentPageTitle = driver.getTitle();
System.out.println(CurrentPageTitle);
String url = driver.getCurrentUrl();
System.out.println(url);
driver.close();
}
	
	
	
	
	
	
	
}
