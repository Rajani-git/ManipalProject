package com.training.medium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignmentPOM {
private static final Object Subscribe = null;
private WebDriver driver; 

public AssignmentPOM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
}


    @FindBy(xpath ="//*[@id=\'coursesCollapse\']/div/ul/li[3]/a")
    private WebElement courseCatalog; 
	
    public void courseCatalog() throws InterruptedException {
		this.courseCatalog.click(); 
	}
	/*@FindBy(xpath ="//*[@id=\'cm-content\']/div/div[2]/div/div/div/div[1]/form/div/input")
    private WebElement SearchCourse; 

	public void SearchCourse(String courseSearch) throws InterruptedException {
		this.SearchCourse.clear(); 
		this.SearchCourse.sendKeys("WebDriver"); 
	}
	
	@FindBy(xpath="//*[@id='cm-content']/div/div[3]/div[2]/div/div[1]/a/img")
	private WebElement Selectcourse;
	
	public void Selectcourse() {
		this.Selectcourse.click();
	}
	
	//@FindBy(xpath="//*[@id=\'cm-content\']/div/div[3]/div[1]/div/div[1]/a/img")
	//private WebElement Selectcourse1;
	
	//public void Selectcourse1() {
		//this.Selectcourse1.click();
		
	//}
	@FindBy(xpath="//*[@id=\'course-info-bottom\']/div/div[2]/div[1]/div/div/a")
	private WebElement Courseinfo;
	
	public void Courseinfo() {
		
		this.Courseinfo.click();
	}

	
	@FindBy(xpath ="//*[@id=\'course-info-bottom\']/div/div[2]/div[1]/div/div/a")
	private WebElement courseDetail;
	
	public void courseDetail() throws InterruptedException {
		this.courseDetail.click(); 
	}
	
	@FindBy(xpath="//*[@id=\'toolimage_8510\']")
	private WebElement assignment;
	
	public void assignment() {
		this .assignment.click();
	}
	
	@FindBy(xpath="//*[@id=\'81\']/td[2]/a")
	private WebElement assignment1;
	
	public void assignment1() {
		this.assignment1.click();
	}
	
	@FindBy(xpath="//*[@id=\'toolbar-work\']/div/div[2]/a")
	private WebElement upload;
	
	public void upload() {
		this.assignment1.click();
		//upload a document manually.*/
	}



