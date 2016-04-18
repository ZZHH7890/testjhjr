package testObjects;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import dataPro.DataProLoginPage;
import page.LoginPage;
import publicCall.ScreenShot;

public class TestLoginPage {
	LoginPage loginPage = new LoginPage();

	// ����������������
	@Test(enabled = false, dataProvider = "forget", dataProviderClass = DataProLoginPage.class, priority = 2)
	public void testForgetPasswd(String forgetString) {
		loginPage.clickForgetPasswd();
		Assert.assertTrue(loginPage.getDriver().getPageSource()
				.contains(forgetString));
		loginPage.getDriver().navigate().back();
	}

	// �������ע������
	@Test(enabled = true, dataProvider = "enroll", dataProviderClass = DataProLoginPage.class, invocationCount=10, threadPoolSize=1, priority = 1)
	public void testEnroll(String enrollTitle) {
		loginPage.clickFreeEnroll();
		Assert.assertEquals(loginPage.getDriver().getTitle(), enrollTitle);
		loginPage.getDriver().navigate().back();
	}

	// ���Ե�¼
	@Test(enabled = false, dataProvider = "login", dataProviderClass = DataProLoginPage.class, priority = 3)
	public void testLogin(String mobile, String passwd, String expectString) {
		try {
			loginPage.login(mobile, passwd);
			Assert.assertTrue(loginPage.getDriver().getPageSource()
					.contains(expectString));
		} catch (AssertionError e) {
			ScreenShot.screenShot(loginPage.getDriver());
			Assert.fail("���н�ͼ");	
		}
	}

	// �������
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		loginPage.openBrowser();
		loginPage.getDriver().manage().window().maximize();
	}

	// �ر������
	@AfterClass
	public void afterClass() {
		loginPage.close();
	}
}
