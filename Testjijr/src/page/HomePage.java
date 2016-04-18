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

	@FindBy(linkText = "��¼")
	protected static WebElement loginlink;

	@FindBy(linkText = "���ע��")
	protected static WebElement enrolllink;

	@FindBy(linkText = "��������")
	protected static WebElement helpcenter;

	// ��˾���
	@FindBy(xpath = "html/body/div[6]/div[1]/div[1]/ul/li[1]/a")
	protected static WebElement companyprofile;

	// ��ȫ͸��
	@FindBy(xpath = "html/body/div[6]/div[1]/div[1]/ul/li[2]/a")
	protected static WebElement security;

	// ����ָ��
	@FindBy(xpath = "html/body/div[6]/div[2]/div[1]/a")
	protected static WebElement guideLines;

	// ��Ƽ�����
	@FindBy(xpath = "//*[@id='calculator-table']/tbody/tr[1]/td[1]/a/span")
	protected static WebElement calculator;

	// ��ۼ�����
	@FindBy(xpath = "//*[@id='calculator-table']/tbody/tr[2]/td[1]/a/span")
	protected static WebElement valuecalculator;

	// �����ֵ
	@FindBy(xpath = "//*[@id='calculator-table']/tbody/tr[1]/td[2]/a/span")
	protected static WebElement charge;

	// �������
	@FindBy(xpath = "//*[@id='calculator-table']/tbody/tr[2]/td[2]/a/span")
	protected static WebElement cashout;

	// ��ʼ���������ҳ��ģʽ
	public HomePage() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}

	// ������ַ
	public void openBrowser() {
		this.driver.get(homePageUrl);
	}

	// �ر������
	public void close() {
		driver.quit();
	}

	// �õ�driver
	public WebDriver getDriver() {
		return this.driver;
	}

	// �����¼��ť
	public void clickLoginLink() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='login-reg']/a[1]")));
		loginlink.click();
	}

	// ������ע�ᰴť
	public void clickEnrollLink() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='login-reg']/a[2]")));
		enrolllink.click();
	}

	// �����������
	public void clickHelpCenterLink() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='header']/div/ul/li[2]/a")));
		helpcenter.click();
	}

	// �����˾���
	public void clickCompanyLink() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("html/body/div[6]/div[1]/div[1]/ul/li[1]/a/i")));
		companyprofile.click();
	}

	// �����ȫ͸��
	public void clickSecurityLink() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("html/body/div[6]/div[1]/div[1]/ul/li[2]/a/i")));
		security.click();
	}

	// �������ָ��
	public void clickGuideLines() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("html/body/div[6]/div[2]/div[1]/a")));
		guideLines.click();
	}

	// �����Ƽ�����
	public void clickCalculatorLink() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='calculator-table']/tbody/tr[1]/td[1]/a/span")));
		calculator.click();
	}

	// �����ۼ�����
	public void clickValueCalculatorLink() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='calculator-table']/tbody/tr[2]/td[1]/a/span")));
		valuecalculator.click();
	}

	// �����ֵ
	public void clickChargeLink() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='calculator-table']/tbody/tr[2]/td[2]/a/span")));
		charge.click();
	}

	// �������
	public void clickCashOutLink() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='calculator-table']/tbody/tr[1]/td[2]/a/span")));
		cashout.click();
	}
}
