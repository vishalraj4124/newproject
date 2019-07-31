package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\eclipse-vishal\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://twitter.com/login");
	//username
	WebElement txtform = driver.findElement(By.id("session[username_or_email]"));
	txtform.sendKeys("Vishal");
	//password
	WebElement txtto = driver.findElement(By.id("session[password]"));
	txtto.sendKeys("123456");

}

}
