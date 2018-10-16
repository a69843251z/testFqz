package com.lh.practice.testng.report;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG {
	@BeforeSuite
	public void beforesuit() {
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod");
	}
	@Test
	public void test1() {
		System.out.println("this is test1");
		Reporter.log("这是我的报告");
	}
	@Test
	public void test2() {
		System.out.println("this is test1");
	}
	@Test
	public void test3() {
		System.out.println("this is test3");
		
	}
	@Test
	public void test4() {
		assertEquals("a", "b");
		
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}
	
	

}
