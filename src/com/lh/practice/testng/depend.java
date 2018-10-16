package com.lh.practice.testng;

import org.testng.annotations.Test;

public class depend {
	@Test
	public void test1() {
		System.out.println("sys1");
	}
	@Test(dependsOnMethods= {"test1"})
	public void test2() {
		System.out.println("sys2");
	}

}
