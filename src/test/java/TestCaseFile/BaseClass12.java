package TestCaseFile;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import PageObjectM.Login2;
import UtilitiesFile.ReadConfig;

public class BaseClass12 {
	
	public static WebDriver driver;
	
    public static Logger Log2;
	
	 ReadConfig rc=new  ReadConfig();
	 String bro=rc.getBro();
	 String ulr1=rc.getUrl();
	 
	@BeforeSuite
	void BrowserLaunch() 
	{
		switch (bro.toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			
			break;
			
		case "edge":
			driver=new EdgeDriver();
			
			break;
		case "firefox":
			driver=new FirefoxDriver();
			
			break;

		default:
			driver=null;
			break;
		}
		Log2=LogManager.getLogger("Samsung");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
 public	void ScreenS() throws IOException 
	{
		TakesScreenshot tc=(TakesScreenshot)driver;
		File source=tc.getScreenshotAs(OutputType.FILE);
		File Dest=new File("C:\\Eclipse\\Samsung\\ScreenShot\\ss.png");
		FileUtils.copyFile(source, Dest);
	}
 @AfterSuite
 public void closeup() 
 {
	 driver.close();
	 driver.quit();
 }

}
