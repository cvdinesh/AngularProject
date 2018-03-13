package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import dao.DataBase;
import entity.Vendor;

@XmlRootElement(name="vendor")
public class VendorModel {

	
	public VendorModel() {
		super();		
	}	

	Connection conn = null;
	Statement stmt = null ;
	ResultSet rs = null;

	public List<Vendor> findVendorDetails()  throws Exception {
		
		Vendor vendor = null;
		List<Vendor> vendorlist = new ArrayList<Vendor>();
		System.out.println("==============================================");
		System.out.println("Inside VendorModel --- findVendorDetails----START");		
		try
	    {       
			DataBase database = new DataBase(); 
			conn = database.getConnection();			
			stmt=conn.createStatement();  
			//rs=stmt.executeQuery("select * from invoicedb.employee");
			//rs=stmt.executeQuery("select * from shrivdb.employee");
			//rs=stmt.executeQuery("select * from srivemployeesdb.employee"); // AWS DB - employee Table
			//rs=stmt.executeQuery("select * from invoicedb.vendor"); // Local DB 
			rs=stmt.executeQuery("select * from vendor"); // AWS DB - vendor Table
			
			while (rs.next()) 
			{     	
				 vendor = new Vendor();
				 vendor.slNo = rs.getInt("SLNo");
				 vendor.fName = rs.getString("FName");
				 vendor.lName = rs.getString("LName");
				 vendor.fatherName = rs.getString("FatherName");
				 vendor.empPFNum = rs.getString("PFNum");
				 vendor.empESINum = rs.getString("ESINum");
				 vendor.dayworked = rs.getInt("Daysworked");
				 vendor.basicwage = rs.getInt("Basicwage");
				 vendor.empDA = rs.getInt("EmpDA");
				 vendor.empHRA = rs.getInt("EmpHRA");
				 vendor.empOverTimeHrs = rs.getInt("EmpOverTimeHrs");
				 vendor.empOverTimeWages = rs.getInt("EmpOverTimeWages");
				 vendor.empGross = rs.getInt("Gross");
				 vendor.deductionOfEPF = rs.getInt("DeductionEPF");
				 vendor.deductionESIC = rs.getInt("DeductionESIC");
				 vendor.deductionPT = rs.getInt("DeductionPT");
				 vendor.deductionLWF = rs.getInt("DeductionLWF");
				 vendor.netAmount = rs.getInt("NetAmount");
				 vendor.vendorName = rs.getString("VendorName");
				vendor.vendorAddress = rs.getString("VendorAddress");
				vendor.emplrName = rs.getString("EmplrName");
				vendor.emplrAddress = rs.getString("EmplrAddress");
				vendor.month = rs.getString("Month");
				vendor.esicRegNo = rs.getString("EsicRegNo");
				vendor.epfRegNo = rs.getString("EpfRegNo");
				vendor.profTaxRegNo = rs.getString("ProfTaxRegNo");
				/*employee.empNo = rs.getInt("EmpNo");	    			
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
    			*/
				vendorlist.add(vendor);
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
		return vendorlist;
	}

}
