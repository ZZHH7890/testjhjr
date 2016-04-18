package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	private WebDriver driver;
	String loginUrl = "http://192.168.18.6:88/login.html";
	WebDriverWait wait;

	@FindBy(linkText = "��������?")
	protected static WebElement forgetPasswd;

	@FindBy(linkText = "���ע��")
	protected static WebElement freeEnroll;

	@FindBy(name = "mobile")
	protected static WebElement mobile;

	@FindBy(xpath = "//*[@id='loginbox']/div[3]/label/input")
	protected static WebElement passwd;

	// ��¼��ť
	@FindBy(xpath = "//*[@id='loginbox']/div[6]/input")
	protected static WebElement loginButton;

	// ��ʼ����������
	public LoginPage() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}

	// ����driver
	public WebDriver getDriver() {
		return this.driver;
	}

	// �������������ַ
	public void openBrowser() {
		driver.get(loginUrl);
	}

	// �ر������
	public void close() {
		driver.quit();
	}

	// �����������
	public void clickForgetPasswd() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='loginbox']/div[5]/a[1]")));
		forgetPasswd.click();
	}

	// ������ע��
	public void clickFreeEnroll() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='loginbox']/div[5]/a[2]")));
		freeEnroll.click();
	}

	public void login(String mobilesString, String passwdString) {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='loginbox']/div[6]/input")));
		mobile.sendKeys(mobilesString);
		passwd.sendKeys(passwdString);
		loginButton.click();
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='login-reg']/a[2]")));
	}
}
