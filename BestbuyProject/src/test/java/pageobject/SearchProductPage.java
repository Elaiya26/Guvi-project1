package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class SearchProductPage extends Utility {
	WebDriver driver;

	public SearchProductPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchbutton;

	@FindBy(linkText = "Bose - QuietComfort Earbuds II True Wireless Noise Cancelling In-Ear Headphones - Triple Black")
	WebElement clickItem;

	@FindBy(xpath = "//button[@data-sku-id='6512575']")
	WebElement AddtoCart;

	@FindBy(xpath = "//a[@data-lid='hdr_carticon']")
	WebElement GotoCart;

	public void clickOnSearchButton() {

		searchbutton.click();
	}

	public void clickOnItem() {

		clickItem.click();
	}

	public void clickAddtoCart() {

		AddtoCart.click();
	}

	public void clickGotoCart() {

		GotoCart.click();
	}

}
