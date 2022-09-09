package com.actitime.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnitPage {
	@FindBy(id="logoutLink")
	private WebElement lgbtn;
	
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasksbtn;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reportsbtn;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement usersbtn;
}
