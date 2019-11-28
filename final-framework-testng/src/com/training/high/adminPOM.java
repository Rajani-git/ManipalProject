package com.training.high;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adminPOM {
private WebDriver driver; 
	
	public adminPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText ="User list")
	private WebElement userlist; 
	
	@FindBy(xpath ="//tr[2]//td[11]//a[6]//img[1]")
	private WebElement edituser; 
	
	public void userList() throws InterruptedException {
		this.userlist.click(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
	public void edituserclick() throws InterruptedException {
		this.edituser.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
   }

}
