package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-jar-drivers\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		/*
		 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys("my own xpath"
		 * ); driver.findElement(By.xpath("//input[@type='password']")).
		 * sendKeys("my own password");
		 * driver.findElement(By.xpath("//input[@name='login']")).click();
		 */
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("my own css");
	}

}
