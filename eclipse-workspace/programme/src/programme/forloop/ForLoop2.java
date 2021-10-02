package programme.forloop;

public class ForLoop2 {

	public static void main(String[] args) {
		/*
		 * OUTPUT-2 1 QUESTION 2 12 123 1234
		 */
		for (int i = 0; i <= 4; i++) {
			int k = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(k);

				k++;
			}
			System.out.println("\t");
		}

	}

}
