package testCases;

import pageObjects.AuthenticationPage;
import pageObjects.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_CreateNewAccount_001 extends BaseClass {

	@Test
	public void addNewCutomer() throws InterruptedException {

		SignInPage lPage = new SignInPage(driver);

		lPage.clickbtnSignIn();
		AuthenticationPage authPage = new AuthenticationPage(driver);

		String email = rondomString() + "@email.com";
		authPage.setEmailAddress(email);

		authPage.clickCreateNewAccount();

		authPage.setGender("Mr");

		authPage.setFirstName("mohamed");
		authPage.setLastName("eissa");
		authPage.setEmail(email);
		authPage.setPassword("12345");
		authPage.setDays(7);
		authPage.setMonths(5);
		authPage.setYears(20);
		authPage.setNewSletter();
		authPage.setUniformoptin();
		authPage.setAddressFirstName("Cairo Test");
		authPage.setAddressLastName("Test Cairo");
		authPage.setCompanyName("zVendo");
		authPage.setAddress1("11 Saharig Al Miyah, Almazah, Heliopolis, Cairo, Egypt 11341");
		authPage.setAddress2("Address Test2");
		authPage.setCity("Cairo City");
		authPage.setState(5);
		authPage.setPostCode("17756");
		//authPage.setCountry(20);
		authPage.setAdditionalInfo("additional info");
		authPage.setPhone("027559796");
		authPage.setPhoneMobile("01096998324");
		authPage.setAlias("alias alias");
		authPage.clickNewCutomer();

		Thread.sleep(5000);

		boolean res = driver.getPageSource().contains("Order history and details");

		if (res == true) {
			Assert.assertTrue(true);

		} else {
			Assert.assertTrue(false);
		}

	}
}
