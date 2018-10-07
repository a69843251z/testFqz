package com.lh.practice.testng.suit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class suitConfig {
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("This is BeforeSuite");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("This is AfterSuite");
	}

}
