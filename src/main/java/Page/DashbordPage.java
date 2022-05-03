 package Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashbordPage extends TestBase
{
    @FindBy(xpath="//span[@class='nickname']") private WebElement nickname;
    @FindBy(xpath="//span[@class='user-id']") public WebElement userid;
    @FindBy(xpath="//h4[text()='Ravindra Kalyanrao Wakade']") private WebElement username;
    @FindBy(xpath="//div[text()='ravindra.wakade77@gmail.com']") private WebElement emailid;
	
	
	
	public DashbordPage()  throws IOException
	{
		PageFactory.initElements(driver,this);
	}
	
	public String verifyNickname() 
	{
		return nickname.getText();
	}
	
	public String  verifyUserId()
	{
		return userid.getText();
		
	}
	
	public String verifyUserName()
	{
		return username.getText();	
	}
	
	public String verifyEmailId()
	{
		return emailid.getText();
	}
	
	
	
}
