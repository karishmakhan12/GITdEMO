package programme.abstractc;

public class ChildIndigo extends ParentAirCraft{

	public static void main(String[] args) {
		ChildIndigo c=new ChildIndigo();
		c.engine();
		c.bodycolor();
		c.safetyguidline();

	}

	@Override
	public void bodycolor() {
		System.out.println("Red color of the body");
		
	}

}
