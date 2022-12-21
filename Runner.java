package com.selenium.mytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner extends Base {

	public static void main(String[] args) {
		

		 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\V.VIDHYA\\eclipse-workspace\\Selenium Java Project\\Driver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		
		WebElement mail = driver.findElement(By.xpath("//input[@type='text']"));
		send_values(mail,"vidhu@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		send_values(password,"12345");
		
		WebElement login =  driver.findElement(By.xpath("//button[@name='login']"));
		click(login);
	}
}