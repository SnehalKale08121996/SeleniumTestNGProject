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

	public void goToFaceBookURL() {
		driver.get("https://www.facebook.com");
	}
	
	public void goToSBURL() {
		driver.get("http://139.84.162.246:8080/login/auth");
	}


	public static WebDriver setup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	

}
