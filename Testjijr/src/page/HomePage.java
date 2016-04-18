package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private WebDriver driver;
	String homePageUrl = "http://192.168.18.6:88/";
	WebDriverWait wait;

	@FindBy(linkText = "登录")
	protected static WebElement loginlink;

	@FindBy(linkText = "免费注册")
	protected static WebElement enrolllink;

	@FindBy(linkText = "帮助中心")
	protected static WebElement helpcenter;

	// 公司简介
	@FindBy(xpath = "html/body/div[6]/div[1]/div[1]/ul/li[1]/a")
	protected static WebElement companyprofile;

	// 安全透明
	@FindBy(xpath = "html/body/div[6]/div[1]/div[1]/ul/li[2]/a")
	protected static WebElement security;

	// 新手指引
	@FindBy(xpath = "html/body/div[6]/div[2]/div[1]/a")
	protected static WebElement guideLines;

	// 理财计算器
	@FindBy(xpath = "//*[@id='calculator-table']/tbody/tr[1]/td[1]/a/span")
	protected static WebElement calculator;

	// 身价计算器
	@FindBy(xpath = "//*[@id='calculator-table']/tbody/tr[2]/td[1]/a/span")
	protected static WebElement valuecalculator;

	// 点击充值
	@FindBy(xpath = "//*[@id='calculator-table']/tbody/tr[1]/td[2]/a/span")
	protected static WebElement charge;

	// 点击提现
	@FindBy(xpath = "//*[@id='calculator-table']/tbody/tr[2]/td[2]/a/span")
	protected static WebElement cashout;

	// 初始化浏览器和页面模式
	public HomePage() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}

	// 输入网址
	public void openBrowser() {
		this.driver.get(homePageUrl);
	}

	// 关闭浏览器
	public void close() {
		driver.quit();
	}

	// 得到driver
	public WebDriver getDriver() {
		return this.driver;
	}

	// 点击登录按钮
	public void clickLoginLink() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='login-reg']/a[1]")));
		loginlink.click();
	}

	// 点击免费注册按钮
	public void clickEnrollLink() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='login-reg']/a[2]")));
		enrolllink.click();
	}

	// 点击帮助中心
	public void clickHelpCenterLink() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='header']/div/ul/li[2]/a")));
		helpcenter.click();
	}

	// 点击公司简介
	public void clickCompanyLink() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("html/body/div[6]/div[1]/div[1]/ul/li[1]/a/i")));
		companyprofile.click();
	}

	// 点击安全透明
	public void clickSecurityLink() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("html/body/div[6]/div[1]/div[1]/ul/li[2]/a/i")));
		security.click();
	}

	// 点击新手指引
	public void clickGuideLines() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("html/body/div[6]/div[2]/div[1]/a")));
		guideLines.click();
	}

	// 点击理财计算器
	public void clickCalculatorLink() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='calculator-table']/tbody/tr[1]/td[1]/a/span")));
		calculator.click();
	}

	// 点击身价计算器
	public void clickValueCalculatorLink() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='calculator-table']/tbody/tr[2]/td[1]/a/span")));
		valuecalculator.click();
	}

	// 点击充值
	public void clickChargeLink() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='calculator-table']/tbody/tr[2]/td[2]/a/span")));
		charge.click();
	}

	// 点击提现
	public void clickCashOutLink() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='calculator-table']/tbody/tr[1]/td[2]/a/span")));
		cashout.click();
	}
}
