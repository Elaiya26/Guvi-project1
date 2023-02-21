package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class ToGetSelectedProductpage extends Utility {
	WebDriver driver;

	public  ToGetSelectedProductpage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[@class='c-button-unstyled hamburger-menu-button']")
	WebElement Menu;

	@FindBy(xpath = "(//button[@class='c-button-unstyled hamburger-menu-flyout-list-item '])[6]")
	WebElement Audio;

	@FindBy(xpath = "//button[@data-id='node-537']")
	WebElement Headphones;

	@FindBy(xpath = "//a[@data-lid='ubr_au_hed_wless']")
	WebElement WirelessHeadphones;

	@FindBy(linkText="Bose - QuietComfort Earbuds II True Wireless Noise Cancelling In-Ear Headphones - Triple Black")
	WebElement product;

	@FindBy(xpath = "//button[@data-sku-id='6512575']")
	WebElement AddToCart;

	@FindBy(xpath = "//a[@class='c-button c-button-secondary c-button-sm c-button-block ']")
	WebElement GotoCart;

	@FindBy(xpath = "//button[@data-track='Checkout - Top']")
	WebElement CheckOut;

	@FindBy(xpath = "//button[@fdprocessedid='dsa34u']")
	WebElement ContinueAsGuest;

	@FindBy(xpath = "//input[@id='user.emailAddress']")
	WebElement EmailAddress;

	@FindBy(xpath = "//input[@id='user.phone']")
	WebElement PhoneNumber;

	@FindBy(xpath = "//span[contains(text(),'Payment')]")
	WebElement ContinueToPaymentinformation;

	@FindBy(xpath = "//input[@name='number']")
	WebElement CardNumber;

	@FindBy(xpath = "//button[@data-track='Place your Order - Contact Card']")
	WebElement PlaceYourOrder;

	public void clickonMenu() {

		Menu.click();
	}

	public void clickonAudio() {

		Audio.click();
	}

	public void clickonHeadPhones() {

		Headphones.click();
	}

	public void clickonWirelessHeadphones() {

		WirelessHeadphones.click();
	}

	public void clickonproduct() {

		product.click();
	}

	public void clickonAddtoCart() {

		AddToCart.click();
	}

	public void clickonGotoCart() {

		GotoCart.click();
	}

	public void clickonCheckout() {

		CheckOut.click();
	}

	public void clickonContinueasGuest() {

		ContinueAsGuest.click();
	}

	public void enterEmailAddress(String emailText) {

		EmailAddress.sendKeys(emailText);

	}

	public void enterPhoneNumber(String numberText) {

		PhoneNumber.sendKeys(numberText);

	}

	public void clickonContinueTopayment() {

		ContinueToPaymentinformation.click();
	}

	public void enterCardNumber(String card) {

		CardNumber.sendKeys(card);
	}

	public void clickonPlaceYourOrder() {

		PlaceYourOrder.click();
	}

}
