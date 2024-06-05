package loginPage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePage.BaseClassTest;

public class LoginPage extends BaseClassTest {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
//		this.driver = driver;
//		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "email")
	WebElement enterUserId;

	/**
	 * Method to enter login ID
	 * 
	 * @throws IOException
	 */
	public void enterUserId(String userId) {
		enterUserId.sendKeys(userId);
	}

	@FindBy(how = How.ID, using = "pass")
	WebElement password;

	/**
	 * Method to enter Password
	 * 
	 * @throws IOException
	 */
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	@FindBy(how = How.XPATH, using = "//*[@name='login']")
	WebElement clickOnLoginButton;

	/**
	 * Method to click on login Button
	 * 
	 * @throws IOException
	 */
	public void clickOnLoginButton() {
		clickOnLoginButton.click();
	}

}
