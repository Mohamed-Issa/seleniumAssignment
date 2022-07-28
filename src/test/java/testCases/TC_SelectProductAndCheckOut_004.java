package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SignInPage;

public class TC_SelectProductAndCheckOut_004 extends BaseClass {

	@Test
	public void SelectProductAndCheckout() throws InterruptedException {
		SignInPage lPage = new SignInPage(driver);

		lPage.clickbtnSignIn();

		lPage.setEmail("mohamed.hamdy.issa@gmail.com");
		lPage.setPassword("12345");
		lPage.clickSubmitLogin();

		HomePage hPage = new HomePage(driver);

		hPage.MoveToWomenSection();
		hPage.ClickOnBlouses();
		hPage.AddToCard();
		hPage.proceedCheckout();
		hPage.ClickProceedFromSummary();
		hPage.ClickProceedFromAddress();
		hPage.ClickCheckcvg();
		hPage.ClickProceedFromShipping();
		hPage.ClickBankWire();
		hPage.ClickConfirm();

		boolean res = driver.getPageSource().contains("Your order on My Store is complete.");

		if (res == true) {
			Assert.assertTrue(true);

		} else {
			Assert.assertTrue(false);
		}

	}
}
