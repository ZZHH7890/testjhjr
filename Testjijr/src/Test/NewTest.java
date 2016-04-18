package Test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class NewTest {
	WebDriver driver;
	  @Test
	  public void f() {
		  String dirName = "C:\\log\\screenshot";
		  if(!new File(dirName).isDirectory()){
			  new File(dirName).mkdir();
		  }
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
		  String timesString = sdf.format(new Date());
		  String titleString = driver.getTitle();
		  File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
			  FileUtils.copyFile(srcFile, new File(dirName+"\\"+titleString+timesString+".png"));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		  
	  }
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		    driver = new FirefoxDriver();
			driver.get("http://192.168.18.6:88/login.html");     
			
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }


}
