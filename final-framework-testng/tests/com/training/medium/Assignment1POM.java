package com.training.medium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class Assignment1POM {
private WebDriver driver; 

public Assignment1POM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
     }
//Locating course catalog  
@FindBy(xpath ="//*[@id=\'coursesCollapse\']/div/ul/li[3]/a")
private WebElement courseCatalog; 

//searching for the Course 
@FindBy(xpath ="//*[@id=\'cm-content\']/div/div[2]/div/div/div/div[1]/form/div/input")
private WebElement SearchCourse;

//selecting the Course
@FindBy(xpath ="//*[@id=\'cm-content\']/div/div[2]/div/div/div/div[1]/form/div/div/button")
private WebElement CouseSelect; 

//Browsing the 
@FindBy(xpath="//*[@id=\'cm-content\']/div/div[3]/div/div/div[1]/a/img")
private WebElement CourseClick; 

@FindBy(xpath="//*[@id=\'course-info-bottom\']/div/div[2]/div[1]/div/div/a")
private WebElement Coursehome; 

//Locating Assignments icon 
@FindBy(xpath ="//*[@id=\'toolimage_8608\']") 
private WebElement assignmentdetail; 

//Locating Assignments 
@FindBy(xpath ="//*[@id=\'113\']/td[2]/a")
private WebElement Assignments; 

//Uploading  my assignments 
@FindBy(xpath ="//*[@id=\'toolbar-work\']/div/div[2]/a")
private WebElement Uploaddoc;

@FindBy(xpath="//*[@id=\'dropzone\']/div")
private WebElement Pulldoc;




public void courseCatalog() throws InterruptedException {
	this.courseCatalog.click(); 
}

public void SearchCourse(String courseSearch) throws InterruptedException {
	this.SearchCourse.clear(); 
	this.SearchCourse.sendKeys("sel001"); 
}


public void CouseSelect() throws InterruptedException {
	this.CouseSelect.click(); 
}

public void CourseClick(){
	this.CourseClick.click();
}

public void Coursehome(){
	this.Coursehome.click();
}



public void assignmentdetail() throws InterruptedException {
	this.assignmentdetail.click(); 
}


public void Assignments() throws InterruptedException {
	this.Assignments.click(); 
}

public void Uploaddoc() throws InterruptedException {
	this.Uploaddoc.click(); 
}

public void Pulldoc() {
this.Pulldoc.click();
//upload your file here manually.
}
/*String alret=driver.switchTo().alert().getText();
private static String expect="File upload succeeded";

public void fileuploadMsg() {
	Assert.assertEquals(expect, alret);
	System.out.println("alret");
}*/

}
