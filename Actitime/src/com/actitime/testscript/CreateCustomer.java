package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLibrary;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskPage;

@Listeners(com.actitime.generic.ListenerImplements.class)
public class CreateCustomer extends BaseClass {
	@Test
	public void CreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		HomePage h=new HomePage(driver);
		h.setTasks();
		TaskPage t=new TaskPage(driver);
		FileLibrary f=new FileLibrary();
		String custName = f.getExcelData("customer", 1, 2);
		String custDes = f.getExcelData("customer", 1, 3);
		t.setCustomer(custName, custDes);
		String expName = t.getCusName();
		Assert.assertEquals(expName, custName);
	}
}
