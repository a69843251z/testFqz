package com.lh.practice.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class groups {
	@Test(groups="server")
	public void test1() {
		System.out.println("这是服务端组的测试方法111111");
	}
	@Test(groups="server")
	public void test2() {
		System.out.println("这是服务端组的测试方法222222");
	}
	@Test(groups="client")
	public void test3() {
		System.out.println("这是客户端组的测试方法111111");
	}
	@Test(groups="client")
	public void test4() {
		System.out.println("这是客户端组的测试方法222222");
	}
	
	@BeforeGroups(groups="server")
	public void serverBeforeGroups() {
		System.out.println("这是服务端之前运行的方法");
	}
	@AfterGroups(groups="server")
	public void serverAfterGroups() {
		System.out.println("这是服务端之前运行的方法");
	}


}
