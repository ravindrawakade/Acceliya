package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.LoginPage;

public class ProirityTest {
	public class LoginPageTest extends TestBase
	{
		 public LoginPageTest() throws IOException 
		 {
			super();
		 }


		LoginPage login;

		@BeforeMethod
		public void setup() throws IOException 
		{
			initialization();
			login = new LoginPage();
		}
		
		
		
		@Test (enabled = true, invocationCount = 3)
		public  void verifyLoginPageTitleTest()
		{
			String expected = "Kite - Zerodha's fast and elegant flagship trading platform";
			String actual = login.verifyLoginPageTitle();
			Assert.assertEquals(actual,expected);
			Reporter.log("Title Is = "+ actual);
			
		}
		
		@Test (enabled = false)
		public void verifyKiteLogoTest() 
		{
			boolean value = login.verifyKiteLogo();
			Assert.assertEquals(value, true);
			Reporter.log("Kite Logo = " + value);
			
		}
		
		@Test (enabled = false)
		
		public void verifyZerodhaLogoTest() 
		{
		  boolean value = login.verifyZerodhaLogo();
		  Assert.assertEquals(value, true);
		 Reporter.log("Zerodha Logo = " +value);
		}
		@Test (enabled = true, timeOut = 500)
		public void loginZerodhaTest() throws InterruptedException 
		{
			login.loginZerodha();
			
		}
		
		
		@AfterMethod
		public void exit()
		{
			driver.close();
		}
		

	}
}
