package programme.forloop;
/*OUTPUT-1
 * 1234                                       QUESTION 1
 * 567 
 * 89
 * 10
 */
public class Forloop1 {

	public static void main(String[] args) {
		// for(initialization;condition;incriment)
		int k = 1;
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
           System.out.println("");
		}

	}

}

