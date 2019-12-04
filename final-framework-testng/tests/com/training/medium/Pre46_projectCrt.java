package com.training.medium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

	public class Pre46_projectCrt {
		private WebDriver driver; 

		public Pre46_projectCrt(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this); //*[@id="cm-content"]/div/div[3]/a/img
		}
		@FindBy(xpath ="//*[@id=\'custom-icons\']/div/div[21]/div/div[3]")
		private WebElement ProjectIcon; 

		public void ProjectIcon() throws InterruptedException {
			this.ProjectIcon.click(); 
		}

		@FindBy(xpath ="//*[@id=\'cm-content\']/div/div[3]/a/img")
		private WebElement ProjecteditIcon; 

		public void ProjecteditIcon() throws InterruptedException {
			this.ProjecteditIcon.click(); 
		}

		@FindBy(xpath ="//*[@id=\'project5de6b09541f81\']/tbody/tr[2]/td[1]/a")
		private WebElement Projecteseletcon; 

		public void Projecteseletcon() throws InterruptedException {
			this.Projecteseletcon.click(); 
		}
		@FindBy(xpath ="//*[@id=\'toolbar\']/div/div/a[4]/img")
		private WebElement Projecteditcon; 

		public void Projecteditcon() throws InterruptedException {
			this.Projecteditcon.click(); 
		}
		@FindBy(xpath ="//*[@id=\'tablename5de6b18f1ce47\']/tbody/tr[2]/td[1]/input")
		private WebElement Projectassigne; 

		public void Projectassigne() throws InterruptedException {
			this.Projectassigne.click(); 
		}
		@FindBy(xpath ="//*[@id=\'tablename5de6b18f1ce47\']/tbody/tr[2]/td[5]/a")
		private WebElement Projectreg; 

		public void Projectreg() throws InterruptedException {
			this.Projectreg.click(); 
		}
		String alret=driver.switchTo().alert().getText();
		private static String expect="The user has been registered";

		public void fileuploadMsg() {
			Assert.assertEquals(expect, alret);
			System.out.println("alret");
		}




}
