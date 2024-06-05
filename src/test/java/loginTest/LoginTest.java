package loginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import loginPage.LoginPage;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		LoginPage loginPage = new LoginPage(driver);
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com");
		loginPage.enterUserId("kalesnehal2013@gmail.com");
		loginPage.enterPassword("WebData@123");
		Thread.sleep(20000);
		loginPage.clickOnLoginButton();

	}

}
