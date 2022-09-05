package org.sel;

import org.openqa.selenium.edge.EdgeDriver;

public class Egde {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\msedgedriver.exe");
		
		EdgeDriver Driver=new EdgeDriver();
		
		Driver.get("https://www.facebook.com/");
		String currentpageTitle = Driver.getTitle();
		System.out.println(currentpageTitle);
		String currentUrl = Driver.getCurrentUrl();
		System.out.println(currentUrl);
		Driver.close();
		
	
		
	}	

}
