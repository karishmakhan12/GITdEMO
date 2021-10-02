package practice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingIteams {
	

	public static final String VEGETABLE_ITEM_1 = "Cucumber";
	public static final String VEGETABLE_ITEM_2 = "Brocolli";
	public static final String VEGETABLE_ITEM_3 = "Beetroot";

	// public static final String SIGNIN_EMAIL = "nooruskhan786@gmail.com";
	// public static final String SIGNIN_PASSWORD = "211629";

	public static final String WEBSITE_ADDRESS = "https://rahulshettyacademy.com/seleniumPractise/#/";
	// public static final String SEARCH_ITEM ="Fresh Vegetables";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-jar-drivers\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		int j = 0;
		String[] itemsNeeded = { VEGETABLE_ITEM_1, VEGETABLE_ITEM_2, VEGETABLE_ITEM_3 };

		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		// Adding items in cart
		// driver.findElement(By.cssSelector("input[name='field-keywords']")).sendKeys(SEARCH_ITEM);
		// driver.findElement(By.cssSelector("input[value='Go']")).click();
		driver.get(WEBSITE_ADDRESS);

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// formate it to get actual vegetable name
			// check weather name you extract is present in arrayList or not
			// convert array into array list for easy search
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (j == 3) {
				break;
			}

			else {
				if (itemsNeededList.contains(formattedName)) { // click on add to cart
					j++;
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				}
			}
		}
	}

}
