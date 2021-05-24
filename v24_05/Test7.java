package com.v24_05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test7 {

	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demovirtusa","root","ramcharan123");
			String sql="update employee1 set designation=? where age=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, "MBA");
			ps.setInt(2,40);
			int x=ps.executeUpdate();
			System.out.println(x);
			if(x>0) {
				System.out.println("row updated");
			}else {
				System.out.println("row not updated");
			}
		}catch(SQLException s) {
			System.out.println(s);
		}
	}

}
