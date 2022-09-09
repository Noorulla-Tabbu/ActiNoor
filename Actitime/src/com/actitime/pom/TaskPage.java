package com.actitime.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addNewbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newCustomer;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerTbx;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDes;
	
	@FindBy(xpath = "//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCusDropDown;
	
	@FindBy(xpath = "//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement selectCompanyOption;
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCusBtn;
	
	@FindBy(xpath = "(//div[@class='editButton'])[last()]/..//div[1]")
	private WebElement cusName;
	
	@FindBy(xpath = "//div[.='+ New Project']")
	private WebElement newProject;
	
	@FindBy(xpath = "//div[.='+ New Tasks']")
	private WebElement newTask;
	
	@FindBy(xpath = "//div[@class='item importTasks']")
	private WebElement importTask;
	
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setCustomer(String name,String des) {
		addNewbtn.click();
		newCustomer.click();
		customerTbx.sendKeys(name);
		customerDes.sendKeys(des);
		selectCusDropDown.click();
		selectCompanyOption.click();
		createCusBtn.click();
	}
	
	public String getCusName() throws InterruptedException {
		Thread.sleep(1000);
		return cusName.getText();
		
	}

	public void setCusName(WebElement cusName) {
		this.cusName = cusName;
	}

	public void setProject() {
		addNewbtn.click();
		newProject.click();
	}
	public void setTask() {
		addNewbtn.click();
		newTask.click();
	}
	public void setImportTask() {
		addNewbtn.click();
		importTask.click();
	}
	
	
}
