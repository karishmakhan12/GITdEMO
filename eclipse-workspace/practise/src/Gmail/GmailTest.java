package Gmail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import common.CommonService;

public class GmailTest {
	WebDriver driver;

	public static void main(String[] args) throws IOException {
		GmailTest sendMail = new GmailTest();
		sendMail.mailReply();
	}

	private void mailReply() throws IOException {
		driver = CommonService.getChromeDriver();
		driver.get(Constant.WEB_ADDRESS);
		findElementByCSS(Constant.EMAIL_PATH).sendKeys(Constant.EMAIL_ADDRESS);
		findElementByCSS(Constant.NEXT_PATH).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		findElementByCSS(Constant.PASSWORD_PATH).sendKeys(Constant.PASSWORD_ADDRESS);
		findElementByCSS(Constant.NEXT_PATH).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant.SEARCH_PATH)));
		findElementByXpath(Constant.SEARCH_PATH).sendKeys(Constant.SEARCH_KEY);
		findElementByXpath(Constant.SEARCH_PATH).sendKeys(Keys.RETURN);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<WebElement> mails = driver.findElements(By.xpath(Constant.SELECTED_MAIL));
		Actions a = new Actions(driver);
		List<WebElement> selectedMails = new ArrayList<WebElement>();
		for (WebElement move : mails) {
			if (move.getSize().getHeight() != 0 && move.getSize().getWidth() != 0) {
				selectedMails.add(move);
			}
		}

		System.out.println(selectedMails.size());
		for (WebElement m : selectedMails) {
			a.moveToElement(m).click().build().perform();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant.SELECTED_REPLY)));
			findElementByXpath(Constant.SELECTED_REPLY).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant.SELECTED_TEXT)));
			findElementByXpath(Constant.SELECTED_TEXT).sendKeys("hello");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant.SELECTED_ATTACH)));
			findElementByXpath(Constant.SELECTED_ATTACH).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant.SEARCH_PATH)));
			driver.findElement(By.xpath(Constant.SEARCH_PATH)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant.FILE_ADDRESS)));
			Runtime.getRuntime().exec(Constant.FILE_ADDRESS);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant.SELECTED_SEND)));
			findElementByXpath(Constant.SELECTED_SEND).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant.SELECTED_BACK))); 
			findElementByXpath(Constant.SELECTED_BACK).click();
		}
	}

	private WebElement findElementByXpath(String xpathId2) {
		return driver.findElement(By.xpath(xpathId2));
	}

	private WebElement findElementByCSS(String cssId) {
		return driver.findElement(By.cssSelector(cssId));
	}
}