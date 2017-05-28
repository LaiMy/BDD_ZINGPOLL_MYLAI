package page;

import org.openqa.selenium.WebDriver;

import interfaces.LoginPageUI;

public class LoginPage extends AbstractPage{
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickOnNewUserRadiobox() {
		waitForControl(driver, LoginPageUI.NEWUSER_RADIOBOX, timeWait);
		click(driver, LoginPageUI.NEWUSER_RADIOBOX);
		sleep(2);
	}
	
	
	public void typeIntoEmail(String email) {
		waitForControl(driver, LoginPageUI.EMAIL_TEXTBOX, timeWait);
		type(driver, LoginPageUI.EMAIL_TEXTBOX, email);
		sleep(2);
	}

	public void typeIntoPassword(String password) {
		waitForControl(driver, LoginPageUI.PASSWORD_TEXTBOX, timeWait);
		type(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
		sleep(2);
	}

	public void clickSignInButton() {
		waitForControl(driver, LoginPageUI.LOGIN_BUTTON, timeWait);
		click(driver, LoginPageUI.LOGIN_BUTTON);
	}

	public void isEmailNotRegisteredErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, LoginPageUI.ERROR_NOT_REGISTERED_MESSAGE, errorMsg, timeWait);
		isControlDisplayed(driver, LoginPageUI.ERROR_NOT_REGISTERED_MESSAGE, errorMsg);
	}

	public void isPasswordIncorrectErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, LoginPageUI.PASSWORD_INCORECT_ERROR_MESSAGE, errorMsg, timeWait);
		isControlDisplayed(driver, LoginPageUI.PASSWORD_INCORECT_ERROR_MESSAGE, errorMsg);
	}

	public void isProfileNameDisplay(String profileName) {
		waitForControl(driver, LoginPageUI.PROFILE_NAME_TITLE, profileName, timeWait);
		isControlDisplayed(driver, LoginPageUI.PROFILE_NAME_TITLE, profileName);
	}
	
	private WebDriver driver;
}
