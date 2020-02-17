package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginClass;
import pages.TitlePage;
import utill.BrowserFactory;

public class TitleTest {

	@Test
	public void saveDraft() throws InterruptedException {

		WebDriver driver = BrowserFactory.startBrowser();
		LoginClass logintowebsite = PageFactory.initElements(driver, LoginClass.class);

		logintowebsite.login();
		Thread.sleep(3000);
		TitlePage saveTitle = PageFactory.initElements(driver, TitlePage.class);

		saveTitle.fillUpTitle();

		driver.close();
		driver.quit();

	}

}
