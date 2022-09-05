package org.sel4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Para {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("http://greenstech.in/selenium-course-content.html");
			
			WebElement Trainer = driver.findElement(By.xpath("//a[@href='#trainer']"));
			Trainer.click();
			Thread.sleep(2000);
			WebElement text = driver.findElement(By.xpath("//div[@class='tab-content course-content']"));
			String text2 = text.getText();
			System.out.println(text2);
			

	}

}
