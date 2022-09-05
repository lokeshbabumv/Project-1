package org.sample;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.TakesScreenshot;

public class Sample4 extends BaseClass {

	public static void main(String[] args) throws IOException {
		
     launchbrowser();
     launchUrl("http://greenstech.in/selenium-course-content.html");
	 screenshot("greens");
       
	
	
	}

}
