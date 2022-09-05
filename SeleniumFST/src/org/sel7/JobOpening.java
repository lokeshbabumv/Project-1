package org.sel7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JobOpening {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();	
			
			driver.get(" http://greenstech.in/selenium-course-content.html");
			
			JavascriptExecutor js= (JavascriptExecutor)driver;
			
			WebElement scrollDown = driver.findElement(By.xpath("//div[@ id='heading2011']"));
			
			js.executeScript("arguments[0].scrollIntoView(false)", scrollDown);
			
			TakesScreenshot ts= (TakesScreenshot)driver;
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File dst =new File("C:\\eclipse\\.metadata\\SeleniumFST\\img\\jobopening.png");
			
			FileUtils.copyFile(src, dst);
			
			WebElement ScrollUp = driver.findElement(By.xpath("(//div[@class='promo-container'])[2]"));
			
			js.executeScript("arguments[0].scrollIntoView(false)", ScrollUp);
	}

}
