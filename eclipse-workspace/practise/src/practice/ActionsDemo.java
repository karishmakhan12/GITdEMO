package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import common.CommonService;
import common.CommonConstant;
import constants.actiondemo.ConstantAmazon;
import constants.actiondemo.ConstantCSSPath;

public class ActionsDemo {

	WebDriver driver;

	public static void main(String[] args) {
		ActionsDemo demo = new ActionsDemo();
		demo.processAutomation();
	}

	private void processAutomation() {
		driver = CommonService.getChromeDriver();
		driver.get(ConstantAmazon.WEB_ADDRESS);
		Actions a = new Actions(driver);
		WebElement move = getElementCSSPath(ConstantCSSPath.CSS_PATH_LOGIN_CLICK);
		a.moveToElement(getElementCSSPath(ConstantCSSPath.CSS_PATH_LOGIN_CLICK)).build().perform();
		getElementCSSPath(ConstantCSSPath.CSS_PATH_LOGIN_CLICK).click();
		getElementCSSPath(ConstantCSSPath.CSS_PATH_EMAIL_CLICK).sendKeys(ConstantAmazon.SIGNIN_EMAIL);
		getElementCSSPath(ConstantCSSPath.CSS_PATH_CONTINUE_CLICK).click();
		getElementCSSPath(ConstantCSSPath.CSS_PATH_PASSWORD_DETAIL_CLICK).sendKeys(ConstantAmazon.SIGNIN_PASSWORD);
		getElementCSSPath(ConstantCSSPath.CSS_PATH_SUBMIT_CLICK).click();
		a.moveToElement(getElementCSSPath(ConstantCSSPath.CSS_PATH_SEARCH_BAR_CLICK)).click().keyDown(Keys.SHIFT)
				.sendKeys(ConstantAmazon.SEARCH_BAR_HELLO).doubleClick().build().perform();
		move = getElementCSSPath(ConstantCSSPath.CSS_PATH_LOGIN_CLICK);
		a.moveToElement(move).contextClick().build().perform();
	}

	private WebElement getElementCSSPath(String cssPath) {
		return driver.findElement(By.cssSelector(cssPath));
		
	}

}
