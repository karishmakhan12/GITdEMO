package programme.calculator;

import java.util.Scanner;

public class AdditionMain {

	public static void main(String[] args) {
		//input
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first no.");
		int x=scan.nextInt();
		System.out.println("enter second no.");
		int y=scan.nextInt();
		System.out.println("enter operator");
		String operator= scan.next();
		
		//logic
		Addition add=new Addition();
		int z = add.addNum(x,y,operator);
		
		//output
		System.out.println("Result  : "+ z);
		scan.close();
	}
}
