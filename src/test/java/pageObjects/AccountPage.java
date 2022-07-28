package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

	WebDriver driver;

	public AccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = "a[title='Orders']")
	@CacheLookup
	WebElement btnOrders;

	@FindBy(how = How.CSS, using = "a[class='logout']")
	@CacheLookup
	WebElement btnLogout;

	public void clickbtnOrders() {
		btnOrders.click();
	}

	public void clickbtnLogout() {
		btnLogout.click();
	}

}
