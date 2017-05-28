//package stepDefinition;
//
//import org.junit.runner.RunWith;
//import org.openqa.selenium.WebDriver;
//
//import common.AbstractTest;
//import cucumber.api.java.After;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import cucumber.api.junit.Cucumber;
//import page.HomePage;
//import page.PageFactory;
//
//@RunWith(Cucumber.class)
//public class DefinitionSteps extends AbstractTest {
//
//	@Given("^I am on ZingPoll website (.+)$")
//	public void iAmOnZingPollWebsite(String browser) {
//		driver = openBrowser(browser, "https://www.zingpoll.com/");
//		homePage = PageFactory.getHomePage(driver);
//	}
//
//	@When("^I enter email (.+) and password (.+)$")
//	public void iEnterEmailSomethingAndPasswordSomething(String email, String password) {
//		homePage.typeIntoEmail(email);
//		homePage.typeIntoPassword(password);
//	}
//	
//	@When("^I type email \"(.*?)\" and password \"(.*?)\"$")
//	public void i_type_email_and_password(String email, String password) {
//		homePage.typeIntoEmail(email);
//		homePage.typeIntoPassword(password);
//	}
//
//	@Then("^The SignIn form should be shown$")
//	public void theSignInFormShouldBeShown() {
//		homePage.isSignInPopupDisplay();
//	}
//
//	@Then("^I verify the failure message (.+)$")
//	public void iVerifyTheFailureMessageSomething(String errorMessage) {
//		homePage.isEmailNotRegisteredErrorMessageDisplay(errorMessage);
//	}
//
//	@And("^I click the SignIn button$")
//	public void iClickTheSignInButton() {
//		homePage.clickSignInTitle();
//	}
//
//	@And("^I click Login button$")
//	public void iClickLoginButton() {
//		homePage.clickSignInButton();
//	}
//
//	@After
//	public void closeBrowser() {
//		closeBrowser(driver);
//	}
//
//	public WebDriver driver;
//	public HomePage homePage;
//	
//
//}
