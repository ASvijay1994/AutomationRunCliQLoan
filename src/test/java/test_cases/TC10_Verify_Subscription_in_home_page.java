package test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_objects.Homepage;
import test_base.BaseClass;

public class TC10_Verify_Subscription_in_home_page extends BaseClass{

	
	@Test
	public void verifysubscritpionpage() {
		
		 Homepage home = new Homepage(driver);
		 
/*
	        // Step 3: Verify home page
	        Assert.assertTrue(home.isHomePageVisible(), "Home page not visible");
	        
	        home.scrollToFooter();
	        
	        Assert.assertTrue(home.isSubscriptionVisible(), "Subscription text not visible");
	        
	        //step 4: enter email address  youremailfield()
	        home.youremailfield(p.getProperty("email"));
	        home.clickSubbtn();
	        home.isSubscriptionSuccessMessageVisible();
	        home.clickViewCart();
	        
	        
	        
	        */
	        
	        
	        
	}
	
	

	
	
	
}
