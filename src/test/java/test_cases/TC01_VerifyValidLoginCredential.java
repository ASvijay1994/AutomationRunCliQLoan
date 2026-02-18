package test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_objects.Loginpage;
import test_base.BaseClass;

public class TC01_VerifyValidLoginCredential extends BaseClass {

	@Test
	
	public void verifyLoginFunctionality() {
		
		Loginpage loginpage = new Loginpage(driver);
		
		loginpage.enterEmail(p.getProperty("email"));
		loginpage.enterPassword(p.getProperty("password"));
		loginpage.clickloginbutton();
		loginpage.otpEmail(p.getProperty("otpemail"));
		loginpage.otpPhone(p.getProperty("otpmobile"));
		loginpage.clickverifybutton();
		Assert.assertEquals(p.getProperty("welcomename"), "Welcome Lorraine !");

		
	}
	
	
	
	
	
	
	
}
