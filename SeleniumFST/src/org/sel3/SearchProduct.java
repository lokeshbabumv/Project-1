package org.sel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProduct {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_b&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=294102729729&hvpos=&hvnetw=g&hvrand=5287312432397295666&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-311187680635&hydadcr=5841_1914865&gclid=EAIaIQobChMI9OHfqI3o-AIVwplmAh1wEQOrEAAYASAAEgLpJ_D_BwE");	
		driver.manage().window().maximize();
	 WebElement Text = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Text.sendKeys("iphone");
		
		
		
		
		
		
		
		
		
		
	}

}
