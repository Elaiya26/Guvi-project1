package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pageobject.HomePage;
import pageobject.SignUpPage;


public class SignUpTest extends BaseClass {
	@Test
	public void registrationfields() {
		
		HomePage homepage = new HomePage(driver);
		homepage.clickonUnitedStates();
		homepage.clickOnMyAccountMenu();
		homepage.createAccount();
		SignUpPage signuppage = new SignUpPage(driver);
		signuppage.enterFirstName(prop.getProperty("firstname"));
		signuppage.enterLastName(prop.getProperty("lastname"));
		signuppage.enterEmailAdd(generateNewEmailPopUp());
		signuppage.enterPassword(prop.getProperty("password"));
		signuppage.enterPasswordConfirm(prop.getProperty("password"));
		signuppage.enterTelephone(prop.getProperty("telephone"));
		signuppage.CreateAccountcnfButton();

}
}
