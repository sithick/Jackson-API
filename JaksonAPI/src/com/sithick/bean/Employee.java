package com.sithick.bean;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
	"empId",
	"name",
	"address"
})
@XmlRootElement(name = "employee")
@XmlType(propOrder={"empId", "name", "address","salary"})
public class Employee {
	
	private String name;
	private int empId;
	//@JsonIgnores
	private double salary;
	private EmployeeAddress address;

	public Employee() {
		
	}
	
	public Employee(String name, int empId, double salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public EmployeeAddress getAddress() {
		return address;
	}

	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return String.format("Employee [name=%s, empId=%s, salary=%s, address=%s]", name, empId, salary, address);
	}

}
