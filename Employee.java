package com.jspiders.const_injection;

public class Employee 
{
  private  int empId;
  private   String empName;
  private  long phNo;
  
  
  
  
  
public Employee(int empId, String empName, long phNo) 
{
	super();
	this.empId = empId;
	this.empName = empName;
	this.phNo = phNo;
}



public int getEmpId() 
{
	return empId;
}
public void setEmpId(int empId) 
{
	this.empId = empId;
}
public String getEmpName() 
{
	return empName;
}
public void setEmpName(String empName) 
{
	this.empName = empName;
}
public long getPhNo() 
{
	return phNo;
}
public void setPhNo(long phNo) 
{
	this.phNo = phNo;
}
@Override
public String toString() 
{
	return "Employee [empId=" + empId + ", empName=" + empName + ", phNo=" + phNo + "]";
}
   
  


  
}
