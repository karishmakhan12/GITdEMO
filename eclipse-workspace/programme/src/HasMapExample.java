import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMapExample {

	public static void main(String[] args) {
           HashMap<Integer, String> hm = new HashMap<Integer, String>();
           hm.put(0, "hi");;
           hm.put(1, "karishma");
           hm.put(2, "how's");
           hm.put(3, "u");
          System.out.println( hm.get(2));
            Set sn= hm.entrySet();
             Iterator it=sn.iterator();
             while(it.hasNext()) {
            	 Map.Entry mp= (Map.Entry )it.next();
            	 System.out.println(mp.getKey());
            	 System.out.println(mp.getValue());
             }
           
	}

}
