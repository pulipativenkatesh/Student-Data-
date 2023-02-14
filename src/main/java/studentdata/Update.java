package studentdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assiangment","root","root");
		PreparedStatement ps = con.prepareStatement("update college set phonenum = ? where id =? ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enetr the phonenum ::");
		String phonenum = sc.next();
		
		System.out.println("enetr the id");
		int id = sc.nextInt();
		
		ps.setString(1, phonenum);
		ps.setInt(2, id);
		
		
		ps.executeUpdate();
		
		con.close();
		
		
	}

}
