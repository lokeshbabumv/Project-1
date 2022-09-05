package org.sel4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailPassword {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement UserEmail = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		UserEmail.sendKeys("lokesh123456");
		
		 String email = UserEmail.getAttribute("value");
	System.out.println(email);
		
	WebElement UserPass = driver.findElement(By.xpath("//input[@type='password']"));
	UserPass.sendKeys("561541651");
	
	 String pass = UserPass.getAttribute("value");
System.out.println(pass);
		
		
		
		
		
		
		
	}

}
