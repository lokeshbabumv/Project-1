package org.sel6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreenNewwindow {

	public static void main(String[] args) throws AWTException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");		
	   driver.findElement(By.xpath("//h2[@class='title mb-0 center']")).click();
	   
	   WebElement element = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
	   
	   Actions a= new Actions(driver);
		
		a.contextClick(element).perform();
		
		Robot r= new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
