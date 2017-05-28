package page;

import org.openqa.selenium.WebDriver;

public class PageFactory {

	public static HomePage getHomePage(WebDriver driver) {
		return new HomePage(driver);
	}
	
	public static LoginPage getLoginPage(WebDriver driver) {
		return new LoginPage(driver);
	}
	
	public static RegisterPage getRegisterPage(WebDriver driver) {
		return new RegisterPage(driver);
	}

	
	
	
	
}
