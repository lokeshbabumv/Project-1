package org.sel8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class HdfcBank {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		
		driver.get(" https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		
        driver.switchTo().frame(driver.findElement(By.name("login_page")));
       
      driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
		
		Alert a = driver.switchTo().alert();
		
		String text = a.getText();
		
		System.out.println(text);
		a.accept();
		
		
	}

}
