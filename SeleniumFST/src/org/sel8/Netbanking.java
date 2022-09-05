package org.sel8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netbanking {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");

	ChromeDriver driver=new ChromeDriver();
	
	driver.get(" https://netbanking.canarabank.in/entry/ENULogin.jsp");
	
	driver.findElement(By.xpath("//input[@style='margin-right:15px;width: 83px;']")).click();
	
	Alert a = driver.switchTo().alert();
	
	String text = a.getText();
	
	System.out.println(text);
	
	a.accept();
	
	
	
	
}	
	
}
