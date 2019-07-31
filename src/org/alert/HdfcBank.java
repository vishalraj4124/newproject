package org.alert;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\eclipse-vishal\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement loc = driver.findElement(By.xpath("(//button[@class='btn btn-danger'])"));
		loc.click();
		Thread.sleep(1000);
		Alert a= driver.switchTo().alert();
		a.accept();
		
	}

}
