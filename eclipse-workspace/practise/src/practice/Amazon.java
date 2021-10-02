package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Gmail.Constant;

public class Amazon {
	
	public static final String VEGETABLE_ITEM_1 = "Fresh Carrot";
	public static final String VEGETABLE_ITEM_2 = "Fresh Bhendi";
	public static final String VEGETABLE_ITEM_3 = "Fresh Cucumber";
	
	
	public static final String SIGNIN_EMAIL = "nooruskhan786@gmail.com";
	public static final String SIGNIN_PASSWORD = "211629";
	
	public static final String WEBSITE_ADDRESS = "http://amazon.in";
	public static final String SEARCH_ITEM ="Fresh Vegetables";
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-jar-drivers\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(WEBSITE_ADDRESS);
		driver.manage().window().maximize();
		int j = 0;
		String[] itemsNeeded = { VEGETABLE_ITEM_1, VEGETABLE_ITEM_2, VEGETABLE_ITEM_3 };

	
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("a[id='nav-link-accountList']")).click();
		driver.findElement(By.cssSelector("input[id='ap_email']")).sendKeys(SIGNIN_EMAIL);
		driver.findElement(By.cssSelector("input[id='continue']")).click();
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(SIGNIN_PASSWORD);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		// Adding items in cart
		driver.findElement(By.cssSelector("input[name='field-keywords']")).sendKeys(SEARCH_ITEM);
		driver.findElement(By.cssSelector("input[value='Go']")).click();
		
		//List<WebElement> products = driver.findElements(By.cssSelector("div[class='s-matching-dir sg-col-16-of-20 sg-col sg-col-8-of-12 sg-col-12-of-16']"));

		//List<WebElement> products = driver.findElements(By.cssSelector("body[class*='a-aui_tnr_v2_180836']"));
		//List<WebElement> products = driver.findElements(By.xpath("//span[contains(text(),'Carrot')]/parent::a"));
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']/div//h2//span"));
		System.out.println("All available products " + products.size());
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		for (int i = 0; i < products.size(); i++) {
			wait.until(ExpectedConditions.elementToBeClickable(products.get(i)));
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// formate it to get actual vegetable name
			// check weather name you extract is present in arrayList or not
			// convert array into array list for easy search
			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {
				System.out.print("Found element name:" + formattedName);
				// click on add to cart
				j++;
			}
			 products.get(i).click();
			//driver.findElements(By.cssSelector("input[class='a-button-input']")).get(i).click();
			if (j == 3) {
				break;
			}

		}
		
		//Set<String> windowsHandle = driver.getWindowHandles();
		
		for(String winHandle : driver.getWindowHandles()){
			   if (driver.switchTo().window(winHandle).getTitle().equals("Carrot")) {
			     //This is the one you're looking for
				   System.out.println("Switching to window");
				   driver.switchTo().window(winHandle);
			     break;
			   } 
			   else {
			    // driver.switchTo().window(currentWindow);
			   } 
		}
	}
}
