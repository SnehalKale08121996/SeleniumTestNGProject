package basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTest {

	WebDriver driver;

	public BaseClassTest(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void goToURL() {
		driver.get("https://www.facebook.com");
	}

	public static WebDriver setup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
