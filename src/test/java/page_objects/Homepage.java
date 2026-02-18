package page_objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Homepage extends BasePage {

    public Homepage(WebDriver driver) {
        super(driver);
    }

    // Products button
    @FindBy(xpath = "//a[@href='/products']")
    WebElement productsBtn;

    // First product add to cart
    @FindBy(xpath = "(//a[contains(@class,'add-to-cart')])[1]")
    WebElement firstAddToCart;

    // Second product add to cart
    @FindBy(xpath = "(//a[contains(@class,'add-to-cart')])[2]")
    WebElement secondAddToCart;

    // Continue Shopping button
    @FindBy(xpath = "//button[text()='Continue Shopping']")
    WebElement continueShopping;

    // View Cart
    @FindBy(xpath = "//a[@href='/view_cart']")
    WebElement viewCart;

    // Cart Modal
    @FindBy(id = "cartModal")
    WebElement cartModal;

    // Cart Prices
    @FindBy(xpath = "(//td[@class='cart_total']/p)[1]")
    WebElement cartFirstPrice;

    @FindBy(xpath = "(//td[@class='cart_total']/p)[2]")
    WebElement cartSecondPrice;

    // Home logo
    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    WebElement homeLogo;
    
    //contactus  //a[text()=' Contact us']
    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    WebElement contactus;

    // ---------------- METHODS -------------------

    public boolean isHomePageVisible() {
        return waitForVisible(homeLogo).isDisplayed();
    }

    public void clickProducts() {
        click(productsBtn);
    }

    public void addFirstProductToCart() {
        scrollToElement(firstAddToCart);
        js.executeScript("arguments[0].click();", firstAddToCart);
        waitForCartModal();
        click(continueShopping);
    }

    public void addSecondProductToCart() {
        scrollToElement(secondAddToCart);
        js.executeScript("arguments[0].click();", secondAddToCart);
        waitForCartModal();
        click(viewCart);
    }

    public void waitForCartModal() {
        wait.until(ExpectedConditions.visibilityOf(cartModal));
    }

    public String getFirstPrice() {
        return waitForVisible(cartFirstPrice).getText();
    }

    public String getSecondPrice() {
        return waitForVisible(cartSecondPrice).getText();
    }

	public void clickHome() {
		// TODO Auto-generated method stub
		click(homeLogo);
	}

	public void clickContactUs() {
		// TODO Auto-generated method stub
		click(contactus);
	}
}
