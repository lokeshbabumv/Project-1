package org.sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement Enter = driver.findElement(By.name("q"));
		Enter.sendKeys("GreensTechnology");
		WebElement btnSearch = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']"));
		btnSearch.click();
	}

}
