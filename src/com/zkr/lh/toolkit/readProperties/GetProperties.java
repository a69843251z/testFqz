package com.zkr.lh.toolkit.readProperties;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class GetProperties {
	Properties pro=new Properties();
	String value;

	public GetProperties(String propertiesPath) {
		// TODO Auto-generated constructor stub
		loadProperties(propertiesPath);
	}
	
	public void loadProperties(String propertiesPath) {
		try {
			InputStream in  = new FileInputStream(propertiesPath);
			InputStreamReader inr  =new InputStreamReader(in);
			BufferedReader br=new BufferedReader(inr);
			try {
				pro.load(br);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getValue(String keyName) {
		value = pro.getProperty(keyName).trim();
		try {
			value= new String(value.getBytes("UTF-8"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("1");
		}
		return value;
	}
	public static void main(String[] args) {
		GetProperties pro=new GetProperties("D:\\EclipseProject\\SeleniumFrame\\tool\\getProperties.properties");
		System.out.println(pro.getValue("url"));
	}
}
