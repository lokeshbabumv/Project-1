package org.sel10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.homedepot.com/");

		driver.findElement(By.xpath("//input[@class='SearchBox__input']")).sendKeys("celling fan");
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='https://images.thdstatic.com/productImages/3026095f-ca13-4dd7-86e4-61b7e570b201/svn/brushed-nickel-home-decorators-collection-ceiling-fans-with-lights-54725-64_300.jpg']")).click();
      Thread.sleep(8000);
		driver.findElement(By.xpath("(//button[@type='button'])[17]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class='bttn__content'])[3]")).click();
        
	
	}

}
