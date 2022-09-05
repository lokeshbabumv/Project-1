package org.sample;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class sample2 extends BaseClass{

	public static void main(String[] args) {
		launchbrowser();
		launchUrl("https://www.facebook.com/login/");
		getTheCurrentPageUrl();
		getCurrentPageTitle();
	    WebElement emailTxt = driver.findElement(By.id("email"));
			passText(emailTxt, "lok");
	   WebElement password = driver.findElement(By.id("pass")); 
	        passText(password, "121514");
	   WebElement loginbtn = driver.findElement(By.id("loginbutton"));
	       btn(loginbtn);

	}

}
