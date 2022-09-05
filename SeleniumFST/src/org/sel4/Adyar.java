package org.sel4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adyar {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	WebElement Text = driver.findElement(By.xpath("//div[@class='trainer-info']"));
	String text1 = Text.getText();
	System.out.println(text1);

	
}
}
