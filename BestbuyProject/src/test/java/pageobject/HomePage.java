package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class HomePage extends Utility {
	WebDriver driver;

	public  HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//img[@alt='United States'])[1]")
	WebElement ClickonUnitedStates;

	@FindBy(xpath = "//input[@class='search-input']")
	WebElement Search;

	@FindBy(xpath = "//button[@data-lid='hdr_signin']")
	WebElement myAccountMenu;

	@FindBy(xpath = "//a[@href='/identity/global/createAccount']")
	WebElement createAccount;

	@FindBy(xpath = "//a[@data-lid='ubr_mby_signin_b']")
	WebElement signIn;

	public void clickonUnitedStates() {

		ClickonUnitedStates.click();
	}

	public void search(String searchtext) {

		Search.sendKeys(searchtext);
	}

	public void clickOnMyAccountMenu() {

		myAccountMenu.click();
	}

	public void createAccount() {

		createAccount.click();
	}

	public void SignIn() {

		signIn.click();
	}

}
