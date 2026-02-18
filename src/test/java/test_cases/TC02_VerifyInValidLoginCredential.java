package test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.DataProvdersForLogin;
import page_objects.Loginpage;
import test_base.BaseClass;


public class TC02_VerifyInValidLoginCredential extends BaseClass  {

	
	@Test(
			  dataProvider = "invalidUsers",
			  dataProviderClass = DataProvdersForLogin.class,
			  groups={"datadriven","Master"}
			)
	public void verifyLoginFunctionality(String email, String password) {
		
		Loginpage loginpage = new Loginpage(driver);
		
		loginpage.enterEmail(p.getProperty("InValidEmail"));
		loginpage.enterPassword(p.getProperty("InValidPassword"));
		loginpage.clickloginbutton();
		Assert.assertEquals(loginpage.UserIncorrectTextDisplay(), "Your email or password is incorrect");

		
	}
	
	
	
	
}
