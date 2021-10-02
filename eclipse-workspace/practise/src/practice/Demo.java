package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// selenium code-
		// Create Driver object for chrome browser 
		/* class name= x */
		/* x driver=new x(); */
		
		/* class name= chromeDriver */
		//invoke.exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-jar-drivers\\drivers\\chrome\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		
	}

}
