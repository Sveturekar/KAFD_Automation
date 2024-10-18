package com.pojo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseUtilities;

public class Add_tenancy_page extends BaseUtilities
{
	 

	public Add_tenancy_page() {
		PageFactory.initElements(driver, this);
	}

	

	

	
	@FindBy(xpath ="//a[@class='nav-link text-primary']/svg-icon[@src='assets/icons/menu-icons/parcel-onboard.svg']")
	private WebElement Dashboard_button;
	
	public WebElement Dashboard_button()
	{
		return Dashboard_button;
	}
	
	
		
	
	public void Add_tenancy_button() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//div[@class='row row-cols-1 row-cols-md-4 g-0 ng-tns-c246-2 ng-star-inserted']")).click();
				//webWaitVisibility(Test2);
		//Test2.click();
	WebElement scrollElement = driver.findElement(By.xpath("//b[contains(text(),'Slow Progress')]"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", scrollElement);
	Thread.sleep(3000);


	int size = driver.findElements(By.xpath("//p[@class='title-text-overflow ng-tns-c246-0']")).size();
	System.out.println(size);
 
	for (int i = 0; i < size; i++) 
	{
	String text = driver.findElements(By.xpath("//p[@class='title-text-overflow ng-tns-c246-0']")).get(i).getText();
	System.out.println(text);
	if (text.equalsIgnoreCase("Slow Progress")) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(15000);
		driver.findElements(By.xpath("//button[contains(text(),'Add Tenancy')]")).get(i).click();
		System.out.println(text+ "Final progress");

		break;
	}
	else 
	{

	}
	System.out.println(i);

}
System.out.println("Parcel clicked");


		}
	
	

}
