package com.training.high.testcases;

	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	import common.Assert;

	public class TeacherRegistrationPOM {
    private static final String expectedmsg = null;

	private WebDriver driver; 
		
		public TeacherRegistrationPOM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath ="//a[contains(text(),'Sign up!')]")
		private WebElement SignUp; 
		
		public void SignUp() {
			
			this.SignUp.click();
			
		}
		@FindBy(xpath ="//input[contains(@id='qf_9ed697')]")
		private WebElement TeachCourses; 
		
		
		 @FindBy(xpath ="//input[@id='registration_firstname']")
			private WebElement FirstName;
		 
		 @FindBy(xpath ="//input[@id='registration_lastname']")
		 	private WebElement LastName; 
		 
		 @FindBy(xpath ="//input[@id='registration_email']")
		 	private WebElement Email; 
		  
		 @FindBy(xpath ="//input[@id='username']")
		 	private WebElement UserName; 
		 
		 @FindBy(xpath ="//input[@id='pass1']")
		 	private WebElement Password1; 
		 
		 @FindBy(xpath ="//input[contains(@id,'pass2')]")
		 	private WebElement Password2; 
		 
		 @FindBy(xpath ="//input[contains(@id,'registration_phone')]")
		 	private WebElement PhoneNumber; 
		 
		 @FindBy(xpath ="//span[contains(@class,'bs-caret')]")
		 	private WebElement Languageselectbox; 
		 
		 @FindBy(xpath ="//a[contains(@class,'selected active')]")
		 	private WebElement Languageselect; 
		 
		 
		 @FindBy(xpath ="//button[contains(@id,'registration_submit')]")
		 	private WebElement Submit; 
		
		 
		 public void selectRadio() 
			{
				try {
					this.TeachCourses.click();
					this.TeachCourses.isSelected();
				   } catch (Exception e) {
				    System.out.println(e);
					}   
			}
		
			
		  public void FirstName(String Fname) throws InterruptedException {
		  this.FirstName.clear();
		  this.FirstName.sendKeys(Fname);
		 // Assert.assertTrue(if((this.FirstName).contains("[a-zA-Z0-9]+")==true);
		  }
		  public void LastName(String Lname) throws InterruptedException {
			  this.LastName.clear();
			  this.LastName.sendKeys(Lname);
			    } 
		  public void Email(String mail) throws InterruptedException {
			  this.Email.clear();
			  this.Email.sendKeys(mail);
			  
		  }
			 public void UserName(String username) throws InterruptedException {
			  this.UserName.clear();
			  this.UserName.sendKeys(username);
			   } 
		 
			 public void Password1(String password1) throws InterruptedException {
				  this.Password1.clear();
				  this.UserName.sendKeys(password1);
				   }
		  
			 public void Password2(String passwor2) throws InterruptedException {
				  this.Password1.clear();
				  this.UserName.sendKeys(passwor2);
				    }
			 public void PhoneNumber(String Pno) throws InterruptedException {
				  this.PhoneNumber.clear();
				  this.PhoneNumber.sendKeys(Pno);
				    }
			 public void Languageselectbox() {
			    		this.Languageselectbox.click();
			    	}
			 
			 public void Languageselect() {
//			    	Select LanglistBx =new Select(this.Languageselect);
//			    	LanglistBx.selectByVisibleText("English");
			       this.Languageselect.click();
			    	}
			   
			 public void Submit() throws InterruptedException {
				  this.Submit.click();
				  }
	
		/*	 public void validation() {
				 
			 
				 final String Errormsg = "The email address is not complete or contains some invalid characters";
				
				 try{Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'" + Errormsg +"')]")),Errormsg);
				 }catch(Error e) {
				System.out.println("This Registration failed due to "+e) ;
				 
			 }
			 
	}*/
	
	}
	