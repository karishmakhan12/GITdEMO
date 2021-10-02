package Calender;

import org.openqa.selenium.WebDriver;

import common.CommonService;

public class CalenderDate {
	WebDriver driver;

	public static void main(String[] args) {
		CalenderDate date = new CalenderDate();
		date.datemonth();
	}

	private void datemonth() {
		driver = CommonService.getChromeDriver();
		driver.get("");

	}

}
