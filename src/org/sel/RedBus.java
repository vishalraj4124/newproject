package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\eclipse-vishal\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		//From
		WebElement txtform = driver.findElement(By.id("src"));
		txtform.sendKeys("Chennai");
		WebElement txtto = driver.findElement(By.id("dest"));
		txtto.sendKeys("madurai");
	}

}
