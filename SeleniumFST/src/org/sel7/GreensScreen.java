package org.sel7;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensScreen {

	public static void main(String[] args) throws IOException {

		System .setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
	ChromeDriver driver =new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	
	TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
	File dest =new File("C:\\eclipse\\.metadata\\SeleniumFST\\img");
	
	FileUtils.copyFileToDirectory(src, dest);
		
	

	}

}
