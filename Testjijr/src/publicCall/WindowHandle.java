package publicCall;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import page.HomePage;

public class WindowHandle {

	// ��������˾�������
	public void windowHandleCompany(HomePage homePage, WebDriver driver,
			String titleString) {
		String beforeWindow = driver.getWindowHandle();
		homePage.clickCompanyLink();
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> it = allWindow.iterator();
		while (it.hasNext()) {
			if (beforeWindow == it.next()) {
				continue;
			}
			WebDriver nextWindow = driver.switchTo().window(it.next());
			Assert.assertEquals(titleString, driver.getTitle());
			nextWindow.close();
		}
		driver.switchTo().window(beforeWindow);
	}

	// ��������ȫ͸������
	public void windowHandleSecurity(HomePage homePage, WebDriver driver,
			String titleString) {
		String beforeWindow = driver.getWindowHandle();
		homePage.clickSecurityLink();
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> it = allWindow.iterator();
		while (it.hasNext()) {
			if (beforeWindow == it.next()) {
				continue;
			}
			WebDriver nextWindow = driver.switchTo().window(it.next());
			Assert.assertEquals(titleString, driver.getTitle());
			nextWindow.close();
		}
		driver.switchTo().window(beforeWindow);
	}

	// ��������Ƽ���������
	public void windowHandlecalculator(HomePage homePage, WebDriver driver,
			String titleString) {
		String beforeWindow = driver.getWindowHandle();
		homePage.clickCalculatorLink();
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> it = allWindow.iterator();
		while (it.hasNext()) {
			if (beforeWindow == it.next()) {
				continue;
			}
			WebDriver nextWindow = driver.switchTo().window(it.next());
			Assert.assertEquals(titleString, driver.getTitle());
			nextWindow.close();
		}
		driver.switchTo().window(beforeWindow);
	}

	// ��������ۼ���������
	public void windowHandleValueCalculator(HomePage homePage,
			WebDriver driver, String titleString) {
		String beforeWindow = driver.getWindowHandle();
		homePage.clickValueCalculatorLink();
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> it = allWindow.iterator();
		while (it.hasNext()) {
			if (beforeWindow == it.next()) {
				continue;
			}
			WebDriver nextWindow = driver.switchTo().window(it.next());
			Assert.assertEquals(titleString, driver.getTitle());
			nextWindow.close();
		}
		driver.switchTo().window(beforeWindow);
	}
}
