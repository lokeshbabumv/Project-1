package org.sel7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphone {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
	
	ChromeDriver driver =new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	WebElement enter = driver.findElement(By.xpath("//input[@class='_3704LK']"));
	
	enter.sendKeys("iphone");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	Thread.sleep(5000);
	
	TakesScreenshot ts= (TakesScreenshot)driver;
	
	File scr = ts.getScreenshotAs(OutputType.FILE);
	
	File dst= new File("C:\\eclipse\\.metadata\\SeleniumFST\\img\\iphone.png");
	
	FileUtils.copyFile(scr, dst);
	
	
	
	
	}

}
