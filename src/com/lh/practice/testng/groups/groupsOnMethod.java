package com.lh.practice.testng.groups;

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

public class groupsOnMethod {
	@Test(groups="server")
	public void test1() {
		System.out.println("���Ƿ������Ĳ��Է���111111");
	}
	@Test(groups="server")
	public void test2() {
		System.out.println("���Ƿ������Ĳ��Է���222222");
	}
	@Test(groups="client")
	public void test3() {
		System.out.println("���ǿͻ�����Ĳ��Է���111111");
	}
	@Test(groups="client")
	public void test4() {
		System.out.println("���ǿͻ�����Ĳ��Է���222222");
	}
	
	@BeforeGroups(groups="server")
	public void serverBeforeGroups() {
		System.out.println("���Ƿ����֮ǰ���еķ���");
	}
	@AfterGroups(groups="server")
	public void serverAfterGroups() {
		System.out.println("���Ƿ����֮ǰ���еķ���");
	}


}
