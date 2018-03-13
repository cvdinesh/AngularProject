package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import dao.DataBase;
import entity.Employee;
import entity.Login;

@XmlRootElement(name="login")
public class LoginModel {

	
	public LoginModel() {
		super();		
	}	

	Connection conn = null;
	Statement stmt = null ;
	ResultSet rs = null;

	public List<Login> findLoggedInUser(String username,String password)  throws Exception {
		
		Login login = null;
		List<Login> loginlist = new ArrayList<Login>();
		String uname = username;
		String passw = password;
		System.out.println("==============================================");
		System.out.println("Inside LoginModel --- findLoggedInUser----START");		
		try
	    {       
			DataBase database = new DataBase(); 
			conn = database.getConnection();			
			stmt=conn.createStatement();  
			String sql ="select * from invoicedb.login where UserName="+"'"+uname+"'"+" and Password="+"'"+passw+"'";
			System.out.println("LoginUserDetails --- sql--"+sql);
			System.out.println("LoginUserDetails --- Username--"+uname +" Password --"+passw);
			rs=stmt.executeQuery(sql);
			System.out.println("getFetchSize --"+rs.getFetchSize());
			
			while (rs.next()) 
			{     	
				login = new Login();
				login.username = rs.getString("UserName");				 			    			
				loginlist.add(login);
    		}
			
	        rs.close();
	    }catch(SQLException se)
	    {
	    	se.printStackTrace();
	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }
		finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		    	  se.printStackTrace();
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		
		}
		
		System.out.println("Inside LoginModel --- findLoggedInUser----END");
		System.out.println("==============================================");
		return loginlist;
	}

}
