package org.sel4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
	driver.get("http://adactinhotelapp.com/");
	
	WebElement Name = driver.findElement(By.xpath("//input[@name='username']"));
		Name.sendKeys("loki");
		String name = Name.getAttribute("value");
		System.out.println(name);
	
		WebElement Pass = driver.findElement(By.xpath("//input[@id='password']"));
		Pass.sendKeys("123456");
		String pass = Pass.getAttribute("value");
		System.out.println(pass);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
