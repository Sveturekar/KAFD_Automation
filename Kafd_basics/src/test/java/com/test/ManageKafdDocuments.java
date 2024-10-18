package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseUtilities;
import com.pojo.KafdLogin;
import com.pojo.Parcel;

public class ManageKafdDocuments extends BaseUtilities {
	Parcel parcel;
	KafdLogin kafdLogin;

	@BeforeClass
	public void loginIntialization() throws IOException, InterruptedException {
		
		kafdLogin = new KafdLogin();
		try {
			kafdLogin.getHeader().isDisplayed();
			System.out.println("Continue testing ");
		} catch (NullPointerException e) {
			Login login = new Login();
			login.signInKafd();
		}

	}

	@Test(description = "Verify kafd document")
	public void uploadKafdDocuments() {

		parcel = new Parcel();
		webWaitVisibility(parcel.getAddDocumentCategory());
		parcel.getAddDocumentCategory().click();
		sendText(parcel.getCategoryName(), "KiranAutomationDocuments");
		parcel.getSaveCategoryName().click();

	}
	
	
	
	/*@AfterClass
	private void quitDriver() {
		driver.quit();
	}*/

}
