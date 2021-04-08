package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import helper.Logger.LoggerHelper;

public class HomePage extends BasePage {
	
	private final Logger log = LoggerHelper.getLogger(HomePage.class);

	@FindBy(how = How.CSS, using = "#gh-ug")
	public WebElement signInButton;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void goToHome() {
		log.info("Go To Home Page");
		driver.get("https://www.ebay.com/");
	}

	public void goToLoginPage() {
		signInButton.click();
	}

}
