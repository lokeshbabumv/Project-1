package org.sel7;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMotorol {

	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();	
			
			driver.get("https://www.amazon.in/");
			  
			WebElement a = driver.findElement(By.xpath("//input[@type='text']"));
			
			a.sendKeys("motorolo");
		
			driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			File scr = ts.getScreenshotAs(OutputType.FILE);

	       File dst=new File("C:\\eclipse\\.metadata\\SeleniumFST\\img\\AmazonMotorolo.png");
	
	       FileUtils.copyFile(scr, dst);
	
	
	}

}
