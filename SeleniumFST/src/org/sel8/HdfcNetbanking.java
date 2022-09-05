package org.sel8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcNetbanking {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		
		driver.get(" https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame(driver.findElement(By.name("login_page")));
		
		WebElement id = driver.findElement(By.xpath("//input[@type='text']"));
		
		id.sendKeys("2564bjhyg");
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
		
	    driver.findElement(By.xpath("//input[@name='fldPassword']")).sendKeys("3548546");
	    
	    driver.findElement(By.xpath("//a[@ondblclick='return fLogon()']")).click();
		

	}

}
