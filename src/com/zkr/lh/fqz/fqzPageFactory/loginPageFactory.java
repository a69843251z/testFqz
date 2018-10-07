package com.zkr.lh.fqz.fqzPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageFactory {
	WebDriver driver;

	public loginPageFactory(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "html/body/div[2]/div[2]/form/ul/li[1]/input")
	public WebElement userName;
	@FindBy(xpath = ".//*[@id='passWord']")
	public WebElement passWord;
	@FindBy(xpath = ".//*[@id='login']")
	public WebElement loginButton;

	public void userslogin(String username, String password) {

		userName.sendKeys(username);
		passWord.sendKeys(password);
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginButton.click();*/
	}

	public void loginurl(String url) {
		driver.get(url);
	}

}
