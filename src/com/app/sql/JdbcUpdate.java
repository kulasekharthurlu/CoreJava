package com.app.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {

	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Connection con=null;
		try {
			 Class.forName("org.postgresql.Driver");
			  con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "postgre");
			 Statement sta=con.createStatement();
			 sta.executeUpdate(" update books set name='sanka',author='alplix' where id=46");
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
