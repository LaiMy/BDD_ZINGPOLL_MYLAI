package interfaces;

public class LoginPageUI {

	//public static final String NEWUSER_RADIOBOX = "//*[@id='newUser']";
	public static final String NEWUSER_RADIOBOX = ".//span[text()='New user']";
	public static final String SIGN_IN_TITLE = "//*[@id='Loginform']";
	public static final String SIGN_IN_POPUP = "//*[@id='Login']//div[@class='modal-content']";
	public static final String ERROR_NOT_REGISTERED_MESSAGE = "//*[@id='loginMessage' and contains(text(),'%s')]";
	public static final String PASSWORD_INCORECT_ERROR_MESSAGE = "//*[@id='loginMessageFail' and contains(text(),'%s')]";
	public static final String EMAIL_TEXTBOX = "//*[@id='loginEmail']";
	public static final String PASSWORD_TEXTBOX = "//*[@id='loginPassword']";
	public static final String LOGIN_BUTTON = "//*[@id='button-login']";
	public static final String PROFILE_NAME_TITLE = "//div[@class='username' and contains(text(),'%s')]";
	
}
