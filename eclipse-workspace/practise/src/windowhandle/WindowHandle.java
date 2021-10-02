package windowhandle;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.CommonService;
import constants.actiondemo.ConstantAmazon;

public class WindowHandle {
	WebDriver driver;

	public static void main(String[] args) {
		 WindowHandle handle = new WindowHandle();
		 handle.shiftingMethod();
	}

	private void shiftingMethod() {
		driver = CommonService.getChromeDriver();
		driver.get(ConstantWindowHandle.WEB_ADDRESS);
		findElementByLink(ConstantWindowHandle.LINK_TEXT).click();
		findElementByCSS(ConstantCSSPath.CSS_PATH_WINDOW).click();
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		String parentWindow = it.next();
		driver.switchTo().window(it.next());
		System.out.println(findElementByXPath(ConstantXPATH.X_PATH_WINDOW).getText());
		driver.switchTo().window(parentWindow);
		System.out.println(findElementByXPath(ConstantXPATH.X_PATH_WINDOW_2).getText());

	}

	private WebElement findElementByCSS(String csspath) {
		return driver.findElement(By.cssSelector(csspath));
	}

	private WebElement findElementByLink(String link) {
		return driver.findElement(By.linkText(link));
	}

	private WebElement findElementByXPath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

}
