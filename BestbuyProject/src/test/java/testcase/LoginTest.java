package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BaseClass;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.ToGetSelectedProductpage;



public class LoginTest extends BaseClass {
	
	@Test(priority=1)
	public void validLoginCredentials() throws IOException {
		
		HomePage homepage = new HomePage(driver);
		homepage.clickonUnitedStates();
		homepage.clickOnMyAccountMenu();
		homepage.SignIn();
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterEmailAddress(prop.getProperty("email"));
		loginpage.enterPassword(prop.getProperty("password"));
		loginpage.clickOnLoginButton();
	}
	@Test(priority=2)
    public void InvalidLoginCredentials() throws IOException {
		
		HomePage homepage = new HomePage(driver);
		homepage.clickonUnitedStates();
		homepage.clickOnMyAccountMenu();
		homepage.SignIn();
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterEmailAddress(prop.getProperty("email"));
		loginpage.enterPassword(prop.getProperty("invalidpassword"));
		loginpage.clickOnLoginButton();
		ToGetSelectedProductpage Select = new ToGetSelectedProductpage(driver);
		Select.clickonMenu();
	}

}
