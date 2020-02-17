package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TitlePage {
	
	
	WebDriver driver;
	
	public TitlePage(WebDriver driver) {
		
		this.driver=driver;
	}


	@FindBy(how=How.ID, using="title")
	WebElement title;
	
	@FindBy(how=How.ID, using="content")
	WebElement content;

	@FindBy(how=How.ID, using="save-post")
	WebElement saveDraft;

	
	public void fillUpTitle() {
		title.sendKeys("Plano Title");
		content.sendKeys("this is content about plano title");
		saveDraft.click();
		
	}
}

