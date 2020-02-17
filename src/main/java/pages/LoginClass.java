package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginClass {
	WebDriver driver;
	public LoginClass(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.ID,using="user_login")
			WebElement userName;
	@FindBy(how=How.ID,using="user_pass")
	WebElement password;
	
	@FindBy(how=How.NAME,using="wp-submit")
	WebElement login;
	
	public void login() {
		userName.sendKeys("opensourcecms");
		password.sendKeys("opensourcecms");
		login.click();
	}
	
}

