package com.zkr.lh.fqz.toolkit.browsers;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LanuchChrome {
	private static WebDriver chromewb = null;
	private static DesiredCapabilities caps = null;
	private String projectpath = System.getProperty("user.dir");

	@BeforeClass
	public void startIE() {
		System.setProperty("webdriver.chrome.driver", projectpath+"\\tool\\chromedriver.exe");
		caps = DesiredCapabilities.chrome();
		caps.setCapability("chrome.switches", Arrays.asList("--start-maximized"));
		chromewb = new ChromeDriver(caps);
	}

	@Test
	public void searchOnBaidu() {
		chromewb.get("http://www.baidu.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public void releaseIEDriver() {
		chromewb.close();
		chromewb.quit();
	}

}
