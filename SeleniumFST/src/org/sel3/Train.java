package org.sel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Train {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.cleartrip.com/trains");
	WebElement From = driver.findElement(By.xpath("//input[@title='From station']"));
	From.sendKeys("kavaraipettai");
	WebElement To = driver.findElement(By.xpath("//input[@title='To station']"));
	To.sendKeys("Chennai central");
	WebElement Search = driver.findElement(By.xpath("//button[@type='submit']"));
	Search.click();
	
	
	
	
	
	
	
	}
	
}
