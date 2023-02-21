package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.ToGetSelectedProductpage;

public class SelectedProductTest extends BaseClass {
	@Test
	public void selectandadditemtest() {

		HomePage homepage = new HomePage(driver);
		homepage.clickonUnitedStates();
		ToGetSelectedProductpage selectedproduct = new ToGetSelectedProductpage(driver);
		selectedproduct.clickonMenu();
		selectedproduct.clickonAudio();
		selectedproduct.clickonHeadPhones();
		selectedproduct.clickonWirelessHeadphones();
		selectedproduct.clickonproduct();
		selectedproduct.clickonAddtoCart();
		selectedproduct.clickonGotoCart();
		selectedproduct.clickonCheckout();
		LoginPage login = new LoginPage(driver);
		login.enterEmailAddress(prop.getProperty("email"));
		login.enterPassword(prop.getProperty("password"));
		login.clickOnLoginButton();
		selectedproduct.clickonContinueasGuest();
		selectedproduct.enterEmailAddress(prop.getProperty("email"));
		selectedproduct.enterPhoneNumber(prop.getProperty("phone"));
		selectedproduct.clickonContinueTopayment();
		selectedproduct.enterCardNumber(prop.getProperty("cardnumber"));
		selectedproduct.clickonPlaceYourOrder();
	}

}
