package org.sel3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\.metadata\\SeleniumFST\\DRIVER\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement Firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	Firstname.sendKeys("lokesh");
	WebElement Last = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	Last.sendKeys("babu");
	WebElement Address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	Address.sendKeys("kavaraipettai");
	WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
	Email.sendKeys("lokeshbabu@gmailcom");
	WebElement Phone = driver.findElement(By.xpath("//input[@type='tel']"));
	Phone.sendKeys("9092342208");
	WebElement Gender = driver.findElement(By.xpath("//input[@name='radiooptions']"));
	Gender.click();
	WebElement Hobbies = driver.findElement(By.xpath("//input[@value='Movies']"));
	Hobbies.click();
	Thread.sleep(2000);
	WebElement Language = driver.findElement(By.xpath("//div[@id='msdd']"));
	Language.click();
	Thread.sleep(2000);
	WebElement English = driver.findElement(By.xpath("(//a[@class='ui-corner-all'])[8]"));
	English.click();
	WebElement Page = driver.findElement(By.xpath("//section[@id='section']"));
	Page.click();
	Thread.sleep(3000);
	WebElement Skills = driver.findElement(By.xpath("//select[@id='Skills']"));
	Skills.click();
	Thread.sleep(3000);
	WebElement Java = driver.findElement(By.xpath("//option[@value='Java']"));
	Java.click();
	WebElement Page4 = driver.findElement(By.xpath("//section[@id='section']"));
	Page4.click();
	Thread.sleep(1000);
	WebElement SelectCountry = driver.findElement(By.xpath("//select[@type='text']"));
    SelectCountry.click();
    Thread.sleep(3000);
	WebElement Country = driver.findElement(By.xpath("//option[@value='India']"));
    Country.click();
    WebElement Page2= driver.findElement(By.xpath("//section[@id='section']"));
	Page2.click();
	Thread.sleep(3000);
	WebElement Password = driver.findElement(By.xpath("//input[@id='firstpassword']"));
	Password.sendKeys("123456");
	WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
	ConfirmPassword.sendKeys("123456"); 
	WebElement Page5= driver.findElement(By.xpath("//section[@id='section']"));
	Page5.click();
	WebElement btnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
	btnSubmit.click();
	
	}

}
