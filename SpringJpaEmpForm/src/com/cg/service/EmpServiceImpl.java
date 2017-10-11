package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Employee;
import com.cg.dao.IEmpDao;
@Service
public class EmpServiceImpl implements IEmpService {

	@Autowired
	IEmpDao ied;
	@Override
	public boolean add(Employee emp) {
		
		ied.add(emp);
		return false;
	}
	@Override
	public List<Employee> getData() {
		
		return ied.getData();
	}

}
