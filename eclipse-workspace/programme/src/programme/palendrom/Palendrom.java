package programme.palendrom;

public class Palendrom {
	int num = 0;
	int t;

	public boolean checkpalen(int a) {

		t = num;
		int i;
		int r;
		+
		while (a > 0) {
			
			r = a % 10;
			num = (num * 10) + r;
			a = a / 10;

		}

		if (t == num) {
			System.out.println("the no. is palendrom");

		}

		else {
			System.out.println("no. is not. palendrom");
		}
		return true;
	}
}
