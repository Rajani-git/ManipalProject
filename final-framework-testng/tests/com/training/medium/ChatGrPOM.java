package com.training.medium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatGrPOM {
		private WebDriver driver; 

		public ChatGrPOM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath ="//*[@id=\'toolimage_10095\']")
		private WebElement GroupIcon; 

		public void GroupIcon() throws InterruptedException {
			this.GroupIcon.click(); 
		}
		
		@FindBy(linkText ="Group 0001")
		private WebElement AssignedGrp; 

		public void AssignedGrp() throws InterruptedException {
			this.AssignedGrp.click(); 
		}

		@FindBy(xpath ="//*[@id=\'cm-content\']/div/div[3]/ul/li[7]/a/img")
		private WebElement Chaticon; 

		public void Chaticon() throws InterruptedException {
			this.Chaticon.click(); 
		}
		
		@FindBy(xpath ="/html[1]/body[1]/main[1]/section[1]/div[1]/div[4]/table[1]/tbody[1]/tr[3]/td[1]/a[1]/img[1]")
		private WebElement ChatGrpMbr; 

		public void ChatGrpMbr() throws InterruptedException {
			this.ChatGrpMbr.click(); 
		}
		
		@FindBy(xpath ="//*[@id=\'sn-sidebar-collapse\']/div/ul/li[1]/a")
		private WebElement ClcLeaveMsg; 

		public void ClcLeaveMsg() throws InterruptedException {
			this.ClcLeaveMsg.click(); 
		}
		public void HandlngpopUp(String WebDriver, String Message ) {
        driver.switchTo().defaultContent();	                                                                                                           
        driver.findElement(By.name("subject_id")).sendKeys("text");                			
        driver.findElement(By.id("content_id")).sendKeys("Message");                			
        
        driver.findElement(By.name("//a[@id='send_message_link']")).click();	
		}

	/*	@FindBy(xpath ="//*[@id=\'subject_id\']")
		private WebElement SubLeaveMsg; 

		public void SubLeaveMsg(String subject) throws InterruptedException {
			driver.switchTo().alert();

			SubLeaveMsg.sendKeys(subject); 
		}
		
		@FindBy(xpath ="//*[@id=\'content_id\']")
		private WebElement TxtMsg; 

		public void TxtMsg(String txt) throws InterruptedException {
			TxtMsg.sendKeys(txt); 
		}

		@FindBy(xpath ="//*[@id=\'send_message_link\']")
		private WebElement SendMsg; 

		public void SendMsg() throws InterruptedException {
			SendMsg.click(); 
		}
*/

}
