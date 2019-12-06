package com.training.high.testcases;


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
	import com.training.low.testcases.adminPOM;
	import com.training.pom.LoginPOM;
	import com.training.utility.DriverFactory;
	import com.training.utility.DriverNames;

	public class ELTC_074testingfor_invalidinputs {

		private static final String adminViewUsr = null;
		private WebDriver driver; 
		private String baseUrl; 
		private LoginPOM loginPOM; 
		private ELTC_073POM ELTC_073POM; 
		private static Properties properties; 
		private ScreenShot screenShot; 


		@DataProvider(name="inputs")
		public Object[][] getData() {
			return new Object[][] {
				{"admin", "admin@123"},
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
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			loginPOM = new LoginPOM(driver); 
			ELTC_073POM = new ELTC_073POM(driver);
			baseUrl = properties.getProperty("baseURL");
			screenShot = new ScreenShot(driver); // open the browser 
			driver.get(baseUrl);
		}
		
		@AfterMethod
		public void tearDown() throws Exception {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//	screenShot.captureScreenShot(adminViewUsr);
		//	driver.quit();
		}
		
		@Test(dataProvider="inputs")
		public void testMethod1(String userName, String password,String cc,String CourseCode,String Ttlenme, String coursenme) throws InterruptedException {
			loginPOM.sendUserName(userName);
			loginPOM.sendPassword(password);
			loginPOM.clickLoginBtn(); 
			ELTC_073POM.Administraton();
			ELTC_073POM.Coursecategories();
			ELTC_073POM.Addcategories();
			/*ELTC_073POM.Crscategorycode(cc);
			ELTC_073POM.CrscategoryNme(CourseCode);
			ELTC_073POM.selectRadio();
			ELTC_073POM.AddCourseSubmit();
			ELTC_073POM.AdminLink();
			ELTC_073POM.Creatcourse();
			ELTC_073POM.UpdtcourseTtl(Ttlenme);
			ELTC_073POM.CodeTxt(coursenme);
		    ELTC_073POM.Learngtype();
			ELTC_073POM.TeacherSelct();
		   	ELTC_073POM.LangSelect();
		    ELTC_073POM.CreatcourseSub();*/
			//screenShot.captureScreenShot(userName);
		}



	}




	

}
