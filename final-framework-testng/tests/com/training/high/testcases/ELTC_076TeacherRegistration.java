

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

	public class ELTC_076TeacherRegistration {

		private static final String adminViewUsr = null;
		private WebDriver driver; 
		private String baseUrl; 
		private LoginPOM loginPOM; 
		private TeacherRegistrationPOM TeacherRegistrationPOM; 
		private static Properties properties; 
		private ScreenShot screenShot; 


		@DataProvider(name="inputs")
		public Object[][] getData() {
			return new Object[][] {
				{"teacher", "teacher@123","rajani.pappu@gmail.com","reema","reema123","782323322"},
			};
		}

		@BeforeClass
		public static void setUpBeforeClass() throws IOException {
			properties = new Properties();
			//location of the properties file 
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
			String fileName=properties.getProperty(".\\resources\\TestData_ELCT76.xlsx");
		}

		@BeforeMethod
		public void setUp() throws Exception {
			//loding the chrome browser
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			//initializinf POM files 
			loginPOM = new LoginPOM(driver); 
			TeacherRegistrationPOM = new TeacherRegistrationPOM(driver);
			
			baseUrl = properties.getProperty("baseURL");
			screenShot = new ScreenShot(driver); // open the browser 
			driver.get(baseUrl);
		}
		
		@AfterMethod
		public void tearDown() throws Exception {
			//impilcit wait
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//	screenShot.captureScreenShot(adminViewUsr);
		//	driver.quit();
		}
		
		@Test(dataProvider="inputs")
		public void testMethod1(String FName, String LName,String mail,String uName,String Password1,String pno) throws InterruptedException {
			TeacherRegistrationPOM.SignUp();
			
			TeacherRegistrationPOM.selectRadio();
			TeacherRegistrationPOM.FirstName(FName);
			TeacherRegistrationPOM.LastName(LName);
			TeacherRegistrationPOM.Email(mail);
			TeacherRegistrationPOM.UserName(uName);
			TeacherRegistrationPOM.Password1(Password1);
			TeacherRegistrationPOM.Password2(Password1);
			TeacherRegistrationPOM.PhoneNumber(pno);
			TeacherRegistrationPOM.Languageselectbox();
			TeacherRegistrationPOM.Languageselect();
			TeacherRegistrationPOM.Submit();
			//TeacherRegistrationPOM.validation();
			}








	



}


