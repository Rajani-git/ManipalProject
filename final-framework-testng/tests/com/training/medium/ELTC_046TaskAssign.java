package com.training.medium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.medium.Assignment1POM;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_046TaskAssign{
	private static final String Assignee = null;
	private WebDriver driver; 
	private String baseUrl; 
	private LoginPOM loginPOM;
	private TaskAssignPOM TaskAssignPOM;
	private com.training.medium.ForumPOM ForumPOM; 
	private Assignment1POM Assignment1POM; 
	private static Properties properties; 
	private ScreenShot screenShot; 


	@DataProvider(name="inputs")
	public Object[][] getData() {
		return new Object[][] {
			{"rajan", "rajan@123","WebDriver","Title", "Comments"},
		};
	}

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		//initialize the driver
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		//initialize loginPOMfile
		loginPOM = new LoginPOM(driver); 
		//initialize AssignmentPOMfile
		TaskAssignPOM = new TaskAssignPOM(driver);
		ForumPOM = new ForumPOM(driver);
		Assignment1POM = new Assignment1POM(driver);
		//login to "http://elearningm1.upskills.in/"
		baseUrl = properties.getProperty("baseURL");
		//initialize the screenshot driver
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Closing the browser
		//driver.quit();
		}
	
	
	@Test(dataProvider="inputs")
	public void testMethod1(String userName, String password, String courseSearch, String Title, String Commnt) throws InterruptedException {
		//Logging as a Teacher 
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn(); 
		//Searching for a course
	    Assignment1POM.courseCatalog(); 
	    ForumPOM.SearchCourse(courseSearch);
		ForumPOM.CouseSelect(); 
		ForumPOM.Selectcourse();
		ForumPOM.Courseinfo();
        TaskAssignPOM.Projecticon();
        TaskAssignPOM.AssignedProjct();
        TaskAssignPOM.PrjctHome();
        TaskAssignPOM.LinkTask();
        TaskAssignPOM.Text(Title);
        TaskAssignPOM.snedCmmt(Commnt);

}
}