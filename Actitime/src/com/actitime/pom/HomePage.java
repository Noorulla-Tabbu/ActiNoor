package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BaseClass;

public class HomePage extends BaseClass {
	@FindBy(id="logoutLink")
	private WebElement lgbtn;
	
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasksbtn;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reportsbtn;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement usersbtn;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setLogout() {
		lgbtn.click();
	}
	public void setTasks() {
		tasksbtn.click();
	}
	public void setReports() {
		reportsbtn.click();
	}
	public void setUsers() {
		usersbtn.click();
	}
}
