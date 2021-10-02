import java.text.SimpleDateFormat;

public class Date {

	public static void main(String[] args) {
		java.util.Date d=new java.util.Date();  
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");

		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println(d.toString());

	}

}
