package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage {

	public Loginpage(WebDriver driver) {
		super(driver);
	}

// Locators ---

	@FindBy(xpath = " //input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1hjktx4\"]")
	WebElement loginEmailField;

	@FindBy(xpath = "//input[@id=\"password\"]")
	WebElement loginPasswordField;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement loginButton;
	
	@FindBy(xpath = "//input[@placeholder=\"Email OTP\"]")
	WebElement otpEmail;
	
	@FindBy(xpath = "//input[@placeholder=\"Phone OTP\"]")
	WebElement otpPhone;
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement clickverifybtn;

	@FindBy(xpath = "//li[10]//a[1]")
	WebElement userNameHomePage;

	@FindBy(xpath = "\r\n" + "//p[normalize-space()='Your email or password is incorrect!']")
	WebElement userIncorrectText;

	@FindBy(xpath = "\r\n" + "(//a[@style='color:brown;'])[1]")
	WebElement LogoutButton;

	@FindBy(xpath = "\r\n" + "//h2[normalize-space()='Login to your account']")
	WebElement LoginPageTextField;

	// New signup page locator
	@FindBy(xpath = "\r\n" + "\r\n" + "//h2[normalize-space()='New User Signup!']")
	WebElement LoginPageNewSignupTextField;
	// name -
	@FindBy(xpath = "//input[@placeholder=\"Name\"]")
	WebElement NameField;
	// ExistingEmailaddress
	@FindBy(xpath = "(//input[@placeholder=\"Email Address\"])[2]")
	WebElement ExistingEmailaddressField;

	// signupbtn -//button[normalize-space()='Signup']
	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	WebElement SignupBtn;
	// Email Address already exist!
	@FindBy(xpath = "//p[text()='Email Address already exist!']")
	WebElement errmsg;

// methods---

	public void enterEmail(String email) {

		loginEmailField.sendKeys(email);

	}

	public void enterPassword(String password) {

		loginPasswordField.sendKeys(password);

	}

	public void clickloginbutton() {
		waitForClickable(loginButton).click();
	}
	
	public void otpEmail(String otpemail) {

		otpEmail.sendKeys(otpemail);

	}
	
	public void otpPhone(String otpphone) {

		otpPhone.sendKeys(otpphone);

	}
	
	//locator name : clickverifybtn
	
	public void clickverifybutton() {

		waitForClickable(clickverifybtn).click();;

	}
	

	public String UserNameHomePageDisplay() {
		return waitForVisibility(userNameHomePage).getText();
	}

	public String UserIncorrectTextDisplay() {
		return waitForVisibility(userIncorrectText).getText();
	}

	public void clicklogouttbutton() {
		waitForClickable(LogoutButton).click();
	}

	public String UserLoginPageTextFieldDisplay() {
		return waitForVisibility(LoginPageTextField).getText();
	}

	// LoginPageNewSignupTextField
	public String LoginPageNewSignupTextField() {
		return waitForVisibility(LoginPageNewSignupTextField).getText();
	}

	public void enterNameField(String name) {

		NameField.sendKeys(name);

	}

//ExistingEmailaddressField
	public void ExistingEmailaddressField(String Existingemail) {

		ExistingEmailaddressField.sendKeys(Existingemail);

	}

//SignupBtn

	public void clicksignupbutton() {
		waitForClickable(SignupBtn).click();
	}

//verify error msg //p[normalize-space()='Email Address already exist!']
	public String errmsg() {
		return waitForVisibility(errmsg).getText();
	}

}
