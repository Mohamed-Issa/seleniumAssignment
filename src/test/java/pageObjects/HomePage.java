package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = "a[title='Women']")
	@CacheLookup
	WebElement btnWomen;

	@FindBy(how = How.CSS, using = "a[title='Blouses']")
	@CacheLookup
	WebElement btnBlouses;

	@FindBy(how = How.CSS, using = "span[class='available-now']")
	@CacheLookup
	WebElement stock;

	@FindBy(how = How.CSS, using = "a[title='Add to cart']")
	@CacheLookup
	WebElement btnAddToCard;

	@FindBy(how = How.CSS, using = "a[class='btn btn-default button button-medium']")
	@CacheLookup
	WebElement btnCheckout;

	@FindBy(how = How.CSS, using = "a[class='button btn btn-default standard-checkout button-medium']")
	@CacheLookup
	WebElement ProceedFromSummary;

	@FindBy(how = How.CSS, using = "button[class='button btn btn-default button-medium']")
	@CacheLookup
	WebElement ProceedFromAddress;

	@FindBy(how = How.CSS, using = "button[class='button btn btn-default standard-checkout button-medium']")
	@CacheLookup
	WebElement ProceedFromShipping;

	@FindBy(how = How.CSS, using = "input[id='cgv']")
	@CacheLookup
	WebElement checkcvg;

	@FindBy(how = How.CSS, using = "a[class='bankwire']")
	@CacheLookup
	WebElement btnBankWire;

	@FindBy(how = How.CSS, using = "button[class='button btn btn-default button-medium']")
	@CacheLookup
	WebElement btnConfirm;

	public void MoveToWomenSection() {
		Actions action = new Actions(driver);
		action.moveToElement(btnWomen).build().perform();
	}

	public void ClickOnBlouses() {
		btnBlouses.click();
	}

	public void AddToCard() {
		Actions action = new Actions(driver);
		action.moveToElement(stock).build().perform();
		btnAddToCard.click();
	}

	public void ClickProceedFromSummary() {
		ProceedFromSummary.click();
	}

	public void ClickProceedFromAddress() {
		ProceedFromAddress.click();
	}

	public void ClickProceedFromShipping() {
		ProceedFromShipping.click();
	}

	public void proceedCheckout() {
		btnCheckout.click();
	}

	public void ClickCheckcvg() {
		checkcvg.click();
	}

	public void ClickBankWire() {
		btnBankWire.click();
	}

	public void ClickConfirm() {
		btnConfirm.click();
	}

}
