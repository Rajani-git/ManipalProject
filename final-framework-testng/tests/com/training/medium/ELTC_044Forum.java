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
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_044Forum {
	private WebDriver driver; 
	private String baseUrl; 
	private LoginPOM loginPOM; 
	private ForumPOM ForumPOM; 
	private Assignment1POM Assignment1POM; 
	private static Properties properties; 
	private ScreenShot screenShot; 


	@DataProvider(name="inputs")
	public Object[][] getData() {
		return new Object[][] {
			{"rajan", "rajan@123","WebDriver","Hello","GoodMorning","Hi","Very Good Morning"},
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
	public void testMethod1(String userName, String password, String courseSearch, String titleThread, String text, String replytxt,String replytt  ) throws InterruptedException {
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn(); 
		ForumPOM.courseCatalog(); 
		ForumPOM.SearchCourse(courseSearch);
		ForumPOM.CouseSelect(); 
		ForumPOM.Selectcourse();
		ForumPOM.Courseinfo();
		ForumPOM.Fourmicon();
		ForumPOM.Fourmgrps();
		ForumPOM.grThread();
		ForumPOM.CreatThread();
		ForumPOM.titleThread(titleThread);
		ForumPOM.switchFrame();
		ForumPOM.titleText(text);
		ForumPOM.switchtoPOM();
		ForumPOM.SubmitThread();
		//ForumPOM.replytomsg();
		ForumPOM.replyMsgTitle(replytxt);
		ForumPOM.switchFrame1();
	    ForumPOM.replyMsg(replytt);
	    ForumPOM.switchtoPOM();
		ForumPOM.backreplypost();
		ForumPOM.Validating();
		//	Assignment1POM.Courseinfo();
	//	Assignment1POM.assignmentdetail();
	//	AssignmentPOM.courseClick1();
	//	Assignment1POM.Assignments();
	//	Assignment1POM.Uploaddoc();
	//	Assignment1POM.Pulldoc();
	//	Assignment1POM.fileuploadMsg();
	//	screenShot.captureScreenShot(userName);
	}

}
