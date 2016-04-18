package testObjects;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dataPro.DataProHomePage;
import page.HomePage;
import publicCall.WindowHandle;

public class TestShouYeLink {
	HomePage homePage = new HomePage();
	WindowHandle windowHandle = new WindowHandle();

	// 登录浏览器输入网址
	@BeforeClass
	public void setUp() throws InterruptedException {
		homePage.openBrowser();
		homePage.getDriver().manage().window().maximize();
	}

	// 测试结束关闭浏览器
	@AfterClass
	public void tearDown() {
		homePage.close();
	}

	// 测试首页登录链接
	@Test(enabled = true, dataProvider = "login", dataProviderClass = DataProHomePage.class, priority = 1)
	public void testLoginLink(String logintitle) {
		homePage.clickLoginLink();
		Assert.assertEquals(homePage.getDriver().getTitle(), logintitle);
		homePage.getDriver().navigate().back();
	}

	// 测试首页免费注册链接
	@Test(enabled = true, dataProvider = "enroll", dataProviderClass = DataProHomePage.class, priority = 2)
	public void testEnrollLink(String enrolltitle) {
		homePage.clickEnrollLink();
		Assert.assertEquals(homePage.getDriver().getTitle(), enrolltitle);
		homePage.getDriver().navigate().back();
	}

	// 测试首页帮助中心链接
	@Test(enabled = true, dataProvider = "help", dataProviderClass = DataProHomePage.class, priority = 3)
	public void testHelpLink(String helptitle) {
		homePage.clickHelpCenterLink();
		Assert.assertEquals(homePage.getDriver().getTitle(), helptitle);
		homePage.getDriver().navigate().back();
	}

	// 测试首页客服电话是否正确
	@Test(enabled = true, dataProvider = "phone", dataProviderClass = DataProHomePage.class, priority = 4)
	public void testCustomerServicePhone(String phone) {
		Assert.assertTrue(homePage.getDriver().getPageSource().contains(phone));
	}

	// 测试首页公司简介链接
	@Test(enabled = true, dataProvider = "help", dataProviderClass = DataProHomePage.class, priority = 5)
	public void testCompanyLink(String company) {
		windowHandle.windowHandleCompany(homePage, homePage.getDriver(),
				company);
	}

	// 测试首页安全透明链接
	@Test(enabled = true, dataProvider = "security", dataProviderClass = DataProHomePage.class, priority = 6)
	public void testSecurityLink(String securitytitle) {
		windowHandle.windowHandleSecurity(homePage, homePage.getDriver(),
				securitytitle);
	}

	// 测试新手指引链接
	@Test(enabled = true, dataProvider = "guideLines", dataProviderClass = DataProHomePage.class, priority = 7)
	public void testguideLinesLink(String guideLinestitle) {
		homePage.clickGuideLines();
		Assert.assertEquals(homePage.getDriver().getTitle(), guideLinestitle);
		homePage.getDriver().navigate().back();
	}

	// 测试理财计算器链接
	@Test(enabled = true, dataProvider = "calculator", dataProviderClass = DataProHomePage.class, priority = 8)
	public void testCalculatorLink(String calculatortitle) {
		windowHandle.windowHandlecalculator(homePage, homePage.getDriver(),
				calculatortitle);
	}

	// 测试身价计算器链接
	@Test(enabled = true, dataProvider = "valuecalculator", dataProviderClass = DataProHomePage.class, priority = 9)
	public void testValueCalculatorLink(String valuecalculator) {
		windowHandle.windowHandleValueCalculator(homePage,
				homePage.getDriver(), valuecalculator);
	}

	// 测试充值链接
	@Test(enabled = true, dataProvider = "login", dataProviderClass = DataProHomePage.class, priority = 10)
	public void testChargeLink(String logintitle) {
		homePage.clickChargeLink();
		Assert.assertEquals(homePage.getDriver().getTitle(), logintitle);
		homePage.getDriver().navigate().back();
	}

	// 测试提现链接
	@Test(enabled = true, dataProvider = "login", dataProviderClass = DataProHomePage.class, priority = 11)
	public void testCashOut(String logintitle) {
		homePage.clickCashOutLink();
		Assert.assertEquals(homePage.getDriver().getTitle(), logintitle);
		homePage.getDriver().navigate().back();
	}

}
