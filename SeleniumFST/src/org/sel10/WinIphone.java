package org.sel10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WinIphone {
	public static void main(String[] args) throws AWTException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		WebElement abc = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		Actions a= new Actions(driver);
		a.contextClick(abc).perform();
		Robot r= new Robot();
		for (int i = 0; i < 2; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread .sleep(2000);
		String prnt = driver.getWindowHandle();
		System.out.println("parent window id :" +prnt);
		
		Set<String> allwind = driver.getWindowHandles();
		System.out.println("all window id :" +allwind);
		
		for (String itr : allwind) {
			
			if(prnt != itr);
			{
				driver.switchTo().window(itr);
			}
	
		}
	
	}

}
