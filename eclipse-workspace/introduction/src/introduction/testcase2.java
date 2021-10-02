package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// selenium code-
				// Create Driver object for Firefox browser 
				/* class name= x */
				/* x driver=new x(); */
				
				/* class name= Firefox */
				
						
//geckodriver.exe
		System.setProperty("webdriver.gecko.driver", "C:\\selenium-jar-drivers\\drivers\\firefox\\geckodriver.exe");
		         WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
				

	}

}
