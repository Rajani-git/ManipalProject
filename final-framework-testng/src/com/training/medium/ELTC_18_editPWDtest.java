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
import com.training.medium.editPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_18_editPWDtest {
	private WebDriver driver; 
	private String baseUrl; 
	private LoginPOM loginPOM; 
	private editPOM editPOM; 
	private static Properties properties; 
	private ScreenShot screenShot; 


	@DataProvider(name="inputs")
	public Object[][] getData() {
		return new Object[][] {
			{"rajan", "rajam@123","rajam@123","rajan@123","rajan@123"},			
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
		editPOM = new editPOM(driver); 
		
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); // open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
	}
	
	@Test(dataProvider="inputs")
	public void testMethod1(String userName, String password ,String passwordOld , String passwordnw,String passwordconf) throws InterruptedException {
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn(); 
		editPOM.ProfClick();
		editPOM.editProf();
		editPOM.sendPassword(passwordOld);
		editPOM.sendpasswordnw(passwordnw);
		editPOM.sendpasswordconf(passwordconf);
		editPOM.confPwdClick();
		screenShot.captureScreenShot(userName);
	}

}
