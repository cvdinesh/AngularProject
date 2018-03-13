package entity;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
	
	public int empNo;	
	public String empFName;
	public String empLName;
	public String empDOB;
	public String empGender;
	public int age;
	public String perAddr;
	public String localAddr;
	public String fatherName;
	public String empDOJ;
	public String empDesignation;
	public int basicSalary;
	public int empHRA;
	public int convAllow;	
	public int medicalAllow;
	public int specAllow;
	public int phone;
	public String empDOR;
	public String principleEmployer;
	public String contractor;
	public String location;
	public String month;	
	public int year;
	public int day1hrs;
	public int day2hrs;
	public int day3hrs;
	public int day4hrs;
	public int day5hrs;
	public int day6hrs;
	public int day7hrs;
	public int day8hrs;
	public int day9hrs;
	public int day10hrs;
	public int day11hrs;
	public int day12hrs;
	public int day13hrs;
	public int day14hrs;
	public int day15hrs;
	public int day16hrs;
	public int day17hrs;
	public int day18hrs;
	public int day19hrs;
	public int day20hrs;
	public int day21hrs;
	public int day22hrs;
	public int day23hrs;
	public int day24hrs;
	public int day25hrs;
	public int day26hrs;
	public int day27hrs;
	public int day28hrs;
	public int day29hrs;
	public int day30hrs;
	public int day31hrs;
	public int workdays;
	public String empRemarks;
	public String emplrRemarks;
	//Newly Added - form 26
	public int monthlyRated;
	public int basicWages;
	public int otherAllowance;
	public int dailyWages;
	public int grossWages;
	public int empPF;
	public int totalDeductions;
	public int NetWages;	
	public int otherDeductions;
	// newly added form Q
	public int casualLeaves;
	public int sickLeaves;
	public int holidaywithWages;
	public int maternityleaves;
	public int LeaveCreditedCLs;	
	public int LeaveCreditedSLs;
	public int LeaveCreditedHWWs;
	public int LeaveAvailedCLs;
	public int LeaveAvailedSLs;
	public int LeaveAvailedHWWs;
	public int LeaveBalanceCLs;	
	public int LeaveBalanceSLs;
	public int LeaveBalanceHWWs;
	public int TotalOverTimeHours;
	public int TotalHoursPerMonth;
	
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}	
	
	public String getEmpFName() {
		return empFName;
	}
	
	public void setEmpFName(String empFName) {
		this.empFName = empFName;
	}
	
	public String getEmpLName() {
		return empLName;
	}
	
	public void setEmpLName(String empLName) {
		this.empLName = empLName;
	}
	
	public String getEmpDOB() {
		return empDOB;
	}
	
	public void setEmpDOB(String empDOB) {
		this.empDOB = empDOB;
	}
	
	public String getEmpGender() {
		return empGender;
	}
	
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	
	public String getEmpDesignation() {
		return empDesignation;
	}
	
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	
	public int getBasicSalary() {
		return basicSalary;
	}
	
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public int getEmpHRA() {
		return empHRA;
	}
	
	public void setEmpHRA(int empHRA) {
		this.empHRA = empHRA;
	}
	
	public int getConvAllow() {
		return convAllow;
	}

	public void setConvAllow(int convAllow) {
		this.convAllow = convAllow;
	}

	public int getMedicalAllow() {
		return medicalAllow;
	}

	public void setMedicalAllow(int medicalAllow) {
		this.medicalAllow = medicalAllow;
	}

	public int getSpecAllow() {
		return specAllow;
	}

	public void setSpecAllow(int specAllow) {
		this.specAllow = specAllow;
	}	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPerAddr() {
		return perAddr;
	}

	public void setPerAddr(String perAddr) {
		this.perAddr = perAddr;
	}

	public String getLocalAddr() {
		return localAddr;
	}

	public void setLocalAddr(String localAddr) {
		this.localAddr = localAddr;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getEmpDOJ() {
		return empDOJ;
	}

	public void setEmpDOJ(String empDOJ) {
		this.empDOJ = empDOJ;
	}	
	
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmpDOR() {
		return empDOR;
	}

	public void setEmpDOR(String empDOR) {
		this.empDOR = empDOR;
	}

	public String getPrincipleEmployer() {
		return principleEmployer;
	}

	public void setPrincipleEmployer(String principleEmployer) {
		this.principleEmployer = principleEmployer;
	}

	public String getContractor() {
		return contractor;
	}

	public void setContractor(String contractor) {
		this.contractor = contractor;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public int getDay1hrs() {
		return day1hrs;
	}

	public void setDay1hrs(int day1hrs) {
		this.day1hrs = day1hrs;
	}

	public int getDay2hrs() {
		return day2hrs;
	}

	public void setDay2hrs(int day2hrs) {
		this.day2hrs = day2hrs;
	}

	public int getDay3hrs() {
		return day3hrs;
	}

	public void setDay3hrs(int day3hrs) {
		this.day3hrs = day3hrs;
	}

	public int getDay4hrs() {
		return day4hrs;
	}

	public void setDay4hrs(int day4hrs) {
		this.day4hrs = day4hrs;
	}

	public int getDay5hrs() {
		return day5hrs;
	}

	public void setDay5hrs(int day5hrs) {
		this.day5hrs = day5hrs;
	}

	public int getDay6hrs() {
		return day6hrs;
	}

	public void setDay6hrs(int day6hrs) {
		this.day6hrs = day6hrs;
	}

	public int getDay7hrs() {
		return day7hrs;
	}

	public void setDay7hrs(int day7hrs) {
		this.day7hrs = day7hrs;
	}

	public int getDay8hrs() {
		return day8hrs;
	}

	public void setDay8hrs(int day8hrs) {
		this.day8hrs = day8hrs;
	}

	public int getDay9hrs() {
		return day9hrs;
	}

	public void setDay9hrs(int day9hrs) {
		this.day9hrs = day9hrs;
	}

	public int getDay10hrs() {
		return day10hrs;
	}

	public void setDay10hrs(int day10hrs) {
		this.day10hrs = day10hrs;
	}

	public int getDay11hrs() {
		return day11hrs;
	}

	public void setDay11hrs(int day11hrs) {
		this.day11hrs = day11hrs;
	}

	public int getDay12hrs() {
		return day12hrs;
	}

	public void setDay12hrs(int day12hrs) {
		this.day12hrs = day12hrs;
	}

	public int getDay13hrs() {
		return day13hrs;
	}

	public void setDay13hrs(int day13hrs) {
		this.day13hrs = day13hrs;
	}

	public int getDay14hrs() {
		return day14hrs;
	}

	public void setDay14hrs(int day14hrs) {
		this.day14hrs = day14hrs;
	}

	public int getDay15hrs() {
		return day15hrs;
	}

	public void setDay15hrs(int day15hrs) {
		this.day15hrs = day15hrs;
	}

	public int getDay16hrs() {
		return day16hrs;
	}

	public void setDay16hrs(int day16hrs) {
		this.day16hrs = day16hrs;
	}

	public int getDay17hrs() {
		return day17hrs;
	}

	public void setDay17hrs(int day17hrs) {
		this.day17hrs = day17hrs;
	}

	public int getDay18hrs() {
		return day18hrs;
	}

	public void setDay18hrs(int day18hrs) {
		this.day18hrs = day18hrs;
	}

	public int getDay19hrs() {
		return day19hrs;
	}

	public void setDay19hrs(int day19hrs) {
		this.day19hrs = day19hrs;
	}

	public int getDay20hrs() {
		return day20hrs;
	}

	public void setDay20hrs(int day20hrs) {
		this.day20hrs = day20hrs;
	}

	public int getDay21hrs() {
		return day21hrs;
	}

	public void setDay21hrs(int day21hrs) {
		this.day21hrs = day21hrs;
	}

	public int getDay22hrs() {
		return day22hrs;
	}

	public void setDay22hrs(int day22hrs) {
		this.day22hrs = day22hrs;
	}

	public int getDay23hrs() {
		return day23hrs;
	}

	public void setDay23hrs(int day23hrs) {
		this.day23hrs = day23hrs;
	}

	public int getDay24hrs() {
		return day24hrs;
	}

	public void setDay24hrs(int day24hrs) {
		this.day24hrs = day24hrs;
	}

	public int getDay25hrs() {
		return day25hrs;
	}

	public void setDay25hrs(int day25hrs) {
		this.day25hrs = day25hrs;
	}

	public int getDay26hrs() {
		return day26hrs;
	}

	public void setDay26hrs(int day26hrs) {
		this.day26hrs = day26hrs;
	}

	public int getDay27hrs() {
		return day27hrs;
	}

	public void setDay27hrs(int day27hrs) {
		this.day27hrs = day27hrs;
	}

	public int getDay28hrs() {
		return day28hrs;
	}

	public void setDay28hrs(int day28hrs) {
		this.day28hrs = day28hrs;
	}

	public int getDay29hrs() {
		return day29hrs;
	}

	public void setDay29hrs(int day29hrs) {
		this.day29hrs = day29hrs;
	}

	public int getDay30hrs() {
		return day30hrs;
	}

	public void setDay30hrs(int day30hrs) {
		this.day30hrs = day30hrs;
	}

	public int getDay31hrs() {
		return day31hrs;
	}

	public void setDay31hrs(int day31hrs) {
		this.day31hrs = day31hrs;
	}
	
	public int getWorkdays() {
		return workdays;
	}

	public void setWorkdays(int workdays) {
		this.workdays = workdays;
	}

	public String getEmpRemarks() {
		return empRemarks;
	}

	public void setEmpRemarks(String empRemarks) {
		this.empRemarks = empRemarks;
	}

	public String getEmplrRemarks() {
		return emplrRemarks;
	}

	public void setEmplrRemarks(String emplrRemarks) {
		this.emplrRemarks = emplrRemarks;
	}

	public int getMonthlyRated() {
		return monthlyRated;
	}

	public void setMonthlyRated(int monthlyRated) {
		this.monthlyRated = monthlyRated;
	}

	public int getBasicWages() {
		return basicWages;
	}

	public void setBasicWages(int basicWages) {
		this.basicWages = basicWages;
	}

	public int getOtherAllowance() {
		return otherAllowance;
	}

	public void setOtherAllowance(int otherAllowance) {
		this.otherAllowance = otherAllowance;
	}

	public int getGrossWages() {
		return grossWages;
	}

	public void setGrossWages(int grossWages) {
		this.grossWages = grossWages;
	}

	public int getEmpPF() {
		return empPF;
	}

	public void setEmpPF(int empPF) {
		this.empPF = empPF;
	}

	public int getTotalDeductions() {
		return totalDeductions;
	}

	public void setTotalDeductions(int totalDeductions) {
		this.totalDeductions = totalDeductions;
	}

	public int getNetWages() {
		return NetWages;
	}

	public void setNetWages(int netWages) {
		NetWages = netWages;
	}

	public int getCasualLeaves() {
		return casualLeaves;
	}

	public void setCasualLeaves(int casualLeaves) {
		this.casualLeaves = casualLeaves;
	}

	public int getSickLeaves() {
		return sickLeaves;
	}

	public void setSickLeaves(int sickLeaves) {
		this.sickLeaves = sickLeaves;
	}

	public int getHolidaywithWages() {
		return holidaywithWages;
	}

	public void setHolidaywithWages(int holidaywithWages) {
		this.holidaywithWages = holidaywithWages;
	}

	public int getMaternityleaves() {
		return maternityleaves;
	}

	public void setMaternityleaves(int maternityleaves) {
		this.maternityleaves = maternityleaves;
	}	
	
	public int getDailyWages() {
		return dailyWages;
	}

	public void setDailyWages(int dailyWages) {
		this.dailyWages = dailyWages;
	}

	public int getOtherDeductions() {
		return otherDeductions;
	}

	public void setOtherDeductions(int otherDeductions) {
		this.otherDeductions = otherDeductions;
	}

	public int getLeaveCreditedCLs() {
		return LeaveCreditedCLs;
	}

	public void setLeaveCreditedCLs(int leaveCreditedCLs) {
		LeaveCreditedCLs = leaveCreditedCLs;
	}

	public int getLeaveCreditedSLs() {
		return LeaveCreditedSLs;
	}

	public void setLeaveCreditedSLs(int leaveCreditedSLs) {
		LeaveCreditedSLs = leaveCreditedSLs;
	}

	public int getLeaveCreditedHWWs() {
		return LeaveCreditedHWWs;
	}

	public void setLeaveCreditedHWWs(int leaveCreditedHWWs) {
		LeaveCreditedHWWs = leaveCreditedHWWs;
	}

	public int getLeaveAvailedCLs() {
		return LeaveAvailedCLs;
	}

	public void setLeaveAvailedCLs(int leaveAvailedCLs) {
		LeaveAvailedCLs = leaveAvailedCLs;
	}

	public int getLeaveAvailedSLs() {
		return LeaveAvailedSLs;
	}

	public void setLeaveAvailedSLs(int leaveAvailedSLs) {
		LeaveAvailedSLs = leaveAvailedSLs;
	}

	public int getLeaveAvailedHWWs() {
		return LeaveAvailedHWWs;
	}

	public void setLeaveAvailedHWWs(int leaveAvailedHWWs) {
		LeaveAvailedHWWs = leaveAvailedHWWs;
	}

	public int getLeaveBalanceCLs() {
		return LeaveBalanceCLs;
	}

	public void setLeaveBalanceCLs(int leaveBalanceCLs) {
		LeaveBalanceCLs = leaveBalanceCLs;
	}

	public int getLeaveBalanceSLs() {
		return LeaveBalanceSLs;
	}

	public void setLeaveBalanceSLs(int leaveBalanceSLs) {
		LeaveBalanceSLs = leaveBalanceSLs;
	}

	public int getLeaveBalanceHWWs() {
		return LeaveBalanceHWWs;
	}

	public void setLeaveBalanceHWWs(int leaveBalanceHWWs) {
		LeaveBalanceHWWs = leaveBalanceHWWs;
	}

	public int getTotalOverTimeHours() {
		return TotalOverTimeHours;
	}

	public void setTotalOverTimeHours(int totalOverTimeHours) {
		TotalOverTimeHours = totalOverTimeHours;
	}

	public int getTotalHoursPerMonth() {
		return TotalHoursPerMonth;
	}

	public void setTotalHoursPerMonth(int totalHoursPerMonth) {
		TotalHoursPerMonth = totalHoursPerMonth;
	}


	public Employee(int empNo, String empFName, String empLName, String empDOB, String empGender, int age,
			String perAddr, String localAddr, String fatherName, String empDOJ, String empDesignation, int basicSalary,
			int empHRA, int convAllow, int medicalAllow, int specAllow, int phone, String empDOR,
			String principleEmployer, String contractor, String location, String month, int year, int day1hrs,
			int day2hrs, int day3hrs, int day4hrs, int day5hrs, int day6hrs, int day7hrs, int day8hrs, int day9hrs,
			int day10hrs, int day11hrs, int day12hrs, int day13hrs, int day14hrs, int day15hrs, int day16hrs,
			int day17hrs, int day18hrs, int day19hrs, int day20hrs, int day21hrs, int day22hrs, int day23hrs,
			int day24hrs, int day25hrs, int day26hrs, int day27hrs, int day28hrs, int day29hrs, int day30hrs,
			int day31hrs, int workdays, String empRemarks, String emplrRemarks, int monthlyRated, int basicWages,
			int otherAllowance, int dailyWages, int grossWages, int empPF, int totalDeductions, int netWages,
			int otherDeductions, int casualLeaves, int sickLeaves, int holidaywithWages, int maternityleaves,
			int leaveCreditedCLs, int leaveCreditedSLs, int leaveCreditedHWWs, int leaveAvailedCLs, int leaveAvailedSLs,
			int leaveAvailedHWWs, int leaveBalanceCLs, int leaveBalanceSLs, int leaveBalanceHWWs,
			int totalOverTimeHours, int totalHoursPerMonth) {
		super();
		this.empNo = empNo;
		this.empFName = empFName;
		this.empLName = empLName;
		this.empDOB = empDOB;
		this.empGender = empGender;
		this.age = age;
		this.perAddr = perAddr;
		this.localAddr = localAddr;
		this.fatherName = fatherName;
		this.empDOJ = empDOJ;
		this.empDesignation = empDesignation;
		this.basicSalary = basicSalary;
		this.empHRA = empHRA;
		this.convAllow = convAllow;
		this.medicalAllow = medicalAllow;
		this.specAllow = specAllow;
		this.phone = phone;
		this.empDOR = empDOR;
		this.principleEmployer = principleEmployer;
		this.contractor = contractor;
		this.location = location;
		this.month = month;
		this.year = year;
		this.day1hrs = day1hrs;
		this.day2hrs = day2hrs;
		this.day3hrs = day3hrs;
		this.day4hrs = day4hrs;
		this.day5hrs = day5hrs;
		this.day6hrs = day6hrs;
		this.day7hrs = day7hrs;
		this.day8hrs = day8hrs;
		this.day9hrs = day9hrs;
		this.day10hrs = day10hrs;
		this.day11hrs = day11hrs;
		this.day12hrs = day12hrs;
		this.day13hrs = day13hrs;
		this.day14hrs = day14hrs;
		this.day15hrs = day15hrs;
		this.day16hrs = day16hrs;
		this.day17hrs = day17hrs;
		this.day18hrs = day18hrs;
		this.day19hrs = day19hrs;
		this.day20hrs = day20hrs;
		this.day21hrs = day21hrs;
		this.day22hrs = day22hrs;
		this.day23hrs = day23hrs;
		this.day24hrs = day24hrs;
		this.day25hrs = day25hrs;
		this.day26hrs = day26hrs;
		this.day27hrs = day27hrs;
		this.day28hrs = day28hrs;
		this.day29hrs = day29hrs;
		this.day30hrs = day30hrs;
		this.day31hrs = day31hrs;
		this.workdays = workdays;
		this.empRemarks = empRemarks;
		this.emplrRemarks = emplrRemarks;
		this.monthlyRated = monthlyRated;
		this.basicWages = basicWages;
		this.otherAllowance = otherAllowance;
		this.dailyWages = dailyWages;
		this.grossWages = grossWages;
		this.empPF = empPF;
		this.totalDeductions = totalDeductions;
		this.NetWages = netWages;
		this.otherDeductions = otherDeductions;
		this.casualLeaves = casualLeaves;
		this.sickLeaves = sickLeaves;
		this.holidaywithWages = holidaywithWages;
		this.maternityleaves = maternityleaves;
		this.LeaveCreditedCLs = leaveCreditedCLs;
		this.LeaveCreditedSLs = leaveCreditedSLs;
		this.LeaveCreditedHWWs = leaveCreditedHWWs;
		this.LeaveAvailedCLs = leaveAvailedCLs;
		this.LeaveAvailedSLs = leaveAvailedSLs;
		this.LeaveAvailedHWWs = leaveAvailedHWWs;
		this.LeaveBalanceCLs = leaveBalanceCLs;
		this.LeaveBalanceSLs = leaveBalanceSLs;
		this.LeaveBalanceHWWs = leaveBalanceHWWs;
		this.TotalOverTimeHours = totalOverTimeHours;
		this.TotalHoursPerMonth = totalHoursPerMonth;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
