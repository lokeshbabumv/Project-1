package org.sel5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartFlat {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		 
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		close.click();
		   
		Thread.sleep(1000);
		
		WebElement Select = driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[4]"));   
		Actions b=new Actions(driver);
		b.moveToElement(Select).perform();
		
		
		WebElement Women = driver.findElement(By.xpath("//a[text()='Women Footwear']"));
		Actions a=new Actions(driver);
		a.moveToElement(Women).perform();
		
		
		Thread.sleep(5000);
		
		WebElement Flat = driver.findElement(By.xpath("//a[text()='Women Flats']"));
		Flat.click();
		
		

	}

}
