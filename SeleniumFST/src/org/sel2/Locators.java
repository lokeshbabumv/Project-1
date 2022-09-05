package org.sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");	
	ChromeDriver Driver=new ChromeDriver();	
	Driver.get("https://www.facebook.com/");
	WebElement UserName = Driver.findElement(By.id("email"));
	UserName.sendKeys("lokesh");
	WebElement Password = Driver.findElement(By.id("pass"));
	Password.sendKeys("1234567");
	WebElement ButtonLogin = Driver.findElement(By.name("login"));
	ButtonLogin.click();
		
	}
	

}
