
public class Construct {
	// Default constructor
	public Construct() {
		System.out.println("i am the only one constructor");
		System.out.println("not a return type");
	}

	// Parammeterized constructor
	public Construct(int a, int b) {
		System.out.println("i am in the parameter");
	}

	public Construct(String str) {
		System.out.println(str);
	}

	public void getData() {
		System.out.println("i am return type");
	}

	public static void main(String[] args) {
		Construct cd = new Construct("hello");
		Construct cdp = new Construct(4, 5);
	}

}
