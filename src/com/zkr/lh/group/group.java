package com.zkr.lh.group;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zkr.lh.toolkit.browsers.lanuchexplore.BrowsersType;
import com.zkr.lh.toolkit.browsers.lanuchexplore.LaunchExplore;

public class group {
	WebDriver driver;
	LaunchExplore browser;

	@BeforeMethod(groups = "browsers")
	public void inital() {
		browser = new LaunchExplore(BrowsersType.firefox);
		this.driver = browser.driver;
	}

	@Test(groups = "submodul1")
	public void submodul1() {
		driver.get("https://www.baidu.com/");
		System.out.println("this is submodul1");
	}

	@Test(groups = "submodul2")
	public void submodul2() {
		driver.get("http://www.iqiyi.com/");
		System.out.println("this is submodul2");
	}

	@Test(groups = "submodul3")
	public void submodul3() {
		driver.get("https://v.qq.com/");
		System.out.println("this is submodul3");
	}

	@Test(groups = "submodul4")
	public void submodul4() {
		driver.get("http://www.dilidili.wang/");
		System.out.println("this is submodul4");
	}

	@AfterMethod(groups = "browsers")
	public void replease() {
		driver.quit();
	}

}
