package org.sel6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Inspect {

	public static void main(String[] args) throws AWTException {
System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");		
	   WebElement element = driver.findElement(By.xpath("(//h2[@class='mb-0'])[7]"));
	   
	   Actions a= new Actions(driver);
	   a.contextClick(element).perform();
	   
      Robot r=new Robot();
      
      for (int i = 0; i < 10; i++) {
		
    	  r.keyPress(KeyEvent.VK_DOWN);
    	  r.keyRelease(KeyEvent.VK_DOWN); 
  	  
    	  
	}
	  
      r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);
      
      
      
      
	   
	}

}
