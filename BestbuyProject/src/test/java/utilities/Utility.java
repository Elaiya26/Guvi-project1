package utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Utility  {
	
	public static WebDriver driver;
	public Properties prop;

	public WebDriver initializeBrowser() throws IOException   {

		prop = new Properties();

		String propPath = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties";
	

		FileInputStream fis = new FileInputStream(propPath);

		prop.load(fis);

		String browsername = prop.getProperty("browser");
		
		if (browsername.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browsername.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browsername.equals("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	public String generateNewEmailPopUp() {

		Date date = new Date();
		return date.toString().replace(" ", "_").replace(":", "_") + "@gmail.com";
	}
}
