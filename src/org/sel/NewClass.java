package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\eclipse-vishal\\Selenium\\Driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    //EmailID
	    WebElement txtmail = driver.findElement(By.id("email"));
	    txtmail.sendKeys("vishalraj@gmail.com");
	    //password
	    WebElement txtpass = driver.findElement(By.id("pass"));
	    txtpass.sendKeys("vishalraj");
	}
	

}
