import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		String host="localhost";
		String port="3306";
		//?user=root&password=root
Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+"qadbt","root","root");
 Statement s= con.createStatement();
 ResultSet rs= s.executeQuery("select * from employeeinfo where name='honey'");//rs by defualt it will come into zero index of array thatsy v use loop here
 while(rs.next()) {
 System.out.println(rs.getString("id"));
 System.out.println(rs.getString("location"));
 System.out.println(rs.getString("age"));
 }
	}

}
