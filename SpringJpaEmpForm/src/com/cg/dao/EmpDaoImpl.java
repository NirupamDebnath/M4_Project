package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.bean.Employee;

@Repository
@Transactional
public class EmpDaoImpl implements IEmpDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public boolean add(Employee emp) {
		entityManager.persist(emp);
		return true;
	}

	@Override
	public List<Employee> getData() {
		TypedQuery<Employee> query = entityManager.createQuery("SELECT e FROM Employee e", Employee.class);
		return query.getResultList();
	}

}
