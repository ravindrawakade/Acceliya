package Page;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase
{
    //Object Repository
	@FindBy(xpath="//input[@id='userid']") private WebElement userIdTextbox;
	@FindBy(xpath="//input[@id='password']") private WebElement passwordTextbox;
	@FindBy(xpath="//button[@type='submit']") private WebElement  loginButton;
	@FindBy(xpath="//img[@alt='Kite']") private WebElement kiteLogo;
	@FindBy(xpath="//img[@alt='Zerodha']") private WebElement zerodhaLogo;
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	
	
	//Constructor 
	public LoginPage()  throws IOException
	{ 
		PageFactory.initElements(driver,this);
	}
	//Methods
	public String verifyLoginPageTitle()
	{
		return driver.getTitle();
	}
	public boolean verifyKiteLogo()
	{
		return kiteLogo.isDisplayed();
	}
	
	public boolean verifyZerodhaLogo()
	{
		return zerodhaLogo.isDisplayed();
	}
	
	public void loginZerodha() throws InterruptedException
	{
		userIdTextbox.sendKeys(pro.getProperty("userid"));
	   //  Thread.sleep(2000);
		passwordTextbox.sendKeys(pro.getProperty("password"));
	  //   Thread.sleep(2000);
		loginButton.click();
	  //   Thread.sleep(2000);
		pin.sendKeys(pro.getProperty("pin"));
	 // 	Thread.sleep(2000);
		loginButton.click();
	  //   Thread.sleep(5000);
	}
	
	
}
