package com.n2s.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbcollection {
	
	public static Connection con = null ;
	public static Statement st = null ;
	public static ResultSet rs = null ;
	
	public static void main(String[] args) {
		
		try {
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			//Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java41", "password");
            //Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","password");
			System.out.println("Connected to Database");
			
			st = con.createStatement();
			
//			String s = "select * from login";
//			rs = st.executeQuery(s);
//			
//			while(rs.next()) {
//				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
//				//System.out.println(rs.getString("Id")+"  "+rs.getString("Username")+"  "+rs.getString("password"));
//
//			}
			String s = "update login set Password='Hello' where UserName='krishna'";
			st.executeUpdate(s);
			System.out.println("update successful");
		
			con.close();
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
