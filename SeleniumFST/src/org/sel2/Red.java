package org.sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
	Driver.get("https://www.redbus.in/");
    WebElement FromLoc = Driver.findElement(By.id("src"));
	FromLoc.sendKeys("kavaraipettai");
	WebElement Destination = Driver.findElement(By.id("dest"));
	Destination.sendKeys("delhi");

	}

}
