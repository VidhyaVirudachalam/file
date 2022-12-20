package com.selenium.mytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	
	public static void send_values(WebElement element, String value) {

		element.sendKeys(value);
	}
	public static void click(WebElement element) {

		element.click();
	}
	
	
	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\V.VIDHYA\\eclipse-workspace\\Selenium Java Project\\Driver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		WebElement mail = driver.findElement(By.xpath("//input[@type='text']"));
		send_values(mail,"kylie@gmail.com");
			
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		send_values(password,"123");
			
		WebElement login =  driver.findElement(By.xpath("//button[@name='login']"));
		click(login);
	}
}