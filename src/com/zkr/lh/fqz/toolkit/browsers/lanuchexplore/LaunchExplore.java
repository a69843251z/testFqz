package com.zkr.lh.fqz.toolkit.browsers.lanuchexplore;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchExplore {
	public static WebDriver driver = null;
	private static FirefoxProfile firefoxprofile = null;
	private static DesiredCapabilities caps = null;
	private String projectpath = System.getProperty("user.dir");

	public LaunchExplore(BrowsersType brosers) {
		// TODO Auto-generated constructor stub
		switch (brosers) {
		
		case ie:
			System.setProperty("webdriver.ie.driver", "E:\\myWorkSpace\\testFqz\\resources\\IEDriverServer.exe");
			caps = DesiredCapabilities.internetExplorer();
			/* �O�ð�ȫIE�cwebdriverһ�� */
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			/* privateģʽ���h��cookie �c catch */
			caps.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
			caps.setCapability("ignoreZoomSetting", true);
			driver = new InternetExplorerDriver(caps);
			break;
		
		case firefox:
			System.setProperty("webdriver.firefox.bin", "F:\\firefox55.0\\firefox.exe");
			System.setProperty("webdriver.gecko.driver", "E:\\eclipse-Project\\testFqz\\resources\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			break;

		case chrome:
			System.setProperty("webdriver.chrome.driver", projectpath + "\\resources\\chromedriver.exe");
			caps = DesiredCapabilities.chrome();
			caps.setCapability("chrome.switches", Arrays.asList("--start-maximized"));
			driver = new ChromeDriver(caps);
			break;

		default:
			break;
		}
	}

}
