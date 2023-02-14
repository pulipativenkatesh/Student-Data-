package studentdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayValues
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assiangment","root","root");
		PreparedStatement ps = con.prepareStatement("select * from college where id =?");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id???");
		int id =sc.nextInt();
		
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getDouble(5));
		}
		con.close();
	}

}
