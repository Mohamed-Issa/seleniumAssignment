package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = "a[class='login']")
	@CacheLookup
	WebElement btnSignin;

	@FindBy(how = How.ID, using = "email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(how = How.ID, using = "passwd")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(how = How.ID, using = "SubmitLogin")
	@CacheLookup
	WebElement btnSubmit;

	public void clickbtnSignIn() {
		btnSignin.click();
	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void clickSubmitLogin() {
		btnSubmit.click();
	}

}
