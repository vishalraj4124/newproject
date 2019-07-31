package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lvb {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\eclipse-vishal\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lvbankonline.in/index.html?module=login");
		//username
		WebElement txtform = driver.findElement(By.id("login_username|input"));
		txtform.sendKeys("Vishal");
		//password
		WebElement txtto = driver.findElement(By.id("login_password|input"));
		txtto.sendKeys("123456");
        WebElement txtname = driver.findElement(By.id("hsudagdha"));
        txtname.sendKeys("vishal");
}
}
