package ai.dalalstreet.apps.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.dalalstreet.apps.TestBase.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='email']")
	private WebElement Email_txt;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement Password_txt;

	@FindBy(xpath = "//button[text()='Log In']")
	private WebElement LoginBtn;

	public void EnterEmailId(String mail) {
		Email_txt.sendKeys(mail);
	}

	public void EnterPassword(String pass) {
		Password_txt.sendKeys(pass);
	}

	public void ClickonLoginBtn() {
		LoginBtn.click();
	}

}
