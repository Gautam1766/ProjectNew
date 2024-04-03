package PageObjectM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	WebDriver ldriver;
	
	public Logout(WebDriver c) 
	{
		ldriver=c;
		PageFactory.initElements(ldriver, this);
	}
	@FindBy(xpath="//a[text()='Log out']") WebElement LG;
	
	public void Log() 
	{
		LG.click();
	}

}
