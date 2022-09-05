package org.sel8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
			ChromeDriver driver= new ChromeDriver();
			
			driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement click = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		click.click();
		
		WebElement click2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		
		click2.click();
		
		Alert a = driver.switchTo().alert();
		
		String text = a.getText();
		System.out.println(text);
		
		a.accept();
		
		
		
		
		
		
		
		
	}

}
