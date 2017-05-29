package stepDefinition;

import common.AbstractTest;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import page.HomePage;
import page.LoginPage;
import page.PageFactory;
import page.RegisterPage;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
public class RegisterSteps extends AbstractTest {

	@Given("^I am on ZingPoll website (.+)$")
	public void i_am_on_ZingPoll_website(String browser) {
		driver = openBrowser(browser, "https://www.zingpoll.com/");
		homePage = PageFactory.getHomePage(driver);

	}

	@Given("^I open ZingPoll website (.+)$")
    public void i_open_zingpoll_website_something(String browser){
		driver = openBrowser(browser, "https://www.zingpoll.com/");
		homePage = PageFactory.getHomePage(driver);

    }
	
	@Given("^I click the SignIn button$")
	public void i_click_the_SignIn_button() {
		homePage.clickSignInTitle();
	}

	@Then("^The SignIn form should be shown$")
	public void the_SignIn_form_should_be_shown() {
		homePage.isSignInPopupDisplay();
	}

	@Then("^I click on NewUser radiobox$")
	public void i_click_on_NewUser_radiobox() {
		loginPage = PageFactory.getLoginPage(driver);
		loginPage.clickOnNewUserRadiobox();
	}

	@When("^I enter fullname (.+) and email (.+) and password (.+) and confirmPassword (.+)$")
	public void i_enter_fullname_and_email_and_password_and_confirmPassword(String fullName, String email,
			String passowrd, String repassword) {
		registerPage = PageFactory.getRegisterPage(driver);
		registerPage.typeIntoFullName(fullName);
		registerPage.typeIntoEmail(email);
		registerPage.typeIntoPassword(passowrd);
		registerPage.typeIntoRePassword(repassword);
	}

	@When("^I click Register button$")
	public void i_click_Login_button() {
		registerPage.clickOnRegisterButton();
	}

	
	@Then("^I verify the fullname error message (.+)$")
    public void i_verify_the_fullname_error_message(String errorMsg){
		registerPage.isFullNameErrorMessageDisplay(fullNameErrorMsg);
    }
	
	@Then("^I verify the fullname error message (.+)$")
    public void i_verify_the_fullname_error_message2(String errorMsg){
		registerPage.isFullNameErrorMessageDisplay(fullNameErrorMsg);
    }
	
	@And("^I verify the email error message (.+)$")
	public void i_verify_the_email_error_message(String errorMsg){
		registerPage.isEmailErrorMessageDisplay(emailErrorMsg);
	}

//	@Then("^I verify the email error message (.+)$")
//	public void i_verify_the_email_error_message2(String errorMsg){
//		registerPage.isEmailErrorMessageDisplay(emailErrorMsg);
//	}
	
	@And("^I verify the email error message (.+)$")
    public void i_verify_the_email_error_message_something(String errorMsg) {
		registerPage.isEmailErrorMessageDisplay(emailErrorMsg);
    }

	
	@And("^I verify the password error message (.+)$")
	public void i_verify_the_password_error_message(String errorMsg){
		registerPage.isPasswordErrorMessageDisplay(passwordErrorMsg);
	}

	@And("^I verify the password error message (.+)$")
    public void i_verify_the_password_error_message2(String errorMsg){
		registerPage.isPasswordErrorMessageDisplay(passwordErrorMsg);
    }
	@And("^I verify the confirm password error message (.+)$")
	public void i_verify_the_confirm_password_error_message(String errorMsg){
		registerPage.isConfirmPasswordErrorMessageDisplay(rePasswordErrorMsg);
	}

	@And("^I verify the confirm password error message (.+)$")
    public void i_verify_the_confirm_password_error_message2(String errorMsg) {
		registerPage.isConfirmPasswordErrorMessageDisplay(rePasswordErrorMsg);
    }
	
	@And("^I verify the agree error message (.+)$")
	public void i_verify_the_agree_error_message(String errorMsg){
		registerPage.isAgreeCheckboxErrorMessageDisplay(agreeErrorMsg);
	}
	
    @And("^I verify the agree error message (.+)$")
    public void i_verify_the_agree_error_message2(String errorMsg){
    	registerPage.isAgreeCheckboxErrorMessageDisplay(agreeErrorMsg);
    }
    
    @And("^I check the email error message (.+)$")
    public void i_check_the_email_error_message(String errormessage){
    	registerPage.isEmailErrorMessageDisplay(emailErrorMsg);
    }
    

	@After
	public void closeBrowser() {
		closeBrowser(driver);
	}

	public WebDriver driver;
	public HomePage homePage;
	public RegisterPage registerPage;
	public LoginPage loginPage;
	private String fullNameErrorMsg, emailErrorMsg, passwordErrorMsg, rePasswordErrorMsg, agreeErrorMsg;
}
