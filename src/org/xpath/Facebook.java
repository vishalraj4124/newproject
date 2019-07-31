package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\eclipse-vishal\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement txtarea = driver.findElement(By.xpath("//input[@type='email']"));
	txtarea.sendKeys("vishalraj@gmail.com");
	WebElement txtpassword = driver.findElement(By.xpath("(//input[@class='inputtext'])[2]"));
	txtpassword.sendKeys("vishalraj");
	WebElement txtclk = driver.findElement(By.xpath("//label[@class='uiButton uiButtonConfirm']"));
	txtclk.click();
}
}
