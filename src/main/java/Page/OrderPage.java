package Page;




import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class OrderPage extends TestBase
{
	@FindBy(xpath="(//span[text()='Orders'])[1]") private WebElement orderLink;
	@FindBy(xpath="//span[text()='GTT']") private WebElement gttLink;
	@FindBy(xpath="//button[@type='button']") private WebElement newGTT;
	@FindBy(xpath="(//input[@type='text'])[2]") private WebElement searchBox;
	@FindBy(xpath="(//span[@class='tradingsymbol'])[1]") private WebElement infyResult;
	@FindBy(xpath="//button[text()='Create GTT ']") private WebElement createGttBtn;
	@FindBy(xpath="//input[@label='Trigger price']") private WebElement triggerPriceTxtBox;
	@FindBy(xpath="//input[@label='Qty.']") private WebElement qtyTxtBox;
	@FindBy(xpath="//input[@label='Price']") private WebElement priceTxtBox;
	@FindBy(xpath="//div[text()='Place']") private WebElement placeBtn;

	public OrderPage() throws IOException 
	{
		super();
		PageFactory.initElements(driver, this);
		
	}
	public void  clickOrder()
	{
         orderLink.click();
	}
	
	public void gtt()
	{
		gttLink.click();
		
	}
	
	public void values() throws InterruptedException, EncryptedDocumentException, IOException
	{
		newGTT.click();
		searchBox.sendKeys(Utility.Util1.readExcel(0, 0));
		Thread.sleep(3000);
		infyResult.click();
		Thread.sleep(3000);
		createGttBtn.click();
		Thread.sleep(3000);
		triggerPriceTxtBox.clear();
		Thread.sleep(3000);
		triggerPriceTxtBox.sendKeys(Utility.Util1.readExcel(0, 1));
		Thread.sleep(3000);
		qtyTxtBox.clear();
		Thread.sleep(3000);
		qtyTxtBox.sendKeys(Utility.Util1.readExcel(0, 2));
		Thread.sleep(3000);
		priceTxtBox.clear();
		Thread.sleep(3000);
		priceTxtBox.sendKeys(Utility.Util1.readExcel(0, 3));
	
	}
	
	
	
	
}
