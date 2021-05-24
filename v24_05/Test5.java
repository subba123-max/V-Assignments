package com.v24_05;
import java.sql.*;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demovirtusa","root","ramcharan123");
			String sql= "insert into employee1(empid,empname,designation,age,salary) values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, 5);
			ps.setString(2, "amith");
			ps.setString(3, "Btech");
			ps.setInt(4,34);
			ps.setInt(5, 90000);
//			ps.setInt(1, 4);
//			ps.setString(2, "vivek");
//			ps.setString(3, "Btech");
//			ps.setInt(4,30);
//			ps.setInt(5, 60000);
			int x=ps.executeUpdate();
			if(x==1) {
				System.out.println("row inserted");
			}else {
				System.err.println("row not inserted");
			}
			
		}catch(SQLException s) {
			System.out.println(s);
		}

	}

}
