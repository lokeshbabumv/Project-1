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

public class CoreJava {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();	
			
			driver.get(" http://greenstech.in/selenium-course-content.html");
			  
			JavascriptExecutor js= (JavascriptExecutor)driver;
			
            WebElement a = driver.findElement(By.xpath("//div[@id='heading302']"));
			
			a.click();
	
			WebElement scroll = driver.findElement(By.xpath("//div[@id='heading302']"));
			
			js.executeScript("arguments[0].scrollIntoView(true)", scroll);
			TakesScreenshot ts= (TakesScreenshot)driver;
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File dst= new File("C:\\eclipse\\.metadata\\SeleniumFST\\img\\CoreJava.png");
			
			FileUtils.copyFile(src, dst);
			

	}

}
