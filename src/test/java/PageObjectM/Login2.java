package PageObjectM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2 {
	
	WebDriver LD;
	
	public Login2(WebDriver d) 
	{
		LD=d;
		PageFactory.initElements(LD, this);
	}
	@FindBy (id="username") WebElement User_Name;
	@FindBy (id="password") WebElement PW;
	@FindBy (id="submit") WebElement S;
	
	
	public void User_name(String usern) 
	{
		User_Name.sendKeys(usern);
	}
	public void Pass_word(String passw) 
	{
		PW.sendKeys(passw);
	}
	public void Submit() 
	{
		S.click();
	}
	
}
