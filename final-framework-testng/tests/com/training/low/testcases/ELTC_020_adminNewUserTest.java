package com.training.low.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.medium.adminNUPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import common.Assert;

public class ELTC_020_adminNewUserTest {
	private WebDriver driver; 
	private String baseUrl; 
	private LoginPOM loginPOM; 
	private String  ELTC_020_adminNewuser; 
	private adminNUPOM adminNUPOM; 
	private static Properties properties; 
	private ScreenShot screenShot; 

	@DataProvider(name="inputs")//actual inputs passing 
	public Object[][] getData() {
		return new Object[][] {
			{"admin", "admin@123","manzoor","mehadi","manzoor@gmail.com","9876543210","manzoor","manzoor"},
		};
	}

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		//initialize properties file
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		//load data from properties file 
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		//initialize the driver
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		//initialize POMfile 
		loginPOM = new LoginPOM(driver); 
		adminNUPOM = new adminNUPOM(driver); 
		//login to "http://elearningm1.upskills.in/"
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); // open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		screenShot.captureScreenShot(ELTC_020_adminNewuser);
		driver.quit();//closing the driver
			
	}
	
	@Test(dataProvider="inputs")//passing the inputs thru reference
	public void testMethod1(String userName, String passwordlogin,String firstName, String lastName, String email,String phone , String newUserName ,String upassword) throws Exception {
		//login as admin
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(passwordlogin);
		loginPOM.clickLoginBtn(); 
		//Admin creating a new user
		adminNUPOM.addUser();
		adminNUPOM.sendfirstname(firstName);
		adminNUPOM.sendlastname(lastName);
		adminNUPOM.sendemail(email);
		adminNUPOM.sendphone(phone);
		adminNUPOM.senduName(newUserName);
		adminNUPOM.selectRadio();
		adminNUPOM.sendpWord(upassword);
		adminNUPOM.sendAdd();
		adminNUPOM.trainer();
		//adminNUPOM.validating();
	
		}
	    




}
