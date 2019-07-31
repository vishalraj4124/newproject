package org.xpath;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Greens {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\eclipse-vishal\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	WebElement btncourse = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
	btncourse.click();
	WebElement name = driver.findElement(By.id("InputName"));
	name.sendKeys("vishalraj");
	WebElement email = driver.findElement(By.id("InputEmail1"));
	email.sendKeys("vishalraj");
	WebElement mobno = driver.findElement(By.id("InputSubject"));
	mobno.sendKeys("9865182316");
	WebElement cou = driver.findElement(By.xpath("(//select[@name='courses'])[1]"));
	cou.click();
	WebElement value = driver.findElement(By.xpath("(//option[@value='Python'])[1]"));
	value.click();
	WebElement selectbranch = driver.findElement(By.xpath("(//select[@name='branch'])[1]"));
	selectbranch.click();
}
}
