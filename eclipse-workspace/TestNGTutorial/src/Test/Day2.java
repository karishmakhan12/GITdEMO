package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test
	public void day2() {
		System.out.println("good");

	}

	@BeforeTest
	public void prerequiste() {
		System.out.println("i will execute first");
	}
}
