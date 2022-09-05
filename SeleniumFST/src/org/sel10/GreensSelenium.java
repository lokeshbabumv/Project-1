package org.sel10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensSelenium {

	public static void main(String[] args) throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(" http://www.greenstechnologys.com/");
		Thread.sleep(2000);
        Actions a= new Actions(driver);
        WebElement b = driver.findElement(By.xpath("//a[text()='COURSES']"));
        a.moveToElement(b).perform();
        driver.findElement(By.xpath("(//span[text()='Python'])[1]")).click();
        a.contextClick (driver.findElement(By.xpath("(//button[@class='btn'])[1]"))).perform();
        
        Robot r= new Robot();
        for (int i = 0; i < 2; i++) {
			
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        }
		
	    	r.keyPress(KeyEvent.VK_ENTER);
	    	r.keyRelease(KeyEvent.VK_ENTER);
	    	
	    }}