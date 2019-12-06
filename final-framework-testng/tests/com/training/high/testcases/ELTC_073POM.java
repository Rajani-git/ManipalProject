package com.training.high.testcases;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELTC_073POM {

	private WebDriver driver;
	public ELTC_073POM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		  }
		   @FindBy(xpath ="//a[contains(text(),'Administration')]")
	       private WebElement Administraton; 
		   
		   public void Administraton() throws InterruptedException {
				this.Administraton.click(); 
				}
		   @FindBy(xpath ="//a[contains(text(),'Courses categories')]")
	       private WebElement Coursecategories; 
		   
		   public void Coursecategories() throws InterruptedException {
				this.Coursecategories.click(); 
				}
		   @FindBy(css = "main.section-platform_admin:nth-child(1) section:nth-child(3) div.container div.actions a:nth-child(1) > img:nth-child(1)")
			 private WebElement Addcategories; 
		   
		   public void Addcategories() throws InterruptedException {
				this.Addcategories.click(); 
				}
		   @FindBy(id="course_category_code")
	       private WebElement Crscategorycode; 
		   
		   public void Crscategorycode(String BC) throws InterruptedException {
				this.Crscategorycode.clear(); 
				this.Crscategorycode.sendKeys("BC");
		   }	
			
		   @FindBy(id="course_category_name")//
		   private WebElement CrscategoryNme; 
				   
		  public void CrscategoryNme(String BC) throws InterruptedException {
		  this.CrscategoryNme.clear(); 
		  this.CrscategoryNme.sendKeys("Blended Learning"); 
				
			}
		   
			 @FindBy(id="qf_group_1-group")
				private WebElement AddCourse; 
			
			 public void selectRadio() 
				{
					try {
						this.AddCourse.click();
						this.AddCourse.isSelected();
	  				} catch (Exception e) {
					System.out.println(e);
						}   
				}	
			 @FindBy(name="submit")
			 private WebElement AddCourseSubmit;
			 
			 public void AddCourseSubmit() throws InterruptedException {
				 this.AddCourseSubmit.click(); 
			 }
			 
			 @FindBy(xpath="//a[contains(text(),'Administration')]")
			 private WebElement AdminLink;
			 
			 public void AdminLink() throws InterruptedException {
				 this.AdminLink.click(); 
				  }
			 
			 @FindBy(xpath="//a[contains(text(),'Create a course')]")
			 private WebElement Creatcourse;
		  
			 public void Creatcourse() throws InterruptedException {
				 this.Creatcourse.click(); 
				  }
			 @FindBy(id="update_course_title")
			 private WebElement UpdtcourseTtl;
		  
			 public void UpdtcourseTtl(String test) throws InterruptedException {
				 this.UpdtcourseTtl.clear();
				 this.UpdtcourseTtl.sendKeys(test);
				  }
			
	    	@FindBy(id="visual_code")
	    	private WebElement CodeTxt;
	    	
	    	public void CodeTxt(String test) throws InterruptedException {
				 this.CodeTxt.clear();
				 this.CodeTxt.sendKeys(test);
				  }
			
	  	
	    	
	    	
	    	 @FindBy(id="udate_course_category_code")	
		     private WebElement Learngtype;
		    	
	    	 public void Learngtype() {
	 	    	Select LanglistBx =new Select(Learngtype);
	 	    	LanglistBx.selectByVisibleText("Blended Learning");
	 	    		
	 	    	}
	 	   		
	    	 @FindBy(xpath="//input[@placeholder='Please select an option']")	
		     private List<WebElement> TeacherSelct;
		    	
	    	 public void TeacherSelct() {
	 	    	for (WebElement option : TeacherSelct) {
	 	    	    if (option.getText().contains("man")) {
	 	    	        option.click();
	 	    	        break;}
	 	    	}		
	 	    	}	
		    
	   	@FindBy(xpath="//[contains(text(),'English')]")
	   	private WebElement LangSelect;
	    	
	    public void LangSelect() {
	    	Select LanglistBx =new Select(LangSelect);
	    	LanglistBx.selectByVisibleText("English");
	    		
	    	}
	    		 
	    	 @FindBy(id="update_course_submit'")
			 private WebElement CreatcourseSub;
		  
			 public void CreatcourseSub() throws InterruptedException {
				 this.CreatcourseSub.click(); 
				  }
				 
	    		 
	    		 


	    		 

	    	}
	    	

