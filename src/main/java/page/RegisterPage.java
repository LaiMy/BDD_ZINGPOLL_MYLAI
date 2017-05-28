package page;

import org.openqa.selenium.WebDriver;
import interfaces.RegisterPageUI;

public class RegisterPage extends AbstractPage{
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void typeIntoFullName(String fullName) {
		waitForControl(driver, RegisterPageUI.FULLNAME_TEXTBOX, timeWait);
		type(driver, RegisterPageUI.FULLNAME_TEXTBOX, fullName);
		sleep(2);
	}
	
	public void typeIntoEmail(String email) {
		waitForControl(driver, RegisterPageUI.EMAIL_TEXTBOX, timeWait);
		type(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
		sleep(2);
	}

	public void typeIntoPassword(String password) {
		waitForControl(driver, RegisterPageUI.PASSWORD_TEXTBOX, timeWait);
		type(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);
		sleep(2);
	}
	
	public void typeIntoRePassword(String rePassword) {
		waitForControl(driver, RegisterPageUI.RE_PASSWORD_TEXTBOX, timeWait);
		type(driver, RegisterPageUI.RE_PASSWORD_TEXTBOX, rePassword);
		sleep(2);
	}

	public void clickOnAgreeCheckbox() {
		waitForControl(driver, RegisterPageUI.AGREE_CHECKBOX_ID, timeWait);
		click(driver, RegisterPageUI.AGREE_CHECKBOX_ID);
	}
	
	
	public void clickOnRegisterButton() {
		waitForControl(driver, RegisterPageUI.REGISTER_BUTTON, timeWait);
		click(driver, RegisterPageUI.REGISTER_BUTTON);
	}
	
	public void isFullNameErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, RegisterPageUI.FULLNAME_ERROR_MSG, errorMsg, timeWait);
		isControlDisplayed(driver, RegisterPageUI.FULLNAME_ERROR_MSG, errorMsg);
	}
	
	public void isEmailErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, RegisterPageUI.EMAIL_ERROR_MSG, errorMsg, timeWait);
		isControlDisplayed(driver, RegisterPageUI.EMAIL_ERROR_MSG, errorMsg);
	}

	public void isPasswordErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, RegisterPageUI.PASSWORD_ERROR_MSG, errorMsg, timeWait);
		isControlDisplayed(driver, RegisterPageUI.PASSWORD_ERROR_MSG, errorMsg);
	}
	
	public void isConfirmPasswordErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, RegisterPageUI.REPASSWORD_ERROR_MSG, errorMsg, timeWait);
		isControlDisplayed(driver, RegisterPageUI.REPASSWORD_ERROR_MSG, errorMsg);
	}
	
	public void isAgreeCheckboxErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, RegisterPageUI.AGREE_ERROR_MSG, errorMsg, timeWait);
		isControlDisplayed(driver, RegisterPageUI.AGREE_ERROR_MSG, errorMsg);
	}
	private WebDriver driver;
}
