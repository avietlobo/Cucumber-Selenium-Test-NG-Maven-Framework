package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import helper.Logger.LoggerHelper;

public class LoginPage extends BasePage {
	
	private final Logger log = LoggerHelper.getLogger(LoginPage.class);

	@FindBy(how = How.CSS, using = "#userid")
	private WebElement userId;
	
	@FindBy(how = How.CSS, using = "#signin-continue-btn")
	private WebElement continueBtn;
	
	@FindBy(how = How.CSS, using = "#pass")
	private WebElement password;
	
	@FindBy(how = How.CSS, using = "#sgnBt")
	private WebElement signIn;
	
	
	public LoginPage(WebDriver driver) {
	        super(driver);
	 }
	
	public void signIn() throws InterruptedException{
		userId.sendKeys("testerlifealways@gmail.com");
		log.info("testerlifealways@gmail.com");
		continueBtn.click();
		Thread.sleep(1000);
		password.sendKeys("nsdl@12345");
		signIn.click();
		
	}

}
