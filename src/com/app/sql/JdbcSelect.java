package com.app.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect {


	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Connection con=null;
		try {
			 Class.forName("org.postgresql.Driver");
			  con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "postgre");
			 Statement sta=con.createStatement();
			ResultSet rs= sta.executeQuery("select * from books  ");
			//whene we want one row change query
			//select * from books where id=1
while(rs.next()) {
	System.out.println(" "+rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("author"));

}

		} catch (Exception e) {
			e.printStackTrace();
		}
		 finally {
			if(con!=null) {
				con.close();
				System.out.println("connection closed successfully....");
			}else {
				System.out.println("connection not established...");
			}
		}
		 
	}



}
