import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("java");
		a.add(0, "student");
		System.out.println(a);
		a.remove("rahul");
		System.out.println(a);
		//System.out.println(a.get(2));
		System.out.println(a.contains("java"));
		System.out.println(a.indexOf("rahul"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}

}
