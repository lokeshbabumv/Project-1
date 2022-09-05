package org.sel8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfinityICIC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		
		driver.get(" https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		
		driver.findElement(By.xpath("(//span[@class='input-arrow'])[1]")).click();
		
		Thread.sleep(3000);
		
		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		
		user.sendKeys("124562");
		
		Thread.sleep(3000);
		
		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
		
		pass.sendKeys("25121");
		
		driver.findElement(By.xpath("(//input[@type='Submit'])[1]")).click();
	}

}
