package test_cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page_objects.Homepage;
import page_objects.Loginpage;
import test_base.BaseClass;

public final class TC12AddProductsinCart extends BaseClass {
/*
	Homepage home;
	Loginpage loginpage;

	// Step 3: Verify home page"Home page not visible"
	/*
	@BeforeMethod
	public void clearCart() {
	    driver.manage().deleteAllCookies();
	}

*/
/*
	@Test
	public void addProductsinCart() {

		home = new Homepage(driver);
		loginpage = new Loginpage(driver);

		loginpage.enterEmail(p.getProperty("email"));
		loginpage.enterPassword(p.getProperty("password"));
		loginpage.clickloginbutton();
		Assert.assertEquals(loginpage.UserNameHomePageDisplay(), "Logged in as Vijay");
		// Kill Google Ads popup
		killAds();

		Assert.assertTrue(home.isHomePageVisible(), "Home page not visible");
		// step 3 click on products button
		home.clickProducts();
		killAds();
		home.hoverToFirstProduct();
		//driver.switchTo().defaultContent(); // back to main page
	
		home.clickAddToCart();
		home.waitForAddToCartModal();
		home.clickcontinueshoppingbutton();
		killAds();
		home.hoverToSecondProduct();
		
		home.clickAddToCart();
	
		home.waitForAddToCartModal();
		home.clickViewCart();
		Assert.assertEquals(home.CartFirstPrice(), p.getProperty("FirstPrice"));
		Assert.assertEquals(home.CartSecondPrice(), p.getProperty("SecondPrice"));
*/
	}


