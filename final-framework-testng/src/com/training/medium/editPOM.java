package com.training.medium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class editPOM {

private WebDriver driver; 
	
	public editPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//*[@id=\'profileCollapse\']/div/ul/li[5]/a")
    private WebElement editprof; 
	
	@FindBy(xpath ="//*[@id=\'profileCollapse\']/div/ul/li[5]/a")
    private WebElement editprof; 
	
	@FindBy(xpath ="//*[@id=\'profileCollapse\']/div/ul/li[5]/a")
    private WebElement editprof; 
	
	public void editProf() throws InterruptedException {
		this.editprof.click(); 
		Thread.sleep(2000);
		

}
}
