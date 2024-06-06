package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basePage.BaseClassTest;
import loginPage.LoginPage;

public class SimpleBillingLoginTest {

	LoginPage loginPage;
	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = BaseClassTest.setup();
		loginPage = new LoginPage(driver);
		loginPage.goToSBURL();
	}

	@Test
	public void login() throws InterruptedException {

		loginPage.enterSBUserId("admin");
		loginPage.entersbpassword("WebData@123");
		loginPage.clickOnSBLoginButton();
	}

}
