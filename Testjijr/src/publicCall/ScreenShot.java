package publicCall;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	public static void screenShot(WebDriver driver){
		String dirName = "C:\\log\\screenshot";
		if (!new File(dirName).isDirectory()) {
			new File(dirName).mkdir();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String timesString = sdf.format(new Date());
		System.out.println("½ØÍ¼Ê±¼äÎª£º" + timesString);
		String titleString = driver.getTitle();
		try {
			File srcFile = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File(dirName + "\\" + titleString
					+ timesString + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
