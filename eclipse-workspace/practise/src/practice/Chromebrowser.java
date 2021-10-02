package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chrome.exe
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-jar-drivers\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		  driver.get("http://facebook.com"); //url in the browser
		 /* driver.findElement(By.id("email")).sendKeys("this is my first code dude");
		 driver.findElement(By.name("pass")).sendKeys("1234567890");
		 driver.findElement(By.linkText("Forgot account")).click();*/
		 
		driver.findElement(By.cssSelector("#email")).sendKeys("hi");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\'loginbutton\']")).click();  
	}

}