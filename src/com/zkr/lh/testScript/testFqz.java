package com.zkr.lh.testScript;


import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.zkr.lh.fqzPageFactory.loginPageFactory;
import com.zkr.lh.toolkit.browsers.lanuchexplore.BrowsersType;
import com.zkr.lh.toolkit.browsers.lanuchexplore.LaunchExplore;
import com.zkr.lh.toolkit.readProperties.GetProperties;



public class testFqz {
	private static Logger logger = Logger.getLogger(testFqz.class.getName());
	WebDriver driver;
	LaunchExplore se;
	GetProperties readProperties;
	loginPageFactory loginpage;
	@BeforeTest
	public void reday() {
		PropertyConfigurator.configure("D:\\EclipseProject\\SeleniumFqz\\tool\\log4j.properties");
		se=new LaunchExplore(BrowsersType.firefox);
		driver=se.driver;
		readProperties = new GetProperties("D:\\EclipseProject\\SeleniumFqz\\tool\\fqzBasic.properties");
	}
	@BeforeClass
	public void redayClass() {
		loginpage=new loginPageFactory(driver);
	}
	
	@Test
	public void loginTest() {
		loginpage.loginurl(readProperties.getValue("url"));
		assertTrue(driver.getCurrentUrl().equals("http://106.39.94.231:9080/sinoiaaf/"));
		logger.info("µ«¬º≤‚ ‘µÿ÷∑"+readProperties.getValue("url"));
		loginpage.userslogin(readProperties.getValue("username"), readProperties.getValue("password"));
	}

}
