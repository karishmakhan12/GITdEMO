package programme.forloop;

public class ForLoop3 {

	public static void main(String[] args) {
		/*
		 * OUTPUT-2 
		 * 1                                                          QUESTION 3
		* 23 
		* 456 
		* 78910
		 */
		int k = 1;
		for (int i = 0; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;

			}

			System.out.println("");

		}

	}
}

