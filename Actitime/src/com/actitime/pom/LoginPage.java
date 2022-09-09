package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generic.BaseClass;

public class LoginPage extends BaseClass {
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
	@FindBy(linkText = "Forgot your password?")
	private WebElement fgtPwdLink;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void setLogin(String u,String pw) {
		untbx.sendKeys(u);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}
	public void setForgotPwd() {
		fgtPwdLink.click();
	}
	
}
