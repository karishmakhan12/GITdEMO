package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chrome.exe
				System.setProperty("webdriver.chrome.driver", "C:\\selenium-jar-drivers\\drivers\\chrome\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://login.salesforce.com");//url in the browser
				driver.findElement(By.id("username")).sendKeys("this is my second code dude");
				driver.findElement(By.name("pw")).sendKeys("1234567");
		/*
		 * driver.findElement(By.className("button r4 wide primary")).clear();//error
		 */	
				driver.findElement(By.xpath("//*[@id='Login']")).click();
	}

}