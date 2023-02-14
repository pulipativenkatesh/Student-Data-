package studentdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertValues 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assiangment","root","root");
		PreparedStatement ps = con.prepareStatement("insert into college values(?,?,?,?,?,?)");
		
		Scanner s  = new Scanner(System.in);
		
		System.out.println("Entre the id???");
		int id = s.nextInt();
		
		System.out.println("enetr the name???");
		String name = s.next();
		System.out.println("Enetr the branch???");
		String branch = s.next();
		
		System.out.println("Enter the address???");
		String address = s.next();
		
		System.out.println("enetr the marks ???");
		double marks = s.nextDouble();
		System.out.println("Enetr the phoneNumber");
		String phonenum = s.next();
		
		System.out.println("insertd valuies..");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, branch);
		ps.setString(4, address);
		ps.setDouble(5, marks);
		ps.setString(6, phonenum);
		
		
		ps.executeUpdate();
		con.close();
		
		
		
		
		
		
	}

}
