package Test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	@AfterTest
	public void lastexecution() {
		System.out.println("i will execute last");

	}

	@Test
	public void Demo() {
		System.out.println("Hello");
Assert.assertTrue(false);
	}

	@AfterSuite
	public void AFsuite() {
		System.out.println("I Am the no. 1 from the last");
	}

	@Test
	public void Secondcase() {
		System.out.println("Bye");
	}
}
