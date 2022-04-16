package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		}
	@FindBy (className ="login")
	WebElement registerlink;
	
	public void openRigstrationPage() {
		registerlink.click();
		
	}
	
		@FindBy (id="email_create")
	WebElement emailTxtBox;
	public void enterYourEmail() {
		emailTxtBox.sendKeys("ali.ali@vodafone.com");
	}
	
	
	
		@FindBy (id="SubmitCreate")
	WebElement createAnAccountBtn;
	public void createAccount () {
		createAnAccountBtn.click();
	}
	
	@FindBy (id="email_create")
	WebElement emailTxtBox2;
	public void enterYourInvalidEmail() {
		emailTxtBox2.sendKeys("ali.ali@vodafone");
	}
	
	@FindBy (id="SubmitCreate")
	WebElement createAnAccountBtn2;
	public void createAccount2 () {
		createAnAccountBtn2.click();
	}
	
}
