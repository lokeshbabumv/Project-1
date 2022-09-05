package org.sel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interview {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement Question = driver.findElement(By.xpath("//div[@id='interview-question-accordion']"));
		Question.click();
		Thread.sleep(1000);
WebElement Important = driver.findElement(By.xpath("//a[contains(text(),'CTS Interview Question ')]"));
		Important.click();
		
		
	}

}
