	package com.training.medium;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;

	public class ForurmPreReq {

	//private static final Object Subscribe = null;
	private WebDriver driver; 

	public ForurmPreReq(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//*[@id=\'coursesCollapse\']/div/ul/li[4]/a")
	private WebElement courseCatalog; 
	
	//Searching for the Course
	@FindBy(xpath ="//*[@id=\'cm-content\']/div/div[2]/div/div/div/div[1]/form/div/input")
	private WebElement SearchCourse; 
	
	@FindBy(xpath ="//*[@id=\'cm-content\']/div/div[2]/div/div/div/div[1]/form/div/div/button")
	private WebElement SearchCrse; 
	
	@FindBy(xpath="//*[@id=\'cm-content\']/div/div[3]/div[2]/div/div[1]/a/img")
	private WebElement BrowseCourse;

	@FindBy(xpath="//*[@id=\'course-info-bottom\']/div/div[2]/div[1]/div/div/a")
	private WebElement CourseDetails;

	@FindBy(xpath="//*[@id=\'course_tools\']/div[1]/div/div[2]/div/a[2]")
	private WebElement EditCousedtl;
	
	@FindBy(xpath="//*[@id=\'custom-icons\']/div/div[8]/div/div[3]/a")
	private WebElement EditForum;
	
	@FindBy(xpath="//*[@id=\"icon_edit_name\"]")
	private WebElement Forumdetail1;
	
	@FindBy(xpath="//*[@id=\"icon_edit_name\"]")
	private WebElement Forumdetail2;

	@FindBy(xpath="//*[@id=\'icon_edit_submit\']")
	private WebElement Submit;
	
	

	public void courseCatalog() throws InterruptedException {
		this.courseCatalog.click(); 
	}
	
	public void SearchCourse(String courseSearch) throws InterruptedException {
		this.SearchCourse.clear(); 
		this.SearchCourse.sendKeys("WebDriver");
	}

	
	public void SearchCrse() throws InterruptedException {
		this.SearchCrse.click(); 
		}

	
	public void BrowseCourse() {
		this.BrowseCourse.click();
	}

	
	public void CourseDetails() {
		this.CourseDetails.click();
	}

	
	public void EditCousedtl() {
		this.EditCousedtl.click();
	}
	
	
		public void EditForum() {
		this.EditForum.click();
	}
	
	public void Forumdetail1(String name) {
		this.Forumdetail1.sendKeys(name);
	}
		
	
		public void Forumdetail2(String link) {
			this.Forumdetail2.sendKeys(link);

	}

	
	public void Submit() {
		this.Submit.click();
}
	
/*	String alret=driver.switchTo().alert().getText();
 private static String expect="File upload succeeded";

 public void fileuploadMsg() {
 	Assert.assertEquals(expect, alret);
 	System.out.println("alret");

 }*/

}


