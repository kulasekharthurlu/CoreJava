package com.app.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {

	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Connection con=null;
		try {
			 Class.forName("org.postgresql.Driver");
			  con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "postgre");
			 Statement sta=con.createStatement();
			 sta.executeUpdate("insert into books(id,name,author) values(2,'java','James')");
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
