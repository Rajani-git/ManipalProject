	package com.training.medium;

	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class TaskAssigProjectPOM {
			private WebDriver driver; 

			public TaskAssigProjectPOM(WebDriver driver) {
				this.driver = driver; 
				PageFactory.initElements(driver, this);
			}
			@FindBy(xpath ="//*[@id=\'course_tools\']/div[2]/div/div[19]/div/div[1]")
			private WebElement ProjectIcon; 

			public void ProjectIcon() throws InterruptedException {
				this.ProjectIcon.click(); 
			}
			//*[@id="group_category_05de61efbce2a4"]/tbody/tr[2]/td[1]/a
			@FindBy(linkText ="Welcome !")
			private WebElement Assignedprject; 

			public void Assignedprject() throws InterruptedException {
				this.Assignedprject.click(); 
			}

			@FindBy(xpath ="/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]")
			private WebElement ProjectHomeIcon; 

			public void ProjectHomeIcon() throws InterruptedException {
				this.ProjectHomeIcon.click(); 
			}
			
			@FindBy(xpath ="//a[contains(text(),'WebDriver2')]")
			private WebElement Projectnm; 

			public void Projectnm() throws InterruptedException {
				this.Projectnm.click(); 
			}
			public void switchtoblog() {
		    driver.switchTo().defaultContent();
			}

			@FindBy(name="title") 
			private WebElement ComntTitle; 

			public void ComntTitle(String CmntTtle ) throws InterruptedException {
				this.ComntTitle.clear(); 
				this.ComntTitle.sendKeys(CmntTtle); 
					
			}
			
			@FindBy(xpath ="//iframe[@class='cke_wysiwyg_frame cke_reset']")
			private WebElement Frame1;
			
			
			public void switchFrame() {
				driver.switchTo().frame(Frame1);
				}
			
				
			@FindBy(xpath ="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
			private WebElement ComntFrame;
			
	         public void ComntFrame(String Comments) throws InterruptedException {
					//driver.switchTo().frame(0);
					
					this.ComntFrame.sendKeys(Comments);					
				}
				public void switchtoPOM()throws InterruptedException {
					driver.switchTo().defaultContent();
					}
				@FindBy(css = "#add_post_save")
				private WebElement Savepost;
				
				public void Savepost()throws InterruptedException {
					this.Savepost.click();
					}
				
			/*	 public void Validating() {
					// Alert alert = driver.switchTo().alert();
					String actualMessage = driver.switchTo().alert().getText();			
					 System.out.println("the Test Result is" +actualMessage);
				}	
				
		     public void HandlngpopUp(String WebDriver, String Message ) {
	        driver.switchTo().defaultContent();	                                                                                                           
	        driver.findElement(By.name("subject_id")).sendKeys("text");                			
	        driver.findElement(By.id("content_id")).sendKeys("Message");                			
	        */
	        @FindBy(xpath="//*[@id='cm-content']/div/div[2]/div/div[2]")
	        private WebElement alret1;
	        public void Validating() {
				 System.out.println("the Test Result is" +alret1);
			}
		

				//*[@id="cm-content"]/div/div[2]/div/div[2]
	}



