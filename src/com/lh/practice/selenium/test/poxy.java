package com.lh.practice.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class poxy {
	@Test
	public void firefox() throws InterruptedException {
		System.setProperty("webdriver.firefox.bin", "F:\\firefox55.0\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "E:\\eclipse-Project\\testFqz\\resources\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://106.39.94.231:9080/sinoiaaf/");
		driver.findElement(By.className("lg_input")).sendKeys("adminkf1");
		driver.findElement(By.id("passWord")).sendKeys("fqzkf2");
		Thread.sleep(5000);
		driver.findElement(By.id("login")).click();
	}

}
