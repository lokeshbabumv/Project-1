package org.sel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement Id = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Id.sendKeys("94154656");
		WebElement Pass  = driver.findElement(By.xpath("//input[@type='password']"));
		Pass.sendKeys("42626140");
		WebElement Login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		Login.click();
		
		
		
		
		
		
		
		
	}

}
