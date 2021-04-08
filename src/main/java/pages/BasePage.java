package pages;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Logger.LoggerHelper;

public class BasePage extends PageGenerator {
	
	private final Logger log = LoggerHelper.getLogger(BasePage.class);

	public BasePage(WebDriver driver) {
		super(driver);
	}
	

	WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));

	// Click Method by using JAVA Generics (You can use both By or Webelement)
	public <T> void click(T elementAttr) {
		if (elementAttr.getClass().getName().contains("By")) {
			driver.findElement((By) elementAttr).click();
		} else {
			((WebElement) elementAttr).click();
		}
	}

}
