package org.sel5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prime {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		
		driver.manage().window().maximize();
		
		WebElement prime= driver.findElement(By.xpath("(//a[@class='nav-a  '])[8]"));
		
		Actions a=new Actions(driver);
		
		a.moveToElement(prime).perform();
		
		Thread.sleep(4000);
		
		WebElement Select = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		
      Select.click();
		
		
		
	}
		
	

}
