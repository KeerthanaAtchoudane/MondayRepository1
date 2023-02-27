package prog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class test1 
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/keerthana","root","Keerth@1");
			Statement ss=(Statement) con.createStatement();
			ResultSet rs=ss.executeQuery("select * from emp_details");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"     "+rs.getString(2)+"     "+rs.getString(3)+"     "+rs.getString(4));
			}
					
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}