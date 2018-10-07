package com.lh.practice.testng;

import org.testng.annotations.Test;

public class ignoreTest {

	@Test(enabled = false)
	public void ingore() {
		System.out.println("this is ingore");
	}

	@Test
	public void noIngore() {
		System.out.println("this is noIngore");
	}

	@Test(enabled = true)
	public void Ingore2() {
		System.out.println("this is noIngore2");
	}

}
