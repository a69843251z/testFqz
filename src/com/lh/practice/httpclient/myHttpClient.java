package com.lh.practice.httpclient;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

public class myHttpClient {
	String result;
	@Test
	public void test() throws ClientProtocolException, IOException {

		HttpGet get = new HttpGet("http://www.baidu.com/");
		HttpClient client = new DefaultHttpClient();
		HttpResponse response = client.execute(get);
		result = EntityUtils.toString(response.getEntity(),"UTF-8");
		System.out.println(result);
	}
	
	@Test
	public void httpGetMock() throws ClientProtocolException, IOException {
		HttpGet get =new HttpGet("http://localhost:8888/get/demo/cookie");
		HttpClient client = new DefaultHttpClient();
		HttpResponse response=client.execute(get);
		result=EntityUtils.toString(response.getEntity(),"UTF-8");
		System.out.println(result);
		
	}

}
