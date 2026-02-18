package page_objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.reactivex.rxjava3.functions.Action;

public class BasePage {
	
	    protected WebDriver driver;
	    protected WebDriverWait wait;
	    protected JavascriptExecutor js;
	    protected Actions action;
	
	public BasePage (WebDriver driver) 
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // ✅ FIX: initialize wait
		action = new Actions(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void hoverElement(WebElement element) {
	  
	    action.moveToElement(element).perform();
	    
	}
	
	public String getPageTitle() {
        return driver.getTitle();
    }
	
    //scroll down by pixcel
	public void scrollBy(int x, int y)
	{
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+ x +","+ y +")");
	}
	
//	scroll into element
	public void scrollToElement(WebElement element)
	{
	js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	// centre scroll
	
	/*
	public void scrollToElement(WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);
	}
*/
	/*
	public void killAds() {
	    try {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript(
	                "var ad = document.getElementById('ad_position_box');" +
	                "if(ad){ad.remove();}"
	        );
	    } catch (Exception e) {
	        System.out.println("No ads found");
	    }
	}
*/
	public void killAds() {
	    try {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript(
	            "document.querySelectorAll(" +
	            "'iframe[src*=\"doubleclick\"], iframe[id^=\"aswift\"], div[id^=\"ad_\"], div[id*=\"ad_position\"], div[class*=\"ads\"], div[id*=\"google_ads\"]'" +
	            ").forEach(e => e.remove());"
	        );
	    } catch (Exception e) {
	        System.out.println("Ads not found");
	    }
	}
	
	
    protected WebElement waitForVisibility(WebElement el) {
        return wait.until(ExpectedConditions.visibilityOf(el));
    }

    protected WebElement waitForClickable(WebElement el) {
        return wait.until(ExpectedConditions.elementToBeClickable(el));
    }

    protected boolean waitForInvisibility(WebElement homePageText) {
        return wait.until(ExpectedConditions.invisibilityOf(homePageText));
    }

    protected boolean isElementDisplayedSafe(WebElement el) {
        try {
            return el.isDisplayed();
        } catch (NoSuchElementException | StaleElementReferenceException e) {
            return false;
        }
    }
 // By locator + waitType ("visible" or "present")
    public String getElementText(By locator, String waitType) {
        WebElement element;
        if ("visible".equalsIgnoreCase(waitType)) {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } 
        else if ("present".equalsIgnoreCase(waitType)) {
            element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } else {
            throw new IllegalArgumentException("Invalid waitType: " + waitType);
        }
        return element.getText().trim();
    }
    
    
    // Convenience: WebElement version using visibility (for stable elements)
    public String getElementText(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element)).getText().trim();
    }
    
    
    public WebElement waitForTextToBePresent(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(driver -> !element.getText().trim().isEmpty());
        return element;
    }
    
    protected void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected void type(WebElement element, String value) {
        wait.until(ExpectedConditions.visibilityOf(element)).clear();
        element.sendKeys(value);
    }

    protected String getText(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }

    protected boolean isDisplayed(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }
    
    protected WebElement waitForVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    
    
    
    
    
    
    
}


    
    
    
    
    
    
    
    

	
	



