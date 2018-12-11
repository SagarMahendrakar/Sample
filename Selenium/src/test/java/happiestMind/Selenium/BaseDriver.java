package happiestMind.Selenium;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseDriver {

	public static WebDriver driver;
	public static String browser;
	public static String env;

	@Parameters({ "browser", "env" })
	@BeforeSuite()
	public void initProperties(String browser, String env) {
		this.browser = browser;
		this.env = env;

	}

	@BeforeTest()
	public void initdriver() {
		System.out.println(browser);
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/BrowserExecutables/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("", "");
			driver = new FirefoxDriver();
		}

		driver.manage().deleteAllCookies();
		driver.get(env);

	}

}
