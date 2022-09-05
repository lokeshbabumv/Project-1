package org.sel5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Data {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement course = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		Actions a= new Actions(driver);
		a.moveToElement(course).perform();
		
		WebElement click = driver.findElement(By.xpath("//div[@title='Data Warehousing courses']"));
	
		Actions b=new Actions(driver);
		b.moveToElement(click).perform();
		
		
		
	}
	
	

}
