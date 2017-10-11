package com.cg.dao;

import java.util.List;

import com.cg.bean.Employee;

public interface IEmpDao {

	
	public boolean add(Employee emp);
	public List<Employee> getData();
}
