package programme.reverse;

public class ReverseString {

	public void reverse() {
		String s ="madam";
		int i;
		String t="";
		for(i=s.length()-1;i>=0;i--){
			t= t+s.charAt(i);
			
		}
		System.out.println(t);
		

}
}
