package com.zkr.lh.toolkit.browsers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.zkr.lh.toolkit.browsers.lanuchexplore.BrowsersType;
import com.zkr.lh.toolkit.browsers.lanuchexplore.LaunchExplore;

@Test
public class test {
	LaunchExplore la;
	WebDriver driver;
	@Test
	public void test() {
		la = new LaunchExplore(BrowsersType.firefox);
		driver=la.driver;
		driver.get("http://www.baidu.com");
	}

}
