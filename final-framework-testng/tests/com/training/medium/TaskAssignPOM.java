package com.training.medium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mysql.jdbc.Driver;

public class TaskAssignPOM {

	private WebDriver driver; 

	public TaskAssignPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\'course_tools\']/div[2]/div/div[19]/div/div[2]")
	private WebElement Projecticon; 
	
	public void Projecticon() throws InterruptedException {
		this.Projecticon.click(); 
	}


	@FindBy(xpath="//*[@id=\"post-123\"]/div/div/h3/a")
	private WebElement AssignedProjct; 
	
	public void AssignedProjct() throws InterruptedException {
		this.AssignedProjct.click(); 
	}
	@FindBy(xpath="//*[@id=\'toolbar\']/div/div/a[1]/img")
	private WebElement PrjctHome; 
	
	public void PrjctHome() throws InterruptedException {
		this.PrjctHome.click(); 
	}
	@FindBy(xpath="//*[@id=\'toolbar\']/div/div/a[2]/img")
	private WebElement LinkTask; 
	
	public void LinkTask() throws InterruptedException {
		this.LinkTask.click(); 
		
	}
		@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")
		private WebElement Text; 
		
	  //  driver.switchTo().defaultContent();
	    public void Text(String Title) throws InterruptedException {
			this.Text.sendKeys(Title); 
		}
		@FindBy(xpath="/html[1]/body[1]/p[1]")
		private WebElement snedCmmt; 
		
		public void snedCmmt(String Cmmnt) throws InterruptedException {
			this.snedCmmt.sendKeys(); 
			
		}
		
	
}
