package com.training.medium;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class adminNUPOM {
private WebDriver driver; 
	
	public adminNUPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText ="Administration")
	private WebElement Admin; 
	
	@FindBy(xpath ="//a[contains(text(),'Add a user')]")
	private WebElement Adduser; 
	
	@FindBy(id="firstname")
	private WebElement firstName;
	
	@FindBy(id="lastname")
	private WebElement lastName;
	
	@FindBy(id="email")
	private WebElement eMail;
	
	@FindBy(id="phone")
	private WebElement pHone;
	
	@FindBy(id="username")
	private WebElement usernAme;

	@FindBy(name="password[password_auto]")
	private WebElement enterPwd;
	
	@FindBy(id="password")
	private WebElement upassword;
			
	@FindBy(id="status_select")
	private WebElement trainer;
		
	@FindBy(xpath="//*[@id='user_add']/fieldset/div[10]/div[1]/div/select")
	private WebElement trainer1;
	
	@FindBy(name ="submit")
	private WebElement addnewuser;
			
	public void selectRadio() 
	{
			try {
			this.enterPwd.click();
			this.enterPwd.isSelected();
		} catch (Exception e) {
			System.out.println(e);
		}   
	}
	public void sendTrainer(String trainer) {
		this.trainer.clear(); 
		this.trainer.sendKeys(trainer); 
	}
	
	public void adminClick() throws InterruptedException {
		this.Admin.click(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}
	
	public void addUser() throws InterruptedException {
		this.Adduser.click(); 
		System.out.println("New user created is: "+usernAme);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   }
	public void sendfirstname(String firstname) {
		this.firstName.clear(); 
		this.firstName.sendKeys(firstname); 
	}
	
	public void sendlastname(String lastName) {
		this.lastName.clear(); 
		this.lastName.sendKeys(lastName); 
	}
	public void sendemail(String eMail) {
		this.eMail.clear(); 
		this.eMail.sendKeys(eMail); 
	}
	public void sendphone(String phone) {
		this.pHone.clear(); 
		this.pHone.sendKeys(phone); 
	}
	public void senduName(String usernAme) throws InterruptedException {
		this.usernAme.clear(); 
		this.usernAme.sendKeys(usernAme); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);}
	
	public void sendpWord(String upassword) {
		this.upassword.clear(); 
		this.upassword.sendKeys(upassword); 
	}
			
	public void trainer()
	{
	
	Select dropdown = new Select(trainer1);  
	dropdown.selectByVisibleText("Trainer");
	
		
	}
	public void sendAdd() {
		this.addnewuser.click(); 
	}
	}
