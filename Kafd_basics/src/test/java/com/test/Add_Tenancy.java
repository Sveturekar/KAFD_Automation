package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.BaseUtilities;
import com.pojo.Add_tenancy_page;

public class Add_Tenancy extends BaseUtilities
{
	
	
	
	@Test
	public void Add_Tenancy() throws InterruptedException
	{
	
		Add_tenancy_page Aten = new Add_tenancy_page();
		//webWaitVisibility(Aten.Dashboard_button());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 clickElementJavascript(Aten.Dashboard_button());
		Aten.Add_tenancy_button();
		
		
		
		
	}

}
