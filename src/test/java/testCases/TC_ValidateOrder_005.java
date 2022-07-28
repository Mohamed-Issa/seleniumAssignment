package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.SignInPage;

public class TC_ValidateOrder_005 extends BaseClass {

	@Test
	public void ValidateOrder() {

		SignInPage lPage = new SignInPage(driver);

		lPage.clickbtnSignIn();

		lPage.setEmail("mohamed.hamdy.issa@gmail.com");
		lPage.setPassword("12345");
		lPage.clickSubmitLogin();

		AccountPage Apage = new AccountPage(driver);

		Apage.clickbtnOrders();

		boolean res = driver.getPageSource().contains("You have not placed any orders.");

		if (res == true) {
			Assert.assertTrue(false);

		} else {
			Assert.assertTrue(true);
		}

	}

}
