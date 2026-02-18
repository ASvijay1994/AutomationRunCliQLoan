package test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_objects.Loginpage;
import test_base.BaseClass;

public class TC04Register_User_with_existing_email extends BaseClass {

	@Test
	public void VerifyRegisterUserwithExistingemail() {

		Loginpage loginpage = new Loginpage(driver);
		Assert.assertEquals(loginpage.LoginPageNewSignupTextField(), "New User Signup!");
		loginpage.enterNameField(p.getProperty("name"));
		loginpage.ExistingEmailaddressField(p.getProperty("Existingemail"));
		loginpage.clicksignupbutton();
		Assert.assertEquals(loginpage.errmsg(), "Email Address already exist!");

	}

}
