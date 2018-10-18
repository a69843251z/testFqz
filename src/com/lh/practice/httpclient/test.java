package com.lh.practice.httpclient;

import java.util.Locale;
import java.util.ResourceBundle;

import org.testng.annotations.Test;

public class test {
		
		ResourceBundle bundle;
		@Test
		public void test() {
			bundle = ResourceBundle.getBundle("fqzBasic",Locale.CHINA);
			System.out.println(bundle.getString("url"));
		}

}
