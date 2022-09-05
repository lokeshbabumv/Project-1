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

public class TopSelenium {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();	
			
			driver.get(" http://greenstech.in/selenium-course-content.html");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			WebElement scroll = driver.findElement(By.xpath("(//h3[@title='Top Selenium Trends In 2020'])[1]"));

			js.executeScript("arguments[0].scrollIntoView(false)", scroll);
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
		    File des =new File("C:\\eclipse\\.metadata\\SeleniumFST\\img\\Topselenium.png");
			
		    FileUtils.copyFile(src, des);
		    
	}

}
