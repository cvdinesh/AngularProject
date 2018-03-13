package dao;

import java.sql.Connection;
import java.sql.DriverManager;

import util.UserConstants;

public class DataBase {
	
	public Connection getConnection() throws Exception {
		
	   try 
	   {	
		   Connection connection = null;
		   //Class.forName("com.mysql.jdbc.Driver"); 
		   System.out.println("DataBase-getConnection -- method");
		   Class.forName(UserConstants.DB_DRIVER_NAME);
		   connection = (Connection)DriverManager.getConnection(UserConstants.DB_CONN_URL,UserConstants.DB_CONN_USER_NAME ,UserConstants.DB_CONN_PASSWORD);
		   System.out.println("connection---established"+connection);		   
		   return connection;
	   }catch(Exception e) {
		   throw e;
	   }	   
	}

}
