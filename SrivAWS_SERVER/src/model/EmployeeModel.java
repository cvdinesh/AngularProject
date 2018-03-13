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

@XmlRootElement(name="employee")
public class EmployeeModel {

	
	public EmployeeModel() {
		super();		
	}	

	Connection conn = null;
	Statement stmt = null ;
	ResultSet rs = null;

	public List<Employee> findEmployeeDetails()  throws Exception {
		
		Employee employee = null;
		List<Employee> employeelist = new ArrayList<Employee>();
		System.out.println("==============================================");
		System.out.println("Inside EmployeeModel --- findEmployeeDetails----START");		
		try
	    {       
			DataBase database = new DataBase(); 
			conn = database.getConnection();			
			stmt=conn.createStatement();  
			rs=stmt.executeQuery("select * from invoicedb.employee");
			//rs=stmt.executeQuery("select * from shrivdb.employee");
			//rs=stmt.executeQuery("select * from srivemployeesdb.employee");
			
			
			
			while (rs.next()) 
			{     	
				employee = new Employee();
				employee.empNo = rs.getInt("EmpNo");	    			
    			employee.empFName = rs.getString("FirstName");	    			
    			employee.empLName = rs.getString("LastName");	    			    			
    			employee.empDOB = rs.getString("DOB");	    			
    			employee.empGender = rs.getString("Gender");
    			employee.age = rs.getInt("Age");
    			employee.perAddr = rs.getString("PermntAddress");
    			employee.localAddr = rs.getString("LocalAddress");
    			employee.fatherName = rs.getString("FatherName");
    			employee.empDOJ = rs.getString("DOJ");
    			employee.empDesignation = rs.getString("Designation");
    			employee.basicSalary = rs.getInt("BasicSalary");
    			employee.empHRA = rs.getInt("HRA");
    			employee.convAllow = rs.getInt("CA");
    			employee.medicalAllow = rs.getInt("MA");
    			employee.specAllow = rs.getInt("SA");
    			employee.phone = rs.getInt("Phone");
    			employee.empDOR = rs.getString("DOR");
    			employee.principleEmployer = rs.getString("PrincipleEmployer");
    			employee.contractor = rs.getString("Contractor");
    			employee.location = rs.getString("EmpLocation");
    			employee.month = rs.getString("Month");
    			employee.year = rs.getInt("Year");    			
    			employee.day1hrs = rs.getInt("Day1Hrs");
    			employee.day2hrs = rs.getInt("Day2Hrs");
    			employee.day3hrs = rs.getInt("Day3Hrs");
    			employee.day4hrs = rs.getInt("Day4Hrs");
    			employee.day5hrs = rs.getInt("Day5Hrs");
    			employee.day6hrs = rs.getInt("Day6Hrs");
    			employee.day7hrs = rs.getInt("Day7Hrs");
    			employee.day8hrs = rs.getInt("Day8Hrs");
    			employee.day9hrs = rs.getInt("Day9Hrs");
    			employee.day10hrs = rs.getInt("Day10Hrs");
    			employee.day11hrs = rs.getInt("Day11Hrs");
    			employee.day12hrs = rs.getInt("Day12Hrs");
    			employee.day13hrs = rs.getInt("Day13Hrs");
    			employee.day14hrs = rs.getInt("Day14Hrs");
    			employee.day15hrs = rs.getInt("Day15Hrs");
    			employee.day16hrs = rs.getInt("Day16Hrs");
    			employee.day17hrs = rs.getInt("Day17Hrs");
    			employee.day18hrs = rs.getInt("Day18Hrs");
    			employee.day19hrs = rs.getInt("Day19Hrs");
    			employee.day20hrs = rs.getInt("Day20Hrs");
    			employee.day21hrs = rs.getInt("Day21Hrs");
    			employee.day22hrs = rs.getInt("Day22Hrs");
    			employee.day23hrs = rs.getInt("Day23Hrs");
    			employee.day24hrs = rs.getInt("Day24Hrs");
    			employee.day25hrs = rs.getInt("Day25Hrs");
    			employee.day26hrs = rs.getInt("Day26Hrs");
    			employee.day27hrs = rs.getInt("Day27Hrs");
    			employee.day28hrs = rs.getInt("Day28Hrs");
    			employee.day29hrs = rs.getInt("Day29Hrs");
    			employee.day30hrs = rs.getInt("Day30Hrs");
    			employee.day31hrs = rs.getInt("Day31Hrs");
    			employee.workdays = rs.getInt("WorkDays");
    			employee.empRemarks = rs.getString("EmployeeRemarks");
    			employee.emplrRemarks = rs.getString("EmployerSignatureRemarks");
    			
    			
    			System.out.println("+++++++++++++++EMP Details +++++++++++++++++++++++++");
    			System.out.println("EmpNo --- "+rs.getInt("EmpNo"));
    			System.out.println("FirstName --- "+rs.getString("FirstName"));
    			System.out.println("LastName --- "+rs.getString("LastName"));
    			System.out.println("DOB --- "+rs.getString("DOB"));	
    			System.out.println("Gender --- "+rs.getString("Gender"));
    			System.out.println("Age --- "+rs.getInt("Age"));
    			System.out.println("PermntAddress --- "+rs.getString("PermntAddress"));
    			System.out.println("LocalAddress --- "+rs.getString("LocalAddress"));
    			System.out.println("FatherName --- "+rs.getString("FatherName"));
    			System.out.println("DOJ --- "+rs.getString("DOJ"));
    			System.out.println("Designation --- "+rs.getString("Designation"));	
    			System.out.println("BasicSalary --- "+rs.getInt("BasicSalary"));
    			System.out.println("HRA --- "+rs.getInt("HRA"));
    			System.out.println("CA --- "+rs.getInt("CA"));
    			System.out.println("MA --- "+rs.getInt("MA"));
    			System.out.println("SA --- "+rs.getInt("SA"));
    			System.out.println("Phone --- "+rs.getInt("Phone"));
    			System.out.println("DOR --- "+rs.getString("DOR"));
    			System.out.println("PrincipleEmployer --- "+rs.getString("PrincipleEmployer"));
    			System.out.println("Contractor --- "+rs.getString("Contractor"));
    			System.out.println("EmpLocation --- "+rs.getString("EmpLocation"));
    			System.out.println("Month --- "+rs.getString("Month"));
    			System.out.println("Year --- "+rs.getInt("Year"));
    			System.out.println("+++++++++++++++EMP Details +++++++++++++++++++++++++");
    			employeelist.add(employee);
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
		
		System.out.println("Inside EmployeeModel --- findEmployeeDetails----END");
		System.out.println("==============================================");
		return employeelist;
	}


	/*Month,year not added*/
	public Employee createEmployee(Employee employee) throws Exception {

		PreparedStatement preparedStatement = null;
		try
	    {   
			System.out.println("==============================================");
			System.out.println("Inside EmployeeModel --- createEmployee----START");
			if(employee !=null) 
			{
				DataBase database = new DataBase(); 
				conn = database.getConnection();			
				String sql = "INSERT INTO invoicedb.employee(EmpNo,FirstName,LastName,DOB,Gender,Age,PermntAddress,LocalAddress,FatherName,DOJ,Designation,"
						+ "BasicSalary,HRA,CA,MA,SA,Phone,DOR,PrincipleEmployer,Contractor,EmpLocation"
						+ ") VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				System.out.println("createEmployee --- sql--"+sql);	
				preparedStatement = conn.prepareStatement(sql);
				preparedStatement.setInt(1, employee.empNo);
			    preparedStatement.setString(2, employee.empFName);   
			    preparedStatement.setString(3, employee.empLName);
			    preparedStatement.setString(4, employee.empDOB);
			    preparedStatement.setString(5, employee.empGender);
			    preparedStatement.setInt(6, employee.age);
			    preparedStatement.setString(7, employee.perAddr);
			    preparedStatement.setString(8, employee.localAddr);
			    preparedStatement.setString(9, employee.fatherName);
			    preparedStatement.setString(10, employee.empDOJ);
			    preparedStatement.setString(11, employee.empDesignation);
			    preparedStatement.setInt(12, employee.basicSalary);
			    preparedStatement.setInt(13, employee.empHRA);
			    preparedStatement.setInt(14, employee.convAllow);
			    preparedStatement.setInt(15, employee.medicalAllow);
			    preparedStatement.setInt(16, employee.specAllow);
			    preparedStatement.setInt(17, employee.phone);
			    preparedStatement.setString(18, employee.empDOR);
			    preparedStatement.setString(19, employee.principleEmployer);
			    preparedStatement.setString(20, employee.contractor);
			    preparedStatement.setString(21, employee.location);
			    preparedStatement.executeUpdate();
			
			}			
	    }catch(SQLException se)
	    {
	        //se.getMessage(); 
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
				
		System.out.println("Inside EmployeeModel --- createEmployee----END");
		System.out.println("==============================================");
		return employee;
		
	}

	/*Month,year not added*/
	public List<Employee> employeeDetails(int empNo)  throws Exception {
		
		Employee employee = null;
		List<Employee> employeeslist = new ArrayList<Employee>();
		int searchemp = empNo; 
		System.out.println("==============================================");
		System.out.println("Inside EmployeeModel --- employeeDetails----START");		
		try
	    {       
			DataBase database = new DataBase(); 
			conn = database.getConnection();			
			stmt=conn.createStatement();
			String sql ="select * from invoicedb.employee where EmpNo="+searchemp;
			System.out.println("employeeDetails --- sql--"+sql);
			System.out.println("employeeDetails --- Search employee by Number--"+searchemp);
			rs=stmt.executeQuery(sql);
			
			while (rs.next()) {     	
					employee = new Employee();
					employee.empNo = rs.getInt("EmpNo");
					employee.empFName = rs.getString("FirstName");
					employee.empLName = rs.getString("LastName");
					employee.empDOB = rs.getString("DOB");
					employee.empGender = rs.getString("Gender");
					employee.age = rs.getInt("Age");
					employee.perAddr = rs.getString("PermntAddress");
	    			employee.localAddr = rs.getString("LocalAddress");
	    			employee.fatherName = rs.getString("FatherName");
	    			employee.empDOJ = rs.getString("DOJ");
					employee.empDesignation = rs.getString("Designation");
					employee.basicSalary = rs.getInt("BasicSalary");
					employee.empHRA = rs.getInt("HRA");
					employee.convAllow = rs.getInt("CA");
					employee.medicalAllow = rs.getInt("MA");
					employee.specAllow = rs.getInt("SA");
					employee.phone = rs.getInt("Phone");
					employee.empDOR = rs.getString("DOR");
	    			employee.principleEmployer = rs.getString("PrincipleEmployer");
	    			employee.contractor = rs.getString("Contractor");
	    			employee.location = rs.getString("EmpLocation");

					System.out.println("-----------Searched Emploee Details----START------");
	    			System.out.println("EmpNo --- "+rs.getInt("EmpNo"));
	    			System.out.println("FirstName --- "+rs.getString("FirstName"));
	    			System.out.println("LastName --- "+rs.getString("LastName"));
	    			System.out.println("DOB --- "+rs.getString("DOB"));
	    			System.out.println("Gender --- "+rs.getString("Gender"));
	    			System.out.println("Age --- "+rs.getString("Age"));
	    			System.out.println("PermntAddress --- "+rs.getString("PermntAddress"));
	    			System.out.println("LocalAddress --- "+rs.getString("LocalAddress"));
	    			System.out.println("FatherName --- "+rs.getString("FatherName"));
	    			System.out.println("DOJ --- "+rs.getString("DOJ"));	    			
	    			System.out.println("Designation --- "+rs.getString("Designation"));
	    			System.out.println("BasicSalary --- "+rs.getInt("BasicSalary"));
	    			System.out.println("HRA --- "+rs.getInt("HRA"));
	    			System.out.println("CA --- "+rs.getInt("CA"));
	    			System.out.println("MA --- "+rs.getInt("MA"));
	    			System.out.println("SA --- "+rs.getInt("SA"));
	    			System.out.println("Phone --- "+rs.getInt("Phone"));
	    			System.out.println("DOR --- "+rs.getString("DOR"));
	    			System.out.println("PrincipleEmployer --- "+rs.getString("PrincipleEmployer"));
	    			System.out.println("Contractor --- "+rs.getString("Contractor"));
	    			System.out.println("EmpLocation --- "+rs.getString("EmpLocation"));

	    			System.out.println("-----------Searched Emploee Details-----END-----");
					employeeslist.add(employee);
	    		}	    		
	        rs.close();
	    }catch(SQLException se)
	    {
	        //se.getMessage(); 
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
		
		System.out.println("Inside EmployeeModel --- employeeDetails----END");
		System.out.println("==============================================");
		return employeeslist;
	}

}
