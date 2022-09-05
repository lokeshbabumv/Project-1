package org.sel5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement women = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		Actions a=new Actions(driver);
		a.moveToElement(women).perform();
				
		Thread.sleep(5000);
		
		
		WebElement heels = driver.findElement(By.xpath("//span[text()='Heels']"));
				heels.click();
				
			
		

	}

}
