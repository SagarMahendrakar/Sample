package happiestMind.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class A {

	public static void main(String[] args) {
		
		System.out.println(getLocator("Link=asdcc"));
		
		

	}

	public static int getLocator(String locator) {
		/*
		 * String[] locators = locator.split("=");
		 * 
		 * String locatorType=locators[0]; String locator=locators[1];
		 */
		if (locator.startsWith("//")) {
			return 1;
		} else if (locator.startsWith("#")) {
			return 1;
		} else if ((locator).toLowerCase().contains("link=")) {
			System.out.println(locator.substring(5));
			return 1;
		}
		return 0;

	}

}
