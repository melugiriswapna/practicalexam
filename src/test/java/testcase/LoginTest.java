package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginClass;
import utill.BrowserFactory;

public class LoginTest {
	@Test
	public void demoLogin() {
		
		WebDriver driver = BrowserFactory.startBrowser();
		
		LoginClass logintowebsite=PageFactory.initElements(driver, LoginClass.class);
		
		logintowebsite.login();
		
		driver.close();
		driver.quit();
		
	}

}

