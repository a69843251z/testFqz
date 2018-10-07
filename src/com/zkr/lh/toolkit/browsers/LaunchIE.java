package com.zkr.lh.toolkit.browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LaunchIE {
	private static WebDriver iewb = null;
	private static DesiredCapabilities caps = null;
	private String projectpath = System.getProperty("user.dir");

	@BeforeClass
	public void startIE() {
		System.setProperty("webdriver.ie.driver", projectpath+"\\tool\\IEDriverServer.exe");
		caps = DesiredCapabilities.internetExplorer();
		/*設置安全IE與webdriver一致*/
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		/*private模式，刪除cookie 與 catch*/
		caps.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
		caps.setCapability("ignoreZoomSetting", true);
		iewb = new InternetExplorerDriver(caps);

	}

	@Test
	public void searchOnBaidu() {
		iewb.get("www.baidu.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public void releaseIEDriver() {
		iewb.close();
		iewb.quit();
	}

}
