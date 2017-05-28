package interfaces;

public class RegisterPageUI {
	public static final String FULLNAME_TEXTBOX = ".//*[@id='reg-userName']";
	public static final String EMAIL_TEXTBOX = ".//*[@id='reg-email']";
	public static final String PASSWORD_TEXTBOX = ".//*[@id='reg-password']";
	public static final String RE_PASSWORD_TEXTBOX = ".//*[@id='reg-retype-password']";
	public static final String AGREE_CHECKBOX_ID = ".//*[@id='reg-agree-cb']";
	public static final String REGISTER_BUTTON = ".//*[@id='reg-submit']";
	
	// fullName error message
	public static final String FULLNAME_ERROR_MSG = "//small[@data-bv-for ='registerName' and contains(text(),'%s')]";
	// email error message
	public static final String EMAIL_ERROR_MSG = "//small[@data-bv-for ='registerEmail' and contains(text(),'%s')]";
	// password
	public static final String PASSWORD_ERROR_MSG = "//small[@data-bv-for ='registerPassword' and contains(text(),'%s')]";
	// re-enter password
	public static final String REPASSWORD_ERROR_MSG = "//small[@data-bv-for ='registerConfirmPassword' and contains(text(),'%s')]";
	// Agree checkbox
	public static final String AGREE_ERROR_MSG = "//small[@data-bv-for ='checkboxTerm' and contains(text(),'Please agree with the term!')]";
	

}
