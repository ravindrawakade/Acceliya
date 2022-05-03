package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.DashbordPage;
import Page.LoginPage;
import Page.OrderPage;

public class OrderPageTest extends TestBase
{
     LoginPage  log;
     DashbordPage dash;
     OrderPage order;
	public OrderPageTest() throws IOException 
	{
		super();
		
	}

	@BeforeMethod
	public void setup () throws IOException, InterruptedException
	{
		initialization();
		log = new LoginPage();
		dash = new  DashbordPage();
		order = new OrderPage();
		log.loginZerodha();
		order.clickOrder();
		order.gtt();
		
	}
	@Test
	public  void valuesTest() throws InterruptedException, EncryptedDocumentException, IOException
	{
		order.values();
	}
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	
	
	
	
	
}
