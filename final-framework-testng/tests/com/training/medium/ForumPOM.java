package com.training.medium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ForumPOM {
	private WebDriver driver;
	public ForumPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	  }
	@FindBy(xpath ="//*[@id=\'coursesCollapse\']/div/ul/li[3]/a")
    private WebElement courseCatalog; 
	
	
	//Searching for the Course //*[@id="coursesCollapse"]/div/ul/li[3]/a
	@FindBy(xpath ="//*[@id=\'cm-content\']/div/div[2]/div/div/div/div[1]/form/div/input")
    private WebElement SearchCourse; 
	
	//Selecting the course
		@FindBy(xpath ="//*[@id=\'cm-content\']/div/div[2]/div/div/div/div[1]/form/div/div/button")
		private WebElement CouseSelect; 
		
		// Slecting the particular course 
		@FindBy(xpath="//*[@id='cm-content']/div/div[3]/div[2]/div/div[1]/a/img")
		private WebElement Selectcourse;
		
		//COursedetails 
		@FindBy(xpath="//*[@id=\'course-info-bottom\']/div/div[2]/div[1]/div/div/a")
		private WebElement Courseinfo;
		//@FindBy(xpath ="//a[contains(text(),'Add a user')]")
				//Selecting ForumIcon 
		@FindBy(xpath="//a[contains(text(), Forums]") 
		private WebElement Fourmicon; 
		
		@FindBy(xpath ="//*[@id='category_27']/div/div[2]/div[2]/div/div/div/div[1]/div/a/img") 
		private WebElement Fourmgrps; 
		
		@FindBy(xpath ="//*[@id=\'category_27\']/div/div[2]/div[2]/div/div/div/div[2]/h3/a[1]")
		private WebElement grThread; 

		@FindBy(xpath ="//*[@id=\"cm-content\"]/div/div[2]/a[2]/img")
		private WebElement CreatThread; 

		@FindBy(xpath ="//*[@id=\'thread_post_title\']")
		private WebElement titleThread; 

	//	@FindBy(xpath ="//p")
	//	private WebElement titleText; 
		
		@FindBy(name ="SubmitPost")
		private WebElement SubmitThread; 

		
		@FindBy(xpath ="//input[@id='thread_post_title']") 
		private WebElement replymsgTitle; 


		@FindBy(xpath ="//iframe[@class='cke_wysiwyg_frame cke_reset']") 
		private WebElement replyframe; 
		public void switchFrame1() {
			driver.switchTo().frame(replyframe);
			}


		public void courseCatalog() throws InterruptedException {
			this.courseCatalog.click(); 
			}
		

	public void SearchCourse(String courseSearch) throws InterruptedException {
		this.SearchCourse.clear(); 
		this.SearchCourse.sendKeys("WebDriver"); 
	}
	
	public void CouseSelect() throws InterruptedException {
		this.CouseSelect.click(); 
	}
	
	public void Selectcourse() {
		this.Selectcourse.click();
	}
	
	
	
	public void Courseinfo() {
		this.Courseinfo.click();
	}
	
	public void Fourmicon() throws InterruptedException {
		this.Fourmicon.click(); 
	}

	
	public void Fourmgrps() throws InterruptedException {
		this.Fourmgrps.click(); 
	}
	
	
	public void grThread() throws InterruptedException {
		this.grThread.click(); 
	}
	
	
	public void CreatThread() throws InterruptedException {
		this.CreatThread.click(); 
	}

	
	public void titleThread(String ThreadName ) throws InterruptedException {
		this.titleThread.clear(); 
		titleThread.sendKeys(ThreadName);
	}
	
	
	@FindBy(xpath ="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	private WebElement desFrame; 

	public void switchFrame() {
	driver.switchTo().frame(desFrame);
	}
	
	@FindBy(xpath ="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p")
	private WebElement titleText;
	
	public void titleText(String Threaddetails) throws InterruptedException {
		//driver.switchTo().frame(0);
		this.titleText.clear(); 
		titleText.sendKeys(Threaddetails);
		
	}
	public void switchtoPOM()throws InterruptedException {
		driver.switchTo().defaultContent();
		}
	
	public void SubmitThread() throws InterruptedException {
		this.SubmitThread.click(); 
		}

	
		
	public void replyMsgTitle(String replytxt) throws InterruptedException {
		this.replyMsgTitle.clear(); 
	replyMsgTitle.sendKeys(replytxt);
	
	}
	
	@FindBy(xpath ="//input[@id='thread_post_title']")
	private WebElement replyMsgTitle;
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p")
	private WebElement replyMsg;
	public void replyMsg(String replytt) throws InterruptedException {
		this.replyMsg.clear(); 
		replyMsg.sendKeys(replytt);
	
	}
	@FindBy(name ="SubmitPost")
	private WebElement backreplypost; 

	public void backreplypost() throws InterruptedException {
		this.backreplypost.click(); 
		}
	
	
	 public void Validating() {
		 Alert alert = driver.switchTo().alert();
		String actualMessage=driver.switchTo().alert().getText();			
		 System.out.println("actualMessage");
	}





}
