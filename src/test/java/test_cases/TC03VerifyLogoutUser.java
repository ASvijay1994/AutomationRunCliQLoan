package test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_objects.Loginpage;
import test_base.BaseClass;

public class TC03VerifyLogoutUser extends BaseClass{
	
	@Test
	public void verifyLoginFunctionality() {
	Loginpage loginpage = new Loginpage(driver);
	
	// Perform login steps
    loginpage.enterEmail(p.getProperty("email"));
    loginpage.enterPassword(p.getProperty("password"));
    loginpage.clickloginbutton();
    Assert.assertEquals(loginpage.UserNameHomePageDisplay(), "Logged in as Vijay Pawar");
}
	@Test
	public void verifyLogoutFunctionality() {
		Loginpage loginpage = new Loginpage(driver);
		loginpage.clicklogouttbutton();
		Assert.assertEquals(loginpage.UserLoginPageTextFieldDisplay(), "Login to your account");
	}
	
}