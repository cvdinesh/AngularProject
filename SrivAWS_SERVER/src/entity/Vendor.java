package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "vendor")
@XmlAccessorType(XmlAccessType.FIELD)
public class Vendor {
	
	public int slNo;
	public String fName;
	public String lName;
	public String fatherName;
	public String empPFNum;
	public String empESINum;
	public int dayworked;
	public int basicwage;
	public int empDA;
	public int empHRA;
	public int empOverTimeHrs;
	public int empOverTimeWages;
	public int empGross;
	public int deductionOfEPF;
	public int deductionESIC;
	public int deductionPT;
	public int deductionLWF;
	public int netAmount;
	public String vendorName;
	public String vendorAddress;
	public String emplrName;
	public String emplrAddress;
	public String month;
	public String esicRegNo;
	public String epfRegNo;
	public String profTaxRegNo;

	

	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	public int getDayworked() {
		return dayworked;
	}
	public void setDayworked(int dayworked) {
		this.dayworked = dayworked;
	}
	public int getBasicwage() {
		return basicwage;
	}
	public void setBasicwage(int basicwage) {
		this.basicwage = basicwage;
	}
	public int getEmpDA() {
		return empDA;
	}
	public void setEmpDA(int empDA) {
		this.empDA = empDA;
	}
	public int getEmpHRA() {
		return empHRA;
	}
	public void setEmpHRA(int empHRA) {
		this.empHRA = empHRA;
	}
	public int getEmpOverTimeHrs() {
		return empOverTimeHrs;
	}
	public void setEmpOverTimeHrs(int empOverTimeHrs) {
		this.empOverTimeHrs = empOverTimeHrs;
	}
	public int getEmpOverTimeWages() {
		return empOverTimeWages;
	}
	public void setEmpOverTimeWages(int empOverTimeWages) {
		this.empOverTimeWages = empOverTimeWages;
	}
	public int getEmpGross() {
		return empGross;
	}
	public void setEmpGross(int empGross) {
		this.empGross = empGross;
	}
	public int getDeductionOfEPF() {
		return deductionOfEPF;
	}
	public void setDeductionOfEPF(int deductionOfEPF) {
		this.deductionOfEPF = deductionOfEPF;
	}
	public int getDeductionESIC() {
		return deductionESIC;
	}
	public void setDeductionESIC(int deductionESIC) {
		this.deductionESIC = deductionESIC;
	}
	public int getDeductionPT() {
		return deductionPT;
	}
	public void setDeductionPT(int deductionPT) {
		this.deductionPT = deductionPT;
	}
	public int getDeductionLWF() {
		return deductionLWF;
	}
	public void setDeductionLWF(int deductionLWF) {
		this.deductionLWF = deductionLWF;
	}
	public int getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(int netAmount) {
		this.netAmount = netAmount;
	}	

	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	public String getEmplrName() {
		return emplrName;
	}
	public void setEmplrName(String emplrName) {
		this.emplrName = emplrName;
	}
	public String getEmplrAddress() {
		return emplrAddress;
	}
	public void setEmplrAddress(String emplrAddress) {
		this.emplrAddress = emplrAddress;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}	

	public int getSlNo() {
		return slNo;
	}
	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}
	public String getEmpPFNum() {
		return empPFNum;
	}
	public void setEmpPFNum(String empPFNum) {
		this.empPFNum = empPFNum;
	}
	public String getEmpESINum() {
		return empESINum;
	}
	public void setEmpESINum(String empESINum) {
		this.empESINum = empESINum;
	}
	public String getEsicRegNo() {
		return esicRegNo;
	}
	public void setEsicRegNo(String esicRegNo) {
		this.esicRegNo = esicRegNo;
	}
	public String getEpfRegNo() {
		return epfRegNo;
	}
	public void setEpfRegNo(String epfRegNo) {
		this.epfRegNo = epfRegNo;
	}
	public String getProfTaxRegNo() {
		return profTaxRegNo;
	}
	public void setProfTaxRegNo(String profTaxRegNo) {
		this.profTaxRegNo = profTaxRegNo;
	}

		
	public Vendor(int slNo, String fName, String lName, String fatherName, String empPFNum, String empESINum,
			int dayworked, int basicwage, int empDA, int empHRA, int empOverTimeHrs, int empOverTimeWages, int empGross,
			int deductionOfEPF, int deductionESIC, int deductionPT, int deductionLWF, int netAmount, String vendorName,
			String vendorAddress, String emplrName, String emplrAddress, String month, String esicRegNo,
			String epfRegNo, String profTaxRegNo) {
		super();
		this.slNo = slNo;
		this.fName = fName;
		this.lName = lName;
		this.fatherName = fatherName;
		this.empPFNum = empPFNum;
		this.empESINum = empESINum;
		this.dayworked = dayworked;
		this.basicwage = basicwage;
		this.empDA = empDA;
		this.empHRA = empHRA;
		this.empOverTimeHrs = empOverTimeHrs;
		this.empOverTimeWages = empOverTimeWages;
		this.empGross = empGross;
		this.deductionOfEPF = deductionOfEPF;
		this.deductionESIC = deductionESIC;
		this.deductionPT = deductionPT;
		this.deductionLWF = deductionLWF;
		this.netAmount = netAmount;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.emplrName = emplrName;
		this.emplrAddress = emplrAddress;
		this.month = month;
		this.esicRegNo = esicRegNo;
		this.epfRegNo = epfRegNo;
		this.profTaxRegNo = profTaxRegNo;
	}
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
		
}
