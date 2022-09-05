package org.sel6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartLink {

	public static void main(String[] args) throws AWTException {
    
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");	
	
		WebElement element = driver.findElement(By.xpath("(//img[@class='kJjFO0 _3DIhEh'])[5]"));
	   
	   Actions a= new Actions(driver);
	   a.contextClick(element).perform();

	   Robot r=new Robot();
	   
	   for (int i = 0; i < 4; i++) {
	
		  r.keyPress(KeyEvent.VK_DOWN); 
		  r.keyRelease(KeyEvent.VK_DOWN);	  	   
	}
	   r.keyPress(KeyEvent.VK_ENTER); 
	   r.keyRelease(KeyEvent.VK_ENTER); 
	   
	}

}
