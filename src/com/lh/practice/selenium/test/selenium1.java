package com.lh.practice.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.bin", "F:\\firefox55.0\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "E:\\eclipse-Project\\testFqz\\resources\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.imooc.com/user/newlogin/from_rul/");
		driver.findElement(By.className("xa-showSignup")).click();
		driver.findElement(By.className("xa-showSignin")).click();
		driver.findElement(By.name("email")).sendKeys("15727301703");
		driver.findElement(By.name("password")).sendKeys("hz51512242whd");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='登录']")).click();
		driver.get("https://coding.imooc.com/");
		WebElement element=driver.findElement(By.className("nav-item"));
		List<WebElement> elements=element.findElements(By.tagName("li"));
		elements.get(2).click();;
		
		}

}
