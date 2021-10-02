package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@BeforeClass
	public void beforeeveryclass() {

		System.out.println("before executing any method in the class");
	}
@Parameters({"URL"})
	@Test
	public void WebloginCarLoan(String urlname) {
		// selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
	}

	@BeforeMethod
	public void beforeevery() {

		System.out.println("i will execute before every test method in day3");
	}

	@AfterMethod
	public void afterevery() {

		System.out.println("i will execute after every test method in day3");
	}

	@Test
	public void MobileLoginCarLoan() {
		// Appium
		System.out.println("MobileloginCar");

	}
	@Test(dataProvider="getData")
	public void MobileLoginSignIn(String username,String password) {
		// Appium
		System.out.println("MobileloginSignIn");
		System.out.println(username);
		System.out.println(password);

	}

	@BeforeSuite
	public void BFsuite() {
		System.out.println("I Am no. 1");
	}

	@Test
	public void LoginAPICarLoan() {
		// Rest api automation
		System.out.println("APIloginCar");

	}
	@DataProvider
	public Object[][] getData(){
		Object[][] data= new Object[3][2];
		data[0][0] ="firstSetUsername";
		data[0][1] ="firstSetPassword";
		data[1][0] ="secondusername";
		data[1][1] ="secondpassword";
		data[2][0] ="thirdusername";
		data[2][1] = "thirdpassword";
		return data;
		
		
	}
	

	@AfterClass
	public void aftereveryclass() {

		System.out.println("after executing any method in the class");
	}

	@Test
	public void MobileLoginSignOut() {
		// Appium
		System.out.println("MobileloginSignOut");

	}
}
