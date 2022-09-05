package org.sel10;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnology {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("http://www.greenstechnologys.com/python-training.html");
		Thread.sleep(2000);
		WebElement b = driver.findElement(By.xpath("(//h3[@class='panel-title'])[24]"));
		js.executeScript("arguments[0].click()",b);
		WebElement a = driver.findElement(By.xpath("(//h3[@class='panel-title'])[34]"));
		js.executeScript("arguments[0].click()",a);
		WebElement c = driver.findElement(By.xpath("(//button[@class='let-us-now pinkbutton ga-click'])[33]"));
		js.executeScript("arguments[0].click()",c);
    
		js.executeScript("arguments[0].setAttribute('value','QUESTIONS......1.What is the purpose of windows Handling?')", c);
	      Object print = js.executeScript("return arguments[0].getAttribute('value')", c);
	     String s=(String) print;
	     System.out.println(s);
	
	}}