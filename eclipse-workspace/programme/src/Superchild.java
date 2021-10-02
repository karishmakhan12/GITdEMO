
public class Superchild extends Superparent {
	String name = "Rahulshetty";
	

	public void getStringdata() {
		System.out.println(name);
		System.out.println(super.name);
	}
	 public Superchild() {
		 super();//this is for parent constructor it should be always in first line
		 System.out.println("child constructor");
	 }
	public void getdata() {
		super.getdata();
		System.out.println("i am the child");
	}

	public static void main(String[] args) {
		Superchild sc = new Superchild();
		sc.getStringdata();
		sc.getdata();
		
		
	}

}
