package org.sample;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample3 extends BaseClass {

	public static void main(String[] args) {
		
		launchbrowser();
	   launchUrl("https://www.amazon.in/");
	
	 WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
         search(search, "iphone");
	 WebElement searchbtn = driver.findElement(By.id("nav-search-submit-button"));
	    btn(searchbtn);
	
	
	}

}
