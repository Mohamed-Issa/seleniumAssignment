package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.SignInPage;
import utilities.XLUtils;

public class TC_LoginDataDrivenTest_003 extends BaseClass {

	@Test(dataProvider = "LoginData")
	public void AuthenticateAsNewUser(String name, String pass) throws InterruptedException {

		SignInPage lPage = new SignInPage(driver);
		AccountPage Apage = new AccountPage(driver);

		lPage.clickbtnSignIn();

		lPage.setEmail(name);
		lPage.setPassword(pass);
		lPage.clickSubmitLogin();

		boolean res = driver.getPageSource()
				.contains("Welcome to your account. Here you can manage all of your personal information and orders.");

		if (res == true) {
			Assert.assertTrue(true);
			Apage.clickbtnLogout();

		} else {
			Assert.assertTrue(false);
		}

	}

	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/testData/LoginData.xlsx";

		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);

		String logindata[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);// 1 0 }

			}
		}
		return logindata;

	}

}
