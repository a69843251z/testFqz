package com.zkr.lh.sleniumApi;



import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.zkr.lh.toolkit.browsers.lanuchexplore.BrowsersType;
import com.zkr.lh.toolkit.browsers.lanuchexplore.LaunchExplore;

public class api {
	WebDriver driver;
	@BeforeClass
	
	public void re() {
		LaunchExplore la=new LaunchExplore(BrowsersType.firefox);
		this.driver=la.driver;
	}
	/*ifream的使用方法*/
	@Test(enabled=false)
	public void iferm() {
		driver.get("http://jqueryui.com/slider/");
		driver.switchTo().frame(driver.findElement(By.xpath(".//*[@class='demo-frame']")));
		WebElement webPoint=driver.findElement(By.xpath(".//*[@id='slider']/span"));
		Point po=driver.findElement(By.xpath(".//*[@id='slider']/span")).getLocation();
		System.out.println(po);
		Actions ac= new Actions(driver);
		ac.dragAndDropBy(webPoint, 500, 4).build().perform();
		System.out.println(po);
	}
	@Test
	public void selectItem() {
		driver.get("https://passport.jd.com/new/login.aspx?ReturnUrl=https%3A%2F%2Fwww.jd.com%2F");
		driver.findElement(By.linkText("账户登录")).click();
		driver.findElement(By.xpath(".//*[@id='loginname']")).sendKeys("390589484@qq.com");
		driver.findElement(By.xpath(".//*[@id='nloginpwd']")).sendKeys("hz51512242whd");
		driver.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.linkText("我的订单")).click();
		String window=driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		String titlename;
		for (String handle : handles) {
			titlename=driver.switchTo().window(handle).getTitle();
			if(titlename.contains("账户信息"))
				break;
		}
		
		driver.findElement(By.xpath(".//*[@id='_MYJD_info']/a[1]")).click();
		WebElement birthdayYear=driver.findElement(By.xpath(".//*[@id='birthdayYear']"));
		Select selectBrithady=new Select(birthdayYear);
		selectBrithady.selectByVisibleText("1993");
		List<WebElement> year=selectBrithady.getOptions();
		for (WebElement webElement : year) {
			System.out.println(webElement.getText());
		}
	}

}
