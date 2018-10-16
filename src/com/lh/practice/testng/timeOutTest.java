package com.lh.practice.testng;

import org.testng.annotations.Test;

public class timeOutTest {
	@Test(timeOut = 3000)
	public void testSuccess() throws InterruptedException {
		Thread.sleep(2000);
	}

	@Test(timeOut = 3000)
	public void testUnSuccess() throws InterruptedException {
		Thread.sleep(4000);
	}

}
