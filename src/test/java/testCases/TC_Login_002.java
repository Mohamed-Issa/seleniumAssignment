package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SignInPage;

public class TC_Login_002 extends BaseClass {

	@Test
	public void AuthenticateAsNewUser() throws InterruptedException {

		SignInPage lPage = new SignInPage(driver);

		lPage.clickbtnSignIn();

		lPage.setEmail("mohamed.hamdy.issa@gmail.com");
		lPage.setPassword("12345");
		lPage.clickSubmitLogin();

		boolean res = driver.getPageSource()
				.contains("Welcome to your account. Here you can manage all of your personal information and orders.");

		if (res == true) {
			Assert.assertTrue(true);

		} else {
			Assert.assertTrue(false);
		}

	}

}
