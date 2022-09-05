package org.sel4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omr {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	WebElement Location = driver.findElement(By.xpath("(//div[@class='trainer-info'])[2]"));
    String text = Location.getText();
    System.out.println(text);
		
}
	
	
}
