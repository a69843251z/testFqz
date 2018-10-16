package com.lh.practice.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterTest {
	@Test
	@Parameters({"name","age"})
	public void parameter(String name,int age) {
		System.out.println("my Name is"+" "+name+"\n"+"my Age is"+" "+age);
	}

}
