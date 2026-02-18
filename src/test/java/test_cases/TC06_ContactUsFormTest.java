package test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_objects.ContactsUs;
import page_objects.Homepage;
import test_base.BaseClass;

public class TC06_ContactUsFormTest extends BaseClass {

    @Test
    public void verifyContactUsForm() {

        Homepage home = new Homepage(driver);
        ContactsUs contact = new ContactsUs(driver);

        // Step 3: Verify home page
        Assert.assertTrue(home.isHomePageVisible(), "Home page not visible");

        // Step 4: Click Contact Us
        home.clickContactUs();

        // Step 5: Verify GET IN TOUCH
        Assert.assertTrue(contact.isGetInTouchVisible(), "Get In Touch not visible");

        // Step 6: Enter details
        contact.fillContactForm(
                "Vijay",
                "vijay@test.com",
                "Automation Test",
                "This is a test message"
        );

        // Step 7: Upload file
        contact.uploadFile(System.getProperty("user.dir") + "\\testdata\\Bug catch Up By Automation raised Manually2.pdf");

        // Step 8: Submit
        contact.clickSubmit();

        // Step 9: Handle alert
        contact.acceptAlert();

        // Step 10: Verify success message
        Assert.assertTrue(
                contact.isSuccessMessageVisible(),
                "Success message not visible"
        );

        // Step 11: Click Home & verify
        home.clickHome();
        Assert.assertTrue(home.isHomePageVisible(), "Home page not visible after return");
    }
}
