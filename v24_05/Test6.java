package com.v24_05;
import java.sql.*;
public class Test6 {

	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demovirtusa","root","ramcharan123");
			String sql="update employee1 set salary=? where empid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, 40000);
			ps.setInt(2,1 );
			int x=ps.executeUpdate();
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
