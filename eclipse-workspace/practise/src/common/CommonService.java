package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonService {

	public static WebDriver getChromeDriver() {
		System.setProperty(CommonConstant.WEB_CHROME_DRIVER, CommonConstant.WEB_CHROME_DRIVER_PATH);
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
