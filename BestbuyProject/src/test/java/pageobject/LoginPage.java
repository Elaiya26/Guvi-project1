package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class LoginPage extends Utility {
	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@type='email']")
	 WebElement emailAddressloc;

	@FindBy(xpath = "//input[@type='password']")
	 WebElement passwordloc;

	@FindBy(xpath = "//button[@type='submit']")
	 WebElement loginbutton;

	public void enterEmailAddress(String emailText) {

		emailAddressloc.sendKeys(emailText);

	}

	public void enterPassword(String passwordText) {

		passwordloc.sendKeys(passwordText);
	}

	public void enterInvalidPassword(String passwordText) {

		passwordloc.sendKeys(passwordText);
	}

	public void clickOnLoginButton() {

		loginbutton.click();
	}

}
