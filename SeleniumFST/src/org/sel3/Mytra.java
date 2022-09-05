package org.sel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mytra {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	WebElement Username = driver.findElement(By.xpath("//input[@type='tel']"));
Username.sendKeys("lokesh");
	WebElement Continue = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
	
	Continue.click();
	
	
}	
	
}

