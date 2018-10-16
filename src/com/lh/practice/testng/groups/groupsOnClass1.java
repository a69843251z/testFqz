package com.lh.practice.testng.groups;

import org.testng.annotations.Test;

@Test(groups="stu")
public class groupsOnClass1 {
	@Test
	public void test1() {
		System.out.println("groupsOnClass1(1)");
	}
	@Test
	public void test2() {
		System.out.println("groupsOnClass2(2)");
	}

}
