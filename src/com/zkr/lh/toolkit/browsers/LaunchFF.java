package com.zkr.lh.toolkit.browsers;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LaunchFF {
	private static WebDriver ffwb = null;
	private static FirefoxProfile firefoxprofile = null;
	private String projectpath = System.getProperty("user.dir");

	@BeforeClass
	public void startFirefox() {
		File firebug = new File("D:\\EclipseProject\\Selenium\\tool\\firebug@software.joehewitt.com.xpi");
		File firepath = new File(projectpath + "/tool/FireXPath@pierre.tholence.com.xpi");
		firefoxprofile = new FirefoxProfile();
		try {
			firefoxprofile.addExtension(firebug);
			firefoxprofile.addExtension(firepath);
			firefoxprofile.setPreference("webdriver.accept.untrusted.certs", "true");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ffwb = new FirefoxDriver(firefoxprofile);
	}

	@Test
	public void searchOnBaidu() {
		ffwb.get("http://www.baidu.com");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public void releaseIEDriver() {
		ffwb.close();
		ffwb.quit();
	}

}
