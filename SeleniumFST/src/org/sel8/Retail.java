package org.sel8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Retail {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		driver.findElement(By.xpath("(//a[@class='login_button'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@title='Login']")).click();
		
		Alert a = driver.switchTo().alert();
		
		String text = a.getText();
		
		System.out.println(text);
		
		a.accept();
		
	}

}
