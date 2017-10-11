package com.cg.service;

import java.util.List;

import com.cg.bean.Employee;

public interface IEmpService {

	public boolean add(Employee emp);
	public List<Employee> getData();
}
