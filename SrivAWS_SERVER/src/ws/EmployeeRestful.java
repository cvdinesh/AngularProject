package ws;

import entity.Employee;
import model.EmployeeModel;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("employee")
public class EmployeeRestful {
	
	   @GET
	   @Produces(MediaType.APPLICATION_JSON)
	   @Path("/employeedetails")
	   public Response showEmployees() throws Exception 
	   {		
			EmployeeModel empModel = new EmployeeModel();
			System.out.println("Inside EmployeeRestful ---showEmployees---------");
			return Response
					.ok()
					.entity(new GenericEntity<List<Employee>>(empModel.findEmployeeDetails()){})
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", 
							"GET,POST,DELETE,PUT,OPTIONS,HEAD").build();				
	   }
	   
	  
	   
	   /*month,year has to be added fully*/
	   @POST	   
	   @Consumes({MediaType.APPLICATION_JSON})
	   @Produces(MediaType.APPLICATION_JSON)
	   @Path("/createemployee/{empNo}/{empFName}/{empLName}/{empDOB}/{empGender}/{age}/{perAddr}/{localAddr}/{fatherName}/{empDOJ}/{empDesignation}/{basicSalary}/{empHRA}/{convAllow}/{medicalAllow}/{specAllow}/{phone}/{empDOR}/{principleEmployer}/{contractor}/{location}/{month}/{year}")
	   public Response createEmployee(@PathParam("empNo") int empNO, @PathParam("empFName") String empFname, 
			   						  @PathParam("empLName") String empLname, @PathParam("empDOB") String empdob, 
			   						  @PathParam("empGender") String empGen, @PathParam("age") int age, @PathParam("perAddr") String perAddr,
			   						  @PathParam("localAddr") String localAddr, @PathParam("fatherName") String fatherName, @PathParam("empDOJ") String empdoj,
			   						  @PathParam("empDesignation") String empDesig, @PathParam("basicSalary") int basicSal, @PathParam("empHRA") int empHra,
	   								  @PathParam("convAllow") int convAll, @PathParam("medicalAllow") int medicalAll, @PathParam("specAllow") int specAll,
	   								  @PathParam("phone") int phone,@PathParam("empDOR") String empdor,@PathParam("principleEmployer") String prcplEmployer,
	   								  @PathParam("contractor") String contractor, @PathParam("location") String location,
	   								  @PathParam("month") String month, @PathParam("year") int Year)throws Exception, NullPointerException 
	   {		
		   System.out.println("Inside EmployeeRestful--createEmployee -- START");
		   EmployeeModel employeeModel = new EmployeeModel();
		   Employee employee = new Employee();
		   employee.setEmpNo(empNO);
		   employee.setEmpFName(empFname);
		   employee.setEmpLName(empLname);
		   employee.setEmpDOB(empdob);
		   employee.setEmpGender(empGen);
		   employee.setAge(age);
		   employee.setPerAddr(perAddr);
		   employee.setLocalAddr(localAddr);
		   employee.setFatherName(fatherName);
		   employee.setEmpDOJ(empdoj);
		   employee.setEmpDesignation(empDesig);
		   employee.setBasicSalary(basicSal);
		   employee.setEmpHRA(empHra);
		   employee.setConvAllow(convAll);
		   employee.setMedicalAllow(medicalAll);
		   employee.setSpecAllow(specAll);
		   employee.setPhone(phone);
		   employee.setEmpDOR(empdor);
		   employee.setPrincipleEmployer(prcplEmployer);
		   employee.setContractor(contractor);
		   employee.setLocation(location);
		   		      
		   System.out.println("+++++++++++++++++++++++createEmployee++++++ Details++++++ START+++++++++++++++");
		   System.out.println("empNo--"+employee.getEmpNo());
		   System.out.println("empFName--"+employee.getEmpFName());
		   System.out.println("empLName--"+employee.getEmpLName());
		   System.out.println("empDOB--"+employee.getEmpDOB());
		   System.out.println("empGender--"+employee.getEmpGender());
		   System.out.println("age--"+employee.getAge());
		   System.out.println("perAddr--"+employee.getPerAddr());
		   System.out.println("localAddr--"+employee.getLocalAddr());
		   System.out.println("fatherName--"+employee.getFatherName());
		   System.out.println("empDOJ--"+employee.getEmpDOJ());
		   System.out.println("empDesignation--"+employee.getEmpDesignation());
		   System.out.println("basicSalary--"+employee.getBasicSalary());
		   System.out.println("empHRA--"+employee.getEmpHRA());
		   System.out.println("convAllow--"+employee.getConvAllow());		   
		   System.out.println("medicalAllow--"+employee.getMedicalAllow());
		   System.out.println("specAllow--"+employee.getSpecAllow());
		   System.out.println("phone--"+employee.getPhone());
		   System.out.println("empdor--"+employee.getEmpDOR());
		   System.out.println("prcplEmployer--"+employee.getPrincipleEmployer());
		   System.out.println("contractor--"+employee.getContractor());
		   System.out.println("location--"+employee.getLocation());
		   System.out.println("+++++++++++++++++++++++createEmployee++++++ Details++++++ END+++++++++++++++++++");		   
		   System.out.println("Inside createEmployee -- END");
		   return Response
					.ok()
					.entity(new GenericEntity<Employee>(employeeModel.createEmployee(employee)){})
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", 
							"GET,POST,DELETE,PUT,OPTIONS,HEAD").build();				
	   }
	   
	   
	   @GET
	   @Produces(MediaType.APPLICATION_JSON)
	   @Path("/searchemployee/{empNo}")
	   public Response showEmployeeData(@PathParam("empNo") int empNo) throws Exception 
	   {		
			EmployeeModel employeeModel = new EmployeeModel();
			Employee employee = new Employee();
			employee.setEmpNo(empNo);
			System.out.println("Inside EmployeeRestful -showEmployeeData--");
			return Response
					.ok()
					.entity(new GenericEntity<List<Employee>>(employeeModel.employeeDetails(employee.getEmpNo())){})
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", 
							"GET,POST,DELETE,PUT,OPTIONS,HEAD").build();				
	   }
 
		
}
