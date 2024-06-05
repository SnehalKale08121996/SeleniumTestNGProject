package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basePage.BaseClassTest;
import loginPage.LoginPage;

public class LoginTest2 {
	LoginPage loginPage;
	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = BaseClassTest.setup();
		loginPage = new LoginPage(driver);
		loginPage.goToURL();
	}

	@Test
	public void login() throws InterruptedException {

		loginPage.enterUserId("kalesnehal2013@gmail.com");
		loginPage.enterPassword("WebData@123");
		loginPage.clickOnLoginButton();
	}

}
