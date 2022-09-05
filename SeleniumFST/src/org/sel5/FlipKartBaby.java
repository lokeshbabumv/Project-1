package org.sel5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartBaby {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		 
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		close.click();
		   
		Thread.sleep(1000);
		
		
		WebElement Toy= driver.findElement(By.xpath("//a[text()='Toys & School Supplies']"));
		Actions a=new Actions(driver);
		a.moveToElement(Toy).perform();
		
		
		Thread.sleep(5000);
		
		WebElement Remote = driver.findElement(By.xpath("//a[text()='Remote Control Toys']"));
		Remote.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
