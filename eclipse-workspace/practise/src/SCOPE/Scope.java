package SCOPE;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.CommonService;

public class Scope {
	WebDriver driver;

	public static void main(String[] args) {
		Scope obc = new Scope();
		obc.countLinks();

	}

	private void countLinks() {
		// 1 count the links of the entire page
		driver = CommonService.getChromeDriver();
		driver.get(ConstantScope.WEB_ADDRESS);
		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2 count the link in the footer
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// 3 count the link of particular coloumn
		WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());

		// 4 click on each link in the coloumn and check if the pages are openening
		for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			}
		//5 open all the tabs
		 Set<String> abc =driver.getWindowHandles();
		 Iterator<String> it=abc.iterator();
		 while(it.hasNext())
		 {
			 driver.switchTo().window(it.next());
			 System.out.println(driver.getTitle());
		 }
		 }
	}

