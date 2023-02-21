package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class BottomLinkPage extends Utility {
	WebDriver driver;
	
	public  BottomLinkPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
      }
	@FindBy(linkText="Affiliate Program")
	WebElement AffiliateProgram;
	
	@FindBy(linkText="Developers")
	WebElement Developers;
	
	@FindBy(linkText="Advertise with Us")
	WebElement Advertisewithus;
	
	@FindBy(linkText="Gift Cards")
	WebElement GiftCards;
	
	@FindBy(linkText="Best Buy Health")
	WebElement BestBuyHealth;
	
	 public boolean verifythedisplayofAffiliateprogram() {
			
	   return AffiliateProgram.isDisplayed();
	 }
	
    public boolean verifythedisplayofDevelopers() {
		
    	return Developers.isDisplayed();
	}
	
    public boolean verifythedisplayofAdvertisewithus() {
		
    	return Advertisewithus.isDisplayed();
	}
    
    public boolean verifythedisplayofGiftCards() {
		
    	return GiftCards.isDisplayed();
	}
    
    
    public boolean verifythedisplayofBestBuyHealth() {
		
    	return BestBuyHealth.isDisplayed();
	} 
}