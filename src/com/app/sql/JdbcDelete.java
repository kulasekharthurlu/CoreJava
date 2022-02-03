package com.app.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
 
 
public class JdbcDelete {

	private static final Logger log = Logger.getLogger(JdbcDelete.class);
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		   Logger log=Logger.getLogger(JdbcDelete.class.getName());
		 Connection con=null;
		try {
			 Class.forName("org.postgresql.Driver");
			  con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "postgre");
			 Statement sta=con.createStatement();
			 sta.executeUpdate(" delete from books where id=46");
		} catch (Exception e) {
			e.printStackTrace();
		}
		 finally {
			if(con!=null) {
				con.close();
				 log.info("connection closed successfully....");
			}else {
				 log.info("connection not established...");
			}
		}
		 
	}


}
