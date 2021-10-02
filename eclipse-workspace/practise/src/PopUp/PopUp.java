package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Gmail.Constant;
import common.CommonService;                                                  
																	////ERROR
																				//ERROR

public class PopUp {
	WebDriver driver;

	public static void main(String[] args) {
		PopUp display = new PopUp();
		display.enterPopUp();
	}

	private void enterPopUp() {
		driver = CommonService.getChromeDriver();
		//driver.get(Constant.WEB_ADDRESS);
		driver.get("http://admin:admin@the_internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
	}
}
