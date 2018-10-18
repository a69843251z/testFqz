package com.zkr.lh.fqz.testScript;


import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.zkr.lh.fqz.fqzPageFactory.loginPageFactory;
import com.zkr.lh.fqz.toolkit.browsers.lanuchexplore.BrowsersType;
import com.zkr.lh.fqz.toolkit.browsers.lanuchexplore.LaunchExplore;
import com.zkr.lh.fqz.toolkit.readProperties.GetProperties;




public class testFqz {
	
	private static Logger logger = Logger.getLogger(testFqz.class.getName());
	WebDriver driver;
	LaunchExplore se;
	GetProperties readProperties;
	loginPageFactory loginpage;
	String projectUrl=System.getProperty("user.dir");
	
	@BeforeTest
	public void reday() {
		readProperties = new GetProperties(projectUrl+"\\resources\\fqzBasic.properties");
		PropertyConfigurator.configure(projectUrl+"\\resources\\log4j.properties");
		se=new LaunchExplore(BrowsersType.chrome);
		driver=se.driver;
		loginpage=new loginPageFactory(driver);
	}
	
	@Test
	public void loginTest() {
		loginpage.loginurl(readProperties.getValue("url"));
		assertTrue(driver.getCurrentUrl().equals("http://106.39.94.231:9080/sinoiaaf/"));
		logger.info("登录网址为"+readProperties.getValue("url"));
		loginpage.userslogin(readProperties.getValue("username"), readProperties.getValue("password"));
	}

}
