package StepDifination;

import org.openqa.selenium.edge.EdgeDriver;

import Pgae_Object_MF.Login22;
import Pgae_Object_MF.Logout21;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDifination12 extends BaseClassF {
	
	@Given("user launch edge browser")
	public void user_launch_edge_browser() 
	{
	   driver =new EdgeDriver();
	   LG=new Login22(driver);
	   LG1=new Logout21(driver);
	}

	@When("user open url {string}")
	public void user_open_url(String url) 
	{
	    driver.get(url);
	}

	@When("user enter the username {string} and password {string}")
	public void user_enter_the_username_and_password(String usern, String passw) 
	{
	  LG.User_name(usern);
	  LG.Pass_word(passw);
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() 
	{
	 LG.Submit12();  
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String ExpTitle )
	{
		
		String ActTitle=driver.getTitle();
	    Assert.assertEquals(ActTitle, ExpTitle);
	}
	@When("Click on logout button")
	public void click_on_logout_button() {
	   LG1.Log_out1();
	}

	@Then("close browser")
	public void close_browser() 
	{
	   driver.close();
	}


}
