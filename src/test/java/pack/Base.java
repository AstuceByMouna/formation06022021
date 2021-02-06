package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base {

	public static WebDriver driver;
	@BeforeMethod
	public void avanttest() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://fr-fr.facebook.com/");

		driver.manage().window().maximize();
	}
	
	
}
