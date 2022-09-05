package org.sel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resume {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");

	WebElement Model = driver.findElement(By.xpath("(//h2[@class='mb-0'])[2]"));
	Model.click();
	Thread.sleep(1000);
	WebElement First = driver.findElement(By.xpath("//a[@title='Model Resume training in chennai']"));
	First.click();
	
	
	
	
	
	
	
	
	
	
}
}
