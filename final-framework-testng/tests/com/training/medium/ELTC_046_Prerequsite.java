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
	import com.training.medium.TeacherCreateAssignments;	
	import com.training.utility.DriverFactory;
	import com.training.utility.DriverNames;

	public class ELTC_046_Prerequsite {
		
		//private static final String Assignee = null;
		private WebDriver driver; 
		private String baseUrl; 
		private LoginPOM loginPOM; 
		private Pre46_projectCrt Pre46_projectCrt;
		private TeacherCreateAssignments TeacherCreateAssignments;
	//	private Assignment1POM Assignment1POM; 
		private static Properties properties; 
		

		@DataProvider(name="inputs")
		public Object[][] getData() {
			return new Object[][] {
				{"Rashmi", "rashmi@123","WebDriver"},
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
			Pre46_projectCrt = new Pre46_projectCrt(driver);
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
		public void testMethod1(String userName, String password, String courseSearch) throws InterruptedException {
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
			Pre46_projectCrt.ProjectIcon();
			Pre46_projectCrt.ProjecteditIcon();
			Pre46_projectCrt.Projecteseletcon();
			Pre46_projectCrt.Projecteditcon();
			Pre46_projectCrt.Projectassigne();
			Pre46_projectCrt.Projectreg();
			Pre46_projectCrt.fileuploadMsg();
		}
}
