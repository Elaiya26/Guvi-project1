package testcase;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;

public class BrokenLinkTest extends BaseClass{
	
	@Test
	public void Brokenlinktest() {
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("No of links  = " + link.size());
		
		for (int i = 0; i < link.size(); i++) {
			WebElement Ele1 = link.get(i);
			String url = Ele1.getAttribute("href");
			verifyLink(url);
		
	}
		driver.quit();

}

	private void verifyLink(String linkurl) {
		try {
			URL link = new URL(linkurl);
			HttpURLConnection huc = (HttpURLConnection) link.openConnection();
			huc.setConnectTimeout(5000);
			huc.connect();

			if (huc.getResponseCode() >= 404) {
				System.out.println(linkurl + " - " + huc.getResponseMessage() + " is a broken link");
			} else {
				System.out.println(linkurl + " - " + huc.getResponseMessage());
			}
		}

		catch (Exception e) {

		}
	}
	
		
		
	}
