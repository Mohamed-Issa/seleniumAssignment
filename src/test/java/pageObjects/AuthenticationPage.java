package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AuthenticationPage {

	WebDriver driver;

	public AuthenticationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = "input[id='email_create']")
	@CacheLookup
	WebElement txtEmailAddress;

	@FindBy(how = How.CSS, using = "a[class='login']")
	@CacheLookup
	WebElement btnSignin;

	@FindBy(how = How.ID, using = "SubmitCreate")
	@CacheLookup
	WebElement btnCreateAccount;

	@FindBy(how = How.ID, using = "uniform-id_gender1")
	@CacheLookup
	WebElement rdMr;

	@FindBy(how = How.ID, using = "uniform-id_gender2")
	@CacheLookup
	WebElement rdMrs;

	@FindBy(how = How.ID, using = "customer_firstname")
	@CacheLookup
	WebElement txtFirstName;

	@FindBy(how = How.ID, using = "customer_lastname")
	@CacheLookup
	WebElement txtLastName;

	@FindBy(how = How.ID, using = "email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(how = How.ID, using = "passwd")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(how = How.ID, using = "days")
	@CacheLookup
	WebElement drpDays;

	@FindBy(how = How.ID, using = "months")
	@CacheLookup
	WebElement drpMonths;

	@FindBy(how = How.ID, using = "years")
	@CacheLookup
	WebElement drpYears;

	@FindBy(how = How.ID, using = "newsletter")
	@CacheLookup
	WebElement chxNewsletter;

	@FindBy(how = How.ID, using = "uniform-optin")
	@CacheLookup
	WebElement chxUniformoptin;

	@FindBy(how = How.CSS, using = "input[id='firstname']")
	@CacheLookup
	WebElement txtaddressFirstName;

	@FindBy(how = How.CSS, using = "input[id='lastname']")
	@CacheLookup
	WebElement txtaddressLastName;

	@FindBy(how = How.ID, using = "company")
	@CacheLookup
	WebElement txtCompany;

	@FindBy(how = How.ID, using = "address1")
	@CacheLookup
	WebElement txtAddress1;

	@FindBy(how = How.ID, using = "address2")
	@CacheLookup
	WebElement txtAddress2;

	@FindBy(how = How.ID, using = "city")
	@CacheLookup
	WebElement txtCity;

	@FindBy(how = How.ID, using = "id_state")
	@CacheLookup
	WebElement drpState;

	@FindBy(how = How.ID, using = "postcode")
	@CacheLookup
	WebElement txtPostCode;

	@FindBy(how = How.CSS, using = "select[id ='id_country']")
	@CacheLookup
	WebElement drpCountry;

	@FindBy(how = How.ID, using = "other")
	@CacheLookup
	WebElement txtOther;

	@FindBy(how = How.ID, using = "phone")
	@CacheLookup
	WebElement txtPhone;

	@FindBy(how = How.ID, using = "phone_mobile")
	@CacheLookup
	WebElement txtPhoneMobile;

	@FindBy(how = How.ID, using = "alias")
	@CacheLookup
	WebElement txtAlias;

	@FindBy(how = How.ID, using = "submitAccount")
	@CacheLookup
	WebElement btnSubmitAccount;

	public void setEmailAddress(String emailAddress) {
		txtEmailAddress.sendKeys(emailAddress);
	}

	public void setGender(String gender) {
		if (gender.equals("Mr")) {
			rdMr.click();
		} else if (gender.equals("Mrs")) {
			rdMrs.click();
		}
	}

	public void setFirstName(String firstName) {
		txtFirstName.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		txtLastName.sendKeys(lastName);
	}

	public void setEmail(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}

	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void setDays(int index) {
		Select days = new Select(drpDays);
		days.selectByIndex(index);
	}

	public void setMonths(int index) {
		Select months = new Select(drpMonths);
		months.selectByIndex(index);
	}

	public void setYears(int index) {
		Select years = new Select(drpYears);
		years.selectByIndex(index);
	}

	public void setNewSletter() {
		chxNewsletter.click();
	}

	public void setUniformoptin() {
		chxUniformoptin.click();
	}

	public void setAddressFirstName(String addressFirstName) {
		txtaddressFirstName.clear();
		txtaddressFirstName.sendKeys(addressFirstName);
	}

	public void setAddressLastName(String addressLastName) {
		txtaddressLastName.clear();
		txtaddressLastName.sendKeys(addressLastName);
	}

	public void setCompanyName(String companyName) {
		txtCompany.sendKeys(companyName);
	}

	public void setAddress1(String address1) {
		txtAddress1.sendKeys(address1);
	}

	public void setAddress2(String address2) {
		txtAddress2.sendKeys(address2);
	}

	public void setCity(String city) {
		txtCity.sendKeys(city);
	}

	public void setState(int index) {
		Select state = new Select(drpState);
		state.selectByIndex(index);
	}

	public void setPostCode(String postCode) {
		txtPostCode.sendKeys(postCode);
	}

	public void setCountry(int index) {
		Select countries = new Select(drpCountry);
		countries.selectByIndex(index);
	}

	public void setAdditionalInfo(String AdditionInfo) {
		txtOther.sendKeys(AdditionInfo);
	}

	public void setPhone(String phone) {
		txtPhone.sendKeys(phone);
	}

	public void setPhoneMobile(String phoneMobile) {
		txtPhoneMobile.sendKeys(phoneMobile);
	}

	public void setAlias(String alias) {
		txtAlias.clear();
		txtAlias.sendKeys(alias);
	}

	public void clickNewCutomer() {
		btnSubmitAccount.click();
	}

	public void clickCreateNewAccount() {
		btnCreateAccount.click();
	}

}
