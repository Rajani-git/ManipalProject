package com.training.medium;

import java.util.concurrent.TimeUnit;

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
	//@FindBy(linkText ="panel-heading")
    @FindBy(xpath ="//*[@id=\'profile_block\']/div[1]/a")
    private WebElement profile; 
	
	@FindBy(xpath ="//*[@id='profileCollapse']/div/ul/li[5]/a")
    private WebElement editprof; 
	
	@FindBy(id="profile_password0")
	private WebElement passwordOld;
	
	@FindBy(id="password1")
	private WebElement passwordNw;
	
	@FindBy(id="profile_password2")
	private WebElement passwordConf;
	
	@FindBy(id="profile_apply_change")
	private WebElement pwdsave;
	
	
	public void ProfClick() throws InterruptedException {
		this.profile.click(); 
	}
	
	public void editProf() throws InterruptedException {
		this.editprof.click(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}	
	public void sendPassword(String password) {
		this.passwordOld.clear(); 
		this.passwordOld.sendKeys(password); 
	}
	public void sendpasswordnw(String passwordnw) {
		this.passwordNw.clear(); 
		this.passwordNw.sendKeys(passwordnw); 
	}
	public void sendpasswordconf(String passwordconf) {
		this.passwordConf.clear(); 
		this.passwordConf.sendKeys(passwordconf); 
	}
	public void confPwdClick() throws InterruptedException {
		this.pwdsave.click(); 
	}
	
}
