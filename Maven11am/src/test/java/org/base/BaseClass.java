package org.base;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	  public static WebDriver driver;
		public static void launchbrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 
			driver.manage().window().maximize();    
		}
		public static void launchUrl(String url) {
			driver.get(url);
		}
		public static void getCurrentPageTitle() {
				
			String title = driver.getTitle();
			System.out.println(title);
		}
		public static void getTheCurrentPageUrl() {
			String url = driver.getCurrentUrl();
			System.out.println(url);
		}
		public  static void  passText(WebElement ele,String text) {
		ele.sendKeys(text);
		}
	   public static void btn(WebElement btn) {
		  btn.click(); 
	   }
       public static void search(WebElement search,String txt   ) {
		search.sendKeys(txt);
	}
	 public static void screenshot(String name) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\eclipse\\.metadata\\Maven11am\\Screenshot image\\"+name+".png");
		FileUtils.copyFile(f, dest);
	 }	
	
	  public static void quit(WebDriver drriver)
	   {
	      drriver.quit();
	      
	   }
	   public static void close(WebDriver drriver)
	   {
	      drriver.close();
	   }
	 public static void action(WebElement source,WebElement target ,String doubleClick)
	 {
		 Actions a = new Actions(driver);
		a.doubleClick(target);
		a.click(target);
		a.clickAndHold(target);
		a.dragAndDrop(source, target);
		a.moveToElement(target);
		
	 }	 
   
}    

