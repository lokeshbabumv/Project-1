package org.sel5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sport {

	public static void main(String[] args) throws InterruptedException {
		
  System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");		
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://bazaar.shopclues.com/wholesale.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
WebElement sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions a= new Actions(driver);
		a.moveToElement(sports).perform();
		
	Thread.sleep(4000);
		
    	WebElement gainer = driver.findElement(By.xpath("//a[@href='//bazaar.shopclues.com/weight-gainers.html?sort_by=bestsellers&sort_order=desc']"));
	 gainer.click();
   
		
			
		
	}

}
