package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageobject.BottomLinkPage;
import pageobject.HomePage;


public class BottomLinkTest extends BaseClass {
	
	@Test(priority=1)
	public void BottomLink1() {
		
		HomePage homepage = new HomePage(driver);
		homepage.clickonUnitedStates();
		BottomLinkPage bottomlink = new BottomLinkPage(driver);
		bottomlink.verifythedisplayofAffiliateprogram();
		Assert.assertTrue(bottomlink.verifythedisplayofAffiliateprogram(), "Affiliate Program");
	}
	@Test(priority=2)
	public void BottomLink2() {
		
		HomePage homepage = new HomePage(driver);
		homepage.clickonUnitedStates();
		BottomLinkPage bottomlink = new BottomLinkPage(driver);
		bottomlink.verifythedisplayofDevelopers();
		Assert.assertTrue(bottomlink.verifythedisplayofDevelopers(), "Developers");
	}
	@Test(priority=3)
	public void BottomLink3() {
		
		HomePage homepage = new HomePage(driver);
		homepage.clickonUnitedStates();
		BottomLinkPage bottomlink = new BottomLinkPage(driver);
		bottomlink.verifythedisplayofAdvertisewithus();
		Assert.assertTrue(bottomlink.verifythedisplayofAdvertisewithus(), "Advertise with Us");
	}
	@Test(priority=4)
	public void BottomLink4() {
		
		HomePage homepage = new HomePage(driver);
		homepage.clickonUnitedStates();
		BottomLinkPage bottomlink = new BottomLinkPage(driver);
		bottomlink.verifythedisplayofGiftCards();
		Assert.assertTrue(bottomlink.verifythedisplayofGiftCards(), "Gift Cards");
	}
	@Test(priority=5)
	public void BottomLink5() {
		
		HomePage homepage = new HomePage(driver);
		homepage.clickonUnitedStates();
		BottomLinkPage bottomlink = new BottomLinkPage(driver);
		bottomlink.verifythedisplayofBestBuyHealth();
		Assert.assertTrue(bottomlink.verifythedisplayofBestBuyHealth(), "Best Buy Health");
	}
	
	
}
