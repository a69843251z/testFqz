package com.lh.practice.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium2 {
	WebDriver driver;
	public void initdriver() {
		System.setProperty("webdriver.firefox.bin", "F:\\firefox55.0\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "E:\\eclipse-Project\\testFqz\\resources\\geckodriver.exe");
	    driver= new FirefoxDriver();
		driver.get("https://www.imooc.com/user/newlogin/from_rul/");
		driver.findElement(By.name("email")).sendKeys("15727301703");
		driver.findElement(By.name("email")).clear();
		String value=driver.findElement(By.name("email")).getAttribute("placeholder");
	    System.out.println(value);
	}
	public void test2()  {
		System.setProperty("webdriver.firefox.bin", "F:\\firefox55.0\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "E:\\eclipse-Project\\testFqz\\resources\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.imooc.com/user/newlogin/from_rul/");
		driver.findElement(By.name("email")).sendKeys("15727301703");
		driver.findElement(By.name("password")).sendKeys("hz51512242whd");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@value='登录']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://www.imooc.com/user/setprofile");
		driver.findElement(By.linkText("编辑")).click();
		driver.findElement(By.xpath("//label/input[@sex='女']")).click();
	
	}
	
	public static void main(String[] args)  {
		selenium2 t=new selenium2();
		t.test2();
		
		
		
	
	}

}
