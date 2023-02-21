package testcase;

import org.testng.annotations.Test;
import base.BaseClass;
import pageobject.HomePage;
import pageobject.SearchProductPage;



public class SearchProductTest extends BaseClass {
	@Test
	public void SearchandAdd() {
		
		HomePage homepage = new HomePage(driver);
		homepage.clickonUnitedStates();
		homepage.search(prop.getProperty("product"));
		SearchProductPage searchproduct = new SearchProductPage(driver);
		searchproduct.clickOnSearchButton();
		searchproduct.clickOnItem();
		searchproduct.clickAddtoCart();
		searchproduct.clickGotoCart();
		
	}

}
