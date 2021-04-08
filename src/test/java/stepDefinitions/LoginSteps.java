package stepDefinitions;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import enums.DriverType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pages.HomePage;
import pages.LoginPage;
import pages.PageGenerator;
import webdriver.DriverFactory;

@RunWith(Cucumber.class)
public class LoginSteps {

	private WebDriver driver;
	private PageGenerator page;
	private HomePage hPage;
	private LoginPage lPage;
	

	@Given("I am on the Ebay Home Page")
	public void i_am_on_the_ebay_home_page() {
		driver = DriverFactory.getDriver(DriverType.CHROME);
		page = new PageGenerator(driver);
		hPage=page.GetInstance(HomePage.class);
		hPage.goToHome();

	}

	@When("I enter the username and password")
	public void i_enter_the_testerlifealways_gmail_com_and_nsdl() throws InterruptedException {
//		hPage.goToLoginPage();
//		lPage=page.GetInstance(LoginPage.class);
//		lPage.signIn();
	}

	@Then("I should be able to login successfully")
	public void i_should_be_able_to_login_successfully() {
//		String name=hPage.signInButton.getText();
//		Assert.assertTrue(name.contains("Aviet"));
		driver.quit();
	}

}
