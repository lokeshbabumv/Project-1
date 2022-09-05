package org.sel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
		Username.sendKeys("lokeshbabu121534");
		WebElement Pass = driver.findElement(By.xpath("//input[@id='pass']"));
		Pass.sendKeys("121548458");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
		btnLogin.click();
		

	}

}
