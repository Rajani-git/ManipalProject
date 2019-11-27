package com.training.high;

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
	//@FindBy(linkText ="//div[@class='panel panel-default block-admin-users']//a[contains(text(),'User list')]")
	private WebElement userlist; 
	
	public void userList() throws InterruptedException {
		this.userlist.click(); 
		Thread.sleep(2000);
		
   }

}
