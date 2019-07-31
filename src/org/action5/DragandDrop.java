package org.action5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vishal\\\\eclipse-vishal\\\\Selenium\\\\Driver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	WebElement s = driver.findElement(By.id("fourth"));
	WebElement d = driver.findElement(By.id("amt7"));
	WebElement e = driver.findElement(By.id("fourth"));
	WebElement c = driver.findElement(By.id("amt8"));
	Actions acc =new Actions(driver);
	acc.dragAndDrop(s,d).perform();
	Actions ax =new Actions(driver);
	ax.dragAndDrop(e,c).perform();
	
	
}
}
