package org.sel10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snap {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(" https://www.snapdeal.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("iphone 7");
		
		Robot r= new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);	
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='product-tuple-description '])[1]")).click();
		String parent = driver.getWindowHandle();
		System.out.println("parent window id :"  +parent);
		Set<String> child1 = driver.getWindowHandles();
		System.out.println("child window id :"   +child1);
		
		for (String itr : child1) {
			if (itr != parent) {
				driver.switchTo().window(itr);
			}
		}
	
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='intialtext'])[2]")).click();
		Thread.sleep(5000);
		WebElement price = driver.findElement(By.xpath("(//span[@class='price'])[1]"));
		String text = price.getText();
		System.out.println("price :" +text);
		
		
		
	}

}
