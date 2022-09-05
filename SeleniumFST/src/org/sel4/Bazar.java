package org.sel4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bazar {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://bazaar.shopclues.com/wholesale.html");
		
		WebElement Search = driver.findElement(By.xpath("//input[@placeholder='What is on your mind today?']"));
		Search. click();
		
		Search.sendKeys("mobile");
		
		WebElement a = driver.findElement(By.xpath("//a[@onclick='searchTrigger()']"));
		a.click();
		
		Thread.sleep(2000);
		
		WebElement Model = driver.findElement(By.xpath("//div[@class='column col3 search_blocks']"));
		Model.click();
		
		
		
		
		
		
		
		
		
	}

}
