package org.sel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	WebElement From = driver.findElement(By.xpath("//input[@id='src']"));
	From.sendKeys("kavaraipettai");
	WebElement Destination = driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']"));
	Destination.sendKeys("delhi");



}
}
