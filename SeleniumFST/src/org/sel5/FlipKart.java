package org.sel5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");	
		 
			WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			
			close.click();
			   Thread.sleep(4000);
			
			 driver.manage().window().maximize();

			   Thread.sleep(6000);
			
	  
	   WebElement home = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[6]"));
	
		Actions a= new Actions(driver);
		a.moveToElement(home).perform();
		
	    
		
	   WebElement select = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		
		Actions b= new Actions(driver);
		b.moveToElement(select).perform();
		
		   
		  WebElement Home = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[4]"));
		  Home.click();
         
	
	
	
	}

}
