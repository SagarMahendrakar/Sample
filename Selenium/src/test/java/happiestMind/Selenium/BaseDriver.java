package happiestMind.Selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseDriver {

	public static WebDriver driver;
	public static String browser;

	@Parameters({ "browser" })
	@BeforeTest()
	public void initProperties(String browser) {
		browser = this.browser;
		
	}
	
	@BeforeTest()
	public void initdriver() {
		System.setProperty("", "");
			
	}
	
	

}
