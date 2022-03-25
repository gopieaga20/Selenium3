package org.fbstepdef;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.report.Hooks;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
	BaseClass bc = new BaseClass();

	
	public Stepdef(Class<Hooks> driver) {
		driver = Hooks.class;
	}

	@Given("User Launch the Facebook Web Application")
	public void user_Launch_the_Facebook_Web_Application() {
		
		bc.getDriver();
		
		bc.loadUrl("https://www.facebook.com/");
		bc.maximize();

	}

	@When("User Enters the Valid UserName and Valid Password")
	public void user_Enters_the_Valid_UserName_and_Valid_Password() throws IOException {

		WebElement txtuserName = bc.findLocaterById("email");
		String data = bc.getData("FBTask", 1, 0);
		bc.insertValue(txtuserName, data);

		WebElement TxtPassword = bc.findLocaterByName("pass");
		String Password = bc.getData("FBTask", 1, 1);
		bc.insertValue(TxtPassword, Password);

	}

	@When("User clicks thee Login button")
	public void user_clicks_thee_Login_button() {
		WebElement loginbtn = bc.findLocaterByName("login");
		bc.click(loginbtn);

	}

	@Then("User Enters into the  HomePage is Displayed")
	public void user_Enters_into_the_HomePage_is_Displayed() {
		System.out.println("Valid");

	}

}
