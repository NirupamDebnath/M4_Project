package com.cg.bean;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

@Entity(name="emp_data")
//@NamedQuery(name="retrieve",query="SELECT emp FROM Employee emp")
public class Employee  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	@NotBlank(message="Cannot be Blank")
	private String empName;
	@NotBlank(message="Cannot be Blank")
	private String city;
	@NotBlank(message="Cannot be Blank")
	private String branch;
	@Pattern(regexp = "^[0-9]+$", message = "Phone Number should contain only 10 digits")
	private String mobile;
	@NotBlank(message="Cannot be Blank")
	private String dept;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empId, String empName, String city, String branch, String mobile, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.branch = branch;
		this.mobile = mobile;
		this.dept = dept;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
