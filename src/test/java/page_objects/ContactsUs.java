package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsUs extends BasePage {

	public ContactsUs(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	   @FindBy(xpath = "//h2[text()='Get In Touch']")
	    WebElement getInTouchText;
	
	
	   @FindBy(xpath  = "//input[@placeholder='Name']")
	    WebElement nameField;
	   
	   @FindBy(xpath  = "(//input[@class=\"form-control\"])[2]")
	    WebElement emailField;

	    @FindBy(xpath  = "(//input[@class=\"form-control\"])[3]")
	    WebElement subjectField;

	    @FindBy(xpath  = "//textarea[@id=\"message\"]")
	    WebElement messageField;

	    @FindBy(xpath  = "//input[@name='upload_file']")
	    WebElement uploadFile;

	    @FindBy(xpath  = "//input[@name='submit']")
	    WebElement submitBtn;
	    
	    @FindBy(xpath = "(//div[@style=\"display: block;\"])[1]")
	    WebElement successMsg;
	
	
	    public boolean isGetInTouchVisible() {
	        return getInTouchText.isDisplayed();
	    }

	    public void fillContactForm(String name, String email, String subject, String message) {
	        nameField.sendKeys(name);
	        emailField.sendKeys(email);
	        subjectField.sendKeys(subject);
	        messageField.sendKeys(message);
	    }

	    public void uploadFile(String filePath) {
	        uploadFile.sendKeys(filePath);
	    }

	    public void clickSubmit() {
	        submitBtn.click();
	    }

	    public void acceptAlert() {
	        driver.switchTo().alert().accept();
	    }

	    public boolean isSuccessMessageVisible() {
	        return successMsg.isDisplayed();
	    }
	    
	
	

}
