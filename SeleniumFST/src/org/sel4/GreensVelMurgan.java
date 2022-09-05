package org.sel4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensVelMurgan {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
		
		WebElement Search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		Search.sendKeys(" greens velmurugan");
		Thread.sleep(1000);
		WebElement X = driver.findElement(By.xpath("//div[@jsmodel='sj77Re vWNDde P9Kqfe']"));
		X.click();
		
		WebElement btnsearch = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
	
		btnsearch.click();
		
		
		
		
		
		
		
		
	}

}
