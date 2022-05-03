package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.DashbordPage;
import Page.LoginPage;

public class DashbordTest extends TestBase

{
	public DashbordTest() throws IOException 
	{
		super();	
	}

	 DashbordPage dash;
	 LoginPage login ;
	
	@BeforeMethod
	public void setup() throws InterruptedException, IOException
	{
		initialization();
		
		 dash = new DashbordPage();
	     login = new LoginPage();
	     login.loginZerodha();
	     dash.userid.click();
	     
	}
	
	@Test
	public void verifyNicknameTest() throws InterruptedException
	{
	 String value =	dash.verifyNickname();
	 Assert.assertEquals(value, "Ravindra");
	 Reporter.log("NickName Is " + value);
	}
	@Test
	public void  verifyUserIdTest()
	{
		String value = dash.verifyUserId();
		Assert.assertEquals(value, "RMD729");
		Reporter.log("UserId Is " +value);
	}
	@Test
	public void verifyUserNameTest()
	{
		String value = dash.verifyUserName();
		Assert.assertEquals(value, "Ravindra Kalyanrao Wakade");
		Reporter.log("User Name Is "+value);
	}
	@Test
	public void  verifyEmailIdTest()
	{
		String value = dash.verifyEmailId();
		Assert.assertEquals(value, "ravindra.wakade77@gmail.com");
		Reporter.log("EmailId Is "+value );
	}

	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	
}
