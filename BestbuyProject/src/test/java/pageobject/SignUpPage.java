package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class SignUpPage extends Utility {
	public WebDriver driver;

	public SignUpPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement firstnameloc;

	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement lastnameloc;

	@FindBy(xpath = "//input[@name='email']")
	public WebElement emailaddressloc;

	@FindBy(xpath = "//input[@type='password']")
	public WebElement Passwordloc;

	@FindBy(xpath = "//input[@name='reenterPassword']")
	WebElement ConfirmPasswordloc;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement PhoneNumber;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement CreateanAccountButton;

	public void enterFirstName(String firstNameText) {

		firstnameloc.sendKeys(firstNameText);

	}

	public void enterLastName(String lastNameText) {

		lastnameloc.sendKeys(lastNameText);

	}

	public void enterEmailAdd(String emailAddressText) {

		emailaddressloc.sendKeys(emailAddressText);

	}

	public void enterPassword(String passwordText) {

		Passwordloc.sendKeys(passwordText);

	}

	public void enterPasswordConfirm(String passwordText) {

		ConfirmPasswordloc.sendKeys(passwordText);

	}

	public void enterTelephone(String telephoneText) {

		PhoneNumber.sendKeys(telephoneText);

	}

	public void CreateAccountcnfButton() {

		CreateanAccountButton.click();
	}
}
