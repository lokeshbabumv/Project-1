package org.sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&CTA_FLAG=IPRU");
		WebElement UserLogin = driver.findElement(By.id("text"));
		UserLogin.sendKeys("lokesh");
		WebElement Pass = driver.findElement(By.id("password"));
		Pass.sendKeys("1234556");
		WebElement btnLogin = driver.findElement(By.id("Submit"));
		btnLogin.click();
		
		
		
		
		
	}

}
