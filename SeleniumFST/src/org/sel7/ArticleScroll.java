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

public class ArticleScroll {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
	ChromeDriver driver= new ChromeDriver();	
		
		driver.get(" http://www.greenstechnologys.com/");
		
			JavascriptExecutor js= (JavascriptExecutor)driver;
		
		WebElement scroll = driver.findElement(By.xpath("(//div[@class='trainer-info'])[6]"));
		
		 js.executeScript("arguments[0].scrollIntoView(false)", scroll);
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\eclipse\\.metadata\\SeleniumFST\\img\\address.png");
		
		FileUtils.copyFile(src, dest);
		

	}

}
