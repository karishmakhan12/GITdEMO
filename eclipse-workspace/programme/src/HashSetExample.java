import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
         hs.add("Delhi");
         hs.add("pune");
         hs.add("mumbai");
         hs.add("Delhi");
         hs.add("Bangalore");
         System.out.println(hs);
        Iterator<String>  i = hs.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
	}

}
