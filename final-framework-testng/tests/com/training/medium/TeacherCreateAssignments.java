package com.training.medium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TeacherCreateAssignments {

//private static final Object Subscribe = null;
private WebDriver driver; 

public TeacherCreateAssignments(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
}
@FindBy(xpath ="//*[@id=\'coursesCollapse\']/div/ul/li[4]/a")
private WebElement courseCatalog; 

public void courseCatalog() throws InterruptedException {
	this.courseCatalog.click(); 
}
//Searching for the Course
@FindBy(xpath ="//*[@id=\'cm-content\']/div/div[2]/div/div/div/div[1]/form/div/input")
private WebElement SearchCourse; 

public void SearchCourse(String courseSearch) throws InterruptedException {
	this.SearchCourse.clear(); 
	this.SearchCourse.sendKeys("WebDriver");
}

@FindBy(xpath ="//*[@id=\'cm-content\']/div/div[2]/div/div/div/div[1]/form/div/div/button")
private WebElement SearchCrse; 

public void SearchCrse() throws InterruptedException {
	this.SearchCrse.click(); 
	}

@FindBy(xpath="//*[@id=\'cm-content\']/div/div[3]/div[2]/div/div[1]/a/img")
private WebElement BrowseCourse;

public void BrowseCourse() {
	this.BrowseCourse.click();
}

@FindBy(xpath="//*[@id=\'course-info-bottom\']/div/div[2]/div[1]/div/div/a")
private WebElement CourseDetails;

public void CourseDetails() {
	this.CourseDetails.click();
}

@FindBy(xpath="//*[@id=\'course_tools\']/div[1]/div/div[2]/div/a[2]")
private WebElement EditCousedtl;

public void EditCousedtl() {
	this.EditCousedtl.click();
}

@FindBy(xpath="//*[@id=\'custom-icons\']/div/div[13]/div/div[3]")
private WebElement CrtAssignmt;

public void CrtAssignmt() {
	this.CrtAssignmt.click();
}


@FindBy(xpath="//*[@id=\'icon_edit_name\']")
private WebElement NameOfAssignee;

public void NameOfAssignee(String assignee ) {
	this.NameOfAssignee.clear();
	this.NameOfAssignee.sendKeys("assignee");

}

@FindBy(xpath="//*[@id=\'icon_edit_link\']")
private WebElement LinkOfAssignee;

public void LinkOfAssignee(String LinkAssignee ) {
	this.LinkOfAssignee.clear();
	this.LinkOfAssignee.sendKeys("LinkAssignee");

}

@FindBy(xpath="//*[@id=\'icon_edit_submit\']")
private WebElement UpdateAssignee;

public void UpdateAssignee() {
	this.UpdateAssignee.click();
  
}
@FindBy(xpath="//*[@id=\'cm-content\']/div/div[3]/div/div")
	private WebElement ActualMsg;
    public void validassign() {
	String Expected_msg="Update successful"; 
	String Actualmessage=this.ActualMsg.getText();
	Assert.assertEquals(Expected_msg,Actualmessage);	 
		}

}
