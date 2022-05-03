package Base;



import Utility.Util1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase 
  {
  public static WebDriver driver;
  public static Properties pro;
 
  public TestBase () throws IOException
   {
	 pro = new Properties();
	 FileInputStream file = new FileInputStream("C:\\Users\\Admin\\newWorkspace\\FrameworkZerodha\\Config\\Config.properties");
	 pro.load(file);
  }
  
  public static void initialization() throws IOException  
  {
	  ChromeOptions opt = new ChromeOptions();
	  opt.addArguments("--disable-notifications");
	  
	    
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\newWorkspace\\FrameworkZerodha\\chromedriver.exe");
	  driver = new ChromeDriver(opt);
	  driver.manage().window().maximize();
	  
	  driver.get(pro.getProperty("url"));
	 // driver.get("https://kite.zerodha.com/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }
}
