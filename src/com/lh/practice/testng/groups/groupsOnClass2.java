package com.lh.practice.testng.groups;

import org.testng.annotations.Test;

public class groupsOnClass2 {
	@Test(groups="tea")
	public class groupsOnClass {
		@Test
		public void test1() {
			System.out.println("groupsOnClass2(1)");
		}
		@Test
		public void test2() {
			System.out.println("groupsOnClass2(2)");
		}
	}

}
