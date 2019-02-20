package com.cg.ems.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.cg.ems.dto.Employee;
import com.cg.ems.util.JPAUtil;

public class EmployeeDaoImpl implements EmployeeDao{
	EntityManager em=null;
	EntityTransaction entityTran=null;
	
	@Override
	public Employee addEmp(Employee emp) {
		em=JPAUtil.getEntiManager();
		entityTran=em.getTransaction();
		entityTran.begin();
		em.persist(emp);
		entityTran.commit();
		return emp;
	}

	@Override
	public ArrayList<Employee> fetchAllEmp() {
		String selAllQry="select emps from Employee emps";
		TypedQuery<Employee> tq=em.createQuery(selAllQry,Employee.class);
		ArrayList<Employee> empList=(ArrayList<Employee>)tq.getResultList();
		
		return empList;
	}

	@Override
	public Employee deleteEmp(int empId) {
		Employee e1=em.find(Employee.class, empId);
		entityTran.begin();
		e1.setEmpId(empId);
		em.remove(e1);
		entityTran.commit();
		return e1;
	}

	@Override
	public Employee getEmpByEid(int empId) {
		// TODO Auto-generated method stub
		Employee ee=em.find(Employee.class, empId);
		return ee;
	}

	@Override
	public Employee updateEmp(int empId, String newName, float newSal) {
		Employee ee=em.find(Employee.class, empId);
		ee.setEmpName(newName);
		ee.setEmpSal(newSal);
		entityTran.begin();
		em.merge(ee);
		entityTran.commit();
		
		return ee;
	}

}
