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

	//import com.training.generics.ScreenShot;
	import com.training.pom.LoginPOM;
	import com.training.utility.DriverFactory;
	import com.training.utility.DriverNames;

	public class ELTC_044_ForumPrereq {
		
		//private static final String Assignee = null;
		private WebDriver driver; 
		private String baseUrl; 
		private LoginPOM loginPOM; 
		private TeacherCreateAssignments TeacherCreateAssignments;
	    private ForurmPreReq ForurmPreReq; 
		private static Properties properties; 
		

		@DataProvider(name="inputs")
		public Object[][] getData() {
			return new Object[][] {
				{"Rashmi", "rashmi@123","WebDriver","group001","Link"},
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
			TeacherCreateAssignments = new TeacherCreateAssignments(driver);
			ForurmPreReq = new ForurmPreReq(driver);
			//login to "http://elearningm1.upskills.in/"
			baseUrl = properties.getProperty("baseURL");
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
		public void testMethod1(String userName, String password, String courseSearch,String Fname, String Flink ) throws InterruptedException {
			//Logging as a Teacher 
			loginPOM.sendUserName(userName);
			loginPOM.sendPassword(password);
			loginPOM.clickLoginBtn(); 
			//Searching for a course
			TeacherCreateAssignments.courseCatalog(); 
			TeacherCreateAssignments.SearchCourse(courseSearch);
			TeacherCreateAssignments.SearchCrse();
			TeacherCreateAssignments.BrowseCourse();
			TeacherCreateAssignments.CourseDetails();
			TeacherCreateAssignments.EditCousedtl();
			ForurmPreReq.EditForum();
			ForurmPreReq.Forumdetail1(Fname);
			ForurmPreReq.Forumdetail2(Flink);
			ForurmPreReq.Submit();
			//ForurmPreReq.fileuploadMsg();
		}


}
