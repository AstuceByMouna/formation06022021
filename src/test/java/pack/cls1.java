package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class cls1 extends Base {
	@Test(dataProvider = "getdata")
	public void zTest1(String username, String password) {
		// TODO Auto-generated method stub
	driver.findElement(By.className("vvvv")).sendKeys(username);
	driver.findElement(By.cssSelector("input[type*='password']")).sendKeys(password);
	}
	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[3][2];
		// Combinaison 1
		data[0][0] = "user 1";
		data[0][1] = "12345671";
		// Combinaison 2
		data[1][0] = "user 2 ";
		data[1][1] = "password 2 ";
		// Combinaison 3
		data[2][0] = "user 3 ";
		data[2][1] = "password 3 ";
		return data;
	}

}
