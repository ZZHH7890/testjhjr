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

	@FindBy(linkText = "Íü¼ÇÃÜÂë?")
	protected static WebElement forgetPasswd;

	@FindBy(linkText = "Ãâ·Ñ×¢²á")
	protected static WebElement freeEnroll;

	@FindBy(name = "mobile")
	protected static WebElement mobile;

	@FindBy(xpath = "//*[@id='loginbox']/div[3]/label/input")
	protected static WebElement passwd;

	// µÇÂ¼°´Å¥
	@FindBy(xpath = "//*[@id='loginbox']/div[6]/input")
	protected static WebElement loginButton;

	// ³õÊ¼»¯»ðºüä¯ÀÀÆ÷
	public LoginPage() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}

	// ·µ»Ødriver
	public WebDriver getDriver() {
		return this.driver;
	}

	// ´ò¿ªä¯ÀÀÆ÷ÊäÈëÍøÖ·
	public void openBrowser() {
		driver.get(loginUrl);
	}

	// ¹Ø±Õä¯ÀÀÆ÷
	public void close() {
		driver.quit();
	}

	// µã»÷Íü¼ÇÃÜÂë
	public void clickForgetPasswd() {
		this.wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id='loginbox']/div[5]/a[1]")));
		forgetPasswd.click();
	}

	// µã»÷Ãâ·Ñ×¢²á
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
