package happiestMind.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class BaseSelenium extends BaseDriver {

	public void openUrl(String url) {
		driver.get(url);
	}

	public void click(String locator) {

		getLocator(locator).click();

	}

	public void enterText(String locator, String text) {

		getLocator(locator).sendKeys(text);

	}

	public void clear(String locator) {
		getLocator(locator).clear();
	}

	public WebElement getLocator(String locator) {

		try {
			if (locator.startsWith("//")) {
				return driver.findElement(By.xpath(locator));
			} else if (locator.startsWith("#")) {
				return driver.findElement(By.cssSelector(locator));
			} else if ((locator).toLowerCase().contains("link=")) {
				return driver.findElement(By.linkText(locator.substring(5)));
			} else if ((locator).toLowerCase().contains("partiallink=")) {
				return driver.findElement(By.linkText(locator.substring(5)));
			}
		} catch (NoSuchElementException e) {

		}

		return null;

	}

}
