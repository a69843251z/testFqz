package com.lh.practice.httpclient;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class myHttpClient {
	private String result;
	private ResourceBundle bundle;
	private CookieStore store;
	
	@BeforeTest
	public void prepare() {
		bundle= ResourceBundle.getBundle("httpClient", Locale.CHINA);
	}
	
	@Test
	public void testBundle() throws ClientProtocolException, IOException {
		//获取地址
		String uri=bundle.getString("text-url")+bundle.getString("text-uri-cookie");
		HttpGet get = new HttpGet(uri);
		DefaultHttpClient client =new DefaultHttpClient();
		HttpResponse response=client.execute(get);
		result=EntityUtils.toString(response.getEntity(),"UTF-8");
		System.out.println(result);
		//获取cookie
		this.store=client.getCookieStore();
		List<Cookie> list=this.store.getCookies();
		for (Cookie cookie : list) {
			String cookieName=cookie.getName();
			String cookValue=cookie.getValue();
			System.out.println(cookieName+cookValue);
		}
	}
	@Test(dependsOnMethods={"testBundle"})
	public void sendCookies() throws ClientProtocolException, IOException {
		String uri=bundle.getString("text-url")+bundle.getString("text-uri-sendcookie");
		HttpGet get = new HttpGet(uri);
		DefaultHttpClient client= new DefaultHttpClient();
		client.setCookieStore(this.store);
		HttpResponse response=client.execute(get);
		result=EntityUtils.toString(response.getEntity(),"UTF-8");
		System.out.println(result);
		store=client.getCookieStore();
		List<Cookie> cookie=store.getCookies();
		for (Cookie cookie2 : cookie) {
			System.out.println(cookie2.getName()+":"+cookie2.getValue());
		}
	}
	

	@Test(enabled=false)
	public void test() throws ClientProtocolException, IOException {

		HttpGet get = new HttpGet("http://www.baidu.com/");
		HttpClient client = new DefaultHttpClient();
		HttpResponse response = client.execute(get);
		result = EntityUtils.toString(response.getEntity(),"UTF-8");
		System.out.println(result);
	}
	
	@Test(enabled=false)
	public void httpGetMock() throws ClientProtocolException, IOException {
		HttpGet get =new HttpGet("http://localhost:8888/get/demo/cookie");
		HttpClient client = new DefaultHttpClient();
		HttpResponse response=client.execute(get);
		result=EntityUtils.toString(response.getEntity(),"UTF-8");
		System.out.println(result);
		
	}

}
