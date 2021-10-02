import java.text.SimpleDateFormat;

public class Calendar {

	public static void main(String[] args) {
		java.util.Calendar cal = java.util.Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");

		System.out.println(sd.format(cal.getTime()));
		System.out.println(cal.get(java.util.Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(java.util.Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(java.util.Calendar.AM_PM));
		System.out.println(cal.get(java.util.Calendar.MINUTE));




	}
}
