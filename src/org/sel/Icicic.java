package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icicic {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\eclipse-vishal\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		//username
		WebElement txtform = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		txtform.sendKeys("Vishal");
		//password
		WebElement txtto = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		txtto.sendKeys("123456");

}
}
